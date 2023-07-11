package com.virgil.virgilclothes.client.render.model;
// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import javax.annotation.Nonnull;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.LivingEntity;

public class ClothesModel extends BipedModel<LivingEntity> {

	public ClothesModel() {
		super(1.0F);
		this.textureWidth = 64;
		this.textureHeight = 64;
		this.bipedHead = new ModelRenderer(this, 0, 0);
		this.bipedHead.setRotationPoint(-5.0F, 2.0F, 0.0F);
		this.bipedHead.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0F);
		this.bipedHead = new ModelRenderer(this, 32, 0);
		this.bipedHead.setRotationPoint(-5.0F, 2.0F, 0.0F);
		this.bipedHead.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.5F);
	}

	@Override
	public void render(@Nonnull MatrixStack matrixStack, @Nonnull IVertexBuilder vertexBuilder,
					   int light, int overlay, float red, float green, float blue, float alpha) {
		this.bipedHead.render(matrixStack, vertexBuilder, light, overlay);
	}
}