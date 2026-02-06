package ad;

import Tc.a;
import Tc.g;
import Wc.b;
import java.util.Map;

public final class o implements g {

    /* renamed from: a  reason: collision with root package name */
    private final j f53595a = new j();

    public b a(String str, a aVar, int i10, int i11, Map map) {
        if (aVar == a.UPC_A) {
            return this.f53595a.a("0".concat(String.valueOf(str)), a.EAN_13, i10, i11, map);
        }
        throw new IllegalArgumentException("Can only encode UPC-A, but got ".concat(String.valueOf(aVar)));
    }
}
