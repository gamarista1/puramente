package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.io.NumberOutput;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.math.BigDecimal;
import java.math.BigInteger;

public class LongNode extends NumericNode {
    protected final long _value;

    public LongNode(long j10) {
        this._value = j10;
    }

    public static LongNode valueOf(long j10) {
        return new LongNode(j10);
    }

    public boolean asBoolean(boolean z10) {
        if (this._value != 0) {
            return true;
        }
        return false;
    }

    public String asText() {
        return NumberOutput.toString(this._value);
    }

    public JsonToken asToken() {
        return JsonToken.VALUE_NUMBER_INT;
    }

    public BigInteger bigIntegerValue() {
        return BigInteger.valueOf(this._value);
    }

    public boolean canConvertToInt() {
        long j10 = this._value;
        if (j10 < -2147483648L || j10 > 2147483647L) {
            return false;
        }
        return true;
    }

    public boolean canConvertToLong() {
        return true;
    }

    public BigDecimal decimalValue() {
        return BigDecimal.valueOf(this._value);
    }

    public double doubleValue() {
        return (double) this._value;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof LongNode)) {
            return false;
        }
        if (((LongNode) obj)._value == this._value) {
            return true;
        }
        return false;
    }

    public float floatValue() {
        return (float) this._value;
    }

    public int hashCode() {
        long j10 = this._value;
        return ((int) (j10 >> 32)) ^ ((int) j10);
    }

    public int intValue() {
        return (int) this._value;
    }

    public boolean isIntegralNumber() {
        return true;
    }

    public boolean isLong() {
        return true;
    }

    public long longValue() {
        return this._value;
    }

    public JsonParser.NumberType numberType() {
        return JsonParser.NumberType.LONG;
    }

    public Number numberValue() {
        return Long.valueOf(this._value);
    }

    public final void serialize(JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        jsonGenerator.writeNumber(this._value);
    }

    public short shortValue() {
        return (short) ((int) this._value);
    }
}
