package com.techsupportred.capybaramod.entity;

import com.techsupportred.capybaramod.CapybaraMod;
import com.techsupportred.capybaramod.entity.custom.CapybaraEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, CapybaraMod.MODID);

    public static final RegistryObject<EntityType<CapybaraEntity>> CAPYBARA =
            ENTITY_TYPES.register("capybara",
                    () -> EntityType.Builder.of(CapybaraEntity::new, MobCategory.CREATURE)
                            .sized(1.0f, 1.0f)
                            .build(new ResourceLocation(CapybaraMod.MODID, "capybara").toString()));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
