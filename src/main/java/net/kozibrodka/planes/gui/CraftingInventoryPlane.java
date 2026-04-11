package net.kozibrodka.planes.gui;


import net.kozibrodka.planes.events.mod_Planes;
import net.kozibrodka.planes.recipe.PlaneRecipeRegistry;
import net.kozibrodka.planes.recipe.SlotPlanes;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.CraftingInventory;
import net.minecraft.inventory.CraftingResultInventory;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.slot.CraftingResultSlot;
import net.minecraft.screen.slot.Slot;
import net.minecraft.world.World;


public class CraftingInventoryPlane extends ScreenHandler //ale tutaj było zamieszanie z klasami
{

    public CraftingInventoryPlane(PlayerInventory inventoryplayer, World world, int i, int j, int k)
    {
        craftMatrix = new CraftingInventory(this, 5, 3);
        craftResult = new CraftingResultInventory();
        field_20133_c = world;
        xTile = i;
        yTile = j;
        zTile = k;
        addSlot(new CraftingResultSlot(inventoryplayer.player, craftMatrix, craftResult, 0, 134, 36));
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

        onSlotUpdate(craftMatrix);
    }

    public void onSlotUpdate(Inventory iinventory)
    {
//        craftResult.setInventoryItem(0, RecipeRegistry.getInstance().getCraftingOutput(craftMatrix));
        craftResult.setStack(0, PlaneRecipeRegistry.getInstance().getCraftingOutput(craftMatrix));
    }

    public void onClosed(PlayerEntity entityplayer)
    {
        super.onClosed(entityplayer);
        for(int i = 0; i < 15; i++)
        {
            ItemStack itemstack = craftMatrix.getStack(i);
            if(itemstack != null)
            {
                entityplayer.dropItem(itemstack);
            }
        }

    }

    public boolean canUse(PlayerEntity entityplayer)
    {
        if(field_20133_c.getBlockId(xTile, yTile, zTile) != mod_Planes.planeWorkbench.id)
        {
            return false;
        } else
        {
            return entityplayer.getSquaredDistance((double)xTile + 0.5D, (double)yTile + 0.5D, (double)zTile + 0.5D) <= 64D;
        }
    }

    public CraftingInventory craftMatrix;
    public Inventory craftResult;
    private World field_20133_c;
    private int xTile;
    private int yTile;
    private int zTile;
}
