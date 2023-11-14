
package net.mcreator.randomxd.block;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class SocketBlock extends Block {
	public static final DirectionProperty FACING = DirectionalBlock.FACING;

	public SocketBlock() {
		super(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.GLASS).strength(1f, 10f).noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
		this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}

	@Override
	public VoxelShape getVisualShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return Shapes.empty();
	}

	@Override
	public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return switch (state.getValue(FACING)) {
			default -> Shapes.or(box(3, 3, 3, 13, 13, 13), box(3, 3, 3, 13, 13, 13));
			case NORTH -> Shapes.or(box(3, 3, 3, 13, 13, 13), box(3, 3, 3, 13, 13, 13));
			case EAST -> Shapes.or(box(3, 3, 3, 13, 13, 13), box(3, 3, 3, 13, 13, 13));
			case WEST -> Shapes.or(box(3, 3, 3, 13, 13, 13), box(3, 3, 3, 13, 13, 13));
			case UP -> Shapes.or(box(3, 3, 3, 13, 13, 13), box(3, 3, 3, 13, 13, 13));
			case DOWN -> Shapes.or(box(3, 3, 3, 13, 13, 13), box(3, 3, 3, 13, 13, 13));
		};
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		builder.add(FACING);
	}

	@Override
	public BlockState getStateForPlacement(BlockPlaceContext context) {
		return this.defaultBlockState().setValue(FACING, context.getClickedFace());
	}

	public BlockState rotate(BlockState state, Rotation rot) {
		return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
	}

	public BlockState mirror(BlockState state, Mirror mirrorIn) {
		return state.rotate(mirrorIn.getRotation(state.getValue(FACING)));
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootParams.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(this, 1));
	}
}