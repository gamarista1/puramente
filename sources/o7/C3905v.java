package o7;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.facebook.C3286a;
import com.facebook.I;
import com.facebook.M;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.O;
import kotlin.jvm.internal.U;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p7.C3936a;
import p7.C3937b;

/* renamed from: o7.v  reason: case insensitive filesystem */
public final class C3905v {

    /* renamed from: a  reason: collision with root package name */
    public static final C3905v f47348a = new C3905v();

    /* renamed from: b  reason: collision with root package name */
    private static final String f47349b = O.b(C3905v.class).w();

    /* renamed from: c  reason: collision with root package name */
    private static final AtomicBoolean f47350c = new AtomicBoolean(false);

    /* renamed from: d  reason: collision with root package name */
    private static final ConcurrentLinkedQueue f47351d = new ConcurrentLinkedQueue();

    /* renamed from: e  reason: collision with root package name */
    private static final Map f47352e = new ConcurrentHashMap();

    /* renamed from: f  reason: collision with root package name */
    private static Long f47353f;

    /* renamed from: g  reason: collision with root package name */
    private static C3937b f47354g;

    /* renamed from: o7.v$a */
    public interface a {
        void a();
    }

    private C3905v() {
    }

    private final JSONObject c(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("platform", "android");
        bundle.putString("sdk_version", I.B());
        bundle.putString("fields", "gatekeepers");
        M.c cVar = M.f39311n;
        U u10 = U.f71764a;
        String format = String.format("app/%s", Arrays.copyOf(new Object[]{"mobile_sdk_gk"}, 1));
        C6496s.g(format, "format(format, *args)");
        M x10 = cVar.x((C3286a) null, format, (M.b) null);
        x10.J(bundle);
        JSONObject d10 = x10.k().d();
        if (d10 == null) {
            return new JSONObject();
        }
        return d10;
    }

    public static final boolean d(String str, String str2, boolean z10) {
        Boolean bool;
        C6496s.h(str, "name");
        Map e10 = f47348a.e(str2);
        if (e10.containsKey(str) && (bool = (Boolean) e10.get(str)) != null) {
            return bool.booleanValue();
        }
        return z10;
    }

    private final boolean f(Long l10) {
        if (l10 != null && System.currentTimeMillis() - l10.longValue() < 3600000) {
            return true;
        }
        return false;
    }

