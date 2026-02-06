package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.JsonSerializable;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;

public abstract class BaseJsonNode extends JsonNode implements JsonSerializable {
    protected BaseJsonNode() {
    }

    public abstract JsonToken asToken();

    public final JsonNode findPath(String str) {
        JsonNode findValue = findValue(str);
        if (findValue == null) {
            return MissingNode.getInstance();
        }
        return findValue;
    }

    public abstract int hashCode();

    public JsonParser.NumberType numberType() {
        return null;
    }

    public abstract void serialize(JsonGenerator jsonGenerator, SerializerProvider serializerProvider);

    public abstract void serializeWithType(JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer);

    public JsonParser traverse() {
        return new TreeTraversingParser(this);
    }

    public JsonParser traverse(ObjectCodec objectCodec) {
        return new TreeTraversingParser(this, objectCodec);
    }
}
