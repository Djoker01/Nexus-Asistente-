package com.nexus.assistant

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.nexus.assistant.voice.VoiceManager

class MainActivity : AppCompatActivity() {

    private lateinit var voiceManager: VoiceManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        voiceManager = VoiceManager(this)

        // Activar Nexus
        voiceManager.startListening()
    }
}
