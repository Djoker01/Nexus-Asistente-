package com.nexus.assistant.ai

import okhttp3.*

class AIClient {

    private val client = OkHttpClient()

    fun sendCommand(text: String, callback: (String) -> Unit) {
        val requestBody = """
        {
          "input": "$text"
        }
        """

        val request = Request.Builder()
            .url("https://YOUR-API-ENDPOINT")
            .post(RequestBody.create(MediaType.parse("application/json"), requestBody))
            .build()

        client.newCall(request).enqueue(object : Callback {
            override fun onFailure(call: Call, e: IOException) {}

            override fun onResponse(call: Call, response: Response) {
                callback(response.body()?.string() ?: "")
            }
        })
    }
}
