package banjomann.vivicraft.common.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.event.RegistryEvent;

public class VBlockBase extends Block {	
	public VBlockBase(String name) { this(name, Block.Properties.create(Material.MISCELLANEOUS)
																.hardnessAndResistance(0.8f)
																.sound(SoundType.CLOTH)); }
	public VBlockBase(String name, Block.Properties properties) {
		super(properties);
		setRegistryName(name);
	}
	
	public void register(RegistryEvent.Register<Block> event) {
		event.getRegistry().register(this);
	} 
}
