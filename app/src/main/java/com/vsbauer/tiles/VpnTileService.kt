package com.vsbauer.tiles

import android.service.quicksettings.TileService

class VpnTileService : TileService() {

    override fun onClick() {
        startActivityAndCollapse(getIntentForTile(Intents.VPN))
    }
}