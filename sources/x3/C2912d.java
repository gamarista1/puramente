package x3;

import android.os.Bundle;
import androidx.lifecycle.C1790m;
import androidx.lifecycle.C1798v;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.C2383b;
import x3.C2910b;

/* renamed from: x3.d  reason: case insensitive filesystem */
public final class C2912d {

    /* renamed from: g  reason: collision with root package name */
    private static final b f28418g = new b((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final C2383b f28419a = new C2383b();

    /* renamed from: b  reason: collision with root package name */
    private boolean f28420b;

    /* renamed from: c  reason: collision with root package name */
    private Bundle f28421c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f28422d;

    /* renamed from: e  reason: collision with root package name */
    private C2910b.C0473b f28423e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f28424f = true;

    /* renamed from: x3.d$a */
    public interface a {
        void a(C2914f fVar);
    }

    /* renamed from: x3.d$b */
    private static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    /* renamed from: x3.d$c */
    public interface c {
        Bundle a();
    }

    /* access modifiers changed from: private */
    public static final void d(C2912d dVar, C1798v vVar, C1790m.a aVar) {
        C6496s.h(dVar, "this$0");
        C6496s.h(vVar, "<anonymous parameter 0>");
        C6496s.h(aVar, "event");
        if (aVar == C1790m.a.ON_START) {
            dVar.f28424f = true;
        } else if (aVar == C1790m.a.ON_STOP) {
            dVar.f28424f = false;
        }
    }

    public final Bundle b(String str) {
        Bundle bundle;
        C6496s.h(str, SubscriberAttributeKt.JSON_NAME_KEY);
        if (this.f28422d) {
            Bundle bundle2 = this.f28421c;
            if (bundle2 == null) {
                return null;
            }
            if (bundle2 != null) {
                bundle = bundle2.getBundle(str);
            } else {
                bundle = null;
            }
            Bundle bundle3 = this.f28421c;
            if (bundle3 != null) {
                bundle3.remove(str);
            }
            Bundle bundle4 = this.f28421c;
            if (bundle4 == null || bundle4.isEmpty()) {
                this.f28421c = null;
            }
            return bundle;
        }
        throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
    }

    public final c c(String str) {
        C6496s.h(str, SubscriberAttributeKt.JSON_NAME_KEY);
        Iterator it = this.f28419a.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            C6496s.g(entry, "components");
            c cVar = (c) entry.getValue();
            if (C6496s.c((String) entry.getKey(), str)) {
                return cVar;
            }
        }
        return null;
    }

    public final void e(C1790m mVar) {
        C6496s.h(mVar, "lifecycle");
        if (!this.f28420b) {
            mVar.a(new C2911c(this));
            this.f28420b = true;
            return;
        }
        throw new IllegalStateException("SavedStateRegistry was already attached.");
    }

    public final void f(Bundle bundle) {
        Bundle bundle2;
        if (!this.f28420b) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).");
        } else if (!this.f28422d) {
            if (bundle != null) {
                bundle2 = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
            } else {
                bundle2 = null;
            }
            this.f28421c = bundle2;
            this.f28422d = true;
        } else {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
    }

    public final void g(Bundle bundle) {
        C6496s.h(bundle, "outBundle");
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = this.f28421c;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        C2383b.d d10 = this.f28419a.d();
        C6496s.g(d10, "this.components.iteratorWithAdditions()");
        while (d10.hasNext()) {
            Map.Entry entry = (Map.Entry) d10.next();
            bundle2.putBundle((String) entry.getKey(), ((c) entry.getValue()).a());
        }
        if (!bundle2.isEmpty()) {
            bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
        }
    }

    public final void h(String str, c cVar) {
        C6496s.h(str, SubscriberAttributeKt.JSON_NAME_KEY);
        C6496s.h(cVar, "provider");
        if (((c) this.f28419a.k(str, cVar)) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    public final void i(Class cls) {
        C6496s.h(cls, "clazz");
        if (this.f28424f) {
            C2910b.C0473b bVar = this.f28423e;
            if (bVar == null) {
                bVar = new C2910b.C0473b(this);
            }
            this.f28423e = bVar;
            try {
                cls.getDeclaredConstructor((Class[]) null);
                C2910b.C0473b bVar2 = this.f28423e;
                if (bVar2 != null) {
                    String name = cls.getName();
                    C6496s.g(name, "clazz.name");
                    bVar2.b(name);
                }
            } catch (NoSuchMethodException e10) {
                throw new IllegalArgumentException("Class " + cls.getSimpleName() + " must have default constructor in order to be automatically recreated", e10);
            }
        } else {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    public final void j(String str) {
        C6496s.h(str, SubscriberAttributeKt.JSON_NAME_KEY);
        this.f28419a.m(str);
    }
}
