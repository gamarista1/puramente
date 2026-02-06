package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;

public abstract class NonTypedScalarSerializerBase<T> extends StdScalarSerializer<T> {
    protected NonTypedScalarSerializerBase(Class<T> cls) {
        super(cls);
    }

    public final void serializeWithType(T t10, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) {
        serialize(t10, jsonGenerator, serializerProvider);
    }

    protected NonTypedScalarSerializerBase(Class<?> cls, boolean z10) {
        super(cls, z10);
    }
}
