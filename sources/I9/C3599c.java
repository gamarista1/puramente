package i9;

import a9.C3142b;
import a9.C3144d;

/* renamed from: i9.c  reason: case insensitive filesystem */
public final class C3599c implements C3142b {

    /* renamed from: i9.c$a */
    private static final class a {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public static final C3599c f44350a = new C3599c();
    }

    public static C3599c a() {
        return a.f44350a;
    }

    public static C3597a b() {
        return (C3597a) C3144d.c(C3598b.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: c */
    public C3597a get() {
        return b();
    }
}
