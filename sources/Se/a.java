package se;

import ae.C4464a;
import com.facebook.react.bridge.Dynamic;
import expo.modules.kotlin.jni.ExpectedType;
import java.io.File;
import je.C5052a;
import kotlin.jvm.internal.C6496s;
import qe.C5175w;

public final class a extends C5175w {
    public a(boolean z10) {
        super(z10);
    }

    public ExpectedType b() {
        return new ExpectedType(C5052a.STRING);
    }

    public boolean c() {
        return false;
    }

    /* renamed from: g */
    public File e(Object obj, C4464a aVar) {
        C6496s.h(obj, "value");
        return new File((String) obj);
    }

    /* renamed from: h */
    public File f(Dynamic dynamic, C4464a aVar) {
        C6496s.h(dynamic, "value");
        return new File(dynamic.asString());
    }
}
