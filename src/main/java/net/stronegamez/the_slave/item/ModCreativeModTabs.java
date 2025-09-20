package net.stronegamez.the_slave.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.stronegamez.the_slave.TheSlaveMod;
import net.stronegamez.the_slave.block.ModBlocks;

import java.rmi.registry.Registry;
import java.util.function.Supplier;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TheSlaveMod.MOD_ID);

    public static final Supplier<CreativeModeTab> DREAMREALM_NATURE_TAB =
            CREATIVE_MODE_TAB.register("dreamrealm_nature_tab", () -> CreativeModeTab.builder().icon( () ->
                            new ItemStack(ModBlocks.EBONY_GRASS.get()))
                    .title(Component.translatable("creativetab.theslavemod.dreamrealm_nature"))
                    .displayItems((parameters, output) -> {
                        output.accept(ModBlocks.EBONY_GRASS);
                        output.accept(ModBlocks.EBONY_SAND);
                        output.accept(ModBlocks.EBONY_DIRT);

                    }).build());

    public static final Supplier<CreativeModeTab> WEAPONS_TAB =
            CREATIVE_MODE_TAB.register("weapons_tab", () -> CreativeModeTab.builder().icon( () ->
                            new ItemStack(ModItems.STRING_OF_FATE.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(TheSlaveMod.MOD_ID,
                            "dreamrealm_nature_tab"))
                    .title(Component.translatable("creativetab.theslavemod.weapons"))
                    .displayItems((parameters, output) -> {
                        output.accept(ModItems.STRING_OF_FATE);

                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
