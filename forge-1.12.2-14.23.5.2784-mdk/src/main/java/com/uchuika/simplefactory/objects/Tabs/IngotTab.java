package com.uchuika.simplefactory.objects.Tabs;

import com.uchuika.simplefactory.init.ItemInit;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

// クリエイティブタブの情報
public class IngotTab extends CreativeTabs{

	public IngotTab(int index, String label) {
		super(index, label);

	}

	@Override
	public ItemStack getTabIconItem() {
		
		return new ItemStack(ItemInit.COPPER_INGOT);
	}

	
	
}
