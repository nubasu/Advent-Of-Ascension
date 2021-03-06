package net.tslat.aoa3.structure.deeplands;

import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.tslat.aoa3.common.registration.BlockRegister;
import net.tslat.aoa3.structure.AoAStructure;

import java.util.Random;

public class FossilisedRibs2 extends AoAStructure { //StructureSize: 13x6x10
	private static final IBlockState skeletalBlock = BlockRegister.skeletalBlock.getDefaultState();

	public FossilisedRibs2() {
		super("FossilisedRibs2");
	}

	@Override
	protected void build(World world, Random rand, BlockPos basePos) {
		addBlock(world, basePos, 0, 0, 1, skeletalBlock);
		addBlock(world, basePos, 0, 0, 2, skeletalBlock);
		addBlock(world, basePos, 0, 0, 3, skeletalBlock);
		addBlock(world, basePos, 0, 0, 6, skeletalBlock);
		addBlock(world, basePos, 0, 0, 7, skeletalBlock);
		addBlock(world, basePos, 0, 0, 8, skeletalBlock);
		addBlock(world, basePos, 3, 0, 1, skeletalBlock);
		addBlock(world, basePos, 3, 0, 2, skeletalBlock);
		addBlock(world, basePos, 3, 0, 3, skeletalBlock);
		addBlock(world, basePos, 3, 0, 6, skeletalBlock);
		addBlock(world, basePos, 3, 0, 7, skeletalBlock);
		addBlock(world, basePos, 3, 0, 8, skeletalBlock);
		addBlock(world, basePos, 6, 0, 1, skeletalBlock);
		addBlock(world, basePos, 6, 0, 2, skeletalBlock);
		addBlock(world, basePos, 6, 0, 3, skeletalBlock);
		addBlock(world, basePos, 6, 0, 6, skeletalBlock);
		addBlock(world, basePos, 6, 0, 7, skeletalBlock);
		addBlock(world, basePos, 6, 0, 8, skeletalBlock);
		addBlock(world, basePos, 9, 0, 1, skeletalBlock);
		addBlock(world, basePos, 9, 0, 2, skeletalBlock);
		addBlock(world, basePos, 9, 0, 3, skeletalBlock);
		addBlock(world, basePos, 9, 0, 6, skeletalBlock);
		addBlock(world, basePos, 9, 0, 7, skeletalBlock);
		addBlock(world, basePos, 9, 0, 8, skeletalBlock);
		addBlock(world, basePos, 12, 0, 1, skeletalBlock);
		addBlock(world, basePos, 12, 0, 2, skeletalBlock);
		addBlock(world, basePos, 12, 0, 3, skeletalBlock);
		addBlock(world, basePos, 12, 0, 6, skeletalBlock);
		addBlock(world, basePos, 12, 0, 7, skeletalBlock);
		addBlock(world, basePos, 12, 0, 8, skeletalBlock);
		addBlock(world, basePos, 0, 1, 0, skeletalBlock);
		addBlock(world, basePos, 0, 1, 1, skeletalBlock);
		addBlock(world, basePos, 0, 1, 8, skeletalBlock);
		addBlock(world, basePos, 0, 1, 9, skeletalBlock);
		addBlock(world, basePos, 3, 1, 0, skeletalBlock);
		addBlock(world, basePos, 3, 1, 1, skeletalBlock);
		addBlock(world, basePos, 3, 1, 8, skeletalBlock);
		addBlock(world, basePos, 3, 1, 9, skeletalBlock);
		addBlock(world, basePos, 6, 1, 0, skeletalBlock);
		addBlock(world, basePos, 6, 1, 1, skeletalBlock);
		addBlock(world, basePos, 6, 1, 8, skeletalBlock);
		addBlock(world, basePos, 6, 1, 9, skeletalBlock);
		addBlock(world, basePos, 9, 1, 0, skeletalBlock);
		addBlock(world, basePos, 9, 1, 1, skeletalBlock);
		addBlock(world, basePos, 9, 1, 8, skeletalBlock);
		addBlock(world, basePos, 9, 1, 9, skeletalBlock);
		addBlock(world, basePos, 12, 1, 0, skeletalBlock);
		addBlock(world, basePos, 12, 1, 1, skeletalBlock);
		addBlock(world, basePos, 12, 1, 8, skeletalBlock);
		addBlock(world, basePos, 12, 1, 9, skeletalBlock);
		addBlock(world, basePos, 0, 2, 0, skeletalBlock);
		addBlock(world, basePos, 0, 2, 9, skeletalBlock);
		addBlock(world, basePos, 3, 2, 0, skeletalBlock);
		addBlock(world, basePos, 3, 2, 9, skeletalBlock);
		addBlock(world, basePos, 6, 2, 0, skeletalBlock);
		addBlock(world, basePos, 6, 2, 9, skeletalBlock);
		addBlock(world, basePos, 9, 2, 0, skeletalBlock);
		addBlock(world, basePos, 9, 2, 9, skeletalBlock);
		addBlock(world, basePos, 12, 2, 0, skeletalBlock);
		addBlock(world, basePos, 12, 2, 9, skeletalBlock);
		addBlock(world, basePos, 0, 3, 0, skeletalBlock);
		addBlock(world, basePos, 0, 3, 9, skeletalBlock);
		addBlock(world, basePos, 3, 3, 0, skeletalBlock);
		addBlock(world, basePos, 3, 3, 9, skeletalBlock);
		addBlock(world, basePos, 6, 3, 0, skeletalBlock);
		addBlock(world, basePos, 6, 3, 9, skeletalBlock);
		addBlock(world, basePos, 9, 3, 0, skeletalBlock);
		addBlock(world, basePos, 9, 3, 9, skeletalBlock);
		addBlock(world, basePos, 12, 3, 0, skeletalBlock);
		addBlock(world, basePos, 12, 3, 9, skeletalBlock);
		addBlock(world, basePos, 0, 4, 0, skeletalBlock);
		addBlock(world, basePos, 0, 4, 1, skeletalBlock);
		addBlock(world, basePos, 0, 4, 8, skeletalBlock);
		addBlock(world, basePos, 0, 4, 9, skeletalBlock);
		addBlock(world, basePos, 3, 4, 0, skeletalBlock);
		addBlock(world, basePos, 3, 4, 1, skeletalBlock);
		addBlock(world, basePos, 3, 4, 8, skeletalBlock);
		addBlock(world, basePos, 3, 4, 9, skeletalBlock);
		addBlock(world, basePos, 6, 4, 0, skeletalBlock);
		addBlock(world, basePos, 6, 4, 1, skeletalBlock);
		addBlock(world, basePos, 6, 4, 8, skeletalBlock);
		addBlock(world, basePos, 6, 4, 9, skeletalBlock);
		addBlock(world, basePos, 9, 4, 0, skeletalBlock);
		addBlock(world, basePos, 9, 4, 1, skeletalBlock);
		addBlock(world, basePos, 9, 4, 8, skeletalBlock);
		addBlock(world, basePos, 9, 4, 9, skeletalBlock);
		addBlock(world, basePos, 12, 4, 0, skeletalBlock);
		addBlock(world, basePos, 12, 4, 1, skeletalBlock);
		addBlock(world, basePos, 12, 4, 8, skeletalBlock);
		addBlock(world, basePos, 12, 4, 9, skeletalBlock);
		addBlock(world, basePos, 0, 5, 1, skeletalBlock);
		addBlock(world, basePos, 0, 5, 2, skeletalBlock);
		addBlock(world, basePos, 0, 5, 7, skeletalBlock);
		addBlock(world, basePos, 0, 5, 8, skeletalBlock);
		addBlock(world, basePos, 3, 5, 1, skeletalBlock);
		addBlock(world, basePos, 3, 5, 2, skeletalBlock);
		addBlock(world, basePos, 3, 5, 7, skeletalBlock);
		addBlock(world, basePos, 3, 5, 8, skeletalBlock);
		addBlock(world, basePos, 6, 5, 1, skeletalBlock);
		addBlock(world, basePos, 6, 5, 2, skeletalBlock);
		addBlock(world, basePos, 6, 5, 7, skeletalBlock);
		addBlock(world, basePos, 6, 5, 8, skeletalBlock);
		addBlock(world, basePos, 9, 5, 1, skeletalBlock);
		addBlock(world, basePos, 9, 5, 2, skeletalBlock);
		addBlock(world, basePos, 9, 5, 7, skeletalBlock);
		addBlock(world, basePos, 9, 5, 8, skeletalBlock);
		addBlock(world, basePos, 12, 5, 1, skeletalBlock);
		addBlock(world, basePos, 12, 5, 2, skeletalBlock);
		addBlock(world, basePos, 12, 5, 7, skeletalBlock);
		addBlock(world, basePos, 12, 5, 8, skeletalBlock);
	}
}
