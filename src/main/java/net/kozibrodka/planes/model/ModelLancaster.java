package net.kozibrodka.planes.model;

import net.kozibrodka.tmt.TURBO_MODEL_125.*;

public class ModelLancaster extends ModelPlaneNew
{
    private int textureX;
    private int textureY;

    public ModelLancaster() {
        this.textureX = 512;
        this.textureY = 512;
        this.bodyModel = new ModelRendererTurbo[19];
        (this.bodyModel[0] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY)).addTrapezoid(-160.0f, -80.0f, -16.0f, 16, 32, 32, 0.0f, -4.0f, 3);
        this.bodyModel[18] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.bodyModel[18].flip = true;
        this.bodyModel[18].addTrapezoid(-160.0f, -80.0f, -16.0f, 16, 32, 32, 0.0f, -4.0f, 3);
        (this.bodyModel[1] = new ModelRendererTurbo(this, 64, 0, this.textureX, this.textureY)).addBox(-144.0f, -80.0f, -15.0f, 16, 1, 30, 0.0f);
        (this.bodyModel[2] = new ModelRendererTurbo(this, 127, 1, this.textureX, this.textureY)).addBox(-144.0f, -49.0f, -15.0f, 112, 1, 30, 0.0f);
        (this.bodyModel[3] = new ModelRendererTurbo(this, 64, 32, this.textureX, this.textureY)).addTrapezoid(-128.0f, -96.0f, -16.0f, 64, 16, 32, 0.0f, -8.0f, 4);
        this.bodyModel[16] = new ModelRendererTurbo(this, 64, 32, this.textureX, this.textureY);
        this.bodyModel[16].flip = true;
        this.bodyModel[16].addTrapezoid(-128.0f, -96.0f, -16.0f, 64, 16, 32, 0.0f, -8.0f, 4);
        (this.bodyModel[4] = new ModelRendererTurbo(this, 0, 80, this.textureX, this.textureY)).addBox(-144.0f, -80.0f, -16.0f, 112, 32, 1, 0.0f);
        (this.bodyModel[5] = new ModelRendererTurbo(this, 0, 80, this.textureX, this.textureY)).addBox(-144.0f, -80.0f, -16.0f, 112, 32, 1, 0.0f);
        this.bodyModel[5].setRotationPoint(-176.0f, 0.0f, 0.0f);
        this.bodyModel[5].rotateAngleY = 3.1415927f; //todo: rotaye
        (this.bodyModel[6] = new ModelRendererTurbo(this, 226, 80, this.textureX, this.textureY)).addBox(-71.0f, -96.0f, -15.0f, 103, 1, 30, 0.0f);
        (this.bodyModel[7] = new ModelRendererTurbo(this, 432, 24, this.textureX, this.textureY)).addBox(-72.0f, -96.0f, -16.0f, 1, 16, 32, 0.0f);
        (this.bodyModel[8] = new ModelRendererTurbo(this, 0, 245, this.textureX, this.textureY)).addBox(0.0f, 0.0f, -16.0f, 199, 16, 1, 0.0f);
        this.bodyModel[8].setRotationPoint(-71.0f, -96.0f, 0.0f);
        (this.bodyModel[9] = new ModelRendererTurbo(this, 0, 245, this.textureX, this.textureY)).addBox(0.0f, 0.0f, -16.0f, 199, 16, 1, 0.0f);
        this.bodyModel[9].setRotationPoint(-71.0f, -96.0f, 0.0f);
        this.bodyModel[9].doMirror(false, false, true);
        (this.bodyModel[10] = new ModelRendererTurbo(this, 38, 262, this.textureX, this.textureY)).addBox(0.0f, 0.0f, -16.0f, 160, 16, 1, 0.0f);
        this.bodyModel[10].setRotationPoint(-32.0f, -80.0f, 0.0f);
        (this.bodyModel[11] = new ModelRendererTurbo(this, 38, 262, this.textureX, this.textureY)).addBox(0.0f, 0.0f, -16.0f, 160, 16, 1, 0.0f);
        this.bodyModel[11].setRotationPoint(-32.0f, -80.0f, 0.0f);
        this.bodyModel[11].doMirror(false, false, true);
        (this.bodyModel[12] = new ModelRendererTurbo(this, 144, 279, this.textureX, this.textureY)).addTrapezoid(32.0f, -112.0f, -16.0f, 32, 16, 32, 0.0f, -8.0f, 4);
        this.bodyModel[17] = new ModelRendererTurbo(this, 144, 279, this.textureX, this.textureY);
        this.bodyModel[17].flip = true;
        this.bodyModel[17].addTrapezoid(32.0f, -112.0f, -16.0f, 32, 16, 32, 0.0f, -8.0f, 4);
        (this.bodyModel[13] = new ModelRendererTurbo(this, 52, 362, this.textureX, this.textureY)).addShape3D(128.0f, -65.0f, -15.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(160.0, 16.0, 160, 0), new Coord2D(160.0, 17.0, 160, 1), new Coord2D(0.0, 1.0, 0, 1) }), 30.0f, 160, 1, 322, 30, 0, new float[] { 1.0f, 160.0f, 1.0f, 160.0f });
        this.bodyModel[13].rotateAngleX = 3.1415927f;
        (this.bodyModel[14] = new ModelRendererTurbo(this, 52, 345, this.textureX, this.textureY)).addShape3D(128.0f, -64.0f, -16.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(160.0, 0.0, 160, 0), new Coord2D(160.0, 16.0, 160, 16) }), 1.0f, 160, 16, 336, 1, 0, new float[] { 160.0f, 16.0f, 160.0f });
        this.bodyModel[14].rotateAngleX = 3.1415927f;
        (this.bodyModel[15] = new ModelRendererTurbo(this, 52, 394, this.textureX, this.textureY)).addShape3D(128.0f, -64.0f, 15.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(160.0, 0.0, 160, 0), new Coord2D(160.0, 16.0, 160, 16) }), 1.0f, 160, 16, 336, 1, 0, new float[] { 160.0f, 16.0f, 160.0f });
        this.bodyModel[15].rotateAngleX = 3.1415927f;
        this.tailModel = new ModelRendererTurbo[6];
        (this.tailModel[0] = new ModelRendererTurbo(this, 0, 279, this.textureX, this.textureY)).addBox(96.0f, 16.0f, -82.0f, 16, 64, 2, 0.0f);
        this.tailModel[0].rotateAngleX = -1.5707964f;
        (this.tailModel[1] = new ModelRendererTurbo(this, 0, 279, this.textureX, this.textureY)).addBox(96.0f, 16.0f, -82.0f, 16, 64, 2, 0.0f);
        this.tailModel[1].doMirror(false, true, false);
        this.tailModel[1].rotateAngleX = -1.5707964f;
        (this.tailModel[2] = new ModelRendererTurbo(this, 72, 279, this.textureX, this.textureY)).addBox(96.0f, -128.0f, 80.0f, 16, 64, 2, 0.0f);
        (this.tailModel[3] = new ModelRendererTurbo(this, 72, 279, this.textureX, this.textureY)).addBox(96.0f, -128.0f, -82.0f, 16, 64, 2, 0.0f);
        (this.tailModel[4] = new ModelRendererTurbo(this, 240, 279, this.textureX, this.textureY)).addBox(64.0f, -96.0f, -15.0f, 64, 1, 30, 0.0f);
        (this.tailModel[5] = new ModelRendererTurbo(this, 304, 111, this.textureX, this.textureY)).addTrapezoid(128.0f, -96.0f, -16.0f, 16, 32, 32, 0.0f, -6.0f, 2);
        this.rightWingModel = new ModelRendererTurbo[6];
        (this.rightWingModel[0] = new ModelRendererTurbo(this, 0, 113, this.textureX, this.textureY)).addBox(-64.0f, 16.0f, -82.0f, 64, 96, 4, 0.0f);
        this.rightWingModel[0].rotateAngleX = -1.5707964f;
        (this.rightWingModel[1] = new ModelRendererTurbo(this, 136, 113, this.textureX, this.textureY)).addTrapezoid(-64.0f, 112.0f, -82.0f, 80, 128, 4, 0.0f, -2.0f, 5);
        this.rightWingModel[1].rotateAngleX = -1.5707964f;
        (this.rightWingModel[2] = new ModelRendererTurbo(this, 256, 32, this.textureX, this.textureY)).addTrapezoid(-112.0f, -80.0f, -64.0f, 64, 24, 24, 0.0f, -2.0f, 5);
        (this.rightWingModel[3] = new ModelRendererTurbo(this, 256, 32, this.textureX, this.textureY)).addTrapezoid(-96.0f, -80.0f, -128.0f, 64, 24, 24, 0.0f, -2.0f, 5);
        (this.rightWingModel[4] = new ModelRendererTurbo(this, 408, 24, this.textureX, this.textureY)).addBox(-115.0f, -76.0f, -60.0f, 6, 16, 16, 0.0f);
        (this.rightWingModel[5] = new ModelRendererTurbo(this, 408, 24, this.textureX, this.textureY)).addBox(-99.0f, -76.0f, -124.0f, 6, 16, 16, 0.0f);
        this.leftWingModel = new ModelRendererTurbo[6];
        (this.leftWingModel[0] = new ModelRendererTurbo(this, 0, 113, this.textureX, this.textureY)).addBox(-64.0f, 16.0f, -82.0f, 64, 96, 4, 0.0f);
        this.leftWingModel[0].doMirror(false, true, false);
        this.leftWingModel[0].rotateAngleX = -1.5707964f;
        (this.leftWingModel[1] = new ModelRendererTurbo(this, 136, 113, this.textureX, this.textureY)).addTrapezoid(-64.0f, 112.0f, -82.0f, 80, 128, 4, 0.0f, -2.0f, 5);
        this.leftWingModel[1].doMirror(false, true, false);
        this.leftWingModel[1].rotateAngleX = -1.5707964f;
        (this.leftWingModel[2] = new ModelRendererTurbo(this, 256, 32, this.textureX, this.textureY)).addTrapezoid(-112.0f, -80.0f, 40.0f, 64, 24, 24, 0.0f, -2.0f, 5);
        (this.leftWingModel[3] = new ModelRendererTurbo(this, 256, 32, this.textureX, this.textureY)).addTrapezoid(-96.0f, -80.0f, 104.0f, 64, 24, 24, 0.0f, -2.0f, 5);
        (this.leftWingModel[4] = new ModelRendererTurbo(this, 408, 24, this.textureX, this.textureY)).addBox(-115.0f, -76.0f, 44.0f, 6, 16, 16, 0.0f);
        (this.leftWingModel[5] = new ModelRendererTurbo(this, 408, 24, this.textureX, this.textureY)).addBox(-99.0f, -76.0f, 108.0f, 6, 16, 16, 0.0f);
        (this.propellerModels = new ModelRendererTurbo[4][3])[1] = this.makeProp(-114, -68, 52);
        this.propellerModels[0] = this.makeProp(-114, -68, -52);
        this.propellerModels[3] = this.makeProp(-98, -68, 116);
        this.propellerModels[2] = this.makeProp(-98, -68, -116);
        this.yawFlapModel = new ModelRendererTurbo[2];
        (this.yawFlapModel[0] = new ModelRendererTurbo(this, 108, 279, this.textureX, this.textureY)).addBox(0.0f, -48.0f, -1.0f, 16, 64, 2, 0.0f);
        this.yawFlapModel[0].setPosition(112.0f, -80.0f, 81.0f);
        (this.yawFlapModel[1] = new ModelRendererTurbo(this, 108, 279, this.textureX, this.textureY)).addBox(0.0f, -48.0f, -1.0f, 16, 64, 2, 0.0f);
        this.yawFlapModel[1].setPosition(112.0f, -80.0f, -81.0f);
        this.pitchFlapRightWingModel = new ModelRendererTurbo[1];
        (this.pitchFlapRightWingModel[0] = new ModelRendererTurbo(this, 0, 345, this.textureX, this.textureY)).addBox(0.0f, -48.0f, -2.0f, 16, 96, 4, 0.0f);
        this.pitchFlapRightWingModel[0].rotateAngleX = 1.570796f;
        this.pitchFlapRightWingModel[0].setPosition(0.0f, -80.0f, -64.0f);
        this.pitchFlapLeftModel = new ModelRendererTurbo[1];
        (this.pitchFlapLeftModel[0] = new ModelRendererTurbo(this, 36, 279, this.textureX, this.textureY)).addBox(0.0f, -32.0f, -1.0f, 16, 64, 2, 0.0f);
        this.pitchFlapLeftModel[0].rotateAngleX = 1.570796f;
        this.pitchFlapLeftModel[0].setPosition(112.0f, -81.0f, 48.0f);
        this.pitchFlapLeftWingModel = new ModelRendererTurbo[1];
        (this.pitchFlapLeftWingModel[0] = new ModelRendererTurbo(this, 0, 345, this.textureX, this.textureY)).addBox(0.0f, -48.0f, -2.0f, 16, 96, 4, 0.0f);
        this.pitchFlapLeftWingModel[0].doMirror(false, true, false);
        this.pitchFlapLeftWingModel[0].rotateAngleX = 1.570796f;
        this.pitchFlapLeftWingModel[0].setPosition(0.0f, -80.0f, 64.0f);
        this.pitchFlapRightModel = new ModelRendererTurbo[1];
        (this.pitchFlapRightModel[0] = new ModelRendererTurbo(this, 36, 279, this.textureX, this.textureY)).addBox(0.0f, -32.0f, -1.0f, 16, 64, 2, 0.0f);
        this.pitchFlapRightModel[0].rotateAngleX = 1.570796f; //tODO: rotate
        this.pitchFlapRightModel[0].setPosition(112.0f, -81.0f, -48.0f);
        this.topWingModel = new ModelRendererTurbo[0];
        this.translateAll(0, 0, 0);
        this.flipAll();

