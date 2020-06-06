package banjomann.vivicraft.common.items;

import banjomann.vivicraft.Vivicraft;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;

public class VItemBase extends Item {
	public VItemBase(String name) { this(name, new Item.Properties().group(Vivicraft.TAB)); }
	public VItemBase(String name, Properties properties) {
		super(properties);
		setRegistryName(name);
	}
	
	public void register(RegistryEvent.Register<Item> event) {
		event.getRegistry().register(this);
	}
}
