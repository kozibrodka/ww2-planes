package net.kozibrodka.planes.model;

import net.kozibrodka.planes.entity.EntityPlaneNew;
import net.kozibrodka.tmt.TURBO_MODEL_125.*;

import java.util.HashMap;

public class ModelPlaneNew extends ModelBase {
    public ModelRendererTurbo[] noseModel = new ModelRendererTurbo[0];
    public ModelRendererTurbo[] leftWingModel = new ModelRendererTurbo[0];
    public ModelRendererTurbo[] rightWingModel = new ModelRendererTurbo[0];
    public ModelRendererTurbo[] topWingModel = new ModelRendererTurbo[0];
    public ModelRendererTurbo[] bayModel = new ModelRendererTurbo[0];
    public ModelRendererTurbo[] tailModel = new ModelRendererTurbo[0];
    public ModelRendererTurbo[][] propellerModels = new ModelRendererTurbo[0][0];
    public ModelRendererTurbo[] yawFlapModel = new ModelRendererTurbo[0];
    public ModelRendererTurbo[] pitchFlapLeftModel = new ModelRendererTurbo[0];
    public ModelRendererTurbo[] pitchFlapRightModel = new ModelRendererTurbo[0];
    public ModelRendererTurbo[] pitchFlapLeftWingModel = new ModelRendererTurbo[0];
    public ModelRendererTurbo[] pitchFlapRightWingModel = new ModelRendererTurbo[0];
    public ModelRendererTurbo[] bodyWheelModel = new ModelRendererTurbo[0];
    public ModelRendererTurbo[] tailWheelModel = new ModelRendererTurbo[0];
    public ModelRendererTurbo[] leftWingWheelModel = new ModelRendererTurbo[0];
    public ModelRendererTurbo[] rightWingWheelModel = new ModelRendererTurbo[0];
    public ModelRendererTurbo[] tailDoorOpenModel = new ModelRendererTurbo[0];
    public ModelRendererTurbo[] tailDoorCloseModel = new ModelRendererTurbo[0];
    public ModelRendererTurbo[] rightWingPos1Model = new ModelRendererTurbo[0];
    public ModelRendererTurbo[] rightWingPos2Model = new ModelRendererTurbo[0];
    public ModelRendererTurbo[] leftWingPos1Model = new ModelRendererTurbo[0];
    public ModelRendererTurbo[] leftWingPos2Model = new ModelRendererTurbo[0];
    public ModelRendererTurbo[] bodyModel = new ModelRendererTurbo[0];
    public ModelRendererTurbo[] bodyDoorOpenModel = new ModelRendererTurbo[0];
    public ModelRendererTurbo[] bodyDoorCloseModel = new ModelRendererTurbo[0];

//    public ModelRendererTurbo[] noseModel;
//    public ModelRendererTurbo[] leftWingModel;
//    public ModelRendererTurbo[] rightWingModel   ;
//    public ModelRendererTurbo[] topWingModel ;
//    public ModelRendererTurbo[] bayModel   ;
//    public ModelRendererTurbo[] tailModel   ;
//    public ModelRendererTurbo[][] propellerModels  ;
//    public ModelRendererTurbo[] yawFlapModel  ;
//    public ModelRendererTurbo[] pitchFlapLeftModel   ;
//    public ModelRendererTurbo[] pitchFlapRightModel   ;
//    public ModelRendererTurbo[] pitchFlapLeftWingModel   ;
//    public ModelRendererTurbo[] pitchFlapRightWingModel   ;
//    public ModelRendererTurbo[] bodyWheelModel   ;
//    public ModelRendererTurbo[] tailWheelModel   ;
//    public ModelRendererTurbo[] leftWingWheelModel   ;
//    public ModelRendererTurbo[] rightWingWheelModel;
//    public ModelRendererTurbo[] tailDoorOpenModel;
//    public ModelRendererTurbo[] tailDoorCloseModel;
//    public ModelRendererTurbo[] rightWingPos1Model;
//    public ModelRendererTurbo[] rightWingPos2Model;
//    public ModelRendererTurbo[] leftWingPos1Model;
//    public ModelRendererTurbo[] leftWingPos2Model;
//    public ModelRendererTurbo[] bodyModel;
//    public ModelRendererTurbo[] bodyDoorOpenModel;
//    public ModelRendererTurbo[] bodyDoorCloseModel;

