package tc;

import Cd.b;
import com.google.firebase.perf.session.SessionManager;
import javax.inject.Provider;

/* renamed from: tc.g  reason: case insensitive filesystem */
public final class C5215g implements Provider {

    /* renamed from: a  reason: collision with root package name */
    private final C5209a f61669a;

    public C5215g(C5209a aVar) {
        this.f61669a = aVar;
    }

    public static C5215g a(C5209a aVar) {
        return new C5215g(aVar);
    }

    public static SessionManager c(C5209a aVar) {
        return (SessionManager) b.c(aVar.f(), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public SessionManager get() {
        return c(this.f61669a);
    }
}
