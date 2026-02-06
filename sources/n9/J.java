package N9;

import N9.L;
import ia.C3603a;
import ia.C3604b;
import ia.C3610h;
import ja.B;
import ja.C3645a;
import ja.M;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import n9.C3867c;
import n9.C3871g;
import q9.C3962B;

class J {

    /* renamed from: a  reason: collision with root package name */
    private final C3604b f33118a;

    /* renamed from: b  reason: collision with root package name */
    private final int f33119b;

    /* renamed from: c  reason: collision with root package name */
    private final B f33120c = new B(32);

    /* renamed from: d  reason: collision with root package name */
    private a f33121d;

    /* renamed from: e  reason: collision with root package name */
    private a f33122e;

    /* renamed from: f  reason: collision with root package name */
    private a f33123f;

    /* renamed from: g  reason: collision with root package name */
    private long f33124g;

    private static final class a implements C3604b.a {

        /* renamed from: a  reason: collision with root package name */
        public long f33125a;

        /* renamed from: b  reason: collision with root package name */
        public long f33126b;

        /* renamed from: c  reason: collision with root package name */
        public C3603a f33127c;

        /* renamed from: d  reason: collision with root package name */
        public a f33128d;

        public a(long j10, int i10) {
            d(j10, i10);
        }

        public C3603a a() {
            return (C3603a) C3645a.e(this.f33127c);
        }

        public a b() {
            this.f33127c = null;
            a aVar = this.f33128d;
            this.f33128d = null;
            return aVar;
        }

        public void c(C3603a aVar, a aVar2) {
            this.f33127c = aVar;
            this.f33128d = aVar2;
        }

        public void d(long j10, int i10) {
            boolean z10;
            if (this.f33127c == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            C3645a.f(z10);
            this.f33125a = j10;
            this.f33126b = j10 + ((long) i10);
        }

        public int e(long j10) {
            return ((int) (j10 - this.f33125a)) + this.f33127c.f44421b;
        }

        public C3604b.a next() {
            a aVar = this.f33128d;
            if (aVar == null || aVar.f33127c == null) {
                return null;
            }
            return aVar;
        }
    }

    public J(C3604b bVar) {
        this.f33118a = bVar;
        int c10 = bVar.c();
        this.f33119b = c10;
        a aVar = new a(0, c10);
        this.f33121d = aVar;
        this.f33122e = aVar;
        this.f33123f = aVar;
    }

    private void a(a aVar) {
        if (aVar.f33127c != null) {
            this.f33118a.e(aVar);
            aVar.b();
        }
    }

    private static a d(a aVar, long j10) {
        while (j10 >= aVar.f33126b) {
            aVar = aVar.f33128d;
        }
        return aVar;
    }

    private void g(int i10) {
        long j10 = this.f33124g + ((long) i10);
        this.f33124g = j10;
        a aVar = this.f33123f;
        if (j10 == aVar.f33126b) {
            this.f33123f = aVar.f33128d;
        }
    }

    private int h(int i10) {
        a aVar = this.f33123f;
        if (aVar.f33127c == null) {
            aVar.c(this.f33118a.a(), new a(this.f33123f.f33126b, this.f33119b));
        }
        return Math.min(i10, (int) (this.f33123f.f33126b - this.f33124g));
    }

    private static a i(a aVar, long j10, ByteBuffer byteBuffer, int i10) {
        a d10 = d(aVar, j10);
        while (i10 > 0) {
            int min = Math.min(i10, (int) (d10.f33126b - j10));
            byteBuffer.put(d10.f33127c.f44420a, d10.e(j10), min);
            i10 -= min;
            j10 += (long) min;
            if (j10 == d10.f33126b) {
                d10 = d10.f33128d;
            }
        }
        return d10;
    }

    private static a j(a aVar, long j10, byte[] bArr, int i10) {
        a d10 = d(aVar, j10);
        int i11 = i10;
        while (i11 > 0) {
            int min = Math.min(i11, (int) (d10.f33126b - j10));
            System.arraycopy(d10.f33127c.f44420a, d10.e(j10), bArr, i10 - i11, min);
            i11 -= min;
            j10 += (long) min;
            if (j10 == d10.f33126b) {
                d10 = d10.f33128d;
            }
        }
        return d10;
    }

