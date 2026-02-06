package Ic;

import kotlin.jvm.internal.C6496s;

public interface b {

    public enum a {
        CRASHLYTICS,
        PERFORMANCE,
        MATT_SAYS_HI
    }

    /* renamed from: Ic.b$b  reason: collision with other inner class name */
    public static final class C0786b {

        /* renamed from: a  reason: collision with root package name */
        private final String f51180a;

        public C0786b(String str) {
            C6496s.h(str, "sessionId");
            this.f51180a = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof C0786b) && C6496s.c(this.f51180a, ((C0786b) obj).f51180a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f51180a.hashCode();
        }

        public String toString() {
            return "SessionDetails(sessionId=" + this.f51180a + ')';
        }
    }

    boolean a();
}
