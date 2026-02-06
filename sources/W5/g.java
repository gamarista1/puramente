package W5;

import T5.k;
import U5.a;
import X5.h;
import java.io.IOException;
import java.io.InputStream;

public class g extends InputStream {

    /* renamed from: a  reason: collision with root package name */
    private final InputStream f34856a;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f34857b;

    /* renamed from: c  reason: collision with root package name */
    private final h f34858c;

    /* renamed from: d  reason: collision with root package name */
    private int f34859d = 0;

    /* renamed from: e  reason: collision with root package name */
    private int f34860e = 0;

    /* renamed from: f  reason: collision with root package name */
    private boolean f34861f = false;

    public g(InputStream inputStream, byte[] bArr, h hVar) {
        this.f34856a = (InputStream) k.g(inputStream);
        this.f34857b = (byte[]) k.g(bArr);
        this.f34858c = (h) k.g(hVar);
    }

    private boolean a() {
        if (this.f34860e < this.f34859d) {
            return true;
        }
        int read = this.f34856a.read(this.f34857b);
        if (read <= 0) {
            return false;
        }
        this.f34859d = read;
        this.f34860e = 0;
        return true;
    }

    private void b() {
        if (this.f34861f) {
            throw new IOException("stream already closed");
        }
    }

    public int available() {
        boolean z10;
        if (this.f34860e <= this.f34859d) {
            z10 = true;
        } else {
            z10 = false;
        }
        k.i(z10);
        b();
        return (this.f34859d - this.f34860e) + this.f34856a.available();
    }

    public void close() {
        if (!this.f34861f) {
            this.f34861f = true;
            this.f34858c.a(this.f34857b);
            super.close();
        }
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        if (!this.f34861f) {
            a.m("PooledByteInputStream", "Finalized without closing");
            close();
        }
        super.finalize();
    }

    public int read() {
        k.i(this.f34860e <= this.f34859d);
        b();
        if (!a()) {
            return -1;
        }
        byte[] bArr = this.f34857b;
        int i10 = this.f34860e;
        this.f34860e = i10 + 1;
        return bArr[i10] & 255;
    }

    public long skip(long j10) {
        boolean z10;
        if (this.f34860e <= this.f34859d) {
            z10 = true;
        } else {
            z10 = false;
        }
        k.i(z10);
        b();
        int i10 = this.f34859d;
        int i11 = this.f34860e;
        long j11 = (long) (i10 - i11);
        if (j11 >= j10) {
            this.f34860e = (int) (((long) i11) + j10);
            return j10;
        }
        this.f34860e = i10;
        return j11 + this.f34856a.skip(j10 - j11);
    }

    public int read(byte[] bArr, int i10, int i11) {
        k.i(this.f34860e <= this.f34859d);
        b();
        if (!a()) {
            return -1;
        }
        int min = Math.min(this.f34859d - this.f34860e, i11);
        System.arraycopy(this.f34857b, this.f34860e, bArr, i10, min);
        this.f34860e += min;
        return min;
    }
}
