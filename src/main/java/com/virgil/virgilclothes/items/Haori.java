package com.virgil.virgilclothes.items;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.virgil.virgilclothes.VirgilClothes;
import com.virgil.virgilclothes.client.render.model.HaoriModel;
import com.virgil.virgilclothes.compatibility.CurioItemCapability;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.ItemRenderer;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.entity.LivingEntity;
import net.minecraft.inventory.container.Slot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.capabilities.ICapabilityProvider;
import net.minecraftforge.fml.InterModComms;
import top.theillusivec4.curios.api.SlotContext;
import top.theillusivec4.curios.api.SlotTypeMessage;
import top.theillusivec4.curios.api.type.capability.ICurio;
import top.theillusivec4.curios.api.type.capability.ICurioItem;

import javax.annotation.Nonnull;


public class Haori extends Item implements ICurioItem {

    ResourceLocation HAORI_TEXTURE;

    public Haori(ResourceLocation RL) {
        super(new Properties().group(ModItemGroup.CLOTHES_GROUP).maxStackSize(1));
        HAORI_TEXTURE = RL;
    }

    @Override
    public void onEquip(SlotContext slotContext, ItemStack prevStack, ItemStack stack) {
        VirgilClothes.LOGGER.info("TEST");
        ICurioItem.super.onEquip(slotContext, prevStack, stack);
    }

    @Override
    public void onUnequip(SlotContext slotContext, ItemStack prevStack, ItemStack stack) {
        VirgilClothes.miscSize = VirgilClothes.miscSize - 1;
        int size = VirgilClothes.miscSize;
        InterModComms.sendTo("curios", SlotTypeMessage.MODIFY_TYPE,
                () -> new SlotTypeMessage.Builder("misc").size(size));
        VirgilClothes.LOGGER.info("Size = " + size);
    }

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

                    if (!(this.model instanceof HaoriModel)) {
                        this.model = new HaoriModel();
                    }
                    HaoriModel Haori = (HaoriModel) this.model;
                    Haori.setLivingAnimations(livingEntity, limbSwing, limbSwingAmount, partialTicks);
                    Haori.setRotationAngles(livingEntity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw,
                            headPitch);
                    RenderHelper.followBodyRotations(livingEntity, Haori);
                    IVertexBuilder vertexBuilder = ItemRenderer
                            .getBuffer(renderTypeBuffer, Haori.getRenderType(HAORI_TEXTURE), false,
                                    stack.hasEffect());
                    Haori
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

