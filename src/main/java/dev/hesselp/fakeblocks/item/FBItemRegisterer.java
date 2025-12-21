package dev.hesselp.fakeblocks.item;

import dev.hesselp.fakeblocks.FakeBlocks;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;


public class FBItemRegisterer {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(FakeBlocks.MODID);

    public static final DeferredItem<Item> NO_COLLISION_DUST = ITEMS.registerSimpleItem(
            "no_collision_dust",
            new Item.Properties() // The properties to use.
    );
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
