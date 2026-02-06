package E;

import Y.C1500m;
import Y.C1506p;
import Y.M0;
import Y.Y0;
import g0.c;
import h0.C2020d;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import yf.p;

/* renamed from: E.s  reason: case insensitive filesystem */
public abstract class C1149s {

    /* renamed from: E.s$a */
    static final class a extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C1150t f1682a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f1683b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Object f1684c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C1150t tVar, int i10, Object obj) {
            super(2);
            this.f1682a = tVar;
            this.f1683b = i10;
            this.f1684c = obj;
        }

        public final void a(C1500m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.i()) {
                if (C1506p.H()) {
                    C1506p.Q(980966366, i10, -1, "androidx.compose.foundation.lazy.layout.SkippableItem.<anonymous> (LazyLayoutItemContentFactory.kt:135)");
                }
                this.f1682a.e(this.f1683b, this.f1684c, mVar, 0);
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

    /* renamed from: E.s$b */
    static final class b extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C1150t f1685a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Object f1686b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f1687c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Object f1688d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f1689e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C1150t tVar, Object obj, int i10, Object obj2, int i11) {
            super(2);
            this.f1685a = tVar;
            this.f1686b = obj;
            this.f1687c = i10;
            this.f1688d = obj2;
            this.f1689e = i11;
        }

        public final void a(C1500m mVar, int i10) {
            C1149s.a(this.f1685a, this.f1686b, this.f1687c, this.f1688d, mVar, M0.a(this.f1689e | 1));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C1500m) obj, ((Number) obj2).intValue());
            return C6514M.f71813a;
        }
    }

    /* access modifiers changed from: private */
    public static final void a(C1150t tVar, Object obj, int i10, Object obj2, C1500m mVar, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        C1500m h10 = mVar.h(1439843069);
        if ((i11 & 6) == 0) {
            if (h10.S(tVar)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i12 = i16 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            if (h10.S(obj)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i12 |= i15;
        }
        if ((i11 & 384) == 0) {
            if (h10.d(i10)) {
                i14 = 256;
            } else {
                i14 = 128;
            }
            i12 |= i14;
        }
        if ((i11 & 3072) == 0) {
            if (h10.S(obj2)) {
                i13 = 2048;
            } else {
                i13 = 1024;
            }
            i12 |= i13;
        }
        if ((i12 & 1171) != 1170 || !h10.i()) {
            if (C1506p.H()) {
                C1506p.Q(1439843069, i12, -1, "androidx.compose.foundation.lazy.layout.SkippableItem (LazyLayoutItemContentFactory.kt:133)");
            }
            ((C2020d) obj).c(obj2, c.e(980966366, true, new a(tVar, i10, obj2), h10, 54), h10, 48);
            if (C1506p.H()) {
                C1506p.P();
            }
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new b(tVar, obj, i10, obj2, i11));
        }
    }
}
