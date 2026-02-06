package a4;

import java.io.InputStream;

/* renamed from: a4.l  reason: case insensitive filesystem */
final class C3119l extends InputStream {

    /* renamed from: a  reason: collision with root package name */
    private final InputStream f36061a;

    /* renamed from: b  reason: collision with root package name */
    private int f36062b = 1073741824;

    public C3119l(InputStream inputStream) {
        this.f36061a = inputStream;
    }

    private final int a(int i10) {
        if (i10 == -1) {
            this.f36062b = 0;
        }
        return i10;
    }

    public int available() {
        return this.f36062b;
    }

    public void close() {
        this.f36061a.close();
    }

    public int read() {
        return a(this.f36061a.read());
    }

    public long skip(long j10) {
        return this.f36061a.skip(j10);
    }

    public int read(byte[] bArr) {
        return a(this.f36061a.read(bArr));
    }

    public int read(byte[] bArr, int i10, int i11) {
        return a(this.f36061a.read(bArr, i10, i11));
    }
}
