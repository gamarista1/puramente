package w5;

import F5.h;
import android.app.Activity;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Bundle;
import com.facebook.C3286a;
import com.facebook.I;
import com.facebook.M;
import java.util.Arrays;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.U;
import o7.C3886b;
import o7.C3906w;
import o7.W;
import org.json.JSONArray;
import org.json.JSONObject;
import t7.C4049a;

/* renamed from: w5.e  reason: case insensitive filesystem */
public final class C4133e {

    /* renamed from: a  reason: collision with root package name */
    public static final C4133e f49161a = new C4133e();

    /* renamed from: b  reason: collision with root package name */
    private static final m f49162b = new m();

    /* renamed from: c  reason: collision with root package name */
    private static SensorManager f49163c;

    /* renamed from: d  reason: collision with root package name */
    private static C4140l f49164d;

    /* renamed from: e  reason: collision with root package name */
    private static String f49165e;

    /* renamed from: f  reason: collision with root package name */
    private static final AtomicBoolean f49166f = new AtomicBoolean(true);

    /* renamed from: g  reason: collision with root package name */
    private static final AtomicBoolean f49167g = new AtomicBoolean(false);

    /* renamed from: h  reason: collision with root package name */
    private static volatile boolean f49168h;

    private C4133e() {
    }

    private final void c(String str) {
        if (!C4049a.d(this)) {
            try {
                if (!f49168h) {
                    f49168h = true;
                    I.t().execute(new C4132d(str));
                }
            } catch (Throwable th2) {
                C4049a.b(th2, this);
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void d(String str) {
        String str2;
        String str3 = "0";
        Class<C4133e> cls = C4133e.class;
        if (!C4049a.d(cls)) {
            try {
                Bundle bundle = new Bundle();
                C3886b e10 = C3886b.f47182f.e(I.l());
                JSONArray jSONArray = new JSONArray();
                String str4 = Build.MODEL;
                if (str4 == null) {
                    str4 = "";
                }
                jSONArray.put(str4);
                if (e10 != null) {
                    str2 = e10.h();
                } else {
                    str2 = null;
                }
                if (str2 != null) {
                    jSONArray.put(e10.h());
                } else {
                    jSONArray.put("");
                }
                jSONArray.put(str3);
                if (h.e()) {
                    str3 = "1";
                }
                jSONArray.put(str3);
                Locale B10 = W.B();
                jSONArray.put(B10.getLanguage() + '_' + B10.getCountry());
                String jSONArray2 = jSONArray.toString();
                C6496s.g(jSONArray2, "extInfoArray.toString()");
                bundle.putString("device_session_id", g());
                bundle.putString("extinfo", jSONArray2);
                M.c cVar = M.f39311n;
                U u10 = U.f71764a;
                boolean z10 = true;
                String format = String.format(Locale.US, "%s/app_indexing_session", Arrays.copyOf(new Object[]{str}, 1));
                C6496s.g(format, "format(locale, format, *args)");
                JSONObject c10 = cVar.B((C3286a) null, format, bundle, (M.b) null).k().c();
                AtomicBoolean atomicBoolean = f49167g;
                if (c10 == null || !c10.optBoolean("is_app_indexing_enabled", false)) {
                    z10 = false;
                }
                atomicBoolean.set(z10);
                if (!atomicBoolean.get()) {
                    f49165e = null;
                } else {
                    C4140l lVar = f49164d;
                    if (lVar != null) {
                        lVar.h();
                    }
                }
                f49168h = false;
            } catch (Throwable th2) {
                C4049a.b(th2, cls);
            }
        }
    }

    public static final void e() {
        Class<C4133e> cls = C4133e.class;
        if (!C4049a.d(cls)) {
            try {
                f49166f.set(false);
            } catch (Throwable th2) {
                C4049a.b(th2, cls);
            }
        }
    }

    public static final void f() {
        Class<C4133e> cls = C4133e.class;
        if (!C4049a.d(cls)) {
            try {
                f49166f.set(true);
            } catch (Throwable th2) {
                C4049a.b(th2, cls);
            }
        }
    }

    public static final String g() {
        Class<C4133e> cls = C4133e.class;
        if (C4049a.d(cls)) {
            return null;
        }
        try {
            if (f49165e == null) {
                f49165e = UUID.randomUUID().toString();
            }
            String str = f49165e;
            C6496s.f(str, "null cannot be cast to non-null type kotlin.String");
            return str;
        } catch (Throwable th2) {
            C4049a.b(th2, cls);
            return null;
        }
    }

    public static final boolean h() {
        Class<C4133e> cls = C4133e.class;
        if (C4049a.d(cls)) {
            return false;
        }
        try {
            return f49167g.get();
        } catch (Throwable th2) {
            C4049a.b(th2, cls);
            return false;
        }
    }

    private final boolean i() {
        C4049a.d(this);
        return false;
    }

    public static final void j(Activity activity) {
        Class<C4133e> cls = C4133e.class;
        if (!C4049a.d(cls)) {
            try {
                C6496s.h(activity, "activity");
                C4135g.f49170f.a().f(activity);
            } catch (Throwable th2) {
                C4049a.b(th2, cls);
            }
        }
    }

    public static final void k(Activity activity) {
        Class<C4133e> cls = C4133e.class;
        if (!C4049a.d(cls)) {
            try {
                C6496s.h(activity, "activity");
                if (f49166f.get()) {
                    C4135g.f49170f.a().h(activity);
                    C4140l lVar = f49164d;
                    if (lVar != null) {
                        lVar.l();
                    }
                    SensorManager sensorManager = f49163c;
                    if (sensorManager != null) {
                        sensorManager.unregisterListener(f49162b);
                    }
                }
            } catch (Throwable th2) {
                C4049a.b(th2, cls);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003e, code lost:
        if (f49161a.i() != false) goto L_0x0040;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void l(android.app.Activity r7) {
        /*
            java.lang.Class<w5.e> r0 = w5.C4133e.class
            boolean r1 = t7.C4049a.d(r0)
            if (r1 == 0) goto L_0x0009
            return
        L_0x0009:
            java.lang.String r1 = "activity"
            kotlin.jvm.internal.C6496s.h(r7, r1)     // Catch:{ all -> 0x0036 }
            java.util.concurrent.atomic.AtomicBoolean r1 = f49166f     // Catch:{ all -> 0x0036 }
            boolean r1 = r1.get()     // Catch:{ all -> 0x0036 }
            if (r1 != 0) goto L_0x0017
            return
        L_0x0017:
            w5.g$a r1 = w5.C4135g.f49170f     // Catch:{ all -> 0x0036 }
            w5.g r1 = r1.a()     // Catch:{ all -> 0x0036 }
            r1.e(r7)     // Catch:{ all -> 0x0036 }
            android.content.Context r1 = r7.getApplicationContext()     // Catch:{ all -> 0x0036 }
            java.lang.String r2 = com.facebook.I.m()     // Catch:{ all -> 0x0036 }
            o7.w r3 = o7.C3884A.f(r2)     // Catch:{ all -> 0x0036 }
            r4 = 1
            if (r3 == 0) goto L_0x0038
            boolean r5 = r3.d()     // Catch:{ all -> 0x0036 }
            if (r5 != r4) goto L_0x0038
            goto L_0x0040
        L_0x0036:
            r7 = move-exception
            goto L_0x0085
        L_0x0038:
            w5.e r5 = f49161a     // Catch:{ all -> 0x0036 }
            boolean r5 = r5.i()     // Catch:{ all -> 0x0036 }
            if (r5 == 0) goto L_0x0071
        L_0x0040:
            java.lang.String r5 = "sensor"
            java.lang.Object r1 = r1.getSystemService(r5)     // Catch:{ all -> 0x0036 }
            android.hardware.SensorManager r1 = (android.hardware.SensorManager) r1     // Catch:{ all -> 0x0036 }
            if (r1 != 0) goto L_0x004b
            return
        L_0x004b:
            f49163c = r1     // Catch:{ all -> 0x0036 }
            android.hardware.Sensor r4 = r1.getDefaultSensor(r4)     // Catch:{ all -> 0x0036 }
            w5.l r5 = new w5.l     // Catch:{ all -> 0x0036 }
            r5.<init>(r7)     // Catch:{ all -> 0x0036 }
            f49164d = r5     // Catch:{ all -> 0x0036 }
            w5.m r7 = f49162b     // Catch:{ all -> 0x0036 }
            w5.c r6 = new w5.c     // Catch:{ all -> 0x0036 }
            r6.<init>(r3, r2)     // Catch:{ all -> 0x0036 }
            r7.a(r6)     // Catch:{ all -> 0x0036 }
            r6 = 2
            r1.registerListener(r7, r4, r6)     // Catch:{ all -> 0x0036 }
            if (r3 == 0) goto L_0x0071
            boolean r7 = r3.d()     // Catch:{ all -> 0x0036 }
            if (r7 == 0) goto L_0x0071
            r5.h()     // Catch:{ all -> 0x0036 }
        L_0x0071:
            w5.e r7 = f49161a     // Catch:{ all -> 0x0036 }
            boolean r1 = r7.i()     // Catch:{ all -> 0x0036 }
            if (r1 == 0) goto L_0x0084
            java.util.concurrent.atomic.AtomicBoolean r1 = f49167g     // Catch:{ all -> 0x0036 }
            boolean r1 = r1.get()     // Catch:{ all -> 0x0036 }
            if (r1 != 0) goto L_0x0084
            r7.c(r2)     // Catch:{ all -> 0x0036 }
        L_0x0084:
            return
        L_0x0085:
            t7.C4049a.b(r7, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w5.C4133e.l(android.app.Activity):void");
    }

    /* access modifiers changed from: private */
    public static final void m(C3906w wVar, String str) {
        boolean z10;
        Class<C4133e> cls = C4133e.class;
        if (!C4049a.d(cls)) {
            try {
                C6496s.h(str, "$appId");
                if (wVar == null || !wVar.d()) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                boolean s10 = I.s();
                if (z10 && s10) {
                    f49161a.c(str);
                }
            } catch (Throwable th2) {
                C4049a.b(th2, cls);
            }
        }
    }

    public static final void n(boolean z10) {
        Class<C4133e> cls = C4133e.class;
        if (!C4049a.d(cls)) {
            try {
                f49167g.set(z10);
            } catch (Throwable th2) {
                C4049a.b(th2, cls);
            }
        }
    }
}
