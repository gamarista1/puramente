package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import retrofit2.C6669b;
import retrofit2.C6672e;
import retrofit2.C6675h;
import rh.C6703A;
import rh.C6708e;
import rh.v;

public final class G {

    /* renamed from: a  reason: collision with root package name */
    private final ConcurrentHashMap f72849a = new ConcurrentHashMap();

    /* renamed from: b  reason: collision with root package name */
    final C6708e.a f72850b;

    /* renamed from: c  reason: collision with root package name */
    final v f72851c;

    /* renamed from: d  reason: collision with root package name */
    final List f72852d;

    /* renamed from: e  reason: collision with root package name */
    final int f72853e;

    /* renamed from: f  reason: collision with root package name */
    final List f72854f;

    /* renamed from: g  reason: collision with root package name */
    final int f72855g;

    /* renamed from: h  reason: collision with root package name */
    final Executor f72856h;

    /* renamed from: i  reason: collision with root package name */
    final boolean f72857i;

    class a implements InvocationHandler {

        /* renamed from: a  reason: collision with root package name */
        private final Object[] f72858a = new Object[0];

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Class f72859b;

        a(Class cls) {
            this.f72859b = cls;
        }

        public Object invoke(Object obj, Method method, Object[] objArr) {
            if (method.getDeclaringClass() == Object.class) {
                return method.invoke(this, objArr);
            }
            if (objArr == null) {
                objArr = this.f72858a;
            }
            z zVar = y.f72997b;
            if (zVar.c(method)) {
                return zVar.b(method, this.f72859b, obj, objArr);
            }
            return G.this.c(this.f72859b, method).a(obj, objArr);
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private C6708e.a f72861a;

        /* renamed from: b  reason: collision with root package name */
        private v f72862b;

        /* renamed from: c  reason: collision with root package name */
        private final List f72863c = new ArrayList();

        /* renamed from: d  reason: collision with root package name */
        private final List f72864d = new ArrayList();

        /* renamed from: e  reason: collision with root package name */
        private Executor f72865e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f72866f;

        public b a(C6672e.a aVar) {
            List list = this.f72864d;
            Objects.requireNonNull(aVar, "factory == null");
            list.add(aVar);
            return this;
        }

        public b b(C6675h.a aVar) {
            List list = this.f72863c;
            Objects.requireNonNull(aVar, "factory == null");
            list.add(aVar);
            return this;
        }

        public b c(String str) {
            Objects.requireNonNull(str, "baseUrl == null");
            return d(v.h(str));
        }

        public b d(v vVar) {
            Objects.requireNonNull(vVar, "baseUrl == null");
            List n10 = vVar.n();
            if ("".equals(n10.get(n10.size() - 1))) {
                this.f72862b = vVar;
                return this;
            }
            throw new IllegalArgumentException("baseUrl must end in /: " + vVar);
        }

        public G e() {
            if (this.f72862b != null) {
                C6708e.a aVar = this.f72861a;
                if (aVar == null) {
                    aVar = new C6703A();
                }
                C6708e.a aVar2 = aVar;
                Executor executor = this.f72865e;
                if (executor == null) {
                    executor = y.f72996a;
                }
                Executor executor2 = executor;
                C6670c cVar = y.f72998c;
                ArrayList arrayList = new ArrayList(this.f72864d);
                List a10 = cVar.a(executor2);
                arrayList.addAll(a10);
                List b10 = cVar.b();
                int size = b10.size();
                ArrayList arrayList2 = new ArrayList(this.f72863c.size() + 1 + size);
                arrayList2.add(new C6669b());
                arrayList2.addAll(this.f72863c);
                arrayList2.addAll(b10);
                return new G(aVar2, this.f72862b, Collections.unmodifiableList(arrayList2), size, Collections.unmodifiableList(arrayList), a10.size(), executor2, this.f72866f);
            }
            throw new IllegalStateException("Base URL required.");
        }

        public b f(C6708e.a aVar) {
            Objects.requireNonNull(aVar, "factory == null");
            this.f72861a = aVar;
            return this;
        }

        public b g(C6703A a10) {
            Objects.requireNonNull(a10, "client == null");
            return f(a10);
        }
    }

    G(C6708e.a aVar, v vVar, List list, int i10, List list2, int i11, Executor executor, boolean z10) {
        this.f72850b = aVar;
        this.f72851c = vVar;
        this.f72852d = list;
        this.f72853e = i10;
        this.f72854f = list2;
        this.f72855g = i11;
        this.f72856h = executor;
        this.f72857i = z10;
    }

    private void j(Class cls) {
        if (cls.isInterface()) {
            ArrayDeque arrayDeque = new ArrayDeque(1);
            arrayDeque.add(cls);
            while (!arrayDeque.isEmpty()) {
                Class cls2 = (Class) arrayDeque.removeFirst();
                if (cls2.getTypeParameters().length != 0) {
                    StringBuilder sb2 = new StringBuilder("Type parameters are unsupported on ");
                    sb2.append(cls2.getName());
                    if (cls2 != cls) {
                        sb2.append(" which is an interface of ");
                        sb2.append(cls.getName());
                    }
                    throw new IllegalArgumentException(sb2.toString());
                }
                Collections.addAll(arrayDeque, cls2.getInterfaces());
            }
            if (this.f72857i) {
                z zVar = y.f72997b;
                for (Method method : cls.getDeclaredMethods()) {
                    if (!zVar.c(method) && !Modifier.isStatic(method.getModifiers()) && !method.isSynthetic()) {
                        c(cls, method);
                    }
                }
                return;
            }
            return;
        }
        throw new IllegalArgumentException("API declarations must be interfaces.");
    }

