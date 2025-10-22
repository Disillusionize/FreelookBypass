package com.github.disillusionize.freelook.bypass

import cc.polyfrost.oneconfig.utils.Notifications
import net.minecraftforge.fml.common.Loader
import net.minecraftforge.fml.common.Mod
import net.minecraftforge.fml.common.event.FMLInitializationEvent

@Mod(
    modid = FreelookBypass.ID,
    name = FreelookBypass.NAME,
    version = FreelookBypass.VERSION,
    modLanguageAdapter = "cc.polyfrost.oneconfig.utils.KotlinLanguageAdapter"
)
object FreelookBypass {
    const val ID = "@MOD_ID@"
    const val NAME = "@MOD_NAME@"
    const val VERSION = "@MOD_VERSION@"

    @Mod.EventHandler
    fun onInit(event: FMLInitializationEvent) {
        if (!Loader.isModLoaded("freelook")) {
            Notifications.INSTANCE.send("Freelook Bypass", "You need Freelook to use this!")
        }
    }
}