package androidx.lifecycle;

import Z1.a;
import android.app.Application;
import b2.C1880d;
import b2.C1883g;
import com.revenuecat.purchases.common.responses.ProductResponseJsonKeys;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import xf.C6781a;

public class c0 {

    /* renamed from: b  reason: collision with root package name */
    public static final b f17199b = new b((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public static final a.b f17200c = C1883g.a.f19166a;

    /* renamed from: a  reason: collision with root package name */
    private final Z1.d f17201a;

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ c0 c(b bVar, e0 e0Var, c cVar, Z1.a aVar, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                cVar = C1883g.f19165a.b(e0Var);
            }
            if ((i10 & 4) != 0) {
                aVar = C1883g.f19165a.a(e0Var);
            }
            return bVar.b(e0Var, cVar, aVar);
        }

        public final c0 a(d0 d0Var, c cVar, Z1.a aVar) {
            C6496s.h(d0Var, ProductResponseJsonKeys.STORE);
            C6496s.h(cVar, "factory");
            C6496s.h(aVar, "extras");
            return new c0(d0Var, cVar, aVar);
        }

        public final c0 b(e0 e0Var, c cVar, Z1.a aVar) {
            C6496s.h(e0Var, "owner");
            C6496s.h(cVar, "factory");
            C6496s.h(aVar, "extras");
            return new c0(e0Var.getViewModelStore(), cVar, aVar);
        }

        private b() {
        }
    }

    public interface c {

        /* renamed from: a  reason: collision with root package name */
        public static final a f17206a = a.f17207a;

        public static final class a {

            /* renamed from: a  reason: collision with root package name */
            static final /* synthetic */ a f17207a = new a();

            private a() {
            }
        }

        a0 create(Class cls) {
            C6496s.h(cls, "modelClass");
            return C1883g.f19165a.d();
        }

        a0 create(Class cls, Z1.a aVar) {
            C6496s.h(cls, "modelClass");
            C6496s.h(aVar, "extras");
            return create(cls);
        }

        a0 create(Ff.d dVar, Z1.a aVar) {
            C6496s.h(dVar, "modelClass");
            C6496s.h(aVar, "extras");
            return create(C6781a.b(dVar), aVar);
        }
    }

    public static class d implements c {

        /* renamed from: b  reason: collision with root package name */
        public static final a f17208b = new a((DefaultConstructorMarker) null);
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public static d f17209c;

        /* renamed from: d  reason: collision with root package name */
        public static final a.b f17210d = C1883g.a.f19166a;

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final d a() {
                if (d.f17209c == null) {
                    d.f17209c = new d();
                }
                d a10 = d.f17209c;
                C6496s.e(a10);
                return a10;
            }

            private a() {
            }
        }

        public a0 create(Class cls) {
            C6496s.h(cls, "modelClass");
            return C1880d.f19160a.a(cls);
        }

        public a0 create(Class cls, Z1.a aVar) {
            C6496s.h(cls, "modelClass");
            C6496s.h(aVar, "extras");
            return create(cls);
        }

