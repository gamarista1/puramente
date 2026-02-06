package androidx.compose.foundation.layout;

import H0.E;
import H0.G;
import H0.H;
import H0.U;
import J0.B;
import java.util.Map;
import k0.i;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import yf.C6798l;

final class m extends i.c implements B {

    /* renamed from: n  reason: collision with root package name */
    private float f12862n;

    /* renamed from: o  reason: collision with root package name */
    private float f12863o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f12864p;

    static final class a extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m f12865a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ U f12866b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ H f12867c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(m mVar, U u10, H h10) {
            super(1);
            this.f12865a = mVar;
            this.f12866b = u10;
            this.f12867c = h10;
        }

        public final void a(U.a aVar) {
            if (this.f12865a.l2()) {
                U.a.l(aVar, this.f12866b, this.f12867c.E0(this.f12865a.m2()), this.f12867c.E0(this.f12865a.n2()), 0.0f, 4, (Object) null);
                return;
            }
            U.a.h(aVar, this.f12866b, this.f12867c.E0(this.f12865a.m2()), this.f12867c.E0(this.f12865a.n2()), 0.0f, 4, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((U.a) obj);
            return C6514M.f71813a;
        }
    }

    public /* synthetic */ m(float f10, float f11, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, f11, z10);
    }

    public final boolean l2() {
        return this.f12864p;
    }

    public final float m2() {
        return this.f12862n;
    }

    public final float n2() {
        return this.f12863o;
    }

    public G o(H h10, E e10, long j10) {
        U v02 = e10.v0(j10);
        return H.N(h10, v02.X0(), v02.R0(), (Map) null, new a(this, v02, h10), 4, (Object) null);
    }

    public final void o2(boolean z10) {
        this.f12864p = z10;
    }

    public final void p2(float f10) {
        this.f12862n = f10;
    }

    public final void q2(float f10) {
        this.f12863o = f10;
    }

    private m(float f10, float f11, boolean z10) {
        this.f12862n = f10;
        this.f12863o = f11;
        this.f12864p = z10;
    }
}
