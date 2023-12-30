package net.kozibrodka.planes.render;

import net.kozibrodka.planes.entity.EntityBomb;
import net.kozibrodka.planes.model.ModelBomb;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.render.entity.model.EntityModelBase;
import net.minecraft.entity.EntityBase;
import org.lwjgl.opengl.GL11;

public class RenderBomb extends EntityRenderer
{

    public RenderBomb()
    {
        field_2678 = 0.5F;
        modelBomb = new ModelBomb();
    }

    public void func_157_a(EntityBomb entitybomb, double d, double d1, double d2,
                           float f, float f1)
    {
        GL11.glPushMatrix();
        GL11.glTranslatef((float)d, (float)d1, (float)d2);
        GL11.glRotatef(180F - f, 0.0F, 1.0F, 0.0F);
        GL11.glRotatef(-entitybomb.pitch, 0.0F, 0.0F, 1.0F);
//        bindTexture("/terrain.png");
        float f2 = 0.75F;
        GL11.glScalef(f2, f2, f2);
        GL11.glScalef(1.0F / f2, 1.0F / f2, 1.0F / f2);
        bindTexture("/assets/planes/stationapi/textures/mob/bullet.png");
        GL11.glScalef(-1F, -1F, 1.0F);
        ModelBomb modelbomb = (ModelBomb)modelBomb;
        modelbomb.render(0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F, entitybomb);
        GL11.glPopMatrix();
    }

    public void render(EntityBase entity, double d, double d1, double d2,
                         float f, float f1)
    {
        func_157_a((EntityBomb)entity, d, d1, d2, f, f1);
    }

    protected EntityModelBase modelBomb;
}
