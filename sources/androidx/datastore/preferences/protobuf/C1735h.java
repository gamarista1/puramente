package androidx.datastore.preferences.protobuf;

import com.google.android.gms.common.api.a;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: androidx.datastore.preferences.protobuf.h  reason: case insensitive filesystem */
public abstract class C1735h {

    /* renamed from: a  reason: collision with root package name */
    int f16338a;

    /* renamed from: b  reason: collision with root package name */
    int f16339b;

    /* renamed from: c  reason: collision with root package name */
    int f16340c;

    /* renamed from: d  reason: collision with root package name */
    C1736i f16341d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f16342e;

    /* renamed from: androidx.datastore.preferences.protobuf.h$b */
    private static final class b extends C1735h {

        /* renamed from: f  reason: collision with root package name */
        private final byte[] f16343f;

        /* renamed from: g  reason: collision with root package name */
        private final boolean f16344g;

        /* renamed from: h  reason: collision with root package name */
        private int f16345h;

        /* renamed from: i  reason: collision with root package name */
        private int f16346i;

        /* renamed from: j  reason: collision with root package name */
        private int f16347j;

        /* renamed from: k  reason: collision with root package name */
        private int f16348k;

        /* renamed from: l  reason: collision with root package name */
        private int f16349l;

        /* renamed from: m  reason: collision with root package name */
        private boolean f16350m;

        /* renamed from: n  reason: collision with root package name */
        private int f16351n;

        private void M() {
            int i10 = this.f16345h + this.f16346i;
            this.f16345h = i10;
            int i11 = i10 - this.f16348k;
            int i12 = this.f16351n;
            if (i11 > i12) {
                int i13 = i11 - i12;
                this.f16346i = i13;
                this.f16345h = i10 - i13;
                return;
            }
            this.f16346i = 0;
        }

        private void P() {
            if (this.f16345h - this.f16347j >= 10) {
                Q();
            } else {
                R();
            }
        }

        private void Q() {
            int i10 = 0;
            while (i10 < 10) {
                byte[] bArr = this.f16343f;
                int i11 = this.f16347j;
                this.f16347j = i11 + 1;
                if (bArr[i11] < 0) {
                    i10++;
                } else {
                    return;
                }
            }
            throw C1752z.e();
        }

        private void R() {
            int i10 = 0;
            while (i10 < 10) {
                if (F() < 0) {
                    i10++;
                } else {
                    return;
                }
            }
            throw C1752z.e();
        }

        public String A() {
            int J10 = J();
            if (J10 > 0) {
                int i10 = this.f16345h;
                int i11 = this.f16347j;
                if (J10 <= i10 - i11) {
                    String e10 = q0.e(this.f16343f, i11, J10);
                    this.f16347j += J10;
                    return e10;
                }
            }
            if (J10 == 0) {
                return "";
            }
            if (J10 <= 0) {
                throw C1752z.f();
            }
            throw C1752z.k();
        }

        public int B() {
            if (e()) {
                this.f16349l = 0;
                return 0;
            }
            int J10 = J();
            this.f16349l = J10;
            if (r0.a(J10) != 0) {
                return this.f16349l;
            }
            throw C1752z.b();
        }

        public int C() {
            return J();
        }

        public long D() {
            return K();
        }

        public boolean E(int i10) {
            int b10 = r0.b(i10);
            if (b10 == 0) {
                P();
                return true;
            } else if (b10 == 1) {
                O(8);
                return true;
            } else if (b10 == 2) {
                O(J());
                return true;
            } else if (b10 == 3) {
                N();
                a(r0.c(r0.a(i10), 4));
                return true;
            } else if (b10 == 4) {
                return false;
            } else {
                if (b10 == 5) {
                    O(4);
                    return true;
                }
                throw C1752z.d();
            }
        }

        public byte F() {
            int i10 = this.f16347j;
            if (i10 != this.f16345h) {
                byte[] bArr = this.f16343f;
                this.f16347j = i10 + 1;
                return bArr[i10];
            }
            throw C1752z.k();
        }

        public byte[] G(int i10) {
            if (i10 > 0) {
                int i11 = this.f16345h;
                int i12 = this.f16347j;
                if (i10 <= i11 - i12) {
                    int i13 = i10 + i12;
                    this.f16347j = i13;
                    return Arrays.copyOfRange(this.f16343f, i12, i13);
                }
            }
            if (i10 > 0) {
                throw C1752z.k();
            } else if (i10 == 0) {
                return C1751y.f16574c;
            } else {
                throw C1752z.f();
            }
        }

