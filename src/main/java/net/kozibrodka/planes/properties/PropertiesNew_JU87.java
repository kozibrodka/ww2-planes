package net.kozibrodka.planes.properties;

import net.kozibrodka.planes.events.mod_Planes;
import net.kozibrodka.planes.model.ModelJU87_125;
import net.kozibrodka.sdk_api.events.init.ww2Parts;
import net.minecraft.item.ItemBase;
import net.minecraft.item.ItemInstance;

public class PropertiesNew_JU87 extends Machine_properties {
    public PropertiesNew_JU87()
    {
        name = "Junkers JU 87";
        shortName = "JU87";
        texture = "SkinPlaneJU87";
        modelNew = new ModelJU87_125();
        przedmiot = mod_Planes.planeNew_JU87;
        maxPropSpeed = 4.0F;
        takeOffSpeed = 3.0F;
        barrelX = -30;
        barrelY = -20;
        barrelZ = -10;
        bombXOffset = 14;
        bombYOffset = 16;
        bombZOffset = 0;
        propellerX = -47;
        propellerY = 24;
        propellerZ = 0;
        hasGuns = true;
        hasBombs = true;
        planeShootDelay = 7;
        planeBombDelay = 100;
        numCargoSlots = 0;
        numBulletSlots = 5;
        numBombSlots = 2;
        numRocketSlots = 0;
        planeHealth = 1800;
        turnLeftModifier = 2.0D;
        turnRightModifier = 2.0D;
        lookUpModifier = 2.0D;
        lookDownModifier = 2.0D;
        acceleration = 3.0D;
        decceleration = 3.0D;
        maxHeight = 256;
        startSound = "planes:propstart";
        startSoundLength = 20;
        propSound = "planes:propsound";
        propSoundLength = 30;
        shootSound = "planes:bullet";
        bombSound = "planes:bomb";
        playerXOffset = 13D;
        playerYOffset = 31D;
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
        sloped = true;
        slopedPitch = -13;
        standingOko = 0.625F;
        planeWidth = 6F;
        planeHeight = 2.8F;
    }

}
