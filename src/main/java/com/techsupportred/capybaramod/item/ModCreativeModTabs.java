package com.techsupportred.capybaramod.item;

import com.techsupportred.capybaramod.CapybaraMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CapybaraMod.MODID);

    public static final RegistryObject<CreativeModeTab> CAPYBARA_TAB = CREATIVE_MODE_TABS.register("tutorial_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.CAPYBARA_SPAWN_EGG.get()))
                    .title(Component.translatable("creativetab.capybara_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.CAPYBARA_SPAWN_EGG.get());
                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}