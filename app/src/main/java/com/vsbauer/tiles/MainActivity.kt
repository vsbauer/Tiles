package com.vsbauer.tiles

import androidx.fragment.app.FragmentActivity

class MainActivity : FragmentActivity() {

    override fun onResume() {
        super.onResume()
        startActivity(getIntentForTile(Intents.SETTINGS))
        finishAffinity()
    }
}