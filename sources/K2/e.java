package k2;

import android.net.Uri;
import android.util.Base64;
import com.amazon.a.a.o.b.f;
import f2.C1961B;
import i2.C2076a;
import i2.L;
import java.net.URLDecoder;
import nb.C5110e;

public final class e extends C2147b {

    /* renamed from: e  reason: collision with root package name */
    private j f23183e;

    /* renamed from: f  reason: collision with root package name */
    private byte[] f23184f;

    /* renamed from: g  reason: collision with root package name */
    private int f23185g;

    /* renamed from: h  reason: collision with root package name */
    private int f23186h;

    public e() {
        super(false);
    }

    public void close() {
        if (this.f23184f != null) {
            this.f23184f = null;
            p();
        }
        this.f23183e = null;
    }

    public Uri getUri() {
        j jVar = this.f23183e;
        if (jVar != null) {
            return jVar.f23194a;
        }
        return null;
    }

    public long m(j jVar) {
        q(jVar);
        this.f23183e = jVar;
        Uri normalizeScheme = jVar.f23194a.normalizeScheme();
        String scheme = normalizeScheme.getScheme();
        boolean equals = "data".equals(scheme);
        C2076a.b(equals, "Unsupported scheme: " + scheme);
        String[] a12 = L.a1(normalizeScheme.getSchemeSpecificPart(), f.f37529a);
        if (a12.length == 2) {
            String str = a12[1];
            if (a12[0].contains(";base64")) {
                try {
                    this.f23184f = Base64.decode(str, 0);
                } catch (IllegalArgumentException e10) {
                    throw C1961B.b("Error while parsing Base64 encoded string: " + str, e10);
                }
            } else {
                this.f23184f = L.q0(URLDecoder.decode(str, C5110e.f61083a.name()));
            }
            long j10 = jVar.f23200g;
            byte[] bArr = this.f23184f;
            if (j10 <= ((long) bArr.length)) {
                int i10 = (int) j10;
                this.f23185g = i10;
                int length = bArr.length - i10;
                this.f23186h = length;
                long j11 = jVar.f23201h;
                if (j11 != -1) {
                    this.f23186h = (int) Math.min((long) length, j11);
                }
                r(jVar);
                long j12 = jVar.f23201h;
                if (j12 != -1) {
                    return j12;
                }
                return (long) this.f23186h;
            }
            this.f23184f = null;
            throw new g(2008);
        }
        throw C1961B.b("Unexpected URI format: " + normalizeScheme, (Throwable) null);
    }

    public int read(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        int i12 = this.f23186h;
        if (i12 == 0) {
            return -1;
        }
        int min = Math.min(i11, i12);
        System.arraycopy(L.h(this.f23184f), this.f23185g, bArr, i10, min);
        this.f23185g += min;
        this.f23186h -= min;
        o(min);
        return min;
    }
}
