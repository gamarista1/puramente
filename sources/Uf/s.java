package Uf;

import Uf.E;
import eg.C5824a;
import eg.C5832i;
import eg.C5833j;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import mf.C6565s;
import ng.c;

public final class s extends E implements C5833j {

    /* renamed from: b  reason: collision with root package name */
    private final Type f65265b;

    /* renamed from: c  reason: collision with root package name */
    private final C5832i f65266c;

    public s(Type type) {
        C5832i iVar;
        C6496s.h(type, "reflectType");
        this.f65265b = type;
        Type R10 = R();
        if (R10 instanceof Class) {
            iVar = new q((Class) R10);
        } else if (R10 instanceof TypeVariable) {
            iVar = new F((TypeVariable) R10);
        } else if (R10 instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) R10).getRawType();
            C6496s.f(rawType, "null cannot be cast to non-null type java.lang.Class<*>");
            iVar = new q((Class) rawType);
        } else {
            throw new IllegalStateException("Not a classifier type (" + R10.getClass() + "): " + R10);
        }
        this.f65266c = iVar;
    }

    public List A() {
        Iterable<Type> h10 = C5553f.h(R());
        E.a aVar = E.f65217a;
        ArrayList arrayList = new ArrayList(C6565s.y(h10, 10));
        for (Type a10 : h10) {
            arrayList.add(aVar.a(a10));
        }
        return arrayList;
    }

    public boolean E() {
        return false;
    }

    public String F() {
        return R().toString();
    }

    public String I() {
        throw new UnsupportedOperationException("Type not found: " + R());
    }

    public Type R() {
        return this.f65265b;
    }

    public C5832i b() {
        return this.f65266c;
    }

    public Collection getAnnotations() {
        return C6565s.n();
    }

    public C5824a i(c cVar) {
        C6496s.h(cVar, "fqName");
        return null;
    }

    public boolean u() {
        boolean z10;
        Type R10 = R();
        if (!(R10 instanceof Class)) {
            return false;
        }
        TypeVariable[] typeParameters = ((Class) R10).getTypeParameters();
        C6496s.g(typeParameters, "getTypeParameters(...)");
        if (typeParameters.length == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return true;
        }
        return false;
    }
}
