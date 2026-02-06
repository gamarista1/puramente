package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.FormatSchema;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonStreamContext;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.PrettyPrinter;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.core.TreeNode;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.core.io.CharacterEscapes;
import java.io.InputStream;
import java.math.BigDecimal;
import java.math.BigInteger;

public class JsonGeneratorDelegate extends JsonGenerator {
    protected JsonGenerator delegate;
    protected boolean delegateCopyMethods;

    public JsonGeneratorDelegate(JsonGenerator jsonGenerator) {
        this(jsonGenerator, true);
    }

    public boolean canOmitFields() {
        return this.delegate.canOmitFields();
    }

    public boolean canUseSchema(FormatSchema formatSchema) {
        return this.delegate.canUseSchema(formatSchema);
    }

    public boolean canWriteBinaryNatively() {
        return this.delegate.canWriteBinaryNatively();
    }

    public boolean canWriteObjectId() {
        return this.delegate.canWriteObjectId();
    }

    public boolean canWriteTypeId() {
        return this.delegate.canWriteTypeId();
    }

    public void close() {
        this.delegate.close();
    }

    public void copyCurrentEvent(JsonParser jsonParser) {
        if (this.delegateCopyMethods) {
            this.delegate.copyCurrentEvent(jsonParser);
        } else {
            super.copyCurrentEvent(jsonParser);
        }
    }

    public void copyCurrentStructure(JsonParser jsonParser) {
        if (this.delegateCopyMethods) {
            this.delegate.copyCurrentStructure(jsonParser);
        } else {
            super.copyCurrentStructure(jsonParser);
        }
    }

    public JsonGenerator disable(JsonGenerator.Feature feature) {
        this.delegate.disable(feature);
        return this;
    }

    public JsonGenerator enable(JsonGenerator.Feature feature) {
        this.delegate.enable(feature);
        return this;
    }

    public void flush() {
        this.delegate.flush();
    }

    public CharacterEscapes getCharacterEscapes() {
        return this.delegate.getCharacterEscapes();
    }

    public ObjectCodec getCodec() {
        return this.delegate.getCodec();
    }

    public Object getCurrentValue() {
        return this.delegate.getCurrentValue();
    }

    public JsonGenerator getDelegate() {
        return this.delegate;
    }

    public int getFeatureMask() {
        return this.delegate.getFeatureMask();
    }

    public int getHighestEscapedChar() {
        return this.delegate.getHighestEscapedChar();
    }

    public int getOutputBuffered() {
        return this.delegate.getOutputBuffered();
    }

    public JsonStreamContext getOutputContext() {
        return this.delegate.getOutputContext();
    }

    public Object getOutputTarget() {
        return this.delegate.getOutputTarget();
    }

    public PrettyPrinter getPrettyPrinter() {
        return this.delegate.getPrettyPrinter();
    }

    public FormatSchema getSchema() {
        return this.delegate.getSchema();
    }

    public boolean isClosed() {
        return this.delegate.isClosed();
    }

    public boolean isEnabled(JsonGenerator.Feature feature) {
        return this.delegate.isEnabled(feature);
    }

    public JsonGenerator overrideFormatFeatures(int i10, int i11) {
        this.delegate.overrideFormatFeatures(i10, i11);
        return this;
    }

    public JsonGenerator overrideStdFeatures(int i10, int i11) {
        this.delegate.overrideStdFeatures(i10, i11);
        return this;
    }

    public JsonGenerator setCharacterEscapes(CharacterEscapes characterEscapes) {
        this.delegate.setCharacterEscapes(characterEscapes);
        return this;
    }

    public JsonGenerator setCodec(ObjectCodec objectCodec) {
        this.delegate.setCodec(objectCodec);
        return this;
    }

    public void setCurrentValue(Object obj) {
        this.delegate.setCurrentValue(obj);
    }

    @Deprecated
    public JsonGenerator setFeatureMask(int i10) {
        this.delegate.setFeatureMask(i10);
        return this;
    }

    public JsonGenerator setHighestNonEscapedChar(int i10) {
        this.delegate.setHighestNonEscapedChar(i10);
        return this;
    }

    public JsonGenerator setPrettyPrinter(PrettyPrinter prettyPrinter) {
        this.delegate.setPrettyPrinter(prettyPrinter);
        return this;
    }

    public JsonGenerator setRootValueSeparator(SerializableString serializableString) {
        this.delegate.setRootValueSeparator(serializableString);
        return this;
    }

    public void setSchema(FormatSchema formatSchema) {
        this.delegate.setSchema(formatSchema);
    }

    public JsonGenerator useDefaultPrettyPrinter() {
        this.delegate.useDefaultPrettyPrinter();
        return this;
    }

    public Version version() {
        return this.delegate.version();
    }

    public void writeArray(int[] iArr, int i10, int i11) {
        this.delegate.writeArray(iArr, i10, i11);
    }

    public void writeBinary(Base64Variant base64Variant, byte[] bArr, int i10, int i11) {
        this.delegate.writeBinary(base64Variant, bArr, i10, i11);
    }

