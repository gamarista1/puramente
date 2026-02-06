package k9;

import android.os.Bundle;
import ja.C3645a;
import k9.C3700i;
import nb.k;

/* renamed from: k9.t0  reason: case insensitive filesystem */
public final class C3722t0 extends Z0 {

    /* renamed from: d  reason: collision with root package name */
    public static final C3700i.a f45835d = new C3720s0();

    /* renamed from: b  reason: collision with root package name */
    private final boolean f45836b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f45837c;

    public C3722t0() {
        this.f45836b = false;
        this.f45837c = false;
    }

    private static String c(int i10) {
        return Integer.toString(i10, 36);
    }

    /* access modifiers changed from: private */
    public static C3722t0 e(Bundle bundle) {
        boolean z10;
        if (bundle.getInt(c(0), -1) == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        C3645a.a(z10);
        if (bundle.getBoolean(c(1), false)) {
            return new C3722t0(bundle.getBoolean(c(2), false));
        }
        return new C3722t0();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C3722t0)) {
            return false;
        }
        C3722t0 t0Var = (C3722t0) obj;
        if (this.f45837c == t0Var.f45837c && this.f45836b == t0Var.f45836b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return k.b(Boolean.valueOf(this.f45836b), Boolean.valueOf(this.f45837c));
    }

    public C3722t0(boolean z10) {
        this.f45836b = true;
        this.f45837c = z10;
    }
}
