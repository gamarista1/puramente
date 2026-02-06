package F;

import E.C1135d;
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

final class k implements j {

    /* renamed from: a  reason: collision with root package name */
    private final E f1996a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C1173h f1997b;

    /* renamed from: c  reason: collision with root package name */
    private final c f1998c;

    static final class a extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k f1999a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f2000b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(k kVar, int i10) {
            super(2);
            this.f1999a = kVar;
            this.f2000b = i10;
        }

        public final void a(C1500m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.i()) {
                if (C1506p.H()) {
                    C1506p.Q(608834466, i10, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProviderImpl.Item.<anonymous> (LazyStaggeredGridItemProvider.kt:78)");
                }
                C1173h j10 = this.f1999a.f1997b;
                int i11 = this.f2000b;
                C1135d.a aVar = j10.g().get(i11);
                ((C1172g) aVar.c()).a().invoke(n.f2008a, Integer.valueOf(i11 - aVar.b()), mVar, 6);
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
        final /* synthetic */ k f2001a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f2002b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Object f2003c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f2004d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(k kVar, int i10, Object obj, int i11) {
            super(2);
            this.f2001a = kVar;
            this.f2002b = i10;
            this.f2003c = obj;
            this.f2004d = i11;
        }

        public final void a(C1500m mVar, int i10) {
            this.f2001a.e(this.f2002b, this.f2003c, mVar, M0.a(this.f2004d | 1));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C1500m) obj, ((Number) obj2).intValue());
            return C6514M.f71813a;
        }
    }

    public k(E e10, C1173h hVar, c cVar) {
        this.f1996a = e10;
        this.f1997b = hVar;
        this.f1998c = cVar;
    }

    public int a() {
        return this.f1997b.h();
    }

    public c b() {
        return this.f1998c;
    }

    public int c(Object obj) {
        return b().c(obj);
    }

    public Object d(int i10) {
        Object d10 = b().d(i10);
        if (d10 == null) {
            return this.f1997b.i(i10);
        }
        return d10;
    }

    public void e(int i10, Object obj, C1500m mVar, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        C1500m h10 = mVar.h(89098518);
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
                C1506p.Q(89098518, i12, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProviderImpl.Item (LazyStaggeredGridItemProvider.kt:76)");
            }
            D.a(obj, i10, this.f1996a.A(), g0.c.e(608834466, true, new a(this, i10), h10, 54), h10, ((i12 >> 3) & 14) | 3072 | ((i12 << 3) & 112));
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
        if (!(obj instanceof k)) {
            return false;
        }
        return C6496s.c(this.f1997b, ((k) obj).f1997b);
    }

    public Object f(int i10) {
        return this.f1997b.f(i10);
    }

    public D h() {
        return this.f1997b.k();
    }

    public int hashCode() {
        return this.f1997b.hashCode();
    }
}
