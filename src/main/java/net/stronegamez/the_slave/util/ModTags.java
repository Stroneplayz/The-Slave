package net.stronegamez.the_slave.util;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.stronegamez.the_slave.TheSlaveMod;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> The_Spell_Block = createtag("the_spell_block");

        private static TagKey<Block> createtag(String name) {
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(TheSlaveMod.MOD_ID, name));
        }
    }

    public static class Items{
        public static final TagKey<Item> The_Spell_Items = createtag("the_spell_items");

        public static final TagKey<Item> Metals = createtag("metals");

        private static TagKey<Item> createtag(String name) {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath(TheSlaveMod.MOD_ID, name));
        }
    }
}
