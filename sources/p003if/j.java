package p003if;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: if.j  reason: invalid package */
public final class j implements Serializable {

    /* renamed from: b  reason: collision with root package name */
    private static final AtomicLong f67896b = new AtomicLong(8682522807148012L);
    private static final long serialVersionUID = 3905348978240129619L;

    /* renamed from: a  reason: collision with root package name */
    private final AtomicLong f67897a;

    public j() {
        this(f() ^ System.nanoTime());
    }

    private static long a(long j10) {
        return (j10 ^ 25214903917L) & 281474976710655L;
    }

    private int b(int i10) {
        long j10;
        long j11;
        AtomicLong atomicLong = this.f67897a;
        do {
            j10 = atomicLong.get();
            j11 = ((25214903917L * j10) + 11) & 281474976710655L;
        } while (!atomicLong.compareAndSet(j10, j11));
        return (int) (j11 >>> (48 - i10));
    }

    private static long f() {
        AtomicLong atomicLong;
        long j10;
        long j11;
        do {
            atomicLong = f67896b;
            j10 = atomicLong.get();
            j11 = 1181783497276652981L * j10;
        } while (!atomicLong.compareAndSet(j10, j11));
        return j11;
    }

    public void c(byte[] bArr) {
        int length = bArr.length;
        int i10 = 0;
        while (i10 < length) {
            int e10 = e();
            int min = Math.min(length - i10, 4);
            while (true) {
                int i11 = min - 1;
                if (min > 0) {
                    bArr[i10] = (byte) e10;
                    e10 >>= 8;
                    i10++;
                    min = i11;
                }
            }
        }
    }

    public double d() {
        return ((double) ((((long) b(26)) << 27) + ((long) b(27)))) * 1.1102230246251565E-16d;
    }

    public int e() {
        return b(32);
    }

    public j(long j10) {
        this.f67897a = new AtomicLong(a(j10));
    }
}
