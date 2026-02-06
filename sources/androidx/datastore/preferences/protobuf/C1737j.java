package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.q0;
import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: androidx.datastore.preferences.protobuf.j  reason: case insensitive filesystem */
public abstract class C1737j extends C1733f {

    /* renamed from: c  reason: collision with root package name */
    private static final Logger f16386c = Logger.getLogger(C1737j.class.getName());
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final boolean f16387d = p0.C();

    /* renamed from: a  reason: collision with root package name */
    C1738k f16388a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f16389b;

    /* renamed from: androidx.datastore.preferences.protobuf.j$b */
    private static abstract class b extends C1737j {

        /* renamed from: e  reason: collision with root package name */
        final byte[] f16390e;

        /* renamed from: f  reason: collision with root package name */
        final int f16391f;

        /* renamed from: g  reason: collision with root package name */
        int f16392g;

        /* renamed from: h  reason: collision with root package name */
        int f16393h;

        b(int i10) {
            super();
            if (i10 >= 0) {
                byte[] bArr = new byte[Math.max(i10, 20)];
                this.f16390e = bArr;
                this.f16391f = bArr.length;
                return;
            }
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }

        /* access modifiers changed from: package-private */
        public final void S0(byte b10) {
            byte[] bArr = this.f16390e;
            int i10 = this.f16392g;
            this.f16392g = i10 + 1;
            bArr[i10] = b10;
            this.f16393h++;
        }

        /* access modifiers changed from: package-private */
        public final void T0(int i10) {
            byte[] bArr = this.f16390e;
            int i11 = this.f16392g;
            int i12 = i11 + 1;
            this.f16392g = i12;
            bArr[i11] = (byte) (i10 & 255);
            int i13 = i11 + 2;
            this.f16392g = i13;
            bArr[i12] = (byte) ((i10 >> 8) & 255);
            int i14 = i11 + 3;
            this.f16392g = i14;
            bArr[i13] = (byte) ((i10 >> 16) & 255);
            this.f16392g = i11 + 4;
            bArr[i14] = (byte) ((i10 >> 24) & 255);
            this.f16393h += 4;
        }

        /* access modifiers changed from: package-private */
        public final void U0(long j10) {
            byte[] bArr = this.f16390e;
            int i10 = this.f16392g;
            int i11 = i10 + 1;
            this.f16392g = i11;
            bArr[i10] = (byte) ((int) (j10 & 255));
            int i12 = i10 + 2;
            this.f16392g = i12;
            bArr[i11] = (byte) ((int) ((j10 >> 8) & 255));
            int i13 = i10 + 3;
            this.f16392g = i13;
            bArr[i12] = (byte) ((int) ((j10 >> 16) & 255));
            int i14 = i10 + 4;
            this.f16392g = i14;
            bArr[i13] = (byte) ((int) (255 & (j10 >> 24)));
            int i15 = i10 + 5;
            this.f16392g = i15;
            bArr[i14] = (byte) (((int) (j10 >> 32)) & 255);
            int i16 = i10 + 6;
            this.f16392g = i16;
            bArr[i15] = (byte) (((int) (j10 >> 40)) & 255);
            int i17 = i10 + 7;
            this.f16392g = i17;
            bArr[i16] = (byte) (((int) (j10 >> 48)) & 255);
            this.f16392g = i10 + 8;
            bArr[i17] = (byte) (((int) (j10 >> 56)) & 255);
            this.f16393h += 8;
        }

        /* access modifiers changed from: package-private */
        public final void V0(int i10) {
            if (i10 >= 0) {
                X0(i10);
            } else {
                Y0((long) i10);
            }
        }

        /* access modifiers changed from: package-private */
        public final void W0(int i10, int i11) {
            X0(r0.c(i10, i11));
        }

        /* access modifiers changed from: package-private */
        public final void X0(int i10) {
            if (C1737j.f16387d) {
                long j10 = (long) this.f16392g;
                while ((i10 & -128) != 0) {
                    byte[] bArr = this.f16390e;
                    int i11 = this.f16392g;
                    this.f16392g = i11 + 1;
                    p0.H(bArr, (long) i11, (byte) ((i10 & 127) | 128));
                    i10 >>>= 7;
                }
                byte[] bArr2 = this.f16390e;
                int i12 = this.f16392g;
                this.f16392g = i12 + 1;
                p0.H(bArr2, (long) i12, (byte) i10);
                this.f16393h += (int) (((long) this.f16392g) - j10);
                return;
            }
            while ((i10 & -128) != 0) {
                byte[] bArr3 = this.f16390e;
                int i13 = this.f16392g;
                this.f16392g = i13 + 1;
                bArr3[i13] = (byte) ((i10 & 127) | 128);
                this.f16393h++;
                i10 >>>= 7;
            }
            byte[] bArr4 = this.f16390e;
            int i14 = this.f16392g;
            this.f16392g = i14 + 1;
            bArr4[i14] = (byte) i10;
            this.f16393h++;
        }

