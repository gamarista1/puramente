package com.fasterxml.jackson.core.base;

import com.amazon.a.a.o.b;
import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonStreamContext;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.io.JsonEOFException;
import com.fasterxml.jackson.core.io.NumberInput;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import com.fasterxml.jackson.core.util.VersionUtil;
import java.io.IOException;

public abstract class ParserMinimalBase extends JsonParser {
    protected static final int INT_BACKSLASH = 92;
    protected static final int INT_COLON = 58;
    protected static final int INT_COMMA = 44;
    protected static final int INT_CR = 13;
    protected static final int INT_E = 69;
    protected static final int INT_HASH = 35;
    protected static final int INT_LBRACKET = 91;
    protected static final int INT_LCURLY = 123;
    protected static final int INT_LF = 10;
    protected static final int INT_PERIOD = 46;
    protected static final int INT_QUOTE = 34;
    protected static final int INT_RBRACKET = 93;
    protected static final int INT_RCURLY = 125;
    protected static final int INT_SLASH = 47;
    protected static final int INT_SPACE = 32;
    protected static final int INT_TAB = 9;
    protected static final int INT_e = 101;
    protected JsonToken _currToken;
    protected JsonToken _lastClearedToken;

    protected ParserMinimalBase() {
    }

    protected static String _ascii(byte[] bArr) {
        try {
            return new String(bArr, "US-ASCII");
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    protected static byte[] _asciiBytes(String str) {
        byte[] bArr = new byte[str.length()];
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            bArr[i10] = (byte) str.charAt(i10);
        }
        return bArr;
    }

    protected static final String _getCharDesc(int i10) {
        char c10 = (char) i10;
        if (Character.isISOControl(c10)) {
            return "(CTRL-CHAR, code " + i10 + ")";
        } else if (i10 > 255) {
            return "'" + c10 + "' (code " + i10 + " / 0x" + Integer.toHexString(i10) + ")";
        } else {
            return "'" + c10 + "' (code " + i10 + ")";
        }
    }

    /* access modifiers changed from: protected */
    public final JsonParseException _constructError(String str, Throwable th2) {
        return new JsonParseException((JsonParser) this, str, th2);
    }

    /* access modifiers changed from: protected */
    public void _decodeBase64(String str, ByteArrayBuilder byteArrayBuilder, Base64Variant base64Variant) {
        try {
            base64Variant.decode(str, byteArrayBuilder);
        } catch (IllegalArgumentException e10) {
            _reportError(e10.getMessage());
        }
    }

    /* access modifiers changed from: protected */
    public abstract void _handleEOF();

    /* access modifiers changed from: protected */
    public char _handleUnrecognizedCharacterEscape(char c10) {
        if (isEnabled(JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER)) {
            return c10;
        }
        if (c10 == '\'' && isEnabled(JsonParser.Feature.ALLOW_SINGLE_QUOTES)) {
            return c10;
        }
        _reportError("Unrecognized character escape " + _getCharDesc(c10));
        return c10;
    }

    /* access modifiers changed from: protected */
    public boolean _hasTextualNull(String str) {
        return "null".equals(str);
    }

    /* access modifiers changed from: protected */
    public final void _reportError(String str) {
        throw _constructError(str);
    }

    /* access modifiers changed from: protected */
    public void _reportInvalidEOF() {
        _reportInvalidEOF(" in " + this._currToken, this._currToken);
    }

    /* access modifiers changed from: protected */
    public void _reportInvalidEOFInValue(JsonToken jsonToken) {
        String str;
        if (jsonToken == JsonToken.VALUE_STRING) {
            str = " in a String value";
        } else if (jsonToken == JsonToken.VALUE_NUMBER_INT || jsonToken == JsonToken.VALUE_NUMBER_FLOAT) {
            str = " in a Number value";
        } else {
            str = " in a value";
        }
        _reportInvalidEOF(str, jsonToken);
    }

    /* access modifiers changed from: protected */
    public void _reportMissingRootWS(int i10) {
        _reportUnexpectedChar(i10, "Expected space separating root-level values");
    }

    /* access modifiers changed from: protected */
    public void _reportUnexpectedChar(int i10, String str) {
        if (i10 < 0) {
            _reportInvalidEOF();
        }
        String str2 = "Unexpected character (" + _getCharDesc(i10) + ")";
        if (str != null) {
            str2 = str2 + ": " + str;
        }
        _reportError(str2);
    }

    /* access modifiers changed from: protected */
    public final void _throwInternal() {
        VersionUtil.throwInternal();
    }

    /* access modifiers changed from: protected */
    public void _throwInvalidSpace(int i10) {
        _reportError("Illegal character (" + _getCharDesc((char) i10) + "): only regular white space (\\r, \\n, \\t) is allowed between tokens");
    }

    /* access modifiers changed from: protected */
    public void _throwUnquotedSpace(int i10, String str) {
        if (!isEnabled(JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS) || i10 > 32) {
            _reportError("Illegal unquoted character (" + _getCharDesc((char) i10) + "): has to be escaped using backslash to be included in " + str);
        }
    }

    /* access modifiers changed from: protected */
    public final void _wrapError(String str, Throwable th2) {
        throw _constructError(str, th2);
    }

    public void clearCurrentToken() {
        JsonToken jsonToken = this._currToken;
        if (jsonToken != null) {
            this._lastClearedToken = jsonToken;
            this._currToken = null;
        }
    }

    public abstract void close();

    public JsonToken currentToken() {
        return this._currToken;
    }

    public int currentTokenId() {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == null) {
            return 0;
        }
        return jsonToken.id();
    }

