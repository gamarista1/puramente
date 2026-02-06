package da;

import ja.M;
import java.util.Collections;
import java.util.List;
import java.util.Map;

final class h implements W9.h {

    /* renamed from: a  reason: collision with root package name */
    private final d f43244a;

    /* renamed from: b  reason: collision with root package name */
    private final long[] f43245b;

    /* renamed from: c  reason: collision with root package name */
    private final Map f43246c;

    /* renamed from: d  reason: collision with root package name */
    private final Map f43247d;

    /* renamed from: e  reason: collision with root package name */
    private final Map f43248e;

    public h(d dVar, Map map, Map map2, Map map3) {
        Map map4;
        this.f43244a = dVar;
        this.f43247d = map2;
        this.f43248e = map3;
        if (map != null) {
            map4 = Collections.unmodifiableMap(map);
        } else {
            map4 = Collections.emptyMap();
        }
        this.f43246c = map4;
        this.f43245b = dVar.j();
    }

    public int a(long j10) {
        int e10 = M.e(this.f43245b, j10, false, false);
        if (e10 < this.f43245b.length) {
            return e10;
        }
        return -1;
    }

    public List b(long j10) {
        return this.f43244a.h(j10, this.f43246c, this.f43247d, this.f43248e);
    }

    public long c(int i10) {
        return this.f43245b[i10];
    }

    public int e() {
        return this.f43245b.length;
    }
}
