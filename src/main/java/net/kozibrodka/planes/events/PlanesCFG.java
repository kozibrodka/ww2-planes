package net.kozibrodka.planes.events;

import net.glasslauncher.mods.gcapi3.api.ConfigEntry;

public class PlanesCFG {

    @ConfigEntry(name = "Enable Bullets")
    public Boolean bulletsEnabled = true;
    @ConfigEntry(name = "Enable Bombs")
    public Boolean bombsEnabled = true;
    @ConfigEntry(name = "Planes Explode")
    public Boolean planesExplode = true;

    @ConfigEntry(name = "Add Legacy Planes")
    public Boolean registerPlanes_OLD = true;
    @ConfigEntry(name = "Add Modern Planes")
    public Boolean registerPlanes_NEW = false;
    @ConfigEntry(name = "Add AA Guns")
    public Boolean registerAA = true;


}
