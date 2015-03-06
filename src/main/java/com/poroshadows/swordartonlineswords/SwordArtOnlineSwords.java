package com.poroshadows.swordartonlineswords;

import com.poroshadows.swordartonlineswords.init.ModSwords;
import com.poroshadows.swordartonlineswords.init.SAOSwordsTab;
import com.poroshadows.swordartonlineswords.init.TextureManager;
import com.poroshadows.swordartonlineswords.utilities.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.mod_ID, name = Reference.mod_Name, version = Reference.mod_Version, canBeDeactivated = Reference.canBDeactiveded)
public class SwordArtOnlineSwords {

    public static CreativeTabs SAOSwordsTab = new SAOSwordsTab(CreativeTabs.getNextID(), Reference.mod_ID + "Tab");

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        ModSwords.init();
    }
    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        TextureManager.textures();
    }
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }
}