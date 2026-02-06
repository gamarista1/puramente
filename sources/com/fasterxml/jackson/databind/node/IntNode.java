package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.io.NumberOutput;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.math.BigDecimal;
import java.math.BigInteger;

public class IntNode extends NumericNode {
    private static final IntNode[] CANONICALS = new IntNode[12];
    static final int MAX_CANONICAL = 10;
    static final int MIN_CANONICAL = -1;
    protected final int _value;

    static {
        for (int i10 = 0; i10 < 12; i10++) {
            CANONICALS[i10] = new IntNode(i10 - 1);
        }
    }

    public IntNode(int i10) {
        this._value = i10;
    }

    public static IntNode valueOf(int i10) {
        if (i10 > 10 || i10 < -1) {
            return new IntNode(i10);
        }
        return CANONICALS[i10 - -1];
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
        return BigInteger.valueOf((long) this._value);
    }

    public boolean canConvertToInt() {
        return true;
    }

    public boolean canConvertToLong() {
        return true;
    }

    public BigDecimal decimalValue() {
        return BigDecimal.valueOf((long) this._value);
    }

    public double doubleValue() {
        return (double) this._value;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof IntNode)) {
            return false;
        }
        if (((IntNode) obj)._value == this._value) {
            return true;
        }
        return false;
    }

    public float floatValue() {
        return (float) this._value;
    }

    public int hashCode() {
        return this._value;
    }

    public int intValue() {
        return this._value;
    }

    public boolean isInt() {
        return true;
    }

    public boolean isIntegralNumber() {
        return true;
    }

    public long longValue() {
        return (long) this._value;
    }

    public JsonParser.NumberType numberType() {
        return JsonParser.NumberType.INT;
    }

    public Number numberValue() {
        return Integer.valueOf(this._value);
    }

    public final void serialize(JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        jsonGenerator.writeNumber(this._value);
    }

    public short shortValue() {
        return (short) this._value;
    }
}
