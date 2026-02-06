package x4;

import H4.d;
import H4.k;
import I4.a;
import I4.c;
import java.util.List;

/* renamed from: x4.b  reason: case insensitive filesystem */
public class C4156b extends C4161g {
    public C4156b(List list) {
        super(list);
    }

    public int q() {
        return r(b(), d());
    }

    public int r(a aVar, float f10) {
        Float f11;
        if (aVar.f31739b == null || aVar.f31740c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        c cVar = this.f49361e;
        if (!(cVar == null || (f11 = aVar.f31745h) == null)) {
            Integer num = (Integer) cVar.b(aVar.f31744g, f11.floatValue(), (Integer) aVar.f31739b, (Integer) aVar.f31740c, f10, e(), f());
            if (num != null) {
                return num.intValue();
            }
        }
        return d.c(k.b(f10, 0.0f, 1.0f), ((Integer) aVar.f31739b).intValue(), ((Integer) aVar.f31740c).intValue());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public Integer i(a aVar, float f10) {
        return Integer.valueOf(r(aVar, f10));
    }
}
