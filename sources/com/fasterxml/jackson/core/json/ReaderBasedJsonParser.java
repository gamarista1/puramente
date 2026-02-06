package com.fasterxml.jackson.core.json;

import com.amazon.a.a.o.b;
import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.core.base.ParserBase;
import com.fasterxml.jackson.core.io.CharTypes;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import com.fasterxml.jackson.core.util.TextBuffer;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

public class ReaderBasedJsonParser extends ParserBase {
    protected static final int[] _icLatin1 = CharTypes.getInputCodeLatin1();
    protected boolean _bufferRecyclable;
    protected final int _hashSeed;
    protected char[] _inputBuffer;
    protected int _nameStartCol;
    protected long _nameStartOffset;
    protected int _nameStartRow;
    protected ObjectCodec _objectCodec;
    protected Reader _reader;
    protected final CharsToNameCanonicalizer _symbols;
    protected boolean _tokenIncomplete;

    public ReaderBasedJsonParser(IOContext iOContext, int i10, Reader reader, ObjectCodec objectCodec, CharsToNameCanonicalizer charsToNameCanonicalizer, char[] cArr, int i11, int i12, boolean z10) {
        super(iOContext, i10);
        this._reader = reader;
        this._inputBuffer = cArr;
        this._inputPtr = i11;
        this._inputEnd = i12;
        this._objectCodec = objectCodec;
        this._symbols = charsToNameCanonicalizer;
        this._hashSeed = charsToNameCanonicalizer.hashSeed();
        this._bufferRecyclable = z10;
    }

