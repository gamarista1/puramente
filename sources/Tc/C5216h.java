package tc;

import Cd.b;
import ic.C5027b;
import javax.inject.Provider;

/* renamed from: tc.h  reason: case insensitive filesystem */
public final class C5216h implements Provider {

    /* renamed from: a  reason: collision with root package name */
    private final C5209a f61670a;

    public C5216h(C5209a aVar) {
        this.f61670a = aVar;
    }

    public static C5216h a(C5209a aVar) {
        return new C5216h(aVar);
    }

    public static C5027b c(C5209a aVar) {
        return (C5027b) b.c(aVar.g(), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public C5027b get() {
        return c(this.f61670a);
    }
}
