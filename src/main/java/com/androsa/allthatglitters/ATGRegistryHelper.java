package com.androsa.allthatglitters;

import com.androsa.allthatglitters.data.BlockTagGenerator;
import com.androsa.allthatglitters.data.ItemTagGenerator;
import com.androsa.ornamental.blocks.*;
import com.androsa.ornamental.builder.OrnamentBuilder;
import com.androsa.ornamental.registry.helper.MasterRegistryHelper;
import com.google.common.collect.Lists;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ATGRegistryHelper extends MasterRegistryHelper {

    public ATGRegistryHelper(DeferredRegister<Block> blockreg, DeferredRegister<Item> itemreg) {
        super(blockreg, itemreg);
    }

    public Supplier<OrnamentStair> stairs(OrnamentBuilder builder) {
        return super.stairs(builder, Lists.newArrayList(), Lists.newArrayList(), OrnamentStair::new);
    }

    public Supplier<OrnamentSlab> slab(OrnamentBuilder builder) {
        return super.slab(builder, Lists.newArrayList(), Lists.newArrayList(), OrnamentSlab::new);
    }

    public Supplier<OrnamentFence> fence(OrnamentBuilder builder) {
        return super.fence(builder, Lists.newArrayList(), Lists.newArrayList(), OrnamentFence::new);
    }

    public Supplier<OrnamentTrapDoor> trapdoor(OrnamentBuilder builder) {
        return super.trapdoor(builder, Lists.newArrayList(), Lists.newArrayList(), OrnamentTrapDoor::new);
    }

    public Supplier<OrnamentFenceGate> fencegate(OrnamentBuilder builder) {
        return super.fencegate(builder, Lists.newArrayList(), Lists.newArrayList(), OrnamentFenceGate::new);
    }

    public Supplier<OrnamentDoor> door(OrnamentBuilder builder) {
        return super.door(builder, Lists.newArrayList(), Lists.newArrayList(), OrnamentDoor::new);
    }

    public Supplier<OrnamentPole> pole(OrnamentBuilder builder) {
        return super.pole(builder, Lists.newArrayList(), Lists.newArrayList(), OrnamentPole::new);
    }

    public Supplier<OrnamentBeam> beam(OrnamentBuilder builder) {
        return super.beam(builder, Lists.newArrayList(), Lists.newArrayList(), OrnamentBeam::new);
    }

    public Supplier<OrnamentWall> wall(OrnamentBuilder builder) {
        return super.wall(builder, Lists.newArrayList(), Lists.newArrayList(), OrnamentWall::new);
    }

    public Supplier<OrnamentSaddleDoor> saddledoor(OrnamentBuilder builder) {
        return super.saddledoor(builder, Lists.newArrayList(), Lists.newArrayList(), OrnamentSaddleDoor::new);
    }

    public Supplier<OrnamentSupport> support(OrnamentBuilder builder) {
        return super.support(builder, Lists.newArrayList(), Lists.newArrayList(), OrnamentSupport::new);
    }

    @Override
    protected TagHelper stairTags() {
        return new TagHelper(this.array(BlockTagGenerator.STAIRS, BlockTagGenerator.BEACON_BASES), this.array(ItemTagGenerator.STAIRS));
    }

    @Override
    protected TagHelper slabTags() {
        return new TagHelper(this.array(BlockTagGenerator.SLABS), this.array(ItemTagGenerator.SLABS));
    }

    @Override
    protected TagHelper fenceTags() {
        return new TagHelper(this.array(BlockTagGenerator.FENCES), this.array(ItemTagGenerator.FENCES));
    }

    @Override
    protected TagHelper trapdoorTags() {
        return new TagHelper(this.array(BlockTagGenerator.TRAPDOORS), this.array(ItemTagGenerator.TRAPDOORS));
    }

    @Override
    protected TagHelper fencegateTags() {
        return new TagHelper(this.array(BlockTagGenerator.FENCE_GATES), this.array(ItemTagGenerator.FENCE_GATES));
    }

    @Override
    protected TagHelper doorTags() {
        return new TagHelper(this.array(BlockTagGenerator.DOORS), this.array(ItemTagGenerator.DOORS));
    }

    @Override
    protected TagHelper poleTags() {
        return new TagHelper(this.array(BlockTagGenerator.POLES), this.array(ItemTagGenerator.POLES));
    }

    @Override
    protected TagHelper beamTags() {
        return new TagHelper(this.array(BlockTagGenerator.BEAMS), this.array(ItemTagGenerator.BEAMS));
    }

    @Override
    protected TagHelper wallTags() {
        return new TagHelper(this.array(BlockTagGenerator.WALLS), this.array(ItemTagGenerator.WALLS));
    }

    @Override
    protected TagHelper saddledoorTags() {
        return new TagHelper(this.array(BlockTagGenerator.SADDLE_DOORS), this.array(ItemTagGenerator.SADDLE_DOORS));
    }

    @Override
    protected TagHelper supportTags() {
        return null;
    }
}
