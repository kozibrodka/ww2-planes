package net.kozibrodka.planes.model;

import net.kozibrodka.tmt.TURBO_MODEL_125.*;

public class ModelME109_125 extends ModelPlaneNew {
    int textureX = 512;
    int textureY = 512;
    boolean VarGear = true;
    boolean VarWing = true;
    boolean VarDoor = true;

    public ModelME109_125() {
        this.bodyModel = new ModelRendererTurbo[33];
        this.bodyModel[0] = new ModelRendererTurbo(this, 0, 470, this.textureX, this.textureY);
        this.bodyModel[1] = new ModelRendererTurbo(this, 30, 470, this.textureX, this.textureY);
        this.bodyModel[2] = new ModelRendererTurbo(this, 90, 470, this.textureX, this.textureY);
        this.bodyModel[3] = new ModelRendererTurbo(this, 165, 470, this.textureX, this.textureY);
        this.bodyModel[4] = new ModelRendererTurbo(this, 165, 495, this.textureX, this.textureY);
        this.bodyModel[5] = new ModelRendererTurbo(this, 200, 470, this.textureX, this.textureY);
        this.bodyModel[6] = new ModelRendererTurbo(this, 240, 470, this.textureX, this.textureY);
        this.bodyModel[7] = new ModelRendererTurbo(this, 300, 470, this.textureX, this.textureY);
        this.bodyModel[8] = new ModelRendererTurbo(this, 430, 470, this.textureX, this.textureY);
        this.bodyModel[9] = new ModelRendererTurbo(this, 430, 490, this.textureX, this.textureY);
        this.bodyModel[10] = new ModelRendererTurbo(this, 385, 470, this.textureX, this.textureY);
        this.bodyModel[11] = new ModelRendererTurbo(this, 210, 440, this.textureX, this.textureY);
        this.bodyModel[12] = new ModelRendererTurbo(this, 220, 440, this.textureX, this.textureY);
        this.bodyModel[13] = new ModelRendererTurbo(this, 230, 440, this.textureX, this.textureY);
        this.bodyModel[14] = new ModelRendererTurbo(this, 230, 455, this.textureX, this.textureY);
        this.bodyModel[15] = new ModelRendererTurbo(this, 260, 440, this.textureX, this.textureY);
        this.bodyModel[16] = new ModelRendererTurbo(this, 260, 460, this.textureX, this.textureY);
        this.bodyModel[17] = new ModelRendererTurbo(this, 260, 465, this.textureX, this.textureY);
        this.bodyModel[18] = new ModelRendererTurbo(this, 295, 440, this.textureX, this.textureY);
        this.bodyModel[19] = new ModelRendererTurbo(this, 305, 440, this.textureX, this.textureY);
        this.bodyModel[20] = new ModelRendererTurbo(this, 315, 440, this.textureX, this.textureY);
        this.bodyModel[21] = new ModelRendererTurbo(this, 325, 440, this.textureX, this.textureY);
        this.bodyModel[22] = new ModelRendererTurbo(this, 350, 440, this.textureX, this.textureY);
        this.bodyModel[23] = new ModelRendererTurbo(this, 375, 440, this.textureX, this.textureY);
        this.bodyModel[24] = new ModelRendererTurbo(this, 95, 440, this.textureX, this.textureY);
        this.bodyModel[25] = new ModelRendererTurbo(this, 105, 440, this.textureX, this.textureY);
        this.bodyModel[26] = new ModelRendererTurbo(this, 130, 440, this.textureX, this.textureY);
        this.bodyModel[27] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.bodyModel[28] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.bodyModel[29] = new ModelRendererTurbo(this, 130, 400, this.textureX, this.textureY);
        this.bodyModel[30] = new ModelRendererTurbo(this, 155, 400, this.textureX, this.textureY);
        this.bodyModel[31] = new ModelRendererTurbo(this, 400, 440, this.textureX, this.textureY);
        this.bodyModel[32] = new ModelRendererTurbo(this, 130, 420, this.textureX, this.textureY);
        this.bodyModel[0].addTrapezoid(0.0F, 0.0F, 0.0F, 6, 7, 7, 0.0F, -2.5F, 3);
        this.bodyModel[0].setRotationPoint(-46.0F, -21.0F, -3.5F);
        this.bodyModel[1].addTrapezoid(0.0F, 0.0F, 0.0F, 10, 15, 14, 0.0F, -3.0F, 3);
        this.bodyModel[1].setRotationPoint(-40.0F, -26.0F, -7.0F);
        this.bodyModel[2].addTrapezoid(0.0F, 0.0F, 0.0F, 19, 19, 16, 0.0F, -1.0F, 3);
        this.bodyModel[2].setRotationPoint(-30.0F, -27.0F, -8.0F);
        this.bodyModel[3].addBox(0.0F, 0.0F, 0.0F, 2, 1, 19, 0.0F);
        this.bodyModel[3].setRotationPoint(-30.0F, -15.0F, 8.0F);
        this.bodyModel[3].rotateAngleY = -1.518436F;
        this.bodyModel[4].addBox(0.0F, 0.0F, 0.0F, 19, 1, 2, 0.0F);
        this.bodyModel[4].setRotationPoint(-30.0F, -15.0F, -8.0F);
        this.bodyModel[4].rotateAngleY = -0.05235988F;
        this.bodyModel[5].addBox(0.0F, 0.0F, 0.0F, 7, 4, 3, 0.0F);
        this.bodyModel[5].setRotationPoint(-12.0F, -21.0F, -10.0F);
        this.bodyModel[5].rotateAngleY = 0.2094395F;
        this.bodyModel[6].addBox(0.0F, 0.0F, 0.0F, 11, 19, 16, 0.0F);
        this.bodyModel[6].setRotationPoint(-11.0F, -27.0F, -8.0F);
        this.bodyModel[7].addBox(0.0F, 0.0F, 0.0F, 24, 2, 16, 0.0F);
        this.bodyModel[7].setRotationPoint(0.0F, -10.0F, -8.0F);
        this.bodyModel[8].addBox(0.0F, 0.0F, 0.0F, 24, 14, 1, 0.0F);
        this.bodyModel[8].setRotationPoint(0.0F, -24.0F, -8.0F);
        this.bodyModel[9].addBox(0.0F, 0.0F, 0.0F, 24, 14, 1, 0.0F);
        this.bodyModel[9].setRotationPoint(0.0F, -24.0F, 7.0F);
        this.bodyModel[10].addBox(0.0F, 0.0F, 0.0F, 3, 24, 16, 0.0F);
        this.bodyModel[10].setRotationPoint(24.0F, -32.0F, -8.0F);
        this.bodyModel[11].addBox(0.0F, 0.0F, 0.0F, 1, 7, 1, 0.0F);
        this.bodyModel[11].setRotationPoint(3.0F, -32.0F, -5.0F);
        this.bodyModel[11].rotateAngleZ = -0.6981317F;
        this.bodyModel[12].addBox(0.0F, 0.0F, 0.0F, 1, 7, 1, 0.0F);
        this.bodyModel[12].setRotationPoint(3.0F, -32.0F, 4.0F);
        this.bodyModel[12].rotateAngleZ = -0.6981317F;
        this.bodyModel[13].addBox(0.0F, 0.0F, 0.0F, 1, 1, 10, 0.0F);
        this.bodyModel[13].setRotationPoint(3.0F, -32.0F, -5.0F);
        this.bodyModel[14].addBox(0.0F, 0.0F, 0.0F, 1, 1, 12, 0.0F);
        this.bodyModel[14].setRotationPoint(11.0F, -32.0F, -6.0F);
        this.bodyModel[15].addBox(0.0F, 0.0F, 0.0F, 1, 1, 14, 0.0F);
        this.bodyModel[15].setRotationPoint(18.0F, -32.0F, -7.0F);
        this.bodyModel[16].addBox(0.0F, 0.0F, 0.0F, 22, 1, 1, 0.0F);
        this.bodyModel[16].setRotationPoint(3.0F, -32.0F, -5.0F);
        this.bodyModel[16].rotateAngleY = -0.1361357F;
        this.bodyModel[17].addBox(0.0F, 0.0F, 0.0F, 22, 1, 1, 0.0F);
        this.bodyModel[17].setRotationPoint(3.0F, -32.0F, 5.0F);
        this.bodyModel[17].rotateAngleX = -1.570796F;
        this.bodyModel[17].rotateAngleY = 0.1361357F;
        this.bodyModel[18].addBox(0.0F, 0.0F, 0.0F, 1, 9, 1, 0.0F);
        this.bodyModel[18].setRotationPoint(3.0F, -32.0F, -5.0F);
        this.bodyModel[18].rotateAngleX = -0.3316126F;
        this.bodyModel[19].addBox(0.0F, 0.0F, 0.0F, 1, 9, 1, 0.0F);
        this.bodyModel[19].setRotationPoint(10.0F, -32.0F, -6.0F);
        this.bodyModel[19].rotateAngleX = -0.2094395F;
        this.bodyModel[20].addBox(0.0F, 0.0F, 0.0F, 1, 9, 1, 0.0F);
        this.bodyModel[20].setRotationPoint(18.0F, -32.0F, -7.0F);
        this.bodyModel[20].rotateAngleX = -0.1047198F;
        this.bodyModel[21].addBox(0.0F, 0.0F, 0.0F, 1, 1, 9, 0.0F);
        this.bodyModel[21].setRotationPoint(3.0F, -32.0F, 5.0F);
        this.bodyModel[21].rotateAngleX = -1.239184F;
        this.bodyModel[22].addBox(0.0F, 0.0F, 0.0F, 1, 1, 9, 0.0F);
        this.bodyModel[22].setRotationPoint(11.0F, -32.0F, 6.0F);
        this.bodyModel[22].rotateAngleX = -1.361357F;
        this.bodyModel[23].addBox(0.0F, 0.0F, 0.0F, 1, 1, 8, 0.0F);
        this.bodyModel[23].setRotationPoint(18.0F, -32.0F, 7.0F);
        this.bodyModel[23].rotateAngleX = -1.466077F;
        this.bodyModel[24].addTrapezoid(0.0F, 0.0F, 0.0F, 2, 8, 1, 0.0F, -0.5F, 4);
        this.bodyModel[24].setRotationPoint(24.0F, -40.0F, -0.5F);
        this.bodyModel[25].addBox(0.0F, 0.0F, 0.0F, 7, 7, 3, 0.0F);
        this.bodyModel[25].setRotationPoint(0.0F, -17.0F, -1.5F);
        this.bodyModel[26].addBox(0.0F, 0.0F, 0.0F, 19, 2, 12, 0.0F);
        this.bodyModel[26].setRotationPoint(17.0F, -10.0F, -6.0F);
        this.bodyModel[26].rotateAngleZ = 1.291544F;
        this.bodyModel[29].addShape3D(0.0F, 0.0F, 0.0F, (Shape2D)(new Shape2D(new Coord2D[]{new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(4.0D, 0.0D, 4, 0), new Coord2D(0.0D, 7.0D, 0, 7)})), 1.0F, 4, 7, 20, 1, 0, new float[]{7.0F, 9.0F, 4.0F});
        this.bodyModel[29].setRotationPoint(24.0F, -24.0F, -7.0F);
        this.bodyModel[30].addShape3D(0.0F, 0.0F, 0.0F, (Shape2D)(new Shape2D(new Coord2D[]{new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(4.0D, 0.0D, 4, 0), new Coord2D(0.0D, 7.0D, 0, 7)})), 1.0F, 4, 7, 20, 1, 0, new float[]{7.0F, 9.0F, 4.0F});
        this.bodyModel[30].setRotationPoint(24.0F, -24.0F, 8.0F);
        this.bodyModel[31].addBox(0.0F, 0.0F, 0.0F, 9, 4, 14, 0.0F);
        this.bodyModel[31].setRotationPoint(0.0F, -25.0F, -7.0F);
        this.bodyModel[31].rotateAngleZ = -1.2740904F;
        this.bodyModel[32].addBox(0.0F, 0.0F, 0.0F, 12, 2, 12, 0.0F);
        this.bodyModel[32].setRotationPoint(6.0F, -12.0F, -6.0F);
        if(this.VarGear) {
        }

        if(this.VarWing) {
        }

        if(this.VarDoor) {
        }

        this.tailModel = new ModelRendererTurbo[17];
        this.tailModel[0] = new ModelRendererTurbo(this, 115, 400, this.textureX, this.textureY);
        this.tailModel[1] = new ModelRendererTurbo(this, 115, 410, this.textureX, this.textureY);
        this.tailModel[2] = new ModelRendererTurbo(this, 115, 420, this.textureX, this.textureY);
        this.tailModel[3] = new ModelRendererTurbo(this, 0, 440, this.textureX, this.textureY);
        this.tailModel[4] = new ModelRendererTurbo(this, 25, 440, this.textureX, this.textureY);
        this.tailModel[5] = new ModelRendererTurbo(this, 180, 400, this.textureX, this.textureY);
        this.tailModel[6] = new ModelRendererTurbo(this, 210, 400, this.textureX, this.textureY);
        this.tailModel[7] = new ModelRendererTurbo(this, 0, 280, this.textureX, this.textureY);
        this.tailModel[8] = new ModelRendererTurbo(this, 0, 310, this.textureX, this.textureY);
        this.tailModel[9] = new ModelRendererTurbo(this, 0, 340, this.textureX, this.textureY);
        this.tailModel[10] = new ModelRendererTurbo(this, 0, 370, this.textureX, this.textureY);
        this.tailModel[11] = new ModelRendererTurbo(this, 135, 280, this.textureX, this.textureY);
        this.tailModel[12] = new ModelRendererTurbo(this, 135, 310, this.textureX, this.textureY);
        this.tailModel[13] = new ModelRendererTurbo(this, 135, 340, this.textureX, this.textureY);
        this.tailModel[14] = new ModelRendererTurbo(this, 135, 370, this.textureX, this.textureY);
        this.tailModel[15] = new ModelRendererTurbo(this, 270, 280, this.textureX, this.textureY);
        this.tailModel[16] = new ModelRendererTurbo(this, 270, 310, this.textureX, this.textureY);
        this.tailModel[0].addBox(0.0F, 0.0F, 0.0F, 4, 4, 1, 0.0F);
        this.tailModel[0].setRotationPoint(82.0F, -18.0F, -0.5F);
        this.tailModel[1].addBox(0.0F, 0.0F, 0.0F, 1, 5, 2, 0.0F);
        this.tailModel[1].setRotationPoint(80.0F, -17.0F, -1.0F);
        this.tailModel[1].rotateAngleZ = 1.169371F;
        this.tailModel[2].addBox(0.0F, 0.0F, 0.0F, 1, 6, 1, 0.0F);
        this.tailModel[2].setRotationPoint(80.0F, -23.0F, -0.5F);
        this.tailModel[3].addBox(0.0F, 0.0F, 0.0F, 1, 1, 10, 0.0F);
        this.tailModel[3].setRotationPoint(75.0F, -24.0F, 0.0F);
        this.tailModel[3].rotateAngleX = 0.6457718F;
        this.tailModel[3].rotateAngleY = -0.3316126F;
        this.tailModel[3].rotateAngleZ = -0.05235988F;
        this.tailModel[4].addBox(0.0F, 0.0F, 0.0F, 1, 1, 10, 0.0F);
        this.tailModel[4].setRotationPoint(76.0F, -24.0F, 0.0F);
        this.tailModel[4].rotateAngleX = 0.6457718F;
        this.tailModel[4].rotateAngleY = -2.495821F;
        this.tailModel[4].rotateAngleZ = -0.05235988F;
        this.tailModel[5].addShape3D(0.0F, 0.0F, 0.0F, (Shape2D)(new Shape2D(new Coord2D[]{new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(13.0D, 4.0D, 13, 4), new Coord2D(13.0D, 23.0D, 13, 23), new Coord2D(12.0D, 24.0D, 12, 24), new Coord2D(0.0D, 12.0D, 0, 12)})), 2.0F, 13, 24, 64, 2, 0, new float[]{12.0F, 17.0F, 2.0F, 19.0F, 14.0F});
        this.tailModel[5].rotateAngleY = (float)Math.PI;
        this.tailModel[5].setRotationPoint(72.0F, -16.0F, -1.0F);
        this.tailModel[6].addShape3D(0.0F, 0.0F, 0.0F, (Shape2D)(new Shape2D(new Coord2D[]{new Coord2D(0.0D, 2.0D, 0, 2), new Coord2D(4.0D, 0.0D, 4, 0), new Coord2D(4.0D, 17.0D, 4, 17), new Coord2D(0.0D, 21.0D, 0, 21)})), 2.0F, 4, 21, 47, 2, 0, new float[]{19.0F, 6.0F, 17.0F, 5.0F});
        this.tailModel[6].rotateAngleY = (float)Math.PI;
        this.tailModel[6].setRotationPoint(85.0F, -18.0F, -1.0F);
        this.tailModel[7].addShape3D(0.0F, 0.0F, 0.0F, (Shape2D)(new Shape2D(new Coord2D[]{new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(45.0D, 8.0D, 45, 8), new Coord2D(45.0D, 20.0D, 45, 20), new Coord2D(0.0D, 24.0D, 0, 24)})), 2.0F, 45, 24, 128, 2, 0, new float[]{24.0F, 46.0F, 12.0F, 46.0F});
        this.tailModel[7].setRotationPoint(27.0F, -8.0F, -8.0F);
        this.tailModel[7].rotateAngleY = 3.2951818F;
        this.tailModel[8].addShape3D(0.0F, 0.0F, 0.0F, (Shape2D)(new Shape2D(new Coord2D[]{new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(45.0D, 8.0D, 45, 8), new Coord2D(45.0D, 20.0D, 45, 20), new Coord2D(0.0D, 24.0D, 0, 24)})), 2.0F, 45, 24, 128, 2, 0, new float[]{24.0F, 46.0F, 12.0F, 46.0F});
        this.tailModel[8].setRotationPoint(27.0F, -8.0F, -6.0F);
        this.tailModel[8].rotateAngleY = 3.2532938F;
        this.tailModel[9].addShape3D(0.0F, 0.0F, 0.0F, (Shape2D)(new Shape2D(new Coord2D[]{new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(45.0D, 8.0D, 45, 8), new Coord2D(45.0D, 20.0D, 45, 20), new Coord2D(0.0D, 24.0D, 0, 24)})), 2.0F, 45, 24, 128, 2, 0, new float[]{24.0F, 46.0F, 12.0F, 46.0F});
        this.tailModel[9].setRotationPoint(27.0F, -8.0F, -4.0F);
        this.tailModel[9].rotateAngleY = 3.2061698F;
        this.tailModel[10].addShape3D(0.0F, 0.0F, 0.0F, (Shape2D)(new Shape2D(new Coord2D[]{new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(45.0D, 8.0D, 45, 8), new Coord2D(45.0D, 20.0D, 45, 20), new Coord2D(0.0D, 24.0D, 0, 24)})), 2.0F, 45, 24, 128, 2, 0, new float[]{24.0F, 46.0F, 12.0F, 46.0F});
        this.tailModel[10].setRotationPoint(27.0F, -8.0F, -2.0F);
        this.tailModel[10].rotateAngleY = 3.1625366F;
        this.tailModel[11].addShape3D(0.0F, 0.0F, -2.0F, (Shape2D)(new Shape2D(new Coord2D[]{new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(45.0D, 8.0D, 45, 8), new Coord2D(45.0D, 20.0D, 45, 20), new Coord2D(0.0D, 24.0D, 0, 24)})), 2.0F, 45, 24, 128, 2, 0, new float[]{24.0F, 46.0F, 12.0F, 46.0F});
        this.tailModel[11].setRotationPoint(27.0F, -8.0F, 8.0F);
        this.tailModel[11].rotateAngleY = 2.9880037F;
        this.tailModel[12].addShape3D(0.0F, 0.0F, -2.0F, (Shape2D)(new Shape2D(new Coord2D[]{new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(45.0D, 8.0D, 45, 8), new Coord2D(45.0D, 20.0D, 45, 20), new Coord2D(0.0D, 24.0D, 0, 24)})), 2.0F, 45, 24, 128, 2, 0, new float[]{24.0F, 46.0F, 12.0F, 46.0F});
        this.tailModel[12].setRotationPoint(27.0F, -8.0F, 6.0F);
        this.tailModel[12].rotateAngleY = 3.0298917F;
        this.tailModel[13].addShape3D(0.0F, 0.0F, -2.0F, (Shape2D)(new Shape2D(new Coord2D[]{new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(45.0D, 8.0D, 45, 8), new Coord2D(45.0D, 20.0D, 45, 20), new Coord2D(0.0D, 24.0D, 0, 24)})), 2.0F, 45, 24, 128, 2, 0, new float[]{24.0F, 46.0F, 12.0F, 46.0F});
        this.tailModel[13].setRotationPoint(27.0F, -8.0F, 4.0F);
        this.tailModel[13].rotateAngleY = 3.0770156F;
        this.tailModel[14].addShape3D(0.0F, 0.0F, -2.0F, (Shape2D)(new Shape2D(new Coord2D[]{new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(45.0D, 8.0D, 45, 8), new Coord2D(45.0D, 20.0D, 45, 20), new Coord2D(0.0D, 24.0D, 0, 24)})), 2.0F, 45, 24, 128, 2, 0, new float[]{24.0F, 46.0F, 12.0F, 46.0F});
        this.tailModel[14].setRotationPoint(27.0F, -8.0F, 2.0F);
        this.tailModel[14].rotateAngleY = 3.1206489F;
        this.tailModel[15].addShape3D(0.0F, 0.0F, 0.0F, (Shape2D)(new Shape2D(new Coord2D[]{new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(10.0D, 0.0D, 10, 0), new Coord2D(10.0D, 19.0D, 10, 19), new Coord2D(5.0D, 24.0D, 5, 24), new Coord2D(3.0D, 21.0D, 3, 21)})), 1.0F, 10, 24, 63, 1, 0, new float[]{22.0F, 4.0F, 8.0F, 19.0F, 10.0F});
        this.tailModel[15].rotateAngleX = 4.712389F;
        this.tailModel[15].rotateAngleY = (float)Math.PI;
        this.tailModel[15].setRotationPoint(75.0F, -29.0F, -1.0F);
        this.tailModel[16].addShape3D(0.0F, 0.0F, -1.0F, (Shape2D)(new Shape2D(new Coord2D[]{new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(10.0D, 0.0D, 10, 0), new Coord2D(10.0D, 19.0D, 10, 19), new Coord2D(5.0D, 24.0D, 5, 24), new Coord2D(3.0D, 21.0D, 3, 21)})), 1.0F, 10, 24, 63, 1, 0, new float[]{22.0F, 4.0F, 8.0F, 19.0F, 10.0F});
        this.tailModel[16].rotateAngleX = (float)Math.PI / 2F;
        this.tailModel[16].rotateAngleY = (float)Math.PI;
        this.tailModel[16].setRotationPoint(75.0F, -29.0F, 1.0F);
        if(this.VarGear) {
        }

        if(this.VarWing) {
        }

        if(this.VarDoor) {
        }

        this.rightWingModel = new ModelRendererTurbo[7];
        this.rightWingModel[0] = new ModelRendererTurbo(this, 0, 200, this.textureX, this.textureY);
        this.rightWingModel[1] = new ModelRendererTurbo(this, 75, 195, this.textureX, this.textureY);
        this.rightWingModel[2] = new ModelRendererTurbo(this, 0, 400, this.textureX, this.textureY);
        this.rightWingModel[3] = new ModelRendererTurbo(this, 30, 400, this.textureX, this.textureY);
        this.rightWingModel[4] = new ModelRendererTurbo(this, 0, 420, this.textureX, this.textureY);
        this.rightWingModel[5] = new ModelRendererTurbo(this, 10, 420, this.textureX, this.textureY);
        this.rightWingModel[6] = new ModelRendererTurbo(this, 40, 420, this.textureX, this.textureY);
        this.rightWingModel[0].addShape3D(0.0F, 0.0F, 0.0F, (Shape2D)(new Shape2D(new Coord2D[]{new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(36.0D, 0.0D, 36, 0), new Coord2D(23.0D, 70.0D, 23, 70), new Coord2D(18.0D, 72.0D, 18, 72), new Coord2D(9.0D, 72.0D, 9, 72), new Coord2D(4.0D, 70.0D, 4, 70)})), 2.0F, 36, 72, 200, 2, 0, new float[]{71.0F, 6.0F, 9.0F, 6.0F, 72.0F, 36.0F});
        this.rightWingModel[0].rotateAngleX = 4.7996554F;
        this.rightWingModel[0].rotateAngleY = (float)Math.PI;
        this.rightWingModel[0].setRotationPoint(-15.0F, -8.0F, -7.0F);
        this.rightWingModel[1].addShape3D(0.0F, 0.0F, 0.0F, (Shape2D)(new Shape2D(new Coord2D[]{new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(36.0D, 0.0D, 36, 0), new Coord2D(23.0D, 70.0D, 23, 70), new Coord2D(18.0D, 72.0D, 18, 72), new Coord2D(9.0D, 72.0D, 9, 72), new Coord2D(4.0D, 70.0D, 4, 70)})), 2.0F, 36, 72, 200, 2, 0, new float[]{71.0F, 6.0F, 9.0F, 6.0F, 72.0F, 36.0F});
        this.rightWingModel[1].rotateAngleX = 4.77173F;
        this.rightWingModel[1].rotateAngleY = (float)Math.PI;
        this.rightWingModel[1].setRotationPoint(-15.0F, -10.0F, -7.0F);
        if(this.VarGear) {
            this.rightWingModel[2].addBox(0.0F, 0.0F, 0.0F, 10, 10, 2, 0.0F);
            this.rightWingModel[2].setRotationPoint(-16.0F, 0.0F, -17.0F);
            this.rightWingModel[3].addBox(0.0F, 0.0F, 0.0F, 4, 4, 2, 0.0F);
            this.rightWingModel[3].setRotationPoint(-13.0F, 3.0F, -16.0F);
            this.rightWingModel[4].addBox(0.0F, 0.0F, 0.0F, 2, 16, 1, 0.0F);
            this.rightWingModel[4].setRotationPoint(-9.0F, -9.0F, -10.0F);
            this.rightWingModel[4].rotateAngleX = -0.3316126F;
            this.rightWingModel[4].rotateAngleZ = -0.2094395F;
            this.rightWingModel[5].addBox(0.0F, 0.0F, 0.0F, 11, 6, 1, 0.0F);
            this.rightWingModel[5].setRotationPoint(-16.5F, 0.0F, -12.0F);
            this.rightWingModel[5].rotateAngleX = -0.3316126F;
            this.rightWingModel[6].addBox(0.0F, 0.0F, 0.0F, 4, 15, 1, 0.0F);
            this.rightWingModel[6].setRotationPoint(-10.0F, -9.0F, -9.0F);
            this.rightWingModel[6].rotateAngleX = -0.3316126F;
            this.rightWingModel[6].rotateAngleZ = -0.2094395F;
        }

        if(this.VarWing) {
        }

        if(this.VarDoor) {
        }

        this.leftWingModel = new ModelRendererTurbo[7];
        this.leftWingModel[0] = new ModelRendererTurbo(this, 150, 190, this.textureX, this.textureY);
        this.leftWingModel[1] = new ModelRendererTurbo(this, 225, 185, this.textureX, this.textureY);
        this.leftWingModel[2] = new ModelRendererTurbo(this, 60, 400, this.textureX, this.textureY);
        this.leftWingModel[3] = new ModelRendererTurbo(this, 90, 400, this.textureX, this.textureY);
        this.leftWingModel[4] = new ModelRendererTurbo(this, 60, 420, this.textureX, this.textureY);
        this.leftWingModel[5] = new ModelRendererTurbo(this, 70, 420, this.textureX, this.textureY);
        this.leftWingModel[6] = new ModelRendererTurbo(this, 100, 420, this.textureX, this.textureY);
        this.leftWingModel[0].addShape3D(0.0F, 0.0F, -2.0F, (Shape2D)(new Shape2D(new Coord2D[]{new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(36.0D, 0.0D, 36, 0), new Coord2D(23.0D, 70.0D, 23, 70), new Coord2D(18.0D, 72.0D, 18, 72), new Coord2D(9.0D, 72.0D, 9, 72), new Coord2D(4.0D, 70.0D, 4, 70)})), 2.0F, 36, 72, 200, 2, 0, new float[]{71.0F, 6.0F, 9.0F, 6.0F, 72.0F, 36.0F});
        this.leftWingModel[0].rotateAngleX = 1.4835299F;
        this.leftWingModel[0].rotateAngleY = (float)Math.PI;
        this.leftWingModel[0].setRotationPoint(-15.0F, -8.0F, 7.0F);
        this.leftWingModel[1].addShape3D(0.0F, 0.0F, -2.0F, (Shape2D)(new Shape2D(new Coord2D[]{new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(36.0D, 0.0D, 36, 0), new Coord2D(23.0D, 70.0D, 23, 70), new Coord2D(18.0D, 72.0D, 18, 72), new Coord2D(9.0D, 72.0D, 9, 72), new Coord2D(4.0D, 70.0D, 4, 70)})), 2.0F, 36, 72, 200, 2, 0, new float[]{71.0F, 6.0F, 9.0F, 6.0F, 72.0F, 36.0F});
        this.leftWingModel[1].rotateAngleX = 1.5114552F;
        this.leftWingModel[1].rotateAngleY = (float)Math.PI;
        this.leftWingModel[1].setRotationPoint(-15.0F, -10.0F, 7.0F);
        if(this.VarGear) {
            this.leftWingModel[2].addBox(0.0F, 0.0F, 0.0F, 10, 10, 2, 0.0F);
            this.leftWingModel[2].setRotationPoint(-16.0F, 0.0F, 15.0F);
            this.leftWingModel[3].addBox(0.0F, 0.0F, 0.0F, 4, 4, 2, 0.0F);
            this.leftWingModel[3].setRotationPoint(-13.0F, 3.0F, 14.0F);
            this.leftWingModel[4].addBox(0.0F, 0.0F, 0.0F, 2, 16, 1, 0.0F);
            this.leftWingModel[4].setRotationPoint(-9.0F, -9.0F, 9.0F);
            this.leftWingModel[4].rotateAngleX = 0.3316126F;
            this.leftWingModel[4].rotateAngleZ = -0.2094395F;
            this.leftWingModel[5].addBox(0.0F, 0.0F, 0.0F, 11, 6, 1, 0.0F);
            this.leftWingModel[5].setRotationPoint(-16.5F, 0.0F, 11.0F);
            this.leftWingModel[5].rotateAngleX = 0.3316126F;
            this.leftWingModel[5].rotateAngleY = 0.01745329F;
            this.leftWingModel[6].addBox(0.0F, 0.0F, 0.0F, 4, 15, 1, 0.0F);
            this.leftWingModel[6].setRotationPoint(-10.0F, -9.0F, 8.0F);
            this.leftWingModel[6].rotateAngleX = 0.3316126F;
            this.leftWingModel[6].rotateAngleZ = -0.2094395F;
        }

        if(this.VarWing) {
        }

        if(this.VarDoor) {
        }

        this.propellerModels = new ModelRendererTurbo[1][3];
        this.propellerModels[0] = this.makeProp1(-40, -18, 0);
        this.yawFlapModel = new ModelRendererTurbo[3];
        this.yawFlapModel[0] = new ModelRendererTurbo(this, 110, 455, this.textureX, this.textureY);
        this.yawFlapModel[1] = new ModelRendererTurbo(this, 300, 220, this.textureX, this.textureY);
        this.yawFlapModel[2] = new ModelRendererTurbo(this, 325, 220, this.textureX, this.textureY);
        this.yawFlapModel[0].addBox(0.0F, 0.0F, -0.5F, 5, 2, 1, 0.0F);
        this.yawFlapModel[0].setRotationPoint(5.0F, -17.0F, 0.0F);
        this.yawFlapModel[0].rotateAngleX = 3.141593F;
        this.yawFlapModel[0].rotateAngleZ = 1.570796F;
        this.yawFlapModel[1].addShape3D(10.0F, 0.0F, -1.0F, (Shape2D)(new Shape2D(new Coord2D[]{new Coord2D(10.0D, 0.0D, 10, 0), new Coord2D(10.0D, 22.0D, 10, 22), new Coord2D(8.0D, 22.0D, 8, 22), new Coord2D(4.0D, 18.0D, 4, 18), new Coord2D(0.0D, 11.0D, 0, 11), new Coord2D(0.0D, 3.0D, 0, 3)})), 2.0F, 10, 22, 58, 2, 0, new float[]{11.0F, 8.0F, 9.0F, 6.0F, 2.0F, 22.0F});
        this.yawFlapModel[1].setRotationPoint(89.0F, -18.0F, 0.0F);
        this.yawFlapModel[1].rotateAngleY = (float)Math.PI;
        this.yawFlapModel[2].addShape3D(0.0F, 17.0F, -1.0F, (Shape2D)(new Shape2D(new Coord2D[]{new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(5.0D, 5.0D, 5, 5), new Coord2D(0.0D, 5.0D, 0, 5)})), 2.0F, 5, 5, 18, 2, 0, new float[]{5.0F, 5.0F, 8.0F});
        this.yawFlapModel[2].setRotationPoint(89.0F, -18.0F, 0.0F);
        this.yawFlapModel[2].rotateAngleY = (float)Math.PI;
        this.pitchFlapRightModel = new ModelRendererTurbo[2];
        this.pitchFlapRightModel[0] = new ModelRendererTurbo(this, 360, 190, this.textureX, this.textureY);
        this.pitchFlapRightModel[1] = new ModelRendererTurbo(this, 380, 190, this.textureX, this.textureY);
        this.pitchFlapRightModel[0].addShape3D(0.0F, 0.0F, -0.5F, (Shape2D)(new Shape2D(new Coord2D[]{new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(6.0D, 3.0D, 6, 3), new Coord2D(4.0D, 22.0D, 4, 22), new Coord2D(1.0D, 24.0D, 1, 24), new Coord2D(0.0D, 24.0D, 0, 24)})), 1.0F, 6, 24, 56, 1, 0, new float[]{24.0F, 1.0F, 4.0F, 20.0F, 7.0F});
        this.pitchFlapRightModel[0].setRotationPoint(85.0F, -29.5F, -1.0F);
        this.pitchFlapRightModel[0].rotateAngleX = 4.712389F;
        this.pitchFlapRightModel[0].rotateAngleZ = (float)Math.PI;
        this.pitchFlapRightModel[0].rotateAngleY = (float)Math.PI;
        this.pitchFlapRightModel[1].addShape3D(5.0F, 19.0F, -0.5F, (Shape2D)(new Shape2D(new Coord2D[]{new Coord2D(0.0D, 5.0D, 0, 5), new Coord2D(5.0D, 0.0D, 5, 0), new Coord2D(5.0D, 5.0D, 5, 5)})), 1.0F, 5, 5, 18, 1, 0, new float[]{5.0F, 5.0F, 8.0F});
        this.pitchFlapRightModel[1].setRotationPoint(85.0F, -29.5F, -1.0F);
        this.pitchFlapRightModel[1].rotateAngleX = 4.712389F;
        this.pitchFlapRightModel[1].rotateAngleZ = (float)Math.PI;
        this.pitchFlapRightModel[1].rotateAngleY = (float)Math.PI;
        this.pitchFlapLeftModel = new ModelRendererTurbo[2];
        this.pitchFlapLeftModel[0] = new ModelRendererTurbo(this, 360, 220, this.textureX, this.textureY);
        this.pitchFlapLeftModel[1] = new ModelRendererTurbo(this, 380, 220, this.textureX, this.textureY);
        this.pitchFlapLeftModel[0].addShape3D(0.0F, 0.0F, -0.5F, (Shape2D)(new Shape2D(new Coord2D[]{new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(6.0D, 3.0D, 6, 3), new Coord2D(4.0D, 22.0D, 4, 22), new Coord2D(1.0D, 24.0D, 1, 24), new Coord2D(0.0D, 24.0D, 0, 24)})), 1.0F, 6, 24, 56, 1, 0, new float[]{24.0F, 1.0F, 4.0F, 20.0F, 7.0F});
        this.pitchFlapLeftModel[0].setRotationPoint(85.0F, -29.5F, 1.0F);
        this.pitchFlapLeftModel[0].rotateAngleX = (float)Math.PI / 2F;
        this.pitchFlapLeftModel[0].rotateAngleZ = (float)Math.PI;
        this.pitchFlapLeftModel[0].rotateAngleY = (float)Math.PI;
        this.pitchFlapLeftModel[1].addShape3D(5.0F, 19.0F, -0.5F, (Shape2D)(new Shape2D(new Coord2D[]{new Coord2D(0.0D, 5.0D, 0, 5), new Coord2D(5.0D, 0.0D, 5, 0), new Coord2D(5.0D, 5.0D, 5, 5)})), 1.0F, 5, 5, 18, 1, 0, new float[]{5.0F, 5.0F, 8.0F});
        this.pitchFlapLeftModel[1].setRotationPoint(85.0F, -29.5F, 1.0F);
        this.pitchFlapLeftModel[1].rotateAngleX = (float)Math.PI / 2F;
        this.pitchFlapLeftModel[1].rotateAngleZ = (float)Math.PI;
        this.pitchFlapLeftModel[1].rotateAngleY = (float)Math.PI;
        this.pitchFlapLeftWingModel = new ModelRendererTurbo[0];
        this.pitchFlapRightWingModel = new ModelRendererTurbo[0];
        this.topWingModel = new ModelRendererTurbo[0];
        this.translateAll(0, 0, 0);
        this.flipAll();
//        this.collisionBoxes = new CollisionBox[12];
//        this.collisionBoxes[0] = new CollisionBox(0, 19, -20, 0);
//        this.collisionBoxes[1] = new CollisionBox(0, 19, 0, 0);
//        this.collisionBoxes[2] = new CollisionBox(0, 19, 29, 0);
//        this.collisionBoxes[3] = new CollisionBox(0, 20, -40, 3);
//        this.collisionBoxes[4] = new CollisionBox(0, 22, -69, 3);
//        this.collisionBoxes[5] = new CollisionBox(0, 22, -80, 3);
//        this.collisionBoxes[6] = new CollisionBox(-20, 11, 0, 1);
//        this.collisionBoxes[7] = new CollisionBox(-48, 14, 0, 1);
//        this.collisionBoxes[8] = new CollisionBox(-75, 16, 0, 1);
//        this.collisionBoxes[9] = new CollisionBox(20, 11, 0, 2);
//        this.collisionBoxes[10] = new CollisionBox(48, 14, 0, 2);
//        this.collisionBoxes[11] = new CollisionBox(75, 16, 0, 2);
    }

    private ModelRendererTurbo[] makeProp1(int i, int j, int k) {
        ModelRendererTurbo[] prop = new ModelRendererTurbo[]{new ModelRendererTurbo(this, 200, 440, this.textureX, this.textureY), new ModelRendererTurbo(this, 200, 440, this.textureX, this.textureY), new ModelRendererTurbo(this, 200, 440, this.textureX, this.textureY)};
        prop[0].addBox(-1.0F, -23.0F, -3.0F, 1, 23, 3, 0.0F);
        prop[1].addBox(-1.0F, -23.0F, -3.0F, 1, 23, 3, 0.0F);
        prop[2].addBox(-1.0F, -23.0F, -3.0F, 1, 23, 3, 0.0F);
        prop[0].setRotationPoint((float)i, (float)j, (float)k);
        prop[1].setRotationPoint((float)i, (float)j, (float)k);
        prop[2].setRotationPoint((float)i, (float)j, (float)k);
        return prop;
    }
}

