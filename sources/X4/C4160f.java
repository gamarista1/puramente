package x4;

import H4.k;
import I4.a;
import I4.c;
import java.util.List;

/* renamed from: x4.f  reason: case insensitive filesystem */
public class C4160f extends C4161g {
    public C4160f(List list) {
        super(list);
    }

    public int q() {
        return r(b(), d());
    }

    /* access modifiers changed from: package-private */
    public int r(a aVar, float f10) {
        int i10;
        if (aVar.f31739b != null) {
            if (aVar.f31740c == null) {
                i10 = aVar.h();
            } else {
                i10 = aVar.e();
            }
            c cVar = this.f49361e;
            if (cVar != null) {
                Integer num = (Integer) cVar.b(aVar.f31744g, aVar.f31745h.floatValue(), (Integer) aVar.f31739b, Integer.valueOf(i10), f10, e(), f());
                if (num != null) {
                    return num.intValue();
                }
            }
            return k.j(aVar.h(), i10, f10);
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public Integer i(a aVar, float f10) {
        return Integer.valueOf(r(aVar, f10));
    }
}
