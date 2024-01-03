package net.kozibrodka.planes.events;

import net.glasslauncher.hmifabric.event.HMITabRegistryEvent;
import net.glasslauncher.mods.api.gcapi.api.GConfig;
import net.kozibrodka.planes.entity.*;
import net.kozibrodka.planes.item.*;
import net.kozibrodka.planes.properties.*;
import net.kozibrodka.planes.recipe.PlanelRecipeTab;
import net.kozibrodka.planes.recipe.BlockPlaneWorkbench;
import net.kozibrodka.planes.recipe.PlaneRecipeRegistry;
import net.kozibrodka.sdk_api.events.init.ww2Parts;
import net.kozibrodka.sdk_api.events.utils.SdkMap;
import net.kozibrodka.sdk_api.events.utils.WW2Plane;
import net.mine_diver.unsafeevents.listener.EventListener;
import net.mine_diver.unsafeevents.listener.ListenerPriority;
import net.minecraft.achievement.Achievement;
import net.minecraft.achievement.Achievements;
import net.minecraft.block.BlockBase;
import net.minecraft.item.ItemInstance;
import net.modificationstation.stationapi.api.event.achievement.AchievementRegisterEvent;
import net.modificationstation.stationapi.api.event.entity.EntityRegister;
import net.modificationstation.stationapi.api.event.recipe.RecipeRegisterEvent;
import net.modificationstation.stationapi.api.event.registry.BlockRegistryEvent;
import net.modificationstation.stationapi.api.event.registry.EntityHandlerRegistryEvent;
import net.modificationstation.stationapi.api.event.registry.ItemRegistryEvent;
import net.modificationstation.stationapi.api.mod.entrypoint.Entrypoint;
import net.modificationstation.stationapi.api.registry.Registry;
import net.modificationstation.stationapi.api.util.Null;
import net.modificationstation.stationapi.api.template.item.TemplateItem;
import net.modificationstation.stationapi.api.template.block.TemplateBlock;
import net.modificationstation.stationapi.api.util.Identifier;
import net.modificationstation.stationapi.api.util.Namespace;
import net.modificationstation.stationapi.api.util.Null;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

public class mod_Planes {

    @GConfig(value = "PlanesCFG", visibleName = "WW2 Planes Config")
    public static final PlanesCFG planesGlass = new PlanesCFG();

    @Entrypoint.Namespace
    public static final Namespace MOD_ID = Null.get();

    public static PlaneType getPlaneType(String s) {
        return (PlaneType) planeMapping.get(s);
    }
    public static PlaneTypeNew getPlaneTypeNew(String s) {
        return (PlaneTypeNew) planeMappingNew.get(s);
    }
    public static AAGunType getAAGunType(String s) {return (AAGunType) aaGunMapping.get(s);}


    public static boolean bulletsEnabled = true;
    public static boolean bombsEnabled = true;
    public static boolean planesExplode = true;

    public static boolean useMouseControl = false;
    public static boolean aaEnabled = true;

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

    public static TemplateItem smallBomb;
    public static TemplateItem largeBomb;
    public static TemplateItem napalm;
    public static TemplateItem panzerBomb;
    public static TemplateItem bullet;
    public static TemplateItem rocketAircraft;
    public static TemplateItem rocketAircraftPanzer;
    public static TemplateItem aaShell;
    public static TemplateItem planeFuel;
    public static TemplateItem planeBlowTorch;

    public static TemplateItem itemGunAircraft;
    public static TemplateItem itemGunAircraftRocket;
    public static TemplateItem itemGunAircraftRocketPanzer;

    public static TemplateItem BF109;
    public static TemplateItem Biplane;
    public static TemplateItem Camel;
    public static TemplateItem Fokker;
    public static TemplateItem Mustang;
    public static TemplateItem Spitfire;
    public static TemplateItem TwoSeaterBiplane;
    public static TemplateItem Lancaster;

    public static TemplateItem bofors;
    public static TemplateItem flakvierling;

    public static TemplateItem flak88;
    public static TemplateItem flak88a;
    public static TemplateItem flak88b;
    public static TemplateItem flak88c;

