package pg;

import com.adjust.sdk.Constants;
import com.google.android.gms.common.api.a;
import java.io.InputStream;
import java.util.ArrayList;
import pg.p;

/* renamed from: pg.e  reason: case insensitive filesystem */
public final class C6643e {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f72499a = new byte[4096];

    /* renamed from: b  reason: collision with root package name */
    private final boolean f72500b;

    /* renamed from: c  reason: collision with root package name */
    private int f72501c = 0;

    /* renamed from: d  reason: collision with root package name */
    private int f72502d;

    /* renamed from: e  reason: collision with root package name */
    private int f72503e = 0;

    /* renamed from: f  reason: collision with root package name */
    private final InputStream f72504f;

    /* renamed from: g  reason: collision with root package name */
    private int f72505g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f72506h = false;

    /* renamed from: i  reason: collision with root package name */
    private int f72507i = 0;

    /* renamed from: j  reason: collision with root package name */
    private int f72508j = a.e.API_PRIORITY_OTHER;

    /* renamed from: k  reason: collision with root package name */
    private int f72509k;

    /* renamed from: l  reason: collision with root package name */
    private int f72510l = 64;

    /* renamed from: m  reason: collision with root package name */
    private int f72511m = 67108864;

    private C6643e(InputStream inputStream) {
        this.f72504f = inputStream;
        this.f72500b = false;
    }

    public static int A(int i10, InputStream inputStream) {
        if ((i10 & 128) == 0) {
            return i10;
        }
        int i11 = i10 & 127;
        int i12 = 7;
        while (i12 < 32) {
            int read = inputStream.read();
            if (read != -1) {
                i11 |= (read & 127) << i12;
                if ((read & 128) == 0) {
                    return i11;
                }
                i12 += 7;
            } else {
                throw C6649k.k();
            }
        }
        while (i12 < 64) {
            int read2 = inputStream.read();
            if (read2 == -1) {
                throw C6649k.k();
            } else if ((read2 & 128) == 0) {
                return i11;
            } else {
                i12 += 7;
            }
        }
        throw C6649k.f();
    }

    private void M() {
        int i10 = this.f72501c + this.f72502d;
        this.f72501c = i10;
        int i11 = this.f72507i + i10;
        int i12 = this.f72508j;
        if (i11 > i12) {
            int i13 = i11 - i12;
            this.f72502d = i13;
            this.f72501c = i10 - i13;
            return;
        }
        this.f72502d = 0;
    }

    private void N(int i10) {
        if (!S(i10)) {
            throw C6649k.k();
        }
    }

    private void R(int i10) {
        if (i10 >= 0) {
            int i11 = this.f72507i;
            int i12 = this.f72503e;
            int i13 = i11 + i12 + i10;
            int i14 = this.f72508j;
            if (i13 <= i14) {
                int i15 = this.f72501c;
                int i16 = i15 - i12;
                this.f72503e = i15;
                N(1);
                while (true) {
                    int i17 = i10 - i16;
                    int i18 = this.f72501c;
                    if (i17 > i18) {
                        i16 += i18;
                        this.f72503e = i18;
                        N(1);
                    } else {
                        this.f72503e = i17;
                        return;
                    }
                }
            } else {
                Q((i14 - i11) - i12);
                throw C6649k.k();
            }
        } else {
            throw C6649k.g();
        }
    }

    private boolean S(int i10) {
        int i11 = this.f72503e;
        int i12 = i11 + i10;
        int i13 = this.f72501c;
        if (i12 > i13) {
            if (this.f72507i + i11 + i10 <= this.f72508j && this.f72504f != null) {
                if (i11 > 0) {
                    if (i13 > i11) {
                        byte[] bArr = this.f72499a;
                        System.arraycopy(bArr, i11, bArr, 0, i13 - i11);
                    }
                    this.f72507i += i11;
                    this.f72501c -= i11;
                    this.f72503e = 0;
                }
                InputStream inputStream = this.f72504f;
                byte[] bArr2 = this.f72499a;
                int i14 = this.f72501c;
                int read = inputStream.read(bArr2, i14, bArr2.length - i14);
                if (read == 0 || read < -1 || read > this.f72499a.length) {
                    StringBuilder sb2 = new StringBuilder(102);
                    sb2.append("InputStream#read(byte[]) returned invalid result: ");
                    sb2.append(read);
                    sb2.append("\nThe InputStream implementation is buggy.");
                    throw new IllegalStateException(sb2.toString());
                } else if (read > 0) {
                    this.f72501c += read;
                    if ((this.f72507i + i10) - this.f72511m <= 0) {
                        M();
                        if (this.f72501c >= i10) {
                            return true;
                        }
                        return S(i10);
                    }
                    throw C6649k.j();
                }
            }
            return false;
        }
        StringBuilder sb3 = new StringBuilder(77);
        sb3.append("refillBuffer() called when ");
        sb3.append(i10);
        sb3.append(" bytes were already available in buffer");
        throw new IllegalStateException(sb3.toString());
    }

