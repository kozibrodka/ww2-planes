package net.kozibrodka.planes.model;

import net.kozibrodka.planes.entity.EntityPlane;
import net.kozibrodka.tmt.TURBO_MODEL_173.*;
import net.minecraft.client.render.entity.model.EntityModelBase;

public class ModelPlane extends EntityModelBase
{

    public ModelPlane()
    {
    }

    public void render(float f, float f1, float f2, float f3, float f4, float f5, EntityPlane entityplane)
    {
        float f6 = entityplane.angle;
        for(int i = 0; i < propellerModels.length; i++)
        {
            int j1 = propellerModels[i].length;
            for(int k1 = 0; k1 < j1; k1++)
            {
                propellerModels[i][k1].setPosition(entityplane.plane.propellerX, entityplane.plane.propellerY, entityplane.plane.propellerZ * (i % 2 != 0 ? -1 : 1));
                propellerModels[i][k1].pitch = f6 + ((float)k1 * 2.0F * 3.141593F) / (float)j1;
                propellerModels[i][k1].render(f5);
            }

        }

        for(int j = 0; j < yawFlapModel.length; j++)
        {
            yawFlapModel[j].yaw = (entityplane.flapsYaw * 3.141593F) / 180F;
            yawFlapModel[j].render(f5);
        }

        for(int k = 0; k < pitchFlapLeftModel.length; k++)
        {
            pitchFlapLeftModel[k].roll = (entityplane.flapsPitchLeft * 3.141593F) / 180F;
            pitchFlapLeftModel[k].render(f5);
        }

        for(int l = 0; l < pitchFlapRightModel.length; l++)
        {
            pitchFlapRightModel[l].roll = (entityplane.flapsPitchRight * 3.141593F) / 180F;
            pitchFlapRightModel[l].render(f5);
        }

        for(int i1 = 0; i1 < bodyModel.length; i1++)
        {
            bodyModel[i1].render(f5);
        }

    }

    public void setAngles(float f, float f1, float f2, float f3, float f4, float f5) //dopiero co naprawilem
    {
    }
    //oryg
    public ModelRendererTurbo bodyModel[];
    public ModelRendererTurbo propellerModels[][];
    public ModelRendererTurbo yawFlapModel[];
    public ModelRendererTurbo pitchFlapLeftModel[];
    public ModelRendererTurbo pitchFlapRightModel[];
}
