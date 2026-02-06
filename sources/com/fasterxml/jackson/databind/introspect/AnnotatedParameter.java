package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.JavaType;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Member;
import java.lang.reflect.Type;

public final class AnnotatedParameter extends AnnotatedMember {
    private static final long serialVersionUID = 1;
    protected final int _index;
    protected final AnnotatedWithParams _owner;
    protected final JavaType _type;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnnotatedParameter(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams r2, com.fasterxml.jackson.databind.JavaType r3, com.fasterxml.jackson.databind.introspect.AnnotationMap r4, int r5) {
        /*
            r1 = this;
            if (r2 != 0) goto L_0x0004
            r0 = 0
            goto L_0x0008
        L_0x0004:
            com.fasterxml.jackson.databind.introspect.TypeResolutionContext r0 = r2.getTypeContext()
        L_0x0008:
            r1.<init>(r0, r4)
            r1._owner = r2
            r1._type = r3
            r1._index = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.introspect.AnnotatedParameter.<init>(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams, com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.introspect.AnnotationMap, int):void");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != AnnotatedParameter.class) {
            return false;
        }
        AnnotatedParameter annotatedParameter = (AnnotatedParameter) obj;
        if (!annotatedParameter._owner.equals(this._owner) || annotatedParameter._index != this._index) {
            return false;
        }
        return true;
    }

    public AnnotatedElement getAnnotated() {
        return null;
    }

    public Class<?> getDeclaringClass() {
        return this._owner.getDeclaringClass();
    }

    @Deprecated
    public Type getGenericType() {
        return this._owner.getGenericParameterType(this._index);
    }

    public int getIndex() {
        return this._index;
    }

    public Member getMember() {
        return this._owner.getMember();
    }

    public int getModifiers() {
        return this._owner.getModifiers();
    }

    public String getName() {
        return "";
    }

    public AnnotatedWithParams getOwner() {
        return this._owner;
    }

    public Type getParameterType() {
        return this._type;
    }

    public Class<?> getRawType() {
        return this._type.getRawClass();
    }

    public JavaType getType() {
        return this._type;
    }

    public Object getValue(Object obj) {
        throw new UnsupportedOperationException("Cannot call getValue() on constructor parameter of " + getDeclaringClass().getName());
    }

    public int hashCode() {
        return this._owner.hashCode() + this._index;
    }

    public void setValue(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Cannot call setValue() on constructor parameter of " + getDeclaringClass().getName());
    }

    public String toString() {
        return "[parameter #" + getIndex() + ", annotations: " + this._annotations + "]";
    }

    public AnnotatedParameter withAnnotations(AnnotationMap annotationMap) {
        if (annotationMap == this._annotations) {
            return this;
        }
        return this._owner.replaceParameterAnnotations(this._index, annotationMap);
    }
}