    public static int b(int i10) {
        return (-(i10 & 1)) ^ (i10 >>> 1);
    }

    public static long c(long j10) {
        return (-(j10 & 1)) ^ (j10 >>> 1);
    }

    private void d(int i10) {
        if (this.f72501c - this.f72503e < i10) {
            N(i10);
        }
    }

    public static C6643e g(InputStream inputStream) {
        return new C6643e(inputStream);
    }

    private byte[] w(int i10) {
        int i11;
        if (i10 > 0) {
            int i12 = this.f72507i;
            int i13 = this.f72503e;
            int i14 = i12 + i13 + i10;
            int i15 = this.f72508j;
            if (i14 > i15) {
                Q((i15 - i12) - i13);
                throw C6649k.k();
            } else if (i10 < 4096) {
                byte[] bArr = new byte[i10];
                int i16 = this.f72501c - i13;
                System.arraycopy(this.f72499a, i13, bArr, 0, i16);
                this.f72503e = this.f72501c;
                int i17 = i10 - i16;
                d(i17);
                System.arraycopy(this.f72499a, 0, bArr, i16, i17);
                this.f72503e = i17;
                return bArr;
            } else {
                int i18 = this.f72501c;
                this.f72507i = i12 + i18;
                this.f72503e = 0;
                this.f72501c = 0;
                int i19 = i18 - i13;
                int i20 = i10 - i19;
                ArrayList<byte[]> arrayList = new ArrayList<>();
                while (i20 > 0) {
                    int min = Math.min(i20, 4096);
                    byte[] bArr2 = new byte[min];
                    int i21 = 0;
                    while (i21 < min) {
                        InputStream inputStream = this.f72504f;
                        if (inputStream == null) {
                            i11 = -1;
                        } else {
                            i11 = inputStream.read(bArr2, i21, min - i21);
                        }
                        if (i11 != -1) {
                            this.f72507i += i11;
                            i21 += i11;
                        } else {
                            throw C6649k.k();
                        }
                    }
                    i20 -= min;
                    arrayList.add(bArr2);
                }
                byte[] bArr3 = new byte[i10];
                System.arraycopy(this.f72499a, i13, bArr3, 0, i19);
                for (byte[] bArr4 : arrayList) {
                    System.arraycopy(bArr4, 0, bArr3, i19, bArr4.length);
                    i19 += bArr4.length;
                }
                return bArr3;
            }
        } else if (i10 == 0) {
            return C6648j.f72547a;
        } else {
            throw C6649k.g();
        }
    }

