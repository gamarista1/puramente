package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdResolver;
import com.fasterxml.jackson.annotation.SimpleObjectIdResolver;
import com.fasterxml.jackson.databind.PropertyName;

public class ObjectIdInfo {
    private static final ObjectIdInfo EMPTY = new ObjectIdInfo(PropertyName.NO_NAME, Object.class, (Class<? extends ObjectIdGenerator<?>>) null, false, (Class<? extends ObjectIdResolver>) null);
    protected final boolean _alwaysAsId;
    protected final Class<? extends ObjectIdGenerator<?>> _generator;
    protected final PropertyName _propertyName;
    protected final Class<? extends ObjectIdResolver> _resolver;
    protected final Class<?> _scope;

    public ObjectIdInfo(PropertyName propertyName, Class<?> cls, Class<? extends ObjectIdGenerator<?>> cls2, Class<? extends ObjectIdResolver> cls3) {
        this(propertyName, cls, cls2, false, cls3);
    }

    public static ObjectIdInfo empty() {
        return EMPTY;
    }

    public boolean getAlwaysAsId() {
        return this._alwaysAsId;
    }

    public Class<? extends ObjectIdGenerator<?>> getGeneratorType() {
        return this._generator;
    }

    public PropertyName getPropertyName() {
        return this._propertyName;
    }

    public Class<? extends ObjectIdResolver> getResolverType() {
        return this._resolver;
    }

    public Class<?> getScope() {
        return this._scope;
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ObjectIdInfo: propName=");
        sb2.append(this._propertyName);
        sb2.append(", scope=");
        Class<?> cls = this._scope;
        String str2 = "null";
        if (cls == null) {
            str = str2;
        } else {
            str = cls.getName();
        }
        sb2.append(str);
        sb2.append(", generatorType=");
        Class<? extends ObjectIdGenerator<?>> cls2 = this._generator;
        if (cls2 != null) {
            str2 = cls2.getName();
        }
        sb2.append(str2);
        sb2.append(", alwaysAsId=");
        sb2.append(this._alwaysAsId);
        return sb2.toString();
    }

    public ObjectIdInfo withAlwaysAsId(boolean z10) {
        if (this._alwaysAsId == z10) {
            return this;
        }
        return new ObjectIdInfo(this._propertyName, this._scope, this._generator, z10, this._resolver);
    }

    @Deprecated
    public ObjectIdInfo(PropertyName propertyName, Class<?> cls, Class<? extends ObjectIdGenerator<?>> cls2) {
        this(propertyName, cls, cls2, false);
    }

    @Deprecated
    public ObjectIdInfo(String str, Class<?> cls, Class<? extends ObjectIdGenerator<?>> cls2) {
        this(new PropertyName(str), cls, cls2, false);
    }

    protected ObjectIdInfo(PropertyName propertyName, Class<?> cls, Class<? extends ObjectIdGenerator<?>> cls2, boolean z10) {
        this(propertyName, cls, cls2, z10, SimpleObjectIdResolver.class);
    }

    protected ObjectIdInfo(PropertyName propertyName, Class<?> cls, Class<? extends ObjectIdGenerator<?>> cls2, boolean z10, Class<? extends ObjectIdResolver> cls3) {
        this._propertyName = propertyName;
        this._scope = cls;
        this._generator = cls2;
        this._alwaysAsId = z10;
        this._resolver = cls3 == null ? SimpleObjectIdResolver.class : cls3;
    }
}
