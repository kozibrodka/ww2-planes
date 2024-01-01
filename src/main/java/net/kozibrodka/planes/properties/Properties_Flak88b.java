package net.kozibrodka.planes.properties;

import net.kozibrodka.planes.events.mod_Planes;
import net.kozibrodka.planes.model.ModelFlak88_125;
import net.kozibrodka.planes.model.ModelFlak88b_125;

public class Properties_Flak88b extends AAGun_properties {

    public Properties_Flak88b(){
        model = new ModelFlak88b_125();
        texture = "SkinAAGunFlak88";
        shortName = "flak88b";
        przedmiot = mod_Planes.flak88b;
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
