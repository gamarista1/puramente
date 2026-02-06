package lh;

import Sg.p;
import hh.C5998a;
import ih.f;
import kh.F;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.O;
import kotlin.jvm.internal.U;
import lf.C6527k;
import mh.B;
import mh.Z;
import mh.a0;

public abstract class j {

    /* renamed from: a  reason: collision with root package name */
    private static final f f71992a = F.a("kotlinx.serialization.json.JsonUnquotedLiteral", C5998a.E(U.f71764a));

    public static final x a(Boolean bool) {
        if (bool == null) {
            return t.INSTANCE;
        }
        return new p(bool, false, (f) null, 4, (DefaultConstructorMarker) null);
    }

    public static final x b(Number number) {
        if (number == null) {
            return t.INSTANCE;
        }
        return new p(number, false, (f) null, 4, (DefaultConstructorMarker) null);
    }

    public static final x c(String str) {
        if (str == null) {
            return t.INSTANCE;
        }
        return new p(str, true, (f) null, 4, (DefaultConstructorMarker) null);
    }

    private static final Void d(i iVar, String str) {
        throw new IllegalArgumentException("Element " + O.b(iVar.getClass()) + " is not a " + str);
    }

    public static final Boolean e(x xVar) {
        C6496s.h(xVar, "<this>");
        return a0.d(xVar.a());
    }

    public static final String f(x xVar) {
        C6496s.h(xVar, "<this>");
        if (xVar instanceof t) {
            return null;
        }
        return xVar.a();
    }

    public static final double g(x xVar) {
        C6496s.h(xVar, "<this>");
        return Double.parseDouble(xVar.a());
    }

    public static final Double h(x xVar) {
        C6496s.h(xVar, "<this>");
        return p.j(xVar.a());
    }

    public static final float i(x xVar) {
        C6496s.h(xVar, "<this>");
        return Float.parseFloat(xVar.a());
    }

    public static final Float j(x xVar) {
        C6496s.h(xVar, "<this>");
        return p.k(xVar.a());
    }

    public static final int k(x xVar) {
        C6496s.h(xVar, "<this>");
        try {
            long m10 = new Z(xVar.a()).m();
            if (-2147483648L <= m10 && m10 <= 2147483647L) {
                return (int) m10;
            }
            throw new NumberFormatException(xVar.a() + " is not an Int");
        } catch (B e10) {
            throw new NumberFormatException(e10.getMessage());
        }
    }

    public static final Integer l(x xVar) {
        Long l10;
        C6496s.h(xVar, "<this>");
        try {
            l10 = Long.valueOf(new Z(xVar.a()).m());
        } catch (B unused) {
            l10 = null;
        }
        if (l10 != null) {
            long longValue = l10.longValue();
            if (-2147483648L <= longValue && longValue <= 2147483647L) {
                return Integer.valueOf((int) longValue);
            }
        }
        return null;
    }

    public static final C6539c m(i iVar) {
        C6539c cVar;
        C6496s.h(iVar, "<this>");
        if (iVar instanceof C6539c) {
            cVar = (C6539c) iVar;
        } else {
            cVar = null;
        }
        if (cVar != null) {
            return cVar;
        }
        d(iVar, "JsonArray");
        throw new C6527k();
    }

    public static final v n(i iVar) {
        v vVar;
        C6496s.h(iVar, "<this>");
        if (iVar instanceof v) {
            vVar = (v) iVar;
        } else {
            vVar = null;
        }
        if (vVar != null) {
            return vVar;
        }
        d(iVar, "JsonObject");
        throw new C6527k();
    }

    public static final x o(i iVar) {
        x xVar;
        C6496s.h(iVar, "<this>");
        if (iVar instanceof x) {
            xVar = (x) iVar;
        } else {
            xVar = null;
        }
        if (xVar != null) {
            return xVar;
        }
        d(iVar, "JsonPrimitive");
        throw new C6527k();
    }

    public static final f p() {
        return f71992a;
    }

    public static final long q(x xVar) {
        C6496s.h(xVar, "<this>");
        try {
            return new Z(xVar.a()).m();
        } catch (B e10) {
            throw new NumberFormatException(e10.getMessage());
        }
    }

    public static final Long r(x xVar) {
        C6496s.h(xVar, "<this>");
        try {
            return Long.valueOf(new Z(xVar.a()).m());
        } catch (B unused) {
            return null;
        }
    }
}
