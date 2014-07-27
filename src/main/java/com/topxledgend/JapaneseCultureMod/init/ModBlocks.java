package com.topxledgend.JapaneseCultureMod.init;

import com.topxledgend.JapaneseCultureMod.block.BlockJCM;
import com.topxledgend.JapaneseCultureMod.block.BlockTatami;
import com.topxledgend.JapaneseCultureMod.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
    public static final BlockJCM tatami= new BlockTatami();

    public static void init()
    {
        GameRegistry.registerBlock (tatami, "Tatami");
    }
}
