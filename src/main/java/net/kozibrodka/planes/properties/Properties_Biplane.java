package net.kozibrodka.planes.properties;

import net.kozibrodka.planes.events.mod_Planes;
import net.kozibrodka.planes.model.ModelBiplane;
import net.kozibrodka.sdk_api.events.init.ww2Parts;
import net.minecraft.item.ItemBase;
import net.minecraft.item.ItemInstance;

public class Properties_Biplane extends Machine_properties {
    public Properties_Biplane()
    {
        name = "Biplane";
        shortName = "Biplane";
        model = new ModelBiplane();
        przedmiot = mod_Planes.Biplane;
        maxPropSpeed = 3.0F;
        takeOffSpeed = 2.0F;
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
        acceleration = 2.0D;
        decceleration = 1.0D;
        maxHeight = 120;
        startSound = "ofensywa:propstart";
        startSoundLength = 20;
        propSound = "ofensywa:propsound";
        propSoundLength = 30;
        shootSound = "ofensywa:bullet";
        bombSound = "ofensywa:bomb";
        playerYOffset = -0.5D;
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

        item_propeller =  new ItemInstance(ww2Parts.woodenPropeller.id, 1, 0);
        item_cockpit =  new ItemInstance(ww2Parts.woodenCockpit.id, 1, 0);
        item_wings = new ItemInstance(ww2Parts.biplaneWing.id,1,0);
        item_guns =  new ItemInstance(ItemBase.egg.id, 1, 0);
        item_tail =  new ItemInstance(ww2Parts.woodenTail.id, 1, 0);
        item_bay =  new ItemInstance(ItemBase.egg.id, 1, 0);
        dyeColor = 16;
        itemlist1 = "  W  ";
        itemlist2 = "T CEP";
        itemlist3 = "  W  ";
        planeFuelAdd = 1000;
    }

}
