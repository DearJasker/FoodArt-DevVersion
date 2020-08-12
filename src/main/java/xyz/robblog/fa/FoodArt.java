package xyz.robblog.fa;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("fa")
public class FoodArt {
    public FoodArt() {
        xyz.robblog.fa.register.OilIngotItemRegistry.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
