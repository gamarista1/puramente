package be;

import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.C6496s;

public final class d implements C4475a {

    /* renamed from: a  reason: collision with root package name */
    private final CopyOnWriteArrayList f53684a = new CopyOnWriteArrayList();

    /* renamed from: b  reason: collision with root package name */
    private WeakReference f53685b = new WeakReference((Object) null);

    /* access modifiers changed from: private */
    public static final void e(e eVar, androidx.appcompat.app.d dVar) {
        eVar.a(dVar);
    }

    /* access modifiers changed from: private */
    public static final void g(d dVar, androidx.appcompat.app.d dVar2) {
        Iterator it = dVar.f53684a.iterator();
        C6496s.g(it, "iterator(...)");
        while (it.hasNext()) {
            ((e) it.next()).a(dVar2);
        }
    }

    public void a(e eVar) {
        C6496s.h(eVar, "listener");
        this.f53684a.add(eVar);
        androidx.appcompat.app.d dVar = (androidx.appcompat.app.d) this.f53685b.get();
        if (dVar != null) {
            dVar.runOnUiThread(new b(eVar, dVar));
        }
    }

    public void b(e eVar) {
        C6496s.h(eVar, "listener");
        this.f53684a.remove(eVar);
    }

    public final void f(androidx.appcompat.app.d dVar) {
        C6496s.h(dVar, "activity");
        this.f53685b = new WeakReference(dVar);
        dVar.runOnUiThread(new c(this, dVar));
    }
}
