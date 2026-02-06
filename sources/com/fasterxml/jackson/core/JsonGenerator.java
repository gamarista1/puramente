package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.io.CharacterEscapes;
import com.fasterxml.jackson.core.util.VersionUtil;
import java.io.Closeable;
import java.io.Flushable;
import java.io.InputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public abstract class JsonGenerator implements Closeable, Flushable, Versioned {
    protected PrettyPrinter _cfgPrettyPrinter;

    public enum Feature {
        AUTO_CLOSE_TARGET(true),
        AUTO_CLOSE_JSON_CONTENT(true),
        FLUSH_PASSED_TO_STREAM(true),
        QUOTE_FIELD_NAMES(true),
        QUOTE_NON_NUMERIC_NUMBERS(true),
        WRITE_NUMBERS_AS_STRINGS(false),
        WRITE_BIGDECIMAL_AS_PLAIN(false),
        ESCAPE_NON_ASCII(false),
        STRICT_DUPLICATE_DETECTION(false),
        IGNORE_UNKNOWN(false);
        
        private final boolean _defaultState;
        private final int _mask;

        private Feature(boolean z10) {
            this._defaultState = z10;
            this._mask = 1 << ordinal();
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

    protected JsonGenerator() {
    }

    /* access modifiers changed from: protected */
    public void _reportError(String str) {
        throw new JsonGenerationException(str, this);
    }

    /* access modifiers changed from: protected */
    public void _reportUnsupportedOperation() {
        throw new UnsupportedOperationException("Operation not supported by generator of type " + getClass().getName());
    }

    /* access modifiers changed from: protected */
    public final void _throwInternal() {
        VersionUtil.throwInternal();
    }

    /* access modifiers changed from: protected */
    public final void _verifyOffsets(int i10, int i11, int i12) {
        if (i11 < 0 || i11 + i12 > i10) {
            throw new IllegalArgumentException(String.format("invalid argument(s) (offset=%d, length=%d) for input array of %d element", new Object[]{Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i10)}));
        }
    }

    /* access modifiers changed from: protected */
    public void _writeSimpleObject(Object obj) {
        if (obj == null) {
            writeNull();
        } else if (obj instanceof String) {
            writeString((String) obj);
        } else {
            if (obj instanceof Number) {
                Number number = (Number) obj;
                if (number instanceof Integer) {
                    writeNumber(number.intValue());
                    return;
                } else if (number instanceof Long) {
                    writeNumber(number.longValue());
                    return;
                } else if (number instanceof Double) {
                    writeNumber(number.doubleValue());
                    return;
                } else if (number instanceof Float) {
                    writeNumber(number.floatValue());
                    return;
                } else if (number instanceof Short) {
                    writeNumber(number.shortValue());
                    return;
                } else if (number instanceof Byte) {
                    writeNumber((short) number.byteValue());
                    return;
                } else if (number instanceof BigInteger) {
                    writeNumber((BigInteger) number);
                    return;
                } else if (number instanceof BigDecimal) {
                    writeNumber((BigDecimal) number);
                    return;
                } else if (number instanceof AtomicInteger) {
                    writeNumber(((AtomicInteger) number).get());
                    return;
                } else if (number instanceof AtomicLong) {
                    writeNumber(((AtomicLong) number).get());
                    return;
                }
            } else if (obj instanceof byte[]) {
                writeBinary((byte[]) obj);
                return;
            } else if (obj instanceof Boolean) {
                writeBoolean(((Boolean) obj).booleanValue());
                return;
            } else if (obj instanceof AtomicBoolean) {
                writeBoolean(((AtomicBoolean) obj).get());
                return;
            }
            throw new IllegalStateException("No ObjectCodec defined for the generator, can only serialize simple wrapper types (type passed " + obj.getClass().getName() + ")");
        }
    }

    public boolean canOmitFields() {
        return true;
    }

    public boolean canUseSchema(FormatSchema formatSchema) {
        return false;
    }

    public boolean canWriteBinaryNatively() {
        return false;
    }

    public boolean canWriteFormattedNumbers() {
        return false;
    }

    public boolean canWriteObjectId() {
        return false;
    }

    public boolean canWriteTypeId() {
        return false;
    }

    public abstract void close();

    public final JsonGenerator configure(Feature feature, boolean z10) {
        if (z10) {
            enable(feature);
        } else {
            disable(feature);
        }
        return this;
    }

    public void copyCurrentEvent(JsonParser jsonParser) {
        JsonToken currentToken = jsonParser.currentToken();
        if (currentToken == null) {
            _reportError("No current event to copy");
        }
        switch (currentToken.id()) {
            case -1:
                _reportError("No current event to copy");
                return;
            case 1:
                writeStartObject();
                return;
            case 2:
                writeEndObject();
                return;
            case 3:
                writeStartArray();
                return;
            case 4:
                writeEndArray();
                return;
            case 5:
                writeFieldName(jsonParser.getCurrentName());
                return;
            case 6:
                if (jsonParser.hasTextCharacters()) {
                    writeString(jsonParser.getTextCharacters(), jsonParser.getTextOffset(), jsonParser.getTextLength());
                    return;
                } else {
                    writeString(jsonParser.getText());
                    return;
                }
            case 7:
                JsonParser.NumberType numberType = jsonParser.getNumberType();
                if (numberType == JsonParser.NumberType.INT) {
                    writeNumber(jsonParser.getIntValue());
                    return;
                } else if (numberType == JsonParser.NumberType.BIG_INTEGER) {
                    writeNumber(jsonParser.getBigIntegerValue());
                    return;
                } else {
                    writeNumber(jsonParser.getLongValue());
                    return;
                }
            case 8:
                JsonParser.NumberType numberType2 = jsonParser.getNumberType();
                if (numberType2 == JsonParser.NumberType.BIG_DECIMAL) {
                    writeNumber(jsonParser.getDecimalValue());
                    return;
                } else if (numberType2 == JsonParser.NumberType.FLOAT) {
                    writeNumber(jsonParser.getFloatValue());
                    return;
                } else {
                    writeNumber(jsonParser.getDoubleValue());
                    return;
                }
            case 9:
                writeBoolean(true);
                return;
            case 10:
                writeBoolean(false);
                return;
            case 11:
                writeNull();
                return;
            case 12:
                writeObject(jsonParser.getEmbeddedObject());
                return;
            default:
                _throwInternal();
                return;
        }
    }

    public void copyCurrentStructure(JsonParser jsonParser) {
        JsonToken currentToken = jsonParser.currentToken();
        if (currentToken == null) {
            _reportError("No current event to copy");
        }
        int id2 = currentToken.id();
        if (id2 == 5) {
            writeFieldName(jsonParser.getCurrentName());
            id2 = jsonParser.nextToken().id();
        }
        if (id2 == 1) {
            writeStartObject();
            while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
                copyCurrentStructure(jsonParser);
            }
            writeEndObject();
        } else if (id2 != 3) {
            copyCurrentEvent(jsonParser);
        } else {
            writeStartArray();
            while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                copyCurrentStructure(jsonParser);
            }
            writeEndArray();
        }
    }

    public abstract JsonGenerator disable(Feature feature);

    public abstract JsonGenerator enable(Feature feature);

    public abstract void flush();

    public CharacterEscapes getCharacterEscapes() {
        return null;
    }

    public abstract ObjectCodec getCodec();

    public Object getCurrentValue() {
        JsonStreamContext outputContext = getOutputContext();
        if (outputContext == null) {
            return null;
        }
        return outputContext.getCurrentValue();
    }

    public abstract int getFeatureMask();

    public int getFormatFeatures() {
        return 0;
    }

    public int getHighestEscapedChar() {
        return 0;
    }

    public int getOutputBuffered() {
        return -1;
    }

    public abstract JsonStreamContext getOutputContext();

    public Object getOutputTarget() {
        return null;
    }

    public PrettyPrinter getPrettyPrinter() {
        return this._cfgPrettyPrinter;
    }

    public FormatSchema getSchema() {
        return null;
    }

    public abstract boolean isClosed();

    public abstract boolean isEnabled(Feature feature);

    public JsonGenerator overrideFormatFeatures(int i10, int i11) {
        throw new IllegalArgumentException("No FormatFeatures defined for generator of type " + getClass().getName());
    }

    public JsonGenerator overrideStdFeatures(int i10, int i11) {
        return setFeatureMask((i10 & i11) | (getFeatureMask() & (~i11)));
    }

    public JsonGenerator setCharacterEscapes(CharacterEscapes characterEscapes) {
        return this;
    }

    public abstract JsonGenerator setCodec(ObjectCodec objectCodec);

    public void setCurrentValue(Object obj) {
        JsonStreamContext outputContext = getOutputContext();
        if (outputContext != null) {
            outputContext.setCurrentValue(obj);
        }
    }

    @Deprecated
    public abstract JsonGenerator setFeatureMask(int i10);

    public JsonGenerator setHighestNonEscapedChar(int i10) {
        return this;
    }

    public JsonGenerator setPrettyPrinter(PrettyPrinter prettyPrinter) {
        this._cfgPrettyPrinter = prettyPrinter;
        return this;
    }

    public JsonGenerator setRootValueSeparator(SerializableString serializableString) {
        throw new UnsupportedOperationException();
    }

    public void setSchema(FormatSchema formatSchema) {
        throw new UnsupportedOperationException("Generator of type " + getClass().getName() + " does not support schema of type '" + formatSchema.getSchemaType() + "'");
    }

    public abstract JsonGenerator useDefaultPrettyPrinter();

    public abstract Version version();

    public void writeArray(int[] iArr, int i10, int i11) {
        if (iArr != null) {
            _verifyOffsets(iArr.length, i10, i11);
            writeStartArray();
            int i12 = i11 + i10;
            while (i10 < i12) {
                writeNumber(iArr[i10]);
                i10++;
            }
            writeEndArray();
            return;
        }
        throw new IllegalArgumentException("null array");
    }

    public final void writeArrayFieldStart(String str) {
        writeFieldName(str);
        writeStartArray();
    }

    public abstract int writeBinary(Base64Variant base64Variant, InputStream inputStream, int i10);

    public abstract void writeBinary(Base64Variant base64Variant, byte[] bArr, int i10, int i11);

    public void writeBinary(byte[] bArr, int i10, int i11) {
        writeBinary(Base64Variants.getDefaultVariant(), bArr, i10, i11);
    }

    public final void writeBinaryField(String str, byte[] bArr) {
        writeFieldName(str);
        writeBinary(bArr);
    }

    public abstract void writeBoolean(boolean z10);

    public final void writeBooleanField(String str, boolean z10) {
        writeFieldName(str);
        writeBoolean(z10);
    }

    public void writeEmbeddedObject(Object obj) {
        if (obj == null) {
            writeNull();
        } else if (obj instanceof byte[]) {
            writeBinary((byte[]) obj);
        } else {
            throw new JsonGenerationException("No native support for writing embedded objects of type " + obj.getClass().getName(), this);
        }
    }

    public abstract void writeEndArray();

    public abstract void writeEndObject();

    public void writeFieldId(long j10) {
        writeFieldName(Long.toString(j10));
    }

    public abstract void writeFieldName(SerializableString serializableString);

    public abstract void writeFieldName(String str);

    public abstract void writeNull();

    public final void writeNullField(String str) {
        writeFieldName(str);
        writeNull();
    }

    public abstract void writeNumber(double d10);

    public abstract void writeNumber(float f10);

    public abstract void writeNumber(int i10);

    public abstract void writeNumber(long j10);

    public abstract void writeNumber(String str);

    public abstract void writeNumber(BigDecimal bigDecimal);

    public abstract void writeNumber(BigInteger bigInteger);

    public void writeNumber(short s10) {
        writeNumber((int) s10);
    }

    public final void writeNumberField(String str, int i10) {
        writeFieldName(str);
        writeNumber(i10);
    }

    public abstract void writeObject(Object obj);

    public final void writeObjectField(String str, Object obj) {
        writeFieldName(str);
        writeObject(obj);
    }

    public final void writeObjectFieldStart(String str) {
        writeFieldName(str);
        writeStartObject();
    }

    public void writeObjectId(Object obj) {
        throw new JsonGenerationException("No native support for writing Object Ids", this);
    }

    public void writeObjectRef(Object obj) {
        throw new JsonGenerationException("No native support for writing Object Ids", this);
    }

    public void writeOmittedField(String str) {
    }

    public abstract void writeRaw(char c10);

    public void writeRaw(SerializableString serializableString) {
        writeRaw(serializableString.getValue());
    }

    public abstract void writeRaw(String str);

    public abstract void writeRaw(String str, int i10, int i11);

    public abstract void writeRaw(char[] cArr, int i10, int i11);

    public abstract void writeRawUTF8String(byte[] bArr, int i10, int i11);

    public void writeRawValue(SerializableString serializableString) {
        writeRawValue(serializableString.getValue());
    }

    public abstract void writeRawValue(String str);

    public abstract void writeRawValue(String str, int i10, int i11);

    public abstract void writeRawValue(char[] cArr, int i10, int i11);

    public abstract void writeStartArray();

    public void writeStartArray(int i10) {
        writeStartArray();
    }

    public abstract void writeStartObject();

    public void writeStartObject(Object obj) {
        writeStartObject();
        setCurrentValue(obj);
    }

    public abstract void writeString(SerializableString serializableString);

    public abstract void writeString(String str);

    public abstract void writeString(char[] cArr, int i10, int i11);

    public void writeStringField(String str, String str2) {
        writeFieldName(str);
        writeString(str2);
    }

    public abstract void writeTree(TreeNode treeNode);

    public void writeTypeId(Object obj) {
        throw new JsonGenerationException("No native support for writing Type Ids", this);
    }

    public abstract void writeUTF8String(byte[] bArr, int i10, int i11);

    public void writeBinary(byte[] bArr) {
        writeBinary(Base64Variants.getDefaultVariant(), bArr, 0, bArr.length);
    }

    public int writeBinary(InputStream inputStream, int i10) {
        return writeBinary(Base64Variants.getDefaultVariant(), inputStream, i10);
    }

    public final void writeNumberField(String str, long j10) {
        writeFieldName(str);
        writeNumber(j10);
    }

    public final void writeNumberField(String str, double d10) {
        writeFieldName(str);
        writeNumber(d10);
    }

    public void writeArray(long[] jArr, int i10, int i11) {
        if (jArr != null) {
            _verifyOffsets(jArr.length, i10, i11);
            writeStartArray();
            int i12 = i11 + i10;
            while (i10 < i12) {
                writeNumber(jArr[i10]);
                i10++;
            }
            writeEndArray();
            return;
        }
        throw new IllegalArgumentException("null array");
    }

    public final void writeNumberField(String str, float f10) {
        writeFieldName(str);
        writeNumber(f10);
    }

    public final void writeNumberField(String str, BigDecimal bigDecimal) {
        writeFieldName(str);
        writeNumber(bigDecimal);
    }

    public void writeArray(double[] dArr, int i10, int i11) {
        if (dArr != null) {
            _verifyOffsets(dArr.length, i10, i11);
            writeStartArray();
            int i12 = i11 + i10;
            while (i10 < i12) {
                writeNumber(dArr[i10]);
                i10++;
            }
            writeEndArray();
            return;
        }
        throw new IllegalArgumentException("null array");
    }
}
