package Je;

import android.content.Context;
import android.text.TextUtils;
import org.json.JSONObject;

public class a extends j {

    /* renamed from: d  reason: collision with root package name */
    String f32228d = "Alt Domains";

    /* renamed from: e  reason: collision with root package name */
    String f32229e = "Could not find intent filter to support alternate link domain. Please add intent filter for handling alternate link domain in your Android Manifest file";

    /* renamed from: f  reason: collision with root package name */
    String f32230f = "<a href=\"https://help.branch.io/developers-hub/docs/android-basic-integration#:~:text=The%20%2Dalternate.app.link%20domain%20associated%20with%20your%20app\">More info</a>";

    /* renamed from: g  reason: collision with root package name */
    d f32231g;

    /* renamed from: h  reason: collision with root package name */
    JSONObject f32232h;

    public a(d dVar, JSONObject jSONObject) {
        this.f32273a = "Alt Domains";
        this.f32274b = "Could not find intent filter to support alternate link domain. Please add intent filter for handling alternate link domain in your Android Manifest file";
        this.f32275c = "<a href=\"https://help.branch.io/developers-hub/docs/android-basic-integration#:~:text=The%20%2Dalternate.app.link%20domain%20associated%20with%20your%20app\">More info</a>";
        this.f32231g = dVar;
        this.f32232h = jSONObject;
    }

    private boolean e(String str) {
        if (!TextUtils.isEmpty(str)) {
            for (String equals : this.f32231g.f32244d) {
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
        String optString = this.f32232h.optString("alternate_short_url_domain");
        if (TextUtils.isEmpty(optString) || e(optString)) {
            return true;
        }
        return false;
    }
}
