package net.stronegamez.the_slave.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.ItemLike;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;
import net.stronegamez.the_slave.TheSlaveMod;
import net.stronegamez.the_slave.block.ModBlocks;
import net.stronegamez.the_slave.item.ModItems;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder{

    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {
        List<ItemLike> TITANIUM_SMELTABLES = List.of(ModBlocks.TITANIUM_ORE, ModBlocks.DEEPSLATE_TITANIUM_ORE,
                ModItems.RAW_TITANIUM_INGOT);


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.COFFEE_CUP.get())
                .pattern("ABA")
                .pattern("CDC")
                .define('B', Items.SUGAR)
                .define('C', Items.COCOA_BEANS)
                .define('D', Items.GLASS_BOTTLE)
                .define('A', Items.MILK_BUCKET)
                .unlockedBy("has_coffee_cup", has(ModItems.COFFEE_CUP)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.TITANIUM_INGOT.get(), 9)
                .requires(ModBlocks.TITANIUM_BLOCK)
                .unlockedBy("has_titanium_ingots", has(ModItems.TITANIUM_INGOT)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.TITANIUM_BLOCK.get(), 1)
                .requires(ModItems.TITANIUM_INGOT, 9)
                .unlockedBy("has_titanium_block", has(ModBlocks.TITANIUM_BLOCK)).save(recipeOutput);

        oreSmelting(recipeOutput, TITANIUM_SMELTABLES, RecipeCategory.MISC,
                ModItems.TITANIUM_INGOT.get(), 0.25f, 250,"titanium");
        oreBlasting(recipeOutput, TITANIUM_SMELTABLES, RecipeCategory.MISC,
                ModItems.TITANIUM_INGOT.get(), 0.25f, 125,"titanium");


        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModItems.MONSTER_MEAT),
                RecipeCategory.FOOD, ModItems.COOKED_MONSTER_MEAT, 0.3f, 250)
                .unlockedBy("has_nightmare_meat",has(ModItems.COOKED_MONSTER_MEAT))
                .save(recipeOutput, "nightmare_meat_smelting");
        SimpleCookingRecipeBuilder.smoking(Ingredient.of(ModItems.MONSTER_MEAT),
                RecipeCategory.FOOD, ModItems.COOKED_MONSTER_MEAT, 0.3f, 125)
                .unlockedBy("has_nightmare_meat",has(ModItems.COOKED_MONSTER_MEAT))
                .save(recipeOutput, "nightmare_meat_smoking");
        SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(ModItems.MONSTER_MEAT),
                RecipeCategory.FOOD, ModItems.COOKED_MONSTER_MEAT, 0.3f, 1000)
                .unlockedBy("has_nightmare_meat",has(ModItems.COOKED_MONSTER_MEAT))
                .save(recipeOutput, "nightmare_meat_campfire");


        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModItems.MONSTER_MEAT_P),
                RecipeCategory.FOOD, ModItems.COOKED_MONSTER_MEAT_P, 0.3f, 250)
                .unlockedBy("has_nightmare_meat_p",has(ModItems.COOKED_MONSTER_MEAT_P))
                .save(recipeOutput, "nightmare_meat_smelting_p");
        SimpleCookingRecipeBuilder.smoking(Ingredient.of(ModItems.MONSTER_MEAT_P),
                RecipeCategory.FOOD, ModItems.COOKED_MONSTER_MEAT_P, 0.3f, 250)
                .unlockedBy("has_nightmare_meat_p",has(ModItems.COOKED_MONSTER_MEAT_P))
                .save(recipeOutput, "nightmare_meat_smoking_p");
        SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(ModItems.MONSTER_MEAT_P),
                RecipeCategory.FOOD, ModItems.COOKED_MONSTER_MEAT_P, 0.3f, 1000)
                .unlockedBy("has_nightmare_meat_p",has(ModItems.COOKED_MONSTER_MEAT_P))
                .save(recipeOutput, "nightmare_meat_campfire_p");


        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModItems.MONSTER_MEAT_R),
                RecipeCategory.FOOD, ModItems.COOKED_MONSTER_MEAT_R, 0.2f, 225)
                .unlockedBy("has_nightmare_r", has(ModItems.COOKED_MONSTER_MEAT_R))
                .save(recipeOutput, "nightmare_meat_smelting_r");
        SimpleCookingRecipeBuilder.smoking(Ingredient.of(ModItems.MONSTER_MEAT_R),
                RecipeCategory.FOOD, ModItems.COOKED_MONSTER_MEAT_R, 0.2f, 225)
                .unlockedBy("has_nightmare_r", has(ModItems.COOKED_MONSTER_MEAT_R))
                .save(recipeOutput, "nightmare_meat_smoking_r");
        SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(ModItems.MONSTER_MEAT_R),
                RecipeCategory.FOOD, ModItems.COOKED_MONSTER_MEAT_R, 0.2f, 850)
                .unlockedBy("has_nightmare_r", has(ModItems.COOKED_MONSTER_MEAT_R))
                .save(recipeOutput, "nightmare_meat_campfire_r");


        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModItems.MONSTER_MEAT_X),
                RecipeCategory.FOOD, ModItems.COOKED_MONSTER_MEAT_X, 0.1f, 200)
                .unlockedBy("has_nightmare_x", has(ModItems.COOKED_MONSTER_MEAT_X))
                .save(recipeOutput, "nightmare_meat_smelting_x");
        SimpleCookingRecipeBuilder.smoking(Ingredient.of(ModItems.MONSTER_MEAT_X),
                RecipeCategory.FOOD, ModItems.COOKED_MONSTER_MEAT_X, 0.1f, 200)
                .unlockedBy("has_nightmare_x", has(ModItems.COOKED_MONSTER_MEAT_X))
                .save(recipeOutput, "nightmare_meat_smoking_x");
        SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(ModItems.MONSTER_MEAT_X),
                RecipeCategory.FOOD, ModItems.COOKED_MONSTER_MEAT_X, 0.1f, 830)
                .unlockedBy("has_nightmare_x",has(ModItems.COOKED_MONSTER_MEAT_X))
                .save(recipeOutput, "nightmare_meat_campfire_x");
    }


    protected static void oreSmelting(RecipeOutput recipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(recipeOutput, RecipeSerializer.SMELTING_RECIPE, SmeltingRecipe::new, pIngredients, pCategory, pResult,
                pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(RecipeOutput recipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTime, String pGroup) {
        oreCooking(recipeOutput, RecipeSerializer.BLASTING_RECIPE, BlastingRecipe::new, pIngredients, pCategory, pResult,
                pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static <T extends AbstractCookingRecipe> void oreCooking(RecipeOutput recipeOutput, RecipeSerializer<T> pCookingSerializer, AbstractCookingRecipe.Factory<T> factory,
                                                                       List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for(ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult, pExperience, pCookingTime, pCookingSerializer, factory).group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(recipeOutput, TheSlaveMod.MOD_ID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }
    }
}

