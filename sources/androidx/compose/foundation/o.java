package androidx.compose.foundation;

import B.j;
import B.k;
import B.l;
import Ef.m;
import Y.A1;
import Y.C1488g1;
import Y.C1505o0;
import Y.p1;
import com.google.android.gms.common.api.a;
import h0.C2026j;
import h0.C2027k;
import h0.C2028l;
import i0.C2057k;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import qf.C6658d;
import rf.C6680b;
import x.C2848L;
import yf.C6787a;
import yf.C6798l;
import yf.p;
import z.u;
import z.y;
import z.z;

public final class o implements y {

    /* renamed from: i  reason: collision with root package name */
    public static final c f13092i = new c((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public static final C2026j f13093j = C2027k.a(a.f13102a, b.f13103a);

    /* renamed from: a  reason: collision with root package name */
    private final C1505o0 f13094a;

    /* renamed from: b  reason: collision with root package name */
    private final C1505o0 f13095b = C1488g1.a(0);

    /* renamed from: c  reason: collision with root package name */
    private final l f13096c = k.a();

    /* renamed from: d  reason: collision with root package name */
    private C1505o0 f13097d = C1488g1.a(a.e.API_PRIORITY_OTHER);
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public float f13098e;

    /* renamed from: f  reason: collision with root package name */
    private final y f13099f = z.a(new f(this));

    /* renamed from: g  reason: collision with root package name */
    private final A1 f13100g = p1.e(new e(this));

    /* renamed from: h  reason: collision with root package name */
    private final A1 f13101h = p1.e(new d(this));

    static final class a extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        public static final a f13102a = new a();

        a() {
            super(2);
        }

        /* renamed from: a */
        public final Integer invoke(C2028l lVar, o oVar) {
            return Integer.valueOf(oVar.n());
        }
    }

    static final class b extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final b f13103a = new b();

        b() {
            super(1);
        }

        public final o a(int i10) {
            return new o(i10);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C2026j a() {
            return o.f13093j;
        }

        private c() {
        }
    }

    static final class d extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o f13104a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(o oVar) {
            super(0);
            this.f13104a = oVar;
        }

        /* renamed from: a */
        public final Boolean invoke() {
            boolean z10;
            if (this.f13104a.n() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            return Boolean.valueOf(z10);
        }
    }

    static final class e extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o f13105a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(o oVar) {
            super(0);
            this.f13105a = oVar;
        }

        /* renamed from: a */
        public final Boolean invoke() {
            boolean z10;
            if (this.f13105a.n() < this.f13105a.m()) {
                z10 = true;
            } else {
                z10 = false;
            }
            return Boolean.valueOf(z10);
        }
    }

    static final class f extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o f13106a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(o oVar) {
            super(1);
            this.f13106a = oVar;
        }

        public final Float a(float f10) {
            boolean z10;
            float n10 = ((float) this.f13106a.n()) + f10 + this.f13106a.f13098e;
            float k10 = m.k(n10, 0.0f, (float) this.f13106a.m());
            if (n10 == k10) {
                z10 = true;
            } else {
                z10 = false;
            }
            float n11 = k10 - ((float) this.f13106a.n());
            int round = Math.round(n11);
            o oVar = this.f13106a;
            oVar.q(oVar.n() + round);
            this.f13106a.f13098e = n11 - ((float) round);
            if (!z10) {
                f10 = n11;
            }
            return Float.valueOf(f10);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).floatValue());
        }
    }

    public o(int i10) {
        this.f13094a = C1488g1.a(i10);
    }

    /* access modifiers changed from: private */
    public final void q(int i10) {
        this.f13094a.f(i10);
    }

    public boolean b() {
        return this.f13099f.b();
    }

    public boolean c() {
        return ((Boolean) this.f13101h.getValue()).booleanValue();
    }

    public boolean d() {
        return ((Boolean) this.f13100g.getValue()).booleanValue();
    }

    public Object e(C2848L l10, p pVar, C6658d dVar) {
        Object e10 = this.f13099f.e(l10, pVar, dVar);
        if (e10 == C6680b.f()) {
            return e10;
        }
        return C6514M.f71813a;
    }

    public float f(float f10) {
        return this.f13099f.f(f10);
    }

    public final j k() {
        return this.f13096c;
    }

    public final l l() {
        return this.f13096c;
    }

    public final int m() {
        return this.f13097d.b();
    }

    public final int n() {
        return this.f13094a.b();
    }

    public final Object o(int i10, C6658d dVar) {
        return u.c(this, (float) (i10 - n()), dVar);
    }

    public final void p(int i10) {
        C6798l lVar;
        this.f13097d.f(i10);
        C2057k.a aVar = C2057k.f21728e;
        C2057k d10 = aVar.d();
        if (d10 != null) {
            lVar = d10.h();
        } else {
            lVar = null;
        }
        C2057k f10 = aVar.f(d10);
        try {
            if (n() > i10) {
                q(i10);
            }
            C6514M m10 = C6514M.f71813a;
            aVar.m(d10, f10, lVar);
        } catch (Throwable th2) {
            aVar.m(d10, f10, lVar);
            throw th2;
        }
    }

    public final void r(int i10) {
        this.f13095b.f(i10);
    }
}
