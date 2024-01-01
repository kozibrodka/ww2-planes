package net.kozibrodka.planes.properties;

import net.kozibrodka.planes.events.mod_Planes;
import net.kozibrodka.planes.model.ModelBofors;
import net.kozibrodka.planes.model.ModelFlak88_125;

public class Properties_Flak88 extends AAGun_properties {

    public Properties_Flak88(){
        model = new ModelFlak88_125();
        texture = "SkinAAGunFlak88";
        shortName = "flak88";
        przedmiot = mod_Planes.flak88;
        shootSound = "planes:aafire";
        reloadSound = "planes:barreload";

        reloadTime = 20;//20
        health = 100;
        recoil = 5;
        damage = 10.0F;
        accuracy = 6.0F;
        velocity = 3.0F;
        range = 20;

        shootDelay = 20;
        numBarrels = 1;
        fireAlternately = true;
        gunnerX = 8;
        gunnerY = 28;
        gunnerZ = 8;
        topViewLimit = 75;
        bottomViewLimit = 0;
    }
}
