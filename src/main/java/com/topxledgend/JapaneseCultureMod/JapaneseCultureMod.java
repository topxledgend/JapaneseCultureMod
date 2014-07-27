package com.topxledgend.JapaneseCultureMod;

import  com.topxledgend.JapaneseCultureMod.handler.ConfigurationHandler;
import  com.topxledgend.JapaneseCultureMod.init.ModBlocks;
import com.topxledgend.JapaneseCultureMod.init.ModItems;
import  com.topxledgend.JapaneseCultureMod.proxy.IProxy;
import com.topxledgend.JapaneseCultureMod.reference.Reference;
import  com.topxledgend.JapaneseCultureMod.utility.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = com.topxledgend.JapaneseCultureMod.reference.Reference.MOD_ID, name = com.topxledgend.JapaneseCultureMod.reference.Reference.MOD_NAME, version = Reference.VERSION, guiFactory = com.topxledgend.JapaneseCultureMod.reference.Reference.GUI_FACTORY_CLASS)
public class JapaneseCultureMod
{
    @Mod.Instance(com.topxledgend.JapaneseCultureMod.reference.Reference.MOD_ID)
    public static JapaneseCultureMod instance;

    @SidedProxy(clientSide = com.topxledgend.JapaneseCultureMod.reference.Reference.CLIENT_PROXY_CLASS, serverSide = com.topxledgend.JapaneseCultureMod.reference.Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
        LogHelper.info("Pre Initialization Complete!");

        ModItems.init();

        ModBlocks.init();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        LogHelper.info("Initialization Complete!");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        LogHelper.info("Post Initialization Complete!");
    }
}
