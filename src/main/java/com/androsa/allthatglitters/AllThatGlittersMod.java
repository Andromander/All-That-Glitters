package com.androsa.allthatglitters;

import com.androsa.allthatglitters.data.*;
import com.mojang.logging.LogUtils;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import org.slf4j.Logger;

import java.util.concurrent.CompletableFuture;

@Mod(AllThatGlittersMod.MODID)
public class AllThatGlittersMod {
    // Define mod id in a common place for everything to reference
    public static final String MODID = "allthatglitters";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();

    public AllThatGlittersMod(IEventBus bus){
        ATGBlocks.BLOCKS.register(bus);
        ATGBlocks.ITEMS.register(bus);

        bus.addListener(this::dataGenerators);
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
        generator.addProvider(event.includeServer(), new LootGenerator(output, provider));
        generator.addProvider(event.includeServer(), new RecipeGenerator(output, provider));
    }
}
