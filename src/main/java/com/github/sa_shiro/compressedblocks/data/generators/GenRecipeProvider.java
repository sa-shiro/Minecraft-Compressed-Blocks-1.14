package com.github.sa_shiro.compressedblocks.data.generators;

import com.github.sa_shiro.compressedblocks.event.ModRegistryObjects;
import net.minecraft.block.Block;
import net.minecraft.data.*;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.registries.ForgeRegistries;

import javax.annotation.ParametersAreNonnullByDefault;
import java.util.function.Consumer;

public class GenRecipeProvider extends RecipeProvider {
    public GenRecipeProvider(DataGenerator generatorIn) {
        super(generatorIn);
    }

    @Override
    @ParametersAreNonnullByDefault
    protected void buildShapelessRecipes(Consumer<IFinishedRecipe> consumer) {
        assert false;
        for (int i = 0; i < ModRegistryObjects.BLOCK_REGISTRY.size(); i++) {
            String blockName = ModRegistryObjects.BLOCK_REGISTRY.get(i).get().getRegistryName().toString();
            boolean isSpecial = blockName.contains("c0_rotten_flesh_block") || blockName.contains("c0_gunpowder_block") || blockName.contains("c0_flint_block");
            if (blockName.contains("c0_") && !isSpecial) {
                String cbBlockName = blockName.replace("compressedblocks:c0_", "");
                for (Block mcBlock : ForgeRegistries.BLOCKS) {
                    String mcBlockName = mcBlock.getRegistryName().toString().replace("minecraft:", "");
                    if (cbBlockName.equals(mcBlockName) && !isSpecial) {
                        ShapedRecipeBuilder.shaped(
                                ModRegistryObjects.BLOCK_REGISTRY.get(i).get()) // result
                                .define('#', mcBlock) // ingredient
                                .pattern("###")
                                .pattern("###")
                                .pattern("###")
                                .unlockedBy("has_item", has(mcBlock.asItem()))
                                .save(consumer, new ResourceLocation("compressedblocks", "shaped_" + blockName.replace("compressedblocks:", "")));
                        ShapelessRecipeBuilder.shapeless(mcBlock, 9)
                                .requires(ModRegistryObjects.BLOCK_REGISTRY.get(i).get())
                                .unlockedBy("has_item", has(ModRegistryObjects.BLOCK_REGISTRY.get(i).get().asItem()))
                                .save(consumer, new ResourceLocation("compressedblocks", "shapeless_" + blockName.replace("compressedblocks:", "")));
                    }
                }
            } else if (isSpecial) {
                Item item;
                if (blockName.contains("gunpowder")) {
                    item = Items.GUNPOWDER;
                } else if (blockName.contains("rotten_flesh")) {
                    item = Items.ROTTEN_FLESH;
                } else {
                    item = Items.FLINT;
                }
                ShapedRecipeBuilder.shaped(ModRegistryObjects.BLOCK_REGISTRY.get(i).get()) // result
                        .define('#', item) // ingredient
                        .pattern("###")
                        .pattern("###")
                        .pattern("###")
                        .unlockedBy("has_item", has(item))
                        .save(consumer, new ResourceLocation("compressedblocks", "shaped_" + blockName.replace("compressedblocks:", "")));
                ShapelessRecipeBuilder.shapeless(item, 9)
                        .requires(ModRegistryObjects.BLOCK_REGISTRY.get(i).get())
                        .unlockedBy("has_item", has(ModRegistryObjects.BLOCK_REGISTRY.get(i).get().asItem()))
                        .save(consumer, new ResourceLocation("compressedblocks", "shapeless_" + blockName.replace("compressedblocks:", "")));

            } else {
                ShapedRecipeBuilder.shaped(ModRegistryObjects.BLOCK_REGISTRY.get(i).get()) // result
                        .define('#', ModRegistryObjects.BLOCK_REGISTRY.get(i - 1).get()) // ingredient
                        .pattern("###")
                        .pattern("###")
                        .pattern("###")
                        .unlockedBy("has_item", has(ModRegistryObjects.BLOCK_REGISTRY.get(i - 1).get().asItem()))
                        .save(consumer, new ResourceLocation("compressedblocks", "shaped_" + blockName.replace("compressedblocks:", "")));
                ShapelessRecipeBuilder.shapeless(ModRegistryObjects.BLOCK_REGISTRY.get(i - 1).get(), 9)
                        .requires(ModRegistryObjects.BLOCK_REGISTRY.get(i).get())
                        .unlockedBy("has_item", has(ModRegistryObjects.BLOCK_REGISTRY.get(i).get().asItem()))
                        .save(consumer, new ResourceLocation("compressedblocks", "shapeless_" + blockName.replace("compressedblocks:", "")));
            }
        }

        // fixme: remove
        ShapelessRecipeBuilder.shapeless(Items.ENDER_EYE, 9) // result, count
                .requires(ModRegistryObjects.ENDER_EYE_BAG.get()) // ingredient
                .unlockedBy("has_item", has(ModRegistryObjects.ENDER_EYE_BAG.get()))
                .save(consumer, new ResourceLocation("compressedblocks", "shapeless_" + ModRegistryObjects.ENDER_EYE_BAG.get().getRegistryName().toString().replace("compressedblocks:", "").replace("minecraft:", "")));
        ShapelessRecipeBuilder.shapeless(ModRegistryObjects.ENDER_EYE_BAG.get(), 9) // result, count
                .requires(ModRegistryObjects.HUGE_ENDER_EYE_BAG.get()) // ingredient
                .unlockedBy("has_item", has(ModRegistryObjects.HUGE_ENDER_EYE_BAG.get()))
                .save(consumer, new ResourceLocation("compressedblocks", "shapeless_" + ModRegistryObjects.HUGE_ENDER_EYE_BAG.get().getRegistryName().toString().replace("compressedblocks:", "").replace("minecraft:", "")));

        ShapelessRecipeBuilder.shapeless(Items.EGG, 9) // result, count
                .requires(ModRegistryObjects.EGG_BAG.get()) // ingredient
                .unlockedBy("has_item", has(ModRegistryObjects.EGG_BAG.get()))
                .save(consumer, new ResourceLocation("compressedblocks", "shapeless_" + ModRegistryObjects.EGG_BAG.get().getRegistryName().toString().replace("compressedblocks:", "").replace("minecraft:", "")));
        ShapelessRecipeBuilder.shapeless(ModRegistryObjects.EGG_BAG.get(), 9) // result, count
                .requires(ModRegistryObjects.HUGE_EGG_BAG.get()) // ingredient
                .unlockedBy("has_item", has(ModRegistryObjects.HUGE_EGG_BAG.get()))
                .save(consumer, new ResourceLocation("compressedblocks", "shapeless_" + ModRegistryObjects.HUGE_EGG_BAG.get().getRegistryName().toString().replace("compressedblocks:", "").replace("minecraft:", "")));
        // ---

        for (int i = 0; i < ModRegistryObjects.APPLES.size() - 1; i++) {
            Item itemIngredient = ModRegistryObjects.APPLES.get(i).get();
            Item itemResult = ModRegistryObjects.APPLES.get(i + 1).get();

            ShapedRecipeBuilder.shaped(itemResult) // result
                    .define('#', itemIngredient) // ingredient
                    .pattern("###")
                    .pattern("###")
                    .pattern("###")
                    .unlockedBy("has_item", has(itemIngredient)) // ingredient
                    .save(consumer, new ResourceLocation("compressedblocks", "shaped_" + itemResult.getRegistryName().toString().replace("compressedblocks:", "").replace("minecraft:", "")));

            ShapelessRecipeBuilder.shapeless(itemIngredient, 9) // result, count
                    .requires(itemResult) // ingredient
                    .unlockedBy("has_item", has(itemResult))
                    .save(consumer, new ResourceLocation("compressedblocks", "shapeless_" + itemResult.getRegistryName().toString().replace("compressedblocks:", "").replace("minecraft:", "")));
        }
        for (int i = 0; i < ModRegistryObjects.ARROWS.size() - 1; i++) {
            Item itemIngredient = ModRegistryObjects.ARROWS.get(i).get();
            Item itemResult = ModRegistryObjects.ARROWS.get(i + 1).get();

            ShapedRecipeBuilder.shaped(itemResult) // result
                    .define('#', itemIngredient) // ingredient
                    .pattern("###")
                    .pattern("###")
                    .pattern("###")
                    .unlockedBy("has_item", has(itemIngredient)) // ingredient
                    .save(consumer, new ResourceLocation("compressedblocks", "shaped_" + itemResult.getRegistryName().toString().replace("compressedblocks:", "").replace("minecraft:", "")));

            ShapelessRecipeBuilder.shapeless(itemIngredient, 9) // result, count
                    .requires(itemResult) // ingredient
                    .unlockedBy("has_item", has(itemResult))
                    .save(consumer, new ResourceLocation("compressedblocks", "shapeless_" + itemResult.getRegistryName().toString().replace("compressedblocks:", "").replace("minecraft:", "")));
        }
        for (int i = 0; i < ModRegistryObjects.BEETROOT.size() - 1; i++) {
            Item itemIngredient = ModRegistryObjects.BEETROOT.get(i).get();
            Item itemResult = ModRegistryObjects.BEETROOT.get(i + 1).get();

            ShapedRecipeBuilder.shaped(itemResult) // result
                    .define('#', itemIngredient) // ingredient
                    .pattern("###")
                    .pattern("###")
                    .pattern("###")
                    .unlockedBy("has_item", has(itemIngredient)) // ingredient
                    .save(consumer, new ResourceLocation("compressedblocks", "shaped_" + itemResult.getRegistryName().toString().replace("compressedblocks:", "").replace("minecraft:", "")));

            ShapelessRecipeBuilder.shapeless(itemIngredient, 9) // result, count
                    .requires(itemResult) // ingredient
                    .unlockedBy("has_item", has(itemResult))
                    .save(consumer, new ResourceLocation("compressedblocks", "shapeless_" + itemResult.getRegistryName().toString().replace("compressedblocks:", "").replace("minecraft:", "")));
        }
        for (int i = 0; i < ModRegistryObjects.BEETROOT_SEEDS.size() - 1; i++) {
            Item itemIngredient = ModRegistryObjects.BEETROOT_SEEDS.get(i).get();
            Item itemResult = ModRegistryObjects.BEETROOT_SEEDS.get(i + 1).get();

            ShapedRecipeBuilder.shaped(itemResult) // result
                    .define('#', itemIngredient) // ingredient
                    .pattern("###")
                    .pattern("###")
                    .pattern("###")
                    .unlockedBy("has_item", has(itemIngredient)) // ingredient
                    .save(consumer, new ResourceLocation("compressedblocks", "shaped_" + itemResult.getRegistryName().toString().replace("compressedblocks:", "").replace("minecraft:", "")));

            ShapelessRecipeBuilder.shapeless(itemIngredient, 9) // result, count
                    .requires(itemResult) // ingredient
                    .unlockedBy("has_item", has(itemResult))
                    .save(consumer, new ResourceLocation("compressedblocks", "shapeless_" + itemResult.getRegistryName().toString().replace("compressedblocks:", "").replace("minecraft:", "")));
        }
        for (int i = 0; i < ModRegistryObjects.BLAZE_POWDER.size() - 1; i++) {
            Item itemIngredient = ModRegistryObjects.BLAZE_POWDER.get(i).get();
            Item itemResult = ModRegistryObjects.BLAZE_POWDER.get(i + 1).get();

            ShapedRecipeBuilder.shaped(itemResult) // result
                    .define('#', itemIngredient) // ingredient
                    .pattern("###")
                    .pattern("###")
                    .pattern("###")
                    .unlockedBy("has_item", has(itemIngredient)) // ingredient
                    .save(consumer, new ResourceLocation("compressedblocks", "shaped_" + itemResult.getRegistryName().toString().replace("compressedblocks:", "").replace("minecraft:", "")));

            ShapelessRecipeBuilder.shapeless(itemIngredient, 9) // result, count
                    .requires(itemResult) // ingredient
                    .unlockedBy("has_item", has(itemResult))
                    .save(consumer, new ResourceLocation("compressedblocks", "shapeless_" + itemResult.getRegistryName().toString().replace("compressedblocks:", "").replace("minecraft:", "")));
        }
        for (int i = 0; i < ModRegistryObjects.BLAZE_RODS.size() - 1; i++) {
            Item itemIngredient = ModRegistryObjects.BLAZE_RODS.get(i).get();
            Item itemResult = ModRegistryObjects.BLAZE_RODS.get(i + 1).get();

            ShapedRecipeBuilder.shaped(itemResult) // result
                    .define('#', itemIngredient) // ingredient
                    .pattern("###")
                    .pattern("###")
                    .pattern("###")
                    .unlockedBy("has_item", has(itemIngredient)) // ingredient
                    .save(consumer, new ResourceLocation("compressedblocks", "shaped_" + itemResult.getRegistryName().toString().replace("compressedblocks:", "").replace("minecraft:", "")));

            ShapelessRecipeBuilder.shapeless(itemIngredient, 9) // result, count
                    .requires(itemResult) // ingredient
                    .unlockedBy("has_item", has(itemResult))
                    .save(consumer, new ResourceLocation("compressedblocks", "shapeless_" + itemResult.getRegistryName().toString().replace("compressedblocks:", "").replace("minecraft:", "")));
        }
        for (int i = 0; i < ModRegistryObjects.BONES.size() - 1; i++) {
            Item itemIngredient = ModRegistryObjects.BONES.get(i).get();
            Item itemResult = ModRegistryObjects.BONES.get(i + 1).get();

            ShapedRecipeBuilder.shaped(itemResult) // result
                    .define('#', itemIngredient) // ingredient
                    .pattern("###")
                    .pattern("###")
                    .pattern("###")
                    .unlockedBy("has_item", has(itemIngredient)) // ingredient
                    .save(consumer, new ResourceLocation("compressedblocks", "shaped_" + itemResult.getRegistryName().toString().replace("compressedblocks:", "").replace("minecraft:", "")));

            ShapelessRecipeBuilder.shapeless(itemIngredient, 9) // result, count
                    .requires(itemResult) // ingredient
                    .unlockedBy("has_item", has(itemResult))
                    .save(consumer, new ResourceLocation("compressedblocks", "shapeless_" + itemResult.getRegistryName().toString().replace("compressedblocks:", "").replace("minecraft:", "")));
        }
        for (int i = 0; i < ModRegistryObjects.CARROTS.size() - 1; i++) {
            Item itemIngredient = ModRegistryObjects.CARROTS.get(i).get();
            Item itemResult = ModRegistryObjects.CARROTS.get(i + 1).get();

            ShapedRecipeBuilder.shaped(itemResult) // result
                    .define('#', itemIngredient) // ingredient
                    .pattern("###")
                    .pattern("###")
                    .pattern("###")
                    .unlockedBy("has_item", has(itemIngredient)) // ingredient
                    .save(consumer, new ResourceLocation("compressedblocks", "shaped_" + itemResult.getRegistryName().toString().replace("compressedblocks:", "").replace("minecraft:", "")));

            ShapelessRecipeBuilder.shapeless(itemIngredient, 9) // result, count
                    .requires(itemResult) // ingredient
                    .unlockedBy("has_item", has(itemResult))
                    .save(consumer, new ResourceLocation("compressedblocks", "shapeless_" + itemResult.getRegistryName().toString().replace("compressedblocks:", "").replace("minecraft:", "")));
        }
        for (int i = 0; i < ModRegistryObjects.EGGS.size() - 1; i++) {
            Item itemIngredient = ModRegistryObjects.EGGS.get(i).get();
            Item itemResult = ModRegistryObjects.EGGS.get(i + 1).get();

            ShapedRecipeBuilder.shaped(itemResult) // result
                    .define('#', itemIngredient) // ingredient
                    .pattern("###")
                    .pattern("###")
                    .pattern("###")
                    .unlockedBy("has_item", has(itemIngredient)) // ingredient
                    .save(consumer, new ResourceLocation("compressedblocks", "shaped_" + itemResult.getRegistryName().toString().replace("compressedblocks:", "").replace("minecraft:", "")));

            ShapelessRecipeBuilder.shapeless(itemIngredient, 9) // result, count
                    .requires(itemResult) // ingredient
                    .unlockedBy("has_item", has(itemResult))
                    .save(consumer, new ResourceLocation("compressedblocks", "shapeless_" + itemResult.getRegistryName().toString().replace("compressedblocks:", "").replace("minecraft:", "")));
        }
        for (int i = 0; i < ModRegistryObjects.ENDER_EYES.size() - 1; i++) {
            Item itemIngredient = ModRegistryObjects.ENDER_EYES.get(i).get();
            Item itemResult = ModRegistryObjects.ENDER_EYES.get(i + 1).get();

            ShapedRecipeBuilder.shaped(itemResult) // result
                    .define('#', itemIngredient) // ingredient
                    .pattern("###")
                    .pattern("###")
                    .pattern("###")
                    .unlockedBy("has_item", has(itemIngredient)) // ingredient
                    .save(consumer, new ResourceLocation("compressedblocks", "shaped_" + itemResult.getRegistryName().toString().replace("compressedblocks:", "").replace("minecraft:", "")));

            ShapelessRecipeBuilder.shapeless(itemIngredient, 9) // result, count
                    .requires(itemResult) // ingredient
                    .unlockedBy("has_item", has(itemResult))
                    .save(consumer, new ResourceLocation("compressedblocks", "shapeless_" + itemResult.getRegistryName().toString().replace("compressedblocks:", "").replace("minecraft:", "")));
        }
        for (int i = 0; i < ModRegistryObjects.ENDER_PEARLS.size() - 1; i++) {
            Item itemIngredient = ModRegistryObjects.ENDER_PEARLS.get(i).get();
            Item itemResult = ModRegistryObjects.ENDER_PEARLS.get(i + 1).get();

            ShapedRecipeBuilder.shaped(itemResult) // result
                    .define('#', itemIngredient) // ingredient
                    .pattern("###")
                    .pattern("###")
                    .pattern("###")
                    .unlockedBy("has_item", has(itemIngredient)) // ingredient
                    .save(consumer, new ResourceLocation("compressedblocks", "shaped_" + itemResult.getRegistryName().toString().replace("compressedblocks:", "").replace("minecraft:", "")));

            ShapelessRecipeBuilder.shapeless(itemIngredient, 9) // result, count
                    .requires(itemResult) // ingredient
                    .unlockedBy("has_item", has(itemResult))
                    .save(consumer, new ResourceLocation("compressedblocks", "shapeless_" + itemResult.getRegistryName().toString().replace("compressedblocks:", "").replace("minecraft:", "")));
        }
        for (int i = 0; i < ModRegistryObjects.FEATHERS.size() - 1; i++) {
            Item itemIngredient = ModRegistryObjects.FEATHERS.get(i).get();
            Item itemResult = ModRegistryObjects.FEATHERS.get(i + 1).get();

            ShapedRecipeBuilder.shaped(itemResult) // result
                    .define('#', itemIngredient) // ingredient
                    .pattern("###")
                    .pattern("###")
                    .pattern("###")
                    .unlockedBy("has_item", has(itemIngredient)) // ingredient
                    .save(consumer, new ResourceLocation("compressedblocks", "shaped_" + itemResult.getRegistryName().toString().replace("compressedblocks:", "").replace("minecraft:", "")));

            ShapelessRecipeBuilder.shapeless(itemIngredient, 9) // result, count
                    .requires(itemResult) // ingredient
                    .unlockedBy("has_item", has(itemResult))
                    .save(consumer, new ResourceLocation("compressedblocks", "shapeless_" + itemResult.getRegistryName().toString().replace("compressedblocks:", "").replace("minecraft:", "")));
        }
        for (int i = 0; i < ModRegistryObjects.LEATHER.size() - 1; i++) {
            Item itemIngredient = ModRegistryObjects.LEATHER.get(i).get();
            Item itemResult = ModRegistryObjects.LEATHER.get(i + 1).get();

            ShapedRecipeBuilder.shaped(itemResult) // result
                    .define('#', itemIngredient) // ingredient
                    .pattern("###")
                    .pattern("###")
                    .pattern("###")
                    .unlockedBy("has_item", has(itemIngredient)) // ingredient
                    .save(consumer, new ResourceLocation("compressedblocks", "shaped_" + itemResult.getRegistryName().toString().replace("compressedblocks:", "").replace("minecraft:", "")));

            ShapelessRecipeBuilder.shapeless(itemIngredient, 9) // result, count
                    .requires(itemResult) // ingredient
                    .unlockedBy("has_item", has(itemResult))
                    .save(consumer, new ResourceLocation("compressedblocks", "shapeless_" + itemResult.getRegistryName().toString().replace("compressedblocks:", "").replace("minecraft:", "")));
        }
        for (int i = 0; i < ModRegistryObjects.MELONS.size() - 1; i++) {
            Item itemIngredient = ModRegistryObjects.MELONS.get(i).get();
            Item itemResult = ModRegistryObjects.MELONS.get(i + 1).get();

            ShapedRecipeBuilder.shaped(itemResult) // result
                    .define('#', itemIngredient) // ingredient
                    .pattern("###")
                    .pattern("###")
                    .pattern("###")
                    .unlockedBy("has_item", has(itemIngredient)) // ingredient
                    .save(consumer, new ResourceLocation("compressedblocks", "shaped_" + itemResult.getRegistryName().toString().replace("compressedblocks:", "").replace("minecraft:", "")));

            ShapelessRecipeBuilder.shapeless(itemIngredient, 9) // result, count
                    .requires(itemResult) // ingredient
                    .unlockedBy("has_item", has(itemResult))
                    .save(consumer, new ResourceLocation("compressedblocks", "shapeless_" + itemResult.getRegistryName().toString().replace("compressedblocks:", "").replace("minecraft:", "")));
        }
        for (int i = 0; i < ModRegistryObjects.POTATOES.size() - 1; i++) {
            Item itemIngredient = ModRegistryObjects.POTATOES.get(i).get();
            Item itemResult = ModRegistryObjects.POTATOES.get(i + 1).get();

            ShapedRecipeBuilder.shaped(itemResult) // result
                    .define('#', itemIngredient) // ingredient
                    .pattern("###")
                    .pattern("###")
                    .pattern("###")
                    .unlockedBy("has_item", has(itemIngredient)) // ingredient
                    .save(consumer, new ResourceLocation("compressedblocks", "shaped_" + itemResult.getRegistryName().toString().replace("compressedblocks:", "").replace("minecraft:", "")));

            ShapelessRecipeBuilder.shapeless(itemIngredient, 9) // result, count
                    .requires(itemResult) // ingredient
                    .unlockedBy("has_item", has(itemResult))
                    .save(consumer, new ResourceLocation("compressedblocks", "shapeless_" + itemResult.getRegistryName().toString().replace("compressedblocks:", "").replace("minecraft:", "")));
        }
        for (int i = 0; i < ModRegistryObjects.SUGAR_CANE.size() - 1; i++) {
            Item itemIngredient = ModRegistryObjects.SUGAR_CANE.get(i).get();
            Item itemResult = ModRegistryObjects.SUGAR_CANE.get(i + 1).get();

            ShapedRecipeBuilder.shaped(itemResult) // result
                    .define('#', itemIngredient) // ingredient
                    .pattern("###")
                    .pattern("###")
                    .pattern("###")
                    .unlockedBy("has_item", has(itemIngredient)) // ingredient
                    .save(consumer, new ResourceLocation("compressedblocks", "shaped_" + itemResult.getRegistryName().toString().replace("compressedblocks:", "").replace("minecraft:", "")));

            ShapelessRecipeBuilder.shapeless(itemIngredient, 9) // result, count
                    .requires(itemResult) // ingredient
                    .unlockedBy("has_item", has(itemResult))
                    .save(consumer, new ResourceLocation("compressedblocks", "shapeless_" + itemResult.getRegistryName().toString().replace("compressedblocks:", "").replace("minecraft:", "")));
        }
        for (int i = 0; i < ModRegistryObjects.MELON_SEEDS.size() - 1; i++) {
            Item itemIngredient = ModRegistryObjects.MELON_SEEDS.get(i).get();
            Item itemResult = ModRegistryObjects.MELON_SEEDS.get(i + 1).get();

            ShapedRecipeBuilder.shaped(itemResult) // result
                    .define('#', itemIngredient) // ingredient
                    .pattern("###")
                    .pattern("###")
                    .pattern("###")
                    .unlockedBy("has_item", has(itemIngredient)) // ingredient
                    .save(consumer, new ResourceLocation("compressedblocks", "shaped_" + itemResult.getRegistryName().toString().replace("compressedblocks:", "").replace("minecraft:", "")));

            ShapelessRecipeBuilder.shapeless(itemIngredient, 9) // result, count
                    .requires(itemResult) // ingredient
                    .unlockedBy("has_item", has(itemResult))
                    .save(consumer, new ResourceLocation("compressedblocks", "shapeless_" + itemResult.getRegistryName().toString().replace("compressedblocks:", "").replace("minecraft:", "")));
        }
        for (int i = 0; i < ModRegistryObjects.PUMPKIN.size() - 1; i++) {
            Item itemIngredient = ModRegistryObjects.PUMPKIN.get(i).get();
            Item itemResult = ModRegistryObjects.PUMPKIN.get(i + 1).get();

            ShapedRecipeBuilder.shaped(itemResult) // result
                    .define('#', itemIngredient) // ingredient
                    .pattern("###")
                    .pattern("###")
                    .pattern("###")
                    .unlockedBy("has_item", has(itemIngredient)) // ingredient
                    .save(consumer, new ResourceLocation("compressedblocks", "shaped_" + itemResult.getRegistryName().toString().replace("compressedblocks:", "").replace("minecraft:", "")));

            ShapelessRecipeBuilder.shapeless(itemIngredient, 9) // result, count
                    .requires(itemResult) // ingredient
                    .unlockedBy("has_item", has(itemResult))
                    .save(consumer, new ResourceLocation("compressedblocks", "shapeless_" + itemResult.getRegistryName().toString().replace("compressedblocks:", "").replace("minecraft:", "")));
        }
        for (int i = 0; i < ModRegistryObjects.PUMPKIN_SEEDS.size() - 1; i++) {
            Item itemIngredient = ModRegistryObjects.PUMPKIN_SEEDS.get(i).get();
            Item itemResult = ModRegistryObjects.PUMPKIN_SEEDS.get(i + 1).get();

            ShapedRecipeBuilder.shaped(itemResult) // result
                    .define('#', itemIngredient) // ingredient
                    .pattern("###")
                    .pattern("###")
                    .pattern("###")
                    .unlockedBy("has_item", has(itemIngredient)) // ingredient
                    .save(consumer, new ResourceLocation("compressedblocks", "shaped_" + itemResult.getRegistryName().toString().replace("compressedblocks:", "").replace("minecraft:", "")));

            ShapelessRecipeBuilder.shapeless(itemIngredient, 9) // result, count
                    .requires(itemResult) // ingredient
                    .unlockedBy("has_item", has(itemResult))
                    .save(consumer, new ResourceLocation("compressedblocks", "shapeless_" + itemResult.getRegistryName().toString().replace("compressedblocks:", "").replace("minecraft:", "")));
        }
        for (int i = 0; i < ModRegistryObjects.WHEAT_SEEDS.size() - 1; i++) {
            Item itemIngredient = ModRegistryObjects.WHEAT_SEEDS.get(i).get();
            Item itemResult = ModRegistryObjects.WHEAT_SEEDS.get(i + 1).get();

            ShapedRecipeBuilder.shaped(itemResult) // result
                    .define('#', itemIngredient) // ingredient
                    .pattern("###")
                    .pattern("###")
                    .pattern("###")
                    .unlockedBy("has_item", has(itemIngredient)) // ingredient
                    .save(consumer, new ResourceLocation("compressedblocks", "shaped_" + itemResult.getRegistryName().toString().replace("compressedblocks:", "").replace("minecraft:", "")));

            ShapelessRecipeBuilder.shapeless(itemIngredient, 9) // result, count
                    .requires(itemResult) // ingredient
                    .unlockedBy("has_item", has(itemResult))
                    .save(consumer, new ResourceLocation("compressedblocks", "shapeless_" + itemResult.getRegistryName().toString().replace("compressedblocks:", "").replace("minecraft:", "")));
        }
        for (int i = 0; i < ModRegistryObjects.SPIDER_EYES.size() - 1; i++) {
            Item itemIngredient = ModRegistryObjects.SPIDER_EYES.get(i).get();
            Item itemResult = ModRegistryObjects.SPIDER_EYES.get(i + 1).get();

            ShapedRecipeBuilder.shaped(itemResult) // result
                    .define('#', itemIngredient) // ingredient
                    .pattern("###")
                    .pattern("###")
                    .pattern("###")
                    .unlockedBy("has_item", has(itemIngredient)) // ingredient
                    .save(consumer, new ResourceLocation("compressedblocks", "shaped_" + itemResult.getRegistryName().toString().replace("compressedblocks:", "").replace("minecraft:", "")));

            ShapelessRecipeBuilder.shapeless(itemIngredient, 9) // result, count
                    .requires(itemResult) // ingredient
                    .unlockedBy("has_item", has(itemResult))
                    .save(consumer, new ResourceLocation("compressedblocks", "shapeless_" + itemResult.getRegistryName().toString().replace("compressedblocks:", "").replace("minecraft:", "")));
        }
        for (int i = 0; i < ModRegistryObjects.STRINGS.size() - 1; i++) {
            Item itemIngredient = ModRegistryObjects.STRINGS.get(i).get();
            Item itemResult = ModRegistryObjects.STRINGS.get(i + 1).get();

            ShapedRecipeBuilder.shaped(itemResult) // result
                    .define('#', itemIngredient) // ingredient
                    .pattern("###")
                    .pattern("###")
                    .pattern("###")
                    .unlockedBy("has_item", has(itemIngredient)) // ingredient
                    .save(consumer, new ResourceLocation("compressedblocks", "shaped_" + itemResult.getRegistryName().toString().replace("compressedblocks:", "").replace("minecraft:", "")));

            ShapelessRecipeBuilder.shapeless(itemIngredient, 9) // result, count
                    .requires(itemResult) // ingredient
                    .unlockedBy("has_item", has(itemResult))
                    .save(consumer, new ResourceLocation("compressedblocks", "shapeless_" + itemResult.getRegistryName().toString().replace("compressedblocks:", "").replace("minecraft:", "")));
        }
        for (int i = 0; i < ModRegistryObjects.STICKS.size() - 1; i++) {
            Item itemIngredient = ModRegistryObjects.STICKS.get(i).get();
            Item itemResult = ModRegistryObjects.STICKS.get(i + 1).get();

            ShapedRecipeBuilder.shaped(itemResult) // result
                    .define('#', itemIngredient) // ingredient
                    .pattern("###")
                    .pattern("###")
                    .pattern("###")
                    .unlockedBy("has_item", has(itemIngredient)) // ingredient
                    .save(consumer, new ResourceLocation("compressedblocks", "shaped_" + itemResult.getRegistryName().toString().replace("compressedblocks:", "").replace("minecraft:", "")));

            ShapelessRecipeBuilder.shapeless(itemIngredient, 9) // result, count
                    .requires(itemResult) // ingredient
                    .unlockedBy("has_item", has(itemResult))
                    .save(consumer, new ResourceLocation("compressedblocks", "shapeless_" + itemResult.getRegistryName().toString().replace("compressedblocks:", "").replace("minecraft:", "")));
        }
        for (int i = 0; i < ModRegistryObjects.SUGAR.size() - 1; i++) {
            Item itemIngredient = ModRegistryObjects.SUGAR.get(i).get();
            Item itemResult = ModRegistryObjects.SUGAR.get(i + 1).get();

            ShapedRecipeBuilder.shaped(itemResult) // result
                    .define('#', itemIngredient) // ingredient
                    .pattern("###")
                    .pattern("###")
                    .pattern("###")
                    .unlockedBy("has_item", has(itemIngredient)) // ingredient
                    .save(consumer, new ResourceLocation("compressedblocks", "shaped_" + itemResult.getRegistryName().toString().replace("compressedblocks:", "").replace("minecraft:", "")));

            ShapelessRecipeBuilder.shapeless(itemIngredient, 9) // result, count
                    .requires(itemResult) // ingredient
                    .unlockedBy("has_item", has(itemResult))
                    .save(consumer, new ResourceLocation("compressedblocks", "shapeless_" + itemResult.getRegistryName().toString().replace("compressedblocks:", "").replace("minecraft:", "")));
        }
    }
}