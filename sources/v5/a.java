package V5;

import Sg.p;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.C6496s;
import lf.C6502A;
import mf.O;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f34668a = new a();

    /* renamed from: b  reason: collision with root package name */
    public static final Map f34669b = O.l(C6502A.a("mkv", "video/x-matroska"), C6502A.a("glb", "model/gltf-binary"));

    private a() {
    }

    private final String a(String str) {
        int g02 = p.g0(str, '.', 0, false, 6, (Object) null);
        if (g02 < 0 || g02 == str.length() - 1) {
            return null;
        }
        String substring = str.substring(g02 + 1);
        C6496s.g(substring, "substring(...)");
        return substring;
    }

    public static final String b(String str) {
        C6496s.h(str, "path");
        String a10 = f34668a.a(str);
        if (a10 == null) {
            return null;
        }
        Locale locale = Locale.US;
        C6496s.g(locale, "US");
        String lowerCase = a10.toLowerCase(locale);
        C6496s.g(lowerCase, "toLowerCase(...)");
        if (lowerCase == null) {
            return null;
        }
        String a11 = b.a(lowerCase);
        if (a11 == null) {
            return (String) f34669b.get(lowerCase);
        }
        return a11;
    }

    public static final boolean c(String str) {
        if (str != null) {
            return p.J(str, "video/", false, 2, (Object) null);
        }
        return false;
    }
}
