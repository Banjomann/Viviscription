package com.banjomann.viviscription.common.blocks;

import com.banjomann.viviscription.Viviscription;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(modid = Viviscription.MOD_ID, bus = Bus.MOD)
@ObjectHolder(Viviscription.MOD_ID)
public class VBlocks {
	public static final Block vivid_ore = null;
	
	@SubscribeEvent
	public static void registerBlock(final RegistryEvent.Register<Block> event) {
		new VBlockBase("vivid_ore", Block.Properties.create(Material.ROCK)
													.hardnessAndResistance(3.0f, 3.0f)
													.sound(SoundType.STONE)).register(event);
	}
	
	@SubscribeEvent
	public static void registerBlockItems(final RegistryEvent.Register<Item> event) {
		registerBlockItem(event, vivid_ore);
	}
	
	private static void registerBlockItem(RegistryEvent.Register<Item> event, Block block) {
		event.getRegistry().register(new BlockItem(block, new Item.Properties().group(Viviscription.TAB).maxStackSize(64)).setRegistryName(block.getRegistryName()));
	}
}
