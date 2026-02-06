package tc;

import Cd.b;
import com.google.firebase.perf.config.RemoteConfigManager;
import javax.inject.Provider;

/* renamed from: tc.f  reason: case insensitive filesystem */
public final class C5214f implements Provider {

    /* renamed from: a  reason: collision with root package name */
    private final C5209a f61668a;

    public C5214f(C5209a aVar) {
        this.f61668a = aVar;
    }

    public static C5214f a(C5209a aVar) {
        return new C5214f(aVar);
    }

    public static RemoteConfigManager c(C5209a aVar) {
        return (RemoteConfigManager) b.c(aVar.e(), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public RemoteConfigManager get() {
        return c(this.f61668a);
    }
}
