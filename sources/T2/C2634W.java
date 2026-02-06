package t2;

import f2.C1975j;
import i2.C2073A;
import i2.C2076a;
import i2.L;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import l2.c;
import l2.f;
import t2.Y;
import w2.C2819a;
import w2.C2820b;
import z2.O;

/* renamed from: t2.W  reason: case insensitive filesystem */
class C2634W {

    /* renamed from: a  reason: collision with root package name */
    private final C2820b f26106a;

    /* renamed from: b  reason: collision with root package name */
    private final int f26107b;

    /* renamed from: c  reason: collision with root package name */
    private final C2073A f26108c = new C2073A(32);

    /* renamed from: d  reason: collision with root package name */
    private a f26109d;

    /* renamed from: e  reason: collision with root package name */
    private a f26110e;

    /* renamed from: f  reason: collision with root package name */
    private a f26111f;

    /* renamed from: g  reason: collision with root package name */
    private long f26112g;

    /* renamed from: t2.W$a */
    private static final class a implements C2820b.a {

        /* renamed from: a  reason: collision with root package name */
        public long f26113a;

        /* renamed from: b  reason: collision with root package name */
        public long f26114b;

        /* renamed from: c  reason: collision with root package name */
        public C2819a f26115c;

        /* renamed from: d  reason: collision with root package name */
        public a f26116d;

        public a(long j10, int i10) {
            d(j10, i10);
        }

        public C2819a a() {
            return (C2819a) C2076a.e(this.f26115c);
        }

        public a b() {
            this.f26115c = null;
            a aVar = this.f26116d;
            this.f26116d = null;
            return aVar;
        }

        public void c(C2819a aVar, a aVar2) {
            this.f26115c = aVar;
            this.f26116d = aVar2;
        }

        public void d(long j10, int i10) {
            boolean z10;
            if (this.f26115c == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            C2076a.g(z10);
            this.f26113a = j10;
            this.f26114b = j10 + ((long) i10);
        }

        public int e(long j10) {
            return ((int) (j10 - this.f26113a)) + this.f26115c.f27708b;
        }

        public C2820b.a next() {
            a aVar = this.f26116d;
            if (aVar == null || aVar.f26115c == null) {
                return null;
            }
            return aVar;
        }
    }

    public C2634W(C2820b bVar) {
        this.f26106a = bVar;
        int c10 = bVar.c();
        this.f26107b = c10;
        a aVar = new a(0, c10);
        this.f26109d = aVar;
        this.f26110e = aVar;
        this.f26111f = aVar;
    }

    private void a(a aVar) {
        if (aVar.f26115c != null) {
            this.f26106a.d(aVar);
            aVar.b();
        }
    }

    private static a c(a aVar, long j10) {
        while (j10 >= aVar.f26114b) {
            aVar = aVar.f26116d;
        }
        return aVar;
    }

    private void f(int i10) {
        long j10 = this.f26112g + ((long) i10);
        this.f26112g = j10;
        a aVar = this.f26111f;
        if (j10 == aVar.f26114b) {
            this.f26111f = aVar.f26116d;
        }
    }

    private int g(int i10) {
        a aVar = this.f26111f;
        if (aVar.f26115c == null) {
            aVar.c(this.f26106a.a(), new a(this.f26111f.f26114b, this.f26107b));
        }
        return Math.min(i10, (int) (this.f26111f.f26114b - this.f26112g));
    }

    private static a h(a aVar, long j10, ByteBuffer byteBuffer, int i10) {
        a c10 = c(aVar, j10);
        while (i10 > 0) {
            int min = Math.min(i10, (int) (c10.f26114b - j10));
            byteBuffer.put(c10.f26115c.f27707a, c10.e(j10), min);
            i10 -= min;
            j10 += (long) min;
            if (j10 == c10.f26114b) {
                c10 = c10.f26116d;
            }
        }
        return c10;
    }

    private static a i(a aVar, long j10, byte[] bArr, int i10) {
        a c10 = c(aVar, j10);
        int i11 = i10;
        while (i11 > 0) {
            int min = Math.min(i11, (int) (c10.f26114b - j10));
            System.arraycopy(c10.f26115c.f27707a, c10.e(j10), bArr, i10 - i11, min);
            i11 -= min;
            j10 += (long) min;
            if (j10 == c10.f26114b) {
                c10 = c10.f26116d;
            }
        }
        return c10;
    }

