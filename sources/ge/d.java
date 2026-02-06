package ge;

import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import yf.p;

public final class d extends c {

    /* renamed from: b  reason: collision with root package name */
    private final p f60634b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(e eVar, p pVar) {
        super(eVar, (DefaultConstructorMarker) null);
        C6496s.h(eVar, "eventName");
        C6496s.h(pVar, "body");
        this.f60634b = pVar;
    }

    public final void a(Object obj, Object obj2) {
        this.f60634b.invoke(obj, obj2);
    }
}
