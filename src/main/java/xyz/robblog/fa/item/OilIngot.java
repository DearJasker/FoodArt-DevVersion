package xyz.robblog.fa.item;

import net.minecraft.item.Item;
import xyz.robblog.fa.register.GroupRegistry;

public class OilIngot extends Item {
    public OilIngot() {
        super(new Properties().group(GroupRegistry.itemModGroup));
    }
}