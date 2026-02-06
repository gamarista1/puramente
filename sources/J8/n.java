package j8;

import java.util.Locale;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import sf.C6714a;

public enum n {
    SOLID,
    DASHED,
    DOTTED;
    

    /* renamed from: a  reason: collision with root package name */
    public static final a f44932a = null;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final n a(String str) {
            C6496s.h(str, "outlineStyle");
            String lowerCase = str.toLowerCase(Locale.ROOT);
            C6496s.g(lowerCase, "toLowerCase(...)");
            int hashCode = lowerCase.hashCode();
            if (hashCode != -1338941519) {
                if (hashCode != -1325970902) {
                    if (hashCode == 109618859 && lowerCase.equals("solid")) {
                        return n.SOLID;
                    }
                } else if (lowerCase.equals("dotted")) {
                    return n.DOTTED;
                }
            } else if (lowerCase.equals("dashed")) {
                return n.DASHED;
            }
            return null;
        }

        private a() {
        }
    }

    static {
        n[] a10;
        f44937f = C6714a.a(a10);
        f44932a = new a((DefaultConstructorMarker) null);
    }

    public static final n b(String str) {
        return f44932a.a(str);
    }
}
