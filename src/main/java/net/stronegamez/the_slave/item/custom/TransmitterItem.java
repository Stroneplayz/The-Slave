package net.stronegamez.the_slave.item.custom;

import net.minecraft.network.chat.Component;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

import java.util.List;

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

    @Override
    public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
        tooltipComponents.add(Component.translatable("tooltip.theslavemod.transmitter"));
        super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
    }
}
