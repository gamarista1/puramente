package Tf;

import Lf.l;
import Lf.o;
import Uf.C5553f;
import gg.C5974x;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Iterator;
import kotlin.jvm.internal.C6481c;
import kotlin.jvm.internal.C6496s;
import mf.C6559l;
import ng.b;
import ng.f;
import ng.h;
import tg.C6740f;
import wg.C6769e;
import xf.C6781a;

final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f65153a = new c();

    private c() {
    }

    private final C6740f a(Class<?> cls) {
        int i10 = 0;
        while (cls.isArray()) {
            i10++;
            cls = cls.getComponentType();
        }
        if (!cls.isPrimitive()) {
            b e10 = C5553f.e(cls);
            b m10 = Nf.c.f64255a.m(e10.a());
            if (m10 != null) {
                e10 = m10;
            }
            return new C6740f(e10, i10);
        } else if (C6496s.c(cls, Void.TYPE)) {
            b.a aVar = b.f72283d;
            ng.c l10 = o.a.f64005f.l();
            C6496s.g(l10, "toSafe(...)");
            return new C6740f(aVar.c(l10), i10);
        } else {
            l i11 = C6769e.c(cls.getName()).i();
            C6496s.g(i11, "getPrimitiveType(...)");
            if (i10 > 0) {
                return new C6740f(b.f72283d.c(i11.f()), i10 - 1);
            }
            return new C6740f(b.f72283d.c(i11.j()), i10);
        }
    }

    private final void c(Class cls, C5974x.d dVar) {
        boolean z10;
        Iterator a10 = C6481c.a(cls.getDeclaredConstructors());
        while (a10.hasNext()) {
            Constructor constructor = (Constructor) a10.next();
            f fVar = h.f72312j;
            m mVar = m.f65167a;
            C6496s.e(constructor);
            C5974x.e b10 = dVar.b(fVar, mVar.a(constructor));
            if (b10 != null) {
                Iterator a11 = C6481c.a(constructor.getDeclaredAnnotations());
                while (a11.hasNext()) {
                    Annotation annotation = (Annotation) a11.next();
                    C6496s.e(annotation);
                    f(b10, annotation);
                }
                Annotation[][] parameterAnnotations = constructor.getParameterAnnotations();
                C6496s.e(parameterAnnotations);
                if (parameterAnnotations.length == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    int length = constructor.getParameterTypes().length - parameterAnnotations.length;
                    int length2 = parameterAnnotations.length;
                    for (int i10 = 0; i10 < length2; i10++) {
                        Iterator a12 = C6481c.a(parameterAnnotations[i10]);
                        while (a12.hasNext()) {
                            Annotation annotation2 = (Annotation) a12.next();
                            Class b11 = C6781a.b(C6781a.a(annotation2));
                            b e10 = C5553f.e(b11);
                            C6496s.e(annotation2);
                            C5974x.a c10 = b10.c(i10 + length, e10, new b(annotation2));
                            if (c10 != null) {
                                f65153a.h(c10, annotation2, b11);
                            }
                        }
                    }
                }
                b10.a();
            }
        }
    }

    private final void d(Class cls, C5974x.d dVar) {
        Iterator a10 = C6481c.a(cls.getDeclaredFields());
        while (a10.hasNext()) {
            Field field = (Field) a10.next();
            f i10 = f.i(field.getName());
            C6496s.g(i10, "identifier(...)");
            m mVar = m.f65167a;
            C6496s.e(field);
            C5974x.c a11 = dVar.a(i10, mVar.b(field), (Object) null);
            if (a11 != null) {
                Iterator a12 = C6481c.a(field.getDeclaredAnnotations());
                while (a12.hasNext()) {
                    Annotation annotation = (Annotation) a12.next();
                    C6496s.e(annotation);
                    f(a11, annotation);
                }
                a11.a();
            }
        }
    }

    private final void e(Class cls, C5974x.d dVar) {
        Iterator a10 = C6481c.a(cls.getDeclaredMethods());
        while (a10.hasNext()) {
            Method method = (Method) a10.next();
            f i10 = f.i(method.getName());
            C6496s.g(i10, "identifier(...)");
            m mVar = m.f65167a;
            C6496s.e(method);
            C5974x.e b10 = dVar.b(i10, mVar.c(method));
            if (b10 != null) {
                Iterator a11 = C6481c.a(method.getDeclaredAnnotations());
                while (a11.hasNext()) {
                    Annotation annotation = (Annotation) a11.next();
                    C6496s.e(annotation);
                    f(b10, annotation);
                }
                Annotation[][] parameterAnnotations = method.getParameterAnnotations();
                C6496s.g(parameterAnnotations, "getParameterAnnotations(...)");
                Annotation[][] annotationArr = parameterAnnotations;
                int length = annotationArr.length;
                for (int i11 = 0; i11 < length; i11++) {
                    Iterator a12 = C6481c.a(annotationArr[i11]);
                    while (a12.hasNext()) {
                        Annotation annotation2 = (Annotation) a12.next();
                        Class b11 = C6781a.b(C6781a.a(annotation2));
                        b e10 = C5553f.e(b11);
                        C6496s.e(annotation2);
                        C5974x.a c10 = b10.c(i11, e10, new b(annotation2));
                        if (c10 != null) {
                            f65153a.h(c10, annotation2, b11);
                        }
                    }
                }
                b10.a();
            }
        }
    }

    private final void f(C5974x.c cVar, Annotation annotation) {
        Class b10 = C6781a.b(C6781a.a(annotation));
        C5974x.a b11 = cVar.b(C5553f.e(b10), new b(annotation));
        if (b11 != null) {
            f65153a.h(b11, annotation, b10);
        }
    }

    private final void g(C5974x.a aVar, f fVar, Object obj) {
        Class<?> cls = obj.getClass();
        Class<Class> cls2 = Class.class;
        if (C6496s.c(cls, cls2)) {
            C6496s.f(obj, "null cannot be cast to non-null type java.lang.Class<*>");
            aVar.f(fVar, a((Class) obj));
        } else if (i.f65160a.contains(cls)) {
            aVar.e(fVar, obj);
        } else if (C5553f.l(cls)) {
            if (!cls.isEnum()) {
                cls = cls.getEnclosingClass();
            }
            C6496s.e(cls);
            b e10 = C5553f.e(cls);
            C6496s.f(obj, "null cannot be cast to non-null type kotlin.Enum<*>");
            f i10 = f.i(((Enum) obj).name());
            C6496s.g(i10, "identifier(...)");
            aVar.c(fVar, e10, i10);
        } else {
            Class<Annotation> cls3 = Annotation.class;
            if (cls3.isAssignableFrom(cls)) {
                Class[] interfaces = cls.getInterfaces();
                C6496s.g(interfaces, "getInterfaces(...)");
                Class cls4 = (Class) C6559l.Z0(interfaces);
                C6496s.e(cls4);
                C5974x.a d10 = aVar.d(fVar, C5553f.e(cls4));
                if (d10 != null) {
                    C6496s.f(obj, "null cannot be cast to non-null type kotlin.Annotation");
                    h(d10, (Annotation) obj, cls4);
                }
            } else if (cls.isArray()) {
                C5974x.b b10 = aVar.b(fVar);
                if (b10 != null) {
                    Class<?> componentType = cls.getComponentType();
                    int i11 = 0;
                    if (componentType.isEnum()) {
                        C6496s.e(componentType);
                        b e11 = C5553f.e(componentType);
                        C6496s.f(obj, "null cannot be cast to non-null type kotlin.Array<*>");
                        Object[] objArr = (Object[]) obj;
                        int length = objArr.length;
                        while (i11 < length) {
                            Object obj2 = objArr[i11];
                            C6496s.f(obj2, "null cannot be cast to non-null type kotlin.Enum<*>");
                            f i12 = f.i(((Enum) obj2).name());
                            C6496s.g(i12, "identifier(...)");
                            b10.b(e11, i12);
                            i11++;
                        }
                    } else if (C6496s.c(componentType, cls2)) {
                        C6496s.f(obj, "null cannot be cast to non-null type kotlin.Array<*>");
                        Object[] objArr2 = (Object[]) obj;
                        int length2 = objArr2.length;
                        while (i11 < length2) {
                            Object obj3 = objArr2[i11];
                            C6496s.f(obj3, "null cannot be cast to non-null type java.lang.Class<*>");
                            b10.d(a((Class) obj3));
                            i11++;
                        }
                    } else if (cls3.isAssignableFrom(componentType)) {
                        C6496s.f(obj, "null cannot be cast to non-null type kotlin.Array<*>");
                        Object[] objArr3 = (Object[]) obj;
                        int length3 = objArr3.length;
                        while (i11 < length3) {
                            Object obj4 = objArr3[i11];
                            C6496s.e(componentType);
                            C5974x.a c10 = b10.c(C5553f.e(componentType));
                            if (c10 != null) {
                                C6496s.f(obj4, "null cannot be cast to non-null type kotlin.Annotation");
                                h(c10, (Annotation) obj4, componentType);
                            }
                            i11++;
                        }
                    } else {
                        C6496s.f(obj, "null cannot be cast to non-null type kotlin.Array<*>");
                        Object[] objArr4 = (Object[]) obj;
                        int length4 = objArr4.length;
                        while (i11 < length4) {
                            b10.e(objArr4[i11]);
                            i11++;
                        }
                    }
                    b10.a();
                }
            } else {
                throw new UnsupportedOperationException("Unsupported annotation argument value (" + cls + "): " + obj);
            }
        }
    }

    private final void h(C5974x.a aVar, Annotation annotation, Class cls) {
        Iterator a10 = C6481c.a(cls.getDeclaredMethods());
        while (a10.hasNext()) {
            Method method = (Method) a10.next();
            try {
                Object invoke = method.invoke(annotation, (Object[]) null);
                C6496s.e(invoke);
                f i10 = f.i(method.getName());
                C6496s.g(i10, "identifier(...)");
                g(aVar, i10, invoke);
            } catch (IllegalAccessException unused) {
            }
        }
        aVar.a();
    }

    public final void b(Class cls, C5974x.c cVar) {
        C6496s.h(cls, "klass");
        C6496s.h(cVar, "visitor");
        Iterator a10 = C6481c.a(cls.getDeclaredAnnotations());
        while (a10.hasNext()) {
            Annotation annotation = (Annotation) a10.next();
            C6496s.e(annotation);
            f(cVar, annotation);
        }
        cVar.a();
    }

    public final void i(Class cls, C5974x.d dVar) {
        C6496s.h(cls, "klass");
        C6496s.h(dVar, "memberVisitor");
        e(cls, dVar);
        c(cls, dVar);
        d(cls, dVar);
    }
}
