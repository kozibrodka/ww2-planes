package net.kozibrodka.planes.properties;

import net.kozibrodka.planes.events.mod_Planes;
import net.kozibrodka.planes.model.ModelFlakvierling;

public class Properties_Flakvierling extends AAGun_properties {

    public Properties_Flakvierling(){
        model = new ModelFlakvierling();
        texture = "AAAxis";
        shortName = "flakvierling";
        przedmiot = mod_Planes.flakvierling;
        shootSound = "ofensywa:aafire";
        reloadSound = "ofensywa:mp44reload";

        reloadTime = 100;
        health = 100;
        recoil = 5;
        damage = 10.0F;
        accuracy = 6.0F;
        velocity = 3.0F;
        range = 20;

        shootDelay = 10;
        numBarrels = 4;
        fireAlternately = true;
        gunnerX = 8;
        gunnerY = 28;
        gunnerZ = 8;
        topViewLimit = 75;
        bottomViewLimit = 0;
    }

}
