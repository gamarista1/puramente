package Of;

import kotlin.jvm.internal.DefaultConstructorMarker;
import sf.C6714a;

public enum E {
    FINAL,
    SEALED,
    OPEN,
    ABSTRACT;
    

    /* renamed from: a  reason: collision with root package name */
    public static final a f64444a = null;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final E a(boolean z10, boolean z11, boolean z12) {
            if (z10) {
                return E.SEALED;
            }
            if (z11) {
                return E.ABSTRACT;
            }
            if (z12) {
                return E.OPEN;
            }
            return E.FINAL;
        }

        private a() {
        }
    }

    static {
        E[] a10;
        f64450g = C6714a.a(a10);
        f64444a = new a((DefaultConstructorMarker) null);
    }
}
