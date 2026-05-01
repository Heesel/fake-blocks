package dev.hesselp.fakeblocks.event;

import dev.hesselp.fakeblocks.FakeBlocks;
import dev.hesselp.fakeblocks.block.FBBlockRegisterer;
import dev.hesselp.fakeblocks.block.FakeBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.player.PlayerInteractEvent;
import net.neoforged.neoforge.event.level.BlockEvent;

@EventBusSubscriber(modid = FakeBlocks.MODID) // Defaults to FORGE bus and both Sides
public class FBEventHandler {

    @SubscribeEvent
    public static void onRightClick(PlayerInteractEvent.RightClickBlock event) {
        if (event.getItemStack().is(Items.CACTUS)) {
            assert event.getFace() != null;
            BlockPos targetPos = event.getPos().relative(event.getFace());

            if (isNextToFakeBlock(event.getLevel(), targetPos)) {
                event.setCanceled(true);
            }
        }
    }

    @SubscribeEvent
    public static void onCactusPlace(BlockEvent.EntityPlaceEvent event) {
        if (event.getPlacedBlock().is(Blocks.CACTUS)) {
            if (isNextToFakeBlock(event.getLevel(), event.getPos())) {
                event.setCanceled(true);
            }
        }
    }

    private static boolean isNextToFakeBlock(LevelAccessor level, BlockPos pos) {
        for (Direction direction : Direction.Plane.HORIZONTAL) {
            if (level.getBlockState(pos.relative(direction)).getBlock() instanceof FakeBlock) {
                return true;
            }
        }
        return false;
    }

    @SubscribeEvent
    public static void onFakeTNTIgnite(PlayerInteractEvent.RightClickBlock event) {
        Level level = event.getLevel();
        BlockPos pos = event.getPos();
        BlockState state = level.getBlockState(pos);
        ItemStack stack = event.getItemStack();

        if (state.getBlock() instanceof FakeBlock) {
            var tntEntry = FBBlockRegisterer.FAKE_BLOCKS.get("fake_tnt");

            if (tntEntry != null && state.is(tntEntry.getLeft().get())) {
                if (stack.is(Items.FLINT_AND_STEEL) || stack.is(Items.FIRE_CHARGE)) {

                    level.playSound(event.getEntity(), pos, SoundEvents.TNT_PRIMED, SoundSource.BLOCKS, 1.0F, 1.0F);
                    level.removeBlock(pos, false);

                    if (!level.isClientSide) {
                        net.minecraft.world.entity.item.PrimedTnt primedtnt = new net.minecraft.world.entity.item.PrimedTnt(
                                level, (double)pos.getX() + 0.5D, (double)pos.getY(), (double)pos.getZ() + 0.5D, event.getEntity()
                        );

                        primedtnt.addTag("is_fake_tnt");
                        level.addFreshEntity(primedtnt);
                    }

                    if (!event.getEntity().isCreative()) {
                        if (stack.is(Items.FLINT_AND_STEEL)) {
                            stack.hurtAndBreak(1, event.getEntity(), EquipmentSlot.MAINHAND);
                        } else {
                            stack.shrink(1);
                        }
                    }

                    event.setCanceled(true);
                    event.getEntity().swing(event.getHand());
                }
            }
        }
    }

    @SubscribeEvent
    public static void onExplosion(net.neoforged.neoforge.event.level.ExplosionEvent.Start event) {
        if (event.getExplosion().getDirectSourceEntity() instanceof net.minecraft.world.entity.item.PrimedTnt tnt) {
            if (tnt.getTags().contains("is_fake_tnt")) {
                event.setCanceled(true);
            }
        }
    }

    @SubscribeEvent
    public static void onExplosionDetonate(net.neoforged.neoforge.event.level.ExplosionEvent.Detonate event) {
        if (event.getExplosion().getDirectSourceEntity() instanceof net.minecraft.world.entity.item.PrimedTnt tnt) {
            if (tnt.getTags().contains("is_fake_tnt")) {
                event.getAffectedBlocks().clear();
                event.getAffectedEntities().clear();
            }
        }
    }


}