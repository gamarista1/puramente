package com.google.protobuf;

import com.google.protobuf.n0;
import java.util.Arrays;

public final class h0 {

    /* renamed from: f  reason: collision with root package name */
    private static final h0 f58488f = new h0(0, new int[0], new Object[0], false);

    /* renamed from: a  reason: collision with root package name */
    private int f58489a;

    /* renamed from: b  reason: collision with root package name */
    private int[] f58490b;

    /* renamed from: c  reason: collision with root package name */
    private Object[] f58491c;

    /* renamed from: d  reason: collision with root package name */
    private int f58492d = -1;

    /* renamed from: e  reason: collision with root package name */
    private boolean f58493e;

    private h0(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.f58489a = i10;
        this.f58490b = iArr;
        this.f58491c = objArr;
        this.f58493e = z10;
    }

    private void b(int i10) {
        int[] iArr = this.f58490b;
        if (i10 > iArr.length) {
            int i11 = this.f58489a;
            int i12 = i11 + (i11 / 2);
            if (i12 >= i10) {
                i10 = i12;
            }
            if (i10 < 8) {
                i10 = 8;
            }
            this.f58490b = Arrays.copyOf(iArr, i10);
            this.f58491c = Arrays.copyOf(this.f58491c, i10);
        }
    }

    public static h0 c() {
        return f58488f;
    }

    private static int f(int[] iArr, int i10) {
        int i11 = 17;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 = (i11 * 31) + iArr[i12];
        }
        return i11;
    }

    private static int g(Object[] objArr, int i10) {
        int i11 = 17;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 = (i11 * 31) + objArr[i12].hashCode();
        }
        return i11;
    }

    static h0 j(h0 h0Var, h0 h0Var2) {
        int i10 = h0Var.f58489a + h0Var2.f58489a;
        int[] copyOf = Arrays.copyOf(h0Var.f58490b, i10);
        System.arraycopy(h0Var2.f58490b, 0, copyOf, h0Var.f58489a, h0Var2.f58489a);
        Object[] copyOf2 = Arrays.copyOf(h0Var.f58491c, i10);
        System.arraycopy(h0Var2.f58491c, 0, copyOf2, h0Var.f58489a, h0Var2.f58489a);
        return new h0(i10, copyOf, copyOf2, true);
    }

    private static boolean k(Object[] objArr, Object[] objArr2, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (!objArr[i11].equals(objArr2[i11])) {
                return false;
            }
        }
        return true;
    }

    private static boolean m(int[] iArr, int[] iArr2, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (iArr[i11] != iArr2[i11]) {
                return false;
            }
        }
        return true;
    }

    private static void o(int i10, Object obj, n0 n0Var) {
        int a10 = m0.a(i10);
        int b10 = m0.b(i10);
        if (b10 == 0) {
            n0Var.u(a10, ((Long) obj).longValue());
        } else if (b10 == 1) {
            n0Var.s(a10, ((Long) obj).longValue());
        } else if (b10 == 2) {
            n0Var.L(a10, (C4868f) obj);
        } else if (b10 != 3) {
            if (b10 == 5) {
                n0Var.c(a10, ((Integer) obj).intValue());
                return;
            }
            throw new RuntimeException(C4883v.a());
        } else if (n0Var.t() == n0.a.ASCENDING) {
            n0Var.x(a10);
            ((h0) obj).p(n0Var);
            n0Var.C(a10);
        } else {
            n0Var.C(a10);
            ((h0) obj).p(n0Var);
            n0Var.x(a10);
        }
    }

    /* access modifiers changed from: package-private */
    public void a() {
        if (!this.f58493e) {
            throw new UnsupportedOperationException();
        }
    }

    public int d() {
        int R10;
        int i10 = this.f58492d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f58489a; i12++) {
            int i13 = this.f58490b[i12];
            int a10 = m0.a(i13);
            int b10 = m0.b(i13);
            if (b10 == 0) {
                R10 = C4870h.R(a10, ((Long) this.f58491c[i12]).longValue());
            } else if (b10 == 1) {
                R10 = C4870h.o(a10, ((Long) this.f58491c[i12]).longValue());
            } else if (b10 == 2) {
                R10 = C4870h.g(a10, (C4868f) this.f58491c[i12]);
            } else if (b10 == 3) {
                R10 = (C4870h.O(a10) * 2) + ((h0) this.f58491c[i12]).d();
            } else if (b10 == 5) {
                R10 = C4870h.m(a10, ((Integer) this.f58491c[i12]).intValue());
            } else {
                throw new IllegalStateException(C4883v.a());
            }
            i11 += R10;
        }
        this.f58492d = i11;
        return i11;
    }

    public int e() {
        int i10 = this.f58492d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f58489a; i12++) {
            i11 += C4870h.D(m0.a(this.f58490b[i12]), (C4868f) this.f58491c[i12]);
        }
        this.f58492d = i11;
        return i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        int i10 = this.f58489a;
        if (i10 != h0Var.f58489a || !m(this.f58490b, h0Var.f58490b, i10) || !k(this.f58491c, h0Var.f58491c, this.f58489a)) {
            return false;
        }
        return true;
    }

    public void h() {
        this.f58493e = false;
    }

    public int hashCode() {
        int i10 = this.f58489a;
        return ((((527 + i10) * 31) + f(this.f58490b, i10)) * 31) + g(this.f58491c, this.f58489a);
    }

    /* access modifiers changed from: package-private */
    public h0 i(h0 h0Var) {
        if (h0Var.equals(c())) {
            return this;
        }
        a();
        int i10 = this.f58489a + h0Var.f58489a;
        b(i10);
        System.arraycopy(h0Var.f58490b, 0, this.f58490b, this.f58489a, h0Var.f58489a);
        System.arraycopy(h0Var.f58491c, 0, this.f58491c, this.f58489a, h0Var.f58489a);
        this.f58489a = i10;
        return this;
    }

    /* access modifiers changed from: package-private */
    public final void l(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < this.f58489a; i11++) {
            M.d(sb2, i10, String.valueOf(m0.a(this.f58490b[i11])), this.f58491c[i11]);
        }
    }

    /* access modifiers changed from: package-private */
    public void n(n0 n0Var) {
        if (n0Var.t() == n0.a.DESCENDING) {
            for (int i10 = this.f58489a - 1; i10 >= 0; i10--) {
                n0Var.b(m0.a(this.f58490b[i10]), this.f58491c[i10]);
            }
            return;
        }
        for (int i11 = 0; i11 < this.f58489a; i11++) {
            n0Var.b(m0.a(this.f58490b[i11]), this.f58491c[i11]);
        }
    }

    public void p(n0 n0Var) {
        if (this.f58489a != 0) {
            if (n0Var.t() == n0.a.ASCENDING) {
                for (int i10 = 0; i10 < this.f58489a; i10++) {
                    o(this.f58490b[i10], this.f58491c[i10], n0Var);
                }
                return;
            }
            for (int i11 = this.f58489a - 1; i11 >= 0; i11--) {
                o(this.f58490b[i11], this.f58491c[i11], n0Var);
            }
        }
    }
}
