package j8;

import java.util.Locale;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import sf.C6714a;

public enum f {
    SOLID,
    DASHED,
    DOTTED;
    

    /* renamed from: a  reason: collision with root package name */
    public static final a f44875a = null;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final f a(String str) {
            C6496s.h(str, "borderStyle");
            String lowerCase = str.toLowerCase(Locale.ROOT);
            C6496s.g(lowerCase, "toLowerCase(...)");
            int hashCode = lowerCase.hashCode();
            if (hashCode != -1338941519) {
                if (hashCode != -1325970902) {
                    if (hashCode == 109618859 && lowerCase.equals("solid")) {
                        return f.SOLID;
                    }
                } else if (lowerCase.equals("dotted")) {
                    return f.DOTTED;
                }
            } else if (lowerCase.equals("dashed")) {
                return f.DASHED;
            }
            return null;
        }

        private a() {
        }
    }

    static {
        f[] a10;
        f44880f = C6714a.a(a10);
        f44875a = new a((DefaultConstructorMarker) null);
    }

    public static final f b(String str) {
        return f44875a.a(str);
    }
}
