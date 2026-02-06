package o5;

import java.io.FilterInputStream;
import java.io.InputStream;

public class i extends FilterInputStream {

    /* renamed from: a  reason: collision with root package name */
    private int f47050a = Integer.MIN_VALUE;

    public i(InputStream inputStream) {
        super(inputStream);
    }

    private long a(long j10) {
        int i10 = this.f47050a;
        if (i10 == 0) {
            return -1;
        }
        if (i10 == Integer.MIN_VALUE || j10 <= ((long) i10)) {
            return j10;
        }
        return (long) i10;
    }

    private void b(long j10) {
        int i10 = this.f47050a;
        if (i10 != Integer.MIN_VALUE && j10 != -1) {
            this.f47050a = (int) (((long) i10) - j10);
        }
    }

    public int available() {
        int i10 = this.f47050a;
        if (i10 == Integer.MIN_VALUE) {
            return super.available();
        }
        return Math.min(i10, super.available());
    }

    public synchronized void mark(int i10) {
        super.mark(i10);
        this.f47050a = i10;
    }

    public int read() {
        if (a(1) == -1) {
            return -1;
        }
        int read = super.read();
        b(1);
        return read;
    }

    public synchronized void reset() {
        super.reset();
        this.f47050a = Integer.MIN_VALUE;
    }

    public long skip(long j10) {
        long a10 = a(j10);
        if (a10 == -1) {
            return 0;
        }
        long skip = super.skip(a10);
        b(skip);
        return skip;
    }

    public int read(byte[] bArr, int i10, int i11) {
        int a10 = (int) a((long) i11);
        if (a10 == -1) {
            return -1;
        }
        int read = super.read(bArr, i10, a10);
        b((long) read);
        return read;
    }
}
