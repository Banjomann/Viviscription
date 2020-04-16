package com.banjomann.viviscription.common.items;

import com.banjomann.viviscription.Viviscription;

import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;

public class VItemBase extends Item {
	public VItemBase(String name) { this(name, new Item.Properties().group(Viviscription.TAB)); }
	public VItemBase(String name, Properties properties) {
		super(properties);
		setRegistryName(name);
	}
	
	public void register(RegistryEvent.Register<Item> event) {
		event.getRegistry().register(this);
	}
}
