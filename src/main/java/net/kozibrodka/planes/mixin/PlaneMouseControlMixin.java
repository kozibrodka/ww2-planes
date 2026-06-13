package net.kozibrodka.planes.mixin;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.kozibrodka.planes.events.mod_Planes;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.entity.player.ClientPlayerEntity;
import net.minecraft.world.World;
import net.modificationstation.stationapi.api.network.packet.PacketHelper;
import org.lwjgl.input.Keyboard;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(EnvType.CLIENT)
@Mixin(value = Minecraft.class)
public class PlaneMouseControlMixin {
    @Shadow
    public ClientPlayerEntity player;
    @Shadow
    public Screen currentScreen;
    @Shadow
    private static Minecraft INSTANCE;
    @Shadow
    public World world;

    @Inject(method = "tick", at = @At(value = "INVOKE", target = "Lorg/lwjgl/input/Keyboard;next()Z"))
    private void sdk_api_controls_tick(CallbackInfo ci) {
        if (player == null || player.dead) return;

        /// Inventory
        if (Keyboard.getEventKeyState()) {
            if (Keyboard.isKeyDown(INSTANCE.options.dropKey.code) && !inventoryKeyDown) {
                System.out.println("JESTEM raz");
                mod_Planes.useMouseControl = !mod_Planes.useMouseControl;
                if (mod_Planes.useMouseControl) {
                    INSTANCE.inGameHud.addChatMessage("Plane Mouse Control Enabled !!!");
                } else {
                    INSTANCE.inGameHud.addChatMessage("Plane Mouse Control Off");
                }
            }
            inventoryKeyDown = Keyboard.isKeyDown(INSTANCE.options.dropKey.code);
        }
    }

    @Unique
    private static boolean inventoryKeyDown = false;
}
