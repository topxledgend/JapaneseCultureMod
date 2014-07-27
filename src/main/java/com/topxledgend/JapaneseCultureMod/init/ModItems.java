package com.topxledgend.JapaneseCultureMod.init;

import com.topxledgend.JapaneseCultureMod.item.ItemJCM;
import com.topxledgend.JapaneseCultureMod.item.ItemOnigiri;
import com.topxledgend.JapaneseCultureMod.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    public static final ItemJCM Onigiri = new ItemOnigiri();

    public static void init()
    {
        GameRegistry.registerItem(Onigiri, "Onigiri");
    }
}
