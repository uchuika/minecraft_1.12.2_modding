package com.uchuika.simplefactory.objects.items;

import com.uchuika.simplefactory.Main;
import com.uchuika.simplefactory.init.ItemInit;
import com.uchuika.simplefactory.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel{

	public ItemBase(String name) {
		
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MATERIALS);
	
		
		ItemInit.ITEMS.add(this);
	}

	@Override
	public void registerModels() {

		Main.proxy.registerItemRenderer(this, 0, "inventory");
		
	}

}