    public C6672e a(Type type, Annotation[] annotationArr) {
        return d((C6672e.a) null, type, annotationArr);
    }

    public Object b(Class cls) {
        j(cls);
        return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new a(cls));
    }

    /* access modifiers changed from: package-private */
    public H c(Class cls, Method method) {
        while (true) {
            Object obj = this.f72849a.get(method);
            if (obj instanceof H) {
                return (H) obj;
            }
            if (obj == null) {
                Object obj2 = new Object();
                synchronized (obj2) {
                    try {
                        obj = this.f72849a.putIfAbsent(method, obj2);
                        if (obj == null) {
                            H b10 = H.b(this, cls, method);
                            this.f72849a.put(method, b10);
                            return b10;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            synchronized (obj) {
                try {
                    Object obj3 = this.f72849a.get(method);
                    if (obj3 != null) {
                        H h10 = (H) obj3;
                        return h10;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    public C6672e d(C6672e.a aVar, Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "returnType == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int indexOf = this.f72854f.indexOf(aVar) + 1;
        int size = this.f72854f.size();
        for (int i10 = indexOf; i10 < size; i10++) {
            C6672e eVar = ((C6672e.a) this.f72854f.get(i10)).get(type, annotationArr, this);
            if (eVar != null) {
                return eVar;
            }
        }
        StringBuilder sb2 = new StringBuilder("Could not locate call adapter for ");
        sb2.append(type);
        sb2.append(".\n");
        if (aVar != null) {
            sb2.append("  Skipped:");
            for (int i11 = 0; i11 < indexOf; i11++) {
                sb2.append("\n   * ");
                sb2.append(((C6672e.a) this.f72854f.get(i11)).getClass().getName());
            }
            sb2.append(10);
        }
        sb2.append("  Tried:");
        int size2 = this.f72854f.size();
        while (indexOf < size2) {
            sb2.append("\n   * ");
            sb2.append(((C6672e.a) this.f72854f.get(indexOf)).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb2.toString());
    }

    public C6675h e(C6675h.a aVar, Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "parameterAnnotations == null");
        Objects.requireNonNull(annotationArr2, "methodAnnotations == null");
        int indexOf = this.f72852d.indexOf(aVar) + 1;
        int size = this.f72852d.size();
        for (int i10 = indexOf; i10 < size; i10++) {
            C6675h c10 = ((C6675h.a) this.f72852d.get(i10)).c(type, annotationArr, annotationArr2, this);
            if (c10 != null) {
                return c10;
            }
        }
        StringBuilder sb2 = new StringBuilder("Could not locate RequestBody converter for ");
        sb2.append(type);
        sb2.append(".\n");
        if (aVar != null) {
            sb2.append("  Skipped:");
            for (int i11 = 0; i11 < indexOf; i11++) {
                sb2.append("\n   * ");
                sb2.append(((C6675h.a) this.f72852d.get(i11)).getClass().getName());
            }
            sb2.append(10);
        }
        sb2.append("  Tried:");
        int size2 = this.f72852d.size();
        while (indexOf < size2) {
            sb2.append("\n   * ");
            sb2.append(((C6675h.a) this.f72852d.get(indexOf)).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb2.toString());
    }

    public C6675h f(C6675h.a aVar, Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int indexOf = this.f72852d.indexOf(aVar) + 1;
        int size = this.f72852d.size();
        for (int i10 = indexOf; i10 < size; i10++) {
            C6675h d10 = ((C6675h.a) this.f72852d.get(i10)).d(type, annotationArr, this);
            if (d10 != null) {
                return d10;
            }
        }
        StringBuilder sb2 = new StringBuilder("Could not locate ResponseBody converter for ");
        sb2.append(type);
        sb2.append(".\n");
        if (aVar != null) {
            sb2.append("  Skipped:");
            for (int i11 = 0; i11 < indexOf; i11++) {
                sb2.append("\n   * ");
                sb2.append(((C6675h.a) this.f72852d.get(i11)).getClass().getName());
            }
            sb2.append(10);
        }
        sb2.append("  Tried:");
        int size2 = this.f72852d.size();
        while (indexOf < size2) {
            sb2.append("\n   * ");
            sb2.append(((C6675h.a) this.f72852d.get(indexOf)).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb2.toString());
    }

    public C6675h g(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        return e((C6675h.a) null, type, annotationArr, annotationArr2);
    }

    public C6675h h(Type type, Annotation[] annotationArr) {
        return f((C6675h.a) null, type, annotationArr);
    }

    public C6675h i(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int size = this.f72852d.size();
        for (int i10 = 0; i10 < size; i10++) {
            C6675h e10 = ((C6675h.a) this.f72852d.get(i10)).e(type, annotationArr, this);
            if (e10 != null) {
                return e10;
            }
        }
        return C6669b.d.f72880a;
    }
}
