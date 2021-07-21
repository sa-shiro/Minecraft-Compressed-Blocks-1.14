package com.github.sa_shiro.compressedblocks.data.generators;

import com.github.sa_shiro.compressedblocks.event.ModRegistryObjects;
import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;
import net.minecraft.block.Block;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.LootTableProvider;
import net.minecraft.data.loot.BlockLootTables;
import net.minecraft.loot.*;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;

import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class GenLootTableProvider extends LootTableProvider {
    public GenLootTableProvider(DataGenerator dataGeneratorIn) {
        super(dataGeneratorIn);
    }

    @Override
    protected List<Pair<Supplier<Consumer<BiConsumer<ResourceLocation, LootTable.Builder>>>, LootParameterSet>> getTables() {
        return ImmutableList.of(
                Pair.of(CompressedLootTable::new, LootParameterSets.BLOCK)
        );
    }

    @Override
    protected void validate(Map<ResourceLocation, LootTable> map, ValidationTracker validationtracker) {
        map.forEach((id, lootTable) -> LootTableManager.validate(validationtracker, id, lootTable));
    }

    public static class CompressedLootTable extends BlockLootTables {
        @Override
        protected void addTables() {
            for (RegistryObject<Block> block : ModRegistryObjects.BLOCK_REGISTRY) {
                dropSelf(block.get());
            }
        }

        @Override
        protected Iterable<Block> getKnownBlocks() {
            return ModRegistryObjects.BLOCKS.getEntries().stream()
                    .map(RegistryObject::get)
                    .collect(Collectors.toList());
        }
    }
}