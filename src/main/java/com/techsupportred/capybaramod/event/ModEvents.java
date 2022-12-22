package com.techsupportred.capybaramod.event;

import com.techsupportred.capybaramod.entity.ModEntityTypes;
import com.techsupportred.capybaramod.entity.custom.CapybaraEntity;
import com.techsupportred.capybaramod.capybaramod;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

public class ModEvents {
    @Mod.EventBusSubscriber(modid = capybaramod.MOD_ID)
    public static class ForgeEvents {

    @Mod.EventBusSubscriber(modid = capybaramod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ModEventBusEvents {
        @SubscribeEvent
        public static void entityAttributeEvent(EntityAttributeCreationEvent event) {
            event.put(ModEntityTypes.CAPYBARA.get(), CapybaraEntity.setAttributes());
        }
    }
}}