    private static a j(a aVar, f fVar, Y.b bVar, C2073A a10) {
        boolean z10;
        Y.b bVar2 = bVar;
        C2073A a11 = a10;
        long j10 = bVar2.f26151b;
        int i10 = 1;
        a11.Q(1);
        a i11 = i(aVar, j10, a10.e(), 1);
        long j11 = j10 + 1;
        byte b10 = a10.e()[0];
        if ((b10 & 128) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        byte b11 = b10 & Byte.MAX_VALUE;
        c cVar = fVar.f23519c;
        byte[] bArr = cVar.f23506a;
        if (bArr == null) {
            cVar.f23506a = new byte[16];
        } else {
            Arrays.fill(bArr, (byte) 0);
        }
        a i12 = i(i11, j11, cVar.f23506a, b11);
        long j12 = j11 + ((long) b11);
        if (z10) {
            a11.Q(2);
            i12 = i(i12, j12, a10.e(), 2);
            j12 += 2;
            i10 = a10.N();
        }
        int i13 = i10;
        int[] iArr = cVar.f23509d;
        if (iArr == null || iArr.length < i13) {
            iArr = new int[i13];
        }
        int[] iArr2 = iArr;
        int[] iArr3 = cVar.f23510e;
        if (iArr3 == null || iArr3.length < i13) {
            iArr3 = new int[i13];
        }
        int[] iArr4 = iArr3;
        if (z10) {
            int i14 = i13 * 6;
            a11.Q(i14);
            i12 = i(i12, j12, a10.e(), i14);
            j12 += (long) i14;
            a11.U(0);
            for (int i15 = 0; i15 < i13; i15++) {
                iArr2[i15] = a10.N();
                iArr4[i15] = a10.L();
            }
        } else {
            iArr2[0] = 0;
            iArr4[0] = bVar2.f26150a - ((int) (j12 - bVar2.f26151b));
        }
        O.a aVar2 = (O.a) L.h(bVar2.f26152c);
        cVar.c(i13, iArr2, iArr4, aVar2.f29124b, cVar.f23506a, aVar2.f29123a, aVar2.f29125c, aVar2.f29126d);
        long j13 = bVar2.f26151b;
        int i16 = (int) (j12 - j13);
        bVar2.f26151b = j13 + ((long) i16);
        bVar2.f26150a -= i16;
        return i12;
    }

    private static a k(a aVar, f fVar, Y.b bVar, C2073A a10) {
        if (fVar.y()) {
            aVar = j(aVar, fVar, bVar, a10);
        }
        if (fVar.l()) {
            a10.Q(4);
            a i10 = i(aVar, bVar.f26151b, a10.e(), 4);
            int L10 = a10.L();
            bVar.f26151b += 4;
            bVar.f26150a -= 4;
            fVar.u(L10);
            a h10 = h(i10, bVar.f26151b, fVar.f23520d, L10);
            bVar.f26151b += (long) L10;
            int i11 = bVar.f26150a - L10;
            bVar.f26150a = i11;
            fVar.A(i11);
            return h(h10, bVar.f26151b, fVar.f23523g, bVar.f26150a);
        }
        fVar.u(bVar.f26150a);
        return h(aVar, bVar.f26151b, fVar.f23520d, bVar.f26150a);
    }

    public void b(long j10) {
        a aVar;
        if (j10 != -1) {
            while (true) {
                aVar = this.f26109d;
                if (j10 < aVar.f26114b) {
                    break;
                }
                this.f26106a.e(aVar.f26115c);
                this.f26109d = this.f26109d.b();
            }
            if (this.f26110e.f26113a < aVar.f26113a) {
                this.f26110e = aVar;
            }
        }
    }

    public long d() {
        return this.f26112g;
    }

    public void e(f fVar, Y.b bVar) {
        k(this.f26110e, fVar, bVar, this.f26108c);
    }

    public void l(f fVar, Y.b bVar) {
        this.f26110e = k(this.f26110e, fVar, bVar, this.f26108c);
    }

    public void m() {
        a(this.f26109d);
        this.f26109d.d(0, this.f26107b);
        a aVar = this.f26109d;
        this.f26110e = aVar;
        this.f26111f = aVar;
        this.f26112g = 0;
        this.f26106a.b();
    }

    public void n() {
        this.f26110e = this.f26109d;
    }

    public int o(C1975j jVar, int i10, boolean z10) {
        int g10 = g(i10);
        a aVar = this.f26111f;
        int read = jVar.read(aVar.f26115c.f27707a, aVar.e(this.f26112g), g10);
        if (read != -1) {
            f(read);
            return read;
        } else if (z10) {
            return -1;
        } else {
            throw new EOFException();
        }
    }

    public void p(C2073A a10, int i10) {
        while (i10 > 0) {
            int g10 = g(i10);
            a aVar = this.f26111f;
            a10.l(aVar.f26115c.f27707a, aVar.e(this.f26112g), g10);
            i10 -= g10;
            f(g10);
        }
    }
}
