package C;

import H0.F;
import H0.G;
import H0.d0;
import H0.f0;
import Y.C1500m;
import Y.C1506p;
import Y.M0;
import Y.Y0;
import androidx.compose.foundation.layout.d;
import g0.c;
import k0.i;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import yf.p;
import yf.q;

/* renamed from: C.e  reason: case insensitive filesystem */
public abstract class C1087e {

    /* renamed from: C.e$a */
    static final class a extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ F f914a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ q f915b;

        /* renamed from: C.e$a$a  reason: collision with other inner class name */
        static final class C0009a extends C6498u implements p {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ q f916a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C1089g f917b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0009a(q qVar, C1089g gVar) {
                super(2);
                this.f916a = qVar;
                this.f917b = gVar;
            }

            public final void a(C1500m mVar, int i10) {
                if ((i10 & 3) != 2 || !mVar.i()) {
                    if (C1506p.H()) {
                        C1506p.Q(-1945019079, i10, -1, "androidx.compose.foundation.layout.BoxWithConstraints.<anonymous>.<anonymous>.<anonymous> (BoxWithConstraints.kt:68)");
                    }
                    this.f916a.invoke(this.f917b, mVar, 0);
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

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(F f10, q qVar) {
            super(2);
            this.f914a = f10;
            this.f915b = qVar;
        }

        public final G a(f0 f0Var, long j10) {
            return this.f914a.j(f0Var, f0Var.x1(C6514M.f71813a, c.c(-1945019079, true, new C0009a(this.f915b, new C1089g(f0Var, j10, (DefaultConstructorMarker) null)))), j10);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((f0) obj, ((c1.b) obj2).r());
        }
    }

    /* renamed from: C.e$b */
    static final class b extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f918a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ k0.c f919b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f920c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ q f921d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f922e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f923f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(i iVar, k0.c cVar, boolean z10, q qVar, int i10, int i11) {
            super(2);
            this.f918a = iVar;
            this.f919b = cVar;
            this.f920c = z10;
            this.f921d = qVar;
            this.f922e = i10;
            this.f923f = i11;
        }

        public final void a(C1500m mVar, int i10) {
            C1087e.a(this.f918a, this.f919b, this.f920c, this.f921d, mVar, M0.a(this.f922e | 1), this.f923f);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C1500m) obj, ((Number) obj2).intValue());
            return C6514M.f71813a;
        }
    }

    public static final void a(i iVar, k0.c cVar, boolean z10, q qVar, C1500m mVar, int i10, int i11) {
        int i12;
        boolean z11;
        int i13;
        int i14;
        int i15;
        int i16;
        C1500m h10 = mVar.h(1781813501);
        int i17 = i11 & 1;
        if (i17 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            if (h10.S(iVar)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i12 = i16 | i10;
        } else {
            i12 = i10;
        }
        int i18 = i11 & 2;
        if (i18 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            if (h10.S(cVar)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i12 |= i15;
        }
        int i19 = i11 & 4;
        if (i19 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            if (h10.b(z10)) {
                i14 = 256;
            } else {
                i14 = 128;
            }
            i12 |= i14;
        }
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            if (h10.C(qVar)) {
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
                cVar = k0.c.f23044a.o();
            }
            if (i19 != 0) {
                z10 = false;
            }
            if (C1506p.H()) {
                C1506p.Q(1781813501, i12, -1, "androidx.compose.foundation.layout.BoxWithConstraints (BoxWithConstraints.kt:64)");
            }
            F h11 = d.h(cVar, z10);
            if ((i12 & 7168) == 2048) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean S10 = z11 | h10.S(h11);
            Object A10 = h10.A();
            if (S10 || A10 == C1500m.f10026a.a()) {
                A10 = new a(h11, qVar);
                h10.r(A10);
            }
            d0.b(iVar, (p) A10, h10, i12 & 14, 0);
            if (C1506p.H()) {
                C1506p.P();
            }
        } else {
            h10.I();
        }
        i iVar2 = iVar;
        k0.c cVar2 = cVar;
        boolean z12 = z10;
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new b(iVar2, cVar2, z12, qVar, i10, i11));
        }
    }
}
