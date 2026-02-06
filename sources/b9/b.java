package B9;

import android.util.Pair;
import ja.B;
import ja.C3645a;
import ja.M;
import ja.s;
import k9.C3717q0;
import k9.L0;
import m9.K;
import q9.C3962B;
import q9.k;
import q9.l;
import q9.m;
import q9.p;
import q9.y;

public final class b implements k {

    /* renamed from: h  reason: collision with root package name */
    public static final p f29847h = new a();

    /* renamed from: a  reason: collision with root package name */
    private m f29848a;

    /* renamed from: b  reason: collision with root package name */
    private C3962B f29849b;

    /* renamed from: c  reason: collision with root package name */
    private int f29850c = 0;

    /* renamed from: d  reason: collision with root package name */
    private long f29851d = -1;

    /* renamed from: e  reason: collision with root package name */
    private C0500b f29852e;

    /* renamed from: f  reason: collision with root package name */
    private int f29853f = -1;

    /* renamed from: g  reason: collision with root package name */
    private long f29854g = -1;

    private static final class a implements C0500b {

        /* renamed from: m  reason: collision with root package name */
        private static final int[] f29855m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

        /* renamed from: n  reason: collision with root package name */
        private static final int[] f29856n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

        /* renamed from: a  reason: collision with root package name */
        private final m f29857a;

        /* renamed from: b  reason: collision with root package name */
        private final C3962B f29858b;

        /* renamed from: c  reason: collision with root package name */
        private final c f29859c;

        /* renamed from: d  reason: collision with root package name */
        private final int f29860d;

        /* renamed from: e  reason: collision with root package name */
        private final byte[] f29861e;

        /* renamed from: f  reason: collision with root package name */
        private final B f29862f;

        /* renamed from: g  reason: collision with root package name */
        private final int f29863g;

        /* renamed from: h  reason: collision with root package name */
        private final C3717q0 f29864h;

        /* renamed from: i  reason: collision with root package name */
        private int f29865i;

        /* renamed from: j  reason: collision with root package name */
        private long f29866j;

        /* renamed from: k  reason: collision with root package name */
        private int f29867k;

        /* renamed from: l  reason: collision with root package name */
        private long f29868l;

        public a(m mVar, C3962B b10, c cVar) {
            this.f29857a = mVar;
            this.f29858b = b10;
            this.f29859c = cVar;
            int max = Math.max(1, cVar.f29879c / 10);
            this.f29863g = max;
            B b11 = new B(cVar.f29883g);
            b11.v();
            int v10 = b11.v();
            this.f29860d = v10;
            int i10 = cVar.f29878b;
            int i11 = (((cVar.f29881e - (i10 * 4)) * 8) / (cVar.f29882f * i10)) + 1;
            if (v10 == i11) {
                int l10 = M.l(max, v10);
                this.f29861e = new byte[(cVar.f29881e * l10)];
                this.f29862f = new B(l10 * h(v10, i10));
                int i12 = ((cVar.f29879c * cVar.f29881e) * 8) / v10;
                this.f29864h = new C3717q0.b().e0("audio/raw").G(i12).Z(i12).W(h(max, i10)).H(cVar.f29878b).f0(cVar.f29879c).Y(2).E();
                return;
            }
            throw L0.a("Expected frames per block: " + i11 + "; got: " + v10, (Throwable) null);
        }

        private void d(byte[] bArr, int i10, B b10) {
            for (int i11 = 0; i11 < i10; i11++) {
                for (int i12 = 0; i12 < this.f29859c.f29878b; i12++) {
                    e(bArr, i11, i12, b10.d());
                }
            }
            int g10 = g(this.f29860d * i10);
            b10.P(0);
            b10.O(g10);
        }

        private void e(byte[] bArr, int i10, int i11, byte[] bArr2) {
            int i12;
            c cVar = this.f29859c;
            int i13 = cVar.f29881e;
            int i14 = cVar.f29878b;
            int i15 = (i10 * i13) + (i11 * 4);
            int i16 = (i14 * 4) + i15;
            int i17 = (i13 / i14) - 4;
            int i18 = (short) (((bArr[i15 + 1] & 255) << 8) | (bArr[i15] & 255));
            int min = Math.min(bArr[i15 + 2] & 255, 88);
            int i19 = f29856n[min];
            int i20 = ((i10 * this.f29860d * i14) + i11) * 2;
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
                i18 = M.q(i18 + i22, -32768, 32767);
                i20 += i14 * 2;
                bArr2[i20] = (byte) (i18 & 255);
                bArr2[i20 + 1] = (byte) (i18 >> 8);
                int i23 = min + f29855m[i12];
                int[] iArr = f29856n;
                min = M.q(i23, 0, iArr.length - 1);
                i19 = iArr[min];
            }
        }

        private int f(int i10) {
            return i10 / (this.f29859c.f29878b * 2);
        }

        private int g(int i10) {
            return h(i10, this.f29859c.f29878b);
        }

        private static int h(int i10, int i11) {
            return i10 * 2 * i11;
        }

