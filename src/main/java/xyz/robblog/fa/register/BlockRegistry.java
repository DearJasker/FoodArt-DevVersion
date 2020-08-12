package xyz.robblog.fa.register;

import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import xyz.robblog.fa.block.OilBlock;
import xyz.robblog.fa.item.OilIngot;

public abstract class BlockRegistry {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, "fa");

    public static RegistryObject<Block> oilBlock = BLOCKS.register("block_oil_block", OilBlock::new); //油块

}