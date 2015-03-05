package com.poroshadows.swordartonlineswords.utilities;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

public class TextureHelper {

    public static void inventoryItemTexture(Item item, String string) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.mod_ID + ":" + string, "inventory"));
    }
    public static void inventoryItemTexture(Item item, int ID, String string) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, ID, new ModelResourceLocation(Reference.mod_ID + ":" + string, "inventory"));
    }



}
