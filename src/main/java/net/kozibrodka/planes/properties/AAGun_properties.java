package net.kozibrodka.planes.properties;


import net.kozibrodka.planes.model.ModelAAGun;
import net.modificationstation.stationapi.api.template.item.TemplateItem;

public class AAGun_properties {

    public int reloadTime;
    public int recoil = 5;
    public int range;
    public float accuracy;
    public float velocity;
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
}
