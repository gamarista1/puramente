package i8;

import java.util.Locale;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import sf.C6714a;

public enum d {
    LINEAR,
    EASE_IN,
    EASE_OUT,
    EASE_IN_EASE_OUT,
    SPRING;
    

    /* renamed from: a  reason: collision with root package name */
    public static final a f44312a = null;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final d a(String str) {
            C6496s.h(str, "name");
            String lowerCase = str.toLowerCase(Locale.ROOT);
            C6496s.g(lowerCase, "toLowerCase(...)");
            switch (lowerCase.hashCode()) {
                case -1965056864:
                    if (lowerCase.equals("easeout")) {
                        return d.EASE_OUT;
                    }
                    break;
                case -1310315117:
                    if (lowerCase.equals("easein")) {
                        return d.EASE_IN;
                    }
                    break;
                case -1102672091:
                    if (lowerCase.equals("linear")) {
                        return d.LINEAR;
                    }
                    break;
                case -895679987:
                    if (lowerCase.equals("spring")) {
                        return d.SPRING;
                    }
                    break;
                case 1164546989:
                    if (lowerCase.equals("easeineaseout")) {
                        return d.EASE_IN_EASE_OUT;
                    }
                    break;
            }
            throw new IllegalArgumentException("Unsupported interpolation type : " + str);
        }

        private a() {
        }
    }

    static {
        d[] a10;
        f44319h = C6714a.a(a10);
        f44312a = new a((DefaultConstructorMarker) null);
    }

    public static final d b(String str) {
        return f44312a.a(str);
    }
}
