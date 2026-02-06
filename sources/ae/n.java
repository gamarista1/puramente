package ae;

import Ug.C5600w0;
import Ug.J;
import Ug.K;
import Ug.L;
import Ug.U0;
import Ug.Z;
import ge.e;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import lf.C6531o;
import yf.C6787a;
import zf.C6828a;

public final class n implements Iterable, C6828a {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference f53636a;

    /* renamed from: b  reason: collision with root package name */
    private final Map f53637b = new LinkedHashMap();

    /* renamed from: c  reason: collision with root package name */
    private final List f53638c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    private boolean f53639d;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final e f53640a;

        /* renamed from: b  reason: collision with root package name */
        private final Object f53641b;

        /* renamed from: c  reason: collision with root package name */
        private final Object f53642c;

        public a(e eVar, Object obj, Object obj2) {
            C6496s.h(eVar, "eventName");
            this.f53640a = eVar;
            this.f53641b = obj;
            this.f53642c = obj2;
        }

        public final void a(m mVar) {
            Object obj;
            C6496s.h(mVar, "moduleHolder");
            Object obj2 = this.f53641b;
            if (obj2 != null && (obj = this.f53642c) != null) {
                mVar.m(this.f53640a, obj2, obj);
            } else if (obj2 != null) {
                mVar.l(this.f53640a, obj2);
            } else {
                mVar.k(this.f53640a);
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f53640a == aVar.f53640a && C6496s.c(this.f53641b, aVar.f53641b) && C6496s.c(this.f53642c, aVar.f53642c)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int i10;
            int hashCode = this.f53640a.hashCode() * 31;
            Object obj = this.f53641b;
            int i11 = 0;
            if (obj == null) {
                i10 = 0;
            } else {
                i10 = obj.hashCode();
            }
            int i12 = (hashCode + i10) * 31;
            Object obj2 = this.f53642c;
            if (obj2 != null) {
                i11 = obj2.hashCode();
            }
            return i12 + i11;
        }

        public String toString() {
            e eVar = this.f53640a;
            Object obj = this.f53641b;
            Object obj2 = this.f53642c;
            return "PostponedEvent(eventName=" + eVar + ", sender=" + obj + ", payload=" + obj2 + ")";
        }
    }

    static final class b implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m f53643a;

        b(m mVar) {
            this.f53643a = mVar;
        }

        /* renamed from: a */
        public final K invoke() {
            return L.a(Z.a().n1(U0.b((C5600w0) null, 1, (Object) null)).n1(new J(this.f53643a.e().e())));
        }
    }

    public n(WeakReference weakReference) {
        C6496s.h(weakReference, "runtimeContext");
        this.f53636a = weakReference;
    }

    private final void H() {
        synchronized (this) {
            this.f53639d = true;
            C6514M m10 = C6514M.f71813a;
        }
    }

    private final boolean b(e eVar, Object obj, Object obj2) {
        synchronized (this) {
            if (this.f53639d) {
                return false;
            }
            this.f53638c.add(new a(eVar, obj, obj2));
            return true;
        }
    }

    static /* synthetic */ boolean g(n nVar, e eVar, Object obj, Object obj2, int i10, Object obj3) {
        if ((i10 & 2) != 0) {
            obj = null;
        }
        if ((i10 & 4) != 0) {
            obj2 = null;
        }
        return nVar.b(eVar, obj, obj2);
    }

    private final void n() {
        synchronized (this) {
            try {
                for (a aVar : this.f53638c) {
                    Iterator it = iterator();
                    while (it.hasNext()) {
                        aVar.a((m) it.next());
                    }
                }
                this.f53638c.clear();
                C6514M m10 = C6514M.f71813a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void A(e eVar) {
        C6496s.h(eVar, "eventName");
        if (!g(this, eVar, (Object) null, (Object) null, 6, (Object) null)) {
            Iterator it = iterator();
            while (it.hasNext()) {
                ((m) it.next()).k(eVar);
            }
        }
    }

    public final void C(e eVar, Object obj) {
        C6496s.h(eVar, "eventName");
        if (!g(this, eVar, obj, (Object) null, 4, (Object) null)) {
            Iterator it = iterator();
            while (it.hasNext()) {
                ((m) it.next()).l(eVar, obj);
            }
        }
    }

    public final void D(e eVar, Object obj, Object obj2) {
        C6496s.h(eVar, "eventName");
        if (!b(eVar, obj, obj2)) {
            Iterator it = iterator();
            while (it.hasNext()) {
                ((m) it.next()).m(eVar, obj, obj2);
            }
        }
    }

    public final void E() {
        Iterator it = iterator();
        while (it.hasNext()) {
            ((m) it.next()).k(e.MODULE_CREATE);
        }
        P();
        H();
        n();
    }

    public final n I(o oVar) {
        C6496s.h(oVar, "provider");
        for (Class declaredConstructor : oVar.getModulesList()) {
            ke.b bVar = (ke.b) declaredConstructor.getDeclaredConstructor((Class[]) null).newInstance((Object[]) null);
            C6496s.e(bVar);
            N(bVar);
        }
        return this;
    }

    public final void N(ke.b bVar) {
        C6496s.h(bVar, "module");
        D3.a.c("[" + "ExpoModulesCore" + "] " + ("ModuleRegistry.register(" + bVar.getClass() + ")"));
        try {
            Object obj = this.f53636a.get();
            if (obj != null) {
                bVar.j((u) obj);
                m mVar = new m(bVar);
                bVar.i(C6531o.b(new b(mVar)));
                x().put(mVar.h(), mVar);
                C6514M m10 = C6514M.f71813a;
                return;
            }
            throw new IllegalArgumentException("Cannot create a module for invalid runtime context.");
        } finally {
            D3.a.f();
        }
    }

    public final void P() {
        Iterator it = iterator();
        while (it.hasNext()) {
            ((m) it.next()).n();
        }
    }

    public Iterator iterator() {
        return this.f53637b.values().iterator();
    }

    public final void k() {
        this.f53637b.clear();
        C4466c.a().c("✅ ModuleRegistry was destroyed");
    }

    public final m r(Class cls) {
        m mVar;
        Class cls2;
        C6496s.h(cls, "viewClass");
        Iterator it = this.f53637b.entrySet().iterator();
        do {
            mVar = null;
            if (!it.hasNext()) {
                break;
            }
            m mVar2 = (m) ((Map.Entry) it.next()).getValue();
            expo.modules.kotlin.views.n h10 = mVar2.e().h();
            if (h10 != null) {
                cls2 = h10.j();
            } else {
                cls2 = null;
            }
            if (C6496s.c(cls2, cls)) {
                mVar = mVar2;
                continue;
            }
        } while (mVar == null);
        return mVar;
    }

    public final m t(String str) {
        C6496s.h(str, "name");
        return (m) this.f53637b.get(str);
    }

    public final m v(ke.b bVar) {
        Object obj;
        C6496s.h(bVar, "module");
        Iterator it = this.f53637b.values().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((m) obj).g() == bVar) {
                break;
            }
        }
        if (obj instanceof m) {
            return (m) obj;
        }
        return null;
    }

    public final Map x() {
        return this.f53637b;
    }

    public final boolean z(String str) {
        C6496s.h(str, "name");
        return this.f53637b.containsKey(str);
    }
}
