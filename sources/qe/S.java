package qe;

import ae.C4464a;
import com.facebook.react.bridge.Dynamic;
import expo.modules.kotlin.exception.s;

public abstract class S extends Y {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f61403a;

    public S(boolean z10) {
        this.f61403a = z10;
    }

    public Object a(Object obj, C4464a aVar) {
        if (obj != null && (!(obj instanceof Dynamic) || !((Dynamic) obj).isNull())) {
            return d(obj, aVar);
        }
        if (this.f61403a) {
            return null;
        }
        throw new s();
    }

    public abstract Object d(Object obj, C4464a aVar);
}
