package Je;

import android.content.Context;
import org.json.JSONObject;

public class x extends j {

    /* renamed from: d  reason: collision with root package name */
    String f32319d = "Package Name";

    /* renamed from: e  reason: collision with root package name */
    String f32320e = "Incorrect package name in Branch dashboard. Please correct your package name in dashboard -> Configuration page.";

    /* renamed from: f  reason: collision with root package name */
    String f32321f = "<a href=\"https://help.branch.io/developers-hub/docs/android-basic-integration#:~:text=package%3D%22com.example.android%22\">More info</a>";

    /* renamed from: g  reason: collision with root package name */
    d f32322g;

    /* renamed from: h  reason: collision with root package name */
    JSONObject f32323h;

    public x(d dVar, JSONObject jSONObject) {
        this.f32273a = "Package Name";
        this.f32274b = "Incorrect package name in Branch dashboard. Please correct your package name in dashboard -> Configuration page.";
        this.f32275c = "<a href=\"https://help.branch.io/developers-hub/docs/android-basic-integration#:~:text=package%3D%22com.example.android%22\">More info</a>";
        this.f32322g = dVar;
        this.f32323h = jSONObject;
    }

    public String b(Context context, boolean z10) {
        return super.b(context, d(context));
    }

    public boolean d(Context context) {
        return this.f32322g.f32245e.equals(this.f32323h.optString("android_package_name"));
    }
}
