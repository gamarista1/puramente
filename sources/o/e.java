package O;

import J.J;
import O.c;
import Q0.C1321d;
import Q0.C1328k;
import Q0.C1329l;
import Q0.K;
import Q0.L;
import Q0.T;
import Q0.U;
import V0.h;
import c1.b;
import c1.c;
import c1.d;
import c1.s;
import c1.t;
import com.google.android.gms.common.api.a;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6565s;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    private C1321d f4468a;

    /* renamed from: b  reason: collision with root package name */
    private T f4469b;

    /* renamed from: c  reason: collision with root package name */
    private h.b f4470c;

    /* renamed from: d  reason: collision with root package name */
    private int f4471d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f4472e;

    /* renamed from: f  reason: collision with root package name */
    private int f4473f;

    /* renamed from: g  reason: collision with root package name */
    private int f4474g;

    /* renamed from: h  reason: collision with root package name */
    private List f4475h;

    /* renamed from: i  reason: collision with root package name */
    private c f4476i;

    /* renamed from: j  reason: collision with root package name */
    private long f4477j;

    /* renamed from: k  reason: collision with root package name */
    private d f4478k;

    /* renamed from: l  reason: collision with root package name */
    private C1329l f4479l;

    /* renamed from: m  reason: collision with root package name */
    private t f4480m;

    /* renamed from: n  reason: collision with root package name */
    private L f4481n;

    /* renamed from: o  reason: collision with root package name */
    private int f4482o;

    /* renamed from: p  reason: collision with root package name */
    private int f4483p;

    public /* synthetic */ e(C1321d dVar, T t10, h.b bVar, int i10, boolean z10, int i11, int i12, List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(dVar, t10, bVar, i10, z10, i11, i12, list);
    }

    private final C1328k e(long j10, t tVar) {
        C1329l l10 = l(tVar);
        return new C1328k(l10, b.a(j10, this.f4472e, this.f4471d, l10.a()), b.b(this.f4472e, this.f4471d, this.f4473f), b1.t.e(this.f4471d, b1.t.f19154a.b()), (DefaultConstructorMarker) null);
    }

    private final void g() {
        this.f4479l = null;
        this.f4481n = null;
        this.f4483p = -1;
        this.f4482o = -1;
    }

    private final boolean j(L l10, long j10, t tVar) {
        if (l10 == null || l10.w().j().c() || tVar != l10.l().d()) {
            return true;
        }
        if (b.f(j10, l10.l().a())) {
            return false;
        }
        if (b.l(j10) == b.l(l10.l().a()) && ((float) b.k(j10)) >= l10.w().h() && !l10.w().f()) {
            return false;
        }
        return true;
    }

    private final C1329l l(t tVar) {
        C1329l lVar = this.f4479l;
        if (lVar == null || tVar != this.f4480m || lVar.c()) {
            this.f4480m = tVar;
            C1321d dVar = this.f4468a;
            T d10 = U.d(this.f4469b, tVar);
            d dVar2 = this.f4478k;
            C6496s.e(dVar2);
            h.b bVar = this.f4470c;
            List list = this.f4475h;
            if (list == null) {
                list = C6565s.n();
            }
            lVar = new C1329l(dVar, d10, list, dVar2, bVar);
        }
        this.f4479l = lVar;
        return lVar;
    }

    private final L m(t tVar, long j10, C1328k kVar) {
        float min = Math.min(kVar.j().a(), kVar.A());
        C1321d dVar = this.f4468a;
        T t10 = this.f4469b;
        List list = this.f4475h;
        if (list == null) {
            list = C6565s.n();
        }
        List list2 = list;
        int i10 = this.f4473f;
        boolean z10 = this.f4472e;
        int i11 = this.f4471d;
        d dVar2 = this.f4478k;
        C6496s.e(dVar2);
        return new L(new K(dVar, t10, list2, i10, z10, i11, dVar2, tVar, this.f4470c, j10, (DefaultConstructorMarker) null), kVar, c.f(j10, s.a(J.a(min), J.a(kVar.h()))), (DefaultConstructorMarker) null);
    }

    public final d a() {
        return this.f4478k;
    }

    public final L b() {
        return this.f4481n;
    }

    public final L c() {
        L l10 = this.f4481n;
        if (l10 != null) {
            return l10;
        }
        throw new IllegalStateException("You must call layoutWithConstraints first");
    }

    public final int d(int i10, t tVar) {
        int i11 = this.f4482o;
        int i12 = this.f4483p;
        if (i10 == i11 && i11 != -1) {
            return i12;
        }
        int a10 = J.a(e(c.a(0, i10, 0, a.e.API_PRIORITY_OTHER), tVar).h());
        this.f4482o = i10;
        this.f4483p = a10;
        return a10;
    }

    public final boolean f(long j10, t tVar) {
        if (this.f4474g > 1) {
            c.a aVar = c.f4456h;
            c cVar = this.f4476i;
            T t10 = this.f4469b;
            d dVar = this.f4478k;
            C6496s.e(dVar);
            c a10 = aVar.a(cVar, tVar, t10, dVar, this.f4470c);
            this.f4476i = a10;
            j10 = a10.c(j10, this.f4474g);
        }
        if (!j(this.f4481n, j10, tVar)) {
            L l10 = this.f4481n;
            C6496s.e(l10);
            if (b.f(j10, l10.l().a())) {
                return false;
            }
            L l11 = this.f4481n;
            C6496s.e(l11);
            this.f4481n = m(tVar, j10, l11.w());
            return true;
        }
        this.f4481n = m(tVar, j10, e(j10, tVar));
        return true;
    }

    public final int h(t tVar) {
        return J.a(l(tVar).a());
    }

    public final int i(t tVar) {
        return J.a(l(tVar).b());
    }

    public final void k(d dVar) {
        long j10;
        d dVar2 = this.f4478k;
        if (dVar != null) {
            j10 = a.d(dVar);
        } else {
            j10 = a.f4454a.a();
        }
        if (dVar2 == null) {
            this.f4478k = dVar;
            this.f4477j = j10;
        } else if (dVar == null || !a.e(this.f4477j, j10)) {
            this.f4478k = dVar;
            this.f4477j = j10;
            g();
        }
    }

    public final void n(C1321d dVar, T t10, h.b bVar, int i10, boolean z10, int i11, int i12, List list) {
        this.f4468a = dVar;
        this.f4469b = t10;
        this.f4470c = bVar;
        this.f4471d = i10;
        this.f4472e = z10;
        this.f4473f = i11;
        this.f4474g = i12;
        this.f4475h = list;
        g();
    }

    private e(C1321d dVar, T t10, h.b bVar, int i10, boolean z10, int i11, int i12, List list) {
        this.f4468a = dVar;
        this.f4469b = t10;
        this.f4470c = bVar;
        this.f4471d = i10;
        this.f4472e = z10;
        this.f4473f = i11;
        this.f4474g = i12;
        this.f4475h = list;
        this.f4477j = a.f4454a.a();
        this.f4482o = -1;
        this.f4483p = -1;
    }
}