//        (this.collisionBoxes = new CollisionBox[16])[0] = new CollisionBox(0, 0, -32, 3);
//        this.collisionBoxes[1] = new CollisionBox(0, 10, -80, 3);
//        this.collisionBoxes[2] = new CollisionBox(0, 20, -110, 3);
//        this.collisionBoxes[3] = new CollisionBox(80, 20, -112, 3);
//        this.collisionBoxes[4] = new CollisionBox(-80, 20, -112, 3);
//        this.collisionBoxes[5] = new CollisionBox(55, 5, 75, 2);
//        this.collisionBoxes[6] = new CollisionBox(115, 5, 65, 2);
//        this.collisionBoxes[7] = new CollisionBox(200, 20, 20, 2);
//        this.collisionBoxes[8] = new CollisionBox(-55, 5, 75, 1);
//        this.collisionBoxes[9] = new CollisionBox(-115, 5, 65, 1);
//        this.collisionBoxes[10] = new CollisionBox(-200, 20, 20, 1);
//        this.collisionBoxes[11] = new CollisionBox(0, 0, 40, 0);
//        this.collisionBoxes[12] = new CollisionBox(0, 0, 70, 0);
//        this.collisionBoxes[13] = new CollisionBox(0, 0, 100, 0);
//        this.collisionBoxes[14] = new CollisionBox(0, 0, 130, 0);
//        this.collisionBoxes[15] = new CollisionBox(0, 20, 115, 0);
    }

