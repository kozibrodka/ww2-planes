package net.kozibrodka.planes.gui;

import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.world.World;
import org.lwjgl.opengl.GL11;

public class GuiPlaneCrafting extends HandledScreen
{

    public GuiPlaneCrafting(PlayerInventory inventoryplayer, World world, int i, int j, int k)
    {
        super(new CraftingInventoryPlane(inventoryplayer, world, i, j, k));
    }

    public void removed()
    {
        super.removed();
        handler.onClosed(minecraft.player);
    }

    protected void drawForeground()
    {
        textRenderer.draw("Plane Crafting", 28, 6, 0x404040);
        textRenderer.draw("Inventory", 8, (backgroundHeight - 96) + 2, 0x404040);
    }

    protected void drawBackground(float f)
    {
        int i = minecraft.textureManager.getTextureId("/assets/planes/stationapi/textures/gui/planeCrafting.png");
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        minecraft.textureManager.bindTexture(i);
        int j = (width - backgroundWidth) / 2;
        int k = (height - backgroundHeight) / 2;
        drawTexture(j, k, 0, 0, backgroundWidth, backgroundHeight);
    }
}
