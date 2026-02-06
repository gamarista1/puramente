package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.J;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;

public final class C {

    /* renamed from: a  reason: collision with root package name */
    private final J f16690a;

    /* renamed from: b  reason: collision with root package name */
    private final CopyOnWriteArrayList f16691b = new CopyOnWriteArrayList();

    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final J.k f16692a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f16693b;

        public a(J.k kVar, boolean z10) {
            C6496s.h(kVar, "callback");
            this.f16692a = kVar;
            this.f16693b = z10;
        }

        public final J.k a() {
            return this.f16692a;
        }

        public final boolean b() {
            return this.f16693b;
        }
    }

    public C(J j10) {
        C6496s.h(j10, "fragmentManager");
        this.f16690a = j10;
    }

    public final void a(C1769q qVar, Bundle bundle, boolean z10) {
        C6496s.h(qVar, "f");
        C1769q B02 = this.f16690a.B0();
        if (B02 != null) {
            J parentFragmentManager = B02.getParentFragmentManager();
            C6496s.g(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.A0().a(qVar, bundle, true);
        }
        Iterator it = this.f16691b.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (!z10 || aVar.b()) {
                aVar.a().onFragmentActivityCreated(this.f16690a, qVar, bundle);
            }
        }
    }

    public final void b(C1769q qVar, boolean z10) {
        C6496s.h(qVar, "f");
        Context f10 = this.f16690a.y0().f();
        C1769q B02 = this.f16690a.B0();
        if (B02 != null) {
            J parentFragmentManager = B02.getParentFragmentManager();
            C6496s.g(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.A0().b(qVar, true);
        }
        Iterator it = this.f16691b.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (!z10 || aVar.b()) {
                aVar.a().onFragmentAttached(this.f16690a, qVar, f10);
            }
        }
    }

    public final void c(C1769q qVar, Bundle bundle, boolean z10) {
        C6496s.h(qVar, "f");
        C1769q B02 = this.f16690a.B0();
        if (B02 != null) {
            J parentFragmentManager = B02.getParentFragmentManager();
            C6496s.g(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.A0().c(qVar, bundle, true);
        }
        Iterator it = this.f16691b.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (!z10 || aVar.b()) {
                aVar.a().onFragmentCreated(this.f16690a, qVar, bundle);
            }
        }
    }

    public final void d(C1769q qVar, boolean z10) {
        C6496s.h(qVar, "f");
        C1769q B02 = this.f16690a.B0();
        if (B02 != null) {
            J parentFragmentManager = B02.getParentFragmentManager();
            C6496s.g(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.A0().d(qVar, true);
        }
        Iterator it = this.f16691b.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (!z10 || aVar.b()) {
                aVar.a().onFragmentDestroyed(this.f16690a, qVar);
            }
        }
    }

    public final void e(C1769q qVar, boolean z10) {
        C6496s.h(qVar, "f");
        C1769q B02 = this.f16690a.B0();
        if (B02 != null) {
            J parentFragmentManager = B02.getParentFragmentManager();
            C6496s.g(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.A0().e(qVar, true);
        }
        Iterator it = this.f16691b.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (!z10 || aVar.b()) {
                aVar.a().onFragmentDetached(this.f16690a, qVar);
            }
        }
    }

    public final void f(C1769q qVar, boolean z10) {
        C6496s.h(qVar, "f");
        C1769q B02 = this.f16690a.B0();
        if (B02 != null) {
            J parentFragmentManager = B02.getParentFragmentManager();
            C6496s.g(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.A0().f(qVar, true);
        }
        Iterator it = this.f16691b.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (!z10 || aVar.b()) {
                aVar.a().onFragmentPaused(this.f16690a, qVar);
            }
        }
    }

    public final void g(C1769q qVar, boolean z10) {
        C6496s.h(qVar, "f");
        Context f10 = this.f16690a.y0().f();
        C1769q B02 = this.f16690a.B0();
        if (B02 != null) {
            J parentFragmentManager = B02.getParentFragmentManager();
            C6496s.g(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.A0().g(qVar, true);
        }
        Iterator it = this.f16691b.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (!z10 || aVar.b()) {
                aVar.a().onFragmentPreAttached(this.f16690a, qVar, f10);
            }
        }
    }

    public final void h(C1769q qVar, Bundle bundle, boolean z10) {
        C6496s.h(qVar, "f");
        C1769q B02 = this.f16690a.B0();
        if (B02 != null) {
            J parentFragmentManager = B02.getParentFragmentManager();
            C6496s.g(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.A0().h(qVar, bundle, true);
        }
        Iterator it = this.f16691b.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (!z10 || aVar.b()) {
                aVar.a().onFragmentPreCreated(this.f16690a, qVar, bundle);
            }
        }
    }

    public final void i(C1769q qVar, boolean z10) {
        C6496s.h(qVar, "f");
        C1769q B02 = this.f16690a.B0();
        if (B02 != null) {
            J parentFragmentManager = B02.getParentFragmentManager();
            C6496s.g(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.A0().i(qVar, true);
        }
        Iterator it = this.f16691b.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (!z10 || aVar.b()) {
                aVar.a().onFragmentResumed(this.f16690a, qVar);
            }
        }
    }

    public final void j(C1769q qVar, Bundle bundle, boolean z10) {
        C6496s.h(qVar, "f");
        C6496s.h(bundle, "outState");
        C1769q B02 = this.f16690a.B0();
        if (B02 != null) {
            J parentFragmentManager = B02.getParentFragmentManager();
            C6496s.g(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.A0().j(qVar, bundle, true);
        }
        Iterator it = this.f16691b.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (!z10 || aVar.b()) {
                aVar.a().onFragmentSaveInstanceState(this.f16690a, qVar, bundle);
            }
        }
    }

    public final void k(C1769q qVar, boolean z10) {
        C6496s.h(qVar, "f");
        C1769q B02 = this.f16690a.B0();
        if (B02 != null) {
            J parentFragmentManager = B02.getParentFragmentManager();
            C6496s.g(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.A0().k(qVar, true);
        }
        Iterator it = this.f16691b.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (!z10 || aVar.b()) {
                aVar.a().onFragmentStarted(this.f16690a, qVar);
            }
        }
    }

    public final void l(C1769q qVar, boolean z10) {
        C6496s.h(qVar, "f");
        C1769q B02 = this.f16690a.B0();
        if (B02 != null) {
            J parentFragmentManager = B02.getParentFragmentManager();
            C6496s.g(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.A0().l(qVar, true);
        }
        Iterator it = this.f16691b.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (!z10 || aVar.b()) {
                aVar.a().onFragmentStopped(this.f16690a, qVar);
            }
        }
    }

    public final void m(C1769q qVar, View view, Bundle bundle, boolean z10) {
        C6496s.h(qVar, "f");
        C6496s.h(view, "v");
        C1769q B02 = this.f16690a.B0();
        if (B02 != null) {
            J parentFragmentManager = B02.getParentFragmentManager();
            C6496s.g(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.A0().m(qVar, view, bundle, true);
        }
        Iterator it = this.f16691b.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (!z10 || aVar.b()) {
                aVar.a().onFragmentViewCreated(this.f16690a, qVar, view, bundle);
            }
        }
    }

    public final void n(C1769q qVar, boolean z10) {
        C6496s.h(qVar, "f");
        C1769q B02 = this.f16690a.B0();
        if (B02 != null) {
            J parentFragmentManager = B02.getParentFragmentManager();
            C6496s.g(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.A0().n(qVar, true);
        }
        Iterator it = this.f16691b.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (!z10 || aVar.b()) {
                aVar.a().onFragmentViewDestroyed(this.f16690a, qVar);
            }
        }
    }

    public final void o(J.k kVar, boolean z10) {
        C6496s.h(kVar, "cb");
        this.f16691b.add(new a(kVar, z10));
    }

    public final void p(J.k kVar) {
        C6496s.h(kVar, "cb");
        synchronized (this.f16691b) {
            try {
                int size = this.f16691b.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size) {
                        break;
                    } else if (((a) this.f16691b.get(i10)).a() == kVar) {
                        this.f16691b.remove(i10);
                        break;
                    } else {
                        i10++;
                    }
                }
                C6514M m10 = C6514M.f71813a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
