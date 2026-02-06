package z9;

import ja.C3645a;
import ja.M;
import java.io.EOFException;
import java.io.IOException;
import q9.C3961A;
import q9.l;
import q9.n;
import q9.z;

/* renamed from: z9.a  reason: case insensitive filesystem */
final class C4239a implements g {

    /* renamed from: a  reason: collision with root package name */
    private final f f50097a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final long f50098b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final long f50099c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final i f50100d;

    /* renamed from: e  reason: collision with root package name */
    private int f50101e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public long f50102f;

    /* renamed from: g  reason: collision with root package name */
    private long f50103g;

    /* renamed from: h  reason: collision with root package name */
    private long f50104h;

    /* renamed from: i  reason: collision with root package name */
    private long f50105i;

    /* renamed from: j  reason: collision with root package name */
    private long f50106j;

    /* renamed from: k  reason: collision with root package name */
    private long f50107k;

    /* renamed from: l  reason: collision with root package name */
    private long f50108l;

    /* renamed from: z9.a$b */
    private final class b implements z {
        private b() {
        }

        public z.a c(long j10) {
            return new z.a(new C3961A(j10, M.r((C4239a.this.f50098b + ((C4239a.this.f50100d.c(j10) * (C4239a.this.f50099c - C4239a.this.f50098b)) / C4239a.this.f50102f)) - 30000, C4239a.this.f50098b, C4239a.this.f50099c - 1)));
        }

        public boolean e() {
            return true;
        }

        public long g() {
            return C4239a.this.f50100d.b(C4239a.this.f50102f);
        }
    }

    public C4239a(i iVar, long j10, long j11, long j12, long j13, boolean z10) {
        boolean z11;
        if (j10 < 0 || j11 <= j10) {
            z11 = false;
        } else {
            z11 = true;
        }
        C3645a.a(z11);
        this.f50100d = iVar;
        this.f50098b = j10;
        this.f50099c = j11;
        if (j12 == j11 - j10 || z10) {
            this.f50102f = j13;
            this.f50101e = 4;
        } else {
            this.f50101e = 0;
        }
        this.f50097a = new f();
    }

    private long i(l lVar) {
        long j10;
        l lVar2 = lVar;
        if (this.f50105i == this.f50106j) {
            return -1;
        }
        long position = lVar.getPosition();
        if (!this.f50097a.d(lVar2, this.f50106j)) {
            long j11 = this.f50105i;
            if (j11 != position) {
                return j11;
            }
            throw new IOException("No ogg page can be found.");
        }
        this.f50097a.a(lVar2, false);
        lVar.e();
        long j12 = this.f50104h;
        f fVar = this.f50097a;
        long j13 = fVar.f50127c;
        long j14 = j12 - j13;
        int i10 = fVar.f50132h + fVar.f50133i;
        if (0 <= j14 && j14 < 72000) {
            return -1;
        }
        int i11 = (j14 > 0 ? 1 : (j14 == 0 ? 0 : -1));
        if (i11 < 0) {
            this.f50106j = position;
            this.f50108l = j13;
        } else {
            this.f50105i = lVar.getPosition() + ((long) i10);
            this.f50107k = this.f50097a.f50127c;
        }
        long j15 = this.f50106j;
        long j16 = this.f50105i;
        if (j15 - j16 < 100000) {
            this.f50106j = j16;
            return j16;
        }
        long j17 = (long) i10;
        if (i11 <= 0) {
            j10 = 2;
        } else {
            j10 = 1;
        }
        long position2 = lVar.getPosition() - (j17 * j10);
        long j18 = this.f50106j;
        long j19 = this.f50105i;
        return M.r(position2 + ((j14 * (j18 - j19)) / (this.f50108l - this.f50107k)), j19, j18 - 1);
    }

    private void k(l lVar) {
        while (true) {
            this.f50097a.c(lVar);
            this.f50097a.a(lVar, false);
            f fVar = this.f50097a;
            if (fVar.f50127c > this.f50104h) {
                lVar.e();
                return;
            }
            lVar.j(fVar.f50132h + fVar.f50133i);
            this.f50105i = lVar.getPosition();
            this.f50107k = this.f50097a.f50127c;
        }
    }

    public long a(l lVar) {
        int i10 = this.f50101e;
        if (i10 == 0) {
            long position = lVar.getPosition();
            this.f50103g = position;
            this.f50101e = 1;
            long j10 = this.f50099c - 65307;
            if (j10 > position) {
                return j10;
            }
        } else if (i10 != 1) {
            if (i10 == 2) {
                long i11 = i(lVar);
                if (i11 != -1) {
                    return i11;
                }
                this.f50101e = 3;
            } else if (i10 != 3) {
                if (i10 == 4) {
                    return -1;
                }
                throw new IllegalStateException();
            }
            k(lVar);
            this.f50101e = 4;
            return -(this.f50107k + 2);
        }
        this.f50102f = j(lVar);
        this.f50101e = 4;
        return this.f50103g;
    }

    public void c(long j10) {
        this.f50104h = M.r(j10, 0, this.f50102f - 1);
        this.f50101e = 2;
        this.f50105i = this.f50098b;
        this.f50106j = this.f50099c;
        this.f50107k = 0;
        this.f50108l = this.f50102f;
    }

    /* renamed from: h */
    public b b() {
        if (this.f50102f != 0) {
            return new b();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public long j(l lVar) {
        this.f50097a.b();
        if (this.f50097a.c(lVar)) {
            this.f50097a.a(lVar, false);
            f fVar = this.f50097a;
            lVar.j(fVar.f50132h + fVar.f50133i);
            long j10 = this.f50097a.f50127c;
            while (true) {
                f fVar2 = this.f50097a;
                if ((fVar2.f50126b & 4) == 4 || !fVar2.c(lVar) || lVar.getPosition() >= this.f50099c || !this.f50097a.a(lVar, true)) {
                    break;
                }
                f fVar3 = this.f50097a;
                if (!n.e(lVar, fVar3.f50132h + fVar3.f50133i)) {
                    break;
                }
                j10 = this.f50097a.f50127c;
            }
            return j10;
        }
        throw new EOFException();
    }
}
