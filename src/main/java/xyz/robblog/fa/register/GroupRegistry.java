package xyz.robblog.fa.register;

import net.minecraft.item.ItemGroup;
import xyz.robblog.fa.group.BlockModGroup;
import xyz.robblog.fa.group.ItemModGroup;

public abstract class GroupRegistry {
    public static ItemGroup itemModGroup = new ItemModGroup();
    public static ItemGroup blockModGroup = new BlockModGroup();
}