package androidx.compose.ui.layout;

import J0.A;
import c1.r;
import c1.s;
import k0.i;
import yf.C6798l;

final class f extends i.c implements A {

    /* renamed from: n  reason: collision with root package name */
    private C6798l f13455n;

    /* renamed from: o  reason: collision with root package name */
    private final boolean f13456o = true;

    /* renamed from: p  reason: collision with root package name */
    private long f13457p = s.a(Integer.MIN_VALUE, Integer.MIN_VALUE);

    public f(C6798l lVar) {
        this.f13455n = lVar;
    }

    public void O(long j10) {
        if (!r.e(this.f13457p, j10)) {
            this.f13455n.invoke(r.b(j10));
            this.f13457p = j10;
        }
    }

    public boolean Q1() {
        return this.f13456o;
    }

    public final void l2(C6798l lVar) {
        this.f13455n = lVar;
        this.f13457p = s.a(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }
}
