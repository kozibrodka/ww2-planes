package net.kozibrodka.planes.entity;


import net.kozibrodka.planes.events.mod_Planes;
import net.kozibrodka.planes.properties.AAGunType;
import net.minecraft.entity.EntityBase;
import net.minecraft.entity.player.PlayerBase;
import net.minecraft.item.ItemInstance;
import net.minecraft.level.Level;
import net.minecraft.util.io.CompoundTag;
import net.minecraft.util.io.ListTag;
import net.minecraft.util.maths.Box;
import net.minecraft.util.maths.Vec3f;

public class EntityAAGun extends EntityBase {
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
    public ItemInstance[] ammo;
    public int reloadTimer;
    public int shootTime;
    public int currentBarrel;

    public EntityAAGun(Level world) {
        super(world);
        this.field_1593 = true;
        this.setSize(2.0F, 2.0F);
        this.standingEyeHeight = 0.0F;
        this.gunYaw = 0.0F;
        this.gunPitch = 0.0F;
        this.shootDelay = 0;
    }

    public EntityAAGun(Level world, AAGunType type1, double d, double d1, double d2) {
        this(world);
        this.type = type1;
        this.initType();
        this.setPosition(d, d1, d2);
    }

    public EntityAAGun(Level world, double d, double d1, double d2) {
        this(world);
        this.setPosition(d, d1, d2);
    }

    public void setPosition(double d, double d1, double d2) {
        this.x = d;
        this.y = d1;
        this.z = d2;
        float f = this.width / 2.0F;
        float f1 = this.height;
        this.boundingBox.method_99(d - (double)f, d1 - (double)this.standingEyeHeight + (double)this.field_1640, d2 - (double)f, d + (double)f, d1 - (double)this.standingEyeHeight + (double)this.field_1640 + (double)f1, d2 + (double)f);
    }

    public void initType() {
        this.health = this.type.health;
        this.barrelRecoil = new float[this.type.numBarrels];
        this.ammo = new ItemInstance[this.type.numBarrels];
    }

    protected void initDataTracker() {
    }

    public Box getBoundingBox(EntityBase entity) {
        return entity.boundingBox;
    }

    public Box method_1381() {
        return this.boundingBox;
    }

    public boolean method_1380() {
        return false;
    }

    public double getMountedHeightOffset() {
        return 0.0D;
    }

    public boolean damage(EntityBase entity, int i) {

        if(removed)
        {
            return true;
        }
        if(entity == passenger && (entity instanceof PlayerBase)){

                if(this.reloadTimer > 0 ||shootTime > 0) {
                    return true;
                }

                for(int j = 0; j < this.type.numBarrels; ++j) {
                    if(shootTime <= 0 && this.ammo[j] != null && this.currentBarrel == j) {

//                        System.out.println("BEFORE" + j + "  " + this.ammo[j] + "  " + this.ammo[j].getDamage() +  "  " + this.ammo[j].getDurability());

//                        this.ammo[j].setDamage(0);
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

                        level.playSound(x, y, z, type.shootSound, 4F, (1.0F + (level.rand.nextFloat() - level.rand.nextFloat()) * 0.2F) * 0.7F);
                        if(!this.level.isServerSide) {
//                            this.level.spawnEntityInWorld(new EntityBullet(this.level, this.rotate((double)this.type.model.barrelX / 16.0D + 3.0D, (double)this.type.model.barrelY / 16.0D, (double)this.type.model.barrelZ / 16.0D + 3.0D).addVector(this.posX, this.posY, this.posZ), this.gunYaw + 90.0F, this.gunPitch, (EntityLiving)player, (float)this.type.accuracy, this.type.damage, bullet));
//                            this.level.playSoundAtEntity(this, this.type.shootSound, 1.0F, 1.0F / (this.rand.nextFloat() * 0.4F + 0.8F));

//                            System.out.println( j + "  " + this.ammo[j] + "  " + this.ammo[j].getDamage() +  "  " + this.ammo[j].getDurability());
                            level.spawnEntity(new EntityAAShell(level, d7 + x, d8 + y, d9 + z, d10 - d7, d11 - d8, d12 - d9, type.damage, type.velocity, type.accuracy, type.range));
//                            level.addParticle("smoke", x + d7, y + d8, z + d9, d10 - d7, d11 - d8, d12 - d9);
                        }
//                        if(j == type.numBarrels-1)
//                        {
//                            doReload();
//                        }
                    }
                    if(j == type.numBarrels-1) //poprzednie było poewne ^^
                    {
                        doReload();
                    }
                }

                this.currentBarrel = (this.currentBarrel + 1) % this.type.numBarrels;

        } else {
            this.method_1336();
            this.health -= i;
            if(!this.level.isServerSide && this.health <= 0) {
                this.remove();
            }
        }

        return true;
    }

