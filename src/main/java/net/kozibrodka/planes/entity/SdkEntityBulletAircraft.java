package net.kozibrodka.planes.entity;


import net.kozibrodka.planes.events.mod_Planes;
import net.kozibrodka.planes.item.SdkItemGunAircraft;
import net.kozibrodka.sdk_api.events.utils.SdkEntityBullet;
import net.minecraft.entity.EntityBase;
import net.minecraft.level.Level;

public class SdkEntityBulletAircraft extends SdkEntityBullet {

    public SdkEntityBulletAircraft(Level world)
    {
        super(world);
        setSize(0.35F, 0.35F);
    }

    public SdkEntityBulletAircraft(Level world, double d, double d1, double d2)
    {
        super(world, d, d1, d2);
        setSize(0.35F, 0.35F);
    }

    public SdkEntityBulletAircraft(Level world, EntityBase entity, SdkItemGunAircraft sdkitemgun, float f, float f1, float f2, float f3,
                                   float f4)
    {
        super(world, entity, sdkitemgun, f, f1, f2, f3, f4);
        setSize(0.35F, 0.35F);
    }

    public void playServerSound(Level world)
    {
        world.playSound(this, ((SdkItemGunAircraft) mod_Planes.itemGunAircraft).firingSound, ((SdkItemGunAircraft)mod_Planes.itemGunAircraft).soundRangeFactor, 1.0F / (rand.nextFloat() * 0.1F + 0.95F));
    }
}
