package k9;

import android.os.SystemClock;
import com.google.common.primitives.h;
import ja.M;
import k9.C3732y0;

/* renamed from: k9.k  reason: case insensitive filesystem */
public final class C3704k implements C3726v0 {

    /* renamed from: a  reason: collision with root package name */
    private final float f45582a;

    /* renamed from: b  reason: collision with root package name */
    private final float f45583b;

    /* renamed from: c  reason: collision with root package name */
    private final long f45584c;

    /* renamed from: d  reason: collision with root package name */
    private final float f45585d;

    /* renamed from: e  reason: collision with root package name */
    private final long f45586e;

    /* renamed from: f  reason: collision with root package name */
    private final long f45587f;

    /* renamed from: g  reason: collision with root package name */
    private final float f45588g;

    /* renamed from: h  reason: collision with root package name */
    private long f45589h;

    /* renamed from: i  reason: collision with root package name */
    private long f45590i;

    /* renamed from: j  reason: collision with root package name */
    private long f45591j;

    /* renamed from: k  reason: collision with root package name */
    private long f45592k;

    /* renamed from: l  reason: collision with root package name */
    private long f45593l;

    /* renamed from: m  reason: collision with root package name */
    private long f45594m;

    /* renamed from: n  reason: collision with root package name */
    private float f45595n;

    /* renamed from: o  reason: collision with root package name */
    private float f45596o;

    /* renamed from: p  reason: collision with root package name */
    private float f45597p;

    /* renamed from: q  reason: collision with root package name */
    private long f45598q;

    /* renamed from: r  reason: collision with root package name */
    private long f45599r;

    /* renamed from: s  reason: collision with root package name */
    private long f45600s;

    /* renamed from: k9.k$b */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private float f45601a = 0.97f;

        /* renamed from: b  reason: collision with root package name */
        private float f45602b = 1.03f;

        /* renamed from: c  reason: collision with root package name */
        private long f45603c = 1000;

        /* renamed from: d  reason: collision with root package name */
        private float f45604d = 1.0E-7f;

        /* renamed from: e  reason: collision with root package name */
        private long f45605e = M.C0(20);

        /* renamed from: f  reason: collision with root package name */
        private long f45606f = M.C0(500);

        /* renamed from: g  reason: collision with root package name */
        private float f45607g = 0.999f;

        public C3704k a() {
            return new C3704k(this.f45601a, this.f45602b, this.f45603c, this.f45604d, this.f45605e, this.f45606f, this.f45607g);
        }
    }

    private void f(long j10) {
        long j11 = this.f45599r + (this.f45600s * 3);
        if (this.f45594m > j11) {
            float C02 = (float) M.C0(this.f45584c);
            long j12 = ((long) ((this.f45597p - 1.0f) * C02)) + ((long) ((this.f45595n - 1.0f) * C02));
            this.f45594m = h.c(j11, this.f45591j, this.f45594m - j12);
            return;
        }
        long r10 = M.r(j10 - ((long) (Math.max(0.0f, this.f45597p - 1.0f) / this.f45585d)), this.f45594m, j11);
        this.f45594m = r10;
        long j13 = this.f45593l;
        if (j13 != -9223372036854775807L && r10 > j13) {
            this.f45594m = j13;
        }
    }

    private void g() {
        long j10 = this.f45589h;
        if (j10 != -9223372036854775807L) {
            long j11 = this.f45590i;
            if (j11 != -9223372036854775807L) {
                j10 = j11;
            }
            long j12 = this.f45592k;
            if (j12 != -9223372036854775807L && j10 < j12) {
                j10 = j12;
            }
            long j13 = this.f45593l;
            if (j13 != -9223372036854775807L && j10 > j13) {
                j10 = j13;
            }
        } else {
            j10 = -9223372036854775807L;
        }
        if (this.f45591j != j10) {
            this.f45591j = j10;
            this.f45594m = j10;
            this.f45599r = -9223372036854775807L;
            this.f45600s = -9223372036854775807L;
            this.f45598q = -9223372036854775807L;
        }
    }

    private static long h(long j10, long j11, float f10) {
        return (long) ((((float) j10) * f10) + ((1.0f - f10) * ((float) j11)));
    }

    private void i(long j10, long j11) {
        long j12 = j10 - j11;
        long j13 = this.f45599r;
        if (j13 == -9223372036854775807L) {
            this.f45599r = j12;
            this.f45600s = 0;
            return;
        }
        long max = Math.max(j12, h(j13, j12, this.f45588g));
        this.f45599r = max;
        this.f45600s = h(this.f45600s, Math.abs(j12 - max), this.f45588g);
    }

    public float a(long j10, long j11) {
        if (this.f45589h == -9223372036854775807L) {
            return 1.0f;
        }
        i(j10, j11);
        if (this.f45598q != -9223372036854775807L && SystemClock.elapsedRealtime() - this.f45598q < this.f45584c) {
            return this.f45597p;
        }
        this.f45598q = SystemClock.elapsedRealtime();
        f(j10);
        long j12 = j10 - this.f45594m;
        if (Math.abs(j12) < this.f45586e) {
            this.f45597p = 1.0f;
        } else {
            this.f45597p = M.p((this.f45585d * ((float) j12)) + 1.0f, this.f45596o, this.f45595n);
        }
        return this.f45597p;
    }

    public long b() {
        return this.f45594m;
    }

    public void c() {
        long j10 = this.f45594m;
        if (j10 != -9223372036854775807L) {
            long j11 = j10 + this.f45587f;
            this.f45594m = j11;
            long j12 = this.f45593l;
            if (j12 != -9223372036854775807L && j11 > j12) {
                this.f45594m = j12;
            }
            this.f45598q = -9223372036854775807L;
        }
    }

    public void d(long j10) {
        this.f45590i = j10;
        g();
    }

    public void e(C3732y0.g gVar) {
        this.f45589h = M.C0(gVar.f45909a);
        this.f45592k = M.C0(gVar.f45910b);
        this.f45593l = M.C0(gVar.f45911c);
        float f10 = gVar.f45912d;
        if (f10 == -3.4028235E38f) {
            f10 = this.f45582a;
        }
        this.f45596o = f10;
        float f11 = gVar.f45913e;
        if (f11 == -3.4028235E38f) {
            f11 = this.f45583b;
        }
        this.f45595n = f11;
        if (f10 == 1.0f && f11 == 1.0f) {
            this.f45589h = -9223372036854775807L;
        }
        g();
    }

    private C3704k(float f10, float f11, long j10, float f12, long j11, long j12, float f13) {
        this.f45582a = f10;
        this.f45583b = f11;
        this.f45584c = j10;
        this.f45585d = f12;
        this.f45586e = j11;
        this.f45587f = j12;
        this.f45588g = f13;
        this.f45589h = -9223372036854775807L;
        this.f45590i = -9223372036854775807L;
        this.f45592k = -9223372036854775807L;
        this.f45593l = -9223372036854775807L;
        this.f45596o = f10;
        this.f45595n = f11;
        this.f45597p = 1.0f;
        this.f45598q = -9223372036854775807L;
        this.f45591j = -9223372036854775807L;
        this.f45594m = -9223372036854775807L;
        this.f45599r = -9223372036854775807L;
        this.f45600s = -9223372036854775807L;
    }
}
