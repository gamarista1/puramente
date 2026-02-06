package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ContainerNode;
import com.fasterxml.jackson.databind.util.RawValue;
import java.math.BigDecimal;
import java.math.BigInteger;

public abstract class ContainerNode<T extends ContainerNode<T>> extends BaseJsonNode implements JsonNodeCreator {
    protected final JsonNodeFactory _nodeFactory;

    protected ContainerNode(JsonNodeFactory jsonNodeFactory) {
        this._nodeFactory = jsonNodeFactory;
    }

    public final ArrayNode arrayNode() {
        return this._nodeFactory.arrayNode();
    }

    public String asText() {
        return "";
    }

    public abstract JsonToken asToken();

    public abstract JsonNode get(int i10);

    public abstract JsonNode get(String str);

    public final ObjectNode objectNode() {
        return this._nodeFactory.objectNode();
    }

    public final ValueNode pojoNode(Object obj) {
        return this._nodeFactory.pojoNode(obj);
    }

    public final ValueNode rawValueNode(RawValue rawValue) {
        return this._nodeFactory.rawValueNode(rawValue);
    }

    public abstract T removeAll();

    public abstract int size();

    public final ArrayNode arrayNode(int i10) {
        return this._nodeFactory.arrayNode(i10);
    }

    public final BooleanNode booleanNode(boolean z10) {
        return this._nodeFactory.booleanNode(z10);
    }

    public final NullNode nullNode() {
        return this._nodeFactory.nullNode();
    }

    public final TextNode textNode(String str) {
        return this._nodeFactory.textNode(str);
    }

    public final BinaryNode binaryNode(byte[] bArr) {
        return this._nodeFactory.binaryNode(bArr);
    }

    public final BinaryNode binaryNode(byte[] bArr, int i10, int i11) {
        return this._nodeFactory.binaryNode(bArr, i10, i11);
    }

    public final NumericNode numberNode(byte b10) {
        return this._nodeFactory.numberNode(b10);
    }

    public final NumericNode numberNode(short s10) {
        return this._nodeFactory.numberNode(s10);
    }

    public final NumericNode numberNode(int i10) {
        return this._nodeFactory.numberNode(i10);
    }

    public final NumericNode numberNode(long j10) {
        return this._nodeFactory.numberNode(j10);
    }

    public final NumericNode numberNode(BigInteger bigInteger) {
        return this._nodeFactory.numberNode(bigInteger);
    }

    public final NumericNode numberNode(float f10) {
        return this._nodeFactory.numberNode(f10);
    }

    public final NumericNode numberNode(double d10) {
        return this._nodeFactory.numberNode(d10);
    }

    public final NumericNode numberNode(BigDecimal bigDecimal) {
        return this._nodeFactory.numberNode(bigDecimal);
    }

    public final ValueNode numberNode(Byte b10) {
        return this._nodeFactory.numberNode(b10);
    }

    public final ValueNode numberNode(Short sh2) {
        return this._nodeFactory.numberNode(sh2);
    }

    public final ValueNode numberNode(Integer num) {
        return this._nodeFactory.numberNode(num);
    }

    public final ValueNode numberNode(Long l10) {
        return this._nodeFactory.numberNode(l10);
    }

    public final ValueNode numberNode(Float f10) {
        return this._nodeFactory.numberNode(f10);
    }

    public final ValueNode numberNode(Double d10) {
        return this._nodeFactory.numberNode(d10);
    }
}
