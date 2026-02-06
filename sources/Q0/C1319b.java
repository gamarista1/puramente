package Q0;

import Q0.E;
import R0.l0;
import Z0.c;
import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import b1.C1873e;
import b1.C1874f;
import b1.j;
import c1.v;
import c1.w;

/* renamed from: Q0.b  reason: case insensitive filesystem */
public abstract class C1319b {
    /* access modifiers changed from: private */
    public static final CharSequence j(CharSequence charSequence) {
        Spannable spannable;
        if (charSequence.length() == 0) {
            return charSequence;
        }
        if (charSequence instanceof Spannable) {
            spannable = (Spannable) charSequence;
        } else {
            spannable = new SpannableString(charSequence);
        }
        c.u(spannable, new T0.c(), spannable.length() - 1, spannable.length() - 1);
        return spannable;
    }

    /* access modifiers changed from: private */
    public static final int k(l0 l0Var, int i10) {
        int m10 = l0Var.m();
        for (int i11 = 0; i11 < m10; i11++) {
            if (l0Var.l(i11) > ((float) i10)) {
                return i11;
            }
        }
        return l0Var.m();
    }

    /* access modifiers changed from: private */
    public static final boolean l(T t10, boolean z10) {
        if (!z10 || v.e(t10.q(), w.f(0)) || v.e(t10.q(), v.f19242b.a())) {
            return false;
        }
        int z11 = t10.z();
        j.a aVar = j.f19110b;
        if (j.k(z11, aVar.g()) || j.k(t10.z(), aVar.f()) || j.k(t10.z(), aVar.c())) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    public static final int m(int i10) {
        j.a aVar = j.f19110b;
        if (j.k(i10, aVar.d())) {
            return 3;
        }
        if (j.k(i10, aVar.e())) {
            return 4;
        }
        if (j.k(i10, aVar.a())) {
            return 2;
        }
        if (!j.k(i10, aVar.f()) && j.k(i10, aVar.b())) {
            return 1;
        }
        return 0;
    }

    /* access modifiers changed from: private */
    public static final int n(int i10) {
        C1874f.b.a aVar = C1874f.b.f19078a;
        if (C1874f.b.e(i10, aVar.c())) {
            return 0;
        }
        if (C1874f.b.e(i10, aVar.b())) {
            return 1;
        }
        if (C1874f.b.e(i10, aVar.a())) {
            return 2;
        }
        return 0;
    }

    /* access modifiers changed from: private */
    public static final int o(int i10) {
        C1873e.a aVar = C1873e.f19067b;
        if (!C1873e.g(i10, aVar.a())) {
            C1873e.g(i10, aVar.b());
            return 0;
        } else if (Build.VERSION.SDK_INT <= 32) {
            return 2;
        } else {
            return 4;
        }
    }

    /* access modifiers changed from: private */
    public static final int p(int i10) {
        C1874f.c.a aVar = C1874f.c.f19083a;
        if (C1874f.c.f(i10, aVar.a())) {
            return 0;
        }
        if (C1874f.c.f(i10, aVar.b())) {
            return 1;
        }
        if (C1874f.c.f(i10, aVar.c())) {
            return 2;
        }
        if (C1874f.c.f(i10, aVar.d())) {
            return 3;
        }
        return 0;
    }

    /* access modifiers changed from: private */
    public static final int q(int i10) {
        C1874f.d.a aVar = C1874f.d.f19089a;
        if (!C1874f.d.d(i10, aVar.a()) && C1874f.d.d(i10, aVar.b())) {
            return 1;
        }
        return 0;
    }

    /* access modifiers changed from: private */
    public static final int r(int i10) {
        E.a aVar = E.f5252a;
        if (!E.d(i10, aVar.a()) && E.d(i10, aVar.b())) {
            return 1;
        }
        return 0;
    }
}
