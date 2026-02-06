package f9;

import a9.C3142b;
import g9.C3546d;
import h9.C3585b;
import java.util.concurrent.Executor;
import javax.inject.Provider;

public final class w implements C3142b {

    /* renamed from: a  reason: collision with root package name */
    private final Provider f43543a;

    /* renamed from: b  reason: collision with root package name */
    private final Provider f43544b;

    /* renamed from: c  reason: collision with root package name */
    private final Provider f43545c;

    /* renamed from: d  reason: collision with root package name */
    private final Provider f43546d;

    public w(Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.f43543a = provider;
        this.f43544b = provider2;
        this.f43545c = provider3;
        this.f43546d = provider4;
    }

    public static w a(Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        return new w(provider, provider2, provider3, provider4);
    }

    public static v c(Executor executor, C3546d dVar, x xVar, C3585b bVar) {
        return new v(executor, dVar, xVar, bVar);
    }

    /* renamed from: b */
    public v get() {
        return c((Executor) this.f43543a.get(), (C3546d) this.f43544b.get(), (x) this.f43545c.get(), (C3585b) this.f43546d.get());
    }
}
