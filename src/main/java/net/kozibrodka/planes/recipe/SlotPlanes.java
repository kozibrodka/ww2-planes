package net.kozibrodka.planes.recipe;

import net.minecraft.container.slot.Slot;
import net.minecraft.inventory.InventoryBase;
import net.minecraft.item.ItemInstance;

public class SlotPlanes extends Slot
{

    public SlotPlanes(InventoryBase iinventory, int i, int j, int k)
    {
        super(iinventory, i, j, k);
    }

    public boolean canInsert(ItemInstance itemstack)
    {
//        return itemstack.itemId >= mod_Planes.biplaneWing.id && itemstack.itemId <= mod_Planes.metalWing.id || itemstack.itemId == ItemBase.boat.id || itemstack.itemId == ItemBase.dyePowder.id;
        return true;
    }
}
