package G;

import E.C1135d;
import E.C1146o;
import E.C1150t;
import E.D;
import Y.C1500m;
import Y.C1506p;
import Y.M0;
import Y.Y0;
import androidx.compose.foundation.lazy.layout.c;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import yf.p;

public final class r implements C1150t {

    /* renamed from: a  reason: collision with root package name */
    private final C f2358a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C1146o f2359b;

    /* renamed from: c  reason: collision with root package name */
    private final c f2360c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final w f2361d = w.f2426a;

    static final class a extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r f2362a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f2363b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(r rVar, int i10) {
            super(2);
            this.f2362a = rVar;
            this.f2363b = i10;
        }

        public final void a(C1500m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.i()) {
                if (C1506p.H()) {
                    C1506p.Q(1142237095, i10, -1, "androidx.compose.foundation.pager.PagerLazyLayoutItemProvider.Item.<anonymous> (LazyLayoutPager.kt:208)");
                }
                C1146o j10 = this.f2362a.f2359b;
                int i11 = this.f2363b;
                r rVar = this.f2362a;
                C1135d.a aVar = j10.g().get(i11);
                ((l) aVar.c()).a().invoke(rVar.f2361d, Integer.valueOf(i11 - aVar.b()), mVar, 0);
                if (C1506p.H()) {
                    C1506p.P();
                    return;
                }
                return;
            }
            mVar.I();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C1500m) obj, ((Number) obj2).intValue());
            return C6514M.f71813a;
        }
    }

    static final class b extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r f2364a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f2365b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Object f2366c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f2367d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(r rVar, int i10, Object obj, int i11) {
            super(2);
            this.f2364a = rVar;
            this.f2365b = i10;
            this.f2366c = obj;
            this.f2367d = i11;
        }

        public final void a(C1500m mVar, int i10) {
            this.f2364a.e(this.f2365b, this.f2366c, mVar, M0.a(this.f2367d | 1));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C1500m) obj, ((Number) obj2).intValue());
            return C6514M.f71813a;
        }
    }

    public r(C c10, C1146o oVar, c cVar) {
        this.f2358a = c10;
        this.f2359b = oVar;
        this.f2360c = cVar;
    }

    public int a() {
        return this.f2359b.h();
    }

    public int c(Object obj) {
        return this.f2360c.c(obj);
    }

    public Object d(int i10) {
        Object d10 = this.f2360c.d(i10);
        if (d10 == null) {
            return this.f2359b.i(i10);
        }
        return d10;
    }

    public void e(int i10, Object obj, C1500m mVar, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        C1500m h10 = mVar.h(-1201380429);
        if ((i11 & 6) == 0) {
            if (h10.d(i10)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i12 = i15 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            if (h10.C(obj)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        if ((i11 & 384) == 0) {
            if (h10.S(this)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i12 |= i13;
        }
        if ((i12 & 147) != 146 || !h10.i()) {
            if (C1506p.H()) {
                C1506p.Q(-1201380429, i12, -1, "androidx.compose.foundation.pager.PagerLazyLayoutItemProvider.Item (LazyLayoutPager.kt:206)");
            }
            D.a(obj, i10, this.f2358a.J(), g0.c.e(1142237095, true, new a(this, i10), h10, 54), h10, ((i12 >> 3) & 14) | 3072 | ((i12 << 3) & 112));
            if (C1506p.H()) {
                C1506p.P();
            }
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new b(this, i10, obj, i11));
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        return C6496s.c(this.f2359b, ((r) obj).f2359b);
    }

    public int hashCode() {
        return this.f2359b.hashCode();
    }
}
