package net.kozibrodka.planes.properties;

import net.kozibrodka.planes.events.mod_Planes;
import net.kozibrodka.planes.model.ModelME262_125;
import net.kozibrodka.sdk_api.events.init.ww2Parts;
import net.minecraft.item.ItemBase;
import net.minecraft.item.ItemInstance;

public class PropertiesNew_ME262 extends Machine_properties {
    public PropertiesNew_ME262()
    {
        name = "Messerschmidt 262";
        shortName = "ME262";
        texture = "SkinPlaneME262";
        modelNew = new ModelME262_125();
        przedmiot = mod_Planes.planeNew_ME262;
        maxPropSpeed = 4.5F;
        takeOffSpeed = 3.0F;
        barrelX = -27;
        barrelY = 30;
        barrelZ = -2;
        bombXOffset = 0;
        bombYOffset = 16;
        bombZOffset = 0;
        propellerX = -20;
        propellerY = 14;
        propellerZ = -47;
        hasGuns = true;
        hasBombs = true;
        planeShootDelay = 7;
        planeBombDelay = 100;
        numCargoSlots = 0;
        numBulletSlots = 5;
        numBombSlots = 1;
        numRocketSlots = 0;
        planeHealth = 1800;
        turnLeftModifier = 2.0D;
        turnRightModifier = 2.0D;
        lookUpModifier = 2.0D;
        lookDownModifier = 2.0D;
        acceleration = 3.0D;
        decceleration = 3.0D;
        maxHeight = 256;
        startSound = "ofensywa:propstart";
        startSoundLength = 20;
        propSound = "ofensywa:propsound";
        propSoundLength = 30;
        shootSound = "ofensywa:bullet";
        bombSound = "ofensywa:bomb";
        playerXOffset = 22D;
        playerYOffset = 18D;
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
        item_wings = new ItemInstance(ww2Parts.metalWing.id,1,0);
        item_guns =  new ItemInstance(ItemBase.egg.id, 1, 0);
        item_tail =  new ItemInstance(ww2Parts.metalTail.id, 1, 0);
        item_bay =  new ItemInstance(ww2Parts.bombBay.id, 1, 0);
        dyeColor = 8;
        itemlist1 = "DDW D";
        itemlist2 = "TBCEP";
        itemlist3 = "DDW D";
        planeFuelAdd = 1000;
        standingOko = 0.625F;
        planeWidth = 6F;
        planeHeight = 2.8F;
    }

}