        private void i(int i10) {
            long O02 = this.f29866j + M.O0(this.f29868l, 1000000, (long) this.f29859c.f29879c);
            int g10 = g(i10);
            this.f29858b.f(O02, 1, g10, this.f29867k - g10, (C3962B.a) null);
            this.f29868l += (long) i10;
            this.f29867k -= g10;
        }

        public void a(int i10, long j10) {
            this.f29857a.q(new e(this.f29859c, this.f29860d, (long) i10, j10));
            this.f29858b.c(this.f29864h);
        }

        public void b(long j10) {
            this.f29865i = 0;
            this.f29866j = j10;
            this.f29867k = 0;
            this.f29868l = 0;
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0047  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x003e A[EDGE_INSN: B:22:0x003e->B:10:0x003e ?: BREAK  , SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:5:0x0020  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean c(q9.l r7, long r8) {
            /*
                r6 = this;
                int r0 = r6.f29863g
                int r1 = r6.f29867k
                int r1 = r6.f(r1)
                int r0 = r0 - r1
                int r1 = r6.f29860d
                int r0 = ja.M.l(r0, r1)
                B9.c r1 = r6.f29859c
                int r1 = r1.f29881e
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
                int r3 = r6.f29865i
                if (r3 >= r0) goto L_0x003e
                int r3 = r0 - r3
                long r3 = (long) r3
                long r3 = java.lang.Math.min(r3, r8)
                int r3 = (int) r3
                byte[] r4 = r6.f29861e
                int r5 = r6.f29865i
                int r3 = r7.read(r4, r5, r3)
                r4 = -1
                if (r3 != r4) goto L_0x0038
                goto L_0x001b
            L_0x0038:
                int r4 = r6.f29865i
                int r4 = r4 + r3
                r6.f29865i = r4
                goto L_0x001e
            L_0x003e:
                int r7 = r6.f29865i
                B9.c r8 = r6.f29859c
                int r8 = r8.f29881e
                int r7 = r7 / r8
                if (r7 <= 0) goto L_0x0075
                byte[] r8 = r6.f29861e
                ja.B r9 = r6.f29862f
                r6.d(r8, r7, r9)
                int r8 = r6.f29865i
                B9.c r9 = r6.f29859c
                int r9 = r9.f29881e
                int r7 = r7 * r9
                int r8 = r8 - r7
                r6.f29865i = r8
                ja.B r7 = r6.f29862f
                int r7 = r7.f()
                q9.B r8 = r6.f29858b
                ja.B r9 = r6.f29862f
                r8.d(r9, r7)
                int r8 = r6.f29867k
                int r8 = r8 + r7
                r6.f29867k = r8
                int r7 = r6.f(r8)
                int r8 = r6.f29863g
                if (r7 < r8) goto L_0x0075
                r6.i(r8)
            L_0x0075:
                if (r1 == 0) goto L_0x0082
                int r7 = r6.f29867k
                int r7 = r6.f(r7)
                if (r7 <= 0) goto L_0x0082
                r6.i(r7)
            L_0x0082:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: B9.b.a.c(q9.l, long):boolean");
        }
    }

    /* renamed from: B9.b$b  reason: collision with other inner class name */
    private interface C0500b {
        void a(int i10, long j10);

        void b(long j10);

        boolean c(l lVar, long j10);
    }

    private static final class c implements C0500b {

        /* renamed from: a  reason: collision with root package name */
        private final m f29869a;

        /* renamed from: b  reason: collision with root package name */
        private final C3962B f29870b;

        /* renamed from: c  reason: collision with root package name */
        private final c f29871c;

        /* renamed from: d  reason: collision with root package name */
        private final C3717q0 f29872d;

        /* renamed from: e  reason: collision with root package name */
        private final int f29873e;

        /* renamed from: f  reason: collision with root package name */
        private long f29874f;

        /* renamed from: g  reason: collision with root package name */
        private int f29875g;

        /* renamed from: h  reason: collision with root package name */
        private long f29876h;

        public c(m mVar, C3962B b10, c cVar, String str, int i10) {
            this.f29869a = mVar;
            this.f29870b = b10;
            this.f29871c = cVar;
            int i11 = (cVar.f29878b * cVar.f29882f) / 8;
            if (cVar.f29881e == i11) {
                int i12 = cVar.f29879c;
                int i13 = i12 * i11 * 8;
                int max = Math.max(i11, (i12 * i11) / 10);
                this.f29873e = max;
                this.f29872d = new C3717q0.b().e0(str).G(i13).Z(i13).W(max).H(cVar.f29878b).f0(cVar.f29879c).Y(i10).E();
                return;
            }
            throw L0.a("Expected block size: " + i11 + "; got: " + cVar.f29881e, (Throwable) null);
        }

        public void a(int i10, long j10) {
            this.f29869a.q(new e(this.f29871c, 1, (long) i10, j10));
            this.f29870b.c(this.f29872d);
        }

        public void b(long j10) {
            this.f29874f = j10;
            this.f29875g = 0;
            this.f29876h = 0;
        }

        public boolean c(l lVar, long j10) {
            int i10;
            int i11;
            int i12;
            long j11 = j10;
            while (true) {
                i10 = (j11 > 0 ? 1 : (j11 == 0 ? 0 : -1));
                if (i10 <= 0 || (i11 = this.f29875g) >= (i12 = this.f29873e)) {
                    c cVar = this.f29871c;
                    int i13 = cVar.f29881e;
                    int i14 = this.f29875g / i13;
                } else {
                    int a10 = this.f29870b.a(lVar, (int) Math.min((long) (i12 - i11), j11), true);
                    if (a10 == -1) {
                        j11 = 0;
                    } else {
                        this.f29875g += a10;
                        j11 -= (long) a10;
                    }
                }
            }
            c cVar2 = this.f29871c;
            int i132 = cVar2.f29881e;
            int i142 = this.f29875g / i132;
            if (i142 > 0) {
                int i15 = i142 * i132;
                int i16 = this.f29875g - i15;
                this.f29870b.f(this.f29874f + M.O0(this.f29876h, 1000000, (long) cVar2.f29879c), 1, i15, i16, (C3962B.a) null);
                this.f29876h += (long) i142;
                this.f29875g = i16;
            }
            if (i10 <= 0) {
                return true;
            }
            return false;
        }
    }

    private void c() {
        C3645a.h(this.f29849b);
        M.j(this.f29848a);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ k[] d() {
        return new k[]{new b()};
    }

    private void e(l lVar) {
        boolean z10;
        if (lVar.getPosition() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        C3645a.f(z10);
        int i10 = this.f29853f;
        if (i10 != -1) {
            lVar.j(i10);
            this.f29850c = 4;
        } else if (d.a(lVar)) {
            lVar.j((int) (lVar.g() - lVar.getPosition()));
            this.f29850c = 1;
        } else {
            throw L0.a("Unsupported or unrecognized wav file type.", (Throwable) null);
        }
    }

    private void g(l lVar) {
        c b10 = d.b(lVar);
        int i10 = b10.f29877a;
        if (i10 == 17) {
            this.f29852e = new a(this.f29848a, this.f29849b, b10);
        } else if (i10 == 6) {
            this.f29852e = new c(this.f29848a, this.f29849b, b10, "audio/g711-alaw", -1);
        } else if (i10 == 7) {
            this.f29852e = new c(this.f29848a, this.f29849b, b10, "audio/g711-mlaw", -1);
        } else {
            int a10 = K.a(i10, b10.f29882f);
            if (a10 != 0) {
                this.f29852e = new c(this.f29848a, this.f29849b, b10, "audio/raw", a10);
            } else {
                throw L0.d("Unsupported WAV format type: " + b10.f29877a);
            }
        }
        this.f29850c = 3;
    }

    private void j(l lVar) {
        this.f29851d = d.c(lVar);
        this.f29850c = 2;
    }

    private int k(l lVar) {
        boolean z10;
        if (this.f29854g != -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        C3645a.f(z10);
        if (((C0500b) C3645a.e(this.f29852e)).c(lVar, this.f29854g - lVar.getPosition())) {
            return -1;
        }
        return 0;
    }

    private void l(l lVar) {
        Pair e10 = d.e(lVar);
        this.f29853f = ((Long) e10.first).intValue();
        long longValue = ((Long) e10.second).longValue();
        long j10 = this.f29851d;
        if (j10 != -1 && longValue == 4294967295L) {
            longValue = j10;
        }
        this.f29854g = ((long) this.f29853f) + longValue;
        long a10 = lVar.a();
        if (a10 != -1 && this.f29854g > a10) {
            s.i("WavExtractor", "Data exceeds input length: " + this.f29854g + ", " + a10);
            this.f29854g = a10;
        }
        ((C0500b) C3645a.e(this.f29852e)).a(this.f29853f, this.f29854g);
        this.f29850c = 4;
    }

    public void a(long j10, long j11) {
        int i10;
        if (j10 == 0) {
            i10 = 0;
        } else {
            i10 = 4;
        }
        this.f29850c = i10;
        C0500b bVar = this.f29852e;
        if (bVar != null) {
            bVar.b(j11);
        }
    }

    public void f(m mVar) {
        this.f29848a = mVar;
        this.f29849b = mVar.d(0, 1);
        mVar.k();
    }

    public boolean h(l lVar) {
        return d.a(lVar);
    }

    public int i(l lVar, y yVar) {
        c();
        int i10 = this.f29850c;
        if (i10 == 0) {
            e(lVar);
            return 0;
        } else if (i10 == 1) {
            j(lVar);
            return 0;
        } else if (i10 == 2) {
            g(lVar);
            return 0;
        } else if (i10 == 3) {
            l(lVar);
            return 0;
        } else if (i10 == 4) {
            return k(lVar);
        } else {
            throw new IllegalStateException();
        }
    }

    public void release() {
    }
}
