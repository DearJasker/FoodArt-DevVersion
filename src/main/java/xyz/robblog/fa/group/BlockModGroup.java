package xyz.robblog.fa.group;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import xyz.robblog.fa.register.ItemRegistry;

import javax.annotation.Nonnull;

public class BlockModGroup extends ItemGroup {
    public BlockModGroup(){
        super("blockgroup");
    }
    @Override @Nonnull
    public ItemStack createIcon(){
        return new ItemStack(ItemRegistry.oilBlock.get());
    }
}