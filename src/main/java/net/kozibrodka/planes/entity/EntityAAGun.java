package net.kozibrodka.planes.entity;


import net.kozibrodka.planes.events.mod_Planes;
import net.kozibrodka.planes.properties.AAGunType;
import net.kozibrodka.sdk_api.events.utils.WW2Cannon;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Monster;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.nbt.NbtList;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class EntityAAGun extends Entity implements WW2Cannon {
    private int field_9394_d;
    private double field_9393_e;
    private double field_9392_f;
    private double field_9391_g;
    private double field_9390_h;
    private double field_9389_i;
    private double field_9388_j;
    private double field_9387_k;
    private double field_9386_l;
    private int health;
    private int shootDelay;
    public float gunYaw;
    public float gunPitch;
    public float[] barrelRecoil;
    public AAGunType type;
//    public Entity towedByEntity;
    public ItemStack[] ammo;
    public int reloadTimer;
    public int shootTime;
    public int currentBarrel;

    public EntityAAGun(World world) {
        super(world);
        this.blocksSameBlockSpawning = true;
        this.setBoundingBoxSpacing(2.0F, 2.0F);
        this.standingEyeHeight = 0.0F;
        this.gunYaw = 0.0F;
        this.gunPitch = 0.0F;
        this.shootDelay = 0;
        currentBarrel = 0;
        reloadTimer = 0;
    }

    public EntityAAGun(World world, AAGunType type1, double d, double d1, double d2) {
        this(world);
        this.type = type1;
        this.initType();
        this.setPosition(d, d1, d2);
    }

    public EntityAAGun(World world, double d, double d1, double d2) {
        this(world);
        this.setPosition(d, d1, d2);
    }

    public void setPosition(double d, double d1, double d2) {
        this.x = d;
        this.y = d1;
        this.z = d2;
        float f = this.width / 2.0F;
        float f1 = this.height;
        this.boundingBox.set(d - (double)f, d1 - (double)this.standingEyeHeight + (double)this.cameraOffset, d2 - (double)f, d + (double)f, d1 - (double)this.standingEyeHeight + (double)this.cameraOffset + (double)f1, d2 + (double)f);
    }

    public void initType() {
        this.health = this.type.health;
        this.barrelRecoil = new float[this.type.numBarrels];
        this.ammo = new ItemStack[this.type.numBarrels];
    }

    protected void initDataTracker() {
    }

    public Box getCollisionAgainstShape(Entity entity) {
        return entity.boundingBox;
    }

    public Box getBoundingBox() {
        return this.boundingBox;
    }

    public boolean isPushable() {
        return false;
    }

    public double getPassengerRidingHeight() {
        return 0.0D;
    }

    public boolean damage(Entity entity, int i) {

        if(dead)
        {
            return true;
        }
        if(entity == passenger && (entity instanceof PlayerEntity)){

                if(this.reloadTimer > 0 ||shootTime > 0) {
                    return true;
                }

                for(int j = 0; j < this.type.numBarrels; ++j) {
                    if(shootTime <= 0 && this.ammo[j] != null && this.currentBarrel == j) {
                        this.ammo[j] = null;
                        double d = 2.75D;
                        double d1 = 0.625D;
                        double d2 = 0.25D;
                        double d3 = Math.cos(((180D - (double)gunYaw) / 180D) * 3.1415926535897931D);
                        double d4 = Math.sin(((180D - (double)gunYaw) / 180D) * 3.1415926535897931D);
                        double d5 = Math.cos(((double)(-gunPitch) / 180D) * 3.1415926535897931D);
                        double d6 = Math.sin(((double)(-gunPitch) / 180D) * 3.1415926535897931D);
                        double d7 = (d * d5 - d1 * d6) * d3 + d2 * d4;
                        double d8 = d * d6 + d1 * d5;
                        double d9 = (d1 * d6 - d * d5) * d4 + d2 * d3;
                        d = 6.25D;
                        double d10 = (d * d5 - d1 * d6) * d3 + d2 * d4;
                        double d11 = d * d6 + d1 * d5;
                        double d12 = (d1 * d6 - d * d5) * d4 + d2 * d3;

                        shootTime = this.type.shootDelay;
                        this.barrelRecoil[j] = (float)this.type.recoil;

                        world.playSound(x, y, z, type.shootSound, 4F, (1.0F + (world.random.nextFloat() - world.random.nextFloat()) * 0.2F) * 0.7F);
                        if(!this.world.isRemote) {
//                            System.out.println( j + "  " + this.ammo[j] + "  " + this.ammo[j].getDamage() +  "  " + this.ammo[j].getDurability());
                            world.spawnEntity(new EntityAAShell(world, d7 + x, d8 + y, d9 + z, d10 - d7, d11 - d8, d12 - d9, type.damage, type.velocity, type.accuracy, type.range));
//                            level.addParticle("smoke", x + d7, y + d8, z + d9, d10 - d7, d11 - d8, d12 - d9);
                        }
                    }
                    if(j == type.numBarrels-1) //poprzednie było poewne ^^
                    {
                        doReload();
                    }
                }

                this.currentBarrel = (this.currentBarrel + 1) % this.type.numBarrels;

        } else {
            if(entity instanceof LivingEntity){
                if(entity instanceof Monster){
                    scheduleVelocityUpdate(); //setBeenAttacked
                    this.health -= (int)i/5;
                    world.playSound(this, "planes:mechhurt", 1.0F, (random.nextFloat() - random.nextFloat()) * 0.2F + 1.0F);
                    System.out.println("AA DAMAGED from: " + entity + " DMG: " + (int)i/5);
                }
            }else{
                scheduleVelocityUpdate(); //setBeenAttacked
                this.health -= i;
                world.playSound(this, "planes:mechhurt", 1.0F, (random.nextFloat() - random.nextFloat()) * 0.2F + 1.0F);
                System.out.println("AA DAMAGED from: " + entity + " DMG: " + i);
            }

            if(!this.world.isRemote && this.health <= 0) {
                this.markDead();
            }
        }

        return true;
    }

    public Vec3d rotate(double x, double y, double z) {
        double cosYaw = Math.cos((double)(180.0F - this.gunYaw * (float)Math.PI / 180.0F));
        double sinYaw = Math.sin((double)(180.0F - this.gunYaw * (float)Math.PI / 180.0F));
        double cosPitch = Math.cos((double)(this.gunPitch * (float)Math.PI / 180.0F));
        double sinPitch = Math.sin((double)(this.gunPitch * (float)Math.PI / 180.0F));
        double newX = x * cosYaw + (y * sinPitch + z * cosPitch) * sinYaw;
        double newY = y * cosPitch - z * sinPitch;
        double newZ = -x * sinYaw + (y * sinPitch + z * cosPitch) * cosYaw;
        return Vec3d.create(newX, newY, newZ);
    }

    public boolean isCollidable() {
        return !this.dead;
    }

    public void doReload()
    {
        int i;
        for(i = 0; i < this.type.numBarrels; ++i) {
//            if(this.ammo[i] != null && this.ammo[i].getDamage() == 0) {
//                this.ammo[i] = null;
//            }

            if(this.ammo[i] == null && this.passenger != null && this.passenger instanceof PlayerEntity) {
                int slot = this.findAmmo((PlayerEntity)this.passenger);
                if(slot >= 0) {
                    this.ammo[i] = ((PlayerEntity)this.passenger).inventory.getStack(slot);
//                    this.ammo[i].setDamage(1);
                    ((PlayerEntity)this.passenger).inventory.removeStack(slot, 1);
                    if(i == 0){
                        this.reloadTimer = this.type.reloadTime;
                        this.world.playSound(this, this.type.reloadSound, 1.0F, 1.0F / (this.random.nextFloat() * 0.4F + 0.8F));
                    }
                }
            }
        }
    }

    public void tick() {
        super.tick();
        if(this.passenger != null) {
            this.gunYaw = this.passenger.yaw - 90.0F;
            this.gunPitch = this.passenger.pitch;
        }

        if(this.gunPitch > this.type.bottomViewLimit) {
            this.gunPitch = this.type.bottomViewLimit;
        }

        if(this.gunPitch < -this.type.topViewLimit) {
            this.gunPitch = -this.type.topViewLimit;
        }

        int i;
        for(i = 0; i < this.type.numBarrels; ++i) {
            this.barrelRecoil[i] *= 0.9F;
        }

        if(this.shootDelay > 0) {
            --this.shootDelay;
        }

        if(!this.onGround) {
            this.velocityY -= 0.0245D;
        }

        this.velocityX *= 0.5D;
        this.velocityZ *= 0.5D;
        this.move(this.velocityX, this.velocityY, this.velocityZ);
        if(!this.world.isRemote) {
            if(this.passenger != null && this.passenger.dead) {
                this.passenger = null;
            }
            if(shootTime > 0) {
                --shootTime;
            }
            if(this.reloadTimer > 0) {
                --this.reloadTimer;
            }


//            for(i = 0; i < this.type.numBarrels; ++i) {
//                if(this.ammo[i] != null && this.ammo[i].getDamage() == 0) {
//                    this.ammo[i] = null;
//                }
//
//                if(this.ammo[i] == null && this.passenger != null && this.passenger instanceof PlayerBase) {
//                    int slot = this.findAmmo((PlayerBase)this.passenger);
//                    if(slot >= 0) {
//                        this.ammo[i] = ((PlayerBase)this.passenger).inventory.getInventoryItem(slot);
//                        this.ammo[i].setDamage(1);
//                        ((PlayerBase)this.passenger).inventory.takeInventoryItem(slot, 1);
//                        if(i == 0){
//                            this.reloadTimer = this.type.reloadTime;
//                            this.level.playSound(this, this.type.reloadSound, 1.0F, 1.0F / (this.rand.nextFloat() * 0.4F + 0.8F));
//                        }
//                    }
//                }
//            }


        } else {
            if(this.field_9394_d > 0) {
                double var9 = this.x + (this.field_9393_e - this.x) / (double)this.field_9394_d;
                double d5 = this.y + (this.field_9392_f - this.y) / (double)this.field_9394_d;
                double d9 = this.z + (this.field_9391_g - this.z) / (double)this.field_9394_d;

                double d12;
                for(d12 = this.field_9390_h - (double)this.yaw; d12 < -180.0D; d12 += 360.0D) {
                }

                while(d12 >= 180.0D) {
                    d12 -= 360.0D;
                }

                this.yaw = (float)((double)this.yaw + d12 / (double)this.field_9394_d);
                this.pitch = (float)((double)this.pitch + (this.field_9389_i - (double)this.pitch) / (double)this.field_9394_d);
                --this.field_9394_d;
                this.setPosition(var9, d5, d9);
                this.setRotation(this.yaw, this.pitch);
            }

        }
    }

    public void markDead() {
        super.markDead();
        this.dropItem(this.type.przedmiot.id, 1);
        ItemStack[] arr$ = this.ammo;
        int len$ = arr$.length;

        for(int i$ = 0; i$ < len$; ++i$) {
            ItemStack stack = arr$[i$];
            if(stack != null) {
//                stack.setDamage(0);
                this.dropItem(new ItemStack(mod_Planes.aaShell.id,1,1), 0.5F);
            }
        }

    }

    public void updatePassengerPosition() {
        if(this.passenger != null) {
            double x = (double)this.type.gunnerX / 16.0D;
            double y = (double)this.type.gunnerY / 16.0D;
            double z = (double)this.type.gunnerZ / 16.0D;
            double cosYaw = Math.cos((double)(-this.gunYaw) / 180.0D * Math.PI);
            double sinYaw = Math.sin((double)(-this.gunYaw) / 180.0D * Math.PI);
            double cosPitch = Math.cos((double)this.gunPitch / 180.0D * Math.PI);
            double sinPitch = Math.sin((double)this.gunPitch / 180.0D * Math.PI);
            double x2 = x * cosYaw + z * sinYaw;
            double z2 = -x * sinYaw + z * cosYaw;
            this.passenger.setPosition(this.x + x2, this.y + y, this.z + z2);
        }
    }

    protected void writeNbt(NbtCompound nbttagcompound) {
        nbttagcompound.putString("Type", this.type.shortName);
        nbttagcompound.putInt("Health", this.health);
        nbttagcompound.putFloat("RotationYaw", this.yaw);
        nbttagcompound.putFloat("RotationPitch", this.yaw);

//        for(int i = 0; i < this.type.numBarrels; ++i) {
//            if(this.ammo[i] != null) {
//                nbttagcompound.put("Ammo " + i, this.ammo[i].toTag(new CompoundTag()));
//            }
//        }

        NbtList nbttaglist = new NbtList();
        for(int i = 0; i < type.numBarrels; i++)
        {
            if(ammo[i] != null)
            {
                NbtCompound nbttagcompound1 = new NbtCompound();
                nbttagcompound1.putByte("Slot", (byte)i);
                ammo[i].writeNbt(nbttagcompound1);
                nbttaglist.add(nbttagcompound1);
            }
        }
        nbttagcompound.put("Items", nbttaglist);

    }

    protected void readNbt(NbtCompound nbttagcompound) {
        this.type = mod_Planes.getAAGunType(nbttagcompound.getString("Type"));
        this.initType();

        this.health = nbttagcompound.getInt("Health");
        this.yaw = nbttagcompound.getFloat("RotationYaw");
        this.pitch = nbttagcompound.getFloat("RotationPitch");

//        for(int i = 0; i < this.type.numBarrels; ++i) {
//            this.ammo[i] = ItemInstance.fromTag(nbttagcompound.getCompoundTag("Ammo " + i));
//        }

        NbtList nbttaglist = nbttagcompound.getList("Items");
        ammo = new ItemStack[type.numBarrels];
        for(int i = 0; i < nbttaglist.size(); i++)
        {
            NbtCompound nbttagcompound1 = (NbtCompound)nbttaglist.get(i);
            int k = nbttagcompound1.getByte("Slot") & 0xff;
            if(k >= 0 && k < type.numBarrels)
            {
                ammo[k] = new ItemStack(nbttagcompound1);
            }
        }

    }

    public float getShadowRadius() {
        return 0.0F;
    }

    public boolean interact(PlayerEntity entityplayer) {
        if(this.passenger != null && this.passenger instanceof PlayerEntity && this.passenger != entityplayer) {
            return true;
        } else {
            if(!this.world.isRemote) {
                if(this.passenger == entityplayer) {
//                    entityplayer.startRiding(this);
                    return true;
                }

                entityplayer.setVehicle(this);
                doReload();

//                for(int i = 0; i < this.type.numBarrels; ++i) {
//                    if(this.ammo[i] == null) {
//                        int slot = this.findAmmo(entityplayer);
//                        if(slot >= 0) {
//                            this.ammo[i] = entityplayer.inventory.getInventoryItem(slot);
//                            this.ammo[i].setDamage(1);
//                            entityplayer.inventory.takeInventoryItem(slot, 1);
//                            this.reloadTimer = this.type.reloadTime;
//                            this.level.playSound(this, this.type.reloadSound, 1.0F, 1.0F / (this.rand.nextFloat() * 0.4F + 0.8F));
//                        }
//                    }
//                }
            }

            return true;
        }
    }

    public int findAmmo(PlayerEntity player) {
        for(int i = 0; i < player.inventory.size(); ++i) {
            ItemStack stack = player.inventory.getStack(i);
            if(stack != null && stack.itemId == mod_Planes.aaShell.id) {
                return i;
            }
        }

        return -1;
    }

    @Override
    public void exitKey(PlayerEntity entityplayer) {
        passenger.setVehicle(this);
    }
}