    public HashMap<String, ModelRendererTurbo[][]> gunModels = new HashMap();

//    public void render(EntityDriveable driveable, float f1) {
//        this.render(0.0625F, (EntityPlane)driveable, f1);
//    }
//
//    public void render(DriveableType type) {
//        super.render(type);
//        this.renderPart(this.noseModel);
//        this.renderPart(this.leftWingModel);
//        this.renderPart(this.rightWingModel);
//        this.renderPart(this.topWingModel);
//        this.renderPart(this.bayModel);
//        this.renderPart(this.tailModel);
//        ModelRendererTurbo[][] arr$ = this.propellerModels;
//        int len$ = arr$.length;
//
//        for(int i$ = 0; i$ < len$; ++i$) {
//            ModelRendererTurbo[] prop = arr$[i$];
//
//            for(int j = 0; j < prop.length; ++j) {
//                prop[j].rotateAngleX = (float)j * 2.0F * (float)Math.PI / (float)prop.length;
//                prop[j].render(0.0625F);
//            }
//        }
//
//        this.renderPart(this.yawFlapModel);
//        this.renderPart(this.pitchFlapLeftModel);
//        this.renderPart(this.pitchFlapRightModel);
//        this.renderPart(this.pitchFlapLeftWingModel);
//        this.renderPart(this.pitchFlapRightWingModel);
//        this.renderPart(this.bodyWheelModel);
//        this.renderPart(this.tailWheelModel);
//        this.renderPart(this.leftWingWheelModel);
//        this.renderPart(this.rightWingWheelModel);
//        this.renderPart(this.tailDoorCloseModel);
//        this.renderPart(this.rightWingPos1Model);
//        this.renderPart(this.leftWingPos1Model);
//    }

