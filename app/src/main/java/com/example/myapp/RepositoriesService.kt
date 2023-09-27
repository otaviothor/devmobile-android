package com.example.myapp

import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.io.BufferedReader
import java.io.InputStreamReader
import java.net.HttpURLConnection
import java.net.URL


class RepositoriesService {

    fun getRepositories() : List<IRepository>? {
        val url = URL("https://api.github.com/users/otaviothor/repos")
        val conn = url.openConnection() as HttpURLConnection
        conn.requestMethod = "GET"
        conn.connectTimeout = 5000 // 5 seconds
        conn.readTimeout = 5000 // 5 seconds

        val inputStream = conn.inputStream
        val reader = BufferedReader(InputStreamReader(inputStream))
        val response = StringBuilder()
        var line: String?
        while (reader.readLine().also { line = it } != null) {
            response.append(line)
        }
        reader.close()
        inputStream.close()

        val responseData = response.toString()

        val gson = Gson()
        return gson.fromJson(responseData, object : TypeToken<List<IRepository>>() {}.type)
    }

    fun getRepository() : IRepository?  {
        val url = URL("https://api.github.com/users/otaviothor/repos")
        val conn = url.openConnection() as HttpURLConnection
        conn.requestMethod = "GET"

        val inputStream = conn.inputStream
        val reader = BufferedReader(InputStreamReader(inputStream))
        val response = StringBuilder()
        var line: String?
        while (reader.readLine().also { line = it } != null) {
            response.append(line)
        }
        reader.close()
        inputStream.close()

        val responseData = response.toString()

        // Use Gson to deserialize the JSON response into IRepository
        val gson = Gson()
        return gson.fromJson(responseData, IRepository::class.java)

    }
}