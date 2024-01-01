package net.kozibrodka.planes.model;
import net.kozibrodka.tmt.TURBO_MODEL_125.*;

public class ModelFlak88a_125 extends ModelAAGun
{
    int textureX;
    int textureY;

    public ModelFlak88a_125() {
        this.textureX = 512;
        this.textureY = 512;
        (this.baseModel = new ModelRendererTurbo[14])[0] = new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY);
        this.baseModel[1] = new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY);
        this.baseModel[2] = new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY);
        this.baseModel[3] = new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY);
        this.baseModel[4] = new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY);
        this.baseModel[5] = new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY);
        this.baseModel[6] = new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY);
        this.baseModel[7] = new ModelRendererTurbo((ModelBase)this, 0, 246, this.textureX, this.textureY);
        this.baseModel[8] = new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY);
        this.baseModel[9] = new ModelRendererTurbo((ModelBase)this, 0, 246, this.textureX, this.textureY);
        this.baseModel[10] = new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY);
        this.baseModel[11] = new ModelRendererTurbo((ModelBase)this, 0, 246, this.textureX, this.textureY);
        this.baseModel[12] = new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY);
        this.baseModel[13] = new ModelRendererTurbo((ModelBase)this, 0, 246, this.textureX, this.textureY);
        this.baseModel[0].addBox(-58.0f, -5.0f, -2.0f, 112, 2, 4, 0.0f);
        this.baseModel[1].addBox(-2.0f, -5.0f, -58.0f, 4, 2, 112, 0.0f);
        this.baseModel[2].addBox(-37.0f, -5.0f, -4.0f, 70, 3, 8, 0.0f);
        this.baseModel[3].addBox(-4.0f, -5.0f, -37.0f, 8, 3, 70, 0.0f);
        this.baseModel[4].addBox(0.0f, 0.0f, 0.0f, 16, 5, 16, 0.0f);
        this.baseModel[4].setRotationPoint(-11.3f, -6.0f, 0.0f);
        this.baseModel[4].rotateAngleY = -0.7853982f;
        this.baseModel[5].addTrapezoid(-5.0f, -15.0f, -5.0f, 10, 9, 10, 0.0f, -1.0f, 4);
        this.baseModel[6].addBox(-57.0f, -1.0f, -4.0f, 8, 1, 8, 0.0f);
        this.baseModel[7].addBox(-54.0f, -9.0f, -1.0f, 2, 8, 2, 0.0f);
        this.baseModel[8].addBox(45.0f, -1.0f, -4.0f, 8, 1, 8, 0.0f);
        this.baseModel[9].addBox(48.0f, -9.0f, -1.0f, 2, 8, 2, 0.0f);
        this.baseModel[10].addBox(-4.0f, -1.0f, 45.0f, 8, 1, 8, 0.0f);
        this.baseModel[11].addBox(-1.0f, -9.0f, 48.0f, 2, 8, 2, 0.0f);
        this.baseModel[12].addBox(-4.0f, -1.0f, -57.0f, 8, 1, 8, 0.0f);
        this.baseModel[13].addBox(-1.0f, -9.0f, -54.0f, 2, 8, 2, 0.0f);
        (this.seatModel = new ModelRendererTurbo[22])[0] = new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY);
        this.seatModel[1] = new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY);
        this.seatModel[2] = new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY);
        this.seatModel[3] = new ModelRendererTurbo((ModelBase)this, 0, 188, this.textureX, this.textureY);
        this.seatModel[4] = new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY);
        this.seatModel[5] = new ModelRendererTurbo((ModelBase)this, 0, 139, this.textureX, this.textureY);
        this.seatModel[6] = new ModelRendererTurbo((ModelBase)this, 0, 139, this.textureX, this.textureY);
        this.seatModel[7] = new ModelRendererTurbo((ModelBase)this, 0, 169, this.textureX, this.textureY);
        this.seatModel[8] = new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY);
        this.seatModel[9] = new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY);
        this.seatModel[10] = new ModelRendererTurbo((ModelBase)this, 0, 204, this.textureX, this.textureY);
        this.seatModel[11] = new ModelRendererTurbo((ModelBase)this, 0, 148, this.textureX, this.textureY);
        this.seatModel[12] = new ModelRendererTurbo((ModelBase)this, 0, 148, this.textureX, this.textureY);
        this.seatModel[13] = new ModelRendererTurbo((ModelBase)this, 0, 239, this.textureX, this.textureY);
        this.seatModel[14] = new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY);
        this.seatModel[15] = new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY);
        this.seatModel[16] = new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY);
        this.seatModel[17] = new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY);
        this.seatModel[18] = new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY);
        this.seatModel[19] = new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY);
        this.seatModel[20] = new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY);
        this.seatModel[21] = new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY);
        this.seatModel[0].addBox(-6.0f, -20.0f, -7.0f, 18, 5, 14, 0.0f);
        this.seatModel[1].addBox(21.0f, -22.5f, 2.5f, 1, 3, 3, 0.0f);
        this.seatModel[2].addBox(-5.0f, -23.0f, 2.0f, 26, 4, 4, 0.0f);
        this.seatModel[3].addBox(-6.0f, -12.0f, -23.0f, 12, 2, 12, 0.0f);
        this.seatModel[4].addBox(0.0f, 0.0f, 0.0f, 4, 1, 7, 0.0f);
        this.seatModel[4].setRotationPoint(-2.0f, -11.0f, -13.0f);
        this.seatModel[4].rotateAngleX = 0.7504916f;
        this.seatModel[5].addBox(-5.0f, -21.0f, -9.0f, 5, 5, 1, 0.0f);
        this.seatModel[6].addBox(3.0f, -21.0f, -9.0f, 5, 5, 1, 0.0f);
        this.seatModel[7].addBox(-12.0f, -29.0f, -7.0f, 2, 2, 14, 0.0f);
        this.seatModel[8].addBox(21.0f, -22.5f, -5.5f, 1, 3, 3, 0.0f);
        this.seatModel[9].addBox(-5.0f, -23.0f, -6.0f, 26, 4, 4, 0.0f);
        this.seatModel[10].addBox(-10.0f, -20.0f, -2.0f, 4, 4, 4, 0.0f);
        this.seatModel[11].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(15.0, 0.0, 15, 0), new Coord2D(16.0, 4.0, 16, 4), new Coord2D(17.0, 6.0, 17, 6), new Coord2D(19.0, 9.0, 19, 9), new Coord2D(22.0, 11.0, 22, 11), new Coord2D(22.0, 15.0, 22, 15), new Coord2D(12.0, 15.0, 12, 15), new Coord2D(7.0, 12.0, 7, 12), new Coord2D(3.0, 10.0, 3, 10), new Coord2D(2.0, 8.0, 2, 8), new Coord2D(0.0, 5.0, 0, 5) }), 1.0f, 22, 15, 180, 1, 0, new float[] { 15.0f, 15.0f, 15.0f, 15.0f, 15.0f, 15.0f, 15.0f, 15.0f, 15.0f, 15.0f, 15.0f, 15.0f });
        this.seatModel[11].setRotationPoint(9.0f, -15.0f, -7.0f);
        this.seatModel[12].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(15.0, 0.0, 15, 0), new Coord2D(16.0, 4.0, 16, 4), new Coord2D(17.0, 6.0, 17, 6), new Coord2D(19.0, 9.0, 19, 9), new Coord2D(22.0, 11.0, 22, 11), new Coord2D(22.0, 15.0, 22, 15), new Coord2D(12.0, 15.0, 12, 15), new Coord2D(7.0, 12.0, 7, 12), new Coord2D(3.0, 10.0, 3, 10), new Coord2D(2.0, 8.0, 2, 8), new Coord2D(0.0, 5.0, 0, 5) }), 1.0f, 22, 15, 180, 1, 0, new float[] { 15.0f, 15.0f, 15.0f, 15.0f, 15.0f, 15.0f, 15.0f, 15.0f, 15.0f, 15.0f, 15.0f, 15.0f });
        this.seatModel[12].setRotationPoint(9.0f, -15.0f, 8.0f);
        this.seatModel[13].addBox(0.0f, 0.0f, 0.0f, 29, 1, 21, 0.0f);
        this.seatModel[13].setRotationPoint(16.0f, -6.0f, -25.0f);
        this.seatModel[13].rotateAngleZ = 1.727876f;
        this.seatModel[14].addBox(0.0f, 0.0f, 0.0f, 14, 1, 8, 0.0f);
        this.seatModel[14].setRotationPoint(16.0f, -6.0f, -4.0f);
        this.seatModel[14].rotateAngleZ = 1.727876f;
        this.seatModel[15].addBox(0.0f, 0.0f, 0.0f, 29, 1, 21, 0.0f);
        this.seatModel[15].setRotationPoint(16.0f, -6.0f, 4.0f);
        this.seatModel[15].rotateAngleZ = 1.727876f;
        this.seatModel[16].addBox(0.0f, 0.0f, 0.0f, 29, 1, 4, 0.0f);
        this.seatModel[16].setRotationPoint(16.0f, -6.0f, -25.0f);
        this.seatModel[16].rotateAngleX = 1.5707964f;
        this.seatModel[16].rotateAngleZ = 1.727876f;
        this.seatModel[17].addBox(0.0f, 0.0f, 0.0f, 13, 1, 4, 0.0f);
        this.seatModel[17].setRotationPoint(13.0f, -6.0f, -25.0f);
        this.seatModel[17].rotateAngleX = 1.5707964f;
        this.seatModel[17].rotateAngleZ = 1.5707964f;
        this.seatModel[18].addBox(0.0f, 0.0f, 0.0f, 28, 1, 4, 0.0f);
        this.seatModel[18].setRotationPoint(11.0f, -6.0f, -25.0f);
        this.seatModel[18].rotateAngleX = 1.5707964f;
        this.seatModel[18].rotateAngleZ = 1.5707964f;
        this.seatModel[19].addBox(0.0f, 0.0f, 0.0f, 29, 1, 4, 0.0f);
        this.seatModel[19].setRotationPoint(16.0f, -6.0f, 24.0f);
        this.seatModel[19].rotateAngleX = 1.5707964f;
        this.seatModel[19].rotateAngleZ = 1.727876f;
        this.seatModel[20].addBox(0.0f, 0.0f, 0.0f, 13, 1, 4, 0.0f);
        this.seatModel[20].setRotationPoint(13.0f, -6.0f, 24.0f);
        this.seatModel[20].rotateAngleX = 1.5707964f;
        this.seatModel[20].rotateAngleZ = 1.5707964f;
        this.seatModel[21].addBox(0.0f, 0.0f, 0.0f, 28, 1, 4, 0.0f);
        this.seatModel[21].setRotationPoint(11.0f, -6.0f, 24.0f);
        this.seatModel[21].rotateAngleX = 1.5707964f;
        this.seatModel[21].rotateAngleZ = 1.5707964f;
        (this.gunModel = new ModelRendererTurbo[3])[0] = new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY);
        this.gunModel[1] = new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY);
        this.gunModel[2] = new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY);
        this.gunModel[0].addBox(0.0f, 0.0f, 0.0f, 8, 3, 4, 0.0f);
        this.gunModel[0].setRotationPoint(-11.0f, -28.0f, -2.0f);
        this.gunModel[1].addBox(0.0f, -3.0f, 0.0f, 8, 3, 4, 0.0f);
        this.gunModel[1].setRotationPoint(-11.0f, -28.0f, -2.0f);
        this.gunModel[2].addBox(-2.0f, -3.0f, 0.0f, 2, 6, 4, 0.0f);
        this.gunModel[2].setRotationPoint(-11.0f, -28.0f, -2.0f);
        this.barrelModel = new ModelRendererTurbo[1][15];
        this.barrelModel[0][0] = new ModelRendererTurbo((ModelBase)this, 0, 284, this.textureX, this.textureY);
        this.barrelModel[0][1] = new ModelRendererTurbo((ModelBase)this, 0, 292, this.textureX, this.textureY);
        this.barrelModel[0][2] = new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY);
        this.barrelModel[0][3] = new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY);
        this.barrelModel[0][4] = new ModelRendererTurbo((ModelBase)this, 0, 269, this.textureX, this.textureY);
        this.barrelModel[0][5] = new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY);
        this.barrelModel[0][6] = new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY);
        this.barrelModel[0][7] = new ModelRendererTurbo((ModelBase)this, 26, 273, this.textureX, this.textureY);
        this.barrelModel[0][8] = new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY);
        this.barrelModel[0][9] = new ModelRendererTurbo((ModelBase)this, 26, 278, this.textureX, this.textureY);
        this.barrelModel[0][10] = new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY);
        this.barrelModel[0][11] = new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY);
        this.barrelModel[0][12] = new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY);
        this.barrelModel[0][13] = new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY);
        this.barrelModel[0][14] = new ModelRendererTurbo((ModelBase)this, 0, 306, this.textureX, this.textureY);
        this.barrelModel[0][0].addBox(-22.0f, 3.0f, 0.5f, 14, 2, 3, 0.0f);
        this.barrelModel[0][1].addTrapezoid(27.0f, -2.5f, -0.5f, 33, 5, 5, 0.0f, -0.5f, 2);
        this.barrelModel[0][2].addBox(-7.0f, -5.0f, 3.0f, 1, 2, 2, 0.0f);
        this.barrelModel[0][3].addBox(23.0f, -5.0f, -1.0f, 1, 8, 6, 0.0f);
        this.barrelModel[0][4].addBox(-8.0f, -3.0f, -1.0f, 6, 6, 6, 0.0f);
        this.barrelModel[0][5].addBox(5.5f, 4.0f, 1.0f, 30, 2, 2, 0.0f);
        this.barrelModel[0][6].addBox(8.0f, -2.5f, -0.5f, 19, 5, 5, 0.0f);
        this.barrelModel[0][7].addBox(-3.0f, 8.0f, 1.0f, 4, 1, 2, 0.0f);
        this.barrelModel[0][8].addBox(-8.0f, 3.0f, 0.0f, 43, 4, 4, 0.0f);
        this.barrelModel[0][9].addBox(-5.0f, 7.0f, 1.0f, 8, 1, 2, 0.0f);
        this.barrelModel[0][10].addBox(0.0f, -6.0f, 0.5f, 27, 3, 3, 0.0f);
        this.barrelModel[0][11].addBox(-25.0f, -4.5f, 3.5f, 31, 1, 1, 0.0f);
        this.barrelModel[0][12].addBox(-3.0f, -5.0f, 1.5f, 31, 1, 1, 0.0f);
        this.barrelModel[0][13].addBox(2.0f, -5.0f, -0.5f, 4, 2, 5, 0.0f);
        this.barrelModel[0][14].addBox(60.0f, -1.5f, 0.5f, 24, 3, 3, 0.0f);
        this.ammoModel = new ModelRendererTurbo[0][0];
        this.barrelX = -11;
        this.barrelY = 28;
        this.barrelZ = 2;
        this.flipAll();
    }
}