    public static final synchronized void h(a aVar) {
        synchronized (C3905v.class) {
            if (aVar != null) {
                try {
                    f47351d.add(aVar);
                } catch (JSONException e10) {
                    W.k0("FacebookSDK", e10);
                } catch (Throwable th2) {
                    while (true) {
                        throw th2;
                    }
                }
            }
            String m10 = I.m();
            C3905v vVar = f47348a;
            if (!vVar.f(f47353f) || !f47352e.containsKey(m10)) {
                Context l10 = I.l();
                U u10 = U.f71764a;
                String format = String.format("com.facebook.internal.APP_GATEKEEPERS.%s", Arrays.copyOf(new Object[]{m10}, 1));
                C6496s.g(format, "format(format, *args)");
                if (l10 != null) {
                    JSONObject jSONObject = null;
                    String string = l10.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).getString(format, (String) null);
                    if (!W.e0(string)) {
                        jSONObject = new JSONObject(string);
                        if (jSONObject != null) {
                            j(m10, jSONObject);
                        }
                    }
                    Executor t10 = I.t();
                    if (t10 != null) {
                        if (f47350c.compareAndSet(false, true)) {
                            t10.execute(new C3903t(m10, l10, format));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            vVar.k();
        }
    }

    /* access modifiers changed from: private */
    public static final void i(String str, Context context, String str2) {
        C6496s.h(str, "$applicationId");
        C6496s.h(context, "$context");
        C6496s.h(str2, "$gateKeepersKey");
        C3905v vVar = f47348a;
        JSONObject c10 = vVar.c(str);
        if (c10.length() != 0) {
            j(str, c10);
            context.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).edit().putString(str2, c10.toString()).apply();
            f47353f = Long.valueOf(System.currentTimeMillis());
        }
        vVar.k();
        f47350c.set(false);
    }

    public static final synchronized JSONObject j(String str, JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        JSONArray optJSONArray;
        synchronized (C3905v.class) {
            try {
                C6496s.h(str, "applicationId");
                jSONObject2 = (JSONObject) f47352e.get(str);
                if (jSONObject2 == null) {
                    jSONObject2 = new JSONObject();
                }
                if (jSONObject == null || (optJSONArray = jSONObject.optJSONArray("data")) == null) {
                    jSONObject3 = null;
                } else {
                    jSONObject3 = optJSONArray.optJSONObject(0);
                }
                if (jSONObject3 == null) {
                    jSONObject3 = new JSONObject();
                }
                JSONArray optJSONArray2 = jSONObject3.optJSONArray("gatekeepers");
                if (optJSONArray2 == null) {
                    optJSONArray2 = new JSONArray();
                }
                int length = optJSONArray2.length();
                for (int i10 = 0; i10 < length; i10++) {
                    JSONObject jSONObject4 = optJSONArray2.getJSONObject(i10);
                    jSONObject2.put(jSONObject4.getString(SubscriberAttributeKt.JSON_NAME_KEY), jSONObject4.getBoolean("value"));
                }
                f47352e.put(str, jSONObject2);
            } catch (JSONException e10) {
                W.k0("FacebookSDK", e10);
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        return jSONObject2;
    }

    private final void k() {
        Handler handler = new Handler(Looper.getMainLooper());
        while (true) {
            ConcurrentLinkedQueue concurrentLinkedQueue = f47351d;
            if (!concurrentLinkedQueue.isEmpty()) {
                a aVar = (a) concurrentLinkedQueue.poll();
                if (aVar != null) {
                    handler.post(new C3904u(aVar));
                }
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void l(a aVar) {
        aVar.a();
    }

    public static final JSONObject m(String str, boolean z10) {
        C6496s.h(str, "applicationId");
        if (!z10) {
            Map map = f47352e;
            if (map.containsKey(str)) {
                JSONObject jSONObject = (JSONObject) map.get(str);
                if (jSONObject == null) {
                    return new JSONObject();
                }
                return jSONObject;
            }
        }
        JSONObject c10 = f47348a.c(str);
        Context l10 = I.l();
        U u10 = U.f71764a;
        String format = String.format("com.facebook.internal.APP_GATEKEEPERS.%s", Arrays.copyOf(new Object[]{str}, 1));
        C6496s.g(format, "format(format, *args)");
        l10.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).edit().putString(format, c10.toString()).apply();
        return j(str, c10);
    }

    public final Map e(String str) {
        List<C3936a> list;
        g();
        if (str != null) {
            Map map = f47352e;
            if (map.containsKey(str)) {
                C3937b bVar = f47354g;
                if (bVar != null) {
                    list = bVar.a(str);
                } else {
                    list = null;
                }
                if (list != null) {
                    HashMap hashMap = new HashMap();
                    for (C3936a aVar : list) {
                        hashMap.put(aVar.a(), Boolean.valueOf(aVar.b()));
                    }
                    return hashMap;
                }
                HashMap hashMap2 = new HashMap();
                JSONObject jSONObject = (JSONObject) map.get(str);
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                }
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    C6496s.g(next, SubscriberAttributeKt.JSON_NAME_KEY);
                    hashMap2.put(next, Boolean.valueOf(jSONObject.optBoolean(next)));
                }
                C3937b bVar2 = f47354g;
                if (bVar2 == null) {
                    bVar2 = new C3937b();
                }
                ArrayList arrayList = new ArrayList(hashMap2.size());
                for (Map.Entry entry : hashMap2.entrySet()) {
                    arrayList.add(new C3936a((String) entry.getKey(), ((Boolean) entry.getValue()).booleanValue()));
                }
                bVar2.b(str, arrayList);
                f47354g = bVar2;
                return hashMap2;
            }
        }
        return new HashMap();
    }

    public final void g() {
        h((a) null);
    }
}
