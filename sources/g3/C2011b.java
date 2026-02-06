package g3;

import android.util.Pair;
import f2.C1961B;
import f2.s;
import i2.C2073A;
import i2.C2076a;
import i2.L;
import i2.p;
import z2.C2972p;
import z2.C2973q;
import z2.I;
import z2.O;
import z2.T;
import z2.r;
import z2.u;

/* renamed from: g3.b  reason: case insensitive filesystem */
public final class C2011b implements C2972p {

    /* renamed from: h  reason: collision with root package name */
    public static final u f21048h = new C2010a();

    /* renamed from: a  reason: collision with root package name */
    private r f21049a;

    /* renamed from: b  reason: collision with root package name */
    private O f21050b;

    /* renamed from: c  reason: collision with root package name */
    private int f21051c = 0;

    /* renamed from: d  reason: collision with root package name */
    private long f21052d = -1;

    /* renamed from: e  reason: collision with root package name */
    private C0350b f21053e;

    /* renamed from: f  reason: collision with root package name */
    private int f21054f = -1;

    /* renamed from: g  reason: collision with root package name */
    private long f21055g = -1;

    /* renamed from: g3.b$a */
    private static final class a implements C0350b {

        /* renamed from: m  reason: collision with root package name */
        private static final int[] f21056m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

        /* renamed from: n  reason: collision with root package name */
        private static final int[] f21057n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

        /* renamed from: a  reason: collision with root package name */
        private final r f21058a;

        /* renamed from: b  reason: collision with root package name */
        private final O f21059b;

        /* renamed from: c  reason: collision with root package name */
        private final c f21060c;

        /* renamed from: d  reason: collision with root package name */
        private final int f21061d;

        /* renamed from: e  reason: collision with root package name */
        private final byte[] f21062e;

        /* renamed from: f  reason: collision with root package name */
        private final C2073A f21063f;

        /* renamed from: g  reason: collision with root package name */
        private final int f21064g;

        /* renamed from: h  reason: collision with root package name */
        private final s f21065h;

        /* renamed from: i  reason: collision with root package name */
        private int f21066i;

        /* renamed from: j  reason: collision with root package name */
        private long f21067j;

        /* renamed from: k  reason: collision with root package name */
        private int f21068k;

        /* renamed from: l  reason: collision with root package name */
        private long f21069l;

        public a(r rVar, O o10, c cVar) {
            this.f21058a = rVar;
            this.f21059b = o10;
            this.f21060c = cVar;
            int max = Math.max(1, cVar.f21080c / 10);
            this.f21064g = max;
            C2073A a10 = new C2073A(cVar.f21084g);
            a10.z();
            int z10 = a10.z();
            this.f21061d = z10;
            int i10 = cVar.f21079b;
            int i11 = (((cVar.f21082e - (i10 * 4)) * 8) / (cVar.f21083f * i10)) + 1;
            if (z10 == i11) {
                int j10 = L.j(max, z10);
                this.f21062e = new byte[(cVar.f21082e * j10)];
                this.f21063f = new C2073A(j10 * h(z10, i10));
                int i12 = ((cVar.f21080c * cVar.f21082e) * 8) / z10;
                this.f21065h = new s.b().o0("audio/raw").M(i12).j0(i12).f0(h(max, i10)).N(cVar.f21079b).p0(cVar.f21080c).i0(2).K();
                return;
            }
            throw C1961B.a("Expected frames per block: " + i11 + "; got: " + z10, (Throwable) null);
        }

        private void d(byte[] bArr, int i10, C2073A a10) {
            for (int i11 = 0; i11 < i10; i11++) {
                for (int i12 = 0; i12 < this.f21060c.f21079b; i12++) {
                    e(bArr, i11, i12, a10.e());
                }
            }
            int g10 = g(this.f21061d * i10);
            a10.U(0);
            a10.T(g10);
        }

