package net.stronegamez.the_slave.datagen;

import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.stronegamez.the_slave.TheSlaveMod;
import net.stronegamez.the_slave.item.ModItems;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, TheSlaveMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ModItems.TITANIUM_INGOT.get());
        basicItem(ModItems.RAW_TITANIUM_INGOT.get());
        basicItem(ModItems.TITANIUM_NUGGET.get());
        basicItem(ModItems.STRING_OF_FATE.get());
        basicItem(ModItems.TRANSMITTER.get());
        basicItem(ModItems.SOUL_SHARD.get());

        basicItem(ModItems.MEAT.get());
        basicItem(ModItems.MEAT_X.get());
        basicItem(ModItems.MONSTER_MEAT.get());
        basicItem(ModItems.MONSTER_MEAT_P.get());
        basicItem(ModItems.MONSTER_MEAT_X.get());
        basicItem(ModItems.MONSTER_MEAT_R.get());
        basicItem(ModItems.COOKED_MONSTER_MEAT.get());
        basicItem(ModItems.COOKED_MONSTER_MEAT_P.get());
        basicItem(ModItems.COOKED_MONSTER_MEAT_X.get());
        basicItem(ModItems.COOKED_MONSTER_MEAT_R.get());
        basicItem(ModItems.BLACK_MONSTER_MEAT_P.get());
        basicItem(ModItems.ROTTEN_MONSTER_MEAT.get());
        basicItem(ModItems.ROTTEN_MONSTER_MEAT_P.get());
        basicItem(ModItems.WHITEANDBLACK_MEAT.get());
        basicItem(ModItems.COFFEE_CUP.get());

    }
}
