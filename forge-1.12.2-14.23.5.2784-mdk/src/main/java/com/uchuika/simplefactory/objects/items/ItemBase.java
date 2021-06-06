package com.uchuika.simplefactory.objects.items;

import com.uchuika.simplefactory.Main;
import com.uchuika.simplefactory.init.ItemInit;
import com.uchuika.simplefactory.util.IHasModel;

import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel{

	public ItemBase(String name) {

		//アイテムの各情報
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.INGOT);
	
		
		ItemInit.ITEMS.add(this);
	}

	@Override
	public void registerModels() {

		Main.proxy.registerItemRenderer(this, 0, "inventory");
		
	}

}
