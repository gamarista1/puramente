package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitable;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.PropertyWriter;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.util.Iterator;

public abstract class JsonSerializer<T> implements JsonFormatVisitable {

    public static abstract class None extends JsonSerializer<Object> {
    }

    public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonFormatVisitorWrapper, JavaType javaType) {
        if (jsonFormatVisitorWrapper != null) {
            jsonFormatVisitorWrapper.expectAnyFormat(javaType);
        }
    }

    public JsonSerializer<?> getDelegatee() {
        return null;
    }

    public Class<T> handledType() {
        return null;
    }

    public boolean isEmpty(SerializerProvider serializerProvider, T t10) {
        return t10 == null;
    }

    public boolean isUnwrappingSerializer() {
        return false;
    }

    public Iterator<PropertyWriter> properties() {
        return ClassUtil.emptyIterator();
    }

    public JsonSerializer<T> replaceDelegatee(JsonSerializer<?> jsonSerializer) {
        throw new UnsupportedOperationException();
    }

    public abstract void serialize(T t10, JsonGenerator jsonGenerator, SerializerProvider serializerProvider);

    public void serializeWithType(T t10, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) {
        Class<?> handledType = handledType();
        if (handledType == null) {
            handledType = t10.getClass();
        }
        serializerProvider.reportMappingProblem("Type id handling not implemented for type %s (by serializer of type %s)", handledType.getName(), getClass().getName());
    }

    public JsonSerializer<T> unwrappingSerializer(NameTransformer nameTransformer) {
        return this;
    }

    public boolean usesObjectId() {
        return false;
    }

    public JsonSerializer<?> withFilterId(Object obj) {
        return this;
    }

    @Deprecated
    public boolean isEmpty(T t10) {
        return isEmpty((SerializerProvider) null, t10);
    }
}
