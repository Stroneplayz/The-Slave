package net.stronegamez.the_slave.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.stronegamez.the_slave.TheSlaveMod;
import net.stronegamez.the_slave.item.ModItems;
import net.stronegamez.the_slave.util.ModTags;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends ItemTagsProvider{
    public ModItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, CompletableFuture<TagLookup<Block>> blockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTags, TheSlaveMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {

        tag(ModTags.Items.The_Spell_Items)
                .add(ModItems.SOUL_SHARD.get())
                .add(ModItems.STRING_OF_FATE.get());


        tag(ModTags.Items.Metals)
                .add(ModItems.TITANIUM_INGOT.get())
                .add(ModItems.TITANIUM_NUGGET.get())
                .add(ModItems.RAW_TITANIUM_INGOT.get());

    }
}
