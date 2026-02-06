package H5;

import android.content.Context;
import android.content.SharedPreferences;
import com.facebook.I;
import java.util.Set;
import kotlin.jvm.internal.C6496s;
import mf.C6565s;
import mf.Y;
import o7.W;
import t5.C4028e;
import t7.C4049a;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f31692a = new c();

    /* renamed from: b  reason: collision with root package name */
    private static final Set f31693b = Y.j("fb_mobile_purchase", "StartTrial", "Subscribe");

    private c() {
    }

    private final boolean c(C4028e eVar) {
        boolean z10;
        if (C4049a.d(this)) {
            return false;
        }
        try {
            if (!eVar.h() || !f31693b.contains(eVar.f())) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (!eVar.h() || z10) {
                return true;
            }
            return false;
        } catch (Throwable th2) {
            C4049a.b(th2, this);
            return false;
        }
    }

    public static final boolean d() {
        Class<c> cls = c.class;
        if (C4049a.d(cls)) {
            return false;
        }
        try {
            if (I.z(I.l()) || W.b0() || !e.b()) {
                return false;
            }
            return true;
        } catch (Throwable th2) {
            C4049a.b(th2, cls);
            return false;
        }
    }

    public static final void e(String str, C4028e eVar) {
        Class<c> cls = c.class;
        if (!C4049a.d(cls)) {
            try {
                C6496s.h(str, "applicationId");
                C6496s.h(eVar, "event");
                if (f31692a.c(eVar)) {
                    I.t().execute(new a(str, eVar));
                }
            } catch (Throwable th2) {
                C4049a.b(th2, cls);
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void f(String str, C4028e eVar) {
        Class<c> cls = c.class;
        if (!C4049a.d(cls)) {
            try {
                C6496s.h(str, "$applicationId");
                C6496s.h(eVar, "$event");
                e.c(str, C6565s.e(eVar));
            } catch (Throwable th2) {
                C4049a.b(th2, cls);
            }
        }
    }

    public static final void g(String str, String str2) {
        Class<c> cls = c.class;
        if (!C4049a.d(cls)) {
            try {
                Context l10 = I.l();
                if (l10 != null && str != null && str2 != null) {
                    I.t().execute(new b(l10, str2, str));
                }
            } catch (Throwable th2) {
                C4049a.b(th2, cls);
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void h(Context context, String str, String str2) {
        Class<c> cls = c.class;
        if (!C4049a.d(cls)) {
            try {
                C6496s.h(context, "$context");
                SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
                String str3 = str2 + "pingForOnDevice";
                if (sharedPreferences.getLong(str3, 0) == 0) {
                    e.e(str2);
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    edit.putLong(str3, System.currentTimeMillis());
                    edit.apply();
                }
            } catch (Throwable th2) {
                C4049a.b(th2, cls);
            }
        }
    }
}
