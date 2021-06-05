package uchuika.mod.objects.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import uchuika.mod.Main;
import uchuika.mod.init.ItemInit;
import uchuika.mod.util.IHasModel;

public class ItemBase extends Item implements IHasModel{

	//多分アイテム登録関数
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
