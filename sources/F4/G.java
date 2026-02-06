package F4;

import G4.c;
import I4.d;

public class G implements N {

    /* renamed from: a  reason: collision with root package name */
    public static final G f30681a = new G();

    private G() {
    }

    /* renamed from: b */
    public d a(c cVar, float f10) {
        boolean z10;
        if (cVar.M() == c.b.BEGIN_ARRAY) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            cVar.b();
        }
        float v10 = (float) cVar.v();
        float v11 = (float) cVar.v();
        while (cVar.q()) {
            cVar.V();
        }
        if (z10) {
            cVar.n();
        }
        return new d((v10 / 100.0f) * f10, (v11 / 100.0f) * f10);
    }
}
