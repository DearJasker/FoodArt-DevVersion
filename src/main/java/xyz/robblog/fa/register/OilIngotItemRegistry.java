package xyz.robblog.fa.register;

import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import xyz.robblog.fa.item.OilIngot;

public class OilIngotItemRegistry {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, "fa");
    public static RegistryObject<Item> oilIngot = ITEMS.register("item_oil_ingot", OilIngot::new);
}
