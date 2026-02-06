package u5;

import android.app.Activity;
import com.facebook.I;
import kotlin.jvm.internal.C6496s;
import o7.C3884A;
import o7.C3886b;
import o7.C3906w;
import o7.W;
import t7.C4049a;

/* renamed from: u5.b  reason: case insensitive filesystem */
public final class C4087b {

    /* renamed from: a  reason: collision with root package name */
    public static final C4087b f48583a = new C4087b();

    /* renamed from: b  reason: collision with root package name */
    private static final String f48584b = C4087b.class.getCanonicalName();

    /* renamed from: c  reason: collision with root package name */
    private static boolean f48585c;

    private C4087b() {
    }

    public static final void b() {
        Class<C4087b> cls = C4087b.class;
        if (!C4049a.d(cls)) {
            try {
                I.t().execute(new C4086a());
            } catch (Exception e10) {
                W.k0(f48584b, e10);
            } catch (Throwable th2) {
                C4049a.b(th2, cls);
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void c() {
        Class<C4087b> cls = C4087b.class;
        if (!C4049a.d(cls)) {
            try {
                if (!C3886b.f47182f.h(I.l())) {
                    f48583a.e();
                    f48585c = true;
                }
            } catch (Throwable th2) {
                C4049a.b(th2, cls);
            }
        }
    }

    public static final void d(Activity activity) {
        Class<C4087b> cls = C4087b.class;
        if (!C4049a.d(cls)) {
            try {
                C6496s.h(activity, "activity");
                try {
                    if (!f48585c) {
                        return;
                    }
                    if (!d.f48587d.c().isEmpty()) {
                        f.f48594e.e(activity);
                    }
                } catch (Exception unused) {
                }
            } catch (Throwable th2) {
                C4049a.b(th2, cls);
            }
        }
    }

    private final void e() {
        String q10;
        if (!C4049a.d(this)) {
            try {
                C3906w u10 = C3884A.u(I.m(), false);
                if (u10 != null && (q10 = u10.q()) != null) {
                    d.f48587d.d(q10);
                }
            } catch (Throwable th2) {
                C4049a.b(th2, this);
            }
        }
    }
}
