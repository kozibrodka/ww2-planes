package net.kozibrodka.planes.events;

import net.kozibrodka.planes.entity.EntityAAGun;
import net.kozibrodka.planes.entity.EntityPlane;
import net.kozibrodka.planes.entity.EntityPlaneNew;
import net.kozibrodka.planes.render.RenderAAGun;
import net.kozibrodka.planes.render.RenderPlane;
import net.kozibrodka.planes.render.RenderPlaneNew;
import net.mine_diver.unsafeevents.listener.EventListener;
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
//        ItemListener.itemAtv.setTexture(Identifier.of(MOD_ID, "item/itemAtv"));
//        lighter_top = registerBlockTexture("block/blockLighterTop");
    }

    @EventListener
    private static void registerEntityRenderers(EntityRendererRegisterEvent event) {
        event.renderers.put(EntityPlane.class, new RenderPlane());
        event.renderers.put(EntityPlaneNew.class, new RenderPlaneNew());
        event.renderers.put(EntityAAGun.class, new RenderAAGun());
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
}
