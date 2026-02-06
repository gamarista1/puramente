package a7;

import O6.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class d {

    /* renamed from: a  reason: collision with root package name */
    private final Map f36131a;

    /* renamed from: b  reason: collision with root package name */
    private final List f36132b;

    public static final class a {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public Map f36133a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public List f36134b;

        public a c(c cVar, c.b bVar, c cVar2) {
            if (this.f36134b == null) {
                this.f36134b = new ArrayList();
            }
            this.f36134b.add(bVar);
            if (cVar2 != null) {
                e(cVar, cVar2);
            }
            return this;
        }

        public d d() {
            return new d(this);
        }

        public a e(c cVar, c cVar2) {
            if (this.f36133a == null) {
                this.f36133a = new HashMap();
            }
            this.f36133a.put(cVar, cVar2);
            return this;
        }
    }

    public Map a() {
        return this.f36131a;
    }

    public List b() {
        return this.f36132b;
    }

    private d(a aVar) {
        this.f36131a = aVar.f36133a;
        this.f36132b = aVar.f36134b;
    }
}
