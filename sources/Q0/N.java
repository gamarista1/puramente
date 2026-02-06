package Q0;

import Ef.m;
import V0.h;
import c1.b;
import c1.c;
import c1.d;
import c1.s;
import c1.t;
import com.google.android.gms.common.api.a;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6565s;

public final class N {

    /* renamed from: f  reason: collision with root package name */
    public static final a f5283f = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final h.b f5284a;

    /* renamed from: b  reason: collision with root package name */
    private final d f5285b;

    /* renamed from: c  reason: collision with root package name */
    private final t f5286c;

    /* renamed from: d  reason: collision with root package name */
    private final int f5287d;

    /* renamed from: e  reason: collision with root package name */
    private final J f5288e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        public final L b(K k10) {
            int i10;
            int e10;
            C1329l lVar = new C1329l(k10.j(), U.d(k10.i(), k10.d()), k10.g(), k10.b(), k10.c());
            int n10 = b.n(k10.a());
            if ((k10.h() || b1.t.e(k10.f(), b1.t.f19154a.b())) && b.h(k10.a())) {
                i10 = b.l(k10.a());
            } else {
                i10 = a.e.API_PRIORITY_OTHER;
            }
            if (k10.h() || !b1.t.e(k10.f(), b1.t.f19154a.b())) {
                e10 = k10.e();
            } else {
                e10 = 1;
            }
            int i11 = e10;
            if (n10 != i10) {
                i10 = m.l(C1337u.d(lVar.a()), n10, i10);
            }
            C1328k kVar = new C1328k(lVar, b.f19206b.b(0, i10, 0, b.k(k10.a())), i11, b1.t.e(k10.f(), b1.t.f19154a.b()), (DefaultConstructorMarker) null);
            return new L(k10, kVar, c.f(k10.a(), s.a((int) ((float) Math.ceil((double) kVar.A())), (int) ((float) Math.ceil((double) kVar.h())))), (DefaultConstructorMarker) null);
        }

        private a() {
        }
    }

    public N(h.b bVar, d dVar, t tVar, int i10) {
        J j10;
        this.f5284a = bVar;
        this.f5285b = dVar;
        this.f5286c = tVar;
        this.f5287d = i10;
        if (i10 > 0) {
            j10 = new J(i10);
        } else {
            j10 = null;
        }
        this.f5288e = j10;
    }

    public static /* synthetic */ L b(N n10, String str, T t10, int i10, boolean z10, int i11, long j10, t tVar, d dVar, h.b bVar, boolean z11, int i12, Object obj) {
        T t11;
        int i13;
        boolean z12;
        int i14;
        long j11;
        t tVar2;
        d dVar2;
        h.b bVar2;
        boolean z13;
        N n11 = n10;
        int i15 = i12;
        if ((i15 & 2) != 0) {
            t11 = T.f5294d.a();
        } else {
            t11 = t10;
        }
        if ((i15 & 4) != 0) {
            i13 = b1.t.f19154a.a();
        } else {
            i13 = i10;
        }
        if ((i15 & 8) != 0) {
            z12 = true;
        } else {
            z12 = z10;
        }
        if ((i15 & 16) != 0) {
            i14 = a.e.API_PRIORITY_OTHER;
        } else {
            i14 = i11;
        }
        if ((i15 & 32) != 0) {
            j11 = c.b(0, 0, 0, 0, 15, (Object) null);
        } else {
            j11 = j10;
        }
        if ((i15 & 64) != 0) {
            tVar2 = n11.f5286c;
        } else {
            tVar2 = tVar;
        }
        if ((i15 & 128) != 0) {
            dVar2 = n11.f5285b;
        } else {
            dVar2 = dVar;
        }
        if ((i15 & 256) != 0) {
            bVar2 = n11.f5284a;
        } else {
            bVar2 = bVar;
        }
        if ((i15 & 512) != 0) {
            z13 = false;
        } else {
            z13 = z11;
        }
        return n10.a(str, t11, i13, z12, i14, j11, tVar2, dVar2, bVar2, z13);
    }

    public static /* synthetic */ L d(N n10, C1321d dVar, T t10, int i10, boolean z10, int i11, List list, long j10, t tVar, d dVar2, h.b bVar, boolean z11, int i12, Object obj) {
        T t11;
        int i13;
        boolean z12;
        int i14;
        List list2;
        long j11;
        t tVar2;
        d dVar3;
        h.b bVar2;
        boolean z13;
        N n11 = n10;
        int i15 = i12;
        if ((i15 & 2) != 0) {
            t11 = T.f5294d.a();
        } else {
            t11 = t10;
        }
        if ((i15 & 4) != 0) {
            i13 = b1.t.f19154a.a();
        } else {
            i13 = i10;
        }
        if ((i15 & 8) != 0) {
            z12 = true;
        } else {
            z12 = z10;
        }
        if ((i15 & 16) != 0) {
            i14 = a.e.API_PRIORITY_OTHER;
        } else {
            i14 = i11;
        }
        if ((i15 & 32) != 0) {
            list2 = C6565s.n();
        } else {
            list2 = list;
        }
        if ((i15 & 64) != 0) {
            j11 = c.b(0, 0, 0, 0, 15, (Object) null);
        } else {
            j11 = j10;
        }
        if ((i15 & 128) != 0) {
            tVar2 = n11.f5286c;
        } else {
            tVar2 = tVar;
        }
        if ((i15 & 256) != 0) {
            dVar3 = n11.f5285b;
        } else {
            dVar3 = dVar2;
        }
        if ((i15 & 512) != 0) {
            bVar2 = n11.f5284a;
        } else {
            bVar2 = bVar;
        }
        if ((i15 & 1024) != 0) {
            z13 = false;
        } else {
            z13 = z11;
        }
        return n10.c(dVar, t11, i13, z12, i14, list2, j11, tVar2, dVar3, bVar2, z13);
    }

    public final L a(String str, T t10, int i10, boolean z10, int i11, long j10, t tVar, d dVar, h.b bVar, boolean z11) {
        return d(this, new C1321d(str, (List) null, (List) null, 6, (DefaultConstructorMarker) null), t10, i10, z10, i11, (List) null, j10, tVar, dVar, bVar, z11, 32, (Object) null);
    }

    public final L c(C1321d dVar, T t10, int i10, boolean z10, int i11, List list, long j10, t tVar, d dVar2, h.b bVar, boolean z11) {
        L l10;
        J j11;
        K k10 = new K(dVar, t10, list, i11, z10, i10, dVar2, tVar, bVar, j10, (DefaultConstructorMarker) null);
        if (z11 || (j11 = this.f5288e) == null) {
            l10 = null;
        } else {
            l10 = j11.a(k10);
        }
        if (l10 != null) {
            return l10.a(k10, c.f(j10, s.a(C1337u.d(l10.w().A()), C1337u.d(l10.w().h()))));
        }
        L a10 = f5283f.b(k10);
        J j12 = this.f5288e;
        if (j12 == null) {
            return a10;
        }
        j12.b(k10, a10);
        return a10;
    }
}
