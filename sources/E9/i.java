package e9;

import a9.C3142b;
import a9.C3144d;
import android.content.Context;
import f9.f;
import f9.x;
import g9.C3546d;
import i9.C3597a;
import javax.inject.Provider;

public final class i implements C3142b {

    /* renamed from: a  reason: collision with root package name */
    private final Provider f43371a;

    /* renamed from: b  reason: collision with root package name */
    private final Provider f43372b;

    /* renamed from: c  reason: collision with root package name */
    private final Provider f43373c;

    /* renamed from: d  reason: collision with root package name */
    private final Provider f43374d;

    public i(Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.f43371a = provider;
        this.f43372b = provider2;
        this.f43373c = provider3;
        this.f43374d = provider4;
    }

    public static i a(Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        return new i(provider, provider2, provider3, provider4);
    }

    public static x c(Context context, C3546d dVar, f fVar, C3597a aVar) {
        return (x) C3144d.c(h.a(context, dVar, fVar, aVar), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public x get() {
        return c((Context) this.f43371a.get(), (C3546d) this.f43372b.get(), (f) this.f43373c.get(), (C3597a) this.f43374d.get());
    }
}
