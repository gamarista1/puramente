package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.databind.util.RawValue;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;

public class JsonNodeFactory implements Serializable, JsonNodeCreator {
    private static final JsonNodeFactory decimalsAsIs = new JsonNodeFactory(true);
    private static final JsonNodeFactory decimalsNormalized;
    public static final JsonNodeFactory instance;
    private static final long serialVersionUID = 1;
    private final boolean _cfgBigDecimalExact;

    static {
        JsonNodeFactory jsonNodeFactory = new JsonNodeFactory(false);
        decimalsNormalized = jsonNodeFactory;
        instance = jsonNodeFactory;
    }

    public JsonNodeFactory(boolean z10) {
        this._cfgBigDecimalExact = z10;
    }

    public static JsonNodeFactory withExactBigDecimals(boolean z10) {
        if (z10) {
            return decimalsAsIs;
        }
        return decimalsNormalized;
    }

    /* access modifiers changed from: protected */
    public boolean _inIntRange(long j10) {
        return ((long) ((int) j10)) == j10;
    }

    public ArrayNode arrayNode() {
        return new ArrayNode(this);
    }

    public ObjectNode objectNode() {
        return new ObjectNode(this);
    }

    public ValueNode pojoNode(Object obj) {
        return new POJONode(obj);
    }

    public ValueNode rawValueNode(RawValue rawValue) {
        return new POJONode(rawValue);
    }

    public ArrayNode arrayNode(int i10) {
        return new ArrayNode(this, i10);
    }

    public BooleanNode booleanNode(boolean z10) {
        return z10 ? BooleanNode.getTrue() : BooleanNode.getFalse();
    }

    public NullNode nullNode() {
        return NullNode.getInstance();
    }

    public TextNode textNode(String str) {
        return TextNode.valueOf(str);
    }

    protected JsonNodeFactory() {
        this(false);
    }

    public BinaryNode binaryNode(byte[] bArr) {
        return BinaryNode.valueOf(bArr);
    }

    public BinaryNode binaryNode(byte[] bArr, int i10, int i11) {
        return BinaryNode.valueOf(bArr, i10, i11);
    }

    public NumericNode numberNode(byte b10) {
        return IntNode.valueOf(b10);
    }

    public ValueNode numberNode(Byte b10) {
        return b10 == null ? nullNode() : IntNode.valueOf(b10.intValue());
    }

    public NumericNode numberNode(short s10) {
        return ShortNode.valueOf(s10);
    }

    public ValueNode numberNode(Short sh2) {
        return sh2 == null ? nullNode() : ShortNode.valueOf(sh2.shortValue());
    }

    public NumericNode numberNode(int i10) {
        return IntNode.valueOf(i10);
    }

    public ValueNode numberNode(Integer num) {
        return num == null ? nullNode() : IntNode.valueOf(num.intValue());
    }

    public NumericNode numberNode(long j10) {
        return LongNode.valueOf(j10);
    }

    public ValueNode numberNode(Long l10) {
        if (l10 == null) {
            return nullNode();
        }
        return LongNode.valueOf(l10.longValue());
    }

    public NumericNode numberNode(BigInteger bigInteger) {
        return BigIntegerNode.valueOf(bigInteger);
    }

    public NumericNode numberNode(float f10) {
        return FloatNode.valueOf(f10);
    }

    public ValueNode numberNode(Float f10) {
        return f10 == null ? nullNode() : FloatNode.valueOf(f10.floatValue());
    }

    public NumericNode numberNode(double d10) {
        return DoubleNode.valueOf(d10);
    }

    public ValueNode numberNode(Double d10) {
        return d10 == null ? nullNode() : DoubleNode.valueOf(d10.doubleValue());
    }

    public NumericNode numberNode(BigDecimal bigDecimal) {
        if (this._cfgBigDecimalExact) {
            return DecimalNode.valueOf(bigDecimal);
        }
        return bigDecimal.compareTo(BigDecimal.ZERO) == 0 ? DecimalNode.ZERO : DecimalNode.valueOf(a.a(bigDecimal));
    }
}
