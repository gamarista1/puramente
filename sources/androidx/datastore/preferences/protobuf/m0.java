package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.s0;
import java.util.Arrays;

public final class m0 {

    /* renamed from: f  reason: collision with root package name */
    private static final m0 f16399f = new m0(0, new int[0], new Object[0], false);

    /* renamed from: a  reason: collision with root package name */
    private int f16400a;

    /* renamed from: b  reason: collision with root package name */
    private int[] f16401b;

    /* renamed from: c  reason: collision with root package name */
    private Object[] f16402c;

    /* renamed from: d  reason: collision with root package name */
    private int f16403d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f16404e;

    private m0() {
        this(0, new int[8], new Object[8], true);
    }

    private void b() {
        int i10;
        int i11 = this.f16400a;
        int[] iArr = this.f16401b;
        if (i11 == iArr.length) {
            if (i11 < 4) {
                i10 = 8;
            } else {
                i10 = i11 >> 1;
            }
            int i12 = i11 + i10;
            this.f16401b = Arrays.copyOf(iArr, i12);
            this.f16402c = Arrays.copyOf(this.f16402c, i12);
        }
    }

    private static boolean c(int[] iArr, int[] iArr2, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (iArr[i11] != iArr2[i11]) {
                return false;
            }
        }
        return true;
    }

    private static boolean d(Object[] objArr, Object[] objArr2, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (!objArr[i11].equals(objArr2[i11])) {
                return false;
            }
        }
        return true;
    }

    public static m0 e() {
        return f16399f;
    }

    private static int h(int[] iArr, int i10) {
        int i11 = 17;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 = (i11 * 31) + iArr[i12];
        }
        return i11;
    }

    private static int i(Object[] objArr, int i10) {
        int i11 = 17;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 = (i11 * 31) + objArr[i12].hashCode();
        }
        return i11;
    }

    static m0 k(m0 m0Var, m0 m0Var2) {
        int i10 = m0Var.f16400a + m0Var2.f16400a;
        int[] copyOf = Arrays.copyOf(m0Var.f16401b, i10);
        System.arraycopy(m0Var2.f16401b, 0, copyOf, m0Var.f16400a, m0Var2.f16400a);
        Object[] copyOf2 = Arrays.copyOf(m0Var.f16402c, i10);
        System.arraycopy(m0Var2.f16402c, 0, copyOf2, m0Var.f16400a, m0Var2.f16400a);
        return new m0(i10, copyOf, copyOf2, true);
    }

    static m0 l() {
        return new m0();
    }

    private static void p(int i10, Object obj, s0 s0Var) {
        int a10 = r0.a(i10);
        int b10 = r0.b(i10);
        if (b10 == 0) {
            s0Var.u(a10, ((Long) obj).longValue());
        } else if (b10 == 1) {
            s0Var.s(a10, ((Long) obj).longValue());
        } else if (b10 == 2) {
            s0Var.K(a10, (C1734g) obj);
        } else if (b10 != 3) {
            if (b10 == 5) {
                s0Var.c(a10, ((Integer) obj).intValue());
                return;
            }
            throw new RuntimeException(C1752z.d());
        } else if (s0Var.t() == s0.a.ASCENDING) {
            s0Var.x(a10);
            ((m0) obj).q(s0Var);
            s0Var.C(a10);
        } else {
            s0Var.C(a10);
            ((m0) obj).q(s0Var);
            s0Var.x(a10);
        }
    }

    /* access modifiers changed from: package-private */
    public void a() {
        if (!this.f16404e) {
            throw new UnsupportedOperationException();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        int i10 = this.f16400a;
        if (i10 != m0Var.f16400a || !c(this.f16401b, m0Var.f16401b, i10) || !d(this.f16402c, m0Var.f16402c, this.f16400a)) {
            return false;
        }
        return true;
    }

    public int f() {
        int S10;
        int i10 = this.f16403d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f16400a; i12++) {
            int i13 = this.f16401b[i12];
            int a10 = r0.a(i13);
            int b10 = r0.b(i13);
            if (b10 == 0) {
                S10 = C1737j.S(a10, ((Long) this.f16402c[i12]).longValue());
            } else if (b10 == 1) {
                S10 = C1737j.n(a10, ((Long) this.f16402c[i12]).longValue());
            } else if (b10 == 2) {
                S10 = C1737j.f(a10, (C1734g) this.f16402c[i12]);
            } else if (b10 == 3) {
                S10 = (C1737j.P(a10) * 2) + ((m0) this.f16402c[i12]).f();
            } else if (b10 == 5) {
                S10 = C1737j.l(a10, ((Integer) this.f16402c[i12]).intValue());
            } else {
                throw new IllegalStateException(C1752z.d());
            }
            i11 += S10;
        }
        this.f16403d = i11;
        return i11;
    }

    public int g() {
        int i10 = this.f16403d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f16400a; i12++) {
            i11 += C1737j.D(r0.a(this.f16401b[i12]), (C1734g) this.f16402c[i12]);
        }
        this.f16403d = i11;
        return i11;
    }

    public int hashCode() {
        int i10 = this.f16400a;
        return ((((527 + i10) * 31) + h(this.f16401b, i10)) * 31) + i(this.f16402c, this.f16400a);
    }

    public void j() {
        this.f16404e = false;
    }

    /* access modifiers changed from: package-private */
    public final void m(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < this.f16400a; i11++) {
            Q.c(sb2, i10, String.valueOf(r0.a(this.f16401b[i11])), this.f16402c[i11]);
        }
    }

    /* access modifiers changed from: package-private */
    public void n(int i10, Object obj) {
        a();
        b();
        int[] iArr = this.f16401b;
        int i11 = this.f16400a;
        iArr[i11] = i10;
        this.f16402c[i11] = obj;
        this.f16400a = i11 + 1;
    }

    /* access modifiers changed from: package-private */
    public void o(s0 s0Var) {
        if (s0Var.t() == s0.a.DESCENDING) {
            for (int i10 = this.f16400a - 1; i10 >= 0; i10--) {
                s0Var.b(r0.a(this.f16401b[i10]), this.f16402c[i10]);
            }
            return;
        }
        for (int i11 = 0; i11 < this.f16400a; i11++) {
            s0Var.b(r0.a(this.f16401b[i11]), this.f16402c[i11]);
        }
    }

    public void q(s0 s0Var) {
        if (this.f16400a != 0) {
            if (s0Var.t() == s0.a.ASCENDING) {
                for (int i10 = 0; i10 < this.f16400a; i10++) {
                    p(this.f16401b[i10], this.f16402c[i10], s0Var);
                }
                return;
            }
            for (int i11 = this.f16400a - 1; i11 >= 0; i11--) {
                p(this.f16401b[i11], this.f16402c[i11], s0Var);
            }
        }
    }

    private m0(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.f16403d = -1;
        this.f16400a = i10;
        this.f16401b = iArr;
        this.f16402c = objArr;
        this.f16404e = z10;
    }
}
