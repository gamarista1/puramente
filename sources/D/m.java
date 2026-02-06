package D;

import E.C1135d;
import E.D;
import Y.C1500m;
import Y.C1506p;
import Y.M0;
import Y.Y0;
import androidx.compose.foundation.lazy.layout.c;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import yf.p;

final class m implements l {

    /* renamed from: a  reason: collision with root package name */
    private final A f1243a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final j f1244b;

    /* renamed from: c  reason: collision with root package name */
    private final androidx.compose.foundation.lazy.a f1245c;

    /* renamed from: d  reason: collision with root package name */
    private final c f1246d;

    static final class a extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m f1247a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f1248b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(m mVar, int i10) {
            super(2);
            this.f1247a = mVar;
            this.f1248b = i10;
        }

        public final void a(C1500m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.i()) {
                if (C1506p.H()) {
                    C1506p.Q(-824725566, i10, -1, "androidx.compose.foundation.lazy.LazyListItemProviderImpl.Item.<anonymous> (LazyListItemProvider.kt:77)");
                }
                j j10 = this.f1247a.f1244b;
                int i11 = this.f1248b;
                m mVar2 = this.f1247a;
                C1135d.a aVar = j10.g().get(i11);
                ((i) aVar.c()).a().invoke(mVar2.g(), Integer.valueOf(i11 - aVar.b()), mVar, 0);
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
        final /* synthetic */ m f1249a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f1250b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Object f1251c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f1252d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(m mVar, int i10, Object obj, int i11) {
            super(2);
            this.f1249a = mVar;
            this.f1250b = i10;
            this.f1251c = obj;
            this.f1252d = i11;
        }

        public final void a(C1500m mVar, int i10) {
            this.f1249a.e(this.f1250b, this.f1251c, mVar, M0.a(this.f1252d | 1));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C1500m) obj, ((Number) obj2).intValue());
            return C6514M.f71813a;
        }
    }

    public m(A a10, j jVar, androidx.compose.foundation.lazy.a aVar, c cVar) {
        this.f1243a = a10;
        this.f1244b = jVar;
        this.f1245c = aVar;
        this.f1246d = cVar;
    }

    public int a() {
        return this.f1244b.h();
    }

    public c b() {
        return this.f1246d;
    }

    public int c(Object obj) {
        return b().c(obj);
    }

    public Object d(int i10) {
        Object d10 = b().d(i10);
        if (d10 == null) {
            return this.f1244b.i(i10);
        }
        return d10;
    }

    public void e(int i10, Object obj, C1500m mVar, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        C1500m h10 = mVar.h(-462424778);
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
                C1506p.Q(-462424778, i12, -1, "androidx.compose.foundation.lazy.LazyListItemProviderImpl.Item (LazyListItemProvider.kt:75)");
            }
            D.a(obj, i10, this.f1243a.A(), g0.c.e(-824725566, true, new a(this, i10), h10, 54), h10, ((i12 >> 3) & 14) | 3072 | ((i12 << 3) & 112));
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
        if (!(obj instanceof m)) {
            return false;
        }
        return C6496s.c(this.f1244b, ((m) obj).f1244b);
    }

    public Object f(int i10) {
        return this.f1244b.f(i10);
    }

    public androidx.compose.foundation.lazy.a g() {
        return this.f1245c;
    }

    public int hashCode() {
        return this.f1244b.hashCode();
    }

    public List i() {
        return this.f1244b.j();
    }
}
