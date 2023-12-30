package net.kozibrodka.planes.events;

import net.kozibrodka.planes.entity.EntityAAGun;
import net.kozibrodka.planes.entity.EntityPlane;
import net.kozibrodka.planes.entity.EntityPlaneNew;
import net.kozibrodka.planes.item.*;
import net.kozibrodka.planes.properties.*;
import net.kozibrodka.planes.recipe.BlockPlaneWorkbench;
import net.kozibrodka.planes.recipe.PlaneRecipeRegistry;
import net.kozibrodka.planes.render.RenderAAGun;
import net.kozibrodka.planes.render.RenderPlane;
import net.kozibrodka.planes.render.RenderPlaneNew;
import net.kozibrodka.sdk_api.events.init.ww2Parts;
import net.mine_diver.unsafeevents.listener.EventListener;
import net.mine_diver.unsafeevents.listener.ListenerPriority;
import net.minecraft.achievement.Achievement;
import net.minecraft.achievement.Achievements;
import net.minecraft.block.BlockBase;
import net.modificationstation.stationapi.api.client.event.render.entity.EntityRendererRegisterEvent;
import net.modificationstation.stationapi.api.event.achievement.AchievementRegisterEvent;
import net.modificationstation.stationapi.api.event.entity.EntityRegister;
import net.modificationstation.stationapi.api.event.recipe.RecipeRegisterEvent;
import net.modificationstation.stationapi.api.event.registry.BlockRegistryEvent;
import net.modificationstation.stationapi.api.event.registry.EntityHandlerRegistryEvent;
import net.modificationstation.stationapi.api.event.registry.ItemRegistryEvent;
import net.modificationstation.stationapi.api.mod.entrypoint.Entrypoint;
import net.modificationstation.stationapi.api.registry.Identifier;
import net.modificationstation.stationapi.api.registry.ModID;
import net.modificationstation.stationapi.api.registry.Registry;
import net.modificationstation.stationapi.api.template.block.TemplateBlockBase;
import net.modificationstation.stationapi.api.template.item.TemplateItemBase;
import net.modificationstation.stationapi.api.util.Null;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

public class mod_Planes {

    @Entrypoint.ModID
    public static final ModID MOD_ID = Null.get();

    public static PlaneType getPlaneType(String s) {
        return (PlaneType) planeMapping.get(s);
    }
    public static PlaneTypeNew getPlaneTypeNew(String s) {
        return (PlaneTypeNew) planeMappingNew.get(s);
    }
    public static AAGunType getAAGunType(String s) {return (AAGunType) aaGunMapping.get(s);}

    public static boolean bulletsEnabled = true;
    public static boolean bombsEnabled = true;
    public static boolean aaEnabled = true;
    public static boolean planesExplode = true;
    public static boolean useMouseControl = false;

    public static Achievement craftPlane;
    public static Achievement startPlane;
    public static Achievement shootGhast;
    public static Achievement maxSpeed;
    public static Achievement dropNapalm;

    private static Map planeMapping = new HashMap();
    private static Map planeMappingNew = new HashMap();
    private static Map aaGunMapping = new HashMap();

    public static PlaneType type = null;
    public static PlaneTypeNew typeNew = null;

    public static TemplateItemBase smallBomb;
    public static TemplateItemBase largeBomb;
    public static TemplateItemBase napalm;
    public static TemplateItemBase panzerBomb;
    public static TemplateItemBase bullet;
    public static TemplateItemBase rocketAircraft;
    public static TemplateItemBase rocketAircraftPanzer;
    public static TemplateItemBase aaShell;
    public static TemplateItemBase planeFuel;
    public static TemplateItemBase planeBlowTorch;

    public static TemplateItemBase itemGunAircraft;
    public static TemplateItemBase itemGunAircraftRocket;
    public static TemplateItemBase itemGunAircraftRocketPanzer;

    public static TemplateItemBase BF109;
    public static TemplateItemBase Biplane;
    public static TemplateItemBase Camel;
    public static TemplateItemBase Fokker;
    public static TemplateItemBase Mustang;
    public static TemplateItemBase Spitfire;
    public static TemplateItemBase TwoSeaterBiplane;

    public static TemplateItemBase bofors;
    public static TemplateItemBase flakvierling;

