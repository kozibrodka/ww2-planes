package net.kozibrodka.planes.entity;


import net.kozibrodka.planes.events.mod_Planes;
import net.kozibrodka.planes.item.SdkItemGunAircraft;
import net.kozibrodka.sdk_api.events.ingame.mod_SdkGuns;
import net.kozibrodka.sdk_api.events.utils.SdkEntityBullet;
import net.kozibrodka.sdk_api.events.utils.SdkMap;
import net.kozibrodka.sdk_api.events.utils.SdkTools;
import net.minecraft.block.BlockBase;
import net.minecraft.entity.EntityBase;
import net.minecraft.entity.Living;
import net.minecraft.entity.monster.MonsterEntityType;
import net.minecraft.entity.player.PlayerBase;
import net.minecraft.level.Level;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.maths.Box;
import net.minecraft.util.maths.MathHelper;
import net.minecraft.util.maths.Vec3f;

import java.util.List;

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

    public void playImpactSound(Level world){
        level.playSound(this, "planes:bullethit", 1.0F, 1.2F / (rand.nextFloat() * 0.1F + 0.9F)); //oryginalna glosnosc 1.0
    }

//    public void tick() {
//        super.tick();
//        if (serverSpawned && !serverSoundPlayed && owner != mc.player) {
//            playServerSound(level);
//            serverSoundPlayed = true;
//        }
//        if (timeInAir == 200) {
//            remove();
//        }
//        if (prevPitch == 0.0F && prevYaw == 0.0F) {
//            float f = MathHelper.sqrt(velocityX * velocityX + velocityZ * velocityZ);
//            prevYaw = yaw = (float) ((Math.atan2(velocityX, velocityZ) * 180D) / 3.1415927410125732D);
//            prevPitch = pitch = (float) ((Math.atan2(velocityY, f) * 180D) / 3.1415927410125732D);
//        }
//        if (inGround) {
//            int i = level.getTileId(xTile, yTile, zTile);
//            if (i != inTile) {
//                inGround = false;
//                velocityX *= rand.nextFloat() * 0.2F;
//                velocityY *= rand.nextFloat() * 0.2F;
//                velocityZ *= rand.nextFloat() * 0.2F;
//                timeInTile = 0;
//                timeInAir = 0;
//            } else {
//                timeInTile++;
//                if (timeInTile == 200) {
//                    remove();
//                }
//                return;
//            }
//        } else {
//            timeInAir++;
//        }
//        Vec3f vec3d = Vec3f.from(x, y, z);
//        Vec3f vec3d1 = Vec3f.from(x + velocityX, y + velocityY, z + velocityZ);
//        HitResult movingobjectposition = level.method_160(vec3d, vec3d1);  //raytraceblocks
//        vec3d = Vec3f.from(x, y, z);
//        vec3d1 = Vec3f.from(x + velocityX, y + velocityY, z + velocityZ);
//        if (movingobjectposition != null) {
//            vec3d1 = Vec3f.from(movingobjectposition.field_1988.x, movingobjectposition.field_1988.y, movingobjectposition.field_1988.z);
//        }
//        EntityBase entity = null;
//        List list = level.getEntities(this, boundingBox.method_86(velocityX, velocityY, velocityZ).expand(1.0D, 1.0D, 1.0D));
//        double d = 0.0D;
//        for (int j = 0; j < list.size(); j++) {
//            EntityBase entity1 = (EntityBase) list.get(j);
//            if (!entity1.method_1356() || (entity1 == owner || owner != null && entity1 == owner.vehicle || owner != null && entity1 == owner.passenger) && timeInAir < 5 || serverSpawned) {
//                continue;
//            }
//            float f4 = 0.3F;
//            Box axisalignedbb = entity1.boundingBox.expand(f4, f4, f4);
//            HitResult movingobjectposition1 = axisalignedbb.method_89(vec3d, vec3d1);
//            if (movingobjectposition1 == null) {
//                continue;
//            }
//            double d1 = vec3d.method_1294(movingobjectposition1.field_1988);
//            if (d1 < d || d == 0.0D) {
//                entity = entity1;
//                d = d1;
//            }
//        }
//
//        if (entity != null) {
//            movingobjectposition = new HitResult(entity);
//        }
//        if (movingobjectposition != null) {
//            int k = level.getTileId(movingobjectposition.x, movingobjectposition.y, movingobjectposition.z);
//            if (movingobjectposition.field_1989 != null || k != BlockBase.TALLGRASS.id) {
//                if (movingobjectposition.field_1989 != null) {
//                    int l = damage;
//                    if ((owner instanceof MonsterEntityType) && (movingobjectposition.field_1989 instanceof PlayerBase)) {
//                        if (level.difficulty == 0) {
//                            l = 0;
//                        }
//                        if (level.difficulty == 1) {
//                            l = l / 3 + 1;
//                        }
//                        if (level.difficulty == 3) {
//                            l = (l * 3) / 2;
//                        }
//                    }
//                    if (movingobjectposition.field_1989 instanceof Living) {
//                        SdkTools.attackEntityIgnoreDelay((Living) movingobjectposition.field_1989, owner, l);
//                    } else { //TODO: REWRITE uwzględniając POJAZDy
//                        if(SdkMap.pojazdList.contains(movingobjectposition.field_1989))
//                        {
//                            movingobjectposition.field_1989.damage(this, l);
//                        }else {
//                            movingobjectposition.field_1989.damage(owner, l);
//                        }
//                    }
//                } else {
//                    xTile = movingobjectposition.x;
//                    yTile = movingobjectposition.y;
//                    zTile = movingobjectposition.z;
//                    inTile = k;
//                    velocityX = (float) (movingobjectposition.field_1988.x - x);
//                    velocityY = (float) (movingobjectposition.field_1988.y - y);
//                    velocityZ = (float) (movingobjectposition.field_1988.z - z);
//                    float f2 = MathHelper.sqrt(velocityX * velocityX + velocityY * velocityY + velocityZ * velocityZ);
//                    x -= (velocityX / (double) f2) * 0.05000000074505806D;
//                    y -= (velocityY / (double) f2) * 0.05000000074505806D;
//                    z -= (velocityZ / (double) f2) * 0.05000000074505806D;
//                    inGround = true;
//                    if (inTile == BlockBase.GLASS.id && mod_SdkGuns.bulletsDestroyGlass) {
//                        SdkTools.minecraft.particleManager.addTileBreakParticles(xTile, yTile, zTile, BlockBase.GLASS.id & 0xff, BlockBase.GLASS.id >> 8 & 0xff);
//                        SdkTools.minecraft.soundHelper.playSound(BlockBase.GLASS.sounds.getBreakSound(), (float) xTile + 0.5F, (float) yTile + 0.5F, (float) zTile + 0.5F, (BlockBase.GLASS.sounds.getVolume() + 1.0F) / 2.0F, BlockBase.GLASS.sounds.getPitch() * 0.8F);
//                        level.setTile(xTile, yTile, zTile, 0);
//                        BlockBase.GLASS.activate(level, xTile, yTile, zTile, level.getTileMeta(xTile, yTile, zTile));
//                    }
//                    if (inTile == BlockBase.LEAVES.id && mod_SdkGuns.bulletsDestroyGlass) {
//                        SdkTools.minecraft.particleManager.addTileBreakParticles(xTile, yTile, zTile, BlockBase.LEAVES.id & 0xff, BlockBase.LEAVES.id >> 8 & 0xff);
//                        SdkTools.minecraft.soundHelper.playSound(BlockBase.LEAVES.sounds.getBreakSound(), (float) xTile + 0.5F, (float) yTile + 0.5F, (float) zTile + 0.5F, (BlockBase.LEAVES.sounds.getVolume() + 1.0F) / 2.0F, BlockBase.LEAVES.sounds.getPitch() * 0.8F);
//                        level.setTile(xTile, yTile, zTile, 0);
//                        BlockBase.LEAVES.activate(level, xTile, yTile, zTile, level.getTileMeta(xTile, yTile, zTile));
//                    }
//                }
//                level.playSound(this, "planes:bullethit", 1.0F, 1.2F / (rand.nextFloat() * 0.1F + 0.9F)); //oryginalna glosnosc 1.0
//                remove();
//            }
//        }
//        x += velocityX;
//        y += velocityY;
//        z += velocityZ;
//        float f1 = MathHelper.sqrt(velocityX * velocityX + velocityZ * velocityZ);
//        yaw = (float) ((Math.atan2(velocityX, velocityZ) * 180D) / 3.1415927410125732D);
//        for (pitch = (float) ((Math.atan2(velocityY, f1) * 180D) / 3.1415927410125732D); pitch - prevPitch < -180F; prevPitch -= 360F) {
//        }
//        for (; pitch - prevPitch >= 180F; prevPitch += 360F) {
//        }
//        for (; yaw - prevYaw < -180F; prevYaw -= 360F) {
//        }
//        for (; yaw - prevYaw >= 180F; prevYaw += 360F) {
//        }
//        pitch = prevPitch + (pitch - prevPitch) * 0.2F;
//        yaw = prevYaw + (yaw - prevYaw) * 0.2F;
//        float f3 = 1.0F;
//        float f5 = 0.005F;   //oryginal 0.0F; -opad
//        if (method_1334()) {
//            for (int i1 = 0; i1 < 4; i1++) {
//                float f6 = 0.25F;
//                level.addParticle("bubble", x - velocityX * (double) f6, y - velocityY * (double) f6, z - velocityZ * (double) f6, velocityX, velocityY, velocityZ);
//            }
//
//            f3 = 0.8F;
//            f5 = 0.03F;
//        }
//        velocityX *= f3;
//        velocityY *= f3;
//        velocityZ *= f3;
//        velocityY -= f5;
//        setPosition(x, y, z);
//    }
}