    private static a k(a aVar, C3871g gVar, L.b bVar, B b10) {
        boolean z10;
        L.b bVar2 = bVar;
        B b11 = b10;
        long j10 = bVar2.f33163b;
        int i10 = 1;
        b11.L(1);
        a j11 = j(aVar, j10, b10.d(), 1);
        long j12 = j10 + 1;
        byte b12 = b10.d()[0];
        if ((b12 & 128) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        byte b13 = b12 & Byte.MAX_VALUE;
        C3867c cVar = gVar.f46949b;
        byte[] bArr = cVar.f46925a;
        if (bArr == null) {
            cVar.f46925a = new byte[16];
        } else {
            Arrays.fill(bArr, (byte) 0);
        }
        a j13 = j(j11, j12, cVar.f46925a, b13);
        long j14 = j12 + ((long) b13);
        if (z10) {
            b11.L(2);
            j13 = j(j13, j14, b10.d(), 2);
            j14 += 2;
            i10 = b10.J();
        }
        int i11 = i10;
        int[] iArr = cVar.f46928d;
        if (iArr == null || iArr.length < i11) {
            iArr = new int[i11];
        }
        int[] iArr2 = iArr;
        int[] iArr3 = cVar.f46929e;
        if (iArr3 == null || iArr3.length < i11) {
            iArr3 = new int[i11];
        }
        int[] iArr4 = iArr3;
        if (z10) {
            int i12 = i11 * 6;
            b11.L(i12);
            j13 = j(j13, j14, b10.d(), i12);
            j14 += (long) i12;
            b11.P(0);
            for (int i13 = 0; i13 < i11; i13++) {
                iArr2[i13] = b10.J();
                iArr4[i13] = b10.H();
            }
        } else {
            iArr2[0] = 0;
            iArr4[0] = bVar2.f33162a - ((int) (j14 - bVar2.f33163b));
        }
        C3962B.a aVar2 = (C3962B.a) M.j(bVar2.f33164c);
        cVar.c(i11, iArr2, iArr4, aVar2.f47792b, cVar.f46925a, aVar2.f47791a, aVar2.f47793c, aVar2.f47794d);
        long j15 = bVar2.f33163b;
        int i14 = (int) (j14 - j15);
        bVar2.f33163b = j15 + ((long) i14);
        bVar2.f33162a -= i14;
        return j13;
    }

    private static a l(a aVar, C3871g gVar, L.b bVar, B b10) {
        if (gVar.z()) {
            aVar = k(aVar, gVar, bVar, b10);
        }
        if (gVar.m()) {
            b10.L(4);
            a j10 = j(aVar, bVar.f33163b, b10.d(), 4);
            int H10 = b10.H();
            bVar.f33163b += 4;
            bVar.f33162a -= 4;
            gVar.x(H10);
            a i10 = i(j10, bVar.f33163b, gVar.f46950c, H10);
            bVar.f33163b += (long) H10;
            int i11 = bVar.f33162a - H10;
            bVar.f33162a = i11;
            gVar.C(i11);
            return i(i10, bVar.f33163b, gVar.f46953f, bVar.f33162a);
        }
        gVar.x(bVar.f33162a);
        return i(aVar, bVar.f33163b, gVar.f46950c, bVar.f33162a);
    }

    public void b(long j10) {
        a aVar;
        if (j10 != -1) {
            while (true) {
                aVar = this.f33121d;
                if (j10 < aVar.f33126b) {
                    break;
                }
                this.f33118a.d(aVar.f33127c);
                this.f33121d = this.f33121d.b();
            }
            if (this.f33122e.f33125a < aVar.f33125a) {
                this.f33122e = aVar;
            }
        }
    }

    public void c(long j10) {
        boolean z10;
        if (j10 <= this.f33124g) {
            z10 = true;
        } else {
            z10 = false;
        }
        C3645a.a(z10);
        this.f33124g = j10;
        if (j10 != 0) {
            a aVar = this.f33121d;
            if (j10 != aVar.f33125a) {
                while (this.f33124g > aVar.f33126b) {
                    aVar = aVar.f33128d;
                }
                a aVar2 = (a) C3645a.e(aVar.f33128d);
                a(aVar2);
                a aVar3 = new a(aVar.f33126b, this.f33119b);
                aVar.f33128d = aVar3;
                if (this.f33124g == aVar.f33126b) {
                    aVar = aVar3;
                }
                this.f33123f = aVar;
                if (this.f33122e == aVar2) {
                    this.f33122e = aVar3;
                    return;
                }
                return;
            }
        }
        a(this.f33121d);
        a aVar4 = new a(this.f33124g, this.f33119b);
        this.f33121d = aVar4;
        this.f33122e = aVar4;
        this.f33123f = aVar4;
    }

    public long e() {
        return this.f33124g;
    }

    public void f(C3871g gVar, L.b bVar) {
        l(this.f33122e, gVar, bVar, this.f33120c);
    }

    public void m(C3871g gVar, L.b bVar) {
        this.f33122e = l(this.f33122e, gVar, bVar, this.f33120c);
    }

    public void n() {
        a(this.f33121d);
        this.f33121d.d(0, this.f33119b);
        a aVar = this.f33121d;
        this.f33122e = aVar;
        this.f33123f = aVar;
        this.f33124g = 0;
        this.f33118a.b();
    }

    public void o() {
        this.f33122e = this.f33121d;
    }

    public int p(C3610h hVar, int i10, boolean z10) {
        int h10 = h(i10);
        a aVar = this.f33123f;
        int read = hVar.read(aVar.f33127c.f44420a, aVar.e(this.f33124g), h10);
        if (read != -1) {
            g(read);
            return read;
        } else if (z10) {
            return -1;
        } else {
            throw new EOFException();
        }
    }

    public void q(B b10, int i10) {
        while (i10 > 0) {
            int h10 = h(i10);
            a aVar = this.f33123f;
            b10.j(aVar.f33127c.f44420a, aVar.e(this.f33124g), h10);
            i10 -= h10;
            g(h10);
        }
    }
}
