package net.kozibrodka.planes.entity;

import net.fabricmc.loader.api.FabricLoader;
import net.kozibrodka.planes.events.mod_Planes;
import net.kozibrodka.planes.gui.GuiPlane;
import net.kozibrodka.planes.gui.GuiPlaneNew;
import net.kozibrodka.planes.mixin.EntityBaseAccessor;
import net.kozibrodka.planes.properties.PlaneType;
import net.kozibrodka.planes.properties.PlaneTypeNew;
import net.kozibrodka.sdk_api.events.init.ItemCasingListener;
import net.kozibrodka.sdk_api.events.init.KeyBindingListener;
import net.kozibrodka.sdk_api.events.init.ww2Parts;
import net.kozibrodka.sdk_api.events.utils.SdkItemGun;
import net.kozibrodka.sdk_api.events.utils.SdkTools;
import net.kozibrodka.sdk_api.events.utils.WW2Plane;
import net.minecraft.block.BlockBase;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.EntityBase;
import net.minecraft.entity.Item;
import net.minecraft.entity.Living;
import net.minecraft.entity.animal.Wolf;
import net.minecraft.entity.player.PlayerBase;
import net.minecraft.inventory.InventoryBase;
import net.minecraft.item.ItemBase;
import net.minecraft.item.ItemInstance;
import net.minecraft.level.Level;
import net.minecraft.util.io.CompoundTag;
import net.minecraft.util.io.ListTag;
import net.minecraft.util.maths.Box;
import org.lwjgl.input.Keyboard;

import java.util.Iterator;
import java.util.List;


