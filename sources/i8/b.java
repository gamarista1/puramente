package i8;

import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import sf.C6714a;

public enum b {
    OPACITY,
    SCALE_X,
    SCALE_Y,
    SCALE_XY;
    

    /* renamed from: a  reason: collision with root package name */
    public static final a f44304a = null;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b a(String str) {
            C6496s.h(str, "name");
            switch (str.hashCode()) {
                case -1267206133:
                    if (str.equals("opacity")) {
                        return b.OPACITY;
                    }
                    break;
                case -908189618:
                    if (str.equals("scaleX")) {
                        return b.SCALE_X;
                    }
                    break;
                case -908189617:
                    if (str.equals("scaleY")) {
                        return b.SCALE_Y;
                    }
                    break;
                case 1910893003:
                    if (str.equals("scaleXY")) {
                        return b.SCALE_XY;
                    }
                    break;
            }
            throw new IllegalArgumentException("Unsupported animated property: " + str);
        }

        private a() {
        }
    }

    static {
        b[] a10;
        f44310g = C6714a.a(a10);
        f44304a = new a((DefaultConstructorMarker) null);
    }

    public static final b b(String str) {
        return f44304a.a(str);
    }
}
