package Pg;

import kotlin.jvm.internal.C6496s;

public abstract class d {
    public static final boolean a(Throwable th2) {
        C6496s.h(th2, "<this>");
        Class cls = th2.getClass();
        while (!C6496s.c(cls.getCanonicalName(), "com.intellij.openapi.progress.ProcessCanceledException")) {
            cls = cls.getSuperclass();
            if (cls == null) {
                return false;
            }
        }
        return true;
    }

    public static final RuntimeException b(Throwable th2) {
        C6496s.h(th2, "e");
        throw th2;
    }
}
