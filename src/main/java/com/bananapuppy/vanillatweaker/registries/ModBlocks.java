package com.bananapuppy.vanillatweaker.registries;

import com.bananapuppy.vanillatweaker.VanillaTweaker;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks
{
    public static final Block CHARCOAL_BLOCK = new Block(
            FabricBlockSettings.create()
                    .resistance(6.0f)
                    .hardness(5.0f)
                    .burnable()
                    .requiresTool()
    );

    public static void registerModBlocks()
    {
        registerBlock("charcoal_block", CHARCOAL_BLOCK);
    }

    public static void registerBlock(String name, Block block)
    {
        Registry.register(Registries.BLOCK, new Identifier(VanillaTweaker.MOD_ID, name), block);
    }
}
