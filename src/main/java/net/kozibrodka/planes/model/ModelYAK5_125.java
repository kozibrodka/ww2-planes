package net.kozibrodka.planes.model;

import net.kozibrodka.tmt.TURBO_MODEL_125.*;

public class ModelYAK5_125 extends ModelPlaneNew {
    int textureX = 512;
    int textureY = 512;

    public ModelYAK5_125() {
        boolean VarGear = true;
        boolean VarDoor = true;
        boolean VarWing = true;
        this.bodyModel = new ModelRendererTurbo[16];
        this.bodyModel[0] = new ModelRendererTurbo(this, 0, 470, this.textureX, this.textureY);
        this.bodyModel[1] = new ModelRendererTurbo(this, 40, 470, this.textureX, this.textureY);
        this.bodyModel[2] = new ModelRendererTurbo(this, 110, 470, this.textureX, this.textureY);
        this.bodyModel[3] = new ModelRendererTurbo(this, 160, 470, this.textureX, this.textureY);
        this.bodyModel[4] = new ModelRendererTurbo(this, 240, 470, this.textureX, this.textureY);
        this.bodyModel[5] = new ModelRendererTurbo(this, 325, 470, this.textureX, this.textureY);
        this.bodyModel[6] = new ModelRendererTurbo(this, 370, 470, this.textureX, this.textureY);
        this.bodyModel[7] = new ModelRendererTurbo(this, 370, 490, this.textureX, this.textureY);
        this.bodyModel[8] = new ModelRendererTurbo(this, 430, 470, this.textureX, this.textureY);
        this.bodyModel[9] = new ModelRendererTurbo(this, 450, 470, this.textureX, this.textureY);
        this.bodyModel[10] = new ModelRendererTurbo(this, 450, 480, this.textureX, this.textureY);
        this.bodyModel[11] = new ModelRendererTurbo(this, 450, 495, this.textureX, this.textureY);
        this.bodyModel[12] = new ModelRendererTurbo(this, 310, 430, this.textureX, this.textureY);
        this.bodyModel[13] = new ModelRendererTurbo(this, 340, 430, this.textureX, this.textureY);
        this.bodyModel[14] = new ModelRendererTurbo(this, 0, 430, this.textureX, this.textureY);
        this.bodyModel[15] = new ModelRendererTurbo(this, 60, 430, this.textureX, this.textureY);
        this.bodyModel[0].addTrapezoid(0.0F, 0.0F, 0.0F, 8, 10, 10, 0.0F, -5.0F, 3);
        this.bodyModel[0].setRotationPoint(-48.0F, -22.0F, -5.0F);
        this.bodyModel[1].addTrapezoid(0.0F, 0.0F, 0.0F, 17, 17, 16, 0.0F, -3.0F, 3);
        this.bodyModel[1].setRotationPoint(-40.0F, -25.0F, -8.0F);
        this.bodyModel[2].addBox(0.0F, 0.0F, 0.0F, 12, 9, 10, 0.0F);
        this.bodyModel[2].setRotationPoint(-35.0F, -17.0F, -5.0F);
        this.bodyModel[3].addBox(0.0F, 0.0F, 0.0F, 23, 17, 16, 0.0F);
        this.bodyModel[3].setRotationPoint(-23.0F, -25.0F, -8.0F);
        this.bodyModel[4].addBox(0.0F, 0.0F, 0.0F, 25, 1, 16, 0.0F);
        this.bodyModel[4].setRotationPoint(0.0F, -9.0F, -8.0F);
        this.bodyModel[5].addBox(0.0F, 0.0F, 0.0F, 5, 25, 16, 0.0F);
        this.bodyModel[5].setRotationPoint(25.0F, -33.0F, -8.0F);
        this.bodyModel[6].addBox(0.0F, 0.0F, 0.0F, 25, 16, 1, 0.0F);
        this.bodyModel[6].setRotationPoint(0.0F, -25.0F, -8.0F);
        this.bodyModel[7].addBox(0.0F, 0.0F, 0.0F, 25, 16, 1, 0.0F);
        this.bodyModel[7].setRotationPoint(0.0F, -25.0F, 7.0F);
        this.bodyModel[8].addBox(0.0F, 0.0F, 0.0F, 1, 12, 8, 0.0F);
        this.bodyModel[8].setRotationPoint(6.0F, -33.0F, -4.0F);
        this.bodyModel[8].rotateAngleZ = -0.7853982F;
        this.bodyModel[9].addBox(0.0F, 0.0F, 0.0F, 19, 1, 8, 0.0F);
        this.bodyModel[9].setRotationPoint(6.0F, -33.0F, -4.0F);
        this.bodyModel[10].addBox(0.0F, 0.0F, 0.0F, 19, 9, 1, 0.0F);
        this.bodyModel[10].setRotationPoint(6.0F, -33.0F, -4.0F);
        this.bodyModel[10].rotateAngleX = -0.4363323F;
        this.bodyModel[11].addBox(0.0F, 0.0F, 0.0F, 19, 1, 9, 0.0F);
        this.bodyModel[11].setRotationPoint(6.0F, -33.0F, 4.0F);
        this.bodyModel[11].rotateAngleX = -1.134464F;
        this.bodyModel[12].addBox(0.0F, 0.0F, 0.0F, 2, 17, 12, 0.0F);
        this.bodyModel[12].setRotationPoint(18.0F, -9.0F, -6.0F);
        this.bodyModel[12].rotateAngleZ = 2.70526F;
        this.bodyModel[13].addBox(0.0F, 0.0F, 0.0F, 6, 5, 4, 0.0F);
        this.bodyModel[13].setRotationPoint(0.0F, -14.0F, -2.0F);
        this.bodyModel[14].addBox(0.0F, 0.0F, 0.0F, 17, 4, 12, 0.0F);
        this.bodyModel[14].setRotationPoint(-2.0F, -8.0F, -6.0F);
        this.bodyModel[15].addBox(0.0F, 0.0F, 0.0F, 4, 10, 12, 0.0F);
        this.bodyModel[15].setRotationPoint(15.0F, -4.0F, -6.0F);
        this.bodyModel[15].rotateAngleZ = 1.989675F;
        if(VarGear) {
        }

        if(VarDoor) {
        }

        if(VarWing) {
        }

        this.tailModel = new ModelRendererTurbo[6];
        this.tailModel[0] = new ModelRendererTurbo(this, 0, 380, this.textureX, this.textureY);
        this.tailModel[1] = new ModelRendererTurbo(this, 0, 340, this.textureX, this.textureY);
        this.tailModel[2] = new ModelRendererTurbo(this, 90, 340, this.textureX, this.textureY);
        this.tailModel[3] = new ModelRendererTurbo(this, 170, 340, this.textureX, this.textureY);
        this.tailModel[4] = new ModelRendererTurbo(this, 110, 430, this.textureX, this.textureY);
        this.tailModel[5] = new ModelRendererTurbo(this, 110, 440, this.textureX, this.textureY);
        this.tailModel[0].addTrapezoid(0.0F, 0.0F, 0.0F, 49, 25, 16, 0.0F, -7.0F, 2);
        this.tailModel[0].setRotationPoint(30.0F, -33.0F, -8.0F);
        this.tailModel[0].setRotationPoint(30.0F, -33.0F, -8.0F);
        this.tailModel[1].addShape3D(0.0F, 0.0F, 0.0F, (Shape2D)(new Shape2D(new Coord2D[]{new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(17.0D, 0.0D, 17, 0), new Coord2D(17.0D, 25.0D, 17, 25), new Coord2D(10.0D, 27.0D, 10, 27), new Coord2D(6.0D, 24.0D, 6, 24), new Coord2D(0.0D, 11.0D, 0, 11)})), 2.0F, 17, 27, 81, 2, 0, new float[]{11.0F, 15.0F, 5.0F, 8.0F, 25.0F, 17.0F});
        this.tailModel[1].setRotationPoint(79.0F, -15.0F, -1.0F);
        this.tailModel[1].rotateAngleY = (float)Math.PI;
        this.tailModel[2].addShape3D(0.0F, 0.0F, 0.0F, (Shape2D)(new Shape2D(new Coord2D[]{new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(14.0D, 0.0D, 14, 0), new Coord2D(14.0D, 27.0D, 14, 27), new Coord2D(11.0D, 26.0D, 11, 26)})), 1.0F, 14, 27, 74, 1, 0, new float[]{29.0F, 4.0F, 27.0F, 14.0F});
        this.tailModel[2].setRotationPoint(79.0F, -23.0F, 1.0F);
        this.tailModel[2].rotateAngleX = (float)Math.PI / 2F;
        this.tailModel[2].rotateAngleY = (float)Math.PI;
        this.tailModel[3].addShape3D(0.0F, 0.0F, 0.0F, (Shape2D)(new Shape2D(new Coord2D[]{new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(14.0D, 0.0D, 14, 0), new Coord2D(14.0D, 27.0D, 14, 27), new Coord2D(11.0D, 26.0D, 11, 26)})), 1.0F, 14, 27, 74, 1, 0, new float[]{29.0F, 4.0F, 27.0F, 14.0F});
        this.tailModel[3].setRotationPoint(79.0F, -23.0F, -1.0F);
        this.tailModel[3].rotateAngleX = 4.712389F;
        this.tailModel[3].rotateAngleY = (float)Math.PI;
        if(VarGear) {
            this.tailModel[4].addBox(0.0F, 0.0F, 0.0F, 4, 4, 1, 0.0F);
            this.tailModel[4].setRotationPoint(79.0F, -14.0F, -0.5F);
            this.tailModel[5].addBox(0.0F, 0.0F, 0.0F, 1, 8, 2, 0.0F);
            this.tailModel[5].setRotationPoint(78.0F, -19.0F, -1.0F);
            this.tailModel[5].rotateAngleZ = 0.3490658F;
        }

        if(VarDoor) {
        }

        if(VarWing) {
        }

        this.rightWingModel = new ModelRendererTurbo[8];
        this.rightWingModel[0] = new ModelRendererTurbo(this, 0, 455, this.textureX, this.textureY);
        this.rightWingModel[1] = new ModelRendererTurbo(this, 250, 340, this.textureX, this.textureY);
        this.rightWingModel[2] = new ModelRendererTurbo(this, 250, 350, this.textureX, this.textureY);
        this.rightWingModel[3] = new ModelRendererTurbo(this, 360, 340, this.textureX, this.textureY);
        this.rightWingModel[4] = new ModelRendererTurbo(this, 130, 430, this.textureX, this.textureY);
        this.rightWingModel[5] = new ModelRendererTurbo(this, 160, 430, this.textureX, this.textureY);
        this.rightWingModel[6] = new ModelRendererTurbo(this, 170, 430, this.textureX, this.textureY);
        this.rightWingModel[7] = new ModelRendererTurbo(this, 200, 430, this.textureX, this.textureY);
        this.rightWingModel[0].addBox(0.0F, 0.0F, 0.0F, 11, 1, 1, 0.0F);
        this.rightWingModel[0].setRotationPoint(-20.0F, -10.0F, -29.0F);
        this.rightWingModel[1].addShape3D(0.0F, 0.0F, 0.0F, (Shape2D)(new Shape2D(new Coord2D[]{new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(47.0D, 0.0D, 47, 0), new Coord2D(43.0D, 6.0D, 43, 6), new Coord2D(4.0D, 6.0D, 4, 6)})), 2.0F, 47, 6, 102, 2, 0, new float[]{8.0F, 39.0F, 8.0F, 47.0F});
        this.rightWingModel[1].setRotationPoint(-19.0F, -8.0F, -8.0F);
        this.rightWingModel[1].rotateAngleX = 4.712389F;
        this.rightWingModel[1].rotateAngleY = (float)Math.PI;
        this.rightWingModel[2].addShape3D(0.0F, 0.0F, 0.0F, (Shape2D)(new Shape2D(new Coord2D[]{new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(39.0D, 0.0D, 39, 0), new Coord2D(36.0D, 15.0D, 36, 15), new Coord2D(2.0D, 15.0D, 2, 15)})), 2.0F, 39, 15, 105, 2, 0, new float[]{16.0F, 34.0F, 16.0F, 39.0F});
        this.rightWingModel[2].setRotationPoint(-15.0F, -8.0F, -14.0F);
        this.rightWingModel[2].rotateAngleX = 4.712389F;
        this.rightWingModel[2].rotateAngleY = (float)Math.PI;
        this.rightWingModel[3].addShape3D(0.0F, 0.0F, 0.0F, (Shape2D)(new Shape2D(new Coord2D[]{new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(34.0D, 0.0D, 34, 0), new Coord2D(22.0D, 44.0D, 22, 44), new Coord2D(18.0D, 48.0D, 18, 48), new Coord2D(10.0D, 50.0D, 10, 50), new Coord2D(6.0D, 46.0D, 6, 46)})), 2.0F, 34, 50, 148, 2, 0, new float[]{47.0F, 6.0F, 9.0F, 6.0F, 46.0F, 34.0F});
        this.rightWingModel[3].setRotationPoint(-13.0F, -8.0F, -29.0F);
        this.rightWingModel[3].rotateAngleX = 4.832389F;
        this.rightWingModel[3].rotateAngleY = (float)Math.PI;
        if(VarGear) {
            this.rightWingModel[4].addBox(0.0F, 0.0F, 0.0F, 10, 10, 2, 0.0F);
            this.rightWingModel[4].setRotationPoint(-16.0F, 0.0F, -28.0F);
            this.rightWingModel[5].addBox(0.0F, 0.0F, 0.0F, 3, 17, 1, 0.0F);
            this.rightWingModel[5].setRotationPoint(-7.0F, -10.0F, -29.0F);
            this.rightWingModel[5].rotateAngleZ = -0.3839724F;
            this.rightWingModel[6].addBox(0.0F, 0.0F, 0.0F, 12, 6, 1, 0.0F);
            this.rightWingModel[6].setRotationPoint(-17.0F, 0.0F, -30.0F);
            this.rightWingModel[7].addBox(0.0F, 0.0F, 0.0F, 5, 11, 1, 0.0F);
            this.rightWingModel[7].setRotationPoint(-8.0F, -10.0F, -30.0F);
            this.rightWingModel[7].rotateAngleZ = -0.3839724F;
        }

        if(VarDoor) {
        }

        if(VarWing) {
        }

        this.leftWingModel = new ModelRendererTurbo[8];
        this.leftWingModel[0] = new ModelRendererTurbo(this, 0, 450, this.textureX, this.textureY);
        this.leftWingModel[1] = new ModelRendererTurbo(this, 0, 280, this.textureX, this.textureY);
        this.leftWingModel[2] = new ModelRendererTurbo(this, 0, 290, this.textureX, this.textureY);
        this.leftWingModel[3] = new ModelRendererTurbo(this, 110, 280, this.textureX, this.textureY);
        this.leftWingModel[4] = new ModelRendererTurbo(this, 220, 430, this.textureX, this.textureY);
        this.leftWingModel[5] = new ModelRendererTurbo(this, 250, 430, this.textureX, this.textureY);
        this.leftWingModel[6] = new ModelRendererTurbo(this, 260, 430, this.textureX, this.textureY);
        this.leftWingModel[7] = new ModelRendererTurbo(this, 290, 430, this.textureX, this.textureY);
        this.leftWingModel[0].addBox(0.0F, 0.0F, 0.0F, 11, 1, 1, 0.0F);
        this.leftWingModel[0].setRotationPoint(-20.0F, -10.0F, 28.0F);
        this.leftWingModel[1].addShape3D(0.0F, 0.0F, 0.0F, (Shape2D)(new Shape2D(new Coord2D[]{new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(47.0D, 0.0D, 47, 0), new Coord2D(43.0D, 6.0D, 43, 6), new Coord2D(4.0D, 6.0D, 4, 6)})), 2.0F, 47, 6, 102, 2, 0, new float[]{8.0F, 39.0F, 8.0F, 47.0F});
        this.leftWingModel[1].setRotationPoint(-19.0F, -10.0F, 8.0F);
        this.leftWingModel[1].rotateAngleX = (float)Math.PI / 2F;
        this.leftWingModel[1].rotateAngleY = (float)Math.PI;
        this.leftWingModel[2].addShape3D(0.0F, 0.0F, 0.0F, (Shape2D)(new Shape2D(new Coord2D[]{new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(39.0D, 0.0D, 39, 0), new Coord2D(36.0D, 15.0D, 36, 15), new Coord2D(2.0D, 15.0D, 2, 15)})), 2.0F, 39, 15, 105, 2, 0, new float[]{16.0F, 34.0F, 16.0F, 39.0F});
        this.leftWingModel[2].setRotationPoint(-15.0F, -10.0F, 14.0F);
        this.leftWingModel[2].rotateAngleX = (float)Math.PI / 2F;
        this.leftWingModel[2].rotateAngleY = (float)Math.PI;
        this.leftWingModel[3].addShape3D(0.0F, 0.0F, 0.0F, (Shape2D)(new Shape2D(new Coord2D[]{new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(34.0D, 0.0D, 34, 0), new Coord2D(28.0D, 46.0D, 28, 46), new Coord2D(24.0D, 50.0D, 24, 50), new Coord2D(16.0D, 48.0D, 16, 48), new Coord2D(12.0D, 44.0D, 12, 44)})), 2.0F, 34, 50, 148, 2, 0, new float[]{46.0F, 6.0F, 9.0F, 6.0F, 47.0F, 34.0F});
        this.leftWingModel[3].setRotationPoint(21.0F, -8.0F, 29.0F);
        this.leftWingModel[3].rotateAngleX = 4.832389F;
        if(VarGear) {
            this.leftWingModel[4].addBox(0.0F, 0.0F, 0.0F, 10, 10, 2, 0.0F);
            this.leftWingModel[4].setRotationPoint(-16.0F, 0.0F, 26.0F);
            this.leftWingModel[5].addBox(0.0F, 0.0F, 0.0F, 3, 17, 1, 0.0F);
            this.leftWingModel[5].setRotationPoint(-7.0F, -10.0F, 28.0F);
            this.leftWingModel[5].rotateAngleZ = -0.3839724F;
            this.leftWingModel[6].addBox(0.0F, 0.0F, 0.0F, 12, 6, 1, 0.0F);
            this.leftWingModel[6].setRotationPoint(-17.0F, 0.0F, 29.0F);
            this.leftWingModel[7].addBox(0.0F, 0.0F, 0.0F, 5, 11, 1, 0.0F);
            this.leftWingModel[7].setRotationPoint(-8.0F, -10.0F, 29.0F);
            this.leftWingModel[7].rotateAngleZ = -0.3839724F;
        }

        if(VarDoor) {
        }

        if(VarWing) {
        }

        this.propellerModels = new ModelRendererTurbo[1][3];
        this.propellerModels[0] = this.makeProp(-42, -17, 0);
        this.yawFlapModel = new ModelRendererTurbo[2];
        this.yawFlapModel[0] = new ModelRendererTurbo(this, 340, 440, this.textureX, this.textureY);
        this.yawFlapModel[1] = new ModelRendererTurbo(this, 0, 240, this.textureX, this.textureY);
        this.yawFlapModel[0].addBox(0.0F, 0.0F, -0.5F, 5, 2, 1, 0.0F);
        this.yawFlapModel[0].setRotationPoint(5.0F, -14.0F, 0.0F);
        this.yawFlapModel[0].rotateAngleX = 3.141593F;
        this.yawFlapModel[0].rotateAngleZ = 1.570796F;
        this.yawFlapModel[1].addShape3D(0.0F, 0.0F, 0.0F, (Shape2D)(new Shape2D(new Coord2D[]{new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(2.0D, 1.0D, 2, 1), new Coord2D(7.0D, 4.0D, 7, 4), new Coord2D(7.0D, 10.0D, 7, 10), new Coord2D(4.0D, 19.0D, 4, 19), new Coord2D(0.0D, 25.0D, 0, 25)})), 2.0F, 7, 25, 58, 2, 0, new float[]{25.0F, 8.0F, 10.0F, 6.0F, 6.0F, 3.0F});
        this.yawFlapModel[1].setRotationPoint(96.0F, -15.0F, -1.0F);
        this.yawFlapModel[1].rotateAngleX = (float)Math.PI;
        this.yawFlapModel[1].rotateAngleZ = (float)Math.PI;
        this.pitchFlapRightModel = new ModelRendererTurbo[1];
        this.pitchFlapRightModel[0] = new ModelRendererTurbo(this, 70, 240, this.textureX, this.textureY);
        this.pitchFlapRightModel[0].addShape3D(0.0F, 0.0F, 0.0F, (Shape2D)(new Shape2D(new Coord2D[]{new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(7.0D, 4.0D, 7, 4), new Coord2D(3.0D, 24.0D, 3, 24), new Coord2D(0.0D, 27.0D, 0, 27)})), 1.0F, 7, 27, 62, 1, 0, new float[]{27.0F, 5.0F, 21.0F, 9.0F});
        this.pitchFlapRightModel[0].setRotationPoint(93.0F, -23.0F, -1.0F);
        this.pitchFlapRightModel[0].rotateAngleX = 4.712389F;
        this.pitchFlapRightModel[0].rotateAngleY = (float)Math.PI;
        this.pitchFlapLeftModel = new ModelRendererTurbo[1];
        this.pitchFlapLeftModel[0] = new ModelRendererTurbo(this, 140, 240, this.textureX, this.textureY);
        this.pitchFlapLeftModel[0].addShape3D(0.0F, 0.0F, 0.0F, (Shape2D)(new Shape2D(new Coord2D[]{new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(7.0D, 4.0D, 7, 4), new Coord2D(3.0D, 24.0D, 3, 24), new Coord2D(0.0D, 27.0D, 0, 27)})), 1.0F, 7, 27, 62, 1, 0, new float[]{27.0F, 5.0F, 21.0F, 9.0F});
        this.pitchFlapLeftModel[0].setRotationPoint(93.0F, -23.0F, 1.0F);
        this.pitchFlapLeftModel[0].rotateAngleX = (float)Math.PI / 2F;
        this.pitchFlapLeftModel[0].rotateAngleY = (float)Math.PI;
        this.pitchFlapLeftWingModel = new ModelRendererTurbo[0];
        this.pitchFlapRightWingModel = new ModelRendererTurbo[0];
        this.topWingModel = new ModelRendererTurbo[0];
        this.translateAll(0, 0, 0);
        this.flipAll();
//        this.collisionBoxes = new CollisionBox[13];
//        this.collisionBoxes[0] = new CollisionBox(0, 18, -25, 0);
//        this.collisionBoxes[1] = new CollisionBox(0, 18, 0, 0);
//        this.collisionBoxes[2] = new CollisionBox(0, 18, 20, 0);
//        this.collisionBoxes[3] = new CollisionBox(0, 18, 40, 0);
//        this.collisionBoxes[4] = new CollisionBox(0, 22, -45, 3);
//        this.collisionBoxes[5] = new CollisionBox(0, 22, -65, 3);
//        this.collisionBoxes[6] = new CollisionBox(0, 25, -85, 3);
//        this.collisionBoxes[7] = new CollisionBox(-20, 10, 0, 1);
//        this.collisionBoxes[8] = new CollisionBox(-48, 12, 0, 1);
//        this.collisionBoxes[9] = new CollisionBox(-75, 15, 0, 1);
//        this.collisionBoxes[10] = new CollisionBox(-20, 10, 0, 2);
//        this.collisionBoxes[11] = new CollisionBox(-48, 12, 0, 2);
//        this.collisionBoxes[12] = new CollisionBox(-75, 15, 0, 2);
    }

    private ModelRendererTurbo[] makeProp(int i, int j, int k) {
        ModelRendererTurbo[] prop = new ModelRendererTurbo[]{new ModelRendererTurbo(this, 100, 430, this.textureX, this.textureY), new ModelRendererTurbo(this, 100, 430, this.textureX, this.textureY), new ModelRendererTurbo(this, 100, 430, this.textureX, this.textureY)};
        prop[0].addBox(-0.0F, -24.0F, -3.0F, 1, 24, 3, 0.0F);
        prop[0].setRotationPoint((float)i, (float)j, (float)k);
        prop[1].addBox(-0.0F, -24.0F, -3.0F, 1, 24, 3, 0.0F);
        prop[1].setRotationPoint((float)i, (float)j, (float)k);
        prop[2].addBox(-0.0F, -24.0F, -3.0F, 1, 24, 3, 0.0F);
        prop[2].setRotationPoint((float)i, (float)j, (float)k);
        return prop;
    }
}

