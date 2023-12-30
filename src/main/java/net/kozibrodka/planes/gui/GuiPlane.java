package net.kozibrodka.planes.gui;
import net.kozibrodka.planes.entity.EntityPlane;
import net.minecraft.client.gui.screen.container.ContainerBase;
import net.minecraft.entity.player.PlayerInventory;
import org.lwjgl.opengl.GL11;

public class GuiPlane extends ContainerBase
{

    public GuiPlane(PlayerInventory inventoryplayer, EntityPlane entityplane)
    {
        super(new InventoryPlane(inventoryplayer, entityplane));
        plane = entityplane;
    }

    protected void renderForeground()
    {
        textManager.drawText(plane.plane.name, 60, 6, 0x404040);
        textManager.drawText("Inventory", 8, (containerHeight - 96) + 2, 0x404040);
        if(plane.plane.numCargoSlots > 0)
        {
            textManager.drawText("Cargo:", 36, 22, 0x404040);
        }
        if(plane.plane.numBulletSlots > 0)
        {
            textManager.drawText("Bullets:", 36, 40, 0x404040);
        }
        if(plane.plane.numBombSlots > 0)
        {
            textManager.drawText("Bombs:", 36, 58, 0x404040);
        }
        //addon
        if(plane.plane.numRocketSlots > 0)
        {
            textManager.drawText("Rockets:", 36, 22, 0x404040);
        }
        //addon
    }

    protected void renderContainerBackground(float f)
    {
        int i = minecraft.textureManager.getTextureId("/assets/ofensywa/stationapi/textures/item/ww2/plane.png");
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        minecraft.textureManager.bindTexture(i);
        int j = (width - containerWidth) / 2;
        int k = (height - containerHeight) / 2;
        blit(j, k, 0, 0, containerWidth, containerHeight);
        if(plane.isFuelled())
        {
            int l = plane.getBurnTimeRemainingScaled(12);
            blit(j + 8, (k + 36 + 12) - l, 176, 12 - l, 14, l + 2);
        }
        if(plane.plane.numRocketSlots > 0)
        {
            for(int i1 = plane.plane.numRocketSlots; i1 < 5; i1++)
            {
                blit(j + 79 + 18 * i1, k + 17, 190, 0, 18, 18);
            }
        }else {
            for (int i1 = plane.plane.numCargoSlots; i1 < 5; i1++) {
                blit(j + 79 + 18 * i1, k + 17, 190, 0, 18, 18);
            }
        }

        for(int j1 = plane.plane.numBulletSlots; j1 < 5; j1++)
        {
            blit(j + 79 + 18 * j1, k + 35, 190, 0, 18, 18);
        }

        for(int k1 = plane.plane.numBombSlots; k1 < 5; k1++)
        {
            blit(j + 79 + 18 * k1, k + 53, 190, 0, 18, 18);
        }
        //addon
//        for(int i1 = plane.plane.numRocketSlots; i1 < 5; i1++)
//        {
//            blit(j + 79 + 18 * i1, k + 17, 190, 0, 18, 18);
//        }
        //addon
    }

    private EntityPlane plane;
}
