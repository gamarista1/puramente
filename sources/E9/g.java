package e9;

import a9.C3142b;
import a9.C3144d;
import f9.f;
import i9.C3597a;
import javax.inject.Provider;

public final class g implements C3142b {

    /* renamed from: a  reason: collision with root package name */
    private final Provider f43370a;

    public g(Provider provider) {
        this.f43370a = provider;
    }

    public static f a(C3597a aVar) {
        return (f) C3144d.c(f.a(aVar), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static g b(Provider provider) {
        return new g(provider);
    }

    /* renamed from: c */
    public f get() {
        return a((C3597a) this.f43370a.get());
    }
}
