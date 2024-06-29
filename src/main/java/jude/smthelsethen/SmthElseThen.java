package jude.smthelsethen;

import jude.smthelsethen.item.ModItem;
import net.fabricmc.api.ModInitializer;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class SmthElseThen implements ModInitializer {

	public static String MOD_ID = "smthelsethen";

	@Override
	public void onInitialize() {
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "ruby"), ModItem.RUBY);
	}
}