package com.fasterxml.jackson.core.base;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.io.NumberInput;
import com.fasterxml.jackson.core.json.DupDetector;
import com.fasterxml.jackson.core.json.JsonReadContext;
import com.fasterxml.jackson.core.json.PackageVersion;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import com.fasterxml.jackson.core.util.TextBuffer;
import com.google.android.gms.common.api.a;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

public abstract class ParserBase extends ParserMinimalBase {
    static final BigDecimal BD_MAX_INT;
    static final BigDecimal BD_MAX_LONG;
    static final BigDecimal BD_MIN_INT;
    static final BigDecimal BD_MIN_LONG;
    static final BigInteger BI_MAX_INT;
    static final BigInteger BI_MAX_LONG;
    static final BigInteger BI_MIN_INT;
    static final BigInteger BI_MIN_LONG;
    protected static final char CHAR_NULL = '\u0000';
    protected static final int INT_0 = 48;
    protected static final int INT_9 = 57;
    protected static final int INT_MINUS = 45;
    protected static final int INT_PLUS = 43;
    static final double MAX_INT_D = 2.147483647E9d;
    static final long MAX_INT_L = 2147483647L;
    static final double MAX_LONG_D = 9.223372036854776E18d;
    static final double MIN_INT_D = -2.147483648E9d;
    static final long MIN_INT_L = -2147483648L;
    static final double MIN_LONG_D = -9.223372036854776E18d;
    protected static final int NR_BIGDECIMAL = 16;
    protected static final int NR_BIGINT = 4;
    protected static final int NR_DOUBLE = 8;
    protected static final int NR_INT = 1;
    protected static final int NR_LONG = 2;
    protected static final int NR_UNKNOWN = 0;
    protected byte[] _binaryValue;
    protected ByteArrayBuilder _byteArrayBuilder;
    protected boolean _closed;
    protected long _currInputProcessed;
    protected int _currInputRow = 1;
    protected int _currInputRowStart;
    protected int _expLength;
    protected int _fractLength;
    protected int _inputEnd;
    protected int _inputPtr;
    protected int _intLength;
    protected final IOContext _ioContext;
    protected boolean _nameCopied;
    protected char[] _nameCopyBuffer;
    protected JsonToken _nextToken;
    protected int _numTypesValid = 0;
    protected BigDecimal _numberBigDecimal;
    protected BigInteger _numberBigInt;
    protected double _numberDouble;
    protected int _numberInt;
    protected long _numberLong;
    protected boolean _numberNegative;
    protected JsonReadContext _parsingContext;
    protected final TextBuffer _textBuffer;
    protected int _tokenInputCol;
    protected int _tokenInputRow = 1;
    protected long _tokenInputTotal;

    static {
        BigInteger valueOf = BigInteger.valueOf(MIN_INT_L);
        BI_MIN_INT = valueOf;
        BigInteger valueOf2 = BigInteger.valueOf(MAX_INT_L);
        BI_MAX_INT = valueOf2;
        BigInteger valueOf3 = BigInteger.valueOf(Long.MIN_VALUE);
        BI_MIN_LONG = valueOf3;
        BigInteger valueOf4 = BigInteger.valueOf(Long.MAX_VALUE);
        BI_MAX_LONG = valueOf4;
        BD_MIN_LONG = new BigDecimal(valueOf3);
        BD_MAX_LONG = new BigDecimal(valueOf4);
        BD_MIN_INT = new BigDecimal(valueOf);
        BD_MAX_INT = new BigDecimal(valueOf2);
    }

    protected ParserBase(IOContext iOContext, int i10) {
        super(i10);
        DupDetector dupDetector;
        this._ioContext = iOContext;
        this._textBuffer = iOContext.constructTextBuffer();
        if (JsonParser.Feature.STRICT_DUPLICATE_DETECTION.enabledIn(i10)) {
            dupDetector = DupDetector.rootDetector((JsonParser) this);
        } else {
            dupDetector = null;
        }
        this._parsingContext = JsonReadContext.createRootContext(dupDetector);
    }

    private void _parseSlowFloat(int i10) {
        if (i10 == 16) {
            try {
                this._numberBigDecimal = this._textBuffer.contentsAsDecimal();
                this._numTypesValid = 16;
            } catch (NumberFormatException e10) {
                _wrapError("Malformed numeric value '" + this._textBuffer.contentsAsString() + "'", e10);
            }
        } else {
            this._numberDouble = this._textBuffer.contentsAsDouble();
            this._numTypesValid = 8;
        }
    }

