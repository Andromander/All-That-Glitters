package com.androsa.allthatglitters.data;

import androsa.gaiadimension.GaiaDimensionMod;
import com.androsa.allthatglitters.ATGBlocks;
import com.androsa.allthatglitters.AllThatGlittersMod;
import com.androsa.ornamental.data.provider.OrnamentalItemModelProvider;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;

import java.util.Optional;
import java.util.function.Supplier;

public class ItemModelGenerator extends OrnamentalItemModelProvider {

    public ItemModelGenerator(PackOutput output, ExistingFileHelper helper) {
        super(output, AllThatGlittersMod.MODID, helper);
    }

    @Override
    protected void registerModels() {
        blockItem(ATGBlocks.sugilite_stairs);
        blockItem(ATGBlocks.hematite_stairs);
        blockItem(ATGBlocks.cinnabar_stairs);
        blockItem(ATGBlocks.labradorite_stairs);
        blockItem(ATGBlocks.moonstone_stairs);
        blockItem(ATGBlocks.red_opal_stairs);
        blockItem(ATGBlocks.blue_opal_stairs);
        blockItem(ATGBlocks.green_opal_stairs);
        blockItem(ATGBlocks.white_opal_stairs);
        blockItem(ATGBlocks.pyrite_stairs);
        blockItem(ATGBlocks.tektite_stairs);
        blockItem(ATGBlocks.goldstone_stairs);
        blockItem(ATGBlocks.aura_stairs);
        blockItem(ATGBlocks.bismuth_stairs);
        blockItem(ATGBlocks.opalite_stairs);
        blockItem(ATGBlocks.stibnite_stairs);
        blockItem(ATGBlocks.proustite_stairs);
        blockItem(ATGBlocks.euclase_stairs);
        blockItem(ATGBlocks.albite_stairs);
        blockItem(ATGBlocks.carnelian_stairs);
        blockItem(ATGBlocks.benitoite_stairs);
        blockItem(ATGBlocks.diopside_stairs);
        blockItem(ATGBlocks.goshenite_stairs);
        blockItem(ATGBlocks.celestine_stairs);

        blockItem(ATGBlocks.sugilite_slab);
        blockItem(ATGBlocks.hematite_slab);
        blockItem(ATGBlocks.cinnabar_slab);
        blockItem(ATGBlocks.labradorite_slab);
        blockItem(ATGBlocks.moonstone_slab);
        blockItem(ATGBlocks.red_opal_slab);
        blockItem(ATGBlocks.blue_opal_slab);
        blockItem(ATGBlocks.green_opal_slab);
        blockItem(ATGBlocks.white_opal_slab);
        blockItem(ATGBlocks.pyrite_slab);
        blockItem(ATGBlocks.tektite_slab);
        blockItem(ATGBlocks.goldstone_slab);
        blockItem(ATGBlocks.aura_slab);
        blockItem(ATGBlocks.bismuth_slab);
        blockItem(ATGBlocks.opalite_slab);
        blockItem(ATGBlocks.stibnite_slab);
        blockItem(ATGBlocks.proustite_slab);
        blockItem(ATGBlocks.euclase_slab);
        blockItem(ATGBlocks.albite_slab);
        blockItem(ATGBlocks.carnelian_slab);
        blockItem(ATGBlocks.benitoite_slab);
        blockItem(ATGBlocks.diopside_slab);
        blockItem(ATGBlocks.goshenite_slab);
        blockItem(ATGBlocks.celestine_slab);

        blockItemFence(ATGBlocks.sugilite_fence, "sugilite_block");
        blockItemFence(ATGBlocks.hematite_fence, "hematite_block");
        blockItemFence(ATGBlocks.cinnabar_fence, "cinnabar_block");
        blockItemFence(ATGBlocks.labradorite_fence, "labradorite_block");
        blockItemFence(ATGBlocks.moonstone_fence, "moonstone_block");
        blockItemFence(ATGBlocks.red_opal_fence, "red_opal_block");
        blockItemFence(ATGBlocks.blue_opal_fence, "blue_opal_block");
        blockItemFence(ATGBlocks.green_opal_fence, "green_opal_block");
        blockItemFence(ATGBlocks.white_opal_fence, "white_opal_block");
        blockItemFence(ATGBlocks.pyrite_fence, "pyrite_block");
        blockItemFence(ATGBlocks.tektite_fence, "tektite_block");
        blockItemFence(ATGBlocks.goldstone_fence, "goldstone_block");
        blockItemFence(ATGBlocks.aura_fence, "aura_block");
        blockItemFence(ATGBlocks.bismuth_fence, "bismuth_block");
        blockItemFence(ATGBlocks.opalite_fence, "opalite_block");
        blockItemFence(ATGBlocks.stibnite_fence, "stibnite_block");
        blockItemFence(ATGBlocks.proustite_fence, "proustite_block");
        blockItemFence(ATGBlocks.euclase_fence, "euclase_block");
        blockItemFence(ATGBlocks.albite_fence, "albite_block");
        blockItemFence(ATGBlocks.carnelian_fence, "carnelian_block");
        blockItemFence(ATGBlocks.benitoite_fence, "benitoite_block");
        blockItemFence(ATGBlocks.diopside_fence, "diopside_block");
        blockItemFence(ATGBlocks.goshenite_fence, "goshenite_block");
        blockItemFence(ATGBlocks.celestine_fence, "celestine_block");

        blockItemTrapdoor(ATGBlocks.sugilite_trapdoor);
        blockItemTrapdoor(ATGBlocks.hematite_trapdoor);
        blockItemTrapdoor(ATGBlocks.cinnabar_trapdoor);
        blockItemTrapdoor(ATGBlocks.labradorite_trapdoor);
        blockItemTrapdoor(ATGBlocks.moonstone_trapdoor);
        blockItemTrapdoor(ATGBlocks.red_opal_trapdoor);
        blockItemTrapdoor(ATGBlocks.blue_opal_trapdoor);
        blockItemTrapdoor(ATGBlocks.green_opal_trapdoor);
        blockItemTrapdoor(ATGBlocks.white_opal_trapdoor);
        blockItemTrapdoor(ATGBlocks.pyrite_trapdoor);
        blockItemTrapdoor(ATGBlocks.tektite_trapdoor);
        blockItemTrapdoor(ATGBlocks.goldstone_trapdoor);
        blockItemTrapdoor(ATGBlocks.aura_trapdoor);
        blockItemTrapdoor(ATGBlocks.bismuth_trapdoor);
        blockItemTrapdoor(ATGBlocks.opalite_trapdoor);
        blockItemTrapdoor(ATGBlocks.stibnite_trapdoor);
        blockItemTrapdoor(ATGBlocks.proustite_trapdoor);
        blockItemTrapdoor(ATGBlocks.euclase_trapdoor);
        blockItemTrapdoor(ATGBlocks.albite_trapdoor);
        blockItemTrapdoor(ATGBlocks.carnelian_trapdoor);
        blockItemTrapdoor(ATGBlocks.benitoite_trapdoor);
        blockItemTrapdoor(ATGBlocks.diopside_trapdoor);
        blockItemTrapdoor(ATGBlocks.goshenite_trapdoor);
        blockItemTrapdoor(ATGBlocks.celestine_trapdoor);

        blockItem(ATGBlocks.sugilite_fence_gate);
        blockItem(ATGBlocks.hematite_fence_gate);
        blockItem(ATGBlocks.cinnabar_fence_gate);
        blockItem(ATGBlocks.labradorite_fence_gate);
        blockItem(ATGBlocks.moonstone_fence_gate);
        blockItem(ATGBlocks.red_opal_fence_gate);
        blockItem(ATGBlocks.blue_opal_fence_gate);
        blockItem(ATGBlocks.green_opal_fence_gate);
        blockItem(ATGBlocks.white_opal_fence_gate);
        blockItem(ATGBlocks.pyrite_fence_gate);
        blockItem(ATGBlocks.tektite_fence_gate);
        blockItem(ATGBlocks.goldstone_fence_gate);
        blockItem(ATGBlocks.aura_fence_gate);
        blockItem(ATGBlocks.bismuth_fence_gate);
        blockItem(ATGBlocks.opalite_fence_gate);
        blockItem(ATGBlocks.stibnite_fence_gate);
        blockItem(ATGBlocks.proustite_fence_gate);
        blockItem(ATGBlocks.euclase_fence_gate);
        blockItem(ATGBlocks.albite_fence_gate);
        blockItem(ATGBlocks.carnelian_fence_gate);
        blockItem(ATGBlocks.benitoite_fence_gate);
        blockItem(ATGBlocks.diopside_fence_gate);
        blockItem(ATGBlocks.goshenite_fence_gate);
        blockItem(ATGBlocks.celestine_fence_gate);

        blockItemModel(ATGBlocks.sugilite_door, "sugilite_door");
        blockItemModel(ATGBlocks.hematite_door, "hematite_door");
        blockItemModel(ATGBlocks.cinnabar_door, "cinnabar_door");
        blockItemModel(ATGBlocks.labradorite_door, "labradorite_door");
        blockItemModel(ATGBlocks.moonstone_door, "moonstone_door");
        blockItemModel(ATGBlocks.red_opal_door, "red_opal_door");
        blockItemModel(ATGBlocks.blue_opal_door, "blue_opal_door");
        blockItemModel(ATGBlocks.green_opal_door, "green_opal_door");
        blockItemModel(ATGBlocks.white_opal_door, "white_opal_door");
        blockItemModel(ATGBlocks.pyrite_door, "pyrite_door");
        blockItemModel(ATGBlocks.tektite_door, "tektite_door");
        blockItemModel(ATGBlocks.goldstone_door, "goldstone_door");
        blockItemModel(ATGBlocks.aura_door, "aura_door");
        blockItemModel(ATGBlocks.bismuth_door, "bismuth_door");
        blockItemModel(ATGBlocks.opalite_door, "opalite_door");
        blockItemModel(ATGBlocks.stibnite_door, "stibnite_door");
        blockItemModel(ATGBlocks.proustite_door, "proustite_door");
        blockItemModel(ATGBlocks.euclase_door, "euclase_door");
        blockItemModel(ATGBlocks.albite_door, "albite_door");
        blockItemModel(ATGBlocks.carnelian_door, "carnelian_door");
        blockItemModel(ATGBlocks.benitoite_door, "benitoite_door");
        blockItemModel(ATGBlocks.diopside_door, "diopside_door");
        blockItemModel(ATGBlocks.goshenite_door, "goshenite_door");
        blockItemModel(ATGBlocks.celestine_door, "celestine_door");

        blockItemPole(ATGBlocks.sugilite_pole, "sugilite_block");
        blockItemPole(ATGBlocks.hematite_pole, "hematite_block");
        blockItemPole(ATGBlocks.cinnabar_pole, "cinnabar_block");
        blockItemPole(ATGBlocks.labradorite_pole, "labradorite_block");
        blockItemPole(ATGBlocks.moonstone_pole, "moonstone_block");
        blockItemPole(ATGBlocks.red_opal_pole, "red_opal_block");
        blockItemPole(ATGBlocks.blue_opal_pole, "blue_opal_block");
        blockItemPole(ATGBlocks.green_opal_pole, "green_opal_block");
        blockItemPole(ATGBlocks.white_opal_pole, "white_opal_block");
        blockItemPole(ATGBlocks.pyrite_pole, "pyrite_block");
        blockItemPole(ATGBlocks.tektite_pole, "tektite_block");
        blockItemPole(ATGBlocks.goldstone_pole, "goldstone_block");
        blockItemPole(ATGBlocks.aura_pole, "aura_block");
        blockItemPole(ATGBlocks.bismuth_pole, "bismuth_block");
        blockItemPole(ATGBlocks.opalite_pole, "opalite_block");
        blockItemPole(ATGBlocks.stibnite_pole, "stibnite_block");
        blockItemPole(ATGBlocks.proustite_pole, "proustite_block");
        blockItemPole(ATGBlocks.euclase_pole, "euclase_block");
        blockItemPole(ATGBlocks.albite_pole, "albite_block");
        blockItemPole(ATGBlocks.carnelian_pole, "carnelian_block");
        blockItemPole(ATGBlocks.benitoite_pole, "benitoite_block");
        blockItemPole(ATGBlocks.diopside_pole, "diopside_block");
        blockItemPole(ATGBlocks.goshenite_pole, "goshenite_block");
        blockItemPole(ATGBlocks.celestine_pole, "celestine_block");

        blockItemBeam(ATGBlocks.sugilite_beam, "sugilite_block");
        blockItemBeam(ATGBlocks.hematite_beam, "hematite_block");
        blockItemBeam(ATGBlocks.cinnabar_beam, "cinnabar_block");
        blockItemBeam(ATGBlocks.labradorite_beam, "labradorite_block");
        blockItemBeam(ATGBlocks.moonstone_beam, "moonstone_block");
        blockItemBeam(ATGBlocks.red_opal_beam, "red_opal_block");
        blockItemBeam(ATGBlocks.blue_opal_beam, "blue_opal_block");
        blockItemBeam(ATGBlocks.green_opal_beam, "green_opal_block");
        blockItemBeam(ATGBlocks.white_opal_beam, "white_opal_block");
        blockItemBeam(ATGBlocks.pyrite_beam, "pyrite_block");
        blockItemBeam(ATGBlocks.tektite_beam, "tektite_block");
        blockItemBeam(ATGBlocks.goldstone_beam, "goldstone_block");
        blockItemBeam(ATGBlocks.aura_beam, "aura_block");
        blockItemBeam(ATGBlocks.bismuth_beam, "bismuth_block");
        blockItemBeam(ATGBlocks.opalite_beam, "opalite_block");
        blockItemBeam(ATGBlocks.stibnite_beam, "stibnite_block");
        blockItemBeam(ATGBlocks.proustite_beam, "proustite_block");
        blockItemBeam(ATGBlocks.euclase_beam, "euclase_block");
        blockItemBeam(ATGBlocks.albite_beam, "albite_block");
        blockItemBeam(ATGBlocks.carnelian_beam, "carnelian_block");
        blockItemBeam(ATGBlocks.benitoite_beam, "benitoite_block");
        blockItemBeam(ATGBlocks.diopside_beam, "diopside_block");
        blockItemBeam(ATGBlocks.goshenite_beam, "goshenite_block");
        blockItemBeam(ATGBlocks.celestine_beam, "celestine_block");

        blockItemWall(ATGBlocks.sugilite_wall, "sugilite_block");
        blockItemWall(ATGBlocks.hematite_wall, "hematite_block");
        blockItemWall(ATGBlocks.cinnabar_wall, "cinnabar_block");
        blockItemWall(ATGBlocks.labradorite_wall, "labradorite_block");
        blockItemWall(ATGBlocks.moonstone_wall, "moonstone_block");
        blockItemWall(ATGBlocks.red_opal_wall, "red_opal_block");
        blockItemWall(ATGBlocks.blue_opal_wall, "blue_opal_block");
        blockItemWall(ATGBlocks.green_opal_wall, "green_opal_block");
        blockItemWall(ATGBlocks.white_opal_wall, "white_opal_block");
        blockItemWall(ATGBlocks.pyrite_wall, "pyrite_block");
        blockItemWall(ATGBlocks.tektite_wall, "tektite_block");
        blockItemWall(ATGBlocks.goldstone_wall, "goldstone_block");
        blockItemWall(ATGBlocks.aura_wall, "aura_block");
        blockItemWall(ATGBlocks.bismuth_wall, "bismuth_block");
        blockItemWall(ATGBlocks.opalite_wall, "opalite_block");
        blockItemWall(ATGBlocks.stibnite_wall, "stibnite_block");
        blockItemWall(ATGBlocks.proustite_wall, "proustite_block");
        blockItemWall(ATGBlocks.euclase_wall, "euclase_block");
        blockItemWall(ATGBlocks.albite_wall, "albite_block");
        blockItemWall(ATGBlocks.carnelian_wall, "carnelian_block");
        blockItemWall(ATGBlocks.benitoite_wall, "benitoite_block");
        blockItemWall(ATGBlocks.diopside_wall, "diopside_block");
        blockItemWall(ATGBlocks.goshenite_wall, "goshenite_block");
        blockItemWall(ATGBlocks.celestine_wall, "celestine_block");

        blockItemSaddleDoor(ATGBlocks.sugilite_saddle_door, "sugilite");
        blockItemSaddleDoor(ATGBlocks.hematite_saddle_door, "hematite");
        blockItemSaddleDoor(ATGBlocks.cinnabar_saddle_door, "cinnabar");
        blockItemSaddleDoor(ATGBlocks.labradorite_saddle_door, "labradorite");
        blockItemSaddleDoor(ATGBlocks.moonstone_saddle_door, "moonstone");
        blockItemSaddleDoor(ATGBlocks.red_opal_saddle_door, "red_opal");
        blockItemSaddleDoor(ATGBlocks.blue_opal_saddle_door, "blue_opal");
        blockItemSaddleDoor(ATGBlocks.green_opal_saddle_door, "green_opal");
        blockItemSaddleDoor(ATGBlocks.white_opal_saddle_door, "white_opal");
        blockItemSaddleDoor(ATGBlocks.pyrite_saddle_door, "pyrite");
        blockItemSaddleDoor(ATGBlocks.tektite_saddle_door, "tektite");
        blockItemSaddleDoor(ATGBlocks.goldstone_saddle_door, "goldstone");
        blockItemSaddleDoor(ATGBlocks.aura_saddle_door, "aura");
        blockItemSaddleDoor(ATGBlocks.bismuth_saddle_door, "bismuth");
        blockItemSaddleDoor(ATGBlocks.opalite_saddle_door, "opalite");
        blockItemSaddleDoor(ATGBlocks.stibnite_saddle_door, "stibnite");
        blockItemSaddleDoor(ATGBlocks.proustite_saddle_door, "proustite");
        blockItemSaddleDoor(ATGBlocks.euclase_saddle_door, "euclase");
        blockItemSaddleDoor(ATGBlocks.albite_saddle_door, "albite");
        blockItemSaddleDoor(ATGBlocks.carnelian_saddle_door, "carnelian");
        blockItemSaddleDoor(ATGBlocks.benitoite_saddle_door, "benitoite");
        blockItemSaddleDoor(ATGBlocks.diopside_saddle_door, "diopside");
        blockItemSaddleDoor(ATGBlocks.goshenite_saddle_door, "goshenite");
        blockItemSaddleDoor(ATGBlocks.celestine_saddle_door, "celestine");
    }

    @Override
    public void blockItemFence(Supplier<? extends Block> block, String name) {
        ResourceLocation loc = new ResourceLocation(GaiaDimensionMod.MODID, "block/" + name);
        blockItemFence(block, loc, loc, loc);
    }

    @Override
    public void blockItemPole(Supplier<? extends Block> block, String name, Optional<ResourceLocation> type) {
        ResourceLocation tex = new ResourceLocation(GaiaDimensionMod.MODID, "block/" + name);
        blockItemPole(block, tex, tex, tex, type);
    }

    @Override
    public void blockItemBeam(Supplier<? extends Block> block, String name) {
        ResourceLocation tex = new ResourceLocation(GaiaDimensionMod.MODID, "block/" + name);
        blockItemBeam(block, tex, tex, tex);
    }

    public void blockItemWall(Supplier<? extends Block> block, String name) {
        ResourceLocation tex = new ResourceLocation(GaiaDimensionMod.MODID, "block/" + name);
        blockItemWall(block, tex, tex, tex);
    }
}
