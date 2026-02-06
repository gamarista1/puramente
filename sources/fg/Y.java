package Fg;

import Eg.i;
import Eg.n;
import Gg.g;
import kotlin.jvm.internal.C6496s;
import yf.C6787a;

public final class Y extends O0 {

    /* renamed from: b  reason: collision with root package name */
    private final n f62988b;

    /* renamed from: c  reason: collision with root package name */
    private final C6787a f62989c;

    /* renamed from: d  reason: collision with root package name */
    private final i f62990d;

    public Y(n nVar, C6787a aVar) {
        C6496s.h(nVar, "storageManager");
        C6496s.h(aVar, "computation");
        this.f62988b = nVar;
        this.f62989c = aVar;
        this.f62990d = nVar.g(aVar);
    }

    /* access modifiers changed from: private */
    public static final S V0(g gVar, Y y10) {
        return gVar.h((Jg.i) y10.f62989c.invoke());
    }

    /* access modifiers changed from: protected */
    public S R0() {
        return (S) this.f62990d.invoke();
    }

    public boolean S0() {
        return this.f62990d.k();
    }

    /* renamed from: U0 */
    public Y P0(g gVar) {
        C6496s.h(gVar, "kotlinTypeRefiner");
        return new Y(this.f62988b, new X(gVar, this));
    }
}
