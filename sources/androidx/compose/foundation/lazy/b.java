package androidx.compose.foundation.lazy;

import H0.E;
import H0.G;
import H0.H;
import H0.U;
import J0.B;
import Y.A1;
import c1.c;
import java.util.Map;
import k0.i;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import yf.C6798l;

final class b extends i.c implements B {

    /* renamed from: n  reason: collision with root package name */
    private float f12937n;

    /* renamed from: o  reason: collision with root package name */
    private A1 f12938o;

    /* renamed from: p  reason: collision with root package name */
    private A1 f12939p;

    static final class a extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ U f12940a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(U u10) {
            super(1);
            this.f12940a = u10;
        }

        public final void a(U.a aVar) {
            U.a.h(aVar, this.f12940a, 0, 0, 0.0f, 4, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((U.a) obj);
            return C6514M.f71813a;
        }
    }

    public b(float f10, A1 a12, A1 a13) {
        this.f12937n = f10;
        this.f12938o = a12;
        this.f12939p = a13;
    }

    public final void l2(float f10) {
        this.f12937n = f10;
    }

    public final void m2(A1 a12) {
        this.f12939p = a12;
    }

    public final void n2(A1 a12) {
        this.f12938o = a12;
    }

    public G o(H h10, E e10, long j10) {
        int i10;
        int i11;
        int i12;
        int i13;
        A1 a12 = this.f12938o;
        if (a12 == null || ((Number) a12.getValue()).intValue() == Integer.MAX_VALUE) {
            i10 = Integer.MAX_VALUE;
        } else {
            i10 = Math.round(((Number) a12.getValue()).floatValue() * this.f12937n);
        }
        A1 a13 = this.f12939p;
        if (a13 == null || ((Number) a13.getValue()).intValue() == Integer.MAX_VALUE) {
            i11 = Integer.MAX_VALUE;
        } else {
            i11 = Math.round(((Number) a13.getValue()).floatValue() * this.f12937n);
        }
        if (i10 != Integer.MAX_VALUE) {
            i12 = i10;
        } else {
            i12 = c1.b.n(j10);
        }
        if (i11 != Integer.MAX_VALUE) {
            i13 = i11;
        } else {
            i13 = c1.b.m(j10);
        }
        if (i10 == Integer.MAX_VALUE) {
            i10 = c1.b.l(j10);
        }
        if (i11 == Integer.MAX_VALUE) {
            i11 = c1.b.k(j10);
        }
        U v02 = e10.v0(c.a(i12, i10, i13, i11));
        return H.N(h10, v02.X0(), v02.R0(), (Map) null, new a(v02), 4, (Object) null);
    }
}
