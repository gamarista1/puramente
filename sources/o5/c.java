package o5;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class c extends FilterInputStream {

    /* renamed from: a  reason: collision with root package name */
    private final long f47034a;

    /* renamed from: b  reason: collision with root package name */
    private int f47035b;

    private c(InputStream inputStream, long j10) {
        super(inputStream);
        this.f47034a = j10;
    }

    private int a(int i10) {
        if (i10 >= 0) {
            this.f47035b += i10;
        } else if (this.f47034a - ((long) this.f47035b) > 0) {
            throw new IOException("Failed to read all expected data, expected: " + this.f47034a + ", but read: " + this.f47035b);
        }
        return i10;
    }

    public static InputStream b(InputStream inputStream, long j10) {
        return new c(inputStream, j10);
    }

    public synchronized int available() {
        return (int) Math.max(this.f47034a - ((long) this.f47035b), (long) this.in.available());
    }

    public synchronized int read() {
        int read;
        read = super.read();
        a(read >= 0 ? 1 : -1);
        return read;
    }

    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public synchronized int read(byte[] bArr, int i10, int i11) {
        return a(super.read(bArr, i10, i11));
    }
}
