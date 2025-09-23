package net.stronegamez.the_slave.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import org.checkerframework.checker.units.qual.N;

import javax.annotation.Nullable;

public class Soul_Devouring_Soil extends Block {
    public Soul_Devouring_Soil(Properties properties) {
        super(properties);
    }

    @Override
    public void stepOn(Level level, BlockPos pos, BlockState state, Entity entity) {
        super.stepOn(level, pos, state, entity);

        if (!level.isClientSide() && entity instanceof LivingEntity living) {
            entity.hurt(level.damageSources().generic(), 0.3f);
            MobEffectInstance mobEffectInstance = new MobEffectInstance(MobEffects.WEAKNESS, 200, 0);

            ((LivingEntity) entity).addEffect(mobEffectInstance);
        }
    }
}
