package com.google.gson.reflect;

import Pc.H;
import Pc.w;
import com.amazon.a.a.o.b;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class a<T> {
    private final int hashCode;
    private final Class<? super T> rawType;
    private final Type type;

    protected a() {
        Type b10 = b();
        this.type = b10;
        this.rawType = w.k(b10);
        this.hashCode = b10.hashCode();
    }

    private static IllegalArgumentException a(Type type2, Class... clsArr) {
        StringBuilder sb2 = new StringBuilder("Unsupported type, expected one of: ");
        for (Class name : clsArr) {
            sb2.append(name.getName());
            sb2.append(", ");
        }
        sb2.append("but got: ");
        sb2.append(type2.getClass().getName());
        sb2.append(", for type token: ");
        sb2.append(type2.toString());
        return new IllegalArgumentException(sb2.toString());
    }

    private Type b() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        Class<a> cls = a.class;
        if (genericSuperclass instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) genericSuperclass;
            if (parameterizedType.getRawType() == cls) {
                Type b10 = w.b(parameterizedType.getActualTypeArguments()[0]);
                if (e()) {
                    h(b10);
                }
                return b10;
            }
        } else if (genericSuperclass == cls) {
            throw new IllegalStateException("TypeToken must be created with a type argument: new TypeToken<...>() {}; When using code shrinkers (ProGuard, R8, ...) make sure that generic signatures are preserved.\nSee " + H.a("type-token-raw"));
        }
        throw new IllegalStateException("Must only create direct subclasses of TypeToken");
    }

    private static boolean c(Type type2, GenericArrayType genericArrayType) {
        Class<?> cls;
        Type genericComponentType = genericArrayType.getGenericComponentType();
        if (!(genericComponentType instanceof ParameterizedType)) {
            return true;
        }
        if (type2 instanceof GenericArrayType) {
            cls = ((GenericArrayType) type2).getGenericComponentType();
        } else {
            boolean z10 = type2 instanceof Class;
            cls = type2;
            if (z10) {
                Class<?> cls2 = (Class) type2;
                while (cls2.isArray()) {
                    cls2 = cls2.getComponentType();
                }
                cls = cls2;
            }
        }
        return d(cls, (ParameterizedType) genericComponentType, new HashMap());
    }

    private static boolean d(Type type2, ParameterizedType parameterizedType, Map map) {
        ParameterizedType parameterizedType2;
        if (type2 == null) {
            return false;
        }
        if (parameterizedType.equals(type2)) {
            return true;
        }
        Class k10 = w.k(type2);
        if (type2 instanceof ParameterizedType) {
            parameterizedType2 = (ParameterizedType) type2;
        } else {
            parameterizedType2 = null;
        }
        if (parameterizedType2 != null) {
            Type[] actualTypeArguments = parameterizedType2.getActualTypeArguments();
            TypeVariable[] typeParameters = k10.getTypeParameters();
            for (int i10 = 0; i10 < actualTypeArguments.length; i10++) {
                Type type3 = actualTypeArguments[i10];
                TypeVariable typeVariable = typeParameters[i10];
                while (type3 instanceof TypeVariable) {
                    type3 = (Type) map.get(((TypeVariable) type3).getName());
                }
                map.put(typeVariable.getName(), type3);
            }
            if (g(parameterizedType2, parameterizedType, map)) {
                return true;
            }
        }
        for (Type d10 : k10.getGenericInterfaces()) {
            if (d(d10, parameterizedType, new HashMap(map))) {
                return true;
            }
        }
        return d(k10.getGenericSuperclass(), parameterizedType, new HashMap(map));
    }

    private static boolean e() {
        return !Objects.equals(System.getProperty("gson.allowCapturingTypeVariables"), b.f37475af);
    }

    private static boolean f(Type type2, Type type3, Map map) {
        if (type3.equals(type2) || ((type2 instanceof TypeVariable) && type3.equals(map.get(((TypeVariable) type2).getName())))) {
            return true;
        }
        return false;
    }

    private static boolean g(ParameterizedType parameterizedType, ParameterizedType parameterizedType2, Map map) {
        if (!parameterizedType.getRawType().equals(parameterizedType2.getRawType())) {
            return false;
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        Type[] actualTypeArguments2 = parameterizedType2.getActualTypeArguments();
        for (int i10 = 0; i10 < actualTypeArguments.length; i10++) {
            if (!f(actualTypeArguments[i10], actualTypeArguments2[i10], map)) {
                return false;
            }
        }
        return true;
    }

    public static a<?> get(Type type2) {
        return new a<>(type2);
    }

    public static a<?> getArray(Type type2) {
        return new a<>(w.a(type2));
    }

    public static a<?> getParameterized(Type type2, Type... typeArr) {
        Objects.requireNonNull(type2);
        Objects.requireNonNull(typeArr);
        if (type2 instanceof Class) {
            Class cls = (Class) type2;
            TypeVariable[] typeParameters = cls.getTypeParameters();
            int length = typeParameters.length;
            int length2 = typeArr.length;
            if (length2 != length) {
                throw new IllegalArgumentException(cls.getName() + " requires " + length + " type arguments, but got " + length2);
            } else if (typeArr.length == 0) {
                return get(cls);
            } else {
                if (!w.o(type2)) {
                    for (int i10 = 0; i10 < length; i10++) {
                        Type type3 = typeArr[i10];
                        Objects.requireNonNull(type3, "Type argument must not be null");
                        Type type4 = type3;
                        Class k10 = w.k(type4);
                        TypeVariable typeVariable = typeParameters[i10];
                        Type[] bounds = typeVariable.getBounds();
                        int length3 = bounds.length;
                        int i11 = 0;
                        while (i11 < length3) {
                            if (w.k(bounds[i11]).isAssignableFrom(k10)) {
                                i11++;
                            } else {
                                throw new IllegalArgumentException("Type argument " + type4 + " does not satisfy bounds for type variable " + typeVariable + " declared by " + type2);
                            }
                        }
                    }
                    return new a<>(w.n((Type) null, cls, typeArr));
                }
                throw new IllegalArgumentException("Raw type " + cls.getName() + " is not supported because it requires specifying an owner type");
            }
        } else {
            throw new IllegalArgumentException("rawType must be of type Class, but was " + type2);
        }
    }

    private static void h(Type type2) {
        if (type2 instanceof TypeVariable) {
            TypeVariable typeVariable = (TypeVariable) type2;
            throw new IllegalArgumentException("TypeToken type argument must not contain a type variable; captured type variable " + typeVariable.getName() + " declared by " + typeVariable.getGenericDeclaration() + "\nSee " + H.a("typetoken-type-variable"));
        } else if (type2 instanceof GenericArrayType) {
            h(((GenericArrayType) type2).getGenericComponentType());
        } else {
            int i10 = 0;
            if (type2 instanceof ParameterizedType) {
                ParameterizedType parameterizedType = (ParameterizedType) type2;
                Type ownerType = parameterizedType.getOwnerType();
                if (ownerType != null) {
                    h(ownerType);
                }
                Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                int length = actualTypeArguments.length;
                while (i10 < length) {
                    h(actualTypeArguments[i10]);
                    i10++;
                }
            } else if (type2 instanceof WildcardType) {
                WildcardType wildcardType = (WildcardType) type2;
                for (Type h10 : wildcardType.getLowerBounds()) {
                    h(h10);
                }
                Type[] upperBounds = wildcardType.getUpperBounds();
                int length2 = upperBounds.length;
                while (i10 < length2) {
                    h(upperBounds[i10]);
                    i10++;
                }
            } else if (type2 == null) {
                throw new IllegalArgumentException("TypeToken captured `null` as type argument; probably a compiler / runtime bug");
            }
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a) || !w.f(this.type, ((a) obj).type)) {
            return false;
        }
        return true;
    }

    public final Class<? super T> getRawType() {
        return this.rawType;
    }

    public final Type getType() {
        return this.type;
    }

    public final int hashCode() {
        return this.hashCode;
    }

    @Deprecated
    public boolean isAssignableFrom(Class<?> cls) {
        return isAssignableFrom((Type) cls);
    }

    public final String toString() {
        return w.u(this.type);
    }

    public static <T> a<T> get(Class<T> cls) {
        return new a<>(cls);
    }

    @Deprecated
    public boolean isAssignableFrom(Type type2) {
        if (type2 == null) {
            return false;
        }
        if (this.type.equals(type2)) {
            return true;
        }
        Type type3 = this.type;
        if (type3 instanceof Class) {
            return this.rawType.isAssignableFrom(w.k(type2));
        }
        if (type3 instanceof ParameterizedType) {
            return d(type2, (ParameterizedType) type3, new HashMap());
        }
        if (!(type3 instanceof GenericArrayType)) {
            throw a(type3, Class.class, ParameterizedType.class, GenericArrayType.class);
        } else if (!this.rawType.isAssignableFrom(w.k(type2)) || !c(type2, (GenericArrayType) this.type)) {
            return false;
        } else {
            return true;
        }
    }

    private a(Type type2) {
        Objects.requireNonNull(type2);
        Type b10 = w.b(type2);
        this.type = b10;
        this.rawType = w.k(b10);
        this.hashCode = b10.hashCode();
    }

    @Deprecated
    public boolean isAssignableFrom(a<?> aVar) {
        return isAssignableFrom(aVar.getType());
    }
}
