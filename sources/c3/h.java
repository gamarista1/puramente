package c3;

import W2.k;
import i2.L;
import java.util.Collections;
import java.util.List;
import java.util.Map;

final class h implements k {

    /* renamed from: a  reason: collision with root package name */
    private final c f19357a;

    /* renamed from: b  reason: collision with root package name */
    private final long[] f19358b;

    /* renamed from: c  reason: collision with root package name */
    private final Map f19359c;

    /* renamed from: d  reason: collision with root package name */
    private final Map f19360d;

    /* renamed from: e  reason: collision with root package name */
    private final Map f19361e;

    public h(c cVar, Map map, Map map2, Map map3) {
        Map map4;
        this.f19357a = cVar;
        this.f19360d = map2;
        this.f19361e = map3;
        if (map != null) {
            map4 = Collections.unmodifiableMap(map);
        } else {
            map4 = Collections.emptyMap();
        }
        this.f19359c = map4;
        this.f19358b = cVar.j();
    }

    public int a(long j10) {
        int d10 = L.d(this.f19358b, j10, false, false);
        if (d10 < this.f19358b.length) {
            return d10;
        }
        return -1;
    }

    public List b(long j10) {
        return this.f19357a.h(j10, this.f19359c, this.f19360d, this.f19361e);
    }

    public long c(int i10) {
        return this.f19358b[i10];
    }

    public int e() {
        return this.f19358b.length;
    }
}
