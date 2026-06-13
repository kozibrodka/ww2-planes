package net.kozibrodka.planes.entity;

import net.kozibrodka.planes.events.mod_Planes;
import net.kozibrodka.planes.gui.GuiPlane;
import net.kozibrodka.planes.mixin.EntityBaseAccessor;
import net.kozibrodka.planes.properties.PlaneType;
import net.kozibrodka.sdk_api.events.init.ItemCasingListener;
import net.kozibrodka.sdk_api.events.init.KeyBindingListener;
import net.kozibrodka.sdk_api.events.init.ww2Parts;
import net.kozibrodka.sdk_api.events.utils.SdkItemGun;
import net.kozibrodka.sdk_api.events.utils.SdkTools;
import net.kozibrodka.sdk_api.events.utils.WW2Plane;
import net.kozibrodka.sdk_api.events.utils.WW2Tank;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Monster;
import net.minecraft.entity.passive.WolfEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.nbt.NbtList;
import net.minecraft.util.math.Box;
import net.minecraft.world.World;
import org.lwjgl.input.Keyboard;

import java.util.Iterator;
import java.util.List;


public class EntityPlane extends Entity
        implements Inventory, WW2Plane
{

    public EntityPlane(World world)
    {
        super(world);
        boatCurrentDamage = 0;
        boatTimeSinceHit = 0;
        boatRockDirection = 1;
        blocksSameBlockSpawning = true;  //prevententityfromspawn
        setBoundingBoxSpacing(6F, 1.8F);
        standingEyeHeight = height / 2.0F - 0.17F;
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
        EXPLOSION_MIN = 0.40000000000000001D;
        COLLISION_MIN = 0.20000000000000001D;
        ignoreFrustumCull = true; //ignoreFrustumCheck
        gunAircraft = new ItemStack(mod_Planes.itemGunAircraft);
        gunRocketAircraft = new ItemStack(mod_Planes.itemGunAircraftRocket);
        gunRocketAircraftPanzer = new ItemStack(mod_Planes.itemGunAircraftRocketPanzer);
        lastCollidedEntity = null;
        prevMotionX = 0.0D;
        prevMotionY = 0.0D;
        prevMotionZ = 0.0D;
    }

    public EntityPlane(World world, double d, double d1, double d2)
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
            plane = (PlaneType)PlaneType.types.get(0);
        } else
        {
            plane = mod_Planes.type;
        }
        passengerSeats = new EntityPassengerSeat[plane.numPassengers];
        for(int i = 0; i < plane.numPassengers; i++)
        {
            if(world != null)
            {
                passengerSeats[i] = new EntityPassengerSeat(world, plane.seatsX[i], plane.seatsY[i], plane.seatsZ[i], this);
                world.spawnEntity(passengerSeats[i]);
            }
        }

        inventorySize = plane.numCargoSlots + plane.numBulletSlots + plane.numBombSlots + plane.numRocketSlots + 1; //
        cargoItems = new ItemStack[inventorySize];
    }

    public EntityPlane(World world, double d, double d1, double d2,
                       PlayerEntity entityplayer, int i, PlaneType planetype)
    {
        this(world);
        plane = planetype;
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
            if(world != null)
            {
                passengerSeats[j] = new EntityPassengerSeat(world, plane.seatsX[j], plane.seatsY[j], plane.seatsZ[j], this);
                world.spawnEntity(passengerSeats[j]);
            }
        }

        inventorySize = plane.numCargoSlots + plane.numBulletSlots + plane.numBombSlots + plane.numRocketSlots + 1;
        cargoItems = new ItemStack[inventorySize];
    }

    protected void initDataTracker()
    {
    }

    protected boolean bypassesSteppingEffects()
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
        boundingBox.set(d - (double)f, (d1 - (double)standingEyeHeight) + (double)cameraOffset, d2 - (double)f, d + (double)f, (d1 - (double)standingEyeHeight) + (double)cameraOffset + (double)f1, d2 + (double)f);
    }

    public void setRotationRoll(float f)
    {
        velocityRoll = (f - rotationRoll) / 3F;
    }

    public Box getCollisionAgainstShape(Entity entity)
    {
        return entity.boundingBox;
    }

    public Box getBoundingBox()
    {
        return boundingBox;
    }

    public boolean isPushable()
    {
        return true;
    }

    public double getPassengerRidingHeight()
    {
        return plane.playerYOffset;
    }

    public void spawnParticles(String s, int i, boolean flag)
    {
        for(int j = 0; j < i; j++)
        {
            double d = (x + random.nextDouble() * 1.5D) - 0.75D;
            double d1 = ((y + random.nextDouble() - 0.5D)) + 0.25D;
            double d2 = (z + random.nextDouble() - 0.5D);
            double d3 = flag ? random.nextDouble() - 0.5D : 0.0D;
            double d4 = flag ? random.nextDouble() - 0.5D : 0.0D;
            double d5 = flag ? random.nextDouble() - 0.5D : 0.0D;
            if(Math.random() < 0.75D)
            {
                world.addParticle(s, d, d1, d2, d3, d4, d5);
            } else
            {
                world.addParticle(s, d, d1, d2, d3, d4, d5);
            }
        }

    }

    public boolean damage(Entity entity, int i)
    {
        if(dead)
        {
            return true;
        }
        if(entity instanceof LivingEntity){
            if(entity instanceof Monster){
                boatRockDirection = -boatRockDirection;
                boatTimeSinceHit = 10;
                boatCurrentDamage += i * 10;
                if(boatCurrentDamage > 40)
                {
                    boatCurrentDamage = 40;
                }
                scheduleVelocityUpdate(); //setBeenAttacked
                planeDamage += (int)i/5;
                world.playSound(this, "planes:mechhurt", 1.0F, (random.nextFloat() - random.nextFloat()) * 0.2F + 1.0F);
                System.out.println("PLANE DAMAGED from: " + entity + " DMG: " + (int)i/5);
            }
        }else{
            boatRockDirection = -boatRockDirection;
            boatTimeSinceHit = 10;
            boatCurrentDamage += i * 10;
            if(boatCurrentDamage > 40)
            {
                boatCurrentDamage = 40;
            }
            scheduleVelocityUpdate(); //setBeenAttacked
            planeDamage += i;
            world.playSound(this, "planes:mechhurt", 1.0F, (random.nextFloat() - random.nextFloat()) * 0.2F + 1.0F);
            System.out.println("PLANE DAMAGED from: " + entity + " DMG: " + i);
        }

        if(planeDamage > plane.planeHealth && !world.isRemote) //oryg >600
        {
            markDead();
            if(mod_Planes.planesExplode && SdkTools.minecraft.options.difficulty != 0)
            {
                world.createExplosion(null, x, y, z, 5F * (float)Math.sqrt(velocityX * velocityX + velocityY * velocityY + velocityZ * velocityZ));
                spawnParticles("explode", 64, true);
                for(int l = (int)x - 3; l < (int)x + 3; l++)
                {
                    for(int i1 = (int)y - 2; i1 < (int)y + 2; i1++)
                    {
                        for(int k1 = (int)z - 3; k1 < (int)z + 3; k1++)
                        {
                            if(world.getBlockId(l, i1, k1) == 0 && random.nextInt(4) == 0)
                            {
                                world.setBlock(l, i1, k1, Block.FIRE.id);
                            }
                        }

                    }

                }

            }
            dropParts();
        }
        return true;
    }

    public void dropParts(){
        int r8 = 2;
        float f8 = 1.5F;
        if(plane.item_bay.itemId != Item.EGG.id && random.nextInt(r8) == 0)
            dropItem(plane.item_bay.itemId, 1, f8);
        if(random.nextInt(r8) == 0)
            dropItem(plane.item_cockpit.itemId, 1, f8);
        if(random.nextInt(r8) == 0)
            dropItem(plane.item_propeller.itemId, 1, f8);
        if(random.nextInt(r8) == 0)
            dropItem(plane.item_tail.itemId, 1, f8);
        if(random.nextInt(r8) == 0)
            dropItem(plane.item_wings.itemId, 1, f8);
        if(random.nextInt(r8) == 0)
            dropItem(plane.item_wings.itemId, 1, f8);
        if(plane.item_guns.itemId != Item.EGG.id && random.nextInt(r8) == 0)
            dropItem(plane.item_guns.itemId, 1, f8);
        if(plane.item_guns.itemId != Item.EGG.id && random.nextInt(r8) == 0)
            dropItem(plane.item_guns.itemId, 1, f8);
        switch(engineType)
        {
            case 1: // '\001'
                if(random.nextInt(r8) == 0)
                    dropItem(ww2Parts.smallEngine.id, 1, f8);
                break;

            case 2: // '\002'
                if(random.nextInt(r8) == 0)
                    dropItem(ww2Parts.mediumEngine.id, 1, f8);
                break;

            case 3: // '\003'
                if(random.nextInt(r8) == 0)
                    dropItem(ww2Parts.largeEngine.id, 1, f8);
                break;

            case 4: // '\004'
                if(random.nextInt(r8) == 0)
                    dropItem(ww2Parts.rotaryEngine.id, 1, f8);
                break;

        }

        if(plane.dyeColor != 16 && random.nextInt(r8) == 0)
            dropItem(new ItemStack(Item.DYE, random.nextInt(6) + 1, plane.dyeColor), f8);
    }

    public void markDead()
    {
        if(!world.isRemote)
        {
            label0:
            for(int i = 0; i < size(); i++)
            {
                ItemStack itemstack = getStack(i);
                if(itemstack == null)
                {
                    continue;
                }
                float f = random.nextFloat() * 0.8F + 0.1F;
                float f1 = random.nextFloat() * 0.8F + 0.1F;
                float f2 = random.nextFloat() * 0.8F + 0.1F;
                do
                {
                    if(itemstack.count <= 0)
                    {
                        continue label0;
                    }
                    int k = random.nextInt(21) + 10;
                    if(k > itemstack.count)
                    {
                        k = itemstack.count;
                    }
                    itemstack.count -= k;
                    ItemEntity entityitem = new ItemEntity(world, x + (double)f, y + (double)f1, z + (double)f2, new ItemStack(itemstack.itemId, k, itemstack.getDamage()));
                    float f3 = 0.05F;
                    entityitem.velocityX = (float)random.nextGaussian() * f3;
                    entityitem.velocityY = (float)random.nextGaussian() * f3 + 0.2F;
                    entityitem.velocityZ = (float)random.nextGaussian() * f3;
                    world.spawnEntity(entityitem);
                } while(true);
            }

        }
        for(int j = 0; j < plane.numPassengers; j++)
        {
            passengerSeats[j].markDead();
        }

        super.markDead();
    }

    public void animateHurt() //performHurtAnimation
    {
        boatRockDirection = -boatRockDirection;
        boatTimeSinceHit = 10;
        boatCurrentDamage += boatCurrentDamage * 10;
    }

    public boolean isCollidable() //canBeCollidedWith
    {
        return !dead;
    }

    public void setPositionAndAnglesAvoidEntities(double d, double d1, double d2, float f,
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

    public void setVelocityClient(double d, double d1, double d2)
    {
        field_9388_j = velocityX = d;
        field_9387_k = velocityY = d1;
        field_9386_l = velocityZ = d2;
    }

    public double getSpeed()
    {
        return Math.sqrt(velocityX * velocityX + velocityZ * velocityZ);
    }

    public double getPrevSpeed()
    {
        return Math.sqrt(prevMotionX * prevMotionX + prevMotionZ * prevMotionZ);
    }

    public void pressKey(int i)
    {
        double d = propellerSpeed - (double)plane.takeOffSpeed;
        if(d < 0.0D)
        {
            d = 0.0D;
        }
        if(planeDamage < plane.planeHealth)
        {
            if(world.isRemote)
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
                        if(planeFuel > 0 || world.isRemote)
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
                        if(planeFuel > 0 || world.isRemote)
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
        if(SdkTools.minecraft.currentScreen == null && passenger != null && (passenger instanceof PlayerEntity)) //ModLoader.isGUIOpen(null)
        {
            if(mod_Planes.useMouseControl && !world.isRemote)
            {
//                ModLoader.OpenGUI((EntityPlayer)passenger, new GuiPlaneController(this));
            } else
            {
                if(Keyboard.isKeyDown(SdkTools.minecraft.options.jumpKey.code))
                {
                    pressKey(0);
                }
                if(Keyboard.isKeyDown(SdkTools.minecraft.options.leftKey.code))
                {
                    pressKey(1);
                }
                if(Keyboard.isKeyDown(SdkTools.minecraft.options.sneakKey.code))
                {
                    pressKey(2);
                }
                if(Keyboard.isKeyDown(SdkTools.minecraft.options.rightKey.code))
                {
                    pressKey(3);
                }
                if(Keyboard.isKeyDown(SdkTools.minecraft.options.forwardKey.code))
                {
                    pressKey(4);
                }
                if(Keyboard.isKeyDown(SdkTools.minecraft.options.backKey.code))
                {
                    pressKey(5);
                }
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
            world.playSound(this, plane.startSound, 0.5F, 1.0F); //oryg 1.0F
            soundPosition = plane.startSoundLength;
        }
        if(propellerSpeed > 1.0D && soundPosition == 0 && planeFuel > 0)
        {
            world.playSound(this, plane.propSound, 0.5F, 1.0F); //oryg 1.0F
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
            double ad = (x + random.nextDouble() * 1.5D) - 0.75D;
            double ad1 = ((y + random.nextDouble() - 0.5D)) + 0.25D;
            double ad2 = (z + random.nextDouble() - 0.5D);
            if(planeDamage > (4 * plane.planeHealth) / 5)
            {
                world.addParticle("largesmoke", x + d7, y + d8, z + d9, velocityX, velocityY, velocityZ); //dodac ognia
            } else
            {
                world.addParticle("smoke", x + d7, y + d8, z + d9, velocityX, velocityY, velocityZ);
            }
            if(planeDamage > (4.5 * plane.planeHealth) / 5)
            {
                if(Math.random() < 0.2D) {
                    world.addParticle("flame", ad, ad1, ad2, velocityX, velocityY, velocityZ);
                }
            }
        }

        if(world.isRemote)
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
        if(planeFuel <= 0 && passenger != null && !world.isRemote)
        {
            if(cargoItems[0] != null && cargoItems[0].itemId == mod_Planes.planeFuel.id)  //PALIWO
            {
                planeFuel = plane.planeFuelAdd;
                removeStack(0, 1);
            } else
            {
                propellerSpeed -= 0.01D * plane.decceleration;
            }
        }
        if(planeFuel > 0 && passenger != null)
        {
            planeFuel--;
        }
        if(planeDamage > (4.5 * plane.planeHealth) / 5 && random.nextInt(30) == 0) //samoniszczenie
        {
            damage(this, 1);
        }
        if(passenger != null && (passenger instanceof LivingEntity) && !(passenger instanceof PlayerEntity))
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
        if(propellerSpeed >= (double)(plane.maxPropSpeed + 4F) && passenger != null && (passenger instanceof PlayerEntity))
        {
            ((PlayerEntity)passenger).increaseStat(mod_Planes.maxSpeed, 1);
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
            pitch *= 0.80000000000000004D;
            propellerSpeed *= 0.80000000000000004D;
        }
        if(onGround)
        {
            motionG = 0.0D;
            rotationRoll *= 0.80000000000000004D;
        }
        if((onGround || hasCollided) && Math.sqrt(velocityX * velocityX + velocityY * velocityY + velocityZ * velocityZ) > EXPLOSION_MIN && (pitch > 30F || rotationRoll > 30F || rotationRoll < -30F || horizontalCollision))
        {
            damage(null, plane.planeHealth);
        }
        if(!world.isRemote)
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
        List list = world.getEntities(this, boundingBox.expand(0.20000000298023224D, 0.0D, 0.20000000298023224D));
        if(list != null && list.size() > 0)
        {
            for(int j1 = 0; j1 < list.size(); j1++)
            {
                Entity entity = (Entity)list.get(j1);
                boolean flag = true;
                for(int l1 = 0; l1 < plane.numPassengers; l1++)
                {
                    if(entity == passengerSeats[l1] || passengerSeats[l1].passenger != null && entity == passengerSeats[l1].passenger)
                    {
                        flag = false;
                    }
                }

                if(flag && entity != passenger && entity.isPushable() && (entity instanceof EntityPlane))
                {
                    entity.onCollision(this);
                }
                if(entity != passenger && entity.isPushable())
                {
                    handleCollision(entity);
                }
            }

        }
        if(passenger != null && getPrevSpeed() - getSpeed() > COLLISION_MIN)
        {
            if(lastCollidedEntity != null && !(lastCollidedEntity instanceof ItemEntity))
            {
                lastCollidedEntity.addVelocity(prevMotionX, prevMotionY + 1.0D, prevMotionZ);
                lastCollidedEntity.damage(this, 50); //zderzenie z samolotem
            }
            damage(lastCollidedEntity, 50);
        }
        lastCollidedEntity = null;
        if(passenger != null && passenger.dead)
        {
            passenger = null;
        }
        prevMotionX = velocityX;
        prevMotionY = velocityY;
        prevMotionZ = velocityZ;
    }

    public void handleCollision(Entity entity)
    {
        if(entity.passenger != this && entity.vehicle != this)
        {
            lastCollidedEntity = entity;
        }
    }

    public void onCollision(Entity entity)
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

        super.onCollision(entity);
    }

    public void updatePassengerPosition()
    {
        if(passenger == null)
        {
            return;
        }
        if(passenger == SdkTools.minecraft.player || (passenger instanceof WolfEntity))
        {
            double d = 0.0D;
            double d1 = (getPassengerRidingHeight() + passenger.getStandingEyeHeight()) * Math.cos((rotationRoll * 3.141593F) / 180F);
            double d2 = -(getPassengerRidingHeight() + passenger.getStandingEyeHeight()) * Math.sin((rotationRoll * 3.141593F) / 180F);
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
            if(mod_Planes.useMouseControl && !world.isRemote)
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

    protected void writeNbt(NbtCompound nbttagcompound)
    {
        NbtList nbttaglist = new NbtList();
        for(int i = 0; i < cargoItems.length; i++)
        {
            if(cargoItems[i] != null)
            {
                NbtCompound nbttagcompound1 = new NbtCompound();
                nbttagcompound1.putByte("Slot", (byte)i);
                cargoItems[i].writeNbt(nbttagcompound1);
                nbttaglist.add(nbttagcompound1);
            }
        }

        nbttagcompound.putFloat("RotationYaw", yaw);
        nbttagcompound.putInt("EngineType", engineType);
        nbttagcompound.put("Items", nbttaglist);
        nbttagcompound.putString("Type", plane.shortName);
        nbttagcompound.putInt("PlaneDmg", planeDamage);
    }

    protected void readNbt(NbtCompound nbttagcompound)
    {
        plane = mod_Planes.getPlaneType(nbttagcompound.getString("Type"));
        inventorySize = plane.numCargoSlots + plane.numBulletSlots + plane.numBombSlots + plane.numRocketSlots + 1;
        NbtList nbttaglist = nbttagcompound.getList("Items");
        cargoItems = new ItemStack[size()];
        for(int i = 0; i < nbttaglist.size(); i++)
        {
            NbtCompound nbttagcompound1 = (NbtCompound)nbttaglist.get(i);
            int k = nbttagcompound1.getByte("Slot") & 0xff;
            if(k >= 0 && k < cargoItems.length)
            {
                cargoItems[k] = new ItemStack(nbttagcompound1);
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
            passengerSeats[j] = new EntityPassengerSeat(world, plane.seatsX[j], plane.seatsY[j], plane.seatsZ[j], this);
            world.spawnEntity(passengerSeats[j]);
        }

    }

    public float getShadowRadius()
    {
        return 0.0F;
    }

    public int size()
    {
        return inventorySize;
    }

    public ItemStack getStack(int i)
    {
        return cargoItems[i];
    }

    public ItemStack removeStack(int i, int j)
    {
        if(cargoItems[i] != null)
        {
            if(cargoItems[i].count <= j)
            {
                ItemStack itemstack = cargoItems[i];
                cargoItems[i] = null;
                return itemstack;
            }
            ItemStack itemstack1 = cargoItems[i].split(j);
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

    public String getName()
    {
        return plane.name;
    }

    public int getMaxCountPerStack()
    {
        return 64;
    }

    public void markDirty()
    {
    }

    public void setStack(int i, ItemStack itemstack)
    {
        cargoItems[i] = itemstack;
        if(itemstack != null && itemstack.count > getMaxCountPerStack())
        {
            itemstack.count = getMaxCountPerStack();
        }
        if(itemstack != null && itemstack.itemId == 263 && i == 0 && passenger != null && (passenger instanceof PlayerEntity))
        {
            ((PlayerEntity)passenger).increaseStat(mod_Planes.startPlane, 1);
        }
    }

    public boolean interact(PlayerEntity entityplayer)
    {
        if(entityplayer.getHand() != null && entityplayer.getHand().itemId == ItemCasingListener.itemWrenchGold.id)
        {
            System.out.println("MAX: " + plane.planeHealth);
            System.out.println("DMG: " + planeDamage);
            System.out.println("TYPE: " + plane.shortName);
            entityplayer.swingHand();
            damage(this, 1000); ///DEBUG
            return true;
        }
        if(entityplayer.getHand() != null && entityplayer.getHand().itemId == mod_Planes.planeBlowTorch.id)
        {
            if(planeDamage < plane.planeHealth && planeDamage > 0)
            {
                world.playSound(this, "planes:blowtorch", 1.0F, (random.nextFloat() - random.nextFloat()) * 0.2F + 1.0F);
                planeDamage = Math.max(planeDamage - 12, 0);
                entityplayer.swingHand();
                entityplayer.getHand().damage(1, entityplayer);
                if(entityplayer.getHand().getDamage() <= 0)
                {
                    entityplayer.inventory.main[entityplayer.inventory.selectedSlot] = null;
                }
            }
            return true;
        }
        if(passenger != null && (passenger instanceof PlayerEntity) && passenger != entityplayer)
        {
            return true;
        }
        if(!world.isRemote && passenger != entityplayer)
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
                        entityplayer.setVehicle(passengerSeats[i]);
                        if(mod_Planes.useMouseControl && !world.isRemote)
                        {
//                            ModLoader.OpenGUI((EntityPlayer)passenger, new GuiPlaneController(this));
                        }
                        List list1 = world.collectEntitiesByClass(WolfEntity.class, Box.createCached(x, y, z, x + 1.0D, y + 1.0D, z + 1.0D).expand(16D, 4D, 16D));
                        Iterator iterator1 = list1.iterator();
                        do
                        {
                            if(!iterator1.hasNext())
                            {
                                break;
                            }
                            Entity entity1 = (Entity)iterator1.next();
                            WolfEntity entitywolf1 = (WolfEntity)entity1;
                            if(entitywolf1.isTamed() && entityplayer.name.equals(entitywolf1.getOwnerName()))
                            {
                                int k = 0;
                                while(k < plane.numPassengers)
                                {
                                    if(passengerSeats[k].passenger == null)
                                    {
                                        entitywolf1.setVehicle(passengerSeats[k]);
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
                entityplayer.setVehicle(this);
                if(mod_Planes.useMouseControl && !world.isRemote)
                {
//                    ModLoader.OpenGUI((EntityPlayer)passenger, new GuiPlaneController(this));
                }
                List list = world.collectEntitiesByClass(WolfEntity.class, Box.createCached(x, y, z, x + 1.0D, y + 1.0D, z + 1.0D).expand(16D, 4D, 16D));
                Iterator iterator = list.iterator();
                do
                {
                    if(!iterator.hasNext())
                    {
                        break;
                    }
                    Entity entity = (Entity)iterator.next();
                    WolfEntity entitywolf = (WolfEntity)entity;
                    if(entitywolf.isTamed() && entityplayer.name.equals(entitywolf.getOwnerName()))
                    {
                        int j = 0;
                        while(j < plane.numPassengers)
                        {
                            if(passengerSeats[j].passenger == null)
                            {
                                entitywolf.setVehicle(passengerSeats[j]);
                            }
                            j++;
                        }
                    }
                } while(true);
            }
        }
        return true;
    }

    public boolean canPlayerUse(PlayerEntity entityplayer)
    {
        if(dead)
        {
            return false;
        } else
        {
            return entityplayer.getSquaredDistance(this) <= 64D;
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
    private double EXPLOSION_MIN;
    private double COLLISION_MIN;
    public float angle;
    public ItemStack cargoItems[];
    public ItemStack gunAircraft;
    public ItemStack gunRocketAircraft;
    public ItemStack gunRocketAircraftPanzer;
    public int inventorySize;
    public EntityPassengerSeat passengerSeats[];
    public Entity lastCollidedEntity;
    private double motionG;
    public float velocityYaw;
    public float velocityPitch;
    public float velocityRoll;
    public PlaneType plane;
    public double prevMotionX;
    public double prevMotionY;
    public double prevMotionZ;

    @Override
    public void fireKey(PlayerEntity entityplayer) {
        if(!world.isRemote && shootDelay <= 0 && plane.hasGuns && mod_Planes.bulletsEnabled)
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
                double d21 = (d1 * d11 - d3 * d13) * d7 + d5 * d9 + random.nextGaussian() / 100D;
                double d22 = d1 * d13 + d3 * d11 + random.nextGaussian() / 100D;
                double d23 = (d3 * d13 - d1 * d11) * d9 + d5 * d7 + random.nextGaussian() / 100D;

                ((SdkItemGun)gunAircraft.getItem()).onItemRightClickEntity(gunAircraft, world, this, plane.barrelX / 16F, (float)d17, plane.barrelZ / 16F, 90F, 0.0F);

                shootDelay = plane.planeShootDelay;
                plane.barrelZ = -plane.barrelZ;
                removeStack(j, 1);
            }
        }
    }

    @Override
    public void bombKey(PlayerEntity entityplayer) {
        if(world.isRemote || bombDelay > 0 || !plane.hasBombs || !mod_Planes.bombsEnabled)
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
        if(byte0 == 2 && (passenger instanceof PlayerEntity))
        {
            ((PlayerEntity)passenger).increaseStat(mod_Planes.dropNapalm, 1);
        }
        world.spawnEntity(new EntityBomb(world, x + d16, y + d18, z + d20, velocityX, velocityY, velocityZ, byte0)); //bomba
        world.playSound(this, plane.bombSound, 1.0F, 1.0F);
        removeStack(k, 1);
        bombDelay = plane.planeBombDelay;
    }

    @Override
    public void inventoryKey(Minecraft minecraft, PlayerEntity entityplayer) {
        if(!world.isRemote) {
            if (SdkTools.minecraft.currentScreen instanceof GuiPlane) {
                SdkTools.minecraft.setScreen(null);
            } else if (passenger.vehicle instanceof EntityPlane) {
                SdkTools.minecraft.setScreen(new GuiPlane(((PlayerEntity)passenger).inventory, (EntityPlane)passenger.vehicle));
            }
        }
    }

    @Override
    public void exitKey(PlayerEntity entityplayer) {
        for(int l = 0; l < plane.numPassengers; l++)
        {
            if(!(passengerSeats[l].passenger instanceof WolfEntity))
            {
                continue;
            }
            WolfEntity entitywolf = (WolfEntity)passengerSeats[l].passenger;
            if(entitywolf.isTamed() && ((PlayerEntity)passenger).name != null && entitywolf.getOwnerName() != null && ((PlayerEntity)passenger).name == entitywolf.getOwnerName())
            {
                entitywolf.setVehicle(passengerSeats[l]);
            }
        }

        passenger.setVehicle(this);
//        passenger.startRiding(null);
    }

    @Override
    public void rocketKey(PlayerEntity entityplayer) {
        if(!world.isRemote && shootDelay <= 0 && plane.hasGuns && mod_Planes.bulletsEnabled)
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
                    ((SdkItemGun)gunRocketAircraft.getItem()).onItemRightClickEntity(gunRocketAircraft, world, this, plane.barrelX / 16F, (float)e17, plane.barrelZ / 16F, 90F, 0.0F);
                }
                if(byte1 == 1)
                {
                    ((SdkItemGun)gunRocketAircraftPanzer.getItem()).onItemRightClickEntity(gunRocketAircraft, world, this, plane.barrelX / 16F, (float)e17, plane.barrelZ / 16F, 90F, 0.0F);
                }
                shootDelay = 10; //itemek ma za duzy
                plane.barrelZ = -plane.barrelZ;
                removeStack(c, 1);
            }
        }
    }

    @Override
    public void reloadKey(PlayerEntity entityplayer) {

    }

    @Override
    public int getPercentHealth() {
        return 0;
    }
}

