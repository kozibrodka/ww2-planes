package net.kozibrodka.planes.events;

import net.kozibrodka.planes.entity.*;
import net.kozibrodka.planes.render.*;
import net.mine_diver.unsafeevents.listener.EventListener;
import net.mine_diver.unsafeevents.listener.ListenerPriority;
import net.modificationstation.stationapi.api.client.event.render.entity.EntityRendererRegisterEvent;
import net.modificationstation.stationapi.api.client.event.texture.TextureRegisterEvent;
import net.modificationstation.stationapi.api.client.texture.atlas.Atlases;
import net.modificationstation.stationapi.api.mod.entrypoint.Entrypoint;
import net.modificationstation.stationapi.api.registry.Identifier;
import net.modificationstation.stationapi.api.registry.ModID;
import net.modificationstation.stationapi.api.util.Null;

public class TextureListener {

    @Entrypoint.ModID
    public static final ModID MOD_ID = Null.get();

    @EventListener
    public void registerTextures(TextureRegisterEvent event) {
        mod_Planes.bullet.setTexture(Identifier.of(MOD_ID, "item/Bullet"));
        mod_Planes.aaShell.setTexture(Identifier.of(MOD_ID, "item/AAShell"));
        mod_Planes.rocketAircraft.setTexture(Identifier.of(MOD_ID, "item/RocketAir"));
        mod_Planes.rocketAircraftPanzer.setTexture(Identifier.of(MOD_ID, "item/RocketAirP"));
        mod_Planes.smallBomb.setTexture(Identifier.of(MOD_ID, "item/Bomb"));
        mod_Planes.panzerBomb.setTexture(Identifier.of(MOD_ID, "item/PanzerBomb"));
        mod_Planes.largeBomb.setTexture(Identifier.of(MOD_ID, "item/BigBomb"));
        mod_Planes.napalm.setTexture(Identifier.of(MOD_ID, "item/Napalm"));
        mod_Planes.planeFuel.setTexture(Identifier.of(MOD_ID, "item/FuelCan"));
        mod_Planes.planeBlowTorch.setTexture(Identifier.of(MOD_ID, "item/blowtorch"));
        mod_Planes.itemGunAircraft.setTexture(Identifier.of(MOD_ID, "item/PlaneGun"));
        mod_Planes.itemGunAircraftRocket.setTexture(Identifier.of(MOD_ID, "item/PlaneGun"));
        mod_Planes.itemGunAircraftRocketPanzer.setTexture(Identifier.of(MOD_ID, "item/PlaneGun"));

//        mod_Planes.BF109.setTexture(Identifier.of(MOD_ID, "item/BF109"));
//        mod_Planes.Biplane.setTexture(Identifier.of(MOD_ID, "item/Biplane"));
//        mod_Planes.Camel.setTexture(Identifier.of(MOD_ID, "item/Camel"));
//        mod_Planes.Fokker.setTexture(Identifier.of(MOD_ID, "item/Fokker"));
//        mod_Planes.Mustang.setTexture(Identifier.of(MOD_ID, "item/Mustang"));
//        mod_Planes.Spitfire.setTexture(Identifier.of(MOD_ID, "item/Spitfire"));
//        mod_Planes.TwoSeaterBiplane.setTexture(Identifier.of(MOD_ID, "item/TwoSeaterBiplane"));
//        mod_Planes.bofors.setTexture(Identifier.of(MOD_ID, "item/AAAllies"));
//        mod_Planes.flakvierling.setTexture(Identifier.of(MOD_ID, "item/AAAxis"));
//
//        mod_Planes.planeNew_YAK5.setTexture(Identifier.of(MOD_ID, "item/IconYAK5"));
//        mod_Planes.planeNew_Spitfire1.setTexture(Identifier.of(MOD_ID, "item/IconSupermarineSpitfireGrey"));
//        mod_Planes.planeNew_Spitfire2.setTexture(Identifier.of(MOD_ID, "item/IconSupermarineSpitfireBrown"));
//        mod_Planes.planeNew_P38.setTexture(Identifier.of(MOD_ID, "item/IconP38"));
//        mod_Planes.planeNew_P38a.setTexture(Identifier.of(MOD_ID, "item/IconP38a"));
//        mod_Planes.planeNew_ME262.setTexture(Identifier.of(MOD_ID, "item/IconME262"));
//        mod_Planes.planeNew_ME109.setTexture(Identifier.of(MOD_ID, "item/IconME109"));
//        mod_Planes.planeNew_JU87G.setTexture(Identifier.of(MOD_ID, "item/IconJu87"));
//        mod_Planes.planeNew_JU87.setTexture(Identifier.of(MOD_ID, "item/IconJu87"));
//        mod_Planes.planeNew_Hurricane.setTexture(Identifier.of(MOD_ID, "item/IconHurricane"));
//        mod_Planes.planeNew_HE111.setTexture(Identifier.of(MOD_ID, "item/IconHE111"));

        plane_work_top = registerBlockTexture("block/PlaneWorkbenchTop");
        plane_work_side = registerBlockTexture("block/PlaneWorkbench");
        plane_work_bottom = registerBlockTexture("block/WorkbrnchBottom");
    }

    @EventListener
    private static void registerEntityRenderers(EntityRendererRegisterEvent event) {
        event.renderers.put(EntityPlane.class, new RenderPlane());
        event.renderers.put(EntityPlaneNew.class, new RenderPlaneNew());
        event.renderers.put(EntityAAGun.class, new RenderAAGun());
        event.renderers.put(EntityAAShell.class, new RenderAAShell());
        event.renderers.put(SdkEntityBulletAircraft.class, new SdkRenderBulletAircraft());
        event.renderers.put(EntityBomb.class, new RenderBomb());
        event.renderers.put(SdkEntityBulletAircraftRocket.class, new SdkRenderBulletRocket());
        event.renderers.put(SdkEntityBulletAircraftRocketPanzer.class, new SdkRenderBulletRocket());
    }

    private int registerBlockTexture(String s) {
        if(s == null) {
            return 0;
        }
        return Atlases.getStationTerrain().addTexture(Identifier.of(MOD_ID, s)).index;
    }

    private int registerItemTexture(String s) {
        if(s == null) {
            return 0;
        }
        return Atlases.getStationGuiItems().addTexture(Identifier.of(MOD_ID, s)).index;
    }

    public static int plane_work_top;
    public static int plane_work_side;
    public static int plane_work_bottom;
}
