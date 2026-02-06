package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonStreamContext;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.core.base.ParserMinimalBase;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.cfg.PackageVersion;
import com.fasterxml.jackson.databind.node.NodeCursor;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.math.BigInteger;

public class TreeTraversingParser extends ParserMinimalBase {
    protected boolean _closed;
    protected JsonToken _nextToken;
    protected NodeCursor _nodeCursor;
    protected ObjectCodec _objectCodec;
    protected boolean _startContainer;

    /* renamed from: com.fasterxml.jackson.databind.node.TreeTraversingParser$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$fasterxml$jackson$core$JsonToken;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.fasterxml.jackson.core.JsonToken[] r0 = com.fasterxml.jackson.core.JsonToken.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$fasterxml$jackson$core$JsonToken = r0
                com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$fasterxml$jackson$core$JsonToken     // Catch:{ NoSuchFieldError -> 0x001d }
                com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.VALUE_STRING     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$com$fasterxml$jackson$core$JsonToken     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_INT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$com$fasterxml$jackson$core$JsonToken     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_FLOAT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = $SwitchMap$com$fasterxml$jackson$core$JsonToken     // Catch:{ NoSuchFieldError -> 0x003e }
                com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.node.TreeTraversingParser.AnonymousClass1.<clinit>():void");
        }
    }

    public TreeTraversingParser(JsonNode jsonNode) {
        this(jsonNode, (ObjectCodec) null);
    }

    /* access modifiers changed from: protected */
    public void _handleEOF() {
        _throwInternal();
    }

    public void close() {
        if (!this._closed) {
            this._closed = true;
            this._nodeCursor = null;
            this._currToken = null;
        }
    }

    /* access modifiers changed from: protected */
    public JsonNode currentNode() {
        NodeCursor nodeCursor;
        if (this._closed || (nodeCursor = this._nodeCursor) == null) {
            return null;
        }
        return nodeCursor.currentNode();
    }

    /* access modifiers changed from: protected */
    public JsonNode currentNumericNode() {
        JsonToken jsonToken;
        JsonNode currentNode = currentNode();
        if (currentNode != null && currentNode.isNumber()) {
            return currentNode;
        }
        if (currentNode == null) {
            jsonToken = null;
        } else {
            jsonToken = currentNode.asToken();
        }
        throw _constructError("Current token (" + jsonToken + ") not numeric, can not use numeric value accessors");
    }

    public BigInteger getBigIntegerValue() {
        return currentNumericNode().bigIntegerValue();
    }

    public byte[] getBinaryValue(Base64Variant base64Variant) {
        JsonNode currentNode = currentNode();
        if (currentNode == null) {
            return null;
        }
        byte[] binaryValue = currentNode.binaryValue();
        if (binaryValue != null) {
            return binaryValue;
        }
        if (!currentNode.isPojo()) {
            return null;
        }
        Object pojo = ((POJONode) currentNode).getPojo();
        if (pojo instanceof byte[]) {
            return (byte[]) pojo;
        }
        return null;
    }

    public ObjectCodec getCodec() {
        return this._objectCodec;
    }

    public JsonLocation getCurrentLocation() {
        return JsonLocation.NA;
    }

    public String getCurrentName() {
        NodeCursor nodeCursor = this._nodeCursor;
        if (nodeCursor == null) {
            return null;
        }
        return nodeCursor.getCurrentName();
    }

    public BigDecimal getDecimalValue() {
        return currentNumericNode().decimalValue();
    }

    public double getDoubleValue() {
        return currentNumericNode().doubleValue();
    }

    public Object getEmbeddedObject() {
        JsonNode currentNode;
        if (this._closed || (currentNode = currentNode()) == null) {
            return null;
        }
        if (currentNode.isPojo()) {
            return ((POJONode) currentNode).getPojo();
        }
        if (currentNode.isBinary()) {
            return ((BinaryNode) currentNode).binaryValue();
        }
        return null;
    }

    public float getFloatValue() {
        return (float) currentNumericNode().doubleValue();
    }

    public int getIntValue() {
        return currentNumericNode().intValue();
    }

    public long getLongValue() {
        return currentNumericNode().longValue();
    }

    public JsonParser.NumberType getNumberType() {
        JsonNode currentNumericNode = currentNumericNode();
        if (currentNumericNode == null) {
            return null;
        }
        return currentNumericNode.numberType();
    }

    public Number getNumberValue() {
        return currentNumericNode().numberValue();
    }

    public JsonStreamContext getParsingContext() {
        return this._nodeCursor;
    }

