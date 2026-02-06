package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.math.BigDecimal;
import java.math.BigInteger;

public class FloatNode extends NumericNode {
    protected final float _value;

    public FloatNode(float f10) {
        this._value = f10;
    }

    public static FloatNode valueOf(float f10) {
        return new FloatNode(f10);
    }

    public String asText() {
        return Float.toString(this._value);
    }

    public JsonToken asToken() {
        return JsonToken.VALUE_NUMBER_FLOAT;
    }

    public BigInteger bigIntegerValue() {
        return decimalValue().toBigInteger();
    }

    public boolean canConvertToInt() {
        float f10 = this._value;
        if (f10 < -2.14748365E9f || f10 > 2.14748365E9f) {
            return false;
        }
        return true;
    }

    public boolean canConvertToLong() {
        float f10 = this._value;
        if (f10 < -9.223372E18f || f10 > 9.223372E18f) {
            return false;
        }
        return true;
    }

    public BigDecimal decimalValue() {
        return BigDecimal.valueOf((double) this._value);
    }

    public double doubleValue() {
        return (double) this._value;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof FloatNode)) {
            return false;
        }
        if (Float.compare(this._value, ((FloatNode) obj)._value) == 0) {
            return true;
        }
        return false;
    }

    public float floatValue() {
        return this._value;
    }

    public int hashCode() {
        return Float.floatToIntBits(this._value);
    }

    public int intValue() {
        return (int) this._value;
    }

    public boolean isFloat() {
        return true;
    }

    public boolean isFloatingPointNumber() {
        return true;
    }

    public long longValue() {
        return (long) this._value;
    }

    public JsonParser.NumberType numberType() {
        return JsonParser.NumberType.FLOAT;
    }

    public Number numberValue() {
        return Float.valueOf(this._value);
    }

    public final void serialize(JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        jsonGenerator.writeNumber(this._value);
    }

    public short shortValue() {
        return (short) ((int) this._value);
    }
}
