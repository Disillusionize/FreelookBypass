package com.github.disillusionaize.freelook.bypass.mixins;

import cc.polyfrost.oneconfig.utils.hypixel.HypixelUtils;
import com.github.chromaticforge.freelook.hook.FreelookHook;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(value = FreelookHook.class, remap = false)
public class FreelookHookMixin {
    @Redirect(
            method = "overrideMouse",
            at = @At(value = "INVOKE", target = "Lcc/polyfrost/oneconfig/utils/hypixel/HypixelUtils;isHypixel()Z")
    )
    private static boolean neverHypixel(HypixelUtils instance) {
        return false;
    }
}
