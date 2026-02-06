package E;

import H0.G;
import H0.d0;
import H0.e0;
import H0.f0;
import Y.A1;
import Y.C1500m;
import Y.C1506p;
import Y.L;
import Y.M;
import Y.M0;
import Y.P;
import Y.Y0;
import Y.p1;
import androidx.compose.foundation.lazy.layout.d;
import androidx.compose.foundation.lazy.layout.e;
import androidx.compose.foundation.lazy.layout.h;
import g0.c;
import h0.C2020d;
import k0.i;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import yf.C6787a;
import yf.C6798l;
import yf.p;
import yf.q;

public abstract class w {

    static final class a extends C6498u implements q {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f1692a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ i f1693b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ p f1694c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ A1 f1695d;

        /* renamed from: E.w$a$a  reason: collision with other inner class name */
        static final class C0028a extends C6498u implements C6798l {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ d f1696a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ r f1697b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ e0 f1698c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ Q f1699d;

            /* renamed from: E.w$a$a$a  reason: collision with other inner class name */
            public static final class C0029a implements L {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ d f1700a;

                public C0029a(d dVar) {
                    this.f1700a = dVar;
                }

                public void dispose() {
                    this.f1700a.f((h) null);
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0028a(d dVar, r rVar, e0 e0Var, Q q10) {
                super(1);
                this.f1696a = dVar;
                this.f1697b = rVar;
                this.f1698c = e0Var;
                this.f1699d = q10;
            }

            /* renamed from: a */
            public final L invoke(M m10) {
                this.f1696a.f(new h(this.f1697b, this.f1698c, this.f1699d));
                return new C0029a(this.f1696a);
            }
        }

        static final class b extends C6498u implements p {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ r f1701a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ p f1702b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(r rVar, p pVar) {
                super(2);
                this.f1701a = rVar;
                this.f1702b = pVar;
            }

            public final G a(f0 f0Var, long j10) {
                return (G) this.f1702b.invoke(new y(this.f1701a, f0Var), c1.b.a(j10));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return a((f0) obj, ((c1.b) obj2).r());
            }
        }

        static final class c extends C6498u implements C6787a {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ A1 f1703a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            c(A1 a12) {
                super(0);
                this.f1703a = a12;
            }

            /* renamed from: a */
            public final C1150t invoke() {
                return (C1150t) ((C6787a) this.f1703a.getValue()).invoke();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(d dVar, i iVar, p pVar, A1 a12) {
            super(3);
            this.f1692a = dVar;
            this.f1693b = iVar;
            this.f1694c = pVar;
            this.f1695d = a12;
        }

        public final void a(C2020d dVar, C1500m mVar, int i10) {
            if (C1506p.H()) {
                C1506p.Q(-1488997347, i10, -1, "androidx.compose.foundation.lazy.layout.LazyLayout.<anonymous> (LazyLayout.kt:82)");
            }
            A1 a12 = this.f1695d;
            Object A10 = mVar.A();
            C1500m.a aVar = C1500m.f10026a;
            if (A10 == aVar.a()) {
                A10 = new r(dVar, new c(a12));
                mVar.r(A10);
            }
            r rVar = (r) A10;
            Object A11 = mVar.A();
            if (A11 == aVar.a()) {
                A11 = new e0(new v(rVar));
                mVar.r(A11);
            }
            e0 e0Var = (e0) A11;
            if (this.f1692a != null) {
                mVar.T(205264983);
                Q d10 = this.f1692a.d();
                if (d10 == null) {
                    mVar.T(6622915);
                    d10 = S.a(mVar, 0);
                } else {
                    mVar.T(6621830);
                }
                mVar.M();
                Object[] objArr = {this.f1692a, rVar, e0Var, d10};
                boolean S10 = mVar.S(this.f1692a) | mVar.C(rVar) | mVar.C(e0Var) | mVar.C(d10);
                d dVar2 = this.f1692a;
                Object A12 = mVar.A();
                if (S10 || A12 == aVar.a()) {
                    A12 = new C0028a(dVar2, rVar, e0Var, d10);
                    mVar.r(A12);
                }
                P.d(objArr, (C6798l) A12, mVar, 0);
                mVar.M();
            } else {
                mVar.T(205858881);
                mVar.M();
            }
            i b10 = e.b(this.f1693b, this.f1692a);
            boolean S11 = mVar.S(rVar) | mVar.S(this.f1694c);
            p pVar = this.f1694c;
            Object A13 = mVar.A();
            if (S11 || A13 == aVar.a()) {
                A13 = new b(rVar, pVar);
                mVar.r(A13);
            }
            d0.a(e0Var, b10, (p) A13, mVar, e0.f2594f, 0);
            if (C1506p.H()) {
                C1506p.P();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((C2020d) obj, (C1500m) obj2, ((Number) obj3).intValue());
            return C6514M.f71813a;
        }
    }

    static final class b extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C6787a f1704a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ i f1705b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ d f1706c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ p f1707d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f1708e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f1709f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C6787a aVar, i iVar, d dVar, p pVar, int i10, int i11) {
            super(2);
            this.f1704a = aVar;
            this.f1705b = iVar;
            this.f1706c = dVar;
            this.f1707d = pVar;
            this.f1708e = i10;
            this.f1709f = i11;
        }

        public final void a(C1500m mVar, int i10) {
            w.a(this.f1704a, this.f1705b, this.f1706c, this.f1707d, mVar, M0.a(this.f1708e | 1), this.f1709f);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C1500m) obj, ((Number) obj2).intValue());
            return C6514M.f71813a;
        }
    }

    public static final void a(C6787a aVar, i iVar, d dVar, p pVar, C1500m mVar, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        C1500m h10 = mVar.h(2002163445);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            if (h10.C(aVar)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i12 = i16 | i10;
        } else {
            i12 = i10;
        }
        int i17 = i11 & 2;
        if (i17 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            if (h10.S(iVar)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i12 |= i15;
        }
        int i18 = i11 & 4;
        if (i18 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            if (h10.S(dVar)) {
                i14 = 256;
            } else {
                i14 = 128;
            }
            i12 |= i14;
        }
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            if (h10.C(pVar)) {
                i13 = 2048;
            } else {
                i13 = 1024;
            }
            i12 |= i13;
        }
        if ((i12 & 1171) != 1170 || !h10.i()) {
            if (i17 != 0) {
                iVar = i.f23074a;
            }
            if (i18 != 0) {
                dVar = null;
            }
            if (C1506p.H()) {
                C1506p.Q(2002163445, i12, -1, "androidx.compose.foundation.lazy.layout.LazyLayout (LazyLayout.kt:78)");
            }
            H.a(c.e(-1488997347, true, new a(dVar, iVar, pVar, p1.o(aVar, h10, i12 & 14)), h10, 54), h10, 6);
            if (C1506p.H()) {
                C1506p.P();
            }
        } else {
            h10.I();
        }
        i iVar2 = iVar;
        d dVar2 = dVar;
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new b(aVar, iVar2, dVar2, pVar, i10, i11));
        }
    }
}