        /* access modifiers changed from: package-private */
        public final void Y0(long j10) {
            if (C1737j.f16387d) {
                long j11 = (long) this.f16392g;
                while ((j10 & -128) != 0) {
                    byte[] bArr = this.f16390e;
                    int i10 = this.f16392g;
                    this.f16392g = i10 + 1;
                    p0.H(bArr, (long) i10, (byte) ((((int) j10) & 127) | 128));
                    j10 >>>= 7;
                }
                byte[] bArr2 = this.f16390e;
                int i11 = this.f16392g;
                this.f16392g = i11 + 1;
                p0.H(bArr2, (long) i11, (byte) ((int) j10));
                this.f16393h += (int) (((long) this.f16392g) - j11);
                return;
            }
            while ((j10 & -128) != 0) {
                byte[] bArr3 = this.f16390e;
                int i12 = this.f16392g;
                this.f16392g = i12 + 1;
                bArr3[i12] = (byte) ((((int) j10) & 127) | 128);
                this.f16393h++;
                j10 >>>= 7;
            }
            byte[] bArr4 = this.f16390e;
            int i13 = this.f16392g;
            this.f16392g = i13 + 1;
            bArr4[i13] = (byte) ((int) j10);
            this.f16393h++;
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.j$c */
    public static class c extends IOException {
        private static final long serialVersionUID = -6947486886997889499L;

        c(Throwable th2) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th2);
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.j$d */
    private static final class d extends b {

        /* renamed from: i  reason: collision with root package name */
        private final OutputStream f16394i;

        d(OutputStream outputStream, int i10) {
            super(i10);
            if (outputStream != null) {
                this.f16394i = outputStream;
                return;
            }
            throw new NullPointerException("out");
        }

        private void Z0() {
            this.f16394i.write(this.f16390e, 0, this.f16392g);
            this.f16392g = 0;
        }

        private void a1(int i10) {
            if (this.f16391f - this.f16392g < i10) {
                Z0();
            }
        }

        public void A0(O o10) {
            P0(o10.a());
            o10.h(this);
        }

        public void B0(int i10, O o10) {
            N0(1, 3);
            O0(2, i10);
            c1(3, o10);
            N0(1, 4);
        }

        public void C0(int i10, C1734g gVar) {
            N0(1, 3);
            O0(2, i10);
            f0(3, gVar);
            N0(1, 4);
        }

        public void L0(int i10, String str) {
            N0(i10, 2);
            M0(str);
        }

        public void M0(String str) {
            int i10;
            int i11;
            try {
                int length = str.length() * 3;
                int R10 = C1737j.R(length);
                int i12 = R10 + length;
                int i13 = this.f16391f;
                if (i12 > i13) {
                    byte[] bArr = new byte[length];
                    int f10 = q0.f(str, bArr, 0, length);
                    P0(f10);
                    a(bArr, 0, f10);
                    return;
                }
                if (i12 > i13 - this.f16392g) {
                    Z0();
                }
                int R11 = C1737j.R(str.length());
                i10 = this.f16392g;
                if (R11 == R10) {
                    int i14 = i10 + R11;
                    this.f16392g = i14;
                    int f11 = q0.f(str, this.f16390e, i14, this.f16391f - i14);
                    this.f16392g = i10;
                    i11 = (f11 - i10) - R11;
                    X0(i11);
                    this.f16392g = f11;
                } else {
                    i11 = q0.g(str);
                    X0(i11);
                    this.f16392g = q0.f(str, this.f16390e, this.f16392g, i11);
                }
                this.f16393h += i11;
            } catch (q0.d e10) {
                this.f16393h -= this.f16392g - i10;
                this.f16392g = i10;
                throw e10;
            } catch (ArrayIndexOutOfBoundsException e11) {
                throw new c(e11);
            } catch (q0.d e12) {
                X(str, e12);
            }
        }

        public void N0(int i10, int i11) {
            P0(r0.c(i10, i11));
        }

        public void O0(int i10, int i11) {
            a1(20);
            W0(i10, 0);
            X0(i11);
        }

        public void P0(int i10) {
            a1(5);
            X0(i10);
        }

        public void Q0(int i10, long j10) {
            a1(20);
            W0(i10, 0);
            Y0(j10);
        }

        public void R0(long j10) {
            a1(10);
            Y0(j10);
        }

        public void W() {
            if (this.f16392g > 0) {
                Z0();
            }
        }

        public void a(byte[] bArr, int i10, int i11) {
            b1(bArr, i10, i11);
        }

        public void a0(byte b10) {
            if (this.f16392g == this.f16391f) {
                Z0();
            }
            S0(b10);
        }

        public void b0(int i10, boolean z10) {
            a1(11);
            W0(i10, 0);
            S0(z10 ? (byte) 1 : 0);
        }

        public void b1(byte[] bArr, int i10, int i11) {
            int i12 = this.f16391f;
            int i13 = this.f16392g;
            if (i12 - i13 >= i11) {
                System.arraycopy(bArr, i10, this.f16390e, i13, i11);
                this.f16392g += i11;
                this.f16393h += i11;
                return;
            }
            int i14 = i12 - i13;
            System.arraycopy(bArr, i10, this.f16390e, i13, i14);
            int i15 = i10 + i14;
            int i16 = i11 - i14;
            this.f16392g = this.f16391f;
            this.f16393h += i14;
            Z0();
            if (i16 <= this.f16391f) {
                System.arraycopy(bArr, i15, this.f16390e, 0, i16);
                this.f16392g = i16;
            } else {
                this.f16394i.write(bArr, i15, i16);
            }
            this.f16393h += i16;
        }

        public void c1(int i10, O o10) {
            N0(i10, 2);
            A0(o10);
        }

        /* access modifiers changed from: package-private */
        public void d1(O o10, e0 e0Var) {
            P0(((C1728a) o10).f(e0Var));
            e0Var.i(o10, this.f16388a);
        }

        public void e0(byte[] bArr, int i10, int i11) {
            P0(i11);
            b1(bArr, i10, i11);
        }

        public void f0(int i10, C1734g gVar) {
            N0(i10, 2);
            g0(gVar);
        }

        public void g0(C1734g gVar) {
            P0(gVar.size());
            gVar.Q(this);
        }

        public void l0(int i10, int i11) {
            a1(14);
            W0(i10, 5);
            T0(i11);
        }

        public void m0(int i10) {
            a1(4);
            T0(i10);
        }

        public void n0(int i10, long j10) {
            a1(18);
            W0(i10, 1);
            U0(j10);
        }

        public void o0(long j10) {
            a1(8);
            U0(j10);
        }

        public void v0(int i10, int i11) {
            a1(20);
            W0(i10, 0);
            V0(i11);
        }

        public void w0(int i10) {
            if (i10 >= 0) {
                P0(i10);
            } else {
                R0((long) i10);
            }
        }

        /* access modifiers changed from: package-private */
        public void z0(int i10, O o10, e0 e0Var) {
            N0(i10, 2);
            d1(o10, e0Var);
        }
    }

    public static int A(O o10) {
        return y(o10.a());
    }

    static int B(O o10, e0 e0Var) {
        return y(((C1728a) o10).f(e0Var));
    }

    static int C(int i10) {
        if (i10 > 4096) {
            return 4096;
        }
        return i10;
    }

    public static int D(int i10, C1734g gVar) {
        return (P(1) * 2) + Q(2, i10) + f(3, gVar);
    }

    public static int E(int i10) {
        return R(i10);
    }

    public static int F(int i10, int i11) {
        return P(i10) + G(i11);
    }

    public static int G(int i10) {
        return 4;
    }

    public static int H(int i10, long j10) {
        return P(i10) + I(j10);
    }

    public static int I(long j10) {
        return 8;
    }

    public static int J(int i10, int i11) {
        return P(i10) + K(i11);
    }

    public static int K(int i10) {
        return R(U(i10));
    }

    public static int L(int i10, long j10) {
        return P(i10) + M(j10);
    }

    public static int M(long j10) {
        return T(V(j10));
    }

    public static int N(int i10, String str) {
        return P(i10) + O(str);
    }

    public static int O(String str) {
        int i10;
        try {
            i10 = q0.g(str);
        } catch (q0.d unused) {
            i10 = str.getBytes(C1751y.f16572a).length;
        }
        return y(i10);
    }

    public static int P(int i10) {
        return R(r0.c(i10, 0));
    }

    public static int Q(int i10, int i11) {
        return P(i10) + R(i11);
    }

    public static int R(int i10) {
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

    public static int S(int i10, long j10) {
        return P(i10) + T(j10);
    }

    public static int T(long j10) {
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

    public static int U(int i10) {
        return (i10 >> 31) ^ (i10 << 1);
    }

    public static long V(long j10) {
        return (j10 >> 63) ^ (j10 << 1);
    }

    public static C1737j Z(OutputStream outputStream, int i10) {
        return new d(outputStream, i10);
    }

    public static int c(int i10, boolean z10) {
        return P(i10) + d(z10);
    }

    public static int d(boolean z10) {
        return 1;
    }

    public static int e(byte[] bArr) {
        return y(bArr.length);
    }

    public static int f(int i10, C1734g gVar) {
        return P(i10) + g(gVar);
    }

    public static int g(C1734g gVar) {
        return y(gVar.size());
    }

    public static int h(int i10, double d10) {
        return P(i10) + i(d10);
    }

    public static int i(double d10) {
        return 8;
    }

    public static int j(int i10, int i11) {
        return P(i10) + k(i11);
    }

    public static int k(int i10) {
        return v(i10);
    }

    public static int l(int i10, int i11) {
        return P(i10) + m(i11);
    }

    public static int m(int i10) {
        return 4;
    }

    public static int n(int i10, long j10) {
        return P(i10) + o(j10);
    }

    public static int o(long j10) {
        return 8;
    }

    public static int p(int i10, float f10) {
        return P(i10) + q(f10);
    }

    public static int q(float f10) {
        return 4;
    }

    static int r(int i10, O o10, e0 e0Var) {
        return (P(i10) * 2) + t(o10, e0Var);
    }

    public static int s(O o10) {
        return o10.a();
    }

    static int t(O o10, e0 e0Var) {
        return ((C1728a) o10).f(e0Var);
    }

    public static int u(int i10, int i11) {
        return P(i10) + v(i11);
    }

    public static int v(int i10) {
        if (i10 >= 0) {
            return R(i10);
        }
        return 10;
    }

    public static int w(int i10, long j10) {
        return P(i10) + x(j10);
    }

    public static int x(long j10) {
        return T(j10);
    }

    static int y(int i10) {
        return R(i10) + i10;
    }

    static int z(int i10, O o10, e0 e0Var) {
        return P(i10) + B(o10, e0Var);
    }

    public abstract void A0(O o10);

    public abstract void B0(int i10, O o10);

    public abstract void C0(int i10, C1734g gVar);

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
        O0(i10, U(i11));
    }

    public final void I0(int i10) {
        P0(U(i10));
    }

    public final void J0(int i10, long j10) {
        Q0(i10, V(j10));
    }

    public final void K0(long j10) {
        R0(V(j10));
    }

    public abstract void L0(int i10, String str);

    public abstract void M0(String str);

    public abstract void N0(int i10, int i11);

    public abstract void O0(int i10, int i11);

    public abstract void P0(int i10);

    public abstract void Q0(int i10, long j10);

    public abstract void R0(long j10);

    public abstract void W();

    /* access modifiers changed from: package-private */
    public final void X(String str, q0.d dVar) {
        f16386c.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", dVar);
        byte[] bytes = str.getBytes(C1751y.f16572a);
        try {
            P0(bytes.length);
            a(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e10) {
            throw new c(e10);
        } catch (c e11) {
            throw e11;
        }
    }

    /* access modifiers changed from: package-private */
    public boolean Y() {
        return this.f16389b;
    }

    public abstract void a(byte[] bArr, int i10, int i11);

    public abstract void a0(byte b10);

    public abstract void b0(int i10, boolean z10);

    public final void c0(boolean z10) {
        a0(z10 ? (byte) 1 : 0);
    }

    public final void d0(byte[] bArr) {
        e0(bArr, 0, bArr.length);
    }

    /* access modifiers changed from: package-private */
    public abstract void e0(byte[] bArr, int i10, int i11);

    public abstract void f0(int i10, C1734g gVar);

    public abstract void g0(C1734g gVar);

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

    public final void r0(int i10, O o10) {
        N0(i10, 3);
        t0(o10);
        N0(i10, 4);
    }

    /* access modifiers changed from: package-private */
    public final void s0(int i10, O o10, e0 e0Var) {
        N0(i10, 3);
        u0(o10, e0Var);
        N0(i10, 4);
    }

    public final void t0(O o10) {
        o10.h(this);
    }

    /* access modifiers changed from: package-private */
    public final void u0(O o10, e0 e0Var) {
        e0Var.i(o10, this.f16388a);
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
    public abstract void z0(int i10, O o10, e0 e0Var);

    private C1737j() {
    }
}
