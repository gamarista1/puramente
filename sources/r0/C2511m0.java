package r0;

import H0.E;
import H0.G;
import H0.H;
import H0.U;
import J0.B;
import J0.C1235c0;
import J0.C1239e0;
import J0.C1245k;
import java.util.Map;
import k0.i;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import yf.C6798l;

/* renamed from: r0.m0  reason: case insensitive filesystem */
public final class C2511m0 extends i.c implements B {

    /* renamed from: n  reason: collision with root package name */
    private C6798l f25543n;

    /* renamed from: r0.m0$a */
    static final class a extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ U f25544a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C2511m0 f25545b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(U u10, C2511m0 m0Var) {
            super(1);
            this.f25544a = u10;
            this.f25545b = m0Var;
        }

        public final void a(U.a aVar) {
            U.a.v(aVar, this.f25544a, 0, 0, 0.0f, this.f25545b.l2(), 4, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((U.a) obj);
            return C6514M.f71813a;
        }
    }

    public C2511m0(C6798l lVar) {
        this.f25543n = lVar;
    }

    public boolean Q1() {
        return false;
    }

    public final C6798l l2() {
        return this.f25543n;
    }

    public final void m2() {
        C1235c0 E22 = C1245k.h(this, C1239e0.a(2)).E2();
        if (E22 != null) {
            E22.s3(this.f25543n, true);
        }
    }

    public final void n2(C6798l lVar) {
        this.f25543n = lVar;
    }

    public G o(H h10, E e10, long j10) {
        U v02 = e10.v0(j10);
        return H.N(h10, v02.X0(), v02.R0(), (Map) null, new a(v02, this), 4, (Object) null);
    }

    public String toString() {
        return "BlockGraphicsLayerModifier(block=" + this.f25543n + ')';
    }
}
