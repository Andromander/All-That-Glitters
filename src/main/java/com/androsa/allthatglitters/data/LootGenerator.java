package com.androsa.allthatglitters.data;

import com.androsa.allthatglitters.ATGBlocks;
import com.androsa.ornamental.data.provider.OrnamentLootTableProvider;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.ValidationContext;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class LootGenerator extends LootTableProvider {

    public LootGenerator(PackOutput output) {
        super(output, Set.of(), List.of(new SubProviderEntry(BlockLoot::new, LootContextParamSets.BLOCK)));
    }

    @Override
    protected void validate(Map<ResourceLocation, LootTable> map, ValidationContext validationcontext) {
    }

    public static class BlockLoot extends OrnamentLootTableProvider {

        protected BlockLoot() {
            super(Set.of(), FeatureFlags.REGISTRY.allFlags());
        }

        @Override
        protected void generate() {
            dropSelf(ATGBlocks.sugilite_stairs);
            dropSelf(ATGBlocks.hematite_stairs);
            dropSelf(ATGBlocks.cinnabar_stairs);
            dropSelf(ATGBlocks.labradorite_stairs);
            dropSelf(ATGBlocks.moonstone_stairs);
            dropSelf(ATGBlocks.red_opal_stairs);
            dropSelf(ATGBlocks.blue_opal_stairs);
            dropSelf(ATGBlocks.green_opal_stairs);
            dropSelf(ATGBlocks.white_opal_stairs);
            dropSelf(ATGBlocks.pyrite_stairs);
            dropSelf(ATGBlocks.tektite_stairs);
            dropSelf(ATGBlocks.goldstone_stairs);
            dropSelf(ATGBlocks.aura_stairs);
            dropSelf(ATGBlocks.bismuth_stairs);
            dropSelf(ATGBlocks.opalite_stairs);
            dropSelf(ATGBlocks.stibnite_stairs);
            dropSelf(ATGBlocks.proustite_stairs);
            dropSelf(ATGBlocks.euclase_stairs);
            dropSelf(ATGBlocks.albite_stairs);
            dropSelf(ATGBlocks.carnelian_stairs);
            dropSelf(ATGBlocks.benitoite_stairs);
            dropSelf(ATGBlocks.diopside_stairs);
            dropSelf(ATGBlocks.goshenite_stairs);
            dropSelf(ATGBlocks.celestine_stairs);

            dropSlab(ATGBlocks.sugilite_slab);
            dropSlab(ATGBlocks.hematite_slab);
            dropSlab(ATGBlocks.cinnabar_slab);
            dropSlab(ATGBlocks.labradorite_slab);
            dropSlab(ATGBlocks.moonstone_slab);
            dropSlab(ATGBlocks.red_opal_slab);
            dropSlab(ATGBlocks.blue_opal_slab);
            dropSlab(ATGBlocks.green_opal_slab);
            dropSlab(ATGBlocks.white_opal_slab);
            dropSlab(ATGBlocks.pyrite_slab);
            dropSlab(ATGBlocks.tektite_slab);
            dropSlab(ATGBlocks.goldstone_slab);
            dropSlab(ATGBlocks.aura_slab);
            dropSlab(ATGBlocks.bismuth_slab);
            dropSlab(ATGBlocks.opalite_slab);
            dropSlab(ATGBlocks.stibnite_slab);
            dropSlab(ATGBlocks.proustite_slab);
            dropSlab(ATGBlocks.euclase_slab);
            dropSlab(ATGBlocks.albite_slab);
            dropSlab(ATGBlocks.carnelian_slab);
            dropSlab(ATGBlocks.benitoite_slab);
            dropSlab(ATGBlocks.diopside_slab);
            dropSlab(ATGBlocks.goshenite_slab);
            dropSlab(ATGBlocks.celestine_slab);

            dropSelf(ATGBlocks.sugilite_fence);
            dropSelf(ATGBlocks.hematite_fence);
            dropSelf(ATGBlocks.cinnabar_fence);
            dropSelf(ATGBlocks.labradorite_fence);
            dropSelf(ATGBlocks.moonstone_fence);
            dropSelf(ATGBlocks.red_opal_fence);
            dropSelf(ATGBlocks.blue_opal_fence);
            dropSelf(ATGBlocks.green_opal_fence);
            dropSelf(ATGBlocks.white_opal_fence);
            dropSelf(ATGBlocks.pyrite_fence);
            dropSelf(ATGBlocks.tektite_fence);
            dropSelf(ATGBlocks.goldstone_fence);
            dropSelf(ATGBlocks.aura_fence);
            dropSelf(ATGBlocks.bismuth_fence);
            dropSelf(ATGBlocks.opalite_fence);
            dropSelf(ATGBlocks.stibnite_fence);
            dropSelf(ATGBlocks.proustite_fence);
            dropSelf(ATGBlocks.euclase_fence);
            dropSelf(ATGBlocks.albite_fence);
            dropSelf(ATGBlocks.carnelian_fence);
            dropSelf(ATGBlocks.benitoite_fence);
            dropSelf(ATGBlocks.diopside_fence);
            dropSelf(ATGBlocks.goshenite_fence);
            dropSelf(ATGBlocks.celestine_fence);

            dropSelf(ATGBlocks.sugilite_trapdoor);
            dropSelf(ATGBlocks.hematite_trapdoor);
            dropSelf(ATGBlocks.cinnabar_trapdoor);
            dropSelf(ATGBlocks.labradorite_trapdoor);
            dropSelf(ATGBlocks.moonstone_trapdoor);
            dropSelf(ATGBlocks.red_opal_trapdoor);
            dropSelf(ATGBlocks.blue_opal_trapdoor);
            dropSelf(ATGBlocks.green_opal_trapdoor);
            dropSelf(ATGBlocks.white_opal_trapdoor);
            dropSelf(ATGBlocks.pyrite_trapdoor);
            dropSelf(ATGBlocks.tektite_trapdoor);
            dropSelf(ATGBlocks.goldstone_trapdoor);
            dropSelf(ATGBlocks.aura_trapdoor);
            dropSelf(ATGBlocks.bismuth_trapdoor);
            dropSelf(ATGBlocks.opalite_trapdoor);
            dropSelf(ATGBlocks.stibnite_trapdoor);
            dropSelf(ATGBlocks.proustite_trapdoor);
            dropSelf(ATGBlocks.euclase_trapdoor);
            dropSelf(ATGBlocks.albite_trapdoor);
            dropSelf(ATGBlocks.carnelian_trapdoor);
            dropSelf(ATGBlocks.benitoite_trapdoor);
            dropSelf(ATGBlocks.diopside_trapdoor);
            dropSelf(ATGBlocks.goshenite_trapdoor);
            dropSelf(ATGBlocks.celestine_trapdoor);

            dropSelf(ATGBlocks.sugilite_fence_gate);
            dropSelf(ATGBlocks.hematite_fence_gate);
            dropSelf(ATGBlocks.cinnabar_fence_gate);
            dropSelf(ATGBlocks.labradorite_fence_gate);
            dropSelf(ATGBlocks.moonstone_fence_gate);
            dropSelf(ATGBlocks.red_opal_fence_gate);
            dropSelf(ATGBlocks.blue_opal_fence_gate);
            dropSelf(ATGBlocks.green_opal_fence_gate);
            dropSelf(ATGBlocks.white_opal_fence_gate);
            dropSelf(ATGBlocks.pyrite_fence_gate);
            dropSelf(ATGBlocks.tektite_fence_gate);
            dropSelf(ATGBlocks.goldstone_fence_gate);
            dropSelf(ATGBlocks.aura_fence_gate);
            dropSelf(ATGBlocks.bismuth_fence_gate);
            dropSelf(ATGBlocks.opalite_fence_gate);
            dropSelf(ATGBlocks.stibnite_fence_gate);
            dropSelf(ATGBlocks.proustite_fence_gate);
            dropSelf(ATGBlocks.euclase_fence_gate);
            dropSelf(ATGBlocks.albite_fence_gate);
            dropSelf(ATGBlocks.carnelian_fence_gate);
            dropSelf(ATGBlocks.benitoite_fence_gate);
            dropSelf(ATGBlocks.diopside_fence_gate);
            dropSelf(ATGBlocks.goshenite_fence_gate);
            dropSelf(ATGBlocks.celestine_fence_gate);

            dropDoor(ATGBlocks.sugilite_door);
            dropDoor(ATGBlocks.hematite_door);
            dropDoor(ATGBlocks.cinnabar_door);
            dropDoor(ATGBlocks.labradorite_door);
            dropDoor(ATGBlocks.moonstone_door);
            dropDoor(ATGBlocks.red_opal_door);
            dropDoor(ATGBlocks.blue_opal_door);
            dropDoor(ATGBlocks.green_opal_door);
            dropDoor(ATGBlocks.white_opal_door);
            dropDoor(ATGBlocks.pyrite_door);
            dropDoor(ATGBlocks.tektite_door);
            dropDoor(ATGBlocks.goldstone_door);
            dropDoor(ATGBlocks.aura_door);
            dropDoor(ATGBlocks.bismuth_door);
            dropDoor(ATGBlocks.opalite_door);
            dropDoor(ATGBlocks.stibnite_door);
            dropDoor(ATGBlocks.proustite_door);
            dropDoor(ATGBlocks.euclase_door);
            dropDoor(ATGBlocks.albite_door);
            dropDoor(ATGBlocks.carnelian_door);
            dropDoor(ATGBlocks.benitoite_door);
            dropDoor(ATGBlocks.diopside_door);
            dropDoor(ATGBlocks.goshenite_door);
            dropDoor(ATGBlocks.celestine_door);

            dropSelf(ATGBlocks.sugilite_pole);
            dropSelf(ATGBlocks.hematite_pole);
            dropSelf(ATGBlocks.cinnabar_pole);
            dropSelf(ATGBlocks.labradorite_pole);
            dropSelf(ATGBlocks.moonstone_pole);
            dropSelf(ATGBlocks.red_opal_pole);
            dropSelf(ATGBlocks.blue_opal_pole);
            dropSelf(ATGBlocks.green_opal_pole);
            dropSelf(ATGBlocks.white_opal_pole);
            dropSelf(ATGBlocks.pyrite_pole);
            dropSelf(ATGBlocks.tektite_pole);
            dropSelf(ATGBlocks.goldstone_pole);
            dropSelf(ATGBlocks.aura_pole);
            dropSelf(ATGBlocks.bismuth_pole);
            dropSelf(ATGBlocks.opalite_pole);
            dropSelf(ATGBlocks.stibnite_pole);
            dropSelf(ATGBlocks.proustite_pole);
            dropSelf(ATGBlocks.euclase_pole);
            dropSelf(ATGBlocks.albite_pole);
            dropSelf(ATGBlocks.carnelian_pole);
            dropSelf(ATGBlocks.benitoite_pole);
            dropSelf(ATGBlocks.diopside_pole);
            dropSelf(ATGBlocks.goshenite_pole);
            dropSelf(ATGBlocks.celestine_pole);

            dropSelf(ATGBlocks.sugilite_beam);
            dropSelf(ATGBlocks.hematite_beam);
            dropSelf(ATGBlocks.cinnabar_beam);
            dropSelf(ATGBlocks.labradorite_beam);
            dropSelf(ATGBlocks.moonstone_beam);
            dropSelf(ATGBlocks.red_opal_beam);
            dropSelf(ATGBlocks.blue_opal_beam);
            dropSelf(ATGBlocks.green_opal_beam);
            dropSelf(ATGBlocks.white_opal_beam);
            dropSelf(ATGBlocks.pyrite_beam);
            dropSelf(ATGBlocks.tektite_beam);
            dropSelf(ATGBlocks.goldstone_beam);
            dropSelf(ATGBlocks.aura_beam);
            dropSelf(ATGBlocks.bismuth_beam);
            dropSelf(ATGBlocks.opalite_beam);
            dropSelf(ATGBlocks.stibnite_beam);
            dropSelf(ATGBlocks.proustite_beam);
            dropSelf(ATGBlocks.euclase_beam);
            dropSelf(ATGBlocks.albite_beam);
            dropSelf(ATGBlocks.carnelian_beam);
            dropSelf(ATGBlocks.benitoite_beam);
            dropSelf(ATGBlocks.diopside_beam);
            dropSelf(ATGBlocks.goshenite_beam);
            dropSelf(ATGBlocks.celestine_beam);

            dropSelf(ATGBlocks.sugilite_wall);
            dropSelf(ATGBlocks.hematite_wall);
            dropSelf(ATGBlocks.cinnabar_wall);
            dropSelf(ATGBlocks.labradorite_wall);
            dropSelf(ATGBlocks.moonstone_wall);
            dropSelf(ATGBlocks.red_opal_wall);
            dropSelf(ATGBlocks.blue_opal_wall);
            dropSelf(ATGBlocks.green_opal_wall);
            dropSelf(ATGBlocks.white_opal_wall);
            dropSelf(ATGBlocks.pyrite_wall);
            dropSelf(ATGBlocks.tektite_wall);
            dropSelf(ATGBlocks.goldstone_wall);
            dropSelf(ATGBlocks.aura_wall);
            dropSelf(ATGBlocks.bismuth_wall);
            dropSelf(ATGBlocks.opalite_wall);
            dropSelf(ATGBlocks.stibnite_wall);
            dropSelf(ATGBlocks.proustite_wall);
            dropSelf(ATGBlocks.euclase_wall);
            dropSelf(ATGBlocks.albite_wall);
            dropSelf(ATGBlocks.carnelian_wall);
            dropSelf(ATGBlocks.benitoite_wall);
            dropSelf(ATGBlocks.diopside_wall);
            dropSelf(ATGBlocks.goshenite_wall);
            dropSelf(ATGBlocks.celestine_wall);

            dropSelf(ATGBlocks.sugilite_saddle_door);
            dropSelf(ATGBlocks.hematite_saddle_door);
            dropSelf(ATGBlocks.cinnabar_saddle_door);
            dropSelf(ATGBlocks.labradorite_saddle_door);
            dropSelf(ATGBlocks.moonstone_saddle_door);
            dropSelf(ATGBlocks.red_opal_saddle_door);
            dropSelf(ATGBlocks.blue_opal_saddle_door);
            dropSelf(ATGBlocks.green_opal_saddle_door);
            dropSelf(ATGBlocks.white_opal_saddle_door);
            dropSelf(ATGBlocks.pyrite_saddle_door);
            dropSelf(ATGBlocks.tektite_saddle_door);
            dropSelf(ATGBlocks.goldstone_saddle_door);
            dropSelf(ATGBlocks.aura_saddle_door);
            dropSelf(ATGBlocks.bismuth_saddle_door);
            dropSelf(ATGBlocks.opalite_saddle_door);
            dropSelf(ATGBlocks.stibnite_saddle_door);
            dropSelf(ATGBlocks.proustite_saddle_door);
            dropSelf(ATGBlocks.euclase_saddle_door);
            dropSelf(ATGBlocks.albite_saddle_door);
            dropSelf(ATGBlocks.carnelian_saddle_door);
            dropSelf(ATGBlocks.benitoite_saddle_door);
            dropSelf(ATGBlocks.diopside_saddle_door);
            dropSelf(ATGBlocks.goshenite_saddle_door);
            dropSelf(ATGBlocks.celestine_saddle_door);
        }

        @Override
        protected Iterable<Block> getKnownBlocks() {
            return ATGBlocks.BLOCKS.getEntries().stream().map(Supplier::get).collect(Collectors.toList());
        }
    }
}
