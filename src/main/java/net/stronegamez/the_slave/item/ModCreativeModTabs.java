package net.stronegamez.the_slave.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.stronegamez.the_slave.TheSlaveMod;
import net.stronegamez.the_slave.block.ModBlocks;

import java.util.function.Supplier;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TheSlaveMod.MOD_ID);

    public static final Supplier<CreativeModeTab> DREAMREALM =
            CREATIVE_MODE_TAB.register("dreamrealm", () -> CreativeModeTab.builder().icon( () ->
                            new ItemStack(ModBlocks.EBONY_GRASS.get()))
                    .title(Component.translatable("creativetab.theslavemod.dreamrealm"))
                    .displayItems((parameters, output) -> {
                        output.accept(ModBlocks.EBONY_GRASS);
                        output.accept(ModBlocks.EBONY_SAND);
                        output.accept(ModBlocks.EBONY_DIRT);
                        output.accept(ModBlocks.SOUL_DEVOURING_SOIL);
                        output.accept(ModItems.BLACK_MONSTER_MEAT_P);
                        output.accept(ModItems.COOKED_MONSTER_MEAT);
                        output.accept(ModItems.MEAT);
                        output.accept(ModItems.MEAT_X);
                        output.accept(ModItems.COOKED_MONSTER_MEAT_R);
                        output.accept(ModItems.COOKED_MONSTER_MEAT_X);
                        output.accept(ModItems.COOKED_MONSTER_MEAT_P);
                        output.accept(ModItems.MONSTER_MEAT);
                        output.accept(ModItems.MONSTER_MEAT_P);
                        output.accept(ModItems.MONSTER_MEAT_R);
                        output.accept(ModItems.MONSTER_MEAT_X);
                        output.accept(ModItems.BLACK_MONSTER_MEAT_P);
                        output.accept(ModItems.WHITEANDBLACK_MEAT);
                        output.accept(ModItems.ROTTEN_MONSTER_MEAT_P);
                        output.accept(ModItems.ROTTEN_MONSTER_MEAT);
                    }).build());

    public static final Supplier<CreativeModeTab> WEAPONS_TAB =
            CREATIVE_MODE_TAB.register("weapons_tab", () -> CreativeModeTab.builder().icon( () ->
                            new ItemStack(ModItems.STRING_OF_FATE.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(TheSlaveMod.MOD_ID,
                            "dreamrealm_nature_tab"))
                    .title(Component.translatable("creativetab.theslavemod.weapons"))
                    .displayItems((parameters, output) -> {
                        output.accept(ModItems.STRING_OF_FATE);
                        output.accept(ModItems.SOUL_SHARD);

                    }).build());

    public static final Supplier<CreativeModeTab> ARMED_FORCES_TAB =
            CREATIVE_MODE_TAB.register("armed_forces_tab", () -> CreativeModeTab.builder().icon( () ->
                            new ItemStack(ModItems.TRANSMITTER.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(TheSlaveMod.MOD_ID,
                            "weapons_tab"))
                    .title(Component.translatable("creativetab.theslavemod.armed_forces"))
                    .displayItems((parameters, output) -> {
                        output.accept(ModItems.TRANSMITTER);


                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