    private void _parseSlowInt(int i10, char[] cArr, int i11, int i12) {
        String contentsAsString = this._textBuffer.contentsAsString();
        try {
            if (NumberInput.inLongRange(cArr, i11, i12, this._numberNegative)) {
                this._numberLong = Long.parseLong(contentsAsString);
                this._numTypesValid = 2;
                return;
            }
            this._numberBigInt = new BigInteger(contentsAsString);
            this._numTypesValid = 4;
        } catch (NumberFormatException e10) {
            _wrapError("Malformed numeric value '" + contentsAsString + "'", e10);
        }
    }

    /* access modifiers changed from: protected */
    public void _checkStdFeatureChanges(int i10, int i11) {
        int mask = JsonParser.Feature.STRICT_DUPLICATE_DETECTION.getMask();
        if ((i11 & mask) != 0 && (i10 & mask) != 0) {
            if (this._parsingContext.getDupDetector() == null) {
                this._parsingContext = this._parsingContext.withDupDetector(DupDetector.rootDetector((JsonParser) this));
            } else {
                this._parsingContext = this._parsingContext.withDupDetector((DupDetector) null);
            }
        }
    }

    /* access modifiers changed from: protected */
    public abstract void _closeInput();

    /* access modifiers changed from: protected */
    public final int _decodeBase64Escape(Base64Variant base64Variant, int i10, int i11) {
        if (i10 == 92) {
            char _decodeEscaped = _decodeEscaped();
            if (_decodeEscaped <= ' ' && i11 == 0) {
                return -1;
            }
            int decodeBase64Char = base64Variant.decodeBase64Char((int) _decodeEscaped);
            if (decodeBase64Char >= 0) {
                return decodeBase64Char;
            }
            throw reportInvalidBase64Char(base64Variant, _decodeEscaped, i11);
        }
        throw reportInvalidBase64Char(base64Variant, i10, i11);
    }

    /* access modifiers changed from: protected */
    public char _decodeEscaped() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: protected */
    public final int _eofAsNextChar() {
        _handleEOF();
        return -1;
    }

    /* access modifiers changed from: protected */
    public void _finishString() {
    }

    public ByteArrayBuilder _getByteArrayBuilder() {
        ByteArrayBuilder byteArrayBuilder = this._byteArrayBuilder;
        if (byteArrayBuilder == null) {
            this._byteArrayBuilder = new ByteArrayBuilder();
        } else {
            byteArrayBuilder.reset();
        }
        return this._byteArrayBuilder;
    }

    /* access modifiers changed from: protected */
    public void _handleEOF() {
        String str;
        if (!this._parsingContext.inRoot()) {
            if (this._parsingContext.inArray()) {
                str = "Array";
            } else {
                str = "Object";
            }
            _reportInvalidEOF(String.format(": expected close marker for %s (start marker at %s)", new Object[]{str, this._parsingContext.getStartLocation(this._ioContext.getSourceReference())}), (JsonToken) null);
        }
    }

    /* access modifiers changed from: protected */
    public int _parseIntValue() {
        if (this._currToken == JsonToken.VALUE_NUMBER_INT) {
            char[] textBuffer = this._textBuffer.getTextBuffer();
            int textOffset = this._textBuffer.getTextOffset();
            int i10 = this._intLength;
            if (this._numberNegative) {
                textOffset++;
            }
            if (i10 <= 9) {
                int parseInt = NumberInput.parseInt(textBuffer, textOffset, i10);
                if (this._numberNegative) {
                    parseInt = -parseInt;
                }
                this._numberInt = parseInt;
                this._numTypesValid = 1;
                return parseInt;
            }
        }
        _parseNumericValue(1);
        if ((this._numTypesValid & 1) == 0) {
            convertNumberToInt();
        }
        return this._numberInt;
    }