    public static TemplateItemBase planeNew_YAK5;
    public static TemplateItemBase planeNew_Spitfire1;
    public static TemplateItemBase planeNew_Spitfire2;
    public static TemplateItemBase planeNew_P38;
    public static TemplateItemBase planeNew_P38a;
    public static TemplateItemBase planeNew_ME262;
    public static TemplateItemBase planeNew_ME109;
    public static TemplateItemBase planeNew_JU87G;
    public static TemplateItemBase planeNew_JU87;
    public static TemplateItemBase planeNew_Hurricane;
    public static TemplateItemBase planeNew_HE111;

    public static TemplateBlockBase planeWorkbench;

    @EventListener
    public void registerItems(ItemRegistryEvent event) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        bullet = (TemplateItemBase) new TemplateItemBase(Identifier.of(MOD_ID, "bullet")).setTranslationKey(MOD_ID, "bullet");
        aaShell = (TemplateItemBase) new TemplateItemBase(Identifier.of(MOD_ID, "aaShell")).setTranslationKey(MOD_ID, "aaShell");
        rocketAircraft = (TemplateItemBase) new TemplateItemBase(Identifier.of(MOD_ID, "rocketAircraft")).setTranslationKey(MOD_ID, "rocketAircraft").setMaxStackSize(2);
        rocketAircraftPanzer = (TemplateItemBase) new TemplateItemBase(Identifier.of(MOD_ID, "rocketAircraftPanzer")).setTranslationKey(MOD_ID, "rocketAircraftPanzer").setMaxStackSize(3);
        smallBomb = (TemplateItemBase) new TemplateItemBase(Identifier.of(MOD_ID, "smallBomb")).setTranslationKey(MOD_ID, "smallBomb").setMaxStackSize(2);
        panzerBomb = (TemplateItemBase) new TemplateItemBase(Identifier.of(MOD_ID, "panzerBomb")).setTranslationKey(MOD_ID, "panzerBomb").setMaxStackSize(2);
        largeBomb = (TemplateItemBase) new TemplateItemBase(Identifier.of(MOD_ID, "largeBomb")).setTranslationKey(MOD_ID, "largeBomb").setMaxStackSize(1);
        napalm = (TemplateItemBase) new TemplateItemBase(Identifier.of(MOD_ID, "napalm")).setTranslationKey(MOD_ID, "napalm").setMaxStackSize(2);
        planeFuel = (TemplateItemBase) new TemplateItemBase(Identifier.of(MOD_ID, "planeFuel")).setTranslationKey(MOD_ID, "planeFuel");
        planeBlowTorch = (TemplateItemBase) new TemplateItemBase(Identifier.of(MOD_ID, "planeBlowTorch")).setTranslationKey(MOD_ID, "planeBlowTorch");

        itemGunAircraft = (TemplateItemBase) new SdkItemGunAircraft(Identifier.of(MOD_ID, "itemGunAircraft")).setTranslationKey(MOD_ID, "itemGunAircraft");
        itemGunAircraftRocket = (TemplateItemBase) new SdkItemGunAircraftRocket(Identifier.of(MOD_ID, "itemGunAircraftRocket")).setTranslationKey(MOD_ID, "itemGunAircraftRocket");
        itemGunAircraftRocketPanzer = (TemplateItemBase) new SdkItemGunAircraftRocketPanzer(Identifier.of(MOD_ID, "itemGunAircraftRocketPanzer")).setTranslationKey(MOD_ID, "itemGunAircraftRocketPanzer");

        new PlaneType(new Properties_BF109());
        new PlaneType(new Properties_Biplane());
        new PlaneType(new Properties_Camel());
        new PlaneType(new Properties_Fokker());
        new PlaneType(new Properties_Mustang());
        new PlaneType(new Properties_Spitfire());
        new PlaneType(new Properties_TwoSeaterBiplane());

        new PlaneTypeNew(new PropertiesNew_YAK5());
        new PlaneTypeNew(new PropertiesNew_HE111());
        new PlaneTypeNew(new PropertiesNew_Hurricane());
        new PlaneTypeNew(new PropertiesNew_JU87());
        new PlaneTypeNew(new PropertiesNew_JU87G());
        new PlaneTypeNew(new PropertiesNew_ME109());
        new PlaneTypeNew(new PropertiesNew_ME262());
        new PlaneTypeNew(new PropertiesNew_P38());
        new PlaneTypeNew(new PropertiesNew_P38a());
        new PlaneTypeNew(new PropertiesNew_SpitfireBrown());
        new PlaneTypeNew(new PropertiesNew_SpitfireGrey());

