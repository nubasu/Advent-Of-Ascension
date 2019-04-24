package net.nevermine.block.generation;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;
import net.nevermine.izer.Blockizer;
import net.nevermine.izer.Itemizer;

public class ToxicWaste extends Block {
	public ToxicWaste(final Material p_i45394_1_) {
		super(p_i45394_1_);
		setCreativeTab(Itemizer.GenerationTab);
		setHardness(0.25f);
		setResistance(0.1f);
	}

	public AxisAlignedBB getCollisionBoundingBoxFromPool(final World p_149668_1_, final int p_149668_2_, final int p_149668_3_, final int p_149668_4_) {
		final float f = 0.125f;
		return AxisAlignedBB.getBoundingBox((double)p_149668_2_, (double)p_149668_3_, (double)p_149668_4_, (double)(p_149668_2_ + 1), (double)(p_149668_3_ + 1 - f), (double)(p_149668_4_ + 1));
	}

	public void onEntityCollidedWithBlock(final World w, final int x, final int y, final int z, final Entity e) {
		if (!(e instanceof EntityItem) && w.getBlock(x, y, z) == Blockizer.ToxicWaste && e instanceof EntityPlayer) {
			((EntityLivingBase)e).addPotionEffect(new PotionEffect(Potion.poison.id, 60, 7));
			((EntityLivingBase)e).addPotionEffect(new PotionEffect(Potion.confusion.id, 150, 5));
		}
	}
}