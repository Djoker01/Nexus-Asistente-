package com.nexus.assistant.executor

import android.content.Context
import android.content.Intent
import android.net.Uri

class ActionExecutor(private val context: Context) {

    fun openApp(packageName: String) {
        val intent = context.packageManager.getLaunchIntentForPackage(packageName)
        intent?.let { context.startActivity(it) }
    }

    fun openWhatsApp(contact: String, message: String) {
        val uri = Uri.parse("https://wa.me/?text=$message")
        val intent = Intent(Intent.ACTION_VIEW, uri)
        context.startActivity(intent)
    }
}
