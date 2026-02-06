package ca;

import W9.h;
import ja.C3645a;
import ja.M;
import java.util.Collections;
import java.util.List;

final class b implements h {

    /* renamed from: a  reason: collision with root package name */
    private final W9.b[] f36568a;

    /* renamed from: b  reason: collision with root package name */
    private final long[] f36569b;

    public b(W9.b[] bVarArr, long[] jArr) {
        this.f36568a = bVarArr;
        this.f36569b = jArr;
    }

    public int a(long j10) {
        int e10 = M.e(this.f36569b, j10, false, false);
        if (e10 < this.f36569b.length) {
            return e10;
        }
        return -1;
    }

    public List b(long j10) {
        W9.b bVar;
        int i10 = M.i(this.f36569b, j10, true, false);
        if (i10 == -1 || (bVar = this.f36568a[i10]) == W9.b.f34926r) {
            return Collections.emptyList();
        }
        return Collections.singletonList(bVar);
    }

    public long c(int i10) {
        boolean z10;
        boolean z11 = false;
        if (i10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        C3645a.a(z10);
        if (i10 < this.f36569b.length) {
            z11 = true;
        }
        C3645a.a(z11);
        return this.f36569b[i10];
    }

    public int e() {
        return this.f36569b.length;
    }
}
