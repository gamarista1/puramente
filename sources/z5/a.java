package Z5;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class a extends FilterInputStream {

    /* renamed from: a  reason: collision with root package name */
    private int f35948a;

    /* renamed from: b  reason: collision with root package name */
    private int f35949b;

    public a(InputStream inputStream, int i10) {
        super(inputStream);
        inputStream.getClass();
        if (i10 >= 0) {
            this.f35948a = i10;
            this.f35949b = -1;
            return;
        }
        throw new IllegalArgumentException("limit must be >= 0");
    }

    public int available() {
        return Math.min(this.in.available(), this.f35948a);
    }

    public void mark(int i10) {
        if (this.in.markSupported()) {
            this.in.mark(i10);
            this.f35949b = this.f35948a;
        }
    }

    public int read() {
        if (this.f35948a == 0) {
            return -1;
        }
        int read = this.in.read();
        if (read != -1) {
            this.f35948a--;
        }
        return read;
    }

    public void reset() {
        if (!this.in.markSupported()) {
            throw new IOException("mark is not supported");
        } else if (this.f35949b != -1) {
            this.in.reset();
            this.f35948a = this.f35949b;
        } else {
            throw new IOException("mark not set");
        }
    }

    public long skip(long j10) {
        long skip = this.in.skip(Math.min(j10, (long) this.f35948a));
        this.f35948a = (int) (((long) this.f35948a) - skip);
        return skip;
    }

    public int read(byte[] bArr, int i10, int i11) {
        int i12 = this.f35948a;
        if (i12 == 0) {
            return -1;
        }
        int read = this.in.read(bArr, i10, Math.min(i11, i12));
        if (read > 0) {
            this.f35948a -= read;
        }
        return read;
    }
}
