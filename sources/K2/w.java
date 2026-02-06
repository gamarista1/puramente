package k2;

import android.net.Uri;
import i2.C2076a;
import java.util.Collections;
import java.util.Map;

public final class w implements f {

    /* renamed from: a  reason: collision with root package name */
    private final f f23276a;

    /* renamed from: b  reason: collision with root package name */
    private long f23277b;

    /* renamed from: c  reason: collision with root package name */
    private Uri f23278c = Uri.EMPTY;

    /* renamed from: d  reason: collision with root package name */
    private Map f23279d = Collections.emptyMap();

    public w(f fVar) {
        this.f23276a = (f) C2076a.e(fVar);
    }

    public void close() {
        this.f23276a.close();
    }

    public Map d() {
        return this.f23276a.d();
    }

    public Uri getUri() {
        return this.f23276a.getUri();
    }

    public long m(j jVar) {
        this.f23278c = jVar.f23194a;
        this.f23279d = Collections.emptyMap();
        long m10 = this.f23276a.m(jVar);
        this.f23278c = (Uri) C2076a.e(getUri());
        this.f23279d = d();
        return m10;
    }

    public void n(x xVar) {
        C2076a.e(xVar);
        this.f23276a.n(xVar);
    }

    public long o() {
        return this.f23277b;
    }

    public Uri p() {
        return this.f23278c;
    }

    public Map q() {
        return this.f23279d;
    }

    public void r() {
        this.f23277b = 0;
    }

    public int read(byte[] bArr, int i10, int i11) {
        int read = this.f23276a.read(bArr, i10, i11);
        if (read != -1) {
            this.f23277b += (long) read;
        }
        return read;
    }
}
