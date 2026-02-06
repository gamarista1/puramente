package W9;

import ja.C3645a;
import java.util.List;
import n9.C3872h;

public abstract class m extends C3872h implements h {

    /* renamed from: d  reason: collision with root package name */
    private h f34977d;

    /* renamed from: e  reason: collision with root package name */
    private long f34978e;

    public int a(long j10) {
        return ((h) C3645a.e(this.f34977d)).a(j10 - this.f34978e);
    }

    public List b(long j10) {
        return ((h) C3645a.e(this.f34977d)).b(j10 - this.f34978e);
    }

    public long c(int i10) {
        return ((h) C3645a.e(this.f34977d)).c(i10) + this.f34978e;
    }

    public int e() {
        return ((h) C3645a.e(this.f34977d)).e();
    }

    public void i() {
        super.i();
        this.f34977d = null;
    }

    public void x(long j10, h hVar, long j11) {
        this.f46958b = j10;
        this.f34977d = hVar;
        if (j11 != Long.MAX_VALUE) {
            j10 = j11;
        }
        this.f34978e = j10;
    }
}
