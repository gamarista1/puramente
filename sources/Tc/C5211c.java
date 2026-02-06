package tc;

import Cd.b;
import javax.inject.Provider;
import ub.C5230g;

/* renamed from: tc.c  reason: case insensitive filesystem */
public final class C5211c implements Provider {

    /* renamed from: a  reason: collision with root package name */
    private final C5209a f61665a;

    public C5211c(C5209a aVar) {
        this.f61665a = aVar;
    }

    public static C5211c a(C5209a aVar) {
        return new C5211c(aVar);
    }

    public static C5230g c(C5209a aVar) {
        return (C5230g) b.c(aVar.b(), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public C5230g get() {
        return c(this.f61665a);
    }
}
