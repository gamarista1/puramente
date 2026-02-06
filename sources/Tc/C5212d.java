package tc;

import Cd.b;
import javax.inject.Provider;
import jc.C5046e;

/* renamed from: tc.d  reason: case insensitive filesystem */
public final class C5212d implements Provider {

    /* renamed from: a  reason: collision with root package name */
    private final C5209a f61666a;

    public C5212d(C5209a aVar) {
        this.f61666a = aVar;
    }

    public static C5212d a(C5209a aVar) {
        return new C5212d(aVar);
    }

    public static C5046e c(C5209a aVar) {
        return (C5046e) b.c(aVar.c(), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public C5046e get() {
        return c(this.f61666a);
    }
}
