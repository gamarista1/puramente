package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.PropertyName;

public final class ObjectIdWriter {
    public final boolean alwaysAsId;
    public final ObjectIdGenerator<?> generator;
    public final JavaType idType;
    public final SerializableString propertyName;
    public final JsonSerializer<Object> serializer;

    protected ObjectIdWriter(JavaType javaType, SerializableString serializableString, ObjectIdGenerator<?> objectIdGenerator, JsonSerializer<?> jsonSerializer, boolean z10) {
        this.idType = javaType;
        this.propertyName = serializableString;
        this.generator = objectIdGenerator;
        this.serializer = jsonSerializer;
        this.alwaysAsId = z10;
    }

    public static ObjectIdWriter construct(JavaType javaType, PropertyName propertyName2, ObjectIdGenerator<?> objectIdGenerator, boolean z10) {
        return construct(javaType, propertyName2 == null ? null : propertyName2.getSimpleName(), objectIdGenerator, z10);
    }

    public ObjectIdWriter withAlwaysAsId(boolean z10) {
        if (z10 == this.alwaysAsId) {
            return this;
        }
        return new ObjectIdWriter(this.idType, this.propertyName, this.generator, this.serializer, z10);
    }

    public ObjectIdWriter withSerializer(JsonSerializer<?> jsonSerializer) {
        return new ObjectIdWriter(this.idType, this.propertyName, this.generator, jsonSerializer, this.alwaysAsId);
    }

    @Deprecated
    public static ObjectIdWriter construct(JavaType javaType, String str, ObjectIdGenerator<?> objectIdGenerator, boolean z10) {
        return new ObjectIdWriter(javaType, str == null ? null : new SerializedString(str), objectIdGenerator, (JsonSerializer<?>) null, z10);
    }
}
