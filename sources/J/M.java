package J;

import H0.C1197s;
import H0.C1198t;
import P.A;
import Q0.C;
import Q0.C1321d;
import Q0.L;
import Q0.P;
import Q0.Q;
import Q0.S;
import Q0.z;
import V0.h;
import V0.n;
import V0.o;
import V0.p;
import W0.C1443k;
import W0.C1450s;
import W0.I;
import W0.T;
import W0.Z;
import W0.a0;
import X0.e;
import b1.C1869a;
import b1.k;
import c1.r;
import c1.t;
import java.util.List;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.N;
import lf.C6514M;
import q0.C2421g;
import q0.C2422h;
import q0.C2423i;
import q0.C2424j;
import q0.C2428n;
import r0.C2520p0;
import r0.C2544x0;
import r0.M1;
import r0.Q1;
import r0.e2;
import t0.C2606g;
import yf.C6798l;

public abstract class M {

    /* renamed from: a  reason: collision with root package name */
    public static final a f2895a = new a((DefaultConstructorMarker) null);

    public static final class a {

        /* renamed from: J.M$a$a  reason: collision with other inner class name */
        static final class C0052a extends C6498u implements C6798l {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C1443k f2896a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C6798l f2897b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ N f2898c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0052a(C1443k kVar, C6798l lVar, N n10) {
                super(1);
                this.f2896a = kVar;
                this.f2897b = lVar;
                this.f2898c = n10;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((List) obj);
                return C6514M.f71813a;
            }

            public final void invoke(List list) {
                M.f2895a.g(list, this.f2896a, this.f2897b, (Z) this.f2898c.f71759a);
            }
        }

        static final class b extends C6498u implements C6798l {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C1197s f2899a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(C1197s sVar) {
                super(1);
                this.f2899a = sVar;
            }

            public final void a(float[] fArr) {
                if (this.f2899a.G()) {
                    C1198t.d(this.f2899a).O(this.f2899a, fArr);
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a(((M1) obj).r());
                return C6514M.f71813a;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final void c(C2520p0 p0Var, long j10, I i10, L l10, Q1 q12) {
            int b10 = i10.b(Q.l(j10));
            int b11 = i10.b(Q.k(j10));
            if (b10 != b11) {
                p0Var.k(l10.z(b10, b11), q12);
            }
        }

        public final a0 a(long j10, a0 a0Var) {
            int b10 = a0Var.a().b(Q.n(j10));
            int b11 = a0Var.a().b(Q.i(j10));
            int min = Math.min(b10, b11);
            int max = Math.max(b10, b11);
            C1321d.a aVar = new C1321d.a(a0Var.b());
            aVar.b(new C(0, 0, (p) null, (n) null, (o) null, (h) null, (String) null, 0, (C1869a) null, (b1.o) null, (e) null, 0, k.f19119b.d(), (e2) null, (z) null, (C2606g) null, 61439, (DefaultConstructorMarker) null), min, max);
            return new a0(aVar.n(), a0Var.a());
        }

        public final void b(C2520p0 p0Var, W0.Q q10, long j10, long j11, I i10, L l10, Q1 q12, long j12) {
            long a10;
            if (!Q.h(j10)) {
                q12.m(j12);
                c(p0Var, j10, i10, l10, q12);
            } else if (!Q.h(j11)) {
                C2544x0 k10 = C2544x0.k(l10.l().i().h());
                if (k10.y() == 16) {
                    k10 = null;
                }
                if (k10 != null) {
                    a10 = k10.y();
                } else {
                    a10 = C2544x0.f25560b.a();
                }
                long j13 = a10;
                Q1 q13 = q12;
                q13.m(C2544x0.o(j13, C2544x0.r(j13) * 0.2f, 0.0f, 0.0f, 0.0f, 14, (Object) null));
                c(p0Var, j11, i10, l10, q13);
            } else {
                Q1 q14 = q12;
                if (!Q.h(q10.g())) {
                    q12.m(j12);
                    c(p0Var, q10.g(), i10, l10, q12);
                }
            }
            C2520p0 p0Var2 = p0Var;
            P.f5290a.a(p0Var, l10);
        }

        public final lf.z d(I i10, long j10, t tVar, L l10) {
            L l11 = i10.l(j10, tVar, l10);
            return new lf.z(Integer.valueOf(r.g(l11.B())), Integer.valueOf(r.f(l11.B())), l11);
        }

        public final void e(W0.Q q10, I i10, L l10, C1197s sVar, Z z10, boolean z11, I i11) {
            C2423i iVar;
            if (z11) {
                int b10 = i11.b(Q.k(q10.g()));
                if (b10 < l10.l().j().length()) {
                    iVar = l10.d(b10);
                } else if (b10 != 0) {
                    iVar = l10.d(b10 - 1);
                } else {
                    iVar = new C2423i(0.0f, 0.0f, 1.0f, (float) r.f(N.b(i10.j(), i10.a(), i10.b(), (String) null, 0, 24, (Object) null)));
                }
                long H02 = sVar.H0(C2422h.a(iVar.i(), iVar.l()));
                z10.c(C2424j.b(C2422h.a(C2421g.m(H02), C2421g.n(H02)), C2428n.a(iVar.n(), iVar.h())));
            }
        }

        public final void f(Z z10, C1443k kVar, C6798l lVar) {
            lVar.invoke(W0.Q.c(kVar.f(), (C1321d) null, 0, (Q) null, 3, (Object) null));
            z10.a();
        }

        public final void g(List list, C1443k kVar, C6798l lVar, Z z10) {
            W0.Q b10 = kVar.b(list);
            if (z10 != null) {
                z10.d((W0.Q) null, b10);
            }
            lVar.invoke(b10);
        }

        public final Z h(T t10, W0.Q q10, C1443k kVar, C1450s sVar, C6798l lVar, C6798l lVar2) {
            return i(t10, q10, kVar, sVar, lVar, lVar2);
        }

        public final Z i(T t10, W0.Q q10, C1443k kVar, C1450s sVar, C6798l lVar, C6798l lVar2) {
            N n10 = new N();
            Z d10 = t10.d(q10, sVar, new C0052a(kVar, lVar, n10), lVar2);
            n10.f71759a = d10;
            return d10;
        }

        public final void j(long j10, a0 a0Var, C1443k kVar, I i10, C6798l lVar) {
            lVar.invoke(W0.Q.c(kVar.f(), (C1321d) null, S.a(i10.a(a0.e(a0Var, j10, false, 2, (Object) null))), (Q) null, 5, (Object) null));
        }

        public final void k(Z z10, W0.Q q10, I i10, a0 a0Var) {
            C1197s b10;
            C1197s c10 = a0Var.c();
            if (c10 != null && c10.G() && (b10 = a0Var.b()) != null) {
                z10.e(q10, i10, a0Var.f(), new b(c10), A.b(c10), c10.b0(b10, false));
            }
        }

        private a() {
        }
    }
}
