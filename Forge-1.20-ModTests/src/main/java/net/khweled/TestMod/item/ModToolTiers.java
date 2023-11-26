package net.khweled.TestMod.item;

import net.khweled.TestMod.TestMod;
import net.khweled.TestMod.util.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTiers {
    public static final Tier BRONZE = TierSortingRegistry.registerTier(
            new ForgeTier(2, 1000, 7f, 2.5f, 20,
                    ModTags.Blocks.NEEDS_BRONZE_TOOL, () -> Ingredient.of(ModItems.BRONZE_INGOT.get())),
            new ResourceLocation(TestMod.MOD_ID, "bronze"), List.of(Tiers.IRON), List.of(Tiers.DIAMOND));

}
