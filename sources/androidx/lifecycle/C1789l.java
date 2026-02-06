package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.C1790m;
import kotlin.jvm.internal.C6496s;
import x3.C2912d;
import x3.C2914f;

/* renamed from: androidx.lifecycle.l  reason: case insensitive filesystem */
public final class C1789l {

    /* renamed from: a  reason: collision with root package name */
    public static final C1789l f17235a = new C1789l();

    /* renamed from: androidx.lifecycle.l$a */
    public static final class a implements C2912d.a {
        public void a(C2914f fVar) {
            C6496s.h(fVar, "owner");
            if (fVar instanceof e0) {
                d0 viewModelStore = ((e0) fVar).getViewModelStore();
                C2912d savedStateRegistry = fVar.getSavedStateRegistry();
                for (String b10 : viewModelStore.c()) {
                    a0 b11 = viewModelStore.b(b10);
                    C6496s.e(b11);
                    C1789l.a(b11, savedStateRegistry, fVar.getLifecycle());
                }
                if (!viewModelStore.c().isEmpty()) {
                    savedStateRegistry.i(a.class);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
        }
    }

    /* renamed from: androidx.lifecycle.l$b */
    public static final class b implements C1795s {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C1790m f17236a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C2912d f17237b;

        b(C1790m mVar, C2912d dVar) {
            this.f17236a = mVar;
            this.f17237b = dVar;
        }

        public void f(C1798v vVar, C1790m.a aVar) {
            C6496s.h(vVar, "source");
            C6496s.h(aVar, "event");
            if (aVar == C1790m.a.ON_START) {
                this.f17236a.d(this);
                this.f17237b.i(a.class);
            }
        }
    }

    private C1789l() {
    }

    public static final void a(a0 a0Var, C2912d dVar, C1790m mVar) {
        C6496s.h(a0Var, "viewModel");
        C6496s.h(dVar, "registry");
        C6496s.h(mVar, "lifecycle");
        S s10 = (S) a0Var.getCloseable("androidx.lifecycle.savedstate.vm.tag");
        if (s10 != null && !s10.o()) {
            s10.a(dVar, mVar);
            f17235a.c(dVar, mVar);
        }
    }

    public static final S b(C2912d dVar, C1790m mVar, String str, Bundle bundle) {
        C6496s.h(dVar, "registry");
        C6496s.h(mVar, "lifecycle");
        C6496s.e(str);
        S s10 = new S(str, P.f17155f.a(dVar.b(str), bundle));
        s10.a(dVar, mVar);
        f17235a.c(dVar, mVar);
        return s10;
    }

    private final void c(C2912d dVar, C1790m mVar) {
        C1790m.b b10 = mVar.b();
        if (b10 == C1790m.b.INITIALIZED || b10.b(C1790m.b.STARTED)) {
            dVar.i(a.class);
        } else {
            mVar.a(new b(mVar, dVar));
        }
    }
}