    public void render(float f, float f1, float f2, float f3, float f4, float f5, EntityPlaneNew plane) { //float f5, EntityPlaneNew plane, float f
        float angle = plane.angle;
//        Iterator arr$ = plane.getPlaneType().propellers.iterator();
//        int i$;
//        while(arr$.hasNext()) {
//            Propeller len$ = (Propeller)arr$.next();
//            if(plane.isPartIntact(len$.planePart)) {
//                i$ = this.propellerModels[len$.ID].length;
//
//                for(int seat = 0; seat < i$; ++seat) {
//                    this.propellerModels[len$.ID][seat].field_78795_f = angle + (float)seat * 2.0F * (float)Math.PI / (float)i$;
//                    this.propellerModels[len$.ID][seat].render(f5);
//                }
//            }
//        }

        int i;
        for (i = 0; i < this.propellerModels.length; ++i) {
            int numParts = this.propellerModels[i].length;

            for (int j = 0; j < numParts; ++j) {
                this.propellerModels[i][j].rotateAngleX = angle + (float) j * 2.0F * (float) Math.PI / (float) numParts;
                this.propellerModels[i][j].render(f5);
            }
        }

        int var16;
        for (var16 = 0; var16 < this.noseModel.length; ++var16) {
            this.noseModel[var16].render(f5);
        }

        for (var16 = 0; var16 < this.bayModel.length; ++var16) {
            this.bayModel[var16].render(f5);
        }

        for (var16 = 0; var16 < this.tailModel.length; ++var16) {
            this.tailModel[var16].render(f5);
        }

        for (var16 = 0; var16 < this.tailDoorOpenModel.length; ++var16) {
            this.tailDoorOpenModel[var16].render(f5);
        }

        for (var16 = 0; var16 < this.tailDoorCloseModel.length; ++var16) {
            this.tailDoorCloseModel[var16].render(f5);
        }

        for (var16 = 0; var16 < this.yawFlapModel.length; ++var16) {
            this.yawFlapModel[var16].rotateAngleY = -plane.flapsYaw * (float) Math.PI / 180.0F;
            this.yawFlapModel[var16].render(f5);
        }

        for (var16 = 0; var16 < this.pitchFlapLeftModel.length; ++var16) {
            this.pitchFlapLeftModel[var16].rotateAngleZ = -plane.flapsPitchLeft * (float) Math.PI / 180.0F;
            this.pitchFlapLeftModel[var16].render(f5);
        }

        for (var16 = 0; var16 < this.pitchFlapRightModel.length; ++var16) {
            this.pitchFlapRightModel[var16].rotateAngleZ = -plane.flapsPitchRight * (float) Math.PI / 180.0F;
            this.pitchFlapRightModel[var16].render(f5);
        }

        for (var16 = 0; var16 < this.tailWheelModel.length; ++var16) {
            this.tailWheelModel[var16].render(f5);
        }

        for (var16 = 0; var16 < this.leftWingModel.length; ++var16) {
            this.leftWingModel[var16].render(f5);
        }

        for (var16 = 0; var16 < this.leftWingPos1Model.length; ++var16) {
            this.leftWingPos1Model[var16].render(f5);
        }

        for (var16 = 0; var16 < this.leftWingPos2Model.length; ++var16) {
            this.leftWingPos2Model[var16].render(f5);
        }

        for (var16 = 0; var16 < this.pitchFlapLeftWingModel.length; ++var16) {
            this.pitchFlapLeftWingModel[var16].rotateAngleZ = -plane.flapsPitchLeft * (float) Math.PI / 180.0F;
            this.pitchFlapLeftWingModel[var16].render(f5);
        }

        for (var16 = 0; var16 < this.rightWingModel.length; ++var16) {
            this.rightWingModel[var16].render(f5);
        }

        for (var16 = 0; var16 < this.rightWingPos1Model.length; ++var16) {
            this.rightWingPos1Model[var16].render(f5);
        }

        for (var16 = 0; var16 < this.rightWingPos2Model.length; ++var16) {
            this.rightWingPos2Model[var16].render(f5);
        }

        for (var16 = 0; var16 < this.pitchFlapRightWingModel.length; ++var16) {
            this.pitchFlapRightWingModel[var16].rotateAngleZ = -plane.flapsPitchRight * (float) Math.PI / 180.0F;
            this.pitchFlapRightWingModel[var16].render(f5);
        }


        for (var16 = 0; var16 < this.leftWingWheelModel.length; ++var16) {
            this.leftWingWheelModel[var16].render(f5);
        }

        for (var16 = 0; var16 < this.rightWingWheelModel.length; ++var16) {
            this.rightWingWheelModel[var16].render(f5);
        }

        for (var16 = 0; var16 < this.bodyModel.length; ++var16) {
            this.bodyModel[var16].render(f5);
        }

        for (var16 = 0; var16 < this.bodyDoorOpenModel.length; ++var16) {
            this.bodyDoorOpenModel[var16].render(f5);
        }

        for (var16 = 0; var16 < this.bodyDoorCloseModel.length; ++var16) {
            this.bodyDoorCloseModel[var16].render(f5);
        }


        for (var16 = 0; var16 < this.bodyWheelModel.length; ++var16) {
            this.bodyWheelModel[var16].render(f5);
        }

        for (var16 = 0; var16 < this.topWingModel.length; ++var16) {
            this.topWingModel[var16].render(f5);
        }

//        EntitySeat[] var19 = plane.seats;
//        int var17 = var19.length;
//
//        for(i$ = 0; i$ < var17; ++i$) {
//            EntitySeat var18 = var19[i$];
//            if(var18 != null && var18.seatInfo != null && var18.seatInfo.gunName != null && this.gunModels.get(var18.seatInfo.gunName) != null && plane.isPartIntact(var18.seatInfo.part)) {
//                float yaw = var18.prevLooking.getYaw() + (var18.looking.getYaw() - var18.prevLooking.getYaw()) * f;
//                float pitch = var18.prevLooking.getPitch() + (var18.looking.getPitch() - var18.prevLooking.getPitch()) * f;
//                ModelRendererTurbo[][] gunModel = (ModelRendererTurbo[][])this.gunModels.get(var18.seatInfo.gunName);
//                ModelRendererTurbo[] arr$1 = gunModel[0];
//                int len$1 = arr$1.length;
//
//                int i$1;
//                ModelRendererTurbo gunModelPart;
//                for(i$1 = 0; i$1 < len$1; ++i$1) {
//                    gunModelPart = arr$1[i$1];
//                    gunModelPart.field_78796_g = (180.0F - yaw) * (float)Math.PI / 180.0F;
//                    gunModelPart.func_78785_a(f5);
//                }
//
//                arr$1 = gunModel[1];
//                len$1 = arr$1.length;
//
//                for(i$1 = 0; i$1 < len$1; ++i$1) {
//                    gunModelPart = arr$1[i$1];
//                    gunModelPart.field_78796_g = (180.0F - yaw) * (float)Math.PI / 180.0F;
//                    gunModelPart.field_78808_h = -pitch * (float)Math.PI / 180.0F;
//                    gunModelPart.func_78785_a(f5);
//                }
//
//                arr$1 = gunModel[2];
//                len$1 = arr$1.length;
//
//                for(i$1 = 0; i$1 < len$1; ++i$1) {
//                    gunModelPart = arr$1[i$1];
//                    gunModelPart.field_78796_g = (180.0F - yaw) * (float)Math.PI / 180.0F;
//                    gunModelPart.field_78808_h = -pitch * (float)Math.PI / 180.0F;
//                    gunModelPart.func_78785_a(f5);
//                }
//            }
        }


