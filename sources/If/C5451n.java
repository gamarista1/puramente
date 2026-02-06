package If;

import Uf.C5553f;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6559l;
import mf.C6565s;
import mg.C6576d;
import pf.C6632a;

/* renamed from: If.n  reason: case insensitive filesystem */
public abstract class C5451n {

    /* renamed from: If.n$a */
    public static final class a extends C5451n {

        /* renamed from: a  reason: collision with root package name */
        private final Class f63708a;

        /* renamed from: b  reason: collision with root package name */
        private final List f63709b;

        /* renamed from: If.n$a$a  reason: collision with other inner class name */
        public static final class C0939a implements Comparator {
            public final int compare(Object obj, Object obj2) {
                return C6632a.d(((Method) obj).getName(), ((Method) obj2).getName());
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(Class cls) {
            super((DefaultConstructorMarker) null);
            C6496s.h(cls, "jClass");
            this.f63708a = cls;
            Method[] declaredMethods = cls.getDeclaredMethods();
            C6496s.g(declaredMethods, "getDeclaredMethods(...)");
            this.f63709b = C6559l.c1(declaredMethods, new C0939a());
        }

        /* access modifiers changed from: private */
        public static final CharSequence c(Method method) {
            Class<?> returnType = method.getReturnType();
            C6496s.g(returnType, "getReturnType(...)");
            return C5553f.f(returnType);
        }

        public String a() {
            return C6565s.x0(this.f63709b, "", "<init>(", ")V", 0, (CharSequence) null, C5449m.f63705a, 24, (Object) null);
        }

        public final List d() {
            return this.f63709b;
        }
    }

    /* renamed from: If.n$b */
    public static final class b extends C5451n {

        /* renamed from: a  reason: collision with root package name */
        private final Constructor f63710a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(Constructor constructor) {
            super((DefaultConstructorMarker) null);
            C6496s.h(constructor, "constructor");
            this.f63710a = constructor;
        }

        /* access modifiers changed from: private */
        public static final CharSequence c(Class cls) {
            C6496s.e(cls);
            return C5553f.f(cls);
        }

        public String a() {
            Class[] parameterTypes = this.f63710a.getParameterTypes();
            C6496s.g(parameterTypes, "getParameterTypes(...)");
            return C6559l.M0(parameterTypes, "", "<init>(", ")V", 0, (CharSequence) null, C5453o.f63717a, 24, (Object) null);
        }

        public final Constructor d() {
            return this.f63710a;
        }
    }

    /* renamed from: If.n$c */
    public static final class c extends C5451n {

        /* renamed from: a  reason: collision with root package name */
        private final Method f63711a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(Method method) {
            super((DefaultConstructorMarker) null);
            C6496s.h(method, "method");
            this.f63711a = method;
        }

        public String a() {
            return h1.d(this.f63711a);
        }

        public final Method b() {
            return this.f63711a;
        }
    }

    /* renamed from: If.n$d */
    public static final class d extends C5451n {

        /* renamed from: a  reason: collision with root package name */
        private final C6576d.b f63712a;

        /* renamed from: b  reason: collision with root package name */
        private final String f63713b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(C6576d.b bVar) {
            super((DefaultConstructorMarker) null);
            C6496s.h(bVar, "signature");
            this.f63712a = bVar;
            this.f63713b = bVar.a();
        }

        public String a() {
            return this.f63713b;
        }

        public final String b() {
            return this.f63712a.d();
        }
    }

    /* renamed from: If.n$e */
    public static final class e extends C5451n {

        /* renamed from: a  reason: collision with root package name */
        private final C6576d.b f63714a;

        /* renamed from: b  reason: collision with root package name */
        private final String f63715b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(C6576d.b bVar) {
            super((DefaultConstructorMarker) null);
            C6496s.h(bVar, "signature");
            this.f63714a = bVar;
            this.f63715b = bVar.a();
        }

        public String a() {
            return this.f63715b;
        }

        public final String b() {
            return this.f63714a.d();
        }

        public final String c() {
            return this.f63714a.e();
        }
    }

    public /* synthetic */ C5451n(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract String a();

    private C5451n() {
    }
}
