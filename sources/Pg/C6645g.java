package pg;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import pg.C6647i;

/* renamed from: pg.g  reason: case insensitive filesystem */
public class C6645g {

    /* renamed from: b  reason: collision with root package name */
    private static final C6645g f72517b = new C6645g(true);

    /* renamed from: a  reason: collision with root package name */
    private final Map f72518a;

    /* renamed from: pg.g$a */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final Object f72519a;

        /* renamed from: b  reason: collision with root package name */
        private final int f72520b;

        a(Object obj, int i10) {
            this.f72519a = obj;
            this.f72520b = i10;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f72519a == aVar.f72519a && this.f72520b == aVar.f72520b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f72519a) * 65535) + this.f72520b;
        }
    }

    C6645g() {
        this.f72518a = new HashMap();
    }

    public static C6645g c() {
        return f72517b;
    }

    public static C6645g d() {
        return new C6645g();
    }

    public final void a(C6647i.f fVar) {
        this.f72518a.put(new a(fVar.b(), fVar.d()), fVar);
    }

    public C6647i.f b(p pVar, int i10) {
        return (C6647i.f) this.f72518a.get(new a(pVar, i10));
    }

    private C6645g(boolean z10) {
        this.f72518a = Collections.emptyMap();
    }
}
