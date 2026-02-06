package te;

import ae.C4464a;
import android.net.Uri;
import com.facebook.react.bridge.Dynamic;
import expo.modules.kotlin.jni.ExpectedType;
import je.C5052a;
import kotlin.jvm.internal.C6496s;
import qe.C5175w;

public final class c extends C5175w {
    public c(boolean z10) {
        super(z10);
    }

    public ExpectedType b() {
        return new ExpectedType(C5052a.STRING);
    }

    public boolean c() {
        return false;
    }

    /* renamed from: g */
    public Uri e(Object obj, C4464a aVar) {
        C6496s.h(obj, "value");
        Uri parse = Uri.parse((String) obj);
        C6496s.g(parse, "parse(...)");
        return parse;
    }

    /* renamed from: h */
    public Uri f(Dynamic dynamic, C4464a aVar) {
        C6496s.h(dynamic, "value");
        Uri parse = Uri.parse(dynamic.asString());
        C6496s.g(parse, "parse(...)");
        return parse;
    }
}
