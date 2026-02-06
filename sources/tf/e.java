package Tf;

import kotlin.jvm.internal.C6496s;

public abstract class e {
    public static final Class a(ClassLoader classLoader, String str) {
        C6496s.h(classLoader, "<this>");
        C6496s.h(str, "fqName");
        try {
            return Class.forName(str, false, classLoader);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
