package com.facebook.react.uimanager;

import Sg.p;
import java.util.Locale;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import sf.C6714a;

public enum H {
    NONE,
    BOX_NONE,
    BOX_ONLY,
    AUTO;
    

    /* renamed from: a  reason: collision with root package name */
    public static final a f41416a = null;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean a(H h10) {
            C6496s.h(h10, "pointerEvents");
            if (h10 == H.AUTO || h10 == H.BOX_ONLY) {
                return true;
            }
            return false;
        }

        public final boolean b(H h10) {
            C6496s.h(h10, "pointerEvents");
            if (h10 == H.AUTO || h10 == H.BOX_NONE) {
                return true;
            }
            return false;
        }

        public final H c(String str) {
            if (str == null) {
                return H.AUTO;
            }
            Locale locale = Locale.US;
            C6496s.g(locale, "US");
            String upperCase = str.toUpperCase(locale);
            C6496s.g(upperCase, "toUpperCase(...)");
            return H.valueOf(p.D(upperCase, "-", "_", false, 4, (Object) null));
        }

        private a() {
        }
    }

    static {
        H[] a10;
        f41422g = C6714a.a(a10);
        f41416a = new a((DefaultConstructorMarker) null);
    }

    public static final boolean b(H h10) {
        return f41416a.a(h10);
    }

    public static final boolean c(H h10) {
        return f41416a.b(h10);
    }

    public static final H e(String str) {
        return f41416a.c(str);
    }
}
