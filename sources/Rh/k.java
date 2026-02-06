package rh;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C6496s;
import vh.C6760e;
import wh.C6777g;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    private final C6777g f73404a;

    public k(C6777g gVar) {
        C6496s.h(gVar, "delegate");
        this.f73404a = gVar;
    }

    public final C6777g a() {
        return this.f73404a;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public k(int i10, long j10, TimeUnit timeUnit) {
        this(new C6777g(C6760e.f73695i, i10, j10, timeUnit));
        C6496s.h(timeUnit, "timeUnit");
    }

    public k() {
        this(5, 5, TimeUnit.MINUTES);
    }
}
