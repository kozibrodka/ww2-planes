package net.kozibrodka.planes.item;

import net.kozibrodka.planes.entity.SdkEntityBulletAircraftRocketPanzer;
import net.kozibrodka.sdk_api.events.utils.SdkEntityBullet;
import net.kozibrodka.sdk_api.events.utils.SdkEntityBulletCasing;
import net.kozibrodka.sdk_api.events.utils.SdkItemGun;
import net.minecraft.entity.EntityBase;
import net.minecraft.item.ItemBase;
import net.minecraft.level.Level;
import net.modificationstation.stationapi.api.util.Identifier;
import net.modificationstation.stationapi.api.template.item.TemplateItem;

public class SdkItemGunAircraftRocketPanzer extends SdkItemGun
{

    public SdkItemGunAircraftRocketPanzer(Identifier i)
    {
        super(i);
        firingSound = "planes:rocket";
        requiredBullet = ItemBase.map;
        numBullets = 1;
        damage = 50;
        muzzleVelocity = 1.5F;
        spread = 0.0F;
        useDelay = 1;
        recoil = 0.0F;
        penetration = 3;
    }

    public SdkEntityBullet getBulletEntity(Level world, EntityBase entity, float f, float f1, float f2, float f3, float f4)
    {
        return new SdkEntityBulletAircraftRocketPanzer(world, entity, this, f, f1, f2, f3, f4);
    }

    public SdkEntityBulletCasing getBulletCasingEntity(Level world, EntityBase entity, float f)
    {
        return null;
    }
}
