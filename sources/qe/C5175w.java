package qe;

import ae.C4464a;
import com.facebook.react.bridge.Dynamic;
import kotlin.jvm.internal.C6496s;

/* renamed from: qe.w  reason: case insensitive filesystem */
public abstract class C5175w extends S {
    public C5175w(boolean z10) {
        super(z10);
    }

    public Object d(Object obj, C4464a aVar) {
        C6496s.h(obj, "value");
        if (obj instanceof Dynamic) {
            return f((Dynamic) obj, aVar);
        }
        return e(obj, aVar);
    }

    public abstract Object e(Object obj, C4464a aVar);

    public abstract Object f(Dynamic dynamic, C4464a aVar);
}
