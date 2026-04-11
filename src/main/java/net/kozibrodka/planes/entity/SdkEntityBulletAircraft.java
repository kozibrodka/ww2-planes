package net.kozibrodka.planes.entity;


import net.kozibrodka.planes.events.mod_Planes;
import net.kozibrodka.planes.item.SdkItemGunAircraft;
import net.kozibrodka.sdk_api.events.ingame.mod_SdkGuns;
import net.kozibrodka.sdk_api.events.utils.SdkEntityBullet;
import net.kozibrodka.sdk_api.events.utils.SdkMap;
import net.kozibrodka.sdk_api.events.utils.SdkTools;
import net.minecraft.entity.Entity;
import net.minecraft.util.hit.HitResult;
import net.minecraft.world.World;
import java.util.List;

public class SdkEntityBulletAircraft extends SdkEntityBullet {

    public SdkEntityBulletAircraft(World world)
    {
        super(world);
        setBoundingBoxSpacing(0.35F, 0.35F);
    }

    public SdkEntityBulletAircraft(World world, double d, double d1, double d2)
    {
        super(world, d, d1, d2);
        setBoundingBoxSpacing(0.35F, 0.35F);
    }

    public SdkEntityBulletAircraft(World world, Entity entity, SdkItemGunAircraft sdkitemgun, float f, float f1, float f2, float f3,
                                   float f4)
    {
        super(world, entity, sdkitemgun, f, f1, f2, f3, f4);
        setBoundingBoxSpacing(0.35F, 0.35F);
    }

    public void playServerSound(World world)
    {
        world.playSound(this, ((SdkItemGunAircraft) mod_Planes.itemGunAircraft).firingSound, ((SdkItemGunAircraft)mod_Planes.itemGunAircraft).soundRangeFactor, 1.0F / (random.nextFloat() * 0.1F + 0.95F));
    }

    public void playImpactSound(World world){
        world.playSound(this, "planes:bullethit", 1.0F, 1.2F / (random.nextFloat() * 0.1F + 0.9F)); //oryginalna glosnosc 1.0
    }

}
