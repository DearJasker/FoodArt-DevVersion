package xyz.robblog.fa.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class OilBlock extends Block {
    public OilBlock(){
        super(Properties.create(Material.ROCK)
                .hardnessAndResistance(3)
                .harvestTool(ToolType.get("pickaxe"))
                .harvestLevel(3));
    }
}