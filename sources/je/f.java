package Je;

import android.content.Context;
import android.text.TextUtils;
import org.json.JSONObject;

public class f extends j {

    /* renamed from: d  reason: collision with root package name */
    String f32251d = "Custom Domain";

    /* renamed from: e  reason: collision with root package name */
    String f32252e = "Could not find intent filter to support Branch default link domain. Please add intent filter for handling custom link domain in your Android Manifest file";

    /* renamed from: f  reason: collision with root package name */
    String f32253f = "<a href=\"https://help.branch.io/developers-hub/docs/android-basic-integration#section-configure-app\">More info</a>";

    /* renamed from: g  reason: collision with root package name */
    d f32254g;

    /* renamed from: h  reason: collision with root package name */
    JSONObject f32255h;

    public f(d dVar, JSONObject jSONObject) {
        this.f32273a = "Custom Domain";
        this.f32274b = "Could not find intent filter to support Branch default link domain. Please add intent filter for handling custom link domain in your Android Manifest file";
        this.f32275c = "<a href=\"https://help.branch.io/developers-hub/docs/android-basic-integration#section-configure-app\">More info</a>";
        this.f32254g = dVar;
        this.f32255h = jSONObject;
    }

    private boolean e(String str) {
        if (!TextUtils.isEmpty(str)) {
            for (String equals : this.f32254g.f32244d) {
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
        String optString = this.f32255h.optString("short_url_domain");
        if (TextUtils.isEmpty(optString) || e(optString)) {
            return true;
        }
        return false;
    }
}
