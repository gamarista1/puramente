package cc;

import java.io.OutputStream;

/* renamed from: cc.b  reason: case insensitive filesystem */
final class C4478b extends OutputStream {

    /* renamed from: a  reason: collision with root package name */
    private long f53690a = 0;

    C4478b() {
    }

    /* access modifiers changed from: package-private */
    public long a() {
        return this.f53690a;
    }

    public void write(int i10) {
        this.f53690a++;
    }

    public void write(byte[] bArr) {
        this.f53690a += (long) bArr.length;
    }

    public void write(byte[] bArr, int i10, int i11) {
        int i12;
        if (i10 < 0 || i10 > bArr.length || i11 < 0 || (i12 = i10 + i11) > bArr.length || i12 < 0) {
            throw new IndexOutOfBoundsException();
        }
        this.f53690a += (long) i11;
    }
}
