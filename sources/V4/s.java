package V4;

import T4.f;
import java.util.HashMap;
import java.util.Map;

final class s {

    /* renamed from: a  reason: collision with root package name */
    private final Map f34627a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final Map f34628b = new HashMap();

    s() {
    }

    private Map b(boolean z10) {
        if (z10) {
            return this.f34628b;
        }
        return this.f34627a;
    }

    /* access modifiers changed from: package-private */
    public l a(f fVar, boolean z10) {
        return (l) b(z10).get(fVar);
    }

    /* access modifiers changed from: package-private */
    public void c(f fVar, l lVar) {
        b(lVar.p()).put(fVar, lVar);
    }

    /* access modifiers changed from: package-private */
    public void d(f fVar, l lVar) {
        Map b10 = b(lVar.p());
        if (lVar.equals(b10.get(fVar))) {
            b10.remove(fVar);
        }
    }
}
