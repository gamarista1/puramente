package androidx.compose.foundation.layout;

import H0.E;
import H0.F;
import H0.G;
import H0.H;
import H0.U;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.L;
import lf.C6514M;
import yf.C6798l;

final class e implements F {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final k0.c f12833a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f12834b;

    static final class b extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ U f12836a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ E f12837b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ H f12838c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f12839d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f12840e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ e f12841f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(U u10, E e10, H h10, int i10, int i11, e eVar) {
            super(1);
            this.f12836a = u10;
            this.f12837b = e10;
            this.f12838c = h10;
            this.f12839d = i10;
            this.f12840e = i11;
            this.f12841f = eVar;
        }

        public final void a(U.a aVar) {
            d.i(aVar, this.f12836a, this.f12837b, this.f12838c.getLayoutDirection(), this.f12839d, this.f12840e, this.f12841f.f12833a);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((U.a) obj);
            return C6514M.f71813a;
        }
    }

    static final class c extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ U[] f12842a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f12843b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ H f12844c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ L f12845d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ L f12846e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ e f12847f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(U[] uArr, List list, H h10, L l10, L l11, e eVar) {
            super(1);
            this.f12842a = uArr;
            this.f12843b = list;
            this.f12844c = h10;
            this.f12845d = l10;
            this.f12846e = l11;
            this.f12847f = eVar;
        }

        public final void a(U.a aVar) {
            U[] uArr = this.f12842a;
            List list = this.f12843b;
            H h10 = this.f12844c;
            L l10 = this.f12845d;
            L l11 = this.f12846e;
            e eVar = this.f12847f;
            int length = uArr.length;
            int i10 = 0;
            int i11 = 0;
            while (i10 < length) {
                U u10 = uArr[i10];
                C6496s.f(u10, "null cannot be cast to non-null type androidx.compose.ui.layout.Placeable");
                d.i(aVar, u10, (E) list.get(i11), h10.getLayoutDirection(), l10.f71757a, l11.f71757a, eVar.f12833a);
                i10++;
                i11++;
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((U.a) obj);
            return C6514M.f71813a;
        }
    }

    public e(k0.c cVar, boolean z10) {
        this.f12833a = cVar;
        this.f12834b = z10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return C6496s.c(this.f12833a, eVar.f12833a) && this.f12834b == eVar.f12834b;
    }

    public int hashCode() {
        return (this.f12833a.hashCode() * 31) + Boolean.hashCode(this.f12834b);
    }

    public G j(H h10, List list, long j10) {
        long j11;
        int i10;
        int i11;
        int n10;
        int m10;
        U v02;
        List list2 = list;
        if (list.isEmpty()) {
            return H.N(h10, c1.b.n(j10), c1.b.m(j10), (Map) null, a.f12835a, 4, (Object) null);
        }
        if (this.f12834b) {
            j11 = j10;
        } else {
            j11 = c1.b.d(j10, 0, 0, 0, 0, 10, (Object) null);
        }
        if (list.size() == 1) {
            E e10 = (E) list2.get(0);
            if (!d.g(e10)) {
                v02 = e10.v0(j11);
                n10 = Math.max(c1.b.n(j10), v02.X0());
                m10 = Math.max(c1.b.m(j10), v02.R0());
            } else {
                n10 = c1.b.n(j10);
                m10 = c1.b.m(j10);
                v02 = e10.v0(c1.b.f19206b.c(c1.b.n(j10), c1.b.m(j10)));
            }
            int i12 = n10;
            int i13 = m10;
            return H.N(h10, i12, i13, (Map) null, new b(v02, e10, h10, i12, i13, this), 4, (Object) null);
        }
        U[] uArr = new U[list.size()];
        L l10 = new L();
        l10.f71757a = c1.b.n(j10);
        L l11 = new L();
        l11.f71757a = c1.b.m(j10);
        int size = list.size();
        boolean z10 = false;
        for (int i14 = 0; i14 < size; i14++) {
            E e11 = (E) list2.get(i14);
            if (!d.g(e11)) {
                U v03 = e11.v0(j11);
                uArr[i14] = v03;
                l10.f71757a = Math.max(l10.f71757a, v03.X0());
                l11.f71757a = Math.max(l11.f71757a, v03.R0());
            } else {
                z10 = true;
            }
        }
        if (z10) {
            int i15 = l10.f71757a;
            if (i15 != Integer.MAX_VALUE) {
                i10 = i15;
            } else {
                i10 = 0;
            }
            int i16 = l11.f71757a;
            if (i16 != Integer.MAX_VALUE) {
                i11 = i16;
            } else {
                i11 = 0;
            }
            long a10 = c1.c.a(i10, i15, i11, i16);
            int size2 = list.size();
            for (int i17 = 0; i17 < size2; i17++) {
                E e12 = (E) list2.get(i17);
                if (d.g(e12)) {
                    uArr[i17] = e12.v0(a10);
                }
            }
        }
        return H.N(h10, l10.f71757a, l11.f71757a, (Map) null, new c(uArr, list, h10, l10, l11, this), 4, (Object) null);
    }

    public String toString() {
        return "BoxMeasurePolicy(alignment=" + this.f12833a + ", propagateMinConstraints=" + this.f12834b + ')';
    }

    static final class a extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final a f12835a = new a();

        a() {
            super(1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((U.a) obj);
            return C6514M.f71813a;
        }

        public final void a(U.a aVar) {
        }
    }
}
