package net.khweled.TestMod.item;

import net.khweled.TestMod.TestMod;
import net.khweled.TestMod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;


public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TestMod.MOD_ID);


    public static final RegistryObject<CreativeModeTab> MOD_TAB = CREATIVE_MODE_TABS.register("mod_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.BRONZE_INGOT.get()))
                    .title(Component.translatable("creativetab.mod_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.BRONZE_INGOT.get());

                        pOutput.accept(ModBlocks.BRONZE_BLOCK.get());

                        pOutput.accept(ModItems.BRONZE_HELMET.get());
                        pOutput.accept(ModItems.BRONZE_CHESTPLATE.get());
                        pOutput.accept(ModItems.BRONZE_LEGGINGS.get());
                        pOutput.accept(ModItems.BRONZE_BOOTS.get());
                    })
                    .build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