    /* access modifiers changed from: protected */
    public void _parseNumericValue(int i10) {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == JsonToken.VALUE_NUMBER_INT) {
            char[] textBuffer = this._textBuffer.getTextBuffer();
            int textOffset = this._textBuffer.getTextOffset();
            int i11 = this._intLength;
            if (this._numberNegative) {
                textOffset++;
            }
            if (i11 <= 9) {
                int parseInt = NumberInput.parseInt(textBuffer, textOffset, i11);
                if (this._numberNegative) {
                    parseInt = -parseInt;
                }
                this._numberInt = parseInt;
                this._numTypesValid = 1;
            } else if (i11 <= 18) {
                long parseLong = NumberInput.parseLong(textBuffer, textOffset, i11);
                boolean z10 = this._numberNegative;
                if (z10) {
                    parseLong = -parseLong;
                }
                if (i11 == 10) {
                    if (z10) {
                        if (parseLong >= MIN_INT_L) {
                            this._numberInt = (int) parseLong;
                            this._numTypesValid = 1;
                            return;
                        }
                    } else if (parseLong <= MAX_INT_L) {
                        this._numberInt = (int) parseLong;
                        this._numTypesValid = 1;
                        return;
                    }
                }
                this._numberLong = parseLong;
                this._numTypesValid = 2;
            } else {
                _parseSlowInt(i10, textBuffer, textOffset, i11);
            }
        } else if (jsonToken == JsonToken.VALUE_NUMBER_FLOAT) {
            _parseSlowFloat(i10);
        } else {
            _reportError("Current token (" + this._currToken + ") not numeric, can not use numeric value accessors");
        }
    }

    /* access modifiers changed from: protected */
    public void _releaseBuffers() {
        this._textBuffer.releaseBuffers();
        char[] cArr = this._nameCopyBuffer;
        if (cArr != null) {
            this._nameCopyBuffer = null;
            this._ioContext.releaseNameCopyBuffer(cArr);
        }
    }

    /* access modifiers changed from: protected */
    public void _reportMismatchedEndMarker(int i10, char c10) {
        _reportError("Unexpected close marker '" + ((char) i10) + "': expected '" + c10 + "' (for " + this._parsingContext.typeDesc() + " starting at " + ("" + this._parsingContext.getStartLocation(this._ioContext.getSourceReference())) + ")");
    }

    public void close() {
        if (!this._closed) {
            this._closed = true;
            try {
                _closeInput();
            } finally {
                _releaseBuffers();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void convertNumberToBigDecimal() {
        int i10 = this._numTypesValid;
        if ((i10 & 8) != 0) {
            this._numberBigDecimal = NumberInput.parseBigDecimal(getText());
        } else if ((i10 & 4) != 0) {
            this._numberBigDecimal = new BigDecimal(this._numberBigInt);
        } else if ((i10 & 2) != 0) {
            this._numberBigDecimal = BigDecimal.valueOf(this._numberLong);
        } else if ((i10 & 1) != 0) {
            this._numberBigDecimal = BigDecimal.valueOf((long) this._numberInt);
        } else {
            _throwInternal();
        }
        this._numTypesValid |= 16;
    }

    /* access modifiers changed from: protected */
    public void convertNumberToBigInteger() {
        int i10 = this._numTypesValid;
        if ((i10 & 16) != 0) {
            this._numberBigInt = this._numberBigDecimal.toBigInteger();
        } else if ((i10 & 2) != 0) {
            this._numberBigInt = BigInteger.valueOf(this._numberLong);
        } else if ((i10 & 1) != 0) {
            this._numberBigInt = BigInteger.valueOf((long) this._numberInt);
        } else if ((i10 & 8) != 0) {
            this._numberBigInt = BigDecimal.valueOf(this._numberDouble).toBigInteger();
        } else {
            _throwInternal();
        }
        this._numTypesValid |= 4;
    }

    /* access modifiers changed from: protected */
    public void convertNumberToDouble() {
        int i10 = this._numTypesValid;
        if ((i10 & 16) != 0) {
            this._numberDouble = this._numberBigDecimal.doubleValue();
        } else if ((i10 & 4) != 0) {
            this._numberDouble = this._numberBigInt.doubleValue();
        } else if ((i10 & 2) != 0) {
            this._numberDouble = (double) this._numberLong;
        } else if ((i10 & 1) != 0) {
            this._numberDouble = (double) this._numberInt;
        } else {
            _throwInternal();
        }
        this._numTypesValid |= 8;
    }

    /* access modifiers changed from: protected */
    public void convertNumberToInt() {
        int i10 = this._numTypesValid;
        if ((i10 & 2) != 0) {
            long j10 = this._numberLong;
            int i11 = (int) j10;
            if (((long) i11) != j10) {
                _reportError("Numeric value (" + getText() + ") out of range of int");
            }
            this._numberInt = i11;
        } else if ((i10 & 4) != 0) {
            if (BI_MIN_INT.compareTo(this._numberBigInt) > 0 || BI_MAX_INT.compareTo(this._numberBigInt) < 0) {
                reportOverflowInt();
            }
            this._numberInt = this._numberBigInt.intValue();
        } else if ((i10 & 8) != 0) {
            double d10 = this._numberDouble;
            if (d10 < MIN_INT_D || d10 > MAX_INT_D) {
                reportOverflowInt();
            }
            this._numberInt = (int) this._numberDouble;
        } else if ((i10 & 16) != 0) {
            if (BD_MIN_INT.compareTo(this._numberBigDecimal) > 0 || BD_MAX_INT.compareTo(this._numberBigDecimal) < 0) {
                reportOverflowInt();
            }
            this._numberInt = this._numberBigDecimal.intValue();
        } else {
            _throwInternal();
        }
        this._numTypesValid |= 1;
    }

    /* access modifiers changed from: protected */
    public void convertNumberToLong() {
        int i10 = this._numTypesValid;
        if ((i10 & 1) != 0) {
            this._numberLong = (long) this._numberInt;
        } else if ((i10 & 4) != 0) {
            if (BI_MIN_LONG.compareTo(this._numberBigInt) > 0 || BI_MAX_LONG.compareTo(this._numberBigInt) < 0) {
                reportOverflowLong();
            }
            this._numberLong = this._numberBigInt.longValue();
        } else if ((i10 & 8) != 0) {
            double d10 = this._numberDouble;
            if (d10 < MIN_LONG_D || d10 > MAX_LONG_D) {
                reportOverflowLong();
            }
            this._numberLong = (long) this._numberDouble;
        } else if ((i10 & 16) != 0) {
            if (BD_MIN_LONG.compareTo(this._numberBigDecimal) > 0 || BD_MAX_LONG.compareTo(this._numberBigDecimal) < 0) {
                reportOverflowLong();
            }
            this._numberLong = this._numberBigDecimal.longValue();
        } else {
            _throwInternal();
        }
        this._numTypesValid |= 2;
    }

    public JsonParser disable(JsonParser.Feature feature) {
        this._features &= ~feature.getMask();
        if (feature == JsonParser.Feature.STRICT_DUPLICATE_DETECTION) {
            this._parsingContext = this._parsingContext.withDupDetector((DupDetector) null);
        }
        return this;
    }

    public JsonParser enable(JsonParser.Feature feature) {
        this._features |= feature.getMask();
        if (feature == JsonParser.Feature.STRICT_DUPLICATE_DETECTION && this._parsingContext.getDupDetector() == null) {
            this._parsingContext = this._parsingContext.withDupDetector(DupDetector.rootDetector((JsonParser) this));
        }
        return this;
    }

    public BigInteger getBigIntegerValue() {
        int i10 = this._numTypesValid;
        if ((i10 & 4) == 0) {
            if (i10 == 0) {
                _parseNumericValue(4);
            }
            if ((this._numTypesValid & 4) == 0) {
                convertNumberToBigInteger();
            }
        }
        return this._numberBigInt;
    }

    public byte[] getBinaryValue(Base64Variant base64Variant) {
        if (this._binaryValue == null) {
            if (this._currToken != JsonToken.VALUE_STRING) {
                _reportError("Current token (" + this._currToken + ") not VALUE_STRING, can not access as binary");
            }
            ByteArrayBuilder _getByteArrayBuilder = _getByteArrayBuilder();
            _decodeBase64(getText(), _getByteArrayBuilder, base64Variant);
            this._binaryValue = _getByteArrayBuilder.toByteArray();
        }
        return this._binaryValue;
    }

    public JsonLocation getCurrentLocation() {
        return new JsonLocation(this._ioContext.getSourceReference(), -1, ((long) this._inputPtr) + this._currInputProcessed, this._currInputRow, (this._inputPtr - this._currInputRowStart) + 1);
    }

    public String getCurrentName() {
        JsonReadContext parent;
        JsonToken jsonToken = this._currToken;
        if ((jsonToken == JsonToken.START_OBJECT || jsonToken == JsonToken.START_ARRAY) && (parent = this._parsingContext.getParent()) != null) {
            return parent.getCurrentName();
        }
        return this._parsingContext.getCurrentName();
    }

    public Object getCurrentValue() {
        return this._parsingContext.getCurrentValue();
    }

    public BigDecimal getDecimalValue() {
        int i10 = this._numTypesValid;
        if ((i10 & 16) == 0) {
            if (i10 == 0) {
                _parseNumericValue(16);
            }
            if ((this._numTypesValid & 16) == 0) {
                convertNumberToBigDecimal();
            }
        }
        return this._numberBigDecimal;
    }

    public double getDoubleValue() {
        int i10 = this._numTypesValid;
        if ((i10 & 8) == 0) {
            if (i10 == 0) {
                _parseNumericValue(8);
            }
            if ((this._numTypesValid & 8) == 0) {
                convertNumberToDouble();
            }
        }
        return this._numberDouble;
    }

    public float getFloatValue() {
        return (float) getDoubleValue();
    }

    public int getIntValue() {
        int i10 = this._numTypesValid;
        if ((i10 & 1) == 0) {
            if (i10 == 0) {
                return _parseIntValue();
            }
            if ((i10 & 1) == 0) {
                convertNumberToInt();
            }
        }
        return this._numberInt;
    }

    public long getLongValue() {
        int i10 = this._numTypesValid;
        if ((i10 & 2) == 0) {
            if (i10 == 0) {
                _parseNumericValue(2);
            }
            if ((this._numTypesValid & 2) == 0) {
                convertNumberToLong();
            }
        }
        return this._numberLong;
    }

    public JsonParser.NumberType getNumberType() {
        if (this._numTypesValid == 0) {
            _parseNumericValue(0);
        }
        if (this._currToken == JsonToken.VALUE_NUMBER_INT) {
            int i10 = this._numTypesValid;
            if ((i10 & 1) != 0) {
                return JsonParser.NumberType.INT;
            }
            if ((i10 & 2) != 0) {
                return JsonParser.NumberType.LONG;
            }
            return JsonParser.NumberType.BIG_INTEGER;
        } else if ((this._numTypesValid & 16) != 0) {
            return JsonParser.NumberType.BIG_DECIMAL;
        } else {
            return JsonParser.NumberType.DOUBLE;
        }
    }

    public Number getNumberValue() {
        if (this._numTypesValid == 0) {
            _parseNumericValue(0);
        }
        if (this._currToken == JsonToken.VALUE_NUMBER_INT) {
            int i10 = this._numTypesValid;
            if ((i10 & 1) != 0) {
                return Integer.valueOf(this._numberInt);
            }
            if ((i10 & 2) != 0) {
                return Long.valueOf(this._numberLong);
            }
            if ((i10 & 4) != 0) {
                return this._numberBigInt;
            }
            return this._numberBigDecimal;
        }
        int i11 = this._numTypesValid;
        if ((i11 & 16) != 0) {
            return this._numberBigDecimal;
        }
        if ((i11 & 8) == 0) {
            _throwInternal();
        }
        return Double.valueOf(this._numberDouble);
    }

    public long getTokenCharacterOffset() {
        return this._tokenInputTotal;
    }

    public int getTokenColumnNr() {
        int i10 = this._tokenInputCol;
        if (i10 < 0) {
            return i10;
        }
        return i10 + 1;
    }

    public int getTokenLineNr() {
        return this._tokenInputRow;
    }

    public JsonLocation getTokenLocation() {
        return new JsonLocation(this._ioContext.getSourceReference(), -1, getTokenCharacterOffset(), getTokenLineNr(), getTokenColumnNr());
    }

    public boolean hasTextCharacters() {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == JsonToken.VALUE_STRING) {
            return true;
        }
        if (jsonToken == JsonToken.FIELD_NAME) {
            return this._nameCopied;
        }
        return false;
    }

    public boolean isClosed() {
        return this._closed;
    }

    /* access modifiers changed from: protected */
    @Deprecated
    public boolean loadMore() {
        return false;
    }

    /* access modifiers changed from: protected */
    @Deprecated
    public void loadMoreGuaranteed() {
        if (!loadMore()) {
            _reportInvalidEOF();
        }
    }

    public void overrideCurrentName(String str) {
        JsonReadContext jsonReadContext = this._parsingContext;
        JsonToken jsonToken = this._currToken;
        if (jsonToken == JsonToken.START_OBJECT || jsonToken == JsonToken.START_ARRAY) {
            jsonReadContext = jsonReadContext.getParent();
        }
        try {
            jsonReadContext.setCurrentName(str);
        } catch (IOException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public JsonParser overrideStdFeatures(int i10, int i11) {
        int i12 = this._features;
        int i13 = (i10 & i11) | ((~i11) & i12);
        int i14 = i12 ^ i13;
        if (i14 != 0) {
            this._features = i13;
            _checkStdFeatureChanges(i13, i14);
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public IllegalArgumentException reportInvalidBase64Char(Base64Variant base64Variant, int i10, int i11) {
        return reportInvalidBase64Char(base64Variant, i10, i11, (String) null);
    }

    /* access modifiers changed from: protected */
    public void reportInvalidNumber(String str) {
        _reportError("Invalid numeric value: " + str);
    }

    /* access modifiers changed from: protected */
    public void reportOverflowInt() {
        _reportError(String.format("Numeric value (%s) out of range of int (%d - %s)", new Object[]{getText(), Integer.MIN_VALUE, Integer.valueOf(a.e.API_PRIORITY_OTHER)}));
    }

    /* access modifiers changed from: protected */
    public void reportOverflowLong() {
        _reportError(String.format("Numeric value (%s) out of range of long (%d - %s)", new Object[]{getText(), Long.MIN_VALUE, Long.MAX_VALUE}));
    }

    /* access modifiers changed from: protected */
    public void reportUnexpectedNumberChar(int i10, String str) {
        String str2 = "Unexpected character (" + ParserMinimalBase._getCharDesc(i10) + ") in numeric value";
        if (str != null) {
            str2 = str2 + ": " + str;
        }
        _reportError(str2);
    }

    /* access modifiers changed from: protected */
    public final JsonToken reset(boolean z10, int i10, int i11, int i12) {
        if (i11 >= 1 || i12 >= 1) {
            return resetFloat(z10, i10, i11, i12);
        }
        return resetInt(z10, i10);
    }

    /* access modifiers changed from: protected */
    public final JsonToken resetAsNaN(String str, double d10) {
        this._textBuffer.resetWithString(str);
        this._numberDouble = d10;
        this._numTypesValid = 8;
        return JsonToken.VALUE_NUMBER_FLOAT;
    }

    /* access modifiers changed from: protected */
    public final JsonToken resetFloat(boolean z10, int i10, int i11, int i12) {
        this._numberNegative = z10;
        this._intLength = i10;
        this._fractLength = i11;
        this._expLength = i12;
        this._numTypesValid = 0;
        return JsonToken.VALUE_NUMBER_FLOAT;
    }

    /* access modifiers changed from: protected */
    public final JsonToken resetInt(boolean z10, int i10) {
        this._numberNegative = z10;
        this._intLength = i10;
        this._fractLength = 0;
        this._expLength = 0;
        this._numTypesValid = 0;
        return JsonToken.VALUE_NUMBER_INT;
    }

    public void setCurrentValue(Object obj) {
        this._parsingContext.setCurrentValue(obj);
    }

    @Deprecated
    public JsonParser setFeatureMask(int i10) {
        int i11 = this._features ^ i10;
        if (i11 != 0) {
            this._features = i10;
            _checkStdFeatureChanges(i10, i11);
        }
        return this;
    }

    public Version version() {
        return PackageVersion.VERSION;
    }

    public JsonReadContext getParsingContext() {
        return this._parsingContext;
    }

    /* access modifiers changed from: protected */
    public IllegalArgumentException reportInvalidBase64Char(Base64Variant base64Variant, int i10, int i11, String str) {
        String str2;
        if (i10 <= 32) {
            str2 = "Illegal white space character (code 0x" + Integer.toHexString(i10) + ") as character #" + (i11 + 1) + " of 4-char base64 unit: can only used between units";
        } else if (base64Variant.usesPaddingChar(i10)) {
            str2 = "Unexpected padding character ('" + base64Variant.getPaddingChar() + "') as character #" + (i11 + 1) + " of 4-char base64 unit: padding only legal as 3rd or 4th character";
        } else if (!Character.isDefined(i10) || Character.isISOControl(i10)) {
            str2 = "Illegal character (code 0x" + Integer.toHexString(i10) + ") in base64 content";
        } else {
            str2 = "Illegal character '" + ((char) i10) + "' (code 0x" + Integer.toHexString(i10) + ") in base64 content";
        }
        if (str != null) {
            str2 = str2 + ": " + str;
        }
        return new IllegalArgumentException(str2);
    }

    /* access modifiers changed from: protected */
    public final int _decodeBase64Escape(Base64Variant base64Variant, char c10, int i10) {
        if (c10 == '\\') {
            char _decodeEscaped = _decodeEscaped();
            if (_decodeEscaped <= ' ' && i10 == 0) {
                return -1;
            }
            int decodeBase64Char = base64Variant.decodeBase64Char(_decodeEscaped);
            if (decodeBase64Char >= 0) {
                return decodeBase64Char;
            }
            throw reportInvalidBase64Char(base64Variant, _decodeEscaped, i10);
        }
        throw reportInvalidBase64Char(base64Variant, c10, i10);
    }
}
