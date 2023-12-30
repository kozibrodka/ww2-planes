package net.kozibrodka.planes.model;

import net.kozibrodka.tmt.TURBO_MODEL_125.*;

public class ModelJU87_125 extends ModelPlaneNew {
    int textureX = 512;
    int textureY = 512;
    boolean VarGear = true;
    boolean VarDoor = true;
    boolean VarWing = true;

    public ModelJU87_125() {
        this.bodyModel = new ModelRendererTurbo[56];
        this.bodyModel[0] = new ModelRendererTurbo(this, 0, 480, this.textureX, this.textureY);
        this.bodyModel[1] = new ModelRendererTurbo(this, 48, 480, this.textureX, this.textureY);
        this.bodyModel[2] = new ModelRendererTurbo(this, 90, 480, this.textureX, this.textureY);
        this.bodyModel[3] = new ModelRendererTurbo(this, 210, 480, this.textureX, this.textureY);
        this.bodyModel[4] = new ModelRendererTurbo(this, 0, 504, this.textureX, this.textureY);
        this.bodyModel[5] = new ModelRendererTurbo(this, 267, 492, this.textureX, this.textureY);
        this.bodyModel[6] = new ModelRendererTurbo(this, 312, 480, this.textureX, this.textureY);
        this.bodyModel[7] = new ModelRendererTurbo(this, 330, 490, this.textureX, this.textureY);
        this.bodyModel[8] = new ModelRendererTurbo(this, 352, 480, this.textureX, this.textureY);
        this.bodyModel[9] = new ModelRendererTurbo(this, 26, 501, this.textureX, this.textureY);
        this.bodyModel[10] = new ModelRendererTurbo(this, 410, 476, this.textureX, this.textureY);
        this.bodyModel[11] = new ModelRendererTurbo(this, 410, 495, this.textureX, this.textureY);
        this.bodyModel[12] = new ModelRendererTurbo(this, 420, 430, this.textureX, this.textureY);
        this.bodyModel[13] = new ModelRendererTurbo(this, 0, 455, this.textureX, this.textureY);
        this.bodyModel[14] = new ModelRendererTurbo(this, 35, 455, this.textureX, this.textureY);
        this.bodyModel[15] = new ModelRendererTurbo(this, 35, 472, this.textureX, this.textureY);
        this.bodyModel[16] = new ModelRendererTurbo(this, 55, 472, this.textureX, this.textureY);
        this.bodyModel[17] = new ModelRendererTurbo(this, 80, 455, this.textureX, this.textureY);
        this.bodyModel[18] = new ModelRendererTurbo(this, 194, 463, this.textureX, this.textureY);
        this.bodyModel[19] = new ModelRendererTurbo(this, 233, 455, this.textureX, this.textureY);
        this.bodyModel[20] = new ModelRendererTurbo(this, 279, 463, this.textureX, this.textureY);
        this.bodyModel[21] = new ModelRendererTurbo(this, 320, 455, this.textureX, this.textureY);
        this.bodyModel[22] = new ModelRendererTurbo(this, 65, 455, this.textureX, this.textureY);
        this.bodyModel[23] = new ModelRendererTurbo(this, 72, 455, this.textureX, this.textureY);
        this.bodyModel[24] = new ModelRendererTurbo(this, 85, 455, this.textureX, this.textureY);
        this.bodyModel[25] = new ModelRendererTurbo(this, 0, 455, this.textureX, this.textureY);
        this.bodyModel[26] = new ModelRendererTurbo(this, 25, 455, this.textureX, this.textureY);
        this.bodyModel[27] = new ModelRendererTurbo(this, 0, 420, this.textureX, this.textureY);
        this.bodyModel[28] = new ModelRendererTurbo(this, 25, 420, this.textureX, this.textureY);
        this.bodyModel[29] = new ModelRendererTurbo(this, 15, 436, this.textureX, this.textureY);
        this.bodyModel[30] = new ModelRendererTurbo(this, 45, 433, this.textureX, this.textureY);
        this.bodyModel[31] = new ModelRendererTurbo(this, 70, 415, this.textureX, this.textureY);
        this.bodyModel[32] = new ModelRendererTurbo(this, 90, 430, this.textureX, this.textureY);
        this.bodyModel[33] = new ModelRendererTurbo(this, 100, 430, this.textureX, this.textureY);
        this.bodyModel[34] = new ModelRendererTurbo(this, 110, 430, this.textureX, this.textureY);
        this.bodyModel[35] = new ModelRendererTurbo(this, 120, 430, this.textureX, this.textureY);
        this.bodyModel[36] = new ModelRendererTurbo(this, 130, 430, this.textureX, this.textureY);
        this.bodyModel[37] = new ModelRendererTurbo(this, 140, 430, this.textureX, this.textureY);
        this.bodyModel[38] = new ModelRendererTurbo(this, 90, 445, this.textureX, this.textureY);
        this.bodyModel[39] = new ModelRendererTurbo(this, 150, 430, this.textureX, this.textureY);
        this.bodyModel[40] = new ModelRendererTurbo(this, 170, 435, this.textureX, this.textureY);
        this.bodyModel[41] = new ModelRendererTurbo(this, 190, 430, this.textureX, this.textureY);
        this.bodyModel[42] = new ModelRendererTurbo(this, 210, 435, this.textureX, this.textureY);
        this.bodyModel[43] = new ModelRendererTurbo(this, 225, 430, this.textureX, this.textureY);
        this.bodyModel[44] = new ModelRendererTurbo(this, 240, 435, this.textureX, this.textureY);
        this.bodyModel[45] = new ModelRendererTurbo(this, 90, 450, this.textureX, this.textureY);
        this.bodyModel[46] = new ModelRendererTurbo(this, 270, 430, this.textureX, this.textureY);
        this.bodyModel[47] = new ModelRendererTurbo(this, 280, 430, this.textureX, this.textureY);
        this.bodyModel[48] = new ModelRendererTurbo(this, 280, 445, this.textureX, this.textureY);
        this.bodyModel[49] = new ModelRendererTurbo(this, 340, 430, this.textureX, this.textureY);
        this.bodyModel[50] = new ModelRendererTurbo(this, 370, 445, this.textureX, this.textureY);
        this.bodyModel[51] = new ModelRendererTurbo(this, 304, 443, this.textureX, this.textureY);
        this.bodyModel[52] = new ModelRendererTurbo(this, 370, 464, this.textureX, this.textureY);
        this.bodyModel[53] = new ModelRendererTurbo(this, 400, 405, this.textureX, this.textureY);
        this.bodyModel[54] = new ModelRendererTurbo(this, 360, 375, this.textureX, this.textureY);
        this.bodyModel[55] = new ModelRendererTurbo(this, 360, 385, this.textureX, this.textureY);
        this.bodyModel[0].addTrapezoid(0.0F, 0.0F, 0.0F, 12, 10, 10, 0.0F, -3.5F, 3);
        this.bodyModel[0].setRotationPoint(-57.0F, -35.0F, -5.0F);
        this.bodyModel[1].addTrapezoid(0.0F, 0.0F, 0.0F, 3, 16, 16, 0.0F, -3.0F, 3);
        this.bodyModel[1].setRotationPoint(-45.0F, -38.0F, -8.0F);
        this.bodyModel[2].addBox(0.0F, 0.0F, 0.0F, 42, 16, 16, 0.0F);
        this.bodyModel[2].setRotationPoint(-42.0F, -38.0F, -8.0F);
        this.bodyModel[3].addBox(0.0F, 0.0F, 0.0F, 16, 1, 18, 0.0F);
        this.bodyModel[3].setRotationPoint(-38.0F, -26.0F, -9.0F);
        this.bodyModel[4].addBox(0.0F, 0.0F, 0.0F, 9, 3, 3, 0.0F);
        this.bodyModel[4].setRotationPoint(-28.0F, -32.0F, 7.0F);
        this.bodyModel[4].rotateAngleY = -0.1745329F;
        this.bodyModel[5].addTrapezoid(0.0F, 0.0F, 0.0F, 14, 5, 14, 0.0F, -1.0F, 5);
        this.bodyModel[5].setRotationPoint(-32.0F, -22.0F, -7.0F);
        this.bodyModel[6].addBox(0.0F, 0.0F, 0.0F, 4, 11, 12, 0.0F);
        this.bodyModel[6].setRotationPoint(-19.0F, -18.0F, -6.0F);
        this.bodyModel[6].rotateAngleZ = 1.833938F;
        this.bodyModel[7].addBox(0.0F, 0.0F, 0.0F, 2, 4, 16, 0.0F);
        this.bodyModel[7].setRotationPoint(-2.0F, -42.0F, -8.0F);
        this.bodyModel[8].addBox(0.0F, 0.0F, 0.0F, 13, 2, 14, 0.0F);
        this.bodyModel[8].setRotationPoint(0.0F, -41.0F, -7.0F);
        this.bodyModel[8].rotateAngleZ = -1.413717F;
        this.bodyModel[9].addBox(0.0F, 0.0F, 0.0F, 6, 7, 4, 0.0F);
        this.bodyModel[9].setRotationPoint(0.0F, -30.0F, -2.0F);
        this.bodyModel[10].addBox(0.0F, 0.0F, 0.0F, 45, 16, 1, 0.0F);
        this.bodyModel[10].setRotationPoint(0.0F, -39.0F, 7.0F);
        this.bodyModel[11].addBox(0.0F, 0.0F, 0.0F, 45, 16, 1, 0.0F);
        this.bodyModel[11].setRotationPoint(0.0F, -39.0F, -8.0F);
        this.bodyModel[12].addBox(0.0F, 0.0F, 0.0F, 11, 17, 16, 0.0F);
        this.bodyModel[12].setRotationPoint(45.0F, -39.0F, -8.0F);
        this.bodyModel[13].addBox(0.0F, 0.0F, 0.0F, 2, 7, 14, 0.0F);
        this.bodyModel[13].setRotationPoint(45.0F, -37.0F, -7.0F);
        this.bodyModel[13].rotateAngleZ = -0.296706F;
        this.bodyModel[14].addBox(0.0F, 0.0F, 0.0F, 6, 2, 14, 0.0F);
        this.bodyModel[14].setRotationPoint(38.0F, -32.0F, -7.0F);
        this.bodyModel[15].addBox(0.0F, 0.0F, 0.0F, 6, 3, 3, 0.0F);
        this.bodyModel[15].setRotationPoint(37.0F, -35.0F, -7.0F);
        this.bodyModel[16].addBox(0.0F, 0.0F, 0.0F, 6, 3, 3, 0.0F);
        this.bodyModel[16].setRotationPoint(37.0F, -35.0F, 4.0F);
        this.bodyModel[17].addBox(0.0F, 0.0F, 0.0F, 45, 1, 16, 0.0F);
        this.bodyModel[17].setRotationPoint(0.0F, -23.0F, -8.0F);
        this.bodyModel[18].addBox(0.0F, 0.0F, 0.0F, 12, 3, 12, 0.0F);
        this.bodyModel[18].setRotationPoint(5.0F, -26.0F, -6.0F);
        this.bodyModel[19].addBox(0.0F, 0.0F, 0.0F, 16, 1, 12, 0.0F);
        this.bodyModel[19].setRotationPoint(20.0F, -40.0F, 6.0F);
        this.bodyModel[19].rotateAngleY = 3.141593F;
        this.bodyModel[19].rotateAngleZ = 1.361357F;
        this.bodyModel[20].addBox(0.0F, 0.0F, 0.0F, 12, 3, 12, 0.0F);
        this.bodyModel[20].setRotationPoint(26.0F, -26.0F, -6.0F);
        this.bodyModel[21].addBox(0.0F, 0.0F, 0.0F, 16, 1, 12, 0.0F);
        this.bodyModel[21].setRotationPoint(23.0F, -40.0F, -6.0F);
        this.bodyModel[21].rotateAngleZ = -1.361357F;
        this.bodyModel[22].addBox(0.0F, 0.0F, 0.0F, 1, 4, 1, 0.0F);
        this.bodyModel[22].setRotationPoint(38.0F, -40.0F, -0.5F);
        this.bodyModel[23].addBox(0.0F, 0.0F, 0.0F, 3, 7, 2, 0.0F);
        this.bodyModel[23].setRotationPoint(42.0F, -43.0F, -1.0F);
        this.bodyModel[23].rotateAngleZ = -1.256637F;
        this.bodyModel[24].addBox(0.0F, 0.0F, 0.0F, 1, 13, 1, 0.0F);
        this.bodyModel[24].setRotationPoint(54.0F, -46.0F, -0.5F);
        this.bodyModel[24].rotateAngleZ = -1.256637F;
        this.bodyModel[25].addTrapezoid(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, -0.4F, 3);
        this.bodyModel[25].setRotationPoint(52.0F, -47.0F, -0.5F);
        this.bodyModel[25].rotateAngleZ = -1.256637F;
        this.bodyModel[26].addBox(0.0F, 0.0F, 0.0F, 3, 3, 6, 0.0F);
        this.bodyModel[26].setRotationPoint(42.0F, -41.0F, -3.0F);
        this.bodyModel[26].rotateAngleZ = -1.256637F;
        this.bodyModel[27].addBox(0.0F, 0.0F, 0.0F, 1, 10, 10, 0.0F);
        this.bodyModel[27].setRotationPoint(5.0F, -49.0F, -5.0F);
        this.bodyModel[27].rotateAngleZ = -0.7853982F;
        this.bodyModel[28].addBox(0.0F, 0.0F, 0.0F, 15, 1, 10, 0.0F);
        this.bodyModel[28].setRotationPoint(5.0F, -49.0F, -5.0F);
        this.bodyModel[29].addBox(0.0F, 0.0F, 0.0F, 8, 1, 10, 0.0F);
        this.bodyModel[29].setRotationPoint(19.0F, -48.0F, -5.0F);
        this.bodyModel[30].addBox(0.0F, 0.0F, 0.0F, 10, 1, 10, 0.0F);
        this.bodyModel[30].setRotationPoint(27.0F, -49.0F, -5.0F);
        this.bodyModel[31].addBox(0.0F, 0.0F, 0.0F, 16, 1, 10, 0.0F);
        this.bodyModel[31].setRotationPoint(37.0F, -49.0F, -5.0F);
        this.bodyModel[31].rotateAngleZ = -0.7330383F;
        this.bodyModel[32].addBox(0.0F, 0.0F, 0.0F, 1, 11, 1, 0.0F);
        this.bodyModel[32].setRotationPoint(5.0F, -49.0F, -5.0F);
        this.bodyModel[32].rotateAngleX = -0.2617994F;
        this.bodyModel[33].addBox(0.0F, 0.0F, 0.0F, 1, 11, 1, 0.0F);
        this.bodyModel[33].setRotationPoint(13.0F, -49.0F, -5.0F);
        this.bodyModel[33].rotateAngleX = -0.2617994F;
        this.bodyModel[34].addBox(0.0F, 0.0F, 0.0F, 1, 11, 1, 0.0F);
        this.bodyModel[34].setRotationPoint(19.0F, -49.0F, -5.0F);
        this.bodyModel[34].rotateAngleX = -0.2617994F;
        this.bodyModel[34].rotateAngleZ = -0.1919862F;
        this.bodyModel[35].addBox(0.0F, 0.0F, 0.0F, 1, 10, 1, 0.0F);
        this.bodyModel[35].setRotationPoint(26.0F, -48.0F, -5.0F);
        this.bodyModel[35].rotateAngleX = -0.2792527F;
        this.bodyModel[36].addBox(0.0F, 0.0F, 0.0F, 1, 11, 1, 0.0F);
        this.bodyModel[36].setRotationPoint(27.0F, -49.0F, -5.0F);
        this.bodyModel[36].rotateAngleX = -0.2617994F;
        this.bodyModel[37].addBox(0.0F, 0.0F, 0.0F, 1, 11, 1, 0.0F);
        this.bodyModel[37].setRotationPoint(36.0F, -49.0F, -5.0F);
        this.bodyModel[37].rotateAngleX = -0.2617994F;
        this.bodyModel[38].addBox(0.0F, 0.0F, 0.0F, 32, 1, 1, 0.0F);
        this.bodyModel[38].setRotationPoint(5.0F, -45.0F, -6.0F);
        this.bodyModel[38].rotateAngleX = -0.2617994F;
        this.bodyModel[39].addBox(0.0F, 0.0F, 0.0F, 1, 1, 11, 0.0F);
        this.bodyModel[39].setRotationPoint(5.0F, -49.0F, 5.0F);
        this.bodyModel[39].rotateAngleX = -1.308997F;
        this.bodyModel[40].addBox(0.0F, 0.0F, 0.0F, 1, 1, 11, 0.0F);
        this.bodyModel[40].setRotationPoint(13.0F, -49.0F, 5.0F);
        this.bodyModel[40].rotateAngleX = -1.308997F;
        this.bodyModel[41].addBox(0.0F, 0.0F, 0.0F, 1, 1, 11, 0.0F);
        this.bodyModel[41].setRotationPoint(19.0F, -49.0F, 5.0F);
        this.bodyModel[41].rotateAngleX = -1.308997F;
        this.bodyModel[41].rotateAngleZ = -0.1919862F;
        this.bodyModel[42].addBox(0.0F, 0.0F, 0.0F, 1, 1, 10, 0.0F);
        this.bodyModel[42].setRotationPoint(26.0F, -48.0F, 5.0F);
        this.bodyModel[42].rotateAngleX = -1.291544F;
        this.bodyModel[43].addBox(0.0F, 0.0F, 0.0F, 1, 1, 11, 0.0F);
        this.bodyModel[43].setRotationPoint(27.0F, -49.0F, 5.0F);
        this.bodyModel[43].rotateAngleX = -1.308997F;
        this.bodyModel[44].addBox(0.0F, 0.0F, 0.0F, 1, 1, 11, 0.0F);
        this.bodyModel[44].setRotationPoint(36.0F, -49.0F, 5.0F);
        this.bodyModel[44].rotateAngleX = -1.308997F;
        this.bodyModel[45].addBox(0.0F, 0.0F, 0.0F, 32, 1, 1, 0.0F);
        this.bodyModel[45].setRotationPoint(37.0F, -45.0F, 6.0F);
        this.bodyModel[45].rotateAngleX = -0.2617994F;
        this.bodyModel[45].rotateAngleY = 3.141593F;
        this.bodyModel[46].addTrapezoid(0.0F, 0.0F, 0.0F, 2, 16, 1, 0.0F, -0.5F, 4);
        this.bodyModel[46].setRotationPoint(24.0F, -64.0F, -0.5F);
        this.bodyModel[47].addBox(0.0F, 0.0F, 0.0F, 20, 1, 9, 0.0F);
        this.bodyModel[47].setRotationPoint(-4.0F, -22.0F, -4.5F);
        this.bodyModel[47].rotateAngleZ = -0.1570796F;
        this.bodyModel[48].addTrapezoid(0.0F, 0.0F, 0.0F, 4, 7, 7, 0.0F, -2.0F, 3);
        this.bodyModel[48].setRotationPoint(6.0F, -22.0F, -3.5F);
        this.bodyModel[49].addBox(0.0F, 0.0F, 0.0F, 17, 7, 7, 0.0F);
        this.bodyModel[49].setRotationPoint(10.0F, -22.0F, -3.5F);
        this.bodyModel[50].addTrapezoid(0.0F, 0.0F, 0.0F, 9, 7, 7, 0.0F, -3.0F, 2);
        this.bodyModel[50].setRotationPoint(27.0F, -22.0F, -3.5F);
        this.bodyModel[51].addBox(0.0F, 0.0F, 0.0F, 5, 1, 9, 0.0F);
        this.bodyModel[51].setRotationPoint(37.0F, -22.0F, 3.0F);
        this.bodyModel[51].rotateAngleX = -0.7853982F;
        this.bodyModel[51].rotateAngleY = 3.141593F;
        this.bodyModel[52].addBox(0.0F, 0.0F, 0.0F, 5, 1, 9, 0.0F);
        this.bodyModel[52].setRotationPoint(32.0F, -22.0F, -3.0F);
        this.bodyModel[52].rotateAngleX = -0.7853982F;
        this.bodyModel[53].addShape3D(0.0F, 0.0F, 0.0F, (Shape2D)(new Shape2D(new Coord2D[]{new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(40.0D, 0.0D, 40, 0), new Coord2D(0.0D, 4.0D, 0, 4)})), 16.0F, 40, 4, 85, 16, 0, new float[]{4.0F, 41.0F, 40.0F});
        this.bodyModel[53].setRotationPoint(-2.0F, -38.0F, 8.0F);
        this.bodyModel[54].addShape3D(0.0F, 0.0F, 0.0F, (Shape2D)(new Shape2D(new Coord2D[]{new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(5.0D, 0.0D, 5, 0), new Coord2D(5.0D, 3.0D, 5, 3)})), 1.0F, 5, 3, 14, 1, 0, new float[]{6.0F, 3.0F, 5.0F});
        this.bodyModel[54].setRotationPoint(5.0F, -39.0F, 8.0F);
        this.bodyModel[55].addShape3D(0.0F, 0.0F, 0.0F, (Shape2D)(new Shape2D(new Coord2D[]{new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(5.0D, 0.0D, 5, 0), new Coord2D(5.0D, 3.0D, 5, 3)})), 1.0F, 5, 3, 14, 1, 0, new float[]{6.0F, 3.0F, 5.0F});
        this.bodyModel[55].setRotationPoint(5.0F, -39.0F, -7.0F);
        if(this.VarGear) {
        }

        if(this.VarDoor) {
        }

        if(this.VarWing) {
        }

        this.tailModel = new ModelRendererTurbo[21];
        this.tailModel[0] = new ModelRendererTurbo(this, 0, 370, this.textureX, this.textureY);
        this.tailModel[1] = new ModelRendererTurbo(this, 65, 365, this.textureX, this.textureY);
        this.tailModel[2] = new ModelRendererTurbo(this, 75, 374, this.textureX, this.textureY);
        this.tailModel[3] = new ModelRendererTurbo(this, 65, 387, this.textureX, this.textureY);
        this.tailModel[4] = new ModelRendererTurbo(this, 0, 370, this.textureX, this.textureY);
        this.tailModel[5] = new ModelRendererTurbo(this, 0, 380, this.textureX, this.textureY);
        this.tailModel[6] = new ModelRendererTurbo(this, 0, 390, this.textureX, this.textureY);
        this.tailModel[7] = new ModelRendererTurbo(this, 250, 340, this.textureX, this.textureY);
        this.tailModel[8] = new ModelRendererTurbo(this, 250, 340, this.textureX, this.textureY);
        this.tailModel[9] = new ModelRendererTurbo(this, 250, 340, this.textureX, this.textureY);
        this.tailModel[10] = new ModelRendererTurbo(this, 250, 340, this.textureX, this.textureY);
        this.tailModel[11] = new ModelRendererTurbo(this, 250, 340, this.textureX, this.textureY);
        this.tailModel[12] = new ModelRendererTurbo(this, 250, 340, this.textureX, this.textureY);
        this.tailModel[13] = new ModelRendererTurbo(this, 250, 340, this.textureX, this.textureY);
        this.tailModel[14] = new ModelRendererTurbo(this, 250, 340, this.textureX, this.textureY);
        this.tailModel[15] = new ModelRendererTurbo(this, 410, 340, this.textureX, this.textureY);
        this.tailModel[16] = new ModelRendererTurbo(this, 0, 300, this.textureX, this.textureY);
        this.tailModel[17] = new ModelRendererTurbo(this, 25, 300, this.textureX, this.textureY);
        this.tailModel[18] = new ModelRendererTurbo(this, 25, 315, this.textureX, this.textureY);
        this.tailModel[19] = new ModelRendererTurbo(this, 50, 300, this.textureX, this.textureY);
        this.tailModel[20] = new ModelRendererTurbo(this, 50, 310, this.textureX, this.textureY);
        this.tailModel[0].addBox(0.0F, 0.0F, 0.0F, 12, 1, 38, 0.0F);
        this.tailModel[0].setRotationPoint(102.0F, -41.0F, -39.0F);
        this.tailModel[1].addBox(0.0F, 0.0F, 0.0F, 3, 1, 18, 0.0F);
        this.tailModel[1].setRotationPoint(107.0F, -28.0F, 0.0F);
        this.tailModel[1].rotateAngleX = 0.7853982F;
        this.tailModel[1].rotateAngleY = 3.141593F;
        this.tailModel[2].addBox(0.0F, 0.0F, 0.0F, 12, 1, 38, 0.0F);
        this.tailModel[2].setRotationPoint(102.0F, -41.0F, 1.0F);
        this.tailModel[3].addBox(0.0F, 0.0F, 0.0F, 3, 1, 18, 0.0F);
        this.tailModel[3].setRotationPoint(104.0F, -28.0F, 0.0F);
        this.tailModel[3].rotateAngleX = 0.7853982F;
        this.tailModel[4].addBox(0.0F, 0.0F, 0.0F, 5, 5, 1, 0.0F);
        this.tailModel[4].setRotationPoint(114.0F, -22.0F, -0.5F);
        this.tailModel[5].addBox(0.0F, 0.0F, 0.0F, 7, 2, 2, 0.0F);
        this.tailModel[5].setRotationPoint(111.0F, -22.0F, -1.0F);
        this.tailModel[5].rotateAngleZ = -0.1745329F;
        this.tailModel[6].addBox(0.0F, 0.0F, 0.0F, 2, 6, 1, 0.0F);
        this.tailModel[6].setRotationPoint(111.0F, -26.0F, -0.5F);
        this.tailModel[7].addShape3D(0.0F, 0.0F, 0.0F, (Shape2D)(new Shape2D(new Coord2D[]{new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(62.0D, 4.0D, 62, 4), new Coord2D(62.0D, 16.0D, 62, 16), new Coord2D(0.0D, 17.0D, 0, 17)})), 2.0F, 62, 17, 155, 2, 0, new float[]{17.0F, 63.0F, 12.0F, 63.0F});
        this.tailModel[7].setRotationPoint(56.0F, -22.0F, -8.0F);
        this.tailModel[7].rotateAngleY = 3.2550392F;
        this.tailModel[8].addShape3D(0.0F, 0.0F, 0.0F, (Shape2D)(new Shape2D(new Coord2D[]{new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(62.0D, 4.0D, 62, 4), new Coord2D(62.0D, 16.0D, 62, 16), new Coord2D(0.0D, 17.0D, 0, 17)})), 2.0F, 62, 17, 155, 2, 0, new float[]{17.0F, 63.0F, 12.0F, 63.0F});
        this.tailModel[8].setRotationPoint(56.0F, -22.0F, -6.0F);
        this.tailModel[8].rotateAngleY = 3.2218778F;
        this.tailModel[9].addShape3D(0.0F, 0.0F, 0.0F, (Shape2D)(new Shape2D(new Coord2D[]{new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(62.0D, 4.0D, 62, 4), new Coord2D(62.0D, 16.0D, 62, 16), new Coord2D(0.0D, 17.0D, 0, 17)})), 2.0F, 62, 17, 155, 2, 0, new float[]{17.0F, 63.0F, 12.0F, 63.0F});
        this.tailModel[9].setRotationPoint(56.0F, -22.0F, -4.0F);
        this.tailModel[9].rotateAngleY = 3.1904619F;
        this.tailModel[10].addShape3D(0.0F, 0.0F, 0.0F, (Shape2D)(new Shape2D(new Coord2D[]{new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(62.0D, 4.0D, 62, 4), new Coord2D(62.0D, 16.0D, 62, 16), new Coord2D(0.0D, 17.0D, 0, 17)})), 2.0F, 62, 17, 155, 2, 0, new float[]{17.0F, 63.0F, 12.0F, 63.0F});
        this.tailModel[10].setRotationPoint(56.0F, -22.0F, -2.0F);
        this.tailModel[10].rotateAngleY = 3.1573007F;
        this.tailModel[11].addShape3D(0.0F, 0.0F, -2.0F, (Shape2D)(new Shape2D(new Coord2D[]{new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(62.0D, 4.0D, 62, 4), new Coord2D(62.0D, 16.0D, 62, 16), new Coord2D(0.0D, 17.0D, 0, 17)})), 2.0F, 62, 17, 155, 2, 0, new float[]{17.0F, 63.0F, 12.0F, 63.0F});
        this.tailModel[11].setRotationPoint(56.0F, -22.0F, 8.0F);
        this.tailModel[11].rotateAngleY = 3.0281463F;
        this.tailModel[12].addShape3D(0.0F, 0.0F, -2.0F, (Shape2D)(new Shape2D(new Coord2D[]{new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(62.0D, 4.0D, 62, 4), new Coord2D(62.0D, 16.0D, 62, 16), new Coord2D(0.0D, 17.0D, 0, 17)})), 2.0F, 62, 17, 155, 2, 0, new float[]{17.0F, 63.0F, 12.0F, 63.0F});
        this.tailModel[12].setRotationPoint(56.0F, -22.0F, 6.0F);
        this.tailModel[12].rotateAngleY = 3.0613077F;
        this.tailModel[13].addShape3D(0.0F, 0.0F, -2.0F, (Shape2D)(new Shape2D(new Coord2D[]{new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(62.0D, 4.0D, 62, 4), new Coord2D(62.0D, 16.0D, 62, 16), new Coord2D(0.0D, 17.0D, 0, 17)})), 2.0F, 62, 17, 155, 2, 0, new float[]{17.0F, 63.0F, 12.0F, 63.0F});
        this.tailModel[13].setRotationPoint(56.0F, -22.0F, 4.0F);
        this.tailModel[13].rotateAngleY = 3.0927236F;
        this.tailModel[14].addShape3D(0.0F, 0.0F, -2.0F, (Shape2D)(new Shape2D(new Coord2D[]{new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(62.0D, 4.0D, 62, 4), new Coord2D(62.0D, 16.0D, 62, 16), new Coord2D(0.0D, 17.0D, 0, 17)})), 2.0F, 62, 17, 155, 2, 0, new float[]{17.0F, 63.0F, 12.0F, 63.0F});
        this.tailModel[14].setRotationPoint(56.0F, -22.0F, 2.0F);
        this.tailModel[14].rotateAngleY = 3.1258848F;
        this.tailModel[15].addShape3D(0.0F, 0.0F, -1.0F, (Shape2D)(new Shape2D(new Coord2D[]{new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(8.0D, 0.0D, 8, 0), new Coord2D(8.0D, 21.0D, 8, 21), new Coord2D(0.0D, 21.0D, 0, 21)})), 2.0F, 8, 21, 58, 2, 0, new float[]{21.0F, 8.0F, 21.0F, 8.0F});
        this.tailModel[15].setRotationPoint(110.0F, -38.0F, 0.0F);
        this.tailModel[15].rotateAngleY = (float)Math.PI;
        this.tailModel[16].addShape3D(0.0F, 0.0F, -1.0F, (Shape2D)(new Shape2D(new Coord2D[]{new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(10.0D, 0.0D, 10, 0), new Coord2D(10.0D, 24.0D, 10, 24), new Coord2D(7.0D, 24.0D, 7, 24), new Coord2D(0.0D, 7.0D, 0, 7)})), 2.0F, 10, 24, 63, 2, 0, new float[]{7.0F, 19.0F, 3.0F, 24.0F, 10.0F});
        this.tailModel[16].rotateAngleY = (float)Math.PI;
        this.tailModel[16].setRotationPoint(100.0F, -38.0F, 0.0F);
        this.tailModel[17].addShape3D(0.0F, 0.0F, -1.0F, (Shape2D)(new Shape2D(new Coord2D[]{new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(5.0D, 0.0D, 5, 0), new Coord2D(5.0D, 7.0D, 5, 7), new Coord2D(0.0D, 3.0D, 0, 3)})), 2.0F, 5, 7, 22, 2, 0, new float[]{3.0F, 7.0F, 7.0F, 5.0F});
        this.tailModel[17].rotateAngleY = (float)Math.PI;
        this.tailModel[17].setRotationPoint(95.0F, -38.0F, 0.0F);
        this.tailModel[18].addShape3D(0.0F, 0.0F, -1.0F, (Shape2D)(new Shape2D(new Coord2D[]{new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(11.0D, 0.0D, 11, 0), new Coord2D(11.0D, 3.0D, 11, 3)})), 2.0F, 11, 3, 26, 2, 0, new float[]{12.0F, 3.0F, 11.0F});
        this.tailModel[18].rotateAngleY = (float)Math.PI;
        this.tailModel[18].setRotationPoint(84.0F, -38.0F, 0.0F);
        this.tailModel[19].addShape3D(0.0F, 0.0F, 0.0F, (Shape2D)(new Shape2D(new Coord2D[]{new Coord2D(0.0D, 3.0D, 0, 3), new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(8.0D, 3.0D, 8, 3), new Coord2D(2.0D, 6.0D, 2, 6)})), 1.0F, 8, 6, 22, 1, 0, new float[]{4.0F, 7.0F, 7.0F, 4.0F});
        this.tailModel[19].rotateAngleY = (float)Math.PI;
        this.tailModel[19].setRotationPoint(106.0F, -37.5F, -39.2F);
        this.tailModel[20].addShape3D(0.0F, 0.0F, 0.0F, (Shape2D)(new Shape2D(new Coord2D[]{new Coord2D(0.0D, 3.0D, 0, 3), new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(8.0D, 3.0D, 8, 3), new Coord2D(2.0D, 6.0D, 2, 6)})), 1.0F, 8, 6, 22, 1, 0, new float[]{4.0F, 7.0F, 7.0F, 4.0F});
        this.tailModel[20].rotateAngleY = (float)Math.PI;
        this.tailModel[20].setRotationPoint(106.0F, -37.5F, 38.2F);
        if(this.VarGear) {
        }

        if(this.VarDoor) {
        }

        if(this.VarWing) {
        }

        this.rightWingModel = new ModelRendererTurbo[7];
        this.rightWingModel[0] = new ModelRendererTurbo(this, 140, 370, this.textureX, this.textureY);
        this.rightWingModel[1] = new ModelRendererTurbo(this, 180, 370, this.textureX, this.textureY);
        this.rightWingModel[2] = new ModelRendererTurbo(this, 140, 390, this.textureX, this.textureY);
        this.rightWingModel[3] = new ModelRendererTurbo(this, 0, 280, this.textureX, this.textureY);
        this.rightWingModel[4] = new ModelRendererTurbo(this, 80, 280, this.textureX, this.textureY);
        this.rightWingModel[5] = new ModelRendererTurbo(this, 0, 155, this.textureX, this.textureY);
        this.rightWingModel[6] = new ModelRendererTurbo(this, 0, 155, this.textureX, this.textureY);
        this.rightWingModel[0].addBox(0.0F, 0.0F, 0.0F, 13, 13, 4, 0.0F);
        this.rightWingModel[0].setRotationPoint(-8.0F, -3.0F, -28.0F);
        this.rightWingModel[1].addBox(0.0F, 0.0F, 0.0F, 9, 19, 3, 0.0F);
        this.rightWingModel[1].setRotationPoint(2.0F, -22.0F, -27.5F);
        this.rightWingModel[1].rotateAngleZ = -0.1745329F;
        this.rightWingModel[2].addBox(0.0F, 0.0F, 0.0F, 12, 5, 4, 0.0F);
        this.rightWingModel[2].setRotationPoint(0.0F, -22.0F, -28.0F);
        this.rightWingModel[3].addShape3D(0.0F, 0.0F, 0.0F, (Shape2D)(new Shape2D(new Coord2D[]{new Coord2D(0.0D, 1.0D, 0, 1), new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(16.0D, 1.0D, 16, 1), new Coord2D(30.0D, 5.0D, 30, 5), new Coord2D(31.0D, 6.0D, 31, 6), new Coord2D(15.0D, 13.0D, 15, 13), new Coord2D(8.0D, 13.0D, 8, 13), new Coord2D(1.0D, 8.0D, 1, 8)})), 5.0F, 31, 13, 77, 5, 0, new float[]{8.0F, 9.0F, 7.0F, 18.0F, 2.0F, 15.0F, 15.0F, 3.0F});
        this.rightWingModel[3].rotateAngleY = (float)Math.PI;
        this.rightWingModel[3].setRotationPoint(-11.0F, 5.0F, -28.5F);
        this.rightWingModel[4].addShape3D(0.0F, 0.0F, 0.0F, (Shape2D)(new Shape2D(new Coord2D[]{new Coord2D(7.0D, 0.0D, 7, 0), new Coord2D(51.0D, 0.0D, 51, 0), new Coord2D(52.0D, 19.0D, 52, 19), new Coord2D(0.0D, 19.0D, 0, 19)})), 4.0F, 52, 19, 137, 4, 0, new float[]{21.0F, 52.0F, 20.0F, 44.0F});
        this.rightWingModel[4].setRotationPoint(46.0F, -20.0F, -26.0F);
        this.rightWingModel[4].rotateAngleX = -1.4486233F;
        this.rightWingModel[5].addShape3D(0.0F, 0.0F, -2.0F, (Shape2D)(new Shape2D(new Coord2D[]{new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(44.0D, 0.0D, 44, 0), new Coord2D(40.0D, 84.0D, 40, 84), new Coord2D(37.0D, 87.0D, 37, 87), new Coord2D(25.0D, 84.0D, 25, 84), new Coord2D(9.0D, 41.0D, 9, 41)})), 2.0F, 44, 87, 235, 2, 0, new float[]{42.0F, 46.0F, 13.0F, 5.0F, 85.0F, 44.0F});
        this.rightWingModel[5].rotateAngleX = 1.43117F;
        this.rightWingModel[5].setRotationPoint(39.0F, -20.0F, -26.0F);
        this.rightWingModel[6].addShape3D(0.0F, 0.0F, -2.0F, (Shape2D)(new Shape2D(new Coord2D[]{new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(44.0D, 0.0D, 44, 0), new Coord2D(40.0D, 84.0D, 40, 84), new Coord2D(37.0D, 87.0D, 37, 87), new Coord2D(25.0D, 84.0D, 25, 84), new Coord2D(9.0D, 41.0D, 9, 41)})), 2.0F, 44, 87, 235, 2, 0, new float[]{42.0F, 46.0F, 13.0F, 5.0F, 85.0F, 44.0F});
        this.rightWingModel[6].rotateAngleX = 1.4538593F;
        this.rightWingModel[6].setRotationPoint(39.0F, -22.0F, -26.0F);
        if(this.VarGear) {
        }

        if(this.VarDoor) {
        }

        if(this.VarWing) {
        }

        this.leftWingModel = new ModelRendererTurbo[7];
        this.leftWingModel[0] = new ModelRendererTurbo(this, 210, 370, this.textureX, this.textureY);
        this.leftWingModel[1] = new ModelRendererTurbo(this, 250, 370, this.textureX, this.textureY);
        this.leftWingModel[2] = new ModelRendererTurbo(this, 210, 390, this.textureX, this.textureY);
        this.leftWingModel[3] = new ModelRendererTurbo(this, 0, 250, this.textureX, this.textureY);
        this.leftWingModel[4] = new ModelRendererTurbo(this, 80, 250, this.textureX, this.textureY);
        this.leftWingModel[5] = new ModelRendererTurbo(this, 240, 155, this.textureX, this.textureY);
        this.leftWingModel[6] = new ModelRendererTurbo(this, 240, 155, this.textureX, this.textureY);
        this.leftWingModel[0].addBox(0.0F, 0.0F, 0.0F, 13, 13, 4, 0.0F);
        this.leftWingModel[0].setRotationPoint(-8.0F, -3.0F, 24.0F);
        this.leftWingModel[1].addBox(0.0F, 0.0F, 0.0F, 9, 19, 3, 0.0F);
        this.leftWingModel[1].setRotationPoint(2.0F, -22.0F, 24.5F);
        this.leftWingModel[1].rotateAngleZ = -0.1745329F;
        this.leftWingModel[2].addBox(0.0F, 0.0F, 0.0F, 12, 5, 4, 0.0F);
        this.leftWingModel[2].setRotationPoint(0.0F, -22.0F, 24.0F);
        this.leftWingModel[3].addShape3D(0.0F, 0.0F, 0.0F, (Shape2D)(new Shape2D(new Coord2D[]{new Coord2D(0.0D, 1.0D, 0, 1), new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(16.0D, 1.0D, 16, 1), new Coord2D(30.0D, 5.0D, 30, 5), new Coord2D(31.0D, 6.0D, 31, 6), new Coord2D(15.0D, 13.0D, 15, 13), new Coord2D(8.0D, 13.0D, 8, 13), new Coord2D(1.0D, 8.0D, 1, 8)})), 5.0F, 31, 13, 77, 5, 0, new float[]{8.0F, 9.0F, 7.0F, 18.0F, 2.0F, 15.0F, 15.0F, 3.0F});
        this.leftWingModel[3].rotateAngleY = (float)Math.PI;
        this.leftWingModel[3].setRotationPoint(-11.0F, 5.0F, 23.5F);
        this.leftWingModel[4].addShape3D(0.0F, 0.0F, -4.0F, (Shape2D)(new Shape2D(new Coord2D[]{new Coord2D(7.0D, 0.0D, 7, 0), new Coord2D(51.0D, 0.0D, 51, 0), new Coord2D(52.0D, 19.0D, 52, 19), new Coord2D(0.0D, 19.0D, 0, 19)})), 4.0F, 52, 19, 137, 4, 0, new float[]{21.0F, 52.0F, 20.0F, 44.0F});
        this.leftWingModel[4].setRotationPoint(46.0F, -20.0F, 26.0F);
        this.leftWingModel[4].rotateAngleX = 1.4486233F;
        this.leftWingModel[5].addShape3D(0.0F, 0.0F, 0.0F, (Shape2D)(new Shape2D(new Coord2D[]{new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(44.0D, 0.0D, 44, 0), new Coord2D(40.0D, 84.0D, 40, 84), new Coord2D(37.0D, 87.0D, 37, 87), new Coord2D(25.0D, 84.0D, 25, 84), new Coord2D(9.0D, 41.0D, 9, 41)})), 2.0F, 44, 87, 235, 2, 0, new float[]{42.0F, 46.0F, 13.0F, 5.0F, 85.0F, 44.0F});
        this.leftWingModel[5].rotateAngleX = 4.8520155F;
        this.leftWingModel[5].setRotationPoint(39.0F, -20.0F, 26.0F);
        this.leftWingModel[6].addShape3D(0.0F, 0.0F, 0.0F, (Shape2D)(new Shape2D(new Coord2D[]{new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(44.0D, 0.0D, 44, 0), new Coord2D(40.0D, 84.0D, 40, 84), new Coord2D(37.0D, 87.0D, 37, 87), new Coord2D(25.0D, 84.0D, 25, 84), new Coord2D(9.0D, 41.0D, 9, 41)})), 2.0F, 44, 87, 235, 2, 0, new float[]{42.0F, 46.0F, 13.0F, 5.0F, 85.0F, 44.0F});
        this.leftWingModel[6].rotateAngleX = 4.829326F;
        this.leftWingModel[6].setRotationPoint(39.0F, -22.0F, 26.0F);
        if(this.VarGear) {
        }

        if(this.VarDoor) {
        }

        if(this.VarWing) {
        }

        this.propellerModels = new ModelRendererTurbo[1][3];
        this.propellerModels[0] = this.makeProp1(-47, -30, 0);
        this.yawFlapModel = new ModelRendererTurbo[3];
        this.yawFlapModel[0] = new ModelRendererTurbo(this, 210, 480, this.textureX, this.textureY);
        this.yawFlapModel[1] = new ModelRendererTurbo(this, 0, 100, this.textureX, this.textureY);
        this.yawFlapModel[2] = new ModelRendererTurbo(this, 30, 100, this.textureX, this.textureY);
        this.yawFlapModel[0].addBox(0.0F, 0.0F, -0.5F, 6, 2, 1, 0.0F);
        this.yawFlapModel[0].setRotationPoint(5.0F, -30.0F, 0.0F);
        this.yawFlapModel[0].rotateAngleX = 3.141593F;
        this.yawFlapModel[0].rotateAngleZ = 1.570796F;
        this.yawFlapModel[1].addShape3D(11.0F, 0.0F, -1.0F, (Shape2D)(new Shape2D(new Coord2D[]{new Coord2D(0.0D, 3.0D, 0, 3), new Coord2D(11.0D, 0.0D, 11, 0), new Coord2D(11.0D, 36.0D, 11, 36), new Coord2D(6.0D, 36.0D, 6, 36), new Coord2D(1.0D, 31.0D, 1, 31)})), 2.0F, 11, 36, 90, 2, 0, new float[]{29.0F, 8.0F, 5.0F, 36.0F, 12.0F});
        this.yawFlapModel[1].setRotationPoint(118.0F, -26.0F, 0.0F);
        this.yawFlapModel[1].rotateAngleY = (float)Math.PI;
        this.yawFlapModel[2].addShape3D(0.0F, 33.0F, -1.0F, (Shape2D)(new Shape2D(new Coord2D[]{new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(8.0D, 0.0D, 8, 0), new Coord2D(8.0D, 3.0D, 8, 3), new Coord2D(0.0D, 3.0D, 0, 3)})), 2.0F, 8, 3, 22, 2, 0, new float[]{3.0F, 8.0F, 3.0F, 8.0F});
        this.yawFlapModel[2].setRotationPoint(118.0F, -26.0F, 0.0F);
        this.yawFlapModel[2].rotateAngleY = (float)Math.PI;
        this.pitchFlapRightModel = new ModelRendererTurbo[1];
        this.pitchFlapRightModel[0] = new ModelRendererTurbo(this, 250, 370, this.textureX, this.textureY);
        this.pitchFlapRightModel[0].addBox(0.0F, -0.5F, 0.0F, 6, 1, 38, 0.0F);
        this.pitchFlapRightModel[0].setRotationPoint(114.0F, -40.5F, -39.0F);
        this.pitchFlapLeftModel = new ModelRendererTurbo[1];
        this.pitchFlapLeftModel[0] = new ModelRendererTurbo(this, 305, 375, this.textureX, this.textureY);
        this.pitchFlapLeftModel[0].addBox(0.0F, -0.5F, 0.0F, 6, 1, 38, 0.0F);
        this.pitchFlapLeftModel[0].setRotationPoint(114.0F, -40.5F, 1.0F);
        this.pitchFlapLeftWingModel = new ModelRendererTurbo[0];
        this.pitchFlapRightWingModel = new ModelRendererTurbo[0];
        this.topWingModel = new ModelRendererTurbo[0];
        this.translateAll(0, 0, 0);
        this.flipAll();
//        this.collisionBoxes = new CollisionBox[14];
//        this.collisionBoxes[0] = new CollisionBox(0, 32, -7, 0);
//        this.collisionBoxes[1] = new CollisionBox(0, 32, 15, 0);
//        this.collisionBoxes[2] = new CollisionBox(0, 32, 43, 0);
//        this.collisionBoxes[3] = new CollisionBox(0, 32, -48, 3);
//        this.collisionBoxes[4] = new CollisionBox(0, 32, -78, 3);
//        this.collisionBoxes[5] = new CollisionBox(0, 48, -110, 3);
//        this.collisionBoxes[6] = new CollisionBox(20, 23, -7, 2);
//        this.collisionBoxes[7] = new CollisionBox(50, 25, -7, 2);
//        this.collisionBoxes[8] = new CollisionBox(80, 29, -7, 2);
//        this.collisionBoxes[9] = new CollisionBox(110, 32, -7, 2);
//        this.collisionBoxes[10] = new CollisionBox(-20, 23, -7, 1);
//        this.collisionBoxes[11] = new CollisionBox(-50, 25, -7, 1);
//        this.collisionBoxes[12] = new CollisionBox(-80, 29, -7, 1);
//        this.collisionBoxes[13] = new CollisionBox(-110, 32, -7, 1);
    }

    private ModelRendererTurbo[] makeProp1(int i, int j, int k) {
        ModelRendererTurbo[] prop = new ModelRendererTurbo[]{new ModelRendererTurbo(this, 405, 430, this.textureX, this.textureY), new ModelRendererTurbo(this, 405, 430, this.textureX, this.textureY), new ModelRendererTurbo(this, 405, 430, this.textureX, this.textureY)};
        prop[0].addBox(-1.0F, -30.0F, -2.0F, 1, 30, 4, 0.0F);
        prop[1].addBox(-1.0F, -30.0F, -2.0F, 1, 30, 4, 0.0F);
        prop[2].addBox(-1.0F, -30.0F, -2.0F, 1, 30, 4, 0.0F);
        prop[0].setRotationPoint((float)i, (float)j, (float)k);
        prop[1].setRotationPoint((float)i, (float)j, (float)k);
        prop[2].setRotationPoint((float)i, (float)j, (float)k);
        return prop;
    }
}
