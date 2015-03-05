package com.poroshadows.swordartonlineswords.init;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class SAOSwordsTab extends CreativeTabs {
    public SAOSwordsTab(int index,String label) {
        super(label);
    }

    @Override
    public Item getTabIconItem() {
        return ModSwords.Elucidator;
    }
}
