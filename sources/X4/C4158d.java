package x4;

import H4.k;
import I4.a;
import I4.c;
import java.util.List;

/* renamed from: x4.d  reason: case insensitive filesystem */
public class C4158d extends C4161g {
    public C4158d(List list) {
        super(list);
    }

    public float q() {
        return r(b(), d());
    }

    /* access modifiers changed from: package-private */
    public float r(a aVar, float f10) {
        if (aVar.f31739b == null || aVar.f31740c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        c cVar = this.f49361e;
        if (cVar != null) {
            Float f11 = (Float) cVar.b(aVar.f31744g, aVar.f31745h.floatValue(), (Float) aVar.f31739b, (Float) aVar.f31740c, f10, e(), f());
            if (f11 != null) {
                return f11.floatValue();
            }
        }
        return k.i(aVar.g(), aVar.d(), f10);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public Float i(a aVar, float f10) {
        return Float.valueOf(r(aVar, f10));
    }
}
