package ia;

import android.net.Uri;
import android.util.Base64;
import com.amazon.a.a.o.b.f;
import ja.C3645a;
import ja.M;
import java.net.URLDecoder;
import k9.L0;
import nb.C5110e;

/* renamed from: ia.i  reason: case insensitive filesystem */
public final class C3611i extends C3608f {

    /* renamed from: e  reason: collision with root package name */
    private n f44445e;

    /* renamed from: f  reason: collision with root package name */
    private byte[] f44446f;

    /* renamed from: g  reason: collision with root package name */
    private int f44447g;

    /* renamed from: h  reason: collision with root package name */
    private int f44448h;

    public C3611i() {
        super(false);
    }

    public void close() {
        if (this.f44446f != null) {
            this.f44446f = null;
            p();
        }
        this.f44445e = null;
    }

    public Uri getUri() {
        n nVar = this.f44445e;
        if (nVar != null) {
            return nVar.f44456a;
        }
        return null;
    }

    public long m(n nVar) {
        q(nVar);
        this.f44445e = nVar;
        Uri uri = nVar.f44456a;
        String scheme = uri.getScheme();
        boolean equals = "data".equals(scheme);
        C3645a.b(equals, "Unsupported scheme: " + scheme);
        String[] R02 = M.R0(uri.getSchemeSpecificPart(), f.f37529a);
        if (R02.length == 2) {
            String str = R02[1];
            if (R02[0].contains(";base64")) {
                try {
                    this.f44446f = Base64.decode(str, 0);
                } catch (IllegalArgumentException e10) {
                    throw L0.b("Error while parsing Base64 encoded string: " + str, e10);
                }
            } else {
                this.f44446f = M.n0(URLDecoder.decode(str, C5110e.f61083a.name()));
            }
            long j10 = nVar.f44462g;
            byte[] bArr = this.f44446f;
            if (j10 <= ((long) bArr.length)) {
                int i10 = (int) j10;
                this.f44447g = i10;
                int length = bArr.length - i10;
                this.f44448h = length;
                long j11 = nVar.f44463h;
                if (j11 != -1) {
                    this.f44448h = (int) Math.min((long) length, j11);
                }
                r(nVar);
                long j12 = nVar.f44463h;
                if (j12 != -1) {
                    return j12;
                }
                return (long) this.f44448h;
            }
            this.f44446f = null;
            throw new C3613k(2008);
        }
        throw L0.b("Unexpected URI format: " + uri, (Throwable) null);
    }

    public int read(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        int i12 = this.f44448h;
        if (i12 == 0) {
            return -1;
        }
        int min = Math.min(i11, i12);
        System.arraycopy(M.j(this.f44446f), this.f44447g, bArr, i10, min);
        this.f44447g += min;
        this.f44448h -= min;
        o(min);
        return min;
    }
}
