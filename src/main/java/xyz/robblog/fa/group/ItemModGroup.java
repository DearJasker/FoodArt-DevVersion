package xyz.robblog.fa.group;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import xyz.robblog.fa.register.ItemRegistry;

import javax.annotation.Nonnull;

public class ItemModGroup extends ItemGroup {
    public ItemModGroup(){
        super("itemgroup");
    }
    @Override @Nonnull
    public ItemStack createIcon(){
        return new ItemStack(ItemRegistry.oilIngot.get());
    }
}