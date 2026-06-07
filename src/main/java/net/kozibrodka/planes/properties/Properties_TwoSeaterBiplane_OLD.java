package net.kozibrodka.planes.properties;

import net.kozibrodka.planes.events.mod_Planes;
import net.kozibrodka.planes.model.ModelTwoSeaterBiplane;
import net.kozibrodka.sdk_api.events.init.ww2Parts;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class Properties_TwoSeaterBiplane_OLD extends Machine_properties {
    public Properties_TwoSeaterBiplane_OLD()
    {
        name = "Two Seater Biplane";
        shortName = "TwoSeaterBiplane_OLD";
        texture = "TwoSeaterBiplane";
        model = new ModelTwoSeaterBiplane();
        przedmiot = mod_Planes.TwoSeaterBiplane_OLD;
        maxPropSpeed = 0.5F;
        takeOffSpeed = 1.0F;
        barrelX = -48;
        barrelY = -9;
        barrelZ = 3;
        bombXOffset = 0;
        bombYOffset = 16;
        bombZOffset = 0;
        propellerX = -14;
        propellerY = 0;
        propellerZ = 0;
        hasGuns = false;
        hasBombs = false;
        planeShootDelay = 999;
        planeBombDelay = 999;
        numCargoSlots = 5;
        numBulletSlots = 0;
        numBombSlots = 0;
        numRocketSlots = 0;
        planeHealth = 300;
        turnLeftModifier = 4.0D;
        turnRightModifier = 4.0D;
        lookUpModifier = 1.0D;
        lookDownModifier = 1.0D;
        acceleration = 1.0D;
        decceleration = 1.0D;
        maxHeight = 115;
        startSound = "planes:propstart";
        startSoundLength = 20;
        propSound = "planes:propsound";
        propSoundLength = 30;
        shootSound = "planes:bullet";
        bombSound = "planes:bomb";
        playerYOffset = -0.3D;
        numPassengers = 1;
        if(numPassengers > 0)
        {
            seatsX = new int[numPassengers];
            seatsY = new int[numPassengers];
            seatsZ = new int[numPassengers];
        }
        passengerL = 0;
        if(true)
        {
            seatsX[passengerL] = 17;
            seatsY[passengerL] = -5;
            seatsZ[passengerL] = 1;
        }

        item_propeller =  new ItemStack(ww2Parts.woodenPropeller.id, 1, 0);
        item_cockpit =  new ItemStack(ww2Parts.woodenCockpit.id, 1, 0);
        item_wings = new ItemStack(ww2Parts.biplaneWing.id,1,0);
        item_guns =  new ItemStack(Item.EGG.id, 1, 0);
        item_tail =  new ItemStack(ww2Parts.woodenTail.id, 1, 0);
        item_bay =  new ItemStack(Item.BOAT, 1, 0);
        dyeColor = 16;
        itemlist1 = "  W  ";
        itemlist2 = "TBCEP";
        itemlist3 = "  W  ";
        planeFuelAdd = 1000;
    }

}
