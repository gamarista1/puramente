package com.fasterxml.jackson.databind.node;

import com.amazon.a.a.o.b;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.SerializerProvider;

public class BooleanNode extends ValueNode {
    public static final BooleanNode FALSE = new BooleanNode(false);
    public static final BooleanNode TRUE = new BooleanNode(true);
    private final boolean _value;

    private BooleanNode(boolean z10) {
        this._value = z10;
    }

    public static BooleanNode getFalse() {
        return FALSE;
    }

    public static BooleanNode getTrue() {
        return TRUE;
    }

    public static BooleanNode valueOf(boolean z10) {
        if (z10) {
            return TRUE;
        }
        return FALSE;
    }

    public boolean asBoolean() {
        return this._value;
    }

    public double asDouble(double d10) {
        if (this._value) {
            return 1.0d;
        }
        return 0.0d;
    }

    public int asInt(int i10) {
        return this._value ? 1 : 0;
    }

    public long asLong(long j10) {
        if (this._value) {
            return 1;
        }
        return 0;
    }

    public String asText() {
        if (this._value) {
            return b.f37475af;
        }
        return b.f37476ag;
    }

    public JsonToken asToken() {
        if (this._value) {
            return JsonToken.VALUE_TRUE;
        }
        return JsonToken.VALUE_FALSE;
    }

    public boolean booleanValue() {
        return this._value;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof BooleanNode)) {
            return false;
        }
        if (this._value == ((BooleanNode) obj)._value) {
            return true;
        }
        return false;
    }

    public JsonNodeType getNodeType() {
        return JsonNodeType.BOOLEAN;
    }

    public int hashCode() {
        if (this._value) {
            return 3;
        }
        return 1;
    }

    public final void serialize(JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        jsonGenerator.writeBoolean(this._value);
    }

    public boolean asBoolean(boolean z10) {
        return this._value;
    }
}
