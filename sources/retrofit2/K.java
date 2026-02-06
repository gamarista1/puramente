package retrofit2;

import Gh.C5404e;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Objects;
import lf.C6514M;
import rh.F;

abstract class K {

    /* renamed from: a  reason: collision with root package name */
    static final Type[] f72868a = new Type[0];

    /* renamed from: b  reason: collision with root package name */
    private static boolean f72869b = true;

    private static final class a implements GenericArrayType {

        /* renamed from: a  reason: collision with root package name */
        private final Type f72870a;

        a(Type type) {
            this.f72870a = type;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof GenericArrayType) || !K.d(this, (GenericArrayType) obj)) {
                return false;
            }
            return true;
        }

        public Type getGenericComponentType() {
            return this.f72870a;
        }

        public int hashCode() {
            return this.f72870a.hashCode();
        }

        public String toString() {
            return K.u(this.f72870a) + "[]";
        }
    }

    static final class b implements ParameterizedType {

        /* renamed from: a  reason: collision with root package name */
        private final Type f72871a;

        /* renamed from: b  reason: collision with root package name */
        private final Type f72872b;

        /* renamed from: c  reason: collision with root package name */
        private final Type[] f72873c;

        b(Type type, Type type2, Type... typeArr) {
            boolean z10;
            if (type2 instanceof Class) {
                boolean z11 = true;
                if (type == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 != (((Class) type2).getEnclosingClass() != null ? false : z11)) {
                    throw new IllegalArgumentException();
                }
            }
            for (Type type3 : typeArr) {
                Objects.requireNonNull(type3, "typeArgument == null");
                K.b(type3);
            }
            this.f72871a = type;
            this.f72872b = type2;
            this.f72873c = (Type[]) typeArr.clone();
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof ParameterizedType) || !K.d(this, (ParameterizedType) obj)) {
                return false;
            }
            return true;
        }

        public Type[] getActualTypeArguments() {
            return (Type[]) this.f72873c.clone();
        }

        public Type getOwnerType() {
            return this.f72871a;
        }

        public Type getRawType() {
            return this.f72872b;
        }

        public int hashCode() {
            int i10;
            int hashCode = Arrays.hashCode(this.f72873c) ^ this.f72872b.hashCode();
            Type type = this.f72871a;
            if (type != null) {
                i10 = type.hashCode();
            } else {
                i10 = 0;
            }
            return hashCode ^ i10;
        }

        public String toString() {
            Type[] typeArr = this.f72873c;
            if (typeArr.length == 0) {
                return K.u(this.f72872b);
            }
            StringBuilder sb2 = new StringBuilder((typeArr.length + 1) * 30);
            sb2.append(K.u(this.f72872b));
            sb2.append("<");
            sb2.append(K.u(this.f72873c[0]));
            for (int i10 = 1; i10 < this.f72873c.length; i10++) {
                sb2.append(", ");
                sb2.append(K.u(this.f72873c[i10]));
            }
            sb2.append(">");
            return sb2.toString();
        }
    }

    private static final class c implements WildcardType {

        /* renamed from: a  reason: collision with root package name */
        private final Type f72874a;

        /* renamed from: b  reason: collision with root package name */
        private final Type f72875b;

        c(Type[] typeArr, Type[] typeArr2) {
            if (typeArr2.length > 1) {
                throw new IllegalArgumentException();
            } else if (typeArr.length != 1) {
                throw new IllegalArgumentException();
            } else if (typeArr2.length == 1) {
                typeArr2[0].getClass();
                K.b(typeArr2[0]);
                Class<Object> cls = Object.class;
                if (typeArr[0] == cls) {
                    this.f72875b = typeArr2[0];
                    this.f72874a = cls;
                    return;
                }
                throw new IllegalArgumentException();
            } else {
                typeArr[0].getClass();
                K.b(typeArr[0]);
                this.f72875b = null;
                this.f72874a = typeArr[0];
            }
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof WildcardType) || !K.d(this, (WildcardType) obj)) {
                return false;
            }
            return true;
        }

        public Type[] getLowerBounds() {
            Type type = this.f72875b;
            if (type == null) {
                return K.f72868a;
            }
            return new Type[]{type};
        }

        public Type[] getUpperBounds() {
            return new Type[]{this.f72874a};
        }

        public int hashCode() {
            int i10;
            Type type = this.f72875b;
            if (type != null) {
                i10 = type.hashCode() + 31;
            } else {
                i10 = 1;
            }
            return i10 ^ (this.f72874a.hashCode() + 31);
        }

        public String toString() {
            if (this.f72875b != null) {
                return "? super " + K.u(this.f72875b);
            } else if (this.f72874a == Object.class) {
                return "?";
            } else {
                return "? extends " + K.u(this.f72874a);
            }
        }
    }

    static F a(F f10) {
        C5404e eVar = new C5404e();
        f10.y().d0(eVar);
        return F.t(f10.q(), f10.o(), eVar);
    }

    static void b(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            throw new IllegalArgumentException();
        }
    }

    private static Class c(TypeVariable typeVariable) {
        GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
        if (genericDeclaration instanceof Class) {
            return (Class) genericDeclaration;
        }
        return null;
    }

    static boolean d(Type type, Type type2) {
        boolean z10;
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            Type ownerType = parameterizedType.getOwnerType();
            Type ownerType2 = parameterizedType2.getOwnerType();
            if (ownerType == ownerType2 || (ownerType != null && ownerType.equals(ownerType2))) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean equals = parameterizedType.getRawType().equals(parameterizedType2.getRawType());
            boolean equals2 = Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
            if (!z10 || !equals || !equals2) {
                return false;
            }
            return true;
        } else if (type instanceof GenericArrayType) {
            if (!(type2 instanceof GenericArrayType)) {
                return false;
            }
            return d(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
        } else if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            if (!Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) || !Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds())) {
                return false;
            }
            return true;
        } else if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        } else {
            TypeVariable typeVariable = (TypeVariable) type;
            TypeVariable typeVariable2 = (TypeVariable) type2;
            if (typeVariable.getGenericDeclaration() != typeVariable2.getGenericDeclaration() || !typeVariable.getName().equals(typeVariable2.getName())) {
                return false;
            }
            return true;
        }
    }

    static Type e(Type type, Class<? super Object> cls, Class cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i10 = 0; i10 < length; i10++) {
                Class cls3 = interfaces[i10];
                if (cls3 == cls2) {
                    return cls.getGenericInterfaces()[i10];
                }
                if (cls2.isAssignableFrom(cls3)) {
                    return e(cls.getGenericInterfaces()[i10], interfaces[i10], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<? super Object> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return e(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    static Type f(int i10, ParameterizedType parameterizedType) {
        Type type = parameterizedType.getActualTypeArguments()[i10];
        if (type instanceof WildcardType) {
            return ((WildcardType) type).getLowerBounds()[0];
        }
        return type;
    }

    static Type g(int i10, ParameterizedType parameterizedType) {
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        if (i10 < 0 || i10 >= actualTypeArguments.length) {
            throw new IllegalArgumentException("Index " + i10 + " not in range [0," + actualTypeArguments.length + ") for " + parameterizedType);
        }
        Type type = actualTypeArguments[i10];
        if (type instanceof WildcardType) {
            return ((WildcardType) type).getUpperBounds()[0];
        }
        return type;
    }

    static Class h(Type type) {
        Objects.requireNonNull(type, "type == null");
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            if (rawType instanceof Class) {
                return (Class) rawType;
            }
            throw new IllegalArgumentException();
        } else if (type instanceof GenericArrayType) {
            return Array.newInstance(h(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        } else {
            if (type instanceof TypeVariable) {
                return Object.class;
            }
            if (type instanceof WildcardType) {
                return h(((WildcardType) type).getUpperBounds()[0]);
            }
            throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + type.getClass().getName());
        }
    }

    static Type i(Type type, Class cls, Class cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return r(type, cls, e(type, cls, cls2));
        }
        throw new IllegalArgumentException();
    }

    static boolean j(Type type) {
        String str;
        if (type instanceof Class) {
            return false;
        }
        if (type instanceof ParameterizedType) {
            for (Type j10 : ((ParameterizedType) type).getActualTypeArguments()) {
                if (j(j10)) {
                    return true;
                }
            }
            return false;
        } else if (type instanceof GenericArrayType) {
            return j(((GenericArrayType) type).getGenericComponentType());
        } else {
            if ((type instanceof TypeVariable) || (type instanceof WildcardType)) {
                return true;
            }
            if (type == null) {
                str = "null";
            } else {
                str = type.getClass().getName();
            }
            throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + str);
        }
    }

    private static int k(Object[] objArr, Object obj) {
        for (int i10 = 0; i10 < objArr.length; i10++) {
            if (obj.equals(objArr[i10])) {
                return i10;
            }
        }
        throw new NoSuchElementException();
    }

    static boolean l(Annotation[] annotationArr, Class cls) {
        for (Annotation isInstance : annotationArr) {
            if (cls.isInstance(isInstance)) {
                return true;
            }
        }
        return false;
    }

    static boolean m(Type type) {
        if (!f72869b || type != C6514M.class) {
            return false;
        }
        return true;
    }

    static RuntimeException n(Method method, String str, Object... objArr) {
        return o(method, (Throwable) null, str, objArr);
    }

    static RuntimeException o(Method method, Throwable th2, String str, Object... objArr) {
        String format = String.format(str, objArr);
        return new IllegalArgumentException(format + "\n    for method " + method.getDeclaringClass().getSimpleName() + "." + method.getName(), th2);
    }

    static RuntimeException p(Method method, int i10, String str, Object... objArr) {
        String a10 = y.f72997b.a(method, i10);
        return n(method, str + " (" + a10 + ")", objArr);
    }

    static RuntimeException q(Method method, Throwable th2, int i10, String str, Object... objArr) {
        String a10 = y.f72997b.a(method, i10);
        return o(method, th2, str + " (" + a10 + ")", objArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.lang.reflect.Type[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v15, resolved type: java.lang.reflect.WildcardType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v16, resolved type: java.lang.reflect.WildcardType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v17, resolved type: java.lang.reflect.WildcardType} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static java.lang.reflect.Type r(java.lang.reflect.Type r8, java.lang.Class r9, java.lang.reflect.Type r10) {
        /*
            r0 = 0
            r1 = 1
        L_0x0002:
            boolean r2 = r10 instanceof java.lang.reflect.TypeVariable
            if (r2 == 0) goto L_0x0011
            java.lang.reflect.TypeVariable r10 = (java.lang.reflect.TypeVariable) r10
            java.lang.reflect.Type r2 = s(r8, r9, r10)
            if (r2 != r10) goto L_0x000f
            return r2
        L_0x000f:
            r10 = r2
            goto L_0x0002
        L_0x0011:
            boolean r2 = r10 instanceof java.lang.Class
            if (r2 == 0) goto L_0x002f
            r2 = r10
            java.lang.Class r2 = (java.lang.Class) r2
            boolean r3 = r2.isArray()
            if (r3 == 0) goto L_0x002f
            java.lang.Class r10 = r2.getComponentType()
            java.lang.reflect.Type r8 = r(r8, r9, r10)
            if (r10 != r8) goto L_0x0029
            goto L_0x002e
        L_0x0029:
            retrofit2.K$a r2 = new retrofit2.K$a
            r2.<init>(r8)
        L_0x002e:
            return r2
        L_0x002f:
            boolean r2 = r10 instanceof java.lang.reflect.GenericArrayType
            if (r2 == 0) goto L_0x0046
            java.lang.reflect.GenericArrayType r10 = (java.lang.reflect.GenericArrayType) r10
            java.lang.reflect.Type r0 = r10.getGenericComponentType()
            java.lang.reflect.Type r8 = r(r8, r9, r0)
            if (r0 != r8) goto L_0x0040
            goto L_0x0045
        L_0x0040:
            retrofit2.K$a r10 = new retrofit2.K$a
            r10.<init>(r8)
        L_0x0045:
            return r10
        L_0x0046:
            boolean r2 = r10 instanceof java.lang.reflect.ParameterizedType
            if (r2 == 0) goto L_0x0085
            java.lang.reflect.ParameterizedType r10 = (java.lang.reflect.ParameterizedType) r10
            java.lang.reflect.Type r2 = r10.getOwnerType()
            java.lang.reflect.Type r3 = r(r8, r9, r2)
            if (r3 == r2) goto L_0x0058
            r2 = r1
            goto L_0x0059
        L_0x0058:
            r2 = r0
        L_0x0059:
            java.lang.reflect.Type[] r4 = r10.getActualTypeArguments()
            int r5 = r4.length
        L_0x005e:
            if (r0 >= r5) goto L_0x0078
            r6 = r4[r0]
            java.lang.reflect.Type r6 = r(r8, r9, r6)
            r7 = r4[r0]
            if (r6 == r7) goto L_0x0076
            if (r2 != 0) goto L_0x0074
            java.lang.Object r2 = r4.clone()
            r4 = r2
            java.lang.reflect.Type[] r4 = (java.lang.reflect.Type[]) r4
            r2 = r1
        L_0x0074:
            r4[r0] = r6
        L_0x0076:
            int r0 = r0 + r1
            goto L_0x005e
        L_0x0078:
            if (r2 == 0) goto L_0x0084
            retrofit2.K$b r8 = new retrofit2.K$b
            java.lang.reflect.Type r9 = r10.getRawType()
            r8.<init>(r3, r9, r4)
            r10 = r8
        L_0x0084:
            return r10
        L_0x0085:
            boolean r2 = r10 instanceof java.lang.reflect.WildcardType
            if (r2 == 0) goto L_0x00c9
            java.lang.reflect.WildcardType r10 = (java.lang.reflect.WildcardType) r10
            java.lang.reflect.Type[] r2 = r10.getLowerBounds()
            java.lang.reflect.Type[] r3 = r10.getUpperBounds()
            int r4 = r2.length
            if (r4 != r1) goto L_0x00b0
            r3 = r2[r0]
            java.lang.reflect.Type r8 = r(r8, r9, r3)
            r9 = r2[r0]
            if (r8 == r9) goto L_0x00c9
            retrofit2.K$c r9 = new retrofit2.K$c
            java.lang.reflect.Type[] r10 = new java.lang.reflect.Type[r1]
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            r10[r0] = r2
            java.lang.reflect.Type[] r1 = new java.lang.reflect.Type[r1]
            r1[r0] = r8
            r9.<init>(r10, r1)
            return r9
        L_0x00b0:
            int r2 = r3.length
            if (r2 != r1) goto L_0x00c9
            r2 = r3[r0]
            java.lang.reflect.Type r8 = r(r8, r9, r2)
            r9 = r3[r0]
            if (r8 == r9) goto L_0x00c9
            retrofit2.K$c r9 = new retrofit2.K$c
            java.lang.reflect.Type[] r10 = new java.lang.reflect.Type[r1]
            r10[r0] = r8
            java.lang.reflect.Type[] r8 = f72868a
            r9.<init>(r10, r8)
            return r9
        L_0x00c9:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: retrofit2.K.r(java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Type):java.lang.reflect.Type");
    }

    private static Type s(Type type, Class cls, TypeVariable typeVariable) {
        Class c10 = c(typeVariable);
        if (c10 == null) {
            return typeVariable;
        }
        Type e10 = e(type, cls, c10);
        if (!(e10 instanceof ParameterizedType)) {
            return typeVariable;
        }
        return ((ParameterizedType) e10).getActualTypeArguments()[k(c10.getTypeParameters(), typeVariable)];
    }

    static void t(Throwable th2) {
        if (th2 instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th2);
        } else if (th2 instanceof ThreadDeath) {
            throw ((ThreadDeath) th2);
        } else if (th2 instanceof LinkageError) {
            throw ((LinkageError) th2);
        }
    }

    static String u(Type type) {
        if (type instanceof Class) {
            return ((Class) type).getName();
        }
        return type.toString();
    }
}
