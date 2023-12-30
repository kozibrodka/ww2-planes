package net.kozibrodka.planes.model;

import net.kozibrodka.planes.entity.EntityBomb;
import net.kozibrodka.tmt.TURBO_MODEL_173.*;
import net.minecraft.client.render.entity.model.EntityModelBase;

public class ModelBomb extends EntityModelBase
{

    public ModelBomb()
    {
        bombModel = new ModelRendererTurbo[4];
        bombModel[0] = new ModelRendererTurbo(104, 0, 128, 64);
        bombModel[1] = new ModelRendererTurbo(104, 0, 128, 64);
        bombModel[2] = new ModelRendererTurbo(56, 8, 128, 64);
        bombModel[3] = new ModelRendererTurbo(56, 8, 128, 64);
        bombModel[0].addTrapezoid(-2F, 0.0F, -2F, 4, 1, 4, 0.0F, 1.0F, 5);
        bombModel[1].addBox(-2F, 1.0F, -2F, 4, 6, 4, 0.0F);
        bombModel[2].addTrapezoid(-2F, 7F, -2F, 4, 1, 4, 0.0F, 1.0F, 4);
        bombModel[3].addBox(-2F, 8F, -2F, 4, 2, 4, 0.0F);
    }

    public void render(float f, float f1, float f2, float f3, float f4, float f5, EntityBomb entitybomb)
    {
        for(int i = 0; i < 4; i++)
        {
            bombModel[i].render(f5);
        }

    }

    public void setAngles(float f, float f1, float f2, float f3, float f4, float f5)
    {
    }

    public ModelRendererTurbo bombModel[];
}
