package com.lspaddle.am.init;

import com.lspaddle.am.item.ItemAM;
import com.lspaddle.am.item.ItemPDA;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems
{
    public static final ItemAM PDA = new ItemPDA();

    public static void init()
    {
        GameRegistry.registerItem(PDA, "PDA");
    }
}
