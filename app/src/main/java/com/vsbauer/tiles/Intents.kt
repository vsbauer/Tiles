package com.vsbauer.tiles

import android.content.Intent

enum class Intents(val value: String) {
    SETTINGS("android.settings.SETTINGS"),
    VPN("android.settings.VPN_SETTINGS"),
    DEV_SETTINGS("android.settings.APPLICATION_DEVELOPMENT_SETTINGS")
}

fun getIntentForTile(type: Intents) = Intent(type.value).apply {
    flags = Intent.FLAG_ACTIVITY_NEW_TASK
}
