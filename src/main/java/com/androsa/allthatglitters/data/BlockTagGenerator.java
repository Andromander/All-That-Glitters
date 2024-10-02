package com.androsa.allthatglitters.data;

import com.androsa.allthatglitters.AllThatGlittersMod;
import com.androsa.ornamental.data.provider.OrnamentalBlockTagProvider;
import com.androsa.ornamental.registry.ModTags;
import com.google.common.collect.Lists;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;

public class BlockTagGenerator extends OrnamentalBlockTagProvider {

    public static final List<Supplier<? extends Block>> BEACON_BASES = Lists.newArrayList();
    public static final List<Supplier<? extends Block>> BEAMS = Lists.newArrayList();
    public static final List<Supplier<? extends Block>> DOORS = Lists.newArrayList();
    public static final List<Supplier<? extends Block>> FENCES = Lists.newArrayList();
    public static final List<Supplier<? extends Block>> FENCE_GATES = Lists.newArrayList();
    public static final List<Supplier<? extends Block>> POLES = Lists.newArrayList();
    public static final List<Supplier<? extends Block>> SADDLE_DOORS = Lists.newArrayList();
    public static final List<Supplier<? extends Block>> SLABS = Lists.newArrayList();
    public static final List<Supplier<? extends Block>> STAIRS = Lists.newArrayList();
    public static final List<Supplier<? extends Block>> SUPPORTS = Lists.newArrayList();
    public static final List<Supplier<? extends Block>> TRAPDOORS = Lists.newArrayList();
    public static final List<Supplier<? extends Block>> WALLS = Lists.newArrayList();

    public static final List<Supplier<? extends Block>> PICKAXE_TOOL = Lists.newArrayList();
    public static final List<Supplier<? extends Block>> IRON_REQUIRED = Lists.newArrayList();

    public BlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> provider, ExistingFileHelper helper) {
        super(output, provider, AllThatGlittersMod.MODID, helper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        addToTag(BlockTags.BEACON_BASE_BLOCKS, BEACON_BASES);
        addToTag(ModTags.Blocks.BEAMS, BEAMS);
        addToTag(BlockTags.DOORS, DOORS);
        addToTag(BlockTags.FENCE_GATES, FENCE_GATES);
        addToTag(Tags.Blocks.FENCE_GATES, FENCE_GATES);
        addToTag(BlockTags.FENCES, FENCES);
        addToTag(Tags.Blocks.FENCES, FENCES);
        addToTag(ModTags.Blocks.POLES, POLES);
        addToTag(ModTags.Blocks.SADDLE_DOORS, SADDLE_DOORS);
        addToTag(BlockTags.SLABS, SLABS);
        addToTag(BlockTags.STAIRS, STAIRS);
        addToTag(ModTags.Blocks.SUPPORTS, SUPPORTS);
        addToTag(BlockTags.TRAPDOORS, TRAPDOORS);
        addToTag(BlockTags.WALLS, WALLS);

        addToTag(BlockTags.MINEABLE_WITH_PICKAXE, PICKAXE_TOOL);
        addToTag(BlockTags.NEEDS_IRON_TOOL, IRON_REQUIRED);
    }
}
