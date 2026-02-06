package com.fasterxml.jackson.databind.util;

import com.adjust.sdk.Constants;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.annotation.NoClass;
import io.intercom.android.sdk.models.AttributeType;
import java.io.Closeable;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

public final class ClassUtil {
    private static final Class<?> CLS_OBJECT = Object.class;
    private static final EmptyIterator<?> EMPTY_ITERATOR = new EmptyIterator<>();
    private static final Annotation[] NO_ANNOTATIONS = new Annotation[0];
    private static final Ctor[] NO_CTORS = new Ctor[0];

    public static final class Ctor {
        private Annotation[] _annotations;
        public final Constructor<?> _ctor;
        private Annotation[][] _paramAnnotations;
        private int _paramCount = -1;

        public Ctor(Constructor<?> constructor) {
            this._ctor = constructor;
        }

        public Constructor<?> getConstructor() {
            return this._ctor;
        }

        public Annotation[] getDeclaredAnnotations() {
            Annotation[] annotationArr = this._annotations;
            if (annotationArr != null) {
                return annotationArr;
            }
            Annotation[] declaredAnnotations = this._ctor.getDeclaredAnnotations();
            this._annotations = declaredAnnotations;
            return declaredAnnotations;
        }

        public Class<?> getDeclaringClass() {
            return this._ctor.getDeclaringClass();
        }

        public int getParamCount() {
            int i10 = this._paramCount;
            if (i10 >= 0) {
                return i10;
            }
            int length = this._ctor.getParameterTypes().length;
            this._paramCount = length;
            return length;
        }

        public Annotation[][] getParameterAnnotations() {
            Annotation[][] annotationArr = this._paramAnnotations;
            if (annotationArr != null) {
                return annotationArr;
            }
            Annotation[][] parameterAnnotations = this._ctor.getParameterAnnotations();
            this._paramAnnotations = parameterAnnotations;
            return parameterAnnotations;
        }
    }

    private static final class EmptyIterator<T> implements Iterator<T> {
        private EmptyIterator() {
        }

        public boolean hasNext() {
            return false;
        }

