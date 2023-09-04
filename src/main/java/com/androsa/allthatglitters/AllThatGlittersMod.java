package com.androsa.allthatglitters;

import com.androsa.allthatglitters.data.*;
import com.mojang.logging.LogUtils;
import net.minecraft.DetectedVersion;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.data.metadata.PackMetadataGenerator;
import net.minecraft.network.chat.Component;
import net.minecraft.server.packs.PackType;
import net.minecraft.server.packs.metadata.pack.PackMetadataSection;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

import java.util.Arrays;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import java.util.stream.Collectors;

@Mod(AllThatGlittersMod.MODID)
public class AllThatGlittersMod {
    // Define mod id in a common place for everything to reference
    public static final String MODID = "allthatglitters";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();

    public AllThatGlittersMod(){
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ATGBlocks.BLOCKS.register(modEventBus);
        ATGBlocks.ITEMS.register(modEventBus);

        modEventBus.addListener(this::dataGenerators);
    }

    public void dataGenerators(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput output = generator.getPackOutput();
        ExistingFileHelper helper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> provider = event.getLookupProvider();

        generator.addProvider(event.includeClient(), new BlockStateGenerator(output, helper));
        generator.addProvider(event.includeClient(), new ItemModelGenerator(output, helper));
        generator.addProvider(event.includeClient(), new LanguageGenerator(output));
        BlockTagsProvider blocktags = new BlockTagGenerator(output, provider, helper);
        generator.addProvider(event.includeServer(), blocktags);
        generator.addProvider(event.includeServer(), new ItemTagGenerator(output, provider, helper, blocktags));
        generator.addProvider(event.includeServer(), new LootGenerator(output));
        generator.addProvider(true, new PackMetadataGenerator(output).add(
                PackMetadataSection.TYPE,
                new PackMetadataSection(
                        Component.literal("All That Glitters Resources"),
                        DetectedVersion.BUILT_IN.getPackVersion(PackType.CLIENT_RESOURCES),
                        Arrays.stream(PackType.values()).collect(Collectors.toMap(Function.identity(), DetectedVersion.BUILT_IN::getPackVersion)))));
    }
}
