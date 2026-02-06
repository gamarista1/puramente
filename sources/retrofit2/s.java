package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import qf.C6658d;
import retrofit2.K;
import rh.C6708e;
import rh.E;

abstract class s extends H {

    /* renamed from: a  reason: collision with root package name */
    private final E f72908a;

    /* renamed from: b  reason: collision with root package name */
    private final C6708e.a f72909b;

    /* renamed from: c  reason: collision with root package name */
    private final C6675h f72910c;

    static final class a extends s {

        /* renamed from: d  reason: collision with root package name */
        private final C6672e f72911d;

        a(E e10, C6708e.a aVar, C6675h hVar, C6672e eVar) {
            super(e10, aVar, hVar);
            this.f72911d = eVar;
        }

        /* access modifiers changed from: protected */
        public Object c(C6671d dVar, Object[] objArr) {
            return this.f72911d.adapt(dVar);
        }
    }

    static final class b extends s {

        /* renamed from: d  reason: collision with root package name */
        private final C6672e f72912d;

        /* renamed from: e  reason: collision with root package name */
        private final boolean f72913e;

        /* renamed from: f  reason: collision with root package name */
        private final boolean f72914f;

        b(E e10, C6708e.a aVar, C6675h hVar, C6672e eVar, boolean z10, boolean z11) {
            super(e10, aVar, hVar);
            this.f72912d = eVar;
            this.f72913e = z10;
            this.f72914f = z11;
        }

        /* access modifiers changed from: protected */
        public Object c(C6671d dVar, Object[] objArr) {
            C6671d dVar2 = (C6671d) this.f72912d.adapt(dVar);
            C6658d dVar3 = objArr[objArr.length - 1];
            try {
                if (this.f72914f) {
                    return u.d(dVar2, dVar3);
                }
                if (this.f72913e) {
                    return u.b(dVar2, dVar3);
                }
                return u.a(dVar2, dVar3);
            } catch (VirtualMachineError e10) {
                e = e10;
                throw e;
            } catch (ThreadDeath e11) {
                e = e11;
                throw e;
            } catch (LinkageError e12) {
                e = e12;
                throw e;
            } catch (Throwable th2) {
                return u.e(th2, dVar3);
            }
        }
    }

    static final class c extends s {

        /* renamed from: d  reason: collision with root package name */
        private final C6672e f72915d;

        c(E e10, C6708e.a aVar, C6675h hVar, C6672e eVar) {
            super(e10, aVar, hVar);
            this.f72915d = eVar;
        }

        /* access modifiers changed from: protected */
        public Object c(C6671d dVar, Object[] objArr) {
            C6671d dVar2 = (C6671d) this.f72915d.adapt(dVar);
            C6658d dVar3 = objArr[objArr.length - 1];
            try {
                return u.c(dVar2, dVar3);
            } catch (Exception e10) {
                return u.e(e10, dVar3);
            }
        }
    }

    s(E e10, C6708e.a aVar, C6675h hVar) {
        this.f72908a = e10;
        this.f72909b = aVar;
        this.f72910c = hVar;
    }

    private static C6672e d(G g10, Method method, Type type, Annotation[] annotationArr) {
        try {
            return g10.a(type, annotationArr);
        } catch (RuntimeException e10) {
            throw K.o(method, e10, "Unable to create call adapter for %s", type);
        }
    }

    private static C6675h e(G g10, Method method, Type type) {
        try {
            return g10.h(type, method.getAnnotations());
        } catch (RuntimeException e10) {
            throw K.o(method, e10, "Unable to create converter for %s", type);
        }
    }

    static s f(G g10, Method method, E e10) {
        boolean z10;
        Type type;
        boolean z11;
        boolean z12;
        boolean z13 = e10.f72819l;
        Annotation[] annotations = method.getAnnotations();
        Class<F> cls = F.class;
        if (z13) {
            Type[] genericParameterTypes = method.getGenericParameterTypes();
            Type f10 = K.f(0, (ParameterizedType) genericParameterTypes[genericParameterTypes.length - 1]);
            Class<C6671d> cls2 = C6671d.class;
            if (K.h(f10) == cls && (f10 instanceof ParameterizedType)) {
                f10 = K.g(0, (ParameterizedType) f10);
                z11 = true;
                z12 = false;
            } else if (K.h(f10) != cls2) {
                z12 = K.m(f10);
                z11 = false;
            } else {
                throw K.n(method, "Suspend functions should not return Call, as they already execute asynchronously.\nChange its return type to %s", K.g(0, (ParameterizedType) f10));
            }
            type = new K.b((Type) null, cls2, f10);
            annotations = J.a(annotations);
            z10 = z12;
        } else {
            type = method.getGenericReturnType();
            z11 = false;
            z10 = false;
        }
        C6672e d10 = d(g10, method, type, annotations);
        Type responseType = d10.responseType();
        if (responseType == E.class) {
            throw K.n(method, "'" + K.h(responseType).getName() + "' is not a valid response body type. Did you mean ResponseBody?", new Object[0]);
        } else if (responseType == cls) {
            throw K.n(method, "Response must include generic type (e.g., Response<String>)", new Object[0]);
        } else if (!e10.f72811d.equals("HEAD") || Void.class.equals(responseType) || K.m(responseType)) {
            C6675h e11 = e(g10, method, responseType);
            C6708e.a aVar = g10.f72850b;
            if (!z13) {
                return new a(e10, aVar, e11, d10);
            }
            if (z11) {
                return new c(e10, aVar, e11, d10);
            }
            return new b(e10, aVar, e11, d10, false, z10);
        } else {
            throw K.n(method, "HEAD method must use Void or Unit as response type.", new Object[0]);
        }
    }

    /* access modifiers changed from: package-private */
    public final Object a(Object obj, Object[] objArr) {
        return c(new v(this.f72908a, obj, objArr, this.f72909b, this.f72910c), objArr);
    }

    /* access modifiers changed from: protected */
    public abstract Object c(C6671d dVar, Object[] objArr);
}
