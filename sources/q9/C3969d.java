package q9;

import q9.z;

/* renamed from: q9.d  reason: case insensitive filesystem */
public class C3969d implements z {

    /* renamed from: a  reason: collision with root package name */
    private final long f47857a;

    /* renamed from: b  reason: collision with root package name */
    private final long f47858b;

    /* renamed from: c  reason: collision with root package name */
    private final int f47859c;

    /* renamed from: d  reason: collision with root package name */
    private final long f47860d;

    /* renamed from: e  reason: collision with root package name */
    private final int f47861e;

    /* renamed from: f  reason: collision with root package name */
    private final long f47862f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f47863g;

    public C3969d(long j10, long j11, int i10, int i11, boolean z10) {
        this.f47857a = j10;
        this.f47858b = j11;
        this.f47859c = i11 == -1 ? 1 : i11;
        this.f47861e = i10;
        this.f47863g = z10;
        if (j10 == -1) {
            this.f47860d = -1;
            this.f47862f = -9223372036854775807L;
            return;
        }
        this.f47860d = j10 - j11;
        this.f47862f = h(j10, j11, i10);
    }

    private long a(long j10) {
        int i10 = this.f47859c;
        long j11 = (((j10 * ((long) this.f47861e)) / 8000000) / ((long) i10)) * ((long) i10);
        long j12 = this.f47860d;
        if (j12 != -1) {
            j11 = Math.min(j11, j12 - ((long) i10));
        }
        return this.f47858b + Math.max(j11, 0);
    }

    private static long h(long j10, long j11, int i10) {
        return (Math.max(0, j10 - j11) * 8000000) / ((long) i10);
    }

    public z.a c(long j10) {
        if (this.f47860d == -1 && !this.f47863g) {
            return new z.a(new C3961A(0, this.f47858b));
        }
        long a10 = a(j10);
        long f10 = f(a10);
        C3961A a11 = new C3961A(f10, a10);
        if (this.f47860d != -1 && f10 < j10) {
            int i10 = this.f47859c;
            if (((long) i10) + a10 < this.f47857a) {
                long j11 = a10 + ((long) i10);
                return new z.a(a11, new C3961A(f(j11), j11));
            }
        }
        return new z.a(a11);
    }

    public boolean e() {
        if (this.f47860d != -1 || this.f47863g) {
            return true;
        }
        return false;
    }

    public long f(long j10) {
        return h(j10, this.f47858b, this.f47861e);
    }

    public long g() {
        return this.f47862f;
    }
}
