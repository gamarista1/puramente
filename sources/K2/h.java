package k2;

import i2.C2076a;
import java.io.InputStream;

public final class h extends InputStream {

    /* renamed from: a  reason: collision with root package name */
    private final f f23188a;

    /* renamed from: b  reason: collision with root package name */
    private final j f23189b;

    /* renamed from: c  reason: collision with root package name */
    private final byte[] f23190c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f23191d = false;

    /* renamed from: e  reason: collision with root package name */
    private boolean f23192e = false;

    /* renamed from: f  reason: collision with root package name */
    private long f23193f;

    public h(f fVar, j jVar) {
        this.f23188a = fVar;
        this.f23189b = jVar;
        this.f23190c = new byte[1];
    }

    private void a() {
        if (!this.f23191d) {
            this.f23188a.m(this.f23189b);
            this.f23191d = true;
        }
    }

    public void close() {
        if (!this.f23192e) {
            this.f23188a.close();
            this.f23192e = true;
        }
    }

    public int read() {
        if (read(this.f23190c) == -1) {
            return -1;
        }
        return this.f23190c[0] & 255;
    }

    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public int read(byte[] bArr, int i10, int i11) {
        C2076a.g(!this.f23192e);
        a();
        int read = this.f23188a.read(bArr, i10, i11);
        if (read == -1) {
            return -1;
        }
        this.f23193f += (long) read;
        return read;
    }
}
