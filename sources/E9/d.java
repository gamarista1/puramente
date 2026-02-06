package e9;

import Z8.e;
import a9.C3142b;
import f9.x;
import g9.C3546d;
import h9.C3585b;
import java.util.concurrent.Executor;
import javax.inject.Provider;

public final class d implements C3142b {

    /* renamed from: a  reason: collision with root package name */
    private final Provider f43365a;

    /* renamed from: b  reason: collision with root package name */
    private final Provider f43366b;

    /* renamed from: c  reason: collision with root package name */
    private final Provider f43367c;

    /* renamed from: d  reason: collision with root package name */
    private final Provider f43368d;

    /* renamed from: e  reason: collision with root package name */
    private final Provider f43369e;

    public d(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        this.f43365a = provider;
        this.f43366b = provider2;
        this.f43367c = provider3;
        this.f43368d = provider4;
        this.f43369e = provider5;
    }

    public static d a(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        return new d(provider, provider2, provider3, provider4, provider5);
    }

    public static c c(Executor executor, e eVar, x xVar, C3546d dVar, C3585b bVar) {
        return new c(executor, eVar, xVar, dVar, bVar);
    }

    /* renamed from: b */
    public c get() {
        return c((Executor) this.f43365a.get(), (e) this.f43366b.get(), (x) this.f43367c.get(), (C3546d) this.f43368d.get(), (C3585b) this.f43369e.get());
    }
}
