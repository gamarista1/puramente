package Xf;

import Ng.a;
import Sg.p;
import com.amazon.a.a.o.b;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import mf.C6565s;
import ng.f;

public abstract class N {
    public static final List a(f fVar) {
        C6496s.h(fVar, "name");
        String b10 = fVar.b();
        C6496s.g(b10, "asString(...)");
        if (H.c(b10)) {
            return C6565s.r(b(fVar));
        }
        if (H.d(b10)) {
            return f(fVar);
        }
        return C5677j.f66379a.b(fVar);
    }

    public static final f b(f fVar) {
        C6496s.h(fVar, "methodName");
        f e10 = e(fVar, b.au, false, (String) null, 12, (Object) null);
        if (e10 == null) {
            return e(fVar, "is", false, (String) null, 8, (Object) null);
        }
        return e10;
    }

    public static final f c(f fVar, boolean z10) {
        String str;
        C6496s.h(fVar, "methodName");
        if (z10) {
            str = "is";
        } else {
            str = null;
        }
        return e(fVar, "set", false, str, 4, (Object) null);
    }

    private static final f d(f fVar, String str, boolean z10, String str2) {
        if (fVar.j()) {
            return null;
        }
        String e10 = fVar.e();
        C6496s.g(e10, "getIdentifier(...)");
        if (!p.J(e10, str, false, 2, (Object) null) || e10.length() == str.length()) {
            return null;
        }
        char charAt = e10.charAt(str.length());
        if ('a' <= charAt && charAt < '{') {
            return null;
        }
        if (str2 != null) {
            return f.i(str2 + p.v0(e10, str));
        } else if (!z10) {
            return fVar;
        } else {
            String c10 = a.c(p.v0(e10, str), true);
            if (!f.l(c10)) {
                return null;
            }
            return f.i(c10);
        }
    }

    static /* synthetic */ f e(f fVar, String str, boolean z10, String str2, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        if ((i10 & 8) != 0) {
            str2 = null;
        }
        return d(fVar, str, z10, str2);
    }

    public static final List f(f fVar) {
        C6496s.h(fVar, "methodName");
        return C6565s.s(c(fVar, false), c(fVar, true));
    }
}
