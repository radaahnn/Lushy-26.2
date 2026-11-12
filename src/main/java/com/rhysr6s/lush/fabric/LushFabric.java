package com.rhysr6s.lush.fabric;

import com.rhysr6s.lush.Lush;
import com.rhysr6s.lush.biome.LushBiomeModifications;
import com.rhysr6s.lush.worldgen.feature.MushroomScatterFeature;
import com.rhysr6s.lush.worldgen.feature.RockFeature;
import com.rhysr6s.lush.worldgen.feature.VegetationFeature;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;

public final class LushFabric implements ModInitializer {
	@Override
	public void onInitialize() {
		Lush.init(FabricLoader.getInstance().getConfigDir());
		Registry.register(BuiltInRegistries.FEATURE, Lush.id("lush_vegetation"), new VegetationFeature());
		Registry.register(BuiltInRegistries.FEATURE, Lush.id("rock"), new RockFeature());
		Registry.register(BuiltInRegistries.FEATURE, Lush.id("mushroom_scatter"), new MushroomScatterFeature());
		LushBiomeModifications.register();
	}
}
