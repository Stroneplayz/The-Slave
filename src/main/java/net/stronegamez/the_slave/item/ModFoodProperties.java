package net.stronegamez.the_slave.item;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.UseAnim;

public class ModFoodProperties extends Item {
    // 20 ticks = 1 second
    public static final FoodProperties MONSTER_MEAT =
            new FoodProperties.Builder().nutrition(7).saturationModifier(1.6f)
                    .effect(() -> new MobEffectInstance
                            (MobEffects.POISON,200,0),0.2F)
                    .effect(() -> new MobEffectInstance
                            (MobEffects.WEAKNESS,150,0),0.2F).build();

    public static final FoodProperties COOKED_MONSTER_MEAT =
            new FoodProperties.Builder().nutrition(8).saturationModifier(1.8f)
                    .effect(() -> new MobEffectInstance
                            (MobEffects.HEALTH_BOOST,150,0),0.25F)
                    .effect(() -> new MobEffectInstance
                            (MobEffects.REGENERATION,150,1),0.35F).build();

    public static final FoodProperties MONSTER_MEAT_P =
            new FoodProperties.Builder().nutrition(8).saturationModifier(1.6f)
                    .effect(() -> new MobEffectInstance
                            (MobEffects.POISON,200,0),0.2F)
                    .effect(() -> new MobEffectInstance
                            (MobEffects.WEAKNESS,150,0),0.2F).build();

    public static final FoodProperties COOKED_MONSTER_MEAT_P =
            new FoodProperties.Builder().nutrition(8).saturationModifier(1.8f)
                    .effect(() -> new MobEffectInstance
                            (MobEffects.HEALTH_BOOST,150,0),0.25F)
                    .effect(() -> new MobEffectInstance
                            (MobEffects.REGENERATION,150,1),0.35F).build();

    public static final FoodProperties MONSTER_MEAT_R =
            new FoodProperties.Builder().nutrition(6).saturationModifier(1.0f)
                    .effect(() -> new MobEffectInstance
                            (MobEffects.POISON,250,0),0.45F)
                    .effect(() -> new MobEffectInstance
                            (MobEffects.WEAKNESS,210,0),0.45F)
                    .effect(() -> new MobEffectInstance
                            (MobEffects.MOVEMENT_SLOWDOWN,200,0),0.45F).build();

    public static final FoodProperties COOKED_MONSTER_MEAT_R =
            new FoodProperties.Builder().nutrition(7).saturationModifier(1.2f)
                    .effect(() -> new MobEffectInstance
                            (MobEffects.WEAKNESS,210,0),0.45F).build();


    public static final FoodProperties MONSTER_MEAT_X =
            new FoodProperties.Builder().nutrition(5).saturationModifier(1.2f)
                    .effect(() -> new MobEffectInstance
                            (MobEffects.POISON,300,0),0.48F)
                    .effect(() -> new MobEffectInstance
                            (MobEffects.WEAKNESS,210,0),0.48F)
                    .effect(() -> new MobEffectInstance
                            (MobEffects.MOVEMENT_SLOWDOWN,200,0),0.48F).build();

    public static final FoodProperties COOKED_MONSTER_MEAT_X =
            new FoodProperties.Builder().nutrition(7).saturationModifier(1.2f)
                    .effect(() -> new MobEffectInstance
                            (MobEffects.WEAKNESS,210,1),0.45F)
                    .effect(() -> new MobEffectInstance
                            (MobEffects.MOVEMENT_SLOWDOWN,200,0),0.48F).build();

    public static final FoodProperties ROTTEN_MONSTER_MEAT =
            new FoodProperties.Builder().nutrition(4).saturationModifier(1.2f)
                    .effect(() -> new MobEffectInstance
                            (MobEffects.POISON,350,0),0.6F)
                    .effect(() -> new MobEffectInstance
                            (MobEffects.WEAKNESS,220,0),0.6F)
                    .effect(() -> new MobEffectInstance
                            (MobEffects.MOVEMENT_SLOWDOWN,250,0),0.6F).build();

    public static final FoodProperties ROTTEN_MONSTER_MEAT_P =
            new FoodProperties.Builder().nutrition(4).saturationModifier(1.2f)
                    .effect(() -> new MobEffectInstance
                            (MobEffects.POISON,350,0),0.6F)
                    .effect(() -> new MobEffectInstance
                            (MobEffects.WEAKNESS,220,0),0.6F)
                    .effect(() -> new MobEffectInstance
                            (MobEffects.MOVEMENT_SLOWDOWN,250,0),0.6F).build();

    public static final FoodProperties BLACK_MONSTER_MEAT_P =
            new FoodProperties.Builder().nutrition(4).saturationModifier(1.2f)
                    .effect(() -> new MobEffectInstance
                            (MobEffects.POISON,200,1),0.6F)
                    .effect(() -> new MobEffectInstance
                            (MobEffects.WITHER,100,0),0.8F)
                    .effect(() -> new MobEffectInstance
                            (MobEffects.MOVEMENT_SLOWDOWN,250,0),0.75F).build();

    public static final FoodProperties MEAT =
            new FoodProperties.Builder().nutrition(4).saturationModifier(1.2f)
                    .effect(() -> new MobEffectInstance
                            (MobEffects.POISON,200,1),0.6F)
                    .effect(() -> new MobEffectInstance
                            (MobEffects.WITHER,100,0),0.8F)
                    .effect(() -> new MobEffectInstance
                            (MobEffects.MOVEMENT_SLOWDOWN,250,0),0.75F).build();

    public static final FoodProperties MEAT_X =
            new FoodProperties.Builder().nutrition(4).saturationModifier(1.2f)
                    .effect(() -> new MobEffectInstance
                            (MobEffects.POISON,200,1),0.6F)
                    .effect(() -> new MobEffectInstance
                            (MobEffects.WITHER,100,0),0.8F)
                    .effect(() -> new MobEffectInstance
                            (MobEffects.MOVEMENT_SLOWDOWN,250,0),0.75F).build();

    public static final FoodProperties WHITEANDBLACK_MEAT =
            new FoodProperties.Builder().nutrition(4).saturationModifier(1.0f)
                    .effect(() -> new MobEffectInstance
                            (MobEffects.BLINDNESS,150,0),0.6F)
                    .effect(() -> new MobEffectInstance
                            (MobEffects.REGENERATION,200,1),0.75F)
                    .effect(() -> new MobEffectInstance
                            (MobEffects.WEAKNESS,220,0),0.75F)
                    .effect(() -> new MobEffectInstance
                            (MobEffects.MOVEMENT_SPEED,100,0),0.6F).build();

    public static final FoodProperties COFFEE_CUP =
            new FoodProperties.Builder().nutrition(1).saturationModifier(1).alwaysEdible()
                    .effect(() -> new MobEffectInstance
                            (MobEffects.HEALTH_BOOST, 400, 0), 1.0F).build();

    public ModFoodProperties(Properties properties) {
        super(properties);
    }

    @Override
    public UseAnim getUseAnimation(ItemStack stack) {
        return UseAnim.DRINK; // makes it use the drink animation
    }

    @Override
    public int getUseDuration(ItemStack stack, LivingEntity entity) {
        return 32; // duration of drinking animation (same as potions/milk)
    }
}


