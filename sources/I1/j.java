package I1;

import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

final class j extends n {

    /* renamed from: a  reason: collision with root package name */
    private final Throwable f2702a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j(Throwable th2) {
        super((DefaultConstructorMarker) null);
        C6496s.h(th2, "readException");
        this.f2702a = th2;
    }

    public final Throwable a() {
        return this.f2702a;
    }
}
