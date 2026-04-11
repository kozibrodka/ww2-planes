package net.kozibrodka.planes.entity;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import net.minecraft.world.explosion.Explosion;

public class EntityBomb extends Entity
{

    public EntityBomb(World world)
    {
        super(world);
        fallTime = 0;
    }

    public EntityBomb(World world, double d, double d1, double d2,
                      int i)
    {
        super(world);
        fallTime = 0;
        bombType = i;
        blocksSameBlockSpawning = true;
        setBoundingBoxSpacing(0.98F, 0.98F);
        standingEyeHeight = height / 2.0F;
        setPosition(d, d1, d2);
        velocityX = 0.0D;
        velocityY = 0.0D;
        velocityZ = 0.0D;
        prevX = d;
        prevY = d1;
        prevZ = d2;
    }

    public EntityBomb(World world, double d, double d1, double d2)
    {
        super(world);
        fallTime = 0;
        blocksSameBlockSpawning = true;
        setBoundingBoxSpacing(0.98F, 0.98F);
        standingEyeHeight = height / 2.0F;
        setPosition(d, d1, d2);
        velocityX = 0.0D;
        velocityY = 0.0D;
        velocityZ = 0.0D;
        prevX = d;
        prevY = d1;
        prevZ = d2;
    }

    public EntityBomb(World world, double d, double d1, double d2,
                      double d3, double d4, double d5, int i)
    {
        super(world);
        fallTime = 0;
        bombType = i;
        blocksSameBlockSpawning = true;
        setBoundingBoxSpacing(0.98F, 0.98F);
        standingEyeHeight = height / 2.0F;
        setPosition(d, d1, d2);
        velocityX = d3;
        velocityY = d4;
        velocityZ = d5;
        prevX = d;
        prevY = d1;
        prevZ = d2;
    }

    protected void initDataTracker()
    {
    }

    public boolean isCollidable()
    {
        return !dead;
    }

    public void tick()
    {
        prevX = x;
        prevY = y;
        prevZ = z;
        fallTime++;
        velocityY -= 0.039999999105930328D;
        move(velocityX, velocityY, velocityZ);
        velocityX *= 0.98000001907348633D;
        velocityY *= 0.98000001907348633D;
        velocityZ *= 0.98000001907348633D;
        int i = MathHelper.floor(x);
        int j = MathHelper.floor(y);
        int k = MathHelper.floor(z);
        if(onGround)
        {
            velocityX *= 0.69999998807907104D;
            velocityZ *= 0.69999998807907104D;
            velocityY *= -0.5D;
            markDead();
            label0:
            switch(bombType)
            {
                default:
                    break;

                case 0: // '\0'
                    world.createExplosion(null, x, y, z, 3F);
                    break;

                case 1: // '\001'
                    world.createExplosion(null, x, y, z, 6F);
                    break;
                case 3: // '\001'
                    Explosion explosion = new Explosion(world, null, x, (float)y, (float)z, 5F);
                    explosion.explode();
                    world.playSound(x, y, z, "random.explode", 4F, (1.0F + (world.random.nextFloat() - world.random.nextFloat()) * 0.2F) * 0.7F);
                    for(int a = 0; a < 32; a++)
                    {
                        world.addParticle("explode", x, y, z, world.random.nextDouble() - 0.5D, world.random.nextDouble() - 0.5D, world.random.nextDouble() - 0.5D);
                        world.addParticle("smoke", x, y, z, world.random.nextDouble() - 0.5D, world.random.nextDouble() - 0.5D, world.random.nextDouble() - 0.5D);
                    }
                    break;

                case 2: // '\002'
                    int l = i - 3;
                    do
                    {
                        if(l >= i + 3)
                        {
                            break label0;
                        }
                        for(int i1 = j - 2; i1 < j + 2; i1++)
                        {
                            for(int j1 = k - 3; j1 < k + 3; j1++)
                            {
                                if(world.getMaterial(l, i1, j1) == Material.AIR)
                                {
                                    world.setBlock(l, i1, j1, Block.FIRE.id);
                                }
                            }

                        }

                        l++;
                    } while(true);
            }
        }
    }

    protected void writeNbt(NbtCompound nbttagcompound)
    {
        nbttagcompound.putByte("Tile", (byte)bombType);
    }

    protected void readNbt(NbtCompound nbttagcompound)
    {
        bombType = nbttagcompound.getByte("Tile") & 0xff;
    }

    public float getShadowRadius()
    {
        return 0.0F;
    }

    public World getWorld()
    {
        return world;
    }

    public int bombType;
    public int fallTime;
}
