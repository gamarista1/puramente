package androidx.activity;

import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.C6496s;
import yf.C6787a;

public abstract class G {

    /* renamed from: a  reason: collision with root package name */
    private boolean f10745a;

    /* renamed from: b  reason: collision with root package name */
    private final CopyOnWriteArrayList f10746b = new CopyOnWriteArrayList();

    /* renamed from: c  reason: collision with root package name */
    private C6787a f10747c;

    public G(boolean z10) {
        this.f10745a = z10;
    }

    public final void a(C1547c cVar) {
        C6496s.h(cVar, "cancellable");
        this.f10746b.add(cVar);
    }

    public final C6787a b() {
        return this.f10747c;
    }

    public void c() {
    }

    public abstract void d();

    public void e(C1546b bVar) {
        C6496s.h(bVar, "backEvent");
    }

    public void f(C1546b bVar) {
        C6496s.h(bVar, "backEvent");
    }

    public final boolean g() {
        return this.f10745a;
    }

    public final void h() {
        for (C1547c cancel : this.f10746b) {
            cancel.cancel();
        }
    }

    public final void i(C1547c cVar) {
        C6496s.h(cVar, "cancellable");
        this.f10746b.remove(cVar);
    }

    public final void j(boolean z10) {
        this.f10745a = z10;
        C6787a aVar = this.f10747c;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    public final void k(C6787a aVar) {
        this.f10747c = aVar;
    }
}
