package com.techsupportred.capybaramod.entity.client;

import com.techsupportred.capybaramod.capybaramod;
import com.techsupportred.capybaramod.entity.custom.CapybaraEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class CapybaraModel extends AnimatedGeoModel<CapybaraEntity> {
    @Override
    public ResourceLocation getModelResource(CapybaraEntity object) {
        return new ResourceLocation(capybaramod.MOD_ID, "geo/capybara.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(CapybaraEntity object) {
        return new ResourceLocation(capybaramod.MOD_ID, "textures/entity/capybara/capybara.png");
    }

    @Override
    public ResourceLocation getAnimationResource(CapybaraEntity animatable) {
        return new ResourceLocation(capybaramod.MOD_ID, "animations/capybara.animation.json");
    }
}
