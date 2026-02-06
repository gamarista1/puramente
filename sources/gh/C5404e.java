package Gh;

import Sg.C5541d;
import com.google.android.gms.common.api.a;
import java.io.Closeable;
import java.io.EOFException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import kotlin.jvm.internal.C6496s;
import mf.C6559l;

/* renamed from: Gh.e  reason: case insensitive filesystem */
public final class C5404e implements C5406g, C5405f, Cloneable, ByteChannel {

    /* renamed from: a  reason: collision with root package name */
    public Q f63284a;

    /* renamed from: b  reason: collision with root package name */
    private long f63285b;

    /* renamed from: Gh.e$a */
    public static final class a implements Closeable {

        /* renamed from: a  reason: collision with root package name */
        public C5404e f63286a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f63287b;

        /* renamed from: c  reason: collision with root package name */
        private Q f63288c;

        /* renamed from: d  reason: collision with root package name */
        public long f63289d = -1;

        /* renamed from: e  reason: collision with root package name */
        public byte[] f63290e;

        /* renamed from: f  reason: collision with root package name */
        public int f63291f = -1;

        /* renamed from: g  reason: collision with root package name */
        public int f63292g = -1;

        public final Q a() {
            return this.f63288c;
        }

        public final int b() {
            long j10;
            long j11 = this.f63289d;
            C5404e eVar = this.f63286a;
            C6496s.e(eVar);
            if (j11 != eVar.B0()) {
                long j12 = this.f63289d;
                if (j12 == -1) {
                    j10 = 0;
                } else {
                    j10 = j12 + ((long) (this.f63292g - this.f63291f));
                }
                return n(j10);
            }
            throw new IllegalStateException("no more bytes");
        }

        public void close() {
            if (this.f63286a != null) {
                this.f63286a = null;
                o((Q) null);
                this.f63289d = -1;
                this.f63290e = null;
                this.f63291f = -1;
                this.f63292g = -1;
                return;
            }
            throw new IllegalStateException("not attached to a buffer");
        }

        public final long f(long j10) {
            C5404e eVar = this.f63286a;
            if (eVar == null) {
                throw new IllegalStateException("not attached to a buffer");
            } else if (this.f63287b) {
                long B02 = eVar.B0();
                int i10 = (j10 > B02 ? 1 : (j10 == B02 ? 0 : -1));
                if (i10 <= 0) {
                    if (j10 >= 0) {
                        long j11 = B02 - j10;
                        while (true) {
                            if (j11 <= 0) {
                                break;
                            }
                            Q q10 = eVar.f63284a;
                            C6496s.e(q10);
                            Q q11 = q10.f63247g;
                            C6496s.e(q11);
                            int i11 = q11.f63243c;
                            long j12 = (long) (i11 - q11.f63242b);
                            if (j12 > j11) {
                                q11.f63243c = i11 - ((int) j11);
                                break;
                            }
                            eVar.f63284a = q11.b();
                            S.b(q11);
                            j11 -= j12;
                        }
                        o((Q) null);
                        this.f63289d = j10;
                        this.f63290e = null;
                        this.f63291f = -1;
                        this.f63292g = -1;
                    } else {
                        throw new IllegalArgumentException(("newSize < 0: " + j10).toString());
                    }
                } else if (i10 > 0) {
                    long j13 = j10 - B02;
                    boolean z10 = true;
                    while (j13 > 0) {
                        Q L02 = eVar.L0(1);
                        int min = (int) Math.min(j13, (long) (8192 - L02.f63243c));
                        L02.f63243c += min;
                        j13 -= (long) min;
                        if (z10) {
                            o(L02);
                            this.f63289d = B02;
                            this.f63290e = L02.f63241a;
                            int i12 = L02.f63243c;
                            this.f63291f = i12 - min;
                            this.f63292g = i12;
                            z10 = false;
                        }
                    }
                }
                eVar.x0(j10);
                return B02;
            } else {
                throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers");
            }
        }

        public final int n(long j10) {
            Q q10;
            C5404e eVar = this.f63286a;
            if (eVar != null) {
                int i10 = (j10 > -1 ? 1 : (j10 == -1 ? 0 : -1));
                if (i10 < 0 || j10 > eVar.B0()) {
                    throw new ArrayIndexOutOfBoundsException("offset=" + j10 + " > size=" + eVar.B0());
                } else if (i10 == 0 || j10 == eVar.B0()) {
                    o((Q) null);
                    this.f63289d = j10;
                    this.f63290e = null;
                    this.f63291f = -1;
                    this.f63292g = -1;
                    return -1;
                } else {
                    long B02 = eVar.B0();
                    Q q11 = eVar.f63284a;
                    long j11 = 0;
                    if (a() != null) {
                        long j12 = this.f63289d;
                        int i11 = this.f63291f;
                        Q a10 = a();
                        C6496s.e(a10);
                        long j13 = j12 - ((long) (i11 - a10.f63242b));
                        if (j13 > j10) {
                            q10 = q11;
                            q11 = a();
                            B02 = j13;
                        } else {
                            q10 = a();
                            j11 = j13;
                        }
                    } else {
                        q10 = q11;
                    }
                    if (B02 - j10 > j10 - j11) {
                        while (true) {
                            C6496s.e(q10);
                            int i12 = q10.f63243c;
                            int i13 = q10.f63242b;
                            if (j10 < ((long) (i12 - i13)) + j11) {
                                break;
                            }
                            j11 += (long) (i12 - i13);
                            q10 = q10.f63246f;
                        }
                    } else {
                        while (B02 > j10) {
                            C6496s.e(q11);
                            q11 = q11.f63247g;
                            C6496s.e(q11);
                            B02 -= (long) (q11.f63243c - q11.f63242b);
                        }
                        j11 = B02;
                        q10 = q11;
                    }
                    if (this.f63287b) {
                        C6496s.e(q10);
                        if (q10.f63244d) {
                            Q f10 = q10.f();
                            if (eVar.f63284a == q10) {
                                eVar.f63284a = f10;
                            }
                            q10 = q10.c(f10);
                            Q q12 = q10.f63247g;
                            C6496s.e(q12);
                            q12.b();
                        }
                    }
                    o(q10);
                    this.f63289d = j10;
                    C6496s.e(q10);
                    this.f63290e = q10.f63241a;
                    int i14 = q10.f63242b + ((int) (j10 - j11));
                    this.f63291f = i14;
                    int i15 = q10.f63243c;
                    this.f63292g = i15;
                    return i15 - i14;
                }
            } else {
                throw new IllegalStateException("not attached to a buffer");
            }
        }

        public final void o(Q q10) {
            this.f63288c = q10;
        }
    }

    /* renamed from: Gh.e$c */
    public static final class c extends OutputStream {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C5404e f63294a;

        c(C5404e eVar) {
            this.f63294a = eVar;
        }

        public String toString() {
            return this.f63294a + ".outputStream()";
        }

        public void write(int i10) {
            this.f63294a.K0(i10);
        }

        public void write(byte[] bArr, int i10, int i11) {
            C6496s.h(bArr, "data");
            this.f63294a.c1(bArr, i10, i11);
        }

        public void close() {
        }

        public void flush() {
        }
    }

