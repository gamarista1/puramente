package yg;

import Eg.f;
import Eg.i;
import Eg.n;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import yf.C6787a;

/* renamed from: yg.i  reason: case insensitive filesystem */
public final class C6810i extends C6802a {

    /* renamed from: b  reason: collision with root package name */
    private final i f73944b;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C6810i(C6787a aVar) {
        this((n) null, aVar, 1, (DefaultConstructorMarker) null);
        C6496s.h(aVar, "getScope");
    }

    /* access modifiers changed from: private */
    public static final C6812k k(C6787a aVar) {
        C6812k kVar = (C6812k) aVar.invoke();
        if (kVar instanceof C6802a) {
            return ((C6802a) kVar).h();
        }
        return kVar;
    }

    /* access modifiers changed from: protected */
    public C6812k i() {
        return (C6812k) this.f73944b.invoke();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6810i(n nVar, C6787a aVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? f.f62842e : nVar, aVar);
    }

    public C6810i(n nVar, C6787a aVar) {
        C6496s.h(nVar, "storageManager");
        C6496s.h(aVar, "getScope");
        this.f73944b = nVar.g(new C6809h(aVar));
    }
}
