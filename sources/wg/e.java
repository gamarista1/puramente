package Wg;

import Ug.C5556a;
import Ug.C5602x0;
import Ug.E0;
import ch.C5807f;
import java.util.concurrent.CancellationException;
import qf.C6658d;
import qf.g;
import rf.C6680b;
import yf.C6798l;

public abstract class e extends C5556a implements d {

    /* renamed from: d  reason: collision with root package name */
    private final d f66031d;

    public e(g gVar, d dVar, boolean z10, boolean z11) {
        super(gVar, z10, z11);
        this.f66031d = dVar;
    }

    public void N(Throwable th2) {
        CancellationException V02 = E0.V0(this, th2, (String) null, 1, (Object) null);
        this.f66031d.n(V02);
        J(V02);
    }

    public Object c(Object obj) {
        return this.f66031d.c(obj);
    }

    public Object d(C6658d dVar) {
        Object d10 = this.f66031d.d(dVar);
        C6680b.f();
        return d10;
    }

    public void e(C6798l lVar) {
        this.f66031d.e(lVar);
    }

    public C5807f g() {
        return this.f66031d.g();
    }

    public C5807f h() {
        return this.f66031d.h();
    }

    /* access modifiers changed from: protected */
    public final d h1() {
        return this.f66031d;
    }

    public Object i() {
        return this.f66031d.i();
    }

    public f iterator() {
        return this.f66031d.iterator();
    }

    public boolean j(Throwable th2) {
        return this.f66031d.j(th2);
    }

    public Object k(Object obj, C6658d dVar) {
        return this.f66031d.k(obj, dVar);
    }

    public Object l(C6658d dVar) {
        return this.f66031d.l(dVar);
    }

    public boolean m() {
        return this.f66031d.m();
    }

    public final void n(CancellationException cancellationException) {
        if (!isCancelled()) {
            if (cancellationException == null) {
                cancellationException = new C5602x0(R(), (Throwable) null, this);
            }
            N(cancellationException);
        }
    }

    public final d g1() {
        return this;
    }
}
