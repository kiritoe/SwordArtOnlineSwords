package com.poroshadows.swordartonlineswords.utilities;

import com.poroshadows.swordartonlineswords.SwordArtOnlineSwords;
import net.minecraft.item.ItemSword;

public class SwordBase extends ItemSword {
    public SwordBase(String unLocalizedName, ToolMaterial material) {
        super(material);
        setUnlocalizedName(unLocalizedName);
        setCreativeTab(SwordArtOnlineSwords.SAOSwordsTab);
    }
}
