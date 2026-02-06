package qe;

import Tg.a;
import Tg.c;
import Tg.d;
import ae.C4464a;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableType;
import expo.modules.kotlin.jni.ExpectedType;
import je.C5052a;
import kotlin.jvm.internal.C6496s;

/* renamed from: qe.v  reason: case insensitive filesystem */
public final class C5174v extends C5175w {
    public C5174v(boolean z10) {
        super(z10);
    }

    public ExpectedType b() {
        return new ExpectedType(C5052a.DOUBLE);
    }

    public boolean c() {
        return false;
    }

    public /* bridge */ /* synthetic */ Object e(Object obj, C4464a aVar) {
        return a.f(g(obj, aVar));
    }

    public /* bridge */ /* synthetic */ Object f(Dynamic dynamic, C4464a aVar) {
        return a.f(h(dynamic, aVar));
    }

    public long g(Object obj, C4464a aVar) {
        C6496s.h(obj, "value");
        return c.r(((Double) obj).doubleValue(), d.SECONDS);
    }

    public long h(Dynamic dynamic, C4464a aVar) {
        C6496s.h(dynamic, "value");
        if (dynamic.getType() == ReadableType.Number) {
            return c.r(dynamic.asDouble(), d.SECONDS);
        }
        ReadableType type = dynamic.getType();
        throw new IllegalArgumentException("Expected a number, but received " + type);
    }
}
