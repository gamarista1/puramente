package androidx.lifecycle;

import Z1.a;
import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.c0;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.lang.reflect.Constructor;
import kotlin.jvm.internal.C6496s;
import x3.C2912d;
import x3.C2914f;

public final class W extends c0.e implements c0.c {

    /* renamed from: b  reason: collision with root package name */
    private Application f17175b;

    /* renamed from: c  reason: collision with root package name */
    private final c0.c f17176c;

    /* renamed from: d  reason: collision with root package name */
    private Bundle f17177d;

    /* renamed from: e  reason: collision with root package name */
    private C1790m f17178e;

    /* renamed from: f  reason: collision with root package name */
    private C2912d f17179f;

    public W(Application application, C2914f fVar, Bundle bundle) {
        c0.a aVar;
        C6496s.h(fVar, "owner");
        this.f17179f = fVar.getSavedStateRegistry();
        this.f17178e = fVar.getLifecycle();
        this.f17177d = bundle;
        this.f17175b = application;
        if (application != null) {
            aVar = c0.a.f17202f.a(application);
        } else {
            aVar = new c0.a();
        }
        this.f17176c = aVar;
    }

    public void a(a0 a0Var) {
        C6496s.h(a0Var, "viewModel");
        if (this.f17178e != null) {
            C2912d dVar = this.f17179f;
            C6496s.e(dVar);
            C1790m mVar = this.f17178e;
            C6496s.e(mVar);
            C1789l.a(a0Var, dVar, mVar);
        }
    }

    public final a0 b(String str, Class cls) {
        Constructor constructor;
        a0 a0Var;
        Application application;
        C6496s.h(str, SubscriberAttributeKt.JSON_NAME_KEY);
        C6496s.h(cls, "modelClass");
        C1790m mVar = this.f17178e;
        if (mVar != null) {
            boolean isAssignableFrom = C1779b.class.isAssignableFrom(cls);
            if (!isAssignableFrom || this.f17175b == null) {
                constructor = X.c(cls, X.f17181b);
            } else {
                constructor = X.c(cls, X.f17180a);
            }
            if (constructor != null) {
                C2912d dVar = this.f17179f;
                C6496s.e(dVar);
                S b10 = C1789l.b(dVar, mVar, str, this.f17177d);
                if (!isAssignableFrom || (application = this.f17175b) == null) {
                    a0Var = X.d(cls, constructor, b10.b());
                } else {
                    C6496s.e(application);
                    a0Var = X.d(cls, constructor, application, b10.b());
                }
                a0Var.addCloseable("androidx.lifecycle.savedstate.vm.tag", b10);
                return a0Var;
            } else if (this.f17175b != null) {
                return this.f17176c.create(cls);
            } else {
                return c0.d.f17208b.a().create(cls);
            }
        } else {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
    }

    public a0 create(Class cls, a aVar) {
        Constructor constructor;
        C6496s.h(cls, "modelClass");
        C6496s.h(aVar, "extras");
        String str = (String) aVar.a(c0.d.f17210d);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        } else if (aVar.a(T.f17166a) != null && aVar.a(T.f17167b) != null) {
            Application application = (Application) aVar.a(c0.a.f17204h);
            boolean isAssignableFrom = C1779b.class.isAssignableFrom(cls);
            if (!isAssignableFrom || application == null) {
                constructor = X.c(cls, X.f17181b);
            } else {
                constructor = X.c(cls, X.f17180a);
            }
            if (constructor == null) {
                return this.f17176c.create(cls, aVar);
            }
            if (!isAssignableFrom || application == null) {
                return X.d(cls, constructor, T.a(aVar));
            }
            return X.d(cls, constructor, application, T.a(aVar));
        } else if (this.f17178e != null) {
            return b(str, cls);
        } else {
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
    }

    public a0 create(Class cls) {
        C6496s.h(cls, "modelClass");
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return b(canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }
}
