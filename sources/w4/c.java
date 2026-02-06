package W4;

import java.util.Queue;
import o5.l;

abstract class c {

    /* renamed from: a  reason: collision with root package name */
    private final Queue f34813a = l.g(20);

    c() {
    }

    /* access modifiers changed from: package-private */
    public abstract l a();

    /* access modifiers changed from: package-private */
    public l b() {
        l lVar = (l) this.f34813a.poll();
        if (lVar == null) {
            return a();
        }
        return lVar;
    }

    public void c(l lVar) {
        if (this.f34813a.size() < 20) {
            this.f34813a.offer(lVar);
        }
    }
}
