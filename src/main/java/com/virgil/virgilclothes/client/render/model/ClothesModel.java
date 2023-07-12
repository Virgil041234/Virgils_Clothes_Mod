package com.virgil.virgilclothes.client.render.model;
// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import javax.annotation.Nonnull;

import com.virgil.virgilclothes.VirgilClothes;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.LivingEntity;

public class ClothesModel extends BipedModel<LivingEntity> {

	public ClothesModel() {
		super(1.0F);
		this.textureWidth = 64;
		this.textureHeight = 64;
		this.bipedHead = new ModelRenderer(this, 0, 0);
		this.bipedHead.setRotationPoint(0.0F, 24.0F, 0.0F);
		this.bipedHead.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F);
		this.bipedHead.setTextureOffset(32, 0);
		this.bipedHead.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.5F);

		this.bipedBody = new ModelRenderer(this, 16, 16);
		this.bipedBody.setRotationPoint(0F, 25F, 0F);
		this.bipedBody.addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.0F);
		this.bipedBody.setTextureOffset(16, 32);
		this.bipedBody.addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.25F);

		this.bipedRightArm = new ModelRenderer(this, 40, 16);
		this.bipedRightArm.setRotationPoint(0F, 25F, 0F);
		this.bipedRightArm.addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F,0.0F);
		this.bipedRightArm.setTextureOffset(40,32);
		this.bipedRightArm.addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F,0.25F);

		this.bipedLeftArm = new ModelRenderer(this, 32, 48);
		this.bipedLeftArm.setRotationPoint(0F, 25F, 0F);
		this.bipedLeftArm.addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F,0.0F);
		this.bipedLeftArm.setTextureOffset(48,48);
		this.bipedLeftArm.addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F,0.25F);

		this.bipedRightLeg = new ModelRenderer(this, 0, 16);
		this.bipedRightLeg.setRotationPoint(0F, 25F, 0F);
		this.bipedRightLeg.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F,0.0F);
		this.bipedRightLeg.setTextureOffset(0,32);
		this.bipedRightLeg.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F,0.25F);

		this.bipedLeftLeg = new ModelRenderer(this, 16, 48);
		this.bipedLeftLeg.setRotationPoint(0F, 25F, 0F);
		this.bipedLeftLeg.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F,0.0F);
		this.bipedLeftLeg.setTextureOffset(0,48);
		this.bipedLeftLeg.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F,0.25F);

	}

	@Override
	public void render(@Nonnull MatrixStack matrixStack, @Nonnull IVertexBuilder vertexBuilder,
					   int light, int overlay, float red, float green, float blue, float alpha) {
		this.bipedHead.render(matrixStack, vertexBuilder, light, overlay);
		this.bipedBody.render(matrixStack, vertexBuilder, light, overlay);
		this.bipedRightArm.render(matrixStack, vertexBuilder, light, overlay);
		this.bipedLeftArm.render(matrixStack, vertexBuilder, light, overlay);
		this.bipedRightLeg.render(matrixStack, vertexBuilder, light, overlay);
		this.bipedLeftLeg.render(matrixStack, vertexBuilder, light, overlay);
	}
}