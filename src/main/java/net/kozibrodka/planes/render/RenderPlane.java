package net.kozibrodka.planes.render;
import net.kozibrodka.planes.entity.EntityPlane;
import net.kozibrodka.planes.model.ModelPlane;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.entity.EntityBase;
import net.minecraft.util.maths.MathHelper;
import org.lwjgl.opengl.GL11;

public class RenderPlane extends EntityRenderer
{

    public RenderPlane()
    {
        field_2678 = 0.5F;
    }

    public void method_1908(EntityPlane entityplane, double d, double d1, double d2,
                            float f, float f1)
    {
        GL11.glPushMatrix();
        GL11.glTranslatef((float)d, (float)d1, (float)d2);
        GL11.glRotatef(180F - f, 0.0F, 1.0F, 0.0F);
        GL11.glRotatef(-entityplane.pitch, 0.0F, 0.0F, 1.0F);
        float f2 = (float)entityplane.boatTimeSinceHit - f1;
        float f3 = (float)entityplane.boatCurrentDamage - f1;
        if(f3 < 0.0F)
        {
            f3 = 0.0F;
        }
        if(f2 > 0.0F)
        {
            GL11.glRotatef(((MathHelper.sin(f2) * f2 * f3) / 10F) * (float)entityplane.boatRockDirection, 1.0F, 0.0F, 0.0F);
        }
        GL11.glRotatef(entityplane.rotationRoll, 1.0F, 0.0F, 0.0F);
        bindTexture((new StringBuilder()).append("/assets/planes/stationapi/textures/mob/").append(entityplane.plane.shortName).append(".png").toString());
        GL11.glScalef(-1F, -1F, 1.0F);
        ModelPlane modelplane = entityplane.plane.model;
        modelplane.render(0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F, entityplane);
        GL11.glPopMatrix();
    }

    public void render(EntityBase entity, double d, double d1, double d2,
                       float f, float f1)
    {
        method_1908((EntityPlane)entity, d, d1, d2, f, f1);
    }
}
