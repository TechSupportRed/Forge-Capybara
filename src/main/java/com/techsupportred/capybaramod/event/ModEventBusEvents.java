package com.techsupportred.capybaramod.event;

import com.techsupportred.capybaramod.capybaramod;
import com.techsupportred.capybaramod.entity.ModEntityTypes;
import com.techsupportred.capybaramod.entity.custom.CapybaraEntity;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import javax.annotation.Nonnull;

@Mod.EventBusSubscriber(modid = capybaramod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {

    @SubscribeEvent
    public static void entityAttributeEvent(EntityAttributeCreationEvent event) {
        event.put(ModEntityTypes.CAPYBARA.get(), CapybaraEntity.setAttributes());
    }
}