//    private void translateAll(final int y) {
//        for (final ModelRendererTurbo modelRendererTurbo : this.bodyModel) {
//            final ModelRendererTurbo mod = modelRendererTurbo;
//            modelRendererTurbo.d += y;
//        }
//        for (final ModelRendererTurbo modelRendererTurbo2 : this.leftWingModel) {
//            final ModelRendererTurbo mod = modelRendererTurbo2;
//            modelRendererTurbo2.d += y;
//        }
//        for (final ModelRendererTurbo modelRendererTurbo3 : this.rightWingModel) {
//            final ModelRendererTurbo mod = modelRendererTurbo3;
//            modelRendererTurbo3.d += y;
//        }
//        for (final ModelRendererTurbo modelRendererTurbo4 : this.yawFlapModel) {
//            final ModelRendererTurbo mod = modelRendererTurbo4;
//            modelRendererTurbo4.d += y;
//        }
//        for (final ModelRendererTurbo modelRendererTurbo5 : this.pitchFlapRightWingModel) {
//            final ModelRendererTurbo mod = modelRendererTurbo5;
//            modelRendererTurbo5.d += y;
//        }
//        for (final ModelRendererTurbo modelRendererTurbo6 : this.pitchFlapLeftWingModel) {
//            final ModelRendererTurbo mod = modelRendererTurbo6;
//            modelRendererTurbo6.d += y;
//        }
//        for (final ModelRendererTurbo modelRendererTurbo7 : this.pitchFlapLeftModel) {
//            final ModelRendererTurbo mod = modelRendererTurbo7;
//            modelRendererTurbo7.d += y;
//        }
//        for (final ModelRendererTurbo modelRendererTurbo8 : this.pitchFlapRightModel) {
//            final ModelRendererTurbo mod = modelRendererTurbo8;
//            modelRendererTurbo8.d += y;
//        }
//        for (final ModelRendererTurbo modelRendererTurbo9 : this.tailModel) {
//            final ModelRendererTurbo mod = modelRendererTurbo9;
//            modelRendererTurbo9.d += y;
//        }
//        for (final ModelRendererTurbo[] arr$3 : this.propellerModels) {
//            final ModelRendererTurbo[] mods = arr$3;
//            for (final ModelRendererTurbo modelRendererTurbo10 : arr$3) {
//                final ModelRendererTurbo mod2 = modelRendererTurbo10;
//                modelRendererTurbo10.d += y;
//            }
//        }
//    }

    private ModelRendererTurbo[] makeProp(final int i, final int j, final int k) {
        final ModelRendererTurbo[] prop =  new ModelRendererTurbo[]{new ModelRendererTurbo(this, 40, 345, this.textureX, this.textureY), new ModelRendererTurbo(this, 40, 345, this.textureX, this.textureY), new ModelRendererTurbo(this, 40, 345, this.textureX, this.textureY)};
        prop[0].addBox(-0.0f, -32.0f, -2.0f, 2, 32, 4, 0.0f);
        prop[0].setRotationPoint((float)i, (float)j, (float)k);
        prop[1].addBox(-0.0f, -32.0f, -2.0f, 2, 32, 4, 0.0f);
        prop[1].setRotationPoint((float)i, (float)j, (float)k);
        prop[2].addBox(-0.0f, -32.0f, -2.0f, 2, 32, 4, 0.0f);
        prop[2].setRotationPoint((float)i, (float)j, (float)k);
        return prop;
    }
}
