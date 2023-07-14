package com.virgil.virgilclothes.items;

import com.google.common.collect.LinkedHashMultimap;
import com.google.common.collect.Multimap;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.virgil.virgilclothes.client.render.model.HaoriModel;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.ItemRenderer;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.attributes.Attribute;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import top.theillusivec4.curios.api.CuriosApi;
import top.theillusivec4.curios.api.SlotContext;
import top.theillusivec4.curios.api.type.capability.ICurio;
import top.theillusivec4.curios.api.type.capability.ICurioItem;

import javax.annotation.Nonnull;
import java.util.UUID;


public class Haori extends Item implements ICurioItem {

    ResourceLocation HAORI_TEXTURE;
    private Object model;

    public Multimap<Attribute, AttributeModifier> getAttributeModifiers(SlotContext slotContext, UUID uuid) {
        Multimap<Attribute, AttributeModifier> misc = LinkedHashMultimap.create();
        CuriosApi.getCuriosHelper().addSlotModifier(misc, "misc", uuid, 1.0, AttributeModifier.Operation.ADDITION);
        return misc;
    }

    public Haori(ResourceLocation RL) {
        super(new Properties().group(ModItemGroup.CLOTHES_GROUP).maxStackSize(1));
        HAORI_TEXTURE = RL;
    }

    @Override
    public void onEquip(SlotContext slotContext, ItemStack prevStack, ItemStack stack) {
        ICurioItem.super.onEquip(slotContext, prevStack, stack);
    }



    @Override
    public void render(String identifier, int index, MatrixStack matrixStack,
                       IRenderTypeBuffer renderTypeBuffer, int light, LivingEntity livingEntity,
                       float limbSwing, float limbSwingAmount, float partialTicks,
                       float ageInTicks, float netHeadYaw, float headPitch, ItemStack stack) {

        if (!(this.model instanceof HaoriModel)) {
            this.model = new HaoriModel();
        }
        HaoriModel Haori = (HaoriModel) this.model;
        Haori.setLivingAnimations(livingEntity, limbSwing, limbSwingAmount, partialTicks);
        Haori.setRotationAngles(livingEntity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw,
                headPitch);
        ICurio.RenderHelper.followBodyRotations(livingEntity, Haori);
        IVertexBuilder vertexBuilder = ItemRenderer
                .getBuffer(renderTypeBuffer, Haori.getRenderType(HAORI_TEXTURE), false,
                        stack.hasEffect());
        Haori
                .render(matrixStack, vertexBuilder, light, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F,
                        1.0F);
    }
    @Override
    public boolean hasEffect(@Nonnull ItemStack stack) {
        return false;
    }
}

