package U2;

import i2.C2076a;
import i2.L;
import java.io.EOFException;
import java.io.IOException;
import java.math.BigInteger;
import z2.C2973q;
import z2.C2974s;
import z2.J;
import z2.K;

final class a implements g {

    /* renamed from: a  reason: collision with root package name */
    private final f f6336a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final long f6337b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final long f6338c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final i f6339d;

    /* renamed from: e  reason: collision with root package name */
    private int f6340e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public long f6341f;

    /* renamed from: g  reason: collision with root package name */
    private long f6342g;

    /* renamed from: h  reason: collision with root package name */
    private long f6343h;

    /* renamed from: i  reason: collision with root package name */
    private long f6344i;

    /* renamed from: j  reason: collision with root package name */
    private long f6345j;

    /* renamed from: k  reason: collision with root package name */
    private long f6346k;

    /* renamed from: l  reason: collision with root package name */
    private long f6347l;

    private final class b implements J {
        private b() {
        }

        public J.a c(long j10) {
            return new J.a(new K(j10, L.p((a.this.f6337b + BigInteger.valueOf(a.this.f6339d.c(j10)).multiply(BigInteger.valueOf(a.this.f6338c - a.this.f6337b)).divide(BigInteger.valueOf(a.this.f6341f)).longValue()) - 30000, a.this.f6337b, a.this.f6338c - 1)));
        }

        public boolean e() {
            return true;
        }

        public long g() {
            return a.this.f6339d.b(a.this.f6341f);
        }
    }

    public a(i iVar, long j10, long j11, long j12, long j13, boolean z10) {
        boolean z11;
        if (j10 < 0 || j11 <= j10) {
            z11 = false;
        } else {
            z11 = true;
        }
        C2076a.a(z11);
        this.f6339d = iVar;
        this.f6337b = j10;
        this.f6338c = j11;
        if (j12 == j11 - j10 || z10) {
            this.f6341f = j13;
            this.f6340e = 4;
        } else {
            this.f6340e = 0;
        }
        this.f6336a = new f();
    }

    private long i(C2973q qVar) {
        long j10;
        C2973q qVar2 = qVar;
        if (this.f6344i == this.f6345j) {
            return -1;
        }
        long position = qVar.getPosition();
        if (!this.f6336a.d(qVar2, this.f6345j)) {
            long j11 = this.f6344i;
            if (j11 != position) {
                return j11;
            }
            throw new IOException("No ogg page can be found.");
        }
        this.f6336a.a(qVar2, false);
        qVar.e();
        long j12 = this.f6343h;
        f fVar = this.f6336a;
        long j13 = fVar.f6366c;
        long j14 = j12 - j13;
        int i10 = fVar.f6371h + fVar.f6372i;
        if (0 <= j14 && j14 < 72000) {
            return -1;
        }
        int i11 = (j14 > 0 ? 1 : (j14 == 0 ? 0 : -1));
        if (i11 < 0) {
            this.f6345j = position;
            this.f6347l = j13;
        } else {
            this.f6344i = qVar.getPosition() + ((long) i10);
            this.f6346k = this.f6336a.f6366c;
        }
        long j15 = this.f6345j;
        long j16 = this.f6344i;
        if (j15 - j16 < 100000) {
            this.f6345j = j16;
            return j16;
        }
        long j17 = (long) i10;
        if (i11 <= 0) {
            j10 = 2;
        } else {
            j10 = 1;
        }
        long position2 = qVar.getPosition() - (j17 * j10);
        long j18 = this.f6345j;
        long j19 = this.f6344i;
        return L.p(position2 + ((j14 * (j18 - j19)) / (this.f6347l - this.f6346k)), j19, j18 - 1);
    }

    private void k(C2973q qVar) {
        while (true) {
            this.f6336a.c(qVar);
            this.f6336a.a(qVar, false);
            f fVar = this.f6336a;
            if (fVar.f6366c > this.f6343h) {
                qVar.e();
                return;
            }
            qVar.j(fVar.f6371h + fVar.f6372i);
            this.f6344i = qVar.getPosition();
            this.f6346k = this.f6336a.f6366c;
        }
    }

    public long a(C2973q qVar) {
        int i10 = this.f6340e;
        if (i10 == 0) {
            long position = qVar.getPosition();
            this.f6342g = position;
            this.f6340e = 1;
            long j10 = this.f6338c - 65307;
            if (j10 > position) {
                return j10;
            }
        } else if (i10 != 1) {
            if (i10 == 2) {
                long i11 = i(qVar);
                if (i11 != -1) {
                    return i11;
                }
                this.f6340e = 3;
            } else if (i10 != 3) {
                if (i10 == 4) {
                    return -1;
                }
                throw new IllegalStateException();
            }
            k(qVar);
            this.f6340e = 4;
            return -(this.f6346k + 2);
        }
        this.f6341f = j(qVar);
        this.f6340e = 4;
        return this.f6342g;
    }

    public void c(long j10) {
        this.f6343h = L.p(j10, 0, this.f6341f - 1);
        this.f6340e = 2;
        this.f6344i = this.f6337b;
        this.f6345j = this.f6338c;
        this.f6346k = 0;
        this.f6347l = this.f6341f;
    }

    /* renamed from: h */
    public b b() {
        if (this.f6341f != 0) {
            return new b();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public long j(C2973q qVar) {
        this.f6336a.b();
        if (this.f6336a.c(qVar)) {
            this.f6336a.a(qVar, false);
            f fVar = this.f6336a;
            qVar.j(fVar.f6371h + fVar.f6372i);
            long j10 = this.f6336a.f6366c;
            while (true) {
                f fVar2 = this.f6336a;
                if ((fVar2.f6365b & 4) == 4 || !fVar2.c(qVar) || qVar.getPosition() >= this.f6338c || !this.f6336a.a(qVar, true)) {
                    break;
                }
                f fVar3 = this.f6336a;
                if (!C2974s.e(qVar, fVar3.f6371h + fVar3.f6372i)) {
                    break;
                }
                j10 = this.f6336a.f6366c;
            }
            return j10;
        }
        throw new EOFException();
    }
}
