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
import java.util.List;

@JacksonStdImpl
public final class IndexedStringListSerializer extends StaticListSerializerBase<List<String>> {
    public static final IndexedStringListSerializer instance = new IndexedStringListSerializer();
    private static final long serialVersionUID = 1;

    protected IndexedStringListSerializer() {
        super(List.class);
    }

    private final void _serializeUnwrapped(List<String> list, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        if (this._serializer == null) {
            serializeContents(list, jsonGenerator, serializerProvider, 1);
        } else {
            serializeUsingCustom(list, jsonGenerator, serializerProvider, 1);
        }
    }

    private final void serializeContents(List<String> list, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, int i10) {
        int i11 = 0;
        while (i11 < i10) {
            try {
                String str = list.get(i11);
                if (str == null) {
                    serializerProvider.defaultSerializeNull(jsonGenerator);
                } else {
                    jsonGenerator.writeString(str);
                }
                i11++;
            } catch (Exception e10) {
                wrapAndThrow(serializerProvider, (Throwable) e10, (Object) list, i11);
                return;
            }
        }
    }

    private final void serializeUsingCustom(List<String> list, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, int i10) {
        try {
            JsonSerializer<String> jsonSerializer = this._serializer;
            for (int i11 = 0; i11 < i10; i11++) {
                String str = list.get(i11);
                if (str == null) {
                    serializerProvider.defaultSerializeNull(jsonGenerator);
                } else {
                    jsonSerializer.serialize(str, jsonGenerator, serializerProvider);
                }
            }
        } catch (Exception e10) {
            wrapAndThrow(serializerProvider, (Throwable) e10, (Object) list, 0);
        }
    }

    public JsonSerializer<?> _withResolved(BeanProperty beanProperty, JsonSerializer<?> jsonSerializer, Boolean bool) {
        return new IndexedStringListSerializer(this, jsonSerializer, bool);
    }

    /* access modifiers changed from: protected */
    public void acceptContentVisitor(JsonArrayFormatVisitor jsonArrayFormatVisitor) {
        jsonArrayFormatVisitor.itemsFormat(JsonFormatTypes.STRING);
    }

    /* access modifiers changed from: protected */
    public JsonNode contentSchema() {
        return createSchemaNode("string", true);
    }

    public IndexedStringListSerializer(IndexedStringListSerializer indexedStringListSerializer, JsonSerializer<?> jsonSerializer, Boolean bool) {
        super(indexedStringListSerializer, jsonSerializer, bool);
    }

    public void serialize(List<String> list, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        int size = list.size();
        if (size != 1 || ((this._unwrapSingle != null || !serializerProvider.isEnabled(SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED)) && this._unwrapSingle != Boolean.TRUE)) {
            jsonGenerator.writeStartArray(size);
            if (this._serializer == null) {
                serializeContents(list, jsonGenerator, serializerProvider, size);
            } else {
                serializeUsingCustom(list, jsonGenerator, serializerProvider, size);
            }
            jsonGenerator.writeEndArray();
            return;
        }
        _serializeUnwrapped(list, jsonGenerator, serializerProvider);
    }

    public void serializeWithType(List<String> list, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) {
        int size = list.size();
        typeSerializer.writeTypePrefixForArray(list, jsonGenerator);
        if (this._serializer == null) {
            serializeContents(list, jsonGenerator, serializerProvider, size);
        } else {
            serializeUsingCustom(list, jsonGenerator, serializerProvider, size);
        }
        typeSerializer.writeTypeSuffixForArray(list, jsonGenerator);
    }
}
