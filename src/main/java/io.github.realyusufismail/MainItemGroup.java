package io.github.realyusufismail;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class MainItemGroup extends CreativeModeTab {

    public static final MainItemGroup MAIN = new MainItemGroup(CreativeModeTab.TABS.length, "main");

    public MainItemGroup(int length, String label) {
        super(length, label);
    }

    @Override
    public ItemStack makeIcon() {
        return null;
    }
}
