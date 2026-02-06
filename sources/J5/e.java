package J5;

import F5.g;
import G5.f;
import android.app.Activity;
import com.facebook.I;
import java.io.File;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.C6496s;
import o7.C3884A;
import o7.C3906w;
import org.json.JSONArray;
import org.json.JSONObject;
import t7.C4049a;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final e f32178a = new e();

    /* renamed from: b  reason: collision with root package name */
    private static final AtomicBoolean f32179b = new AtomicBoolean(false);

    /* renamed from: c  reason: collision with root package name */
    private static final Set f32180c = new LinkedHashSet();

    /* renamed from: d  reason: collision with root package name */
    private static final Set f32181d = new LinkedHashSet();

    private e() {
    }

    public static final synchronized void b() {
        synchronized (e.class) {
            if (!C4049a.d(e.class)) {
                try {
                    I.t().execute(new d());
                } catch (Throwable th2) {
                    C4049a.b(th2, e.class);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void c() {
        Class<e> cls = e.class;
        if (!C4049a.d(cls)) {
            try {
                AtomicBoolean atomicBoolean = f32179b;
                if (!atomicBoolean.get()) {
                    atomicBoolean.set(true);
                    f32178a.d();
                }
            } catch (Throwable th2) {
                C4049a.b(th2, cls);
            }
        }
    }

    private final void d() {
        String y10;
        if (!C4049a.d(this)) {
            try {
                C3906w u10 = C3884A.u(I.m(), false);
                if (u10 != null && (y10 = u10.y()) != null) {
                    g(y10);
                    if (f32180c.isEmpty()) {
                        if (f32181d.isEmpty()) {
                            return;
                        }
                    }
                    File l10 = f.l(f.a.MTML_APP_EVENT_PREDICTION);
                    if (l10 != null) {
                        a.d(l10);
                        Activity m10 = g.m();
                        if (m10 != null) {
                            h(m10);
                        }
                    }
                }
            } catch (Exception unused) {
            } catch (Throwable th2) {
                C4049a.b(th2, this);
            }
        }
    }

    public static final boolean e(String str) {
        Class<e> cls = e.class;
        if (C4049a.d(cls)) {
            return false;
        }
        try {
            C6496s.h(str, "event");
            return f32181d.contains(str);
        } catch (Throwable th2) {
            C4049a.b(th2, cls);
            return false;
        }
    }

    public static final boolean f(String str) {
        Class<e> cls = e.class;
        if (C4049a.d(cls)) {
            return false;
        }
        try {
            C6496s.h(str, "event");
            return f32180c.contains(str);
        } catch (Throwable th2) {
            C4049a.b(th2, cls);
            return false;
        }
    }

    public static final void h(Activity activity) {
        Class<e> cls = e.class;
        if (!C4049a.d(cls)) {
            try {
                C6496s.h(activity, "activity");
                try {
                    if (f32179b.get() && a.f()) {
                        if (f32180c.isEmpty()) {
                            if (!f32181d.isEmpty()) {
                            }
                        }
                        g.f32183d.a(activity);
                        return;
                    }
                    g.f32183d.b(activity);
                } catch (Exception unused) {
                }
            } catch (Throwable th2) {
                C4049a.b(th2, cls);
            }
        }
    }

    public final void g(String str) {
        if (!C4049a.d(this)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("production_events")) {
                    JSONArray jSONArray = jSONObject.getJSONArray("production_events");
                    int length = jSONArray.length();
                    for (int i10 = 0; i10 < length; i10++) {
                        Set set = f32180c;
                        String string = jSONArray.getString(i10);
                        C6496s.g(string, "jsonArray.getString(i)");
                        set.add(string);
                    }
                }
                if (jSONObject.has("eligible_for_prediction_events")) {
                    JSONArray jSONArray2 = jSONObject.getJSONArray("eligible_for_prediction_events");
                    int length2 = jSONArray2.length();
                    for (int i11 = 0; i11 < length2; i11++) {
                        Set set2 = f32181d;
                        String string2 = jSONArray2.getString(i11);
                        C6496s.g(string2, "jsonArray.getString(i)");
                        set2.add(string2);
                    }
                }
            } catch (Exception unused) {
            } catch (Throwable th2) {
                C4049a.b(th2, this);
            }
        }
    }
}
