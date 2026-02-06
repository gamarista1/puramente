package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.JsonSerializable;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.util.RawValue;

public class POJONode extends ValueNode {
    protected final Object _value;

    public POJONode(Object obj) {
        this._value = obj;
    }

    /* access modifiers changed from: protected */
    public boolean _pojoEquals(POJONode pOJONode) {
        Object obj = this._value;
        if (obj != null) {
            return obj.equals(pOJONode._value);
        }
        if (pOJONode._value == null) {
            return true;
        }
        return false;
    }

    public boolean asBoolean(boolean z10) {
        Object obj = this._value;
        if (obj == null || !(obj instanceof Boolean)) {
            return z10;
        }
        return ((Boolean) obj).booleanValue();
    }

    public double asDouble(double d10) {
        Object obj = this._value;
        if (obj instanceof Number) {
            return ((Number) obj).doubleValue();
        }
        return d10;
    }

    public int asInt(int i10) {
        Object obj = this._value;
        if (obj instanceof Number) {
            return ((Number) obj).intValue();
        }
        return i10;
    }

    public long asLong(long j10) {
        Object obj = this._value;
        if (obj instanceof Number) {
            return ((Number) obj).longValue();
        }
        return j10;
    }

    public String asText() {
        Object obj = this._value;
        return obj == null ? "null" : obj.toString();
    }

    public JsonToken asToken() {
        return JsonToken.VALUE_EMBEDDED_OBJECT;
    }

    public byte[] binaryValue() {
        Object obj = this._value;
        if (obj instanceof byte[]) {
            return (byte[]) obj;
        }
        return super.binaryValue();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof POJONode)) {
            return _pojoEquals((POJONode) obj);
        }
        return false;
    }

    public JsonNodeType getNodeType() {
        return JsonNodeType.POJO;
    }

    public Object getPojo() {
        return this._value;
    }

    public int hashCode() {
        return this._value.hashCode();
    }

    public final void serialize(JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        Object obj = this._value;
        if (obj == null) {
            serializerProvider.defaultSerializeNull(jsonGenerator);
        } else if (obj instanceof JsonSerializable) {
            ((JsonSerializable) obj).serialize(jsonGenerator, serializerProvider);
        } else {
            jsonGenerator.writeObject(obj);
        }
    }

    public String toString() {
        Object obj = this._value;
        if (obj instanceof byte[]) {
            return String.format("(binary value of %d bytes)", new Object[]{Integer.valueOf(((byte[]) obj).length)});
        }
        if (obj instanceof RawValue) {
            return String.format("(raw value '%s')", new Object[]{((RawValue) obj).toString()});
        }
        return String.valueOf(obj);
    }

    public String asText(String str) {
        Object obj = this._value;
        return obj == null ? str : obj.toString();
    }
}
