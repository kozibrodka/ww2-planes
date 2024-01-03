package net.kozibrodka.planes.properties;

import net.kozibrodka.planes.model.ModelAAGun;
import net.modificationstation.stationapi.api.template.item.TemplateItem;

import java.util.ArrayList;
import java.util.List;

public class AAGunType {

    public AAGunType(AAGun_properties klasa){
        reloadTime = klasa.reloadTime;
        recoil = klasa.recoil;
        accuracy = klasa.accuracy;
        velocity = klasa.velocity;
        range = klasa.range;
        damage = klasa.damage;
        shootDelay = klasa.shootDelay;
        numBarrels = klasa.numBarrels;
        fireAlternately = klasa.fireAlternately;
        health = klasa.health;
        gunnerX = klasa.gunnerX;
        gunnerY = klasa.gunnerY;
        gunnerZ = klasa.gunnerZ;
        shootSound = klasa.shootSound;
        reloadSound = klasa.reloadSound;
        model = klasa.model;
        texture = klasa.texture;
        shortName = klasa.shortName;
        topViewLimit = klasa.topViewLimit;
        bottomViewLimit = klasa.bottomViewLimit;
        przedmiot = klasa.przedmiot;
        types.add(this);
    }


    public int reloadTime;
    public int recoil = 5;
    public float accuracy;
    public float velocity;
    public int range;
    public float damage;
    public int shootDelay;
    public int numBarrels;
    public boolean fireAlternately;
    public int health;
    public int gunnerX;
    public int gunnerY;
    public int gunnerZ;
    public String shootSound;
    public String reloadSound;
    public ModelAAGun model;
    public String texture;
    public String shortName;
    public float topViewLimit = 75.0F;
    public float bottomViewLimit = 0.0F;
    public TemplateItem przedmiot;
    public static List types = new ArrayList();
}
