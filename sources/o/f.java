package O;

import J.J;
import O.c;
import Q0.C1321d;
import Q0.C1328k;
import Q0.C1329l;
import Q0.C1333p;
import Q0.C1335s;
import Q0.C1336t;
import Q0.C1337u;
import Q0.K;
import Q0.L;
import Q0.T;
import Q0.U;
import V0.h;
import c1.b;
import c1.c;
import c1.d;
import c1.r;
import c1.s;
import c1.t;
import com.google.android.gms.common.api.a;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import mf.C6565s;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    private String f4484a;

    /* renamed from: b  reason: collision with root package name */
    private T f4485b;

    /* renamed from: c  reason: collision with root package name */
    private h.b f4486c;

    /* renamed from: d  reason: collision with root package name */
    private int f4487d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f4488e;

    /* renamed from: f  reason: collision with root package name */
    private int f4489f;

    /* renamed from: g  reason: collision with root package name */
    private int f4490g;

    /* renamed from: h  reason: collision with root package name */
    private long f4491h;

    /* renamed from: i  reason: collision with root package name */
    private d f4492i;

    /* renamed from: j  reason: collision with root package name */
    private C1333p f4493j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f4494k;

    /* renamed from: l  reason: collision with root package name */
    private long f4495l;

    /* renamed from: m  reason: collision with root package name */
    private c f4496m;

    /* renamed from: n  reason: collision with root package name */
    private C1335s f4497n;

    /* renamed from: o  reason: collision with root package name */
    private t f4498o;

    /* renamed from: p  reason: collision with root package name */
    private long f4499p;

    /* renamed from: q  reason: collision with root package name */
    private int f4500q;

    /* renamed from: r  reason: collision with root package name */
    private int f4501r;

    public /* synthetic */ f(String str, T t10, h.b bVar, int i10, boolean z10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, t10, bVar, i10, z10, i11, i12);
    }

    private final C1333p g(long j10, t tVar) {
        C1335s n10 = n(tVar);
        return C1337u.c(n10, b.a(j10, this.f4488e, this.f4487d, n10.a()), b.b(this.f4488e, this.f4487d, this.f4489f), b1.t.e(this.f4487d, b1.t.f19154a.b()));
    }

    private final void i() {
        this.f4493j = null;
        this.f4497n = null;
        this.f4498o = null;
        this.f4500q = -1;
        this.f4501r = -1;
        this.f4499p = b.f19206b.c(0, 0);
        this.f4495l = s.a(0, 0);
        this.f4494k = false;
    }

    private final boolean l(long j10, t tVar) {
        C1335s sVar;
        C1333p pVar = this.f4493j;
        if (pVar == null || (sVar = this.f4497n) == null || sVar.c() || tVar != this.f4498o) {
            return true;
        }
        if (b.f(j10, this.f4499p)) {
            return false;
        }
        if (b.l(j10) == b.l(this.f4499p) && ((float) b.k(j10)) >= pVar.d() && !pVar.q()) {
            return false;
        }
        return true;
    }

    private final C1335s n(t tVar) {
        C1335s sVar = this.f4497n;
        if (sVar == null || tVar != this.f4498o || sVar.c()) {
            this.f4498o = tVar;
            String str = this.f4484a;
            T d10 = U.d(this.f4485b, tVar);
            d dVar = this.f4492i;
            C6496s.e(dVar);
            sVar = C1336t.b(str, d10, (List) null, (List) null, dVar, this.f4486c, 12, (Object) null);
        }
        this.f4497n = sVar;
        return sVar;
    }

    public final d a() {
        return this.f4492i;
    }

    public final boolean b() {
        return this.f4494k;
    }

    public final long c() {
        return this.f4495l;
    }

    public final C6514M d() {
        C1335s sVar = this.f4497n;
        if (sVar != null) {
            sVar.c();
        }
        return C6514M.f71813a;
    }

    public final C1333p e() {
        return this.f4493j;
    }

    public final int f(int i10, t tVar) {
        int i11 = this.f4500q;
        int i12 = this.f4501r;
        if (i10 == i11 && i11 != -1) {
            return i12;
        }
        int a10 = J.a(g(c.a(0, i10, 0, a.e.API_PRIORITY_OTHER), tVar).d());
        this.f4500q = i10;
        this.f4501r = a10;
        return a10;
    }

    public final boolean h(long j10, t tVar) {
        boolean z10 = true;
        if (this.f4490g > 1) {
            c.a aVar = c.f4456h;
            c cVar = this.f4496m;
            T t10 = this.f4485b;
            d dVar = this.f4492i;
            C6496s.e(dVar);
            c a10 = aVar.a(cVar, tVar, t10, dVar, this.f4486c);
            this.f4496m = a10;
            j10 = a10.c(j10, this.f4490g);
        }
        boolean z11 = false;
        if (!l(j10, tVar)) {
            if (!b.f(j10, this.f4499p)) {
                C1333p pVar = this.f4493j;
                C6496s.e(pVar);
                long f10 = c1.c.f(j10, s.a(J.a(Math.min(pVar.a(), pVar.e())), J.a(pVar.d())));
                this.f4495l = f10;
                if (b1.t.e(this.f4487d, b1.t.f19154a.c()) || (((float) r.g(f10)) >= pVar.e() && ((float) r.f(f10)) >= pVar.d())) {
                    z10 = false;
                }
                this.f4494k = z10;
                this.f4499p = j10;
            }
            return false;
        }
        C1333p g10 = g(j10, tVar);
        this.f4499p = j10;
        long f11 = c1.c.f(j10, s.a(J.a(g10.e()), J.a(g10.d())));
        this.f4495l = f11;
        if (!b1.t.e(this.f4487d, b1.t.f19154a.c()) && (((float) r.g(f11)) < g10.e() || ((float) r.f(f11)) < g10.d())) {
            z11 = true;
        }
        this.f4494k = z11;
        this.f4493j = g10;
        return true;
    }

    public final int j(t tVar) {
        return J.a(n(tVar).a());
    }

    public final int k(t tVar) {
        return J.a(n(tVar).b());
    }

    public final void m(d dVar) {
        long j10;
        d dVar2 = this.f4492i;
        if (dVar != null) {
            j10 = a.d(dVar);
        } else {
            j10 = a.f4454a.a();
        }
        if (dVar2 == null) {
            this.f4492i = dVar;
            this.f4491h = j10;
        } else if (dVar == null || !a.e(this.f4491h, j10)) {
            this.f4492i = dVar;
            this.f4491h = j10;
            i();
        }
    }

    public final L o(T t10) {
        d dVar;
        t tVar = this.f4498o;
        if (tVar == null || (dVar = this.f4492i) == null) {
            return null;
        }
        C1321d dVar2 = new C1321d(this.f4484a, (List) null, (List) null, 6, (DefaultConstructorMarker) null);
        if (this.f4493j == null || this.f4497n == null) {
            return null;
        }
        long d10 = b.d(this.f4499p, 0, 0, 0, 0, 10, (Object) null);
        K k10 = new K(dVar2, t10, C6565s.n(), this.f4489f, this.f4488e, this.f4487d, dVar, tVar, this.f4486c, d10, (DefaultConstructorMarker) null);
        C1328k kVar = new C1328k(new C1329l(dVar2, t10, C6565s.n(), dVar, this.f4486c), d10, this.f4489f, b1.t.e(this.f4487d, b1.t.f19154a.b()), (DefaultConstructorMarker) null);
        return new L(k10, kVar, this.f4495l, (DefaultConstructorMarker) null);
    }

    public final void p(String str, T t10, h.b bVar, int i10, boolean z10, int i11, int i12) {
        this.f4484a = str;
        this.f4485b = t10;
        this.f4486c = bVar;
        this.f4487d = i10;
        this.f4488e = z10;
        this.f4489f = i11;
        this.f4490g = i12;
        i();
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ParagraphLayoutCache(paragraph=");
        if (this.f4493j != null) {
            str = "<paragraph>";
        } else {
            str = "null";
        }
        sb2.append(str);
        sb2.append(", lastDensity=");
        sb2.append(a.h(this.f4491h));
        sb2.append(')');
        return sb2.toString();
    }

    private f(String str, T t10, h.b bVar, int i10, boolean z10, int i11, int i12) {
        this.f4484a = str;
        this.f4485b = t10;
        this.f4486c = bVar;
        this.f4487d = i10;
        this.f4488e = z10;
        this.f4489f = i11;
        this.f4490g = i12;
        this.f4491h = a.f4454a.a();
        this.f4495l = s.a(0, 0);
        this.f4499p = b.f19206b.c(0, 0);
        this.f4500q = -1;
        this.f4501r = -1;
    }
}
