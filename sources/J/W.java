package J;

import Ef.m;
import Q0.Q;
import Y.C1503n0;
import Y.C1510r0;
import Y.D0;
import Y.p1;
import h0.C2017a;
import h0.C2026j;
import h0.C2028l;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6565s;
import q0.C2423i;
import yf.C6798l;
import yf.p;
import z.q;

public final class W {

    /* renamed from: f  reason: collision with root package name */
    public static final c f2979f = new c((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static final C2026j f2980g = C2017a.a(a.f2986a, b.f2987a);

    /* renamed from: a  reason: collision with root package name */
    private final C1503n0 f2981a;

    /* renamed from: b  reason: collision with root package name */
    private final C1503n0 f2982b;

    /* renamed from: c  reason: collision with root package name */
    private C2423i f2983c;

    /* renamed from: d  reason: collision with root package name */
    private long f2984d;

    /* renamed from: e  reason: collision with root package name */
    private final C1510r0 f2985e;

    static final class a extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        public static final a f2986a = new a();

        a() {
            super(2);
        }

        /* renamed from: a */
        public final List invoke(C2028l lVar, W w10) {
            boolean z10;
            Float valueOf = Float.valueOf(w10.d());
            if (w10.f() == q.Vertical) {
                z10 = true;
            } else {
                z10 = false;
            }
            return C6565s.q(valueOf, Boolean.valueOf(z10));
        }
    }

    static final class b extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final b f2987a = new b();

        b() {
            super(1);
        }

        /* renamed from: a */
        public final W invoke(List list) {
            q qVar;
            Object obj = list.get(1);
            C6496s.f(obj, "null cannot be cast to non-null type kotlin.Boolean");
            if (((Boolean) obj).booleanValue()) {
                qVar = q.Vertical;
            } else {
                qVar = q.Horizontal;
            }
            Object obj2 = list.get(0);
            C6496s.f(obj2, "null cannot be cast to non-null type kotlin.Float");
            return new W(qVar, ((Float) obj2).floatValue());
        }
    }

    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C2026j a() {
            return W.f2980g;
        }

        private c() {
        }
    }

    public W(q qVar, float f10) {
        this.f2981a = D0.a(f10);
        this.f2982b = D0.a(0.0f);
        this.f2983c = C2423i.f25325e.a();
        this.f2984d = Q.f5291b.a();
        this.f2985e = p1.h(qVar, p1.q());
    }

    private final void g(float f10) {
        this.f2982b.l(f10);
    }

    public final void b(float f10, float f11, int i10) {
        float f12;
        int i11;
        float d10 = d();
        float f13 = (float) i10;
        float f14 = d10 + f13;
        if (f11 > f14 || (f10 < d10 && f11 - f10 > f13)) {
            f12 = f11 - f14;
        } else if (i11 >= 0 || f11 - f10 > f13) {
            f12 = 0.0f;
        } else {
            f12 = f10 - d10;
        }
        h(d() + f12);
    }

    public final float c() {
        return this.f2982b.c();
    }

    public final float d() {
        return this.f2981a.c();
    }

    public final int e(long j10) {
        if (Q.n(j10) != Q.n(this.f2984d)) {
            return Q.n(j10);
        }
        if (Q.i(j10) != Q.i(this.f2984d)) {
            return Q.i(j10);
        }
        return Q.l(j10);
    }

    public final q f() {
        return (q) this.f2985e.getValue();
    }

    public final void h(float f10) {
        this.f2981a.l(f10);
    }

    public final void i(long j10) {
        this.f2984d = j10;
    }

    public final void j(q qVar, C2423i iVar, int i10, int i11) {
        boolean z10;
        float f10;
        float f11;
        float f12 = (float) (i11 - i10);
        g(f12);
        if (!(iVar.i() == this.f2983c.i() && iVar.l() == this.f2983c.l())) {
            if (qVar == q.Vertical) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                f10 = iVar.l();
            } else {
                f10 = iVar.i();
            }
            if (z10) {
                f11 = iVar.e();
            } else {
                f11 = iVar.j();
            }
            b(f10, f11, i10);
            this.f2983c = iVar;
        }
        h(m.k(d(), 0.0f, f12));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ W(q qVar, float f10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(qVar, (i10 & 2) != 0 ? 0.0f : f10);
    }
}
