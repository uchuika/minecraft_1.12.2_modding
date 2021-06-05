package uchuika.mod.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.item.Item;
import uchuika.mod.objects.items.ItemBase;

public class ItemInit {
	
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//多分アイテムを追加するところ
	public static final Item COPPER_INGOT = new ItemBase("copper_ingot");
	
}
