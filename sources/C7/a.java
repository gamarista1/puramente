package C7;

import kotlin.jvm.internal.C6496s;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f30082a = new a();

    private a() {
    }

    public static final boolean a() {
        return false;
    }

    public static final Class b(String str) {
        C6496s.h(str, "className");
        if (!a()) {
            return null;
        }
        return Class.forName(str);
    }
}
