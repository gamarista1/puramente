package q7;

import com.facebook.I;
import o7.C3902s;
import r7.e;
import s7.c;
import t7.C4049a;
import u7.C4098e;
import v7.C4110a;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final g f47774a = new g();

    private g() {
    }

    public static final void d() {
        if (I.p()) {
            C3902s.a(C3902s.b.CrashReport, new d());
            C3902s.a(C3902s.b.ErrorReport, new e());
            C3902s.a(C3902s.b.AnrReport, new f());
        }
    }

    /* access modifiers changed from: private */
    public static final void e(boolean z10) {
        if (z10) {
            c.f48083b.c();
            if (C3902s.g(C3902s.b.CrashShield)) {
                b.b();
                C4049a.a();
            }
            if (C3902s.g(C3902s.b.ThreadCheck)) {
                C4110a.a();
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void f(boolean z10) {
        if (z10) {
            C4098e.d();
        }
    }

    /* access modifiers changed from: private */
    public static final void g(boolean z10) {
        if (z10) {
            e.c();
        }
    }
}
