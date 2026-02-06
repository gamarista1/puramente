package g9;

import a9.C3142b;
import i9.C3597a;
import javax.inject.Provider;

public final class N implements C3142b {

    /* renamed from: a  reason: collision with root package name */
    private final Provider f43699a;

    /* renamed from: b  reason: collision with root package name */
    private final Provider f43700b;

    /* renamed from: c  reason: collision with root package name */
    private final Provider f43701c;

    /* renamed from: d  reason: collision with root package name */
    private final Provider f43702d;

    /* renamed from: e  reason: collision with root package name */
    private final Provider f43703e;

    public N(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        this.f43699a = provider;
        this.f43700b = provider2;
        this.f43701c = provider3;
        this.f43702d = provider4;
        this.f43703e = provider5;
    }

    public static N a(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        return new N(provider, provider2, provider3, provider4, provider5);
    }

    public static M c(C3597a aVar, C3597a aVar2, Object obj, Object obj2, Provider provider) {
        return new M(aVar, aVar2, (C3547e) obj, (U) obj2, provider);
    }

    /* renamed from: b */
    public M get() {
        return c((C3597a) this.f43699a.get(), (C3597a) this.f43700b.get(), this.f43701c.get(), this.f43702d.get(), this.f43703e);
    }
}
