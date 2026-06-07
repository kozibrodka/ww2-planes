package net.kozibrodka.planes.properties;

import net.kozibrodka.planes.events.mod_Planes;
import net.kozibrodka.planes.model.ModelCamel;
import net.kozibrodka.planes.model.ModelCamel_125;
import net.kozibrodka.sdk_api.events.init.ww2Parts;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class Properties_Camel extends Machine_properties {
    public Properties_Camel()
    {
        name = "Camel";
        shortName = "Camel";
        texture = "Camel";
        modelNew = new ModelCamel_125();
        przedmiot = mod_Planes.Camel;
        maxPropSpeed = 2.0F;
        takeOffSpeed = 2.0F;
        barrelX = -48;
        barrelY = -15;
        barrelZ = 3;
        bombXOffset = 0;
        bombYOffset = 16;
        bombZOffset = 0;
        propellerX = -27;
        propellerY = 0;
        propellerZ = 0;
        hasGuns = true;
        hasBombs = false;
        planeShootDelay = 6;
        planeBombDelay = 999;
        numCargoSlots = 0;
        numBulletSlots = 4;
        numBombSlots = 0;
        numRocketSlots = 1;
        planeHealth = 450;
        turnLeftModifier = 4.0D;
        turnRightModifier = 6.0D;
        lookUpModifier = 1.0D;
        lookDownModifier = 1.0D;
        acceleration = 2.0D;
        decceleration = 2.0D;
        maxHeight = 120;
        startSound = "planes:propstart";
        startSoundLength = 20;
        propSound = "planes:propsound";
        propSoundLength = 30;
        shootSound = "planes:bullet";
        bombSound = "planes:bomb";
        playerYOffset = -0.3D;
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

        item_propeller =  new ItemStack(ww2Parts.woodenPropeller.id, 1, 0);
        item_cockpit =  new ItemStack(ww2Parts.woodenCockpit.id, 1, 0);
        item_wings = new ItemStack(ww2Parts.biplaneWing.id,1,0);
        item_guns =  new ItemStack(ww2Parts.machinegun.id, 1, 0);
        item_tail =  new ItemStack(ww2Parts.woodenTail.id, 1, 0);
        item_bay =  new ItemStack(Item.EGG.id, 1, 0);
        dyeColor = 11;
        itemlist1 = "DDWGD";
        itemlist2 = "T CEP";
        itemlist3 = "DDWGD";
        planeFuelAdd = 1000;

        sloped = false;
        oldClassic = true;
        standingOko = (1.8F / 2.0F) - 0.17F;
        planeWidth = 6F;
        planeHeight = 1.8F;
        playerYOffset = 3.0D;
    }

}
