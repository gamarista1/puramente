package ia;

import ja.C3645a;
import java.io.InputStream;

public final class l extends InputStream {

    /* renamed from: a  reason: collision with root package name */
    private final C3612j f44450a;

    /* renamed from: b  reason: collision with root package name */
    private final n f44451b;

    /* renamed from: c  reason: collision with root package name */
    private final byte[] f44452c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f44453d = false;

    /* renamed from: e  reason: collision with root package name */
    private boolean f44454e = false;

    /* renamed from: f  reason: collision with root package name */
    private long f44455f;

    public l(C3612j jVar, n nVar) {
        this.f44450a = jVar;
        this.f44451b = nVar;
        this.f44452c = new byte[1];
    }

    private void a() {
        if (!this.f44453d) {
            this.f44450a.m(this.f44451b);
            this.f44453d = true;
        }
    }

    public void b() {
        a();
    }

    public void close() {
        if (!this.f44454e) {
            this.f44450a.close();
            this.f44454e = true;
        }
    }

    public int read() {
        if (read(this.f44452c) == -1) {
            return -1;
        }
        return this.f44452c[0] & 255;
    }

    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public int read(byte[] bArr, int i10, int i11) {
        C3645a.f(!this.f44454e);
        a();
        int read = this.f44450a.read(bArr, i10, i11);
        if (read == -1) {
            return -1;
        }
        this.f44455f += (long) read;
        return read;
    }
}
