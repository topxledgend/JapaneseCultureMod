package com.topxledgend.JapaneseCultureMod.creativetab;

import com.topxledgend.JapaneseCultureMod.init.ModBlocks;
import com.topxledgend.JapaneseCultureMod.reference.Reference;
import com.topxledgend.JapaneseCultureMod.init.ModItems;
import com.topxledgend.JapaneseCultureMod.reference.Reference;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import scala.tools.nsc.doc.model.Public;

import static com.topxledgend.JapaneseCultureMod.init.ModBlocks.Tatami;


public class CreativeTabJCM
{
    public static final CreativeTabs JCM_TAB;

    static {
        JCM_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase()) {

            @Override
            public Item getTabIconItem() {
                return ModItems.Onigiri;
            }
        };
    }
}