    public abstract byte[] getBinaryValue(Base64Variant base64Variant);

    public abstract String getCurrentName();

    public JsonToken getCurrentToken() {
        return this._currToken;
    }

    public int getCurrentTokenId() {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == null) {
            return 0;
        }
        return jsonToken.id();
    }

    public JsonToken getLastClearedToken() {
        return this._lastClearedToken;
    }

    public abstract JsonStreamContext getParsingContext();

    public abstract String getText();

    public abstract char[] getTextCharacters();

    public abstract int getTextLength();

    public abstract int getTextOffset();

    public boolean getValueAsBoolean(boolean z10) {
        JsonToken jsonToken = this._currToken;
        if (jsonToken != null) {
            switch (jsonToken.id()) {
                case 6:
                    String trim = getText().trim();
                    if (b.f37475af.equals(trim)) {
                        return true;
                    }
                    if (!b.f37476ag.equals(trim) && !_hasTextualNull(trim)) {
                        return z10;
                    }
                    return false;
                case 7:
                    if (getIntValue() != 0) {
                        return true;
                    }
                    return false;
                case 9:
                    return true;
                case 10:
                case 11:
                    return false;
                case 12:
                    Object embeddedObject = getEmbeddedObject();
                    if (embeddedObject instanceof Boolean) {
                        return ((Boolean) embeddedObject).booleanValue();
                    }
                    break;
            }
        }
        return z10;
    }

    public double getValueAsDouble(double d10) {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == null) {
            return d10;
        }
        switch (jsonToken.id()) {
            case 6:
                String text = getText();
                if (_hasTextualNull(text)) {
                    return 0.0d;
                }
                return NumberInput.parseAsDouble(text, d10);
            case 7:
            case 8:
                return getDoubleValue();
            case 9:
                return 1.0d;
            case 10:
            case 11:
                return 0.0d;
            case 12:
                Object embeddedObject = getEmbeddedObject();
                if (embeddedObject instanceof Number) {
                    return ((Number) embeddedObject).doubleValue();
                }
                return d10;
            default:
                return d10;
        }
    }

    public int getValueAsInt() {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == JsonToken.VALUE_NUMBER_INT || jsonToken == JsonToken.VALUE_NUMBER_FLOAT) {
            return getIntValue();
        }
        return getValueAsInt(0);
    }

    public long getValueAsLong() {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == JsonToken.VALUE_NUMBER_INT || jsonToken == JsonToken.VALUE_NUMBER_FLOAT) {
            return getLongValue();
        }
        return getValueAsLong(0);
    }

    public String getValueAsString() {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == JsonToken.VALUE_STRING) {
            return getText();
        }
        if (jsonToken == JsonToken.FIELD_NAME) {
            return getCurrentName();
        }
        return getValueAsString((String) null);
    }

    public boolean hasCurrentToken() {
        if (this._currToken != null) {
            return true;
        }
        return false;
    }

    public abstract boolean hasTextCharacters();

    public boolean hasToken(JsonToken jsonToken) {
        if (this._currToken == jsonToken) {
            return true;
        }
        return false;
    }

    public boolean hasTokenId(int i10) {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == null) {
            if (i10 == 0) {
                return true;
            }
            return false;
        } else if (jsonToken.id() == i10) {
            return true;
        } else {
            return false;
        }
    }

    public abstract boolean isClosed();

    public boolean isExpectedStartArrayToken() {
        if (this._currToken == JsonToken.START_ARRAY) {
            return true;
        }
        return false;
    }

    public boolean isExpectedStartObjectToken() {
        if (this._currToken == JsonToken.START_OBJECT) {
            return true;
        }
        return false;
    }

    public abstract JsonToken nextToken();

    public JsonToken nextValue() {
        JsonToken nextToken = nextToken();
        if (nextToken == JsonToken.FIELD_NAME) {
            return nextToken();
        }
        return nextToken;
    }

    public abstract void overrideCurrentName(String str);

    public JsonParser skipChildren() {
        JsonToken jsonToken = this._currToken;
        if (jsonToken != JsonToken.START_OBJECT && jsonToken != JsonToken.START_ARRAY) {
            return this;
        }
        int i10 = 1;
        while (true) {
            JsonToken nextToken = nextToken();
            if (nextToken == null) {
                _handleEOF();
                return this;
            } else if (nextToken.isStructStart()) {
                i10++;
            } else if (nextToken.isStructEnd() && i10 - 1 == 0) {
                return this;
            }
        }
    }

    protected ParserMinimalBase(int i10) {
        super(i10);
    }

    /* access modifiers changed from: protected */
    public void _reportInvalidEOF(String str, JsonToken jsonToken) {
        throw new JsonEOFException(this, jsonToken, "Unexpected end-of-input" + str);
    }

    /* access modifiers changed from: protected */
    @Deprecated
    public void _reportInvalidEOF(String str) {
        throw new JsonEOFException(this, (JsonToken) null, "Unexpected end-of-input" + str);
    }

    public int getValueAsInt(int i10) {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == JsonToken.VALUE_NUMBER_INT || jsonToken == JsonToken.VALUE_NUMBER_FLOAT) {
            return getIntValue();
        }
        if (jsonToken == null) {
            return i10;
        }
        int id2 = jsonToken.id();
        if (id2 != 6) {
            switch (id2) {
                case 9:
                    return 1;
                case 10:
                case 11:
                    return 0;
                case 12:
                    Object embeddedObject = getEmbeddedObject();
                    if (embeddedObject instanceof Number) {
                        return ((Number) embeddedObject).intValue();
                    }
                    return i10;
                default:
                    return i10;
            }
        } else {
            String text = getText();
            if (_hasTextualNull(text)) {
                return 0;
            }
            return NumberInput.parseAsInt(text, i10);
        }
    }

    public long getValueAsLong(long j10) {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == JsonToken.VALUE_NUMBER_INT || jsonToken == JsonToken.VALUE_NUMBER_FLOAT) {
            return getLongValue();
        }
        if (jsonToken == null) {
            return j10;
        }
        int id2 = jsonToken.id();
        if (id2 != 6) {
            switch (id2) {
                case 9:
                    return 1;
                case 10:
                case 11:
                    return 0;
                case 12:
                    Object embeddedObject = getEmbeddedObject();
                    if (embeddedObject instanceof Number) {
                        return ((Number) embeddedObject).longValue();
                    }
                    return j10;
                default:
                    return j10;
            }
        } else {
            String text = getText();
            if (_hasTextualNull(text)) {
                return 0;
            }
            return NumberInput.parseAsLong(text, j10);
        }
    }

    public String getValueAsString(String str) {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == JsonToken.VALUE_STRING) {
            return getText();
        }
        if (jsonToken == JsonToken.FIELD_NAME) {
            return getCurrentName();
        }
        return (jsonToken == null || jsonToken == JsonToken.VALUE_NULL || !jsonToken.isScalarValue()) ? str : getText();
    }

    /* access modifiers changed from: protected */
    @Deprecated
    public void _reportInvalidEOFInValue() {
        _reportInvalidEOF(" in a value");
    }
}
