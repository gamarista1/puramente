package q9;

import ja.A;
import ja.M;
import java.util.Collections;
import java.util.List;
import k9.C3717q0;

public final class t {

    /* renamed from: a  reason: collision with root package name */
    public final int f47896a;

    /* renamed from: b  reason: collision with root package name */
    public final int f47897b;

    /* renamed from: c  reason: collision with root package name */
    public final int f47898c;

    /* renamed from: d  reason: collision with root package name */
    public final int f47899d;

    /* renamed from: e  reason: collision with root package name */
    public final int f47900e;

    /* renamed from: f  reason: collision with root package name */
    public final int f47901f;

    /* renamed from: g  reason: collision with root package name */
    public final int f47902g;

    /* renamed from: h  reason: collision with root package name */
    public final int f47903h;

    /* renamed from: i  reason: collision with root package name */
    public final int f47904i;

    /* renamed from: j  reason: collision with root package name */
    public final long f47905j;

    /* renamed from: k  reason: collision with root package name */
    public final a f47906k;

    /* renamed from: l  reason: collision with root package name */
    private final D9.a f47907l;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final long[] f47908a;

        /* renamed from: b  reason: collision with root package name */
        public final long[] f47909b;

        public a(long[] jArr, long[] jArr2) {
            this.f47908a = jArr;
            this.f47909b = jArr2;
        }
    }

    public t(byte[] bArr, int i10) {
        A a10 = new A(bArr);
        a10.p(i10 * 8);
        this.f47896a = a10.h(16);
        this.f47897b = a10.h(16);
        this.f47898c = a10.h(24);
        this.f47899d = a10.h(24);
        int h10 = a10.h(20);
        this.f47900e = h10;
        this.f47901f = j(h10);
        this.f47902g = a10.h(3) + 1;
        int h11 = a10.h(5) + 1;
        this.f47903h = h11;
        this.f47904i = e(h11);
        this.f47905j = a10.j(36);
        this.f47906k = null;
        this.f47907l = null;
    }

    private static int e(int i10) {
        if (i10 == 8) {
            return 1;
        }
        if (i10 == 12) {
            return 2;
        }
        if (i10 == 16) {
            return 4;
        }
        if (i10 == 20) {
            return 5;
        }
        if (i10 != 24) {
            return -1;
        }
        return 6;
    }

    private static int j(int i10) {
        switch (i10) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public t a(List list) {
        return new t(this.f47896a, this.f47897b, this.f47898c, this.f47899d, this.f47900e, this.f47902g, this.f47903h, this.f47905j, this.f47906k, h(new D9.a(list)));
    }

    public t b(a aVar) {
        return new t(this.f47896a, this.f47897b, this.f47898c, this.f47899d, this.f47900e, this.f47902g, this.f47903h, this.f47905j, aVar, this.f47907l);
    }

    public t c(List list) {
        return new t(this.f47896a, this.f47897b, this.f47898c, this.f47899d, this.f47900e, this.f47902g, this.f47903h, this.f47905j, this.f47906k, h(C3965E.c(list)));
    }

    public long d() {
        long j10;
        long j11;
        long j12;
        int i10 = this.f47899d;
        if (i10 > 0) {
            j11 = (((long) i10) + ((long) this.f47898c)) / 2;
            j12 = 1;
        } else {
            int i11 = this.f47896a;
            if (i11 != this.f47897b || i11 <= 0) {
                j10 = 4096;
            } else {
                j10 = (long) i11;
            }
            j11 = ((j10 * ((long) this.f47902g)) * ((long) this.f47903h)) / 8;
            j12 = 64;
        }
        return j11 + j12;
    }

    public long f() {
        long j10 = this.f47905j;
        if (j10 == 0) {
            return -9223372036854775807L;
        }
        return (j10 * 1000000) / ((long) this.f47900e);
    }

    public C3717q0 g(byte[] bArr, D9.a aVar) {
        bArr[4] = Byte.MIN_VALUE;
        int i10 = this.f47899d;
        if (i10 <= 0) {
            i10 = -1;
        }
        return new C3717q0.b().e0("audio/flac").W(i10).H(this.f47902g).f0(this.f47900e).T(Collections.singletonList(bArr)).X(h(aVar)).E();
    }

    public D9.a h(D9.a aVar) {
        D9.a aVar2 = this.f47907l;
        if (aVar2 == null) {
            return aVar;
        }
        return aVar2.b(aVar);
    }

    public long i(long j10) {
        return M.r((j10 * ((long) this.f47900e)) / 1000000, 0, this.f47905j - 1);
    }

    private t(int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, a aVar, D9.a aVar2) {
        this.f47896a = i10;
        this.f47897b = i11;
        this.f47898c = i12;
        this.f47899d = i13;
        this.f47900e = i14;
        this.f47901f = j(i14);
        this.f47902g = i15;
        this.f47903h = i16;
        this.f47904i = e(i16);
        this.f47905j = j10;
        this.f47906k = aVar;
        this.f47907l = aVar2;
    }
}
