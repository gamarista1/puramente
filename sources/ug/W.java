package Ug;

import Zg.C;
import Zg.C5723l;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import qf.C6658d;
import qf.g;
import rf.C6680b;
import yf.C6798l;

public final class W extends C {
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f65336e = AtomicIntegerFieldUpdater.newUpdater(W.class, "_decision$volatile");
    private volatile /* synthetic */ int _decision$volatile;

    public W(g gVar, C6658d dVar) {
        super(gVar, dVar);
    }

    private final boolean i1() {
        AtomicIntegerFieldUpdater h12 = f65336e;
        do {
            int i10 = h12.get(this);
            if (i10 != 0) {
                if (i10 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed");
            }
        } while (!f65336e.compareAndSet(this, 0, 2));
        return true;
    }

    private final boolean j1() {
        AtomicIntegerFieldUpdater h12 = f65336e;
        do {
            int i10 = h12.get(this);
            if (i10 != 0) {
                if (i10 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended");
            }
        } while (!f65336e.compareAndSet(this, 0, 1));
        return true;
    }

    /* access modifiers changed from: protected */
    public void A(Object obj) {
        c1(obj);
    }

    /* access modifiers changed from: protected */
    public void c1(Object obj) {
        if (!i1()) {
            C5723l.c(C6680b.c(this.f66946d), E.a(obj, this.f66946d), (C6798l) null, 2, (Object) null);
        }
    }

    public final Object g1() {
        if (j1()) {
            return C6680b.f();
        }
        Object h10 = F0.h(l0());
        if (!(h10 instanceof B)) {
            return h10;
        }
        throw ((B) h10).f65278a;
    }
}
