package U;

import java.util.LinkedHashMap;
import java.util.Map;

final class l {

    /* renamed from: a  reason: collision with root package name */
    private final Map f6262a = new LinkedHashMap();

    /* renamed from: b  reason: collision with root package name */
    private final Map f6263b = new LinkedHashMap();

    public final k a(n nVar) {
        return (k) this.f6263b.get(nVar);
    }

    public final n b(k kVar) {
        return (n) this.f6262a.get(kVar);
    }

    public final void c(k kVar) {
        n nVar = (n) this.f6262a.get(kVar);
        if (nVar != null) {
            k kVar2 = (k) this.f6263b.remove(nVar);
        }
        this.f6262a.remove(kVar);
    }

    public final void d(k kVar, n nVar) {
        this.f6262a.put(kVar, nVar);
        this.f6263b.put(nVar, kVar);
    }
}
