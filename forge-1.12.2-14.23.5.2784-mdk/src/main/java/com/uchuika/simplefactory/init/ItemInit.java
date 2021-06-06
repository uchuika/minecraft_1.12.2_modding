package com.uchuika.simplefactory.init;

import java.util.ArrayList;
import java.util.List;

import com.uchuika.simplefactory.objects.items.ItemBase;

import net.minecraft.item.Item;

public class ItemInit {

	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//アイテムの登録
	public static final Item COPPER_INGOT = new ItemBase("copper_ingot");
}
