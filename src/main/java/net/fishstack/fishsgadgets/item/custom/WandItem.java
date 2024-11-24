package net.fishstack.fishsgadgets.item.custom;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.phys.BlockHitResult;

public class WandItem extends Item {
    private int explosionRadius = 300;

    public WandItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level pLevel, Player pPlayer, InteractionHand pUsedHand) {
        BlockHitResult blockhitresult = getPlayerPOVHitResult(pLevel, pPlayer, ClipContext.Fluid.NONE);
        pLevel.explode(pPlayer, blockhitresult.getBlockPos().getX(), blockhitresult.getBlockPos().getY(), blockhitresult.getBlockPos().getZ(), (float)this.explosionRadius , Level.ExplosionInteraction.TNT);

        return super.use(pLevel, pPlayer, pUsedHand);
    }
}
