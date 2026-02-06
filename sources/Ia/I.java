package ia;

import android.net.Uri;
import ja.C3645a;
import java.util.Collections;
import java.util.Map;

public final class I implements C3612j {

    /* renamed from: a  reason: collision with root package name */
    private final C3612j f44407a;

    /* renamed from: b  reason: collision with root package name */
    private long f44408b;

    /* renamed from: c  reason: collision with root package name */
    private Uri f44409c = Uri.EMPTY;

    /* renamed from: d  reason: collision with root package name */
    private Map f44410d = Collections.emptyMap();

    public I(C3612j jVar) {
        this.f44407a = (C3612j) C3645a.e(jVar);
    }

    public void close() {
        this.f44407a.close();
    }

    public Map d() {
        return this.f44407a.d();
    }

    public Uri getUri() {
        return this.f44407a.getUri();
    }

    public long m(n nVar) {
        this.f44409c = nVar.f44456a;
        this.f44410d = Collections.emptyMap();
        long m10 = this.f44407a.m(nVar);
        this.f44409c = (Uri) C3645a.e(getUri());
        this.f44410d = d();
        return m10;
    }

    public void n(J j10) {
        C3645a.e(j10);
        this.f44407a.n(j10);
    }

    public long o() {
        return this.f44408b;
    }

    public Uri p() {
        return this.f44409c;
    }

    public Map q() {
        return this.f44410d;
    }

    public void r() {
        this.f44408b = 0;
    }

    public int read(byte[] bArr, int i10, int i11) {
        int read = this.f44407a.read(bArr, i10, i11);
        if (read != -1) {
            this.f44408b += (long) read;
        }
        return read;
    }
}
