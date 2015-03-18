package com.poroshadows.swordartonlineswords.init;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;
import com.poroshadows.swordartonlineswords.swords.*;

public class ModSwords {

    public static ToolMaterial ToolMaterialElucidator;
    public static ToolMaterial ToolMaterialDarkRepulser;
    public static ToolMaterial ToolMaterialLambentLight;
    public static ToolMaterial ToolMaterialAnnealBlade;
    public static Item Elucidator;
    public static Item DarkRepulser;
    public static Item LambentLight;
    public static Item AnnealBlade;

    public static void init() {
        toolMaterial();
        defineSwords();
        registerSwords();
    }
    private static void defineSwords() {
        Elucidator = new Elucidator();
        DarkRepulser = new DarkRepulser();
        LambentLight = new LambentLight();
        AnnealBlade = new AnnealBlade();
    }
    private static void registerSwords() {
        GameRegistry.registerItem(Elucidator, "Elucidator");
        GameRegistry.registerItem(DarkRepulser, "DarkRepulser");
        GameRegistry.registerItem(LambentLight, "LambentLight");
        GameRegistry.registerItem(AnnealBlade, "AnnealBlade");
    }
    private static void toolMaterial() {
        ToolMaterialElucidator = EnumHelper.addToolMaterial("ToolMaterialElucidator", 0, 1350, 8.0F, 7.0F, 10);
        ToolMaterialDarkRepulser = EnumHelper.addToolMaterial("ToolMaterialDarkRepulser", 0, 1200, 7.0F, 5.0F, 10);
        ToolMaterialLambentLight = EnumHelper.addToolMaterial("ToolMaterialLambentLight", 0, 1400, 8.0F, 7.0F, 10);
        ToolMaterialAnnealBlade = EnumHelper.addToolMaterial("ToolMaterialAnnealBlade", 0, 800, 5.0F, 4.0F, 10);
    }
}