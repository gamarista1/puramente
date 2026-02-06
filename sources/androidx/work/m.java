package androidx.work;

import kotlin.jvm.internal.C6496s;

public abstract class m {
    public abstract l a(String str);

    public final l b(String str) {
        C6496s.h(str, "className");
        l a10 = a(str);
        if (a10 == null) {
            return n.a(str);
        }
        return a10;
    }
}
