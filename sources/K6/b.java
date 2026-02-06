package K6;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.HandlerThread;
import com.facebook.C3462y;
import com.facebook.M;
import com.facebook.S;
import io.branch.rnbranch.RNBranchModule;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.net.HttpURLConnection;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

public class b {

    /* renamed from: a  reason: collision with root package name */
    private static b f32426a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static ConcurrentHashMap f32427b;

    /* renamed from: c  reason: collision with root package name */
    private static L6.a f32428c;

    /* renamed from: K6.b$b  reason: collision with other inner class name */
    private static class C0529b extends BroadcastReceiver {
        private C0529b() {
        }

        public void onReceive(Context context, Intent intent) {
            CompletableFuture completableFuture;
            try {
                JSONObject jSONObject = new JSONObject(intent.getStringExtra("returnPayload"));
                String string = jSONObject.getString("requestID");
                if (b.f32427b.containsKey(string) && (completableFuture = (CompletableFuture) b.f32427b.remove(string)) != null) {
                    completableFuture.complete(b.i(jSONObject, string));
                }
            } catch (JSONException unused) {
            }
        }
    }

    private b(Context context) {
        IntentFilter intentFilter = new IntentFilter("com.facebook.gamingservices.DAEMON_RESPONSE");
        HandlerThread handlerThread = new HandlerThread("com.facebook.gamingservices.DAEMON_RESPONSE_HANDLER");
        handlerThread.start();
        context.registerReceiver(new C0529b(), intentFilter, (String) null, new Handler(handlerThread.getLooper()));
        f32427b = new ConcurrentHashMap();
        f32428c = L6.a.b(context);
    }

    private static S c(String str) {
        return d(new C3462y(20, "UNSUPPORTED_FORMAT", "The response format is invalid."), str);
    }

    static S d(C3462y yVar, String str) {
        f32428c.f(yVar, str);
        return new S(new M(), (HttpURLConnection) null, yVar);
    }

    private static S e(JSONObject jSONObject, String str) {
        JSONObject optJSONObject = jSONObject.optJSONObject(RNBranchModule.NATIVE_INIT_SESSION_FINISHED_EVENT_ERROR);
        if (optJSONObject != null) {
            return d(new C3462y(optJSONObject.optInt("code"), optJSONObject.optString("type"), optJSONObject.optString(MetricTracker.Object.MESSAGE)), str);
        }
        return c(str);
    }

    private static S f(JSONObject jSONObject, String str) {
        if (jSONObject.optJSONObject(com.amazon.device.simplesignin.a.a.a.f38020s) != null) {
            f32428c.g(str);
            return new S(new M(), (HttpURLConnection) null, "", jSONObject.optJSONObject(com.amazon.device.simplesignin.a.a.a.f38020s));
        } else if (jSONObject.optJSONArray(com.amazon.device.simplesignin.a.a.a.f38020s) == null) {
            return c(str);
        } else {
            f32428c.g(str);
            return new S(new M(), (HttpURLConnection) null, "", jSONObject.optJSONArray(com.amazon.device.simplesignin.a.a.a.f38020s));
        }
    }

    static synchronized b g(Context context) {
        b bVar;
        synchronized (b.class) {
            try {
                if (f32426a == null) {
                    f32426a = new b(context);
                }
                bVar = f32426a;
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        return bVar;
    }

    /* access modifiers changed from: private */
    public static S i(JSONObject jSONObject, String str) {
        if (!jSONObject.isNull(com.amazon.device.simplesignin.a.a.a.f38020s)) {
            return f(jSONObject, str);
        }
        if (!jSONObject.isNull(RNBranchModule.NATIVE_INIT_SESSION_FINISHED_EVENT_ERROR)) {
            return e(jSONObject, str);
        }
        return c(str);
    }

    /* access modifiers changed from: package-private */
    public synchronized ConcurrentHashMap h() {
        return f32427b;
    }
}
