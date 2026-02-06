package q9;

import ja.C3645a;
import ja.M;
import q9.z;

/* renamed from: q9.a  reason: case insensitive filesystem */
public abstract class C3966a {

    /* renamed from: a  reason: collision with root package name */
    protected final C0720a f47828a;

    /* renamed from: b  reason: collision with root package name */
    protected final f f47829b;

    /* renamed from: c  reason: collision with root package name */
    protected c f47830c;

    /* renamed from: d  reason: collision with root package name */
    private final int f47831d;

    /* renamed from: q9.a$a  reason: collision with other inner class name */
    public static class C0720a implements z {

        /* renamed from: a  reason: collision with root package name */
        private final d f47832a;

        /* renamed from: b  reason: collision with root package name */
        private final long f47833b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public final long f47834c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public final long f47835d;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public final long f47836e;
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public final long f47837f;
        /* access modifiers changed from: private */

        /* renamed from: g  reason: collision with root package name */
        public final long f47838g;

        public C0720a(d dVar, long j10, long j11, long j12, long j13, long j14, long j15) {
            this.f47832a = dVar;
            this.f47833b = j10;
            this.f47834c = j11;
            this.f47835d = j12;
            this.f47836e = j13;
            this.f47837f = j14;
            this.f47838g = j15;
        }

        public z.a c(long j10) {
            return new z.a(new C3961A(j10, c.h(this.f47832a.a(j10), this.f47834c, this.f47835d, this.f47836e, this.f47837f, this.f47838g)));
        }

        public boolean e() {
            return true;
        }

        public long g() {
            return this.f47833b;
        }

        public long k(long j10) {
            return this.f47832a.a(j10);
        }
    }

    /* renamed from: q9.a$c */
    protected static class c {

        /* renamed from: a  reason: collision with root package name */
        private final long f47839a;

        /* renamed from: b  reason: collision with root package name */
        private final long f47840b;

        /* renamed from: c  reason: collision with root package name */
        private final long f47841c;

        /* renamed from: d  reason: collision with root package name */
        private long f47842d;

        /* renamed from: e  reason: collision with root package name */
        private long f47843e;

        /* renamed from: f  reason: collision with root package name */
        private long f47844f;

        /* renamed from: g  reason: collision with root package name */
        private long f47845g;

        /* renamed from: h  reason: collision with root package name */
        private long f47846h;

        protected c(long j10, long j11, long j12, long j13, long j14, long j15, long j16) {
            this.f47839a = j10;
            this.f47840b = j11;
            this.f47842d = j12;
            this.f47843e = j13;
            this.f47844f = j14;
            this.f47845g = j15;
            this.f47841c = j16;
            this.f47846h = h(j11, j12, j13, j14, j15, j16);
        }

        protected static long h(long j10, long j11, long j12, long j13, long j14, long j15) {
            if (j13 + 1 >= j14 || j11 + 1 >= j12) {
                return j13;
            }
            long j16 = (long) (((float) (j10 - j11)) * (((float) (j14 - j13)) / ((float) (j12 - j11))));
            return M.r(((j16 + j13) - j15) - (j16 / 20), j13, j14 - 1);
        }

        /* access modifiers changed from: private */
        public long i() {
            return this.f47845g;
        }

        /* access modifiers changed from: private */
        public long j() {
            return this.f47844f;
        }

        /* access modifiers changed from: private */
        public long k() {
            return this.f47846h;
        }

        /* access modifiers changed from: private */
        public long l() {
            return this.f47839a;
        }

        /* access modifiers changed from: private */
        public long m() {
            return this.f47840b;
        }

        private void n() {
            this.f47846h = h(this.f47840b, this.f47842d, this.f47843e, this.f47844f, this.f47845g, this.f47841c);
        }

        /* access modifiers changed from: private */
        public void o(long j10, long j11) {
            this.f47843e = j10;
            this.f47845g = j11;
            n();
        }

