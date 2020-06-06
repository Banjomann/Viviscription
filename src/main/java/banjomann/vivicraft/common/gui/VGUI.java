package banjomann.vivicraft.common.gui;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.util.text.ITextComponent;

public abstract class VGUI extends Screen {
	protected VGUI() { super(null); }
	
	protected VGUI(ITextComponent titleIn) { super(titleIn); }
	
	public abstract void renderMain();
}