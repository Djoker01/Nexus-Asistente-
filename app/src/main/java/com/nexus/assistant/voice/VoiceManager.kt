package com.nexus.assistant.voice

import android.content.Context
import android.speech.RecognizerIntent
import android.speech.SpeechRecognizer
import android.content.Intent

class VoiceManager(private val context: Context) {

    private val recognizer = SpeechRecognizer.createSpeechRecognizer(context)

    fun startListening() {
        val intent = Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH)
        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL,
            RecognizerIntent.LANGUAGE_MODEL_FREE_FORM)

        recognizer.startListening(intent)
    }
}
