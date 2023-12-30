package net.kozibrodka.planes.properties;

import net.kozibrodka.planes.events.mod_Planes;
import net.kozibrodka.planes.model.ModelSpitfire;
import net.kozibrodka.sdk_api.events.init.ww2Parts;
import net.minecraft.item.ItemBase;
import net.minecraft.item.ItemInstance;

public class Properties_Spitfire extends Machine_properties {
    public Properties_Spitfire()
    {
        name = "Spitfire";
        shortName = "Spitfire";
        model = new ModelSpitfire();
        przedmiot = mod_Planes.Spitfire;
        maxPropSpeed = 4.0F;
        takeOffSpeed = 3.0F;
        barrelX = -44;
        barrelY = 3;
        barrelZ = -44;
        bombXOffset = 0;
        bombYOffset = 0;
        bombZOffset = 0;
        propellerX = -54;
        propellerY = 0;
        propellerZ = 0;
        hasGuns = true;
        hasBombs = true;
        planeShootDelay = 5;
        planeBombDelay = 15;
        numCargoSlots = 0;
        numBulletSlots = 5;
        numBombSlots = 3;
        numRocketSlots = 4;
        planeHealth = 500;
        turnLeftModifier = 4.0D;
        turnRightModifier = 4.0D;
        lookUpModifier = 2.0D;
        lookDownModifier = 2.0D;
        acceleration = 3.0D;
        decceleration = 3.0D;
        maxHeight = 125;
        startSound = "planes:propstart";
        startSoundLength = 20;
        propSound = "planes:propsound";
        propSoundLength = 30;
        shootSound = "planes:bullet";
        bombSound = "planes:bomb";
        playerYOffset = 0D;
        numPassengers = 0;
        if(numPassengers > 0)
        {
            seatsX = new int[numPassengers];
            seatsY = new int[numPassengers];
            seatsZ = new int[numPassengers];
        }
        passengerL = 0;
        if(passengerL > 0)
        {
            seatsX[passengerL] = 0;
            seatsY[passengerL] = 0;
            seatsZ[passengerL] = 0;
        }

        item_propeller =  new ItemInstance(ww2Parts.metalPropeller.id, 1, 0);
        item_cockpit =  new ItemInstance(ww2Parts.metalCockpit.id, 1, 0);
        item_wings = new ItemInstance(ww2Parts.metalWingMG.id,1,0);
        item_guns =  new ItemInstance(ItemBase.egg.id, 1, 0);
        item_tail =  new ItemInstance(ww2Parts.metalTail.id, 1, 0);
        item_bay =  new ItemInstance(ww2Parts.bombBay.id, 1, 0);
        dyeColor = 2;
        itemlist1 = "DDW D";
        itemlist2 = "TBCEP";
        itemlist3 = "DDW D";
        planeFuelAdd = 1000;
    }

}
