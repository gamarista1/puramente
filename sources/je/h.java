package Je;

import android.content.Context;
import android.text.TextUtils;
import org.json.JSONObject;

public class h extends j {

    /* renamed from: d  reason: collision with root package name */
    String f32260d = "Default Domains";

    /* renamed from: e  reason: collision with root package name */
    String f32261e = "Could not find any App Link hosts to support Android AppLinks. Please add intent filter for handling AppLinks in your Android Manifest file";

    /* renamed from: f  reason: collision with root package name */
    String f32262f = "<a href=\"https://help.branch.io/developers-hub/docs/android-basic-integration#4-configure-app:~:text=%3C!%2D%2D%20Branch%20App%20Links%20%2D%20Live,%3C/intent%2Dfilter%3E\">More info</a>";

    /* renamed from: g  reason: collision with root package name */
    d f32263g;

    /* renamed from: h  reason: collision with root package name */
    JSONObject f32264h;

    public h(d dVar, JSONObject jSONObject) {
        this.f32273a = "Default Domains";
        this.f32274b = "Could not find any App Link hosts to support Android AppLinks. Please add intent filter for handling AppLinks in your Android Manifest file";
        this.f32275c = "<a href=\"https://help.branch.io/developers-hub/docs/android-basic-integration#4-configure-app:~:text=%3C!%2D%2D%20Branch%20App%20Links%20%2D%20Live,%3C/intent%2Dfilter%3E\">More info</a>";
        this.f32263g = dVar;
        this.f32264h = jSONObject;
    }

    private boolean e(String str) {
        if (!TextUtils.isEmpty(str)) {
            for (String equals : this.f32263g.f32244d) {
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
        String optString = this.f32264h.optString("default_short_url_domain");
        if (TextUtils.isEmpty(optString) || e(optString)) {
            return true;
        }
        return false;
    }
}
