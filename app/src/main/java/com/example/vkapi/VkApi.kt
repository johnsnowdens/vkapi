import android.net.Uri
import com.example.vkapi.User
import java.io.InputStreamReader
import java.net.HttpURLConnection

import java.net.URL

class VkApi {
    val vkBaseLink = "https://api.vk.com"
    val vkApiMethod = "/method/users.search"
    val token = "58ac7c4fee80453399e87ad65b1a2137e82b40b47d3fb1f14e56cc499e106d345a335e2a5df30264cabfa"
    val v = "5.126"
    fun generateURL(query: String): URL {
        val uri = Uri.parse(vkBaseLink+vkApiMethod).buildUpon()
            .appendQueryParameter("q", query)
            .appendQueryParameter("access_token",token)
            .appendQueryParameter("v",v)
            .build()

        return URL(uri.toString())

    }

   fun getResponse (url:URL):String{
       val urlConnection = url.openConnection() as HttpURLConnection

       val inputStream = InputStreamReader(urlConnection.inputStream)
       val response = inputStream.readText()
       urlConnection.disconnect()

       return response
   }

    fun getLoadUser(query:String):List<User>{

        val url
    }
}