    public String getText() {
        JsonNode currentNode;
        if (this._closed) {
            return null;
        }
        int i10 = AnonymousClass1.$SwitchMap$com$fasterxml$jackson$core$JsonToken[this._currToken.ordinal()];
        if (i10 == 1) {
            return this._nodeCursor.getCurrentName();
        }
        if (i10 == 2) {
            return currentNode().textValue();
        }
        if (i10 == 3 || i10 == 4) {
            return String.valueOf(currentNode().numberValue());
        }
        if (i10 == 5 && (currentNode = currentNode()) != null && currentNode.isBinary()) {
            return currentNode.asText();
        }
        JsonToken jsonToken = this._currToken;
        if (jsonToken == null) {
            return null;
        }
        return jsonToken.asString();
    }

    public char[] getTextCharacters() {
        return getText().toCharArray();
    }

    public int getTextLength() {
        return getText().length();
    }

    public int getTextOffset() {
        return 0;
    }

    public JsonLocation getTokenLocation() {
        return JsonLocation.NA;
    }

    public boolean hasTextCharacters() {
        return false;
    }

    public boolean isClosed() {
        return this._closed;
    }

    public JsonToken nextToken() {
        JsonToken jsonToken;
        JsonToken jsonToken2 = this._nextToken;
        if (jsonToken2 != null) {
            this._currToken = jsonToken2;
            this._nextToken = null;
            return jsonToken2;
        } else if (this._startContainer) {
            this._startContainer = false;
            if (!this._nodeCursor.currentHasChildren()) {
                if (this._currToken == JsonToken.START_OBJECT) {
                    jsonToken = JsonToken.END_OBJECT;
                } else {
                    jsonToken = JsonToken.END_ARRAY;
                }
                this._currToken = jsonToken;
                return jsonToken;
            }
            NodeCursor iterateChildren = this._nodeCursor.iterateChildren();
            this._nodeCursor = iterateChildren;
            JsonToken nextToken = iterateChildren.nextToken();
            this._currToken = nextToken;
            if (nextToken == JsonToken.START_OBJECT || nextToken == JsonToken.START_ARRAY) {
                this._startContainer = true;
            }
            return nextToken;
        } else {
            NodeCursor nodeCursor = this._nodeCursor;
            if (nodeCursor == null) {
                this._closed = true;
                return null;
            }
            JsonToken nextToken2 = nodeCursor.nextToken();
            this._currToken = nextToken2;
            if (nextToken2 != null) {
                if (nextToken2 == JsonToken.START_OBJECT || nextToken2 == JsonToken.START_ARRAY) {
                    this._startContainer = true;
                }
                return nextToken2;
            }
            this._currToken = this._nodeCursor.endToken();
            this._nodeCursor = this._nodeCursor.getParent();
            return this._currToken;
        }
    }

    public void overrideCurrentName(String str) {
        NodeCursor nodeCursor = this._nodeCursor;
        if (nodeCursor != null) {
            nodeCursor.overrideCurrentName(str);
        }
    }

    public int readBinaryValue(Base64Variant base64Variant, OutputStream outputStream) {
        byte[] binaryValue = getBinaryValue(base64Variant);
        if (binaryValue == null) {
            return 0;
        }
        outputStream.write(binaryValue, 0, binaryValue.length);
        return binaryValue.length;
    }

    public void setCodec(ObjectCodec objectCodec) {
        this._objectCodec = objectCodec;
    }

    public JsonParser skipChildren() {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == JsonToken.START_OBJECT) {
            this._startContainer = false;
            this._currToken = JsonToken.END_OBJECT;
        } else if (jsonToken == JsonToken.START_ARRAY) {
            this._startContainer = false;
            this._currToken = JsonToken.END_ARRAY;
        }
        return this;
    }

    public Version version() {
        return PackageVersion.VERSION;
    }

    public TreeTraversingParser(JsonNode jsonNode, ObjectCodec objectCodec) {
        super(0);
        this._objectCodec = objectCodec;
        if (jsonNode.isArray()) {
            this._nextToken = JsonToken.START_ARRAY;
            this._nodeCursor = new NodeCursor.ArrayCursor(jsonNode, (NodeCursor) null);
        } else if (jsonNode.isObject()) {
            this._nextToken = JsonToken.START_OBJECT;
            this._nodeCursor = new NodeCursor.ObjectCursor(jsonNode, (NodeCursor) null);
        } else {
            this._nodeCursor = new NodeCursor.RootCursor(jsonNode, (NodeCursor) null);
        }
    }
}