        private void e(byte[] bArr, int i10, int i11, byte[] bArr2) {
            int i12;
            c cVar = this.f21060c;
            int i13 = cVar.f21082e;
            int i14 = cVar.f21079b;
            int i15 = (i10 * i13) + (i11 * 4);
            int i16 = (i14 * 4) + i15;
            int i17 = (i13 / i14) - 4;
            int i18 = (short) (((bArr[i15 + 1] & 255) << 8) | (bArr[i15] & 255));
            int min = Math.min(bArr[i15 + 2] & 255, 88);
            int i19 = f21057n[min];
            int i20 = ((i10 * this.f21061d * i14) + i11) * 2;
            bArr2[i20] = (byte) (i18 & 255);
            bArr2[i20 + 1] = (byte) (i18 >> 8);
            for (int i21 = 0; i21 < i17 * 2; i21++) {
                byte b10 = bArr[((i21 / 8) * i14 * 4) + i16 + ((i21 / 2) % 4)];
                byte b11 = b10 & 255;
                if (i21 % 2 == 0) {
                    i12 = b10 & 15;
                } else {
                    i12 = b11 >> 4;
                }
                int i22 = ((((i12 & 7) * 2) + 1) * i19) >> 3;
                if ((i12 & 8) != 0) {
                    i22 = -i22;
                }
                i18 = L.o(i18 + i22, -32768, 32767);
                i20 += i14 * 2;
                bArr2[i20] = (byte) (i18 & 255);
                bArr2[i20 + 1] = (byte) (i18 >> 8);
                int i23 = min + f21056m[i12];
                int[] iArr = f21057n;
                min = L.o(i23, 0, iArr.length - 1);
                i19 = iArr[min];
            }
        }

        private int f(int i10) {
            return i10 / (this.f21060c.f21079b * 2);
        }

        private int g(int i10) {
            return h(i10, this.f21060c.f21079b);
        }

        private static int h(int i10, int i11) {
            return i10 * 2 * i11;
        }

        private void i(int i10) {
            long U02 = this.f21067j + L.U0(this.f21069l, 1000000, (long) this.f21060c.f21080c);
            int g10 = g(i10);
            this.f21059b.d(U02, 1, g10, this.f21068k - g10, (O.a) null);
            this.f21069l += (long) i10;
            this.f21068k -= g10;
        }

        public void a(int i10, long j10) {
            this.f21058a.u(new e(this.f21060c, this.f21061d, (long) i10, j10));
            this.f21059b.c(this.f21065h);
        }

