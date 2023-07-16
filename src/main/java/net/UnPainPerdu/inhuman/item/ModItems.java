package net.UnPainPerdu.inhuman.item;

import net.UnPainPerdu.inhuman.Inhuman;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Inhuman.MOD_ID);

    //Items moddés
    public static final RegistryObject<Item> COEUR_DE_DRAGON = ITEMS.register("coeur_de_dragon", () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
