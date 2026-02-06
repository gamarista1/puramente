package androidx.lifecycle;

import Z1.a;
import android.os.Bundle;
import androidx.lifecycle.C1790m;
import androidx.lifecycle.c0;
import kotlin.jvm.internal.C6496s;
import x3.C2912d;
import x3.C2914f;

public abstract class T {

    /* renamed from: a  reason: collision with root package name */
    public static final a.b f17166a = new b();

    /* renamed from: b  reason: collision with root package name */
    public static final a.b f17167b = new c();

    /* renamed from: c  reason: collision with root package name */
    public static final a.b f17168c = new a();

    public static final class a implements a.b {
        a() {
        }
    }

    public static final class b implements a.b {
        b() {
        }
    }

    public static final class c implements a.b {
        c() {
        }
    }

    public static final class d implements c0.c {
        d() {
        }

        public a0 create(Class cls, Z1.a aVar) {
            C6496s.h(cls, "modelClass");
            C6496s.h(aVar, "extras");
            return new V();
        }
    }

    public static final P a(Z1.a aVar) {
        C6496s.h(aVar, "<this>");
        C2914f fVar = (C2914f) aVar.a(f17166a);
        if (fVar != null) {
            e0 e0Var = (e0) aVar.a(f17167b);
            if (e0Var != null) {
                Bundle bundle = (Bundle) aVar.a(f17168c);
                String str = (String) aVar.a(c0.d.f17210d);
                if (str != null) {
                    return b(fVar, e0Var, str, bundle);
                }
                throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
            }
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
    }

    private static final P b(C2914f fVar, e0 e0Var, String str, Bundle bundle) {
        U d10 = d(fVar);
        V e10 = e(e0Var);
        P p10 = (P) e10.b().get(str);
        if (p10 != null) {
            return p10;
        }
        P a10 = P.f17155f.a(d10.b(str), bundle);
        e10.b().put(str, a10);
        return a10;
    }

    public static final void c(C2914f fVar) {
        C6496s.h(fVar, "<this>");
        C1790m.b b10 = fVar.getLifecycle().b();
        if (b10 != C1790m.b.INITIALIZED && b10 != C1790m.b.CREATED) {
            throw new IllegalArgumentException("Failed requirement.");
        } else if (fVar.getSavedStateRegistry().c("androidx.lifecycle.internal.SavedStateHandlesProvider") == null) {
            U u10 = new U(fVar.getSavedStateRegistry(), (e0) fVar);
            fVar.getSavedStateRegistry().h("androidx.lifecycle.internal.SavedStateHandlesProvider", u10);
            fVar.getLifecycle().a(new Q(u10));
        }
    }

    public static final U d(C2914f fVar) {
        U u10;
        C6496s.h(fVar, "<this>");
        C2912d.c c10 = fVar.getSavedStateRegistry().c("androidx.lifecycle.internal.SavedStateHandlesProvider");
        if (c10 instanceof U) {
            u10 = (U) c10;
        } else {
            u10 = null;
        }
        if (u10 != null) {
            return u10;
        }
        throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
    }

    public static final V e(e0 e0Var) {
        C6496s.h(e0Var, "<this>");
        return (V) new c0(e0Var, (c0.c) new d()).d("androidx.lifecycle.internal.SavedStateHandlesVM", V.class);
    }
}
