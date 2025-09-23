package net.stronegamez.the_slave.item.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.monster.Zombie;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.stronegamez.the_slave.item.ModItems;

import javax.annotation.Nullable;

public class TransmitterItem extends Item {

    public  TransmitterItem(Properties properties) {
        super(properties);
    }


    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {

        ItemStack clickedItem = player.getItemInHand(hand);

        if(level.isClientSide()) {
            //for sound to play - easier one
            player.playSound(SoundEvents.CONDUIT_AMBIENT, 2.5F, 2.5F);

        }

        if(!level.isClientSide()) {
            //gave up
            player.sendSystemMessage(Component.literal(
                    "Welcome, Mundane " + player.getName().getString() + "..."));
        }

        return InteractionResultHolder.success(clickedItem);
    }
}