    public static /* synthetic */ a j0(C5404e eVar, a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            aVar = C5401b.d();
        }
        return eVar.g0(aVar);
    }

    public C5407h A0(long j10) {
        if (j10 < 0 || j10 > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j10).toString());
        } else if (B0() < j10) {
            throw new EOFException();
        } else if (j10 < 4096) {
            return new C5407h(l0(j10));
        } else {
            C5407h I02 = I0((int) j10);
            skip(j10);
            return I02;
        }
    }

    /* renamed from: A1 */
    public C5404e e1(long j10) {
        if (j10 == 0) {
            return K0(48);
        }
        long j11 = (j10 >>> 1) | j10;
        long j12 = j11 | (j11 >>> 2);
        long j13 = j12 | (j12 >>> 4);
        long j14 = j13 | (j13 >>> 8);
        long j15 = j14 | (j14 >>> 16);
        long j16 = j15 | (j15 >>> 32);
        long j17 = j16 - ((j16 >>> 1) & 6148914691236517205L);
        long j18 = ((j17 >>> 2) & 3689348814741910323L) + (j17 & 3689348814741910323L);
        long j19 = ((j18 >>> 4) + j18) & 1085102592571150095L;
        long j20 = j19 + (j19 >>> 8);
        long j21 = j20 + (j20 >>> 16);
        int i10 = (int) ((((j21 & 63) + ((j21 >>> 32) & 63)) + ((long) 3)) / ((long) 4));
        Q L02 = L0(i10);
        byte[] bArr = L02.f63241a;
        int i11 = L02.f63243c;
        for (int i12 = (i11 + i10) - 1; i12 >= i11; i12--) {
            bArr[i12] = Hh.a.b()[(int) (15 & j10)];
            j10 >>>= 4;
        }
        L02.f63243c += i10;
        x0(B0() + ((long) i10));
        return this;
    }

    public final long B0() {
        return this.f63285b;
    }

    /* renamed from: B1 */
    public C5404e D(int i10) {
        Q L02 = L0(4);
        byte[] bArr = L02.f63241a;
        int i11 = L02.f63243c;
        bArr[i11] = (byte) ((i10 >>> 24) & 255);
        bArr[i11 + 1] = (byte) ((i10 >>> 16) & 255);
        bArr[i11 + 2] = (byte) ((i10 >>> 8) & 255);
        bArr[i11 + 3] = (byte) (i10 & 255);
        L02.f63243c = i11 + 4;
        x0(B0() + 4);
        return this;
    }

    public C5404e C1(long j10) {
        Q L02 = L0(8);
        byte[] bArr = L02.f63241a;
        int i10 = L02.f63243c;
        bArr[i10] = (byte) ((int) ((j10 >>> 56) & 255));
        bArr[i10 + 1] = (byte) ((int) ((j10 >>> 48) & 255));
        bArr[i10 + 2] = (byte) ((int) ((j10 >>> 40) & 255));
        bArr[i10 + 3] = (byte) ((int) ((j10 >>> 32) & 255));
        bArr[i10 + 4] = (byte) ((int) ((j10 >>> 24) & 255));
        bArr[i10 + 5] = (byte) ((int) ((j10 >>> 16) & 255));
        bArr[i10 + 6] = (byte) ((int) ((j10 >>> 8) & 255));
        bArr[i10 + 7] = (byte) ((int) (j10 & 255));
        L02.f63243c = i10 + 8;
        x0(B0() + 8);
        return this;
    }

    /* renamed from: D1 */
    public C5404e D0(int i10) {
        Q L02 = L0(2);
        byte[] bArr = L02.f63241a;
        int i11 = L02.f63243c;
        bArr[i11] = (byte) ((i10 >>> 8) & 255);
        bArr[i11 + 1] = (byte) (i10 & 255);
        L02.f63243c = i11 + 2;
        x0(B0() + 2);
        return this;
    }

    public final C5407h E0() {
        if (B0() <= 2147483647L) {
            return I0((int) B0());
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + B0()).toString());
    }

    public C5404e E1(String str, int i10, int i11, Charset charset) {
        C6496s.h(str, "string");
        C6496s.h(charset, "charset");
        if (i10 < 0) {
            throw new IllegalArgumentException(("beginIndex < 0: " + i10).toString());
        } else if (i11 < i10) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i11 + " < " + i10).toString());
        } else if (i11 > str.length()) {
            throw new IllegalArgumentException(("endIndex > string.length: " + i11 + " > " + str.length()).toString());
        } else if (C6496s.c(charset, C5541d.f65029b)) {
            return a0(str, i10, i11);
        } else {
            String substring = str.substring(i10, i11);
            C6496s.g(substring, "substring(...)");
            byte[] bytes = substring.getBytes(charset);
            C6496s.g(bytes, "getBytes(...)");
            return c1(bytes, 0, bytes.length);
        }
    }

    public boolean F0(long j10, C5407h hVar) {
        C6496s.h(hVar, "bytes");
        return V(j10, hVar, 0, hVar.O());
    }

    public C5404e F1(String str, Charset charset) {
        C6496s.h(str, "string");
        C6496s.h(charset, "charset");
        return E1(str, 0, str.length(), charset);
    }

    /* renamed from: G1 */
    public C5404e X(String str) {
        C6496s.h(str, "string");
        return a0(str, 0, str.length());
    }

    public byte[] H0() {
        return l0(B0());
    }

    /* renamed from: H1 */
    public C5404e a0(String str, int i10, int i11) {
        char c10;
        char charAt;
        C6496s.h(str, "string");
        if (i10 < 0) {
            throw new IllegalArgumentException(("beginIndex < 0: " + i10).toString());
        } else if (i11 < i10) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i11 + " < " + i10).toString());
        } else if (i11 <= str.length()) {
            while (i10 < i11) {
                char charAt2 = str.charAt(i10);
                if (charAt2 < 128) {
                    Q L02 = L0(1);
                    byte[] bArr = L02.f63241a;
                    int i12 = L02.f63243c - i10;
                    int min = Math.min(i11, 8192 - i12);
                    int i13 = i10 + 1;
                    bArr[i10 + i12] = (byte) charAt2;
                    while (true) {
                        i10 = i13;
                        if (i10 >= min || (charAt = str.charAt(i10)) >= 128) {
                            int i14 = L02.f63243c;
                            int i15 = (i12 + i10) - i14;
                            L02.f63243c = i14 + i15;
                            x0(B0() + ((long) i15));
                        } else {
                            i13 = i10 + 1;
                            bArr[i10 + i12] = (byte) charAt;
                        }
                    }
                    int i142 = L02.f63243c;
                    int i152 = (i12 + i10) - i142;
                    L02.f63243c = i142 + i152;
                    x0(B0() + ((long) i152));
                } else {
                    if (charAt2 < 2048) {
                        Q L03 = L0(2);
                        byte[] bArr2 = L03.f63241a;
                        int i16 = L03.f63243c;
                        bArr2[i16] = (byte) ((charAt2 >> 6) | 192);
                        bArr2[i16 + 1] = (byte) ((charAt2 & '?') | 128);
                        L03.f63243c = i16 + 2;
                        x0(B0() + 2);
                    } else if (charAt2 < 55296 || charAt2 > 57343) {
                        Q L04 = L0(3);
                        byte[] bArr3 = L04.f63241a;
                        int i17 = L04.f63243c;
                        bArr3[i17] = (byte) ((charAt2 >> 12) | 224);
                        bArr3[i17 + 1] = (byte) ((63 & (charAt2 >> 6)) | 128);
                        bArr3[i17 + 2] = (byte) ((charAt2 & '?') | 128);
                        L04.f63243c = i17 + 3;
                        x0(B0() + 3);
                    } else {
                        int i18 = i10 + 1;
                        if (i18 < i11) {
                            c10 = str.charAt(i18);
                        } else {
                            c10 = 0;
                        }
                        if (charAt2 > 56319 || 56320 > c10 || c10 >= 57344) {
                            K0(63);
                            i10 = i18;
                        } else {
                            int i19 = (((charAt2 & 1023) << 10) | (c10 & 1023)) + 0;
                            Q L05 = L0(4);
                            byte[] bArr4 = L05.f63241a;
                            int i20 = L05.f63243c;
                            bArr4[i20] = (byte) ((i19 >> 18) | 240);
                            bArr4[i20 + 1] = (byte) (((i19 >> 12) & 63) | 128);
                            bArr4[i20 + 2] = (byte) (((i19 >> 6) & 63) | 128);
                            bArr4[i20 + 3] = (byte) ((i19 & 63) | 128);
                            L05.f63243c = i20 + 4;
                            x0(B0() + 4);
                            i10 += 2;
                        }
                    }
                    i10++;
                }
            }
            return this;
        } else {
            throw new IllegalArgumentException(("endIndex > string.length: " + i11 + " > " + str.length()).toString());
        }
    }

    public final byte I(long j10) {
        C5401b.b(B0(), j10, 1);
        Q q10 = this.f63284a;
        if (q10 == null) {
            C6496s.e((Object) null);
            throw null;
        } else if (B0() - j10 < j10) {
            long B02 = B0();
            while (B02 > j10) {
                q10 = q10.f63247g;
                C6496s.e(q10);
                B02 -= (long) (q10.f63243c - q10.f63242b);
            }
            C6496s.e(q10);
            return q10.f63241a[(int) ((((long) q10.f63242b) + j10) - B02)];
        } else {
            long j11 = 0;
            while (true) {
                long j12 = ((long) (q10.f63243c - q10.f63242b)) + j11;
                if (j12 <= j10) {
                    q10 = q10.f63246f;
                    C6496s.e(q10);
                    j11 = j12;
                } else {
                    C6496s.e(q10);
                    return q10.f63241a[(int) ((((long) q10.f63242b) + j10) - j11)];
                }
            }
        }
    }

    public final C5407h I0(int i10) {
        if (i10 == 0) {
            return C5407h.f63296e;
        }
        C5401b.b(B0(), 0, (long) i10);
        Q q10 = this.f63284a;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i12 < i10) {
            C6496s.e(q10);
            int i14 = q10.f63243c;
            int i15 = q10.f63242b;
            if (i14 != i15) {
                i12 += i14 - i15;
                i13++;
                q10 = q10.f63246f;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        byte[][] bArr = new byte[i13][];
        int[] iArr = new int[(i13 * 2)];
        Q q11 = this.f63284a;
        int i16 = 0;
        while (i11 < i10) {
            C6496s.e(q11);
            bArr[i16] = q11.f63241a;
            i11 += q11.f63243c - q11.f63242b;
            iArr[i16] = Math.min(i11, i10);
            iArr[i16 + i13] = q11.f63242b;
            q11.f63244d = true;
            i16++;
            q11 = q11.f63246f;
        }
        return new T(bArr, iArr);
    }

    public C5404e I1(int i10) {
        if (i10 < 128) {
            K0(i10);
        } else if (i10 < 2048) {
            Q L02 = L0(2);
            byte[] bArr = L02.f63241a;
            int i11 = L02.f63243c;
            bArr[i11] = (byte) ((i10 >> 6) | 192);
            bArr[i11 + 1] = (byte) ((i10 & 63) | 128);
            L02.f63243c = i11 + 2;
            x0(B0() + 2);
        } else if (55296 <= i10 && i10 < 57344) {
            K0(63);
        } else if (i10 < 65536) {
            Q L03 = L0(3);
            byte[] bArr2 = L03.f63241a;
            int i12 = L03.f63243c;
            bArr2[i12] = (byte) ((i10 >> 12) | 224);
            bArr2[i12 + 1] = (byte) (((i10 >> 6) & 63) | 128);
            bArr2[i12 + 2] = (byte) ((i10 & 63) | 128);
            L03.f63243c = i12 + 3;
            x0(B0() + 3);
        } else if (i10 <= 1114111) {
            Q L04 = L0(4);
            byte[] bArr3 = L04.f63241a;
            int i13 = L04.f63243c;
            bArr3[i13] = (byte) ((i10 >> 18) | 240);
            bArr3[i13 + 1] = (byte) (((i10 >> 12) & 63) | 128);
            bArr3[i13 + 2] = (byte) (((i10 >> 6) & 63) | 128);
            bArr3[i13 + 3] = (byte) ((i10 & 63) | 128);
            L04.f63243c = i13 + 4;
            x0(B0() + 4);
        } else {
            throw new IllegalArgumentException("Unexpected code point: 0x" + C5401b.l(i10));
        }
        return this;
    }

    public boolean J0() {
        if (this.f63285b == 0) {
            return true;
        }
        return false;
    }

    public long K(W w10) {
        C6496s.h(w10, "source");
        long j10 = 0;
        while (true) {
            long y12 = w10.y1(this, 8192);
            if (y12 == -1) {
                return j10;
            }
            j10 += y12;
        }
    }

    public final Q L0(int i10) {
        if (i10 < 1 || i10 > 8192) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        Q q10 = this.f63284a;
        if (q10 == null) {
            Q c10 = S.c();
            this.f63284a = c10;
            c10.f63247g = c10;
            c10.f63246f = c10;
            return c10;
        }
        C6496s.e(q10);
        Q q11 = q10.f63247g;
        C6496s.e(q11);
        if (q11.f63243c + i10 > 8192 || !q11.f63245e) {
            return q11.c(S.c());
        }
        return q11;
    }

    public long M(byte b10, long j10) {
        return Q(b10, j10, Long.MAX_VALUE);
    }

    public String N(long j10) {
        if (j10 >= 0) {
            long j11 = Long.MAX_VALUE;
            if (j10 != Long.MAX_VALUE) {
                j11 = j10 + 1;
            }
            long Q10 = Q((byte) 10, 0, j11);
            if (Q10 != -1) {
                return Hh.a.d(this, Q10);
            }
            if (j11 < B0() && I(j11 - 1) == 13 && I(j11) == 10) {
                return Hh.a.d(this, j11);
            }
            C5404e eVar = new C5404e();
            y(eVar, 0, Math.min((long) 32, B0()));
            throw new EOFException("\\n not found: limit=" + Math.min(B0(), j10) + " content=" + eVar.o0().r() + 8230);
        }
        throw new IllegalArgumentException(("limit < 0: " + j10).toString());
    }

    public long N0(C5407h hVar) {
        C6496s.h(hVar, "bytes");
        return T(hVar, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a4, code lost:
        if (r2 == false) goto L_0x00a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00a6, code lost:
        r14 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a8, code lost:
        r14 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00a9, code lost:
        if (r1 >= r14) goto L_0x00e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00b3, code lost:
        if (B0() == 0) goto L_0x00e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00b5, code lost:
        if (r2 == false) goto L_0x00ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00b7, code lost:
        r1 = "Expected a digit";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00ba, code lost:
        r1 = "Expected a digit or '-'";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00df, code lost:
        throw new java.lang.NumberFormatException(r1 + " but was 0x" + Gh.C5401b.k(I(0)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00e5, code lost:
        throw new java.io.EOFException();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00e6, code lost:
        if (r2 == false) goto L_0x00e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:?, code lost:
        return -r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:?, code lost:
        return r8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long O0() {
        /*
            r18 = this;
            r0 = r18
            long r1 = r18.B0()
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L_0x00eb
            r1 = 0
            r5 = -7
            r2 = r1
            r8 = r3
            r6 = r5
            r5 = r2
        L_0x0013:
            Gh.Q r10 = r0.f63284a
            kotlin.jvm.internal.C6496s.e(r10)
            byte[] r11 = r10.f63241a
            int r12 = r10.f63242b
            int r13 = r10.f63243c
        L_0x001e:
            if (r12 >= r13) goto L_0x0082
            byte r15 = r11[r12]
            r14 = 48
            if (r15 < r14) goto L_0x0070
            r14 = 57
            if (r15 > r14) goto L_0x0070
            int r14 = 48 - r15
            r16 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r16 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r16 < 0) goto L_0x0043
            if (r16 != 0) goto L_0x003d
            long r3 = (long) r14
            int r3 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r3 >= 0) goto L_0x003d
            goto L_0x0043
        L_0x003d:
            r3 = 10
            long r8 = r8 * r3
            long r3 = (long) r14
            long r8 = r8 + r3
            goto L_0x007a
        L_0x0043:
            Gh.e r1 = new Gh.e
            r1.<init>()
            Gh.e r1 = r1.v0(r8)
            Gh.e r1 = r1.K0(r15)
            if (r2 != 0) goto L_0x0055
            r1.readByte()
        L_0x0055:
            java.lang.NumberFormatException r2 = new java.lang.NumberFormatException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Number too large: "
            r3.append(r4)
            java.lang.String r1 = r1.p1()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
        L_0x0070:
            r3 = 45
            if (r15 != r3) goto L_0x0081
            if (r1 != 0) goto L_0x0081
            r2 = 1
            long r6 = r6 - r2
            r2 = 1
        L_0x007a:
            int r12 = r12 + 1
            int r1 = r1 + 1
            r3 = 0
            goto L_0x001e
        L_0x0081:
            r5 = 1
        L_0x0082:
            if (r12 != r13) goto L_0x008e
            Gh.Q r3 = r10.b()
            r0.f63284a = r3
            Gh.S.b(r10)
            goto L_0x0090
        L_0x008e:
            r10.f63242b = r12
        L_0x0090:
            if (r5 != 0) goto L_0x009b
            Gh.Q r3 = r0.f63284a
            if (r3 != 0) goto L_0x0097
            goto L_0x009b
        L_0x0097:
            r3 = 0
            goto L_0x0013
        L_0x009b:
            long r3 = r18.B0()
            long r5 = (long) r1
            long r3 = r3 - r5
            r0.x0(r3)
            if (r2 == 0) goto L_0x00a8
            r14 = 2
            goto L_0x00a9
        L_0x00a8:
            r14 = 1
        L_0x00a9:
            if (r1 >= r14) goto L_0x00e6
            long r3 = r18.B0()
            r5 = 0
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L_0x00e0
            if (r2 == 0) goto L_0x00ba
            java.lang.String r1 = "Expected a digit"
            goto L_0x00bc
        L_0x00ba:
            java.lang.String r1 = "Expected a digit or '-'"
        L_0x00bc:
            java.lang.NumberFormatException r2 = new java.lang.NumberFormatException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            java.lang.String r1 = " but was 0x"
            r3.append(r1)
            r4 = 0
            byte r1 = r0.I(r4)
            java.lang.String r1 = Gh.C5401b.k(r1)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
        L_0x00e0:
            java.io.EOFException r1 = new java.io.EOFException
            r1.<init>()
            throw r1
        L_0x00e6:
            if (r2 == 0) goto L_0x00e9
            goto L_0x00ea
        L_0x00e9:
            long r8 = -r8
        L_0x00ea:
            return r8
        L_0x00eb:
            java.io.EOFException r1 = new java.io.EOFException
            r1.<init>()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Gh.C5404e.O0():long");
    }

    public void P(C5404e eVar, long j10) {
        Q q10;
        int i10;
        C6496s.h(eVar, "source");
        if (eVar != this) {
            C5401b.b(eVar.B0(), 0, j10);
            while (j10 > 0) {
                Q q11 = eVar.f63284a;
                C6496s.e(q11);
                int i11 = q11.f63243c;
                Q q12 = eVar.f63284a;
                C6496s.e(q12);
                if (j10 < ((long) (i11 - q12.f63242b))) {
                    Q q13 = this.f63284a;
                    if (q13 != null) {
                        C6496s.e(q13);
                        q10 = q13.f63247g;
                    } else {
                        q10 = null;
                    }
                    if (q10 != null && q10.f63245e) {
                        long j11 = ((long) q10.f63243c) + j10;
                        if (q10.f63244d) {
                            i10 = 0;
                        } else {
                            i10 = q10.f63242b;
                        }
                        if (j11 - ((long) i10) <= 8192) {
                            Q q14 = eVar.f63284a;
                            C6496s.e(q14);
                            q14.g(q10, (int) j10);
                            eVar.x0(eVar.B0() - j10);
                            x0(B0() + j10);
                            return;
                        }
                    }
                    Q q15 = eVar.f63284a;
                    C6496s.e(q15);
                    eVar.f63284a = q15.e((int) j10);
                }
                Q q16 = eVar.f63284a;
                C6496s.e(q16);
                long j12 = (long) (q16.f63243c - q16.f63242b);
                eVar.f63284a = q16.b();
                Q q17 = this.f63284a;
                if (q17 == null) {
                    this.f63284a = q16;
                    q16.f63247g = q16;
                    q16.f63246f = q16;
                } else {
                    C6496s.e(q17);
                    Q q18 = q17.f63247g;
                    C6496s.e(q18);
                    q18.c(q16).a();
                }
                eVar.x0(eVar.B0() - j12);
                x0(B0() + j12);
                j10 -= j12;
            }
            return;
        }
        throw new IllegalArgumentException("source == this");
    }

    /* renamed from: P0 */
    public C5404e k0(C5407h hVar) {
        C6496s.h(hVar, "byteString");
        hVar.X(this, 0, hVar.O());
        return this;
    }

    public long Q(byte b10, long j10, long j11) {
        Q q10;
        long j12;
        int i10;
        long j13 = 0;
        if (0 > j10 || j10 > j11) {
            throw new IllegalArgumentException(("size=" + B0() + " fromIndex=" + j10 + " toIndex=" + j11).toString());
        }
        if (j11 > B0()) {
            j11 = B0();
        }
        if (j10 == j11 || (q10 = this.f63284a) == null) {
            return -1;
        }
        if (B0() - j10 < j10) {
            j12 = B0();
            while (j12 > j10) {
                q10 = q10.f63247g;
                C6496s.e(q10);
                j12 -= (long) (q10.f63243c - q10.f63242b);
            }
            while (j12 < j11) {
                byte[] bArr = q10.f63241a;
                int min = (int) Math.min((long) q10.f63243c, (((long) q10.f63242b) + j11) - j12);
                i10 = (int) ((((long) q10.f63242b) + j10) - j12);
                while (i10 < min) {
                    if (bArr[i10] != b10) {
                        i10++;
                    }
                }
                j12 += (long) (q10.f63243c - q10.f63242b);
                q10 = q10.f63246f;
                C6496s.e(q10);
                j10 = j12;
            }
            return -1;
        }
        while (true) {
            long j14 = ((long) (q10.f63243c - q10.f63242b)) + j13;
            if (j14 > j10) {
                break;
            }
            q10 = q10.f63246f;
            C6496s.e(q10);
            j13 = j14;
        }
        while (j12 < j11) {
            byte[] bArr2 = q10.f63241a;
            int min2 = (int) Math.min((long) q10.f63243c, (((long) q10.f63242b) + j11) - j12);
            int i11 = (int) ((((long) q10.f63242b) + j10) - j12);
            while (i10 < min2) {
                if (bArr2[i10] != b10) {
                    i11 = i10 + 1;
                }
            }
            j13 = j12 + ((long) (q10.f63243c - q10.f63242b));
            q10 = q10.f63246f;
            C6496s.e(q10);
            j10 = j13;
        }
        return -1;
        return ((long) (i10 - q10.f63242b)) + j12;
    }

    /* renamed from: R0 */
    public C5404e n0(byte[] bArr) {
        C6496s.h(bArr, "source");
        return c1(bArr, 0, bArr.length);
    }

    public long T(C5407h hVar, long j10) {
        long j11;
        int i10;
        long j12 = j10;
        C6496s.h(hVar, "bytes");
        if (hVar.O() > 0) {
            long j13 = 0;
            if (j12 >= 0) {
                Q q10 = this.f63284a;
                if (q10 != null) {
                    if (B0() - j12 < j12) {
                        j11 = B0();
                        while (j11 > j12) {
                            q10 = q10.f63247g;
                            C6496s.e(q10);
                            j11 -= (long) (q10.f63243c - q10.f63242b);
                        }
                        byte[] x10 = hVar.x();
                        byte b10 = x10[0];
                        int O10 = hVar.O();
                        long B02 = (B0() - ((long) O10)) + 1;
                        while (j11 < B02) {
                            byte[] bArr = q10.f63241a;
                            long j14 = B02;
                            int min = (int) Math.min((long) q10.f63243c, (((long) q10.f63242b) + B02) - j11);
                            i10 = (int) ((((long) q10.f63242b) + j12) - j11);
                            while (i10 < min) {
                                if (bArr[i10] != b10 || !Hh.a.c(q10, i10 + 1, x10, 1, O10)) {
                                    i10++;
                                }
                            }
                            j11 += (long) (q10.f63243c - q10.f63242b);
                            q10 = q10.f63246f;
                            C6496s.e(q10);
                            j12 = j11;
                            B02 = j14;
                        }
                    } else {
                        while (true) {
                            long j15 = ((long) (q10.f63243c - q10.f63242b)) + j13;
                            if (j15 > j12) {
                                break;
                            }
                            q10 = q10.f63246f;
                            C6496s.e(q10);
                            j13 = j15;
                        }
                        byte[] x11 = hVar.x();
                        byte b11 = x11[0];
                        int O11 = hVar.O();
                        long B03 = (B0() - ((long) O11)) + 1;
                        while (j11 < B03) {
                            byte[] bArr2 = q10.f63241a;
                            int min2 = (int) Math.min((long) q10.f63243c, (((long) q10.f63242b) + B03) - j11);
                            int i11 = (int) ((((long) q10.f63242b) + j12) - j11);
                            while (i10 < min2) {
                                if (bArr2[i10] == b11) {
                                    if (Hh.a.c(q10, i10 + 1, x11, 1, O11)) {
                                    }
                                }
                                i11 = i10 + 1;
                            }
                            j13 = j11 + ((long) (q10.f63243c - q10.f63242b));
                            q10 = q10.f63246f;
                            C6496s.e(q10);
                            j12 = j13;
                        }
                    }
                    return ((long) (i10 - q10.f63242b)) + j11;
                }
                return -1;
            }
            throw new IllegalArgumentException(("fromIndex < 0: " + j12).toString());
        }
        throw new IllegalArgumentException("bytes is empty");
    }

    public long U(C5407h hVar, long j10) {
        long j11;
        int i10;
        int i11;
        int i12;
        C6496s.h(hVar, "targetBytes");
        long j12 = 0;
        if (j10 >= 0) {
            Q q10 = this.f63284a;
            if (q10 == null) {
                return -1;
            }
            if (B0() - j10 < j10) {
                j11 = B0();
                while (j11 > j10) {
                    q10 = q10.f63247g;
                    C6496s.e(q10);
                    j11 -= (long) (q10.f63243c - q10.f63242b);
                }
                if (hVar.O() == 2) {
                    byte j13 = hVar.j(0);
                    byte j14 = hVar.j(1);
                    while (j11 < B0()) {
                        byte[] bArr = q10.f63241a;
                        i11 = (int) ((((long) q10.f63242b) + j10) - j11);
                        int i13 = q10.f63243c;
                        while (i11 < i13) {
                            byte b10 = bArr[i11];
                            if (!(b10 == j13 || b10 == j14)) {
                                i11++;
                            }
                        }
                        j11 += (long) (q10.f63243c - q10.f63242b);
                        q10 = q10.f63246f;
                        C6496s.e(q10);
                        j10 = j11;
                    }
                    return -1;
                }
                byte[] x10 = hVar.x();
                while (j11 < B0()) {
                    byte[] bArr2 = q10.f63241a;
                    i10 = (int) ((((long) q10.f63242b) + j10) - j11);
                    int i14 = q10.f63243c;
                    while (i10 < i14) {
                        byte b11 = bArr2[i10];
                        for (byte b12 : x10) {
                            if (b11 == b12) {
                                i12 = q10.f63242b;
                                return ((long) (i11 - i12)) + j11;
                            }
                        }
                        i10++;
                    }
                    j11 += (long) (q10.f63243c - q10.f63242b);
                    q10 = q10.f63246f;
                    C6496s.e(q10);
                    j10 = j11;
                }
                return -1;
            }
            while (true) {
                long j15 = ((long) (q10.f63243c - q10.f63242b)) + j12;
                if (j15 > j10) {
                    break;
                }
                q10 = q10.f63246f;
                C6496s.e(q10);
                j12 = j15;
            }
            if (hVar.O() == 2) {
                byte j16 = hVar.j(0);
                byte j17 = hVar.j(1);
                while (j11 < B0()) {
                    byte[] bArr3 = q10.f63241a;
                    int i15 = (int) ((((long) q10.f63242b) + j10) - j11);
                    int i16 = q10.f63243c;
                    while (i11 < i16) {
                        byte b13 = bArr3[i11];
                        if (!(b13 == j16 || b13 == j17)) {
                            i15 = i11 + 1;
                        }
                    }
                    j12 = j11 + ((long) (q10.f63243c - q10.f63242b));
                    q10 = q10.f63246f;
                    C6496s.e(q10);
                    j10 = j12;
                }
                return -1;
            }
            byte[] x11 = hVar.x();
            while (j11 < B0()) {
                byte[] bArr4 = q10.f63241a;
                int i17 = (int) ((((long) q10.f63242b) + j10) - j11);
                int i18 = q10.f63243c;
                while (i10 < i18) {
                    byte b14 = bArr4[i10];
                    for (byte b15 : x11) {
                        if (b14 == b15) {
                            i12 = q10.f63242b;
                            return ((long) (i11 - i12)) + j11;
                        }
                    }
                    i17 = i10 + 1;
                }
                j12 = j11 + ((long) (q10.f63243c - q10.f63242b));
                q10 = q10.f63246f;
                C6496s.e(q10);
                j10 = j12;
            }
            return -1;
            i12 = q10.f63242b;
            return ((long) (i11 - i12)) + j11;
        }
        throw new IllegalArgumentException(("fromIndex < 0: " + j10).toString());
    }

    public boolean V(long j10, C5407h hVar, int i10, int i11) {
        C6496s.h(hVar, "bytes");
        if (j10 < 0 || i10 < 0 || i11 < 0 || B0() - j10 < ((long) i11) || hVar.O() - i10 < i11) {
            return false;
        }
        for (int i12 = 0; i12 < i11; i12++) {
            if (I(((long) i12) + j10) != hVar.j(i10 + i12)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: W0 */
    public C5404e c1(byte[] bArr, int i10, int i11) {
        C6496s.h(bArr, "source");
        long j10 = (long) i11;
        C5401b.b((long) bArr.length, (long) i10, j10);
        int i12 = i11 + i10;
        while (i10 < i12) {
            Q L02 = L0(1);
            int min = Math.min(i12 - i10, 8192 - L02.f63243c);
            int i13 = i10 + min;
            C6559l.h(bArr, L02.f63241a, L02.f63243c, i10, i13);
            L02.f63243c += min;
            i10 = i13;
        }
        x0(B0() + j10);
        return this;
    }

    public long Z(C5407h hVar) {
        C6496s.h(hVar, "targetBytes");
        return U(hVar, 0);
    }

    public void Z0(C5404e eVar, long j10) {
        C6496s.h(eVar, "sink");
        if (B0() >= j10) {
            eVar.P(this, j10);
        } else {
            eVar.P(this, B0());
            throw new EOFException();
        }
    }

    public final void a() {
        skip(B0());
    }

    public String b1(Charset charset) {
        C6496s.h(charset, "charset");
        return t0(this.f63285b, charset);
    }

    public long d0(U u10) {
        C6496s.h(u10, "sink");
        long B02 = B0();
        if (B02 > 0) {
            u10.P(this, B02);
        }
        return B02;
    }

    public boolean e0(long j10) {
        if (this.f63285b >= j10) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r19v0, types: [java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = 1
            if (r0 != r1) goto L_0x0009
            goto L_0x0081
        L_0x0009:
            boolean r3 = r1 instanceof Gh.C5404e
            r4 = 0
            if (r3 != 0) goto L_0x0011
        L_0x000e:
            r2 = r4
            goto L_0x0081
        L_0x0011:
            long r5 = r18.B0()
            Gh.e r1 = (Gh.C5404e) r1
            long r7 = r1.B0()
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 == 0) goto L_0x0020
            goto L_0x000e
        L_0x0020:
            long r5 = r18.B0()
            r7 = 0
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 != 0) goto L_0x002b
            goto L_0x0081
        L_0x002b:
            Gh.Q r3 = r0.f63284a
            kotlin.jvm.internal.C6496s.e(r3)
            Gh.Q r1 = r1.f63284a
            kotlin.jvm.internal.C6496s.e(r1)
            int r5 = r3.f63242b
            int r6 = r1.f63242b
            r9 = r7
        L_0x003a:
            long r11 = r18.B0()
            int r11 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r11 >= 0) goto L_0x0081
            int r11 = r3.f63243c
            int r11 = r11 - r5
            int r12 = r1.f63243c
            int r12 = r12 - r6
            int r11 = java.lang.Math.min(r11, r12)
            long r11 = (long) r11
            r13 = r7
        L_0x004e:
            int r15 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r15 >= 0) goto L_0x0069
            byte[] r15 = r3.f63241a
            int r16 = r5 + 1
            byte r5 = r15[r5]
            byte[] r15 = r1.f63241a
            int r17 = r6 + 1
            byte r6 = r15[r6]
            if (r5 == r6) goto L_0x0061
            goto L_0x000e
        L_0x0061:
            r5 = 1
            long r13 = r13 + r5
            r5 = r16
            r6 = r17
            goto L_0x004e
        L_0x0069:
            int r13 = r3.f63243c
            if (r5 != r13) goto L_0x0074
            Gh.Q r3 = r3.f63246f
            kotlin.jvm.internal.C6496s.e(r3)
            int r5 = r3.f63242b
        L_0x0074:
            int r13 = r1.f63243c
            if (r6 != r13) goto L_0x007f
            Gh.Q r1 = r1.f63246f
            kotlin.jvm.internal.C6496s.e(r1)
            int r6 = r1.f63242b
        L_0x007f:
            long r9 = r9 + r11
            goto L_0x003a
        L_0x0081:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: Gh.C5404e.equals(java.lang.Object):boolean");
    }

    public final a g0(a aVar) {
        C6496s.h(aVar, "unsafeCursor");
        return Hh.a.a(this, aVar);
    }

    public int hashCode() {
        Q q10 = this.f63284a;
        if (q10 == null) {
            return 0;
        }
        int i10 = 1;
        do {
            int i11 = q10.f63243c;
            for (int i12 = q10.f63242b; i12 < i11; i12++) {
                i10 = (i10 * 31) + q10.f63241a[i12];
            }
            q10 = q10.f63246f;
            C6496s.e(q10);
        } while (q10 != this.f63284a);
        return i10;
    }

    public String i0() {
        return N(Long.MAX_VALUE);
    }

    public boolean isOpen() {
        return true;
    }

    public byte[] l0(long j10) {
        if (j10 < 0 || j10 > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j10).toString());
        } else if (B0() >= j10) {
            byte[] bArr = new byte[((int) j10)];
            readFully(bArr);
            return bArr;
        } else {
            throw new EOFException();
        }
    }

    public int m1() {
        return C5401b.h(readInt());
    }

    /* renamed from: n1 */
    public C5404e K0(int i10) {
        Q L02 = L0(1);
        byte[] bArr = L02.f63241a;
        int i11 = L02.f63243c;
        L02.f63243c = i11 + 1;
        bArr[i11] = (byte) i10;
        x0(B0() + 1);
        return this;
    }

    /* renamed from: o */
    public C5404e clone() {
        return t();
    }

    public C5407h o0() {
        return A0(B0());
    }

    public short p0() {
        return C5401b.j(readShort());
    }

    public String p1() {
        return t0(this.f63285b, C5541d.f65029b);
    }

    public C5406g peek() {
        return H.d(new N(this));
    }

    public final long q() {
        long B02 = B0();
        if (B02 == 0) {
            return 0;
        }
        Q q10 = this.f63284a;
        C6496s.e(q10);
        Q q11 = q10.f63247g;
        C6496s.e(q11);
        int i10 = q11.f63243c;
        if (i10 < 8192 && q11.f63245e) {
            B02 -= (long) (i10 - q11.f63242b);
        }
        return B02;
    }

    public long r0() {
        return C5401b.i(readLong());
    }

    public int r1(K k10) {
        C6496s.h(k10, "options");
        int f10 = Hh.a.f(this, k10, false, 2, (Object) null);
        if (f10 == -1) {
            return -1;
        }
        skip((long) k10.k()[f10].O());
        return f10;
    }

    public int read(ByteBuffer byteBuffer) {
        C6496s.h(byteBuffer, "sink");
        Q q10 = this.f63284a;
        if (q10 == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), q10.f63243c - q10.f63242b);
        byteBuffer.put(q10.f63241a, q10.f63242b, min);
        int i10 = q10.f63242b + min;
        q10.f63242b = i10;
        this.f63285b -= (long) min;
        if (i10 == q10.f63243c) {
            this.f63284a = q10.b();
            S.b(q10);
        }
        return min;
    }

    public byte readByte() {
        if (B0() != 0) {
            Q q10 = this.f63284a;
            C6496s.e(q10);
            int i10 = q10.f63242b;
            int i11 = q10.f63243c;
            int i12 = i10 + 1;
            byte b10 = q10.f63241a[i10];
            x0(B0() - 1);
            if (i12 == i11) {
                this.f63284a = q10.b();
                S.b(q10);
            } else {
                q10.f63242b = i12;
            }
            return b10;
        }
        throw new EOFException();
    }

    public void readFully(byte[] bArr) {
        C6496s.h(bArr, "sink");
        int i10 = 0;
        while (i10 < bArr.length) {
            int read = read(bArr, i10, bArr.length - i10);
            if (read != -1) {
                i10 += read;
            } else {
                throw new EOFException();
            }
        }
    }

    public int readInt() {
        if (B0() >= 4) {
            Q q10 = this.f63284a;
            C6496s.e(q10);
            int i10 = q10.f63242b;
            int i11 = q10.f63243c;
            if (((long) (i11 - i10)) < 4) {
                return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
            }
            byte[] bArr = q10.f63241a;
            byte b10 = ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10] & 255) << 24);
            int i12 = i10 + 3;
            int i13 = i10 + 4;
            byte b11 = (bArr[i12] & 255) | b10 | ((bArr[i10 + 2] & 255) << 8);
            x0(B0() - 4);
            if (i13 == i11) {
                this.f63284a = q10.b();
                S.b(q10);
            } else {
                q10.f63242b = i13;
            }
            return b11;
        }
        throw new EOFException();
    }

    public long readLong() {
        if (B0() >= 8) {
            Q q10 = this.f63284a;
            C6496s.e(q10);
            int i10 = q10.f63242b;
            int i11 = q10.f63243c;
            if (((long) (i11 - i10)) < 8) {
                return ((((long) readInt()) & 4294967295L) << 32) | (4294967295L & ((long) readInt()));
            }
            byte[] bArr = q10.f63241a;
            long j10 = ((((long) bArr[i10]) & 255) << 56) | ((((long) bArr[i10 + 1]) & 255) << 48) | ((((long) bArr[i10 + 2]) & 255) << 40);
            int i12 = i10 + 7;
            int i13 = i10 + 8;
            long j11 = j10 | ((((long) bArr[i10 + 3]) & 255) << 32) | ((((long) bArr[i10 + 4]) & 255) << 24) | ((((long) bArr[i10 + 5]) & 255) << 16) | ((((long) bArr[i10 + 6]) & 255) << 8) | (((long) bArr[i12]) & 255);
            x0(B0() - 8);
            if (i13 == i11) {
                this.f63284a = q10.b();
                S.b(q10);
            } else {
                q10.f63242b = i13;
            }
            return j11;
        }
        throw new EOFException();
    }

    public short readShort() {
        if (B0() >= 2) {
            Q q10 = this.f63284a;
            C6496s.e(q10);
            int i10 = q10.f63242b;
            int i11 = q10.f63243c;
            if (i11 - i10 < 2) {
                return (short) (((readByte() & 255) << 8) | (readByte() & 255));
            }
            byte[] bArr = q10.f63241a;
            int i12 = i10 + 1;
            int i13 = i10 + 2;
            byte b10 = (bArr[i12] & 255) | ((bArr[i10] & 255) << 8);
            x0(B0() - 2);
            if (i13 == i11) {
                this.f63284a = q10.b();
                S.b(q10);
            } else {
                q10.f63242b = i13;
            }
            return (short) b10;
        }
        throw new EOFException();
    }

    public void skip(long j10) {
        while (j10 > 0) {
            Q q10 = this.f63284a;
            if (q10 != null) {
                int min = (int) Math.min(j10, (long) (q10.f63243c - q10.f63242b));
                long j11 = (long) min;
                x0(B0() - j11);
                j10 -= j11;
                int i10 = q10.f63242b + min;
                q10.f63242b = i10;
                if (i10 == q10.f63243c) {
                    this.f63284a = q10.b();
                    S.b(q10);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    public final C5404e t() {
        C5404e eVar = new C5404e();
        if (B0() != 0) {
            Q q10 = this.f63284a;
            C6496s.e(q10);
            Q d10 = q10.d();
            eVar.f63284a = d10;
            d10.f63247g = d10;
            d10.f63246f = d10;
            for (Q q11 = q10.f63246f; q11 != q10; q11 = q11.f63246f) {
                Q q12 = d10.f63247g;
                C6496s.e(q12);
                C6496s.e(q11);
                q12.c(q11.d());
            }
            eVar.x0(B0());
        }
        return eVar;
    }

    public String t0(long j10, Charset charset) {
        C6496s.h(charset, "charset");
        int i10 = (j10 > 0 ? 1 : (j10 == 0 ? 0 : -1));
        if (i10 < 0 || j10 > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j10).toString());
        } else if (this.f63285b < j10) {
            throw new EOFException();
        } else if (i10 == 0) {
            return "";
        } else {
            Q q10 = this.f63284a;
            C6496s.e(q10);
            int i11 = q10.f63242b;
            if (((long) i11) + j10 > ((long) q10.f63243c)) {
                return new String(l0(j10), charset);
            }
            int i12 = (int) j10;
            String str = new String(q10.f63241a, i11, i12, charset);
            int i13 = q10.f63242b + i12;
            q10.f63242b = i13;
            this.f63285b -= j10;
            if (i13 == q10.f63243c) {
                this.f63284a = q10.b();
                S.b(q10);
            }
            return str;
        }
    }

    public OutputStream t1() {
        return new c(this);
    }

    public X timeout() {
        return X.f63257e;
    }

    public String toString() {
        return E0().toString();
    }

    public void u0(long j10) {
        if (this.f63285b < j10) {
            throw new EOFException();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0093, code lost:
        if (r8 != r9) goto L_0x009f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0095, code lost:
        r14.f63284a = r6.b();
        Gh.S.b(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x009f, code lost:
        r6.f63242b = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a1, code lost:
        if (r1 != false) goto L_0x00a7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0078 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long v1() {
        /*
            r14 = this;
            long r0 = r14.B0()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x00b1
            r0 = 0
            r1 = r0
            r4 = r2
        L_0x000d:
            Gh.Q r6 = r14.f63284a
            kotlin.jvm.internal.C6496s.e(r6)
            byte[] r7 = r6.f63241a
            int r8 = r6.f63242b
            int r9 = r6.f63243c
        L_0x0018:
            if (r8 >= r9) goto L_0x0093
            byte r10 = r7[r8]
            r11 = 48
            if (r10 < r11) goto L_0x0027
            r11 = 57
            if (r10 > r11) goto L_0x0027
            int r11 = r10 + -48
            goto L_0x003c
        L_0x0027:
            r11 = 97
            if (r10 < r11) goto L_0x0032
            r11 = 102(0x66, float:1.43E-43)
            if (r10 > r11) goto L_0x0032
            int r11 = r10 + -87
            goto L_0x003c
        L_0x0032:
            r11 = 65
            if (r10 < r11) goto L_0x0074
            r11 = 70
            if (r10 > r11) goto L_0x0074
            int r11 = r10 + -55
        L_0x003c:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 != 0) goto L_0x004c
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L_0x0018
        L_0x004c:
            Gh.e r0 = new Gh.e
            r0.<init>()
            Gh.e r0 = r0.e1(r4)
            Gh.e r0 = r0.K0(r10)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Number too large: "
            r2.append(r3)
            java.lang.String r0 = r0.p1()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L_0x0074:
            if (r0 == 0) goto L_0x0078
            r1 = 1
            goto L_0x0093
        L_0x0078:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            r1.append(r2)
            java.lang.String r2 = Gh.C5401b.k(r10)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0093:
            if (r8 != r9) goto L_0x009f
            Gh.Q r7 = r6.b()
            r14.f63284a = r7
            Gh.S.b(r6)
            goto L_0x00a1
        L_0x009f:
            r6.f63242b = r8
        L_0x00a1:
            if (r1 != 0) goto L_0x00a7
            Gh.Q r6 = r14.f63284a
            if (r6 != 0) goto L_0x000d
        L_0x00a7:
            long r1 = r14.B0()
            long r6 = (long) r0
            long r1 = r1 - r6
            r14.x0(r1)
            return r4
        L_0x00b1:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Gh.C5404e.v1():long");
    }

    public int write(ByteBuffer byteBuffer) {
        C6496s.h(byteBuffer, "source");
        int remaining = byteBuffer.remaining();
        int i10 = remaining;
        while (i10 > 0) {
            Q L02 = L0(1);
            int min = Math.min(i10, 8192 - L02.f63243c);
            byteBuffer.get(L02.f63241a, L02.f63243c, min);
            i10 -= min;
            L02.f63243c += min;
        }
        this.f63285b += (long) remaining;
        return remaining;
    }

    public final void x0(long j10) {
        this.f63285b = j10;
    }

    public InputStream x1() {
        return new b(this);
    }

    public final C5404e y(C5404e eVar, long j10, long j11) {
        C6496s.h(eVar, "out");
        C5401b.b(B0(), j10, j11);
        if (j11 != 0) {
            eVar.x0(eVar.B0() + j11);
            Q q10 = this.f63284a;
            while (true) {
                C6496s.e(q10);
                int i10 = q10.f63243c;
                int i11 = q10.f63242b;
                if (j10 < ((long) (i10 - i11))) {
                    break;
                }
                j10 -= (long) (i10 - i11);
                q10 = q10.f63246f;
            }
            while (j11 > 0) {
                C6496s.e(q10);
                Q d10 = q10.d();
                int i12 = d10.f63242b + ((int) j10);
                d10.f63242b = i12;
                d10.f63243c = Math.min(i12 + ((int) j11), d10.f63243c);
                Q q11 = eVar.f63284a;
                if (q11 == null) {
                    d10.f63247g = d10;
                    d10.f63246f = d10;
                    eVar.f63284a = d10;
                } else {
                    C6496s.e(q11);
                    Q q12 = q11.f63247g;
                    C6496s.e(q12);
                    q12.c(d10);
                }
                j11 -= (long) (d10.f63243c - d10.f63242b);
                q10 = q10.f63246f;
                j10 = 0;
            }
        }
        return this;
    }

    public long y1(C5404e eVar, long j10) {
        C6496s.h(eVar, "sink");
        if (j10 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        } else if (B0() == 0) {
            return -1;
        } else {
            if (j10 > B0()) {
                j10 = B0();
            }
            eVar.P(this, j10);
            return j10;
        }
    }

    public String z0(long j10) {
        return t0(j10, C5541d.f65029b);
    }

    /* renamed from: z1 */
    public C5404e v0(long j10) {
        boolean z10;
        int i10 = (j10 > 0 ? 1 : (j10 == 0 ? 0 : -1));
        if (i10 == 0) {
            return K0(48);
        }
        int i11 = 1;
        if (i10 < 0) {
            j10 = -j10;
            if (j10 < 0) {
                return X("-9223372036854775808");
            }
            z10 = true;
        } else {
            z10 = false;
        }
        if (j10 < 100000000) {
            if (j10 < 10000) {
                if (j10 < 100) {
                    if (j10 >= 10) {
                        i11 = 2;
                    }
                } else if (j10 < 1000) {
                    i11 = 3;
                } else {
                    i11 = 4;
                }
            } else if (j10 < 1000000) {
                if (j10 < 100000) {
                    i11 = 5;
                } else {
                    i11 = 6;
                }
            } else if (j10 < 10000000) {
                i11 = 7;
            } else {
                i11 = 8;
            }
        } else if (j10 < 1000000000000L) {
            if (j10 < 10000000000L) {
                if (j10 < 1000000000) {
                    i11 = 9;
                } else {
                    i11 = 10;
                }
            } else if (j10 < 100000000000L) {
                i11 = 11;
            } else {
                i11 = 12;
            }
        } else if (j10 < 1000000000000000L) {
            if (j10 < 10000000000000L) {
                i11 = 13;
            } else if (j10 < 100000000000000L) {
                i11 = 14;
            } else {
                i11 = 15;
            }
        } else if (j10 < 100000000000000000L) {
            if (j10 < 10000000000000000L) {
                i11 = 16;
            } else {
                i11 = 17;
            }
        } else if (j10 < 1000000000000000000L) {
            i11 = 18;
        } else {
            i11 = 19;
        }
        if (z10) {
            i11++;
        }
        Q L02 = L0(i11);
        byte[] bArr = L02.f63241a;
        int i12 = L02.f63243c + i11;
        while (j10 != 0) {
            long j11 = (long) 10;
            i12--;
            bArr[i12] = Hh.a.b()[(int) (j10 % j11)];
            j10 /= j11;
        }
        if (z10) {
            bArr[i12 - 1] = 45;
        }
        L02.f63243c += i11;
        x0(B0() + ((long) i11));
        return this;
    }

    /* renamed from: Gh.e$b */
    public static final class b extends InputStream {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C5404e f63293a;

        b(C5404e eVar) {
            this.f63293a = eVar;
        }

        public int available() {
            return (int) Math.min(this.f63293a.B0(), (long) a.e.API_PRIORITY_OTHER);
        }

        public int read() {
            if (this.f63293a.B0() > 0) {
                return this.f63293a.readByte() & 255;
            }
            return -1;
        }

        public String toString() {
            return this.f63293a + ".inputStream()";
        }

        public int read(byte[] bArr, int i10, int i11) {
            C6496s.h(bArr, "sink");
            return this.f63293a.read(bArr, i10, i11);
        }

        public void close() {
        }
    }

    public int read(byte[] bArr, int i10, int i11) {
        C6496s.h(bArr, "sink");
        C5401b.b((long) bArr.length, (long) i10, (long) i11);
        Q q10 = this.f63284a;
        if (q10 == null) {
            return -1;
        }
        int min = Math.min(i11, q10.f63243c - q10.f63242b);
        byte[] bArr2 = q10.f63241a;
        int i12 = q10.f63242b;
        C6559l.h(bArr2, bArr, i10, i12, i12 + min);
        q10.f63242b += min;
        x0(B0() - ((long) min));
        if (q10.f63242b == q10.f63243c) {
            this.f63284a = q10.b();
            S.b(q10);
        }
        return min;
    }

    /* renamed from: E */
    public C5404e A() {
        return this;
    }

    /* renamed from: F */
    public C5404e L() {
        return this;
    }

    public void close() {
    }

    public void flush() {
    }

    public C5404e i() {
        return this;
    }

    public C5404e x() {
        return this;
    }
}
