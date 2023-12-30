package net.kozibrodka.planes.model;

import net.kozibrodka.tmt.TURBO_MODEL_173.*;

public class ModelBiplane extends ModelPlane
{

    public ModelBiplane()
    {
        char c = '\200';
        byte byte0 = 64;
        propellerModels = new ModelRendererTurbo[1][3];
        propellerModels[0][0] = new ModelRendererTurbo(56, 8, c, byte0);
        propellerModels[0][1] = new ModelRendererTurbo(56, 8, c, byte0);
        propellerModels[0][2] = new ModelRendererTurbo(56, 8, c, byte0);
        propellerModels[0][0].addBox(-1F, 2.0F, -1F, 2, 5, 2, 0.0F);
        propellerModels[0][1].addBox(-1F, 2.0F, -1F, 2, 5, 2, 0.0F);
        propellerModels[0][2].addBox(-1F, 2.0F, -1F, 2, 5, 2, 0.0F);
        yawFlapModel = new ModelRendererTurbo[1];
        yawFlapModel[0] = new ModelRendererTurbo(104, 0, c, byte0);
        yawFlapModel[0].addBox(0.0F, 0.0F, 0.0F, 10, 10, 2, 0.0F);
        yawFlapModel[0].setPosition(40F, -12F, -1F);
        pitchFlapLeftModel = new ModelRendererTurbo[1];
        pitchFlapLeftModel[0] = new ModelRendererTurbo(104, 0, c, byte0);
        pitchFlapLeftModel[0].addBox(0.0F, 0.0F, 0.0F, 10, 15, 2, 0.0F);
        pitchFlapLeftModel[0].pitch = 1.570796F;
        pitchFlapLeftModel[0].setPosition(40F, 3F, -15F);
        pitchFlapRightModel = new ModelRendererTurbo[1];
        pitchFlapRightModel[0] = new ModelRendererTurbo(104, 0, c, byte0);
        pitchFlapRightModel[0].addBox(0.0F, 0.0F, 0.0F, 10, 15, 2, 0.0F);
        pitchFlapRightModel[0].pitch = 1.570796F;
        pitchFlapRightModel[0].setPosition(40F, 3F, 0.0F);
        bodyModel = new ModelRendererTurbo[17];
        bodyModel[0] = new ModelRendererTurbo(0, 8, c, byte0);
        bodyModel[1] = new ModelRendererTurbo(0, 0, c, byte0);
        bodyModel[2] = new ModelRendererTurbo(0, 0, c, byte0);
        bodyModel[3] = new ModelRendererTurbo(0, 0, c, byte0);
        bodyModel[4] = new ModelRendererTurbo(0, 0, c, byte0);
        bodyModel[5] = new ModelRendererTurbo(64, 0, c, byte0);
        bodyModel[6] = new ModelRendererTurbo(64, 0, c, byte0);
        bodyModel[7] = new ModelRendererTurbo(64, 0, c, byte0);
        bodyModel[8] = new ModelRendererTurbo(64, 0, c, byte0);
        bodyModel[9] = new ModelRendererTurbo(64, 0, c, byte0);
        bodyModel[10] = new ModelRendererTurbo(56, 15, c, byte0);
        bodyModel[11] = new ModelRendererTurbo(56, 15, c, byte0);
        bodyModel[12] = new ModelRendererTurbo(0, 43, c, byte0);
        bodyModel[13] = new ModelRendererTurbo(44, 0, c, byte0);
        bodyModel[14] = new ModelRendererTurbo(0, 32, c, byte0);
        bodyModel[15] = new ModelRendererTurbo(0, 32, c, byte0);
        bodyModel[16] = new ModelRendererTurbo(0, 32, c, byte0);
        byte byte1 = 24;
        byte byte2 = 6;
        byte byte3 = 20;
        byte byte4 = 4;
        bodyModel[0].addBox(-byte1 / 2, -byte3 / 2 + 2, -3F, byte1, byte3 - 4, 4, 0.0F);
        bodyModel[0].setPosition(0.0F, 0 + byte4, 0.0F);
        bodyModel[1].addBox(-byte1 / 2 + 2, -byte2 - 1, -1F, byte1 - 4, byte2, 2, 0.0F);
        bodyModel[1].setPosition(-byte1 / 2 + 1, 0 + byte4, 0.0F);
        bodyModel[2].addBox(-byte1 / 2 + 2, -byte2 - 1, -1F, byte1 - 4, byte2, 2, 0.0F);
        bodyModel[2].setPosition(byte1 / 2 - 1, 0 + byte4, 0.0F);
        bodyModel[3].addBox(-byte1 / 2 + 2, -byte2 - 1, -1F, byte1 - 4, byte2, 2, 0.0F);
        bodyModel[3].setPosition(0.0F, 0 + byte4, -byte3 / 2 + 1);
        bodyModel[4].addBox(-byte1 / 2 + 2, -byte2 - 1, -1F, byte1 - 4, byte2, 2, 0.0F);
        bodyModel[4].setPosition(0.0F, 0 + byte4, byte3 / 2 - 1);
        bodyModel[5].addBox(0.0F, 0.0F, 0.0F, 18, 41, 2, 0.0F);
        bodyModel[5].pitch = -1.570796F;
        bodyModel[5].setPosition(-9F, 0.0F, -9F);
        bodyModel[6].addBox(0.0F, 0.0F, 0.0F, 18, 41, 2, 0.0F);
        bodyModel[6].pitch = -1.570796F;
        bodyModel[6].setPosition(-9F, 0.0F, 50F);
        bodyModel[7].addBox(0.0F, 0.0F, 0.0F, 18, 18, 2, 0.0F);
        bodyModel[7].pitch = -1.570796F;
        bodyModel[7].setPosition(-9F, -20F, 9F);
        bodyModel[8].addBox(0.0F, 0.0F, 0.0F, 18, 41, 2, 0.0F);
        bodyModel[8].pitch = -1.570796F;
        bodyModel[8].setPosition(-9F, -20F, 50F);
        bodyModel[9].addBox(0.0F, 0.0F, 0.0F, 18, 41, 2, 0.0F);
        bodyModel[9].pitch = -1.570796F;
        bodyModel[9].setPosition(-9F, -20F, -9F);
        bodyModel[10].addBox(-1F, -18F, -40F, 2, 18, 2, 0.0F);
        bodyModel[11].addBox(-1F, -18F, 38F, 2, 18, 2, 0.0F);
        bodyModel[12].addBox(11F, -2F, -5F, 40, 8, 10, 0.0F);
        bodyModel[13].addBox(0.0F, 0.0F, 0.0F, 4, 4, 4, 0.0F);
        bodyModel[13].setPosition(-15F, -2F, -2F);
        bodyModel[14].addBox(-3F, 6F, 5F, 4, 4, 2, 0.0F);
        bodyModel[15].addBox(-3F, 6F, -7F, 4, 4, 2, 0.0F);
        bodyModel[16].addBox(44F, 6F, -1F, 4, 4, 2, 0.0F);
        bodyModel[0].pitch = 1.570796F;
        bodyModel[1].yaw = 4.712389F;
        bodyModel[2].yaw = 1.570796F;
        bodyModel[3].yaw = 3.141593F;
    }
}
