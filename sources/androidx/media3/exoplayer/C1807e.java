package androidx.media3.exoplayer;

import android.os.SystemClock;
import com.google.common.primitives.h;
import f2.w;
import i2.L;
import m2.x;

/* renamed from: androidx.media3.exoplayer.e  reason: case insensitive filesystem */
public final class C1807e implements x {

    /* renamed from: a  reason: collision with root package name */
    private final float f17639a;

    /* renamed from: b  reason: collision with root package name */
    private final float f17640b;

    /* renamed from: c  reason: collision with root package name */
    private final long f17641c;

    /* renamed from: d  reason: collision with root package name */
    private final float f17642d;

    /* renamed from: e  reason: collision with root package name */
    private final long f17643e;

    /* renamed from: f  reason: collision with root package name */
    private final long f17644f;

    /* renamed from: g  reason: collision with root package name */
    private final float f17645g;

    /* renamed from: h  reason: collision with root package name */
    private long f17646h;

    /* renamed from: i  reason: collision with root package name */
    private long f17647i;

    /* renamed from: j  reason: collision with root package name */
    private long f17648j;

    /* renamed from: k  reason: collision with root package name */
    private long f17649k;

    /* renamed from: l  reason: collision with root package name */
    private long f17650l;

    /* renamed from: m  reason: collision with root package name */
    private long f17651m;

    /* renamed from: n  reason: collision with root package name */
    private float f17652n;

    /* renamed from: o  reason: collision with root package name */
    private float f17653o;

    /* renamed from: p  reason: collision with root package name */
    private float f17654p;

    /* renamed from: q  reason: collision with root package name */
    private long f17655q;

    /* renamed from: r  reason: collision with root package name */
    private long f17656r;

    /* renamed from: s  reason: collision with root package name */
    private long f17657s;

    /* renamed from: androidx.media3.exoplayer.e$b */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private float f17658a = 0.97f;

        /* renamed from: b  reason: collision with root package name */
        private float f17659b = 1.03f;

        /* renamed from: c  reason: collision with root package name */
        private long f17660c = 1000;

        /* renamed from: d  reason: collision with root package name */
        private float f17661d = 1.0E-7f;

        /* renamed from: e  reason: collision with root package name */
        private long f17662e = L.L0(20);

        /* renamed from: f  reason: collision with root package name */
        private long f17663f = L.L0(500);

        /* renamed from: g  reason: collision with root package name */
        private float f17664g = 0.999f;

        public C1807e a() {
            return new C1807e(this.f17658a, this.f17659b, this.f17660c, this.f17661d, this.f17662e, this.f17663f, this.f17664g);
        }
    }

    private void f(long j10) {
        long j11 = this.f17656r + (this.f17657s * 3);
        if (this.f17651m > j11) {
            float L02 = (float) L.L0(this.f17641c);
            long j12 = ((long) ((this.f17654p - 1.0f) * L02)) + ((long) ((this.f17652n - 1.0f) * L02));
            this.f17651m = h.c(j11, this.f17648j, this.f17651m - j12);
            return;
        }
        long p10 = L.p(j10 - ((long) (Math.max(0.0f, this.f17654p - 1.0f) / this.f17642d)), this.f17651m, j11);
        this.f17651m = p10;
        long j13 = this.f17650l;
        if (j13 != -9223372036854775807L && p10 > j13) {
            this.f17651m = j13;
        }
    }

    private void g() {
        long j10;
        long j11 = this.f17646h;
        if (j11 != -9223372036854775807L) {
            j10 = this.f17647i;
            if (j10 == -9223372036854775807L) {
                long j12 = this.f17649k;
                if (j12 != -9223372036854775807L && j11 < j12) {
                    j11 = j12;
                }
                j10 = this.f17650l;
                if (j10 == -9223372036854775807L || j11 <= j10) {
                    j10 = j11;
                }
            }
        } else {
            j10 = -9223372036854775807L;
        }
        if (this.f17648j != j10) {
            this.f17648j = j10;
            this.f17651m = j10;
            this.f17656r = -9223372036854775807L;
            this.f17657s = -9223372036854775807L;
            this.f17655q = -9223372036854775807L;
        }
    }

    private static long h(long j10, long j11, float f10) {
        return (long) ((((float) j10) * f10) + ((1.0f - f10) * ((float) j11)));
    }

    private void i(long j10, long j11) {
        long j12 = j10 - j11;
        long j13 = this.f17656r;
        if (j13 == -9223372036854775807L) {
            this.f17656r = j12;
            this.f17657s = 0;
            return;
        }
        long max = Math.max(j12, h(j13, j12, this.f17645g));
        this.f17656r = max;
        this.f17657s = h(this.f17657s, Math.abs(j12 - max), this.f17645g);
    }

    public float a(long j10, long j11) {
        if (this.f17646h == -9223372036854775807L) {
            return 1.0f;
        }
        i(j10, j11);
        if (this.f17655q != -9223372036854775807L && SystemClock.elapsedRealtime() - this.f17655q < this.f17641c) {
            return this.f17654p;
        }
        this.f17655q = SystemClock.elapsedRealtime();
        f(j10);
        long j12 = j10 - this.f17651m;
        if (Math.abs(j12) < this.f17643e) {
            this.f17654p = 1.0f;
        } else {
            this.f17654p = L.n((this.f17642d * ((float) j12)) + 1.0f, this.f17653o, this.f17652n);
        }
        return this.f17654p;
    }

    public long b() {
        return this.f17651m;
    }

    public void c() {
        long j10 = this.f17651m;
        if (j10 != -9223372036854775807L) {
            long j11 = j10 + this.f17644f;
            this.f17651m = j11;
            long j12 = this.f17650l;
            if (j12 != -9223372036854775807L && j11 > j12) {
                this.f17651m = j12;
            }
            this.f17655q = -9223372036854775807L;
        }
    }

    public void d(long j10) {
        this.f17647i = j10;
        g();
    }

    public void e(w.g gVar) {
        this.f17646h = L.L0(gVar.f20231a);
        this.f17649k = L.L0(gVar.f20232b);
        this.f17650l = L.L0(gVar.f20233c);
        float f10 = gVar.f20234d;
        if (f10 == -3.4028235E38f) {
            f10 = this.f17639a;
        }
        this.f17653o = f10;
        float f11 = gVar.f20235e;
        if (f11 == -3.4028235E38f) {
            f11 = this.f17640b;
        }
        this.f17652n = f11;
        if (f10 == 1.0f && f11 == 1.0f) {
            this.f17646h = -9223372036854775807L;
        }
        g();
    }

    private C1807e(float f10, float f11, long j10, float f12, long j11, long j12, float f13) {
        this.f17639a = f10;
        this.f17640b = f11;
        this.f17641c = j10;
        this.f17642d = f12;
        this.f17643e = j11;
        this.f17644f = j12;
        this.f17645g = f13;
        this.f17646h = -9223372036854775807L;
        this.f17647i = -9223372036854775807L;
        this.f17649k = -9223372036854775807L;
        this.f17650l = -9223372036854775807L;
        this.f17653o = f10;
        this.f17652n = f11;
        this.f17654p = 1.0f;
        this.f17655q = -9223372036854775807L;
        this.f17648j = -9223372036854775807L;
        this.f17651m = -9223372036854775807L;
        this.f17656r = -9223372036854775807L;
        this.f17657s = -9223372036854775807L;
    }
}
