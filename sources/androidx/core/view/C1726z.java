package androidx.core.view;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import androidx.lifecycle.C1790m;
import androidx.lifecycle.C1795s;
import androidx.lifecycle.C1798v;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: androidx.core.view.z  reason: case insensitive filesystem */
public class C1726z {

    /* renamed from: a  reason: collision with root package name */
    private final Runnable f16157a;

    /* renamed from: b  reason: collision with root package name */
    private final CopyOnWriteArrayList f16158b = new CopyOnWriteArrayList();

    /* renamed from: c  reason: collision with root package name */
    private final Map f16159c = new HashMap();

    /* renamed from: androidx.core.view.z$a */
    private static class a {

        /* renamed from: a  reason: collision with root package name */
        final C1790m f16160a;

        /* renamed from: b  reason: collision with root package name */
        private C1795s f16161b;

        a(C1790m mVar, C1795s sVar) {
            this.f16160a = mVar;
            this.f16161b = sVar;
            mVar.a(sVar);
        }

        /* access modifiers changed from: package-private */
        public void a() {
            this.f16160a.d(this.f16161b);
            this.f16161b = null;
        }
    }

    public C1726z(Runnable runnable) {
        this.f16157a = runnable;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void f(B b10, C1798v vVar, C1790m.a aVar) {
        if (aVar == C1790m.a.ON_DESTROY) {
            l(b10);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void g(C1790m.b bVar, B b10, C1798v vVar, C1790m.a aVar) {
        if (aVar == C1790m.a.e(bVar)) {
            c(b10);
        } else if (aVar == C1790m.a.ON_DESTROY) {
            l(b10);
        } else if (aVar == C1790m.a.b(bVar)) {
            this.f16158b.remove(b10);
            this.f16157a.run();
        }
    }

    public void c(B b10) {
        this.f16158b.add(b10);
        this.f16157a.run();
    }

    public void d(B b10, C1798v vVar) {
        c(b10);
        C1790m lifecycle = vVar.getLifecycle();
        a aVar = (a) this.f16159c.remove(b10);
        if (aVar != null) {
            aVar.a();
        }
        this.f16159c.put(b10, new a(lifecycle, new C1724y(this, b10)));
    }

    public void e(B b10, C1798v vVar, C1790m.b bVar) {
        C1790m lifecycle = vVar.getLifecycle();
        a aVar = (a) this.f16159c.remove(b10);
        if (aVar != null) {
            aVar.a();
        }
        this.f16159c.put(b10, new a(lifecycle, new C1722x(this, bVar, b10)));
    }

    public void h(Menu menu, MenuInflater menuInflater) {
        Iterator it = this.f16158b.iterator();
        while (it.hasNext()) {
            ((B) it.next()).d(menu, menuInflater);
        }
    }

    public void i(Menu menu) {
        Iterator it = this.f16158b.iterator();
        while (it.hasNext()) {
            ((B) it.next()).a(menu);
        }
    }

    public boolean j(MenuItem menuItem) {
        Iterator it = this.f16158b.iterator();
        while (it.hasNext()) {
            if (((B) it.next()).c(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public void k(Menu menu) {
        Iterator it = this.f16158b.iterator();
        while (it.hasNext()) {
            ((B) it.next()).b(menu);
        }
    }

    public void l(B b10) {
        this.f16158b.remove(b10);
        a aVar = (a) this.f16159c.remove(b10);
        if (aVar != null) {
            aVar.a();
        }
        this.f16157a.run();
    }
}