    public long B() {
        long j10;
        long j11;
        long j12;
        int i10 = this.f72503e;
        int i11 = this.f72501c;
        if (i11 != i10) {
            byte[] bArr = this.f72499a;
            int i12 = i10 + 1;
            byte b10 = bArr[i10];
            if (b10 >= 0) {
                this.f72503e = i12;
                return (long) b10;
            } else if (i11 - i12 >= 9) {
                int i13 = i10 + 2;
                long j13 = (long) ((bArr[i12] << 7) ^ b10);
                if (j13 < 0) {
                    j11 = -128;
                } else {
                    int i14 = i10 + 3;
                    long j14 = j13 ^ ((long) (bArr[i13] << 14));
                    if (j14 >= 0) {
                        j12 = 16256;
                    } else {
                        i13 = i10 + 4;
                        j13 = j14 ^ ((long) (bArr[i14] << 21));
                        if (j13 < 0) {
                            j11 = -2080896;
                        } else {
                            i14 = i10 + 5;
                            j14 = j13 ^ (((long) bArr[i13]) << 28);
                            if (j14 >= 0) {
                                j12 = 266354560;
                            } else {
                                i13 = i10 + 6;
                                j13 = j14 ^ (((long) bArr[i14]) << 35);
                                if (j13 < 0) {
                                    j11 = -34093383808L;
                                } else {
                                    i14 = i10 + 7;
                                    j14 = j13 ^ (((long) bArr[i13]) << 42);
                                    if (j14 >= 0) {
                                        j12 = 4363953127296L;
                                    } else {
                                        i13 = i10 + 8;
                                        j13 = j14 ^ (((long) bArr[i14]) << 49);
                                        if (j13 < 0) {
                                            j11 = -558586000294016L;
                                        } else {
                                            i14 = i10 + 9;
                                            long j15 = (j13 ^ (((long) bArr[i13]) << 56)) ^ 71499008037633920L;
                                            if (j15 < 0) {
                                                i13 = i10 + 10;
                                                if (((long) bArr[i14]) >= 0) {
                                                    j10 = j15;
                                                    this.f72503e = i13;
                                                    return j10;
                                                }
                                            } else {
                                                j10 = j15;
                                                i13 = i14;
                                                this.f72503e = i13;
                                                return j10;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    j10 = j14 ^ j12;
                    i13 = i14;
                    this.f72503e = i13;
                    return j10;
                }
                j10 = j13 ^ j11;
                this.f72503e = i13;
                return j10;
            }
        }
        return C();
    }

    /* access modifiers changed from: package-private */
    public long C() {
        long j10 = 0;
        for (int i10 = 0; i10 < 64; i10 += 7) {
            byte v10 = v();
            j10 |= ((long) (v10 & Byte.MAX_VALUE)) << i10;
            if ((v10 & 128) == 0) {
                return j10;
            }
        }
        throw C6649k.f();
    }

    public int D() {
        return x();
    }

    public long E() {
        return y();
    }

    public int F() {
        return b(z());
    }

    public long G() {
        return c(B());
    }

    public String H() {
        int z10 = z();
        int i10 = this.f72501c;
        int i11 = this.f72503e;
        if (z10 <= i10 - i11 && z10 > 0) {
            String str = new String(this.f72499a, i11, z10, Constants.ENCODING);
            this.f72503e += z10;
            return str;
        } else if (z10 == 0) {
            return "";
        } else {
            return new String(w(z10), Constants.ENCODING);
        }
    }

    public String I() {
        byte[] bArr;
        int z10 = z();
        int i10 = this.f72503e;
        if (z10 <= this.f72501c - i10 && z10 > 0) {
            bArr = this.f72499a;
            this.f72503e = i10 + z10;
        } else if (z10 == 0) {
            return "";
        } else {
            bArr = w(z10);
            i10 = 0;
        }
        if (x.f(bArr, i10, i10 + z10)) {
            return new String(bArr, i10, z10, Constants.ENCODING);
        }
        throw C6649k.d();
    }

    public int J() {
        if (f()) {
            this.f72505g = 0;
            return 0;
        }
        int z10 = z();
        this.f72505g = z10;
        if (y.a(z10) != 0) {
            return this.f72505g;
        }
        throw C6649k.c();
    }

    public int K() {
        return z();
    }

    public long L() {
        return B();
    }

    public boolean O(int i10, C6644f fVar) {
        int b10 = y.b(i10);
        if (b10 == 0) {
            long s10 = s();
            fVar.n0(i10);
            fVar.y0(s10);
            return true;
        } else if (b10 == 1) {
            long y10 = y();
            fVar.n0(i10);
            fVar.U(y10);
            return true;
        } else if (b10 == 2) {
            C6642d k10 = k();
            fVar.n0(i10);
            fVar.O(k10);
            return true;
        } else if (b10 == 3) {
            fVar.n0(i10);
            P(fVar);
            int c10 = y.c(y.a(i10), 4);
            a(c10);
            fVar.n0(c10);
            return true;
        } else if (b10 == 4) {
            return false;
        } else {
            if (b10 == 5) {
                int x10 = x();
                fVar.n0(i10);
                fVar.T(x10);
                return true;
            }
            throw C6649k.e();
        }
    }

    /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public void P(pg.C6644f r2) {
        /*
            r1 = this;
        L_0x0000:
            int r0 = r1.J()
            if (r0 == 0) goto L_0x000c
            boolean r0 = r1.O(r0, r2)
            if (r0 != 0) goto L_0x0000
        L_0x000c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pg.C6643e.P(pg.f):void");
    }

    public void Q(int i10) {
        int i11 = this.f72501c;
        int i12 = this.f72503e;
        if (i10 > i11 - i12 || i10 < 0) {
            R(i10);
        } else {
            this.f72503e = i12 + i10;
        }
    }

    public void a(int i10) {
        if (this.f72505g != i10) {
            throw C6649k.b();
        }
    }

    public int e() {
        int i10 = this.f72508j;
        if (i10 == Integer.MAX_VALUE) {
            return -1;
        }
        return i10 - (this.f72507i + this.f72503e);
    }

    public boolean f() {
        if (this.f72503e != this.f72501c || S(1)) {
            return false;
        }
        return true;
    }

    public void h(int i10) {
        this.f72508j = i10;
        M();
    }

    public int i(int i10) {
        if (i10 >= 0) {
            int i11 = i10 + this.f72507i + this.f72503e;
            int i12 = this.f72508j;
            if (i11 <= i12) {
                this.f72508j = i11;
                M();
                return i12;
            }
            throw C6649k.k();
        }
        throw C6649k.g();
    }

    public boolean j() {
        if (B() != 0) {
            return true;
        }
        return false;
    }

    public C6642d k() {
        C6642d dVar;
        int z10 = z();
        int i10 = this.f72501c;
        int i11 = this.f72503e;
        if (z10 <= i10 - i11 && z10 > 0) {
            if (!this.f72500b || !this.f72506h) {
                dVar = C6642d.h(this.f72499a, i11, z10);
            } else {
                dVar = new C6641c(this.f72499a, this.f72503e, z10);
            }
            this.f72503e += z10;
            return dVar;
        } else if (z10 == 0) {
            return C6642d.f72492a;
        } else {
            return new o(w(z10));
        }
    }

    public double l() {
        return Double.longBitsToDouble(y());
    }

    public int m() {
        return z();
    }

    public int n() {
        return x();
    }

    public long o() {
        return y();
    }

    public float p() {
        return Float.intBitsToFloat(x());
    }

    public void q(int i10, p.a aVar, C6645g gVar) {
        int i11 = this.f72509k;
        if (i11 < this.f72510l) {
            this.f72509k = i11 + 1;
            aVar.h0(this, gVar);
            a(y.c(i10, 4));
            this.f72509k--;
            return;
        }
        throw C6649k.h();
    }

    public int r() {
        return z();
    }

    public long s() {
        return B();
    }

    public p t(r rVar, C6645g gVar) {
        int z10 = z();
        if (this.f72509k < this.f72510l) {
            int i10 = i(z10);
            this.f72509k++;
            p pVar = (p) rVar.b(this, gVar);
            a(0);
            this.f72509k--;
            h(i10);
            return pVar;
        }
        throw C6649k.h();
    }

    public void u(p.a aVar, C6645g gVar) {
        int z10 = z();
        if (this.f72509k < this.f72510l) {
            int i10 = i(z10);
            this.f72509k++;
            aVar.h0(this, gVar);
            a(0);
            this.f72509k--;
            h(i10);
            return;
        }
        throw C6649k.h();
    }

    public byte v() {
        if (this.f72503e == this.f72501c) {
            N(1);
        }
        byte[] bArr = this.f72499a;
        int i10 = this.f72503e;
        this.f72503e = i10 + 1;
        return bArr[i10];
    }

    public int x() {
        int i10 = this.f72503e;
        if (this.f72501c - i10 < 4) {
            N(4);
            i10 = this.f72503e;
        }
        byte[] bArr = this.f72499a;
        this.f72503e = i10 + 4;
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    public long y() {
        int i10 = this.f72503e;
        if (this.f72501c - i10 < 8) {
            N(8);
            i10 = this.f72503e;
        }
        byte[] bArr = this.f72499a;
        this.f72503e = i10 + 8;
        return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
    }

    public int z() {
        int i10;
        int i11;
        int i12 = this.f72503e;
        int i13 = this.f72501c;
        if (i13 != i12) {
            byte[] bArr = this.f72499a;
            int i14 = i12 + 1;
            byte b10 = bArr[i12];
            if (b10 >= 0) {
                this.f72503e = i14;
                return b10;
            } else if (i13 - i14 >= 9) {
                int i15 = i12 + 2;
                byte b11 = (bArr[i14] << 7) ^ b10;
                long j10 = (long) b11;
                if (j10 < 0) {
                    i10 = (int) (-128 ^ j10);
                } else {
                    int i16 = i12 + 3;
                    byte b12 = (bArr[i15] << 14) ^ b11;
                    long j11 = (long) b12;
                    if (j11 >= 0) {
                        i11 = (int) (16256 ^ j11);
                    } else {
                        int i17 = i12 + 4;
                        byte b13 = b12 ^ (bArr[i16] << 21);
                        long j12 = (long) b13;
                        if (j12 < 0) {
                            i10 = (int) (-2080896 ^ j12);
                        } else {
                            i16 = i12 + 5;
                            byte b14 = bArr[i17];
                            int i18 = (int) (((long) (b13 ^ (b14 << 28))) ^ 266354560);
                            if (b14 < 0) {
                                i17 = i12 + 6;
                                if (bArr[i16] < 0) {
                                    i16 = i12 + 7;
                                    if (bArr[i17] < 0) {
                                        i17 = i12 + 8;
                                        if (bArr[i16] < 0) {
                                            i16 = i12 + 9;
                                            if (bArr[i17] < 0) {
                                                int i19 = i12 + 10;
                                                if (bArr[i16] >= 0) {
                                                    int i20 = i18;
                                                    i15 = i19;
                                                    i10 = i20;
                                                }
                                            }
                                        }
                                    }
                                }
                                i10 = i18;
                            }
                            i11 = i18;
                        }
                        i15 = i17;
                    }
                    i15 = i16;
                }
                this.f72503e = i15;
                return i10;
            }
        }
        return (int) C();
    }
}
