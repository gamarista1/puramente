package V;

import Ef.m;
import H0.E;
import H0.G;
import H0.H;
import H0.U;
import J0.B;
import J0.C1242h;
import J0.C1243i;
import c1.h;
import java.util.Map;
import k0.i;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import yf.C6798l;

/* renamed from: V.d0  reason: case insensitive filesystem */
public final class C1376d0 extends i.c implements C1242h, B {

    /* renamed from: V.d0$a */
    static final class a extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f7386a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ U f7387b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f7388c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(int i10, U u10, int i11) {
            super(1);
            this.f7386a = i10;
            this.f7387b = u10;
            this.f7388c = i11;
        }

        public final void a(U.a aVar) {
            U.a aVar2 = aVar;
            U.a.h(aVar2, this.f7387b, Af.a.d(((float) (this.f7386a - this.f7387b.X0())) / 2.0f), Af.a.d(((float) (this.f7388c - this.f7387b.R0())) / 2.0f), 0.0f, 4, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((U.a) obj);
            return C6514M.f71813a;
        }
    }

    public G o(H h10, E e10, long j10) {
        boolean z10;
        int X02;
        int R02;
        int i10 = 0;
        float f10 = (float) 0;
        float j11 = h.j(m.c(((h) C1243i.a(this, W.a())).r(), h.j(f10)));
        U v02 = e10.v0(j10);
        if (!S1() || Float.isNaN(j11) || h.i(j11, h.j(f10)) <= 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!Float.isNaN(j11)) {
            i10 = h10.E0(j11);
        }
        if (z10) {
            X02 = Math.max(v02.X0(), i10);
        } else {
            X02 = v02.X0();
        }
        int i11 = X02;
        if (z10) {
            R02 = Math.max(v02.R0(), i10);
        } else {
            R02 = v02.R0();
        }
        int i12 = R02;
        return H.N(h10, i11, i12, (Map) null, new a(i11, v02, i12), 4, (Object) null);
    }
}
