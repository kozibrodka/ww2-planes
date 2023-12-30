package net.kozibrodka.planes.recipe;

import net.kozibrodka.planes.properties.PlaneType;
import net.kozibrodka.planes.events.mod_Planes;
import net.kozibrodka.sdk_api.events.init.ww2Parts;
import net.minecraft.block.BlockBase;
import net.minecraft.inventory.Crafting;
import net.minecraft.item.ItemBase;
import net.minecraft.item.ItemInstance;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PlaneRecipeRegistry {

    String chuj = "#####";

    public void initPlaneRecipe()
    {
//        this.addShapedRecipePlane(new ItemInstance(BlockBase.WOOD, 4), "#", '#', BlockBase.LOG);
//        this.addShapedRecipePlane(new ItemInstance(BlockBase.WOOD, 4), chuj, chuj, chuj, '#', BlockBase.WOOD, 'B', BlockBase.STONE);

        for (int i = 0; i < PlaneType.types.size(); i++) {
            PlaneType planetype = (PlaneType) PlaneType.types.get(i);

//            this.addShapedRecipePlane(new ItemInstance(planetype.przedmiot, 4), planetype.itemlist1, 'W', planetype.item_wings);

            this.addShapedRecipePlane(new ItemInstance(planetype.przedmiot, 1,1), planetype.itemlist1, planetype.itemlist2, planetype.itemlist3
                    ,'D', new ItemInstance(ItemBase.dyePowder, 1, planetype.dyeColor),'W', planetype.item_wings,'G', planetype.item_guns,'T', planetype.item_tail,'B', planetype.item_bay,'C', planetype.item_cockpit,'E', ww2Parts.smallEngine,'P', planetype.item_propeller);
            this.addShapedRecipePlane(new ItemInstance(planetype.przedmiot, 1,2), planetype.itemlist1, planetype.itemlist2, planetype.itemlist3
                    ,'D', new ItemInstance(ItemBase.dyePowder, 1, planetype.dyeColor),'W', planetype.item_wings,'G', planetype.item_guns,'T', planetype.item_tail,'B', planetype.item_bay,'C', planetype.item_cockpit,'E', ww2Parts.mediumEngine,'P', planetype.item_propeller);
            this.addShapedRecipePlane(new ItemInstance(planetype.przedmiot, 1,3), planetype.itemlist1, planetype.itemlist2, planetype.itemlist3
                    ,'D', new ItemInstance(ItemBase.dyePowder, 1, planetype.dyeColor),'W', planetype.item_wings,'G', planetype.item_guns,'T', planetype.item_tail,'B', planetype.item_bay,'C', planetype.item_cockpit,'E', ww2Parts.largeEngine,'P', planetype.item_propeller);
            this.addShapedRecipePlane(new ItemInstance(planetype.przedmiot, 1,4), planetype.itemlist1, planetype.itemlist2, planetype.itemlist3
                    ,'D', new ItemInstance(ItemBase.dyePowder, 1, planetype.dyeColor),'W', planetype.item_wings,'G', planetype.item_guns,'T', planetype.item_tail,'B', planetype.item_bay,'C', planetype.item_cockpit,'E', ww2Parts.rotaryEngine,'P', planetype.item_propeller);

        }


//        this.addShapedRecipePlane(new ItemInstance(BlockBase.WOOD, 1, 1), "#");
        //

    }

    void addShapedRecipePlane(ItemInstance arg, Object... objects) {
        String var3 = "";
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        if (objects[var4] instanceof String[]) {
            String[] var11 = (String[])((String[])objects[var4++]);

            for(int var8 = 0; var8 < var11.length; ++var8) {
                String var9 = var11[var8];
                ++var6;
                var5 = var9.length();
                var3 = var3 + var9;
            }
        } else {
            while(objects[var4] instanceof String) {
                String var7 = (String)objects[var4++];
                ++var6;
                var5 = var7.length();
                var3 = var3 + var7;
            }
        }

        HashMap var12;
        for(var12 = new HashMap(); var4 < objects.length; var4 += 2) {
            Character var13 = (Character)objects[var4];
            ItemInstance var15 = null;
            if (objects[var4 + 1] instanceof ItemBase) {
                var15 = new ItemInstance((ItemBase)objects[var4 + 1]);
            } else if (objects[var4 + 1] instanceof BlockBase) {
                var15 = new ItemInstance((BlockBase)objects[var4 + 1], 1, -1);
            } else if (objects[var4 + 1] instanceof ItemInstance) {
                var15 = (ItemInstance)objects[var4 + 1];
            }

            var12.put(var13, var15);
        }

        ItemInstance[] var14 = new ItemInstance[var5 * var6];

        for(int var16 = 0; var16 < var5 * var6; ++var16) {
            char var10 = var3.charAt(var16);
            if (var12.containsKey(var10)) {
                var14[var16] = ((ItemInstance)var12.get(var10)).copy();
            } else {
                var14[var16] = null;
            }
        }

        this.plane_recipes.add(new PlaneShapedRecipe(var5, var6, var14, arg));
    }

    public ItemInstance getCraftingOutput(Crafting arg) {
        for(int var2 = 0; var2 < this.plane_recipes.size(); ++var2) {
            PlaneShapedRecipe var3 = (PlaneShapedRecipe)this.plane_recipes.get(var2);
            if (var3.canCraft(arg)) {
                return var3.craft(arg);
            }
        }

        return null;
    }

    public List getRecipeList()
    {
        return plane_recipes;
    }

    private static final PlaneRecipeRegistry INSTANCE = new PlaneRecipeRegistry();
    public static final PlaneRecipeRegistry getInstance() {
        return INSTANCE;
    }
    private List plane_recipes = new ArrayList();
    public List getRecipes() {
        return this.plane_recipes;
    }
}
