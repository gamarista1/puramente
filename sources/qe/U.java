package qe;

import Nd.a;
import Nd.b;
import ae.C4464a;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableMap;
import expo.modules.kotlin.jni.ExpectedType;
import je.C5052a;
import kotlin.jvm.internal.C6496s;

public final class U extends C5175w {
    public U(boolean z10) {
        super(z10);
    }

    public ExpectedType b() {
        return new ExpectedType(C5052a.READABLE_MAP);
    }

    public boolean c() {
        return false;
    }

    /* renamed from: g */
    public b e(Object obj, C4464a aVar) {
        C6496s.h(obj, "value");
        return new a(((ReadableMap) obj).toHashMap());
    }

    /* renamed from: h */
    public b f(Dynamic dynamic, C4464a aVar) {
        C6496s.h(dynamic, "value");
        return new a(dynamic.asMap().toHashMap());
    }
}
