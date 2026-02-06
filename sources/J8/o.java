package j8;

import java.util.Locale;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import sf.C6714a;

public enum o {
    VISIBLE,
    HIDDEN,
    SCROLL;
    

    /* renamed from: a  reason: collision with root package name */
    public static final a f44938a = null;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final o a(String str) {
            C6496s.h(str, "overflow");
            String lowerCase = str.toLowerCase(Locale.ROOT);
            C6496s.g(lowerCase, "toLowerCase(...)");
            int hashCode = lowerCase.hashCode();
            if (hashCode != -1217487446) {
                if (hashCode != -907680051) {
                    if (hashCode == 466743410 && lowerCase.equals("visible")) {
                        return o.VISIBLE;
                    }
                } else if (lowerCase.equals("scroll")) {
                    return o.SCROLL;
                }
            } else if (lowerCase.equals("hidden")) {
                return o.HIDDEN;
            }
            return null;
        }

        private a() {
        }
    }

    static {
        o[] a10;
        f44943f = C6714a.a(a10);
        f44938a = new a((DefaultConstructorMarker) null);
    }

    public static final o b(String str) {
        return f44938a.a(str);
    }
}
