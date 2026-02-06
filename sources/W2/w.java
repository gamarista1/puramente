package W2;

import W2.s;
import f2.C1960A;
import f2.C1975j;
import i2.C2073A;
import i2.C2076a;
import i2.L;
import java.io.EOFException;
import z2.O;

final class w implements O {

    /* renamed from: a  reason: collision with root package name */
    private final O f8677a;

    /* renamed from: b  reason: collision with root package name */
    private final s.a f8678b;

    /* renamed from: c  reason: collision with root package name */
    private final d f8679c = new d();

    /* renamed from: d  reason: collision with root package name */
    private final C2073A f8680d = new C2073A();

    /* renamed from: e  reason: collision with root package name */
    private int f8681e = 0;

    /* renamed from: f  reason: collision with root package name */
    private int f8682f = 0;

    /* renamed from: g  reason: collision with root package name */
    private byte[] f8683g = L.f22077f;

    /* renamed from: h  reason: collision with root package name */
    private s f8684h;

    /* renamed from: i  reason: collision with root package name */
    private f2.s f8685i;

    public w(O o10, s.a aVar) {
        this.f8677a = o10;
        this.f8678b = aVar;
    }

    private void h(int i10) {
        byte[] bArr;
        int length = this.f8683g.length;
        int i11 = this.f8682f;
        if (length - i11 < i10) {
            int i12 = i11 - this.f8681e;
            int max = Math.max(i12 * 2, i10 + i12);
            byte[] bArr2 = this.f8683g;
            if (max <= bArr2.length) {
                bArr = bArr2;
            } else {
                bArr = new byte[max];
            }
            System.arraycopy(bArr2, this.f8681e, bArr, 0, i12);
            this.f8681e = 0;
            this.f8682f = i12;
            this.f8683g = bArr;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public void i(e eVar, long j10, int i10) {
        boolean z10;
        C2076a.i(this.f8685i);
        byte[] a10 = this.f8679c.a(eVar.f8637a, eVar.f8639c);
        this.f8680d.R(a10);
        this.f8677a.f(this.f8680d, a10.length);
        long j11 = eVar.f8638b;
        if (j11 == -9223372036854775807L) {
            if (this.f8685i.f20088s == Long.MAX_VALUE) {
                z10 = true;
            } else {
                z10 = false;
            }
            C2076a.g(z10);
        } else {
            long j12 = this.f8685i.f20088s;
            if (j12 == Long.MAX_VALUE) {
                j10 += j11;
            } else {
                j10 = j11 + j12;
            }
        }
        this.f8677a.d(j10, i10, a10.length, 0, (O.a) null);
    }

    public int b(C1975j jVar, int i10, boolean z10, int i11) {
        if (this.f8684h == null) {
            return this.f8677a.b(jVar, i10, z10, i11);
        }
        h(i10);
        int read = jVar.read(this.f8683g, this.f8682f, i10);
        if (read != -1) {
            this.f8682f += read;
            return read;
        } else if (z10) {
            return -1;
        } else {
            throw new EOFException();
        }
    }

    public void c(f2.s sVar) {
        boolean z10;
        s sVar2;
        C2076a.e(sVar.f20083n);
        if (C1960A.i(sVar.f20083n) == 3) {
            z10 = true;
        } else {
            z10 = false;
        }
        C2076a.a(z10);
        if (!sVar.equals(this.f8685i)) {
            this.f8685i = sVar;
            if (this.f8678b.a(sVar)) {
                sVar2 = this.f8678b.b(sVar);
            } else {
                sVar2 = null;
            }
            this.f8684h = sVar2;
        }
        if (this.f8684h == null) {
            this.f8677a.c(sVar);
        } else {
            this.f8677a.c(sVar.a().o0("application/x-media3-cues").O(sVar.f20083n).s0(Long.MAX_VALUE).S(this.f8678b.c(sVar)).K());
        }
    }

    public void d(long j10, int i10, int i11, int i12, O.a aVar) {
        boolean z10;
        if (this.f8684h == null) {
            this.f8677a.d(j10, i10, i11, i12, aVar);
            return;
        }
        if (aVar == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        C2076a.b(z10, "DRM on subtitles is not supported");
        int i13 = (this.f8682f - i12) - i11;
        this.f8684h.a(this.f8683g, i13, i11, s.b.b(), new v(this, j10, i10));
        int i14 = i13 + i11;
        this.f8681e = i14;
        if (i14 == this.f8682f) {
            this.f8681e = 0;
            this.f8682f = 0;
        }
    }

    public void e(C2073A a10, int i10, int i11) {
        if (this.f8684h == null) {
            this.f8677a.e(a10, i10, i11);
            return;
        }
        h(i10);
        a10.l(this.f8683g, this.f8682f, i10);
        this.f8682f += i10;
    }

    public void k() {
        s sVar = this.f8684h;
        if (sVar != null) {
            sVar.reset();
        }
    }
}
