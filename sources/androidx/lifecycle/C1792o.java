package androidx.lifecycle;

import Ug.C5600w0;
import androidx.lifecycle.C1790m;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.C6496s;

/* renamed from: androidx.lifecycle.o  reason: case insensitive filesystem */
public final class C1792o {

    /* renamed from: a  reason: collision with root package name */
    private final C1790m f17249a;

    /* renamed from: b  reason: collision with root package name */
    private final C1790m.b f17250b;

    /* renamed from: c  reason: collision with root package name */
    private final C1784g f17251c;

    /* renamed from: d  reason: collision with root package name */
    private final C1795s f17252d;

    public C1792o(C1790m mVar, C1790m.b bVar, C1784g gVar, C5600w0 w0Var) {
        C6496s.h(mVar, "lifecycle");
        C6496s.h(bVar, "minState");
        C6496s.h(gVar, "dispatchQueue");
        C6496s.h(w0Var, "parentJob");
        this.f17249a = mVar;
        this.f17250b = bVar;
        this.f17251c = gVar;
        C1791n nVar = new C1791n(this, w0Var);
        this.f17252d = nVar;
        if (mVar.b() == C1790m.b.DESTROYED) {
            C5600w0.a.a(w0Var, (CancellationException) null, 1, (Object) null);
            b();
            return;
        }
        mVar.a(nVar);
    }

    /* access modifiers changed from: private */
    public static final void c(C1792o oVar, C5600w0 w0Var, C1798v vVar, C1790m.a aVar) {
        C6496s.h(oVar, "this$0");
        C6496s.h(w0Var, "$parentJob");
        C6496s.h(vVar, "source");
        C6496s.h(aVar, "<anonymous parameter 1>");
        if (vVar.getLifecycle().b() == C1790m.b.DESTROYED) {
            C5600w0.a.a(w0Var, (CancellationException) null, 1, (Object) null);
            oVar.b();
        } else if (vVar.getLifecycle().b().compareTo(oVar.f17250b) < 0) {
            oVar.f17251c.h();
        } else {
            oVar.f17251c.i();
        }
    }

    public final void b() {
        this.f17249a.d(this.f17252d);
        this.f17251c.g();
    }
}
