package com.lspaddle.am.client.gui;

import com.lspaddle.am.handler.ConfigurationHandler;
import com.lspaddle.am.reference.Reference;
import cpw.mods.fml.client.config.GuiConfig;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;

public class ModGuiConfig extends GuiConfig
{
    public ModGuiConfig(GuiScreen guiScreen)
    {
        super(guiScreen,
                new ConfigElement(ConfigurationHandler.configuration.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(),//all parts of that category
                Reference.MOD_ID,//mod ID
                false,//world restart
                false,//mc restart
                GuiConfig.getAbridgedConfigPath(ConfigurationHandler.configuration.toString()));//this last line is the title
    }
}
