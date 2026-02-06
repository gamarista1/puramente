package x3;

import android.os.Bundle;
import androidx.lifecycle.C1790m;
import androidx.lifecycle.C1795s;
import androidx.lifecycle.C1798v;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import x3.C2912d;

/* renamed from: x3.b  reason: case insensitive filesystem */
public final class C2910b implements C1795s {

    /* renamed from: b  reason: collision with root package name */
    public static final a f28414b = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final C2914f f28415a;

    /* renamed from: x3.b$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* renamed from: x3.b$b  reason: collision with other inner class name */
    public static final class C0473b implements C2912d.c {

        /* renamed from: a  reason: collision with root package name */
        private final Set f28416a = new LinkedHashSet();

        public C0473b(C2912d dVar) {
            C6496s.h(dVar, "registry");
            dVar.h("androidx.savedstate.Restarter", this);
        }

        public Bundle a() {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("classes_to_restore", new ArrayList(this.f28416a));
            return bundle;
        }

        public final void b(String str) {
            C6496s.h(str, "className");
            this.f28416a.add(str);
        }
    }

    public C2910b(C2914f fVar) {
        C6496s.h(fVar, "owner");
        this.f28415a = fVar;
    }

    private final void a(String str) {
        try {
            Class<? extends U> asSubclass = Class.forName(str, false, C2910b.class.getClassLoader()).asSubclass(C2912d.a.class);
            C6496s.g(asSubclass, "{\n                Class.…class.java)\n            }");
            try {
                Constructor<? extends U> declaredConstructor = asSubclass.getDeclaredConstructor((Class[]) null);
                declaredConstructor.setAccessible(true);
                try {
                    Object newInstance = declaredConstructor.newInstance((Object[]) null);
                    C6496s.g(newInstance, "{\n                constr…wInstance()\n            }");
                    ((C2912d.a) newInstance).a(this.f28415a);
                } catch (Exception e10) {
                    throw new RuntimeException("Failed to instantiate " + str, e10);
                }
            } catch (NoSuchMethodException e11) {
                throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e11);
            }
        } catch (ClassNotFoundException e12) {
            throw new RuntimeException("Class " + str + " wasn't found", e12);
        }
    }

    public void f(C1798v vVar, C1790m.a aVar) {
        C6496s.h(vVar, "source");
        C6496s.h(aVar, "event");
        if (aVar == C1790m.a.ON_CREATE) {
            vVar.getLifecycle().d(this);
            Bundle b10 = this.f28415a.getSavedStateRegistry().b("androidx.savedstate.Restarter");
            if (b10 != null) {
                ArrayList<String> stringArrayList = b10.getStringArrayList("classes_to_restore");
                if (stringArrayList != null) {
                    for (String a10 : stringArrayList) {
                        a(a10);
                    }
                    return;
                }
                throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
            }
            return;
        }
        throw new AssertionError("Next event must be ON_CREATE");
    }
}
