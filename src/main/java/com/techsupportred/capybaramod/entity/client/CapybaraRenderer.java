package com.techsupportred.capybaramod.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.techsupportred.capybaramod.CapybaraMod;
import com.techsupportred.capybaramod.entity.custom.CapybaraEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class CapybaraRenderer extends GeoEntityRenderer<CapybaraEntity> {
    public CapybaraRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new CapybaraModel());
    }

    @Override
    public ResourceLocation getTextureLocation(CapybaraEntity animatable) {
        return new ResourceLocation(CapybaraMod.MODID, "textures/entity/capybara_texture.png");
    }

    @Override
    public void render(CapybaraEntity entity, float entityYaw, float partialTick, PoseStack poseStack,
                       MultiBufferSource bufferSource, int packedLight) {
        if(entity.isBaby()) {
            poseStack.scale(0.4f, 0.4f, 0.4f);
        }

        super.render(entity, entityYaw, partialTick, poseStack, bufferSource, packedLight);
    }
}