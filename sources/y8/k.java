package Y8;

import a9.C3142b;
import a9.C3144d;
import java.util.concurrent.Executor;

public final class k implements C3142b {

    private static final class a {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public static final k f35762a = new k();
    }

    public static k a() {
        return a.f35762a;
    }

    public static Executor b() {
        return (Executor) C3144d.c(j.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: c */
    public Executor get() {
        return b();
    }
}
