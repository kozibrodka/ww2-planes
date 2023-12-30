package net.kozibrodka.planes.gui;

import net.minecraft.client.gui.screen.container.ContainerBase;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.level.Level;
import org.lwjgl.opengl.GL11;

public class GuiPlaneCrafting extends ContainerBase
{

    public GuiPlaneCrafting(PlayerInventory inventoryplayer, Level world, int i, int j, int k)
    {
        super(new CraftingInventoryPlane(inventoryplayer, world, i, j, k));
    }

    public void onClose()
    {
        super.onClose();
        container.onClosed(minecraft.player);
    }

    protected void renderForeground()
    {
        textManager.drawText("Plane Crafting", 28, 6, 0x404040);
        textManager.drawText("Inventory", 8, (containerHeight - 96) + 2, 0x404040);
    }

    protected void renderContainerBackground(float f)
    {
        int i = minecraft.textureManager.getTextureId("/assets/planes/stationapi/textures/gui/planeCrafting.png");
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        minecraft.textureManager.bindTexture(i);
        int j = (width - containerWidth) / 2;
        int k = (height - containerHeight) / 2;
        blit(j, k, 0, 0, containerWidth, containerHeight);
    }
}
