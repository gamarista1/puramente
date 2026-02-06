package z2;

import f2.s;
import f2.z;
import i2.L;
import java.util.Collections;
import java.util.List;

public final class y {

    /* renamed from: a  reason: collision with root package name */
    public final int f29281a;

    /* renamed from: b  reason: collision with root package name */
    public final int f29282b;

    /* renamed from: c  reason: collision with root package name */
    public final int f29283c;

    /* renamed from: d  reason: collision with root package name */
    public final int f29284d;

    /* renamed from: e  reason: collision with root package name */
    public final int f29285e;

    /* renamed from: f  reason: collision with root package name */
    public final int f29286f;

    /* renamed from: g  reason: collision with root package name */
    public final int f29287g;

    /* renamed from: h  reason: collision with root package name */
    public final int f29288h;

    /* renamed from: i  reason: collision with root package name */
    public final int f29289i;

    /* renamed from: j  reason: collision with root package name */
    public final long f29290j;

    /* renamed from: k  reason: collision with root package name */
    public final a f29291k;

    /* renamed from: l  reason: collision with root package name */
    private final z f29292l;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final long[] f29293a;

        /* renamed from: b  reason: collision with root package name */
        public final long[] f29294b;

        public a(long[] jArr, long[] jArr2) {
            this.f29293a = jArr;
            this.f29294b = jArr2;
        }
    }

    public y(byte[] bArr, int i10) {
        i2.z zVar = new i2.z(bArr);
        zVar.p(i10 * 8);
        this.f29281a = zVar.h(16);
        this.f29282b = zVar.h(16);
        this.f29283c = zVar.h(24);
        this.f29284d = zVar.h(24);
        int h10 = zVar.h(20);
        this.f29285e = h10;
        this.f29286f = j(h10);
        this.f29287g = zVar.h(3) + 1;
        int h11 = zVar.h(5) + 1;
        this.f29288h = h11;
        this.f29289i = e(h11);
        this.f29290j = zVar.j(36);
        this.f29291k = null;
        this.f29292l = null;
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

    public y a(List list) {
        return new y(this.f29281a, this.f29282b, this.f29283c, this.f29284d, this.f29285e, this.f29287g, this.f29288h, this.f29290j, this.f29291k, h(new z(list)));
    }

    public y b(a aVar) {
        return new y(this.f29281a, this.f29282b, this.f29283c, this.f29284d, this.f29285e, this.f29287g, this.f29288h, this.f29290j, aVar, this.f29292l);
    }

    public y c(List list) {
        return new y(this.f29281a, this.f29282b, this.f29283c, this.f29284d, this.f29285e, this.f29287g, this.f29288h, this.f29290j, this.f29291k, h(S.d(list)));
    }

    public long d() {
        long j10;
        long j11;
        long j12;
        int i10 = this.f29284d;
        if (i10 > 0) {
            j11 = (((long) i10) + ((long) this.f29283c)) / 2;
            j12 = 1;
        } else {
            int i11 = this.f29281a;
            if (i11 != this.f29282b || i11 <= 0) {
                j10 = 4096;
            } else {
                j10 = (long) i11;
            }
            j11 = ((j10 * ((long) this.f29287g)) * ((long) this.f29288h)) / 8;
            j12 = 64;
        }
        return j11 + j12;
    }

    public long f() {
        long j10 = this.f29290j;
        if (j10 == 0) {
            return -9223372036854775807L;
        }
        return (j10 * 1000000) / ((long) this.f29285e);
    }

    public s g(byte[] bArr, z zVar) {
        bArr[4] = Byte.MIN_VALUE;
        int i10 = this.f29284d;
        if (i10 <= 0) {
            i10 = -1;
        }
        return new s.b().o0("audio/flac").f0(i10).N(this.f29287g).p0(this.f29285e).i0(L.d0(this.f29288h)).b0(Collections.singletonList(bArr)).h0(h(zVar)).K();
    }

    public z h(z zVar) {
        z zVar2 = this.f29292l;
        if (zVar2 == null) {
            return zVar;
        }
        return zVar2.b(zVar);
    }

    public long i(long j10) {
        return L.p((j10 * ((long) this.f29285e)) / 1000000, 0, this.f29290j - 1);
    }

    private y(int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, a aVar, z zVar) {
        this.f29281a = i10;
        this.f29282b = i11;
        this.f29283c = i12;
        this.f29284d = i13;
        this.f29285e = i14;
        this.f29286f = j(i14);
        this.f29287g = i15;
        this.f29288h = i16;
        this.f29289i = e(i16);
        this.f29290j = j10;
        this.f29291k = aVar;
        this.f29292l = zVar;
    }
}
