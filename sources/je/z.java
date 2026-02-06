package Je;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

public class z extends j {

    /* renamed from: d  reason: collision with root package name */
    String f32325d = "URI Scheme";

    /* renamed from: e  reason: collision with root package name */
    String f32326e = "No intent found for opening the app through uri Scheme. Please add the intent with URI scheme to your Android manifest.";

    /* renamed from: f  reason: collision with root package name */
    String f32327f = "Uri Scheme to open your app is not specified in Branch dashboard. Please add URI scheme in Branch dashboard.";

    /* renamed from: g  reason: collision with root package name */
    String f32328g = "Uri scheme specified in Branch dashboard doesn't match with the deep link intent in manifest file.";

    /* renamed from: h  reason: collision with root package name */
    String f32329h = "<a href=\"https://help.branch.io/developers-hub/docs/android-basic-integration#4-configure-app:~:text=%3Cintent%2Dfilter%3E%0A%09%09%09%09%3C!%2D%2D%20If,/%3E%0A%09%09%09%3C/intent%2Dfilter%3E\">More info</a>";

    /* renamed from: i  reason: collision with root package name */
    String f32330i = "<a href=\"https://help.branch.io/developers-hub/docs/android-basic-integration#1-configure-branch-dashboard:~:text=%22Android%20URI%20Scheme%22\">More info</a>";

    /* renamed from: j  reason: collision with root package name */
    d f32331j;

    /* renamed from: k  reason: collision with root package name */
    JSONObject f32332k;

    public z(d dVar, JSONObject jSONObject) {
        this.f32273a = "URI Scheme";
        this.f32274b = "";
        this.f32275c = "<a href=\"https://help.branch.io/developers-hub/docs/android-basic-integration#4-configure-app:~:text=%3Cintent%2Dfilter%3E%0A%09%09%09%09%3C!%2D%2D%20If,/%3E%0A%09%09%09%3C/intent%2Dfilter%3E\">More info</a>";
        this.f32331j = dVar;
        this.f32332k = jSONObject;
    }

    private String e(Iterator it, String str) {
        String replace = str.replace("://", "");
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (replace.equals(str2)) {
                return str2;
            }
        }
        return "";
    }

    private boolean f(String str) {
        Uri parse = Uri.parse(str);
        String scheme = parse.getScheme();
        String host = parse.getHost();
        if (TextUtils.isEmpty(host)) {
            host = "open";
        }
        JSONObject jSONObject = this.f32331j.f32241a;
        if (jSONObject == null) {
            return false;
        }
        Iterator<String> keys = jSONObject.keys();
        boolean z10 = false;
        while (keys.hasNext()) {
            String next = keys.next();
            if (scheme != null && scheme.equals(next)) {
                JSONArray optJSONArray = this.f32331j.f32241a.optJSONArray(next);
                if (optJSONArray != null && optJSONArray.length() > 0) {
                    int i10 = 0;
                    while (true) {
                        if (i10 < optJSONArray.length()) {
                            if (host != null && host.equals(optJSONArray.optString(i10))) {
                                z10 = true;
                                break;
                            }
                            i10++;
                        } else {
                            break;
                        }
                    }
                } else {
                    return true;
                }
            }
        }
        return z10;
    }

    public String b(Context context, boolean z10) {
        return super.b(context, d(context));
    }

    public boolean d(Context context) {
        boolean z10;
        String substring = this.f32332k.optString("android_uri_scheme").substring(0, this.f32332k.optString("android_uri_scheme").length() - 3);
        String e10 = e(this.f32331j.f32241a.keys(), substring);
        boolean isEmpty = TextUtils.isEmpty(substring);
        if (!f(this.f32332k.optString("android_uri_scheme")) || !this.f32331j.f32246f) {
            z10 = false;
        } else {
            z10 = true;
        }
        boolean equals = substring.trim().equals(e10.trim());
        if (isEmpty) {
            this.f32274b = this.f32327f;
            this.f32275c = this.f32330i;
        } else if (!z10) {
            this.f32274b = this.f32326e;
            this.f32275c = this.f32329h;
        } else if (!equals) {
            this.f32274b = this.f32328g;
            this.f32275c = this.f32329h;
        }
        if (!equals || isEmpty || !z10) {
            return false;
        }
        return true;
    }
}
