package net.kozibrodka.planes.item;

import net.kozibrodka.planes.entity.SdkEntityBulletAircraftRocket;
import net.kozibrodka.planes.events.mod_Planes;
import net.kozibrodka.sdk_api.events.utils.SdkEntityBullet;
import net.kozibrodka.sdk_api.events.utils.SdkEntityBulletCasing;
import net.kozibrodka.sdk_api.events.utils.SdkItemGun;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.world.World;
import net.modificationstation.stationapi.api.util.Identifier;
import net.modificationstation.stationapi.api.template.item.TemplateItem;

public class SdkItemGunAircraftRocket extends SdkItemGun
{

    public SdkItemGunAircraftRocket(Identifier i)
    {
        super(i);
        firingSound = "planes:rocket";
        requiredBullet = Item.MAP;
        numBullets = 1;
        damage = 30;
        muzzleVelocity = 1.5F;
        spread = 0.0F;
        useDelay = 1;
        recoil = 0.0F;
        penetration = 3;
    }

    public SdkEntityBullet getBulletEntity(World world, Entity entity, float f, float f1, float f2, float f3, float f4)
    {
        return new SdkEntityBulletAircraftRocket(world, entity, this, f, f1, f2, f3, f4);
    }

    public SdkEntityBulletCasing getBulletCasingEntity(World world, Entity entity, float f)
    {
        return null;
    }
}
