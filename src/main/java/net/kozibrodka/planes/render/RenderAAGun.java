package net.kozibrodka.planes.render;

import net.kozibrodka.planes.entity.EntityAAGun;
import net.kozibrodka.planes.model.ModelAAGun;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.entity.EntityBase;
import org.lwjgl.opengl.GL11;

public class RenderAAGun extends EntityRenderer {
    public RenderAAGun() {
        this.field_2678 = 0.5F;
    }

    public void renderAA(EntityAAGun aa, double d, double d1, double d2, float f, float f1) {
        GL11.glPushMatrix();
        GL11.glTranslatef((float)d, (float)d1, (float)d2);
        bindTexture((new StringBuilder()).append("/assets/planes/stationapi/textures/mob/").append(aa.type.texture).append(".png").toString());
        GL11.glScalef(1.0F, 1.0F, 1.0F);
        ModelAAGun modelAAGun = aa.type.model;
        modelAAGun.renderBase(0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F, aa);
        GL11.glRotatef(180.0F - aa.gunYaw, 0.0F, 1.0F, 0.0F);
        modelAAGun.renderGun(0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F, aa);
        GL11.glPopMatrix();
    }

    public void render(EntityBase entity, double d, double d1, double d2, float f, float f1) {
        this.renderAA((EntityAAGun)entity, d, d1, d2, f, f1);
    }
}
