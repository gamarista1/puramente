package N9;

import android.net.Uri;
import ia.C3612j;
import ia.J;
import ia.n;
import ja.B;
import ja.C3645a;
import java.util.Map;

/* renamed from: N9.m  reason: case insensitive filesystem */
final class C3064m implements C3612j {

    /* renamed from: a  reason: collision with root package name */
    private final C3612j f33245a;

    /* renamed from: b  reason: collision with root package name */
    private final int f33246b;

    /* renamed from: c  reason: collision with root package name */
    private final a f33247c;

    /* renamed from: d  reason: collision with root package name */
    private final byte[] f33248d;

    /* renamed from: e  reason: collision with root package name */
    private int f33249e;

    /* renamed from: N9.m$a */
    public interface a {
        void c(B b10);
    }

    public C3064m(C3612j jVar, int i10, a aVar) {
        boolean z10;
        if (i10 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        C3645a.a(z10);
        this.f33245a = jVar;
        this.f33246b = i10;
        this.f33247c = aVar;
        this.f33248d = new byte[1];
        this.f33249e = i10;
    }

    private boolean o() {
        if (this.f33245a.read(this.f33248d, 0, 1) == -1) {
            return false;
        }
        int i10 = (this.f33248d[0] & 255) << 4;
        if (i10 == 0) {
            return true;
        }
        byte[] bArr = new byte[i10];
        int i11 = i10;
        int i12 = 0;
        while (i11 > 0) {
            int read = this.f33245a.read(bArr, i12, i11);
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
            this.f33247c.c(new B(bArr, i10));
        }
        return true;
    }

    public void close() {
        throw new UnsupportedOperationException();
    }

    public Map d() {
        return this.f33245a.d();
    }

    public Uri getUri() {
        return this.f33245a.getUri();
    }

    public long m(n nVar) {
        throw new UnsupportedOperationException();
    }

    public void n(J j10) {
        C3645a.e(j10);
        this.f33245a.n(j10);
    }

    public int read(byte[] bArr, int i10, int i11) {
        if (this.f33249e == 0) {
            if (!o()) {
                return -1;
            }
            this.f33249e = this.f33246b;
        }
        int read = this.f33245a.read(bArr, i10, Math.min(this.f33249e, i11));
        if (read != -1) {
            this.f33249e -= read;
        }
        return read;
    }
}
