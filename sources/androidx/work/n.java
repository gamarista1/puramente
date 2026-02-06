package androidx.work;

import kotlin.jvm.internal.C6496s;

public abstract class n {

    /* renamed from: a  reason: collision with root package name */
    private static final String f19019a;

    static {
        String i10 = s.i("InputMerger");
        C6496s.g(i10, "tagWithPrefix(\"InputMerger\")");
        f19019a = i10;
    }

    public static final l a(String str) {
        C6496s.h(str, "className");
        try {
            Object newInstance = Class.forName(str).getDeclaredConstructor((Class[]) null).newInstance((Object[]) null);
            C6496s.f(newInstance, "null cannot be cast to non-null type androidx.work.InputMerger");
            return (l) newInstance;
        } catch (Exception e10) {
            s e11 = s.e();
            String str2 = f19019a;
            e11.d(str2, "Trouble instantiating " + str, e10);
            return null;
        }
    }
}
