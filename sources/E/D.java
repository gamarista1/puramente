package E;

import H0.S;
import H0.T;
import Y.C1500m;
import Y.C1506p;
import Y.C1521x;
import Y.J0;
import Y.L;
import Y.M;
import Y.M0;
import Y.P;
import Y.Y0;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import yf.C6798l;
import yf.p;

public abstract class D {

    static final class a extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C f1549a;

        /* renamed from: E.D$a$a  reason: collision with other inner class name */
        public static final class C0020a implements L {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C f1550a;

            public C0020a(C c10) {
                this.f1550a = c10;
            }

            public void dispose() {
                this.f1550a.f();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C c10) {
            super(1);
            this.f1549a = c10;
        }

        /* renamed from: a */
        public final L invoke(M m10) {
            return new C0020a(this.f1549a);
        }
    }

    static final class b extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Object f1551a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f1552b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ E f1553c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ p f1554d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f1555e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(Object obj, int i10, E e10, p pVar, int i11) {
            super(2);
            this.f1551a = obj;
            this.f1552b = i10;
            this.f1553c = e10;
            this.f1554d = pVar;
            this.f1555e = i11;
        }

        public final void a(C1500m mVar, int i10) {
            D.a(this.f1551a, this.f1552b, this.f1553c, this.f1554d, mVar, M0.a(this.f1555e | 1));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C1500m) obj, ((Number) obj2).intValue());
            return C6514M.f71813a;
        }
    }

    public static final void a(Object obj, int i10, E e10, p pVar, C1500m mVar, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        C1500m h10 = mVar.h(-2079116560);
        if ((i11 & 6) == 0) {
            if (h10.C(obj)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i12 = i16 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            if (h10.d(i10)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i12 |= i15;
        }
        if ((i11 & 384) == 0) {
            if (h10.C(e10)) {
                i14 = 256;
            } else {
                i14 = 128;
            }
            i12 |= i14;
        }
        if ((i11 & 3072) == 0) {
            if (h10.C(pVar)) {
                i13 = 2048;
            } else {
                i13 = 1024;
            }
            i12 |= i13;
        }
        if ((i12 & 1171) != 1170 || !h10.i()) {
            if (C1506p.H()) {
                C1506p.Q(-2079116560, i12, -1, "androidx.compose.foundation.lazy.layout.LazyLayoutPinnableItem (LazyLayoutPinnableItem.kt:52)");
            }
            boolean S10 = h10.S(obj) | h10.S(e10);
            Object A10 = h10.A();
            if (S10 || A10 == C1500m.f10026a.a()) {
                A10 = new C(obj, e10);
                h10.r(A10);
            }
            C c10 = (C) A10;
            c10.g(i10);
            c10.i((S) h10.m(T.a()));
            boolean S11 = h10.S(c10);
            Object A11 = h10.A();
            if (S11 || A11 == C1500m.f10026a.a()) {
                A11 = new a(c10);
                h10.r(A11);
            }
            P.c(c10, (C6798l) A11, h10, 0);
            C1521x.a(T.a().d(c10), pVar, h10, ((i12 >> 6) & 112) | J0.f9784i);
            if (C1506p.H()) {
                C1506p.P();
            }
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new b(obj, i10, e10, pVar, i11));
        }
    }
}
