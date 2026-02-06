package T3;

import android.content.Context;
import android.os.Build;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class c {

    /* renamed from: a  reason: collision with root package name */
    private Context f6171a;

    public c(Context context) {
        this.f6171a = context;
    }

    private g a(String str) {
        return new g("", "", "");
    }

    private String b(JSONObject jSONObject, String str) {
        Object obj = jSONObject.get("author");
        if (obj instanceof String) {
            return (String) obj;
        }
        if (!(obj instanceof JSONObject)) {
            return "Unknown";
        }
        JSONObject jSONObject2 = (JSONObject) obj;
        return jSONObject2.optString(str, jSONObject2.optString("es", "Unknown"));
    }

    private String d(JSONObject jSONObject, String str) {
        JSONObject jSONObject2 = jSONObject.getJSONObject("phrase");
        return jSONObject2.optString(str, jSONObject2.optString("es", "No phrase available"));
    }

    private String e(JSONObject jSONObject) {
        return jSONObject.optString("thumbnailUrl", "");
    }

    private JSONArray g() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.f6171a.getAssets().open("dailyPhrases.json")));
            StringBuilder sb2 = new StringBuilder();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    sb2.append(readLine);
                } else {
                    bufferedReader.close();
                    return new JSONArray(sb2.toString());
                }
            }
        } catch (IOException e10) {
            e = e10;
            e.printStackTrace();
            return null;
        } catch (JSONException e11) {
            e = e11;
            e.printStackTrace();
            return null;
        }
    }

    public int c() {
        if (Build.VERSION.SDK_INT >= 26) {
            return LocalDate.now().getDayOfYear();
        }
        return Calendar.getInstance().get(6);
    }

    public g f() {
        try {
            JSONArray g10 = g();
            if (g10 == null) {
                return a("Failed to load phrases JSON");
            }
            JSONObject jSONObject = g10.getJSONObject(c() - 1);
            String language = Locale.getDefault().getLanguage();
            return new g(b(jSONObject, language), d(jSONObject, language), e(jSONObject));
        } catch (Exception e10) {
            e10.printStackTrace();
            return a("Failed to load phrase");
        }
    }
}
