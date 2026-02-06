package If;

import java.util.Comparator;
import yf.p;

/* renamed from: If.a0  reason: case insensitive filesystem */
class C5426a0 implements Comparator {

    /* renamed from: a  reason: collision with root package name */
    private final p f63644a;

    public C5426a0(p pVar) {
        this.f63644a = pVar;
    }

    public int compare(Object obj, Object obj2) {
        return C5432d0.G(this.f63644a, obj, obj2);
    }
}
