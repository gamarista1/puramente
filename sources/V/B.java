package V;

import B.j;
import J0.C1242h;
import J0.C1243i;
import J0.C1244j;
import J0.C1247m;
import J0.h0;
import J0.i0;
import U.g;
import U.p;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import r0.C2443E0;
import r0.C2544x0;
import yf.C6787a;

final class B extends C1247m implements C1242h, h0 {

    /* renamed from: p  reason: collision with root package name */
    private final j f6446p;

    /* renamed from: q  reason: collision with root package name */
    private final boolean f6447q;

    /* renamed from: r  reason: collision with root package name */
    private final float f6448r;
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public final C2443E0 f6449s;
    /* access modifiers changed from: private */

    /* renamed from: t  reason: collision with root package name */
    public C1244j f6450t;

    static final class a implements C2443E0 {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ B f6451a;

        a(B b10) {
            this.f6451a = b10;
        }

        public final long a() {
            long a10 = this.f6451a.f6449s.a();
            if (a10 != 16) {
                return a10;
            }
            C1405s0 s0Var = (C1405s0) C1243i.a(this.f6451a, C1409u0.a());
            if (s0Var == null || s0Var.a() == 16) {
                return ((C2544x0) C1243i.a(this.f6451a, A.a())).y();
            }
            return s0Var.a();
        }
    }

    static final class b extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ B f6452a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(B b10) {
            super(0);
            this.f6452a = b10;
        }

        /* renamed from: a */
        public final g invoke() {
            g b10;
            C1405s0 s0Var = (C1405s0) C1243i.a(this.f6452a, C1409u0.a());
            if (s0Var == null || (b10 = s0Var.b()) == null) {
                return C1407t0.f8017a.a();
            }
            return b10;
        }
    }

    static final class c extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ B f6453a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(B b10) {
            super(0);
            this.f6453a = b10;
        }

        public final void invoke() {
            if (((C1405s0) C1243i.a(this.f6453a, C1409u0.a())) == null) {
                this.f6453a.w2();
            } else if (this.f6453a.f6450t == null) {
                this.f6453a.v2();
            }
        }
    }

    public /* synthetic */ B(j jVar, boolean z10, float f10, C2443E0 e02, DefaultConstructorMarker defaultConstructorMarker) {
        this(jVar, z10, f10, e02);
    }

    /* access modifiers changed from: private */
    public final void v2() {
        this.f6450t = l2(p.c(this.f6446p, this.f6447q, this.f6448r, new a(this), new b(this)));
    }

    /* access modifiers changed from: private */
    public final void w2() {
        C1244j jVar = this.f6450t;
        if (jVar != null) {
            o2(jVar);
        }
    }

    private final void x2() {
        i0.a(this, new c(this));
    }

    public void A0() {
        x2();
    }

    public void V1() {
        x2();
    }

    private B(j jVar, boolean z10, float f10, C2443E0 e02) {
        this.f6446p = jVar;
        this.f6447q = z10;
        this.f6448r = f10;
        this.f6449s = e02;
    }
}
