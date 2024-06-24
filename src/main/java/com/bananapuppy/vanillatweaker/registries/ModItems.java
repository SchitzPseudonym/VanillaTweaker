package com.bananapuppy.vanillatweaker.registries;

import com.bananapuppy.vanillatweaker.VanillaTweaker;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems
{
    public static final Item CHARCOAL_BLOCK = registerItem("charcoal_block",
            new BlockItem(ModBlocks.CHARCOAL_BLOCK, new FabricItemSettings())
    );

    public static void registerModItems()
    {
        // Coal Block
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {
            content.addBefore(Items.COAL_BLOCK, CHARCOAL_BLOCK);
            content.add(CHARCOAL_BLOCK);
        });
        //"value" is in ticks, 200 ticks seems to be "equal to 1 item"
        FuelRegistry.INSTANCE.add(CHARCOAL_BLOCK, 80 * 200);
    }

    public static Item registerItem(String name, Item item)
    {
        return Registry.register(Registries.ITEM, new Identifier(VanillaTweaker.MOD_ID, name), item);
    }
}
