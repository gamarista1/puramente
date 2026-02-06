package se;

import ae.C4464a;
import com.facebook.react.bridge.Dynamic;
import expo.modules.kotlin.jni.ExpectedType;
import java.nio.file.Path;
import java.nio.file.Paths;
import je.C5052a;
import kotlin.jvm.internal.C6496s;
import qe.C5175w;

public final class b extends C5175w {
    public b(boolean z10) {
        super(z10);
    }

    public ExpectedType b() {
        return new ExpectedType(C5052a.STRING);
    }

    public boolean c() {
        return false;
    }

    /* renamed from: g */
    public Path e(Object obj, C4464a aVar) {
        C6496s.h(obj, "value");
        Path a10 = Paths.get((String) obj, new String[0]);
        C6496s.g(a10, "get(...)");
        return a10;
    }

    /* renamed from: h */
    public Path f(Dynamic dynamic, C4464a aVar) {
        C6496s.h(dynamic, "value");
        Path a10 = Paths.get(dynamic.asString(), new String[0]);
        C6496s.g(a10, "get(...)");
        return a10;
    }
}
