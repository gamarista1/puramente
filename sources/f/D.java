package F;

import E.C1135d;
import yf.C6798l;

public final class D {

    /* renamed from: a  reason: collision with root package name */
    private final C1135d f1926a;

    public D(C1135d dVar) {
        this.f1926a = dVar;
    }

    public final boolean a(int i10) {
        if (i10 < 0 || i10 >= this.f1926a.getSize()) {
            return false;
        }
        C1135d.a aVar = this.f1926a.get(i10);
        C6798l b10 = ((C1172g) aVar.c()).b();
        int b11 = i10 - aVar.b();
        if (b10 == null || b10.invoke(Integer.valueOf(b11)) != I.f1969b.a()) {
            return false;
        }
        return true;
    }
}
