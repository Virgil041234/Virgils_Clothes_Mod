package com.virgil.virgilclothes.items;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.virgil.virgilclothes.VirgilClothes;
import com.virgil.virgilclothes.client.render.model.ClothesModel;
import com.virgil.virgilclothes.compatibility.CurioItemCapability;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.ItemRenderer;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.entity.model.PlayerModel;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.capabilities.ICapabilityProvider;
import top.theillusivec4.curios.api.SlotContext;
import top.theillusivec4.curios.api.type.capability.ICurio;
import top.theillusivec4.curios.api.type.capability.ICurioItem;

import javax.annotation.Nonnull;
import javax.management.Attribute;
import java.util.UUID;


public class Clothes extends Item {


ResourceLocation RL = new ResourceLocation(VirgilClothes.MOD_ID, "textures/entity/default.png");

    public Clothes(ResourceLocation RL) {
        super(new Item.Properties().group(ModItemGroup.CLOTHES_GROUP).maxStackSize(1));
        this.RL = RL;
    }

    private final ResourceLocation CLOTHES_TEXTURE = RL;

        @Override
        public ICapabilityProvider initCapabilities(ItemStack stack, CompoundNBT unused) {
            return CurioItemCapability.createProvider(new ICurio() {
                private Object model;

                @Override
                public boolean canRender(String identifier, int index, LivingEntity livingEntity) {
                    return true;
                }

                @Override
                public void render(String identifier, int index, MatrixStack matrixStack,
                                   IRenderTypeBuffer renderTypeBuffer, int light, LivingEntity livingEntity,
                                   float limbSwing, float limbSwingAmount, float partialTicks,
                                   float ageInTicks, float netHeadYaw, float headPitch) {


                    if (!(this.model instanceof ClothesModel)) {
                        this.model = new ClothesModel();
                    }
                    ClothesModel clothes = (ClothesModel) this.model;
                    clothes.setLivingAnimations(livingEntity, limbSwing, limbSwingAmount, partialTicks);
                    clothes.setRotationAngles(livingEntity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw,
                            headPitch);
                    ICurio.RenderHelper.followBodyRotations(livingEntity, clothes);
                    IVertexBuilder vertexBuilder = ItemRenderer
                            .getBuffer(renderTypeBuffer, clothes.getRenderType(CLOTHES_TEXTURE), false,
                                    stack.hasEffect());
                    clothes
                            .render(matrixStack, vertexBuilder, light, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F,
                                    1.0F);
                }
            });
        }
    @Override
    public boolean hasEffect(@Nonnull ItemStack stack) {
        return false;
    }
}

