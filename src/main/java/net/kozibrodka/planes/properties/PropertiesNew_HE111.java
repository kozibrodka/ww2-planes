package net.kozibrodka.planes.properties;

import net.kozibrodka.planes.events.mod_Planes;
import net.kozibrodka.planes.model.ModelHE111_125;
import net.kozibrodka.sdk_api.events.init.ww2Parts;
import net.minecraft.item.ItemBase;
import net.minecraft.item.ItemInstance;

public class PropertiesNew_HE111 extends Machine_properties {
    public PropertiesNew_HE111()
    {
        name = "Heinkel He111";
        shortName = "He111";
        texture = "SkinPlaneHe111";
        modelNew = new ModelHE111_125();
        przedmiot = mod_Planes.planeNew_HE111;
        maxPropSpeed = 5.0F;
        takeOffSpeed = 4.0F;
        barrelX = 0;
        barrelY = 0;
        barrelZ = 0;
        bombXOffset = 20;
        bombYOffset = 10;
        bombZOffset = 0;
        propellerX = -15;
        propellerY = 22;
        propellerZ = 44;
        hasGuns = false;
        hasBombs = true;
        planeShootDelay = 7;
        planeBombDelay = 100;
        numCargoSlots = 0;
        numBulletSlots = 0;
        numBombSlots = 6; //6
        numRocketSlots = 0;
        planeHealth = 2500;
        turnLeftModifier = 1.0D;
        turnRightModifier = 1.0D;
        lookUpModifier = 1.0D;
        lookDownModifier = 1.0D;
        acceleration = 2.0D;
        decceleration = 2.0D;
        maxHeight = 256;
        startSound = "planes:propstart";
        startSoundLength = 20;
        propSound = "planes:propsound";
        propSoundLength = 30;
        shootSound = "planes:bullet";
        bombSound = "planes:bomb";
        playerXOffset = 6D; //lekkie niedociagniecia
        playerYOffset = 25D;
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
        slopedPitch = -7;
        standingOko = 0.625F;
        planeWidth = 6F;
        planeHeight = 2.8F;
    }

}