        new AAGunType(new Properties_Bofors());
        new AAGunType(new Properties_Flakvierling());

        for (int i = 0; i < PlaneType.types.size(); i++) {
            PlaneType planetype = (PlaneType) PlaneType.types.get(i);
            System.out.println((new StringBuilder()).append("mod_Planes added plane : ").append(planetype.shortName).toString());

            planeMapping.put(planetype.shortName, planetype);
            planetype.przedmiot = (TemplateItemBase) new ItemPlane(Identifier.of(MOD_ID, planetype.shortName), planetype.shortName).setTranslationKey(MOD_ID, planetype.shortName).setMaxStackSize(1);
        }

        for (int i = 0; i < PlaneTypeNew.types.size(); i++) {
            PlaneTypeNew planetype = (PlaneTypeNew) PlaneTypeNew.types.get(i);
            System.out.println((new StringBuilder()).append("mod_Planes added planeNew : ").append(planetype.shortName).toString());

            planeMappingNew.put(planetype.shortName, planetype);
            planetype.przedmiot = (TemplateItemBase) new ItemPlaneNew(Identifier.of(MOD_ID, planetype.shortName), planetype.shortName).setTranslationKey(MOD_ID, planetype.shortName).setMaxStackSize(1);
        }

        for (int i = 0; i < AAGunType.types.size(); i++) {
            AAGunType planetype = (AAGunType) AAGunType.types.get(i);
            System.out.println((new StringBuilder()).append("mod_Planes added aaGun : ").append(planetype.shortName).toString());

            aaGunMapping.put(planetype.shortName, planetype);
            planetype.przedmiot = (TemplateItemBase) new ItemAAGun(Identifier.of(MOD_ID, planetype.shortName), planetype.shortName).setTranslationKey(MOD_ID, planetype.shortName).setMaxStackSize(1);
        }

    }

    @EventListener
    public void registerBlocks(BlockRegistryEvent samolotAddEvent) {
        planeWorkbench = (TemplateBlockBase) new BlockPlaneWorkbench(Identifier.of(MOD_ID, "planeWorkbench")).setTranslationKey(MOD_ID, "planeWorkbench").setHardness(5F).setBlastResistance(10F).setSounds(BlockBase.METAL_SOUNDS);
    }

    @EventListener
    public void registerRecipes(RecipeRegisterEvent event){
        PlaneRecipeRegistry.getInstance().initPlaneRecipe();
    }

    @EventListener(priority = ListenerPriority.HIGHEST)
    public void registerAchievements(AchievementRegisterEvent event) {
        craftPlane = new Achievement(230, MOD_ID.id("craftPlane").toString(), -5, 4, ww2Parts.woodenPropeller, Achievements.AQUIRE_IRON).method_1041();
        startPlane = new Achievement(231, MOD_ID.id("startPlane").toString(), -7, 4, ww2Parts.smallEngine, craftPlane).method_1041();
        shootGhast = new Achievement(232, MOD_ID.id("shootGhast").toString(), -9, 4, mod_Planes.bullet, startPlane).method_1041();
        maxSpeed = new Achievement(233, MOD_ID.id("maxSpeed").toString(), -7, 2, ww2Parts.metalPropeller, startPlane).method_1041();
        dropNapalm = new Achievement(234, MOD_ID.id("dropNapalm").toString(), -7, 6, mod_Planes.napalm, startPlane).method_1041();
    }

    @EventListener
    private static void registerEntities(EntityRegister event) {
        event.register(EntityPlane.class, String.valueOf(Identifier.of(MOD_ID, "EntityPlane")));
        event.register(EntityPlaneNew.class, String.valueOf(Identifier.of(MOD_ID, "EntityPlaneNew")));
        event.register(EntityAAGun.class, String.valueOf(Identifier.of(MOD_ID, "EntityAAGun")));
    }

    @EventListener
    private static void registerMobHandlers(EntityHandlerRegistryEvent event) {
        Registry.register(event.registry, MOD_ID.id("EntityPlane"), EntityPlane::new);
        Registry.register(event.registry, MOD_ID.id("EntityPlaneNew"), EntityPlaneNew::new);
        Registry.register(event.registry, MOD_ID.id("EntityAAGun"), EntityAAGun::new);
    }

}