    public static TemplateItem planeNew_YAK5;
    public static TemplateItem planeNew_Spitfire1;
    public static TemplateItem planeNew_Spitfire2;
    public static TemplateItem planeNew_P38;
    public static TemplateItem planeNew_P38a;
    public static TemplateItem planeNew_ME262;
    public static TemplateItem planeNew_ME109;
    public static TemplateItem planeNew_JU87G;
    public static TemplateItem planeNew_JU87;
    public static TemplateItem planeNew_Hurricane;
    public static TemplateItem planeNew_HE111;

    public static TemplateBlock planeWorkbench;

    //todo: passengers, nie wiem czy w ogole dziala.     Otwieranie inventory jedynie przy zerowej prędkośći??? balans hp. , change ekwipunek samolotu?, fkalverling reload (first one)

    @EventListener
    public void registerItems(ItemRegistryEvent event) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        bullet = (TemplateItem) new TemplateItem(Identifier.of(MOD_ID, "bullet")).setTranslationKey(MOD_ID, "bullet");
        aaShell = (TemplateItem) new TemplateItem(Identifier.of(MOD_ID, "aaShell")).setTranslationKey(MOD_ID, "aaShell");
        rocketAircraft = (TemplateItem) new TemplateItem(Identifier.of(MOD_ID, "rocketAircraft")).setTranslationKey(MOD_ID, "rocketAircraft").setMaxStackSize(2);
        rocketAircraftPanzer = (TemplateItem) new TemplateItem(Identifier.of(MOD_ID, "rocketAircraftPanzer")).setTranslationKey(MOD_ID, "rocketAircraftPanzer").setMaxStackSize(3);
        smallBomb = (TemplateItem) new TemplateItem(Identifier.of(MOD_ID, "smallBomb")).setTranslationKey(MOD_ID, "smallBomb").setMaxStackSize(2);
        panzerBomb = (TemplateItem) new TemplateItem(Identifier.of(MOD_ID, "panzerBomb")).setTranslationKey(MOD_ID, "panzerBomb").setMaxStackSize(2);
        largeBomb = (TemplateItem) new TemplateItem(Identifier.of(MOD_ID, "largeBomb")).setTranslationKey(MOD_ID, "largeBomb").setMaxStackSize(1);
        napalm = (TemplateItem) new TemplateItem(Identifier.of(MOD_ID, "napalm")).setTranslationKey(MOD_ID, "napalm").setMaxStackSize(2);
        planeFuel = (TemplateItem) new TemplateItem(Identifier.of(MOD_ID, "planeFuel")).setTranslationKey(MOD_ID, "planeFuel");
        planeBlowTorch = (TemplateItem) new TemplateItem(Identifier.of(MOD_ID, "planeBlowTorch")).setTranslationKey(MOD_ID, "planeBlowTorch").setMaxStackSize(1).setDurability(64);;

        itemGunAircraft = (TemplateItem) new SdkItemGunAircraft(Identifier.of(MOD_ID, "itemGunAircraft")).setTranslationKey(MOD_ID, "itemGunAircraft");
        itemGunAircraftRocket = (TemplateItem) new SdkItemGunAircraftRocket(Identifier.of(MOD_ID, "itemGunAircraftRocket")).setTranslationKey(MOD_ID, "itemGunAircraftRocket");
        itemGunAircraftRocketPanzer = (TemplateItem) new SdkItemGunAircraftRocketPanzer(Identifier.of(MOD_ID, "itemGunAircraftRocketPanzer")).setTranslationKey(MOD_ID, "itemGunAircraftRocketPanzer");

        if(planesGlass.registerPlanes_OLD) {
            new PlaneType(new Properties_BF109());
            new PlaneType(new Properties_Biplane());
            new PlaneType(new Properties_Camel());
            new PlaneType(new Properties_Fokker());
            new PlaneType(new Properties_Mustang());
            new PlaneType(new Properties_Spitfire());
            new PlaneType(new Properties_TwoSeaterBiplane());
        }

        if(planesGlass.registerPlanes_NEW) {
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
            new PlaneTypeNew(new PropertiesNew_Lancaster());
        }

        if(planesGlass.registerAA) {
            new AAGunType(new Properties_Bofors());
            new AAGunType(new Properties_Flakvierling());
//            new AAGunType(new Properties_Flak88());
//            new AAGunType(new Properties_Flak88a());
//            new AAGunType(new Properties_Flak88b());
//            new AAGunType(new Properties_Flak88c());
        }