        public T next() {
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    private static void _addRawSuperTypes(Class<?> cls, Class<?> cls2, Collection<Class<?>> collection, boolean z10) {
        if (cls != cls2 && cls != null && cls != Object.class) {
            if (z10) {
                if (!collection.contains(cls)) {
                    collection.add(cls);
                } else {
                    return;
                }
            }
            for (Class _addRawSuperTypes : _interfaces(cls)) {
                _addRawSuperTypes(_addRawSuperTypes, cls2, collection, true);
            }
            _addRawSuperTypes(cls.getSuperclass(), cls2, collection, true);
        }
    }

    private static void _addSuperTypes(JavaType javaType, Class<?> cls, Collection<JavaType> collection, boolean z10) {
        Class<?> rawClass;
        if (javaType != null && (rawClass = javaType.getRawClass()) != cls && rawClass != Object.class) {
            if (z10) {
                if (!collection.contains(javaType)) {
                    collection.add(javaType);
                } else {
                    return;
                }
            }
            for (JavaType _addSuperTypes : javaType.getInterfaces()) {
                _addSuperTypes(_addSuperTypes, cls, collection, true);
            }
            _addSuperTypes(javaType.getSuperClass(), cls, collection, true);
        }
    }

    private static Class<?>[] _interfaces(Class<?> cls) {
        return cls.getInterfaces();
    }

    public static String canBeABeanType(Class<?> cls) {
        if (cls.isAnnotation()) {
            return "annotation";
        }
        if (cls.isArray()) {
            return "array";
        }
        if (cls.isEnum()) {
            return "enum";
        }
        if (cls.isPrimitive()) {
            return "primitive";
        }
        return null;
    }

    @Deprecated
    public static void checkAndFixAccess(Member member) {
        checkAndFixAccess(member, false);
    }

    public static void closeOnFailAndThrowAsIAE(JsonGenerator jsonGenerator, Exception exc) {
        jsonGenerator.disable(JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT);
        try {
            jsonGenerator.close();
        } catch (Exception e10) {
            exc.addSuppressed(e10);
        }
        if (exc instanceof IOException) {
            throw ((IOException) exc);
        } else if (exc instanceof RuntimeException) {
            throw ((RuntimeException) exc);
        } else {
            throw new RuntimeException(exc);
        }
    }

    public static <T> T createInstance(Class<T> cls, boolean z10) {
        Constructor<T> findConstructor = findConstructor(cls, z10);
        if (findConstructor != null) {
            try {
                return findConstructor.newInstance((Object[]) null);
            } catch (Exception e10) {
                unwrapAndThrowAsIAE(e10, "Failed to instantiate class " + cls.getName() + ", problem: " + e10.getMessage());
                return null;
            }
        } else {
            throw new IllegalArgumentException("Class " + cls.getName() + " has no default (no arg) constructor");
        }
    }

    public static Object defaultValue(Class<?> cls) {
        if (cls == Integer.TYPE) {
            return 0;
        }
        if (cls == Long.TYPE) {
            return 0L;
        }
        if (cls == Boolean.TYPE) {
            return Boolean.FALSE;
        }
        if (cls == Double.TYPE) {
            return Double.valueOf(0.0d);
        }
        if (cls == Float.TYPE) {
            return Float.valueOf(0.0f);
        }
        if (cls == Byte.TYPE) {
            return (byte) 0;
        }
        if (cls == Short.TYPE) {
            return (short) 0;
        }
        if (cls == Character.TYPE) {
            return 0;
        }
        throw new IllegalArgumentException("Class " + cls.getName() + " is not a primitive type");
    }

    public static <T> Iterator<T> emptyIterator() {
        return EMPTY_ITERATOR;
    }

    @Deprecated
    public static Class<?> findClass(String str) {
        Throwable th2;
        if (str.indexOf(46) < 0) {
            if ("int".equals(str)) {
                return Integer.TYPE;
            }
            if (Constants.LONG.equals(str)) {
                return Long.TYPE;
            }
            if (AttributeType.FLOAT.equals(str)) {
                return Float.TYPE;
            }
            if ("double".equals(str)) {
                return Double.TYPE;
            }
            if (AttributeType.BOOLEAN.equals(str)) {
                return Boolean.TYPE;
            }
            if ("byte".equals(str)) {
                return Byte.TYPE;
            }
            if ("char".equals(str)) {
                return Character.TYPE;
            }
            if ("short".equals(str)) {
                return Short.TYPE;
            }
            if ("void".equals(str)) {
                return Void.TYPE;
            }
        }
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        if (contextClassLoader != null) {
            try {
                return Class.forName(str, true, contextClassLoader);
            } catch (Exception e10) {
                th2 = getRootCause(e10);
            }
        } else {
            th2 = null;
            try {
                return Class.forName(str);
            } catch (Exception e11) {
                if (th2 == null) {
                    th2 = getRootCause(e11);
                }
                if (th2 instanceof RuntimeException) {
                    throw ((RuntimeException) th2);
                }
                throw new ClassNotFoundException(th2.getMessage(), th2);
            }
        }
    }

    public static Annotation[] findClassAnnotations(Class<?> cls) {
        if (isObjectOrPrimitive(cls)) {
            return NO_ANNOTATIONS;
        }
        return cls.getDeclaredAnnotations();
    }

    public static <T> Constructor<T> findConstructor(Class<T> cls, boolean z10) {
        try {
            Constructor<T> declaredConstructor = cls.getDeclaredConstructor((Class[]) null);
            if (z10) {
                checkAndFixAccess(declaredConstructor);
            } else if (!Modifier.isPublic(declaredConstructor.getModifiers())) {
                throw new IllegalArgumentException("Default constructor for " + cls.getName() + " is not accessible (non-public?): not allowed to try modify access via Reflection: can not instantiate type");
            }
            return declaredConstructor;
        } catch (NoSuchMethodException unused) {
            return null;
        } catch (Exception e10) {
            unwrapAndThrowAsIAE(e10, "Failed to find default constructor of class " + cls.getName() + ", problem: " + e10.getMessage());
            return null;
        }
    }

    public static Class<? extends Enum<?>> findEnumType(EnumSet<?> enumSet) {
        if (!enumSet.isEmpty()) {
            return findEnumType((Enum<?>) (Enum) enumSet.iterator().next());
        }
        return EnumTypeLocator.instance.enumTypeFor(enumSet);
    }

    public static <T extends Annotation> Enum<?> findFirstAnnotatedEnumValue(Class<Enum<?>> cls, Class<T> cls2) {
        for (Field field : getDeclaredFields(cls)) {
            if (field.isEnumConstant() && field.getAnnotation(cls2) != null) {
                String name = field.getName();
                for (Enum<?> enumR : (Enum[]) cls.getEnumConstants()) {
                    if (name.equals(enumR.name())) {
                        return enumR;
                    }
                }
                continue;
            }
        }
        return null;
    }

    public static List<Class<?>> findRawSuperTypes(Class<?> cls, Class<?> cls2, boolean z10) {
        if (cls == null || cls == cls2 || cls == Object.class) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(8);
        _addRawSuperTypes(cls, cls2, arrayList, z10);
        return arrayList;
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.lang.Class<?>, code=java.lang.Class, for r1v0, types: [java.lang.Class<?>, java.lang.Object] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List<java.lang.Class<?>> findSuperClasses(java.lang.Class r1, java.lang.Class<?> r2, boolean r3) {
        /*
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            if (r1 == 0) goto L_0x001b
            if (r1 == r2) goto L_0x001b
            if (r3 == 0) goto L_0x000e
            r0.add(r1)
        L_0x000e:
            java.lang.Class r1 = r1.getSuperclass()
            if (r1 == 0) goto L_0x001b
            if (r1 != r2) goto L_0x0017
            goto L_0x001b
        L_0x0017:
            r0.add(r1)
            goto L_0x000e
        L_0x001b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.util.ClassUtil.findSuperClasses(java.lang.Class, java.lang.Class, boolean):java.util.List");
    }

    public static List<JavaType> findSuperTypes(JavaType javaType, Class<?> cls, boolean z10) {
        if (javaType == null || javaType.hasRawClass(cls) || javaType.hasRawClass(Object.class)) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(8);
        _addSuperTypes(javaType, cls, arrayList, z10);
        return arrayList;
    }

    public static String getClassDescription(Object obj) {
        Class<?> cls;
        if (obj == null) {
            return "unknown";
        }
        if (obj instanceof Class) {
            cls = (Class) obj;
        } else {
            cls = obj.getClass();
        }
        return cls.getName();
    }

    public static Ctor[] getConstructors(Class<?> cls) {
        if (cls.isInterface() || isObjectOrPrimitive(cls)) {
            return NO_CTORS;
        }
        Constructor[] declaredConstructors = cls.getDeclaredConstructors();
        int length = declaredConstructors.length;
        Ctor[] ctorArr = new Ctor[length];
        for (int i10 = 0; i10 < length; i10++) {
            ctorArr[i10] = new Ctor(declaredConstructors[i10]);
        }
        return ctorArr;
    }

    public static Field[] getDeclaredFields(Class<?> cls) {
        return cls.getDeclaredFields();
    }

    public static Method[] getDeclaredMethods(Class<?> cls) {
        return cls.getDeclaredMethods();
    }

    public static Class<?> getDeclaringClass(Class<?> cls) {
        if (isObjectOrPrimitive(cls)) {
            return null;
        }
        return cls.getDeclaringClass();
    }

    public static Class<?> getEnclosingClass(Class<?> cls) {
        if (isObjectOrPrimitive(cls)) {
            return null;
        }
        return cls.getEnclosingClass();
    }

    public static Type[] getGenericInterfaces(Class<?> cls) {
        return cls.getGenericInterfaces();
    }

    public static Type getGenericSuperclass(Class<?> cls) {
        return cls.getGenericSuperclass();
    }

    public static Class<?> getOuterClass(Class<?> cls) {
        try {
            if (!hasEnclosingMethod(cls) && !Modifier.isStatic(cls.getModifiers())) {
                return getEnclosingClass(cls);
            }
        } catch (SecurityException unused) {
        }
        return null;
    }

    public static String getPackageName(Class<?> cls) {
        Package packageR = cls.getPackage();
        if (packageR == null) {
            return null;
        }
        return packageR.getName();
    }

    public static Throwable getRootCause(Throwable th2) {
        while (th2.getCause() != null) {
            th2 = th2.getCause();
        }
        return th2;
    }

    public static boolean hasEnclosingMethod(Class<?> cls) {
        if (isObjectOrPrimitive(cls) || cls.getEnclosingMethod() == null) {
            return false;
        }
        return true;
    }

    @Deprecated
    public static boolean hasGetterSignature(Method method) {
        if (Modifier.isStatic(method.getModifiers())) {
            return false;
        }
        Class[] parameterTypes = method.getParameterTypes();
        if ((parameterTypes == null || parameterTypes.length == 0) && Void.TYPE != method.getReturnType()) {
            return true;
        }
        return false;
    }

    public static boolean isBogusClass(Class<?> cls) {
        if (cls == Void.class || cls == Void.TYPE || cls == NoClass.class) {
            return true;
        }
        return false;
    }

    public static boolean isCollectionMapOrArray(Class<?> cls) {
        if (!cls.isArray() && !Collection.class.isAssignableFrom(cls) && !Map.class.isAssignableFrom(cls)) {
            return false;
        }
        return true;
    }

    public static boolean isConcrete(Class<?> cls) {
        return (cls.getModifiers() & 1536) == 0;
    }

    public static boolean isJacksonStdImpl(Object obj) {
        return obj != null && isJacksonStdImpl(obj.getClass());
    }

    public static String isLocalType(Class<?> cls, boolean z10) {
        try {
            if (hasEnclosingMethod(cls)) {
                return "local/anonymous";
            }
            if (z10 || Modifier.isStatic(cls.getModifiers()) || getEnclosingClass(cls) == null) {
                return null;
            }
            return "non-static member class";
        } catch (NullPointerException | SecurityException unused) {
            return null;
        }
    }

    public static boolean isNonStaticInnerClass(Class<?> cls) {
        if (Modifier.isStatic(cls.getModifiers()) || getEnclosingClass(cls) == null) {
            return false;
        }
        return true;
    }

    public static boolean isObjectOrPrimitive(Class<?> cls) {
        if (cls == CLS_OBJECT || cls.isPrimitive()) {
            return true;
        }
        return false;
    }

    public static boolean isProxyType(Class<?> cls) {
        String name = cls.getName();
        if (name.startsWith("net.sf.cglib.proxy.") || name.startsWith("org.hibernate.proxy.")) {
            return true;
        }
        return false;
    }

    public static Class<?> primitiveType(Class<?> cls) {
        if (cls.isPrimitive()) {
            return cls;
        }
        if (cls == Integer.class) {
            return Integer.TYPE;
        }
        if (cls == Long.class) {
            return Long.TYPE;
        }
        if (cls == Boolean.class) {
            return Boolean.TYPE;
        }
        if (cls == Double.class) {
            return Double.TYPE;
        }
        if (cls == Float.class) {
            return Float.TYPE;
        }
        if (cls == Byte.class) {
            return Byte.TYPE;
        }
        if (cls == Short.class) {
            return Short.TYPE;
        }
        if (cls == Character.class) {
            return Character.TYPE;
        }
        return null;
    }

    public static void throwAsIAE(Throwable th2) {
        throwAsIAE(th2, th2.getMessage());
    }

    public static void throwRootCause(Throwable th2) {
        Throwable rootCause = getRootCause(th2);
        if (rootCause instanceof Exception) {
            throw ((Exception) rootCause);
        }
        throw ((Error) rootCause);
    }

    public static Throwable throwRootCauseIfIOE(Throwable th2) {
        Throwable rootCause = getRootCause(th2);
        if (!(rootCause instanceof IOException)) {
            return rootCause;
        }
        throw ((IOException) rootCause);
    }

    public static void unwrapAndThrowAsIAE(Throwable th2) {
        throwAsIAE(getRootCause(th2));
    }

    public static Class<?> wrapperType(Class<?> cls) {
        if (cls == Integer.TYPE) {
            return Integer.class;
        }
        if (cls == Long.TYPE) {
            return Long.class;
        }
        if (cls == Boolean.TYPE) {
            return Boolean.class;
        }
        if (cls == Double.TYPE) {
            return Double.class;
        }
        if (cls == Float.TYPE) {
            return Float.class;
        }
        if (cls == Byte.TYPE) {
            return Byte.class;
        }
        if (cls == Short.TYPE) {
            return Short.class;
        }
        if (cls == Character.TYPE) {
            return Character.class;
        }
        throw new IllegalArgumentException("Class " + cls.getName() + " is not a primitive type");
    }

    public static void checkAndFixAccess(Member member, boolean z10) {
        AccessibleObject accessibleObject = (AccessibleObject) member;
        if (!z10) {
            try {
                if (Modifier.isPublic(member.getModifiers())) {
                    if (Modifier.isPublic(member.getDeclaringClass().getModifiers())) {
                        return;
                    }
                }
            } catch (SecurityException e10) {
                if (!accessibleObject.isAccessible()) {
                    Class<?> declaringClass = member.getDeclaringClass();
                    throw new IllegalArgumentException("Can not access " + member + " (from class " + declaringClass.getName() + "; failed to set access: " + e10.getMessage());
                }
                return;
            }
        }
        accessibleObject.setAccessible(true);
    }

    public static boolean isConcrete(Member member) {
        return (member.getModifiers() & 1536) == 0;
    }

    public static boolean isJacksonStdImpl(Class<?> cls) {
        return cls.getAnnotation(JacksonStdImpl.class) != null;
    }

    public static void throwAsIAE(Throwable th2, String str) {
        if (th2 instanceof RuntimeException) {
            throw ((RuntimeException) th2);
        } else if (th2 instanceof Error) {
            throw ((Error) th2);
        } else {
            throw new IllegalArgumentException(str, th2);
        }
    }

    public static void unwrapAndThrowAsIAE(Throwable th2, String str) {
        throwAsIAE(getRootCause(th2), str);
    }

    private static class EnumTypeLocator {
        static final EnumTypeLocator instance = new EnumTypeLocator();
        private final Field enumMapTypeField;
        private final Field enumSetTypeField;

        private EnumTypeLocator() {
            Class<Class> cls = Class.class;
            this.enumSetTypeField = locateField(EnumSet.class, "elementType", cls);
            this.enumMapTypeField = locateField(EnumMap.class, "elementType", cls);
        }

        private Object get(Object obj, Field field) {
            try {
                return field.get(obj);
            } catch (Exception e10) {
                throw new IllegalArgumentException(e10);
            }
        }

        private static Field locateField(Class<?> cls, String str, Class<?> cls2) {
            Field field;
            Field[] declaredFields = ClassUtil.getDeclaredFields(cls);
            int length = declaredFields.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    field = null;
                    break;
                }
                field = declaredFields[i10];
                if (str.equals(field.getName()) && field.getType() == cls2) {
                    break;
                }
                i10++;
            }
            if (field == null) {
                for (Field field2 : declaredFields) {
                    if (field2.getType() == cls2) {
                        if (field != null) {
                            return null;
                        }
                        field = field2;
                    }
                }
            }
            if (field != null) {
                try {
                    field.setAccessible(true);
                } catch (Throwable unused) {
                }
            }
            return field;
        }

        public Class<? extends Enum<?>> enumTypeFor(EnumSet<?> enumSet) {
            Field field = this.enumSetTypeField;
            if (field != null) {
                return (Class) get(enumSet, field);
            }
            throw new IllegalStateException("Can not figure out type for EnumSet (odd JDK platform?)");
        }

        public Class<? extends Enum<?>> enumTypeFor(EnumMap<?, ?> enumMap) {
            Field field = this.enumMapTypeField;
            if (field != null) {
                return (Class) get(enumMap, field);
            }
            throw new IllegalStateException("Can not figure out type for EnumMap (odd JDK platform?)");
        }
    }

    public static Class<? extends Enum<?>> findEnumType(EnumMap<?, ?> enumMap) {
        if (!enumMap.isEmpty()) {
            return findEnumType((Enum<?>) (Enum) enumMap.keySet().iterator().next());
        }
        return EnumTypeLocator.instance.enumTypeFor(enumMap);
    }

    @Deprecated
    public static List<Class<?>> findSuperTypes(Class<?> cls, Class<?> cls2) {
        return findSuperTypes(cls, cls2, (List<Class<?>>) new ArrayList(8));
    }

    @Deprecated
    public static List<Class<?>> findSuperTypes(Class<?> cls, Class<?> cls2, List<Class<?>> list) {
        _addRawSuperTypes(cls, cls2, list, false);
        return list;
    }

    public static Class<? extends Enum<?>> findEnumType(Enum<?> enumR) {
        Class<?> cls = enumR.getClass();
        return cls.getSuperclass() != Enum.class ? cls.getSuperclass() : cls;
    }

    public static void closeOnFailAndThrowAsIAE(JsonGenerator jsonGenerator, Closeable closeable, Exception exc) {
        if (jsonGenerator != null) {
            jsonGenerator.disable(JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT);
            try {
                jsonGenerator.close();
            } catch (Exception e10) {
                exc.addSuppressed(e10);
            }
        }
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception e11) {
                exc.addSuppressed(e11);
            }
        }
        if (exc instanceof IOException) {
            throw ((IOException) exc);
        } else if (exc instanceof RuntimeException) {
            throw ((RuntimeException) exc);
        } else {
            throw new RuntimeException(exc);
        }
    }

    public static Class<? extends Enum<?>> findEnumType(Class<?> cls) {
        return cls.getSuperclass() != Enum.class ? cls.getSuperclass() : cls;
    }
}
