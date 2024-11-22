package net.fishstack.fishsgadgets.item;

import net.fishstack.fishsgadgets.FishsGadgetsMod;
import net.fishstack.fishsgadgets.item.custom.WandItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, FishsGadgetsMod.MOD_ID);

    public static final RegistryObject<Item> WAND = ITEMS.register("wand",
            () -> new WandItem(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> FISH_INGOT = ITEMS.register("fish_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FISH_PICKAXE = ITEMS.register("fish_pickaxe",
            () -> new Item(new Item.Properties().stacksTo(1)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
