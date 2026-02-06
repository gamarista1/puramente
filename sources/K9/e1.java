package k9;

import ja.C3645a;
import ja.M;

public final class e1 {

    /* renamed from: c  reason: collision with root package name */
    public static final e1 f45535c;

    /* renamed from: d  reason: collision with root package name */
    public static final e1 f45536d = new e1(Long.MAX_VALUE, Long.MAX_VALUE);

    /* renamed from: e  reason: collision with root package name */
    public static final e1 f45537e = new e1(Long.MAX_VALUE, 0);

    /* renamed from: f  reason: collision with root package name */
    public static final e1 f45538f = new e1(0, Long.MAX_VALUE);

    /* renamed from: g  reason: collision with root package name */
    public static final e1 f45539g;

    /* renamed from: a  reason: collision with root package name */
    public final long f45540a;

    /* renamed from: b  reason: collision with root package name */
    public final long f45541b;

    static {
        e1 e1Var = new e1(0, 0);
        f45535c = e1Var;
        f45539g = e1Var;
    }

    public e1(long j10, long j11) {
        boolean z10;
        boolean z11 = false;
        if (j10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        C3645a.a(z10);
        C3645a.a(j11 >= 0 ? true : z11);
        this.f45540a = j10;
        this.f45541b = j11;
    }

    public long a(long j10, long j11, long j12) {
        boolean z10;
        long j13 = this.f45540a;
        if (j13 == 0 && this.f45541b == 0) {
            return j10;
        }
        long U02 = M.U0(j10, j13, Long.MIN_VALUE);
        long b10 = M.b(j10, this.f45541b, Long.MAX_VALUE);
        boolean z11 = false;
        if (U02 > j11 || j11 > b10) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (U02 <= j12 && j12 <= b10) {
            z11 = true;
        }
        if (!z10 || !z11) {
            if (z10) {
                return j11;
            }
            if (z11) {
                return j12;
            }
            return U02;
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
        if (obj == null || e1.class != obj.getClass()) {
            return false;
        }
        e1 e1Var = (e1) obj;
        if (this.f45540a == e1Var.f45540a && this.f45541b == e1Var.f45541b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((int) this.f45540a) * 31) + ((int) this.f45541b);
    }
}
