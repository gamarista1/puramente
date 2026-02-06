package androidx.compose.foundation.layout;

import H0.E;
import H0.G;
import H0.H;
import H0.U;
import J0.B;
import c1.c;
import java.util.Map;
import k0.i;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import yf.C6798l;

final class o extends i.c implements B {

    /* renamed from: n  reason: collision with root package name */
    private float f12876n;

    /* renamed from: o  reason: collision with root package name */
    private float f12877o;

    /* renamed from: p  reason: collision with root package name */
    private float f12878p;

    /* renamed from: q  reason: collision with root package name */
    private float f12879q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f12880r;

    static final class a extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o f12881a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ U f12882b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ H f12883c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(o oVar, U u10, H h10) {
            super(1);
            this.f12881a = oVar;
            this.f12882b = u10;
            this.f12883c = h10;
        }

        public final void a(U.a aVar) {
            if (this.f12881a.l2()) {
                U.a.l(aVar, this.f12882b, this.f12883c.E0(this.f12881a.m2()), this.f12883c.E0(this.f12881a.n2()), 0.0f, 4, (Object) null);
                return;
            }
            U.a.h(aVar, this.f12882b, this.f12883c.E0(this.f12881a.m2()), this.f12883c.E0(this.f12881a.n2()), 0.0f, 4, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((U.a) obj);
            return C6514M.f71813a;
        }
    }

    public /* synthetic */ o(float f10, float f11, float f12, float f13, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, f11, f12, f13, z10);
    }

    public final boolean l2() {
        return this.f12880r;
    }

    public final float m2() {
        return this.f12876n;
    }

    public final float n2() {
        return this.f12877o;
    }

    public G o(H h10, E e10, long j10) {
        int E02 = h10.E0(this.f12876n) + h10.E0(this.f12878p);
        int E03 = h10.E0(this.f12877o) + h10.E0(this.f12879q);
        U v02 = e10.v0(c.n(j10, -E02, -E03));
        return H.N(h10, c.i(j10, v02.X0() + E02), c.h(j10, v02.R0() + E03), (Map) null, new a(this, v02, h10), 4, (Object) null);
    }

    public final void o2(float f10) {
        this.f12879q = f10;
    }

    public final void p2(float f10) {
        this.f12878p = f10;
    }

    public final void q2(boolean z10) {
        this.f12880r = z10;
    }

    public final void r2(float f10) {
        this.f12876n = f10;
    }

    public final void s2(float f10) {
        this.f12877o = f10;
    }

    private o(float f10, float f11, float f12, float f13, boolean z10) {
        this.f12876n = f10;
        this.f12877o = f11;
        this.f12878p = f12;
        this.f12879q = f13;
        this.f12880r = z10;
    }
}
