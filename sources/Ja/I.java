package ja;

public final class I {

    /* renamed from: a  reason: collision with root package name */
    private long f44976a;

    /* renamed from: b  reason: collision with root package name */
    private long f44977b;

    /* renamed from: c  reason: collision with root package name */
    private long f44978c;

    /* renamed from: d  reason: collision with root package name */
    private final ThreadLocal f44979d = new ThreadLocal();

    public I(long j10) {
        g(j10);
    }

    public static long f(long j10) {
        return (j10 * 1000000) / 90000;
    }

    public static long i(long j10) {
        return (j10 * 90000) / 1000000;
    }

    public static long j(long j10) {
        return i(j10) % 8589934592L;
    }

    public synchronized long a(long j10) {
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            if (this.f44977b == -9223372036854775807L) {
                long j11 = this.f44976a;
                if (j11 == 9223372036854775806L) {
                    j11 = ((Long) C3645a.e((Long) this.f44979d.get())).longValue();
                }
                this.f44977b = j11 - j10;
                notifyAll();
            }
            this.f44978c = j10;
            return j10 + this.f44977b;
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
            long j11 = this.f44978c;
            if (j11 != -9223372036854775807L) {
                long i10 = i(j11);
                long j12 = (4294967296L + i10) / 8589934592L;
                long j13 = ((j12 - 1) * 8589934592L) + j10;
                j10 += j12 * 8589934592L;
                if (Math.abs(j13 - i10) < Math.abs(j10 - i10)) {
                    j10 = j13;
                }
            }
            return a(f(j10));
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
    }

    public synchronized long c() {
        long j10;
        j10 = this.f44976a;
        if (j10 == Long.MAX_VALUE || j10 == 9223372036854775806L) {
            j10 = -9223372036854775807L;
        }
        return j10;
    }

    public synchronized long d() {
        long j10;
        try {
            long j11 = this.f44978c;
            if (j11 != -9223372036854775807L) {
                j10 = j11 + this.f44977b;
            } else {
                j10 = c();
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
        return j10;
    }

    public synchronized long e() {
        return this.f44977b;
    }

    public synchronized void g(long j10) {
        long j11;
        this.f44976a = j10;
        if (j10 == Long.MAX_VALUE) {
            j11 = 0;
        } else {
            j11 = -9223372036854775807L;
        }
        this.f44977b = j11;
        this.f44978c = -9223372036854775807L;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0038, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void h(boolean r5, long r6) {
        /*
            r4 = this;
            monitor-enter(r4)
            long r0 = r4.f44976a     // Catch:{ all -> 0x002b }
            r2 = 9223372036854775806(0x7ffffffffffffffe, double:NaN)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x000e
            r0 = 1
            goto L_0x000f
        L_0x000e:
            r0 = 0
        L_0x000f:
            ja.C3645a.f(r0)     // Catch:{ all -> 0x002b }
            long r0 = r4.f44977b     // Catch:{ all -> 0x002b }
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x001f
            monitor-exit(r4)
            return
        L_0x001f:
            if (r5 == 0) goto L_0x002d
            java.lang.ThreadLocal r5 = r4.f44979d     // Catch:{ all -> 0x002b }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x002b }
            r5.set(r6)     // Catch:{ all -> 0x002b }
            goto L_0x0037
        L_0x002b:
            r5 = move-exception
            goto L_0x0039
        L_0x002d:
            long r5 = r4.f44977b     // Catch:{ all -> 0x002b }
            int r5 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r5 != 0) goto L_0x0037
            r4.wait()     // Catch:{ all -> 0x002b }
            goto L_0x002d
        L_0x0037:
            monitor-exit(r4)
            return
        L_0x0039:
            monitor-exit(r4)     // Catch:{ all -> 0x002b }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ja.I.h(boolean, long):void");
    }
}
