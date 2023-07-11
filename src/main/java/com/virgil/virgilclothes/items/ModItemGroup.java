package com.virgil.virgilclothes.items;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModItemGroup {

    public static final ItemGroup CLOTHES_GROUP = new ItemGroup("virgilClothesTab") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModItems.TEST.get());
        }
    };

}
