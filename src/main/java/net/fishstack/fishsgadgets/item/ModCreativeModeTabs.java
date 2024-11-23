package net.fishstack.fishsgadgets.item;

import net.fishstack.fishsgadgets.FishsGadgetsMod;
import net.fishstack.fishsgadgets.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, FishsGadgetsMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> FISHSGADGETSTAB = CREATIVE_MODE_TABS.register("fishsgadgetstab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.WAND.get()))
                    .title(Component.translatable("creativetab.fishsgadgetstab"))
                    .displayItems((displayParameters, output) -> {
                        output.accept(ModItems.WAND.get());
                        output.accept(ModItems.FISH_INGOT.get());
                        output.accept(ModItems.FISH_PICKAXE.get());
                        output.accept(ModBlocks.TUNGSTEEN_CUBE.get());

                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