        for (int i = 0; i < PlaneType.types.size(); i++) {
            PlaneType planetype = (PlaneType) PlaneType.types.get(i);
            System.out.println((new StringBuilder()).append("mod_Planes added plane : ").append(planetype.shortName).toString());

            planeMapping.put(planetype.shortName, planetype);
            planetype.przedmiot = (TemplateItem) new ItemPlane(Identifier.of(MOD_ID, planetype.shortName), planetype.shortName).setTranslationKey(MOD_ID, planetype.shortName).setMaxStackSize(1);
        }

        for (int i = 0; i < PlaneTypeNew.types.size(); i++) {
            PlaneTypeNew planetype = (PlaneTypeNew) PlaneTypeNew.types.get(i);
            System.out.println((new StringBuilder()).append("mod_Planes added planeNew : ").append(planetype.shortName).toString());

            planeMappingNew.put(planetype.shortName, planetype);
            planetype.przedmiot = (TemplateItem) new ItemPlaneNew(Identifier.of(MOD_ID, planetype.shortName), planetype.shortName).setTranslationKey(MOD_ID, planetype.shortName).setMaxStackSize(1);
        }

        for (int i = 0; i < AAGunType.types.size(); i++) {
            AAGunType planetype = (AAGunType) AAGunType.types.get(i);
            System.out.println((new StringBuilder()).append("mod_Planes added aaGun : ").append(planetype.shortName).toString());

            aaGunMapping.put(planetype.shortName, planetype);
            planetype.przedmiot = (TemplateItem) new ItemAAGun(Identifier.of(MOD_ID, planetype.shortName), planetype.shortName).setTranslationKey(MOD_ID, planetype.shortName).setMaxStackSize(1);
        }

    }

    @EventListener
    public void registerBlocks(BlockRegistryEvent samolotAddEvent) {
        planeWorkbench = (TemplateBlock) new BlockPlaneWorkbench(Identifier.of(MOD_ID, "planeWorkbench")).setTranslationKey(MOD_ID, "planeWorkbench").setHardness(5F).setBlastResistance(10F).setSounds(BlockBase.METAL_SOUNDS);
    }

    @EventListener
    public void registerRecipes(RecipeRegisterEvent event){
        PlaneRecipeRegistry.getInstance().initPlaneRecipe();
    }

    @EventListener(priority = ListenerPriority.HIGH) //highest
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
        event.register(EntityAAShell.class, String.valueOf(Identifier.of(MOD_ID, "EntityAAShell")));
        event.register(SdkEntityBulletAircraft.class, String.valueOf(Identifier.of(MOD_ID, "SdkEntityBulletAircraft")));
        event.register(EntityBomb.class, String.valueOf(Identifier.of(MOD_ID, "EntityBomb")));
        event.register(SdkEntityBulletAircraftRocket.class, String.valueOf(Identifier.of(MOD_ID, "SdkEntityBulletAircraftRocket")));
        event.register(SdkEntityBulletAircraftRocketPanzer.class, String.valueOf(Identifier.of(MOD_ID, "SdkEntityBulletAircraftRocketPanzer")));
    }

    @EventListener
    private static void registerMobHandlers(EntityHandlerRegistryEvent event) {
        Registry.register(event.registry, MOD_ID.id("EntityPlane"), EntityPlane::new);
        Registry.register(event.registry, MOD_ID.id("EntityPlaneNew"), EntityPlaneNew::new);
        Registry.register(event.registry, MOD_ID.id("EntityAAGun"), EntityAAGun::new);
        Registry.register(event.registry, MOD_ID.id("EntityAAShell"), EntityAAShell::new);
        Registry.register(event.registry, MOD_ID.id("SdkEntityBulletAircraft"), SdkEntityBulletAircraft::new);
        Registry.register(event.registry, MOD_ID.id("EntityBomb"), EntityBomb::new);
        Registry.register(event.registry, MOD_ID.id("SdkEntityBulletAircraftRocket"), SdkEntityBulletAircraftRocket::new);
        Registry.register(event.registry, MOD_ID.id("SdkEntityBulletAircraftRocketPanzer"), SdkEntityBulletAircraftRocketPanzer::new);
    }

    @EventListener
    public void registerTabs(HMITabRegistryEvent event) {
        event.registry.register(Identifier.of(MOD_ID, "planes"), new PlanelRecipeTab(MOD_ID), new ItemInstance(planeWorkbench));
    }
    //TODO: fix graphics TMI, set Planes Props, Modern Planes CFG, Crafting for parts, Config, balance DMG ETC.

}


