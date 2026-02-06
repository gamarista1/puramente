package Uf;

import Uf.E;
import eg.C5829f;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.Collection;
import kotlin.jvm.internal.C6496s;
import mf.C6565s;

public final class m extends E implements C5829f {

    /* renamed from: b  reason: collision with root package name */
    private final Type f65251b;

    /* renamed from: c  reason: collision with root package name */
    private final E f65252c;

    /* renamed from: d  reason: collision with root package name */
    private final Collection f65253d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f65254e;

    public m(Type type) {
        E e10;
        C6496s.h(type, "reflectType");
        this.f65251b = type;
        Type R10 = R();
        if (R10 instanceof GenericArrayType) {
            E.a aVar = E.f65217a;
            Type genericComponentType = ((GenericArrayType) R10).getGenericComponentType();
            C6496s.g(genericComponentType, "getGenericComponentType(...)");
            e10 = aVar.a(genericComponentType);
        } else {
            if (R10 instanceof Class) {
                Class cls = (Class) R10;
                if (cls.isArray()) {
                    E.a aVar2 = E.f65217a;
                    Class<?> componentType = cls.getComponentType();
                    C6496s.g(componentType, "getComponentType(...)");
                    e10 = aVar2.a(componentType);
                }
            }
            throw new IllegalArgumentException("Not an array type (" + R().getClass() + "): " + R());
        }
        this.f65252c = e10;
        this.f65253d = C6565s.n();
    }

    public boolean E() {
        return this.f65254e;
    }

    /* access modifiers changed from: protected */
    public Type R() {
        return this.f65251b;
    }

    /* renamed from: S */
    public E o() {
        return this.f65252c;
    }

    public Collection getAnnotations() {
        return this.f65253d;
    }
}
