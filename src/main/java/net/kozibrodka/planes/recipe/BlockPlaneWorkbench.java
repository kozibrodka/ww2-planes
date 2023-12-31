package net.kozibrodka.planes.recipe;

import net.fabricmc.loader.api.FabricLoader;
import net.kozibrodka.planes.events.TextureListener;
import net.kozibrodka.planes.gui.GuiPlaneCrafting;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.PlayerBase;
import net.minecraft.level.Level;
import net.modificationstation.stationapi.api.util.Identifier;
import net.modificationstation.stationapi.api.template.block.TemplateBlock;

public class BlockPlaneWorkbench extends TemplateBlock
{

    public BlockPlaneWorkbench(Identifier i)
    {
        super(i, Material.METAL);
    }

    public boolean canUse(Level world, int i, int j, int k, PlayerBase entityplayer)
    {
        if(world.isServerSide)
        {
            return true;
        } else
        {
            ((Minecraft) FabricLoader.getInstance().getGameInstance()).openScreen(new GuiPlaneCrafting(entityplayer.inventory, world, i, j, k));
            return true;
        }
    }

    public int getTextureForSide(int i)
    {
        if(i == 1)
        {
            return TextureListener.plane_work_top;
        }else
        if(i == 0)
        {
            return TextureListener.plane_work_bottom;
        }else
        {
            return TextureListener.plane_work_side;
        }
    }

}
