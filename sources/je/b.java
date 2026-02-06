package Je;

import android.content.Context;
import android.text.TextUtils;
import java.util.List;
import org.json.JSONObject;

public class b extends j {

    /* renamed from: d  reason: collision with root package name */
    String f32233d = "App Links";

    /* renamed from: e  reason: collision with root package name */
    String f32234e = "Could not find any App Link hosts to support Android AppLinks. Please add intent filter for handling AppLinks in your Android Manifest file";

    /* renamed from: f  reason: collision with root package name */
    String f32235f = "<a href=\"https://help.branch.io/developers-hub/docs/android-basic-integration#:~:text=%3C!%2D%2D%20Branch%20App%20Links%20%2D%20Live,%3C/intent%2Dfilter%3E\">More info</a>";

    /* renamed from: g  reason: collision with root package name */
    d f32236g;

    /* renamed from: h  reason: collision with root package name */
    JSONObject f32237h;

    public b(d dVar, JSONObject jSONObject) {
        this.f32273a = "App Links";
        this.f32274b = "Could not find any App Link hosts to support Android AppLinks. Please add intent filter for handling AppLinks in your Android Manifest file";
        this.f32275c = "<a href=\"https://help.branch.io/developers-hub/docs/android-basic-integration#:~:text=%3C!%2D%2D%20Branch%20App%20Links%20%2D%20Live,%3C/intent%2Dfilter%3E\">More info</a>";
        this.f32236g = dVar;
        this.f32237h = jSONObject;
    }

    private boolean e(String str) {
        List<String> list;
        if (!TextUtils.isEmpty(str) && (list = this.f32236g.f32244d) != null) {
            for (String equals : list) {
                if (str.equals(equals)) {
                    return true;
                }
            }
        }
        return false;
    }

    public String b(Context context, boolean z10) {
        return super.b(context, d(context));
    }

    public boolean d(Context context) {
        String optString = this.f32237h.optString("default_short_url_domain");
        if (this.f32236g.f32244d.isEmpty() || TextUtils.isEmpty(optString) || !e(optString)) {
            return false;
        }
        return true;
    }
}
