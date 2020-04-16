package com.banjomann.vivicraft.common.items;

import com.banjomann.vivicraft.Vivicraft;

import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(modid = Vivicraft.MOD_ID, bus = Bus.MOD)
@ObjectHolder(Vivicraft.MOD_ID)
public class VItems {
	
	public static final Item vivid_tome = null;
	public static final Item vivid_dust = null;
	
	@SubscribeEvent
	public static void registerItems(final RegistryEvent.Register<Item> event) {
		new VividTome().register(event);
		new VItemBase("vivid_dust").register(event);
	}
}
