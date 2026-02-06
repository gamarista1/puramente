package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import io.intercom.android.sdk.models.AttributeType;
import java.lang.reflect.Type;

@JacksonStdImpl
public final class BooleanSerializer extends NonTypedScalarSerializerBase<Boolean> {
    private static final long serialVersionUID = 1;
    protected final boolean _forPrimitive;

    public BooleanSerializer(boolean z10) {
        super(Boolean.class);
        this._forPrimitive = z10;
    }

    public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonFormatVisitorWrapper, JavaType javaType) {
        if (jsonFormatVisitorWrapper != null) {
            jsonFormatVisitorWrapper.expectBooleanFormat(javaType);
        }
    }

    public JsonNode getSchema(SerializerProvider serializerProvider, Type type) {
        return createSchemaNode(AttributeType.BOOLEAN, !this._forPrimitive);
    }

    public void serialize(Boolean bool, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        jsonGenerator.writeBoolean(bool.booleanValue());
    }
}
