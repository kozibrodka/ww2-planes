package net.kozibrodka.planes.recipe;

import net.minecraft.inventory.CraftingInventory;
import net.minecraft.item.ItemStack;

public interface PlaneRecipeTemplate {
    boolean canCraft(CraftingInventory arg);

    ItemStack craft(CraftingInventory arg);

    int getIngredientCount();

    ItemStack getOutput();
}
