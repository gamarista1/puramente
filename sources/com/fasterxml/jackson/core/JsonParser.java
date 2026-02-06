package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.core.util.RequestPayload;
import java.io.Closeable;
import java.io.OutputStream;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Iterator;

public abstract class JsonParser implements Closeable, Versioned {
    private static final int MAX_BYTE_I = 255;
    private static final int MAX_SHORT_I = 32767;
    private static final int MIN_BYTE_I = -128;
    private static final int MIN_SHORT_I = -32768;
    protected int _features;
    protected transient RequestPayload _requestPayload;

    public enum Feature {
        AUTO_CLOSE_SOURCE(true),
        ALLOW_COMMENTS(false),
        ALLOW_YAML_COMMENTS(false),
        ALLOW_UNQUOTED_FIELD_NAMES(false),
        ALLOW_SINGLE_QUOTES(false),
        ALLOW_UNQUOTED_CONTROL_CHARS(false),
        ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER(false),
        ALLOW_NUMERIC_LEADING_ZEROS(false),
        ALLOW_NON_NUMERIC_NUMBERS(false),
        STRICT_DUPLICATE_DETECTION(false),
        IGNORE_UNDEFINED(false),
        ALLOW_MISSING_VALUES(false);
        
        private final boolean _defaultState;
        private final int _mask;

        private Feature(boolean z10) {
            this._mask = 1 << ordinal();
            this._defaultState = z10;
        }

        public static int collectDefaults() {
            int i10 = 0;
            for (Feature feature : values()) {
                if (feature.enabledByDefault()) {
                    i10 |= feature.getMask();
                }
            }
            return i10;
        }

        public boolean enabledByDefault() {
            return this._defaultState;
        }

        public boolean enabledIn(int i10) {
            if ((i10 & this._mask) != 0) {
                return true;
            }
            return false;
        }

        public int getMask() {
            return this._mask;
        }
    }

    public enum NumberType {
        INT,
        LONG,
        BIG_INTEGER,
        FLOAT,
        DOUBLE,
        BIG_DECIMAL
    }

    protected JsonParser() {
    }

    /* access modifiers changed from: protected */
    public ObjectCodec _codec() {
        ObjectCodec codec = getCodec();
        if (codec != null) {
            return codec;
        }
        throw new IllegalStateException("No ObjectCodec defined for parser, needed for deserialization");
    }

    /* access modifiers changed from: protected */
    public JsonParseException _constructError(String str) {
        return new JsonParseException(this, str).withRequestPayload(this._requestPayload);
    }

    /* access modifiers changed from: protected */
    public void _reportUnsupportedOperation() {
        throw new UnsupportedOperationException("Operation not supported by parser of type " + getClass().getName());
    }

    public boolean canReadObjectId() {
        return false;
    }

    public boolean canReadTypeId() {
        return false;
    }

    public boolean canUseSchema(FormatSchema formatSchema) {
        return false;
    }

    public abstract void clearCurrentToken();

    public abstract void close();

    public JsonParser configure(Feature feature, boolean z10) {
        if (z10) {
            enable(feature);
        } else {
            disable(feature);
        }
        return this;
    }

    public JsonToken currentToken() {
        return getCurrentToken();
    }

    public int currentTokenId() {
        return getCurrentTokenId();
    }

    public JsonParser disable(Feature feature) {
        this._features = (~feature.getMask()) & this._features;
        return this;
    }

    public JsonParser enable(Feature feature) {
        this._features = feature.getMask() | this._features;
        return this;
    }

    public void finishToken() {
    }

    public abstract BigInteger getBigIntegerValue();

    public byte[] getBinaryValue() {
        return getBinaryValue(Base64Variants.getDefaultVariant());
    }

    public abstract byte[] getBinaryValue(Base64Variant base64Variant);

    public boolean getBooleanValue() {
        JsonToken currentToken = currentToken();
        if (currentToken == JsonToken.VALUE_TRUE) {
            return true;
        }
        if (currentToken == JsonToken.VALUE_FALSE) {
            return false;
        }
        throw new JsonParseException(this, String.format("Current token (%s) not of boolean type", new Object[]{currentToken})).withRequestPayload(this._requestPayload);
    }

    public byte getByteValue() {
        int intValue = getIntValue();
        if (intValue >= MIN_BYTE_I && intValue <= MAX_BYTE_I) {
            return (byte) intValue;
        }
        throw _constructError("Numeric value (" + getText() + ") out of range of Java byte");
    }

    public abstract ObjectCodec getCodec();

    public abstract JsonLocation getCurrentLocation();

    public abstract String getCurrentName();

    public abstract JsonToken getCurrentToken();

    public abstract int getCurrentTokenId();

    public Object getCurrentValue() {
        JsonStreamContext parsingContext = getParsingContext();
        if (parsingContext == null) {
            return null;
        }
        return parsingContext.getCurrentValue();
    }

    public abstract BigDecimal getDecimalValue();

    public abstract double getDoubleValue();

    public Object getEmbeddedObject() {
        return null;
    }

    public int getFeatureMask() {
        return this._features;
    }

    public abstract float getFloatValue();

    public int getFormatFeatures() {
        return 0;
    }

    public Object getInputSource() {
        return null;
    }

    public abstract int getIntValue();

    public abstract JsonToken getLastClearedToken();

    public abstract long getLongValue();

    public abstract NumberType getNumberType();

    public abstract Number getNumberValue();

    public Object getObjectId() {
        return null;
    }

    public abstract JsonStreamContext getParsingContext();

    public FormatSchema getSchema() {
        return null;
    }