    public Vec3f rotate(double x, double y, double z) {
        double cosYaw = Math.cos((double)(180.0F - this.gunYaw * (float)Math.PI / 180.0F));
        double sinYaw = Math.sin((double)(180.0F - this.gunYaw * (float)Math.PI / 180.0F));
        double cosPitch = Math.cos((double)(this.gunPitch * (float)Math.PI / 180.0F));
        double sinPitch = Math.sin((double)(this.gunPitch * (float)Math.PI / 180.0F));
        double newX = x * cosYaw + (y * sinPitch + z * cosPitch) * sinYaw;
        double newY = y * cosPitch - z * sinPitch;
        double newZ = -x * sinYaw + (y * sinPitch + z * cosPitch) * cosYaw;
        return Vec3f.method_1293(newX, newY, newZ);
    }

    public boolean method_1356() {
        return !this.removed;
    }

    public void doReload()
    {
        int i;
        for(i = 0; i < this.type.numBarrels; ++i) {
//            if(this.ammo[i] != null && this.ammo[i].getDamage() == 0) {
//                this.ammo[i] = null;
//            }

            if(this.ammo[i] == null && this.passenger != null && this.passenger instanceof PlayerBase) {
                int slot = this.findAmmo((PlayerBase)this.passenger);
                if(slot >= 0) {
                    this.ammo[i] = ((PlayerBase)this.passenger).inventory.getInventoryItem(slot);
//                    this.ammo[i].setDamage(1);
                    ((PlayerBase)this.passenger).inventory.takeInventoryItem(slot, 1);
                    if(i == 0){
                        this.reloadTimer = this.type.reloadTime;
                        this.level.playSound(this, this.type.reloadSound, 1.0F, 1.0F / (this.rand.nextFloat() * 0.4F + 0.8F));
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
        if(!this.level.isServerSide) {
            if(this.passenger != null && this.passenger.removed) {
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

    public void remove() {
        super.remove();
        this.dropItem(this.type.przedmiot.id, 1);
        ItemInstance[] arr$ = this.ammo;
        int len$ = arr$.length;

        for(int i$ = 0; i$ < len$; ++i$) {
            ItemInstance stack = arr$[i$];
            if(stack != null) {
//                stack.setDamage(0);
                this.dropItem(new ItemInstance(mod_Planes.aaShell.id,1,1), 0.5F);
            }
        }

    }

    public void method_1382() {
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

    protected void writeCustomDataToTag(CompoundTag nbttagcompound) {
        nbttagcompound.put("Type", this.type.shortName);
        nbttagcompound.put("Health", this.health);
        nbttagcompound.put("RotationYaw", this.yaw);
        nbttagcompound.put("RotationPitch", this.yaw);

//        for(int i = 0; i < this.type.numBarrels; ++i) {
//            if(this.ammo[i] != null) {
//                nbttagcompound.put("Ammo " + i, this.ammo[i].toTag(new CompoundTag()));
//            }
//        }

        ListTag nbttaglist = new ListTag();
        for(int i = 0; i < type.numBarrels; i++)
        {
            if(ammo[i] != null)
            {
                CompoundTag nbttagcompound1 = new CompoundTag();
                nbttagcompound1.put("Slot", (byte)i);
                ammo[i].toTag(nbttagcompound1);
                nbttaglist.add(nbttagcompound1);
            }
        }
        nbttagcompound.put("Items", nbttaglist);

    }

    protected void readCustomDataFromTag(CompoundTag nbttagcompound) {
        this.type = mod_Planes.getAAGunType(nbttagcompound.getString("Type"));
        this.initType();

        this.health = nbttagcompound.getInt("Health");
        this.yaw = nbttagcompound.getFloat("RotationYaw");
        this.pitch = nbttagcompound.getFloat("RotationPitch");

//        for(int i = 0; i < this.type.numBarrels; ++i) {
//            this.ammo[i] = ItemInstance.fromTag(nbttagcompound.getCompoundTag("Ammo " + i));
//        }

        ListTag nbttaglist = nbttagcompound.getListTag("Items");
        ammo = new ItemInstance[type.numBarrels];
        for(int i = 0; i < nbttaglist.size(); i++)
        {
            CompoundTag nbttagcompound1 = (CompoundTag)nbttaglist.get(i);
            int k = nbttagcompound1.getByte("Slot") & 0xff;
            if(k >= 0 && k < type.numBarrels)
            {
                ammo[k] = new ItemInstance(nbttagcompound1);
            }
        }

    }

    public float getEyeHeight() {
        return 0.0F;
    }

    public boolean interact(PlayerBase entityplayer) {
        if(this.passenger != null && this.passenger instanceof PlayerBase && this.passenger != entityplayer) {
            return true;
        } else {
            if(!this.level.isServerSide) {
                if(this.passenger == entityplayer) {
                    entityplayer.startRiding(this);
                    return true;
                }

                entityplayer.startRiding(this);
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

    public int findAmmo(PlayerBase player) {
        for(int i = 0; i < player.inventory.getInventorySize(); ++i) {
            ItemInstance stack = player.inventory.getInventoryItem(i);
            if(stack != null && stack.itemId == mod_Planes.aaShell.id) {
                return i;
            }
        }

        return -1;
    }
}
