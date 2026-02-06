package i2;

public final class G {

    /* renamed from: a  reason: collision with root package name */
    private long f22067a;

    /* renamed from: b  reason: collision with root package name */
    private long f22068b;

    /* renamed from: c  reason: collision with root package name */
    private long f22069c;

    /* renamed from: d  reason: collision with root package name */
    private final ThreadLocal f22070d = new ThreadLocal();

    public G(long j10) {
        i(j10);
    }

    public static long h(long j10) {
        return (j10 * 1000000) / 90000;
    }

    public static long j(long j10) {
        return (j10 * 90000) / 1000000;
    }

    public synchronized long a(long j10) {
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            if (!g()) {
                long j11 = this.f22067a;
                if (j11 == 9223372036854775806L) {
                    j11 = ((Long) C2076a.e((Long) this.f22070d.get())).longValue();
                }
                this.f22068b = j11 - j10;
                notifyAll();
            }
            this.f22069c = j10;
            return j10 + this.f22068b;
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
    }

    public synchronized long b(long j10) {
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j11 = this.f22069c;
            if (j11 != -9223372036854775807L) {
                long j12 = j(j11);
                long j13 = (4294967296L + j12) / 8589934592L;
                long j14 = ((j13 - 1) * 8589934592L) + j10;
                j10 += j13 * 8589934592L;
                if (Math.abs(j14 - j12) < Math.abs(j10 - j12)) {
                    j10 = j14;
                }
            }
            return a(h(j10));
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
    }

    public synchronized long c(long j10) {
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j11 = this.f22069c;
            if (j11 != -9223372036854775807L) {
                long j12 = j(j11);
                long j13 = j12 / 8589934592L;
                long j14 = (j13 * 8589934592L) + j10;
                j10 += (j13 + 1) * 8589934592L;
                if (j14 >= j12) {
                    j10 = j14;
                }
            }
            return a(h(j10));
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
    }

    public synchronized long d() {
        long j10;
        j10 = this.f22067a;
        if (j10 == Long.MAX_VALUE || j10 == 9223372036854775806L) {
            j10 = -9223372036854775807L;
        }
        return j10;
    }

    public synchronized long e() {
        long j10;
        try {
            long j11 = this.f22069c;
            if (j11 != -9223372036854775807L) {
                j10 = j11 + this.f22068b;
            } else {
                j10 = d();
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
        return j10;
    }

    public synchronized long f() {
        return this.f22068b;
    }

    public synchronized boolean g() {
        boolean z10;
        if (this.f22068b != -9223372036854775807L) {
            z10 = true;
        } else {
            z10 = false;
        }
        return z10;
    }

    public synchronized void i(long j10) {
        long j11;
        this.f22067a = j10;
        if (j10 == Long.MAX_VALUE) {
            j11 = 0;
        } else {
            j11 = -9223372036854775807L;
        }
        this.f22068b = j11;
        this.f22069c = -9223372036854775807L;
    }
}
