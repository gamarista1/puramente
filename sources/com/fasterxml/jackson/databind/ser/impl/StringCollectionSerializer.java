package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonArrayFormatVisitor;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.std.StaticListSerializerBase;
import java.util.Collection;

@JacksonStdImpl
public class StringCollectionSerializer extends StaticListSerializerBase<Collection<String>> {
    public static final StringCollectionSerializer instance = new StringCollectionSerializer();

    protected StringCollectionSerializer() {
        super(Collection.class);
    }

    private final void _serializeUnwrapped(Collection<String> collection, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        if (this._serializer == null) {
            serializeContents(collection, jsonGenerator, serializerProvider);
        } else {
            serializeUsingCustom(collection, jsonGenerator, serializerProvider);
        }
    }

    private final void serializeContents(Collection<String> collection, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        if (this._serializer != null) {
            serializeUsingCustom(collection, jsonGenerator, serializerProvider);
            return;
        }
        int i10 = 0;
        for (String next : collection) {
            if (next == null) {
                try {
                    serializerProvider.defaultSerializeNull(jsonGenerator);
                } catch (Exception e10) {
                    wrapAndThrow(serializerProvider, (Throwable) e10, (Object) collection, i10);
                }
            } else {
                jsonGenerator.writeString(next);
            }
            i10++;
        }
    }

    private void serializeUsingCustom(Collection<String> collection, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        JsonSerializer<String> jsonSerializer = this._serializer;
        for (String next : collection) {
            if (next == null) {
                try {
                    serializerProvider.defaultSerializeNull(jsonGenerator);
                } catch (Exception e10) {
                    wrapAndThrow(serializerProvider, (Throwable) e10, (Object) collection, 0);
                }
            } else {
                jsonSerializer.serialize(next, jsonGenerator, serializerProvider);
            }
        }
    }

    public JsonSerializer<?> _withResolved(BeanProperty beanProperty, JsonSerializer<?> jsonSerializer, Boolean bool) {
        return new StringCollectionSerializer(this, jsonSerializer, bool);
    }

    /* access modifiers changed from: protected */
    public void acceptContentVisitor(JsonArrayFormatVisitor jsonArrayFormatVisitor) {
        jsonArrayFormatVisitor.itemsFormat(JsonFormatTypes.STRING);
    }

    /* access modifiers changed from: protected */
    public JsonNode contentSchema() {
        return createSchemaNode("string", true);
    }

    protected StringCollectionSerializer(StringCollectionSerializer stringCollectionSerializer, JsonSerializer<?> jsonSerializer, Boolean bool) {
        super(stringCollectionSerializer, jsonSerializer, bool);
    }

    public void serialize(Collection<String> collection, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        int size = collection.size();
        if (size != 1 || ((this._unwrapSingle != null || !serializerProvider.isEnabled(SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED)) && this._unwrapSingle != Boolean.TRUE)) {
            jsonGenerator.writeStartArray(size);
            if (this._serializer == null) {
                serializeContents(collection, jsonGenerator, serializerProvider);
            } else {
                serializeUsingCustom(collection, jsonGenerator, serializerProvider);
            }
            jsonGenerator.writeEndArray();
            return;
        }
        _serializeUnwrapped(collection, jsonGenerator, serializerProvider);
    }

    public void serializeWithType(Collection<String> collection, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) {
        typeSerializer.writeTypePrefixForArray(collection, jsonGenerator);
        if (this._serializer == null) {
            serializeContents(collection, jsonGenerator, serializerProvider);
        } else {
            serializeUsingCustom(collection, jsonGenerator, serializerProvider);
        }
        typeSerializer.writeTypeSuffixForArray(collection, jsonGenerator);
    }
}
