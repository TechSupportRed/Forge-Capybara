package com.techsupportred.capybaramod.item;

import com.techsupportred.capybaramod.CapybaraMod;
import com.techsupportred.capybaramod.entity.ModEntities;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CapybaraMod.MODID);

    public static final RegistryObject<Item> CAPYBARA_SPAWN_EGG = ITEMS.register("capybara_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.CAPYBARA, 0xC4A484, 0x5C4033,
                    new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