        public int H() {
            int i10 = this.f16347j;
            if (this.f16345h - i10 >= 4) {
                byte[] bArr = this.f16343f;
                this.f16347j = i10 + 4;
                return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
            }
            throw C1752z.k();
        }

        public long I() {
            int i10 = this.f16347j;
            if (this.f16345h - i10 >= 8) {
                byte[] bArr = this.f16343f;
                this.f16347j = i10 + 8;
                return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
            }
            throw C1752z.k();
        }

        public int J() {
            byte b10;
            byte b11;
            int i10 = this.f16347j;
            int i11 = this.f16345h;
            if (i11 != i10) {
                byte[] bArr = this.f16343f;
                int i12 = i10 + 1;
                byte b12 = bArr[i10];
                if (b12 >= 0) {
                    this.f16347j = i12;
                    return b12;
                } else if (i11 - i12 >= 9) {
                    int i13 = i10 + 2;
                    byte b13 = (bArr[i12] << 7) ^ b12;
                    if (b13 < 0) {
                        b10 = b13 ^ Byte.MIN_VALUE;
                    } else {
                        int i14 = i10 + 3;
                        byte b14 = (bArr[i13] << 14) ^ b13;
                        if (b14 >= 0) {
                            b11 = b14 ^ 16256;
                        } else {
                            int i15 = i10 + 4;
                            byte b15 = b14 ^ (bArr[i14] << 21);
                            if (b15 < 0) {
                                b10 = -2080896 ^ b15;
                            } else {
                                i14 = i10 + 5;
                                byte b16 = bArr[i15];
                                byte b17 = (b15 ^ (b16 << 28)) ^ 266354560;
                                if (b16 < 0) {
                                    i15 = i10 + 6;
                                    if (bArr[i14] < 0) {
                                        i14 = i10 + 7;
                                        if (bArr[i15] < 0) {
                                            i15 = i10 + 8;
                                            if (bArr[i14] < 0) {
                                                i14 = i10 + 9;
                                                if (bArr[i15] < 0) {
                                                    int i16 = i10 + 10;
                                                    if (bArr[i14] >= 0) {
                                                        byte b18 = b17;
                                                        i13 = i16;
                                                        b10 = b18;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    b10 = b17;
                                }
                                b11 = b17;
                            }
                            i13 = i15;
                        }
                        i13 = i14;
                    }
                    this.f16347j = i13;
                    return b10;
                }
            }
            return (int) L();
        }

        public long K() {
            long j10;
            long j11;
            long j12;
            int i10 = this.f16347j;
            int i11 = this.f16345h;
            if (i11 != i10) {
                byte[] bArr = this.f16343f;
                int i12 = i10 + 1;
                byte b10 = bArr[i10];
                if (b10 >= 0) {
                    this.f16347j = i12;
                    return (long) b10;
                } else if (i11 - i12 >= 9) {
                    int i13 = i10 + 2;
                    byte b11 = (bArr[i12] << 7) ^ b10;
                    if (b11 < 0) {
                        j10 = (long) (b11 ^ Byte.MIN_VALUE);
                    } else {
                        int i14 = i10 + 3;
                        byte b12 = (bArr[i13] << 14) ^ b11;
                        if (b12 >= 0) {
                            j10 = (long) (b12 ^ 16256);
                            i13 = i14;
                        } else {
                            int i15 = i10 + 4;
                            byte b13 = b12 ^ (bArr[i14] << 21);
                            if (b13 < 0) {
                                i13 = i15;
                                j10 = (long) (-2080896 ^ b13);
                            } else {
                                long j13 = (long) b13;
                                int i16 = i10 + 5;
                                long j14 = j13 ^ (((long) bArr[i15]) << 28);
                                if (j14 >= 0) {
                                    j12 = 266354560;
                                } else {
                                    int i17 = i10 + 6;
                                    long j15 = j14 ^ (((long) bArr[i16]) << 35);
                                    if (j15 < 0) {
                                        j11 = -34093383808L;
                                    } else {
                                        i16 = i10 + 7;
                                        j14 = j15 ^ (((long) bArr[i17]) << 42);
                                        if (j14 >= 0) {
                                            j12 = 4363953127296L;
                                        } else {
                                            i17 = i10 + 8;
                                            j15 = j14 ^ (((long) bArr[i16]) << 49);
                                            if (j15 < 0) {
                                                j11 = -558586000294016L;
                                            } else {
                                                i13 = i10 + 9;
                                                long j16 = (j15 ^ (((long) bArr[i17]) << 56)) ^ 71499008037633920L;
                                                if (j16 < 0) {
                                                    int i18 = i10 + 10;
                                                    if (((long) bArr[i13]) >= 0) {
                                                        i13 = i18;
                                                    }
                                                }
                                                j10 = j16;
                                            }
                                        }
                                    }
                                    j10 = j15 ^ j11;
                                    i13 = i17;
                                }
                                j10 = j14 ^ j12;
                            }
                        }
                    }
                    this.f16347j = i13;
                    return j10;
                }
            }
            return L();
        }

        /* access modifiers changed from: package-private */
        public long L() {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                byte F10 = F();
                j10 |= ((long) (F10 & Byte.MAX_VALUE)) << i10;
                if ((F10 & 128) == 0) {
                    return j10;
                }
            }
            throw C1752z.e();
        }

        /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: 
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        public void N() {
            /*
                r1 = this;
            L_0x0000:
                int r0 = r1.B()
                if (r0 == 0) goto L_0x000c
                boolean r0 = r1.E(r0)
                if (r0 != 0) goto L_0x0000
            L_0x000c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C1735h.b.N():void");
        }

        public void O(int i10) {
            if (i10 >= 0) {
                int i11 = this.f16345h;
                int i12 = this.f16347j;
                if (i10 <= i11 - i12) {
                    this.f16347j = i12 + i10;
                    return;
                }
            }
            if (i10 < 0) {
                throw C1752z.f();
            }
            throw C1752z.k();
        }

        public void a(int i10) {
            if (this.f16349l != i10) {
                throw C1752z.a();
            }
        }

        public int d() {
            return this.f16347j - this.f16348k;
        }

        public boolean e() {
            if (this.f16347j == this.f16345h) {
                return true;
            }
            return false;
        }

        public void k(int i10) {
            this.f16351n = i10;
            M();
        }

        public int l(int i10) {
            if (i10 >= 0) {
                int d10 = i10 + d();
                int i11 = this.f16351n;
                if (d10 <= i11) {
                    this.f16351n = d10;
                    M();
                    return i11;
                }
                throw C1752z.k();
            }
            throw C1752z.f();
        }

        public boolean m() {
            if (K() != 0) {
                return true;
            }
            return false;
        }

        public C1734g n() {
            C1734g gVar;
            int J10 = J();
            if (J10 > 0) {
                int i10 = this.f16345h;
                int i11 = this.f16347j;
                if (J10 <= i10 - i11) {
                    if (!this.f16344g || !this.f16350m) {
                        gVar = C1734g.k(this.f16343f, i11, J10);
                    } else {
                        gVar = C1734g.P(this.f16343f, i11, J10);
                    }
                    this.f16347j += J10;
                    return gVar;
                }
            }
            if (J10 == 0) {
                return C1734g.f16324b;
            }
            return C1734g.N(G(J10));
        }

        public double o() {
            return Double.longBitsToDouble(I());
        }

        public int p() {
            return J();
        }

        public int q() {
            return H();
        }

        public long r() {
            return I();
        }

        public float s() {
            return Float.intBitsToFloat(H());
        }

        public int t() {
            return J();
        }

        public long u() {
            return K();
        }

        public int v() {
            return H();
        }

        public long w() {
            return I();
        }

        public int x() {
            return C1735h.b(J());
        }

        public long y() {
            return C1735h.c(K());
        }

        public String z() {
            int J10 = J();
            if (J10 > 0) {
                int i10 = this.f16345h;
                int i11 = this.f16347j;
                if (J10 <= i10 - i11) {
                    String str = new String(this.f16343f, i11, J10, C1751y.f16572a);
                    this.f16347j += J10;
                    return str;
                }
            }
            if (J10 == 0) {
                return "";
            }
            if (J10 < 0) {
                throw C1752z.f();
            }
            throw C1752z.k();
        }

        private b(byte[] bArr, int i10, int i11, boolean z10) {
            super();
            this.f16351n = a.e.API_PRIORITY_OTHER;
            this.f16343f = bArr;
            this.f16345h = i11 + i10;
            this.f16347j = i10;
            this.f16348k = i10;
            this.f16344g = z10;
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.h$c */
    private static final class c extends C1735h {

        /* renamed from: f  reason: collision with root package name */
        private final InputStream f16352f;

        /* renamed from: g  reason: collision with root package name */
        private final byte[] f16353g;

        /* renamed from: h  reason: collision with root package name */
        private int f16354h;

        /* renamed from: i  reason: collision with root package name */
        private int f16355i;

        /* renamed from: j  reason: collision with root package name */
        private int f16356j;

        /* renamed from: k  reason: collision with root package name */
        private int f16357k;

        /* renamed from: l  reason: collision with root package name */
        private int f16358l;

        /* renamed from: m  reason: collision with root package name */
        private int f16359m;

        private C1734g F(int i10) {
            byte[] I10 = I(i10);
            if (I10 != null) {
                return C1734g.h(I10);
            }
            int i11 = this.f16356j;
            int i12 = this.f16354h;
            int i13 = i12 - i11;
            this.f16358l += i12;
            this.f16356j = 0;
            this.f16354h = 0;
            List<byte[]> J10 = J(i10 - i13);
            byte[] bArr = new byte[i10];
            System.arraycopy(this.f16353g, i11, bArr, 0, i13);
            for (byte[] bArr2 : J10) {
                System.arraycopy(bArr2, 0, bArr, i13, bArr2.length);
                i13 += bArr2.length;
            }
            return C1734g.N(bArr);
        }

        private byte[] H(int i10, boolean z10) {
            byte[] I10 = I(i10);
            if (I10 == null) {
                int i11 = this.f16356j;
                int i12 = this.f16354h;
                int i13 = i12 - i11;
                this.f16358l += i12;
                this.f16356j = 0;
                this.f16354h = 0;
                List<byte[]> J10 = J(i10 - i13);
                byte[] bArr = new byte[i10];
                System.arraycopy(this.f16353g, i11, bArr, 0, i13);
                for (byte[] bArr2 : J10) {
                    System.arraycopy(bArr2, 0, bArr, i13, bArr2.length);
                    i13 += bArr2.length;
                }
                return bArr;
            } else if (z10) {
                return (byte[]) I10.clone();
            } else {
                return I10;
            }
        }

        private byte[] I(int i10) {
            if (i10 == 0) {
                return C1751y.f16574c;
            }
            if (i10 >= 0) {
                int i11 = this.f16358l;
                int i12 = this.f16356j;
                int i13 = i11 + i12 + i10;
                if (i13 - this.f16340c <= 0) {
                    int i14 = this.f16359m;
                    if (i13 <= i14) {
                        int i15 = this.f16354h - i12;
                        int i16 = i10 - i15;
                        if (i16 >= 4096 && i16 > this.f16352f.available()) {
                            return null;
                        }
                        byte[] bArr = new byte[i10];
                        System.arraycopy(this.f16353g, this.f16356j, bArr, 0, i15);
                        this.f16358l += this.f16354h;
                        this.f16356j = 0;
                        this.f16354h = 0;
                        while (i15 < i10) {
                            int read = this.f16352f.read(bArr, i15, i10 - i15);
                            if (read != -1) {
                                this.f16358l += read;
                                i15 += read;
                            } else {
                                throw C1752z.k();
                            }
                        }
                        return bArr;
                    }
                    S((i14 - i11) - i12);
                    throw C1752z.k();
                }
                throw C1752z.j();
            }
            throw C1752z.f();
        }

        private List J(int i10) {
            ArrayList arrayList = new ArrayList();
            while (i10 > 0) {
                int min = Math.min(i10, 4096);
                byte[] bArr = new byte[min];
                int i11 = 0;
                while (i11 < min) {
                    int read = this.f16352f.read(bArr, i11, min - i11);
                    if (read != -1) {
                        this.f16358l += read;
                        i11 += read;
                    } else {
                        throw C1752z.k();
                    }
                }
                i10 -= min;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        private void P() {
            int i10 = this.f16354h + this.f16355i;
            this.f16354h = i10;
            int i11 = this.f16358l + i10;
            int i12 = this.f16359m;
            if (i11 > i12) {
                int i13 = i11 - i12;
                this.f16355i = i13;
                this.f16354h = i10 - i13;
                return;
            }
            this.f16355i = 0;
        }

        private void Q(int i10) {
            if (X(i10)) {
                return;
            }
            if (i10 > (this.f16340c - this.f16358l) - this.f16356j) {
                throw C1752z.j();
            }
            throw C1752z.k();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0057, code lost:
            throw new java.lang.IllegalStateException(r7.f16352f.getClass() + "#skip returned invalid result: " + r1 + "\nThe InputStream implementation is buggy.");
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void T(int r8) {
            /*
                r7 = this;
                if (r8 < 0) goto L_0x0092
                int r0 = r7.f16358l
                int r1 = r7.f16356j
                int r2 = r0 + r1
                int r2 = r2 + r8
                int r3 = r7.f16359m
                if (r2 > r3) goto L_0x0088
                int r0 = r0 + r1
                r7.f16358l = r0
                int r0 = r7.f16354h
                int r0 = r0 - r1
                r1 = 0
                r7.f16354h = r1
                r7.f16356j = r1
            L_0x0018:
                if (r0 >= r8) goto L_0x0062
                int r1 = r8 - r0
                java.io.InputStream r2 = r7.f16352f     // Catch:{ all -> 0x0058 }
                long r3 = (long) r1     // Catch:{ all -> 0x0058 }
                long r1 = r2.skip(r3)     // Catch:{ all -> 0x0058 }
                r5 = 0
                int r5 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
                if (r5 < 0) goto L_0x0033
                int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r3 > 0) goto L_0x0033
                if (r5 != 0) goto L_0x0030
                goto L_0x0062
            L_0x0030:
                int r1 = (int) r1     // Catch:{ all -> 0x0058 }
                int r0 = r0 + r1
                goto L_0x0018
            L_0x0033:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0058 }
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0058 }
                r3.<init>()     // Catch:{ all -> 0x0058 }
                java.io.InputStream r4 = r7.f16352f     // Catch:{ all -> 0x0058 }
                java.lang.Class r4 = r4.getClass()     // Catch:{ all -> 0x0058 }
                r3.append(r4)     // Catch:{ all -> 0x0058 }
                java.lang.String r4 = "#skip returned invalid result: "
                r3.append(r4)     // Catch:{ all -> 0x0058 }
                r3.append(r1)     // Catch:{ all -> 0x0058 }
                java.lang.String r1 = "\nThe InputStream implementation is buggy."
                r3.append(r1)     // Catch:{ all -> 0x0058 }
                java.lang.String r1 = r3.toString()     // Catch:{ all -> 0x0058 }
                r8.<init>(r1)     // Catch:{ all -> 0x0058 }
                throw r8     // Catch:{ all -> 0x0058 }
            L_0x0058:
                r8 = move-exception
                int r1 = r7.f16358l
                int r1 = r1 + r0
                r7.f16358l = r1
                r7.P()
                throw r8
            L_0x0062:
                int r1 = r7.f16358l
                int r1 = r1 + r0
                r7.f16358l = r1
                r7.P()
                if (r0 >= r8) goto L_0x0087
                int r0 = r7.f16354h
                int r1 = r7.f16356j
                int r1 = r0 - r1
                r7.f16356j = r0
                r0 = 1
                r7.Q(r0)
            L_0x0078:
                int r2 = r8 - r1
                int r3 = r7.f16354h
                if (r2 <= r3) goto L_0x0085
                int r1 = r1 + r3
                r7.f16356j = r3
                r7.Q(r0)
                goto L_0x0078
            L_0x0085:
                r7.f16356j = r2
            L_0x0087:
                return
            L_0x0088:
                int r3 = r3 - r0
                int r3 = r3 - r1
                r7.S(r3)
                androidx.datastore.preferences.protobuf.z r8 = androidx.datastore.preferences.protobuf.C1752z.k()
                throw r8
            L_0x0092:
                androidx.datastore.preferences.protobuf.z r8 = androidx.datastore.preferences.protobuf.C1752z.f()
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C1735h.c.T(int):void");
        }

        private void U() {
            if (this.f16354h - this.f16356j >= 10) {
                V();
            } else {
                W();
            }
        }

        private void V() {
            int i10 = 0;
            while (i10 < 10) {
                byte[] bArr = this.f16353g;
                int i11 = this.f16356j;
                this.f16356j = i11 + 1;
                if (bArr[i11] < 0) {
                    i10++;
                } else {
                    return;
                }
            }
            throw C1752z.e();
        }

        private void W() {
            int i10 = 0;
            while (i10 < 10) {
                if (G() < 0) {
                    i10++;
                } else {
                    return;
                }
            }
            throw C1752z.e();
        }

        private boolean X(int i10) {
            int i11 = this.f16356j;
            int i12 = i11 + i10;
            int i13 = this.f16354h;
            if (i12 > i13) {
                int i14 = this.f16340c;
                int i15 = this.f16358l;
                if (i10 > (i14 - i15) - i11 || i15 + i11 + i10 > this.f16359m) {
                    return false;
                }
                if (i11 > 0) {
                    if (i13 > i11) {
                        byte[] bArr = this.f16353g;
                        System.arraycopy(bArr, i11, bArr, 0, i13 - i11);
                    }
                    this.f16358l += i11;
                    this.f16354h -= i11;
                    this.f16356j = 0;
                }
                InputStream inputStream = this.f16352f;
                byte[] bArr2 = this.f16353g;
                int i16 = this.f16354h;
                int read = inputStream.read(bArr2, i16, Math.min(bArr2.length - i16, (this.f16340c - this.f16358l) - i16));
                if (read == 0 || read < -1 || read > this.f16353g.length) {
                    throw new IllegalStateException(this.f16352f.getClass() + "#read(byte[]) returned invalid result: " + read + "\nThe InputStream implementation is buggy.");
                } else if (read <= 0) {
                    return false;
                } else {
                    this.f16354h += read;
                    P();
                    if (this.f16354h >= i10) {
                        return true;
                    }
                    return X(i10);
                }
            } else {
                throw new IllegalStateException("refillBuffer() called when " + i10 + " bytes were already available in buffer");
            }
        }

        public String A() {
            byte[] bArr;
            int M10 = M();
            int i10 = this.f16356j;
            int i11 = this.f16354h;
            if (M10 <= i11 - i10 && M10 > 0) {
                bArr = this.f16353g;
                this.f16356j = i10 + M10;
            } else if (M10 == 0) {
                return "";
            } else {
                i10 = 0;
                if (M10 <= i11) {
                    Q(M10);
                    bArr = this.f16353g;
                    this.f16356j = M10;
                } else {
                    bArr = H(M10, false);
                }
            }
            return q0.e(bArr, i10, M10);
        }

        public int B() {
            if (e()) {
                this.f16357k = 0;
                return 0;
            }
            int M10 = M();
            this.f16357k = M10;
            if (r0.a(M10) != 0) {
                return this.f16357k;
            }
            throw C1752z.b();
        }

        public int C() {
            return M();
        }

        public long D() {
            return N();
        }

        public boolean E(int i10) {
            int b10 = r0.b(i10);
            if (b10 == 0) {
                U();
                return true;
            } else if (b10 == 1) {
                S(8);
                return true;
            } else if (b10 == 2) {
                S(M());
                return true;
            } else if (b10 == 3) {
                R();
                a(r0.c(r0.a(i10), 4));
                return true;
            } else if (b10 == 4) {
                return false;
            } else {
                if (b10 == 5) {
                    S(4);
                    return true;
                }
                throw C1752z.d();
            }
        }

        public byte G() {
            if (this.f16356j == this.f16354h) {
                Q(1);
            }
            byte[] bArr = this.f16353g;
            int i10 = this.f16356j;
            this.f16356j = i10 + 1;
            return bArr[i10];
        }

        public int K() {
            int i10 = this.f16356j;
            if (this.f16354h - i10 < 4) {
                Q(4);
                i10 = this.f16356j;
            }
            byte[] bArr = this.f16353g;
            this.f16356j = i10 + 4;
            return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
        }

        public long L() {
            int i10 = this.f16356j;
            if (this.f16354h - i10 < 8) {
                Q(8);
                i10 = this.f16356j;
            }
            byte[] bArr = this.f16353g;
            this.f16356j = i10 + 8;
            return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
        }

        public int M() {
            byte b10;
            byte b11;
            int i10 = this.f16356j;
            int i11 = this.f16354h;
            if (i11 != i10) {
                byte[] bArr = this.f16353g;
                int i12 = i10 + 1;
                byte b12 = bArr[i10];
                if (b12 >= 0) {
                    this.f16356j = i12;
                    return b12;
                } else if (i11 - i12 >= 9) {
                    int i13 = i10 + 2;
                    byte b13 = (bArr[i12] << 7) ^ b12;
                    if (b13 < 0) {
                        b10 = b13 ^ Byte.MIN_VALUE;
                    } else {
                        int i14 = i10 + 3;
                        byte b14 = (bArr[i13] << 14) ^ b13;
                        if (b14 >= 0) {
                            b11 = b14 ^ 16256;
                        } else {
                            int i15 = i10 + 4;
                            byte b15 = b14 ^ (bArr[i14] << 21);
                            if (b15 < 0) {
                                b10 = -2080896 ^ b15;
                            } else {
                                i14 = i10 + 5;
                                byte b16 = bArr[i15];
                                byte b17 = (b15 ^ (b16 << 28)) ^ 266354560;
                                if (b16 < 0) {
                                    i15 = i10 + 6;
                                    if (bArr[i14] < 0) {
                                        i14 = i10 + 7;
                                        if (bArr[i15] < 0) {
                                            i15 = i10 + 8;
                                            if (bArr[i14] < 0) {
                                                i14 = i10 + 9;
                                                if (bArr[i15] < 0) {
                                                    int i16 = i10 + 10;
                                                    if (bArr[i14] >= 0) {
                                                        byte b18 = b17;
                                                        i13 = i16;
                                                        b10 = b18;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    b10 = b17;
                                }
                                b11 = b17;
                            }
                            i13 = i15;
                        }
                        i13 = i14;
                    }
                    this.f16356j = i13;
                    return b10;
                }
            }
            return (int) O();
        }

        public long N() {
            long j10;
            long j11;
            long j12;
            int i10 = this.f16356j;
            int i11 = this.f16354h;
            if (i11 != i10) {
                byte[] bArr = this.f16353g;
                int i12 = i10 + 1;
                byte b10 = bArr[i10];
                if (b10 >= 0) {
                    this.f16356j = i12;
                    return (long) b10;
                } else if (i11 - i12 >= 9) {
                    int i13 = i10 + 2;
                    byte b11 = (bArr[i12] << 7) ^ b10;
                    if (b11 < 0) {
                        j10 = (long) (b11 ^ Byte.MIN_VALUE);
                    } else {
                        int i14 = i10 + 3;
                        byte b12 = (bArr[i13] << 14) ^ b11;
                        if (b12 >= 0) {
                            j10 = (long) (b12 ^ 16256);
                            i13 = i14;
                        } else {
                            int i15 = i10 + 4;
                            byte b13 = b12 ^ (bArr[i14] << 21);
                            if (b13 < 0) {
                                i13 = i15;
                                j10 = (long) (-2080896 ^ b13);
                            } else {
                                long j13 = (long) b13;
                                int i16 = i10 + 5;
                                long j14 = j13 ^ (((long) bArr[i15]) << 28);
                                if (j14 >= 0) {
                                    j12 = 266354560;
                                } else {
                                    int i17 = i10 + 6;
                                    long j15 = j14 ^ (((long) bArr[i16]) << 35);
                                    if (j15 < 0) {
                                        j11 = -34093383808L;
                                    } else {
                                        i16 = i10 + 7;
                                        j14 = j15 ^ (((long) bArr[i17]) << 42);
                                        if (j14 >= 0) {
                                            j12 = 4363953127296L;
                                        } else {
                                            i17 = i10 + 8;
                                            j15 = j14 ^ (((long) bArr[i16]) << 49);
                                            if (j15 < 0) {
                                                j11 = -558586000294016L;
                                            } else {
                                                i13 = i10 + 9;
                                                long j16 = (j15 ^ (((long) bArr[i17]) << 56)) ^ 71499008037633920L;
                                                if (j16 < 0) {
                                                    int i18 = i10 + 10;
                                                    if (((long) bArr[i13]) >= 0) {
                                                        i13 = i18;
                                                    }
                                                }
                                                j10 = j16;
                                            }
                                        }
                                    }
                                    j10 = j15 ^ j11;
                                    i13 = i17;
                                }
                                j10 = j14 ^ j12;
                            }
                        }
                    }
                    this.f16356j = i13;
                    return j10;
                }
            }
            return O();
        }

        /* access modifiers changed from: package-private */
        public long O() {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                byte G10 = G();
                j10 |= ((long) (G10 & Byte.MAX_VALUE)) << i10;
                if ((G10 & 128) == 0) {
                    return j10;
                }
            }
            throw C1752z.e();
        }

        /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: 
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        public void R() {
            /*
                r1 = this;
            L_0x0000:
                int r0 = r1.B()
                if (r0 == 0) goto L_0x000c
                boolean r0 = r1.E(r0)
                if (r0 != 0) goto L_0x0000
            L_0x000c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C1735h.c.R():void");
        }

        public void S(int i10) {
            int i11 = this.f16354h;
            int i12 = this.f16356j;
            if (i10 > i11 - i12 || i10 < 0) {
                T(i10);
            } else {
                this.f16356j = i12 + i10;
            }
        }

        public void a(int i10) {
            if (this.f16357k != i10) {
                throw C1752z.a();
            }
        }

        public int d() {
            return this.f16358l + this.f16356j;
        }

        public boolean e() {
            if (this.f16356j != this.f16354h || X(1)) {
                return false;
            }
            return true;
        }

        public void k(int i10) {
            this.f16359m = i10;
            P();
        }

        public int l(int i10) {
            if (i10 >= 0) {
                int i11 = i10 + this.f16358l + this.f16356j;
                int i12 = this.f16359m;
                if (i11 <= i12) {
                    this.f16359m = i11;
                    P();
                    return i12;
                }
                throw C1752z.k();
            }
            throw C1752z.f();
        }

        public boolean m() {
            if (N() != 0) {
                return true;
            }
            return false;
        }

        public C1734g n() {
            int M10 = M();
            int i10 = this.f16354h;
            int i11 = this.f16356j;
            if (M10 <= i10 - i11 && M10 > 0) {
                C1734g k10 = C1734g.k(this.f16353g, i11, M10);
                this.f16356j += M10;
                return k10;
            } else if (M10 == 0) {
                return C1734g.f16324b;
            } else {
                return F(M10);
            }
        }

        public double o() {
            return Double.longBitsToDouble(L());
        }

        public int p() {
            return M();
        }

        public int q() {
            return K();
        }

        public long r() {
            return L();
        }

        public float s() {
            return Float.intBitsToFloat(K());
        }

        public int t() {
            return M();
        }

        public long u() {
            return N();
        }

        public int v() {
            return K();
        }

        public long w() {
            return L();
        }

        public int x() {
            return C1735h.b(M());
        }

        public long y() {
            return C1735h.c(N());
        }

        public String z() {
            int M10 = M();
            if (M10 > 0) {
                int i10 = this.f16354h;
                int i11 = this.f16356j;
                if (M10 <= i10 - i11) {
                    String str = new String(this.f16353g, i11, M10, C1751y.f16572a);
                    this.f16356j += M10;
                    return str;
                }
            }
            if (M10 == 0) {
                return "";
            }
            if (M10 > this.f16354h) {
                return new String(H(M10, false), C1751y.f16572a);
            }
            Q(M10);
            String str2 = new String(this.f16353g, this.f16356j, M10, C1751y.f16572a);
            this.f16356j += M10;
            return str2;
        }

        private c(InputStream inputStream, int i10) {
            super();
            this.f16359m = a.e.API_PRIORITY_OTHER;
            C1751y.b(inputStream, MetricTracker.Object.INPUT);
            this.f16352f = inputStream;
            this.f16353g = new byte[i10];
            this.f16354h = 0;
            this.f16356j = 0;
            this.f16358l = 0;
        }
    }

    public static int b(int i10) {
        return (-(i10 & 1)) ^ (i10 >>> 1);
    }

    public static long c(long j10) {
        return (-(j10 & 1)) ^ (j10 >>> 1);
    }

    public static C1735h f(InputStream inputStream) {
        return g(inputStream, 4096);
    }

    public static C1735h g(InputStream inputStream, int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("bufferSize must be > 0");
        } else if (inputStream == null) {
            return h(C1751y.f16574c);
        } else {
            return new c(inputStream, i10);
        }
    }

    public static C1735h h(byte[] bArr) {
        return i(bArr, 0, bArr.length);
    }

    public static C1735h i(byte[] bArr, int i10, int i11) {
        return j(bArr, i10, i11, false);
    }

    static C1735h j(byte[] bArr, int i10, int i11, boolean z10) {
        b bVar = new b(bArr, i10, i11, z10);
        try {
            bVar.l(i11);
            return bVar;
        } catch (C1752z e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public abstract String A();

    public abstract int B();

    public abstract int C();

    public abstract long D();

    public abstract boolean E(int i10);

    public abstract void a(int i10);

    public abstract int d();

    public abstract boolean e();

    public abstract void k(int i10);

    public abstract int l(int i10);

    public abstract boolean m();

    public abstract C1734g n();

    public abstract double o();

    public abstract int p();

    public abstract int q();

    public abstract long r();

    public abstract float s();

    public abstract int t();

    public abstract long u();

    public abstract int v();

    public abstract long w();

    public abstract int x();

    public abstract long y();

    public abstract String z();

    private C1735h() {
        this.f16339b = 100;
        this.f16340c = a.e.API_PRIORITY_OTHER;
        this.f16342e = false;
    }
}
