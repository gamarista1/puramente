package Db;

import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C4536s;
import com.revenuecat.purchases.common.Constants;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import za.e;

public abstract class e0 {

    /* renamed from: a  reason: collision with root package name */
    private static final Map f50500a;

    static {
        HashMap hashMap = new HashMap();
        f50500a = hashMap;
        hashMap.put("auth/invalid-provider-id", "INVALID_PROVIDER_ID");
        hashMap.put("auth/invalid-cert-hash", "INVALID_CERT_HASH");
        hashMap.put("auth/network-request-failed", "WEB_NETWORK_REQUEST_FAILED");
        hashMap.put("auth/web-storage-unsupported", "WEB_STORAGE_UNSUPPORTED");
        hashMap.put("auth/operation-not-allowed", "OPERATION_NOT_ALLOWED");
    }

    public static Status a(Intent intent) {
        C4536s.l(intent);
        C4536s.a(d(intent));
        return (Status) e.b(intent, "com.google.firebase.auth.internal.STATUS", Status.CREATOR);
    }

    public static Status b(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("code");
            String string2 = jSONObject.getString(MetricTracker.Object.MESSAGE);
            if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2)) {
                Map map = f50500a;
                if (map.containsKey(string)) {
                    return C4267o.a(((String) map.get(string)) + Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR + string2);
                }
            }
            return C4267o.a("WEB_INTERNAL_ERROR:" + str);
        } catch (JSONException e10) {
            String localizedMessage = e10.getLocalizedMessage();
            return C4267o.a("WEB_INTERNAL_ERROR:" + str + "[ " + localizedMessage + " ]");
        }
    }

    public static void c(Intent intent, Status status) {
        e.e(status, intent, "com.google.firebase.auth.internal.STATUS");
    }

    public static boolean d(Intent intent) {
        C4536s.l(intent);
        return intent.hasExtra("com.google.firebase.auth.internal.STATUS");
    }
}
