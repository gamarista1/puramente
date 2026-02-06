package J;

import Ef.m;
import H0.E;
import H0.G;
import H0.H;
import H0.U;
import Q0.T;
import Y.A1;
import Y.C1500m;
import c1.b;
import c1.r;
import java.util.Map;
import k0.h;
import k0.i;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import yf.C6798l;
import yf.q;

public abstract class Y {

    static final class a extends C6498u implements q {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ T f2994a;

        /* renamed from: J.Y$a$a  reason: collision with other inner class name */
        static final class C0062a extends C6498u implements q {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ X f2995a;

            /* renamed from: J.Y$a$a$a  reason: collision with other inner class name */
            static final class C0063a extends C6498u implements C6798l {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ U f2996a;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C0063a(U u10) {
                    super(1);
                    this.f2996a = u10;
                }

                public final void a(U.a aVar) {
                    U.a.l(aVar, this.f2996a, 0, 0, 0.0f, 4, (Object) null);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    a((U.a) obj);
                    return C6514M.f71813a;
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0062a(X x10) {
                super(3);
                this.f2995a = x10;
            }

            public final G a(H h10, E e10, long j10) {
                long b10 = this.f2995a.b();
                E e11 = e10;
                U v02 = e11.v0(b.d(j10, m.l(r.g(b10), b.n(j10), b.l(j10)), 0, m.l(r.f(b10), b.m(j10), b.k(j10)), 0, 10, (Object) null));
                return H.N(h10, v02.X0(), v02.R0(), (Map) null, new C0063a(v02), 4, (Object) null);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return a((H) obj, (E) obj2, ((b) obj3).r());
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(T t10) {
            super(3);
            this.f2994a = t10;
        }

        private static final Object b(A1 a12) {
            return a12.getValue();
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: Q0.T} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: Y.A1} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v22, resolved type: J.X} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final k0.i a(k0.i r12, Y.C1500m r13, int r14) {
            /*
                r11 = this;
                r12 = 1582736677(0x5e56a525, float:3.86670229E18)
                r13.T(r12)
                boolean r0 = Y.C1506p.H()
                if (r0 == 0) goto L_0x0012
                r0 = -1
                java.lang.String r1 = "androidx.compose.foundation.text.textFieldMinSize.<anonymous> (TextFieldSize.kt:37)"
                Y.C1506p.Q(r12, r14, r0, r1)
            L_0x0012:
                Y.I0 r12 = androidx.compose.ui.platform.C1644k0.e()
                java.lang.Object r12 = r13.m(r12)
                c1.d r12 = (c1.d) r12
                Y.I0 r14 = androidx.compose.ui.platform.C1644k0.g()
                java.lang.Object r14 = r13.m(r14)
                V0.h$b r14 = (V0.h.b) r14
                Y.I0 r0 = androidx.compose.ui.platform.C1644k0.k()
                java.lang.Object r0 = r13.m(r0)
                r6 = r0
                c1.t r6 = (c1.t) r6
                Q0.T r0 = r11.f2994a
                boolean r0 = r13.S(r0)
                boolean r1 = r13.S(r6)
                r0 = r0 | r1
                Q0.T r1 = r11.f2994a
                java.lang.Object r2 = r13.A()
                if (r0 != 0) goto L_0x004c
                Y.m$a r0 = Y.C1500m.f10026a
                java.lang.Object r0 = r0.a()
                if (r2 != r0) goto L_0x0053
            L_0x004c:
                Q0.T r2 = Q0.U.d(r1, r6)
                r13.r(r2)
            L_0x0053:
                r7 = r2
                Q0.T r7 = (Q0.T) r7
                boolean r0 = r13.S(r14)
                boolean r1 = r13.S(r7)
                r0 = r0 | r1
                java.lang.Object r1 = r13.A()
                if (r0 != 0) goto L_0x006d
                Y.m$a r0 = Y.C1500m.f10026a
                java.lang.Object r0 = r0.a()
                if (r1 != r0) goto L_0x00a6
            L_0x006d:
                V0.h r0 = r7.j()
                V0.p r1 = r7.o()
                if (r1 != 0) goto L_0x007d
                V0.p$a r1 = V0.p.f8210b
                V0.p r1 = r1.c()
            L_0x007d:
                V0.n r2 = r7.m()
                if (r2 == 0) goto L_0x0088
                int r2 = r2.i()
                goto L_0x008e
            L_0x0088:
                V0.n$a r2 = V0.n.f8200b
                int r2 = r2.b()
            L_0x008e:
                V0.o r3 = r7.n()
                if (r3 == 0) goto L_0x0099
                int r3 = r3.k()
                goto L_0x009f
            L_0x0099:
                V0.o$a r3 = V0.o.f8204b
                int r3 = r3.a()
            L_0x009f:
                Y.A1 r1 = r14.b(r0, r1, r2, r3)
                r13.r(r1)
            L_0x00a6:
                r8 = r1
                Y.A1 r8 = (Y.A1) r8
                Q0.T r4 = r11.f2994a
                java.lang.Object r0 = r13.A()
                Y.m$a r9 = Y.C1500m.f10026a
                java.lang.Object r1 = r9.a()
                if (r0 != r1) goto L_0x00c7
                J.X r10 = new J.X
                java.lang.Object r5 = b(r8)
                r0 = r10
                r1 = r6
                r2 = r12
                r3 = r14
                r0.<init>(r1, r2, r3, r4, r5)
                r13.r(r10)
            L_0x00c7:
                r10 = r0
                J.X r10 = (J.X) r10
                java.lang.Object r5 = b(r8)
                r0 = r10
                r1 = r6
                r2 = r12
                r3 = r14
                r4 = r7
                r0.c(r1, r2, r3, r4, r5)
                k0.i$a r12 = k0.i.f23074a
                boolean r14 = r13.C(r10)
                java.lang.Object r0 = r13.A()
                if (r14 != 0) goto L_0x00e8
                java.lang.Object r14 = r9.a()
                if (r0 != r14) goto L_0x00f0
            L_0x00e8:
                J.Y$a$a r0 = new J.Y$a$a
                r0.<init>(r10)
                r13.r(r0)
            L_0x00f0:
                yf.q r0 = (yf.q) r0
                k0.i r12 = androidx.compose.ui.layout.b.a(r12, r0)
                boolean r14 = Y.C1506p.H()
                if (r14 == 0) goto L_0x00ff
                Y.C1506p.P()
            L_0x00ff:
                r13.M()
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: J.Y.a.a(k0.i, Y.m, int):k0.i");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a((i) obj, (C1500m) obj2, ((Number) obj3).intValue());
        }
    }

    public static final i a(i iVar, T t10) {
        return h.c(iVar, (C6798l) null, new a(t10), 1, (Object) null);
    }
}
