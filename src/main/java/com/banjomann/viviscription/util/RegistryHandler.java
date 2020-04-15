package com.banjomann.viviscription.util;

import com.banjomann.viviscription.Viviscription;
import com.banjomann.viviscription.items.ItemBase;

import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {
	public static final DeferredRegister<Item> ITEMS = new DeferredRegister<Item>(ForgeRegistries.ITEMS, Viviscription.MOD_ID);
	
	public static void init() {
		ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
	}
	
	//Items
	public static final RegistryObject<Item> VIVID_TOME = ITEMS.register("vivid_tome", ItemBase::new);
	public static final RegistryObject<Item> VIVID_DUST = ITEMS.register("vivid_dust", ItemBase::new);
}
