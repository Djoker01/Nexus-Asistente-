package com.nexus.assistant.model

data class Command(
    val intent: String,
    val app: String? = null,
    val contact: String? = null,
    val message: String? = null
)
