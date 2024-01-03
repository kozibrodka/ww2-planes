package net.kozibrodka.planes.events;

import net.glasslauncher.mods.api.gcapi.api.ConfigName;

public class PlanesCFG {

    @ConfigName("Enable Bullets")
    public Boolean bulletsEnabled = true;
    @ConfigName("Enable Bombs")
    public Boolean bombsEnabled = true;
    @ConfigName("Planes Explode")
    public Boolean planesExplode = true;

    @ConfigName("Add Legacy Planes")
    public Boolean registerPlanes_OLD = true;
    @ConfigName("Add Modern Planes")
    public Boolean registerPlanes_NEW = false;
    @ConfigName("Add AA Guns")
    public Boolean registerAA = true;


}
