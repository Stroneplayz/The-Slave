package net.stronegamez.the_slave.item;

import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.TooltipFlag;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.stronegamez.the_slave.TheSlaveMod;
import net.stronegamez.the_slave.item.custom.FuelItem;
import net.stronegamez.the_slave.item.custom.TransmitterItem;

import java.util.List;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(TheSlaveMod.MOD_ID);

//FOOD
    public static final DeferredItem<Item> COFFEE_CUP = ITEMS.register("coffee_cup",
            () -> new Item(new Item.Properties().food(ModFoodProperties.COFFEE_CUP).stacksTo(1)));

    public static final DeferredItem<Item> WHITEANDBLACK_MEAT = ITEMS.register("whiteandblack_meat",
            () -> new Item(new Item.Properties().food(ModFoodProperties.WHITEANDBLACK_MEAT).stacksTo(64)));

    public static final DeferredItem<Item> MEAT = ITEMS.register("meat",
            () -> new Item(new Item.Properties().food(ModFoodProperties.MEAT).stacksTo(64)));

    public static final DeferredItem<Item> MEAT_X = ITEMS.register("meat_x",
            () -> new Item(new Item.Properties().food(ModFoodProperties.MEAT_X).stacksTo(64)));

    public static final DeferredItem<Item> BLACK_MONSTER_MEAT_P = ITEMS.register("black_monster_meat_p",
            () -> new Item(new Item.Properties().food(ModFoodProperties.BLACK_MONSTER_MEAT_P).stacksTo(64)));

    public static final DeferredItem<Item> COOKED_MONSTER_MEAT = ITEMS.register("cooked_monster_meat",
            () -> new Item(new Item.Properties().food(ModFoodProperties.COOKED_MONSTER_MEAT).stacksTo(64)));

    public static final DeferredItem<Item> MONSTER_MEAT = ITEMS.register("monster_meat",
            () -> new Item(new Item.Properties().food(ModFoodProperties.MONSTER_MEAT).stacksTo(64)));

    public static final DeferredItem<Item> COOKED_MONSTER_MEAT_P = ITEMS.register("cooked_monster_meat_p",
            () -> new Item(new Item.Properties().food(ModFoodProperties.COOKED_MONSTER_MEAT_P).stacksTo(64)));

    public static final DeferredItem<Item> MONSTER_MEAT_P = ITEMS.register("monster_meat_p",
            () -> new Item(new Item.Properties().food(ModFoodProperties.MONSTER_MEAT_P).stacksTo(64)));

    public static final DeferredItem<Item> COOKED_MONSTER_MEAT_R = ITEMS.register("cooked_monster_meat_r",
            () -> new Item(new Item.Properties().food(ModFoodProperties.COOKED_MONSTER_MEAT_R).stacksTo(64)));

    public static final DeferredItem<Item> MONSTER_MEAT_R = ITEMS.register("monster_meat_r",
            () -> new Item(new Item.Properties().food(ModFoodProperties.MONSTER_MEAT_R).stacksTo(64)));

    public static final DeferredItem<Item> COOKED_MONSTER_MEAT_X = ITEMS.register("cooked_monster_meat_x",
            () -> new Item(new Item.Properties().food(ModFoodProperties.COOKED_MONSTER_MEAT_X).stacksTo(64)));

    public static final DeferredItem<Item> MONSTER_MEAT_X = ITEMS.register("monster_meat_x",
            () -> new Item(new Item.Properties().food(ModFoodProperties.MONSTER_MEAT_X).stacksTo(64)));

    public static final DeferredItem<Item> ROTTEN_MONSTER_MEAT = ITEMS.register("rotten_monster_meat",
            () -> new Item(new Item.Properties().food(ModFoodProperties.ROTTEN_MONSTER_MEAT).stacksTo(64)));

    public static final DeferredItem<Item> ROTTEN_MONSTER_MEAT_P = ITEMS.register("rotten_monster_meat_p",
            () -> new Item(new Item.Properties().food(ModFoodProperties.ROTTEN_MONSTER_MEAT_P).stacksTo(64)));


    //ITEMS
    public static final DeferredItem<Item> STRING_OF_FATE = ITEMS.register("string_of_fate",
            () -> new Item(new Item.Properties().stacksTo(1).rarity(Rarity.EPIC)){
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.theslavemod.string_of_fate"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });

    public static final DeferredItem<Item> SOUL_SHARD = ITEMS.register("soul_shard",
            () -> new FuelItem(new Item.Properties().rarity(Rarity.RARE), 55000){
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    if (Screen.hasShiftDown()) {
                        tooltipComponents.add(Component.translatable("tooltip.theslavemod.soul_shard_shift_down"));
                    }
                    else{
                        tooltipComponents.add(Component.translatable("tooltip.theslavemod.soul_shard"));
                    };
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });

    public static final DeferredItem<Item> TRANSMITTER = ITEMS.register("transmitter",
            () -> new TransmitterItem(new Item.Properties().stacksTo(1).rarity(Rarity.UNCOMMON)));

    public static final DeferredItem<Item> TITANIUM_INGOT = ITEMS.register("titanium_ingot",
            () -> new Item(new Item.Properties().stacksTo(64)));

    public static final DeferredItem<Item> RAW_TITANIUM_INGOT = ITEMS.register("raw_titanium_ingot",
            () -> new Item(new Item.Properties().stacksTo(64)));

    public static final DeferredItem<Item> TITANIUM_NUGGET = ITEMS.register("titanium_nugget",
            () -> new Item(new Item.Properties().stacksTo(64)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
