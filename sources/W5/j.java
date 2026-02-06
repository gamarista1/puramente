package W5;

import T5.k;
import java.io.InputStream;

public class j extends InputStream {

    /* renamed from: a  reason: collision with root package name */
    final h f34862a;

    /* renamed from: b  reason: collision with root package name */
    int f34863b = 0;

    /* renamed from: c  reason: collision with root package name */
    int f34864c = 0;

    public j(h hVar) {
        k.b(Boolean.valueOf(!hVar.isClosed()));
        this.f34862a = (h) k.g(hVar);
    }

    public int available() {
        return this.f34862a.size() - this.f34863b;
    }

    public void mark(int i10) {
        this.f34864c = this.f34863b;
    }

    public boolean markSupported() {
        return true;
    }

    public int read() {
        if (available() <= 0) {
            return -1;
        }
        h hVar = this.f34862a;
        int i10 = this.f34863b;
        this.f34863b = i10 + 1;
        return hVar.r(i10) & 255;
    }

    public void reset() {
        this.f34863b = this.f34864c;
    }

    public long skip(long j10) {
        boolean z10;
        if (j10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        k.b(Boolean.valueOf(z10));
        int min = Math.min((int) j10, available());
        this.f34863b += min;
        return (long) min;
    }

    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public int read(byte[] bArr, int i10, int i11) {
        if (i10 < 0 || i11 < 0 || i10 + i11 > bArr.length) {
            throw new ArrayIndexOutOfBoundsException("length=" + bArr.length + "; regionStart=" + i10 + "; regionLength=" + i11);
        }
        int available = available();
        if (available <= 0) {
            return -1;
        }
        if (i11 <= 0) {
            return 0;
        }
        int min = Math.min(available, i11);
        this.f34862a.c(this.f34863b, bArr, i10, min);
        this.f34863b += min;
        return min;
    }
}