    public void writeBoolean(boolean z10) {
        this.delegate.writeBoolean(z10);
    }

    public void writeEmbeddedObject(Object obj) {
        this.delegate.writeEmbeddedObject(obj);
    }

    public void writeEndArray() {
        this.delegate.writeEndArray();
    }

    public void writeEndObject() {
        this.delegate.writeEndObject();
    }

    public void writeFieldId(long j10) {
        this.delegate.writeFieldId(j10);
    }

    public void writeFieldName(String str) {
        this.delegate.writeFieldName(str);
    }

    public void writeNull() {
        this.delegate.writeNull();
    }

    public void writeNumber(short s10) {
        this.delegate.writeNumber(s10);
    }

    public void writeObject(Object obj) {
        if (this.delegateCopyMethods) {
            this.delegate.writeObject(obj);
        } else if (obj == null) {
            writeNull();
        } else if (getCodec() != null) {
            getCodec().writeValue(this, obj);
        } else {
            _writeSimpleObject(obj);
        }
    }

    public void writeObjectId(Object obj) {
        this.delegate.writeObjectId(obj);
    }

    public void writeObjectRef(Object obj) {
        this.delegate.writeObjectRef(obj);
    }

    public void writeOmittedField(String str) {
        this.delegate.writeOmittedField(str);
    }

    public void writeRaw(String str) {
        this.delegate.writeRaw(str);
    }

    public void writeRawUTF8String(byte[] bArr, int i10, int i11) {
        this.delegate.writeRawUTF8String(bArr, i10, i11);
    }

    public void writeRawValue(String str) {
        this.delegate.writeRawValue(str);
    }

    public void writeStartArray() {
        this.delegate.writeStartArray();
    }

    public void writeStartObject() {
        this.delegate.writeStartObject();
    }

    public void writeString(String str) {
        this.delegate.writeString(str);
    }

    public void writeTree(TreeNode treeNode) {
        if (this.delegateCopyMethods) {
            this.delegate.writeTree(treeNode);
        } else if (treeNode == null) {
            writeNull();
        } else if (getCodec() != null) {
            getCodec().writeValue(this, treeNode);
        } else {
            throw new IllegalStateException("No ObjectCodec defined");
        }
    }

    public void writeTypeId(Object obj) {
        this.delegate.writeTypeId(obj);
    }

    public void writeUTF8String(byte[] bArr, int i10, int i11) {
        this.delegate.writeUTF8String(bArr, i10, i11);
    }

    public JsonGeneratorDelegate(JsonGenerator jsonGenerator, boolean z10) {
        this.delegate = jsonGenerator;
        this.delegateCopyMethods = z10;
    }

    public void writeArray(long[] jArr, int i10, int i11) {
        this.delegate.writeArray(jArr, i10, i11);
    }

    public int writeBinary(Base64Variant base64Variant, InputStream inputStream, int i10) {
        return this.delegate.writeBinary(base64Variant, inputStream, i10);
    }

    public void writeFieldName(SerializableString serializableString) {
        this.delegate.writeFieldName(serializableString);
    }

    public void writeNumber(int i10) {
        this.delegate.writeNumber(i10);
    }

    public void writeRaw(String str, int i10, int i11) {
        this.delegate.writeRaw(str, i10, i11);
    }

    public void writeRawValue(String str, int i10, int i11) {
        this.delegate.writeRawValue(str, i10, i11);
    }

    public void writeStartArray(int i10) {
        this.delegate.writeStartArray(i10);
    }

    public void writeStartObject(Object obj) {
        this.delegate.writeStartObject(obj);
    }

    public void writeString(char[] cArr, int i10, int i11) {
        this.delegate.writeString(cArr, i10, i11);
    }

    public void writeArray(double[] dArr, int i10, int i11) {
        this.delegate.writeArray(dArr, i10, i11);
    }

    public void writeNumber(long j10) {
        this.delegate.writeNumber(j10);
    }

    public void writeRaw(SerializableString serializableString) {
        this.delegate.writeRaw(serializableString);
    }

    public void writeRawValue(char[] cArr, int i10, int i11) {
        this.delegate.writeRawValue(cArr, i10, i11);
    }

    public void writeString(SerializableString serializableString) {
        this.delegate.writeString(serializableString);
    }

    public void writeNumber(BigInteger bigInteger) {
        this.delegate.writeNumber(bigInteger);
    }

    public void writeRaw(char[] cArr, int i10, int i11) {
        this.delegate.writeRaw(cArr, i10, i11);
    }

    public void writeNumber(double d10) {
        this.delegate.writeNumber(d10);
    }

    public void writeRaw(char c10) {
        this.delegate.writeRaw(c10);
    }

    public void writeNumber(float f10) {
        this.delegate.writeNumber(f10);
    }

    public void writeNumber(BigDecimal bigDecimal) {
        this.delegate.writeNumber(bigDecimal);
    }

    public void writeNumber(String str) {
        this.delegate.writeNumber(str);
    }
}
