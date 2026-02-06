package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

public abstract class ContainerSerializer<T> extends StdSerializer<T> {
    protected ContainerSerializer(Class<T> cls) {
        super(cls);
    }

    /* access modifiers changed from: protected */
    public abstract ContainerSerializer<?> _withValueTypeSerializer(TypeSerializer typeSerializer);

    public abstract JsonSerializer<?> getContentSerializer();

    public abstract JavaType getContentType();

    /* access modifiers changed from: protected */
    @Deprecated
    public boolean hasContentTypeAnnotation(SerializerProvider serializerProvider, BeanProperty beanProperty) {
        return false;
    }

    public abstract boolean hasSingleElement(T t10);

    @Deprecated
    public boolean isEmpty(T t10) {
        return isEmpty((SerializerProvider) null, t10);
    }

    public ContainerSerializer<?> withValueTypeSerializer(TypeSerializer typeSerializer) {
        if (typeSerializer == null) {
            return this;
        }
        return _withValueTypeSerializer(typeSerializer);
    }

    protected ContainerSerializer(JavaType javaType) {
        super(javaType);
    }

    protected ContainerSerializer(Class<?> cls, boolean z10) {
        super(cls, z10);
    }

    protected ContainerSerializer(ContainerSerializer<?> containerSerializer) {
        super(containerSerializer._handledType, false);
    }
}