public class EntityPlaneNew extends EntityBase
        implements InventoryBase, WW2Plane
{

    public EntityPlaneNew(Level world)
    {
        super(world);
        boatCurrentDamage = 0;
        boatTimeSinceHit = 0;
        boatRockDirection = 1;
        field_1593 = true;  //prevententityfromspawn
//        setSize(6F, 2.8F);
//        standingEyeHeight = height / 2.0F - 0.17F;
//        standingEyeHeight = 0.625F;;
        setPosition(0.0D, standingEyeHeight, 0.0D);
        velocityX = 0.0D;
        velocityY = 0.0D;
        motionG = 0.0D;
        velocityZ = 0.0D;
        propellerSpeed = 0.0D;
        planeDamage = 0;
        shootDelay = 0;
        bombDelay = 0;
        planeFuel = 0;
        rotationRoll = 0.0F;
        soundPosition = 0;
        flapsYaw = 0.0F;
        flapsPitchLeft = 0.0F;
        flapsPitchRight = 0.0F;
        velocityYaw = 0.0F;
        velocityPitch = 0.0F;
        velocityRoll = 0.0F;
        field_1622 = true; //ignoreFrustumCheck
        gunAircraft = new ItemInstance(mod_Planes.itemGunAircraft);
        gunRocketAircraft = new ItemInstance(mod_Planes.itemGunAircraftRocket);
        gunRocketAircraftPanzer = new ItemInstance(mod_Planes.itemGunAircraftRocketPanzer);
//        axes = new RotatedAxes();
    }

    public EntityPlaneNew(Level world, double d, double d1, double d2)
    {
        this(world);
        standingEyeHeight = height / 2.0F - 0.17F;
        setPosition(d, d1 + (double)standingEyeHeight, d2);
        velocityX = 0.0D;
        velocityY = 0.0D;
        velocityZ = 0.0D;
        prevX = d;
        prevY = d1;
        prevZ = d2;
        if(mod_Planes.type == null)
        {
            plane = (PlaneTypeNew)PlaneTypeNew.types.get(0);
        } else
        {
            plane = mod_Planes.typeNew;
        }
        passengerSeats = new EntityPassengerSeat[plane.numPassengers];
        for(int i = 0; i < plane.numPassengers; i++)
        {
            if(level != null)
            {
                passengerSeats[i] = new EntityPassengerSeat(level, plane.seatsX[i], plane.seatsY[i], plane.seatsZ[i], this);
                level.spawnEntity(passengerSeats[i]);
            }
        }

        inventorySize = plane.numCargoSlots + plane.numBulletSlots + plane.numBombSlots + plane.numRocketSlots + 1; //
        cargoItems = new ItemInstance[inventorySize];
    }

    public EntityPlaneNew(Level world, double d, double d1, double d2,
                          PlayerBase entityplayer, int i, PlaneTypeNew planetype)
    {
        this(world);
        plane = planetype;
        standingEyeHeight = plane.standingOko;
        setSize(plane.planeWidth, plane.planeHeight);
        setPosition(d, d1 + (double)standingEyeHeight, d2);
        velocityX = 0.0D;
        velocityY = 0.0D;
        velocityZ = 0.0D;
        yaw = entityplayer.yaw - 90F;
        prevX = d;
        prevY = d1;
        prevZ = d2;
        engineType = i;
        if(engineType < 1)
        {
            engineType = 1;
        }
        if(engineType > 4)
        {
            engineType = 4;
        }
        passengerSeats = new EntityPassengerSeat[plane.numPassengers];
        for(int j = 0; j < plane.numPassengers; j++)
        {
            if(level != null)
            {
                passengerSeats[j] = new EntityPassengerSeat(level, plane.seatsX[j], plane.seatsY[j], plane.seatsZ[j], this);
                level.spawnEntity(passengerSeats[j]);
            }
        }

        inventorySize = plane.numCargoSlots + plane.numBulletSlots + plane.numBombSlots + plane.numRocketSlots + 1;
        cargoItems = new ItemInstance[inventorySize];
    }

    protected void initDataTracker()
    {
    }

    protected boolean canClimb()
    {
        return false;
    }

    public void setEngineSpeed(int i)
    {
        engineType = i;
    }

    public void setPosition(double d, double d1, double d2)
    {
        x = d;
        y = d1;
        z = d2;
        float f = width / 4F;
        float f1 = height;
        boundingBox.method_99(d - (double)f, (d1 - (double)standingEyeHeight) + (double)field_1640, d2 - (double)f, d + (double)f, (d1 - (double)standingEyeHeight) + (double)field_1640 + (double)f1, d2 + (double)f);
    }

    public void setRotationRoll(float f)
    {
        velocityRoll = (f - rotationRoll) / 3F;
    }

    public Box getBoundingBox(EntityBase entity)
    {
        return entity.boundingBox;
    }

    public Box method_1381()
    {
        return boundingBox;
    }

    public boolean method_1380()
    {
        return true;
    }

    public double getMountedHeightOffset()
    {
        return (plane.playerYOffset / 16.0D) - 0.2D;
    }

    public void spawnParticles(String s, int i, boolean flag)
    {
        for(int j = 0; j < i; j++)
        {
            double d = (x + rand.nextDouble() * 1.5D) - 0.75D;
            double d1 = ((y + rand.nextDouble() - 0.5D)) + 0.25D;
            double d2 = (z + rand.nextDouble() - 0.5D);
            double d3 = flag ? rand.nextDouble() - 0.5D : 0.0D;
            double d4 = flag ? rand.nextDouble() - 0.5D : 0.0D;
            double d5 = flag ? rand.nextDouble() - 0.5D : 0.0D;
            if(Math.random() < 0.75D)
            {
                level.addParticle(s, d, d1, d2, d3, d4, d5);
            } else
            {
                level.addParticle(s, d, d1, d2, d3, d4, d5);
            }
        }

    }

    public boolean damage(EntityBase entity, int i)
    {
        if(removed)
        {
            return true;
        }
        boatRockDirection = -boatRockDirection;
        boatTimeSinceHit = 10;
        boatCurrentDamage += i * 10;
        if(boatCurrentDamage > 40)
        {
            boatCurrentDamage = 40;
        }
        method_1336(); //setBeenAttacked
        planeDamage += 3 * i;  //dmg mnozony X3 jest
        level.playSound(this, "planes:mechhurt", 1.0F, (rand.nextFloat() - rand.nextFloat()) * 0.2F + 1.0F); //glos do zmiany
        System.out.println("Alc dostałem od: " + entity);
        if(planeDamage > plane.planeHealth && !level.isServerSide) //oryg >600
        {
            remove();
            if(mod_Planes.planesExplode && SdkTools.minecraft.options.difficulty != 0)
            {
                level.createExplosion(null, x, y, z, 5F * (float)Math.sqrt(velocityX * velocityX + velocityY * velocityY + velocityZ * velocityZ));
                spawnParticles("explode", 64, true);
                for(int l = (int)x - 3; l < (int)x + 3; l++)
                {
                    for(int i1 = (int)y - 2; i1 < (int)y + 2; i1++)
                    {
                        for(int k1 = (int)z - 3; k1 < (int)z + 3; k1++)
                        {
                            if(level.getTileId(l, i1, k1) == 0 && rand.nextInt(4) == 0)
                            {
                                level.setTile(l, i1, k1, BlockBase.FIRE.id);
                            }
                        }

                    }

                }

            }
            int r8 = 2;
            float f8 = 1.5F;
            if(plane.item_bay.itemId != ItemBase.egg.id && rand.nextInt(r8) == 0)
                dropItem(plane.item_bay.itemId, 1, f8);
            if(rand.nextInt(r8) == 0)
                dropItem(plane.item_cockpit.itemId, 1, f8);
            if(rand.nextInt(r8) == 0)
                dropItem(plane.item_propeller.itemId, 1, f8);
            if(rand.nextInt(r8) == 0)
                dropItem(plane.item_tail.itemId, 1, f8);
            if(rand.nextInt(r8) == 0)
                dropItem(plane.item_wings.itemId, 1, f8);
            if(rand.nextInt(r8) == 0)
                dropItem(plane.item_wings.itemId, 1, f8);
            if(plane.item_guns.itemId != ItemBase.egg.id && rand.nextInt(r8) == 0)
                dropItem(plane.item_guns.itemId, 1, f8);
            if(plane.item_guns.itemId != ItemBase.egg.id && rand.nextInt(r8) == 0)
                dropItem(plane.item_guns.itemId, 1, f8);
                            switch(engineType)
                {
                    case 1: // '\001'
                        if(rand.nextInt(r8) == 0)
                        dropItem(ww2Parts.smallEngine.id, 1, f8);
                        break;

                    case 2: // '\002'
                        if(rand.nextInt(r8) == 0)
                        dropItem(ww2Parts.mediumEngine.id, 1, f8);
                        break;

                    case 3: // '\003'
                        if(rand.nextInt(r8) == 0)
                        dropItem(ww2Parts.largeEngine.id, 1, f8);
                        break;

                    case 4: // '\004'
                        if(rand.nextInt(r8) == 0)
                        dropItem(ww2Parts.rotaryEngine.id, 1, f8);
                        break;

                }

                if(plane.dyeColor != 16 && rand.nextInt(r8) == 0)
                dropItem(new ItemInstance(ItemBase.dyePowder, rand.nextInt(6) + 1, plane.dyeColor), f8);

        }
        return true;
    }

    public void remove()
    {
        if(!level.isServerSide)
        {
            label0:
            for(int i = 0; i < getInventorySize(); i++)
            {
                ItemInstance itemstack = getInventoryItem(i);
                if(itemstack == null)
                {
                    continue;
                }
                float f = rand.nextFloat() * 0.8F + 0.1F;
                float f1 = rand.nextFloat() * 0.8F + 0.1F;
                float f2 = rand.nextFloat() * 0.8F + 0.1F;
                do
                {
                    if(itemstack.count <= 0)
                    {
                        continue label0;
                    }
                    int k = rand.nextInt(21) + 10;
                    if(k > itemstack.count)
                    {
                        k = itemstack.count;
                    }
                    itemstack.count -= k;
                    Item entityitem = new Item(level, x + (double)f, y + (double)f1, z + (double)f2, new ItemInstance(itemstack.itemId, k, itemstack.getDamage()));
                    float f3 = 0.05F;
                    entityitem.velocityX = (float)rand.nextGaussian() * f3;
                    entityitem.velocityY = (float)rand.nextGaussian() * f3 + 0.2F;
                    entityitem.velocityZ = (float)rand.nextGaussian() * f3;
                    level.spawnEntity(entityitem);
                } while(true);
            }

        }
        for(int j = 0; j < plane.numPassengers; j++)
        {
            passengerSeats[j].remove();
        }

        super.remove();
    }

    public void method_1312() //performHurtAnimation
    {
        boatRockDirection = -boatRockDirection;
        boatTimeSinceHit = 10;
        boatCurrentDamage += boatCurrentDamage * 10;
    }

    public boolean method_1356() //canBeCollidedWith
    {
        return !removed;
    }

    public void method_1311(double d, double d1, double d2, float f,
                                        float f1, int i) //setPositionAndRotation2
    {
        field_9393_e = d;
        field_9392_f = d1;
        field_9391_g = d2;
        field_9390_h = f;
        field_9389_i = f1;
        field_9394_d = i + 4;
        velocityX = field_9388_j;
        velocityY = field_9387_k;
        velocityZ = field_9386_l;
    }

    public void setVelocity(double d, double d1, double d2)
    {
        field_9388_j = velocityX = d;
        field_9387_k = velocityY = d1;
        field_9386_l = velocityZ = d2;
    }

    public double getSpeed()
    {
        return Math.sqrt(velocityX * velocityX + velocityZ * velocityZ);
    }

    public void pressKey(int i)
    {
//        mod_Planes.pressKey(i); //modloade packet
        double d = propellerSpeed - (double)plane.takeOffSpeed;
        if(d < 0.0D)
        {
            d = 0.0D;
        }
        if(planeDamage < plane.planeHealth)
        {
            if(level.isServerSide)
            {
                switch(i)
                {
                    case 0: // '\0'
                        pitch -= (d * plane.lookUpModifier) / 3D;
                        flapsPitchLeft -= 3F;
                        flapsPitchRight -= 3F;
                        break;

                    case 1: // '\001'
                        if(planeFuel > 0) {
                            yaw -= (((double) (((plane.maxPropSpeed + (float) engineType) - plane.takeOffSpeed) * 2.0F) - d) * plane.turnLeftModifier) / 3D;
                            flapsYaw += 3F;
                            break;
                        }

                    case 2: // '\002'
                        pitch += (d * plane.lookDownModifier) / 3D;
                        flapsPitchLeft += 3F;
                        flapsPitchRight += 3F;
                        break;

                    case 3: // '\003'
                        if(planeFuel > 0) {
                            yaw += (((double) (((plane.maxPropSpeed + (float) engineType) - plane.takeOffSpeed) * 2.0F) - d) * plane.turnRightModifier) / 3D;
                            flapsYaw -= 3F;
                            break;
                        }

                    case 4: // '\004'
                        if(planeFuel > 0 || level.isServerSide)
                        {
                            propellerSpeed += 0.01D * (plane.acceleration + (double)(engineType / 2));
                            planeFuel--;
                        }
                        break;

                    case 5: // '\005'
                        propellerSpeed -= 0.02D * (plane.decceleration + (double)(engineType / 4));
                        break;
                }
            } else
            {
                switch(i)
                {
                    case 0: // '\0'
                        velocityPitch -= ((d * plane.lookUpModifier) / 30D) * Math.cos((rotationRoll * 3.141593F) / 180F);
                        velocityYaw += ((d * plane.lookUpModifier) / 30D) * Math.sin((rotationRoll * 3.141593F) / 180F);
                        flapsPitchLeft -= 3F;
                        flapsPitchRight -= 3F;
                        break;

                    case 10: // '\n'
                        velocityRoll -= (((double)(((plane.maxPropSpeed + (float)engineType) - plane.takeOffSpeed) * 2.0F) - d) / 30D) * plane.turnLeftModifier;
                        flapsPitchLeft -= 3F;
                        flapsPitchRight += 3F;
                        break;

                    case 2: // '\002'
                        velocityPitch += ((d * plane.lookDownModifier) / 30D) * Math.cos((rotationRoll * 3.141593F) / 180F);
                        velocityYaw -= ((d * plane.lookDownModifier) / 30D) * Math.sin((rotationRoll * 3.141593F) / 180F);
                        flapsPitchLeft += 3F;
                        flapsPitchRight += 3F;
                        break;

                    case 11: // '\013'
                        velocityRoll += (((double)(((plane.maxPropSpeed + (float)engineType) - plane.takeOffSpeed) * 2.0F) - d) / 30D) * plane.turnRightModifier;
                        flapsPitchLeft += 3F;
                        flapsPitchRight -= 3F;
                        break;

                    case 4: // '\004'
                        if(planeFuel > 0 || level.isServerSide)
                        {
                            propellerSpeed += 0.01D * (plane.acceleration + (double)(engineType / 2));
                            planeFuel--;
                        }
                        break;

                    case 5: // '\005'
                        propellerSpeed -= 0.02D * (plane.decceleration + (double)(engineType / 4));
                        break;

                    case 1: // '\001'
                        if(planeFuel > 0) {
                            velocityYaw -= ((((double) (((plane.maxPropSpeed + (float) engineType) - plane.takeOffSpeed) * 2.0F) - d) * plane.turnLeftModifier) / 20D) * Math.cos((rotationRoll * 3.141593F) / 180F);
                            velocityPitch -= ((((double) (((plane.maxPropSpeed + (float) engineType) - plane.takeOffSpeed) * 2.0F) - d) * plane.turnLeftModifier) / 20D) * Math.sin((rotationRoll * 3.141593F) / 180F);
                            flapsYaw += 3F;
                        }
                        break;

                    case 3: // '\003'
                        if(planeFuel > 0) {
                            velocityYaw += ((((double) (((plane.maxPropSpeed + (float) engineType) - plane.takeOffSpeed) * 2.0F) - d) * plane.turnRightModifier) / 20D) * Math.cos((rotationRoll * 3.141593F) / 180F);
                            velocityPitch += ((((double) (((plane.maxPropSpeed + (float) engineType) - plane.takeOffSpeed) * 2.0F) - d) * plane.turnRightModifier) / 20D) * Math.sin((rotationRoll * 3.141593F) / 180F);
                            flapsYaw -= 3F;
                        }
                        break;
                }
            }
            switch(i)
            {
                default:
                    break;

//                case 6: // '\006'
//                    if(!level.isServerSide && shootDelay <= 0 && plane.hasGuns && mod_Planes.bulletsEnabled)
//                    {
//                        int j = 0;
//                        for(int i1 = plane.numCargoSlots + plane.numRocketSlots + 1; i1 < plane.numCargoSlots + plane.numRocketSlots + plane.numBulletSlots + 1; i1++)
//                        {
//                            if(cargoItems[i1] != null && cargoItems[i1].itemId == mod_Planes.bullet.id)  //AMMO CHANGE
//                            {
//                                j = i1;
//                            }
//                        }
//
//                        if(j != 0)
//                        {
//                            double d1 = (double)plane.barrelX / 16D;
//                            double d3 = -((double)plane.barrelY / 16D) * Math.cos((rotationRoll * 3.141593F) / 180F) + ((double)plane.barrelZ / 16D) * -Math.sin((rotationRoll * 3.141593F) / 180F);
//                            double d5 = ((double)plane.barrelY / 16D) * Math.sin((rotationRoll * 3.141593F) / 180F) + ((double)plane.barrelZ / 16D) * Math.cos((rotationRoll * 3.141593F) / 180F);
//                            double d7 = Math.cos(((double)(-yaw) / 180D) * 3.1415926535897931D);
//                            double d9 = Math.sin(((double)(-yaw) / 180D) * 3.1415926535897931D);
//                            double d11 = Math.cos(((double)pitch / 180D) * 3.1415926535897931D);
//                            double d13 = Math.sin(((double)pitch / 180D) * 3.1415926535897931D);
//                            double d15 = (d1 * d11 - d3 * d13) * d7 + d5 * d9;
//                            double d17 = d1 * d13 + d3 * d11;
//                            double d19 = (d3 * d13 - d1 * d11) * d9 + d5 * d7;
//                            d1 -= 3D;
//                            double d21 = (d1 * d11 - d3 * d13) * d7 + d5 * d9 + rand.nextGaussian() / 100D;
//                            double d22 = d1 * d13 + d3 * d11 + rand.nextGaussian() / 100D;
//                            double d23 = (d3 * d13 - d1 * d11) * d9 + d5 * d7 + rand.nextGaussian() / 100D;
//
//                            ((SdkItemGun)gunAircraft.getType()).onItemRightClickEntity(gunAircraft, level, this, plane.barrelX / 16F, (float)d17, plane.barrelZ / 16F, 90F, 0.0F);
//
//                            shootDelay = plane.planeShootDelay;
//                            plane.barrelZ = -plane.barrelZ;
//                            takeInventoryItem(j, 1);
//                        }
//                    }
//                    break;
//
//                case 7: // '\007'
//                    if(!level.isServerSide && shootDelay <= 0 && plane.hasGuns && mod_Planes.bulletsEnabled)
//                    {
//                        int c = 0;
//                        byte byte1 = 0;
//                        for(int p1 = 1; p1 < plane.numRocketSlots + 1; p1++)
//                        {
//                            if(cargoItems[p1] != null && cargoItems[p1].itemId == mod_Planes.rocketAircraft.id)
//                            {
//                                c = p1;
//                            }
//                            if(cargoItems[p1] != null && cargoItems[p1].itemId == mod_Planes.rocketAircraftPanzer.id)
//                            {
//                                c = p1;
//                                byte1 = 1;
//                            }
//                        }
//
//                        if(c != 0)
//                        {
//                            double e1 = (double)plane.barrelX / 16D;
//                            double e3 = -((double)plane.barrelY / 16D) * Math.cos((rotationRoll * 3.141593F) / 180F) + ((double)plane.barrelZ / 16D) * -Math.sin((rotationRoll * 3.141593F) / 180F);
//                            double e11 = Math.cos(((double)pitch / 180D) * 3.1415926535897931D);
//                            double e13 = Math.sin(((double)pitch / 180D) * 3.1415926535897931D);
//                            double e17 = e1 * e13 + e3 * e11;
//                            if(byte1 == 0)
//                            {
//                                ((SdkItemGun)gunRocketAircraft.getType()).onItemRightClickEntity(gunRocketAircraft, level, this, plane.barrelX / 16F, (float)e17, plane.barrelZ / 16F, 90F, 0.0F);
//                            }
//                            if(byte1 == 1)
//                            {
//                                ((SdkItemGun)gunRocketAircraftPanzer.getType()).onItemRightClickEntity(gunRocketAircraft, level, this, plane.barrelX / 16F, (float)e17, plane.barrelZ / 16F, 90F, 0.0F);
//                            }
//                            shootDelay = 10; //itemek ma za duzy
//                            plane.barrelZ = -plane.barrelZ;
//                            takeInventoryItem(c, 1);
//                        }
//                    }
//                    break;
//
//
//                case 9: // '\t'
//                    if(level.isServerSide || bombDelay > 0 || !plane.hasBombs || !mod_Planes.bombsEnabled)
//                    {
//                        break;
//                    }
//                    int k = 0;
//                    byte byte0 = 0;
//                    for(int j1 = plane.numCargoSlots + plane.numRocketSlots + plane.numBulletSlots + 1; j1 < plane.numCargoSlots + plane.numRocketSlots + plane.numBulletSlots + plane.numBombSlots + 1; j1++)
//                    {
//                        if(cargoItems[j1] != null && cargoItems[j1].itemId == mod_Planes.smallBomb.id)
//                        {
//                            k = j1;
//                        }
//                        if(cargoItems[j1] != null && cargoItems[j1].itemId == mod_Planes.largeBomb.id)
//                        {
//                            k = j1;
//                            byte0 = 1;
//                        }
//                        if(cargoItems[j1] != null && cargoItems[j1].itemId == mod_Planes.napalm.id)
//                        {
//                            k = j1;
//                            byte0 = 2;
//                        }
//                        if(cargoItems[j1] != null && cargoItems[j1].itemId == mod_Planes.panzerBomb.id)
//                        {
//                            k = j1;
//                            byte0 = 3;
//                        }
//                    }
//
//                    if(k == 0)
//                    {
//                        break;
//                    }
//                    double d2 = (double)plane.bombXOffset / 16D;
//                    double d4 = -((double)plane.bombYOffset / 16D) * Math.cos((rotationRoll * 3.141593F) / 180F) + ((double)plane.bombZOffset / 16D) * -Math.sin((rotationRoll * 3.141593F) / 180F);
//                    double d6 = ((double)plane.bombYOffset / 16D) * Math.sin((rotationRoll * 3.141593F) / 180F) + ((double)plane.bombZOffset / 16D) * Math.cos((rotationRoll * 3.141593F) / 180F);
//                    double d8 = Math.cos(((double)(-yaw) / 180D) * 3.1415926535897931D);
//                    double d10 = Math.sin(((double)(-yaw) / 180D) * 3.1415926535897931D);
//                    double d12 = Math.cos(((double)pitch / 180D) * 3.1415926535897931D);
//                    double d14 = Math.sin(((double)(-pitch) / 180D) * 3.1415926535897931D);
//                    double d16 = (d2 * d12 - d4 * d14) * d8 + d6 * d10;
//                    double d18 = d2 * d14 + d4 * d12;
//                    double d20 = (d4 * d14 - d2 * d12) * d10 + d6 * d8;
//                    if(byte0 == 2 && (passenger instanceof PlayerBase))
//                    {
//                        ((PlayerBase)passenger).increaseStat(mod_Planes.dropNapalm, 1);
//                    }
//                    level.spawnEntity(new EntityBomb(level, x + d16, y + d18, z + d20, velocityX, velocityY, velocityZ, byte0)); //bomba
//                    level.playSound(this, plane.bombSound, 1.0F, 1.0F);
//                    takeInventoryItem(k, 1);
//                    bombDelay = plane.planeBombDelay;
//                    break;
//
//                case 12: // '\007'
//                    if(!level.isServerSide) {
//                        if (SdkTools.minecraft.currentScreen instanceof GuiPlane) {
//                            SdkTools.minecraft.openScreen(null);
//                        } else if (passenger.vehicle instanceof EntityPlaneNew) {
//                            SdkTools.minecraft.openScreen(new GuiPlaneNew(((PlayerBase)passenger).inventory, (EntityPlaneNew)passenger.vehicle));
//                        }
//                    }

            }
        }
//        if(!level.isServerSide && i == 7)
//        {
////            ModLoader.OpenGUI((EntityPlayer)passenger, new GuiPlane(((EntityPlayer)passenger).inventory, this));
//        }
        if(i == 8)
        {
            for(int l = 0; l < plane.numPassengers; l++)
            {
                if(!(passengerSeats[l].passenger instanceof Wolf))
                {
                    continue;
                }
                Wolf entitywolf = (Wolf)passengerSeats[l].passenger;
                if(entitywolf.isTamed() && ((PlayerBase)passenger).name != null && entitywolf.getOwner() != null && ((PlayerBase)passenger).name == entitywolf.getOwner())
                {
                    entitywolf.startRiding(passengerSeats[l]);
                }
            }

            passenger.startRiding(this);
        }
    }

    public void tick()
    {
        super.tick();
        fallDistance = 0.0F;
        for(int i = 0; i < plane.numPassengers; i++)
        {
            passengerSeats[i].updatePlanePosition(x, y, z, yaw, pitch);
        }

        if(boatTimeSinceHit > 0)
        {
            boatTimeSinceHit--;
        }
        if(boatCurrentDamage > 0)
        {
            boatCurrentDamage--;
        }
        prevX = x;
        prevY = y;
        prevZ = z;
        if(SdkTools.minecraft.currentScreen == null && passenger != null && (passenger instanceof PlayerBase)) //ModLoader.isGUIOpen(null)
        {
            if(mod_Planes.useMouseControl && !level.isServerSide)
            {
//                ModLoader.OpenGUI((EntityPlayer)passenger, new GuiPlaneController(this));
            } else
            {
                if(Keyboard.isKeyDown(SdkTools.minecraft.options.jumpKey.key))
                {
                    pressKey(0);
                }
                if(Keyboard.isKeyDown(SdkTools.minecraft.options.leftKey.key))
                {
                    pressKey(1);
                }
                if(Keyboard.isKeyDown(SdkTools.minecraft.options.sneakKey.key))
                {
                    pressKey(2);
                }
                if(Keyboard.isKeyDown(SdkTools.minecraft.options.rightKey.key))
                {
                    pressKey(3);
                }
                if(Keyboard.isKeyDown(SdkTools.minecraft.options.forwardKey.key))
                {
                    pressKey(4);
                }
                if(Keyboard.isKeyDown(SdkTools.minecraft.options.backKey.key))
                {
                    pressKey(5);
                }
//                if(Keyboard.isKeyDown(KeyBindingListener.keyBinding_altfire.key))
//                {
//                    pressKey(6);
//                }
//                if(Keyboard.isKeyDown(KeyBindingListener.keyBinding_rocket.key))
//                {
//                    pressKey(7);
//                }
//                if(Keyboard.isKeyDown(KeyBindingListener.keyBinding_exit.key))
//                {
//                    pressKey(8);
//                }
//                if(Keyboard.isKeyDown(KeyBindingListener.keyBinding_bomb.key))
//                {
//                    pressKey(9);
//                }
//                if(Keyboard.isKeyDown(KeyBindingListener.keyBinding_altinventory.key))
//                {
//                    pressKey(12);
//                }
            }
        }
        if(shootDelay > 0)
        {
            shootDelay--;
        }
        if(bombDelay > 0)
        {
            bombDelay--;
        }
        if(flapsPitchLeft < -15F)
        {
            flapsPitchLeft = -15F;
        }
        if(flapsPitchLeft > 15F)
        {
            flapsPitchLeft = 15F;
        }
        if(flapsPitchRight < -15F)
        {
            flapsPitchRight = -15F;
        }
        if(flapsPitchRight > 15F)
        {
            flapsPitchRight = 15F;
        }
        if(flapsYaw < -15F)
        {
            flapsYaw = -15F;
        }
        if(flapsYaw > 15F)
        {
            flapsYaw = 15F;
        }
        flapsYaw *= 0.80000000000000004D;
        flapsPitchLeft *= 0.80000000000000004D;
        flapsPitchRight *= 0.80000000000000004D;
        if(propellerSpeed < 0.0D)
        {
            propellerSpeed = 0.0D;
        }
        if(propellerSpeed > (double)(plane.maxPropSpeed + (float)engineType))
        {
            propellerSpeed = plane.maxPropSpeed + (float)engineType;
        }
        if(propellerSpeed > 0.0D && propellerSpeed < 1.0D && soundPosition == 0 && planeFuel > 0)
        {
            level.playSound(this, plane.startSound, 0.5F, 1.0F); //oryg 1.0F
            soundPosition = plane.startSoundLength;
        }
        if(propellerSpeed > 1.0D && soundPosition == 0 && planeFuel > 0)
        {
            level.playSound(this, plane.propSound, 0.5F, 1.0F); //oryg 1.0F
            soundPosition = plane.propSoundLength;
        }
        if(soundPosition > 0)
        {
            soundPosition--;
        }
        int j = 0;
        if(propellerSpeed > 0.0D && propellerSpeed < 0.20000000000000001D)
        {
            j = 1;
        }
        if(planeDamage > plane.planeHealth / 2)
        {
            j = (10 * planeDamage) / plane.planeHealth;
        }
        double d = (double)plane.propellerX / 16D;
        double d1 = ((double)plane.propellerY / 16D) * Math.cos((rotationRoll * 3.141593F) / 180F) + ((double)plane.propellerZ / 16D) * -Math.sin((rotationRoll * 3.141593F) / 180F);
        double d2 = ((double)plane.propellerY / 16D) * -Math.sin((rotationRoll * 3.141593F) / 180F) + ((double)plane.propellerZ / 16D) * Math.cos((rotationRoll * 3.141593F) / 180F);
        double d3 = Math.cos(((double)(-yaw) / 180D) * 3.1415926535897931D);
        double d4 = Math.sin(((double)(-yaw) / 180D) * 3.1415926535897931D);
        double d5 = Math.cos(((double)pitch / 180D) * 3.1415926535897931D);
        double d6 = Math.sin(((double)pitch / 180D) * 3.1415926535897931D);
        double d7 = (d * d5 - d1 * d6) * d3 + d2 * d4;
        double d8 = d * d6 + d1 * d5;
        double d9 = (d1 * d6 - d * d5) * d4 + d2 * d3;
        plane.propellerZ = -plane.propellerZ;
        for(int k = 0; k < j; k++)
        {
            double ad = (x + rand.nextDouble() * 1.5D) - 0.75D;
            double ad1 = ((y + rand.nextDouble() - 0.5D)) + 0.25D;
            double ad2 = (z + rand.nextDouble() - 0.5D);
            if(planeDamage > (4 * plane.planeHealth) / 5)
            {
                level.addParticle("largesmoke", x + d7, y + d8, z + d9, velocityX, velocityY, velocityZ); //dodac ognia
            } else
            {
                level.addParticle("smoke", x + d7, y + d8, z + d9, velocityX, velocityY, velocityZ);
            }
            if(planeDamage > (4.5 * plane.planeHealth) / 5)
            {
                if(Math.random() < 0.2D) {
                    level.addParticle("flame", ad, ad1, ad2, velocityX, velocityY, velocityZ);
                }
            }
        }

        if(level.isServerSide)
        {
            if(field_9394_d > 0)
            {
                double d10 = x + (field_9393_e - x) / (double)field_9394_d;
                double d14 = y + (field_9392_f - y) / (double)field_9394_d;
                double d17 = z + (field_9391_g - z) / (double)field_9394_d;
                double d20;
                for(d20 = field_9390_h - (double)yaw; d20 < -180D; d20 += 360D) { }
                for(; d20 >= 180D; d20 -= 360D) { }
                yaw += d20 / (double)field_9394_d;
                pitch += (field_9389_i - (double)pitch) / (double)field_9394_d;
                field_9394_d--;
                setPosition(d10, d14, d17);
                setRotation(yaw, pitch);
            } else
            {
                double d11 = x + velocityX;
                double d15 = y + velocityY;
                double d18 = z + velocityZ;
                setPosition(d11, d15, d18);
                if(onGround)
                {
                    velocityX *= 0.5D;
                    velocityY *= 0.5D;
                    velocityZ *= 0.5D;
                }
                velocityX *= 0.99000000953674316D;
                velocityY *= 0.94999998807907104D;
                velocityZ *= 0.99000000953674316D;
            }
            return;
        }
        if(planeFuel <= 0 && passenger != null && !level.isServerSide)
        {
            if(cargoItems[0] != null && cargoItems[0].itemId == mod_Planes.planeFuel.id)  //PALIWO
            {
                planeFuel = plane.planeFuelAdd;
                takeInventoryItem(0, 1);
            } else
            {
                propellerSpeed -= 0.01D * plane.decceleration;
            }
        }
        if(planeFuel > 0 && passenger != null)
        {
            planeFuel--;
        }
        if(planeDamage > (4.5 * plane.planeHealth) / 5 && rand.nextInt(30) == 0) //samoniszczenie
        {
            damage(this, 1);
        }
        if(passenger != null && (passenger instanceof Living) && !(passenger instanceof PlayerBase))
        {
            double d12 = (propellerSpeed + (double)engineType) - (double)plane.takeOffSpeed;
            if(d12 < 0.0D)
            {
                d12 = 0.0D;
            }
            double d16 = passenger.velocityX;
            double d19 = passenger.velocityY;
            double d21 = passenger.velocityZ;
            double d22 = Math.sqrt(d16 * d16 + d19 * d19 + d21 * d21);
            propellerSpeed += d22;
            double d23 = passenger.yaw;
            double d24 = passenger.pitch;
            if(d23 - (double)yaw > 1.0D)
            {
                yaw += d12 / 3D;
            }
            if(d23 - (double)yaw < 1.0D)
            {
                yaw -= d12 / 3D;
            }
            if(d24 - (double)pitch > 1.0D)
            {
                pitch += d12 / 3D;
            }
            if(d24 - (double)pitch < 1.0D)
            {
                pitch -= d12 / 3D;
            }
        }
        if(velocityYaw < -5F)
        {
            velocityYaw = -5F;
        }
        if(velocityYaw > 5F)
        {
            velocityYaw = 5F;
        }
        if(velocityPitch < -5F)
        {
            velocityPitch = -5F;
        }
        if(velocityPitch > 5F)
        {
            velocityPitch = 5F;
        }
        if(velocityRoll < -5F)
        {
            velocityRoll = -5F;
        }
        if(velocityRoll > 5F)
        {
            velocityRoll = 5F;
        }
        velocityYaw *= 0.8F;
        velocityPitch *= 0.8F;
        velocityRoll *= 0.8F;
        if(yaw > 180F)
        {
            yaw -= 360F;
        }
        if(yaw < -180F)
        {
            yaw += 360F;
        }
        if(pitch > 180F)
        {
            pitch -= 360F;
        }
        if(pitch < -180F)
        {
            pitch += 360F;
        }
        if(rotationRoll > 180F)
        {
            rotationRoll -= 360F;
        }
        if(rotationRoll < -180F)
        {
            rotationRoll += 360F;
        }
        if(propellerSpeed >= (double)(plane.maxPropSpeed + 4F) && passenger != null && (passenger instanceof PlayerBase))
        {
            ((PlayerBase)passenger).increaseStat(mod_Planes.maxSpeed, 1);
        }
        if(y > (double)plane.maxHeight && pitch < 0.0F)
        {
            pitch *= 0.80000000000000004D;
        }
        if(y > (double)plane.maxHeight)
        {
            setPosition(x, plane.maxHeight, z);
        }
        if((double)planeDamage >= (double)plane.planeHealth * 0.80000000000000004D)
        {
            propellerSpeed -= 0.01D;
        }
        if(propellerSpeed > 0.0D && passenger == null)
        {
            propellerSpeed -= 0.0050000000000000001D * plane.decceleration;
        }
        double d13 = getSpeed() * 0.90000000000000002D + propellerSpeed;
        if(d13 < 0.0D)
        {
            d13 = 0.0D;
        }
        velocityX = -((d13 / 10D) * Math.cos(((double)yaw / 180D) * 3.1415926535897931D) * Math.cos(((double)pitch / 180D) * 3.1415926535897931D));
        velocityY = motionG - (d13 / 10D) * Math.sin(((double)pitch / 180D) * 3.1415926535897931D);
        velocityZ = -((d13 / 10D) * Math.sin(((double)yaw / 180D) * 3.1415926535897931D) * Math.cos(((double)pitch / 180D) * 3.1415926535897931D));
        if(onGround && passenger == null)
        {
            velocityX = 0.0D;
            velocityY = 0.0D;
            velocityZ = 0.0D;
            if (!plane.sloped) {
                pitch *= 0.80000000000000004D;
            }
            propellerSpeed *= 0.80000000000000004D;
        }
        if(onGround)
        {
            motionG = 0.0D;
            rotationRoll *= 0.80000000000000004D;
        }
        if((onGround || field_1626) && Math.sqrt(velocityX * velocityX + velocityY * velocityY + velocityZ * velocityZ) > 0.20000000000000001D && (pitch > 30F || rotationRoll > 30F || rotationRoll < -30F || field_1624))
        {
//            if(mod_Planes.planesExplode && SdkTools.minecraft.options.difficulty != 0)
//            {
//                level.createExplosion(null, x, y, z, 5F * (float)Math.sqrt(velocityX * velocityX + velocityY * velocityY + velocityZ * velocityZ));
//                for(int l = (int)x - 3; l < (int)x + 3; l++)
//                {
//                    for(int i1 = (int)y - 2; i1 < (int)y + 2; i1++)
//                    {
//                        for(int k1 = (int)z - 3; k1 < (int)z + 3; k1++)
//                        {
//                            if(level.getTileId(l, i1, k1) == 0 && rand.nextBoolean())
//                            {
//                                level.setTile(l, i1, k1, BlockBase.FIRE.id);
//                            }
//                        }
//
//                    }
//
//                }
//
//            }
            damage(null, plane.planeHealth);
        }
        if(!level.isServerSide)
        {
            motionG += propellerSpeed / 100D - 0.024500000000000001D;
        }
        if(motionG > 0.0D)
        {
            motionG = 0.0D;
        }
        angle += (float)propellerSpeed * 0.07F;
        move(velocityX, velocityY, velocityZ);
        yaw += velocityYaw;
        pitch += velocityPitch;
        rotationRoll += velocityRoll;
        setRotation(yaw, pitch);
        List list = level.getEntities(this, boundingBox.expand(0.20000000298023224D, 0.0D, 0.20000000298023224D));
        if(list != null && list.size() > 0)
        {
            for(int j1 = 0; j1 < list.size(); j1++)
            {
                EntityBase entity = (EntityBase)list.get(j1);
                boolean flag = true;
                for(int l1 = 0; l1 < plane.numPassengers; l1++)
                {
                    if(entity == passengerSeats[l1] || passengerSeats[l1].passenger != null && entity == passengerSeats[l1].passenger)
                    {
                        flag = false;
                    }
                }

                if(flag && entity != passenger && entity.method_1380() && (entity instanceof EntityPlaneNew))
                {
                    entity.method_1353(this);
                }
            }

        }
        if(passenger != null && passenger.removed)
        {
            passenger = null;
        }
        if(passenger == null && propellerSpeed == 0 && plane.sloped)
        {
            if(pitch > plane.slopedPitch) //dodac wlaściWOSC !!!
                pitch = pitch - 1F;
        }
    }

    public void method_1353(EntityBase entity)
    {
        if(entity.passenger == this || entity.vehicle == this)
        {
            return;
        }
        for(int i = 0; i < plane.numPassengers; i++)
        {
            if(entity == passengerSeats[i] || passengerSeats[i].passenger != null && entity == passengerSeats[i].passenger)
            {
                return;
            }
        }

        super.method_1353(entity);
    }

    public void method_1382()
    {
        if(passenger == null)
        {
            return;
        }
        if(passenger == SdkTools.minecraft.player || (passenger instanceof Wolf))
        {
            double d = plane.playerXOffset/16.0D; //0.0D
            double d1 = (getMountedHeightOffset() + passenger.getHeightOffset()) * Math.cos((rotationRoll * 3.141593F) / 180F);
            double d2 = -(getMountedHeightOffset() + passenger.getHeightOffset()) * Math.sin((rotationRoll * 3.141593F) / 180F);
            double d3 = Math.cos(((double)(-yaw) / 180D) * 3.1415926535897931D);
            double d4 = Math.sin(((double)(-yaw) / 180D) * 3.1415926535897931D);
            double d5 = Math.cos(((double)pitch / 180D) * 3.1415926535897931D);
            double d6 = Math.sin(((double)pitch / 180D) * 3.1415926535897931D);
            double d7 = Math.cos(((double)yaw * 3.1415926535897931D) / 180D) * 0.40000000000000002D * d5;
            double d8 = Math.sin(((double)yaw * 3.1415926535897931D) / 180D) * 0.40000000000000002D * d5;
            double d9 = (d * d5 - d1 * d6) * d3 + d2 * d4;
            double d10 = d * d6 + d1 * d5;
            double d11 = (d1 * d6 - d * d5) * d4 + d2 * d3;
            passenger.setPosition(x + d9 + d7, y + d10, z + d11 + d8);
            if(mod_Planes.useMouseControl && !level.isServerSide)
            {
                passenger.prevYaw = passenger.yaw;
                passenger.prevPitch = passenger.pitch;
                ((EntityBaseAccessor)passenger).invokeSetRotation(yaw + 90F, pitch);
//                passenger.setRotation(yaw + 90F, pitch);
            }
            return;
        } else
        {
            return;
        }
    }

    protected void writeCustomDataToTag(CompoundTag nbttagcompound)
    {
        ListTag nbttaglist = new ListTag();
        for(int i = 0; i < cargoItems.length; i++)
        {
            if(cargoItems[i] != null)
            {
                CompoundTag nbttagcompound1 = new CompoundTag();
                nbttagcompound1.put("Slot", (byte)i);
                cargoItems[i].toTag(nbttagcompound1);
                nbttaglist.add(nbttagcompound1);
            }
        }

        nbttagcompound.put("RotationYaw", yaw);
        nbttagcompound.put("EngineType", engineType);
        nbttagcompound.put("Items", nbttaglist);
        nbttagcompound.put("Type", plane.shortName);
        nbttagcompound.put("PlaneDmg", planeDamage);
    }

    protected void readCustomDataFromTag(CompoundTag nbttagcompound)
    {
        plane = mod_Planes.getPlaneTypeNew(nbttagcompound.getString("Type"));
        standingEyeHeight = plane.standingOko;
        setSize(plane.planeWidth, plane.planeHeight);
        setPosition(x, y, z);
        inventorySize = plane.numCargoSlots + plane.numBulletSlots + plane.numBombSlots + plane.numRocketSlots + 1;
        ListTag nbttaglist = nbttagcompound.getListTag("Items");
        cargoItems = new ItemInstance[getInventorySize()];
        for(int i = 0; i < nbttaglist.size(); i++)
        {
            CompoundTag nbttagcompound1 = (CompoundTag)nbttaglist.get(i);
            int k = nbttagcompound1.getByte("Slot") & 0xff;
            if(k >= 0 && k < cargoItems.length)
            {
                cargoItems[k] = new ItemInstance(nbttagcompound1);
            }
        }
        planeDamage = nbttagcompound.getInt("PlaneDmg");
        yaw = nbttagcompound.getFloat("RotationYaw");
        engineType = nbttagcompound.getInt("EngineType");
        if(engineType < 1)
        {
            engineType = 1;
        }
        if(engineType > 4)
        {
            engineType = 4;
        }
        passengerSeats = new EntityPassengerSeat[plane.numPassengers];
        for(int j = 0; j < plane.numPassengers; j++)
        {
            passengerSeats[j] = new EntityPassengerSeat(level, plane.seatsX[j], plane.seatsY[j], plane.seatsZ[j], this);
            level.spawnEntity(passengerSeats[j]);
        }

    }

    public float getEyeHeight()
    {
        return 0.0F;
    }

    public int getInventorySize()
    {
        return inventorySize;
    }

    public ItemInstance getInventoryItem(int i)
    {
        return cargoItems[i];
    }

    public ItemInstance takeInventoryItem(int i, int j)
    {
        if(cargoItems[i] != null)
        {
            if(cargoItems[i].count <= j)
            {
                ItemInstance itemstack = cargoItems[i];
                cargoItems[i] = null;
                return itemstack;
            }
            ItemInstance itemstack1 = cargoItems[i].split(j);
            if(cargoItems[i].count == 0)
            {
                cargoItems[i] = null;
            }
            return itemstack1;
        } else
        {
            return null;
        }
    }

    public String getContainerName()
    {
        return plane.name;
    }

    public int getMaxItemCount()
    {
        return 64;
    }

    public void markDirty()
    {
    }

    public void setInventoryItem(int i, ItemInstance itemstack)
    {
        cargoItems[i] = itemstack;
        if(itemstack != null && itemstack.count > getMaxItemCount())
        {
            itemstack.count = getMaxItemCount();
        }
        if(itemstack != null && itemstack.itemId == 263 && i == 0 && passenger != null && (passenger instanceof PlayerBase))
        {
            ((PlayerBase)passenger).increaseStat(mod_Planes.startPlane, 1);
        }
    }

    public boolean interact(PlayerBase entityplayer)
    {
        if(entityplayer.getHeldItem() != null && entityplayer.getHeldItem().itemId == ItemCasingListener.itemWrenchGold.id)
        {
            System.out.println("MAX: " + plane.planeHealth);
            System.out.println("DMG: " + planeDamage);
            System.out.println("TYPE: " + plane.shortName);
            return true;
        }
        if(entityplayer.getHeldItem() != null && entityplayer.getHeldItem().itemId == mod_Planes.planeBlowTorch.id)
        {
            if(planeDamage < plane.planeHealth && planeDamage > 0)
            {
                level.playSound(this, "planes:wrench", 1.0F, (rand.nextFloat() - rand.nextFloat()) * 0.2F + 1.0F);
                planeDamage = Math.max(planeDamage - 12, 0);
                entityplayer.swingHand();
                entityplayer.getHeldItem().applyDamage(1, entityplayer);
                if(entityplayer.getHeldItem().getDamage() <= 0)
                {
                    entityplayer.inventory.main[entityplayer.inventory.selectedHotbarSlot] = null;
                }
            }
            return true;
        }
        if(passenger != null && (passenger instanceof PlayerBase) && passenger != entityplayer)
        {
            return true;
        }
        if(!level.isServerSide && passenger != entityplayer)
        {
            if(passenger != null)
            {
                int i = 0;
                do
                {
                    if(i >= plane.numPassengers)
                    {
                        break;
                    }
                    if(passengerSeats[i].passenger == null)
                    {
                        entityplayer.startRiding(passengerSeats[i]);
                        if(mod_Planes.useMouseControl && !level.isServerSide)
                        {
//                            ModLoader.OpenGUI((EntityPlayer)passenger, new GuiPlaneController(this));
                        }
                        List list1 = level.getEntities(Wolf.class, Box.createButWasteMemory(x, y, z, x + 1.0D, y + 1.0D, z + 1.0D).expand(16D, 4D, 16D));
                        Iterator iterator1 = list1.iterator();
                        do
                        {
                            if(!iterator1.hasNext())
                            {
                                break;
                            }
                            EntityBase entity1 = (EntityBase)iterator1.next();
                            Wolf entitywolf1 = (Wolf)entity1;
                            if(entitywolf1.isTamed() && entityplayer.name.equals(entitywolf1.getOwner()))
                            {
                                int k = 0;
                                while(k < plane.numPassengers)
                                {
                                    if(passengerSeats[k].passenger == null)
                                    {
                                        entitywolf1.startRiding(passengerSeats[k]);
                                    }
                                    k++;
                                }
                            }
                        } while(true);
                        break;
                    }
                    i++;
                } while(true);
            } else
            {
                entityplayer.startRiding(this);
                if(mod_Planes.useMouseControl && !level.isServerSide)
                {
//                    ModLoader.OpenGUI((EntityPlayer)passenger, new GuiPlaneController(this));
                }
                List list = level.getEntities(Wolf.class, Box.createButWasteMemory(x, y, z, x + 1.0D, y + 1.0D, z + 1.0D).expand(16D, 4D, 16D));
                Iterator iterator = list.iterator();
                do
                {
                    if(!iterator.hasNext())
                    {
                        break;
                    }
                    EntityBase entity = (EntityBase)iterator.next();
                    Wolf entitywolf = (Wolf)entity;
                    if(entitywolf.isTamed() && entityplayer.name.equals(entitywolf.getOwner()))
                    {
                        int j = 0;
                        while(j < plane.numPassengers)
                        {
                            if(passengerSeats[j].passenger == null)
                            {
                                entitywolf.startRiding(passengerSeats[j]);
                            }
                            j++;
                        }
                    }
                } while(true);
            }
        }
        return true;
    }

    public boolean canPlayerUse(PlayerBase entityplayer)
    {
        if(removed)
        {
            return false;
        } else
        {
            return entityplayer.method_1352(this) <= 64D;
        }
    }

//    public boolean shouldRenderAtDistance(double d) {
//        return true;
//    }

    public boolean isFuelled()
    {
        return planeFuel > 0;
    }

    public int getBurnTimeRemainingScaled(int i)
    {
        return (planeFuel * i) / plane.planeFuelAdd;
    }

    Minecraft minecraft = Minecraft.class.cast(FabricLoader.getInstance().getGameInstance());
    public int boatCurrentDamage;
    public int boatTimeSinceHit;
    public int boatRockDirection;
    private int field_9394_d;
    private double field_9393_e;
    private double field_9392_f;
    private double field_9391_g;
    private double field_9390_h;
    private double field_9389_i;
    private double field_9388_j;
    private double field_9387_k;
    private double field_9386_l;
    public double propellerSpeed;
    public static double speed;
    private float length;
    private int planeDamage;
    public float flapsYaw;
    public float flapsPitchLeft;
    public float flapsPitchRight;
    private int shootDelay;
    private int planeFuel;
    public float rotationRoll;
    private int soundPosition;
    private int bombDelay;
    private int engineType;
    public float angle;
    public ItemInstance cargoItems[];
    public ItemInstance gunAircraft;
    public ItemInstance gunRocketAircraft;
    public ItemInstance gunRocketAircraftPanzer;
    public int inventorySize;
    public EntityPassengerSeat passengerSeats[];
    private double motionG;
    public float velocityYaw;
    public float velocityPitch;
    public float velocityRoll;
    public PlaneTypeNew plane;

    @Override
    public void fireKey(PlayerBase entityplayer) {
        if(!level.isServerSide && shootDelay <= 0 && plane.hasGuns && mod_Planes.bulletsEnabled)
        {
            int j = 0;
            for(int i1 = plane.numCargoSlots + plane.numRocketSlots + 1; i1 < plane.numCargoSlots + plane.numRocketSlots + plane.numBulletSlots + 1; i1++)
            {
                if(cargoItems[i1] != null && cargoItems[i1].itemId == mod_Planes.bullet.id)  //AMMO CHANGE
                {
                    j = i1;
                }
            }

            if(j != 0)
            {
                double d1 = (double)plane.barrelX / 16D;
                double d3 = -((double)plane.barrelY / 16D) * Math.cos((rotationRoll * 3.141593F) / 180F) + ((double)plane.barrelZ / 16D) * -Math.sin((rotationRoll * 3.141593F) / 180F);
                double d5 = ((double)plane.barrelY / 16D) * Math.sin((rotationRoll * 3.141593F) / 180F) + ((double)plane.barrelZ / 16D) * Math.cos((rotationRoll * 3.141593F) / 180F);
                double d7 = Math.cos(((double)(-yaw) / 180D) * 3.1415926535897931D);
                double d9 = Math.sin(((double)(-yaw) / 180D) * 3.1415926535897931D);
                double d11 = Math.cos(((double)pitch / 180D) * 3.1415926535897931D);
                double d13 = Math.sin(((double)pitch / 180D) * 3.1415926535897931D);
                double d15 = (d1 * d11 - d3 * d13) * d7 + d5 * d9;
                double d17 = d1 * d13 + d3 * d11;
                double d19 = (d3 * d13 - d1 * d11) * d9 + d5 * d7;
                d1 -= 3D;
                double d21 = (d1 * d11 - d3 * d13) * d7 + d5 * d9 + rand.nextGaussian() / 100D;
                double d22 = d1 * d13 + d3 * d11 + rand.nextGaussian() / 100D;
                double d23 = (d3 * d13 - d1 * d11) * d9 + d5 * d7 + rand.nextGaussian() / 100D;

                ((SdkItemGun)gunAircraft.getType()).onItemRightClickEntity(gunAircraft, level, this, plane.barrelX / 16F, (float)d17, plane.barrelZ / 16F, 90F, 0.0F);

                shootDelay = plane.planeShootDelay;
                plane.barrelZ = -plane.barrelZ;
                takeInventoryItem(j, 1);
            }
        }
    }

    @Override
    public void bombKey(PlayerBase entityplayer) {
        if(level.isServerSide || bombDelay > 0 || !plane.hasBombs || !mod_Planes.bombsEnabled)
        {
            return;
        }
        int k = 0;
        byte byte0 = 0;
        for(int j1 = plane.numCargoSlots + plane.numRocketSlots + plane.numBulletSlots + 1; j1 < plane.numCargoSlots + plane.numRocketSlots + plane.numBulletSlots + plane.numBombSlots + 1; j1++)
        {
            if(cargoItems[j1] != null && cargoItems[j1].itemId == mod_Planes.smallBomb.id)
            {
                k = j1;
            }
            if(cargoItems[j1] != null && cargoItems[j1].itemId == mod_Planes.largeBomb.id)
            {
                k = j1;
                byte0 = 1;
            }
            if(cargoItems[j1] != null && cargoItems[j1].itemId == mod_Planes.napalm.id)
            {
                k = j1;
                byte0 = 2;
            }
            if(cargoItems[j1] != null && cargoItems[j1].itemId == mod_Planes.panzerBomb.id)
            {
                k = j1;
                byte0 = 3;
            }
        }

        if(k == 0)
        {
            return;
        }
        double d2 = (double)plane.bombXOffset / 16D;
        double d4 = -((double)plane.bombYOffset / 16D) * Math.cos((rotationRoll * 3.141593F) / 180F) + ((double)plane.bombZOffset / 16D) * -Math.sin((rotationRoll * 3.141593F) / 180F);
        double d6 = ((double)plane.bombYOffset / 16D) * Math.sin((rotationRoll * 3.141593F) / 180F) + ((double)plane.bombZOffset / 16D) * Math.cos((rotationRoll * 3.141593F) / 180F);
        double d8 = Math.cos(((double)(-yaw) / 180D) * 3.1415926535897931D);
        double d10 = Math.sin(((double)(-yaw) / 180D) * 3.1415926535897931D);
        double d12 = Math.cos(((double)pitch / 180D) * 3.1415926535897931D);
        double d14 = Math.sin(((double)(-pitch) / 180D) * 3.1415926535897931D);
        double d16 = (d2 * d12 - d4 * d14) * d8 + d6 * d10;
        double d18 = d2 * d14 + d4 * d12;
        double d20 = (d4 * d14 - d2 * d12) * d10 + d6 * d8;
        if(byte0 == 2 && (passenger instanceof PlayerBase))
        {
            ((PlayerBase)passenger).increaseStat(mod_Planes.dropNapalm, 1);
        }
        level.spawnEntity(new EntityBomb(level, x + d16, y + d18, z + d20, velocityX, velocityY, velocityZ, byte0)); //bomba
        level.playSound(this, plane.bombSound, 1.0F, 1.0F);
        takeInventoryItem(k, 1);
        bombDelay = plane.planeBombDelay;
    }

    @Override
    public void inventoryKey(Minecraft minecraft, PlayerBase entityplayer) {
        if(!level.isServerSide) {
            if (SdkTools.minecraft.currentScreen instanceof GuiPlane) {
                SdkTools.minecraft.openScreen(null);
            } else if (passenger.vehicle instanceof EntityPlaneNew) {
                SdkTools.minecraft.openScreen(new GuiPlaneNew(((PlayerBase)passenger).inventory, (EntityPlaneNew)passenger.vehicle));
            }
        }
    }

    @Override
    public void exitKey(PlayerBase entityplayer) {
        for(int l = 0; l < plane.numPassengers; l++)
        {
            if(!(passengerSeats[l].passenger instanceof Wolf))
            {
                continue;
            }
            Wolf entitywolf = (Wolf)passengerSeats[l].passenger;
            if(entitywolf.isTamed() && ((PlayerBase)passenger).name != null && entitywolf.getOwner() != null && ((PlayerBase)passenger).name == entitywolf.getOwner())
            {
                entitywolf.startRiding(passengerSeats[l]);
            }
        }

        passenger.startRiding(this);
    }

    @Override
    public void rocketKey(PlayerBase entityplayer) {
        if(!level.isServerSide && shootDelay <= 0 && plane.hasGuns && mod_Planes.bulletsEnabled)
        {
            int c = 0;
            byte byte1 = 0;
            for(int p1 = 1; p1 < plane.numRocketSlots + 1; p1++)
            {
                if(cargoItems[p1] != null && cargoItems[p1].itemId == mod_Planes.rocketAircraft.id)
                {
                    c = p1;
                }
                if(cargoItems[p1] != null && cargoItems[p1].itemId == mod_Planes.rocketAircraftPanzer.id)
                {
                    c = p1;
                    byte1 = 1;
                }
            }

            if(c != 0)
            {
                double e1 = (double)plane.barrelX / 16D;
                double e3 = -((double)plane.barrelY / 16D) * Math.cos((rotationRoll * 3.141593F) / 180F) + ((double)plane.barrelZ / 16D) * -Math.sin((rotationRoll * 3.141593F) / 180F);
                double e11 = Math.cos(((double)pitch / 180D) * 3.1415926535897931D);
                double e13 = Math.sin(((double)pitch / 180D) * 3.1415926535897931D);
                double e17 = e1 * e13 + e3 * e11;
                if(byte1 == 0)
                {
                    ((SdkItemGun)gunRocketAircraft.getType()).onItemRightClickEntity(gunRocketAircraft, level, this, plane.barrelX / 16F, (float)e17, plane.barrelZ / 16F, 90F, 0.0F);
                }
                if(byte1 == 1)
                {
                    ((SdkItemGun)gunRocketAircraftPanzer.getType()).onItemRightClickEntity(gunRocketAircraft, level, this, plane.barrelX / 16F, (float)e17, plane.barrelZ / 16F, 90F, 0.0F);
                }
                shootDelay = 10; //itemek ma za duzy
                plane.barrelZ = -plane.barrelZ;
                takeInventoryItem(c, 1);
            }
        }
    }

    @Override
    public void reloadKey(PlayerBase entityplayer) {

    }
//    public RotatedAxes axes;
}

