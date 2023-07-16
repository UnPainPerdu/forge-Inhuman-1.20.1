package net.UnPainPerdu.inhuman.item;

import net.UnPainPerdu.inhuman.Inhuman;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Inhuman.MOD_ID);

    public static final RegistryObject<CreativeModeTab> INHUMAN_TAB = CREATIVE_MODE_TABS.register("inhuman_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.COEUR_DE_DRAGON.get()))
                    .title(Component.translatable("creativetab.inhuman_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        //rajout item moddé
                        pOutput.accept(ModItems.COEUR_DE_DRAGON.get());
                        //rajout bloc moddé
                        //pOutput.accept(ModBlocks.RAW_SAPPHIRE_BLOCK.get());

                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}