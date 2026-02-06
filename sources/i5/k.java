package i5;

import androidx.lifecycle.C1790m;
import androidx.lifecycle.C1797u;
import androidx.lifecycle.C1798v;
import androidx.lifecycle.F;
import java.util.HashSet;
import java.util.Set;
import o5.l;

final class k implements j, C1797u {

    /* renamed from: a  reason: collision with root package name */
    private final Set f44208a = new HashSet();

    /* renamed from: b  reason: collision with root package name */
    private final C1790m f44209b;

    k(C1790m mVar) {
        this.f44209b = mVar;
        mVar.a(this);
    }

    public void a(l lVar) {
        this.f44208a.remove(lVar);
    }

    public void b(l lVar) {
        this.f44208a.add(lVar);
        if (this.f44209b.b() == C1790m.b.DESTROYED) {
            lVar.onDestroy();
        } else if (this.f44209b.b().b(C1790m.b.STARTED)) {
            lVar.onStart();
        } else {
            lVar.onStop();
        }
    }

    @F(C1790m.a.ON_DESTROY)
    public void onDestroy(C1798v vVar) {
        for (l onDestroy : l.k(this.f44208a)) {
            onDestroy.onDestroy();
        }
        vVar.getLifecycle().d(this);
    }

    @F(C1790m.a.ON_START)
    public void onStart(C1798v vVar) {
        for (l onStart : l.k(this.f44208a)) {
            onStart.onStart();
        }
    }

    @F(C1790m.a.ON_STOP)
    public void onStop(C1798v vVar) {
        for (l onStop : l.k(this.f44208a)) {
            onStop.onStop();
        }
    }
}
