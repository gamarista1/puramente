package Y8;

import a9.C3142b;
import e9.e;
import f9.r;
import i9.C3597a;
import javax.inject.Provider;

public final class v implements C3142b {

    /* renamed from: a  reason: collision with root package name */
    private final Provider f35779a;

    /* renamed from: b  reason: collision with root package name */
    private final Provider f35780b;

    /* renamed from: c  reason: collision with root package name */
    private final Provider f35781c;

    /* renamed from: d  reason: collision with root package name */
    private final Provider f35782d;

    /* renamed from: e  reason: collision with root package name */
    private final Provider f35783e;

    public v(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        this.f35779a = provider;
        this.f35780b = provider2;
        this.f35781c = provider3;
        this.f35782d = provider4;
        this.f35783e = provider5;
    }

    public static v a(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        return new v(provider, provider2, provider3, provider4, provider5);
    }

    public static t c(C3597a aVar, C3597a aVar2, e eVar, r rVar, f9.v vVar) {
        return new t(aVar, aVar2, eVar, rVar, vVar);
    }

    /* renamed from: b */
    public t get() {
        return c((C3597a) this.f35779a.get(), (C3597a) this.f35780b.get(), (e) this.f35781c.get(), (r) this.f35782d.get(), (f9.v) this.f35783e.get());
    }
}
