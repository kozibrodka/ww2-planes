package net.kozibrodka.planes.model;

import net.kozibrodka.tmt.TURBO_MODEL_125.*;

public class ModelME262_125 extends ModelPlaneNew {
    int textureX = 512;
    int textureY = 512;
    boolean VarGear = true;
    boolean VarDoor = true;
    boolean VarWing = true;

    public ModelME262_125() {
        this.bodyModel = new ModelRendererTurbo[21];
        this.bodyModel[0] = new ModelRendererTurbo(this, 0, 460, this.textureX, this.textureY);
        this.bodyModel[1] = new ModelRendererTurbo(this, 100, 460, this.textureX, this.textureY);
        this.bodyModel[2] = new ModelRendererTurbo(this, 190, 460, this.textureX, this.textureY);
        this.bodyModel[3] = new ModelRendererTurbo(this, 0, 400, this.textureX, this.textureY);
        this.bodyModel[4] = new ModelRendererTurbo(this, 80, 400, this.textureX, this.textureY);
        this.bodyModel[5] = new ModelRendererTurbo(this, 150, 400, this.textureX, this.textureY);
        this.bodyModel[6] = new ModelRendererTurbo(this, 230, 400, this.textureX, this.textureY);
        this.bodyModel[7] = new ModelRendererTurbo(this, 230, 430, this.textureX, this.textureY);
        this.bodyModel[8] = new ModelRendererTurbo(this, 300, 480, this.textureX, this.textureY);
        this.bodyModel[9] = new ModelRendererTurbo(this, 320, 480, this.textureX, this.textureY);
        this.bodyModel[10] = new ModelRendererTurbo(this, 320, 490, this.textureX, this.textureY);
        this.bodyModel[11] = new ModelRendererTurbo(this, 370, 480, this.textureX, this.textureY);
        this.bodyModel[12] = new ModelRendererTurbo(this, 370, 495, this.textureX, this.textureY);
        this.bodyModel[13] = new ModelRendererTurbo(this, 80, 430, this.textureX, this.textureY);
        this.bodyModel[14] = new ModelRendererTurbo(this, 0, 330, this.textureX, this.textureY);
        this.bodyModel[15] = new ModelRendererTurbo(this, 30, 330, this.textureX, this.textureY);
        this.bodyModel[16] = new ModelRendererTurbo(this, 40, 330, this.textureX, this.textureY);
        this.bodyModel[17] = new ModelRendererTurbo(this, 60, 330, this.textureX, this.textureY);
        this.bodyModel[18] = new ModelRendererTurbo(this, 70, 330, this.textureX, this.textureY);
        this.bodyModel[19] = new ModelRendererTurbo(this, 90, 330, this.textureX, this.textureY);
        this.bodyModel[20] = new ModelRendererTurbo(this, 0, 345, this.textureX, this.textureY);
        this.bodyModel[0].addTrapezoid(0.0F, 0.0F, 0.0F, 26, 14, 20, 0.0F, -6.0F, 3);
        this.bodyModel[0].setRotationPoint(-53.0F, -27.0F, -10.0F);
        this.bodyModel[1].addTrapezoid(0.0F, 0.0F, 0.0F, 15, 20, 26, 0.0F, -3.0F, 3);
        this.bodyModel[1].setRotationPoint(-27.0F, -30.0F, -13.0F);
        this.bodyModel[2].addBox(0.0F, 0.0F, 0.0F, 12, 20, 26, 0.0F);
        this.bodyModel[2].setRotationPoint(-12.0F, -30.0F, -13.0F);
        this.bodyModel[3].addBox(0.0F, 0.0F, 0.0F, 10, 20, 26, 0.0F);
        this.bodyModel[3].setRotationPoint(0.0F, -30.0F, -13.0F);
        this.bodyModel[4].addBox(0.0F, 0.0F, 0.0F, 16, 1, 16, 0.0F);
        this.bodyModel[4].setRotationPoint(10.0F, -11.0F, -8.0F);
        this.bodyModel[5].addBox(0.0F, 0.0F, 0.0F, 12, 20, 26, 0.0F);
        this.bodyModel[5].setRotationPoint(26.0F, -30.0F, -13.0F);
        this.bodyModel[6].addBox(0.0F, 0.0F, 0.0F, 16, 20, 5, 0.0F);
        this.bodyModel[6].setRotationPoint(10.0F, -30.0F, -13.0F);
        this.bodyModel[7].addBox(0.0F, 0.0F, 0.0F, 16, 20, 5, 0.0F);
        this.bodyModel[7].setRotationPoint(10.0F, -30.0F, 8.0F);
        this.bodyModel[8].addBox(0.0F, 0.0F, 0.0F, 1, 12, 8, 0.0F);
        this.bodyModel[8].setRotationPoint(10.0F, -37.0F, -4.0F);
        this.bodyModel[8].rotateAngleZ = -0.9424778F;
        this.bodyModel[9].addBox(0.0F, 0.0F, 0.0F, 16, 1, 8, 0.0F);
        this.bodyModel[9].setRotationPoint(10.0F, -37.0F, -4.0F);
        this.bodyModel[10].addBox(0.0F, 0.0F, 0.0F, 14, 1, 8, 0.0F);
        this.bodyModel[10].setRotationPoint(26.0F, -37.0F, -4.0F);
        this.bodyModel[10].rotateAngleZ = -0.5235988F;
        this.bodyModel[11].addBox(0.0F, 0.0F, 0.0F, 16, 10, 1, 0.0F);
        this.bodyModel[11].setRotationPoint(10.0F, -37.0F, -4.0F);
        this.bodyModel[11].rotateAngleX = -0.6806784F;
        this.bodyModel[12].addBox(0.0F, 0.0F, 0.0F, 16, 1, 10, 0.0F);
        this.bodyModel[12].setRotationPoint(10.0F, -37.0F, 4.0F);
        this.bodyModel[12].rotateAngleX = -0.8901179F;
        this.bodyModel[13].addBox(0.0F, 0.0F, 0.0F, 6, 7, 4, 0.0F);
        this.bodyModel[13].setRotationPoint(10.0F, -18.0F, -2.0F);
        if(this.VarGear) {
            this.bodyModel[14].addBox(0.0F, 0.0F, 0.0F, 8, 8, 3, 0.0F);
            this.bodyModel[14].setRotationPoint(-48.0F, 2.0F, -1.5F);
            this.bodyModel[15].addBox(0.0F, 0.0F, 0.0F, 2, 6, 1, 0.0F);
            this.bodyModel[15].setRotationPoint(-45.0F, 1.0F, -2.5F);
            this.bodyModel[16].addBox(0.0F, 0.0F, 0.0F, 2, 2, 4, 0.0F);
            this.bodyModel[16].setRotationPoint(-45.0F, -1.0F, -2.5F);
            this.bodyModel[17].addBox(0.0F, 0.0F, 0.0F, 1, 19, 2, 0.0F);
            this.bodyModel[17].setRotationPoint(-39.0F, -18.0F, -1.0F);
            this.bodyModel[17].rotateAngleZ = -0.3141593F;
            this.bodyModel[18].addBox(0.0F, 0.0F, 0.0F, 1, 10, 6, 0.0F);
            this.bodyModel[18].setRotationPoint(-40.0F, -18.0F, -3.0F);
            this.bodyModel[18].rotateAngleZ = -0.3141593F;
            this.bodyModel[19].addBox(0.0F, 0.0F, 0.0F, 1, 13, 2, 0.0F);
            this.bodyModel[19].setRotationPoint(-33.0F, -18.0F, -1.0F);
            this.bodyModel[19].rotateAngleZ = -0.7679449F;
            this.bodyModel[20].addBox(0.0F, 0.0F, 0.0F, 15, 9, 1, 0.0F);
            this.bodyModel[20].setRotationPoint(-27.0F, -14.0F, 4.0F);
        }

        if(this.VarDoor) {
        }

        if(this.VarWing) {
        }

        this.tailModel = new ModelRendererTurbo[6];
        this.tailModel[0] = new ModelRendererTurbo(this, 280, 400, this.textureX, this.textureY);
        this.tailModel[1] = new ModelRendererTurbo(this, 280, 450, this.textureX, this.textureY);
        this.tailModel[2] = new ModelRendererTurbo(this, 0, 280, this.textureX, this.textureY);
        this.tailModel[3] = new ModelRendererTurbo(this, 100, 280, this.textureX, this.textureY);
        this.tailModel[4] = new ModelRendererTurbo(this, 210, 280, this.textureX, this.textureY);
        this.tailModel[5] = new ModelRendererTurbo(this, 300, 280, this.textureX, this.textureY);
        this.tailModel[0].addTrapezoid(0.0F, 0.0F, 0.0F, 42, 20, 26, 0.0F, -6.0F, 2);
        this.tailModel[0].setRotationPoint(38.0F, -30.0F, -13.0F);
        this.tailModel[1].addTrapezoid(0.0F, 0.0F, 0.0F, 42, 8, 14, 0.0F, -4.0F, 2);
        this.tailModel[1].setRotationPoint(80.0F, -24.0F, -7.0F);
        this.tailModel[2].addShape3D(0.0F, 0.0F, 0.0F, (Shape2D)(new Shape2D(new Coord2D[]{new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(44.0D, 0.0D, 44, 0), new Coord2D(43.0D, 4.0D, 43, 4), new Coord2D(4.0D, 4.0D, 4, 4)})), 2.0F, 44, 4, 94, 2, 0, new float[]{6.0F, 39.0F, 5.0F, 44.0F});
        this.tailModel[2].setRotationPoint(78.0F, -20.0F, -1.0F);
        this.tailModel[2].rotateAngleY = (float)Math.PI;
        this.tailModel[3].addShape3D(0.0F, 0.0F, 0.0F, (Shape2D)(new Shape2D(new Coord2D[]{new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(31.0D, 0.0D, 31, 0), new Coord2D(31.0D, 27.0D, 31, 27), new Coord2D(28.0D, 26.0D, 28, 26)})), 2.0F, 31, 27, 101, 2, 0, new float[]{39.0F, 4.0F, 27.0F, 31.0F});
        this.tailModel[3].setRotationPoint(82.0F, -24.0F, -1.0F);
        this.tailModel[3].rotateAngleY = (float)Math.PI;
        this.tailModel[4].addShape3D(0.0F, 0.0F, 0.0F, (Shape2D)(new Shape2D(new Coord2D[]{new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(18.0D, 0.0D, 18, 0), new Coord2D(18.0D, 28.0D, 18, 28), new Coord2D(16.0D, 28.0D, 16, 28), new Coord2D(13.0D, 26.0D, 13, 26)})), 1.0F, 18, 28, 82, 1, 0, new float[]{30.0F, 4.0F, 2.0F, 28.0F, 18.0F});
        this.tailModel[4].setRotationPoint(92.0F, -30.0F, -1.0F);
        this.tailModel[4].rotateAngleX = (float)Math.PI / 2F;
        this.tailModel[4].rotateAngleZ = (float)Math.PI;
        this.tailModel[5].addShape3D(0.0F, 0.0F, 0.0F, (Shape2D)(new Shape2D(new Coord2D[]{new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(18.0D, 0.0D, 18, 0), new Coord2D(18.0D, 28.0D, 18, 28), new Coord2D(16.0D, 28.0D, 16, 28), new Coord2D(13.0D, 26.0D, 13, 26)})), 1.0F, 18, 28, 82, 1, 0, new float[]{30.0F, 4.0F, 2.0F, 28.0F, 18.0F});
        this.tailModel[5].rotateAngleX = 4.712389F;
        this.tailModel[5].rotateAngleZ = (float)Math.PI;
        this.tailModel[5].setRotationPoint(92.0F, -31.0F, 1.0F);
        if(this.VarGear) {
        }

        if(this.VarDoor) {
        }

        if(this.VarWing) {
        }

        this.rightWingModel = new ModelRendererTurbo[10];
        this.rightWingModel[0] = new ModelRendererTurbo(this, 0, 360, this.textureX, this.textureY);
        this.rightWingModel[1] = new ModelRendererTurbo(this, 50, 360, this.textureX, this.textureY);
        this.rightWingModel[2] = new ModelRendererTurbo(this, 170, 360, this.textureX, this.textureY);
        this.rightWingModel[3] = new ModelRendererTurbo(this, 220, 360, this.textureX, this.textureY);
        this.rightWingModel[4] = new ModelRendererTurbo(this, 0, 180, this.textureX, this.textureY);
        this.rightWingModel[5] = new ModelRendererTurbo(this, 100, 180, this.textureX, this.textureY);
        this.rightWingModel[6] = new ModelRendererTurbo(this, 100, 330, this.textureX, this.textureY);
        this.rightWingModel[7] = new ModelRendererTurbo(this, 130, 330, this.textureX, this.textureY);
        this.rightWingModel[8] = new ModelRendererTurbo(this, 100, 350, this.textureX, this.textureY);
        this.rightWingModel[9] = new ModelRendererTurbo(this, 140, 330, this.textureX, this.textureY);
        this.rightWingModel[0].addTrapezoid(0.0F, 0.0F, 0.0F, 8, 14, 14, 0.0F, -2.0F, 3);
        this.rightWingModel[0].setRotationPoint(-20.0F, -14.0F, -44.0F);
        this.rightWingModel[1].addBox(0.0F, 0.0F, 0.0F, 43, 14, 14, 0.0F);
        this.rightWingModel[1].setRotationPoint(-12.0F, -14.0F, -44.0F);
        this.rightWingModel[2].addTrapezoid(0.0F, 0.0F, 0.0F, 10, 14, 14, 0.0F, -3.0F, 2);
        this.rightWingModel[2].setRotationPoint(31.0F, -14.0F, -44.0F);
        this.rightWingModel[3].addTrapezoid(0.0F, 0.0F, 0.0F, 3, 2, 2, 0.0F, -1.0F, 2);
        this.rightWingModel[3].setRotationPoint(41.0F, -8.0F, -38.0F);
        this.rightWingModel[4].addShape3D(0.0F, 0.0F, 0.0F, (Shape2D)(new Shape2D(new Coord2D[]{new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(37.0D, 0.0D, 37, 0), new Coord2D(37.0D, 32.0D, 37, 32), new Coord2D(44.0D, 86.0D, 44, 86), new Coord2D(34.0D, 90.0D, 34, 90), new Coord2D(29.0D, 88.0D, 29, 88)})), 2.0F, 44, 90, 234, 2, 0, new float[]{93.0F, 6.0F, 11.0F, 55.0F, 32.0F, 37.0F});
        this.rightWingModel[4].setRotationPoint(-6.0F, -11.0F, -12.0F);
        this.rightWingModel[4].rotateAngleX = 1.6406094F;
        this.rightWingModel[4].rotateAngleZ = (float)Math.PI;
        this.rightWingModel[5].addShape3D(0.0F, 0.0F, 0.0F, (Shape2D)(new Shape2D(new Coord2D[]{new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(5.0D, 0.0D, 5, 0), new Coord2D(0.0D, 18.0D, 0, 18)})), 2.0F, 5, 18, 42, 2, 0, new float[]{18.0F, 19.0F, 5.0F});
        this.rightWingModel[5].setRotationPoint(31.0F, -11.0F, -12.0F);
        this.rightWingModel[5].rotateAngleX = 1.6406094F;
        this.rightWingModel[5].rotateAngleZ = (float)Math.PI;
        if(this.VarGear) {
            this.rightWingModel[6].addBox(0.0F, 0.0F, 0.0F, 11, 11, 3, 0.0F);
            this.rightWingModel[6].setRotationPoint(11.0F, -1.0F, -26.0F);
            this.rightWingModel[7].addBox(0.0F, 0.0F, 0.0F, 3, 20, 1, 0.0F);
            this.rightWingModel[7].setRotationPoint(11.0F, -13.0F, -27.0F);
            this.rightWingModel[7].rotateAngleZ = 0.2094395F;
            this.rightWingModel[8].addBox(0.0F, 0.0F, 0.0F, 13, 6, 1, 0.0F);
            this.rightWingModel[8].setRotationPoint(10.0F, -1.0F, -28.0F);
            this.rightWingModel[9].addBox(0.0F, 0.0F, 0.0F, 5, 11, 1, 0.0F);
            this.rightWingModel[9].setRotationPoint(11.0F, -13.0F, -28.0F);
            this.rightWingModel[9].rotateAngleX = -0.1396263F;
        }

        if(this.VarDoor) {
        }

        if(this.VarWing) {
        }

        this.leftWingModel = new ModelRendererTurbo[10];
        this.leftWingModel[0] = new ModelRendererTurbo(this, 240, 360, this.textureX, this.textureY);
        this.leftWingModel[1] = new ModelRendererTurbo(this, 290, 360, this.textureX, this.textureY);
        this.leftWingModel[2] = new ModelRendererTurbo(this, 410, 360, this.textureX, this.textureY);
        this.leftWingModel[3] = new ModelRendererTurbo(this, 460, 360, this.textureX, this.textureY);
        this.leftWingModel[4] = new ModelRendererTurbo(this, 240, 180, this.textureX, this.textureY);
        this.leftWingModel[5] = new ModelRendererTurbo(this, 340, 180, this.textureX, this.textureY);
        this.leftWingModel[6] = new ModelRendererTurbo(this, 160, 330, this.textureX, this.textureY);
        this.leftWingModel[7] = new ModelRendererTurbo(this, 190, 330, this.textureX, this.textureY);
        this.leftWingModel[8] = new ModelRendererTurbo(this, 160, 350, this.textureX, this.textureY);
        this.leftWingModel[9] = new ModelRendererTurbo(this, 200, 330, this.textureX, this.textureY);
        this.leftWingModel[0].addTrapezoid(0.0F, 0.0F, 0.0F, 8, 14, 14, 0.0F, -2.0F, 3);
        this.leftWingModel[0].setRotationPoint(-20.0F, -14.0F, 30.0F);
        this.leftWingModel[1].addBox(0.0F, 0.0F, 0.0F, 43, 14, 14, 0.0F);
        this.leftWingModel[1].setRotationPoint(-12.0F, -14.0F, 30.0F);
        this.leftWingModel[2].addTrapezoid(0.0F, 0.0F, 0.0F, 10, 14, 14, 0.0F, -3.0F, 2);
        this.leftWingModel[2].setRotationPoint(31.0F, -14.0F, 30.0F);
        this.leftWingModel[3].addTrapezoid(0.0F, 0.0F, 0.0F, 3, 2, 2, 0.0F, -1.0F, 2);
        this.leftWingModel[3].setRotationPoint(41.0F, -8.0F, 36.0F);
        this.leftWingModel[4].addShape3D(0.0F, 0.0F, 0.0F, (Shape2D)(new Shape2D(new Coord2D[]{new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(37.0D, 0.0D, 37, 0), new Coord2D(37.0D, 32.0D, 37, 32), new Coord2D(44.0D, 86.0D, 44, 86), new Coord2D(34.0D, 90.0D, 34, 90), new Coord2D(29.0D, 88.0D, 29, 88)})), 2.0F, 44, 90, 234, 2, 0, new float[]{93.0F, 6.0F, 11.0F, 55.0F, 32.0F, 37.0F});
        this.leftWingModel[4].setRotationPoint(-6.0F, -13.0F, 12.0F);
        this.leftWingModel[4].rotateAngleX = 4.642576F;
        this.leftWingModel[4].rotateAngleZ = (float)Math.PI;
        this.leftWingModel[5].addShape3D(0.0F, 0.0F, 0.0F, (Shape2D)(new Shape2D(new Coord2D[]{new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(5.0D, 0.0D, 5, 0), new Coord2D(0.0D, 18.0D, 0, 18)})), 2.0F, 5, 18, 42, 2, 0, new float[]{18.0F, 19.0F, 5.0F});
        this.leftWingModel[5].setRotationPoint(31.0F, -13.0F, 12.0F);
        this.leftWingModel[5].rotateAngleX = 4.642576F;
        this.leftWingModel[5].rotateAngleZ = (float)Math.PI;
        if(this.VarGear) {
            this.leftWingModel[6].addBox(0.0F, 0.0F, 0.0F, 11, 11, 3, 0.0F);
            this.leftWingModel[6].setRotationPoint(11.0F, -1.0F, 23.0F);
            this.leftWingModel[7].addBox(0.0F, 0.0F, 0.0F, 3, 20, 1, 0.0F);
            this.leftWingModel[7].setRotationPoint(11.0F, -13.0F, 26.0F);
            this.leftWingModel[7].rotateAngleZ = 0.2094395F;
            this.leftWingModel[8].addBox(0.0F, 0.0F, 0.0F, 13, 6, 1, 0.0F);
            this.leftWingModel[8].setRotationPoint(10.0F, -1.0F, 27.0F);
            this.leftWingModel[9].addBox(0.0F, 0.0F, 0.0F, 5, 11, 1, 0.0F);
            this.leftWingModel[9].setRotationPoint(16.0F, -13.0F, 28.0F);
            this.leftWingModel[9].rotateAngleX = -0.1396263F;
            this.leftWingModel[9].rotateAngleY = 3.141593F;
        }

        if(this.VarDoor) {
        }

        if(this.VarWing) {
        }

        this.propellerModels = new ModelRendererTurbo[0][0];
        this.yawFlapModel = new ModelRendererTurbo[2];
        this.yawFlapModel[0] = new ModelRendererTurbo(this, 110, 430, this.textureX, this.textureY);
        this.yawFlapModel[1] = new ModelRendererTurbo(this, 0, 130, this.textureX, this.textureY);
        this.yawFlapModel[0].addBox(0.0F, 0.0F, -0.5F, 5, 2, 1, 0.0F);
        this.yawFlapModel[0].setRotationPoint(15.0F, -18.0F, 0.0F);
        this.yawFlapModel[0].rotateAngleX = 3.141593F;
        this.yawFlapModel[0].rotateAngleZ = 1.570796F;
        this.yawFlapModel[1].addShape3D(0.0F, 0.0F, 0.0F, (Shape2D)(new Shape2D(new Coord2D[]{new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(8.0D, 0.0D, 8, 0), new Coord2D(5.0D, 25.0D, 5, 25), new Coord2D(0.0D, 27.0D, 0, 27)})), 2.0F, 8, 27, 67, 2, 0, new float[]{27.0F, 6.0F, 26.0F, 8.0F});
        this.yawFlapModel[1].setRotationPoint(113.0F, -24.0F, -1.0F);
        this.yawFlapModel[1].rotateAngleY = (float)Math.PI;
        this.yawFlapModel[1].rotateAngleX = (float)Math.PI;
        this.yawFlapModel[1].rotateAngleZ = (float)Math.PI;
        this.pitchFlapRightModel = new ModelRendererTurbo[1];
        this.pitchFlapRightModel[0] = new ModelRendererTurbo(this, 75, 130, this.textureX, this.textureY);
        this.pitchFlapRightModel[0].addShape3D(0.0F, 0.0F, 0.0F, (Shape2D)(new Shape2D(new Coord2D[]{new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(7.0D, 2.0D, 7, 2), new Coord2D(5.0D, 26.0D, 5, 26), new Coord2D(0.0D, 28.0D, 0, 28)})), 1.0F, 7, 28, 67, 1, 0, new float[]{28.0F, 6.0F, 25.0F, 8.0F});
        this.pitchFlapRightModel[0].setRotationPoint(110.0F, -30.0F, -1.0F);
        this.pitchFlapRightModel[0].rotateAngleX = 4.712389F;
        this.pitchFlapRightModel[0].rotateAngleZ = (float)Math.PI;
        this.pitchFlapRightModel[0].rotateAngleY = (float)Math.PI;
        this.pitchFlapLeftModel = new ModelRendererTurbo[1];
        this.pitchFlapLeftModel[0] = new ModelRendererTurbo(this, 150, 130, this.textureX, this.textureY);
        this.pitchFlapLeftModel[0].addShape3D(0.0F, 0.0F, 0.0F, (Shape2D)(new Shape2D(new Coord2D[]{new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(7.0D, 2.0D, 7, 2), new Coord2D(5.0D, 26.0D, 5, 26), new Coord2D(0.0D, 28.0D, 0, 28)})), 1.0F, 7, 28, 67, 1, 0, new float[]{28.0F, 6.0F, 25.0F, 8.0F});
        this.pitchFlapLeftModel[0].setRotationPoint(110.0F, -31.0F, 1.0F);
        this.pitchFlapLeftModel[0].rotateAngleX = (float)Math.PI / 2F;
        this.pitchFlapLeftModel[0].rotateAngleZ = (float)Math.PI;
        this.pitchFlapLeftModel[0].rotateAngleY = (float)Math.PI;
        this.pitchFlapLeftWingModel = new ModelRendererTurbo[0];
        this.pitchFlapRightWingModel = new ModelRendererTurbo[0];
        this.topWingModel = new ModelRendererTurbo[0];
        this.translateAll(0, 0, 0);
        this.flipAll();
//        this.collisionBoxes = new CollisionBox[14];
//        this.collisionBoxes[0] = new CollisionBox(0, 20, -20, 0);
//        this.collisionBoxes[1] = new CollisionBox(0, 20, 0, 0);
//        this.collisionBoxes[2] = new CollisionBox(0, 20, 20, 0);
//        this.collisionBoxes[3] = new CollisionBox(0, 20, 40, 0);
//        this.collisionBoxes[4] = new CollisionBox(0, 20, -40, 3);
//        this.collisionBoxes[5] = new CollisionBox(0, 20, -60, 3);
//        this.collisionBoxes[6] = new CollisionBox(0, 20, -80, 3);
//        this.collisionBoxes[7] = new CollisionBox(0, 30, -115, 3);
//        this.collisionBoxes[8] = new CollisionBox(-37, 14, -8, 1);
//        this.collisionBoxes[9] = new CollisionBox(-66, 17, -19, 1);
//        this.collisionBoxes[10] = new CollisionBox(-95, 19, -28, 1);
//        this.collisionBoxes[11] = new CollisionBox(37, 14, -8, 2);
//        this.collisionBoxes[12] = new CollisionBox(66, 17, -19, 2);
//        this.collisionBoxes[13] = new CollisionBox(95, 19, -28, 2);
    }

    private ModelRendererTurbo[] makeProp(int i, int j, int k) {
        ModelRendererTurbo[] prop = new ModelRendererTurbo[0];
        return prop;
    }
}