    public void flipAll() {
//        this.flipAll2();
        this.flip(this.bodyModel);
        this.flip(this.bodyDoorOpenModel);
        this.flip(this.bodyDoorCloseModel);
        this.flip(this.noseModel);
        this.flip(this.leftWingModel);
        this.flip(this.rightWingModel);
        this.flip(this.topWingModel);
        this.flip(this.bayModel);
        this.flip(this.tailModel);
        this.flip(this.yawFlapModel);
        this.flip(this.pitchFlapLeftModel);
        this.flip(this.pitchFlapRightModel);
        this.flip(this.pitchFlapLeftWingModel);
        this.flip(this.pitchFlapRightWingModel);
        this.flip(this.bodyWheelModel);
        this.flip(this.tailWheelModel);
        this.flip(this.leftWingWheelModel);
        this.flip(this.rightWingWheelModel);
        this.flip(this.tailDoorOpenModel);
        this.flip(this.tailDoorCloseModel);
        this.flip(this.rightWingPos1Model);
        this.flip(this.rightWingPos2Model);
        this.flip(this.leftWingPos1Model);
        this.flip(this.leftWingPos2Model);
        ModelRendererTurbo[][] arr$ = this.propellerModels;
        int len$ = arr$.length;

        for(int i$ = 0; i$ < len$; ++i$) {
            ModelRendererTurbo[] propellerModel = arr$[i$];
            this.flip(propellerModel);
        }
    }

