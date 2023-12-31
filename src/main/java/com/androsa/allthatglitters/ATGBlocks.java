package com.androsa.allthatglitters;

import com.androsa.ornamental.blocks.*;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ATGBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, AllThatGlittersMod.MODID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, AllThatGlittersMod.MODID);
    public static final ATGRegistryHelper HELPER = new ATGRegistryHelper(BLOCKS, ITEMS);

    public static final RegistryObject<OrnamentStair> sugilite_stairs = HELPER.stairs(ATGBuilders.SUGILITE);
    public static final RegistryObject<OrnamentStair> hematite_stairs = HELPER.stairs(ATGBuilders.HEMATITE);
    public static final RegistryObject<OrnamentStair> cinnabar_stairs = HELPER.stairs(ATGBuilders.CINNABAR);
    public static final RegistryObject<OrnamentStair> labradorite_stairs = HELPER.stairs(ATGBuilders.LABRADORITE);
    public static final RegistryObject<OrnamentStair> moonstone_stairs = HELPER.stairs(ATGBuilders.MOONSTONE);
    public static final RegistryObject<OrnamentStair> red_opal_stairs = HELPER.stairs(ATGBuilders.RED_OPAL);
    public static final RegistryObject<OrnamentStair> blue_opal_stairs = HELPER.stairs(ATGBuilders.BLUE_OPAL);
    public static final RegistryObject<OrnamentStair> green_opal_stairs = HELPER.stairs(ATGBuilders.GREEN_OPAL);
    public static final RegistryObject<OrnamentStair> white_opal_stairs = HELPER.stairs(ATGBuilders.WHITE_OPAL);
    public static final RegistryObject<OrnamentStair> pyrite_stairs = HELPER.stairs(ATGBuilders.PYRITE);
    public static final RegistryObject<OrnamentStair> tektite_stairs = HELPER.stairs(ATGBuilders.TEKTITE);
    public static final RegistryObject<OrnamentStair> goldstone_stairs = HELPER.stairs(ATGBuilders.GOLDSTONE);
    public static final RegistryObject<OrnamentStair> aura_stairs = HELPER.stairs(ATGBuilders.AURA);
    public static final RegistryObject<OrnamentStair> bismuth_stairs = HELPER.stairs(ATGBuilders.BISMUTH);
    public static final RegistryObject<OrnamentStair> opalite_stairs = HELPER.stairs(ATGBuilders.OPALITE);
    public static final RegistryObject<OrnamentStair> stibnite_stairs = HELPER.stairs(ATGBuilders.STIBNITE);
    public static final RegistryObject<OrnamentStair> proustite_stairs = HELPER.stairs(ATGBuilders.PROUSTITE);
    public static final RegistryObject<OrnamentStair> euclase_stairs = HELPER.stairs(ATGBuilders.EUCLASE);
    public static final RegistryObject<OrnamentStair> albite_stairs = HELPER.stairs(ATGBuilders.ALBITE);
    public static final RegistryObject<OrnamentStair> carnelian_stairs = HELPER.stairs(ATGBuilders.CARNELIAN);
    public static final RegistryObject<OrnamentStair> benitoite_stairs = HELPER.stairs(ATGBuilders.BENITOITE);
    public static final RegistryObject<OrnamentStair> diopside_stairs = HELPER.stairs(ATGBuilders.DIOPSIDE);
    public static final RegistryObject<OrnamentStair> goshenite_stairs = HELPER.stairs(ATGBuilders.GOSHENITE);
    public static final RegistryObject<OrnamentStair> celestine_stairs = HELPER.stairs(ATGBuilders.CELESTINE);

    public static final RegistryObject<OrnamentSlab> sugilite_slab = HELPER.slab(ATGBuilders.SUGILITE);
    public static final RegistryObject<OrnamentSlab> hematite_slab = HELPER.slab(ATGBuilders.HEMATITE);
    public static final RegistryObject<OrnamentSlab> cinnabar_slab = HELPER.slab(ATGBuilders.CINNABAR);
    public static final RegistryObject<OrnamentSlab> labradorite_slab = HELPER.slab(ATGBuilders.LABRADORITE);
    public static final RegistryObject<OrnamentSlab> moonstone_slab = HELPER.slab(ATGBuilders.MOONSTONE);
    public static final RegistryObject<OrnamentSlab> red_opal_slab = HELPER.slab(ATGBuilders.RED_OPAL);
    public static final RegistryObject<OrnamentSlab> blue_opal_slab = HELPER.slab(ATGBuilders.BLUE_OPAL);
    public static final RegistryObject<OrnamentSlab> green_opal_slab = HELPER.slab(ATGBuilders.GREEN_OPAL);
    public static final RegistryObject<OrnamentSlab> white_opal_slab = HELPER.slab(ATGBuilders.WHITE_OPAL);
    public static final RegistryObject<OrnamentSlab> pyrite_slab = HELPER.slab(ATGBuilders.PYRITE);
    public static final RegistryObject<OrnamentSlab> tektite_slab = HELPER.slab(ATGBuilders.TEKTITE);
    public static final RegistryObject<OrnamentSlab> goldstone_slab = HELPER.slab(ATGBuilders.GOLDSTONE);
    public static final RegistryObject<OrnamentSlab> aura_slab = HELPER.slab(ATGBuilders.AURA);
    public static final RegistryObject<OrnamentSlab> bismuth_slab = HELPER.slab(ATGBuilders.BISMUTH);
    public static final RegistryObject<OrnamentSlab> opalite_slab = HELPER.slab(ATGBuilders.OPALITE);
    public static final RegistryObject<OrnamentSlab> stibnite_slab = HELPER.slab(ATGBuilders.STIBNITE);
    public static final RegistryObject<OrnamentSlab> proustite_slab = HELPER.slab(ATGBuilders.PROUSTITE);
    public static final RegistryObject<OrnamentSlab> euclase_slab = HELPER.slab(ATGBuilders.EUCLASE);
    public static final RegistryObject<OrnamentSlab> albite_slab = HELPER.slab(ATGBuilders.ALBITE);
    public static final RegistryObject<OrnamentSlab> carnelian_slab = HELPER.slab(ATGBuilders.CARNELIAN);
    public static final RegistryObject<OrnamentSlab> benitoite_slab = HELPER.slab(ATGBuilders.BENITOITE);
    public static final RegistryObject<OrnamentSlab> diopside_slab = HELPER.slab(ATGBuilders.DIOPSIDE);
    public static final RegistryObject<OrnamentSlab> goshenite_slab = HELPER.slab(ATGBuilders.GOSHENITE);
    public static final RegistryObject<OrnamentSlab> celestine_slab = HELPER.slab(ATGBuilders.CELESTINE);

    public static final RegistryObject<OrnamentFence> sugilite_fence = HELPER.fence(ATGBuilders.SUGILITE);
    public static final RegistryObject<OrnamentFence> hematite_fence = HELPER.fence(ATGBuilders.HEMATITE);
    public static final RegistryObject<OrnamentFence> cinnabar_fence = HELPER.fence(ATGBuilders.CINNABAR);
    public static final RegistryObject<OrnamentFence> labradorite_fence = HELPER.fence(ATGBuilders.LABRADORITE);
    public static final RegistryObject<OrnamentFence> moonstone_fence = HELPER.fence(ATGBuilders.MOONSTONE);
    public static final RegistryObject<OrnamentFence> red_opal_fence = HELPER.fence(ATGBuilders.RED_OPAL);
    public static final RegistryObject<OrnamentFence> blue_opal_fence = HELPER.fence(ATGBuilders.BLUE_OPAL);
    public static final RegistryObject<OrnamentFence> green_opal_fence = HELPER.fence(ATGBuilders.GREEN_OPAL);
    public static final RegistryObject<OrnamentFence> white_opal_fence = HELPER.fence(ATGBuilders.WHITE_OPAL);
    public static final RegistryObject<OrnamentFence> pyrite_fence = HELPER.fence(ATGBuilders.PYRITE);
    public static final RegistryObject<OrnamentFence> tektite_fence = HELPER.fence(ATGBuilders.TEKTITE);
    public static final RegistryObject<OrnamentFence> goldstone_fence = HELPER.fence(ATGBuilders.GOLDSTONE);
    public static final RegistryObject<OrnamentFence> aura_fence = HELPER.fence(ATGBuilders.AURA);
    public static final RegistryObject<OrnamentFence> bismuth_fence = HELPER.fence(ATGBuilders.BISMUTH);
    public static final RegistryObject<OrnamentFence> opalite_fence = HELPER.fence(ATGBuilders.OPALITE);
    public static final RegistryObject<OrnamentFence> stibnite_fence = HELPER.fence(ATGBuilders.STIBNITE);
    public static final RegistryObject<OrnamentFence> proustite_fence = HELPER.fence(ATGBuilders.PROUSTITE);
    public static final RegistryObject<OrnamentFence> euclase_fence = HELPER.fence(ATGBuilders.EUCLASE);
    public static final RegistryObject<OrnamentFence> albite_fence = HELPER.fence(ATGBuilders.ALBITE);
    public static final RegistryObject<OrnamentFence> carnelian_fence = HELPER.fence(ATGBuilders.CARNELIAN);
    public static final RegistryObject<OrnamentFence> benitoite_fence = HELPER.fence(ATGBuilders.BENITOITE);
    public static final RegistryObject<OrnamentFence> diopside_fence = HELPER.fence(ATGBuilders.DIOPSIDE);
    public static final RegistryObject<OrnamentFence> goshenite_fence = HELPER.fence(ATGBuilders.GOSHENITE);
    public static final RegistryObject<OrnamentFence> celestine_fence = HELPER.fence(ATGBuilders.CELESTINE);

    public static final RegistryObject<OrnamentTrapDoor> sugilite_trapdoor = HELPER.trapdoor(ATGBuilders.SUGILITE);
    public static final RegistryObject<OrnamentTrapDoor> hematite_trapdoor = HELPER.trapdoor(ATGBuilders.HEMATITE);
    public static final RegistryObject<OrnamentTrapDoor> cinnabar_trapdoor = HELPER.trapdoor(ATGBuilders.CINNABAR);
    public static final RegistryObject<OrnamentTrapDoor> labradorite_trapdoor = HELPER.trapdoor(ATGBuilders.LABRADORITE);
    public static final RegistryObject<OrnamentTrapDoor> moonstone_trapdoor = HELPER.trapdoor(ATGBuilders.MOONSTONE);
    public static final RegistryObject<OrnamentTrapDoor> red_opal_trapdoor = HELPER.trapdoor(ATGBuilders.RED_OPAL);
    public static final RegistryObject<OrnamentTrapDoor> blue_opal_trapdoor = HELPER.trapdoor(ATGBuilders.BLUE_OPAL);
    public static final RegistryObject<OrnamentTrapDoor> green_opal_trapdoor = HELPER.trapdoor(ATGBuilders.GREEN_OPAL);
    public static final RegistryObject<OrnamentTrapDoor> white_opal_trapdoor = HELPER.trapdoor(ATGBuilders.WHITE_OPAL);
    public static final RegistryObject<OrnamentTrapDoor> pyrite_trapdoor = HELPER.trapdoor(ATGBuilders.PYRITE);
    public static final RegistryObject<OrnamentTrapDoor> tektite_trapdoor = HELPER.trapdoor(ATGBuilders.TEKTITE);
    public static final RegistryObject<OrnamentTrapDoor> goldstone_trapdoor = HELPER.trapdoor(ATGBuilders.GOLDSTONE);
    public static final RegistryObject<OrnamentTrapDoor> aura_trapdoor = HELPER.trapdoor(ATGBuilders.AURA);
    public static final RegistryObject<OrnamentTrapDoor> bismuth_trapdoor = HELPER.trapdoor(ATGBuilders.BISMUTH);
    public static final RegistryObject<OrnamentTrapDoor> opalite_trapdoor = HELPER.trapdoor(ATGBuilders.OPALITE);
    public static final RegistryObject<OrnamentTrapDoor> stibnite_trapdoor = HELPER.trapdoor(ATGBuilders.STIBNITE);
    public static final RegistryObject<OrnamentTrapDoor> proustite_trapdoor = HELPER.trapdoor(ATGBuilders.PROUSTITE);
    public static final RegistryObject<OrnamentTrapDoor> euclase_trapdoor = HELPER.trapdoor(ATGBuilders.EUCLASE);
    public static final RegistryObject<OrnamentTrapDoor> albite_trapdoor = HELPER.trapdoor(ATGBuilders.ALBITE);
    public static final RegistryObject<OrnamentTrapDoor> carnelian_trapdoor = HELPER.trapdoor(ATGBuilders.CARNELIAN);
    public static final RegistryObject<OrnamentTrapDoor> benitoite_trapdoor = HELPER.trapdoor(ATGBuilders.BENITOITE);
    public static final RegistryObject<OrnamentTrapDoor> diopside_trapdoor = HELPER.trapdoor(ATGBuilders.DIOPSIDE);
    public static final RegistryObject<OrnamentTrapDoor> goshenite_trapdoor = HELPER.trapdoor(ATGBuilders.GOSHENITE);
    public static final RegistryObject<OrnamentTrapDoor> celestine_trapdoor = HELPER.trapdoor(ATGBuilders.CELESTINE);

    public static final RegistryObject<OrnamentFenceGate> sugilite_fence_gate = HELPER.fencegate(ATGBuilders.SUGILITE);
    public static final RegistryObject<OrnamentFenceGate> hematite_fence_gate = HELPER.fencegate(ATGBuilders.HEMATITE);
    public static final RegistryObject<OrnamentFenceGate> cinnabar_fence_gate = HELPER.fencegate(ATGBuilders.CINNABAR);
    public static final RegistryObject<OrnamentFenceGate> labradorite_fence_gate = HELPER.fencegate(ATGBuilders.LABRADORITE);
    public static final RegistryObject<OrnamentFenceGate> moonstone_fence_gate = HELPER.fencegate(ATGBuilders.MOONSTONE);
    public static final RegistryObject<OrnamentFenceGate> red_opal_fence_gate = HELPER.fencegate(ATGBuilders.RED_OPAL);
    public static final RegistryObject<OrnamentFenceGate> blue_opal_fence_gate = HELPER.fencegate(ATGBuilders.BLUE_OPAL);
    public static final RegistryObject<OrnamentFenceGate> green_opal_fence_gate = HELPER.fencegate(ATGBuilders.GREEN_OPAL);
    public static final RegistryObject<OrnamentFenceGate> white_opal_fence_gate = HELPER.fencegate(ATGBuilders.WHITE_OPAL);
    public static final RegistryObject<OrnamentFenceGate> pyrite_fence_gate = HELPER.fencegate(ATGBuilders.PYRITE);
    public static final RegistryObject<OrnamentFenceGate> tektite_fence_gate = HELPER.fencegate(ATGBuilders.TEKTITE);
    public static final RegistryObject<OrnamentFenceGate> goldstone_fence_gate = HELPER.fencegate(ATGBuilders.GOLDSTONE);
    public static final RegistryObject<OrnamentFenceGate> aura_fence_gate = HELPER.fencegate(ATGBuilders.AURA);
    public static final RegistryObject<OrnamentFenceGate> bismuth_fence_gate = HELPER.fencegate(ATGBuilders.BISMUTH);
    public static final RegistryObject<OrnamentFenceGate> opalite_fence_gate = HELPER.fencegate(ATGBuilders.OPALITE);
    public static final RegistryObject<OrnamentFenceGate> stibnite_fence_gate = HELPER.fencegate(ATGBuilders.STIBNITE);
    public static final RegistryObject<OrnamentFenceGate> proustite_fence_gate = HELPER.fencegate(ATGBuilders.PROUSTITE);
    public static final RegistryObject<OrnamentFenceGate> euclase_fence_gate = HELPER.fencegate(ATGBuilders.EUCLASE);
    public static final RegistryObject<OrnamentFenceGate> albite_fence_gate = HELPER.fencegate(ATGBuilders.ALBITE);
    public static final RegistryObject<OrnamentFenceGate> carnelian_fence_gate = HELPER.fencegate(ATGBuilders.CARNELIAN);
    public static final RegistryObject<OrnamentFenceGate> benitoite_fence_gate = HELPER.fencegate(ATGBuilders.BENITOITE);
    public static final RegistryObject<OrnamentFenceGate> diopside_fence_gate = HELPER.fencegate(ATGBuilders.DIOPSIDE);
    public static final RegistryObject<OrnamentFenceGate> goshenite_fence_gate = HELPER.fencegate(ATGBuilders.GOSHENITE);
    public static final RegistryObject<OrnamentFenceGate> celestine_fence_gate = HELPER.fencegate(ATGBuilders.CELESTINE);

    public static final RegistryObject<OrnamentDoor> sugilite_door = HELPER.door(ATGBuilders.SUGILITE);
    public static final RegistryObject<OrnamentDoor> hematite_door = HELPER.door(ATGBuilders.HEMATITE);
    public static final RegistryObject<OrnamentDoor> cinnabar_door = HELPER.door(ATGBuilders.CINNABAR);
    public static final RegistryObject<OrnamentDoor> labradorite_door = HELPER.door(ATGBuilders.LABRADORITE);
    public static final RegistryObject<OrnamentDoor> moonstone_door = HELPER.door(ATGBuilders.MOONSTONE);
    public static final RegistryObject<OrnamentDoor> red_opal_door = HELPER.door(ATGBuilders.RED_OPAL);
    public static final RegistryObject<OrnamentDoor> blue_opal_door = HELPER.door(ATGBuilders.BLUE_OPAL);
    public static final RegistryObject<OrnamentDoor> green_opal_door = HELPER.door(ATGBuilders.GREEN_OPAL);
    public static final RegistryObject<OrnamentDoor> white_opal_door = HELPER.door(ATGBuilders.WHITE_OPAL);
    public static final RegistryObject<OrnamentDoor> pyrite_door = HELPER.door(ATGBuilders.PYRITE);
    public static final RegistryObject<OrnamentDoor> tektite_door = HELPER.door(ATGBuilders.TEKTITE);
    public static final RegistryObject<OrnamentDoor> goldstone_door = HELPER.door(ATGBuilders.GOLDSTONE);
    public static final RegistryObject<OrnamentDoor> aura_door = HELPER.door(ATGBuilders.AURA);
    public static final RegistryObject<OrnamentDoor> bismuth_door = HELPER.door(ATGBuilders.BISMUTH);
    public static final RegistryObject<OrnamentDoor> opalite_door = HELPER.door(ATGBuilders.OPALITE);
    public static final RegistryObject<OrnamentDoor> stibnite_door = HELPER.door(ATGBuilders.STIBNITE);
    public static final RegistryObject<OrnamentDoor> proustite_door = HELPER.door(ATGBuilders.PROUSTITE);
    public static final RegistryObject<OrnamentDoor> euclase_door = HELPER.door(ATGBuilders.EUCLASE);
    public static final RegistryObject<OrnamentDoor> albite_door = HELPER.door(ATGBuilders.ALBITE);
    public static final RegistryObject<OrnamentDoor> carnelian_door = HELPER.door(ATGBuilders.CARNELIAN);
    public static final RegistryObject<OrnamentDoor> benitoite_door = HELPER.door(ATGBuilders.BENITOITE);
    public static final RegistryObject<OrnamentDoor> diopside_door = HELPER.door(ATGBuilders.DIOPSIDE);
    public static final RegistryObject<OrnamentDoor> goshenite_door = HELPER.door(ATGBuilders.GOSHENITE);
    public static final RegistryObject<OrnamentDoor> celestine_door = HELPER.door(ATGBuilders.CELESTINE);

    public static final RegistryObject<OrnamentPole> sugilite_pole = HELPER.pole(ATGBuilders.SUGILITE);
    public static final RegistryObject<OrnamentPole> hematite_pole = HELPER.pole(ATGBuilders.HEMATITE);
    public static final RegistryObject<OrnamentPole> cinnabar_pole = HELPER.pole(ATGBuilders.CINNABAR);
    public static final RegistryObject<OrnamentPole> labradorite_pole = HELPER.pole(ATGBuilders.LABRADORITE);
    public static final RegistryObject<OrnamentPole> moonstone_pole = HELPER.pole(ATGBuilders.MOONSTONE);
    public static final RegistryObject<OrnamentPole> red_opal_pole = HELPER.pole(ATGBuilders.RED_OPAL);
    public static final RegistryObject<OrnamentPole> blue_opal_pole = HELPER.pole(ATGBuilders.BLUE_OPAL);
    public static final RegistryObject<OrnamentPole> green_opal_pole = HELPER.pole(ATGBuilders.GREEN_OPAL);
    public static final RegistryObject<OrnamentPole> white_opal_pole = HELPER.pole(ATGBuilders.WHITE_OPAL);
    public static final RegistryObject<OrnamentPole> pyrite_pole = HELPER.pole(ATGBuilders.PYRITE);
    public static final RegistryObject<OrnamentPole> tektite_pole = HELPER.pole(ATGBuilders.TEKTITE);
    public static final RegistryObject<OrnamentPole> goldstone_pole = HELPER.pole(ATGBuilders.GOLDSTONE);
    public static final RegistryObject<OrnamentPole> aura_pole = HELPER.pole(ATGBuilders.AURA);
    public static final RegistryObject<OrnamentPole> bismuth_pole = HELPER.pole(ATGBuilders.BISMUTH);
    public static final RegistryObject<OrnamentPole> opalite_pole = HELPER.pole(ATGBuilders.OPALITE);
    public static final RegistryObject<OrnamentPole> stibnite_pole = HELPER.pole(ATGBuilders.STIBNITE);
    public static final RegistryObject<OrnamentPole> proustite_pole = HELPER.pole(ATGBuilders.PROUSTITE);
    public static final RegistryObject<OrnamentPole> euclase_pole = HELPER.pole(ATGBuilders.EUCLASE);
    public static final RegistryObject<OrnamentPole> albite_pole = HELPER.pole(ATGBuilders.ALBITE);
    public static final RegistryObject<OrnamentPole> carnelian_pole = HELPER.pole(ATGBuilders.CARNELIAN);
    public static final RegistryObject<OrnamentPole> benitoite_pole = HELPER.pole(ATGBuilders.BENITOITE);
    public static final RegistryObject<OrnamentPole> diopside_pole = HELPER.pole(ATGBuilders.DIOPSIDE);
    public static final RegistryObject<OrnamentPole> goshenite_pole = HELPER.pole(ATGBuilders.GOSHENITE);
    public static final RegistryObject<OrnamentPole> celestine_pole = HELPER.pole(ATGBuilders.CELESTINE);

    public static final RegistryObject<OrnamentBeam> sugilite_beam = HELPER.beam(ATGBuilders.SUGILITE);
    public static final RegistryObject<OrnamentBeam> hematite_beam = HELPER.beam(ATGBuilders.HEMATITE);
    public static final RegistryObject<OrnamentBeam> cinnabar_beam = HELPER.beam(ATGBuilders.CINNABAR);
    public static final RegistryObject<OrnamentBeam> labradorite_beam = HELPER.beam(ATGBuilders.LABRADORITE);
    public static final RegistryObject<OrnamentBeam> moonstone_beam = HELPER.beam(ATGBuilders.MOONSTONE);
    public static final RegistryObject<OrnamentBeam> red_opal_beam = HELPER.beam(ATGBuilders.RED_OPAL);
    public static final RegistryObject<OrnamentBeam> blue_opal_beam = HELPER.beam(ATGBuilders.BLUE_OPAL);
    public static final RegistryObject<OrnamentBeam> green_opal_beam = HELPER.beam(ATGBuilders.GREEN_OPAL);
    public static final RegistryObject<OrnamentBeam> white_opal_beam = HELPER.beam(ATGBuilders.WHITE_OPAL);
    public static final RegistryObject<OrnamentBeam> pyrite_beam = HELPER.beam(ATGBuilders.PYRITE);
    public static final RegistryObject<OrnamentBeam> tektite_beam = HELPER.beam(ATGBuilders.TEKTITE);
    public static final RegistryObject<OrnamentBeam> goldstone_beam = HELPER.beam(ATGBuilders.GOLDSTONE);
    public static final RegistryObject<OrnamentBeam> aura_beam = HELPER.beam(ATGBuilders.AURA);
    public static final RegistryObject<OrnamentBeam> bismuth_beam = HELPER.beam(ATGBuilders.BISMUTH);
    public static final RegistryObject<OrnamentBeam> opalite_beam = HELPER.beam(ATGBuilders.OPALITE);
    public static final RegistryObject<OrnamentBeam> stibnite_beam = HELPER.beam(ATGBuilders.STIBNITE);
    public static final RegistryObject<OrnamentBeam> proustite_beam = HELPER.beam(ATGBuilders.PROUSTITE);
    public static final RegistryObject<OrnamentBeam> euclase_beam = HELPER.beam(ATGBuilders.EUCLASE);
    public static final RegistryObject<OrnamentBeam> albite_beam = HELPER.beam(ATGBuilders.ALBITE);
    public static final RegistryObject<OrnamentBeam> carnelian_beam = HELPER.beam(ATGBuilders.CARNELIAN);
    public static final RegistryObject<OrnamentBeam> benitoite_beam = HELPER.beam(ATGBuilders.BENITOITE);
    public static final RegistryObject<OrnamentBeam> diopside_beam = HELPER.beam(ATGBuilders.DIOPSIDE);
    public static final RegistryObject<OrnamentBeam> goshenite_beam = HELPER.beam(ATGBuilders.GOSHENITE);
    public static final RegistryObject<OrnamentBeam> celestine_beam = HELPER.beam(ATGBuilders.CELESTINE);

    public static final RegistryObject<OrnamentWall> sugilite_wall = HELPER.wall(ATGBuilders.SUGILITE);
    public static final RegistryObject<OrnamentWall> hematite_wall = HELPER.wall(ATGBuilders.HEMATITE);
    public static final RegistryObject<OrnamentWall> cinnabar_wall = HELPER.wall(ATGBuilders.CINNABAR);
    public static final RegistryObject<OrnamentWall> labradorite_wall = HELPER.wall(ATGBuilders.LABRADORITE);
    public static final RegistryObject<OrnamentWall> moonstone_wall = HELPER.wall(ATGBuilders.MOONSTONE);
    public static final RegistryObject<OrnamentWall> red_opal_wall = HELPER.wall(ATGBuilders.RED_OPAL);
    public static final RegistryObject<OrnamentWall> blue_opal_wall = HELPER.wall(ATGBuilders.BLUE_OPAL);
    public static final RegistryObject<OrnamentWall> green_opal_wall = HELPER.wall(ATGBuilders.GREEN_OPAL);
    public static final RegistryObject<OrnamentWall> white_opal_wall = HELPER.wall(ATGBuilders.WHITE_OPAL);
    public static final RegistryObject<OrnamentWall> pyrite_wall = HELPER.wall(ATGBuilders.PYRITE);
    public static final RegistryObject<OrnamentWall> tektite_wall = HELPER.wall(ATGBuilders.TEKTITE);
    public static final RegistryObject<OrnamentWall> goldstone_wall = HELPER.wall(ATGBuilders.GOLDSTONE);
    public static final RegistryObject<OrnamentWall> aura_wall = HELPER.wall(ATGBuilders.AURA);
    public static final RegistryObject<OrnamentWall> bismuth_wall = HELPER.wall(ATGBuilders.BISMUTH);
    public static final RegistryObject<OrnamentWall> opalite_wall = HELPER.wall(ATGBuilders.OPALITE);
    public static final RegistryObject<OrnamentWall> stibnite_wall = HELPER.wall(ATGBuilders.STIBNITE);
    public static final RegistryObject<OrnamentWall> proustite_wall = HELPER.wall(ATGBuilders.PROUSTITE);
    public static final RegistryObject<OrnamentWall> euclase_wall = HELPER.wall(ATGBuilders.EUCLASE);
    public static final RegistryObject<OrnamentWall> albite_wall = HELPER.wall(ATGBuilders.ALBITE);
    public static final RegistryObject<OrnamentWall> carnelian_wall = HELPER.wall(ATGBuilders.CARNELIAN);
    public static final RegistryObject<OrnamentWall> benitoite_wall = HELPER.wall(ATGBuilders.BENITOITE);
    public static final RegistryObject<OrnamentWall> diopside_wall = HELPER.wall(ATGBuilders.DIOPSIDE);
    public static final RegistryObject<OrnamentWall> goshenite_wall = HELPER.wall(ATGBuilders.GOSHENITE);
    public static final RegistryObject<OrnamentWall> celestine_wall = HELPER.wall(ATGBuilders.CELESTINE);

    public static final RegistryObject<OrnamentSaddleDoor> sugilite_saddle_door = HELPER.saddledoor(ATGBuilders.SUGILITE);
    public static final RegistryObject<OrnamentSaddleDoor> hematite_saddle_door = HELPER.saddledoor(ATGBuilders.HEMATITE);
    public static final RegistryObject<OrnamentSaddleDoor> cinnabar_saddle_door = HELPER.saddledoor(ATGBuilders.CINNABAR);
    public static final RegistryObject<OrnamentSaddleDoor> labradorite_saddle_door = HELPER.saddledoor(ATGBuilders.LABRADORITE);
    public static final RegistryObject<OrnamentSaddleDoor> moonstone_saddle_door = HELPER.saddledoor(ATGBuilders.MOONSTONE);
    public static final RegistryObject<OrnamentSaddleDoor> red_opal_saddle_door = HELPER.saddledoor(ATGBuilders.RED_OPAL);
    public static final RegistryObject<OrnamentSaddleDoor> blue_opal_saddle_door = HELPER.saddledoor(ATGBuilders.BLUE_OPAL);
    public static final RegistryObject<OrnamentSaddleDoor> green_opal_saddle_door = HELPER.saddledoor(ATGBuilders.GREEN_OPAL);
    public static final RegistryObject<OrnamentSaddleDoor> white_opal_saddle_door = HELPER.saddledoor(ATGBuilders.WHITE_OPAL);
    public static final RegistryObject<OrnamentSaddleDoor> pyrite_saddle_door = HELPER.saddledoor(ATGBuilders.PYRITE);
    public static final RegistryObject<OrnamentSaddleDoor> tektite_saddle_door = HELPER.saddledoor(ATGBuilders.TEKTITE);
    public static final RegistryObject<OrnamentSaddleDoor> goldstone_saddle_door = HELPER.saddledoor(ATGBuilders.GOLDSTONE);
    public static final RegistryObject<OrnamentSaddleDoor> aura_saddle_door = HELPER.saddledoor(ATGBuilders.AURA);
    public static final RegistryObject<OrnamentSaddleDoor> bismuth_saddle_door = HELPER.saddledoor(ATGBuilders.BISMUTH);
    public static final RegistryObject<OrnamentSaddleDoor> opalite_saddle_door = HELPER.saddledoor(ATGBuilders.OPALITE);
    public static final RegistryObject<OrnamentSaddleDoor> stibnite_saddle_door = HELPER.saddledoor(ATGBuilders.STIBNITE);
    public static final RegistryObject<OrnamentSaddleDoor> proustite_saddle_door = HELPER.saddledoor(ATGBuilders.PROUSTITE);
    public static final RegistryObject<OrnamentSaddleDoor> euclase_saddle_door = HELPER.saddledoor(ATGBuilders.EUCLASE);
    public static final RegistryObject<OrnamentSaddleDoor> albite_saddle_door = HELPER.saddledoor(ATGBuilders.ALBITE);
    public static final RegistryObject<OrnamentSaddleDoor> carnelian_saddle_door = HELPER.saddledoor(ATGBuilders.CARNELIAN);
    public static final RegistryObject<OrnamentSaddleDoor> benitoite_saddle_door = HELPER.saddledoor(ATGBuilders.BENITOITE);
    public static final RegistryObject<OrnamentSaddleDoor> diopside_saddle_door = HELPER.saddledoor(ATGBuilders.DIOPSIDE);
    public static final RegistryObject<OrnamentSaddleDoor> goshenite_saddle_door = HELPER.saddledoor(ATGBuilders.GOSHENITE);
    public static final RegistryObject<OrnamentSaddleDoor> celestine_saddle_door = HELPER.saddledoor(ATGBuilders.CELESTINE);
}
