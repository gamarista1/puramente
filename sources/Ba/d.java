package ba;

import W9.h;
import ja.C3645a;
import ja.M;
import java.util.Collections;
import java.util.List;

final class d implements h {

    /* renamed from: a  reason: collision with root package name */
    private final List f36376a;

    /* renamed from: b  reason: collision with root package name */
    private final List f36377b;

    public d(List list, List list2) {
        this.f36376a = list;
        this.f36377b = list2;
    }

    public int a(long j10) {
        int d10 = M.d(this.f36377b, Long.valueOf(j10), false, false);
        if (d10 < this.f36377b.size()) {
            return d10;
        }
        return -1;
    }

    public List b(long j10) {
        int g10 = M.g(this.f36377b, Long.valueOf(j10), true, false);
        if (g10 == -1) {
            return Collections.emptyList();
        }
        return (List) this.f36376a.get(g10);
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
        if (i10 < this.f36377b.size()) {
            z11 = true;
        }
        C3645a.a(z11);
        return ((Long) this.f36377b.get(i10)).longValue();
    }

    public int e() {
        return this.f36377b.size();
    }
}
