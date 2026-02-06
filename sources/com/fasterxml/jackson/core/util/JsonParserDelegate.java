package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.FormatSchema;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonStreamContext;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.Version;
import java.io.OutputStream;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;

public class JsonParserDelegate extends JsonParser {
    protected JsonParser delegate;

    public JsonParserDelegate(JsonParser jsonParser) {
        this.delegate = jsonParser;
    }

    public boolean canReadObjectId() {
        return this.delegate.canReadObjectId();
    }

    public boolean canReadTypeId() {
        return this.delegate.canReadTypeId();
    }

    public boolean canUseSchema(FormatSchema formatSchema) {
        return this.delegate.canUseSchema(formatSchema);
    }

    public void clearCurrentToken() {
        this.delegate.clearCurrentToken();
    }

    public void close() {
        this.delegate.close();
    }

    public JsonToken currentToken() {
        return this.delegate.currentToken();
    }

    public int currentTokenId() {
        return this.delegate.currentTokenId();
    }

    public JsonParser disable(JsonParser.Feature feature) {
        this.delegate.disable(feature);
        return this;
    }

    public JsonParser enable(JsonParser.Feature feature) {
        this.delegate.enable(feature);
        return this;
    }

    public void finishToken() {
        this.delegate.finishToken();
    }

    public BigInteger getBigIntegerValue() {
        return this.delegate.getBigIntegerValue();
    }

    public byte[] getBinaryValue(Base64Variant base64Variant) {
        return this.delegate.getBinaryValue(base64Variant);
    }

    public boolean getBooleanValue() {
        return this.delegate.getBooleanValue();
    }

    public byte getByteValue() {
        return this.delegate.getByteValue();
    }

    public ObjectCodec getCodec() {
        return this.delegate.getCodec();
    }

    public JsonLocation getCurrentLocation() {
        return this.delegate.getCurrentLocation();
    }

    public String getCurrentName() {
        return this.delegate.getCurrentName();
    }

    public JsonToken getCurrentToken() {
        return this.delegate.getCurrentToken();
    }

    public int getCurrentTokenId() {
        return this.delegate.getCurrentTokenId();
    }

    public Object getCurrentValue() {
        return this.delegate.getCurrentValue();
    }

    public BigDecimal getDecimalValue() {
        return this.delegate.getDecimalValue();
    }

    public double getDoubleValue() {
        return this.delegate.getDoubleValue();
    }

    public Object getEmbeddedObject() {
        return this.delegate.getEmbeddedObject();
    }

    public int getFeatureMask() {
        return this.delegate.getFeatureMask();
    }

    public float getFloatValue() {
        return this.delegate.getFloatValue();
    }

    public Object getInputSource() {
        return this.delegate.getInputSource();
    }

    public int getIntValue() {
        return this.delegate.getIntValue();
    }

    public JsonToken getLastClearedToken() {
        return this.delegate.getLastClearedToken();
    }

    public long getLongValue() {
        return this.delegate.getLongValue();
    }

    public JsonParser.NumberType getNumberType() {
        return this.delegate.getNumberType();
    }

    public Number getNumberValue() {
        return this.delegate.getNumberValue();
    }

    public Object getObjectId() {
        return this.delegate.getObjectId();
    }

    public JsonStreamContext getParsingContext() {
        return this.delegate.getParsingContext();
    }

    public FormatSchema getSchema() {
        return this.delegate.getSchema();
    }

    public short getShortValue() {
        return this.delegate.getShortValue();
    }

    public String getText() {
        return this.delegate.getText();
    }

    public char[] getTextCharacters() {
        return this.delegate.getTextCharacters();
    }

    public int getTextLength() {
        return this.delegate.getTextLength();
    }

    public int getTextOffset() {
        return this.delegate.getTextOffset();
    }

    public JsonLocation getTokenLocation() {
        return this.delegate.getTokenLocation();
    }

    public Object getTypeId() {
        return this.delegate.getTypeId();
    }

    public boolean getValueAsBoolean() {
        return this.delegate.getValueAsBoolean();
    }

    public double getValueAsDouble() {
        return this.delegate.getValueAsDouble();
    }

    public int getValueAsInt() {
        return this.delegate.getValueAsInt();
    }

    public long getValueAsLong() {
        return this.delegate.getValueAsLong();
    }

    public String getValueAsString() {
        return this.delegate.getValueAsString();
    }

    public boolean hasCurrentToken() {
        return this.delegate.hasCurrentToken();
    }

    public boolean hasTextCharacters() {
        return this.delegate.hasTextCharacters();
    }

    public boolean hasToken(JsonToken jsonToken) {
        return this.delegate.hasToken(jsonToken);
    }

    public boolean hasTokenId(int i10) {
        return this.delegate.hasTokenId(i10);
    }

    public boolean isClosed() {
        return this.delegate.isClosed();
    }

    public boolean isEnabled(JsonParser.Feature feature) {
        return this.delegate.isEnabled(feature);
    }

    public boolean isExpectedStartArrayToken() {
        return this.delegate.isExpectedStartArrayToken();
    }

    public boolean isExpectedStartObjectToken() {
        return this.delegate.isExpectedStartObjectToken();
    }

    public JsonToken nextToken() {
        return this.delegate.nextToken();
    }

    public JsonToken nextValue() {
        return this.delegate.nextValue();
    }

    public void overrideCurrentName(String str) {
        this.delegate.overrideCurrentName(str);
    }

    public JsonParser overrideFormatFeatures(int i10, int i11) {
        this.delegate.overrideFormatFeatures(i10, i11);
        return this;
    }

    public JsonParser overrideStdFeatures(int i10, int i11) {
        this.delegate.overrideStdFeatures(i10, i11);
        return this;
    }

    public int readBinaryValue(Base64Variant base64Variant, OutputStream outputStream) {
        return this.delegate.readBinaryValue(base64Variant, outputStream);
    }

    public boolean requiresCustomCodec() {
        return this.delegate.requiresCustomCodec();
    }

    public void setCodec(ObjectCodec objectCodec) {
        this.delegate.setCodec(objectCodec);
    }

    public void setCurrentValue(Object obj) {
        this.delegate.setCurrentValue(obj);
    }

    @Deprecated
    public JsonParser setFeatureMask(int i10) {
        this.delegate.setFeatureMask(i10);
        return this;
    }

    public void setSchema(FormatSchema formatSchema) {
        this.delegate.setSchema(formatSchema);
    }

    public JsonParser skipChildren() {
        this.delegate.skipChildren();
        return this;
    }

    public Version version() {
        return this.delegate.version();
    }

    public int getText(Writer writer) {
        return this.delegate.getText(writer);
    }

    public boolean getValueAsBoolean(boolean z10) {
        return this.delegate.getValueAsBoolean(z10);
    }

    public double getValueAsDouble(double d10) {
        return this.delegate.getValueAsDouble(d10);
    }

    public int getValueAsInt(int i10) {
        return this.delegate.getValueAsInt(i10);
    }

    public long getValueAsLong(long j10) {
        return this.delegate.getValueAsLong(j10);
    }

    public String getValueAsString(String str) {
        return this.delegate.getValueAsString(str);
    }
}
