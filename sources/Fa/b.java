package fa;

import W9.h;
import ja.C3645a;
import java.util.Collections;
import java.util.List;

final class b implements h {

    /* renamed from: a  reason: collision with root package name */
    private final List f43548a;

    public b(List list) {
        this.f43548a = Collections.unmodifiableList(list);
    }

    public int a(long j10) {
        if (j10 < 0) {
            return 0;
        }
        return -1;
    }

    public List b(long j10) {
        if (j10 >= 0) {
            return this.f43548a;
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
        C3645a.a(z10);
        return 0;
    }

    public int e() {
        return 1;
    }
}
