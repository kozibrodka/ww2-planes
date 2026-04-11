package net.kozibrodka.planes.recipe;

import net.minecraft.inventory.Inventory;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.slot.Slot;

public class SlotPlanes extends Slot
{

    public SlotPlanes(Inventory iinventory, int i, int j, int k)
    {
        super(iinventory, i, j, k);
    }

    public boolean canInsert(ItemStack itemstack)
    {
//        return itemstack.itemId >= mod_Planes.biplaneWing.id && itemstack.itemId <= mod_Planes.metalWing.id || itemstack.itemId == ItemBase.boat.id || itemstack.itemId == ItemBase.dyePowder.id;
        return true;
    }
}
