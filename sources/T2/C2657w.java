package t2;

import android.net.Uri;
import i2.C2073A;
import i2.C2076a;
import java.util.Map;
import k2.f;
import k2.j;
import k2.x;

/* renamed from: t2.w  reason: case insensitive filesystem */
final class C2657w implements f {

    /* renamed from: a  reason: collision with root package name */
    private final f f26322a;

    /* renamed from: b  reason: collision with root package name */
    private final int f26323b;

    /* renamed from: c  reason: collision with root package name */
    private final a f26324c;

    /* renamed from: d  reason: collision with root package name */
    private final byte[] f26325d;

    /* renamed from: e  reason: collision with root package name */
    private int f26326e;

    /* renamed from: t2.w$a */
    public interface a {
        void c(C2073A a10);
    }

    public C2657w(f fVar, int i10, a aVar) {
        boolean z10;
        if (i10 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        C2076a.a(z10);
        this.f26322a = fVar;
        this.f26323b = i10;
        this.f26324c = aVar;
        this.f26325d = new byte[1];
        this.f26326e = i10;
    }

    private boolean o() {
        if (this.f26322a.read(this.f26325d, 0, 1) == -1) {
            return false;
        }
        int i10 = (this.f26325d[0] & 255) << 4;
        if (i10 == 0) {
            return true;
        }
        byte[] bArr = new byte[i10];
        int i11 = i10;
        int i12 = 0;
        while (i11 > 0) {
            int read = this.f26322a.read(bArr, i12, i11);
            if (read == -1) {
                return false;
            }
            i12 += read;
            i11 -= read;
        }
        while (i10 > 0 && bArr[i10 - 1] == 0) {
            i10--;
        }
        if (i10 > 0) {
            this.f26324c.c(new C2073A(bArr, i10));
        }
        return true;
    }

    public void close() {
        throw new UnsupportedOperationException();
    }

    public Map d() {
        return this.f26322a.d();
    }

    public Uri getUri() {
        return this.f26322a.getUri();
    }

    public long m(j jVar) {
        throw new UnsupportedOperationException();
    }

    public void n(x xVar) {
        C2076a.e(xVar);
        this.f26322a.n(xVar);
    }

    public int read(byte[] bArr, int i10, int i11) {
        if (this.f26326e == 0) {
            if (!o()) {
                return -1;
            }
            this.f26326e = this.f26323b;
        }
        int read = this.f26322a.read(bArr, i10, Math.min(this.f26326e, i11));
        if (read != -1) {
            this.f26326e -= read;
        }
        return read;
    }
}
