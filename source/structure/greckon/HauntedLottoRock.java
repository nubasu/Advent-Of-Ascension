package net.tslat.aoa3.structure.greckon;

import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.tslat.aoa3.common.registration.BlockRegister;
import net.tslat.aoa3.entity.npcs.lottoman.EntityHauntedLottoman;
import net.tslat.aoa3.structure.AoAStructure;

import java.util.Random;

public class HauntedLottoRock extends AoAStructure { //StructureSize: 9x7x9
	private static final IBlockState stone = BlockRegister.stoneGreckon.getDefaultState();
	private static final IBlockState water = Blocks.FLOWING_WATER.getDefaultState();

	public HauntedLottoRock() {
		super("HauntedLottoRock");
	}

	@Override
	protected boolean replacesBlocks() {
		return true;
	}

	@Override
	protected void build(World world, Random rand, BlockPos basePos) {
		addBlock(world, basePos, 2, 0, 4, stone);
		addBlock(world, basePos, 3, 0, 3, stone);
		addBlock(world, basePos, 3, 0, 4, stone);
		addBlock(world, basePos, 3, 0, 5, stone);
		addBlock(world, basePos, 4, 0, 2, stone);
		addBlock(world, basePos, 4, 0, 3, stone);
		addBlock(world, basePos, 4, 0, 4, stone);
		addBlock(world, basePos, 4, 0, 5, stone);
		addBlock(world, basePos, 4, 0, 6, stone);
		addBlock(world, basePos, 5, 0, 3, stone);
		addBlock(world, basePos, 5, 0, 4, stone);
		addBlock(world, basePos, 5, 0, 5, stone);
		addBlock(world, basePos, 6, 0, 4, stone);
		addBlock(world, basePos, 1, 1, 3, stone);
		addBlock(world, basePos, 1, 1, 4, stone);
		addBlock(world, basePos, 1, 1, 5, stone);
		addBlock(world, basePos, 2, 1, 2, stone);
		addBlock(world, basePos, 2, 1, 3, stone);
		addBlock(world, basePos, 2, 1, 4, stone);
		addBlock(world, basePos, 2, 1, 5, stone);
		addBlock(world, basePos, 2, 1, 6, stone);
		addBlock(world, basePos, 3, 1, 1, stone);
		addBlock(world, basePos, 3, 1, 2, stone);
		addBlock(world, basePos, 3, 1, 3, stone);
		addBlock(world, basePos, 3, 1, 4, stone);
		addBlock(world, basePos, 3, 1, 5, stone);
		addBlock(world, basePos, 3, 1, 6, stone);
		addBlock(world, basePos, 3, 1, 7, stone);
		addBlock(world, basePos, 4, 1, 1, stone);
		addBlock(world, basePos, 4, 1, 2, stone);
		addBlock(world, basePos, 4, 1, 3, stone);
		addBlock(world, basePos, 4, 1, 4, stone);
		addBlock(world, basePos, 4, 1, 5, stone);
		addBlock(world, basePos, 4, 1, 6, stone);
		addBlock(world, basePos, 4, 1, 7, stone);
		addBlock(world, basePos, 5, 1, 1, stone);
		addBlock(world, basePos, 5, 1, 2, stone);
		addBlock(world, basePos, 5, 1, 3, stone);
		addBlock(world, basePos, 5, 1, 4, stone);
		addBlock(world, basePos, 5, 1, 5, stone);
		addBlock(world, basePos, 5, 1, 6, stone);
		addBlock(world, basePos, 5, 1, 7, stone);
		addBlock(world, basePos, 6, 1, 2, stone);
		addBlock(world, basePos, 6, 1, 3, stone);
		addBlock(world, basePos, 6, 1, 4, stone);
		addBlock(world, basePos, 6, 1, 5, stone);
		addBlock(world, basePos, 6, 1, 6, stone);
		addBlock(world, basePos, 7, 1, 3, stone);
		addBlock(world, basePos, 7, 1, 4, stone);
		addBlock(world, basePos, 7, 1, 5, stone);
		addBlock(world, basePos, 0, 2, 4, stone);
		addBlock(world, basePos, 1, 2, 2, stone);
		addBlock(world, basePos, 1, 2, 3, stone);
		addBlock(world, basePos, 1, 2, 4, stone);
		addBlock(world, basePos, 1, 2, 5, stone);
		addBlock(world, basePos, 1, 2, 6, stone);
		addBlock(world, basePos, 2, 2, 1, stone);
		addBlock(world, basePos, 2, 2, 2, stone);
		addBlock(world, basePos, 2, 2, 3, stone);
		addBlock(world, basePos, 2, 2, 4, stone);
		addBlock(world, basePos, 2, 2, 5, stone);
		addBlock(world, basePos, 2, 2, 6, stone);
		addBlock(world, basePos, 2, 2, 7, stone);
		addBlock(world, basePos, 3, 2, 1, stone);
		addBlock(world, basePos, 3, 2, 2, stone);
		addBlock(world, basePos, 3, 2, 3, stone);
		addBlock(world, basePos, 3, 2, 4, stone);
		addBlock(world, basePos, 3, 2, 5, stone);
		addBlock(world, basePos, 3, 2, 6, stone);
		addBlock(world, basePos, 3, 2, 7, stone);
		addBlock(world, basePos, 4, 2, 0, stone);
		addBlock(world, basePos, 4, 2, 1, stone);
		addBlock(world, basePos, 4, 2, 2, stone);
		addBlock(world, basePos, 4, 2, 3, stone);
		addBlock(world, basePos, 4, 2, 4, stone);
		addBlock(world, basePos, 4, 2, 5, stone);
		addBlock(world, basePos, 4, 2, 6, stone);
		addBlock(world, basePos, 4, 2, 7, stone);
		addBlock(world, basePos, 4, 2, 8, stone);
		addBlock(world, basePos, 5, 2, 1, stone);
		addBlock(world, basePos, 5, 2, 2, stone);
		addBlock(world, basePos, 5, 2, 3, stone);
		addBlock(world, basePos, 5, 2, 4, stone);
		addBlock(world, basePos, 5, 2, 5, stone);
		addBlock(world, basePos, 5, 2, 6, stone);
		addBlock(world, basePos, 5, 2, 7, stone);
		addBlock(world, basePos, 6, 2, 1, stone);
		addBlock(world, basePos, 6, 2, 2, stone);
		addBlock(world, basePos, 6, 2, 3, stone);
		addBlock(world, basePos, 6, 2, 4, stone);
		addBlock(world, basePos, 6, 2, 5, stone);
		addBlock(world, basePos, 6, 2, 6, stone);
		addBlock(world, basePos, 6, 2, 7, stone);
		addBlock(world, basePos, 7, 2, 2, stone);
		addBlock(world, basePos, 7, 2, 3, stone);
		addBlock(world, basePos, 7, 2, 4, stone);
		addBlock(world, basePos, 7, 2, 5, stone);
		addBlock(world, basePos, 7, 2, 6, stone);
		addBlock(world, basePos, 8, 2, 4, stone);
		addBlock(world, basePos, 0, 3, 3, stone);
		addBlock(world, basePos, 0, 3, 4, stone);
		addBlock(world, basePos, 0, 3, 5, stone);
		addBlock(world, basePos, 1, 3, 1, stone);
		addBlock(world, basePos, 1, 3, 2, stone);
		addBlock(world, basePos, 1, 3, 3, stone);
		addBlock(world, basePos, 1, 3, 4, stone);
		addBlock(world, basePos, 1, 3, 5, stone);
		addBlock(world, basePos, 1, 3, 6, stone);
		addBlock(world, basePos, 1, 3, 7, stone);
		addBlock(world, basePos, 2, 3, 1, stone);
		addBlock(world, basePos, 2, 3, 2, stone);
		addBlock(world, basePos, 2, 3, 3, stone);
		addBlock(world, basePos, 2, 3, 4, stone);
		addBlock(world, basePos, 2, 3, 5, stone);
		addBlock(world, basePos, 2, 3, 6, stone);
		addBlock(world, basePos, 2, 3, 7, stone);
		addBlock(world, basePos, 3, 3, 0, stone);
		addBlock(world, basePos, 3, 3, 1, stone);
		addBlock(world, basePos, 3, 3, 2, stone);
		addBlock(world, basePos, 3, 3, 3, stone);
		addBlock(world, basePos, 3, 3, 4, stone);
		addBlock(world, basePos, 3, 3, 5, stone);
		addBlock(world, basePos, 3, 3, 6, stone);
		addBlock(world, basePos, 3, 3, 7, stone);
		addBlock(world, basePos, 3, 3, 8, stone);
		addBlock(world, basePos, 4, 3, 0, stone);
		addBlock(world, basePos, 4, 3, 1, stone);
		addBlock(world, basePos, 4, 3, 2, stone);
		addBlock(world, basePos, 4, 3, 3, stone);
		addBlock(world, basePos, 4, 3, 4, stone);
		addBlock(world, basePos, 4, 3, 5, stone);
		addBlock(world, basePos, 4, 3, 6, stone);
		addBlock(world, basePos, 4, 3, 7, stone);
		addBlock(world, basePos, 4, 3, 8, stone);
		addBlock(world, basePos, 5, 3, 0, stone);
		addBlock(world, basePos, 5, 3, 1, stone);
		addBlock(world, basePos, 5, 3, 2, stone);
		addBlock(world, basePos, 5, 3, 3, stone);
		addBlock(world, basePos, 5, 3, 4, stone);
		addBlock(world, basePos, 5, 3, 5, stone);
		addBlock(world, basePos, 5, 3, 6, stone);
		addBlock(world, basePos, 5, 3, 7, stone);
		addBlock(world, basePos, 5, 3, 8, stone);
		addBlock(world, basePos, 6, 3, 1, stone);
		addBlock(world, basePos, 6, 3, 2, stone);
		addBlock(world, basePos, 6, 3, 3, stone);
		addBlock(world, basePos, 6, 3, 4, stone);
		addBlock(world, basePos, 6, 3, 5, stone);
		addBlock(world, basePos, 6, 3, 6, stone);
		addBlock(world, basePos, 6, 3, 7, stone);
		addBlock(world, basePos, 7, 3, 1, stone);
		addBlock(world, basePos, 7, 3, 2, stone);
		addBlock(world, basePos, 7, 3, 3, stone);
		addBlock(world, basePos, 7, 3, 4, stone);
		addBlock(world, basePos, 7, 3, 5, stone);
		addBlock(world, basePos, 7, 3, 6, stone);
		addBlock(world, basePos, 7, 3, 7, stone);
		addBlock(world, basePos, 8, 3, 3, stone);
		addBlock(world, basePos, 8, 3, 4, stone);
		addBlock(world, basePos, 8, 3, 5, stone);
		addBlock(world, basePos, 0, 4, 2, stone);
		addBlock(world, basePos, 0, 4, 3, stone);
		addBlock(world, basePos, 0, 4, 4, water);
		addBlock(world, basePos, 0, 4, 5, stone);
		addBlock(world, basePos, 0, 4, 6, stone);
		addBlock(world, basePos, 1, 4, 1, stone);
		addBlock(world, basePos, 1, 4, 2, stone);
		addBlock(world, basePos, 1, 4, 3, stone);
		addBlock(world, basePos, 1, 4, 4, stone);
		addBlock(world, basePos, 1, 4, 5, stone);
		addBlock(world, basePos, 1, 4, 6, stone);
		addBlock(world, basePos, 1, 4, 7, stone);
		addBlock(world, basePos, 2, 4, 0, stone);
		addBlock(world, basePos, 2, 4, 1, stone);
		addBlock(world, basePos, 2, 4, 2, stone);
		addBlock(world, basePos, 2, 4, 3, stone);
		addBlock(world, basePos, 2, 4, 4, stone);
		addBlock(world, basePos, 2, 4, 5, stone);
		addBlock(world, basePos, 2, 4, 6, stone);
		addBlock(world, basePos, 2, 4, 7, stone);
		addBlock(world, basePos, 2, 4, 8, stone);
		addBlock(world, basePos, 3, 4, 0, stone);
		addBlock(world, basePos, 3, 4, 1, stone);
		addBlock(world, basePos, 3, 4, 2, stone);
		addBlock(world, basePos, 3, 4, 3, stone);
		addBlock(world, basePos, 3, 4, 4, stone);
		addBlock(world, basePos, 3, 4, 5, stone);
		addBlock(world, basePos, 3, 4, 6, stone);
		addBlock(world, basePos, 3, 4, 7, stone);
		addBlock(world, basePos, 3, 4, 8, stone);
		addBlock(world, basePos, 4, 4, 0, water);
		addBlock(world, basePos, 4, 4, 1, stone);
		addBlock(world, basePos, 4, 4, 2, stone);
		addBlock(world, basePos, 4, 4, 3, stone);
		addBlock(world, basePos, 4, 4, 4, stone);
		addBlock(world, basePos, 4, 4, 5, stone);
		addBlock(world, basePos, 4, 4, 6, stone);
		addBlock(world, basePos, 4, 4, 7, stone);
		addBlock(world, basePos, 4, 4, 8, water);
		addBlock(world, basePos, 5, 4, 0, stone);
		addBlock(world, basePos, 5, 4, 1, stone);
		addBlock(world, basePos, 5, 4, 2, stone);
		addBlock(world, basePos, 5, 4, 3, stone);
		addBlock(world, basePos, 5, 4, 4, stone);
		addBlock(world, basePos, 5, 4, 5, stone);
		addBlock(world, basePos, 5, 4, 6, stone);
		addBlock(world, basePos, 5, 4, 7, stone);
		addBlock(world, basePos, 5, 4, 8, stone);
		addBlock(world, basePos, 6, 4, 0, stone);
		addBlock(world, basePos, 6, 4, 1, stone);
		addBlock(world, basePos, 6, 4, 2, stone);
		addBlock(world, basePos, 6, 4, 3, stone);
		addBlock(world, basePos, 6, 4, 4, stone);
		addBlock(world, basePos, 6, 4, 5, stone);
		addBlock(world, basePos, 6, 4, 6, stone);
		addBlock(world, basePos, 6, 4, 7, stone);
		addBlock(world, basePos, 6, 4, 8, stone);
		addBlock(world, basePos, 7, 4, 1, stone);
		addBlock(world, basePos, 7, 4, 2, stone);
		addBlock(world, basePos, 7, 4, 3, stone);
		addBlock(world, basePos, 7, 4, 4, stone);
		addBlock(world, basePos, 7, 4, 5, stone);
		addBlock(world, basePos, 7, 4, 6, stone);
		addBlock(world, basePos, 7, 4, 7, stone);
		addBlock(world, basePos, 8, 4, 2, stone);
		addBlock(world, basePos, 8, 4, 3, stone);
		addBlock(world, basePos, 8, 4, 4, water);
		addBlock(world, basePos, 8, 4, 5, stone);
		addBlock(world, basePos, 8, 4, 6, stone);
		addBlock(world, basePos, 0, 5, 2, stone);
		addBlock(world, basePos, 0, 5, 3, stone);
		addBlock(world, basePos, 0, 5, 4, stone);
		addBlock(world, basePos, 0, 5, 5, stone);
		addBlock(world, basePos, 0, 5, 6, stone);
		addBlock(world, basePos, 1, 5, 1, stone);
		addBlock(world, basePos, 1, 5, 7, stone);
		addBlock(world, basePos, 2, 5, 0, stone);
		addBlock(world, basePos, 2, 5, 8, stone);
		addBlock(world, basePos, 3, 5, 0, stone);
		addBlock(world, basePos, 3, 5, 8, stone);
		addBlock(world, basePos, 4, 5, 0, stone);
		addBlock(world, basePos, 4, 5, 8, stone);
		addBlock(world, basePos, 5, 5, 0, stone);
		addBlock(world, basePos, 5, 5, 8, stone);
		addBlock(world, basePos, 6, 5, 0, stone);
		addBlock(world, basePos, 6, 5, 8, stone);
		addBlock(world, basePos, 7, 5, 1, stone);
		addBlock(world, basePos, 7, 5, 7, stone);
		addBlock(world, basePos, 8, 5, 2, stone);
		addBlock(world, basePos, 8, 5, 3, stone);
		addBlock(world, basePos, 8, 5, 4, stone);
		addBlock(world, basePos, 8, 5, 5, stone);
		addBlock(world, basePos, 8, 5, 6, stone);
		addBlock(world, basePos, 0, 6, 3, stone);
		addBlock(world, basePos, 0, 6, 5, stone);
		addBlock(world, basePos, 3, 6, 0, stone);
		addBlock(world, basePos, 3, 6, 8, stone);
		addBlock(world, basePos, 5, 6, 0, stone);
		addBlock(world, basePos, 5, 6, 8, stone);
		addBlock(world, basePos, 8, 6, 3, stone);
		addBlock(world, basePos, 8, 6, 5, stone);
	}

	@Override
	protected void spawnEntities(World world, Random rand, BlockPos basePos) {
		EntityHauntedLottoman lottoman = new EntityHauntedLottoman(world);

		lottoman.setLocationAndAngles(basePos.getX() + 4, basePos.getY() + 6, basePos.getZ() + 4, rand.nextFloat() * 360, 0);
		world.spawnEntity(lottoman);
	}
}