    private String _handleOddName2(int i10, int i11, int[] iArr) {
        this._textBuffer.resetWithShared(this._inputBuffer, i10, this._inputPtr - i10);
        char[] currentSegment = this._textBuffer.getCurrentSegment();
        int currentSegmentSize = this._textBuffer.getCurrentSegmentSize();
        int length = iArr.length;
        while (true) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                break;
            }
            char c10 = this._inputBuffer[this._inputPtr];
            if (c10 > length) {
                if (!Character.isJavaIdentifierPart(c10)) {
                    break;
                }
            } else if (iArr[c10] != 0) {
                break;
            }
            this._inputPtr++;
            i11 = (i11 * 33) + c10;
            int i12 = currentSegmentSize + 1;
            currentSegment[currentSegmentSize] = c10;
            if (i12 >= currentSegment.length) {
                currentSegment = this._textBuffer.finishCurrentSegment();
                currentSegmentSize = 0;
            } else {
                currentSegmentSize = i12;
            }
        }
        this._textBuffer.setCurrentLength(currentSegmentSize);
        TextBuffer textBuffer = this._textBuffer;
        return this._symbols.findSymbol(textBuffer.getTextBuffer(), textBuffer.getTextOffset(), textBuffer.size(), i11);
    }

    private final void _isNextTokenNameYes(int i10) {
        this._currToken = JsonToken.FIELD_NAME;
        _updateLocation();
        if (i10 == 34) {
            this._tokenIncomplete = true;
            this._nextToken = JsonToken.VALUE_STRING;
        } else if (i10 == 45) {
            this._nextToken = _parseNegNumber();
        } else if (i10 == 91) {
            this._nextToken = JsonToken.START_ARRAY;
        } else if (i10 == 102) {
            _matchToken(b.f37476ag, 1);
            this._nextToken = JsonToken.VALUE_FALSE;
        } else if (i10 == 110) {
            _matchToken("null", 1);
            this._nextToken = JsonToken.VALUE_NULL;
        } else if (i10 == 116) {
            _matchToken(b.f37475af, 1);
            this._nextToken = JsonToken.VALUE_TRUE;
        } else if (i10 != 123) {
            switch (i10) {
                case 48:
                case 49:
                case 50:
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                    this._nextToken = _parsePosNumber(i10);
                    return;
                default:
                    this._nextToken = _handleOddValue(i10);
                    return;
            }
        } else {
            this._nextToken = JsonToken.START_OBJECT;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0028, code lost:
        r0 = r0 + 4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void _matchFalse() {
        /*
            r4 = this;
            int r0 = r4._inputPtr
            int r1 = r0 + 4
            int r2 = r4._inputEnd
            if (r1 >= r2) goto L_0x003b
            char[] r1 = r4._inputBuffer
            char r2 = r1[r0]
            r3 = 97
            if (r2 != r3) goto L_0x003b
            int r2 = r0 + 1
            char r2 = r1[r2]
            r3 = 108(0x6c, float:1.51E-43)
            if (r2 != r3) goto L_0x003b
            int r2 = r0 + 2
            char r2 = r1[r2]
            r3 = 115(0x73, float:1.61E-43)
            if (r2 != r3) goto L_0x003b
            int r2 = r0 + 3
            char r2 = r1[r2]
            r3 = 101(0x65, float:1.42E-43)
            if (r2 != r3) goto L_0x003b
            int r0 = r0 + 4
            char r1 = r1[r0]
            r2 = 48
            if (r1 < r2) goto L_0x0038
            r2 = 93
            if (r1 == r2) goto L_0x0038
            r2 = 125(0x7d, float:1.75E-43)
            if (r1 != r2) goto L_0x003b
        L_0x0038:
            r4._inputPtr = r0
            return
        L_0x003b:
            java.lang.String r0 = "false"
            r1 = 1
            r4._matchToken(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.ReaderBasedJsonParser._matchFalse():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001e, code lost:
        r0 = r0 + 3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void _matchNull() {
        /*
            r4 = this;
            int r0 = r4._inputPtr
            int r1 = r0 + 3
            int r2 = r4._inputEnd
            if (r1 >= r2) goto L_0x0031
            char[] r1 = r4._inputBuffer
            char r2 = r1[r0]
            r3 = 117(0x75, float:1.64E-43)
            if (r2 != r3) goto L_0x0031
            int r2 = r0 + 1
            char r2 = r1[r2]
            r3 = 108(0x6c, float:1.51E-43)
            if (r2 != r3) goto L_0x0031
            int r2 = r0 + 2
            char r2 = r1[r2]
            if (r2 != r3) goto L_0x0031
            int r0 = r0 + 3
            char r1 = r1[r0]
            r2 = 48
            if (r1 < r2) goto L_0x002e
            r2 = 93
            if (r1 == r2) goto L_0x002e
            r2 = 125(0x7d, float:1.75E-43)
            if (r1 != r2) goto L_0x0031
        L_0x002e:
            r4._inputPtr = r0
            return
        L_0x0031:
            java.lang.String r0 = "null"
            r1 = 1
            r4._matchToken(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.ReaderBasedJsonParser._matchNull():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0020, code lost:
        r0 = r0 + 3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void _matchTrue() {
        /*
            r4 = this;
            int r0 = r4._inputPtr
            int r1 = r0 + 3
            int r2 = r4._inputEnd
            if (r1 >= r2) goto L_0x0033
            char[] r1 = r4._inputBuffer
            char r2 = r1[r0]
            r3 = 114(0x72, float:1.6E-43)
            if (r2 != r3) goto L_0x0033
            int r2 = r0 + 1
            char r2 = r1[r2]
            r3 = 117(0x75, float:1.64E-43)
            if (r2 != r3) goto L_0x0033
            int r2 = r0 + 2
            char r2 = r1[r2]
            r3 = 101(0x65, float:1.42E-43)
            if (r2 != r3) goto L_0x0033
            int r0 = r0 + 3
            char r1 = r1[r0]
            r2 = 48
            if (r1 < r2) goto L_0x0030
            r2 = 93
            if (r1 == r2) goto L_0x0030
            r2 = 125(0x7d, float:1.75E-43)
            if (r1 != r2) goto L_0x0033
        L_0x0030:
            r4._inputPtr = r0
            return
        L_0x0033:
            java.lang.String r0 = "true"
            r1 = 1
            r4._matchToken(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.ReaderBasedJsonParser._matchTrue():void");
    }

    private final JsonToken _nextAfterName() {
        this._nameCopied = false;
        JsonToken jsonToken = this._nextToken;
        this._nextToken = null;
        if (jsonToken == JsonToken.START_ARRAY) {
            this._parsingContext = this._parsingContext.createChildArrayContext(this._tokenInputRow, this._tokenInputCol);
        } else if (jsonToken == JsonToken.START_OBJECT) {
            this._parsingContext = this._parsingContext.createChildObjectContext(this._tokenInputRow, this._tokenInputCol);
        }
        this._currToken = jsonToken;
        return jsonToken;
    }

    private final JsonToken _nextTokenNotInObject(int i10) {
        if (i10 == 34) {
            this._tokenIncomplete = true;
            JsonToken jsonToken = JsonToken.VALUE_STRING;
            this._currToken = jsonToken;
            return jsonToken;
        }
        if (i10 != 44) {
            if (i10 == 45) {
                JsonToken _parseNegNumber = _parseNegNumber();
                this._currToken = _parseNegNumber;
                return _parseNegNumber;
            } else if (i10 == 91) {
                this._parsingContext = this._parsingContext.createChildArrayContext(this._tokenInputRow, this._tokenInputCol);
                JsonToken jsonToken2 = JsonToken.START_ARRAY;
                this._currToken = jsonToken2;
                return jsonToken2;
            } else if (i10 != 93) {
                if (i10 == 102) {
                    _matchToken(b.f37476ag, 1);
                    JsonToken jsonToken3 = JsonToken.VALUE_FALSE;
                    this._currToken = jsonToken3;
                    return jsonToken3;
                } else if (i10 == 110) {
                    _matchToken("null", 1);
                    JsonToken jsonToken4 = JsonToken.VALUE_NULL;
                    this._currToken = jsonToken4;
                    return jsonToken4;
                } else if (i10 == 116) {
                    _matchToken(b.f37475af, 1);
                    JsonToken jsonToken5 = JsonToken.VALUE_TRUE;
                    this._currToken = jsonToken5;
                    return jsonToken5;
                } else if (i10 != 123) {
                    switch (i10) {
                        case 48:
                        case 49:
                        case 50:
                        case 51:
                        case 52:
                        case 53:
                        case 54:
                        case 55:
                        case 56:
                        case 57:
                            JsonToken _parsePosNumber = _parsePosNumber(i10);
                            this._currToken = _parsePosNumber;
                            return _parsePosNumber;
                    }
                    JsonToken _handleOddValue = _handleOddValue(i10);
                    this._currToken = _handleOddValue;
                    return _handleOddValue;
                } else {
                    this._parsingContext = this._parsingContext.createChildObjectContext(this._tokenInputRow, this._tokenInputCol);
                    JsonToken jsonToken6 = JsonToken.START_OBJECT;
                    this._currToken = jsonToken6;
                    return jsonToken6;
                }
            }
        }
        if (isEnabled(JsonParser.Feature.ALLOW_MISSING_VALUES)) {
            this._inputPtr--;
            JsonToken jsonToken7 = JsonToken.VALUE_NULL;
            this._currToken = jsonToken7;
            return jsonToken7;
        }
        JsonToken _handleOddValue2 = _handleOddValue(i10);
        this._currToken = _handleOddValue2;
        return _handleOddValue2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0035, code lost:
        if (r10 == 'E') goto L_0x0037;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.fasterxml.jackson.core.JsonToken _parseFloat(int r10, int r11, int r12, boolean r13, int r14) {
        /*
            r9 = this;
            int r0 = r9._inputEnd
            r1 = 46
            r2 = 57
            r3 = 48
            r4 = 0
            if (r10 != r1) goto L_0x002d
            r10 = r4
        L_0x000c:
            if (r12 < r0) goto L_0x0013
            com.fasterxml.jackson.core.JsonToken r10 = r9._parseNumber2(r13, r11)
            return r10
        L_0x0013:
            char[] r1 = r9._inputBuffer
            int r5 = r12 + 1
            char r12 = r1[r12]
            if (r12 < r3) goto L_0x0022
            if (r12 <= r2) goto L_0x001e
            goto L_0x0022
        L_0x001e:
            int r10 = r10 + 1
            r12 = r5
            goto L_0x000c
        L_0x0022:
            if (r10 != 0) goto L_0x0029
            java.lang.String r1 = "Decimal point not followed by a digit"
            r9.reportUnexpectedNumberChar(r12, r1)
        L_0x0029:
            r8 = r12
            r12 = r10
            r10 = r8
            goto L_0x002f
        L_0x002d:
            r5 = r12
            r12 = r4
        L_0x002f:
            r1 = 101(0x65, float:1.42E-43)
            if (r10 == r1) goto L_0x0037
            r1 = 69
            if (r10 != r1) goto L_0x007d
        L_0x0037:
            if (r5 < r0) goto L_0x0040
            r9._inputPtr = r11
            com.fasterxml.jackson.core.JsonToken r10 = r9._parseNumber2(r13, r11)
            return r10
        L_0x0040:
            char[] r10 = r9._inputBuffer
            int r1 = r5 + 1
            char r6 = r10[r5]
            r7 = 45
            if (r6 == r7) goto L_0x0052
            r7 = 43
            if (r6 != r7) goto L_0x004f
            goto L_0x0052
        L_0x004f:
            r5 = r1
            r10 = r6
            goto L_0x005f
        L_0x0052:
            if (r1 < r0) goto L_0x005b
            r9._inputPtr = r11
            com.fasterxml.jackson.core.JsonToken r10 = r9._parseNumber2(r13, r11)
            return r10
        L_0x005b:
            int r5 = r5 + 2
            char r10 = r10[r1]
        L_0x005f:
            if (r10 > r2) goto L_0x0076
            if (r10 < r3) goto L_0x0076
            int r4 = r4 + 1
            if (r5 < r0) goto L_0x006e
            r9._inputPtr = r11
            com.fasterxml.jackson.core.JsonToken r10 = r9._parseNumber2(r13, r11)
            return r10
        L_0x006e:
            char[] r10 = r9._inputBuffer
            int r1 = r5 + 1
            char r10 = r10[r5]
            r5 = r1
            goto L_0x005f
        L_0x0076:
            if (r4 != 0) goto L_0x007d
            java.lang.String r0 = "Exponent indicator not followed by a digit"
            r9.reportUnexpectedNumberChar(r10, r0)
        L_0x007d:
            int r5 = r5 + -1
            r9._inputPtr = r5
            com.fasterxml.jackson.core.json.JsonReadContext r0 = r9._parsingContext
            boolean r0 = r0.inRoot()
            if (r0 == 0) goto L_0x008c
            r9._verifyRootSpace(r10)
        L_0x008c:
            int r5 = r5 - r11
            com.fasterxml.jackson.core.util.TextBuffer r10 = r9._textBuffer
            char[] r0 = r9._inputBuffer
            r10.resetWithShared(r0, r11, r5)
            com.fasterxml.jackson.core.JsonToken r10 = r9.resetFloat(r13, r14, r12, r4)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.ReaderBasedJsonParser._parseFloat(int, int, int, boolean, int):com.fasterxml.jackson.core.JsonToken");
    }

    private String _parseName2(int i10, int i11, int i12) {
        this._textBuffer.resetWithShared(this._inputBuffer, i10, this._inputPtr - i10);
        char[] currentSegment = this._textBuffer.getCurrentSegment();
        int currentSegmentSize = this._textBuffer.getCurrentSegmentSize();
        while (true) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                _reportInvalidEOF(" in field name", JsonToken.FIELD_NAME);
            }
            char[] cArr = this._inputBuffer;
            int i13 = this._inputPtr;
            this._inputPtr = i13 + 1;
            char c10 = cArr[i13];
            if (c10 <= '\\') {
                if (c10 == '\\') {
                    c10 = _decodeEscaped();
                } else if (c10 <= i12) {
                    if (c10 == i12) {
                        this._textBuffer.setCurrentLength(currentSegmentSize);
                        TextBuffer textBuffer = this._textBuffer;
                        return this._symbols.findSymbol(textBuffer.getTextBuffer(), textBuffer.getTextOffset(), textBuffer.size(), i11);
                    } else if (c10 < ' ') {
                        _throwUnquotedSpace(c10, "name");
                    }
                }
            }
            i11 = (i11 * 33) + c10;
            int i14 = currentSegmentSize + 1;
            currentSegment[currentSegmentSize] = c10;
            if (i14 >= currentSegment.length) {
                currentSegment = this._textBuffer.finishCurrentSegment();
                currentSegmentSize = 0;
            } else {
                currentSegmentSize = i14;
            }
        }
    }

    private final JsonToken _parseNumber2(boolean z10, int i10) {
        int i11;
        char c10;
        boolean z11;
        int i12;
        char c11;
        char nextChar;
        int i13;
        if (z10) {
            i10++;
        }
        this._inputPtr = i10;
        char[] emptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        int i14 = 0;
        if (z10) {
            emptyAndGetCurrentSegment[0] = '-';
            i11 = 1;
        } else {
            i11 = 0;
        }
        int i15 = this._inputPtr;
        if (i15 < this._inputEnd) {
            char[] cArr = this._inputBuffer;
            this._inputPtr = i15 + 1;
            c10 = cArr[i15];
        } else {
            c10 = getNextChar("No digit following minus sign", JsonToken.VALUE_NUMBER_INT);
        }
        if (c10 == '0') {
            c10 = _verifyNoLeadingZeroes();
        }
        int i16 = 0;
        while (true) {
            if (c10 >= '0' && c10 <= '9') {
                i16++;
                if (i11 >= emptyAndGetCurrentSegment.length) {
                    emptyAndGetCurrentSegment = this._textBuffer.finishCurrentSegment();
                    i11 = 0;
                }
                int i17 = i11 + 1;
                emptyAndGetCurrentSegment[i11] = c10;
                if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                    c10 = 0;
                    i11 = i17;
                    z11 = true;
                    break;
                }
                char[] cArr2 = this._inputBuffer;
                int i18 = this._inputPtr;
                this._inputPtr = i18 + 1;
                c10 = cArr2[i18];
                i11 = i17;
            } else {
                z11 = false;
            }
        }
        z11 = false;
        if (i16 == 0) {
            return _handleInvalidNumberStart(c10, z10);
        }
        if (c10 == '.') {
            if (i11 >= emptyAndGetCurrentSegment.length) {
                emptyAndGetCurrentSegment = this._textBuffer.finishCurrentSegment();
                i11 = 0;
            }
            emptyAndGetCurrentSegment[i11] = c10;
            int i19 = i11 + 1;
            i12 = 0;
            while (true) {
                if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                    z11 = true;
                    break;
                }
                char[] cArr3 = this._inputBuffer;
                int i20 = this._inputPtr;
                this._inputPtr = i20 + 1;
                c10 = cArr3[i20];
                if (c10 < '0' || c10 > '9') {
                    break;
                }
                i12++;
                if (i11 >= emptyAndGetCurrentSegment.length) {
                    emptyAndGetCurrentSegment = this._textBuffer.finishCurrentSegment();
                    i11 = 0;
                }
                emptyAndGetCurrentSegment[i11] = c10;
                i19 = i11 + 1;
            }
            if (i12 == 0) {
                reportUnexpectedNumberChar(c10, "Decimal point not followed by a digit");
            }
        } else {
            i12 = 0;
        }
        if (c10 == 'e' || c10 == 'E') {
            if (i11 >= emptyAndGetCurrentSegment.length) {
                emptyAndGetCurrentSegment = this._textBuffer.finishCurrentSegment();
                i11 = 0;
            }
            int i21 = i11 + 1;
            emptyAndGetCurrentSegment[i11] = c10;
            int i22 = this._inputPtr;
            if (i22 < this._inputEnd) {
                char[] cArr4 = this._inputBuffer;
                this._inputPtr = i22 + 1;
                c11 = cArr4[i22];
            } else {
                c11 = getNextChar("expected a digit for number exponent");
            }
            if (c11 == '-' || c11 == '+') {
                if (i21 >= emptyAndGetCurrentSegment.length) {
                    emptyAndGetCurrentSegment = this._textBuffer.finishCurrentSegment();
                    i21 = 0;
                }
                int i23 = i21 + 1;
                emptyAndGetCurrentSegment[i21] = c11;
                int i24 = this._inputPtr;
                if (i24 < this._inputEnd) {
                    char[] cArr5 = this._inputBuffer;
                    this._inputPtr = i24 + 1;
                    nextChar = cArr5[i24];
                } else {
                    nextChar = getNextChar("expected a digit for number exponent");
                }
                i21 = i23;
            }
            int i25 = 0;
            char c12 = c11;
            while (true) {
                if (c10 <= '9' && c10 >= '0') {
                    i25++;
                    if (i21 >= emptyAndGetCurrentSegment.length) {
                        emptyAndGetCurrentSegment = this._textBuffer.finishCurrentSegment();
                        i21 = 0;
                    }
                    i13 = i21 + 1;
                    emptyAndGetCurrentSegment[i21] = c10;
                    if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                        i14 = i25;
                        z11 = true;
                        break;
                    }
                    char[] cArr6 = this._inputBuffer;
                    int i26 = this._inputPtr;
                    this._inputPtr = i26 + 1;
                    c12 = cArr6[i26];
                    i21 = i13;
                } else {
                    i14 = i25;
                    i13 = i21;
                }
            }
            i14 = i25;
            i13 = i21;
            if (i14 == 0) {
                reportUnexpectedNumberChar(c10, "Exponent indicator not followed by a digit");
            }
        }
        if (!z11) {
            this._inputPtr--;
            if (this._parsingContext.inRoot()) {
                _verifyRootSpace(c10);
            }
        }
        this._textBuffer.setCurrentLength(i11);
        return reset(z10, i16, i12, i14);
    }

    private final int _skipAfterComma2() {
        char c10;
        while (true) {
            if (this._inputPtr < this._inputEnd || _loadMore()) {
                char[] cArr = this._inputBuffer;
                int i10 = this._inputPtr;
                int i11 = i10 + 1;
                this._inputPtr = i11;
                c10 = cArr[i10];
                if (c10 > ' ') {
                    if (c10 == '/') {
                        _skipComment();
                    } else if (c10 != '#' || !_skipYAMLComment()) {
                        return c10;
                    }
                } else if (c10 < ' ') {
                    if (c10 == 10) {
                        this._currInputRow++;
                        this._currInputRowStart = i11;
                    } else if (c10 == 13) {
                        _skipCR();
                    } else if (c10 != 9) {
                        _throwInvalidSpace(c10);
                    }
                }
            } else {
                throw _constructError("Unexpected end-of-input within/between " + this._parsingContext.typeDesc() + " entries");
            }
        }
        return c10;
    }

    private void _skipCComment() {
        while (true) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                break;
            }
            char[] cArr = this._inputBuffer;
            int i10 = this._inputPtr;
            int i11 = i10 + 1;
            this._inputPtr = i11;
            char c10 = cArr[i10];
            if (c10 <= '*') {
                if (c10 == '*') {
                    if (i11 >= this._inputEnd && !_loadMore()) {
                        break;
                    }
                    char[] cArr2 = this._inputBuffer;
                    int i12 = this._inputPtr;
                    if (cArr2[i12] == '/') {
                        this._inputPtr = i12 + 1;
                        return;
                    }
                } else if (c10 < ' ') {
                    if (c10 == 10) {
                        this._currInputRow++;
                        this._currInputRowStart = i11;
                    } else if (c10 == 13) {
                        _skipCR();
                    } else if (c10 != 9) {
                        _throwInvalidSpace(c10);
                    }
                }
            }
        }
        _reportInvalidEOF(" in a comment", (JsonToken) null);
    }

    private final int _skipColon() {
        int i10 = this._inputPtr;
        if (i10 + 4 >= this._inputEnd) {
            return _skipColon2(false);
        }
        char[] cArr = this._inputBuffer;
        char c10 = cArr[i10];
        if (c10 == ':') {
            int i11 = i10 + 1;
            this._inputPtr = i11;
            char c11 = cArr[i11];
            if (c11 <= ' ') {
                if (c11 == ' ' || c11 == 9) {
                    int i12 = i10 + 2;
                    this._inputPtr = i12;
                    char c12 = cArr[i12];
                    if (c12 > ' ') {
                        if (c12 == '/' || c12 == '#') {
                            return _skipColon2(true);
                        }
                        this._inputPtr = i10 + 3;
                        return c12;
                    }
                }
                return _skipColon2(true);
            } else if (c11 == '/' || c11 == '#') {
                return _skipColon2(true);
            } else {
                this._inputPtr = i10 + 2;
                return c11;
            }
        } else {
            if (c10 == ' ' || c10 == 9) {
                int i13 = i10 + 1;
                this._inputPtr = i13;
                c10 = cArr[i13];
            }
            if (c10 != ':') {
                return _skipColon2(false);
            }
            int i14 = this._inputPtr;
            int i15 = i14 + 1;
            this._inputPtr = i15;
            char c13 = cArr[i15];
            if (c13 <= ' ') {
                if (c13 == ' ' || c13 == 9) {
                    int i16 = i14 + 2;
                    this._inputPtr = i16;
                    char c14 = cArr[i16];
                    if (c14 > ' ') {
                        if (c14 == '/' || c14 == '#') {
                            return _skipColon2(true);
                        }
                        this._inputPtr = i14 + 3;
                        return c14;
                    }
                }
                return _skipColon2(true);
            } else if (c13 == '/' || c13 == '#') {
                return _skipColon2(true);
            } else {
                this._inputPtr = i14 + 2;
                return c13;
            }
        }
    }

    private final int _skipColon2(boolean z10) {
        while (true) {
            if (this._inputPtr < this._inputEnd || _loadMore()) {
                char[] cArr = this._inputBuffer;
                int i10 = this._inputPtr;
                int i11 = i10 + 1;
                this._inputPtr = i11;
                char c10 = cArr[i10];
                if (c10 > ' ') {
                    if (c10 == '/') {
                        _skipComment();
                    } else if (c10 != '#' || !_skipYAMLComment()) {
                        if (z10) {
                            return c10;
                        }
                        if (c10 != ':') {
                            _reportUnexpectedChar(c10, "was expecting a colon to separate field name and value");
                        }
                        z10 = true;
                    }
                } else if (c10 < ' ') {
                    if (c10 == 10) {
                        this._currInputRow++;
                        this._currInputRowStart = i11;
                    } else if (c10 == 13) {
                        _skipCR();
                    } else if (c10 != 9) {
                        _throwInvalidSpace(c10);
                    }
                }
            } else {
                _reportInvalidEOF(" within/between " + this._parsingContext.typeDesc() + " entries", (JsonToken) null);
                return -1;
            }
        }
    }

    private final int _skipColonFast(int i10) {
        boolean z10;
        char[] cArr = this._inputBuffer;
        int i11 = i10 + 1;
        char c10 = cArr[i10];
        if (c10 == ':') {
            int i12 = i10 + 2;
            char c11 = cArr[i11];
            if (c11 > ' ') {
                if (!(c11 == '/' || c11 == '#')) {
                    this._inputPtr = i12;
                    return c11;
                }
            } else if (c11 == ' ' || c11 == 9) {
                int i13 = i10 + 3;
                char c12 = cArr[i12];
                if (c12 <= ' ' || c12 == '/' || c12 == '#') {
                    i12 = i13;
                } else {
                    this._inputPtr = i13;
                    return c12;
                }
            }
            this._inputPtr = i12 - 1;
            return _skipColon2(true);
        }
        if (c10 == ' ' || c10 == 9) {
            c10 = cArr[i11];
            i11 = i10 + 2;
        }
        if (c10 == ':') {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            int i14 = i11 + 1;
            char c13 = cArr[i11];
            if (c13 > ' ') {
                if (!(c13 == '/' || c13 == '#')) {
                    this._inputPtr = i14;
                    return c13;
                }
            } else if (c13 == ' ' || c13 == 9) {
                i11 += 2;
                char c14 = cArr[i14];
                if (!(c14 <= ' ' || c14 == '/' || c14 == '#')) {
                    this._inputPtr = i11;
                    return c14;
                }
            }
            i11 = i14;
        }
        this._inputPtr = i11 - 1;
        return _skipColon2(z10);
    }

    private final int _skipComma(int i10) {
        if (i10 != 44) {
            _reportUnexpectedChar(i10, "was expecting comma to separate " + this._parsingContext.typeDesc() + " entries");
        }
        while (true) {
            int i11 = this._inputPtr;
            if (i11 >= this._inputEnd) {
                return _skipAfterComma2();
            }
            char[] cArr = this._inputBuffer;
            int i12 = i11 + 1;
            this._inputPtr = i12;
            char c10 = cArr[i11];
            if (c10 > ' ') {
                if (c10 != '/' && c10 != '#') {
                    return c10;
                }
                this._inputPtr = i11;
                return _skipAfterComma2();
            } else if (c10 < ' ') {
                if (c10 == 10) {
                    this._currInputRow++;
                    this._currInputRowStart = i12;
                } else if (c10 == 13) {
                    _skipCR();
                } else if (c10 != 9) {
                    _throwInvalidSpace(c10);
                }
            }
        }
    }

    private void _skipComment() {
        if (!isEnabled(JsonParser.Feature.ALLOW_COMMENTS)) {
            _reportUnexpectedChar(47, "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_COMMENTS' not enabled for parser)");
        }
        if (this._inputPtr >= this._inputEnd && !_loadMore()) {
            _reportInvalidEOF(" in a comment", (JsonToken) null);
        }
        char[] cArr = this._inputBuffer;
        int i10 = this._inputPtr;
        this._inputPtr = i10 + 1;
        char c10 = cArr[i10];
        if (c10 == '/') {
            _skipLine();
        } else if (c10 == '*') {
            _skipCComment();
        } else {
            _reportUnexpectedChar(c10, "was expecting either '*' or '/' for a comment");
        }
    }

    private void _skipLine() {
        while (true) {
            if (this._inputPtr < this._inputEnd || _loadMore()) {
                char[] cArr = this._inputBuffer;
                int i10 = this._inputPtr;
                int i11 = i10 + 1;
                this._inputPtr = i11;
                char c10 = cArr[i10];
                if (c10 < ' ') {
                    if (c10 == 10) {
                        this._currInputRow++;
                        this._currInputRowStart = i11;
                        return;
                    } else if (c10 == 13) {
                        _skipCR();
                        return;
                    } else if (c10 != 9) {
                        _throwInvalidSpace(c10);
                    }
                }
            } else {
                return;
            }
        }
    }

    private final int _skipWSOrEnd() {
        if (this._inputPtr >= this._inputEnd && !_loadMore()) {
            return _eofAsNextChar();
        }
        char[] cArr = this._inputBuffer;
        int i10 = this._inputPtr;
        int i11 = i10 + 1;
        this._inputPtr = i11;
        char c10 = cArr[i10];
        if (c10 <= ' ') {
            if (c10 != ' ') {
                if (c10 == 10) {
                    this._currInputRow++;
                    this._currInputRowStart = i11;
                } else if (c10 == 13) {
                    _skipCR();
                } else if (c10 != 9) {
                    _throwInvalidSpace(c10);
                }
            }
            while (true) {
                int i12 = this._inputPtr;
                if (i12 >= this._inputEnd) {
                    return _skipWSOrEnd2();
                }
                char[] cArr2 = this._inputBuffer;
                int i13 = i12 + 1;
                this._inputPtr = i13;
                char c11 = cArr2[i12];
                if (c11 > ' ') {
                    if (c11 != '/' && c11 != '#') {
                        return c11;
                    }
                    this._inputPtr = i12;
                    return _skipWSOrEnd2();
                } else if (c11 != ' ') {
                    if (c11 == 10) {
                        this._currInputRow++;
                        this._currInputRowStart = i13;
                    } else if (c11 == 13) {
                        _skipCR();
                    } else if (c11 != 9) {
                        _throwInvalidSpace(c11);
                    }
                }
            }
        } else if (c10 != '/' && c10 != '#') {
            return c10;
        } else {
            this._inputPtr = i10;
            return _skipWSOrEnd2();
        }
    }

    private int _skipWSOrEnd2() {
        char c10;
        while (true) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                return _eofAsNextChar();
            }
            char[] cArr = this._inputBuffer;
            int i10 = this._inputPtr;
            int i11 = i10 + 1;
            this._inputPtr = i11;
            c10 = cArr[i10];
            if (c10 > ' ') {
                if (c10 == '/') {
                    _skipComment();
                } else if (c10 != '#' || !_skipYAMLComment()) {
                    return c10;
                }
            } else if (c10 != ' ') {
                if (c10 == 10) {
                    this._currInputRow++;
                    this._currInputRowStart = i11;
                } else if (c10 == 13) {
                    _skipCR();
                } else if (c10 != 9) {
                    _throwInvalidSpace(c10);
                }
            }
        }
        return c10;
    }

    private boolean _skipYAMLComment() {
        if (!isEnabled(JsonParser.Feature.ALLOW_YAML_COMMENTS)) {
            return false;
        }
        _skipLine();
        return true;
    }

    private final void _updateLocation() {
        int i10 = this._inputPtr;
        this._tokenInputTotal = this._currInputProcessed + ((long) i10);
        this._tokenInputRow = this._currInputRow;
        this._tokenInputCol = i10 - this._currInputRowStart;
    }

    private final void _updateNameLocation() {
        int i10 = this._inputPtr;
        this._nameStartOffset = (long) i10;
        this._nameStartRow = this._currInputRow;
        this._nameStartCol = i10 - this._currInputRowStart;
    }

    private char _verifyNLZ2() {
        char c10;
        if ((this._inputPtr >= this._inputEnd && !_loadMore()) || (c10 = this._inputBuffer[this._inputPtr]) < '0' || c10 > '9') {
            return '0';
        }
        if (!isEnabled(JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS)) {
            reportInvalidNumber("Leading zeroes not allowed");
        }
        this._inputPtr++;
        if (c10 == '0') {
            do {
                if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                    break;
                }
                char[] cArr = this._inputBuffer;
                int i10 = this._inputPtr;
                c10 = cArr[i10];
                if (c10 < '0' || c10 > '9') {
                    return '0';
                }
                this._inputPtr = i10 + 1;
            } while (c10 == '0');
        }
        return c10;
    }

    private final char _verifyNoLeadingZeroes() {
        char c10;
        int i10 = this._inputPtr;
        if (i10 >= this._inputEnd || ((c10 = this._inputBuffer[i10]) >= '0' && c10 <= '9')) {
            return _verifyNLZ2();
        }
        return '0';
    }

    private final void _verifyRootSpace(int i10) {
        int i11 = this._inputPtr + 1;
        this._inputPtr = i11;
        if (i10 == 9) {
            return;
        }
        if (i10 == 10) {
            this._currInputRow++;
            this._currInputRowStart = i11;
        } else if (i10 == 13) {
            _skipCR();
        } else if (i10 != 32) {
            _reportMissingRootWS(i10);
        }
    }

    /* access modifiers changed from: protected */
    public void _closeInput() {
        if (this._reader != null) {
            if (this._ioContext.isResourceManaged() || isEnabled(JsonParser.Feature.AUTO_CLOSE_SOURCE)) {
                this._reader.close();
            }
            this._reader = null;
        }
    }

    /* access modifiers changed from: protected */
    public byte[] _decodeBase64(Base64Variant base64Variant) {
        ByteArrayBuilder _getByteArrayBuilder = _getByteArrayBuilder();
        while (true) {
            if (this._inputPtr >= this._inputEnd) {
                _loadMoreGuaranteed();
            }
            char[] cArr = this._inputBuffer;
            int i10 = this._inputPtr;
            this._inputPtr = i10 + 1;
            char c10 = cArr[i10];
            if (c10 > ' ') {
                int decodeBase64Char = base64Variant.decodeBase64Char(c10);
                if (decodeBase64Char < 0) {
                    if (c10 == '\"') {
                        return _getByteArrayBuilder.toByteArray();
                    }
                    decodeBase64Char = _decodeBase64Escape(base64Variant, c10, 0);
                    if (decodeBase64Char < 0) {
                        continue;
                    }
                }
                if (this._inputPtr >= this._inputEnd) {
                    _loadMoreGuaranteed();
                }
                char[] cArr2 = this._inputBuffer;
                int i11 = this._inputPtr;
                this._inputPtr = i11 + 1;
                char c11 = cArr2[i11];
                int decodeBase64Char2 = base64Variant.decodeBase64Char(c11);
                if (decodeBase64Char2 < 0) {
                    decodeBase64Char2 = _decodeBase64Escape(base64Variant, c11, 1);
                }
                int i12 = (decodeBase64Char << 6) | decodeBase64Char2;
                if (this._inputPtr >= this._inputEnd) {
                    _loadMoreGuaranteed();
                }
                char[] cArr3 = this._inputBuffer;
                int i13 = this._inputPtr;
                this._inputPtr = i13 + 1;
                char c12 = cArr3[i13];
                int decodeBase64Char3 = base64Variant.decodeBase64Char(c12);
                if (decodeBase64Char3 < 0) {
                    if (decodeBase64Char3 != -2) {
                        if (c12 != '\"' || base64Variant.usesPadding()) {
                            decodeBase64Char3 = _decodeBase64Escape(base64Variant, c12, 2);
                        } else {
                            _getByteArrayBuilder.append(i12 >> 4);
                            return _getByteArrayBuilder.toByteArray();
                        }
                    }
                    if (decodeBase64Char3 == -2) {
                        if (this._inputPtr >= this._inputEnd) {
                            _loadMoreGuaranteed();
                        }
                        char[] cArr4 = this._inputBuffer;
                        int i14 = this._inputPtr;
                        this._inputPtr = i14 + 1;
                        char c13 = cArr4[i14];
                        if (base64Variant.usesPaddingChar(c13)) {
                            _getByteArrayBuilder.append(i12 >> 4);
                        } else {
                            throw reportInvalidBase64Char(base64Variant, c13, 3, "expected padding character '" + base64Variant.getPaddingChar() + "'");
                        }
                    }
                }
                int i15 = (i12 << 6) | decodeBase64Char3;
                if (this._inputPtr >= this._inputEnd) {
                    _loadMoreGuaranteed();
                }
                char[] cArr5 = this._inputBuffer;
                int i16 = this._inputPtr;
                this._inputPtr = i16 + 1;
                char c14 = cArr5[i16];
                int decodeBase64Char4 = base64Variant.decodeBase64Char(c14);
                if (decodeBase64Char4 < 0) {
                    if (decodeBase64Char4 != -2) {
                        if (c14 != '\"' || base64Variant.usesPadding()) {
                            decodeBase64Char4 = _decodeBase64Escape(base64Variant, c14, 3);
                        } else {
                            _getByteArrayBuilder.appendTwoBytes(i15 >> 2);
                            return _getByteArrayBuilder.toByteArray();
                        }
                    }
                    if (decodeBase64Char4 == -2) {
                        _getByteArrayBuilder.appendTwoBytes(i15 >> 2);
                    }
                }
                _getByteArrayBuilder.appendThreeBytes((i15 << 6) | decodeBase64Char4);
            }
        }
    }

    /* access modifiers changed from: protected */
    public char _decodeEscaped() {
        if (this._inputPtr >= this._inputEnd && !_loadMore()) {
            _reportInvalidEOF(" in character escape sequence", JsonToken.VALUE_STRING);
        }
        char[] cArr = this._inputBuffer;
        int i10 = this._inputPtr;
        this._inputPtr = i10 + 1;
        char c10 = cArr[i10];
        if (c10 == '\"' || c10 == '/' || c10 == '\\') {
            return c10;
        }
        if (c10 == 'b') {
            return 8;
        }
        if (c10 == 'f') {
            return 12;
        }
        if (c10 == 'n') {
            return 10;
        }
        if (c10 == 'r') {
            return 13;
        }
        if (c10 == 't') {
            return 9;
        }
        if (c10 != 'u') {
            return _handleUnrecognizedCharacterEscape(c10);
        }
        int i11 = 0;
        for (int i12 = 0; i12 < 4; i12++) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                _reportInvalidEOF(" in character escape sequence", JsonToken.VALUE_STRING);
            }
            char[] cArr2 = this._inputBuffer;
            int i13 = this._inputPtr;
            this._inputPtr = i13 + 1;
            char c11 = cArr2[i13];
            int charToHex = CharTypes.charToHex(c11);
            if (charToHex < 0) {
                _reportUnexpectedChar(c11, "expected a hex-digit for character escape sequence");
            }
            i11 = (i11 << 4) | charToHex;
        }
        return (char) i11;
    }

    /* access modifiers changed from: protected */
    public final void _finishString() {
        int i10 = this._inputPtr;
        int i11 = this._inputEnd;
        if (i10 < i11) {
            int[] iArr = _icLatin1;
            int length = iArr.length;
            while (true) {
                char[] cArr = this._inputBuffer;
                char c10 = cArr[i10];
                if (c10 >= length || iArr[c10] == 0) {
                    i10++;
                    if (i10 >= i11) {
                        break;
                    }
                } else if (c10 == '\"') {
                    TextBuffer textBuffer = this._textBuffer;
                    int i12 = this._inputPtr;
                    textBuffer.resetWithShared(cArr, i12, i10 - i12);
                    this._inputPtr = i10 + 1;
                    return;
                }
            }
        }
        TextBuffer textBuffer2 = this._textBuffer;
        char[] cArr2 = this._inputBuffer;
        int i13 = this._inputPtr;
        textBuffer2.resetWithCopy(cArr2, i13, i10 - i13);
        this._inputPtr = i10;
        _finishString2();
    }

    /* access modifiers changed from: protected */
    public void _finishString2() {
        char[] currentSegment = this._textBuffer.getCurrentSegment();
        int currentSegmentSize = this._textBuffer.getCurrentSegmentSize();
        int[] iArr = _icLatin1;
        int length = iArr.length;
        while (true) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                _reportInvalidEOF(": was expecting closing quote for a string value", JsonToken.VALUE_STRING);
            }
            char[] cArr = this._inputBuffer;
            int i10 = this._inputPtr;
            this._inputPtr = i10 + 1;
            char c10 = cArr[i10];
            if (c10 < length && iArr[c10] != 0) {
                if (c10 == '\"') {
                    this._textBuffer.setCurrentLength(currentSegmentSize);
                    return;
                } else if (c10 == '\\') {
                    c10 = _decodeEscaped();
                } else if (c10 < ' ') {
                    _throwUnquotedSpace(c10, "string value");
                }
            }
            if (currentSegmentSize >= currentSegment.length) {
                currentSegment = this._textBuffer.finishCurrentSegment();
                currentSegmentSize = 0;
            }
            currentSegment[currentSegmentSize] = c10;
            currentSegmentSize++;
        }
    }

    /* access modifiers changed from: protected */
    public final String _getText2(JsonToken jsonToken) {
        if (jsonToken == null) {
            return null;
        }
        int id2 = jsonToken.id();
        if (id2 == 5) {
            return this._parsingContext.getCurrentName();
        }
        if (id2 == 6 || id2 == 7 || id2 == 8) {
            return this._textBuffer.contentsAsString();
        }
        return jsonToken.asString();
    }

    /* access modifiers changed from: protected */
    public JsonToken _handleApos() {
        char[] emptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        int currentSegmentSize = this._textBuffer.getCurrentSegmentSize();
        while (true) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                _reportInvalidEOF(": was expecting closing quote for a string value", JsonToken.VALUE_STRING);
            }
            char[] cArr = this._inputBuffer;
            int i10 = this._inputPtr;
            this._inputPtr = i10 + 1;
            char c10 = cArr[i10];
            if (c10 <= '\\') {
                if (c10 == '\\') {
                    c10 = _decodeEscaped();
                } else if (c10 <= '\'') {
                    if (c10 == '\'') {
                        this._textBuffer.setCurrentLength(currentSegmentSize);
                        return JsonToken.VALUE_STRING;
                    } else if (c10 < ' ') {
                        _throwUnquotedSpace(c10, "string value");
                    }
                }
            }
            if (currentSegmentSize >= emptyAndGetCurrentSegment.length) {
                emptyAndGetCurrentSegment = this._textBuffer.finishCurrentSegment();
                currentSegmentSize = 0;
            }
            emptyAndGetCurrentSegment[currentSegmentSize] = c10;
            currentSegmentSize++;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, char], vars: [r9v0 ?, r9v1 ?, r9v5 ?]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:102)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:78)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:69)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:32)
        */
    protected com.fasterxml.jackson.core.JsonToken _handleInvalidNumberStart(
/*
Method generation error in method: com.fasterxml.jackson.core.json.ReaderBasedJsonParser._handleInvalidNumberStart(int, boolean):com.fasterxml.jackson.core.JsonToken, dex: classes2.dex
    jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r9v0 ?
    	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:189)
    	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:157)
    	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:129)
    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
    	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
    	at java.util.ArrayList.forEach(ArrayList.java:1259)
    	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
    	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
    	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
    	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
    	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
    	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
    	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
    	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
    
*/

    /* access modifiers changed from: protected */
    public String _handleOddName(int i10) {
        boolean z10;
        if (i10 == 39 && isEnabled(JsonParser.Feature.ALLOW_SINGLE_QUOTES)) {
            return _parseAposName();
        }
        if (!isEnabled(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES)) {
            _reportUnexpectedChar(i10, "was expecting double-quote to start field name");
        }
        int[] inputCodeLatin1JsNames = CharTypes.getInputCodeLatin1JsNames();
        int length = inputCodeLatin1JsNames.length;
        if (i10 >= length) {
            z10 = Character.isJavaIdentifierPart((char) i10);
        } else if (inputCodeLatin1JsNames[i10] == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            _reportUnexpectedChar(i10, "was expecting either valid name character (for unquoted name) or double-quote (for quoted) to start field name");
        }
        int i11 = this._inputPtr;
        int i12 = this._hashSeed;
        int i13 = this._inputEnd;
        if (i11 < i13) {
            do {
                char[] cArr = this._inputBuffer;
                char c10 = cArr[i11];
                if (c10 < length) {
                    if (inputCodeLatin1JsNames[c10] != 0) {
                        int i14 = this._inputPtr - 1;
                        this._inputPtr = i11;
                        return this._symbols.findSymbol(cArr, i14, i11 - i14, i12);
                    }
                } else if (!Character.isJavaIdentifierPart((char) c10)) {
                    int i15 = this._inputPtr - 1;
                    this._inputPtr = i11;
                    return this._symbols.findSymbol(this._inputBuffer, i15, i11 - i15, i12);
                }
                i12 = (i12 * 33) + c10;
                i11++;
            } while (i11 < i13);
        }
        this._inputPtr = i11;
        return _handleOddName2(this._inputPtr - 1, i12, inputCodeLatin1JsNames);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0017, code lost:
        if (r4 != 44) goto L_0x0096;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0042, code lost:
        if (r3._parsingContext.inArray() == false) goto L_0x0096;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.fasterxml.jackson.core.JsonToken _handleOddValue(int r4) {
        /*
            r3 = this;
            r0 = 39
            if (r4 == r0) goto L_0x0089
            r0 = 73
            r1 = 1
            if (r4 == r0) goto L_0x006f
            r0 = 78
            if (r4 == r0) goto L_0x0055
            r0 = 93
            if (r4 == r0) goto L_0x003c
            r0 = 43
            if (r4 == r0) goto L_0x001b
            r0 = 44
            if (r4 == r0) goto L_0x0045
            goto L_0x0096
        L_0x001b:
            int r4 = r3._inputPtr
            int r0 = r3._inputEnd
            if (r4 < r0) goto L_0x002c
            boolean r4 = r3._loadMore()
            if (r4 != 0) goto L_0x002c
            com.fasterxml.jackson.core.JsonToken r4 = com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_INT
            r3._reportInvalidEOFInValue(r4)
        L_0x002c:
            char[] r4 = r3._inputBuffer
            int r0 = r3._inputPtr
            int r1 = r0 + 1
            r3._inputPtr = r1
            char r4 = r4[r0]
            r0 = 0
            com.fasterxml.jackson.core.JsonToken r4 = r3._handleInvalidNumberStart(r4, r0)
            return r4
        L_0x003c:
            com.fasterxml.jackson.core.json.JsonReadContext r0 = r3._parsingContext
            boolean r0 = r0.inArray()
            if (r0 != 0) goto L_0x0045
            goto L_0x0096
        L_0x0045:
            com.fasterxml.jackson.core.JsonParser$Feature r0 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_MISSING_VALUES
            boolean r0 = r3.isEnabled(r0)
            if (r0 == 0) goto L_0x0096
            int r4 = r3._inputPtr
            int r4 = r4 - r1
            r3._inputPtr = r4
            com.fasterxml.jackson.core.JsonToken r4 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL
            return r4
        L_0x0055:
            java.lang.String r0 = "NaN"
            r3._matchToken(r0, r1)
            com.fasterxml.jackson.core.JsonParser$Feature r1 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS
            boolean r1 = r3.isEnabled(r1)
            if (r1 == 0) goto L_0x0069
            r1 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            com.fasterxml.jackson.core.JsonToken r4 = r3.resetAsNaN(r0, r1)
            return r4
        L_0x0069:
            java.lang.String r0 = "Non-standard token 'NaN': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow"
            r3._reportError(r0)
            goto L_0x0096
        L_0x006f:
            java.lang.String r0 = "Infinity"
            r3._matchToken(r0, r1)
            com.fasterxml.jackson.core.JsonParser$Feature r1 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS
            boolean r1 = r3.isEnabled(r1)
            if (r1 == 0) goto L_0x0083
            r1 = 9218868437227405312(0x7ff0000000000000, double:Infinity)
            com.fasterxml.jackson.core.JsonToken r4 = r3.resetAsNaN(r0, r1)
            return r4
        L_0x0083:
            java.lang.String r0 = "Non-standard token 'Infinity': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow"
            r3._reportError(r0)
            goto L_0x0096
        L_0x0089:
            com.fasterxml.jackson.core.JsonParser$Feature r0 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_SINGLE_QUOTES
            boolean r0 = r3.isEnabled(r0)
            if (r0 == 0) goto L_0x0096
            com.fasterxml.jackson.core.JsonToken r4 = r3._handleApos()
            return r4
        L_0x0096:
            boolean r0 = java.lang.Character.isJavaIdentifierStart(r4)
            if (r0 == 0) goto L_0x00b3
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = ""
            r0.append(r1)
            char r1 = (char) r4
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "('true', 'false' or 'null')"
            r3._reportInvalidToken(r0, r1)
        L_0x00b3:
            java.lang.String r0 = "expected a valid value (number, String, array, object, 'true', 'false' or 'null')"
            r3._reportUnexpectedChar(r4, r0)
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.ReaderBasedJsonParser._handleOddValue(int):com.fasterxml.jackson.core.JsonToken");
    }

    /* access modifiers changed from: protected */
    public boolean _isNextTokenNameMaybe(int i10, String str) {
        String str2;
        JsonToken jsonToken;
        if (i10 == 34) {
            str2 = _parseName();
        } else {
            str2 = _handleOddName(i10);
        }
        this._parsingContext.setCurrentName(str2);
        this._currToken = JsonToken.FIELD_NAME;
        int _skipColon = _skipColon();
        _updateLocation();
        if (_skipColon == 34) {
            this._tokenIncomplete = true;
            this._nextToken = JsonToken.VALUE_STRING;
            return str.equals(str2);
        }
        if (_skipColon == 45) {
            jsonToken = _parseNegNumber();
        } else if (_skipColon == 91) {
            jsonToken = JsonToken.START_ARRAY;
        } else if (_skipColon == 102) {
            _matchFalse();
            jsonToken = JsonToken.VALUE_FALSE;
        } else if (_skipColon == 110) {
            _matchNull();
            jsonToken = JsonToken.VALUE_NULL;
        } else if (_skipColon == 116) {
            _matchTrue();
            jsonToken = JsonToken.VALUE_TRUE;
        } else if (_skipColon != 123) {
            switch (_skipColon) {
                case 48:
                case 49:
                case 50:
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                    jsonToken = _parsePosNumber(_skipColon);
                    break;
                default:
                    jsonToken = _handleOddValue(_skipColon);
                    break;
            }
        } else {
            jsonToken = JsonToken.START_OBJECT;
        }
        this._nextToken = jsonToken;
        return str.equals(str2);
    }

    /* access modifiers changed from: protected */
    public boolean _loadMore() {
        int i10 = this._inputEnd;
        long j10 = (long) i10;
        this._currInputProcessed += j10;
        this._currInputRowStart -= i10;
        this._nameStartOffset -= j10;
        Reader reader = this._reader;
        if (reader != null) {
            char[] cArr = this._inputBuffer;
            int read = reader.read(cArr, 0, cArr.length);
            if (read > 0) {
                this._inputPtr = 0;
                this._inputEnd = read;
                return true;
            }
            _closeInput();
            if (read == 0) {
                throw new IOException("Reader returned 0 characters when trying to read " + this._inputEnd);
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void _loadMoreGuaranteed() {
        if (!_loadMore()) {
            _reportInvalidEOF();
        }
    }

    /* access modifiers changed from: protected */
    public final void _matchToken(String str, int i10) {
        int i11;
        char c10;
        int length = str.length();
        do {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                _reportInvalidToken(str.substring(0, i10));
            }
            if (this._inputBuffer[this._inputPtr] != str.charAt(i10)) {
                _reportInvalidToken(str.substring(0, i10));
            }
            i11 = this._inputPtr + 1;
            this._inputPtr = i11;
            i10++;
        } while (i10 < length);
        if ((i11 < this._inputEnd || _loadMore()) && (c10 = this._inputBuffer[this._inputPtr]) >= '0' && c10 != ']' && c10 != '}' && Character.isJavaIdentifierPart(c10)) {
            _reportInvalidToken(str.substring(0, i10));
        }
    }

    /* access modifiers changed from: protected */
    public String _parseAposName() {
        int i10 = this._inputPtr;
        int i11 = this._hashSeed;
        int i12 = this._inputEnd;
        if (i10 < i12) {
            int[] iArr = _icLatin1;
            int length = iArr.length;
            do {
                char[] cArr = this._inputBuffer;
                char c10 = cArr[i10];
                if (c10 != '\'') {
                    if (c10 < length && iArr[c10] != 0) {
                        break;
                    }
                    i11 = (i11 * 33) + c10;
                    i10++;
                } else {
                    int i13 = this._inputPtr;
                    this._inputPtr = i10 + 1;
                    return this._symbols.findSymbol(cArr, i13, i10 - i13, i11);
                }
            } while (i10 < i12);
        }
        int i14 = this._inputPtr;
        this._inputPtr = i10;
        return _parseName2(i14, i11, 39);
    }

    /* access modifiers changed from: protected */
    public final String _parseName() {
        int i10 = this._inputPtr;
        int i11 = this._hashSeed;
        int[] iArr = _icLatin1;
        while (true) {
            if (i10 >= this._inputEnd) {
                break;
            }
            char[] cArr = this._inputBuffer;
            char c10 = cArr[i10];
            if (c10 >= iArr.length || iArr[c10] == 0) {
                i11 = (i11 * 33) + c10;
                i10++;
            } else if (c10 == '\"') {
                int i12 = this._inputPtr;
                this._inputPtr = i10 + 1;
                return this._symbols.findSymbol(cArr, i12, i10 - i12, i11);
            }
        }
        int i13 = this._inputPtr;
        this._inputPtr = i10;
        return _parseName2(i13, i11, 34);
    }

    /* access modifiers changed from: protected */
    public final JsonToken _parseNegNumber() {
        int i10 = this._inputPtr;
        int i11 = i10 - 1;
        int i12 = this._inputEnd;
        if (i10 >= i12) {
            return _parseNumber2(true, i11);
        }
        int i13 = i10 + 1;
        char c10 = this._inputBuffer[i10];
        if (c10 > '9' || c10 < '0') {
            this._inputPtr = i13;
            return _handleInvalidNumberStart(c10, true);
        } else if (c10 == '0') {
            return _parseNumber2(true, i11);
        } else {
            int i14 = 1;
            while (i13 < i12) {
                int i15 = i13 + 1;
                char c11 = this._inputBuffer[i13];
                if (c11 >= '0' && c11 <= '9') {
                    i14++;
                    i13 = i15;
                } else if (c11 == '.' || c11 == 'e' || c11 == 'E') {
                    this._inputPtr = i15;
                    return _parseFloat(c11, i11, i15, true, i14);
                } else {
                    this._inputPtr = i13;
                    if (this._parsingContext.inRoot()) {
                        _verifyRootSpace(c11);
                    }
                    this._textBuffer.resetWithShared(this._inputBuffer, i11, i13 - i11);
                    return resetInt(true, i14);
                }
            }
            return _parseNumber2(true, i11);
        }
    }

    /* access modifiers changed from: protected */
    public final JsonToken _parsePosNumber(int i10) {
        int i11 = this._inputPtr;
        int i12 = i11 - 1;
        int i13 = this._inputEnd;
        if (i10 == 48) {
            return _parseNumber2(false, i12);
        }
        int i14 = 1;
        while (i11 < i13) {
            int i15 = i11 + 1;
            char c10 = this._inputBuffer[i11];
            if (c10 >= '0' && c10 <= '9') {
                i14++;
                i11 = i15;
            } else if (c10 == '.' || c10 == 'e' || c10 == 'E') {
                this._inputPtr = i15;
                return _parseFloat(c10, i12, i15, false, i14);
            } else {
                this._inputPtr = i11;
                if (this._parsingContext.inRoot()) {
                    _verifyRootSpace(c10);
                }
                this._textBuffer.resetWithShared(this._inputBuffer, i12, i11 - i12);
                return resetInt(false, i14);
            }
        }
        this._inputPtr = i12;
        return _parseNumber2(false, i12);
    }

    /* access modifiers changed from: protected */
    public int _readBinary(Base64Variant base64Variant, OutputStream outputStream, byte[] bArr) {
        int length = bArr.length - 3;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (this._inputPtr >= this._inputEnd) {
                _loadMoreGuaranteed();
            }
            char[] cArr = this._inputBuffer;
            int i12 = this._inputPtr;
            this._inputPtr = i12 + 1;
            char c10 = cArr[i12];
            if (c10 > ' ') {
                int decodeBase64Char = base64Variant.decodeBase64Char(c10);
                if (decodeBase64Char < 0) {
                    if (c10 == '\"') {
                        break;
                    }
                    decodeBase64Char = _decodeBase64Escape(base64Variant, c10, 0);
                    if (decodeBase64Char < 0) {
                        continue;
                    }
                }
                if (i10 > length) {
                    i11 += i10;
                    outputStream.write(bArr, 0, i10);
                    i10 = 0;
                }
                if (this._inputPtr >= this._inputEnd) {
                    _loadMoreGuaranteed();
                }
                char[] cArr2 = this._inputBuffer;
                int i13 = this._inputPtr;
                this._inputPtr = i13 + 1;
                char c11 = cArr2[i13];
                int decodeBase64Char2 = base64Variant.decodeBase64Char(c11);
                if (decodeBase64Char2 < 0) {
                    decodeBase64Char2 = _decodeBase64Escape(base64Variant, c11, 1);
                }
                int i14 = (decodeBase64Char << 6) | decodeBase64Char2;
                if (this._inputPtr >= this._inputEnd) {
                    _loadMoreGuaranteed();
                }
                char[] cArr3 = this._inputBuffer;
                int i15 = this._inputPtr;
                this._inputPtr = i15 + 1;
                char c12 = cArr3[i15];
                int decodeBase64Char3 = base64Variant.decodeBase64Char(c12);
                if (decodeBase64Char3 < 0) {
                    if (decodeBase64Char3 != -2) {
                        if (c12 == '\"' && !base64Variant.usesPadding()) {
                            bArr[i10] = (byte) (i14 >> 4);
                            i10++;
                            break;
                        }
                        decodeBase64Char3 = _decodeBase64Escape(base64Variant, c12, 2);
                    }
                    if (decodeBase64Char3 == -2) {
                        if (this._inputPtr >= this._inputEnd) {
                            _loadMoreGuaranteed();
                        }
                        char[] cArr4 = this._inputBuffer;
                        int i16 = this._inputPtr;
                        this._inputPtr = i16 + 1;
                        char c13 = cArr4[i16];
                        if (base64Variant.usesPaddingChar(c13)) {
                            bArr[i10] = (byte) (i14 >> 4);
                            i10++;
                        } else {
                            throw reportInvalidBase64Char(base64Variant, c13, 3, "expected padding character '" + base64Variant.getPaddingChar() + "'");
                        }
                    }
                }
                int i17 = (i14 << 6) | decodeBase64Char3;
                if (this._inputPtr >= this._inputEnd) {
                    _loadMoreGuaranteed();
                }
                char[] cArr5 = this._inputBuffer;
                int i18 = this._inputPtr;
                this._inputPtr = i18 + 1;
                char c14 = cArr5[i18];
                int decodeBase64Char4 = base64Variant.decodeBase64Char(c14);
                if (decodeBase64Char4 < 0) {
                    if (decodeBase64Char4 != -2) {
                        if (c14 == '\"' && !base64Variant.usesPadding()) {
                            int i19 = i10 + 1;
                            bArr[i10] = (byte) (i17 >> 10);
                            i10 += 2;
                            bArr[i19] = (byte) (i17 >> 2);
                            break;
                        }
                        decodeBase64Char4 = _decodeBase64Escape(base64Variant, c14, 3);
                    }
                    if (decodeBase64Char4 == -2) {
                        int i20 = i10 + 1;
                        bArr[i10] = (byte) (i17 >> 10);
                        i10 += 2;
                        bArr[i20] = (byte) (i17 >> 2);
                    }
                }
                int i21 = (i17 << 6) | decodeBase64Char4;
                bArr[i10] = (byte) (i21 >> 16);
                int i22 = i10 + 2;
                bArr[i10 + 1] = (byte) (i21 >> 8);
                i10 += 3;
                bArr[i22] = (byte) i21;
            }
        }
        this._tokenIncomplete = false;
        if (i10 <= 0) {
            return i11;
        }
        int i23 = i11 + i10;
        outputStream.write(bArr, 0, i10);
        return i23;
    }

    /* access modifiers changed from: protected */
    public void _releaseBuffers() {
        char[] cArr;
        super._releaseBuffers();
        this._symbols.release();
        if (this._bufferRecyclable && (cArr = this._inputBuffer) != null) {
            this._inputBuffer = null;
            this._ioContext.releaseTokenBuffer(cArr);
        }
    }

    /* access modifiers changed from: protected */
    public void _reportInvalidToken(String str) {
        _reportInvalidToken(str, "'null', 'true', 'false' or NaN");
    }

    /* access modifiers changed from: protected */
    public final void _skipCR() {
        if (this._inputPtr < this._inputEnd || _loadMore()) {
            char[] cArr = this._inputBuffer;
            int i10 = this._inputPtr;
            if (cArr[i10] == 10) {
                this._inputPtr = i10 + 1;
            }
        }
        this._currInputRow++;
        this._currInputRowStart = this._inputPtr;
    }

    /* access modifiers changed from: protected */
    public final void _skipString() {
        this._tokenIncomplete = false;
        int i10 = this._inputPtr;
        int i11 = this._inputEnd;
        char[] cArr = this._inputBuffer;
        while (true) {
            if (i10 >= i11) {
                this._inputPtr = i10;
                if (!_loadMore()) {
                    _reportInvalidEOF(": was expecting closing quote for a string value", JsonToken.VALUE_STRING);
                }
                i10 = this._inputPtr;
                i11 = this._inputEnd;
            }
            int i12 = i10 + 1;
            char c10 = cArr[i10];
            if (c10 <= '\\') {
                if (c10 == '\\') {
                    this._inputPtr = i12;
                    _decodeEscaped();
                    i10 = this._inputPtr;
                    i11 = this._inputEnd;
                } else if (c10 <= '\"') {
                    if (c10 == '\"') {
                        this._inputPtr = i12;
                        return;
                    } else if (c10 < ' ') {
                        this._inputPtr = i12;
                        _throwUnquotedSpace(c10, "string value");
                    }
                }
            }
            i10 = i12;
        }
    }

    public void finishToken() {
        if (this._tokenIncomplete) {
            this._tokenIncomplete = false;
            _finishString();
        }
    }

    public byte[] getBinaryValue(Base64Variant base64Variant) {
        JsonToken jsonToken = this._currToken;
        if (jsonToken != JsonToken.VALUE_STRING && (jsonToken != JsonToken.VALUE_EMBEDDED_OBJECT || this._binaryValue == null)) {
            _reportError("Current token (" + this._currToken + ") not VALUE_STRING or VALUE_EMBEDDED_OBJECT, can not access as binary");
        }
        if (this._tokenIncomplete) {
            try {
                this._binaryValue = _decodeBase64(base64Variant);
                this._tokenIncomplete = false;
            } catch (IllegalArgumentException e10) {
                throw _constructError("Failed to decode VALUE_STRING as base64 (" + base64Variant + "): " + e10.getMessage());
            }
        } else if (this._binaryValue == null) {
            ByteArrayBuilder _getByteArrayBuilder = _getByteArrayBuilder();
            _decodeBase64(getText(), _getByteArrayBuilder, base64Variant);
            this._binaryValue = _getByteArrayBuilder.toByteArray();
        }
        return this._binaryValue;
    }

    public ObjectCodec getCodec() {
        return this._objectCodec;
    }

    public JsonLocation getCurrentLocation() {
        return new JsonLocation(this._ioContext.getSourceReference(), -1, ((long) this._inputPtr) + this._currInputProcessed, this._currInputRow, (this._inputPtr - this._currInputRowStart) + 1);
    }

    public Object getInputSource() {
        return this._reader;
    }

    /* access modifiers changed from: protected */
    @Deprecated
    public char getNextChar(String str) {
        return getNextChar(str, (JsonToken) null);
    }

    public final String getText() {
        JsonToken jsonToken = this._currToken;
        if (jsonToken != JsonToken.VALUE_STRING) {
            return _getText2(jsonToken);
        }
        if (this._tokenIncomplete) {
            this._tokenIncomplete = false;
            _finishString();
        }
        return this._textBuffer.contentsAsString();
    }

    public final char[] getTextCharacters() {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == null) {
            return null;
        }
        int id2 = jsonToken.id();
        if (id2 != 5) {
            if (id2 != 6) {
                if (!(id2 == 7 || id2 == 8)) {
                    return this._currToken.asCharArray();
                }
            } else if (this._tokenIncomplete) {
                this._tokenIncomplete = false;
                _finishString();
            }
            return this._textBuffer.getTextBuffer();
        }
        if (!this._nameCopied) {
            String currentName = this._parsingContext.getCurrentName();
            int length = currentName.length();
            char[] cArr = this._nameCopyBuffer;
            if (cArr == null) {
                this._nameCopyBuffer = this._ioContext.allocNameCopyBuffer(length);
            } else if (cArr.length < length) {
                this._nameCopyBuffer = new char[length];
            }
            currentName.getChars(0, length, this._nameCopyBuffer, 0);
            this._nameCopied = true;
        }
        return this._nameCopyBuffer;
    }

    public final int getTextLength() {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == null) {
            return 0;
        }
        int id2 = jsonToken.id();
        if (id2 == 5) {
            return this._parsingContext.getCurrentName().length();
        }
        if (id2 != 6) {
            if (!(id2 == 7 || id2 == 8)) {
                return this._currToken.asCharArray().length;
            }
        } else if (this._tokenIncomplete) {
            this._tokenIncomplete = false;
            _finishString();
        }
        return this._textBuffer.size();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
        if (r0 != 8) goto L_0x0024;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int getTextOffset() {
        /*
            r3 = this;
            com.fasterxml.jackson.core.JsonToken r0 = r3._currToken
            r1 = 0
            if (r0 == 0) goto L_0x0024
            int r0 = r0.id()
            r2 = 6
            if (r0 == r2) goto L_0x0014
            r2 = 7
            if (r0 == r2) goto L_0x001d
            r2 = 8
            if (r0 == r2) goto L_0x001d
            goto L_0x0024
        L_0x0014:
            boolean r0 = r3._tokenIncomplete
            if (r0 == 0) goto L_0x001d
            r3._tokenIncomplete = r1
            r3._finishString()
        L_0x001d:
            com.fasterxml.jackson.core.util.TextBuffer r0 = r3._textBuffer
            int r0 = r0.getTextOffset()
            return r0
        L_0x0024:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.ReaderBasedJsonParser.getTextOffset():int");
    }

    public JsonLocation getTokenLocation() {
        Object sourceReference = this._ioContext.getSourceReference();
        if (this._currToken != JsonToken.FIELD_NAME) {
            return new JsonLocation(sourceReference, -1, this._tokenInputTotal - 1, this._tokenInputRow, this._tokenInputCol);
        }
        return new JsonLocation(sourceReference, -1, (this._nameStartOffset - 1) + this._currInputProcessed, this._nameStartRow, this._nameStartCol);
    }

    public final String getValueAsString() {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == JsonToken.VALUE_STRING) {
            if (this._tokenIncomplete) {
                this._tokenIncomplete = false;
                _finishString();
            }
            return this._textBuffer.contentsAsString();
        } else if (jsonToken == JsonToken.FIELD_NAME) {
            return getCurrentName();
        } else {
            return super.getValueAsString((String) null);
        }
    }

    public final Boolean nextBooleanValue() {
        if (this._currToken == JsonToken.FIELD_NAME) {
            this._nameCopied = false;
            JsonToken jsonToken = this._nextToken;
            this._nextToken = null;
            this._currToken = jsonToken;
            if (jsonToken == JsonToken.VALUE_TRUE) {
                return Boolean.TRUE;
            }
            if (jsonToken == JsonToken.VALUE_FALSE) {
                return Boolean.FALSE;
            }
            if (jsonToken == JsonToken.START_ARRAY) {
                this._parsingContext = this._parsingContext.createChildArrayContext(this._tokenInputRow, this._tokenInputCol);
            } else if (jsonToken == JsonToken.START_OBJECT) {
                this._parsingContext = this._parsingContext.createChildObjectContext(this._tokenInputRow, this._tokenInputCol);
            }
            return null;
        }
        JsonToken nextToken = nextToken();
        if (nextToken != null) {
            int id2 = nextToken.id();
            if (id2 == 9) {
                return Boolean.TRUE;
            }
            if (id2 == 10) {
                return Boolean.FALSE;
            }
        }
        return null;
    }

    public boolean nextFieldName(SerializableString serializableString) {
        int i10 = 0;
        this._numTypesValid = 0;
        if (this._currToken == JsonToken.FIELD_NAME) {
            _nextAfterName();
            return false;
        }
        if (this._tokenIncomplete) {
            _skipString();
        }
        int _skipWSOrEnd = _skipWSOrEnd();
        if (_skipWSOrEnd < 0) {
            close();
            this._currToken = null;
            return false;
        }
        this._binaryValue = null;
        if (_skipWSOrEnd == 93) {
            _updateLocation();
            if (!this._parsingContext.inArray()) {
                _reportMismatchedEndMarker(_skipWSOrEnd, '}');
            }
            this._parsingContext = this._parsingContext.clearAndGetParent();
            this._currToken = JsonToken.END_ARRAY;
            return false;
        } else if (_skipWSOrEnd == 125) {
            _updateLocation();
            if (!this._parsingContext.inObject()) {
                _reportMismatchedEndMarker(_skipWSOrEnd, ']');
            }
            this._parsingContext = this._parsingContext.clearAndGetParent();
            this._currToken = JsonToken.END_OBJECT;
            return false;
        } else {
            if (this._parsingContext.expectComma()) {
                _skipWSOrEnd = _skipComma(_skipWSOrEnd);
            }
            if (!this._parsingContext.inObject()) {
                _updateLocation();
                _nextTokenNotInObject(_skipWSOrEnd);
                return false;
            }
            _updateNameLocation();
            if (_skipWSOrEnd == 34) {
                char[] asQuotedChars = serializableString.asQuotedChars();
                int length = asQuotedChars.length;
                int i11 = this._inputPtr;
                if (i11 + length + 4 < this._inputEnd) {
                    int i12 = length + i11;
                    if (this._inputBuffer[i12] == '\"') {
                        while (i11 != i12) {
                            if (asQuotedChars[i10] == this._inputBuffer[i11]) {
                                i10++;
                                i11++;
                            }
                        }
                        this._parsingContext.setCurrentName(serializableString.getValue());
                        _isNextTokenNameYes(_skipColonFast(i11 + 1));
                        return true;
                    }
                }
            }
            return _isNextTokenNameMaybe(_skipWSOrEnd, serializableString.getValue());
        }
    }

    public final int nextIntValue(int i10) {
        if (this._currToken == JsonToken.FIELD_NAME) {
            this._nameCopied = false;
            JsonToken jsonToken = this._nextToken;
            this._nextToken = null;
            this._currToken = jsonToken;
            if (jsonToken == JsonToken.VALUE_NUMBER_INT) {
                return getIntValue();
            }
            if (jsonToken == JsonToken.START_ARRAY) {
                this._parsingContext = this._parsingContext.createChildArrayContext(this._tokenInputRow, this._tokenInputCol);
            } else if (jsonToken == JsonToken.START_OBJECT) {
                this._parsingContext = this._parsingContext.createChildObjectContext(this._tokenInputRow, this._tokenInputCol);
            }
            return i10;
        } else if (nextToken() == JsonToken.VALUE_NUMBER_INT) {
            return getIntValue();
        } else {
            return i10;
        }
    }

    public final long nextLongValue(long j10) {
        if (this._currToken == JsonToken.FIELD_NAME) {
            this._nameCopied = false;
            JsonToken jsonToken = this._nextToken;
            this._nextToken = null;
            this._currToken = jsonToken;
            if (jsonToken == JsonToken.VALUE_NUMBER_INT) {
                return getLongValue();
            }
            if (jsonToken == JsonToken.START_ARRAY) {
                this._parsingContext = this._parsingContext.createChildArrayContext(this._tokenInputRow, this._tokenInputCol);
            } else if (jsonToken == JsonToken.START_OBJECT) {
                this._parsingContext = this._parsingContext.createChildObjectContext(this._tokenInputRow, this._tokenInputCol);
            }
            return j10;
        } else if (nextToken() == JsonToken.VALUE_NUMBER_INT) {
            return getLongValue();
        } else {
            return j10;
        }
    }

    public final String nextTextValue() {
        if (this._currToken == JsonToken.FIELD_NAME) {
            this._nameCopied = false;
            JsonToken jsonToken = this._nextToken;
            this._nextToken = null;
            this._currToken = jsonToken;
            if (jsonToken == JsonToken.VALUE_STRING) {
                if (this._tokenIncomplete) {
                    this._tokenIncomplete = false;
                    _finishString();
                }
                return this._textBuffer.contentsAsString();
            }
            if (jsonToken == JsonToken.START_ARRAY) {
                this._parsingContext = this._parsingContext.createChildArrayContext(this._tokenInputRow, this._tokenInputCol);
            } else if (jsonToken == JsonToken.START_OBJECT) {
                this._parsingContext = this._parsingContext.createChildObjectContext(this._tokenInputRow, this._tokenInputCol);
            }
            return null;
        } else if (nextToken() == JsonToken.VALUE_STRING) {
            return getText();
        } else {
            return null;
        }
    }

    public final JsonToken nextToken() {
        JsonToken jsonToken;
        String str;
        JsonToken jsonToken2 = this._currToken;
        JsonToken jsonToken3 = JsonToken.FIELD_NAME;
        if (jsonToken2 == jsonToken3) {
            return _nextAfterName();
        }
        this._numTypesValid = 0;
        if (this._tokenIncomplete) {
            _skipString();
        }
        int _skipWSOrEnd = _skipWSOrEnd();
        if (_skipWSOrEnd < 0) {
            close();
            this._currToken = null;
            return null;
        }
        this._binaryValue = null;
        if (_skipWSOrEnd == 93) {
            _updateLocation();
            if (!this._parsingContext.inArray()) {
                _reportMismatchedEndMarker(_skipWSOrEnd, '}');
            }
            this._parsingContext = this._parsingContext.clearAndGetParent();
            JsonToken jsonToken4 = JsonToken.END_ARRAY;
            this._currToken = jsonToken4;
            return jsonToken4;
        } else if (_skipWSOrEnd == 125) {
            _updateLocation();
            if (!this._parsingContext.inObject()) {
                _reportMismatchedEndMarker(_skipWSOrEnd, ']');
            }
            this._parsingContext = this._parsingContext.clearAndGetParent();
            JsonToken jsonToken5 = JsonToken.END_OBJECT;
            this._currToken = jsonToken5;
            return jsonToken5;
        } else {
            if (this._parsingContext.expectComma()) {
                _skipWSOrEnd = _skipComma(_skipWSOrEnd);
            }
            boolean inObject = this._parsingContext.inObject();
            if (inObject) {
                _updateNameLocation();
                if (_skipWSOrEnd == 34) {
                    str = _parseName();
                } else {
                    str = _handleOddName(_skipWSOrEnd);
                }
                this._parsingContext.setCurrentName(str);
                this._currToken = jsonToken3;
                _skipWSOrEnd = _skipColon();
            }
            _updateLocation();
            if (_skipWSOrEnd == 34) {
                this._tokenIncomplete = true;
                jsonToken = JsonToken.VALUE_STRING;
            } else if (_skipWSOrEnd == 45) {
                jsonToken = _parseNegNumber();
            } else if (_skipWSOrEnd == 91) {
                if (!inObject) {
                    this._parsingContext = this._parsingContext.createChildArrayContext(this._tokenInputRow, this._tokenInputCol);
                }
                jsonToken = JsonToken.START_ARRAY;
            } else if (_skipWSOrEnd == 102) {
                _matchFalse();
                jsonToken = JsonToken.VALUE_FALSE;
            } else if (_skipWSOrEnd != 110) {
                if (_skipWSOrEnd != 116) {
                    if (_skipWSOrEnd == 123) {
                        if (!inObject) {
                            this._parsingContext = this._parsingContext.createChildObjectContext(this._tokenInputRow, this._tokenInputCol);
                        }
                        jsonToken = JsonToken.START_OBJECT;
                    } else if (_skipWSOrEnd != 125) {
                        switch (_skipWSOrEnd) {
                            case 48:
                            case 49:
                            case 50:
                            case 51:
                            case 52:
                            case 53:
                            case 54:
                            case 55:
                            case 56:
                            case 57:
                                jsonToken = _parsePosNumber(_skipWSOrEnd);
                                break;
                            default:
                                jsonToken = _handleOddValue(_skipWSOrEnd);
                                break;
                        }
                    } else {
                        _reportUnexpectedChar(_skipWSOrEnd, "expected a value");
                    }
                }
                _matchTrue();
                jsonToken = JsonToken.VALUE_TRUE;
            } else {
                _matchNull();
                jsonToken = JsonToken.VALUE_NULL;
            }
            if (inObject) {
                this._nextToken = jsonToken;
                return this._currToken;
            }
            this._currToken = jsonToken;
            return jsonToken;
        }
    }

    public int readBinaryValue(Base64Variant base64Variant, OutputStream outputStream) {
        if (!this._tokenIncomplete || this._currToken != JsonToken.VALUE_STRING) {
            byte[] binaryValue = getBinaryValue(base64Variant);
            outputStream.write(binaryValue);
            return binaryValue.length;
        }
        byte[] allocBase64Buffer = this._ioContext.allocBase64Buffer();
        try {
            return _readBinary(base64Variant, outputStream, allocBase64Buffer);
        } finally {
            this._ioContext.releaseBase64Buffer(allocBase64Buffer);
        }
    }

    public int releaseBuffered(Writer writer) {
        int i10 = this._inputEnd;
        int i11 = this._inputPtr;
        int i12 = i10 - i11;
        if (i12 < 1) {
            return 0;
        }
        writer.write(this._inputBuffer, i11, i12);
        return i12;
    }

    public void setCodec(ObjectCodec objectCodec) {
        this._objectCodec = objectCodec;
    }

    /* access modifiers changed from: protected */
    public void _reportInvalidToken(String str, String str2) {
        StringBuilder sb2 = new StringBuilder(str);
        while (sb2.length() < 256 && (this._inputPtr < this._inputEnd || _loadMore())) {
            char c10 = this._inputBuffer[this._inputPtr];
            if (!Character.isJavaIdentifierPart(c10)) {
                break;
            }
            this._inputPtr++;
            sb2.append(c10);
        }
        if (sb2.length() == 256) {
            sb2.append("...");
        }
        _reportError("Unrecognized token '" + sb2.toString() + "': was expecting " + str2);
    }

    /* access modifiers changed from: protected */
    public char getNextChar(String str, JsonToken jsonToken) {
        if (this._inputPtr >= this._inputEnd && !_loadMore()) {
            _reportInvalidEOF(str, jsonToken);
        }
        char[] cArr = this._inputBuffer;
        int i10 = this._inputPtr;
        this._inputPtr = i10 + 1;
        return cArr[i10];
    }

    public int getText(Writer writer) {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == JsonToken.VALUE_STRING) {
            if (this._tokenIncomplete) {
                this._tokenIncomplete = false;
                _finishString();
            }
            return this._textBuffer.contentsToWriter(writer);
        } else if (jsonToken == JsonToken.FIELD_NAME) {
            String currentName = this._parsingContext.getCurrentName();
            writer.write(currentName);
            return currentName.length();
        } else if (jsonToken == null) {
            return 0;
        } else {
            if (jsonToken.isNumeric()) {
                return this._textBuffer.contentsToWriter(writer);
            }
            char[] asCharArray = jsonToken.asCharArray();
            writer.write(asCharArray);
            return asCharArray.length;
        }
    }

    public final String getValueAsString(String str) {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == JsonToken.VALUE_STRING) {
            if (this._tokenIncomplete) {
                this._tokenIncomplete = false;
                _finishString();
            }
            return this._textBuffer.contentsAsString();
        } else if (jsonToken == JsonToken.FIELD_NAME) {
            return getCurrentName();
        } else {
            return super.getValueAsString(str);
        }
    }

    public ReaderBasedJsonParser(IOContext iOContext, int i10, Reader reader, ObjectCodec objectCodec, CharsToNameCanonicalizer charsToNameCanonicalizer) {
        super(iOContext, i10);
        this._reader = reader;
        this._inputBuffer = iOContext.allocTokenBuffer();
        this._inputPtr = 0;
        this._inputEnd = 0;
        this._objectCodec = objectCodec;
        this._symbols = charsToNameCanonicalizer;
        this._hashSeed = charsToNameCanonicalizer.hashSeed();
        this._bufferRecyclable = true;
    }

    public String nextFieldName() {
        JsonToken jsonToken;
        this._numTypesValid = 0;
        JsonToken jsonToken2 = this._currToken;
        JsonToken jsonToken3 = JsonToken.FIELD_NAME;
        if (jsonToken2 == jsonToken3) {
            _nextAfterName();
            return null;
        }
        if (this._tokenIncomplete) {
            _skipString();
        }
        int _skipWSOrEnd = _skipWSOrEnd();
        if (_skipWSOrEnd < 0) {
            close();
            this._currToken = null;
            return null;
        }
        this._binaryValue = null;
        if (_skipWSOrEnd == 93) {
            _updateLocation();
            if (!this._parsingContext.inArray()) {
                _reportMismatchedEndMarker(_skipWSOrEnd, '}');
            }
            this._parsingContext = this._parsingContext.clearAndGetParent();
            this._currToken = JsonToken.END_ARRAY;
            return null;
        } else if (_skipWSOrEnd == 125) {
            _updateLocation();
            if (!this._parsingContext.inObject()) {
                _reportMismatchedEndMarker(_skipWSOrEnd, ']');
            }
            this._parsingContext = this._parsingContext.clearAndGetParent();
            this._currToken = JsonToken.END_OBJECT;
            return null;
        } else {
            if (this._parsingContext.expectComma()) {
                _skipWSOrEnd = _skipComma(_skipWSOrEnd);
            }
            if (!this._parsingContext.inObject()) {
                _updateLocation();
                _nextTokenNotInObject(_skipWSOrEnd);
                return null;
            }
            _updateNameLocation();
            String _parseName = _skipWSOrEnd == 34 ? _parseName() : _handleOddName(_skipWSOrEnd);
            this._parsingContext.setCurrentName(_parseName);
            this._currToken = jsonToken3;
            int _skipColon = _skipColon();
            _updateLocation();
            if (_skipColon == 34) {
                this._tokenIncomplete = true;
                this._nextToken = JsonToken.VALUE_STRING;
                return _parseName;
            }
            if (_skipColon == 45) {
                jsonToken = _parseNegNumber();
            } else if (_skipColon == 91) {
                jsonToken = JsonToken.START_ARRAY;
            } else if (_skipColon == 102) {
                _matchFalse();
                jsonToken = JsonToken.VALUE_FALSE;
            } else if (_skipColon == 110) {
                _matchNull();
                jsonToken = JsonToken.VALUE_NULL;
            } else if (_skipColon == 116) {
                _matchTrue();
                jsonToken = JsonToken.VALUE_TRUE;
            } else if (_skipColon != 123) {
                switch (_skipColon) {
                    case 48:
                    case 49:
                    case 50:
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                        jsonToken = _parsePosNumber(_skipColon);
                        break;
                    default:
                        jsonToken = _handleOddValue(_skipColon);
                        break;
                }
            } else {
                jsonToken = JsonToken.START_OBJECT;
            }
            this._nextToken = jsonToken;
            return _parseName;
        }
    }
}
