package net.derzockerhddb.tutorialmod.item;

import net.derzockerhddb.tutorialmod.TutorialMod;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(TutorialMod.MOD_ID);

public static final DeferredItem<Item> DNA = ITEMS.register("dna",
        () -> new Item(new Item.Properties()));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);

    }
}
