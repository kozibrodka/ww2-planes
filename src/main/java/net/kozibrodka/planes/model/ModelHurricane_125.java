package net.kozibrodka.planes.model;

import net.kozibrodka.tmt.TURBO_MODEL_125.*;

public class ModelHurricane_125 extends ModelPlaneNew {
    int textureX = 512;
    int textureY = 512;
    boolean VarGear = true;
    boolean VarDoor = true;
    boolean VarWing = true;

    public ModelHurricane_125() {
        this.bodyModel = new ModelRendererTurbo[26];
        this.bodyModel[0] = new ModelRendererTurbo(this, 10, 470, this.textureX, this.textureY);
        this.bodyModel[1] = new ModelRendererTurbo(this, 55, 470, this.textureX, this.textureY);
        this.bodyModel[2] = new ModelRendererTurbo(this, 90, 470, this.textureX, this.textureY);
        this.bodyModel[3] = new ModelRendererTurbo(this, 160, 470, this.textureX, this.textureY);
        this.bodyModel[4] = new ModelRendererTurbo(this, 200, 470, this.textureX, this.textureY);
        this.bodyModel[5] = new ModelRendererTurbo(this, 250, 470, this.textureX, this.textureY);
        this.bodyModel[6] = new ModelRendererTurbo(this, 0, 420, this.textureX, this.textureY);
        this.bodyModel[7] = new ModelRendererTurbo(this, 50, 420, this.textureX, this.textureY);
        this.bodyModel[8] = new ModelRendererTurbo(this, 50, 440, this.textureX, this.textureY);
        this.bodyModel[9] = new ModelRendererTurbo(this, 75, 440, this.textureX, this.textureY);
        this.bodyModel[10] = new ModelRendererTurbo(this, 75, 455, this.textureX, this.textureY);
        this.bodyModel[11] = new ModelRendererTurbo(this, 120, 420, this.textureX, this.textureY);
        this.bodyModel[12] = new ModelRendererTurbo(this, 123, 433, this.textureX, this.textureY);
        this.bodyModel[13] = new ModelRendererTurbo(this, 140, 435, this.textureX, this.textureY);
        this.bodyModel[14] = new ModelRendererTurbo(this, 190, 420, this.textureX, this.textureY);
        this.bodyModel[15] = new ModelRendererTurbo(this, 140, 450, this.textureX, this.textureY);
        this.bodyModel[16] = new ModelRendererTurbo(this, 220, 420, this.textureX, this.textureY);
        this.bodyModel[17] = new ModelRendererTurbo(this, 220, 440, this.textureX, this.textureY);
        this.bodyModel[18] = new ModelRendererTurbo(this, 240, 420, this.textureX, this.textureY);
        this.bodyModel[19] = new ModelRendererTurbo(this, 240, 445, this.textureX, this.textureY);
        this.bodyModel[20] = new ModelRendererTurbo(this, 280, 445, this.textureX, this.textureY);
        this.bodyModel[21] = new ModelRendererTurbo(this, 180, 340, this.textureX, this.textureY);
        this.bodyModel[22] = new ModelRendererTurbo(this, 180, 375, this.textureX, this.textureY);
        this.bodyModel[23] = new ModelRendererTurbo(this, 180, 397, this.textureX, this.textureY);
        this.bodyModel[24] = new ModelRendererTurbo(this, 10, 500, this.textureX, this.textureY);
        this.bodyModel[25] = new ModelRendererTurbo(this, 40, 500, this.textureX, this.textureY);
        this.bodyModel[0].addTrapezoid(0.0F, 0.0F, 0.0F, 10, 10, 10, 0.0F, -3.5F, 3);
        this.bodyModel[0].setRotationPoint(-48.0F, -26.0F, -5.0F);
        this.bodyModel[1].addTrapezoid(0.0F, 0.0F, 0.0F, 4, 12, 12, 0.0F, -1.0F, 3);
        this.bodyModel[1].setRotationPoint(-38.0F, -27.0F, -6.0F);
        this.bodyModel[2].addTrapezoid(0.0F, 0.0F, 0.0F, 16, 21, 16, 0.0F, -1.0F, 3);
        this.bodyModel[2].setRotationPoint(-18.0F, -30.0F, -8.0F);
        this.bodyModel[3].addBox(0.0F, 0.0F, 0.0F, 2, 21, 16, 0.0F);
        this.bodyModel[3].setRotationPoint(-2.0F, -30.0F, -8.0F);
        this.bodyModel[4].addBox(0.0F, 0.0F, 0.0F, 21, 19, 2, 0.0F);
        this.bodyModel[4].setRotationPoint(0.0F, -28.0F, 6.0F);
        this.bodyModel[5].addBox(0.0F, 0.0F, 0.0F, 21, 19, 2, 0.0F);
        this.bodyModel[5].setRotationPoint(0.0F, -28.0F, -8.0F);
        this.bodyModel[6].addBox(0.0F, 0.0F, 0.0F, 8, 27, 16, 0.0F);
        this.bodyModel[6].setRotationPoint(21.0F, -36.0F, -8.0F);
        this.bodyModel[7].addBox(0.0F, 0.0F, 0.0F, 21, 1, 14, 0.0F);
        this.bodyModel[7].setRotationPoint(0.0F, -10.0F, -7.0F);
        this.bodyModel[8].addBox(0.0F, 0.0F, 0.0F, 1, 8, 10, 0.0F);
        this.bodyModel[8].setRotationPoint(2.0F, -36.0F, -5.0F);
        this.bodyModel[8].rotateAngleZ = -0.6981317F;
        this.bodyModel[9].addBox(0.0F, 0.0F, 0.0F, 19, 1, 10, 0.0F);
        this.bodyModel[9].setRotationPoint(2.0F, -36.0F, -5.0F);
        this.bodyModel[10].addBox(0.0F, 0.0F, 0.0F, 19, 1, 9, 0.0F);
        this.bodyModel[10].setRotationPoint(2.0F, -36.0F, 5.0F);
        this.bodyModel[10].rotateAngleX = -1.308997F;
        this.bodyModel[11].addBox(0.0F, 0.0F, 0.0F, 19, 9, 1, 0.0F);
        this.bodyModel[11].setRotationPoint(2.0F, -36.0F, -5.0F);
        this.bodyModel[11].rotateAngleX = -0.2617994F;
        this.bodyModel[12].addTrapezoid(0.0F, 0.0F, 0.0F, 3, 2, 1, 0.0F, -0.5F, 2);
        this.bodyModel[12].setRotationPoint(3.0F, -36.0F, -0.5F);
        this.bodyModel[12].rotateAngleZ = 1.186824F;
        this.bodyModel[13].addBox(0.0F, 0.0F, 0.0F, 12, 3, 10, 0.0F);
        this.bodyModel[13].setRotationPoint(3.0F, -13.0F, -5.0F);
        this.bodyModel[14].addBox(0.0F, 0.0F, 0.0F, 2, 27, 10, 0.0F);
        this.bodyModel[14].setRotationPoint(19.0F, -34.0F, -5.0F);
        this.bodyModel[14].rotateAngleZ = -0.1919862F;
        this.bodyModel[15].addBox(0.0F, 0.0F, 0.0F, 5, 9, 4, 0.0F);
        this.bodyModel[15].setRotationPoint(0.0F, -19.0F, -2.0F);
        this.bodyModel[16].addBox(0.0F, 0.0F, 0.0F, 5, 2, 6, 0.0F);
        this.bodyModel[16].setRotationPoint(-16.0F, -9.0F, -3.0F);
        this.bodyModel[17].addBox(0.0F, 0.0F, 0.0F, 4, 1, 6, 0.0F);
        this.bodyModel[17].setRotationPoint(-14.0F, -10.0F, -3.0F);
        this.bodyModel[18].addBox(0.0F, 0.0F, 0.0F, 12, 5, 14, 0.0F);
        this.bodyModel[18].setRotationPoint(0.0F, -9.0F, -7.0F);
        this.bodyModel[19].addBox(0.0F, 0.0F, 0.0F, 5, 7, 14, 0.0F);
        this.bodyModel[19].setRotationPoint(12.0F, -4.0F, -7.0F);
        this.bodyModel[19].rotateAngleZ = 1.884956F;
        this.bodyModel[20].addBox(0.0F, 0.0F, 0.0F, 5, 3, 14, 0.0F);
        this.bodyModel[20].setRotationPoint(14.0F, -9.0F, -7.0F);
        this.bodyModel[21].addShape3D(0.0F, 0.0F, 0.0F, (Shape2D)(new Shape2D(new Coord2D[]{new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(10.0D, 1.0D, 10, 1), new Coord2D(16.0D, 5.0D, 16, 5), new Coord2D(16.0D, 17.0D, 16, 17), new Coord2D(10.0D, 18.0D, 10, 18), new Coord2D(0.0D, 19.0D, 0, 19)})), 12.0F, 16, 19, 68, 12, 0, new float[]{19.0F, 11.0F, 7.0F, 12.0F, 8.0F, 11.0F});
        this.bodyModel[21].setRotationPoint(-18.0F, -10.0F, 6.0F);
        this.bodyModel[22].addShape3D(0.0F, 0.0F, 0.0F, (Shape2D)(new Shape2D(new Coord2D[]{new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(10.0D, 1.0D, 10, 1), new Coord2D(16.0D, 5.0D, 16, 5), new Coord2D(16.0D, 17.0D, 16, 17), new Coord2D(10.0D, 18.0D, 10, 18), new Coord2D(0.0D, 19.0D, 0, 19)})), 1.0F, 16, 19, 68, 1, 0, new float[]{19.0F, 11.0F, 7.0F, 12.0F, 8.0F, 11.0F});
        this.bodyModel[22].setRotationPoint(-18.0F, -10.0F, 7.0F);
        this.bodyModel[22].rotateAngleY = 0.06253515F;
        this.bodyModel[23].addShape3D(0.0F, 0.0F, -2.0F, (Shape2D)(new Shape2D(new Coord2D[]{new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(10.0D, 1.0D, 10, 1), new Coord2D(16.0D, 5.0D, 16, 5), new Coord2D(16.0D, 17.0D, 16, 17), new Coord2D(10.0D, 18.0D, 10, 18), new Coord2D(0.0D, 19.0D, 0, 19)})), 1.0F, 16, 19, 68, 1, 0, new float[]{19.0F, 11.0F, 7.0F, 12.0F, 8.0F, 11.0F});
        this.bodyModel[23].setRotationPoint(-18.0F, -10.0F, -8.0F);
        this.bodyModel[23].rotateAngleY = -0.06253515F;
        this.bodyModel[24].addBox(0.0F, 0.0F, 0.0F, 12, 2, 1, 0.0F);
        this.bodyModel[24].setRotationPoint(-32.0F, -23.0F, 6.0F);
        this.bodyModel[24].rotateAngleY = 0.06253515F;
        this.bodyModel[25].addBox(0.0F, 0.0F, 0.0F, 12, 2, 1, 0.0F);
        this.bodyModel[25].setRotationPoint(-32.0F, -23.0F, -7.0F);
        this.bodyModel[25].rotateAngleY = -0.06253515F;
        if(this.VarGear) {
        }

        if(this.VarDoor) {
        }

        if(this.VarWing) {
        }

        this.tailModel = new ModelRendererTurbo[15];
        this.tailModel[0] = new ModelRendererTurbo(this, 220, 450, this.textureX, this.textureY);
        this.tailModel[1] = new ModelRendererTurbo(this, 230, 450, this.textureX, this.textureY);
        this.tailModel[2] = new ModelRendererTurbo(this, 0, 340, this.textureX, this.textureY);
        this.tailModel[3] = new ModelRendererTurbo(this, 0, 340, this.textureX, this.textureY);
        this.tailModel[4] = new ModelRendererTurbo(this, 0, 340, this.textureX, this.textureY);
        this.tailModel[5] = new ModelRendererTurbo(this, 0, 340, this.textureX, this.textureY);
        this.tailModel[6] = new ModelRendererTurbo(this, 0, 340, this.textureX, this.textureY);
        this.tailModel[7] = new ModelRendererTurbo(this, 0, 340, this.textureX, this.textureY);
        this.tailModel[8] = new ModelRendererTurbo(this, 0, 340, this.textureX, this.textureY);
        this.tailModel[9] = new ModelRendererTurbo(this, 0, 340, this.textureX, this.textureY);
        this.tailModel[10] = new ModelRendererTurbo(this, 250, 340, this.textureX, this.textureY);
        this.tailModel[11] = new ModelRendererTurbo(this, 420, 220, this.textureX, this.textureY);
        this.tailModel[12] = new ModelRendererTurbo(this, 420, 250, this.textureX, this.textureY);
        this.tailModel[13] = new ModelRendererTurbo(this, 320, 300, this.textureX, this.textureY);
        this.tailModel[14] = new ModelRendererTurbo(this, 320, 320, this.textureX, this.textureY);
        this.tailModel[0].addBox(0.0F, 0.0F, 0.0F, 1, 8, 2, 0.0F);
        this.tailModel[0].setRotationPoint(76.0F, -15.0F, -1.0F);
        this.tailModel[0].rotateAngleZ = 0.3490658F;
        this.tailModel[1].addBox(0.0F, 0.0F, 0.0F, 4, 4, 1, 0.0F);
        this.tailModel[1].setRotationPoint(77.0F, -10.0F, -0.5F);
        this.tailModel[2].addShape3D(0.0F, 0.0F, 0.0F, (Shape2D)(new Shape2D(new Coord2D[]{new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(42.0D, 2.0D, 42, 2), new Coord2D(65.0D, 6.0D, 65, 6), new Coord2D(65.0D, 15.0D, 65, 15), new Coord2D(0.0D, 27.0D, 0, 27)})), 2.0F, 65, 27, 170, 2, 0, new float[]{27.0F, 67.0F, 9.0F, 24.0F, 43.0F});
        this.tailModel[2].setRotationPoint(29.0F, -9.0F, -8.0F);
        this.tailModel[2].rotateAngleY = 3.249489F;
        this.tailModel[3].addShape3D(0.0F, 0.0F, 0.0F, (Shape2D)(new Shape2D(new Coord2D[]{new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(42.0D, 2.0D, 42, 2), new Coord2D(65.0D, 6.0D, 65, 6), new Coord2D(65.0D, 15.0D, 65, 15), new Coord2D(0.0D, 27.0D, 0, 27)})), 2.0F, 65, 27, 170, 2, 0, new float[]{27.0F, 67.0F, 9.0F, 24.0F, 43.0F});
        this.tailModel[3].setRotationPoint(29.0F, -9.0F, -6.0F);
        this.tailModel[3].rotateAngleY = 3.2185967F;
        this.tailModel[4].addShape3D(0.0F, 0.0F, 0.0F, (Shape2D)(new Shape2D(new Coord2D[]{new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(42.0D, 2.0D, 42, 2), new Coord2D(65.0D, 6.0D, 65, 6), new Coord2D(65.0D, 15.0D, 65, 15), new Coord2D(0.0D, 27.0D, 0, 27)})), 2.0F, 65, 27, 170, 2, 0, new float[]{27.0F, 67.0F, 9.0F, 24.0F, 43.0F});
        this.tailModel[4].setRotationPoint(29.0F, -9.0F, -4.0F);
        this.tailModel[4].rotateAngleY = 3.1877568F;
        this.tailModel[5].addShape3D(0.0F, 0.0F, 0.0F, (Shape2D)(new Shape2D(new Coord2D[]{new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(42.0D, 2.0D, 42, 2), new Coord2D(65.0D, 6.0D, 65, 6), new Coord2D(65.0D, 15.0D, 65, 15), new Coord2D(0.0D, 27.0D, 0, 27)})), 2.0F, 65, 27, 170, 2, 0, new float[]{27.0F, 67.0F, 9.0F, 24.0F, 43.0F});
        this.tailModel[5].setRotationPoint(29.0F, -9.0F, -2.0F);
        this.tailModel[5].rotateAngleY = 3.1569865F;
        this.tailModel[6].addShape3D(0.0F, 0.0F, -2.0F, (Shape2D)(new Shape2D(new Coord2D[]{new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(42.0D, 2.0D, 42, 2), new Coord2D(65.0D, 6.0D, 65, 6), new Coord2D(65.0D, 15.0D, 65, 15), new Coord2D(0.0D, 27.0D, 0, 27)})), 2.0F, 65, 27, 170, 2, 0, new float[]{27.0F, 67.0F, 9.0F, 24.0F, 43.0F});
        this.tailModel[6].setRotationPoint(29.0F, -9.0F, 8.0F);
        this.tailModel[6].rotateAngleY = 3.0336964F;
        this.tailModel[7].addShape3D(0.0F, 0.0F, -2.0F, (Shape2D)(new Shape2D(new Coord2D[]{new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(42.0D, 2.0D, 42, 2), new Coord2D(65.0D, 6.0D, 65, 6), new Coord2D(65.0D, 15.0D, 65, 15), new Coord2D(0.0D, 27.0D, 0, 27)})), 2.0F, 65, 27, 170, 2, 0, new float[]{27.0F, 67.0F, 9.0F, 24.0F, 43.0F});
        this.tailModel[7].setRotationPoint(29.0F, -9.0F, 6.0F);
        this.tailModel[7].rotateAngleY = 3.0645888F;
        this.tailModel[8].addShape3D(0.0F, 0.0F, -2.0F, (Shape2D)(new Shape2D(new Coord2D[]{new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(42.0D, 2.0D, 42, 2), new Coord2D(65.0D, 6.0D, 65, 6), new Coord2D(65.0D, 15.0D, 65, 15), new Coord2D(0.0D, 27.0D, 0, 27)})), 2.0F, 65, 27, 170, 2, 0, new float[]{27.0F, 67.0F, 9.0F, 24.0F, 43.0F});
        this.tailModel[8].setRotationPoint(29.0F, -9.0F, 4.0F);
        this.tailModel[8].rotateAngleY = 3.0954287F;
        this.tailModel[9].addShape3D(0.0F, 0.0F, -2.0F, (Shape2D)(new Shape2D(new Coord2D[]{new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(42.0D, 2.0D, 42, 2), new Coord2D(65.0D, 6.0D, 65, 6), new Coord2D(65.0D, 15.0D, 65, 15), new Coord2D(0.0D, 27.0D, 0, 27)})), 2.0F, 65, 27, 170, 2, 0, new float[]{27.0F, 67.0F, 9.0F, 24.0F, 43.0F});
        this.tailModel[9].setRotationPoint(29.0F, -9.0F, 2.0F);
        this.tailModel[9].rotateAngleY = 3.126199F;
        this.tailModel[10].addShape3D(0.0F, 0.0F, -1.0F, (Shape2D)(new Shape2D(new Coord2D[]{new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(17.0D, 0.0D, 17, 0), new Coord2D(28.0D, 2.0D, 28, 2), new Coord2D(28.0D, 33.0D, 28, 33), new Coord2D(24.0D, 34.0D, 24, 34), new Coord2D(15.0D, 27.0D, 15, 27)})), 2.0F, 28, 34, 108, 2, 0, new float[]{31.0F, 12.0F, 5.0F, 31.0F, 12.0F, 17.0F});
        this.tailModel[10].setRotationPoint(66.0F, -11.0F, 0.0F);
        this.tailModel[10].rotateAngleY = (float)Math.PI;
        this.tailModel[11].addShape3D(0.0F, 0.0F, 0.0F, (Shape2D)(new Shape2D(new Coord2D[]{new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(13.0D, 0.0D, 13, 0), new Coord2D(13.0D, 21.0D, 13, 21), new Coord2D(4.0D, 21.0D, 4, 21)})), 1.0F, 13, 21, 65, 1, 0, new float[]{22.0F, 9.0F, 21.0F, 13.0F});
        this.tailModel[11].rotateAngleX = 4.712389F;
        this.tailModel[11].rotateAngleY = (float)Math.PI;
        this.tailModel[11].setRotationPoint(78.0F, -26.0F, -1.0F);
        this.tailModel[12].addShape3D(0.0F, 0.0F, -1.0F, (Shape2D)(new Shape2D(new Coord2D[]{new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(13.0D, 0.0D, 13, 0), new Coord2D(13.0D, 21.0D, 13, 21), new Coord2D(4.0D, 21.0D, 4, 21)})), 1.0F, 13, 21, 65, 1, 0, new float[]{22.0F, 9.0F, 21.0F, 13.0F});
        this.tailModel[12].rotateAngleX = (float)Math.PI / 2F;
        this.tailModel[12].rotateAngleY = (float)Math.PI;
        this.tailModel[12].setRotationPoint(78.0F, -26.0F, 1.0F);
        this.tailModel[13].addShape3D(0.0F, 0.0F, 0.0F, (Shape2D)(new Shape2D(new Coord2D[]{new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(6.0D, 0.0D, 6, 0), new Coord2D(6.0D, 5.0D, 6, 5), new Coord2D(3.0D, 4.0D, 3, 4)})), 1.0F, 6, 5, 20, 1, 0, new float[]{5.0F, 4.0F, 5.0F, 6.0F});
        this.tailModel[13].rotateAngleX = 4.712389F;
        this.tailModel[13].rotateAngleY = (float)Math.PI;
        this.tailModel[13].setRotationPoint(82.0F, -26.0F, -22.0F);
        this.tailModel[14].addShape3D(0.0F, 0.0F, -1.0F, (Shape2D)(new Shape2D(new Coord2D[]{new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(6.0D, 0.0D, 6, 0), new Coord2D(6.0D, 5.0D, 6, 5), new Coord2D(3.0D, 4.0D, 3, 4)})), 1.0F, 6, 5, 20, 1, 0, new float[]{5.0F, 4.0F, 5.0F, 6.0F});
        this.tailModel[14].rotateAngleX = (float)Math.PI / 2F;
        this.tailModel[14].rotateAngleY = (float)Math.PI;
        this.tailModel[14].setRotationPoint(82.0F, -26.0F, 22.0F);
        if(this.VarGear) {
        }

        if(this.VarDoor) {
        }

        if(this.VarWing) {
        }

        this.rightWingModel = new ModelRendererTurbo[10];
        this.rightWingModel[0] = new ModelRendererTurbo(this, 0, 400, this.textureX, this.textureY);
        this.rightWingModel[1] = new ModelRendererTurbo(this, 30, 400, this.textureX, this.textureY);
        this.rightWingModel[2] = new ModelRendererTurbo(this, 40, 400, this.textureX, this.textureY);
        this.rightWingModel[3] = new ModelRendererTurbo(this, 50, 400, this.textureX, this.textureY);
        this.rightWingModel[4] = new ModelRendererTurbo(this, 80, 400, this.textureX, this.textureY);
        this.rightWingModel[5] = new ModelRendererTurbo(this, 100, 400, this.textureX, this.textureY);
        this.rightWingModel[6] = new ModelRendererTurbo(this, 0, 320, this.textureX, this.textureY);
        this.rightWingModel[7] = new ModelRendererTurbo(this, 0, 300, this.textureX, this.textureY);
        this.rightWingModel[8] = new ModelRendererTurbo(this, 0, 130, this.textureX, this.textureY);
        this.rightWingModel[9] = new ModelRendererTurbo(this, 0, 220, this.textureX, this.textureY);
        this.rightWingModel[6].addShape3D(0.0F, 0.0F, 0.0F, (Shape2D)(new Shape2D(new Coord2D[]{new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(57.0D, 0.0D, 57, 0), new Coord2D(47.0D, 5.0D, 47, 5), new Coord2D(3.0D, 5.0D, 3, 5)})), 4.0F, 57, 5, 119, 4, 0, new float[]{6.0F, 44.0F, 12.0F, 57.0F});
        this.rightWingModel[6].rotateAngleX = 4.712389F;
        this.rightWingModel[6].rotateAngleY = (float)Math.PI;
        this.rightWingModel[6].setRotationPoint(-16.0F, -10.0F, -6.0F);
        this.rightWingModel[7].addShape3D(0.0F, 0.0F, 0.0F, (Shape2D)(new Shape2D(new Coord2D[]{new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(44.0D, 0.0D, 44, 0), new Coord2D(40.0D, 9.0D, 40, 9), new Coord2D(0.0D, 9.0D, 0, 9)})), 4.0F, 44, 9, 103, 4, 0, new float[]{9.0F, 40.0F, 10.0F, 44.0F});
        this.rightWingModel[7].rotateAngleX = 4.712389F;
        this.rightWingModel[7].rotateAngleY = (float)Math.PI;
        this.rightWingModel[7].setRotationPoint(-13.0F, -10.0F, -11.0F);
        this.rightWingModel[8].addShape3D(0.0F, 0.0F, 0.0F, (Shape2D)(new Shape2D(new Coord2D[]{new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(40.0D, 0.0D, 40, 0), new Coord2D(30.0D, 58.0D, 30, 58), new Coord2D(27.0D, 67.0D, 27, 67), new Coord2D(23.0D, 72.0D, 23, 72), new Coord2D(18.0D, 75.0D, 18, 75), new Coord2D(14.0D, 75.0D, 14, 75), new Coord2D(9.0D, 73.0D, 9, 73), new Coord2D(7.0D, 68.0D, 7, 68)})), 2.0F, 40, 75, 207, 2, 0, new float[]{69.0F, 6.0F, 6.0F, 4.0F, 6.0F, 7.0F, 10.0F, 59.0F, 40.0F});
        this.rightWingModel[8].rotateAngleX = 4.729842F;
        this.rightWingModel[8].rotateAngleY = (float)Math.PI;
        this.rightWingModel[8].setRotationPoint(-13.0F, -12.0F, -20.0F);
        this.rightWingModel[9].addShape3D(0.0F, 0.0F, 0.0F, (Shape2D)(new Shape2D(new Coord2D[]{new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(40.0D, 0.0D, 40, 0), new Coord2D(30.0D, 58.0D, 30, 58), new Coord2D(27.0D, 67.0D, 27, 67), new Coord2D(23.0D, 72.0D, 23, 72), new Coord2D(18.0D, 75.0D, 18, 75), new Coord2D(14.0D, 75.0D, 14, 75), new Coord2D(9.0D, 73.0D, 9, 73), new Coord2D(7.0D, 68.0D, 7, 68)})), 2.0F, 40, 75, 207, 2, 0, new float[]{69.0F, 6.0F, 6.0F, 4.0F, 6.0F, 7.0F, 10.0F, 59.0F, 40.0F});
        this.rightWingModel[9].rotateAngleX = 4.7560225F;
        this.rightWingModel[9].rotateAngleY = (float)Math.PI;
        this.rightWingModel[9].setRotationPoint(-13.0F, -10.0F, -20.0F);
        if(this.VarGear) {
            this.rightWingModel[0].addBox(0.0F, 0.0F, 0.0F, 10, 10, 3, 0.0F);
            this.rightWingModel[0].setRotationPoint(-16.0F, 0.0F, -19.0F);
            this.rightWingModel[1].addBox(0.0F, 0.0F, 0.0F, 3, 17, 1, 0.0F);
            this.rightWingModel[1].setRotationPoint(-9.0F, -11.0F, -20.0F);
            this.rightWingModel[1].rotateAngleZ = -0.296706F;
            this.rightWingModel[2].addBox(0.0F, 0.0F, 0.0F, 1, 11, 1, 0.0F);
            this.rightWingModel[2].setRotationPoint(0.0F, -11.0F, -20.0F);
            this.rightWingModel[2].rotateAngleZ = -1.099557F;
            this.rightWingModel[3].addBox(0.0F, 0.0F, 0.0F, 12, 7, 1, 0.0F);
            this.rightWingModel[3].setRotationPoint(-18.0F, 0.0F, -21.0F);
            this.rightWingModel[4].addBox(0.0F, 0.0F, 0.0F, 6, 12, 1, 0.0F);
            this.rightWingModel[4].setRotationPoint(-12.0F, -11.0F, -21.0F);
            this.rightWingModel[4].rotateAngleZ = -0.296706F;
            this.rightWingModel[5].addBox(0.0F, 0.0F, 0.0F, 4, 9, 1, 0.0F);
            this.rightWingModel[5].setRotationPoint(-12.0F, -9.0F, -21.0F);
        }

        if(this.VarDoor) {
        }

        if(this.VarWing) {
        }

        this.leftWingModel = new ModelRendererTurbo[10];
        this.leftWingModel[0] = new ModelRendererTurbo(this, 0, 380, this.textureX, this.textureY);
        this.leftWingModel[1] = new ModelRendererTurbo(this, 30, 380, this.textureX, this.textureY);
        this.leftWingModel[2] = new ModelRendererTurbo(this, 40, 380, this.textureX, this.textureY);
        this.leftWingModel[3] = new ModelRendererTurbo(this, 50, 380, this.textureX, this.textureY);
        this.leftWingModel[4] = new ModelRendererTurbo(this, 80, 380, this.textureX, this.textureY);
        this.leftWingModel[5] = new ModelRendererTurbo(this, 100, 380, this.textureX, this.textureY);
        this.leftWingModel[6] = new ModelRendererTurbo(this, 130, 320, this.textureX, this.textureY);
        this.leftWingModel[7] = new ModelRendererTurbo(this, 130, 300, this.textureX, this.textureY);
        this.leftWingModel[8] = new ModelRendererTurbo(this, 210, 130, this.textureX, this.textureY);
        this.leftWingModel[9] = new ModelRendererTurbo(this, 210, 220, this.textureX, this.textureY);
        this.leftWingModel[6].addShape3D(0.0F, 0.0F, -4.0F, (Shape2D)(new Shape2D(new Coord2D[]{new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(57.0D, 0.0D, 57, 0), new Coord2D(47.0D, 5.0D, 47, 5), new Coord2D(3.0D, 5.0D, 3, 5)})), 4.0F, 57, 5, 119, 4, 0, new float[]{6.0F, 44.0F, 12.0F, 57.0F});
        this.leftWingModel[6].rotateAngleX = (float)Math.PI / 2F;
        this.leftWingModel[6].rotateAngleY = (float)Math.PI;
        this.leftWingModel[6].setRotationPoint(-16.0F, -10.0F, 6.0F);
        this.leftWingModel[7].addShape3D(0.0F, 0.0F, -4.0F, (Shape2D)(new Shape2D(new Coord2D[]{new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(44.0D, 0.0D, 44, 0), new Coord2D(40.0D, 9.0D, 40, 9), new Coord2D(0.0D, 9.0D, 0, 9)})), 4.0F, 44, 9, 103, 4, 0, new float[]{9.0F, 40.0F, 10.0F, 44.0F});
        this.leftWingModel[7].rotateAngleX = (float)Math.PI / 2F;
        this.leftWingModel[7].rotateAngleY = (float)Math.PI;
        this.leftWingModel[7].setRotationPoint(-13.0F, -10.0F, 11.0F);
        this.leftWingModel[8].addShape3D(0.0F, 0.0F, -2.0F, (Shape2D)(new Shape2D(new Coord2D[]{new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(40.0D, 0.0D, 40, 0), new Coord2D(30.0D, 58.0D, 30, 58), new Coord2D(27.0D, 67.0D, 27, 67), new Coord2D(23.0D, 72.0D, 23, 72), new Coord2D(18.0D, 75.0D, 18, 75), new Coord2D(14.0D, 75.0D, 14, 75), new Coord2D(9.0D, 73.0D, 9, 73), new Coord2D(7.0D, 68.0D, 7, 68)})), 2.0F, 40, 75, 207, 2, 0, new float[]{69.0F, 6.0F, 6.0F, 4.0F, 6.0F, 7.0F, 10.0F, 59.0F, 40.0F});
        this.leftWingModel[8].rotateAngleX = 1.553343F;
        this.leftWingModel[8].rotateAngleY = (float)Math.PI;
        this.leftWingModel[8].setRotationPoint(-13.0F, -12.0F, 20.0F);
        this.leftWingModel[9].addShape3D(0.0F, 0.0F, -2.0F, (Shape2D)(new Shape2D(new Coord2D[]{new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(40.0D, 0.0D, 40, 0), new Coord2D(30.0D, 58.0D, 30, 58), new Coord2D(27.0D, 67.0D, 27, 67), new Coord2D(23.0D, 72.0D, 23, 72), new Coord2D(18.0D, 75.0D, 18, 75), new Coord2D(14.0D, 75.0D, 14, 75), new Coord2D(9.0D, 73.0D, 9, 73), new Coord2D(7.0D, 68.0D, 7, 68)})), 2.0F, 40, 75, 207, 2, 0, new float[]{69.0F, 6.0F, 6.0F, 4.0F, 6.0F, 7.0F, 10.0F, 59.0F, 40.0F});
        this.leftWingModel[9].rotateAngleX = 1.5271631F;
        this.leftWingModel[9].rotateAngleY = (float)Math.PI;
        this.leftWingModel[9].setRotationPoint(-13.0F, -10.0F, 20.0F);
        if(this.VarGear) {
            this.leftWingModel[0].addBox(0.0F, 0.0F, 0.0F, 10, 10, 3, 0.0F);
            this.leftWingModel[0].setRotationPoint(-16.0F, 0.0F, 16.0F);
            this.leftWingModel[1].addBox(0.0F, 0.0F, 0.0F, 3, 17, 1, 0.0F);
            this.leftWingModel[1].setRotationPoint(-9.0F, -11.0F, 19.0F);
            this.leftWingModel[1].rotateAngleZ = -0.296706F;
            this.leftWingModel[2].addBox(0.0F, 0.0F, 0.0F, 1, 11, 1, 0.0F);
            this.leftWingModel[2].setRotationPoint(0.0F, -11.0F, 19.0F);
            this.leftWingModel[2].rotateAngleZ = -1.099557F;
            this.leftWingModel[3].addBox(0.0F, 0.0F, 0.0F, 12, 7, 1, 0.0F);
            this.leftWingModel[3].setRotationPoint(-18.0F, 0.0F, 20.0F);
            this.leftWingModel[4].addBox(0.0F, 0.0F, 0.0F, 6, 12, 1, 0.0F);
            this.leftWingModel[4].setRotationPoint(-12.0F, -11.0F, 20.0F);
            this.leftWingModel[4].rotateAngleZ = -0.296706F;
            this.leftWingModel[5].addBox(0.0F, 0.0F, 0.0F, 4, 9, 1, 0.0F);
            this.leftWingModel[5].setRotationPoint(-12.0F, -9.0F, 20.0F);
        }

        if(this.VarDoor) {
        }

        if(this.VarWing) {
        }

        this.propellerModels = new ModelRendererTurbo[1][3];
        this.propellerModels[0] = this.makeProp1(-38, -21, 0);
        this.yawFlapModel = new ModelRendererTurbo[3];
        this.yawFlapModel[0] = new ModelRendererTurbo(this, 160, 460, this.textureX, this.textureY);
        this.yawFlapModel[1] = new ModelRendererTurbo(this, 320, 220, this.textureX, this.textureY);
        this.yawFlapModel[2] = new ModelRendererTurbo(this, 320, 260, this.textureX, this.textureY);
        this.yawFlapModel[0].addBox(0.0F, 0.0F, 0.0F, 5, 2, 1, 0.0F);
        this.yawFlapModel[0].setRotationPoint(4.0F, -19.0F, 0.5F);
        this.yawFlapModel[0].rotateAngleX = -3.141593F;
        this.yawFlapModel[0].rotateAngleZ = 1.570796F;
        this.yawFlapModel[1].addShape3D(11.0F, 0.0F, -1.0F, (Shape2D)(new Shape2D(new Coord2D[]{new Coord2D(11.0D, 34.0D, 11, 34), new Coord2D(7.0D, 34.0D, 7, 34), new Coord2D(4.0D, 31.0D, 4, 31), new Coord2D(2.0D, 26.0D, 2, 26), new Coord2D(0.0D, 18.0D, 0, 18), new Coord2D(0.0D, 5.0D, 0, 5), new Coord2D(2.0D, 2.0D, 2, 2), new Coord2D(11.0D, 0.0D, 11, 0)})), 2.0F, 11, 34, 85, 2, 0, new float[]{34.0F, 10.0F, 4.0F, 13.0F, 9.0F, 6.0F, 5.0F, 4.0F});
        this.yawFlapModel[1].setRotationPoint(94.0F, -13.0F, 0.0F);
        this.yawFlapModel[1].rotateAngleY = (float)Math.PI;
        this.yawFlapModel[2].addShape3D(0.0F, 31.0F, -1.0F, (Shape2D)(new Shape2D(new Coord2D[]{new Coord2D(0.0D, 3.0D, 0, 3), new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(4.0D, 1.0D, 4, 1)})), 2.0F, 4, 3, 13, 2, 0, new float[]{5.0F, 5.0F, 3.0F});
        this.yawFlapModel[2].setRotationPoint(94.0F, -13.0F, 0.0F);
        this.yawFlapModel[2].rotateAngleY = (float)Math.PI;
        this.pitchFlapRightModel = new ModelRendererTurbo[2];
        this.pitchFlapRightModel[0] = new ModelRendererTurbo(this, 420, 310, this.textureX, this.textureY);
        this.pitchFlapRightModel[1] = new ModelRendererTurbo(this, 320, 330, this.textureX, this.textureY);
        this.pitchFlapRightModel[0].addShape3D(0.0F, 0.0F, -0.5F, (Shape2D)(new Shape2D(new Coord2D[]{new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(8.0D, 4.0D, 8, 4), new Coord2D(6.0D, 19.0D, 6, 19), new Coord2D(3.0D, 25.0D, 3, 25), new Coord2D(0.0D, 26.0D, 0, 26)})), 1.0F, 8, 26, 62, 1, 0, new float[]{26.0F, 4.0F, 7.0F, 16.0F, 9.0F});
        this.pitchFlapRightModel[0].setRotationPoint(91.0F, -26.5F, -1.0F);
        this.pitchFlapRightModel[0].rotateAngleX = 4.712389F;
        this.pitchFlapRightModel[0].rotateAngleZ = (float)Math.PI;
        this.pitchFlapRightModel[0].rotateAngleY = (float)Math.PI;
        this.pitchFlapRightModel[1].addShape3D(3.0F, 21.0F, -0.5F, (Shape2D)(new Shape2D(new Coord2D[]{new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(3.0D, 0.0D, 3, 0), new Coord2D(3.0D, 5.0D, 3, 5), new Coord2D(0.0D, 5.0D, 0, 5)})), 1.0F, 3, 5, 16, 1, 0, new float[]{5.0F, 3.0F, 5.0F, 3.0F});
        this.pitchFlapRightModel[1].setRotationPoint(91.0F, -26.5F, -1.0F);
        this.pitchFlapRightModel[1].rotateAngleX = 4.712389F;
        this.pitchFlapRightModel[1].rotateAngleZ = (float)Math.PI;
        this.pitchFlapRightModel[1].rotateAngleY = (float)Math.PI;
        this.pitchFlapLeftModel = new ModelRendererTurbo[2];
        this.pitchFlapLeftModel[0] = new ModelRendererTurbo(this, 420, 280, this.textureX, this.textureY);
        this.pitchFlapLeftModel[1] = new ModelRendererTurbo(this, 320, 340, this.textureX, this.textureY);
        this.pitchFlapLeftModel[0].addShape3D(0.0F, 0.0F, -0.5F, (Shape2D)(new Shape2D(new Coord2D[]{new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(8.0D, 4.0D, 8, 4), new Coord2D(6.0D, 19.0D, 6, 19), new Coord2D(3.0D, 25.0D, 3, 25), new Coord2D(0.0D, 26.0D, 0, 26)})), 1.0F, 8, 26, 62, 1, 0, new float[]{26.0F, 4.0F, 7.0F, 16.0F, 9.0F});
        this.pitchFlapLeftModel[0].setRotationPoint(91.0F, -26.5F, 1.0F);
        this.pitchFlapLeftModel[0].rotateAngleX = (float)Math.PI / 2F;
        this.pitchFlapLeftModel[0].rotateAngleZ = (float)Math.PI;
        this.pitchFlapLeftModel[0].rotateAngleY = (float)Math.PI;
        this.pitchFlapLeftModel[1].addShape3D(3.0F, 21.0F, -0.5F, (Shape2D)(new Shape2D(new Coord2D[]{new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(3.0D, 0.0D, 3, 0), new Coord2D(3.0D, 5.0D, 3, 5), new Coord2D(0.0D, 5.0D, 0, 5)})), 1.0F, 3, 5, 16, 1, 0, new float[]{5.0F, 3.0F, 5.0F, 3.0F});
        this.pitchFlapLeftModel[1].setRotationPoint(91.0F, -26.5F, 1.0F);
        this.pitchFlapLeftModel[1].rotateAngleX = (float)Math.PI / 2F;
        this.pitchFlapLeftModel[1].rotateAngleZ = (float)Math.PI;
        this.pitchFlapLeftModel[1].rotateAngleY = (float)Math.PI;
        this.pitchFlapLeftWingModel = new ModelRendererTurbo[0];
        this.pitchFlapRightWingModel = new ModelRendererTurbo[0];
        this.topWingModel = new ModelRendererTurbo[0];
        this.translateAll(0, 0, 0);
        this.flipAll();
//        this.collisionBoxes = new CollisionBox[12];
//        this.collisionBoxes[0] = new CollisionBox(0, 20, -22, 0);
//        this.collisionBoxes[1] = new CollisionBox(0, 20, 0, 0);
//        this.collisionBoxes[2] = new CollisionBox(0, 20, 20, 0);
//        this.collisionBoxes[3] = new CollisionBox(0, 20, 40, 0);
//        this.collisionBoxes[4] = new CollisionBox(0, 20, -46, 3);
//        this.collisionBoxes[5] = new CollisionBox(0, 25, -72, 3);
//        this.collisionBoxes[6] = new CollisionBox(-20, 11, -2, 1);
//        this.collisionBoxes[7] = new CollisionBox(-50, 13, -2, 1);
//        this.collisionBoxes[8] = new CollisionBox(-90, 14, -2, 1);
//        this.collisionBoxes[9] = new CollisionBox(20, 11, -2, 2);
//        this.collisionBoxes[10] = new CollisionBox(50, 13, -2, 2);
//        this.collisionBoxes[11] = new CollisionBox(90, 14, -2, 2);
    }

    private ModelRendererTurbo[] makeProp1(int i, int j, int k) {
        ModelRendererTurbo[] prop = new ModelRendererTurbo[]{new ModelRendererTurbo(this, 0, 470, this.textureX, this.textureY), new ModelRendererTurbo(this, 0, 470, this.textureX, this.textureY), new ModelRendererTurbo(this, 0, 470, this.textureX, this.textureY)};
        prop[0].addBox(-1.0F, -27.0F, -2.0F, 1, 27, 3, 0.0F);
        prop[1].addBox(-1.0F, -27.0F, -2.0F, 1, 27, 3, 0.0F);
        prop[2].addBox(-1.0F, -27.0F, -2.0F, 1, 27, 3, 0.0F);
        prop[0].setRotationPoint((float)i, (float)j, (float)k);
        prop[1].setRotationPoint((float)i, (float)j, (float)k);
        prop[2].setRotationPoint((float)i, (float)j, (float)k);
        return prop;
    }
}

