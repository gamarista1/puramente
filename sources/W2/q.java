package W2;

import i2.C2076a;
import java.util.List;
import l2.g;

public abstract class q extends g implements k {

    /* renamed from: e  reason: collision with root package name */
    private k f8661e;

    /* renamed from: f  reason: collision with root package name */
    private long f8662f;

    public int a(long j10) {
        return ((k) C2076a.e(this.f8661e)).a(j10 - this.f8662f);
    }

    public List b(long j10) {
        return ((k) C2076a.e(this.f8661e)).b(j10 - this.f8662f);
    }

    public long c(int i10) {
        return ((k) C2076a.e(this.f8661e)).c(i10) + this.f8662f;
    }

    public int e() {
        return ((k) C2076a.e(this.f8661e)).e();
    }

    public void i() {
        super.i();
        this.f8661e = null;
    }

    public void u(long j10, k kVar, long j11) {
        this.f23528b = j10;
        this.f8661e = kVar;
        if (j11 != Long.MAX_VALUE) {
            j10 = j11;
        }
        this.f8662f = j10;
    }
}
