package tc;

import Cd.b;
import com.google.firebase.perf.config.a;
import javax.inject.Provider;

/* renamed from: tc.b  reason: case insensitive filesystem */
public final class C5210b implements Provider {

    /* renamed from: a  reason: collision with root package name */
    private final C5209a f61664a;

    public C5210b(C5209a aVar) {
        this.f61664a = aVar;
    }

    public static C5210b a(C5209a aVar) {
        return new C5210b(aVar);
    }

    public static a c(C5209a aVar) {
        return (a) b.c(aVar.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public a get() {
        return c(this.f61664a);
    }
}
