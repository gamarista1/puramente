package Uf;

import eg.C5834k;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import mf.C6559l;
import mf.C6565s;

public final class t extends y implements C5834k {

    /* renamed from: a  reason: collision with root package name */
    private final Constructor f65267a;

    public t(Constructor constructor) {
        C6496s.h(constructor, "member");
        this.f65267a = constructor;
    }

    /* renamed from: U */
    public Constructor S() {
        return this.f65267a;
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
        C6496s.e(genericParameterTypes);
        if (genericParameterTypes.length == 0) {
            return C6565s.n();
        }
        Class declaringClass = S().getDeclaringClass();
        if (declaringClass.getDeclaringClass() != null && !Modifier.isStatic(declaringClass.getModifiers())) {
            genericParameterTypes = (Type[]) C6559l.s(genericParameterTypes, 1, genericParameterTypes.length);
        }
        Annotation[][] parameterAnnotations = S().getParameterAnnotations();
        if (parameterAnnotations.length >= genericParameterTypes.length) {
            if (parameterAnnotations.length > genericParameterTypes.length) {
                C6496s.e(parameterAnnotations);
                parameterAnnotations = (Annotation[][]) C6559l.s(parameterAnnotations, parameterAnnotations.length - genericParameterTypes.length, parameterAnnotations.length);
            }
            C6496s.e(genericParameterTypes);
            C6496s.e(parameterAnnotations);
            return T(genericParameterTypes, parameterAnnotations, S().isVarArgs());
        }
        throw new IllegalStateException("Illegal generic signature: " + S());
    }
}
