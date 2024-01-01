package net.kozibrodka.planes.gui;

import net.kozibrodka.planes.entity.EntityPlane;
import net.kozibrodka.planes.entity.EntityPlaneNew;
import net.minecraft.container.ContainerBase;
import net.minecraft.container.slot.Slot;
import net.minecraft.entity.player.PlayerBase;
import net.minecraft.inventory.InventoryBase;

public class InventoryPlaneNew extends ContainerBase
{

    public InventoryPlaneNew(InventoryBase iinventory, EntityPlaneNew entityplane)
    {
        plane = entityplane;
        addSlot(new Slot(entityplane, 0, 8, 53));
        int i = 1;
        for(int j = 0; j < plane.plane.numCargoSlots; j++)
        {
            addSlot(new Slot(entityplane, i, 80 + j * 18, 18));
            i++;
        }
        //addon
        for(int m = 0; m < plane.plane.numRocketSlots; m++)
        {
            addSlot(new Slot(entityplane, i, 80 + m * 18, 18));
            i++;
        }
        //addon
        for(int k = 0; k < plane.plane.numBulletSlots; k++)
        {
            addSlot(new Slot(entityplane, i, 80 + k * 18, 36));
            i++;
        }

        for(int l = 0; l < plane.plane.numBombSlots; l++)
        {
            addSlot(new Slot(entityplane, i, 80 + l * 18, 54));
            i++;
        }


        for(int i1 = 0; i1 < 3; i1++)
        {
            for(int k1 = 0; k1 < 9; k1++)
            {
                addSlot(new Slot(iinventory, k1 + i1 * 9 + 9, 8 + k1 * 18, 84 + i1 * 18));
            }

        }

        for(int j1 = 0; j1 < 9; j1++)
        {
            addSlot(new Slot(iinventory, j1, 8 + j1 * 18, 142));
        }

    }

    public boolean canUse(PlayerBase entityplayer)
    {
        return plane.canPlayerUse(entityplayer);
    }

    private EntityPlaneNew plane;
}
