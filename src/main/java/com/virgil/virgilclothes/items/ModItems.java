package com.virgil.virgilclothes.items;

import com.virgil.virgilclothes.VirgilClothes;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, VirgilClothes.MOD_ID);

    public static final RegistryObject<Item> BLACK_BELT_FLAT = ITEMS.register("black_belt_flat",
            () -> new Clothes(new ResourceLocation(VirgilClothes.MOD_ID,"textures/entity/black/belt/flat.png")));
    public static final RegistryObject<Item> BLACK_BELT_LEFT = ITEMS.register("black_belt_left",
            () -> new Clothes(new ResourceLocation(VirgilClothes.MOD_ID,"textures/entity/black/belt/left.png")));
    public static final RegistryObject<Item> BLACK_BELT_LEFT2 = ITEMS.register("black_belt_left2",
            () -> new Clothes(new ResourceLocation(VirgilClothes.MOD_ID,"textures/entity/black/belt/left2.png")));
    public static final RegistryObject<Item> BLACK_BELT_RIGHT = ITEMS.register("black_belt_right",
            () -> new Clothes(new ResourceLocation(VirgilClothes.MOD_ID,"textures/entity/black/belt/right.png")));
    public static final RegistryObject<Item> BLACK_BELT_RIGHT2 = ITEMS.register("black_belt_right2",
            () -> new Clothes(new ResourceLocation(VirgilClothes.MOD_ID,"textures/entity/black/belt/right2.png")));
    public static final RegistryObject<Item> BLACK_BELT_SASH1 = ITEMS.register("black_belt_sash1",
            () -> new Clothes(new ResourceLocation(VirgilClothes.MOD_ID,"textures/entity/black/belt/sash1.png")));
    public static final RegistryObject<Item> BLACK_BELT_SASH2 = ITEMS.register("black_belt_sash2",
            () -> new Clothes(new ResourceLocation(VirgilClothes.MOD_ID,"textures/entity/black/belt/sash2.png")));
    public static final RegistryObject<Item> BLACK_CENTER_EXT = ITEMS.register("black_center_ext",
            () -> new Clothes(new ResourceLocation(VirgilClothes.MOD_ID,"textures/entity/black/ext/centerext.png")));
    public static final RegistryObject<Item> BLACK_CENTER_EXT2 = ITEMS.register("black_center_ext2",
            () -> new Clothes(new ResourceLocation(VirgilClothes.MOD_ID,"textures/entity/black/ext/centerext2.png")));
    public static final RegistryObject<Item> BLACK_LEFT_EXT = ITEMS.register("black_left_ext",
            () -> new Clothes(new ResourceLocation(VirgilClothes.MOD_ID,"textures/entity/black/ext/leftext.png")));
    public static final RegistryObject<Item> BLACK_LEFT_EXT2 = ITEMS.register("black_left_ext2",
            () -> new Clothes(new ResourceLocation(VirgilClothes.MOD_ID,"textures/entity/black/ext/leftext2.png")));
    public static final RegistryObject<Item> BLACK_RIGHT_EXT = ITEMS.register("black_right_ext",
            () -> new Clothes(new ResourceLocation(VirgilClothes.MOD_ID,"textures/entity/black/ext/rightext.png")));
    public static final RegistryObject<Item> BLACK_RIGHT_EXT2 = ITEMS.register("black_right_ext2",
            () -> new Clothes(new ResourceLocation(VirgilClothes.MOD_ID,"textures/entity/black/ext/rightext2.png")));
    public static final RegistryObject<Item> BLACK_GLOVE = ITEMS.register("black_glove",
            () -> new Clothes(new ResourceLocation(VirgilClothes.MOD_ID,"textures/entity/black/glove/glove.png")));
    public static final RegistryObject<Item> BLACK_GLOVE2 = ITEMS.register("black_glove2",
            () -> new Clothes(new ResourceLocation(VirgilClothes.MOD_ID,"textures/entity/black/glove/glovefingerless.png")));
    public static final RegistryObject<Item> BLACK_WRAP = ITEMS.register("black_wrap",
            () -> new Clothes(new ResourceLocation(VirgilClothes.MOD_ID,"textures/entity/black/glove/wrap.png")));
    public static final RegistryObject<Item> BLACK_WRAP2 = ITEMS.register("black_wrap2",
            () -> new Clothes(new ResourceLocation(VirgilClothes.MOD_ID,"textures/entity/black/glove/wrapfingerless.png")));
    public static final RegistryObject<Item> BLACK_SHIRT_CENTER = ITEMS.register("black_shirt_center",
            () -> new Clothes(new ResourceLocation(VirgilClothes.MOD_ID,"textures/entity/black/shirt/center.png")));
    public static final RegistryObject<Item> BLACK_SHIRT_CUT = ITEMS.register("black_shirt_cut",
            () -> new Clothes(new ResourceLocation(VirgilClothes.MOD_ID,"textures/entity/black/shirt/cut.png")));
    public static final RegistryObject<Item> BLACK_SHIRT_LEFT = ITEMS.register("black_shirt_left",
            () -> new Clothes(new ResourceLocation(VirgilClothes.MOD_ID,"textures/entity/black/shirt/left.png")));
    public static final RegistryObject<Item> BLACK_SHIRT_RIGHT = ITEMS.register("black_shirt_right",
            () -> new Clothes(new ResourceLocation(VirgilClothes.MOD_ID,"textures/entity/black/shirt/right.png")));
    public static final RegistryObject<Item> BLACK_TRIM_CENTER = ITEMS.register("black_trim_center",
            () -> new Clothes(new ResourceLocation(VirgilClothes.MOD_ID,"textures/entity/black/trim/center.png")));
    public static final RegistryObject<Item> BLACK_TRIM_CENTER2 = ITEMS.register("black_trim_center2",
            () -> new Clothes(new ResourceLocation(VirgilClothes.MOD_ID,"textures/entity/black/trim/center2.png")));
    public static final RegistryObject<Item> BLACK_TRIM_LEFT = ITEMS.register("black_trim_left",
            () -> new Clothes(new ResourceLocation(VirgilClothes.MOD_ID,"textures/entity/black/trim/left.png")));
    public static final RegistryObject<Item> BLACK_TRIM_LEFT2 = ITEMS.register("black_trim_left2",
            () -> new Clothes(new ResourceLocation(VirgilClothes.MOD_ID,"textures/entity/black/trim/left2.png")));
    public static final RegistryObject<Item> BLACK_TRIM_RIGHT = ITEMS.register("black_trim_right",
            () -> new Clothes(new ResourceLocation(VirgilClothes.MOD_ID,"textures/entity/black/trim/right.png")));
    public static final RegistryObject<Item> BLACK_TRIM_RIGHT2 = ITEMS.register("black_trim_right2",
            () -> new Clothes(new ResourceLocation(VirgilClothes.MOD_ID,"textures/entity/black/trim/right2.png")));
    public static final RegistryObject<Item> BLACK_ARM = ITEMS.register("black_arm",
            () -> new Clothes(new ResourceLocation(VirgilClothes.MOD_ID,"textures/entity/black/arm.png")));
    public static final RegistryObject<Item> BLACK_BANDANA = ITEMS.register("black_bandana",
            () -> new Clothes(new ResourceLocation(VirgilClothes.MOD_ID,"textures/entity/black/bandana.png")));
    public static final RegistryObject<Item> BLACK_BANDANA2 = ITEMS.register("black_bandana2",
            () -> new Clothes(new ResourceLocation(VirgilClothes.MOD_ID,"textures/entity/black/bandana2.png")));
    public static final RegistryObject<Item> BLACK_BANDANA3 = ITEMS.register("black_bandana3",
            () -> new Clothes(new ResourceLocation(VirgilClothes.MOD_ID,"textures/entity/black/bandana3.png")));
    public static final RegistryObject<Item> BLACK_BOOTS = ITEMS.register("black_boots",
            () -> new Clothes(new ResourceLocation(VirgilClothes.MOD_ID,"textures/entity/black/boots.png")));
    public static final RegistryObject<Item> BLACK_BRACELET = ITEMS.register("black_bracelet",
            () -> new Clothes(new ResourceLocation(VirgilClothes.MOD_ID,"textures/entity/black/bracelet.png")));
    public static final RegistryObject<Item> BLACK_HAORI = ITEMS.register("black_haori",
            () -> new Clothes(new ResourceLocation(VirgilClothes.MOD_ID,"textures/entity/black/haori.png")));
    public static final RegistryObject<Item> BLACK_HAORIHALF = ITEMS.register("black_haorihalf",
            () -> new Clothes(new ResourceLocation(VirgilClothes.MOD_ID,"textures/entity/black/haorihalf.png")));
    public static final RegistryObject<Item> BLACK_HAORITRIM = ITEMS.register("black_haoritrim",
            () -> new Clothes(new ResourceLocation(VirgilClothes.MOD_ID,"textures/entity/black/haoritrim.png")));
    public static final RegistryObject<Item> BLACK_MASK = ITEMS.register("black_mask",
            () -> new Clothes(new ResourceLocation(VirgilClothes.MOD_ID,"textures/entity/black/mask.png")));
    public static final RegistryObject<Item> BLACK_PANTS = ITEMS.register("black_pants",
            () -> new Clothes(new ResourceLocation(VirgilClothes.MOD_ID,"textures/entity/black/pants.png")));
    public static final RegistryObject<Item> BLACK_SASHEXT = ITEMS.register("black_sashext",
            () -> new Clothes(new ResourceLocation(VirgilClothes.MOD_ID,"textures/entity/black/sashext.png")));
    public static final RegistryObject<Item> BLACK_SASHLEFT = ITEMS.register("black_sashleft",
            () -> new Clothes(new ResourceLocation(VirgilClothes.MOD_ID,"textures/entity/black/sashleft.png")));
    public static final RegistryObject<Item> BLACK_SASHRIGHT = ITEMS.register("black_sashright",
            () -> new Clothes(new ResourceLocation(VirgilClothes.MOD_ID,"textures/entity/black/sashright.png")));
    public static final RegistryObject<Item> BLACK_SHOES = ITEMS.register("black_shoes",
            () -> new Clothes(new ResourceLocation(VirgilClothes.MOD_ID,"textures/entity/black/shoes.png")));
    public static final RegistryObject<Item> BLACK_SHOES2 = ITEMS.register("black_shoes2",
            () -> new Clothes(new ResourceLocation(VirgilClothes.MOD_ID,"textures/entity/black/shoes2.png")));
    public static final RegistryObject<Item> BLACK_SHOULDER = ITEMS.register("black_shoulder",
            () -> new Clothes(new ResourceLocation(VirgilClothes.MOD_ID,"textures/entity/black/shoulder.png")));
    public static final RegistryObject<Item> BLACK_SOCK = ITEMS.register("black_sock",
            () -> new Clothes(new ResourceLocation(VirgilClothes.MOD_ID,"textures/entity/black/sock.png")));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
