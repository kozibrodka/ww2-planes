package net.kozibrodka.planes.item;

import net.kozibrodka.planes.entity.EntityPlane;
import net.kozibrodka.planes.events.mod_Planes;
import net.kozibrodka.planes.properties.PlaneType;
import net.minecraft.entity.player.PlayerBase;
import net.minecraft.item.ItemInstance;
import net.minecraft.level.Level;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.hit.HitType;
import net.minecraft.util.maths.MathHelper;
import net.minecraft.util.maths.Vec3f;
import net.modificationstation.stationapi.api.util.Identifier;
import net.modificationstation.stationapi.api.template.item.TemplateItem;

public class ItemPlane extends TemplateItem
{

    public ItemPlane(Identifier i, String s)
    {
        super(i);
        maxStackSize = 1;
        planeType = s;
    }

    public ItemInstance use(ItemInstance itemstack, Level world, PlayerBase entityplayer)
    {
        float f = 1.0F;
        float f1 = entityplayer.prevPitch + (entityplayer.pitch - entityplayer.prevPitch) * f;
        float f2 = entityplayer.prevYaw + (entityplayer.yaw - entityplayer.prevYaw) * f;
        double d = entityplayer.prevX + (entityplayer.x - entityplayer.prevX) * (double)f;
        double d1 = (entityplayer.prevY + (entityplayer.y - entityplayer.prevY) * (double)f + 1.6200000000000001D) - (double)entityplayer.standingEyeHeight;
        double d2 = entityplayer.prevZ + (entityplayer.z - entityplayer.prevZ) * (double)f;
        Vec3f vec3d = Vec3f.from(d, d1, d2);
        float f3 = MathHelper.cos(-f2 * 0.01745329F - 3.141593F);
        float f4 = MathHelper.sin(-f2 * 0.01745329F - 3.141593F);
        float f5 = -MathHelper.cos(-f1 * 0.01745329F);
        float f6 = MathHelper.sin(-f1 * 0.01745329F);
        float f7 = f4 * f5;
        float f8 = f6;
        float f9 = f3 * f5;
        double d3 = 5D;
        Vec3f vec3d1 = vec3d.method_1301((double)f7 * d3, (double)f8 * d3, (double)f9 * d3);
        HitResult movingobjectposition = world.method_161(vec3d, vec3d1, true);
        if(movingobjectposition == null)
        {
            return itemstack;
        }
        if(movingobjectposition.type == HitType.field_789)
        {
            int i = movingobjectposition.x;
            int j = movingobjectposition.y;
            int k = movingobjectposition.z;
            PlaneType planetype = mod_Planes.getPlaneType(planeType);
            if(!world.isServerSide)
            {
                int l = itemstack.getDamage();
                world.spawnEntity(new EntityPlane(world, (double)i + 0.5D, (double)j + 1.5D, (double)k + 0.5D, entityplayer, l, planetype));
            }
            itemstack.count--;
        }
        return itemstack;
    }

    private String planeType;
}
