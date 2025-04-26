package net.wiatrak.schabowymod.item;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.wiatrak.schabowymod.SchabowyMod;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, SchabowyMod.MOD_ID);

    public static final RegistryObject<Item> SCHABOWY = ITEMS.register("schabowy",
            () -> new Item(new Item.Properties().food(
                    new FoodProperties.Builder()
                            .nutrition(9)
                            .saturationMod(0.8f)
                            .meat()
                            .build())));

    public static final RegistryObject<Item> SUROWY_SCHABOWY = ITEMS.register("surowy_schabowy",
            () -> new Item(new Item.Properties().food(
                    new FoodProperties.Builder()
                            .nutrition(3)
                            .saturationMod(0.25f)
                            .meat()
                            .build())));

    public static final RegistryObject<Item> BULKA_TARTA = ITEMS.register("bulka_tarta",
            () -> new Item(new Item.Properties().food(
                    new FoodProperties.Builder()
                            .nutrition(1)
                            .saturationMod(0.2f)
                            .fast()
                            .build())));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
