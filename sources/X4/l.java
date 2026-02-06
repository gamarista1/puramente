package x4;

import H4.k;
import I4.a;
import I4.c;
import I4.d;
import java.util.List;

public class l extends C4161g {

    /* renamed from: i  reason: collision with root package name */
    private final d f49397i = new d();

    public l(List list) {
        super(list);
    }

    /* renamed from: q */
    public d i(a aVar, float f10) {
        Object obj;
        Object obj2 = aVar.f31739b;
        if (obj2 == null || (obj = aVar.f31740c) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        d dVar = (d) obj2;
        d dVar2 = (d) obj;
        c cVar = this.f49361e;
        if (cVar != null) {
            d dVar3 = (d) cVar.b(aVar.f31744g, aVar.f31745h.floatValue(), dVar, dVar2, f10, e(), f());
            if (dVar3 != null) {
                return dVar3;
            }
        }
        this.f49397i.d(k.i(dVar.b(), dVar2.b(), f10), k.i(dVar.c(), dVar2.c(), f10));
        return this.f49397i;
    }
}
