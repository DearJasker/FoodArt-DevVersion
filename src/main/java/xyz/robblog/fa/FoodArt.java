package xyz.robblog.fa;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("fa")
public class FoodArt {
    public FoodArt() {
        xyz.robblog.fa.register.ItemRegistry.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus()); //物品注册
        xyz.robblog.fa.register.BlockRegistry.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus()); //方块注册
    }
}
