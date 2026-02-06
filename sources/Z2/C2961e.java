package z2;

import i2.C2076a;
import i2.L;
import z2.J;

/* renamed from: z2.e  reason: case insensitive filesystem */
public abstract class C2961e {

    /* renamed from: a  reason: collision with root package name */
    protected final a f29191a;

    /* renamed from: b  reason: collision with root package name */
    protected final f f29192b;

    /* renamed from: c  reason: collision with root package name */
    protected c f29193c;

    /* renamed from: d  reason: collision with root package name */
    private final int f29194d;

    /* renamed from: z2.e$a */
    public static class a implements J {

        /* renamed from: a  reason: collision with root package name */
        private final d f29195a;

        /* renamed from: b  reason: collision with root package name */
        private final long f29196b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public final long f29197c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public final long f29198d;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public final long f29199e;
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public final long f29200f;
        /* access modifiers changed from: private */

        /* renamed from: g  reason: collision with root package name */
        public final long f29201g;

        public a(d dVar, long j10, long j11, long j12, long j13, long j14, long j15) {
            this.f29195a = dVar;
            this.f29196b = j10;
            this.f29197c = j11;
            this.f29198d = j12;
            this.f29199e = j13;
            this.f29200f = j14;
            this.f29201g = j15;
        }

        public J.a c(long j10) {
            return new J.a(new K(j10, c.h(this.f29195a.a(j10), this.f29197c, this.f29198d, this.f29199e, this.f29200f, this.f29201g)));
        }

        public boolean e() {
            return true;
        }

        public long g() {
            return this.f29196b;
        }

        public long k(long j10) {
            return this.f29195a.a(j10);
        }
    }

    /* renamed from: z2.e$c */
    protected static class c {

        /* renamed from: a  reason: collision with root package name */
        private final long f29202a;

        /* renamed from: b  reason: collision with root package name */
        private final long f29203b;

        /* renamed from: c  reason: collision with root package name */
        private final long f29204c;

        /* renamed from: d  reason: collision with root package name */
        private long f29205d;

        /* renamed from: e  reason: collision with root package name */
        private long f29206e;

        /* renamed from: f  reason: collision with root package name */
        private long f29207f;

        /* renamed from: g  reason: collision with root package name */
        private long f29208g;

        /* renamed from: h  reason: collision with root package name */
        private long f29209h;

        protected c(long j10, long j11, long j12, long j13, long j14, long j15, long j16) {
            this.f29202a = j10;
            this.f29203b = j11;
            this.f29205d = j12;
            this.f29206e = j13;
            this.f29207f = j14;
            this.f29208g = j15;
            this.f29204c = j16;
            this.f29209h = h(j11, j12, j13, j14, j15, j16);
        }

        protected static long h(long j10, long j11, long j12, long j13, long j14, long j15) {
            if (j13 + 1 >= j14 || j11 + 1 >= j12) {
                return j13;
            }
            long j16 = (long) (((float) (j10 - j11)) * (((float) (j14 - j13)) / ((float) (j12 - j11))));
            return L.p(((j16 + j13) - j15) - (j16 / 20), j13, j14 - 1);
        }

        /* access modifiers changed from: private */
        public long i() {
            return this.f29208g;
        }

        /* access modifiers changed from: private */
        public long j() {
            return this.f29207f;
        }

        /* access modifiers changed from: private */
        public long k() {
            return this.f29209h;
        }

        /* access modifiers changed from: private */
        public long l() {
            return this.f29202a;
        }

        /* access modifiers changed from: private */
        public long m() {
            return this.f29203b;
        }

        private void n() {
            this.f29209h = h(this.f29203b, this.f29205d, this.f29206e, this.f29207f, this.f29208g, this.f29204c);
        }

        /* access modifiers changed from: private */
        public void o(long j10, long j11) {
            this.f29206e = j10;
            this.f29208g = j11;
            n();
        }

