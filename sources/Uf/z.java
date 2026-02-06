package Uf;

import Uf.E;
import eg.C5825b;
import eg.r;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import ng.f;

public final class z extends y implements r {

    /* renamed from: a  reason: collision with root package name */
    private final Method f65271a;

    public z(Method method) {
        C6496s.h(method, "member");
        this.f65271a = method;
    }

    public boolean O() {
        if (q() != null) {
            return true;
        }
        return false;
    }

    /* renamed from: U */
    public Method S() {
        return this.f65271a;
    }

    /* renamed from: V */
    public E getReturnType() {
        E.a aVar = E.f65217a;
        Type genericReturnType = S().getGenericReturnType();
        C6496s.g(genericReturnType, "getGenericReturnType(...)");
        return aVar.a(genericReturnType);
    }

    public List getTypeParameters() {
        TypeVariable[] typeParameters = S().getTypeParameters();
        C6496s.g(typeParameters, "getTypeParameters(...)");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable f10 : typeParameters) {
            arrayList.add(new F(f10));
        }
        return arrayList;
    }

    public List k() {
        Type[] genericParameterTypes = S().getGenericParameterTypes();
        C6496s.g(genericParameterTypes, "getGenericParameterTypes(...)");
        Annotation[][] parameterAnnotations = S().getParameterAnnotations();
        C6496s.g(parameterAnnotations, "getParameterAnnotations(...)");
        return T(genericParameterTypes, parameterAnnotations, S().isVarArgs());
    }

    public C5825b q() {
        Object defaultValue = S().getDefaultValue();
        if (defaultValue != null) {
            return C5555h.f65247b.a(defaultValue, (f) null);
        }
        return null;
    }
}
