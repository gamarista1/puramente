package qg;

import Sg.p;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import sf.C6714a;

public enum F {
    ;

    static final class a extends F {
        a(String str, int i10) {
            super(str, i10, (DefaultConstructorMarker) null);
        }

        public String b(String str) {
            C6496s.h(str, "string");
            return p.D(p.D(str, "<", "&lt;", false, 4, (Object) null), ">", "&gt;", false, 4, (Object) null);
        }
    }

    static final class b extends F {
        b(String str, int i10) {
            super(str, i10, (DefaultConstructorMarker) null);
        }

        public String b(String str) {
            C6496s.h(str, "string");
            return str;
        }
    }

    static {
        F[] a10;
        f72670d = C6714a.a(a10);
    }

    public abstract String b(String str);
}
