package rc;

import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.config.a;
import com.google.firebase.perf.session.SessionManager;
import ic.C5027b;
import javax.inject.Provider;
import jc.C5046e;
import ub.C5230g;

public final class g implements Provider {

    /* renamed from: a  reason: collision with root package name */
    private final Provider f61577a;

    /* renamed from: b  reason: collision with root package name */
    private final Provider f61578b;

    /* renamed from: c  reason: collision with root package name */
    private final Provider f61579c;

    /* renamed from: d  reason: collision with root package name */
    private final Provider f61580d;

    /* renamed from: e  reason: collision with root package name */
    private final Provider f61581e;

    /* renamed from: f  reason: collision with root package name */
    private final Provider f61582f;

    /* renamed from: g  reason: collision with root package name */
    private final Provider f61583g;

    public g(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7) {
        this.f61577a = provider;
        this.f61578b = provider2;
        this.f61579c = provider3;
        this.f61580d = provider4;
        this.f61581e = provider5;
        this.f61582f = provider6;
        this.f61583g = provider7;
    }

    public static g a(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7) {
        return new g(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static e c(C5230g gVar, C5027b bVar, C5046e eVar, C5027b bVar2, RemoteConfigManager remoteConfigManager, a aVar, SessionManager sessionManager) {
        return new e(gVar, bVar, eVar, bVar2, remoteConfigManager, aVar, sessionManager);
    }

    /* renamed from: b */
    public e get() {
        return c((C5230g) this.f61577a.get(), (C5027b) this.f61578b.get(), (C5046e) this.f61579c.get(), (C5027b) this.f61580d.get(), (RemoteConfigManager) this.f61581e.get(), (a) this.f61582f.get(), (SessionManager) this.f61583g.get());
    }
}
