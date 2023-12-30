package net.kozibrodka.planes.gui;


import net.kozibrodka.planes.events.mod_Planes;
import net.kozibrodka.planes.recipe.PlaneRecipeRegistry;
import net.kozibrodka.planes.recipe.SlotPlanes;
import net.minecraft.container.ContainerBase;
import net.minecraft.container.slot.CraftingResult;
import net.minecraft.container.slot.Slot;
import net.minecraft.entity.player.PlayerBase;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Chest;
import net.minecraft.inventory.Crafting;
import net.minecraft.inventory.InventoryBase;
import net.minecraft.item.ItemInstance;
import net.minecraft.level.Level;


public class CraftingInventoryPlane extends ContainerBase //ale tutaj było zamieszanie z klasami
{

    public CraftingInventoryPlane(PlayerInventory inventoryplayer, Level world, int i, int j, int k)
    {
        craftMatrix = new Crafting(this, 5, 3);
        craftResult = new Chest();
        field_20133_c = world;
        xTile = i;
        yTile = j;
        zTile = k;
        addSlot(new CraftingResult(inventoryplayer.player, craftMatrix, craftResult, 0, 134, 36));
        for(int l = 0; l < 3; l++)
        {
            for(int k1 = 0; k1 < 5; k1++)
            {
                addSlot(new SlotPlanes(craftMatrix, k1 + l * 5, 26 + k1 * 18, 18 + l * 18));
            }

        }

        for(int i1 = 0; i1 < 3; i1++)
        {
            for(int l1 = 0; l1 < 9; l1++)
            {
                addSlot(new Slot(inventoryplayer, l1 + i1 * 9 + 9, 8 + l1 * 18, 84 + i1 * 18));
            }

        }

        for(int j1 = 0; j1 < 9; j1++)
        {
            addSlot(new Slot(inventoryplayer, j1, 8 + j1 * 18, 142));
        }

        onContentsChanged(craftMatrix);
    }

    public void onContentsChanged(InventoryBase iinventory)
    {
//        craftResult.setInventoryItem(0, RecipeRegistry.getInstance().getCraftingOutput(craftMatrix));
        craftResult.setInventoryItem(0, PlaneRecipeRegistry.getInstance().getCraftingOutput(craftMatrix));
    }

    public void onClosed(PlayerBase entityplayer)
    {
        super.onClosed(entityplayer);
        for(int i = 0; i < 15; i++)
        {
            ItemInstance itemstack = craftMatrix.getInventoryItem(i);
            if(itemstack != null)
            {
                entityplayer.dropItem(itemstack);
            }
        }

    }

    public boolean canUse(PlayerBase entityplayer)
    {
        if(field_20133_c.getTileId(xTile, yTile, zTile) != mod_Planes.planeWorkbench.id)
        {
            return false;
        } else
        {
            return entityplayer.squaredDistanceTo((double)xTile + 0.5D, (double)yTile + 0.5D, (double)zTile + 0.5D) <= 64D;
        }
    }

    public Crafting craftMatrix;
    public InventoryBase craftResult;
    private Level field_20133_c;
    private int xTile;
    private int yTile;
    private int zTile;
}