        public void b(long j10) {
            this.f21066i = 0;
            this.f21067j = j10;
            this.f21068k = 0;
            this.f21069l = 0;
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0047  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x003e A[EDGE_INSN: B:22:0x003e->B:10:0x003e ?: BREAK  , SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:5:0x0020  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean c(z2.C2973q r7, long r8) {
            /*
                r6 = this;
                int r0 = r6.f21064g
                int r1 = r6.f21068k
                int r1 = r6.f(r1)
                int r0 = r0 - r1
                int r1 = r6.f21061d
                int r0 = i2.L.j(r0, r1)
                g3.c r1 = r6.f21060c
                int r1 = r1.f21082e
                int r0 = r0 * r1
                r1 = 0
                int r1 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
                r2 = 1
                if (r1 != 0) goto L_0x001d
            L_0x001b:
                r1 = r2
                goto L_0x001e
            L_0x001d:
                r1 = 0
            L_0x001e:
                if (r1 != 0) goto L_0x003e
                int r3 = r6.f21066i
                if (r3 >= r0) goto L_0x003e
                int r3 = r0 - r3
                long r3 = (long) r3
                long r3 = java.lang.Math.min(r3, r8)
                int r3 = (int) r3
                byte[] r4 = r6.f21062e
                int r5 = r6.f21066i
                int r3 = r7.read(r4, r5, r3)
                r4 = -1
                if (r3 != r4) goto L_0x0038
                goto L_0x001b
            L_0x0038:
                int r4 = r6.f21066i
                int r4 = r4 + r3
                r6.f21066i = r4
                goto L_0x001e
            L_0x003e:
                int r7 = r6.f21066i
                g3.c r8 = r6.f21060c
                int r8 = r8.f21082e
                int r7 = r7 / r8
                if (r7 <= 0) goto L_0x0075
                byte[] r8 = r6.f21062e
                i2.A r9 = r6.f21063f
                r6.d(r8, r7, r9)
                int r8 = r6.f21066i
                g3.c r9 = r6.f21060c
                int r9 = r9.f21082e
                int r7 = r7 * r9
                int r8 = r8 - r7
                r6.f21066i = r8
                i2.A r7 = r6.f21063f
                int r7 = r7.g()
                z2.O r8 = r6.f21059b
                i2.A r9 = r6.f21063f
                r8.f(r9, r7)
                int r8 = r6.f21068k
                int r8 = r8 + r7
                r6.f21068k = r8
                int r7 = r6.f(r8)
                int r8 = r6.f21064g
                if (r7 < r8) goto L_0x0075
                r6.i(r8)
            L_0x0075:
                if (r1 == 0) goto L_0x0082
                int r7 = r6.f21068k
                int r7 = r6.f(r7)
                if (r7 <= 0) goto L_0x0082
                r6.i(r7)
            L_0x0082:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: g3.C2011b.a.c(z2.q, long):boolean");
        }
    }

    /* renamed from: g3.b$b  reason: collision with other inner class name */
    private interface C0350b {
        void a(int i10, long j10);

        void b(long j10);

        boolean c(C2973q qVar, long j10);
    }

    /* renamed from: g3.b$c */
    private static final class c implements C0350b {

        /* renamed from: a  reason: collision with root package name */
        private final r f21070a;

        /* renamed from: b  reason: collision with root package name */
        private final O f21071b;

        /* renamed from: c  reason: collision with root package name */
        private final c f21072c;

        /* renamed from: d  reason: collision with root package name */
        private final s f21073d;

        /* renamed from: e  reason: collision with root package name */
        private final int f21074e;

        /* renamed from: f  reason: collision with root package name */
        private long f21075f;

        /* renamed from: g  reason: collision with root package name */
        private int f21076g;

        /* renamed from: h  reason: collision with root package name */
        private long f21077h;

        public c(r rVar, O o10, c cVar, String str, int i10) {
            this.f21070a = rVar;
            this.f21071b = o10;
            this.f21072c = cVar;
            int i11 = (cVar.f21079b * cVar.f21083f) / 8;
            if (cVar.f21082e == i11) {
                int i12 = cVar.f21080c;
                int i13 = i12 * i11 * 8;
                int max = Math.max(i11, (i12 * i11) / 10);
                this.f21074e = max;
                this.f21073d = new s.b().o0(str).M(i13).j0(i13).f0(max).N(cVar.f21079b).p0(cVar.f21080c).i0(i10).K();
                return;
            }
            throw C1961B.a("Expected block size: " + i11 + "; got: " + cVar.f21082e, (Throwable) null);
        }

        public void a(int i10, long j10) {
            this.f21070a.u(new e(this.f21072c, 1, (long) i10, j10));
            this.f21071b.c(this.f21073d);
        }

        public void b(long j10) {
            this.f21075f = j10;
            this.f21076g = 0;
            this.f21077h = 0;
        }

        public boolean c(C2973q qVar, long j10) {
            int i10;
            int i11;
            int i12;
            long j11 = j10;
            while (true) {
                i10 = (j11 > 0 ? 1 : (j11 == 0 ? 0 : -1));
                if (i10 <= 0 || (i11 = this.f21076g) >= (i12 = this.f21074e)) {
                    c cVar = this.f21072c;
                    int i13 = cVar.f21082e;
                    int i14 = this.f21076g / i13;
                } else {
                    int a10 = this.f21071b.a(qVar, (int) Math.min((long) (i12 - i11), j11), true);
                    if (a10 == -1) {
                        j11 = 0;
                    } else {
                        this.f21076g += a10;
                        j11 -= (long) a10;
                    }
                }
            }
            c cVar2 = this.f21072c;
            int i132 = cVar2.f21082e;
            int i142 = this.f21076g / i132;
            if (i142 > 0) {
                int i15 = i142 * i132;
                int i16 = this.f21076g - i15;
                this.f21071b.d(this.f21075f + L.U0(this.f21077h, 1000000, (long) cVar2.f21080c), 1, i15, i16, (O.a) null);
                this.f21077h += (long) i142;
                this.f21076g = i16;
            }
            if (i10 <= 0) {
                return true;
            }
            return false;
        }
    }

    private void c() {
        C2076a.i(this.f21050b);
        L.h(this.f21049a);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ C2972p[] d() {
        return new C2972p[]{new C2011b()};
    }

    private void e(C2973q qVar) {
        boolean z10;
        if (qVar.getPosition() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        C2076a.g(z10);
        int i10 = this.f21054f;
        if (i10 != -1) {
            qVar.j(i10);
            this.f21051c = 4;
        } else if (d.a(qVar)) {
            qVar.j((int) (qVar.g() - qVar.getPosition()));
            this.f21051c = 1;
        } else {
            throw C1961B.a("Unsupported or unrecognized wav file type.", (Throwable) null);
        }
    }

    private void g(C2973q qVar) {
        c b10 = d.b(qVar);
        int i10 = b10.f21078a;
        if (i10 == 17) {
            this.f21053e = new a(this.f21049a, this.f21050b, b10);
        } else if (i10 == 6) {
            this.f21053e = new c(this.f21049a, this.f21050b, b10, "audio/g711-alaw", -1);
        } else if (i10 == 7) {
            this.f21053e = new c(this.f21049a, this.f21050b, b10, "audio/g711-mlaw", -1);
        } else {
            int a10 = T.a(i10, b10.f21083f);
            if (a10 != 0) {
                this.f21053e = new c(this.f21049a, this.f21050b, b10, "audio/raw", a10);
            } else {
                throw C1961B.c("Unsupported WAV format type: " + b10.f21078a);
            }
        }
        this.f21051c = 3;
    }

    private void l(C2973q qVar) {
        this.f21052d = d.c(qVar);
        this.f21051c = 2;
    }

    private int m(C2973q qVar) {
        boolean z10;
        if (this.f21055g != -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        C2076a.g(z10);
        if (((C0350b) C2076a.e(this.f21053e)).c(qVar, this.f21055g - qVar.getPosition())) {
            return -1;
        }
        return 0;
    }

    private void n(C2973q qVar) {
        Pair e10 = d.e(qVar);
        this.f21054f = ((Long) e10.first).intValue();
        long longValue = ((Long) e10.second).longValue();
        long j10 = this.f21052d;
        if (j10 != -1 && longValue == 4294967295L) {
            longValue = j10;
        }
        this.f21055g = ((long) this.f21054f) + longValue;
        long a10 = qVar.a();
        if (a10 != -1 && this.f21055g > a10) {
            p.h("WavExtractor", "Data exceeds input length: " + this.f21055g + ", " + a10);
            this.f21055g = a10;
        }
        ((C0350b) C2076a.e(this.f21053e)).a(this.f21054f, this.f21055g);
        this.f21051c = 4;
    }

    public void a(long j10, long j11) {
        int i10;
        if (j10 == 0) {
            i10 = 0;
        } else {
            i10 = 4;
        }
        this.f21051c = i10;
        C0350b bVar = this.f21053e;
        if (bVar != null) {
            bVar.b(j11);
        }
    }

    public void f(r rVar) {
        this.f21049a = rVar;
        this.f21050b = rVar.d(0, 1);
        rVar.k();
    }

    public int i(C2973q qVar, I i10) {
        c();
        int i11 = this.f21051c;
        if (i11 == 0) {
            e(qVar);
            return 0;
        } else if (i11 == 1) {
            l(qVar);
            return 0;
        } else if (i11 == 2) {
            g(qVar);
            return 0;
        } else if (i11 == 3) {
            n(qVar);
            return 0;
        } else if (i11 == 4) {
            return m(qVar);
        } else {
            throw new IllegalStateException();
        }
    }

    public boolean j(C2973q qVar) {
        return d.a(qVar);
    }

    public void release() {
    }
}
