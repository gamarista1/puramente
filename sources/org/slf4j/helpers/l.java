package org.slf4j.helpers;

import java.io.PrintStream;

public abstract class l {

    /* renamed from: a  reason: collision with root package name */
    private static b f72474a = null;

    /* renamed from: b  reason: collision with root package name */
    private static boolean f72475b = false;

    private static final class b extends SecurityManager {
        private b() {
        }

        /* access modifiers changed from: protected */
        public Class[] getClassContext() {
            return super.getClassContext();
        }
    }

    public static Class a() {
        int i10;
        b b10 = b();
        if (b10 == null) {
            return null;
        }
        Class[] classContext = b10.getClassContext();
        String name = l.class.getName();
        int i11 = 0;
        while (i11 < classContext.length && !name.equals(classContext[i11].getName())) {
            i11++;
        }
        if (i11 < classContext.length && (i10 = i11 + 2) < classContext.length) {
            return classContext[i10];
        }
        throw new IllegalStateException("Failed to find org.slf4j.helpers.Util or its caller in the stack; this should not happen");
    }

    private static b b() {
        b bVar = f72474a;
        if (bVar != null) {
            return bVar;
        }
        if (f72475b) {
            return null;
        }
        b e10 = e();
        f72474a = e10;
        f72475b = true;
        return e10;
    }

    public static final void c(String str) {
        PrintStream printStream = System.err;
        printStream.println("SLF4J: " + str);
    }

    public static final void d(String str, Throwable th2) {
        PrintStream printStream = System.err;
        printStream.println(str);
        printStream.println("Reported exception:");
        th2.printStackTrace();
    }

    private static b e() {
        try {
            return new b();
        } catch (SecurityException unused) {
            return null;
        }
    }

    public static boolean f(String str) {
        String g10 = g(str);
        if (g10 == null) {
            return false;
        }
        return g10.equalsIgnoreCase(com.amazon.a.a.o.b.f37475af);
    }

    public static String g(String str) {
        if (str != null) {
            try {
                return System.getProperty(str);
            } catch (SecurityException unused) {
                return null;
            }
        } else {
            throw new IllegalArgumentException("null input");
        }
    }
}
