package N9;

/* renamed from: N9.g  reason: case insensitive filesystem */
public class C3058g implements N {

    /* renamed from: a  reason: collision with root package name */
    protected final N[] f33231a;

    public C3058g(N[] nArr) {
        this.f33231a = nArr;
    }

    public final long a() {
        long j10 = Long.MAX_VALUE;
        for (N a10 : this.f33231a) {
            long a11 = a10.a();
            if (a11 != Long.MIN_VALUE) {
                j10 = Math.min(j10, a11);
            }
        }
        if (j10 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j10;
    }

    public boolean b() {
        for (N b10 : this.f33231a) {
            if (b10.b()) {
                return true;
            }
        }
        return false;
    }

    public final long c() {
        long j10 = Long.MAX_VALUE;
        for (N c10 : this.f33231a) {
            long c11 = c10.c();
            if (c11 != Long.MIN_VALUE) {
                j10 = Math.min(j10, c11);
            }
        }
        if (j10 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j10;
    }

    public final void f(long j10) {
        for (N f10 : this.f33231a) {
            f10.f(j10);
        }
    }

    public boolean m(long j10) {
        boolean z10;
        long j11 = j10;
        boolean z11 = false;
        while (true) {
            long a10 = a();
            if (a10 != Long.MIN_VALUE) {
                boolean z12 = false;
                for (N n10 : this.f33231a) {
                    long a11 = n10.a();
                    if (a11 == Long.MIN_VALUE || a11 > j11) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (a11 == a10 || z10) {
                        z12 |= n10.m(j11);
                    }
                }
                z11 |= z12;
                if (!z12) {
                    break;
                }
            } else {
                break;
            }
        }
        return z11;
    }
}
