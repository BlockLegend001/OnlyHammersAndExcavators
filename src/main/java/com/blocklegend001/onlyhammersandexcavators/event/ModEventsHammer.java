package com.blocklegend001.onlyhammersandexcavators.event;

import com.blocklegend001.onlyhammersandexcavators.OnlyHammersAndExcavators;
import com.blocklegend001.onlyhammersandexcavators.item.custom.Hammer;
import com.blocklegend001.onlyhammersandexcavators.utils.RadiusMap;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.level.BlockEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.HashSet;
import java.util.Set;

@Mod.EventBusSubscriber(modid = OnlyHammersAndExcavators.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class ModEventsHammer {
    private static final Set<BlockPos> HARVESTED_BLOCKS = new HashSet<>();

    @SubscribeEvent
    public static boolean onHammerUsage(BlockEvent.BreakEvent event) {
        Player player = event.getPlayer();
        ItemStack mainHandItem = player.getMainHandItem();

        if (!(player instanceof ServerPlayer serverPlayer)) return true;
        if (!(mainHandItem.getItem() instanceof Hammer hammer)) return true;
        if (HARVESTED_BLOCKS.contains(event.getPos())) return true;

        boolean isSneaking = player.isCrouching();

        HARVESTED_BLOCKS.add(event.getPos());

        try {
            int radius = isSneaking ? 0 : RadiusMap.getHammerRadius().get(mainHandItem.getItem());

            for (BlockPos targetPos : Hammer.getBlocksToBeDestroyed(radius, event.getPos(), serverPlayer)) {
                if (targetPos.equals(event.getPos())) continue;
                if (HARVESTED_BLOCKS.contains(targetPos)) continue;
                if (!hammer.isCorrectToolForDrops(mainHandItem, event.getLevel().getBlockState(targetPos))) continue;

                HARVESTED_BLOCKS.add(targetPos);
                serverPlayer.gameMode.destroyBlock(targetPos);
                HARVESTED_BLOCKS.remove(targetPos);
            }
        } finally {
            HARVESTED_BLOCKS.remove(event.getPos());
        }
        return true;
    }
}