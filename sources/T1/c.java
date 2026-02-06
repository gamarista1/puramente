package T1;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.ViewGroup;
import androidx.fragment.app.C1769q;
import androidx.fragment.app.J;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6565s;
import mf.O;
import mf.Y;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f5951a = new c();

    /* renamed from: b  reason: collision with root package name */
    private static C0141c f5952b = C0141c.f5964d;

    public enum a {
        PENALTY_LOG,
        PENALTY_DEATH,
        DETECT_FRAGMENT_REUSE,
        DETECT_FRAGMENT_TAG_USAGE,
        DETECT_WRONG_NESTED_HIERARCHY,
        DETECT_RETAIN_INSTANCE_USAGE,
        DETECT_SET_USER_VISIBLE_HINT,
        DETECT_TARGET_FRAGMENT_USAGE,
        DETECT_WRONG_FRAGMENT_CONTAINER
    }

    public interface b {
    }

    /* renamed from: T1.c$c  reason: collision with other inner class name */
    public static final class C0141c {

        /* renamed from: c  reason: collision with root package name */
        public static final a f5963c = new a((DefaultConstructorMarker) null);

        /* renamed from: d  reason: collision with root package name */
        public static final C0141c f5964d = new C0141c(Y.e(), (b) null, O.i());

        /* renamed from: a  reason: collision with root package name */
        private final Set f5965a;

        /* renamed from: b  reason: collision with root package name */
        private final Map f5966b;

        /* renamed from: T1.c$c$a */
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        public C0141c(Set set, b bVar, Map map) {
            C6496s.h(set, "flags");
            C6496s.h(map, "allowedViolations");
            this.f5965a = set;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map.entrySet()) {
                linkedHashMap.put((String) entry.getKey(), (Set) entry.getValue());
            }
            this.f5966b = linkedHashMap;
        }

        public final Set a() {
            return this.f5965a;
        }

        public final b b() {
            return null;
        }

        public final Map c() {
            return this.f5966b;
        }
    }

    private c() {
    }

    private final C0141c b(C1769q qVar) {
        while (qVar != null) {
            if (qVar.isAdded()) {
                J parentFragmentManager = qVar.getParentFragmentManager();
                C6496s.g(parentFragmentManager, "declaringFragment.parentFragmentManager");
                if (parentFragmentManager.E0() != null) {
                    C0141c E02 = parentFragmentManager.E0();
                    C6496s.e(E02);
                    return E02;
                }
            }
            qVar = qVar.getParentFragment();
        }
        return f5952b;
    }

    private final void c(C0141c cVar, m mVar) {
        C1769q a10 = mVar.a();
        String name = a10.getClass().getName();
        if (cVar.a().contains(a.PENALTY_LOG)) {
            Log.d("FragmentStrictMode", "Policy violation in " + name, mVar);
        }
        cVar.b();
        if (cVar.a().contains(a.PENALTY_DEATH)) {
            p(a10, new b(name, mVar));
        }
    }

    /* access modifiers changed from: private */
    public static final void d(String str, m mVar) {
        C6496s.h(mVar, "$violation");
        Log.e("FragmentStrictMode", "Policy violation with PENALTY_DEATH in " + str, mVar);
        throw mVar;
    }

    private final void e(m mVar) {
        if (J.L0(3)) {
            Log.d("FragmentManager", "StrictMode violation in " + mVar.a().getClass().getName(), mVar);
        }
    }

    public static final void f(C1769q qVar, String str) {
        C6496s.h(qVar, "fragment");
        C6496s.h(str, "previousFragmentId");
        a aVar = new a(qVar, str);
        c cVar = f5951a;
        cVar.e(aVar);
        C0141c b10 = cVar.b(qVar);
        if (b10.a().contains(a.DETECT_FRAGMENT_REUSE) && cVar.q(b10, qVar.getClass(), aVar.getClass())) {
            cVar.c(b10, aVar);
        }
    }

    public static final void g(C1769q qVar, ViewGroup viewGroup) {
        C6496s.h(qVar, "fragment");
        d dVar = new d(qVar, viewGroup);
        c cVar = f5951a;
        cVar.e(dVar);
        C0141c b10 = cVar.b(qVar);
        if (b10.a().contains(a.DETECT_FRAGMENT_TAG_USAGE) && cVar.q(b10, qVar.getClass(), dVar.getClass())) {
            cVar.c(b10, dVar);
        }
    }

    public static final void h(C1769q qVar) {
        C6496s.h(qVar, "fragment");
        e eVar = new e(qVar);
        c cVar = f5951a;
        cVar.e(eVar);
        C0141c b10 = cVar.b(qVar);
        if (b10.a().contains(a.DETECT_RETAIN_INSTANCE_USAGE) && cVar.q(b10, qVar.getClass(), eVar.getClass())) {
            cVar.c(b10, eVar);
        }
    }

    public static final void i(C1769q qVar) {
        C6496s.h(qVar, "fragment");
        f fVar = new f(qVar);
        c cVar = f5951a;
        cVar.e(fVar);
        C0141c b10 = cVar.b(qVar);
        if (b10.a().contains(a.DETECT_TARGET_FRAGMENT_USAGE) && cVar.q(b10, qVar.getClass(), fVar.getClass())) {
            cVar.c(b10, fVar);
        }
    }

    public static final void j(C1769q qVar) {
        C6496s.h(qVar, "fragment");
        g gVar = new g(qVar);
        c cVar = f5951a;
        cVar.e(gVar);
        C0141c b10 = cVar.b(qVar);
        if (b10.a().contains(a.DETECT_TARGET_FRAGMENT_USAGE) && cVar.q(b10, qVar.getClass(), gVar.getClass())) {
            cVar.c(b10, gVar);
        }
    }

    public static final void k(C1769q qVar) {
        C6496s.h(qVar, "fragment");
        i iVar = new i(qVar);
        c cVar = f5951a;
        cVar.e(iVar);
        C0141c b10 = cVar.b(qVar);
        if (b10.a().contains(a.DETECT_RETAIN_INSTANCE_USAGE) && cVar.q(b10, qVar.getClass(), iVar.getClass())) {
            cVar.c(b10, iVar);
        }
    }

    public static final void l(C1769q qVar, C1769q qVar2, int i10) {
        C6496s.h(qVar, "violatingFragment");
        C6496s.h(qVar2, "targetFragment");
        j jVar = new j(qVar, qVar2, i10);
        c cVar = f5951a;
        cVar.e(jVar);
        C0141c b10 = cVar.b(qVar);
        if (b10.a().contains(a.DETECT_TARGET_FRAGMENT_USAGE) && cVar.q(b10, qVar.getClass(), jVar.getClass())) {
            cVar.c(b10, jVar);
        }
    }

    public static final void m(C1769q qVar, boolean z10) {
        C6496s.h(qVar, "fragment");
        k kVar = new k(qVar, z10);
        c cVar = f5951a;
        cVar.e(kVar);
        C0141c b10 = cVar.b(qVar);
        if (b10.a().contains(a.DETECT_SET_USER_VISIBLE_HINT) && cVar.q(b10, qVar.getClass(), kVar.getClass())) {
            cVar.c(b10, kVar);
        }
    }

    public static final void n(C1769q qVar, ViewGroup viewGroup) {
        C6496s.h(qVar, "fragment");
        C6496s.h(viewGroup, "container");
        n nVar = new n(qVar, viewGroup);
        c cVar = f5951a;
        cVar.e(nVar);
        C0141c b10 = cVar.b(qVar);
        if (b10.a().contains(a.DETECT_WRONG_FRAGMENT_CONTAINER) && cVar.q(b10, qVar.getClass(), nVar.getClass())) {
            cVar.c(b10, nVar);
        }
    }

    public static final void o(C1769q qVar, C1769q qVar2, int i10) {
        C6496s.h(qVar, "fragment");
        C6496s.h(qVar2, "expectedParentFragment");
        o oVar = new o(qVar, qVar2, i10);
        c cVar = f5951a;
        cVar.e(oVar);
        C0141c b10 = cVar.b(qVar);
        if (b10.a().contains(a.DETECT_WRONG_NESTED_HIERARCHY) && cVar.q(b10, qVar.getClass(), oVar.getClass())) {
            cVar.c(b10, oVar);
        }
    }

    private final void p(C1769q qVar, Runnable runnable) {
        if (qVar.isAdded()) {
            Handler h10 = qVar.getParentFragmentManager().y0().h();
            if (C6496s.c(h10.getLooper(), Looper.myLooper())) {
                runnable.run();
            } else {
                h10.post(runnable);
            }
        } else {
            runnable.run();
        }
    }

    private final boolean q(C0141c cVar, Class cls, Class cls2) {
        Set set = (Set) cVar.c().get(cls.getName());
        if (set == null) {
            return true;
        }
        if (C6496s.c(cls2.getSuperclass(), m.class) || !C6565s.e0(set, cls2.getSuperclass())) {
            return !set.contains(cls2);
        }
        return false;
    }
}
