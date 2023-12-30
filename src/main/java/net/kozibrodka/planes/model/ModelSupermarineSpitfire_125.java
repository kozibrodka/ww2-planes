package net.kozibrodka.planes.model;

import net.kozibrodka.tmt.TURBO_MODEL_125.*;

public class ModelSupermarineSpitfire_125 extends ModelPlaneNew {
    int textureX = 512;
    int textureY = 512;
    boolean VarGear = true;
    boolean VarDoor = true;
    boolean VarWing = true;

    public ModelSupermarineSpitfire_125() {
        this.bodyModel = new ModelRendererTurbo[34];
        this.bodyModel[0] = new ModelRendererTurbo(this, 10, 480, this.textureX, this.textureY);
        this.bodyModel[1] = new ModelRendererTurbo(this, 10, 500, this.textureX, this.textureY);
        this.bodyModel[2] = new ModelRendererTurbo(this, 70, 470, this.textureX, this.textureY);
        this.bodyModel[3] = new ModelRendererTurbo(this, 150, 470, this.textureX, this.textureY);
        this.bodyModel[4] = new ModelRendererTurbo(this, 150, 490, this.textureX, this.textureY);
        this.bodyModel[5] = new ModelRendererTurbo(this, 230, 470, this.textureX, this.textureY);
        this.bodyModel[6] = new ModelRendererTurbo(this, 205, 490, this.textureX, this.textureY);
        this.bodyModel[7] = new ModelRendererTurbo(this, 230, 478, this.textureX, this.textureY);
        this.bodyModel[8] = new ModelRendererTurbo(this, 260, 470, this.textureX, this.textureY);
        this.bodyModel[9] = new ModelRendererTurbo(this, 300, 470, this.textureX, this.textureY);
        this.bodyModel[10] = new ModelRendererTurbo(this, 315, 470, this.textureX, this.textureY);
        this.bodyModel[11] = new ModelRendererTurbo(this, 315, 490, this.textureX, this.textureY);
        this.bodyModel[12] = new ModelRendererTurbo(this, 370, 470, this.textureX, this.textureY);
        this.bodyModel[13] = new ModelRendererTurbo(this, 390, 470, this.textureX, this.textureY);
        this.bodyModel[14] = new ModelRendererTurbo(this, 390, 485, this.textureX, this.textureY);
        this.bodyModel[15] = new ModelRendererTurbo(this, 390, 500, this.textureX, this.textureY);
        this.bodyModel[16] = new ModelRendererTurbo(this, 430, 470, this.textureX, this.textureY);
        this.bodyModel[17] = new ModelRendererTurbo(this, 430, 485, this.textureX, this.textureY);
        this.bodyModel[18] = new ModelRendererTurbo(this, 430, 495, this.textureX, this.textureY);
        this.bodyModel[19] = new ModelRendererTurbo(this, 450, 485, this.textureX, this.textureY);
        this.bodyModel[20] = new ModelRendererTurbo(this, 470, 470, this.textureX, this.textureY);
        this.bodyModel[21] = new ModelRendererTurbo(this, 90, 460, this.textureX, this.textureY);
        this.bodyModel[22] = new ModelRendererTurbo(this, 130, 460, this.textureX, this.textureY);
        this.bodyModel[23] = new ModelRendererTurbo(this, 230, 400, this.textureX, this.textureY);
        this.bodyModel[24] = new ModelRendererTurbo(this, 305, 400, this.textureX, this.textureY);
        this.bodyModel[25] = new ModelRendererTurbo(this, 305, 400, this.textureX, this.textureY);
        this.bodyModel[26] = new ModelRendererTurbo(this, 305, 400, this.textureX, this.textureY);
        this.bodyModel[27] = new ModelRendererTurbo(this, 305, 420, this.textureX, this.textureY);
        this.bodyModel[28] = new ModelRendererTurbo(this, 305, 420, this.textureX, this.textureY);
        this.bodyModel[29] = new ModelRendererTurbo(this, 305, 420, this.textureX, this.textureY);
        this.bodyModel[30] = new ModelRendererTurbo(this, 340, 220, this.textureX, this.textureY);
        this.bodyModel[31] = new ModelRendererTurbo(this, 340, 230, this.textureX, this.textureY);
        this.bodyModel[32] = new ModelRendererTurbo(this, 320, 220, this.textureX, this.textureY);
        this.bodyModel[33] = new ModelRendererTurbo(this, 320, 230, this.textureX, this.textureY);
        this.bodyModel[0].addTrapezoid(0.0F, 0.0F, 0.0F, 9, 8, 8, 0.0F, -3.0F, 3);
        this.bodyModel[0].setRotationPoint(-50.0F, -23.0F, -4.0F);
        this.bodyModel[1].addBox(0.0F, 0.0F, 0.0F, 19, 4, 6, 0.0F);
        this.bodyModel[1].setRotationPoint(-40.0F, -15.0F, -3.0F);
        this.bodyModel[1].rotateAngleZ = -0.05235988F;
        this.bodyModel[2].addTrapezoid(0.0F, 0.0F, 0.0F, 21, 19, 16, 0.0F, -1.0F, 3);
        this.bodyModel[2].setRotationPoint(-21.0F, -27.0F, -8.0F);
        this.bodyModel[3].addBox(0.0F, 0.0F, 0.0F, 24, 2, 16, 0.0F);
        this.bodyModel[3].setRotationPoint(0.0F, -10.0F, -8.0F);
        this.bodyModel[4].addBox(0.0F, 0.0F, 0.0F, 24, 16, 2, 0.0F);
        this.bodyModel[4].setRotationPoint(0.0F, -26.0F, -8.0F);
        this.bodyModel[5].addBox(0.0F, 0.0F, 0.0F, 6, 3, 2, 0.0F);
        this.bodyModel[5].setRotationPoint(18.0F, -29.0F, -8.0F);
        this.bodyModel[6].addBox(0.0F, 0.0F, 0.0F, 24, 16, 2, 0.0F);
        this.bodyModel[6].setRotationPoint(0.0F, -26.0F, 6.0F);
        this.bodyModel[7].addBox(0.0F, 0.0F, 0.0F, 6, 3, 2, 0.0F);
        this.bodyModel[7].setRotationPoint(18.0F, -29.0F, 6.0F);
        this.bodyModel[8].addBox(0.0F, 0.0F, 0.0F, 7, 25, 16, 0.0F);
        this.bodyModel[8].setRotationPoint(24.0F, -33.0F, -8.0F);
        this.bodyModel[9].addBox(0.0F, 0.0F, 0.0F, 7, 7, 4, 0.0F);
        this.bodyModel[9].setRotationPoint(0.0F, -17.0F, -2.0F);
        this.bodyModel[10].addBox(0.0F, 0.0F, 0.0F, 13, 2, 12, 0.0F);
        this.bodyModel[10].setRotationPoint(6.0F, -12.0F, -6.0F);
        this.bodyModel[11].addBox(0.0F, 0.0F, 0.0F, 20, 2, 12, 0.0F);
        this.bodyModel[11].setRotationPoint(17.0F, -12.0F, -6.0F);
        this.bodyModel[11].rotateAngleZ = 1.448623F;
        this.bodyModel[12].addBox(0.0F, 0.0F, 0.0F, 1, 11, 8, 0.0F);
        this.bodyModel[12].setRotationPoint(5.0F, -34.0F, -4.0F);
        this.bodyModel[12].rotateAngleZ = -0.8552113F;
        this.bodyModel[13].addBox(0.0F, 0.0F, 0.0F, 10, 1, 8, 0.0F);
        this.bodyModel[13].setRotationPoint(5.0F, -34.0F, -4.0F);
        this.bodyModel[14].addBox(0.0F, 0.0F, 0.0F, 4, 1, 8, 0.0F);
        this.bodyModel[14].setRotationPoint(15.0F, -34.0F, -4.0F);
        this.bodyModel[14].rotateAngleZ = -0.2792527F;
        this.bodyModel[15].addBox(0.0F, 0.0F, 0.0F, 6, 1, 8, 0.0F);
        this.bodyModel[15].setRotationPoint(18.0F, -33.0F, -4.0F);
        this.bodyModel[16].addBox(0.0F, 0.0F, 0.0F, 10, 1, 9, 0.0F);
        this.bodyModel[16].setRotationPoint(5.0F, -34.0F, 4.0F);
        this.bodyModel[16].rotateAngleX = -1.134464F;
        this.bodyModel[17].addBox(0.0F, 0.0F, 0.0F, 1, 1, 6, 0.0F);
        this.bodyModel[17].setRotationPoint(18.0F, -33.0F, 4.0F);
        this.bodyModel[17].rotateAngleX = -0.8377581F;
        this.bodyModel[18].addBox(0.0F, 0.0F, 0.0F, 10, 9, 1, 0.0F);
        this.bodyModel[18].setRotationPoint(5.0F, -34.0F, -4.0F);
        this.bodyModel[18].rotateAngleX = -0.4363323F;
        this.bodyModel[19].addBox(0.0F, 0.0F, 0.0F, 1, 6, 1, 0.0F);
        this.bodyModel[19].setRotationPoint(18.0F, -33.0F, -4.0F);
        this.bodyModel[19].rotateAngleX = -0.7330383F;
        this.bodyModel[20].addTrapezoid(0.0F, 0.0F, 0.0F, 2, 12, 1, 0.0F, -0.5F, 4);
        this.bodyModel[20].setRotationPoint(26.0F, -45.0F, -0.5F);
        this.bodyModel[21].addBox(0.0F, 0.0F, 0.0F, 14, 1, 3, 0.0F);
        this.bodyModel[21].setRotationPoint(-37.0F, -21.0F, -6.0F);
        this.bodyModel[21].rotateAngleY = -0.1396263F;
        this.bodyModel[22].addBox(0.0F, 0.0F, 0.0F, 14, 1, 3, 0.0F);
        this.bodyModel[22].setRotationPoint(-37.0F, -21.0F, 3.0F);
        this.bodyModel[22].rotateAngleY = 0.1396263F;
        this.bodyModel[23].addShape3D(0.0F, 0.0F, 0.0F, (Shape2D)(new Shape2D(new Coord2D[]{new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(6.0D, 1.0D, 6, 1), new Coord2D(15.0D, 3.0D, 15, 3), new Coord2D(20.0D, 6.0D, 20, 6), new Coord2D(20.0D, 14.0D, 20, 14), new Coord2D(16.0D, 16.0D, 16, 16), new Coord2D(0.0D, 17.0D, 0, 17)})), 8.0F, 20, 17, 70, 8, 0, new float[]{17.0F, 17.0F, 5.0F, 8.0F, 6.0F, 10.0F, 7.0F});
        this.bodyModel[23].setRotationPoint(-21.0F, -9.0F, 4.0F);
        this.bodyModel[24].addShape3D(0.0F, 0.0F, 0.0F, (Shape2D)(new Shape2D(new Coord2D[]{new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(6.0D, 1.0D, 6, 1), new Coord2D(15.0D, 3.0D, 15, 3), new Coord2D(20.0D, 6.0D, 20, 6), new Coord2D(20.0D, 14.0D, 20, 14), new Coord2D(16.0D, 16.0D, 16, 16), new Coord2D(0.0D, 17.0D, 0, 17)})), 1.0F, 20, 17, 70, 1, 0, new float[]{17.0F, 17.0F, 5.0F, 8.0F, 6.0F, 10.0F, 7.0F});
        this.bodyModel[24].setRotationPoint(-21.0F, -9.0F, 5.0F);
        this.bodyModel[24].rotateAngleY = 0.05002114F;
        this.bodyModel[25].addShape3D(0.0F, 0.0F, 0.0F, (Shape2D)(new Shape2D(new Coord2D[]{new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(6.0D, 1.0D, 6, 1), new Coord2D(15.0D, 3.0D, 15, 3), new Coord2D(20.0D, 6.0D, 20, 6), new Coord2D(20.0D, 14.0D, 20, 14), new Coord2D(16.0D, 16.0D, 16, 16), new Coord2D(0.0D, 17.0D, 0, 17)})), 1.0F, 20, 17, 70, 1, 0, new float[]{17.0F, 17.0F, 5.0F, 8.0F, 6.0F, 10.0F, 7.0F});
        this.bodyModel[25].setRotationPoint(-21.0F, -9.0F, 6.0F);
        this.bodyModel[25].rotateAngleY = 0.10016445F;
        this.bodyModel[26].addShape3D(0.0F, 0.0F, 0.0F, (Shape2D)(new Shape2D(new Coord2D[]{new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(6.0D, 1.0D, 6, 1), new Coord2D(15.0D, 3.0D, 15, 3), new Coord2D(20.0D, 6.0D, 20, 6), new Coord2D(20.0D, 14.0D, 20, 14), new Coord2D(16.0D, 16.0D, 16, 16), new Coord2D(0.0D, 17.0D, 0, 17)})), 1.0F, 20, 17, 70, 1, 0, new float[]{17.0F, 17.0F, 5.0F, 8.0F, 6.0F, 10.0F, 7.0F});
        this.bodyModel[26].setRotationPoint(-21.0F, -9.0F, 7.0F);
        this.bodyModel[26].rotateAngleY = 0.15056954F;
        this.bodyModel[27].addShape3D(0.0F, 0.0F, -1.0F, (Shape2D)(new Shape2D(new Coord2D[]{new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(6.0D, 1.0D, 6, 1), new Coord2D(15.0D, 3.0D, 15, 3), new Coord2D(20.0D, 6.0D, 20, 6), new Coord2D(20.0D, 14.0D, 20, 14), new Coord2D(16.0D, 16.0D, 16, 16), new Coord2D(0.0D, 17.0D, 0, 17)})), 1.0F, 20, 17, 70, 1, 0, new float[]{17.0F, 17.0F, 5.0F, 8.0F, 6.0F, 10.0F, 7.0F});
        this.bodyModel[27].setRotationPoint(-21.0F, -9.0F, -5.0F);
        this.bodyModel[27].rotateAngleY = -0.05002114F;
        this.bodyModel[28].addShape3D(0.0F, 0.0F, -1.0F, (Shape2D)(new Shape2D(new Coord2D[]{new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(6.0D, 1.0D, 6, 1), new Coord2D(15.0D, 3.0D, 15, 3), new Coord2D(20.0D, 6.0D, 20, 6), new Coord2D(20.0D, 14.0D, 20, 14), new Coord2D(16.0D, 16.0D, 16, 16), new Coord2D(0.0D, 17.0D, 0, 17)})), 1.0F, 20, 17, 70, 1, 0, new float[]{17.0F, 17.0F, 5.0F, 8.0F, 6.0F, 10.0F, 7.0F});
        this.bodyModel[28].setRotationPoint(-21.0F, -9.0F, -6.0F);
        this.bodyModel[28].rotateAngleY = -0.10016445F;
        this.bodyModel[29].addShape3D(0.0F, 0.0F, -1.0F, (Shape2D)(new Shape2D(new Coord2D[]{new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(6.0D, 1.0D, 6, 1), new Coord2D(15.0D, 3.0D, 15, 3), new Coord2D(20.0D, 6.0D, 20, 6), new Coord2D(20.0D, 14.0D, 20, 14), new Coord2D(16.0D, 16.0D, 16, 16), new Coord2D(0.0D, 17.0D, 0, 17)})), 1.0F, 20, 17, 70, 1, 0, new float[]{17.0F, 17.0F, 5.0F, 8.0F, 6.0F, 10.0F, 7.0F});
        this.bodyModel[29].setRotationPoint(-21.0F, -9.0F, -7.0F);
        this.bodyModel[29].rotateAngleY = -0.15056954F;
        this.bodyModel[30].addShape3D(0.0F, 0.0F, 0.0F, (Shape2D)(new Shape2D(new Coord2D[]{new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(5.0D, 0.0D, 5, 0), new Coord2D(5.0D, 1.0D, 5, 1)})), 2.0F, 5, 1, 12, 2, 0, new float[]{6.0F, 1.0F, 5.0F});
        this.bodyModel[30].setRotationPoint(5.0F, -26.0F, -6.0F);
        this.bodyModel[31].addShape3D(0.0F, 0.0F, 0.0F, (Shape2D)(new Shape2D(new Coord2D[]{new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(5.0D, 0.0D, 5, 0), new Coord2D(5.0D, 1.0D, 5, 1)})), 2.0F, 5, 1, 12, 2, 0, new float[]{6.0F, 1.0F, 5.0F});
        this.bodyModel[31].setRotationPoint(5.0F, -26.0F, 8.0F);
        this.bodyModel[32].addShape3D(0.0F, 0.0F, 0.0F, (Shape2D)(new Shape2D(new Coord2D[]{new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(3.0D, 0.0D, 3, 0), new Coord2D(0.0D, 3.0D, 0, 3)})), 2.0F, 3, 3, 11, 2, 0, new float[]{3.0F, 5.0F, 3.0F});
        this.bodyModel[32].setRotationPoint(18.0F, -26.0F, -6.0F);
        this.bodyModel[33].addShape3D(0.0F, 0.0F, 0.0F, (Shape2D)(new Shape2D(new Coord2D[]{new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(3.0D, 0.0D, 3, 0), new Coord2D(0.0D, 3.0D, 0, 3)})), 2.0F, 3, 3, 11, 2, 0, new float[]{3.0F, 5.0F, 3.0F});
        this.bodyModel[33].setRotationPoint(18.0F, -26.0F, 8.0F);
        if(this.VarGear) {
        }

        if(this.VarDoor) {
        }

        if(this.VarWing) {
        }

        this.tailModel = new ModelRendererTurbo[15];
        this.tailModel[0] = new ModelRendererTurbo(this, 0, 400, this.textureX, this.textureY);
        this.tailModel[1] = new ModelRendererTurbo(this, 20, 400, this.textureX, this.textureY);
        this.tailModel[2] = new ModelRendererTurbo(this, 40, 400, this.textureX, this.textureY);
        this.tailModel[3] = new ModelRendererTurbo(this, 0, 370, this.textureX, this.textureY);
        this.tailModel[4] = new ModelRendererTurbo(this, 0, 370, this.textureX, this.textureY);
        this.tailModel[5] = new ModelRendererTurbo(this, 0, 370, this.textureX, this.textureY);
        this.tailModel[6] = new ModelRendererTurbo(this, 0, 370, this.textureX, this.textureY);
        this.tailModel[7] = new ModelRendererTurbo(this, 0, 370, this.textureX, this.textureY);
        this.tailModel[8] = new ModelRendererTurbo(this, 0, 370, this.textureX, this.textureY);
        this.tailModel[9] = new ModelRendererTurbo(this, 0, 370, this.textureX, this.textureY);
        this.tailModel[10] = new ModelRendererTurbo(this, 0, 370, this.textureX, this.textureY);
        this.tailModel[11] = new ModelRendererTurbo(this, 160, 370, this.textureX, this.textureY);
        this.tailModel[12] = new ModelRendererTurbo(this, 160, 380, this.textureX, this.textureY);
        this.tailModel[13] = new ModelRendererTurbo(this, 0, 220, this.textureX, this.textureY);
        this.tailModel[14] = new ModelRendererTurbo(this, 75, 220, this.textureX, this.textureY);
        this.tailModel[0].addBox(0.0F, 0.0F, 0.0F, 5, 5, 1, 0.0F);
        this.tailModel[0].setRotationPoint(86.0F, -16.0F, -0.5F);
        this.tailModel[1].addBox(0.0F, 0.0F, 0.0F, 5, 1, 2, 0.0F);
        this.tailModel[1].setRotationPoint(84.0F, -14.0F, -1.0F);
        this.tailModel[2].addBox(0.0F, 0.0F, 0.0F, 7, 1, 2, 0.0F);
        this.tailModel[2].setRotationPoint(81.0F, -19.0F, -1.0F);
        this.tailModel[2].rotateAngleZ = -0.9424778F;
        this.tailModel[3].addShape3D(0.0F, 0.0F, 0.0F, (Shape2D)(new Shape2D(new Coord2D[]{new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(58.0D, 9.0D, 58, 9), new Coord2D(58.0D, 20.0D, 58, 20), new Coord2D(0.0D, 25.0D, 0, 25)})), 2.0F, 58, 25, 154, 2, 0, new float[]{25.0F, 59.0F, 11.0F, 59.0F});
        this.tailModel[3].setRotationPoint(31.0F, -8.0F, -8.0F);
        this.tailModel[3].rotateAngleY = 3.262579F;
        this.tailModel[4].addShape3D(0.0F, 0.0F, 0.0F, (Shape2D)(new Shape2D(new Coord2D[]{new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(58.0D, 9.0D, 58, 9), new Coord2D(58.0D, 20.0D, 58, 20), new Coord2D(0.0D, 25.0D, 0, 25)})), 2.0F, 58, 25, 154, 2, 0, new float[]{25.0F, 59.0F, 11.0F, 59.0F});
        this.tailModel[4].setRotationPoint(31.0F, -8.0F, -6.0F);
        this.tailModel[4].rotateAngleY = 3.2278993F;
        this.tailModel[5].addShape3D(0.0F, 0.0F, 0.0F, (Shape2D)(new Shape2D(new Coord2D[]{new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(58.0D, 9.0D, 58, 9), new Coord2D(58.0D, 20.0D, 58, 20), new Coord2D(0.0D, 25.0D, 0, 25)})), 2.0F, 58, 25, 154, 2, 0, new float[]{25.0F, 59.0F, 11.0F, 59.0F});
        this.tailModel[5].setRotationPoint(31.0F, -8.0F, -4.0F);
        this.tailModel[5].rotateAngleY = 3.1933417F;
        this.tailModel[6].addShape3D(0.0F, 0.0F, 0.0F, (Shape2D)(new Shape2D(new Coord2D[]{new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(58.0D, 9.0D, 58, 9), new Coord2D(58.0D, 20.0D, 58, 20), new Coord2D(0.0D, 25.0D, 0, 25)})), 2.0F, 58, 25, 154, 2, 0, new float[]{25.0F, 59.0F, 11.0F, 59.0F});
        this.tailModel[6].setRotationPoint(31.0F, -8.0F, -2.0F);
        this.tailModel[6].rotateAngleY = 3.1588366F;
        this.tailModel[7].addShape3D(0.0F, 0.0F, -2.0F, (Shape2D)(new Shape2D(new Coord2D[]{new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(58.0D, 9.0D, 58, 9), new Coord2D(58.0D, 20.0D, 58, 20), new Coord2D(0.0D, 25.0D, 0, 25)})), 2.0F, 58, 25, 154, 2, 0, new float[]{25.0F, 59.0F, 11.0F, 59.0F});
        this.tailModel[7].setRotationPoint(31.0F, -8.0F, 8.0F);
        this.tailModel[7].rotateAngleY = 3.0206065F;
        this.tailModel[8].addShape3D(0.0F, 0.0F, -2.0F, (Shape2D)(new Shape2D(new Coord2D[]{new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(58.0D, 9.0D, 58, 9), new Coord2D(58.0D, 20.0D, 58, 20), new Coord2D(0.0D, 25.0D, 0, 25)})), 2.0F, 58, 25, 154, 2, 0, new float[]{25.0F, 59.0F, 11.0F, 59.0F});
        this.tailModel[8].setRotationPoint(31.0F, -8.0F, 6.0F);
        this.tailModel[8].rotateAngleY = 3.0552862F;
        this.tailModel[9].addShape3D(0.0F, 0.0F, -2.0F, (Shape2D)(new Shape2D(new Coord2D[]{new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(58.0D, 9.0D, 58, 9), new Coord2D(58.0D, 20.0D, 58, 20), new Coord2D(0.0D, 25.0D, 0, 25)})), 2.0F, 58, 25, 154, 2, 0, new float[]{25.0F, 59.0F, 11.0F, 59.0F});
        this.tailModel[9].setRotationPoint(31.0F, -8.0F, 4.0F);
        this.tailModel[9].rotateAngleY = 3.0898438F;
        this.tailModel[10].addShape3D(0.0F, 0.0F, -2.0F, (Shape2D)(new Shape2D(new Coord2D[]{new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(58.0D, 9.0D, 58, 9), new Coord2D(58.0D, 20.0D, 58, 20), new Coord2D(0.0D, 25.0D, 0, 25)})), 2.0F, 58, 25, 154, 2, 0, new float[]{25.0F, 59.0F, 11.0F, 59.0F});
        this.tailModel[10].setRotationPoint(31.0F, -8.0F, 2.0F);
        this.tailModel[10].rotateAngleY = 3.1243489F;
        this.tailModel[11].addShape3D(0.0F, 0.0F, -1.0F, (Shape2D)(new Shape2D(new Coord2D[]{new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(19.0D, 0.0D, 19, 0), new Coord2D(19.0D, 5.0D, 19, 5), new Coord2D(9.0D, 5.0D, 9, 5)})), 2.0F, 19, 5, 45, 2, 0, new float[]{11.0F, 10.0F, 5.0F, 19.0F});
        this.tailModel[11].setRotationPoint(70.0F, -26.0F, 0.0F);
        this.tailModel[11].rotateAngleY = (float)Math.PI;
        this.tailModel[12].addShape3D(0.0F, 0.0F, -1.0F, (Shape2D)(new Shape2D(new Coord2D[]{new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(10.0D, 0.0D, 10, 0), new Coord2D(10.0D, 10.0D, 10, 10), new Coord2D(5.0D, 10.0D, 5, 10)})), 2.0F, 10, 10, 37, 2, 0, new float[]{12.0F, 5.0F, 10.0F, 10.0F});
        this.tailModel[12].setRotationPoint(79.0F, -31.0F, 0.0F);
        this.tailModel[12].rotateAngleY = (float)Math.PI;
        this.tailModel[13].addShape3D(0.0F, 0.0F, 0.0F, (Shape2D)(new Shape2D(new Coord2D[]{new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(12.0D, 0.0D, 12, 0), new Coord2D(12.0D, 20.0D, 12, 20), new Coord2D(8.0D, 25.0D, 8, 25), new Coord2D(3.0D, 19.0D, 3, 19), new Coord2D(0.0D, 7.0D, 0, 7)})), 1.0F, 12, 25, 67, 1, 0, new float[]{7.0F, 13.0F, 8.0F, 7.0F, 20.0F, 12.0F});
        this.tailModel[13].rotateAngleX = 4.712389F;
        this.tailModel[13].rotateAngleY = (float)Math.PI;
        this.tailModel[13].setRotationPoint(74.0F, -26.0F, -1.0F);
        this.tailModel[14].addShape3D(0.0F, 0.0F, -1.0F, (Shape2D)(new Shape2D(new Coord2D[]{new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(12.0D, 0.0D, 12, 0), new Coord2D(12.0D, 20.0D, 12, 20), new Coord2D(8.0D, 25.0D, 8, 25), new Coord2D(3.0D, 19.0D, 3, 19), new Coord2D(0.0D, 7.0D, 0, 7)})), 1.0F, 12, 25, 67, 1, 0, new float[]{7.0F, 13.0F, 8.0F, 7.0F, 20.0F, 12.0F});
        this.tailModel[14].rotateAngleX = (float)Math.PI / 2F;
        this.tailModel[14].rotateAngleY = (float)Math.PI;
        this.tailModel[14].setRotationPoint(74.0F, -26.0F, 1.0F);
        if(this.VarGear) {
        }

        if(this.VarDoor) {
        }

        if(this.VarWing) {
        }

        this.rightWingModel = new ModelRendererTurbo[11];
        this.rightWingModel[0] = new ModelRendererTurbo(this, 0, 420, this.textureX, this.textureY);
        this.rightWingModel[1] = new ModelRendererTurbo(this, 30, 420, this.textureX, this.textureY);
        this.rightWingModel[2] = new ModelRendererTurbo(this, 40, 420, this.textureX, this.textureY);
        this.rightWingModel[3] = new ModelRendererTurbo(this, 70, 420, this.textureX, this.textureY);
        this.rightWingModel[4] = new ModelRendererTurbo(this, 90, 420, this.textureX, this.textureY);
        this.rightWingModel[5] = new ModelRendererTurbo(this, 90, 425, this.textureX, this.textureY);
        this.rightWingModel[6] = new ModelRendererTurbo(this, 155, 420, this.textureX, this.textureY);
        this.rightWingModel[7] = new ModelRendererTurbo(this, 190, 420, this.textureX, this.textureY);
        this.rightWingModel[8] = new ModelRendererTurbo(this, 0, 350, this.textureX, this.textureY);
        this.rightWingModel[9] = new ModelRendererTurbo(this, 0, 260, this.textureX, this.textureY);
        this.rightWingModel[10] = new ModelRendererTurbo(this, 0, 260, this.textureX, this.textureY);
        this.rightWingModel[4].addBox(0.0F, 0.0F, 0.0F, 30, 1, 1, 0.0F);
        this.rightWingModel[4].setRotationPoint(-35.0F, -13.0F, -32.0F);
        this.rightWingModel[5].addBox(0.0F, 0.0F, 0.0F, 22, 1, 1, 0.0F);
        this.rightWingModel[5].setRotationPoint(-31.0F, -13.5F, -35.0F);
        this.rightWingModel[6].addTrapezoid(0.0F, 0.0F, 0.0F, 10, 2, 6, 0.0F, -2.0F, 5);
        this.rightWingModel[6].setRotationPoint(-5.0F, -13.3F, -31.0F);
        this.rightWingModel[6].rotateAngleX = 3.071779F;
        this.rightWingModel[7].addBox(0.0F, 0.0F, 0.0F, 14, 3, 3, 0.0F);
        this.rightWingModel[7].setRotationPoint(2.0F, -7.0F, -15.0F);
        this.rightWingModel[7].rotateAngleX = 3.045599F;
        this.rightWingModel[7].rotateAngleY = 0.01745329F;
        this.rightWingModel[7].rotateAngleZ = 0.01745329F;
        this.rightWingModel[8].addShape3D(0.0F, 0.0F, 0.0F, (Shape2D)(new Shape2D(new Coord2D[]{new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(54.0D, 0.0D, 54, 0), new Coord2D(44.0D, 8.0D, 44, 8), new Coord2D(0.0D, 8.0D, 0, 8)})), 4.0F, 54, 8, 119, 4, 0, new float[]{8.0F, 44.0F, 13.0F, 54.0F});
        this.rightWingModel[8].rotateAngleX = 4.712389F;
        this.rightWingModel[8].rotateAngleY = (float)Math.PI;
        this.rightWingModel[8].setRotationPoint(-21.0F, -9.0F, -7.0F);
        this.rightWingModel[9].addShape3D(0.0F, 0.0F, 0.0F, (Shape2D)(new Shape2D(new Coord2D[]{new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(44.0D, 0.0D, 44, 0), new Coord2D(42.0D, 17.0D, 42, 17), new Coord2D(39.0D, 36.0D, 39, 36), new Coord2D(34.0D, 54.0D, 34, 54), new Coord2D(27.0D, 70.0D, 27, 70), new Coord2D(19.0D, 79.0D, 19, 79), new Coord2D(16.0D, 80.0D, 16, 80), new Coord2D(13.0D, 80.0D, 13, 80), new Coord2D(10.0D, 77.0D, 10, 77), new Coord2D(5.0D, 57.0D, 5, 57), new Coord2D(2.0D, 35.0D, 2, 35)})), 2.0F, 44, 80, 224, 2, 0, new float[]{36.0F, 23.0F, 21.0F, 5.0F, 3.0F, 4.0F, 13.0F, 18.0F, 19.0F, 20.0F, 18.0F, 44.0F});
        this.rightWingModel[9].rotateAngleX = 4.808382F;
        this.rightWingModel[9].rotateAngleY = (float)Math.PI;
        this.rightWingModel[9].setRotationPoint(-21.0F, -9.0F, -15.0F);
        this.rightWingModel[10].addShape3D(0.0F, 0.0F, 0.0F, (Shape2D)(new Shape2D(new Coord2D[]{new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(44.0D, 0.0D, 44, 0), new Coord2D(42.0D, 17.0D, 42, 17), new Coord2D(39.0D, 36.0D, 39, 36), new Coord2D(34.0D, 54.0D, 34, 54), new Coord2D(27.0D, 70.0D, 27, 70), new Coord2D(19.0D, 79.0D, 19, 79), new Coord2D(16.0D, 80.0D, 16, 80), new Coord2D(13.0D, 80.0D, 13, 80), new Coord2D(10.0D, 77.0D, 10, 77), new Coord2D(5.0D, 57.0D, 5, 57), new Coord2D(2.0D, 35.0D, 2, 35)})), 2.0F, 44, 80, 224, 2, 0, new float[]{36.0F, 23.0F, 21.0F, 5.0F, 3.0F, 4.0F, 13.0F, 18.0F, 19.0F, 20.0F, 18.0F, 44.0F});
        this.rightWingModel[10].rotateAngleX = 4.7822022F;
        this.rightWingModel[10].rotateAngleY = (float)Math.PI;
        this.rightWingModel[10].setRotationPoint(-21.0F, -11.0F, -15.0F);
        if(this.VarGear) {
            this.rightWingModel[0].addBox(0.0F, 0.0F, 0.0F, 9, 9, 3, 0.0F);
            this.rightWingModel[0].setRotationPoint(-19.0F, 1.0F, -18.0F);
            this.rightWingModel[1].addBox(0.0F, 0.0F, 0.0F, 3, 17, 1, 0.0F);
            this.rightWingModel[1].setRotationPoint(-12.0F, -11.0F, -15.0F);
            this.rightWingModel[1].rotateAngleZ = -0.2617994F;
            this.rightWingModel[2].addBox(0.0F, 0.0F, 0.0F, 11, 6, 1, 0.0F);
            this.rightWingModel[2].setRotationPoint(-20.0F, 1.0F, -14.0F);
            this.rightWingModel[3].addBox(0.0F, 0.0F, 0.0F, 5, 14, 1, 0.0F);
            this.rightWingModel[3].setRotationPoint(-13.0F, -11.0F, -14.0F);
            this.rightWingModel[3].rotateAngleZ = -0.2617994F;
        }

        if(this.VarDoor) {
        }

        if(this.VarWing) {
        }

        this.leftWingModel = new ModelRendererTurbo[12];
        this.leftWingModel[0] = new ModelRendererTurbo(this, 0, 450, this.textureX, this.textureY);
        this.leftWingModel[1] = new ModelRendererTurbo(this, 30, 450, this.textureX, this.textureY);
        this.leftWingModel[2] = new ModelRendererTurbo(this, 40, 450, this.textureX, this.textureY);
        this.leftWingModel[3] = new ModelRendererTurbo(this, 70, 450, this.textureX, this.textureY);
        this.leftWingModel[4] = new ModelRendererTurbo(this, 90, 450, this.textureX, this.textureY);
        this.leftWingModel[5] = new ModelRendererTurbo(this, 90, 455, this.textureX, this.textureY);
        this.leftWingModel[6] = new ModelRendererTurbo(this, 155, 450, this.textureX, this.textureY);
        this.leftWingModel[7] = new ModelRendererTurbo(this, 190, 450, this.textureX, this.textureY);
        this.leftWingModel[8] = new ModelRendererTurbo(this, 225, 450, this.textureX, this.textureY);
        this.leftWingModel[9] = new ModelRendererTurbo(this, 130, 350, this.textureX, this.textureY);
        this.leftWingModel[10] = new ModelRendererTurbo(this, 230, 260, this.textureX, this.textureY);
        this.leftWingModel[11] = new ModelRendererTurbo(this, 230, 260, this.textureX, this.textureY);
        this.leftWingModel[4].addBox(0.0F, 0.0F, 0.0F, 30, 1, 1, 0.0F);
        this.leftWingModel[4].setRotationPoint(-35.0F, -13.0F, 31.0F);
        this.leftWingModel[5].addBox(0.0F, 0.0F, 0.0F, 22, 1, 1, 0.0F);
        this.leftWingModel[5].setRotationPoint(-31.0F, -13.5F, 34.0F);
        this.leftWingModel[6].addTrapezoid(0.0F, 0.0F, 0.0F, 10, 2, 6, 0.0F, -2.0F, 5);
        this.leftWingModel[6].setRotationPoint(5.0F, -13.3F, 31.0F);
        this.leftWingModel[6].rotateAngleX = 3.071779F;
        this.leftWingModel[6].rotateAngleY = 3.141593F;
        this.leftWingModel[7].addBox(0.0F, 0.0F, 0.0F, 9, 3, 6, 0.0F);
        this.leftWingModel[7].setRotationPoint(7.0F, -7.0F, 15.0F);
        this.leftWingModel[7].rotateAngleX = 3.045599F;
        this.leftWingModel[7].rotateAngleY = 3.141593F;
        this.leftWingModel[8].addTrapezoid(0.0F, 0.0F, 0.0F, 12, 3, 6, 0.0F, -0.5F, 3);
        this.leftWingModel[8].setRotationPoint(19.0F, -9.0F, 15.0F);
        this.leftWingModel[8].rotateAngleX = 3.045599F;
        this.leftWingModel[8].rotateAngleY = -3.141593F;
        this.leftWingModel[8].rotateAngleZ = 0.1745329F;
        this.leftWingModel[9].addShape3D(0.0F, 0.0F, -4.0F, (Shape2D)(new Shape2D(new Coord2D[]{new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(54.0D, 0.0D, 54, 0), new Coord2D(44.0D, 8.0D, 44, 8), new Coord2D(0.0D, 8.0D, 0, 8)})), 4.0F, 54, 8, 119, 4, 0, new float[]{8.0F, 44.0F, 13.0F, 54.0F});
        this.leftWingModel[9].rotateAngleX = (float)Math.PI / 2F;
        this.leftWingModel[9].rotateAngleY = (float)Math.PI;
        this.leftWingModel[9].setRotationPoint(-21.0F, -9.0F, 7.0F);
        this.leftWingModel[10].addShape3D(0.0F, 0.0F, -2.0F, (Shape2D)(new Shape2D(new Coord2D[]{new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(44.0D, 0.0D, 44, 0), new Coord2D(42.0D, 17.0D, 42, 17), new Coord2D(39.0D, 36.0D, 39, 36), new Coord2D(34.0D, 54.0D, 34, 54), new Coord2D(27.0D, 70.0D, 27, 70), new Coord2D(19.0D, 79.0D, 19, 79), new Coord2D(16.0D, 80.0D, 16, 80), new Coord2D(13.0D, 80.0D, 13, 80), new Coord2D(10.0D, 77.0D, 10, 77), new Coord2D(5.0D, 57.0D, 5, 57), new Coord2D(2.0D, 35.0D, 2, 35)})), 2.0F, 44, 80, 224, 2, 0, new float[]{36.0F, 23.0F, 21.0F, 5.0F, 3.0F, 4.0F, 13.0F, 18.0F, 19.0F, 20.0F, 18.0F, 44.0F});
        this.leftWingModel[10].rotateAngleX = 1.4748032F;
        this.leftWingModel[10].rotateAngleY = (float)Math.PI;
        this.leftWingModel[10].setRotationPoint(-21.0F, -9.0F, 15.0F);
        this.leftWingModel[11].addShape3D(0.0F, 0.0F, -2.0F, (Shape2D)(new Shape2D(new Coord2D[]{new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(44.0D, 0.0D, 44, 0), new Coord2D(42.0D, 17.0D, 42, 17), new Coord2D(39.0D, 36.0D, 39, 36), new Coord2D(34.0D, 54.0D, 34, 54), new Coord2D(27.0D, 70.0D, 27, 70), new Coord2D(19.0D, 79.0D, 19, 79), new Coord2D(16.0D, 80.0D, 16, 80), new Coord2D(13.0D, 80.0D, 13, 80), new Coord2D(10.0D, 77.0D, 10, 77), new Coord2D(5.0D, 57.0D, 5, 57), new Coord2D(2.0D, 35.0D, 2, 35)})), 2.0F, 44, 80, 224, 2, 0, new float[]{36.0F, 23.0F, 21.0F, 5.0F, 3.0F, 4.0F, 13.0F, 18.0F, 19.0F, 20.0F, 18.0F, 44.0F});
        this.leftWingModel[11].rotateAngleX = 1.5009832F;
        this.leftWingModel[11].rotateAngleY = (float)Math.PI;
        this.leftWingModel[11].setRotationPoint(-21.0F, -11.0F, 15.0F);
        if(this.VarGear) {
            this.leftWingModel[0].addBox(0.0F, 0.0F, 0.0F, 9, 9, 3, 0.0F);
            this.leftWingModel[0].setRotationPoint(-19.0F, 1.0F, 15.0F);
            this.leftWingModel[1].addBox(0.0F, 0.0F, 0.0F, 3, 17, 1, 0.0F);
            this.leftWingModel[1].setRotationPoint(-12.0F, -11.0F, 14.0F);
            this.leftWingModel[1].rotateAngleZ = -0.2617994F;
            this.leftWingModel[2].addBox(0.0F, 0.0F, 0.0F, 11, 6, 1, 0.0F);
            this.leftWingModel[2].setRotationPoint(-20.0F, 1.0F, 13.0F);
            this.leftWingModel[3].addBox(0.0F, 0.0F, 0.0F, 5, 14, 1, 0.0F);
            this.leftWingModel[3].setRotationPoint(-13.0F, -11.0F, 13.0F);
            this.leftWingModel[3].rotateAngleZ = -0.2617994F;
        }

        if(this.VarDoor) {
        }

        if(this.VarWing) {
        }

        this.propellerModels = new ModelRendererTurbo[1][3];
        this.propellerModels[0] = this.makeProp1(-42, -19, 0);
        this.yawFlapModel = new ModelRendererTurbo[3];
        this.yawFlapModel[0] = new ModelRendererTurbo(this, 20, 410, this.textureX, this.textureY);
        this.yawFlapModel[1] = new ModelRendererTurbo(this, 210, 370, this.textureX, this.textureY);
        this.yawFlapModel[2] = new ModelRendererTurbo(this, 240, 370, this.textureX, this.textureY);
        this.yawFlapModel[0].addBox(0.0F, 0.0F, 0.0F, 5, 2, 1, 0.0F);
        this.yawFlapModel[0].setRotationPoint(6.0F, -17.0F, 0.5F);
        this.yawFlapModel[0].rotateAngleX = 3.141593F;
        this.yawFlapModel[0].rotateAngleZ = 1.570796F;
        this.yawFlapModel[1].addShape3D(10.0F, 0.0F, -1.0F, (Shape2D)(new Shape2D(new Coord2D[]{new Coord2D(10.0D, 27.0D, 10, 27), new Coord2D(8.0D, 27.0D, 8, 27), new Coord2D(4.0D, 24.0D, 4, 24), new Coord2D(2.0D, 20.0D, 2, 20), new Coord2D(0.0D, 12.0D, 0, 12), new Coord2D(0.0D, 5.0D, 0, 5), new Coord2D(4.0D, 2.0D, 4, 2), new Coord2D(10.0D, 0.0D, 10, 0)})), 2.0F, 10, 27, 67, 2, 0, new float[]{27.0F, 7.0F, 5.0F, 7.0F, 9.0F, 5.0F, 5.0F, 2.0F});
        this.yawFlapModel[1].setRotationPoint(89.0F, -17.0F, 0.0F);
        this.yawFlapModel[1].rotateAngleY = (float)Math.PI;
        this.yawFlapModel[2].addShape3D(0.0F, 24.0F, -1.0F, (Shape2D)(new Shape2D(new Coord2D[]{new Coord2D(3.0D, 2.0D, 3, 2), new Coord2D(0.0D, 3.0D, 0, 3), new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(5.0D, 0.0D, 5, 0)})), 2.0F, 5, 3, 15, 2, 0, new float[]{3.0F, 5.0F, 3.0F, 4.0F});
        this.yawFlapModel[2].setRotationPoint(89.0F, -17.0F, 0.0F);
        this.yawFlapModel[2].rotateAngleY = (float)Math.PI;
        this.pitchFlapRightModel = new ModelRendererTurbo[2];
        this.pitchFlapRightModel[0] = new ModelRendererTurbo(this, 150, 220, this.textureX, this.textureY);
        this.pitchFlapRightModel[1] = new ModelRendererTurbo(this, 290, 220, this.textureX, this.textureY);
        this.pitchFlapRightModel[0].addShape3D(0.0F, 0.0F, -0.5F, (Shape2D)(new Shape2D(new Coord2D[]{new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(3.0D, 0.0D, 3, 0), new Coord2D(8.0D, 3.0D, 8, 3), new Coord2D(8.0D, 14.0D, 8, 14), new Coord2D(6.0D, 20.0D, 6, 20), new Coord2D(5.0D, 23.0D, 5, 23), new Coord2D(2.0D, 26.0D, 2, 26), new Coord2D(0.0D, 26.0D, 0, 26)})), 1.0F, 8, 26, 64, 1, 0, new float[]{26.0F, 2.0F, 5.0F, 4.0F, 7.0F, 11.0F, 6.0F, 3.0F});
        this.pitchFlapRightModel[0].setRotationPoint(86.0F, -26.5F, -1.0F);
        this.pitchFlapRightModel[0].rotateAngleX = 4.712389F;
        this.pitchFlapRightModel[0].rotateAngleZ = (float)Math.PI;
        this.pitchFlapRightModel[0].rotateAngleY = (float)Math.PI;
        this.pitchFlapRightModel[1].addShape3D(4.0F, 20.0F, -0.5F, (Shape2D)(new Shape2D(new Coord2D[]{new Coord2D(0.0D, 5.0D, 0, 5), new Coord2D(4.0D, 0.0D, 4, 0), new Coord2D(4.0D, 6.0D, 4, 6), new Coord2D(2.0D, 6.0D, 2, 6)})), 1.0F, 4, 6, 18, 1, 0, new float[]{3.0F, 2.0F, 6.0F, 7.0F});
        this.pitchFlapRightModel[1].setRotationPoint(86.0F, -26.5F, -1.0F);
        this.pitchFlapRightModel[1].rotateAngleX = 4.712389F;
        this.pitchFlapRightModel[1].rotateAngleZ = (float)Math.PI;
        this.pitchFlapRightModel[1].rotateAngleY = (float)Math.PI;
        this.pitchFlapLeftModel = new ModelRendererTurbo[2];
        this.pitchFlapLeftModel[0] = new ModelRendererTurbo(this, 220, 220, this.textureX, this.textureY);
        this.pitchFlapLeftModel[1] = new ModelRendererTurbo(this, 290, 230, this.textureX, this.textureY);
        this.pitchFlapLeftModel[0].addShape3D(0.0F, 0.0F, -0.5F, (Shape2D)(new Shape2D(new Coord2D[]{new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(3.0D, 0.0D, 3, 0), new Coord2D(8.0D, 3.0D, 8, 3), new Coord2D(8.0D, 14.0D, 8, 14), new Coord2D(6.0D, 20.0D, 6, 20), new Coord2D(5.0D, 23.0D, 5, 23), new Coord2D(2.0D, 26.0D, 2, 26), new Coord2D(0.0D, 26.0D, 0, 26)})), 1.0F, 8, 26, 64, 1, 0, new float[]{26.0F, 2.0F, 5.0F, 4.0F, 7.0F, 11.0F, 6.0F, 3.0F});
        this.pitchFlapLeftModel[0].setRotationPoint(86.0F, -26.5F, 1.0F);
        this.pitchFlapLeftModel[0].rotateAngleX = (float)Math.PI / 2F;
        this.pitchFlapLeftModel[0].rotateAngleZ = (float)Math.PI;
        this.pitchFlapLeftModel[0].rotateAngleY = (float)Math.PI;
        this.pitchFlapLeftModel[1].addShape3D(4.0F, 20.0F, -0.5F, (Shape2D)(new Shape2D(new Coord2D[]{new Coord2D(0.0D, 5.0D, 0, 5), new Coord2D(4.0D, 0.0D, 4, 0), new Coord2D(4.0D, 6.0D, 4, 6), new Coord2D(2.0D, 6.0D, 2, 6)})), 1.0F, 4, 6, 18, 1, 0, new float[]{3.0F, 2.0F, 6.0F, 7.0F});
        this.pitchFlapLeftModel[1].setRotationPoint(86.0F, -26.5F, 1.0F);
        this.pitchFlapLeftModel[1].rotateAngleX = (float)Math.PI / 2F;
        this.pitchFlapLeftModel[1].rotateAngleZ = (float)Math.PI;
        this.pitchFlapLeftModel[1].rotateAngleY = (float)Math.PI;
        this.pitchFlapLeftWingModel = new ModelRendererTurbo[0];
        this.pitchFlapRightWingModel = new ModelRendererTurbo[0];
        this.topWingModel = new ModelRendererTurbo[0];
        this.translateAll(0, 0, 0);
        this.flipAll();
//        this.collisionBoxes = new CollisionBox[13];
//        this.collisionBoxes[0] = new CollisionBox(0, 19, 0, 0);
//        this.collisionBoxes[1] = new CollisionBox(0, 19, 20, 0);
//        this.collisionBoxes[2] = new CollisionBox(0, 19, 40, 0);
//        this.collisionBoxes[3] = new CollisionBox(0, 25, -25, 0);
//        this.collisionBoxes[4] = new CollisionBox(0, 25, -45, 3);
//        this.collisionBoxes[5] = new CollisionBox(0, 25, -65, 3);
//        this.collisionBoxes[6] = new CollisionBox(0, 30, -85, 3);
//        this.collisionBoxes[7] = new CollisionBox(-20, 12, 0, 1);
//        this.collisionBoxes[8] = new CollisionBox(-50, 15, 0, 1);
//        this.collisionBoxes[9] = new CollisionBox(-80, 18, 0, 1);
//        this.collisionBoxes[10] = new CollisionBox(20, 12, 0, 2);
//        this.collisionBoxes[11] = new CollisionBox(50, 15, 0, 2);
//        this.collisionBoxes[12] = new CollisionBox(80, 18, 0, 2);
    }

    private ModelRendererTurbo[] makeProp1(int i, int j, int k) {
        ModelRendererTurbo[] prop = new ModelRendererTurbo[]{new ModelRendererTurbo(this, 0, 480, this.textureX, this.textureY), new ModelRendererTurbo(this, 0, 480, this.textureX, this.textureY), new ModelRendererTurbo(this, 0, 480, this.textureX, this.textureY)};
        prop[0].addBox(-1.0F, -25.0F, -2.0F, 1, 25, 3, 0.0F);
        prop[1].addBox(-1.0F, -25.0F, -2.0F, 1, 25, 3, 0.0F);
        prop[2].addBox(-1.0F, -25.0F, -2.0F, 1, 25, 3, 0.0F);
        prop[0].setRotationPoint((float)i, (float)j, (float)k);
        prop[1].setRotationPoint((float)i, (float)j, (float)k);
        prop[2].setRotationPoint((float)i, (float)j, (float)k);
        return prop;
    }
}

