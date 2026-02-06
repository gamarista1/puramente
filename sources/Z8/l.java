package Z8;

import a9.C3142b;
import android.content.Context;
import javax.inject.Provider;

public final class l implements C3142b {

    /* renamed from: a  reason: collision with root package name */
    private final Provider f35979a;

    /* renamed from: b  reason: collision with root package name */
    private final Provider f35980b;

    public l(Provider provider, Provider provider2) {
        this.f35979a = provider;
        this.f35980b = provider2;
    }

    public static l a(Provider provider, Provider provider2) {
        return new l(provider, provider2);
    }

    public static k c(Context context, Object obj) {
        return new k(context, (i) obj);
    }

    /* renamed from: b */
    public k get() {
        return c((Context) this.f35979a.get(), this.f35980b.get());
    }
}
