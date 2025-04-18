package dev.hesselp.fakeblocks.item;

import dev.hesselp.fakeblocks.FakeBlocks;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;


public class FBItemRegisterer {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(FakeBlocks.MODID);

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
