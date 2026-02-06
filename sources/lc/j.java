package Lc;

import Kc.h;
import android.net.Uri;
import android.text.TextUtils;
import io.intercom.android.sdk.metrics.ops.OpsMetricTracker;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import ub.C5230g;

public class j extends f {

    /* renamed from: m  reason: collision with root package name */
    private final JSONObject f51990m;

    /* renamed from: n  reason: collision with root package name */
    private final String f51991n;

    public j(h hVar, C5230g gVar, JSONObject jSONObject, String str) {
        super(hVar, gVar);
        this.f51990m = jSONObject;
        this.f51991n = str;
        if (TextUtils.isEmpty(str)) {
            this.f51972a = new IllegalArgumentException("mContentType is null or empty");
        }
        super.G("X-Goog-Upload-Protocol", "resumable");
        super.G("X-Goog-Upload-Command", OpsMetricTracker.START);
        super.G("X-Goog-Upload-Header-Content-Type", str);
    }

    /* access modifiers changed from: protected */
    public String e() {
        return "POST";
    }

    /* access modifiers changed from: protected */
    public JSONObject g() {
        return this.f51990m;
    }

    /* access modifiers changed from: protected */
    public Map l() {
        HashMap hashMap = new HashMap();
        hashMap.put("name", j());
        hashMap.put("uploadType", "resumable");
        return hashMap;
    }

    public Uri u() {
        String authority = s().a().getAuthority();
        Uri.Builder buildUpon = s().b().buildUpon();
        buildUpon.appendPath("b");
        buildUpon.appendPath(authority);
        buildUpon.appendPath("o");
        return buildUpon.build();
    }
}
