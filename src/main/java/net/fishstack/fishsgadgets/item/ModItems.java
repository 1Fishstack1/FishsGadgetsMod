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
            () -> new Item(new Item.Properties().food(ModFoodProperties.FISH_INGOT)));
    public static final RegistryObject<Item> FISH_PICKAXE = ITEMS.register("fish_pickaxe",
            () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> BANANENE = ITEMS.register("bananene",
            () -> new Item(new Item.Properties().food(ModFoodProperties.BANANENE)));

    public static final RegistryObject<Item> RAW_SHRIMP = ITEMS.register("raw_shrimp",
            () -> new Item(new Item.Properties().food(ModFoodProperties.RAW_SHRIMP)));
    public static final RegistryObject<Item> COOKED_SHRIMP = ITEMS.register("cooked_shrimp",
            () -> new Item(new Item.Properties().food(ModFoodProperties.COOKED_SHRIMP)));
    public static final RegistryObject<Item> SHRIMP_SUSHI = ITEMS.register("shrimp_sushi",
            () -> new Item(new Item.Properties().food(ModFoodProperties.SHRIMP_SUSHI)));
    public static final RegistryObject<Item> SHRIMP_SOUP = ITEMS.register("shrimp_soup",
            () -> new Item(new Item.Properties().food(ModFoodProperties.SHRIMP_SOUP)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
