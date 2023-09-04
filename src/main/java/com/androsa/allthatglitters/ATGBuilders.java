package com.androsa.allthatglitters;

import androsa.gaiadimension.registry.registration.ModBlocks;
import com.androsa.allthatglitters.data.BlockTagGenerator;
import com.androsa.ornamental.builder.OrnamentBuilder;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.MapColor;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class ATGBuilders {

    public static final OrnamentBuilder SUGILITE = ornament("sugilite", MapColor.COLOR_PURPLE, ModBlocks.sugilite_block);
    public static final OrnamentBuilder HEMATITE = ornament("hematite", MapColor.COLOR_GRAY, ModBlocks.hematite_block);
    public static final OrnamentBuilder CINNABAR = ornament("cinnabar", MapColor.COLOR_ORANGE, ModBlocks.cinnabar_block);
    public static final OrnamentBuilder LABRADORITE = ornament("labradorite", MapColor.COLOR_GREEN, ModBlocks.labradorite_block);
    public static final OrnamentBuilder MOONSTONE = ornament("moonstone", MapColor.METAL, ModBlocks.moonstone_block);
    public static final OrnamentBuilder RED_OPAL = ornament("red_opal", MapColor.COLOR_RED, ModBlocks.red_opal_block);
    public static final OrnamentBuilder BLUE_OPAL = ornament("blue_opal", MapColor.COLOR_LIGHT_BLUE, ModBlocks.blue_opal_block);
    public static final OrnamentBuilder GREEN_OPAL = ornament("green_opal", MapColor.COLOR_LIGHT_GREEN, ModBlocks.green_opal_block);
    public static final OrnamentBuilder WHITE_OPAL = ornament("white_opal", MapColor.SNOW, ModBlocks.white_opal_block);
    public static final OrnamentBuilder PYRITE = ornament("pyrite", MapColor.GOLD, ModBlocks.pyrite_block).lightLevel(15);
    public static final OrnamentBuilder TEKTITE = ornament("tektite", MapColor.COLOR_BLACK, ModBlocks.tektite_block);
    public static final OrnamentBuilder GOLDSTONE = ornament("goldstone", MapColor.COLOR_BLACK, ModBlocks.goldstone_block);
    public static final OrnamentBuilder AURA = ornament("aura", MapColor.ICE, ModBlocks.aura_block);
    public static final OrnamentBuilder BISMUTH = ornament("bismuth", MapColor.PODZOL, ModBlocks.bismuth_block);
    public static final OrnamentBuilder OPALITE = ornament("opalite", MapColor.COLOR_LIGHT_BLUE, ModBlocks.opalite_block);
    public static final OrnamentBuilder STIBNITE = ornament("stibnite", MapColor.COLOR_GRAY, ModBlocks.stibnite_block);
    public static final OrnamentBuilder PROUSTITE = ornament("proustite", MapColor.COLOR_MAGENTA, ModBlocks.proustite_block);
    public static final OrnamentBuilder EUCLASE = ornament("euclase", MapColor.COLOR_LIGHT_GREEN, ModBlocks.euclase_block);
    public static final OrnamentBuilder ALBITE = ornament("albite", MapColor.SAND, ModBlocks.albite_block);
    public static final OrnamentBuilder CARNELIAN = ornament("carnelian", MapColor.COLOR_RED, ModBlocks.carnelian_block);
    public static final OrnamentBuilder BENITOITE = ornament("benitoite", MapColor.COLOR_BLUE, ModBlocks.benitoite_block);
    public static final OrnamentBuilder DIOPSIDE = ornament("diopside", MapColor.COLOR_LIGHT_GREEN, ModBlocks.diopside_block);
    public static final OrnamentBuilder GOSHENITE = ornament("goshenite", MapColor.SNOW, ModBlocks.goshenite_block);
    public static final OrnamentBuilder CELESTINE = ornament("celestine", MapColor.COLOR_LIGHT_BLUE, ModBlocks.celestine_block);

    private static OrnamentBuilder ornament(String name, MapColor color, Supplier<Block> baseblock) {
        return new OrnamentBuilder(name)
                .mapColor(color)
                .hardnessAndResistance(5.0F, 10.0F)
                .stairBaseBlock(baseblock)
                .saddledoorSounds(SoundEvents.IRON_TRAPDOOR_OPEN, SoundEvents.IRON_TRAPDOOR_CLOSE)
                .blockSetType(name, false, SoundType.METAL, SoundEvents.IRON_DOOR_CLOSE, SoundEvents.IRON_DOOR_OPEN, SoundEvents.IRON_TRAPDOOR_CLOSE, SoundEvents.IRON_TRAPDOOR_OPEN, SoundEvents.METAL_PRESSURE_PLATE_CLICK_OFF, SoundEvents.METAL_PRESSURE_PLATE_CLICK_ON, SoundEvents.STONE_BUTTON_CLICK_OFF, SoundEvents.STONE_BUTTON_CLICK_ON)
                .canOpen(false)
                .requiresTool()
                .addBlockTags(new ArrayList<>(List.of(BlockTagGenerator.PICKAXE_TOOL, BlockTagGenerator.IRON_REQUIRED)));
    }
}
