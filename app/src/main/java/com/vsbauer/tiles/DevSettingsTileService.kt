package com.vsbauer.tiles

import android.service.quicksettings.TileService

class DevSettingsTileService : TileService() {

    override fun onClick() {
        startActivityAndCollapse(getIntentForTile(Intents.DEV_SETTINGS))
    }
}