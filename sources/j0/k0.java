package J0;

import a0.C1538b;
import java.util.Comparator;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class k0 {

    /* renamed from: c  reason: collision with root package name */
    public static final a f3887c = new a((DefaultConstructorMarker) null);

    /* renamed from: d  reason: collision with root package name */
    public static final int f3888d = 8;

    /* renamed from: a  reason: collision with root package name */
    private final C1538b f3889a = new C1538b(new G[16], 0);

    /* renamed from: b  reason: collision with root package name */
    private G[] f3890b;

    public static final class a {

        /* renamed from: J0.k0$a$a  reason: collision with other inner class name */
        private static final class C0087a implements Comparator {

            /* renamed from: a  reason: collision with root package name */
            public static final C0087a f3891a = new C0087a();

            private C0087a() {
            }

            /* renamed from: a */
            public int compare(G g10, G g11) {
                int i10 = C6496s.i(g11.L(), g10.L());
                if (i10 != 0) {
                    return i10;
                }
                return C6496s.i(g10.hashCode(), g11.hashCode());
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private final void b(G g10) {
        g10.A();
        int i10 = 0;
        g10.F1(false);
        C1538b v02 = g10.v0();
        int q10 = v02.q();
        if (q10 > 0) {
            Object[] p10 = v02.p();
            do {
                b((G) p10[i10]);
                i10++;
            } while (i10 < q10);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
        if (r2 < r0) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
            r4 = this;
            a0.b r0 = r4.f3889a
            J0.k0$a$a r1 = J0.k0.a.C0087a.f3891a
            r0.D(r1)
            a0.b r0 = r4.f3889a
            int r0 = r0.q()
            J0.G[] r1 = r4.f3890b
            if (r1 == 0) goto L_0x0014
            int r2 = r1.length
            if (r2 >= r0) goto L_0x0022
        L_0x0014:
            a0.b r1 = r4.f3889a
            int r1 = r1.q()
            r2 = 16
            int r1 = java.lang.Math.max(r2, r1)
            J0.G[] r1 = new J0.G[r1]
        L_0x0022:
            r2 = 0
            r4.f3890b = r2
            r2 = 0
        L_0x0026:
            if (r2 >= r0) goto L_0x0035
            a0.b r3 = r4.f3889a
            java.lang.Object[] r3 = r3.p()
            r3 = r3[r2]
            r1[r2] = r3
            int r2 = r2 + 1
            goto L_0x0026
        L_0x0035:
            a0.b r2 = r4.f3889a
            r2.i()
            int r0 = r0 + -1
        L_0x003c:
            r2 = -1
            if (r2 >= r0) goto L_0x0050
            r2 = r1[r0]
            kotlin.jvm.internal.C6496s.e(r2)
            boolean r3 = r2.i0()
            if (r3 == 0) goto L_0x004d
            r4.b(r2)
        L_0x004d:
            int r0 = r0 + -1
            goto L_0x003c
        L_0x0050:
            r4.f3890b = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: J0.k0.a():void");
    }

    public final boolean c() {
        return this.f3889a.t();
    }

    public final void d(G g10) {
        this.f3889a.b(g10);
        g10.F1(true);
    }

    public final void e(G g10) {
        this.f3889a.i();
        this.f3889a.b(g10);
        g10.F1(true);
    }

    public final void f(G g10) {
        this.f3889a.w(g10);
    }
}
