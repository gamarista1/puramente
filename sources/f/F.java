package F;

import kotlin.jvm.internal.C6498u;
import yf.C6787a;

public abstract class F {

    static final class a extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f1966a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f1967b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(int i10, int i11) {
            super(0);
            this.f1966a = i10;
            this.f1967b = i11;
        }

        /* renamed from: a */
        public final E invoke() {
            return new E(this.f1966a, this.f1967b);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: yf.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final F.E a(int r10, int r11, Y.C1500m r12, int r13, int r14) {
        /*
            r0 = r14 & 1
            r1 = 0
            if (r0 == 0) goto L_0x0006
            r10 = r1
        L_0x0006:
            r14 = r14 & 2
            if (r14 == 0) goto L_0x000b
            r11 = r1
        L_0x000b:
            boolean r14 = Y.C1506p.H()
            if (r14 == 0) goto L_0x001a
            r14 = -1
            java.lang.String r0 = "androidx.compose.foundation.lazy.staggeredgrid.rememberLazyStaggeredGridState (LazyStaggeredGridState.kt:73)"
            r2 = 161145796(0x99ae3c4, float:3.728834E-33)
            Y.C1506p.Q(r2, r13, r14, r0)
        L_0x001a:
            java.lang.Object[] r3 = new java.lang.Object[r1]
            F.E$c r14 = F.E.f1927w
            h0.j r4 = r14.a()
            r14 = r13 & 14
            r14 = r14 ^ 6
            r0 = 4
            r2 = 1
            if (r14 <= r0) goto L_0x0030
            boolean r14 = r12.d(r10)
            if (r14 != 0) goto L_0x0034
        L_0x0030:
            r14 = r13 & 6
            if (r14 != r0) goto L_0x0036
        L_0x0034:
            r14 = r2
            goto L_0x0037
        L_0x0036:
            r14 = r1
        L_0x0037:
            r0 = r13 & 112(0x70, float:1.57E-43)
            r0 = r0 ^ 48
            r5 = 32
            if (r0 <= r5) goto L_0x0045
            boolean r0 = r12.d(r11)
            if (r0 != 0) goto L_0x0049
        L_0x0045:
            r13 = r13 & 48
            if (r13 != r5) goto L_0x004a
        L_0x0049:
            r1 = r2
        L_0x004a:
            r13 = r14 | r1
            java.lang.Object r14 = r12.A()
            if (r13 != 0) goto L_0x005a
            Y.m$a r13 = Y.C1500m.f10026a
            java.lang.Object r13 = r13.a()
            if (r14 != r13) goto L_0x0062
        L_0x005a:
            F.F$a r14 = new F.F$a
            r14.<init>(r10, r11)
            r12.r(r14)
        L_0x0062:
            r6 = r14
            yf.a r6 = (yf.C6787a) r6
            r8 = 0
            r9 = 4
            r5 = 0
            r7 = r12
            java.lang.Object r10 = h0.C2018b.e(r3, r4, r5, r6, r7, r8, r9)
            F.E r10 = (F.E) r10
            boolean r11 = Y.C1506p.H()
            if (r11 == 0) goto L_0x0078
            Y.C1506p.P()
        L_0x0078:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: F.F.a(int, int, Y.m, int, int):F.E");
    }
}
