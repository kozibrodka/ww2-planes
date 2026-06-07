package net.kozibrodka.planes.render;

import net.kozibrodka.planes.entity.EntityPlaneNew;
import net.kozibrodka.planes.model.ModelPlaneNew;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import org.lwjgl.opengl.GL11;

public class RenderPlaneNew extends EntityRenderer {
    public RenderPlaneNew() {
        this.shadowRadius = 0.5F;
    }

//    public void func_157_a(EntityPlaneNew entityPlane, double d, double d1, double d2, float f, float f1) {
//        GL11.glPushMatrix();
//        GL11.glTranslatef((float)d, (float)d1, (float)d2);
//        GL11.glRotatef(f + 90.0F, 0.0F, 1.0F, 0.0F);
//        bindTexture((new StringBuilder()).append("/assets/planes/stationapi/textures/mob/").append(entityPlane.plane.texture).append(".png").toString());
//        ModelPlaneNew modelplanenew = entityPlane.plane.modelNew;
//        if(modelplanenew != null) {
//            modelplanenew.render(0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F, entityPlane);
//        }
//        GL11.glPopMatrix();
//    }

    public void method_1908(EntityPlaneNew entityplane, double d, double d1, double d2,
                            float f, float f1)
    {
        GL11.glPushMatrix();
        float fV = entityplane.prevPitch + (entityplane.pitch - entityplane.prevPitch) * f1;
        GL11.glTranslatef((float)d, (float)d1, (float)d2);
        GL11.glRotatef(180F - f, 0.0F, 1.0F, 0.0F);
        GL11.glRotatef(-fV, 0.0F, 0.0F, 1.0F);
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
        bindTexture("/assets/planes/stationapi/textures/mob/" + entityplane.plane.texture + ".png");
        if(entityplane.plane.oldClassic){
            GL11.glScalef(-1F, -1F, 1.0F);
        }else{
            GL11.glScalef(-1F, 1F, -1F);
        }
        ModelPlaneNew modelplanenew = entityplane.plane.modelNew;
        modelplanenew.render(0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F, entityplane);
        GL11.glPopMatrix();
        //KWESTIA RENDERPLANE z 1.6.4, wiecej rzeczy cos tam rotuje itd
    }

    public void render(Entity entity, double d, double d1, double d2, float f, float f1) {
        this.method_1908((EntityPlaneNew)entity, d, d1, d2, f, f1);
    }
}
