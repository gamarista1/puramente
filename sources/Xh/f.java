package xh;

import kotlin.jvm.internal.C6496s;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final f f73882a = new f();

    private f() {
    }

    public static final boolean b(String str) {
        C6496s.h(str, "method");
        if (C6496s.c(str, "GET") || C6496s.c(str, "HEAD")) {
            return false;
        }
        return true;
    }

    public static final boolean e(String str) {
        C6496s.h(str, "method");
        if (C6496s.c(str, "POST") || C6496s.c(str, "PUT") || C6496s.c(str, "PATCH") || C6496s.c(str, "PROPPATCH") || C6496s.c(str, "REPORT")) {
            return true;
        }
        return false;
    }

    public final boolean a(String str) {
        C6496s.h(str, "method");
        if (C6496s.c(str, "POST") || C6496s.c(str, "PATCH") || C6496s.c(str, "PUT") || C6496s.c(str, "DELETE") || C6496s.c(str, "MOVE")) {
            return true;
        }
        return false;
    }

    public final boolean c(String str) {
        C6496s.h(str, "method");
        return !C6496s.c(str, "PROPFIND");
    }

    public final boolean d(String str) {
        C6496s.h(str, "method");
        return C6496s.c(str, "PROPFIND");
    }
}
