package com.google.protobuf;

import com.google.protobuf.l0;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.protobuf.h  reason: case insensitive filesystem */
public abstract class C4870h extends C4867e {

    /* renamed from: c  reason: collision with root package name */
    private static final Logger f58480c = Logger.getLogger(C4870h.class.getName());
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final boolean f58481d = k0.E();

    /* renamed from: a  reason: collision with root package name */
    C4871i f58482a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f58483b;

    /* renamed from: com.google.protobuf.h$b */
    private static class b extends C4870h {

        /* renamed from: e  reason: collision with root package name */
        private final byte[] f58484e;

        /* renamed from: f  reason: collision with root package name */
        private final int f58485f;

        /* renamed from: g  reason: collision with root package name */
        private final int f58486g;

        /* renamed from: h  reason: collision with root package name */
        private int f58487h;

        b(byte[] bArr, int i10, int i11) {
            super();
            if (bArr != null) {
                int i12 = i10 + i11;
                if ((i10 | i11 | (bArr.length - i12)) >= 0) {
                    this.f58484e = bArr;
                    this.f58485f = i10;
                    this.f58487h = i10;
                    this.f58486g = i12;
                    return;
                }
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i10), Integer.valueOf(i11)}));
            }
            throw new NullPointerException("buffer");
        }

        public final void A0(K k10) {
            P0(k10.a());
            k10.i(this);
        }

        public final void B0(int i10, K k10) {
            N0(1, 3);
            O0(2, i10);
            T0(3, k10);
            N0(1, 4);
        }

        public final void C0(int i10, C4868f fVar) {
            N0(1, 3);
            O0(2, i10);
            f0(3, fVar);
            N0(1, 4);
        }

        public final void L0(int i10, String str) {
            N0(i10, 2);
            M0(str);
        }

        public final void M0(String str) {
            int i10 = this.f58487h;
            try {
                int Q10 = C4870h.Q(str.length() * 3);
                int Q11 = C4870h.Q(str.length());
                if (Q11 == Q10) {
                    int i11 = i10 + Q11;
                    this.f58487h = i11;
                    int e10 = l0.e(str, this.f58484e, i11, Z());
                    this.f58487h = i10;
                    P0((e10 - i10) - Q11);
                    this.f58487h = e10;
                    return;
                }
                P0(l0.f(str));
                this.f58487h = l0.e(str, this.f58484e, this.f58487h, Z());
            } catch (l0.c e11) {
                this.f58487h = i10;
                V(str, e11);
            } catch (IndexOutOfBoundsException e12) {
                throw new c(e12);
            }
        }

        public final void N0(int i10, int i11) {
            P0(m0.c(i10, i11));
        }

        public final void O0(int i10, int i11) {
            N0(i10, 0);
            P0(i11);
        }

        public final void P0(int i10) {
            while ((i10 & -128) != 0) {
                byte[] bArr = this.f58484e;
                int i11 = this.f58487h;
                this.f58487h = i11 + 1;
                bArr[i11] = (byte) ((i10 & 127) | 128);
                i10 >>>= 7;
            }
            try {
                byte[] bArr2 = this.f58484e;
                int i12 = this.f58487h;
                this.f58487h = i12 + 1;
                bArr2[i12] = (byte) i10;
            } catch (IndexOutOfBoundsException e10) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f58487h), Integer.valueOf(this.f58486g), 1}), e10);
            }
        }

        public final void Q0(int i10, long j10) {
            N0(i10, 0);
            R0(j10);
        }

        public final void R0(long j10) {
            if (!C4870h.f58481d || Z() < 10) {
                while ((j10 & -128) != 0) {
                    byte[] bArr = this.f58484e;
                    int i10 = this.f58487h;
                    this.f58487h = i10 + 1;
                    bArr[i10] = (byte) ((((int) j10) & 127) | 128);
                    j10 >>>= 7;
                }
                try {
                    byte[] bArr2 = this.f58484e;
                    int i11 = this.f58487h;
                    this.f58487h = i11 + 1;
                    bArr2[i11] = (byte) ((int) j10);
                } catch (IndexOutOfBoundsException e10) {
                    throw new c(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f58487h), Integer.valueOf(this.f58486g), 1}), e10);
                }
            } else {
                while ((j10 & -128) != 0) {
                    byte[] bArr3 = this.f58484e;
                    int i12 = this.f58487h;
                    this.f58487h = i12 + 1;
                    k0.K(bArr3, (long) i12, (byte) ((((int) j10) & 127) | 128));
                    j10 >>>= 7;
                }
                byte[] bArr4 = this.f58484e;
                int i13 = this.f58487h;
                this.f58487h = i13 + 1;
                k0.K(bArr4, (long) i13, (byte) ((int) j10));
            }
        }

        public final void S0(byte[] bArr, int i10, int i11) {
            try {
                System.arraycopy(bArr, i10, this.f58484e, this.f58487h, i11);
                this.f58487h += i11;
            } catch (IndexOutOfBoundsException e10) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f58487h), Integer.valueOf(this.f58486g), Integer.valueOf(i11)}), e10);
            }
        }

        public final void T0(int i10, K k10) {
            N0(i10, 2);
            A0(k10);
        }

        public final int Z() {
            return this.f58486g - this.f58487h;
        }

        public final void a(byte[] bArr, int i10, int i11) {
            S0(bArr, i10, i11);
        }

        public final void a0(byte b10) {
            try {
                byte[] bArr = this.f58484e;
                int i10 = this.f58487h;
                this.f58487h = i10 + 1;
                bArr[i10] = b10;
            } catch (IndexOutOfBoundsException e10) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f58487h), Integer.valueOf(this.f58486g), 1}), e10);
            }
        }

        public final void b0(int i10, boolean z10) {
            N0(i10, 0);
            a0(z10 ? (byte) 1 : 0);
        }

        public final void e0(byte[] bArr, int i10, int i11) {
            P0(i11);
            S0(bArr, i10, i11);
        }

        public final void f0(int i10, C4868f fVar) {
            N0(i10, 2);
            g0(fVar);
        }

        public final void g0(C4868f fVar) {
            P0(fVar.size());
            fVar.N(this);
        }

        public final void l0(int i10, int i11) {
            N0(i10, 5);
            m0(i11);
        }

        public final void m0(int i10) {
            try {
                byte[] bArr = this.f58484e;
                int i11 = this.f58487h;
                int i12 = i11 + 1;
                this.f58487h = i12;
                bArr[i11] = (byte) (i10 & 255);
                int i13 = i11 + 2;
                this.f58487h = i13;
                bArr[i12] = (byte) ((i10 >> 8) & 255);
                int i14 = i11 + 3;
                this.f58487h = i14;
                bArr[i13] = (byte) ((i10 >> 16) & 255);
                this.f58487h = i11 + 4;
                bArr[i14] = (byte) ((i10 >> 24) & 255);
            } catch (IndexOutOfBoundsException e10) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f58487h), Integer.valueOf(this.f58486g), 1}), e10);
            }
        }

        public final void n0(int i10, long j10) {
            N0(i10, 1);
            o0(j10);
        }

        public final void o0(long j10) {
            try {
                byte[] bArr = this.f58484e;
                int i10 = this.f58487h;
                int i11 = i10 + 1;
                this.f58487h = i11;
                bArr[i10] = (byte) (((int) j10) & 255);
                int i12 = i10 + 2;
                this.f58487h = i12;
                bArr[i11] = (byte) (((int) (j10 >> 8)) & 255);
                int i13 = i10 + 3;
                this.f58487h = i13;
                bArr[i12] = (byte) (((int) (j10 >> 16)) & 255);
                int i14 = i10 + 4;
                this.f58487h = i14;
                bArr[i13] = (byte) (((int) (j10 >> 24)) & 255);
                int i15 = i10 + 5;
                this.f58487h = i15;
                bArr[i14] = (byte) (((int) (j10 >> 32)) & 255);
                int i16 = i10 + 6;
                this.f58487h = i16;
                bArr[i15] = (byte) (((int) (j10 >> 40)) & 255);
                int i17 = i10 + 7;
                this.f58487h = i17;
                bArr[i16] = (byte) (((int) (j10 >> 48)) & 255);
                this.f58487h = i10 + 8;
                bArr[i17] = (byte) (((int) (j10 >> 56)) & 255);
            } catch (IndexOutOfBoundsException e10) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f58487h), Integer.valueOf(this.f58486g), 1}), e10);
            }
        }

        public final void v0(int i10, int i11) {
            N0(i10, 0);
            w0(i11);
        }

        public final void w0(int i10) {
            if (i10 >= 0) {
                P0(i10);
            } else {
                R0((long) i10);
            }
        }

        /* access modifiers changed from: package-private */
        public final void z0(int i10, K k10, Z z10) {
            N0(i10, 2);
            P0(((C4863a) k10).f(z10));
            z10.h(k10, this.f58482a);
        }
    }

    /* renamed from: com.google.protobuf.h$c */
    public static class c extends IOException {
        private static final long serialVersionUID = -6947486886997889499L;

        c(Throwable th2) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th2);
        }

        c(String str, Throwable th2) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + str, th2);
        }
    }

    static int A(int i10, K k10, Z z10) {
        return O(i10) + C(k10, z10);
    }

    public static int B(K k10) {
        return z(k10.a());
    }

    static int C(K k10, Z z10) {
        return z(((C4863a) k10).f(z10));
    }

    public static int D(int i10, C4868f fVar) {
        return (O(1) * 2) + P(2, i10) + g(3, fVar);
    }

    public static int E(int i10, int i11) {
        return O(i10) + F(i11);
    }

    public static int F(int i10) {
        return 4;
    }

    public static int G(int i10, long j10) {
        return O(i10) + H(j10);
    }

    public static int H(long j10) {
        return 8;
    }

    public static int I(int i10, int i11) {
        return O(i10) + J(i11);
    }

    public static int J(int i10) {
        return Q(T(i10));
    }

    public static int K(int i10, long j10) {
        return O(i10) + L(j10);
    }

    public static int L(long j10) {
        return S(U(j10));
    }

    public static int M(int i10, String str) {
        return O(i10) + N(str);
    }

    public static int N(String str) {
        int i10;
        try {
            i10 = l0.f(str);
        } catch (l0.c unused) {
            i10 = str.getBytes(C4881t.f58662b).length;
        }
        return z(i10);
    }

    public static int O(int i10) {
        return Q(m0.c(i10, 0));
    }

    public static int P(int i10, int i11) {
        return O(i10) + Q(i11);
    }

    public static int Q(int i10) {
        if ((i10 & -128) == 0) {
            return 1;
        }
        if ((i10 & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i10) == 0) {
            return 3;
        }
        return (i10 & -268435456) == 0 ? 4 : 5;
    }

    public static int R(int i10, long j10) {
        return O(i10) + S(j10);
    }

    public static int S(long j10) {
        int i10;
        if ((-128 & j10) == 0) {
            return 1;
        }
        if (j10 < 0) {
            return 10;
        }
        if ((-34359738368L & j10) != 0) {
            j10 >>>= 28;
            i10 = 6;
        } else {
            i10 = 2;
        }
        if ((-2097152 & j10) != 0) {
            i10 += 2;
            j10 >>>= 14;
        }
        return (j10 & -16384) != 0 ? i10 + 1 : i10;
    }

    public static int T(int i10) {
        return (i10 >> 31) ^ (i10 << 1);
    }

    public static long U(long j10) {
        return (j10 >> 63) ^ (j10 << 1);
    }

    public static C4870h X(byte[] bArr) {
        return Y(bArr, 0, bArr.length);
    }

    public static C4870h Y(byte[] bArr, int i10, int i11) {
        return new b(bArr, i10, i11);
    }

    public static int d(int i10, boolean z10) {
        return O(i10) + e(z10);
    }

    public static int e(boolean z10) {
        return 1;
    }

    public static int f(byte[] bArr) {
        return z(bArr.length);
    }

    public static int g(int i10, C4868f fVar) {
        return O(i10) + h(fVar);
    }

    public static int h(C4868f fVar) {
        return z(fVar.size());
    }

    public static int i(int i10, double d10) {
        return O(i10) + j(d10);
    }

    public static int j(double d10) {
        return 8;
    }

    public static int k(int i10, int i11) {
        return O(i10) + l(i11);
    }

    public static int l(int i10) {
        return w(i10);
    }

    public static int m(int i10, int i11) {
        return O(i10) + n(i11);
    }

    public static int n(int i10) {
        return 4;
    }

    public static int o(int i10, long j10) {
        return O(i10) + p(j10);
    }

    public static int p(long j10) {
        return 8;
    }

    public static int q(int i10, float f10) {
        return O(i10) + r(f10);
    }

    public static int r(float f10) {
        return 4;
    }

    static int s(int i10, K k10, Z z10) {
        return (O(i10) * 2) + u(k10, z10);
    }

    public static int t(K k10) {
        return k10.a();
    }

    static int u(K k10, Z z10) {
        return ((C4863a) k10).f(z10);
    }

    public static int v(int i10, int i11) {
        return O(i10) + w(i11);
    }

    public static int w(int i10) {
        if (i10 >= 0) {
            return Q(i10);
        }
        return 10;
    }

    public static int x(int i10, long j10) {
        return O(i10) + y(j10);
    }

    public static int y(long j10) {
        return S(j10);
    }

    static int z(int i10) {
        return Q(i10) + i10;
    }

    public abstract void A0(K k10);

    public abstract void B0(int i10, K k10);

    public abstract void C0(int i10, C4868f fVar);

    public final void D0(int i10, int i11) {
        l0(i10, i11);
    }

    public final void E0(int i10) {
        m0(i10);
    }

    public final void F0(int i10, long j10) {
        n0(i10, j10);
    }

    public final void G0(long j10) {
        o0(j10);
    }

    public final void H0(int i10, int i11) {
        O0(i10, T(i11));
    }

    public final void I0(int i10) {
        P0(T(i10));
    }

    public final void J0(int i10, long j10) {
        Q0(i10, U(j10));
    }

    public final void K0(long j10) {
        R0(U(j10));
    }

    public abstract void L0(int i10, String str);

    public abstract void M0(String str);

    public abstract void N0(int i10, int i11);

    public abstract void O0(int i10, int i11);

    public abstract void P0(int i10);

    public abstract void Q0(int i10, long j10);

    public abstract void R0(long j10);

    /* access modifiers changed from: package-private */
    public final void V(String str, l0.c cVar) {
        f58480c.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", cVar);
        byte[] bytes = str.getBytes(C4881t.f58662b);
        try {
            P0(bytes.length);
            a(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e10) {
            throw new c(e10);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean W() {
        return this.f58483b;
    }

    public abstract int Z();

    public abstract void a(byte[] bArr, int i10, int i11);

    public abstract void a0(byte b10);

    public abstract void b0(int i10, boolean z10);

    public final void c() {
        if (Z() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public final void c0(boolean z10) {
        a0(z10 ? (byte) 1 : 0);
    }

    public final void d0(byte[] bArr) {
        e0(bArr, 0, bArr.length);
    }

    /* access modifiers changed from: package-private */
    public abstract void e0(byte[] bArr, int i10, int i11);

    public abstract void f0(int i10, C4868f fVar);

    public abstract void g0(C4868f fVar);

    public final void h0(int i10, double d10) {
        n0(i10, Double.doubleToRawLongBits(d10));
    }

    public final void i0(double d10) {
        o0(Double.doubleToRawLongBits(d10));
    }

    public final void j0(int i10, int i11) {
        v0(i10, i11);
    }

    public final void k0(int i10) {
        w0(i10);
    }

    public abstract void l0(int i10, int i11);

    public abstract void m0(int i10);

    public abstract void n0(int i10, long j10);

    public abstract void o0(long j10);

    public final void p0(int i10, float f10) {
        l0(i10, Float.floatToRawIntBits(f10));
    }

    public final void q0(float f10) {
        m0(Float.floatToRawIntBits(f10));
    }

    public final void r0(int i10, K k10) {
        N0(i10, 3);
        t0(k10);
        N0(i10, 4);
    }

    /* access modifiers changed from: package-private */
    public final void s0(int i10, K k10, Z z10) {
        N0(i10, 3);
        u0(k10, z10);
        N0(i10, 4);
    }

    public final void t0(K k10) {
        k10.i(this);
    }

    /* access modifiers changed from: package-private */
    public final void u0(K k10, Z z10) {
        z10.h(k10, this.f58482a);
    }

    public abstract void v0(int i10, int i11);

    public abstract void w0(int i10);

    public final void x0(int i10, long j10) {
        Q0(i10, j10);
    }

    public final void y0(long j10) {
        R0(j10);
    }

    /* access modifiers changed from: package-private */
    public abstract void z0(int i10, K k10, Z z10);

    private C4870h() {
    }
}
