package banjomann.vivicraft.common.items;

import banjomann.vivicraft.Vivicraft;
import net.minecraft.item.Item;

public class VividTome extends VItemBase {
	public VividTome() {
		super("vivid_tome", new Item.Properties()
									.group(Vivicraft.TAB)
									.maxStackSize(1));
	}
}
