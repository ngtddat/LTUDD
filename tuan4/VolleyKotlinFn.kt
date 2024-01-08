import android.content.Context
import android.widget.TextView
import com.android.volley.RequestQueue
import com.android.volley.Response
import com.android.volley.VolleyError
import com.android.volley.toolbox.JsonArrayRequest
import com.android.volley.toolbox.Volley
import com.google.gson.JsonObject
import org.json.JSONArray
import org.json.JSONObject

class VolleyKotlinFn {
    var strJson = ""
    fun getJasonArrayObject(context: Context, textView: TextView) {
        val queue = Volley.newRequestQueue(context)
        val url = "https://192.168.0.5/ajson/a.json"
        // JsonArrayRequest(url, ThanhCong, ThatBai)
        val request = JsonArrayRequest(url, Response.Listener
        {
            response ->
                for (i in 0 until response.length())
                {
                    val person=response.getJSONObject(i)
                    val id=person.getString("id")
                    val name=person.getString("name")
                    val email=person.getString("email")

                    strJson+="id: $id\n"
                    strJson+="Name: $name\n"
                    strJson+="Email: $email\n"
                }
            textView.text=strJson
        },
                Response.ErrorListener
                {
                    error ->  textView.text=error.message
                })
        queue.add(request)
    }
}