package g9;

import a9.C3142b;
import android.content.Context;
import javax.inject.Provider;

public final class V implements C3142b {

    /* renamed from: a  reason: collision with root package name */
    private final Provider f43714a;

    /* renamed from: b  reason: collision with root package name */
    private final Provider f43715b;

    /* renamed from: c  reason: collision with root package name */
    private final Provider f43716c;

    public V(Provider provider, Provider provider2, Provider provider3) {
        this.f43714a = provider;
        this.f43715b = provider2;
        this.f43716c = provider3;
    }

    public static V a(Provider provider, Provider provider2, Provider provider3) {
        return new V(provider, provider2, provider3);
    }

    public static U c(Context context, String str, int i10) {
        return new U(context, str, i10);
    }

    /* renamed from: b */
    public U get() {
        return c((Context) this.f43714a.get(), (String) this.f43715b.get(), ((Integer) this.f43716c.get()).intValue());
    }
}
