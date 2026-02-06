package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import java.lang.reflect.Type;
import java.util.Date;

@Deprecated
public class StdKeySerializer extends StdSerializer<Object> {
    public StdKeySerializer() {
        super(Object.class);
    }

    public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonFormatVisitorWrapper, JavaType javaType) {
        visitStringFormat(jsonFormatVisitorWrapper, javaType);
    }

    public JsonNode getSchema(SerializerProvider serializerProvider, Type type) {
        return createSchemaNode("string");
    }

    public void serialize(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        String str;
        Class<?> cls = obj.getClass();
        if (cls == String.class) {
            str = (String) obj;
        } else if (cls.isEnum()) {
            SerializationFeature serializationFeature = SerializationFeature.WRITE_ENUMS_USING_TO_STRING;
            if (serializerProvider.isEnabled(serializationFeature)) {
                str = obj.toString();
            } else {
                Enum enumR = (Enum) obj;
                if (serializerProvider.isEnabled(serializationFeature)) {
                    str = String.valueOf(enumR.ordinal());
                } else {
                    str = enumR.name();
                }
            }
        } else if (obj instanceof Date) {
            serializerProvider.defaultSerializeDateKey((Date) obj, jsonGenerator);
            return;
        } else if (cls == Class.class) {
            str = ((Class) obj).getName();
        } else {
            str = obj.toString();
        }
        jsonGenerator.writeFieldName(str);
    }
}
