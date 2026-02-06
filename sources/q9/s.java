package q9;

import ja.C3645a;
import ja.M;
import q9.t;
import q9.z;

public final class s implements z {

    /* renamed from: a  reason: collision with root package name */
    private final t f47894a;

    /* renamed from: b  reason: collision with root package name */
    private final long f47895b;

    public s(t tVar, long j10) {
        this.f47894a = tVar;
        this.f47895b = j10;
    }

    private C3961A a(long j10, long j11) {
        return new C3961A((j10 * 1000000) / ((long) this.f47894a.f47900e), this.f47895b + j11);
    }

    public z.a c(long j10) {
        long j11;
        C3645a.h(this.f47894a.f47906k);
        t tVar = this.f47894a;
        t.a aVar = tVar.f47906k;
        long[] jArr = aVar.f47908a;
        long[] jArr2 = aVar.f47909b;
        int i10 = M.i(jArr, tVar.i(j10), true, false);
        long j12 = 0;
        if (i10 == -1) {
            j11 = 0;
        } else {
            j11 = jArr[i10];
        }
        if (i10 != -1) {
            j12 = jArr2[i10];
        }
        C3961A a10 = a(j11, j12);
        if (a10.f47789a == j10 || i10 == jArr.length - 1) {
            return new z.a(a10);
        }
        int i11 = i10 + 1;
        return new z.a(a10, a(jArr[i11], jArr2[i11]));
    }

    public boolean e() {
        return true;
    }

    public long g() {
        return this.f47894a.f();
    }
}
