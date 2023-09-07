package com.techsupportred.capybaramod.event;

import com.techsupportred.capybaramod.CapybaraMod;
import com.techsupportred.capybaramod.entity.ModEntities;
import com.techsupportred.capybaramod.entity.custom.CapybaraEntity;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = CapybaraMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEvents {
    @SubscribeEvent
    public static void entityAttributeEvent(EntityAttributeCreationEvent event) {
        event.put(ModEntities.CAPYBARA.get(), CapybaraEntity.setAttributes());
    }
}