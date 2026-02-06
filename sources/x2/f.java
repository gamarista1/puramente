package X2;

import W2.k;
import i2.C2076a;
import java.util.Collections;
import java.util.List;

final class f implements k {

    /* renamed from: a  reason: collision with root package name */
    private final List f9672a;

    public f(List list) {
        this.f9672a = list;
    }

    public int a(long j10) {
        if (j10 < 0) {
            return 0;
        }
        return -1;
    }

    public List b(long j10) {
        if (j10 >= 0) {
            return this.f9672a;
        }
        return Collections.emptyList();
    }

    public long c(int i10) {
        boolean z10;
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        C2076a.a(z10);
        return 0;
    }

    public int e() {
        return 1;
    }
}
