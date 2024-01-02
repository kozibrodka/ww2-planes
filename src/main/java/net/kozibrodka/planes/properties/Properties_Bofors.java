package net.kozibrodka.planes.properties;

import net.kozibrodka.planes.events.mod_Planes;
import net.kozibrodka.planes.model.ModelBofors;

public class Properties_Bofors extends AAGun_properties {

    public Properties_Bofors(){
        model = new ModelBofors();
        texture = "AAAllies";
        shortName = "bofors";
        przedmiot = mod_Planes.bofors;
        shootSound = "planes:aafire";
        reloadSound = "planes:barreload";

        reloadTime = 20;//20
        health = 100;
        recoil = 5;
        damage = 50.0F;
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