    public short getShortValue() {
        int intValue = getIntValue();
        if (intValue >= MIN_SHORT_I && intValue <= MAX_SHORT_I) {
            return (short) intValue;
        }
        throw _constructError("Numeric value (" + getText() + ") out of range of Java short");
    }

    public int getText(Writer writer) {
        String text = getText();
        if (text == null) {
            return 0;
        }
        writer.write(text);
        return text.length();
    }

    public abstract String getText();

    public abstract char[] getTextCharacters();

    public abstract int getTextLength();

    public abstract int getTextOffset();

    public abstract JsonLocation getTokenLocation();

    public Object getTypeId() {
        return null;
    }

    public boolean getValueAsBoolean(boolean z10) {
        return z10;
    }

    public double getValueAsDouble(double d10) {
        return d10;
    }

    public int getValueAsInt(int i10) {
        return i10;
    }

    public long getValueAsLong(long j10) {
        return j10;
    }

    public String getValueAsString() {
        return getValueAsString((String) null);
    }

    public abstract String getValueAsString(String str);

    public abstract boolean hasCurrentToken();

    public abstract boolean hasTextCharacters();

    public abstract boolean hasToken(JsonToken jsonToken);

    public abstract boolean hasTokenId(int i10);

    public abstract boolean isClosed();

    public boolean isEnabled(Feature feature) {
        return feature.enabledIn(this._features);
    }

    public boolean isExpectedStartArrayToken() {
        if (currentToken() == JsonToken.START_ARRAY) {
            return true;
        }
        return false;
    }

    public boolean isExpectedStartObjectToken() {
        if (currentToken() == JsonToken.START_OBJECT) {
            return true;
        }
        return false;
    }

    public Boolean nextBooleanValue() {
        JsonToken nextToken = nextToken();
        if (nextToken == JsonToken.VALUE_TRUE) {
            return Boolean.TRUE;
        }
        if (nextToken == JsonToken.VALUE_FALSE) {
            return Boolean.FALSE;
        }
        return null;
    }

    public boolean nextFieldName(SerializableString serializableString) {
        return nextToken() == JsonToken.FIELD_NAME && serializableString.getValue().equals(getCurrentName());
    }

    public int nextIntValue(int i10) {
        if (nextToken() == JsonToken.VALUE_NUMBER_INT) {
            return getIntValue();
        }
        return i10;
    }

    public long nextLongValue(long j10) {
        if (nextToken() == JsonToken.VALUE_NUMBER_INT) {
            return getLongValue();
        }
        return j10;
    }

    public String nextTextValue() {
        if (nextToken() == JsonToken.VALUE_STRING) {
            return getText();
        }
        return null;
    }

    public abstract JsonToken nextToken();

    public abstract JsonToken nextValue();

    public abstract void overrideCurrentName(String str);

    public JsonParser overrideFormatFeatures(int i10, int i11) {
        throw new IllegalArgumentException("No FormatFeatures defined for parser of type " + getClass().getName());
    }

    public JsonParser overrideStdFeatures(int i10, int i11) {
        return setFeatureMask((i10 & i11) | (this._features & (~i11)));
    }

    public int readBinaryValue(OutputStream outputStream) {
        return readBinaryValue(Base64Variants.getDefaultVariant(), outputStream);
    }

    public <T> T readValueAs(Class<T> cls) {
        return _codec().readValue(this, cls);
    }

    public <T extends TreeNode> T readValueAsTree() {
        return _codec().readTree(this);
    }

    public <T> Iterator<T> readValuesAs(Class<T> cls) {
        return _codec().readValues(this, cls);
    }

    public int releaseBuffered(OutputStream outputStream) {
        return -1;
    }

    public boolean requiresCustomCodec() {
        return false;
    }

    public abstract void setCodec(ObjectCodec objectCodec);

    public void setCurrentValue(Object obj) {
        JsonStreamContext parsingContext = getParsingContext();
        if (parsingContext != null) {
            parsingContext.setCurrentValue(obj);
        }
    }

    @Deprecated
    public JsonParser setFeatureMask(int i10) {
        this._features = i10;
        return this;
    }

    public void setRequestPayloadOnError(RequestPayload requestPayload) {
        this._requestPayload = requestPayload;
    }

    public void setSchema(FormatSchema formatSchema) {
        throw new UnsupportedOperationException("Parser of type " + getClass().getName() + " does not support schema of type '" + formatSchema.getSchemaType() + "'");
    }

    public abstract JsonParser skipChildren();

    public abstract Version version();

    protected JsonParser(int i10) {
        this._features = i10;
    }

    public boolean getValueAsBoolean() {
        return getValueAsBoolean(false);
    }

    public double getValueAsDouble() {
        return getValueAsDouble(0.0d);
    }

    public int getValueAsInt() {
        return getValueAsInt(0);
    }

    public long getValueAsLong() {
        return getValueAsLong(0);
    }

    public String nextFieldName() {
        if (nextToken() == JsonToken.FIELD_NAME) {
            return getCurrentName();
        }
        return null;
    }

    public int readBinaryValue(Base64Variant base64Variant, OutputStream outputStream) {
        _reportUnsupportedOperation();
        return 0;
    }

    public <T> T readValueAs(TypeReference<?> typeReference) {
        return _codec().readValue(this, typeReference);
    }

    public <T> Iterator<T> readValuesAs(TypeReference<?> typeReference) {
        return _codec().readValues(this, typeReference);
    }

    public int releaseBuffered(Writer writer) {
        return -1;
    }

    public void setRequestPayloadOnError(byte[] bArr, String str) {
        this._requestPayload = bArr == null ? null : new RequestPayload(bArr, str);
    }

    public void setRequestPayloadOnError(String str) {
        this._requestPayload = str == null ? null : new RequestPayload(str);
    }
}
