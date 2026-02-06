package tc;

import Cd.b;
import ic.C5027b;
import javax.inject.Provider;

/* renamed from: tc.e  reason: case insensitive filesystem */
public final class C5213e implements Provider {

    /* renamed from: a  reason: collision with root package name */
    private final C5209a f61667a;

    public C5213e(C5209a aVar) {
        this.f61667a = aVar;
    }

    public static C5213e a(C5209a aVar) {
        return new C5213e(aVar);
    }

    public static C5027b c(C5209a aVar) {
        return (C5027b) b.c(aVar.d(), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public C5027b get() {
        return c(this.f61667a);
    }
}
