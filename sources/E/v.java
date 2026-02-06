package E;

import H0.g0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C6496s;

final class v implements g0 {

    /* renamed from: a  reason: collision with root package name */
    private final r f1690a;

    /* renamed from: b  reason: collision with root package name */
    private final Map f1691b = new LinkedHashMap();

    public v(r rVar) {
        this.f1690a = rVar;
    }

    public void a(g0.a aVar) {
        int i10;
        this.f1691b.clear();
        Iterator it = aVar.iterator();
        while (it.hasNext()) {
            Object c10 = this.f1690a.c(it.next());
            Integer num = (Integer) this.f1691b.get(c10);
            if (num != null) {
                i10 = num.intValue();
            } else {
                i10 = 0;
            }
            if (i10 == 7) {
                it.remove();
            } else {
                this.f1691b.put(c10, Integer.valueOf(i10 + 1));
            }
        }
    }

    public boolean b(Object obj, Object obj2) {
        return C6496s.c(this.f1690a.c(obj), this.f1690a.c(obj2));
    }
}
