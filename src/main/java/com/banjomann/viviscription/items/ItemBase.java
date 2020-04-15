package com.banjomann.viviscription.items;

import com.banjomann.viviscription.Viviscription;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class ItemBase extends Item {

	public ItemBase() {
		super(new Item.Properties().group(Viviscription.TAB));
	}
	
}
