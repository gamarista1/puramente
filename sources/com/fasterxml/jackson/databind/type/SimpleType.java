package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.JavaType;
import java.util.Collection;
import java.util.Map;

public class SimpleType extends TypeBase {
    private static final long serialVersionUID = 1;

    protected SimpleType(Class<?> cls) {
        this(cls, TypeBindings.emptyBindings(), (JavaType) null, (JavaType[]) null);
    }

    private static JavaType _buildSuperClass(Class<?> cls, TypeBindings typeBindings) {
        if (cls == null) {
            return null;
        }
        if (cls == Object.class) {
            return TypeFactory.unknownType();
        }
        return new SimpleType(cls, typeBindings, _buildSuperClass(cls.getSuperclass(), typeBindings), (JavaType[]) null, (Object) null, (Object) null, false);
    }

    @Deprecated
    public static SimpleType construct(Class<?> cls) {
        if (Map.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Can not construct SimpleType for a Map (class: " + cls.getName() + ")");
        } else if (Collection.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Can not construct SimpleType for a Collection (class: " + cls.getName() + ")");
        } else if (!cls.isArray()) {
            TypeBindings emptyBindings = TypeBindings.emptyBindings();
            return new SimpleType(cls, emptyBindings, _buildSuperClass(cls.getSuperclass(), emptyBindings), (JavaType[]) null, (Object) null, (Object) null, false);
        } else {
            throw new IllegalArgumentException("Can not construct SimpleType for an array (class: " + cls.getName() + ")");
        }
    }

    public static SimpleType constructUnsafe(Class<?> cls) {
        return new SimpleType(cls, (TypeBindings) null, (JavaType) null, (JavaType[]) null, (Object) null, (Object) null, false);
    }

    /* access modifiers changed from: protected */
    @Deprecated
    public JavaType _narrow(Class<?> cls) {
        Class<?> cls2 = this._class;
        if (cls2 == cls) {
            return this;
        }
        if (!cls2.isAssignableFrom(cls)) {
            return new SimpleType(cls, this._bindings, this, this._superInterfaces, this._valueHandler, this._typeHandler, this._asStatic);
        }
        Class<? super Object> superclass = cls.getSuperclass();
        Class<?> cls3 = this._class;
        if (superclass == cls3) {
            return new SimpleType(cls, this._bindings, this, this._superInterfaces, this._valueHandler, this._typeHandler, this._asStatic);
        } else if (superclass == null || !cls3.isAssignableFrom(superclass)) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            int i10 = 0;
            while (i10 < length) {
                Class<?> cls4 = interfaces[i10];
                Class<?> cls5 = this._class;
                if (cls4 == cls5) {
                    return new SimpleType(cls, this._bindings, (JavaType) null, new JavaType[]{this}, this._valueHandler, this._typeHandler, this._asStatic);
                } else if (cls5.isAssignableFrom(cls4)) {
                    return new SimpleType(cls, this._bindings, (JavaType) null, new JavaType[]{_narrow(cls4)}, this._valueHandler, this._typeHandler, this._asStatic);
                } else {
                    i10++;
                }
            }
            throw new IllegalArgumentException("Internal error: Can not resolve sub-type for Class " + cls.getName() + " to " + this._class.getName());
        } else {
            return new SimpleType(cls, this._bindings, _narrow(superclass), (JavaType[]) null, this._valueHandler, this._typeHandler, this._asStatic);
        }
    }

    /* access modifiers changed from: protected */
    public String buildCanonicalName() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this._class.getName());
        int size = this._bindings.size();
        if (size > 0) {
            sb2.append('<');
            for (int i10 = 0; i10 < size; i10++) {
                JavaType containedType = containedType(i10);
                if (i10 > 0) {
                    sb2.append(',');
                }
                sb2.append(containedType.toCanonical());
            }
            sb2.append('>');
        }
        return sb2.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        SimpleType simpleType = (SimpleType) obj;
        if (simpleType._class != this._class) {
            return false;
        }
        return this._bindings.equals(simpleType._bindings);
    }

    public StringBuilder getErasedSignature(StringBuilder sb2) {
        return TypeBase._classSignature(this._class, sb2, true);
    }

    public StringBuilder getGenericSignature(StringBuilder sb2) {
        TypeBase._classSignature(this._class, sb2, false);
        int size = this._bindings.size();
        if (size > 0) {
            sb2.append('<');
            for (int i10 = 0; i10 < size; i10++) {
                sb2 = containedType(i10).getGenericSignature(sb2);
            }
            sb2.append('>');
        }
        sb2.append(';');
        return sb2;
    }

    public boolean hasContentType() {
        return false;
    }

    public boolean isContainerType() {
        return false;
    }

    public JavaType refine(Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr) {
        return null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(40);
        sb2.append("[simple type, class ");
        sb2.append(buildCanonicalName());
        sb2.append(']');
        return sb2.toString();
    }

    public JavaType withContentType(JavaType javaType) {
        throw new IllegalArgumentException("Simple types have no content types; can not call withContentType()");
    }

    public JavaType withContentTypeHandler(Object obj) {
        throw new IllegalArgumentException("Simple types have no content types; can not call withContenTypeHandler()");
    }

    protected SimpleType(Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr) {
        this(cls, typeBindings, javaType, javaTypeArr, (Object) null, (Object) null, false);
    }

    public SimpleType withContentValueHandler(Object obj) {
        throw new IllegalArgumentException("Simple types have no content types; can not call withContenValueHandler()");
    }

    public SimpleType withStaticTyping() {
        return this._asStatic ? this : new SimpleType(this._class, this._bindings, this._superClass, this._superInterfaces, this._valueHandler, this._typeHandler, true);
    }

    public SimpleType withTypeHandler(Object obj) {
        if (this._typeHandler == obj) {
            return this;
        }
        return new SimpleType(this._class, this._bindings, this._superClass, this._superInterfaces, this._valueHandler, obj, this._asStatic);
    }

    public SimpleType withValueHandler(Object obj) {
        if (obj == this._valueHandler) {
            return this;
        }
        return new SimpleType(this._class, this._bindings, this._superClass, this._superInterfaces, obj, this._typeHandler, this._asStatic);
    }

    protected SimpleType(TypeBase typeBase) {
        super(typeBase);
    }

    protected SimpleType(Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr, Object obj, Object obj2, boolean z10) {
        super(cls, typeBindings, javaType, javaTypeArr, 0, obj, obj2, z10);
    }

    protected SimpleType(Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr, int i10, Object obj, Object obj2, boolean z10) {
        super(cls, typeBindings, javaType, javaTypeArr, i10, obj, obj2, z10);
    }
}
