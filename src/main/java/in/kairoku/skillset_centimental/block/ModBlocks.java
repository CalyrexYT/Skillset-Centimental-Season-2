package in.kairoku.skillset_centimental.block;

import in.kairoku.skillset_centimental.SkillsetCentimental;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.block.Block;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block CHORUS_ORE = registerBlock("chorus_ore", new Block(FabricBlockSettings.copyOf(Blocks.ANCIENT_DEBRIS).hardness(100.0f)));
    private static Block registerBlock(String name, Block block){
        registerBlocksItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(SkillsetCentimental.MOD_ID, name), block);
    }
    private static Item registerBlocksItem(String name, Block block){
        return Registry.register(Registries.ITEM, new Identifier(SkillsetCentimental.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }
    public static void registerModBlocks(){
        SkillsetCentimental.LOGGER.info("Registering ModBlocks for " + SkillsetCentimental.MOD_ID);
    }
}
