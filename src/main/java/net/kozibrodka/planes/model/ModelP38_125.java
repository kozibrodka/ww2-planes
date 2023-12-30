package net.kozibrodka.planes.model;

import net.kozibrodka.tmt.TURBO_MODEL_125.*;

public class ModelP38_125 extends ModelPlaneNew {
    int textureX = 512;
    int textureY = 512;
    boolean VarGear = true;
    boolean VarDoor = true;
    boolean VarWing = true;

    public ModelP38_125() {
        this.bodyModel = new ModelRendererTurbo[23];
        this.bodyModel[0] = new ModelRendererTurbo(this, 0, 470, this.textureX, this.textureY);
        this.bodyModel[1] = new ModelRendererTurbo(this, 80, 470, this.textureX, this.textureY);
        this.bodyModel[2] = new ModelRendererTurbo(this, 160, 470, this.textureX, this.textureY);
        this.bodyModel[3] = new ModelRendererTurbo(this, 160, 490, this.textureX, this.textureY);
        this.bodyModel[4] = new ModelRendererTurbo(this, 210, 470, this.textureX, this.textureY);
        this.bodyModel[5] = new ModelRendererTurbo(this, 290, 470, this.textureX, this.textureY);
        this.bodyModel[6] = new ModelRendererTurbo(this, 310, 470, this.textureX, this.textureY);
        this.bodyModel[7] = new ModelRendererTurbo(this, 310, 485, this.textureX, this.textureY);
        this.bodyModel[8] = new ModelRendererTurbo(this, 310, 500, this.textureX, this.textureY);
        this.bodyModel[9] = new ModelRendererTurbo(this, 270, 500, this.textureX, this.textureY);
        this.bodyModel[10] = new ModelRendererTurbo(this, 370, 470, this.textureX, this.textureY);
        this.bodyModel[11] = new ModelRendererTurbo(this, 270, 450, this.textureX, this.textureY);
        this.bodyModel[12] = new ModelRendererTurbo(this, 270, 430, this.textureX, this.textureY);
        this.bodyModel[13] = new ModelRendererTurbo(this, 0, 430, this.textureX, this.textureY);
        this.bodyModel[14] = new ModelRendererTurbo(this, 50, 430, this.textureX, this.textureY);
        this.bodyModel[15] = new ModelRendererTurbo(this, 200, 270, this.textureX, this.textureY);
        this.bodyModel[16] = new ModelRendererTurbo(this, 230, 270, this.textureX, this.textureY);
        this.bodyModel[17] = new ModelRendererTurbo(this, 240, 270, this.textureX, this.textureY);
        this.bodyModel[18] = new ModelRendererTurbo(this, 255, 270, this.textureX, this.textureY);
        this.bodyModel[19] = new ModelRendererTurbo(this, 265, 270, this.textureX, this.textureY);
        this.bodyModel[20] = new ModelRendererTurbo(this, 280, 270, this.textureX, this.textureY);
        this.bodyModel[21] = new ModelRendererTurbo(this, 330, 270, this.textureX, this.textureY);
        this.bodyModel[22] = new ModelRendererTurbo(this, 330, 270, this.textureX, this.textureY);
        this.bodyModel[0].addTrapezoid(0.0F, 0.0F, 0.0F, 22, 18, 14, 0.0F, -6.0F, 3);
        this.bodyModel[0].setRotationPoint(-56.0F, -29.0F, -7.0F);
        this.bodyModel[1].addTrapezoid(0.0F, 0.0F, 0.0F, 22, 20, 16, 0.0F, -1.0F, 3);
        this.bodyModel[1].setRotationPoint(-34.0F, -30.0F, -8.0F);
        this.bodyModel[2].addBox(0.0F, 0.0F, 0.0F, 22, 17, 1, 0.0F);
        this.bodyModel[2].setRotationPoint(-12.0F, -30.0F, -8.0F);
        this.bodyModel[3].addBox(0.0F, 0.0F, 0.0F, 22, 17, 1, 0.0F);
        this.bodyModel[3].setRotationPoint(-12.0F, -30.0F, 7.0F);
        this.bodyModel[4].addBox(0.0F, 0.0F, 0.0F, 22, 3, 16, 0.0F);
        this.bodyModel[4].setRotationPoint(-12.0F, -13.0F, -8.0F);
        this.bodyModel[5].addBox(0.0F, 0.0F, 0.0F, 1, 18, 8, 0.0F);
        this.bodyModel[5].setRotationPoint(-9.0F, -37.0F, -4.0F);
        this.bodyModel[5].rotateAngleZ = -1.012291F;
        this.bodyModel[6].addBox(0.0F, 0.0F, 0.0F, 16, 1, 8, 0.0F);
        this.bodyModel[6].setRotationPoint(-9.0F, -37.0F, -4.0F);
        this.bodyModel[7].addBox(0.0F, 0.0F, 0.0F, 18, 1, 8, 0.0F);
        this.bodyModel[7].setRotationPoint(7.0F, -37.0F, -4.0F);
        this.bodyModel[7].rotateAngleZ = -0.6283185F;
        this.bodyModel[8].addBox(0.0F, 0.0F, 0.0F, 16, 1, 8, 0.0F);
        this.bodyModel[8].setRotationPoint(-9.0F, -37.0F, 4.0F);
        this.bodyModel[8].rotateAngleX = -1.047198F;
        this.bodyModel[9].addBox(0.0F, 0.0F, 0.0F, 16, 8, 1, 0.0F);
        this.bodyModel[9].setRotationPoint(-9.0F, -37.0F, -4.0F);
        this.bodyModel[9].rotateAngleX = -0.5235988F;
        this.bodyModel[10].addBox(0.0F, 0.0F, 0.0F, 29, 2, 16, 0.0F);
        this.bodyModel[10].setRotationPoint(10.0F, -23.0F, -8.0F);
        this.bodyModel[11].addBox(0.0F, 0.0F, 0.0F, 6, 5, 4, 0.0F);
        this.bodyModel[11].setRotationPoint(-12.0F, -18.0F, -2.0F);
        this.bodyModel[12].addBox(0.0F, 0.0F, 0.0F, 20, 2, 12, 0.0F);
        this.bodyModel[12].setRotationPoint(0.0F, -13.0F, -6.0F);
        this.bodyModel[12].rotateAngleZ = 1.22173F;
        this.bodyModel[13].addTrapezoid(0.0F, 0.0F, 0.0F, 5, 20, 16, 0.0F, -1.0F, 2);
        this.bodyModel[13].setRotationPoint(10.0F, -30.0F, -8.0F);
        this.bodyModel[14].addTrapezoid(0.0F, 0.0F, 0.0F, 24, 18, 14, 0.0F, -6.0F, 2);
        this.bodyModel[14].setRotationPoint(15.0F, -29.0F, -7.0F);
        this.bodyModel[21].addBox(0.0F, 0.0F, 0.0F, 20, 1, 1, 0.0F);
        this.bodyModel[21].setRotationPoint(-52.0F, -26.0F, 1.0F);
        this.bodyModel[22].addBox(0.0F, 0.0F, 0.0F, 20, 1, 1, 0.0F);
        this.bodyModel[22].setRotationPoint(-52.0F, -26.0F, -2.0F);
        if(this.VarGear) {
            this.bodyModel[15].addBox(0.0F, 0.0F, 0.0F, 10, 10, 3, 0.0F);
            this.bodyModel[15].setRotationPoint(-42.0F, 0.0F, -1.5F);
            this.bodyModel[16].addBox(0.0F, 0.0F, 0.0F, 2, 10, 1, 0.0F);
            this.bodyModel[16].setRotationPoint(-36.0F, -3.0F, -2.5F);
            this.bodyModel[16].rotateAngleZ = -0.2094395F;
            this.bodyModel[17].addBox(0.0F, 0.0F, 0.0F, 2, 15, 3, 0.0F);
            this.bodyModel[17].setRotationPoint(-33.0F, -16.0F, -1.5F);
            this.bodyModel[17].rotateAngleZ = -0.2094395F;
            this.bodyModel[18].addBox(0.0F, 0.0F, 0.0F, 2, 15, 2, 0.0F);
            this.bodyModel[18].setRotationPoint(-25.0F, -16.0F, -1.0F);
            this.bodyModel[18].rotateAngleZ = -0.7330383F;
            this.bodyModel[19].addBox(0.0F, 0.0F, 0.0F, 1, 12, 6, 0.0F);
            this.bodyModel[19].setRotationPoint(-34.0F, -16.0F, -3.0F);
            this.bodyModel[19].rotateAngleZ = -0.2094395F;
            this.bodyModel[20].addBox(0.0F, 0.0F, 0.0F, 20, 8, 1, 0.0F);
            this.bodyModel[20].setRotationPoint(-28.0F, -12.0F, 4.0F);
        }

        if(this.VarDoor) {
        }

        if(this.VarWing) {
        }

        this.tailModel = new ModelRendererTurbo[15];
        this.tailModel[0] = new ModelRendererTurbo(this, 355, 390, this.textureX, this.textureY);
        this.tailModel[1] = new ModelRendererTurbo(this, 355, 420, this.textureX, this.textureY);
        this.tailModel[2] = new ModelRendererTurbo(this, 130, 430, this.textureX, this.textureY);
        this.tailModel[3] = new ModelRendererTurbo(this, 355, 350, this.textureX, this.textureY);
        this.tailModel[4] = new ModelRendererTurbo(this, 355, 380, this.textureX, this.textureY);
        this.tailModel[5] = new ModelRendererTurbo(this, 200, 430, this.textureX, this.textureY);
        this.tailModel[6] = new ModelRendererTurbo(this, 0, 300, this.textureX, this.textureY);
        this.tailModel[7] = new ModelRendererTurbo(this, 0, 270, this.textureX, this.textureY);
        this.tailModel[8] = new ModelRendererTurbo(this, 0, 320, this.textureX, this.textureY);
        this.tailModel[9] = new ModelRendererTurbo(this, 0, 230, this.textureX, this.textureY);
        this.tailModel[10] = new ModelRendererTurbo(this, 60, 230, this.textureX, this.textureY);
        this.tailModel[11] = new ModelRendererTurbo(this, 120, 230, this.textureX, this.textureY);
        this.tailModel[12] = new ModelRendererTurbo(this, 190, 230, this.textureX, this.textureY);
        this.tailModel[13] = new ModelRendererTurbo(this, 260, 230, this.textureX, this.textureY);
        this.tailModel[14] = new ModelRendererTurbo(this, 330, 230, this.textureX, this.textureY);
        this.tailModel[0].addTrapezoid(0.0F, 0.0F, 0.0F, 54, 14, 8, 0.0F, -4.0F, 2);
        this.tailModel[0].setRotationPoint(53.0F, -28.0F, -43.0F);
        this.tailModel[1].addBox(0.0F, 0.0F, 0.0F, 45, 6, 1, 0.0F);
        this.tailModel[1].setRotationPoint(87.0F, -24.0F, -39.5F);
        this.tailModel[2].addTrapezoid(0.0F, 0.0F, 0.0F, 18, 12, 12, 0.0F, -1.0F, 2);
        this.tailModel[2].setRotationPoint(53.0F, -27.0F, -45.0F);
        this.tailModel[3].addTrapezoid(0.0F, 0.0F, 0.0F, 54, 14, 8, 0.0F, -4.0F, 2);
        this.tailModel[3].setRotationPoint(53.0F, -28.0F, 35.0F);
        this.tailModel[4].addBox(0.0F, 0.0F, 0.0F, 45, 6, 1, 0.0F);
        this.tailModel[4].setRotationPoint(87.0F, -24.0F, 38.5F);
        this.tailModel[5].addTrapezoid(0.0F, 0.0F, 0.0F, 18, 12, 12, 0.0F, -1.0F, 2);
        this.tailModel[5].setRotationPoint(53.0F, -27.0F, 33.0F);
        this.tailModel[6].addBox(0.0F, 0.0F, 0.0F, 20, 1, 10, 0.0F);
        this.tailModel[6].setRotationPoint(107.0F, -21.5F, -44.0F);
        this.tailModel[7].addBox(0.0F, 0.0F, 0.0F, 12, 1, 68, 0.0F);
        this.tailModel[7].setRotationPoint(107.0F, -21.5F, -34.0F);
        this.tailModel[8].addBox(0.0F, 0.0F, 0.0F, 20, 1, 10, 0.0F);
        this.tailModel[8].setRotationPoint(107.0F, -21.5F, 34.0F);
        this.tailModel[9].addShape3D(0.0F, 0.0F, 0.0F, (Shape2D)(new Shape2D(new Coord2D[]{new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(20.0D, 0.0D, 20, 0), new Coord2D(19.0D, 5.0D, 19, 5), new Coord2D(16.0D, 9.0D, 16, 9), new Coord2D(10.0D, 10.0D, 10, 10), new Coord2D(4.0D, 9.0D, 4, 9), new Coord2D(1.0D, 5.0D, 1, 5)})), 1.0F, 20, 10, 56, 1, 0, new float[]{6.0F, 5.0F, 7.0F, 7.0F, 5.0F, 6.0F, 20.0F});
        this.tailModel[9].setRotationPoint(127.0F, -21.5F, -44.0F);
        this.tailModel[9].rotateAngleX = (float)Math.PI / 2F;
        this.tailModel[10].addShape3D(0.0F, 0.0F, 0.0F, (Shape2D)(new Shape2D(new Coord2D[]{new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(20.0D, 0.0D, 20, 0), new Coord2D(19.0D, 5.0D, 19, 5), new Coord2D(16.0D, 9.0D, 16, 9), new Coord2D(10.0D, 10.0D, 10, 10), new Coord2D(4.0D, 9.0D, 4, 9), new Coord2D(1.0D, 5.0D, 1, 5)})), 1.0F, 20, 10, 56, 1, 0, new float[]{6.0F, 5.0F, 7.0F, 7.0F, 5.0F, 6.0F, 20.0F});
        this.tailModel[10].setRotationPoint(127.0F, -20.5F, 44.0F);
        this.tailModel[10].rotateAngleX = 4.712389F;
        this.tailModel[11].addShape3D(0.0F, 0.0F, 0.0F, (Shape2D)(new Shape2D(new Coord2D[]{new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(25.0D, 0.0D, 25, 0), new Coord2D(24.0D, 2.0D, 24, 2), new Coord2D(20.0D, 6.0D, 20, 6), new Coord2D(14.0D, 8.0D, 14, 8), new Coord2D(12.0D, 9.0D, 12, 9), new Coord2D(4.0D, 4.0D, 4, 4)})), 1.0F, 25, 9, 60, 1, 0, new float[]{6.0F, 10.0F, 3.0F, 7.0F, 6.0F, 3.0F, 25.0F});
        this.tailModel[11].setRotationPoint(107.0F, -18.0F, -38.5F);
        this.tailModel[11].rotateAngleX = (float)Math.PI;
        this.tailModel[11].rotateAngleY = (float)Math.PI;
        this.tailModel[12].addShape3D(0.0F, 0.0F, 0.0F, (Shape2D)(new Shape2D(new Coord2D[]{new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(25.0D, 0.0D, 25, 0), new Coord2D(24.0D, 2.0D, 24, 2), new Coord2D(20.0D, 6.0D, 20, 6), new Coord2D(14.0D, 8.0D, 14, 8), new Coord2D(12.0D, 9.0D, 12, 9), new Coord2D(4.0D, 4.0D, 4, 4)})), 1.0F, 25, 9, 60, 1, 0, new float[]{6.0F, 10.0F, 3.0F, 7.0F, 6.0F, 3.0F, 25.0F});
        this.tailModel[12].setRotationPoint(107.0F, -18.0F, 39.5F);
        this.tailModel[12].rotateAngleX = (float)Math.PI;
        this.tailModel[12].rotateAngleY = (float)Math.PI;
        this.tailModel[13].addShape3D(0.0F, 0.0F, 0.0F, (Shape2D)(new Shape2D(new Coord2D[]{new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(14.0D, 0.0D, 14, 0), new Coord2D(14.0D, 22.0D, 14, 22), new Coord2D(12.0D, 22.0D, 12, 22), new Coord2D(6.0D, 17.0D, 6, 17), new Coord2D(2.0D, 8.0D, 2, 8)})), 1.0F, 14, 22, 65, 1, 0, new float[]{9.0F, 10.0F, 8.0F, 2.0F, 22.0F, 14.0F});
        this.tailModel[13].setRotationPoint(107.0F, -24.0F, 38.5F);
        this.tailModel[13].rotateAngleY = (float)Math.PI;
        this.tailModel[14].addShape3D(0.0F, 0.0F, 0.0F, (Shape2D)(new Shape2D(new Coord2D[]{new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(14.0D, 0.0D, 14, 0), new Coord2D(14.0D, 22.0D, 14, 22), new Coord2D(12.0D, 22.0D, 12, 22), new Coord2D(6.0D, 17.0D, 6, 17), new Coord2D(2.0D, 8.0D, 2, 8)})), 1.0F, 14, 22, 65, 1, 0, new float[]{9.0F, 10.0F, 8.0F, 2.0F, 22.0F, 14.0F});
        this.tailModel[14].setRotationPoint(107.0F, -24.0F, -39.5F);
        this.tailModel[14].rotateAngleY = (float)Math.PI;
        if(this.VarGear) {
        }

        if(this.VarDoor) {
        }

        if(this.VarWing) {
        }

        this.rightWingModel = new ModelRendererTurbo[10];
        this.rightWingModel[0] = new ModelRendererTurbo(this, 0, 390, this.textureX, this.textureY);
        this.rightWingModel[1] = new ModelRendererTurbo(this, 50, 390, this.textureX, this.textureY);
        this.rightWingModel[2] = new ModelRendererTurbo(this, 120, 390, this.textureX, this.textureY);
        this.rightWingModel[3] = new ModelRendererTurbo(this, 180, 390, this.textureX, this.textureY);
        this.rightWingModel[4] = new ModelRendererTurbo(this, 260, 390, this.textureX, this.textureY);
        this.rightWingModel[5] = new ModelRendererTurbo(this, 0, 100, this.textureX, this.textureY);
        this.rightWingModel[6] = new ModelRendererTurbo(this, 200, 290, this.textureX, this.textureY);
        this.rightWingModel[7] = new ModelRendererTurbo(this, 235, 290, this.textureX, this.textureY);
        this.rightWingModel[8] = new ModelRendererTurbo(this, 250, 290, this.textureX, this.textureY);
        this.rightWingModel[9] = new ModelRendererTurbo(this, 260, 290, this.textureX, this.textureY);
        this.rightWingModel[0].addTrapezoid(0.0F, 0.0F, 0.0F, 9, 12, 12, 0.0F, -6.0F, 3);
        this.rightWingModel[0].setRotationPoint(-39.0F, -28.0F, -45.0F);
        this.rightWingModel[1].addTrapezoid(0.0F, 0.0F, 0.0F, 15, 20, 16, 0.0F, -2.0F, 3);
        this.rightWingModel[1].setRotationPoint(-30.0F, -30.0F, -47.0F);
        this.rightWingModel[2].addBox(0.0F, 0.0F, 0.0F, 10, 20, 16, 0.0F);
        this.rightWingModel[2].setRotationPoint(-15.0F, -30.0F, -47.0F);
        this.rightWingModel[3].addBox(0.0F, 0.0F, 0.0F, 26, 18, 12, 0.0F);
        this.rightWingModel[3].setRotationPoint(-5.0F, -30.0F, -45.0F);
        this.rightWingModel[4].addTrapezoid(0.0F, 0.0F, 0.0F, 32, 18, 12, 0.0F, -2.0F, 2);
        this.rightWingModel[4].setRotationPoint(21.0F, -30.0F, -45.0F);
        this.rightWingModel[5].addShape3D(0.0F, 0.0F, 0.0F, (Shape2D)(new Shape2D(new Coord2D[]{new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(46.0D, 0.0D, 46, 0), new Coord2D(28.0D, 102.0D, 28, 102), new Coord2D(23.0D, 112.0D, 23, 112), new Coord2D(17.0D, 117.0D, 17, 117), new Coord2D(13.0D, 116.0D, 13, 116), new Coord2D(10.0D, 108.0D, 10, 108)})), 2.0F, 46, 117, 293, 2, 0, new float[]{109.0F, 9.0F, 5.0F, 8.0F, 12.0F, 104.0F, 46.0F});
        this.rightWingModel[5].setRotationPoint(-7.0F, -21.0F, -8.0F);
        this.rightWingModel[5].rotateAngleX = 4.842389F;
        this.rightWingModel[5].rotateAngleY = (float)Math.PI;
        if(this.VarGear) {
            this.rightWingModel[6].addBox(0.0F, 0.0F, 0.0F, 13, 13, 3, 0.0F);
            this.rightWingModel[6].setRotationPoint(13.0F, -3.0F, -40.0F);
            this.rightWingModel[7].addBox(0.0F, 0.0F, 0.0F, 3, 19, 2, 0.0F);
            this.rightWingModel[7].setRotationPoint(20.0F, -14.0F, -42.0F);
            this.rightWingModel[7].rotateAngleZ = -0.1396263F;
            this.rightWingModel[8].addBox(0.0F, 0.0F, 0.0F, 2, 15, 1, 0.0F);
            this.rightWingModel[8].setRotationPoint(33.0F, -14.0F, -41.5F);
            this.rightWingModel[8].rotateAngleZ = -1.134464F;
            this.rightWingModel[9].addBox(0.0F, 0.0F, 0.0F, 32, 10, 1, 0.0F);
            this.rightWingModel[9].setRotationPoint(15.0F, -14.0F, -43.0F);
        }

        if(this.VarDoor) {
        }

        if(this.VarWing) {
        }

        this.leftWingModel = new ModelRendererTurbo[10];
        this.leftWingModel[0] = new ModelRendererTurbo(this, 0, 350, this.textureX, this.textureY);
        this.leftWingModel[1] = new ModelRendererTurbo(this, 50, 350, this.textureX, this.textureY);
        this.leftWingModel[2] = new ModelRendererTurbo(this, 120, 350, this.textureX, this.textureY);
        this.leftWingModel[3] = new ModelRendererTurbo(this, 180, 350, this.textureX, this.textureY);
        this.leftWingModel[4] = new ModelRendererTurbo(this, 260, 350, this.textureX, this.textureY);
        this.leftWingModel[5] = new ModelRendererTurbo(this, 100, 90, this.textureX, this.textureY);
        this.leftWingModel[6] = new ModelRendererTurbo(this, 200, 320, this.textureX, this.textureY);
        this.leftWingModel[7] = new ModelRendererTurbo(this, 235, 320, this.textureX, this.textureY);
        this.leftWingModel[8] = new ModelRendererTurbo(this, 250, 320, this.textureX, this.textureY);
        this.leftWingModel[9] = new ModelRendererTurbo(this, 260, 320, this.textureX, this.textureY);
        this.leftWingModel[0].addTrapezoid(0.0F, 0.0F, 0.0F, 9, 12, 12, 0.0F, -6.0F, 3);
        this.leftWingModel[0].setRotationPoint(-39.0F, -28.0F, 33.0F);
        this.leftWingModel[1].addTrapezoid(0.0F, 0.0F, 0.0F, 15, 20, 16, 0.0F, -2.0F, 3);
        this.leftWingModel[1].setRotationPoint(-30.0F, -30.0F, 31.0F);
        this.leftWingModel[2].addBox(0.0F, 0.0F, 0.0F, 10, 20, 16, 0.0F);
        this.leftWingModel[2].setRotationPoint(-15.0F, -30.0F, 31.0F);
        this.leftWingModel[3].addBox(0.0F, 0.0F, 0.0F, 26, 18, 12, 0.0F);
        this.leftWingModel[3].setRotationPoint(-5.0F, -30.0F, 33.0F);
        this.leftWingModel[4].addTrapezoid(0.0F, 0.0F, 0.0F, 32, 18, 12, 0.0F, -2.0F, 2);
        this.leftWingModel[4].setRotationPoint(21.0F, -30.0F, 33.0F);
        this.leftWingModel[5].addShape3D(0.0F, 0.0F, 0.0F, (Shape2D)(new Shape2D(new Coord2D[]{new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(46.0D, 0.0D, 46, 0), new Coord2D(36.0D, 108.0D, 36, 108), new Coord2D(33.0D, 116.0D, 33, 116), new Coord2D(29.0D, 117.0D, 29, 117), new Coord2D(23.0D, 112.0D, 23, 112), new Coord2D(18.0D, 102.0D, 18, 102)})), 2.0F, 46, 117, 293, 2, 0, new float[]{104.0F, 12.0F, 8.0F, 5.0F, 9.0F, 109.0F, 46.0F});
        this.leftWingModel[5].setRotationPoint(39.0F, -21.0F, 8.0F);
        this.leftWingModel[5].rotateAngleX = -1.4407964F;
        if(this.VarGear) {
            this.leftWingModel[6].addBox(0.0F, 0.0F, 0.0F, 13, 13, 3, 0.0F);
            this.leftWingModel[6].setRotationPoint(13.0F, -3.0F, 37.0F);
            this.leftWingModel[7].addBox(0.0F, 0.0F, 0.0F, 3, 19, 2, 0.0F);
            this.leftWingModel[7].setRotationPoint(20.0F, -14.0F, 40.0F);
            this.leftWingModel[7].rotateAngleZ = -0.1396263F;
            this.leftWingModel[8].addBox(0.0F, 0.0F, 0.0F, 2, 15, 1, 0.0F);
            this.leftWingModel[8].setRotationPoint(33.0F, -14.0F, 40.5F);
            this.leftWingModel[8].rotateAngleZ = -1.134464F;
            this.leftWingModel[9].addBox(0.0F, 0.0F, 0.0F, 32, 10, 1, 0.0F);
            this.leftWingModel[9].setRotationPoint(15.0F, -14.0F, 42.0F);
        }

        if(this.VarDoor) {
        }

        if(this.VarWing) {
        }

        this.propellerModels = new ModelRendererTurbo[2][3];
        this.propellerModels[0] = this.makeProp(-32, -22, -39);
        this.propellerModels[1] = this.makeProp(-32, -22, 39);
        this.yawFlapModel = new ModelRendererTurbo[3];
        this.yawFlapModel[0] = new ModelRendererTurbo(this, 300, 450, this.textureX, this.textureY);
        this.yawFlapModel[1] = new ModelRendererTurbo(this, 200, 100, this.textureX, this.textureY);
        this.yawFlapModel[2] = new ModelRendererTurbo(this, 200, 130, this.textureX, this.textureY);
        this.yawFlapModel[0].addBox(0.0F, 0.0F, -0.5F, 5, 2, 1, 0.0F);
        this.yawFlapModel[0].setRotationPoint(-7.0F, -18.0F, 0.0F);
        this.yawFlapModel[0].rotateAngleX = 3.141593F;
        this.yawFlapModel[0].rotateAngleZ = 1.570796F;
        this.yawFlapModel[1].addShape3D(0.0F, 0.0F, 0.0F, (Shape2D)(new Shape2D(new Coord2D[]{new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(11.0D, 0.0D, 11, 0), new Coord2D(10.0D, 8.0D, 10, 8), new Coord2D(6.0D, 17.0D, 6, 17), new Coord2D(0.0D, 22.0D, 0, 22)})), 1.0F, 11, 22, 60, 1, 0, new float[]{22.0F, 8.0F, 10.0F, 9.0F, 11.0F});
        this.yawFlapModel[1].setRotationPoint(121.0F, -24.0F, 38.5F);
        this.yawFlapModel[1].rotateAngleX = (float)Math.PI;
        this.yawFlapModel[1].rotateAngleZ = (float)Math.PI;
        this.yawFlapModel[2].addShape3D(0.0F, 0.0F, 0.0F, (Shape2D)(new Shape2D(new Coord2D[]{new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(11.0D, 0.0D, 11, 0), new Coord2D(10.0D, 8.0D, 10, 8), new Coord2D(6.0D, 17.0D, 6, 17), new Coord2D(0.0D, 22.0D, 0, 22)})), 1.0F, 11, 22, 60, 1, 0, new float[]{22.0F, 8.0F, 10.0F, 9.0F, 11.0F});
        this.yawFlapModel[2].setRotationPoint(121.0F, -24.0F, -39.5F);
        this.yawFlapModel[2].rotateAngleX = (float)Math.PI;
        this.yawFlapModel[2].rotateAngleZ = (float)Math.PI;
        this.pitchFlapLeftModel = new ModelRendererTurbo[1];
        this.pitchFlapLeftModel[0] = new ModelRendererTurbo(this, 100, 275, this.textureX, this.textureY);
        this.pitchFlapLeftModel[0].addBox(0.0F, 0.0F, 0.0F, 8, 1, 68, 0.0F);
        this.pitchFlapLeftModel[0].setRotationPoint(119.0F, -21.5F, -34.0F);
        this.pitchFlapRightModel = new ModelRendererTurbo[0];
        this.pitchFlapLeftWingModel = new ModelRendererTurbo[0];
        this.pitchFlapRightWingModel = new ModelRendererTurbo[0];
        this.topWingModel = new ModelRendererTurbo[0];
        this.translateAll(0, 0, 0);
        this.flipAll();
//        this.collisionBoxes = new CollisionBox[26];
//        this.collisionBoxes[0] = new CollisionBox(0, 21, -30, 0);
//        this.collisionBoxes[1] = new CollisionBox(0, 21, -10, 0);
//        this.collisionBoxes[2] = new CollisionBox(0, 21, 10, 0);
//        this.collisionBoxes[3] = new CollisionBox(0, 21, 30, 0);
//        this.collisionBoxes[4] = new CollisionBox(0, 21, 50, 0);
//        this.collisionBoxes[5] = new CollisionBox(0, 21, -120, 3);
//        this.collisionBoxes[6] = new CollisionBox(20, 21, -120, 3);
//        this.collisionBoxes[7] = new CollisionBox(39, 30, -120, 3);
//        this.collisionBoxes[8] = new CollisionBox(39, 21, -90, 3);
//        this.collisionBoxes[9] = new CollisionBox(39, 21, -60, 3);
//        this.collisionBoxes[10] = new CollisionBox(-20, 21, -120, 3);
//        this.collisionBoxes[11] = new CollisionBox(-39, 30, -120, 3);
//        this.collisionBoxes[12] = new CollisionBox(-39, 21, -90, 3);
//        this.collisionBoxes[13] = new CollisionBox(-39, 21, -60, 3);
//        this.collisionBoxes[14] = new CollisionBox(-20, 24, -10, 1);
//        this.collisionBoxes[15] = new CollisionBox(-75, 32, -10, 1);
//        this.collisionBoxes[16] = new CollisionBox(-110, 37, -10, 1);
//        this.collisionBoxes[17] = new CollisionBox(-39, 21, 23, 1);
//        this.collisionBoxes[18] = new CollisionBox(-39, 21, -10, 1);
//        this.collisionBoxes[19] = new CollisionBox(-39, 21, -37, 1);
//        this.collisionBoxes[20] = new CollisionBox(-20, 24, -10, 1);
//        this.collisionBoxes[21] = new CollisionBox(-75, 32, -10, 1);
//        this.collisionBoxes[22] = new CollisionBox(-110, 37, -10, 1);
//        this.collisionBoxes[23] = new CollisionBox(-39, 21, 23, 1);
//        this.collisionBoxes[24] = new CollisionBox(-39, 21, -10, 1);
//        this.collisionBoxes[25] = new CollisionBox(-39, 21, -37, 1);
    }

    private ModelRendererTurbo[] makeProp(int i, int j, int k) {
        ModelRendererTurbo[] prop = new ModelRendererTurbo[]{new ModelRendererTurbo(this, 100, 270, this.textureX, this.textureY), new ModelRendererTurbo(this, 100, 270, this.textureX, this.textureY), new ModelRendererTurbo(this, 100, 270, this.textureX, this.textureY)};
        prop[0].addBox(-0.0F, -28.0F, -3.0F, 1, 28, 3, 0.0F);
        prop[0].setRotationPoint((float)i, (float)j, (float)k);
        prop[1].addBox(-0.0F, -28.0F, -3.0F, 1, 28, 3, 0.0F);
        prop[1].setRotationPoint((float)i, (float)j, (float)k);
        prop[2].addBox(-0.0F, -28.0F, -3.0F, 1, 28, 3, 0.0F);
        prop[2].setRotationPoint((float)i, (float)j, (float)k);
        return prop;
    }
}

