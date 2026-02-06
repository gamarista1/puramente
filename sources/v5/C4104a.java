package v5;

import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: v5.a  reason: case insensitive filesystem */
public enum C4104a {
    MOBILE_APP_INSTALL,
    CUSTOM,
    OTHER;
    

    /* renamed from: a  reason: collision with root package name */
    public static final C0736a f48699a = null;

    /* renamed from: v5.a$a  reason: collision with other inner class name */
    public static final class C0736a {
        public /* synthetic */ C0736a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C4104a a(String str) {
            C6496s.h(str, "rawValue");
            if (C6496s.c(str, "MOBILE_APP_INSTALL")) {
                return C4104a.MOBILE_APP_INSTALL;
            }
            if (C6496s.c(str, "CUSTOM_APP_EVENTS")) {
                return C4104a.CUSTOM;
            }
            return C4104a.OTHER;
        }

        private C0736a() {
        }
    }

    static {
        f48699a = new C0736a((DefaultConstructorMarker) null);
    }
}
