package z2;

import z2.J;

/* renamed from: z2.h  reason: case insensitive filesystem */
public class C2964h implements J {

    /* renamed from: a  reason: collision with root package name */
    private final long f29220a;

    /* renamed from: b  reason: collision with root package name */
    private final long f29221b;

    /* renamed from: c  reason: collision with root package name */
    private final int f29222c;

    /* renamed from: d  reason: collision with root package name */
    private final long f29223d;

    /* renamed from: e  reason: collision with root package name */
    private final int f29224e;

    /* renamed from: f  reason: collision with root package name */
    private final long f29225f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f29226g;

    public C2964h(long j10, long j11, int i10, int i11, boolean z10) {
        this.f29220a = j10;
        this.f29221b = j11;
        this.f29222c = i11 == -1 ? 1 : i11;
        this.f29224e = i10;
        this.f29226g = z10;
        if (j10 == -1) {
            this.f29223d = -1;
            this.f29225f = -9223372036854775807L;
            return;
        }
        this.f29223d = j10 - j11;
        this.f29225f = h(j10, j11, i10);
    }

    private long a(long j10) {
        int i10 = this.f29222c;
        long j11 = (((j10 * ((long) this.f29224e)) / 8000000) / ((long) i10)) * ((long) i10);
        long j12 = this.f29223d;
        if (j12 != -1) {
            j11 = Math.min(j11, j12 - ((long) i10));
        }
        return this.f29221b + Math.max(j11, 0);
    }

    private static long h(long j10, long j11, int i10) {
        return (Math.max(0, j10 - j11) * 8000000) / ((long) i10);
    }

    public J.a c(long j10) {
        if (this.f29223d == -1 && !this.f29226g) {
            return new J.a(new K(0, this.f29221b));
        }
        long a10 = a(j10);
        long f10 = f(a10);
        K k10 = new K(f10, a10);
        if (this.f29223d != -1 && f10 < j10) {
            int i10 = this.f29222c;
            if (((long) i10) + a10 < this.f29220a) {
                long j11 = a10 + ((long) i10);
                return new J.a(k10, new K(f(j11), j11));
            }
        }
        return new J.a(k10);
    }

    public boolean e() {
        if (this.f29223d != -1 || this.f29226g) {
            return true;
        }
        return false;
    }

    public long f(long j10) {
        return h(j10, this.f29221b, this.f29224e);
    }

    public long g() {
        return this.f29225f;
    }
}
