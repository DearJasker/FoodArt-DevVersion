package xyz.robblog.fa.register;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import xyz.robblog.fa.block.OilBlock;
import xyz.robblog.fa.item.OilIngot;

public abstract class ItemRegistry {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, "fa");

    public static RegistryObject<Item> oilIngot = ITEMS.register("item_oil_ingot", OilIngot::new); //油锭

    public static RegistryObject<Item> oilBlock = ITEMS.register("block_oil_block",() -> new BlockItem(BlockRegistry.oilBlock.get(), new Item.Properties().group(GroupRegistry.blockModGroup))); //油块
}