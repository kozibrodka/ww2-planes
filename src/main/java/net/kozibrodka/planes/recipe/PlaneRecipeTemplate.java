package net.kozibrodka.planes.recipe;

import net.minecraft.inventory.Crafting;
import net.minecraft.item.ItemInstance;

public interface PlaneRecipeTemplate {
    boolean canCraft(Crafting arg);

    ItemInstance craft(Crafting arg);

    int getIngredientCount();

    ItemInstance getOutput();
}
