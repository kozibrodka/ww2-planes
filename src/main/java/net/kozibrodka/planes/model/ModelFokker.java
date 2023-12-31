package net.kozibrodka.planes.model;

import net.kozibrodka.tmt.TURBO_MODEL_173.*;

public class ModelFokker extends ModelPlane
{

    public ModelFokker()
    {
        char c = '\200';
        char c1 = '\200';
        propellerModels = new ModelRendererTurbo[1][3];
        propellerModels[0][0] = new ModelRendererTurbo(56, 8, c, c1);
        propellerModels[0][1] = new ModelRendererTurbo(56, 8, c, c1);
        propellerModels[0][2] = new ModelRendererTurbo(56, 8, c, c1);
        propellerModels[0][0].addBox(0.0F, -7F, -1F, 2, 5, 2, 0.0F);
        propellerModels[0][1].addBox(0.0F, -7F, -1F, 2, 5, 2, 0.0F);
        propellerModels[0][2].addBox(0.0F, -7F, -1F, 2, 5, 2, 0.0F);
        yawFlapModel = new ModelRendererTurbo[1];
        yawFlapModel[0] = new ModelRendererTurbo(104, 0, c, c1);
        yawFlapModel[0].addBox(0.0F, 0.0F, 0.0F, 10, 10, 2, 0.0F);
        yawFlapModel[0].setPosition(40F, -12F, -1F);
        pitchFlapLeftModel = new ModelRendererTurbo[1];
        pitchFlapLeftModel[0] = new ModelRendererTurbo(104, 0, c, c1);
        pitchFlapLeftModel[0].addBox(0.0F, 0.0F, 0.0F, 10, 15, 2, 0.0F);
        pitchFlapLeftModel[0].pitch = 1.570796F;
        pitchFlapLeftModel[0].setPosition(40F, 3F, -15F);
        pitchFlapRightModel = new ModelRendererTurbo[1];
        pitchFlapRightModel[0] = new ModelRendererTurbo(104, 0, c, c1);
        pitchFlapRightModel[0].addBox(0.0F, 0.0F, 0.0F, 10, 15, 2, 0.0F);
        pitchFlapRightModel[0].pitch = 1.570796F;
        pitchFlapRightModel[0].setPosition(40F, 3F, 0.0F);
        bodyModel = new ModelRendererTurbo[27];
        bodyModel[0] = new ModelRendererTurbo(0, 8, c, c1);
        bodyModel[1] = new ModelRendererTurbo(0, 0, c, c1);
        bodyModel[2] = new ModelRendererTurbo(0, 0, c, c1);
        bodyModel[3] = new ModelRendererTurbo(0, 0, c, c1);
        bodyModel[4] = new ModelRendererTurbo(0, 0, c, c1);
        bodyModel[5] = new ModelRendererTurbo(0, 8, c, c1);
        bodyModel[6] = new ModelRendererTurbo(64, 0, c, c1);
        bodyModel[7] = new ModelRendererTurbo(64, 0, c, c1);
        bodyModel[8] = new ModelRendererTurbo(64, 0, c, c1);
        bodyModel[9] = new ModelRendererTurbo(64, 0, c, c1);
        bodyModel[10] = new ModelRendererTurbo(64, 0, c, c1);
        bodyModel[11] = new ModelRendererTurbo(64, 0, c, c1);
        bodyModel[12] = new ModelRendererTurbo(64, 0, c, c1);
        bodyModel[13] = new ModelRendererTurbo(64, 0, c, c1);
        bodyModel[14] = new ModelRendererTurbo(64, 0, c, c1);
        bodyModel[15] = new ModelRendererTurbo(64, 0, c, c1);
        bodyModel[16] = new ModelRendererTurbo(64, 0, c, c1);
        bodyModel[17] = new ModelRendererTurbo(56, 15, c, c1);
        bodyModel[18] = new ModelRendererTurbo(56, 15, c, c1);
        bodyModel[19] = new ModelRendererTurbo(118, 43, c, c1);
        bodyModel[20] = new ModelRendererTurbo(44, 0, c, c1);
        bodyModel[21] = new ModelRendererTurbo(0, 64, c, c1);
        bodyModel[22] = new ModelRendererTurbo(0, 32, c, c1);
        bodyModel[23] = new ModelRendererTurbo(0, 32, c, c1);
        bodyModel[24] = new ModelRendererTurbo(0, 32, c, c1);
        bodyModel[25] = new ModelRendererTurbo(12, 32, c, c1);
        bodyModel[26] = new ModelRendererTurbo(12, 32, c, c1);
        byte byte0 = 24;
        byte byte1 = 6;
        byte byte2 = 20;
        byte byte3 = 4;
        bodyModel[0].addBox(-byte0 / 2, -byte2 / 2 + 2, -3F, byte0, byte2 - 4, 4, 0.0F);
        bodyModel[0].setPosition(0.0F, 0 + byte3, 0.0F);
        bodyModel[1].addBox(-byte0 / 2 + 2, -byte1 - 1, -1F, byte0 - 4, byte1, 2, 0.0F);
        bodyModel[1].setPosition(-byte0 / 2 + 1, (0 + byte3) - 4, 0.0F);
        bodyModel[2].addBox(-byte0 / 2 + 2, -byte1 - 1, -1F, byte0 - 4, byte1, 2, 0.0F);
        bodyModel[2].setPosition(byte0 / 2 - 1, (0 + byte3) - 4, 0.0F);
        bodyModel[3].addBox(-byte0 / 2 + 2, -byte1 - 1, -1F, byte0 - 4, byte1, 2, 0.0F);
        bodyModel[3].setPosition(0.0F, (0 + byte3) - 4, -byte2 / 2 + 1);
        bodyModel[4].addBox(-byte0 / 2 + 2, -byte1 - 1, -1F, byte0 - 4, byte1, 2, 0.0F);
        bodyModel[4].setPosition(0.0F, (0 + byte3) - 4, byte2 / 2 - 1);
        bodyModel[0].pitch = 1.570796F;
        bodyModel[1].yaw = 4.712389F;
        bodyModel[2].yaw = 1.570796F;
        bodyModel[3].yaw = 3.141593F;
        bodyModel[5].addBox(-byte0 / 2, -byte2 / 2 + 2, -3F, byte0, byte2 - 4, 4, 0.0F);
        bodyModel[5].pitch = 1.570796F;
        bodyModel[5].setPosition(0.0F, (0 + byte3) - 4, 0.0F);
        bodyModel[6].addBox(0.0F, 0.0F, 0.0F, 18, 20, 2, 0.0F);
        bodyModel[6].pitch = -1.570796F;
        bodyModel[6].setPosition(-24F, 5F, -9F);
        bodyModel[7].addBox(0.0F, 0.0F, 0.0F, 18, 20, 2, 0.0F);
        bodyModel[7].pitch = -1.570796F;
        bodyModel[7].setPosition(-24F, 5F, -29F);
        bodyModel[8].addBox(0.0F, 0.0F, 0.0F, 18, 20, 2, 0.0F);
        bodyModel[8].pitch = -1.570796F;
        bodyModel[8].setPosition(-24F, 5F, 29F);
        bodyModel[9].addBox(0.0F, 0.0F, 0.0F, 18, 20, 2, 0.0F);
        bodyModel[9].pitch = -1.570796F;
        bodyModel[9].setPosition(-24F, 5F, 49F);
        bodyModel[10].addBox(0.0F, 0.0F, 0.0F, 18, 20, 2, 0.0F);
        bodyModel[10].pitch = -1.570796F;
        bodyModel[10].setPosition(-25F, -6F, -9F);
        bodyModel[11].addBox(0.0F, 0.0F, 0.0F, 18, 20, 2, 0.0F);
        bodyModel[11].pitch = -1.570796F;
        bodyModel[11].setPosition(-25F, -6F, -29F);
        bodyModel[12].addBox(0.0F, 0.0F, 0.0F, 18, 20, 2, 0.0F);
        bodyModel[12].pitch = -1.570796F;
        bodyModel[12].setPosition(-25F, -6F, 49F);
        bodyModel[13].addBox(0.0F, 0.0F, 0.0F, 18, 20, 2, 0.0F);
        bodyModel[13].pitch = -1.570796F;
        bodyModel[13].setPosition(-25F, -6F, 29F);
        bodyModel[14].addBox(0.0F, 0.0F, 0.0F, 18, 40, 2, 0.0F);
        bodyModel[14].pitch = -1.570796F;
        bodyModel[14].setPosition(-24F, -20F, 50F);
        bodyModel[15].addBox(0.0F, 0.0F, 0.0F, 18, 40, 2, 0.0F);
        bodyModel[15].pitch = -1.570796F;
        bodyModel[15].yaw = 3.141593F;
        bodyModel[15].setPosition(-6F, -20F, -50F);
        bodyModel[16].addBox(0.0F, 0.0F, 0.0F, 18, 20, 2, 0.0F);
        bodyModel[16].pitch = -1.570796F;
        bodyModel[16].setPosition(-24F, -20F, 10F);
        bodyModel[17].addBox(-15F, -18F, -45F, 2, 23, 2, 0.0F);
        bodyModel[18].addBox(-15F, -18F, 43F, 2, 23, 2, 0.0F);
        bodyModel[19].addBox(11F, -2F, -5F, 40, 8, 10, 0.0F);
        bodyModel[20].addBox(0.0F, 0.0F, 0.0F, 4, 4, 4, 0.0F);
        bodyModel[20].setPosition(-30F, -2F, -2F);
        bodyModel[21].addBox(0.0F, 0.0F, 0.0F, 14, 14, 18, 0.0F);
        bodyModel[21].setPosition(-26F, -7F, -9F);
        bodyModel[22].addBox(-13F, 6F, 5F, 4, 4, 2, 0.0F);
        bodyModel[23].addBox(-13F, 6F, -7F, 4, 4, 2, 0.0F);
        bodyModel[24].addBox(44F, 6F, -1F, 4, 4, 2, 0.0F);
        bodyModel[25].addBox(-24F, -9F, -4F, 14, 2, 2, 0.0F);
        bodyModel[26].addBox(-24F, -9F, 2.0F, 14, 2, 2, 0.0F);
    }
}