        public a0 create(Ff.d dVar, Z1.a aVar) {
            C6496s.h(dVar, "modelClass");
            C6496s.h(aVar, "extras");
            return create(C6781a.b(dVar), aVar);
        }
    }

    public static class e {
        public abstract void a(a0 a0Var);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public c0(d0 d0Var, c cVar) {
        this(d0Var, cVar, (Z1.a) null, 4, (DefaultConstructorMarker) null);
        C6496s.h(d0Var, ProductResponseJsonKeys.STORE);
        C6496s.h(cVar, "factory");
    }

    public final a0 a(Ff.d dVar) {
        C6496s.h(dVar, "modelClass");
        return Z1.d.b(this.f17201a, dVar, (String) null, 2, (Object) null);
    }

    public a0 b(Class cls) {
        C6496s.h(cls, "modelClass");
        return a(C6781a.e(cls));
    }

    public final a0 c(String str, Ff.d dVar) {
        C6496s.h(str, SubscriberAttributeKt.JSON_NAME_KEY);
        C6496s.h(dVar, "modelClass");
        return this.f17201a.a(dVar, str);
    }

    public a0 d(String str, Class cls) {
        C6496s.h(str, SubscriberAttributeKt.JSON_NAME_KEY);
        C6496s.h(cls, "modelClass");
        return this.f17201a.a(C6781a.e(cls), str);
    }

    public static class a extends d {

        /* renamed from: f  reason: collision with root package name */
        public static final b f17202f = new b((DefaultConstructorMarker) null);
        /* access modifiers changed from: private */

        /* renamed from: g  reason: collision with root package name */
        public static a f17203g;

        /* renamed from: h  reason: collision with root package name */
        public static final a.b f17204h = new C0302a();

        /* renamed from: e  reason: collision with root package name */
        private final Application f17205e;

        /* renamed from: androidx.lifecycle.c0$a$a  reason: collision with other inner class name */
        public static final class C0302a implements a.b {
            C0302a() {
            }
        }

        public static final class b {
            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final a a(Application application) {
                C6496s.h(application, "application");
                if (a.f17203g == null) {
                    a.f17203g = new a(application);
                }
                a c10 = a.f17203g;
                C6496s.e(c10);
                return c10;
            }

            private b() {
            }
        }

        private a(Application application, int i10) {
            this.f17205e = application;
        }

        private final a0 e(Class cls, Application application) {
            if (!C1779b.class.isAssignableFrom(cls)) {
                return super.create(cls);
            }
            try {
                a0 a0Var = (a0) cls.getConstructor(new Class[]{Application.class}).newInstance(new Object[]{application});
                C6496s.g(a0Var, "{\n                try {\n…          }\n            }");
                return a0Var;
            } catch (NoSuchMethodException e10) {
                throw new RuntimeException("Cannot create an instance of " + cls, e10);
            } catch (IllegalAccessException e11) {
                throw new RuntimeException("Cannot create an instance of " + cls, e11);
            } catch (InstantiationException e12) {
                throw new RuntimeException("Cannot create an instance of " + cls, e12);
            } catch (InvocationTargetException e13) {
                throw new RuntimeException("Cannot create an instance of " + cls, e13);
            }
        }

        public a0 create(Class cls, Z1.a aVar) {
            C6496s.h(cls, "modelClass");
            C6496s.h(aVar, "extras");
            if (this.f17205e != null) {
                return create(cls);
            }
            Application application = (Application) aVar.a(f17204h);
            if (application != null) {
                return e(cls, application);
            }
            if (!C1779b.class.isAssignableFrom(cls)) {
                return super.create(cls);
            }
            throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
        }

        public a() {
            this((Application) null, 0);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public a(Application application) {
            this(application, 0);
            C6496s.h(application, "application");
        }

        public a0 create(Class cls) {
            C6496s.h(cls, "modelClass");
            Application application = this.f17205e;
            if (application != null) {
                return e(cls, application);
            }
            throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        }
    }

    private c0(Z1.d dVar) {
        this.f17201a = dVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c0(d0 d0Var, c cVar, Z1.a aVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(d0Var, cVar, (i10 & 4) != 0 ? a.C0192a.f10387b : aVar);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public c0(d0 d0Var, c cVar, Z1.a aVar) {
        this(new Z1.d(d0Var, cVar, aVar));
        C6496s.h(d0Var, ProductResponseJsonKeys.STORE);
        C6496s.h(cVar, "factory");
        C6496s.h(aVar, "defaultCreationExtras");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public c0(e0 e0Var, c cVar) {
        this(e0Var.getViewModelStore(), cVar, C1883g.f19165a.a(e0Var));
        C6496s.h(e0Var, "owner");
        C6496s.h(cVar, "factory");
    }
}
