package Hc;

import kotlin.jvm.internal.C6496s;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    private final String f51029a;

    public l(String str) {
        this.f51029a = str;
    }

    public final String a() {
        return this.f51029a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof l) && C6496s.c(this.f51029a, ((l) obj).f51029a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        String str = this.f51029a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return "FirebaseSessionsData(sessionId=" + this.f51029a + ')';
    }
}
