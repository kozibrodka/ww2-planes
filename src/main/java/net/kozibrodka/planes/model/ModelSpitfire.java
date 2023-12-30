package net.kozibrodka.planes.model;

import net.kozibrodka.tmt.TURBO_MODEL_173.*;

public class ModelSpitfire extends ModelPlane
{

    public ModelSpitfire()
    {
        char c = '\u0100';
        char c1 = '\200';
        bodyModel = new ModelRendererTurbo[17];
        bodyModel[0] = new ModelRendererTurbo(0, 38, c, c1);
        bodyModel[1] = new ModelRendererTurbo(0, 104, c, c1);
        bodyModel[2] = new ModelRendererTurbo(0, 0, c, c1);
        bodyModel[3] = new ModelRendererTurbo(60, 76, c, c1);
        bodyModel[4] = new ModelRendererTurbo(60, 76, c, c1);
        bodyModel[5] = new ModelRendererTurbo(58, 48, c, c1);
        bodyModel[6] = new ModelRendererTurbo(58, 48, c, c1);
        bodyModel[7] = new ModelRendererTurbo(172, 0, c, c1);
        bodyModel[8] = new ModelRendererTurbo(172, 0, c, c1);
        bodyModel[9] = new ModelRendererTurbo(172, 12, c, c1);
        bodyModel[10] = new ModelRendererTurbo(116, 48, c, c1);
        bodyModel[11] = new ModelRendererTurbo(116, 48, c, c1);
        bodyModel[12] = new ModelRendererTurbo(116, 48, c, c1);
        bodyModel[13] = new ModelRendererTurbo(0, 76, c, c1);
        bodyModel[14] = new ModelRendererTurbo(200, 12, c, c1);
        bodyModel[15] = new ModelRendererTurbo(192, 25, c, c1);
        bodyModel[16] = new ModelRendererTurbo(192, 25, c, c1);
        bodyModel[0].addTrapezoid(-51F, -16F, -10F, 48, 18, 20, 0.0F, -3F, 3);
        bodyModel[0].setPosition(0.0F, 5F, 0.0F);
        bodyModel[1].addBox(-3F, 0.0F, -31F, 20, 2, 20);
        bodyModel[1].setPosition(0.0F, 5F, 21F);
        bodyModel[2].addTrapezoid(17F, -16F, -10F, 76, 18, 20, 0.0F, -3F, 2);
        bodyModel[2].setPosition(0.0F, 5F, 0.0F);
        bodyModel[3].addBox(-3F, -16F, -10F, 20, 16, 2);
        bodyModel[3].setPosition(0.0F, 5F, 0.0F);
        bodyModel[4].addBox(-17F, -16F, -10F, 20, 16, 2);
        bodyModel[4].yaw = 3.141593F;
        bodyModel[4].setPosition(0.0F, 5F, 0.0F);
        bodyModel[5].addBox(-25F, -2F, 0.0F, 32, 2, 78, 0.0F);
        bodyModel[5].setPosition(0.0F, 5F, 0.0F);
        bodyModel[6].addBox(-32F, -2F, -78F, 32, 2, 78);
        bodyModel[6].yaw = 3.141593F;
        bodyModel[6].setPosition(-25F, 5F, -78F);
        bodyModel[7].addTrapezoid(-25F, 3F, 78F, 32, 2, 10, 0.0F, -1F, 1);
        bodyModel[8].addTrapezoid(-32F, 3F, -88F, 32, 2, 10, 0.0F, -1F, 1);
        bodyModel[8].yaw = 3.141593F;
        bodyModel[8].setPosition(-25F, 0.0F, -166F);
        bodyModel[9].addBox(0.0F, -2F, 0.0F, 4, 4, 4, 0.0F);
        bodyModel[9].setPosition(-55F, 0.0F, -2F);
        bodyModel[10].addBox(4F, 6F, 5F, 6, 6, 4, 0.0F);
        bodyModel[11].addBox(4F, 6F, -8F, 6, 6, 4, 0.0F);
        bodyModel[12].addBox(79F, 6F, -2F, 6, 6, 4, 0.0F);
        bodyModel[13].addTrapezoid(-3F, -19F, -10F, 20, 8, 20, 0.0F, -3F, 4);
        bodyModel[14].addBox(81F, 0.0F, -1F, 2, 8, 2, 0.0F);
        bodyModel[15].addBox(-37F, 3F, -45F, 12, 2, 2, 0.0F);
        bodyModel[16].addBox(-37F, 3F, 43F, 12, 2, 2, 0.0F);
        propellerModels = new ModelRendererTurbo[1][3];
        propellerModels[0][0] = new ModelRendererTurbo(192, 12, c, c1);
        propellerModels[0][1] = new ModelRendererTurbo(192, 12, c, c1);
        propellerModels[0][2] = new ModelRendererTurbo(192, 12, c, c1);
        propellerModels[0][0].addBox(-0F, -12F, -1F, 2, 11, 2, 0.0F);
        propellerModels[0][1].addBox(-0F, -12F, -1F, 2, 11, 2, 0.0F);
        propellerModels[0][2].addBox(-0F, -12F, -1F, 2, 11, 2, 0.0F);
        yawFlapModel = new ModelRendererTurbo[1];
        yawFlapModel[0] = new ModelRendererTurbo(220, 12, c, c1);
        yawFlapModel[0].addBox(0.0F, 0.0F, 0.0F, 16, 20, 2, 0.0F);
        yawFlapModel[0].setPosition(76F, -22F, -1F);
        pitchFlapLeftModel = new ModelRendererTurbo[1];
        pitchFlapLeftModel[0] = new ModelRendererTurbo(220, 12, c, c1);
        pitchFlapLeftModel[0].addBox(0.0F, 0.0F, 0.0F, 16, 22, 2, 0.0F);
        pitchFlapLeftModel[0].pitch = 1.570796F;
        pitchFlapLeftModel[0].setPosition(76F, 1.0F, -22F);
        pitchFlapRightModel = new ModelRendererTurbo[1];
        pitchFlapRightModel[0] = new ModelRendererTurbo(220, 12, c, c1);
        pitchFlapRightModel[0].addBox(0.0F, 0.0F, 0.0F, 16, 22, 2, 0.0F);
        pitchFlapRightModel[0].pitch = 1.570796F;
        pitchFlapRightModel[0].setPosition(76F, 1.0F, 0.0F);
    }
}
