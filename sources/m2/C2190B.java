package m2;

import i2.C2076a;
import i2.L;

/* renamed from: m2.B  reason: case insensitive filesystem */
public final class C2190B {

    /* renamed from: c  reason: collision with root package name */
    public static final C2190B f23688c;

    /* renamed from: d  reason: collision with root package name */
    public static final C2190B f23689d = new C2190B(Long.MAX_VALUE, Long.MAX_VALUE);

    /* renamed from: e  reason: collision with root package name */
    public static final C2190B f23690e = new C2190B(Long.MAX_VALUE, 0);

    /* renamed from: f  reason: collision with root package name */
    public static final C2190B f23691f = new C2190B(0, Long.MAX_VALUE);

    /* renamed from: g  reason: collision with root package name */
    public static final C2190B f23692g;

    /* renamed from: a  reason: collision with root package name */
    public final long f23693a;

    /* renamed from: b  reason: collision with root package name */
    public final long f23694b;

    static {
        C2190B b10 = new C2190B(0, 0);
        f23688c = b10;
        f23692g = b10;
    }

    public C2190B(long j10, long j11) {
        boolean z10;
        boolean z11 = false;
        if (j10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        C2076a.a(z10);
        C2076a.a(j11 >= 0 ? true : z11);
        this.f23693a = j10;
        this.f23694b = j11;
    }

    public long a(long j10, long j11, long j12) {
        boolean z10;
        long j13 = this.f23693a;
        if (j13 == 0 && this.f23694b == 0) {
            return j10;
        }
        long d12 = L.d1(j10, j13, Long.MIN_VALUE);
        long b10 = L.b(j10, this.f23694b, Long.MAX_VALUE);
        boolean z11 = false;
        if (d12 > j11 || j11 > b10) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (d12 <= j12 && j12 <= b10) {
            z11 = true;
        }
        if (!z10 || !z11) {
            if (z10) {
                return j11;
            }
            if (z11) {
                return j12;
            }
            return d12;
        } else if (Math.abs(j11 - j10) <= Math.abs(j12 - j10)) {
            return j11;
        } else {
            return j12;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2190B.class != obj.getClass()) {
            return false;
        }
        C2190B b10 = (C2190B) obj;
        if (this.f23693a == b10.f23693a && this.f23694b == b10.f23694b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((int) this.f23693a) * 31) + ((int) this.f23694b);
    }
}
