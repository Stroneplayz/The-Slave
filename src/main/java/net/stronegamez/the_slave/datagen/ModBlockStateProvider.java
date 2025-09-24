package net.stronegamez.the_slave.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.stronegamez.the_slave.TheSlaveMod;
import net.stronegamez.the_slave.block.ModBlocks;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, TheSlaveMod.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockwithitem(ModBlocks.TITANIUM_BLOCK);
        blockwithitem(ModBlocks.TITANIUM_ORE);
        blockwithitem(ModBlocks.DEEPSLATE_TITANIUM_ORE);
        blockwithitem(ModBlocks.EBONY_DIRT);
        blockwithitem(ModBlocks.EBONY_SAND);

        // 3 face config
        Block block1 = ModBlocks.EBONY_GRASS.get();
        String modelName1 = ModBlocks.EBONY_GRASS.getId().getPath();

        ModelFile model1 = models().cubeBottomTop(
                modelName1,
                modLoc("block/ebony_grass"),   // side
                modLoc("block/soul_dirt"), // bottom
                modLoc("block/ebony_grass_top"));// top

        simpleBlockWithItem(block1, model1);


        Block block = ModBlocks.SOUL_DEVOURING_SOIL.get();
        String modelName = ModBlocks.SOUL_DEVOURING_SOIL.getId().getPath();

        ModelFile model = models().cubeBottomTop(
                modelName,
                modLoc("block/soul_dirt_side"),   // side
                modLoc("block/soul_dirt"), // bottom
                modLoc("block/soul_grass_top"));// top

        simpleBlockWithItem(block, model);



    }

    private void blockwithitem(DeferredBlock<?> deferredBlock) {
        simpleBlockWithItem(deferredBlock.get(), cubeAll(deferredBlock.get()));
    }

}
