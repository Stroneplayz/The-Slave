package net.stronegamez.the_slave.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.stronegamez.the_slave.TheSlaveMod;
import net.stronegamez.the_slave.item.ModItems;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(TheSlaveMod.MOD_ID);

    public static final DeferredBlock<Block> EBONY_DIRT = registerBlock("ebony_dirt",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(0.6f).sound(SoundType.ROOTED_DIRT).randomTicks()));

    public static final DeferredBlock<Block> EBONY_GRASS = registerBlock("ebony_grass",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(0.6f).sound(SoundType.WET_GRASS).randomTicks()));

    public static final DeferredBlock<Block> EBONY_SAND = registerBlock("ebony_sand",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(0.8f).sound(SoundType.SOUL_SAND)));


    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block){
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block){
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