        /* access modifiers changed from: private */
        public void p(long j10, long j11) {
            this.f29205d = j10;
            this.f29207f = j11;
            n();
        }
    }

    /* renamed from: z2.e$d */
    protected interface d {
        long a(long j10);
    }

    /* renamed from: z2.e$e  reason: collision with other inner class name */
    public static final class C0491e {

        /* renamed from: d  reason: collision with root package name */
        public static final C0491e f29210d = new C0491e(-3, -9223372036854775807L, -1);
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final int f29211a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final long f29212b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public final long f29213c;

        private C0491e(int i10, long j10, long j11) {
            this.f29211a = i10;
            this.f29212b = j10;
            this.f29213c = j11;
        }

        public static C0491e d(long j10, long j11) {
            return new C0491e(-1, j10, j11);
        }

        public static C0491e e(long j10) {
            return new C0491e(0, -9223372036854775807L, j10);
        }

        public static C0491e f(long j10, long j11) {
            return new C0491e(-2, j10, j11);
        }
    }

    protected C2961e(d dVar, f fVar, long j10, long j11, long j12, long j13, long j14, long j15, int i10) {
        this.f29192b = fVar;
        this.f29194d = i10;
        this.f29191a = new a(dVar, j10, j11, j12, j13, j14, j15);
    }

    /* access modifiers changed from: protected */
    public c a(long j10) {
        long j11 = j10;
        return new c(j11, this.f29191a.k(j11), this.f29191a.f29197c, this.f29191a.f29198d, this.f29191a.f29199e, this.f29191a.f29200f, this.f29191a.f29201g);
    }

    public final J b() {
        return this.f29191a;
    }

    public int c(C2973q qVar, I i10) {
        while (true) {
            c cVar = (c) C2076a.i(this.f29193c);
            long b10 = cVar.j();
            long c10 = cVar.i();
            long d10 = cVar.k();
            if (c10 - b10 <= ((long) this.f29194d)) {
                e(false, b10);
                return g(qVar, b10, i10);
            } else if (!i(qVar, d10)) {
                return g(qVar, d10, i10);
            } else {
                qVar.e();
                C0491e b11 = this.f29192b.b(qVar, cVar.m());
                int a10 = b11.f29211a;
                if (a10 == -3) {
                    e(false, d10);
                    return g(qVar, d10, i10);
                } else if (a10 == -2) {
                    cVar.p(b11.f29212b, b11.f29213c);
                } else if (a10 == -1) {
                    cVar.o(b11.f29212b, b11.f29213c);
                } else if (a10 == 0) {
                    i(qVar, b11.f29213c);
                    e(true, b11.f29213c);
                    return g(qVar, b11.f29213c, i10);
                } else {
                    throw new IllegalStateException("Invalid case");
                }
            }
        }
    }

    public final boolean d() {
        if (this.f29193c != null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final void e(boolean z10, long j10) {
        this.f29193c = null;
        this.f29192b.a();
        f(z10, j10);
    }

    /* access modifiers changed from: protected */
    public final int g(C2973q qVar, long j10, I i10) {
        if (j10 == qVar.getPosition()) {
            return 0;
        }
        i10.f29106a = j10;
        return 1;
    }

    public final void h(long j10) {
        c cVar = this.f29193c;
        if (cVar == null || cVar.l() != j10) {
            this.f29193c = a(j10);
        }
    }

    /* access modifiers changed from: protected */
    public final boolean i(C2973q qVar, long j10) {
        long position = j10 - qVar.getPosition();
        if (position < 0 || position > 262144) {
            return false;
        }
        qVar.j((int) position);
        return true;
    }

    /* renamed from: z2.e$f */
    protected interface f {
        C0491e b(C2973q qVar, long j10);

        void a() {
        }
    }

    /* renamed from: z2.e$b */
    public static final class b implements d {
        public long a(long j10) {
            return j10;
        }
    }

    /* access modifiers changed from: protected */
    public void f(boolean z10, long j10) {
    }
}
