package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

public final class AnnotatedMethod extends AnnotatedWithParams implements Serializable {
    private static final long serialVersionUID = 1;
    protected final transient Method _method;
    protected Class<?>[] _paramClasses;
    protected Serialization _serialization;

    private static final class Serialization implements Serializable {
        private static final long serialVersionUID = 1;
        protected Class<?>[] args;
        protected Class<?> clazz;
        protected String name;

        public Serialization(Method method) {
            this.clazz = method.getDeclaringClass();
            this.name = method.getName();
            this.args = method.getParameterTypes();
        }
    }

    public AnnotatedMethod(TypeResolutionContext typeResolutionContext, Method method, AnnotationMap annotationMap, AnnotationMap[] annotationMapArr) {
        super(typeResolutionContext, annotationMap, annotationMapArr);
        if (method != null) {
            this._method = method;
            return;
        }
        throw new IllegalArgumentException("Can not construct AnnotatedMethod with null Method");
    }

    public final Object call() {
        return this._method.invoke((Object) null, (Object[]) null);
    }

    public final Object call1(Object obj) {
        return this._method.invoke((Object) null, new Object[]{obj});
    }

    public final Object callOn(Object obj) {
        return this._method.invoke(obj, (Object[]) null);
    }

    public final Object callOnWith(Object obj, Object... objArr) {
        return this._method.invoke(obj, objArr);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != AnnotatedMethod.class) {
            return false;
        }
        if (((AnnotatedMethod) obj)._method == this._method) {
            return true;
        }
        return false;
    }

    public Class<?> getDeclaringClass() {
        return this._method.getDeclaringClass();
    }

    public String getFullName() {
        return getDeclaringClass().getName() + "#" + getName() + "(" + getParameterCount() + " params)";
    }

    @Deprecated
    public Type getGenericParameterType(int i10) {
        Type[] genericParameterTypes = getGenericParameterTypes();
        if (i10 >= genericParameterTypes.length) {
            return null;
        }
        return genericParameterTypes[i10];
    }

    @Deprecated
    public Type[] getGenericParameterTypes() {
        return this._method.getGenericParameterTypes();
    }

    @Deprecated
    public Type getGenericType() {
        return this._method.getGenericReturnType();
    }

    public int getModifiers() {
        return this._method.getModifiers();
    }

    public String getName() {
        return this._method.getName();
    }

    public int getParameterCount() {
        return getRawParameterTypes().length;
    }

    public JavaType getParameterType(int i10) {
        Type[] genericParameterTypes = this._method.getGenericParameterTypes();
        if (i10 >= genericParameterTypes.length) {
            return null;
        }
        return this._typeContext.resolveType(genericParameterTypes[i10]);
    }

    public Class<?> getRawParameterType(int i10) {
        Class<?>[] rawParameterTypes = getRawParameterTypes();
        if (i10 >= rawParameterTypes.length) {
            return null;
        }
        return rawParameterTypes[i10];
    }

    public Class<?>[] getRawParameterTypes() {
        if (this._paramClasses == null) {
            this._paramClasses = this._method.getParameterTypes();
        }
        return this._paramClasses;
    }

    public Class<?> getRawReturnType() {
        return this._method.getReturnType();
    }

    public Class<?> getRawType() {
        return this._method.getReturnType();
    }

    public JavaType getType() {
        return this._typeContext.resolveType(this._method.getGenericReturnType());
    }

    public Object getValue(Object obj) {
        try {
            return this._method.invoke(obj, (Object[]) null);
        } catch (IllegalAccessException e10) {
            throw new IllegalArgumentException("Failed to getValue() with method " + getFullName() + ": " + e10.getMessage(), e10);
        } catch (InvocationTargetException e11) {
            throw new IllegalArgumentException("Failed to getValue() with method " + getFullName() + ": " + e11.getMessage(), e11);
        }
    }

    public boolean hasReturnType() {
        Class<?> rawReturnType = getRawReturnType();
        if (rawReturnType == Void.TYPE || rawReturnType == Void.class) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this._method.getName().hashCode();
    }

    /* access modifiers changed from: package-private */
    public Object readResolve() {
        Serialization serialization = this._serialization;
        Class<?> cls = serialization.clazz;
        try {
            Method declaredMethod = cls.getDeclaredMethod(serialization.name, serialization.args);
            if (!declaredMethod.isAccessible()) {
                ClassUtil.checkAndFixAccess(declaredMethod, false);
            }
            return new AnnotatedMethod((TypeResolutionContext) null, declaredMethod, (AnnotationMap) null, (AnnotationMap[]) null);
        } catch (Exception unused) {
            throw new IllegalArgumentException("Could not find method '" + this._serialization.name + "' from Class '" + cls.getName());
        }
    }

    public void setValue(Object obj, Object obj2) {
        try {
            this._method.invoke(obj, new Object[]{obj2});
        } catch (IllegalAccessException e10) {
            throw new IllegalArgumentException("Failed to setValue() with method " + getFullName() + ": " + e10.getMessage(), e10);
        } catch (InvocationTargetException e11) {
            throw new IllegalArgumentException("Failed to setValue() with method " + getFullName() + ": " + e11.getMessage(), e11);
        }
    }

    public String toString() {
        return "[method " + getFullName() + "]";
    }

    public AnnotatedMethod withMethod(Method method) {
        return new AnnotatedMethod(this._typeContext, method, this._annotations, this._paramAnnotations);
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return new AnnotatedMethod(new Serialization(this._method));
    }

    public final Object call(Object[] objArr) {
        return this._method.invoke((Object) null, objArr);
    }

    public Method getAnnotated() {
        return this._method;
    }

    public Method getMember() {
        return this._method;
    }

    public AnnotatedMethod withAnnotations(AnnotationMap annotationMap) {
        return new AnnotatedMethod(this._typeContext, this._method, annotationMap, this._paramAnnotations);
    }

    protected AnnotatedMethod(Serialization serialization) {
        super((TypeResolutionContext) null, (AnnotationMap) null, (AnnotationMap[]) null);
        this._method = null;
        this._serialization = serialization;
    }
}
