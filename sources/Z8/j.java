package Z8;

import a9.C3142b;
import android.content.Context;
import i9.C3597a;
import javax.inject.Provider;

public final class j implements C3142b {

    /* renamed from: a  reason: collision with root package name */
    private final Provider f35971a;

    /* renamed from: b  reason: collision with root package name */
    private final Provider f35972b;

    /* renamed from: c  reason: collision with root package name */
    private final Provider f35973c;

    public j(Provider provider, Provider provider2, Provider provider3) {
        this.f35971a = provider;
        this.f35972b = provider2;
        this.f35973c = provider3;
    }

    public static j a(Provider provider, Provider provider2, Provider provider3) {
        return new j(provider, provider2, provider3);
    }

    public static i c(Context context, C3597a aVar, C3597a aVar2) {
        return new i(context, aVar, aVar2);
    }

    /* renamed from: b */
    public i get() {
        return c((Context) this.f35971a.get(), (C3597a) this.f35972b.get(), (C3597a) this.f35973c.get());
    }
}