    public void translateAll(float x, float y, float z) {
//        this.translateAll2(x, y, z);
        this.translate(this.bodyModel, x, y, z);
        this.translate(this.bodyDoorOpenModel, x, y, z);
        this.translate(this.bodyDoorCloseModel, x, y, z);
        this.translate(this.noseModel, x, y, z);
        this.translate(this.leftWingModel, x, y, z);
        this.translate(this.rightWingModel, x, y, z);
        this.translate(this.topWingModel, x, y, z);
        this.translate(this.bayModel, x, y, z);
        this.translate(this.tailModel, x, y, z);
        this.translate(this.yawFlapModel, x, y, z);
        this.translate(this.pitchFlapLeftModel, x, y, z);
        this.translate(this.pitchFlapRightModel, x, y, z);
        this.translate(this.pitchFlapLeftWingModel, x, y, z);
        this.translate(this.pitchFlapRightWingModel, x, y, z);
        this.translate(this.bodyWheelModel, x, y, z);
        this.translate(this.tailWheelModel, x, y, z);
        this.translate(this.leftWingWheelModel, x, y, z);
        this.translate(this.rightWingWheelModel, x, y, z);
        this.translate(this.tailDoorOpenModel, x, y, z);
        this.translate(this.tailDoorCloseModel, x, y, z);
        this.translate(this.rightWingPos1Model, x, y, z);
        this.translate(this.rightWingPos2Model, x, y, z);
        this.translate(this.leftWingPos1Model, x, y, z);
        this.translate(this.leftWingPos2Model, x, y, z);
        ModelRendererTurbo[][] arr$ = this.propellerModels;
        int len$ = arr$.length;

        for(int i$ = 0; i$ < len$; ++i$) {
            ModelRendererTurbo[] mods = arr$[i$];
            this.translate(mods, x, y, z);
        }

    }

        public void setRotationAngles ( float f, float f1, float f2, float f3, float f4, float f5){ //dopiero co naprawilem{
        }

    protected void flip(ModelRendererTurbo[] model) {
        ModelRendererTurbo[] arr$ = model;
        int len$ = model.length;

        for(int i$ = 0; i$ < len$; ++i$) {
            ModelRendererTurbo part = arr$[i$];
            part.doMirror(false, true, true);
            part.setRotationPoint(part.rotationPointX, -part.rotationPointY, -part.rotationPointZ);
        }

    }

    public void flipAll2() {
        this.flip(this.bodyModel);
        this.flip(this.bodyDoorOpenModel);
        this.flip(this.bodyDoorCloseModel);
//        Iterator i$ = this.gunModels.values().iterator();
//
//        while(i$.hasNext()) {
//            ModelRendererTurbo[][] modsOfMods = (ModelRendererTurbo[][])i$.next();
//            ModelRendererTurbo[][] arr$ = modsOfMods;
//            int len$ = modsOfMods.length;
//
//            for(int i$1 = 0; i$1 < len$; ++i$1) {
//                ModelRendererTurbo[] mods = arr$[i$1];
//                this.flip(mods);
//            }
//        }

    }

    protected void translate(ModelRendererTurbo[] model, float x, float y, float z) {
        ModelRendererTurbo[] arr$ = model;
        int len$ = model.length;

        for(int i$ = 0; i$ < len$; ++i$) {
            ModelRendererTurbo mod = arr$[i$];
            mod.rotationPointX += x;
            mod.rotationPointY += y;
            mod.rotationPointZ += z;
        }

    }

    public void translateAll2(float x, float y, float z) {
        this.translate(this.bodyModel, x, y, z);
        this.translate(this.bodyDoorOpenModel, x, y, z);
        this.translate(this.bodyDoorCloseModel, x, y, z);
//        Iterator i$ = this.gunModels.values().iterator();
//
//        while(i$.hasNext()) {
//            ModelRendererTurbo[][] modsOfMods = (ModelRendererTurbo[][])i$.next();
//            ModelRendererTurbo[][] arr$ = modsOfMods;
//            int len$ = modsOfMods.length;
//
//            for(int i$1 = 0; i$1 < len$; ++i$1) {
//                ModelRendererTurbo[] mods = arr$[i$1];
//                this.translate(mods, x, y, z);
//            }
//        }

    }
    }


