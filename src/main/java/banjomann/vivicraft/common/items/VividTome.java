package banjomann.vivicraft.common.items;

import banjomann.vivicraft.Vivicraft;
import banjomann.vivicraft.common.gui.VividTomeGUI;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;

public class VividTome extends VItemBase {
	private VividTomeGUI _GUI;
	
	public VividTome() {
		super("vivid_tome", new Item.Properties()
									.group(Vivicraft.TAB)
									.maxStackSize(1));
		_GUI = new VividTomeGUI();
	}
	
	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
		_GUI.renderMain();
		
		return super.onItemRightClick(worldIn, playerIn, handIn);
	}
}