        /* access modifiers changed from: private */
        public void p(long j10, long j11) {
            this.f47842d = j10;
            this.f47844f = j11;
            n();
        }
    }

    /* renamed from: q9.a$d */
    protected interface d {
        long a(long j10);
    }

    /* renamed from: q9.a$e */
    public static final class e {

        /* renamed from: d  reason: collision with root package name */
        public static final e f47847d = new e(-3, -9223372036854775807L, -1);
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final int f47848a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final long f47849b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public final long f47850c;

        private e(int i10, long j10, long j11) {
            this.f47848a = i10;
            this.f47849b = j10;
            this.f47850c = j11;
        }

        public static e d(long j10, long j11) {
            return new e(-1, j10, j11);
        }

        public static e e(long j10) {
            return new e(0, -9223372036854775807L, j10);
        }

        public static e f(long j10, long j11) {
            return new e(-2, j10, j11);
        }
    }

    protected C3966a(d dVar, f fVar, long j10, long j11, long j12, long j13, long j14, long j15, int i10) {
        this.f47829b = fVar;
        this.f47831d = i10;
        this.f47828a = new C0720a(dVar, j10, j11, j12, j13, j14, j15);
    }

    /* access modifiers changed from: protected */
    public c a(long j10) {
        long j11 = j10;
        return new c(j11, this.f47828a.k(j11), this.f47828a.f47834c, this.f47828a.f47835d, this.f47828a.f47836e, this.f47828a.f47837f, this.f47828a.f47838g);
    }

    public final z b() {
        return this.f47828a;
    }

    public int c(l lVar, y yVar) {
        while (true) {
            c cVar = (c) C3645a.h(this.f47830c);
            long b10 = cVar.j();
            long c10 = cVar.i();
            long d10 = cVar.k();
            if (c10 - b10 <= ((long) this.f47831d)) {
                e(false, b10);
                return g(lVar, b10, yVar);
            } else if (!i(lVar, d10)) {
                return g(lVar, d10, yVar);
            } else {
                lVar.e();
                e b11 = this.f47829b.b(lVar, cVar.m());
                int a10 = b11.f47848a;
                if (a10 == -3) {
                    e(false, d10);
                    return g(lVar, d10, yVar);
                } else if (a10 == -2) {
                    cVar.p(b11.f47849b, b11.f47850c);
                } else if (a10 == -1) {
                    cVar.o(b11.f47849b, b11.f47850c);
                } else if (a10 == 0) {
                    i(lVar, b11.f47850c);
                    e(true, b11.f47850c);
                    return g(lVar, b11.f47850c, yVar);
                } else {
                    throw new IllegalStateException("Invalid case");
                }
            }
        }
    }

    public final boolean d() {
        if (this.f47830c != null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final void e(boolean z10, long j10) {
        this.f47830c = null;
        this.f47829b.a();
        f(z10, j10);
    }

    /* access modifiers changed from: protected */
    public final int g(l lVar, long j10, y yVar) {
        if (j10 == lVar.getPosition()) {
            return 0;
        }
        yVar.f47919a = j10;
        return 1;
    }

    public final void h(long j10) {
        c cVar = this.f47830c;
        if (cVar == null || cVar.l() != j10) {
            this.f47830c = a(j10);
        }
    }

    /* access modifiers changed from: protected */
    public final boolean i(l lVar, long j10) {
        long position = j10 - lVar.getPosition();
        if (position < 0 || position > 262144) {
            return false;
        }
        lVar.j((int) position);
        return true;
    }

    /* renamed from: q9.a$f */
    protected interface f {
        e b(l lVar, long j10);

        void a() {
        }
    }

    /* renamed from: q9.a$b */
    public static final class b implements d {
        public long a(long j10) {
            return j10;
        }
    }

    /* access modifiers changed from: protected */
    public void f(boolean z10, long j10) {
    }
}
