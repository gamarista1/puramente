package androidx.lifecycle;

import Z1.a;
import android.os.Bundle;
import androidx.lifecycle.c0;
import kotlin.jvm.internal.C6496s;
import x3.C2912d;
import x3.C2914f;

/* renamed from: androidx.lifecycle.a  reason: case insensitive filesystem */
public abstract class C1778a extends c0.e implements c0.c {

    /* renamed from: b  reason: collision with root package name */
    private C2912d f17188b;

    /* renamed from: c  reason: collision with root package name */
    private C1790m f17189c;

    /* renamed from: d  reason: collision with root package name */
    private Bundle f17190d;

    public C1778a(C2914f fVar, Bundle bundle) {
        C6496s.h(fVar, "owner");
        this.f17188b = fVar.getSavedStateRegistry();
        this.f17189c = fVar.getLifecycle();
        this.f17190d = bundle;
    }

    private final a0 b(String str, Class cls) {
        C2912d dVar = this.f17188b;
        C6496s.e(dVar);
        C1790m mVar = this.f17189c;
        C6496s.e(mVar);
        S b10 = C1789l.b(dVar, mVar, str, this.f17190d);
        a0 c10 = c(str, cls, b10.b());
        c10.addCloseable("androidx.lifecycle.savedstate.vm.tag", b10);
        return c10;
    }

    public void a(a0 a0Var) {
        C6496s.h(a0Var, "viewModel");
        C2912d dVar = this.f17188b;
        if (dVar != null) {
            C6496s.e(dVar);
            C1790m mVar = this.f17189c;
            C6496s.e(mVar);
            C1789l.a(a0Var, dVar, mVar);
        }
    }

    /* access modifiers changed from: protected */
    public abstract a0 c(String str, Class cls, P p10);

    public a0 create(Class cls, a aVar) {
        C6496s.h(cls, "modelClass");
        C6496s.h(aVar, "extras");
        String str = (String) aVar.a(c0.d.f17210d);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        } else if (this.f17188b != null) {
            return b(str, cls);
        } else {
            return c(str, cls, T.a(aVar));
        }
    }

    public a0 create(Class cls) {
        C6496s.h(cls, "modelClass");
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        } else if (this.f17189c != null) {
            return b(canonicalName, cls);
        } else {
            throw new UnsupportedOperationException("AbstractSavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
    }
}
