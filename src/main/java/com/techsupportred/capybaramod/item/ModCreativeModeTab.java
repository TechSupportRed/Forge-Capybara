package com.techsupportred.capybaramod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab CAPYBARA_TAB = new CreativeModeTab("capybaratab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.CAPYBARA_SPAWN_EGG.get());
        }
    };
}
