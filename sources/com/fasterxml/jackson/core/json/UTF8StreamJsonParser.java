package com.fasterxml.jackson.core.json;

import com.amazon.a.a.o.b;
import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.core.base.GeneratorBase;
import com.fasterxml.jackson.core.base.ParserBase;
import com.fasterxml.jackson.core.io.CharTypes;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Writer;
import java.util.Arrays;

public class UTF8StreamJsonParser extends ParserBase {
    static final byte BYTE_LF = 10;
    protected static final int[] _icLatin1 = CharTypes.getInputCodeLatin1();
    private static final int[] _icUTF8 = CharTypes.getInputCodeUtf8();
    protected boolean _bufferRecyclable;
    protected byte[] _inputBuffer;
    protected InputStream _inputStream;
    protected int _nameStartCol;
    protected int _nameStartOffset;
    protected int _nameStartRow;
    protected ObjectCodec _objectCodec;
    private int _quad1;
    protected int[] _quadBuffer = new int[16];
    protected final ByteQuadsCanonicalizer _symbols;
    protected boolean _tokenIncomplete;

    public UTF8StreamJsonParser(IOContext iOContext, int i10, InputStream inputStream, ObjectCodec objectCodec, ByteQuadsCanonicalizer byteQuadsCanonicalizer, byte[] bArr, int i11, int i12, boolean z10) {
        super(iOContext, i10);
        this._inputStream = inputStream;
        this._objectCodec = objectCodec;
        this._symbols = byteQuadsCanonicalizer;
        this._inputBuffer = bArr;
        this._inputPtr = i11;
        this._inputEnd = i12;
        this._currInputRowStart = i11;
        this._currInputProcessed = (long) (-i11);
        this._bufferRecyclable = z10;
    }

    private final void _checkMatchEnd(String str, int i10, int i11) {
        if (Character.isJavaIdentifierPart((char) _decodeCharForError(i11))) {
            _reportInvalidToken(str.substring(0, i10));
        }
    }

    private final int _decodeUtf8_2(int i10) {
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        byte[] bArr = this._inputBuffer;
        int i11 = this._inputPtr;
        int i12 = i11 + 1;
        this._inputPtr = i12;
        byte b10 = bArr[i11];
        if ((b10 & 192) != 128) {
            _reportInvalidOther(b10 & 255, i12);
        }
        return ((i10 & 31) << 6) | (b10 & 63);
    }

    private final int _decodeUtf8_3(int i10) {
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        int i11 = i10 & 15;
        byte[] bArr = this._inputBuffer;
        int i12 = this._inputPtr;
        int i13 = i12 + 1;
        this._inputPtr = i13;
        byte b10 = bArr[i12];
        if ((b10 & 192) != 128) {
            _reportInvalidOther(b10 & 255, i13);
        }
        byte b11 = (i11 << 6) | (b10 & 63);
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        byte[] bArr2 = this._inputBuffer;
        int i14 = this._inputPtr;
        int i15 = i14 + 1;
        this._inputPtr = i15;
        byte b12 = bArr2[i14];
        if ((b12 & 192) != 128) {
            _reportInvalidOther(b12 & 255, i15);
        }
        return (b11 << 6) | (b12 & 63);
    }

    private final int _decodeUtf8_3fast(int i10) {
        int i11 = i10 & 15;
        byte[] bArr = this._inputBuffer;
        int i12 = this._inputPtr;
        int i13 = i12 + 1;
        this._inputPtr = i13;
        byte b10 = bArr[i12];
        if ((b10 & 192) != 128) {
            _reportInvalidOther(b10 & 255, i13);
        }
        byte b11 = (i11 << 6) | (b10 & 63);
        byte[] bArr2 = this._inputBuffer;
        int i14 = this._inputPtr;
        int i15 = i14 + 1;
        this._inputPtr = i15;
        byte b12 = bArr2[i14];
        if ((b12 & 192) != 128) {
            _reportInvalidOther(b12 & 255, i15);
        }
        return (b11 << 6) | (b12 & 63);
    }

    private final int _decodeUtf8_4(int i10) {
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        byte[] bArr = this._inputBuffer;
        int i11 = this._inputPtr;
        int i12 = i11 + 1;
        this._inputPtr = i12;
        byte b10 = bArr[i11];
        if ((b10 & 192) != 128) {
            _reportInvalidOther(b10 & 255, i12);
        }
        byte b11 = ((i10 & 7) << 6) | (b10 & 63);
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        byte[] bArr2 = this._inputBuffer;
        int i13 = this._inputPtr;
        int i14 = i13 + 1;
        this._inputPtr = i14;
        byte b12 = bArr2[i13];
        if ((b12 & 192) != 128) {
            _reportInvalidOther(b12 & 255, i14);
        }
        byte b13 = (b11 << 6) | (b12 & 63);
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        byte[] bArr3 = this._inputBuffer;
        int i15 = this._inputPtr;
        int i16 = i15 + 1;
        this._inputPtr = i16;
        byte b14 = bArr3[i15];
        if ((b14 & 192) != 128) {
            _reportInvalidOther(b14 & 255, i16);
        }
        return ((b13 << 6) | (b14 & 63)) - 65536;
    }

    private final void _finishString2(char[] cArr, int i10) {
        int[] iArr = _icUTF8;
        byte[] bArr = this._inputBuffer;
        while (true) {
            int i11 = this._inputPtr;
            if (i11 >= this._inputEnd) {
                _loadMoreGuaranteed();
                i11 = this._inputPtr;
            }
            int i12 = 0;
            if (i10 >= cArr.length) {
                cArr = this._textBuffer.finishCurrentSegment();
                i10 = 0;
            }
            int min = Math.min(this._inputEnd, (cArr.length - i10) + i11);
            while (true) {
                if (i11 >= min) {
                    this._inputPtr = i11;
                    break;
                }
                int i13 = i11 + 1;
                int i14 = bArr[i11] & 255;
                int i15 = iArr[i14];
                if (i15 != 0) {
                    this._inputPtr = i13;
                    if (i14 == 34) {
                        this._textBuffer.setCurrentLength(i10);
                        return;
                    }
                    if (i15 == 1) {
                        i14 = _decodeEscaped();
                    } else if (i15 == 2) {
                        i14 = _decodeUtf8_2(i14);
                    } else if (i15 == 3) {
                        i14 = this._inputEnd - i13 >= 2 ? _decodeUtf8_3fast(i14) : _decodeUtf8_3(i14);
                    } else if (i15 == 4) {
                        int _decodeUtf8_4 = _decodeUtf8_4(i14);
                        int i16 = i10 + 1;
                        cArr[i10] = (char) ((_decodeUtf8_4 >> 10) | GeneratorBase.SURR1_FIRST);
                        if (i16 >= cArr.length) {
                            cArr = this._textBuffer.finishCurrentSegment();
                            i10 = 0;
                        } else {
                            i10 = i16;
                        }
                        i14 = (_decodeUtf8_4 & 1023) | GeneratorBase.SURR2_FIRST;
                    } else if (i14 < 32) {
                        _throwUnquotedSpace(i14, "string value");
                    } else {
                        _reportInvalidChar(i14);
                    }
                    if (i10 >= cArr.length) {
                        cArr = this._textBuffer.finishCurrentSegment();
                    } else {
                        i12 = i10;
                    }
                    i10 = i12 + 1;
                    cArr[i12] = (char) i14;
                } else {
                    cArr[i10] = (char) i14;
                    i11 = i13;
                    i10++;
                }
            }
        }
    }

    private final boolean _isNextTokenNameMaybe(int i10, SerializableString serializableString) {
        JsonToken jsonToken;
        String _parseName = _parseName(i10);
        this._parsingContext.setCurrentName(_parseName);
        boolean equals = _parseName.equals(serializableString.getValue());
        this._currToken = JsonToken.FIELD_NAME;
        int _skipColon = _skipColon();
        _updateLocation();
        if (_skipColon == 34) {
            this._tokenIncomplete = true;
            this._nextToken = JsonToken.VALUE_STRING;
            return equals;
        }
        if (_skipColon == 45) {
            jsonToken = _parseNegNumber();
        } else if (_skipColon == 91) {
            jsonToken = JsonToken.START_ARRAY;
        } else if (_skipColon == 102) {
            _matchToken(b.f37476ag, 1);
            jsonToken = JsonToken.VALUE_FALSE;
        } else if (_skipColon == 110) {
            _matchToken("null", 1);
            jsonToken = JsonToken.VALUE_NULL;
        } else if (_skipColon == 116) {
            _matchToken(b.f37475af, 1);
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
                    jsonToken = _handleUnexpectedValue(_skipColon);
                    break;
            }
        } else {
            jsonToken = JsonToken.START_OBJECT;
        }
        this._nextToken = jsonToken;
        return equals;
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
                    this._nextToken = _handleUnexpectedValue(i10);
                    return;
            }
        } else {
            this._nextToken = JsonToken.START_OBJECT;
        }
    }

    private final void _matchToken2(String str, int i10) {
        int i11;
        byte b10;
        int length = str.length();
        do {
            if ((this._inputPtr >= this._inputEnd && !_loadMore()) || this._inputBuffer[this._inputPtr] != str.charAt(i10)) {
                _reportInvalidToken(str.substring(0, i10));
            }
            i11 = this._inputPtr + 1;
            this._inputPtr = i11;
            i10++;
        } while (i10 < length);
        if ((i11 < this._inputEnd || _loadMore()) && (b10 = this._inputBuffer[this._inputPtr] & 255) >= 48 && b10 != 93 && b10 != 125) {
            _checkMatchEnd(str, i10, b10);
        }
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
        } else if (i10 == 45) {
            JsonToken _parseNegNumber = _parseNegNumber();
            this._currToken = _parseNegNumber;
            return _parseNegNumber;
        } else if (i10 == 91) {
            this._parsingContext = this._parsingContext.createChildArrayContext(this._tokenInputRow, this._tokenInputCol);
            JsonToken jsonToken2 = JsonToken.START_ARRAY;
            this._currToken = jsonToken2;
            return jsonToken2;
        } else if (i10 == 102) {
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
                default:
                    JsonToken _handleUnexpectedValue = _handleUnexpectedValue(i10);
                    this._currToken = _handleUnexpectedValue;
                    return _handleUnexpectedValue;
            }
        } else {
            this._parsingContext = this._parsingContext.createChildObjectContext(this._tokenInputRow, this._tokenInputCol);
            JsonToken jsonToken6 = JsonToken.START_OBJECT;
            this._currToken = jsonToken6;
            return jsonToken6;
        }
    }

    private final JsonToken _parseFloat(char[] cArr, int i10, int i11, boolean z10, int i12) {
        boolean z11;
        int i13;
        int i14 = 0;
        if (i11 == 46) {
            if (i10 >= cArr.length) {
                cArr = this._textBuffer.finishCurrentSegment();
                i10 = 0;
            }
            cArr[i10] = (char) i11;
            i10++;
            i13 = 0;
            while (true) {
                if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                    z11 = true;
                    break;
                }
                byte[] bArr = this._inputBuffer;
                int i15 = this._inputPtr;
                this._inputPtr = i15 + 1;
                i11 = bArr[i15] & 255;
                if (i11 < 48 || i11 > 57) {
                    z11 = false;
                } else {
                    i13++;
                    if (i10 >= cArr.length) {
                        cArr = this._textBuffer.finishCurrentSegment();
                        i10 = 0;
                    }
                    cArr[i10] = (char) i11;
                    i10++;
                }
            }
            z11 = false;
            if (i13 == 0) {
                reportUnexpectedNumberChar(i11, "Decimal point not followed by a digit");
            }
        } else {
            i13 = 0;
            z11 = false;
        }
        if (r12 == 101 || r12 == 69) {
            if (i10 >= cArr.length) {
                cArr = this._textBuffer.finishCurrentSegment();
                i10 = 0;
            }
            int i16 = i10 + 1;
            cArr[i10] = (char) r12;
            if (this._inputPtr >= this._inputEnd) {
                _loadMoreGuaranteed();
            }
            byte[] bArr2 = this._inputBuffer;
            int i17 = this._inputPtr;
            this._inputPtr = i17 + 1;
            byte b10 = bArr2[i17] & 255;
            if (b10 == 45 || b10 == 43) {
                if (i16 >= cArr.length) {
                    cArr = this._textBuffer.finishCurrentSegment();
                    i16 = 0;
                }
                int i18 = i16 + 1;
                cArr[i16] = (char) b10;
                if (this._inputPtr >= this._inputEnd) {
                    _loadMoreGuaranteed();
                }
                byte[] bArr3 = this._inputBuffer;
                int i19 = this._inputPtr;
                this._inputPtr = i19 + 1;
                b10 = bArr3[i19] & 255;
                i16 = i18;
            }
            r12 = b10;
            int i20 = 0;
            while (true) {
                if (r12 <= 57 && r12 >= 48) {
                    i20++;
                    if (i16 >= cArr.length) {
                        cArr = this._textBuffer.finishCurrentSegment();
                        i16 = 0;
                    }
                    int i21 = i16 + 1;
                    cArr[i16] = (char) r12;
                    if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                        i14 = i20;
                        z11 = true;
                        r11 = i21;
                        break;
                    }
                    byte[] bArr4 = this._inputBuffer;
                    int i22 = this._inputPtr;
                    this._inputPtr = i22 + 1;
                    r12 = bArr4[i22] & 255;
                    i16 = i21;
                } else {
                    i14 = i20;
                    r11 = i16;
                }
            }
            i14 = i20;
            r11 = i16;
            if (i14 == 0) {
                reportUnexpectedNumberChar(r12, "Exponent indicator not followed by a digit");
            }
        }
        if (!z11) {
            this._inputPtr--;
            if (this._parsingContext.inRoot()) {
                _verifyRootSpace(r12);
            }
        }
        this._textBuffer.setCurrentLength(i10);
        return resetFloat(z10, i12, i13, i14);
    }

    private final JsonToken _parseNumber2(char[] cArr, int i10, boolean z10, int i11) {
        int i12;
        byte b10;
        char[] cArr2 = cArr;
        int i13 = i10;
        int i14 = i11;
        while (true) {
            if (this._inputPtr < this._inputEnd || _loadMore()) {
                byte[] bArr = this._inputBuffer;
                i12 = this._inputPtr;
                this._inputPtr = i12 + 1;
                b10 = bArr[i12] & 255;
                if (b10 <= 57 && b10 >= 48) {
                    if (i13 >= cArr2.length) {
                        i13 = 0;
                        cArr2 = this._textBuffer.finishCurrentSegment();
                    }
                    cArr2[i13] = (char) b10;
                    i14++;
                    i13++;
                }
            } else {
                this._textBuffer.setCurrentLength(i13);
                return resetInt(z10, i14);
            }
        }
        if (b10 == 46 || b10 == 101 || b10 == 69) {
            return _parseFloat(cArr2, i13, b10, z10, i14);
        }
        this._inputPtr = i12;
        this._textBuffer.setCurrentLength(i13);
        if (this._parsingContext.inRoot()) {
            byte[] bArr2 = this._inputBuffer;
            int i15 = this._inputPtr;
            this._inputPtr = i15 + 1;
            _verifyRootSpace(bArr2[i15] & 255);
        }
        return resetInt(z10, i14);
    }

    private final void _skipCComment() {
        int[] inputCodeComment = CharTypes.getInputCodeComment();
        while (true) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                break;
            }
            byte[] bArr = this._inputBuffer;
            int i10 = this._inputPtr;
            int i11 = i10 + 1;
            this._inputPtr = i11;
            byte b10 = bArr[i10] & 255;
            int i12 = inputCodeComment[b10];
            if (i12 != 0) {
                if (i12 == 2) {
                    _skipUtf8_2();
                } else if (i12 == 3) {
                    _skipUtf8_3();
                } else if (i12 == 4) {
                    _skipUtf8_4(b10);
                } else if (i12 == 10) {
                    this._currInputRow++;
                    this._currInputRowStart = i11;
                } else if (i12 != 13) {
                    if (i12 == 42) {
                        if (i11 >= this._inputEnd && !_loadMore()) {
                            break;
                        }
                        byte[] bArr2 = this._inputBuffer;
                        int i13 = this._inputPtr;
                        if (bArr2[i13] == 47) {
                            this._inputPtr = i13 + 1;
                            return;
                        }
                    } else {
                        _reportInvalidChar(b10);
                    }
                } else {
                    _skipCR();
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
        byte[] bArr = this._inputBuffer;
        byte b10 = bArr[i10];
        if (b10 == 58) {
            int i11 = i10 + 1;
            this._inputPtr = i11;
            byte b11 = bArr[i11];
            if (b11 <= 32) {
                if (b11 == 32 || b11 == 9) {
                    int i12 = i10 + 2;
                    this._inputPtr = i12;
                    byte b12 = bArr[i12];
                    if (b12 > 32) {
                        if (b12 == 47 || b12 == 35) {
                            return _skipColon2(true);
                        }
                        this._inputPtr = i10 + 3;
                        return b12;
                    }
                }
                return _skipColon2(true);
            } else if (b11 == 47 || b11 == 35) {
                return _skipColon2(true);
            } else {
                this._inputPtr = i10 + 2;
                return b11;
            }
        } else {
            if (b10 == 32 || b10 == 9) {
                int i13 = i10 + 1;
                this._inputPtr = i13;
                b10 = bArr[i13];
            }
            if (b10 != 58) {
                return _skipColon2(false);
            }
            int i14 = this._inputPtr;
            int i15 = i14 + 1;
            this._inputPtr = i15;
            byte b13 = bArr[i15];
            if (b13 <= 32) {
                if (b13 == 32 || b13 == 9) {
                    int i16 = i14 + 2;
                    this._inputPtr = i16;
                    byte b14 = bArr[i16];
                    if (b14 > 32) {
                        if (b14 == 47 || b14 == 35) {
                            return _skipColon2(true);
                        }
                        this._inputPtr = i14 + 3;
                        return b14;
                    }
                }
                return _skipColon2(true);
            } else if (b13 == 47 || b13 == 35) {
                return _skipColon2(true);
            } else {
                this._inputPtr = i14 + 2;
                return b13;
            }
        }
    }

    private final int _skipColon2(boolean z10) {
        while (true) {
            if (this._inputPtr < this._inputEnd || _loadMore()) {
                byte[] bArr = this._inputBuffer;
                int i10 = this._inputPtr;
                int i11 = i10 + 1;
                this._inputPtr = i11;
                byte b10 = bArr[i10] & 255;
                if (b10 > 32) {
                    if (b10 == 47) {
                        _skipComment();
                    } else if (b10 != 35 || !_skipYAMLComment()) {
                        if (z10) {
                            return b10;
                        }
                        if (b10 != 58) {
                            _reportUnexpectedChar(b10, "was expecting a colon to separate field name and value");
                        }
                        z10 = true;
                    }
                } else if (b10 != 32) {
                    if (b10 == 10) {
                        this._currInputRow++;
                        this._currInputRowStart = i11;
                    } else if (b10 == 13) {
                        _skipCR();
                    } else if (b10 != 9) {
                        _throwInvalidSpace(b10);
                    }
                }
            } else {
                _reportInvalidEOF(" within/between " + this._parsingContext.typeDesc() + " entries", (JsonToken) null);
                return -1;
            }
        }
    }

    private final int _skipColonFast(int i10) {
        byte[] bArr = this._inputBuffer;
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 == 58) {
            int i12 = i10 + 2;
            byte b11 = bArr[i11];
            if (b11 > 32) {
                if (!(b11 == 47 || b11 == 35)) {
                    this._inputPtr = i12;
                    return b11;
                }
            } else if (b11 == 32 || b11 == 9) {
                int i13 = i10 + 3;
                byte b12 = bArr[i12];
                if (b12 <= 32 || b12 == 47 || b12 == 35) {
                    i12 = i13;
                } else {
                    this._inputPtr = i13;
                    return b12;
                }
            }
            this._inputPtr = i12 - 1;
            return _skipColon2(true);
        }
        if (b10 == 32 || b10 == 9) {
            b10 = bArr[i11];
            i11 = i10 + 2;
        }
        if (b10 == 58) {
            int i14 = i11 + 1;
            byte b13 = bArr[i11];
            if (b13 > 32) {
                if (!(b13 == 47 || b13 == 35)) {
                    this._inputPtr = i14;
                    return b13;
                }
            } else if (b13 == 32 || b13 == 9) {
                int i15 = i11 + 2;
                byte b14 = bArr[i14];
                if (b14 <= 32 || b14 == 47 || b14 == 35) {
                    i14 = i15;
                } else {
                    this._inputPtr = i15;
                    return b14;
                }
            }
            this._inputPtr = i14 - 1;
            return _skipColon2(true);
        }
        this._inputPtr = i11 - 1;
        return _skipColon2(false);
    }

    private final void _skipComment() {
        if (!isEnabled(JsonParser.Feature.ALLOW_COMMENTS)) {
            _reportUnexpectedChar(47, "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_COMMENTS' not enabled for parser)");
        }
        if (this._inputPtr >= this._inputEnd && !_loadMore()) {
            _reportInvalidEOF(" in a comment", (JsonToken) null);
        }
        byte[] bArr = this._inputBuffer;
        int i10 = this._inputPtr;
        this._inputPtr = i10 + 1;
        byte b10 = bArr[i10] & 255;
        if (b10 == 47) {
            _skipLine();
        } else if (b10 == 42) {
            _skipCComment();
        } else {
            _reportUnexpectedChar(b10, "was expecting either '*' or '/' for a comment");
        }
    }

    private final void _skipLine() {
        int[] inputCodeComment = CharTypes.getInputCodeComment();
        while (true) {
            if (this._inputPtr < this._inputEnd || _loadMore()) {
                byte[] bArr = this._inputBuffer;
                int i10 = this._inputPtr;
                int i11 = i10 + 1;
                this._inputPtr = i11;
                byte b10 = bArr[i10] & 255;
                int i12 = inputCodeComment[b10];
                if (i12 != 0) {
                    if (i12 == 2) {
                        _skipUtf8_2();
                    } else if (i12 == 3) {
                        _skipUtf8_3();
                    } else if (i12 == 4) {
                        _skipUtf8_4(b10);
                    } else if (i12 == 10) {
                        this._currInputRow++;
                        this._currInputRowStart = i11;
                        return;
                    } else if (i12 == 13) {
                        _skipCR();
                        return;
                    } else if (i12 != 42 && i12 < 0) {
                        _reportInvalidChar(b10);
                    }
                }
            } else {
                return;
            }
        }
    }

    private final void _skipUtf8_2() {
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        byte[] bArr = this._inputBuffer;
        int i10 = this._inputPtr;
        int i11 = i10 + 1;
        this._inputPtr = i11;
        byte b10 = bArr[i10];
        if ((b10 & 192) != 128) {
            _reportInvalidOther(b10 & 255, i11);
        }
    }

    private final void _skipUtf8_3() {
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        byte[] bArr = this._inputBuffer;
        int i10 = this._inputPtr;
        int i11 = i10 + 1;
        this._inputPtr = i11;
        byte b10 = bArr[i10];
        if ((b10 & 192) != 128) {
            _reportInvalidOther(b10 & 255, i11);
        }
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        byte[] bArr2 = this._inputBuffer;
        int i12 = this._inputPtr;
        int i13 = i12 + 1;
        this._inputPtr = i13;
        byte b11 = bArr2[i12];
        if ((b11 & 192) != 128) {
            _reportInvalidOther(b11 & 255, i13);
        }
    }

    private final void _skipUtf8_4(int i10) {
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        byte[] bArr = this._inputBuffer;
        int i11 = this._inputPtr;
        int i12 = i11 + 1;
        this._inputPtr = i12;
        byte b10 = bArr[i11];
        if ((b10 & 192) != 128) {
            _reportInvalidOther(b10 & 255, i12);
        }
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        byte[] bArr2 = this._inputBuffer;
        int i13 = this._inputPtr;
        int i14 = i13 + 1;
        this._inputPtr = i14;
        byte b11 = bArr2[i13];
        if ((b11 & 192) != 128) {
            _reportInvalidOther(b11 & 255, i14);
        }
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        byte[] bArr3 = this._inputBuffer;
        int i15 = this._inputPtr;
        int i16 = i15 + 1;
        this._inputPtr = i16;
        byte b12 = bArr3[i15];
        if ((b12 & 192) != 128) {
            _reportInvalidOther(b12 & 255, i16);
        }
    }

    private final int _skipWS() {
        while (true) {
            int i10 = this._inputPtr;
            if (i10 >= this._inputEnd) {
                return _skipWS2();
            }
            byte[] bArr = this._inputBuffer;
            int i11 = i10 + 1;
            this._inputPtr = i11;
            byte b10 = bArr[i10] & 255;
            if (b10 > 32) {
                if (b10 != 47 && b10 != 35) {
                    return b10;
                }
                this._inputPtr = i10;
                return _skipWS2();
            } else if (b10 != 32) {
                if (b10 == 10) {
                    this._currInputRow++;
                    this._currInputRowStart = i11;
                } else if (b10 == 13) {
                    _skipCR();
                } else if (b10 != 9) {
                    _throwInvalidSpace(b10);
                }
            }
        }
    }

    private final int _skipWS2() {
        byte b10;
        while (true) {
            if (this._inputPtr < this._inputEnd || _loadMore()) {
                byte[] bArr = this._inputBuffer;
                int i10 = this._inputPtr;
                int i11 = i10 + 1;
                this._inputPtr = i11;
                b10 = bArr[i10] & 255;
                if (b10 > 32) {
                    if (b10 == 47) {
                        _skipComment();
                    } else if (b10 != 35 || !_skipYAMLComment()) {
                        return b10;
                    }
                } else if (b10 != 32) {
                    if (b10 == 10) {
                        this._currInputRow++;
                        this._currInputRowStart = i11;
                    } else if (b10 == 13) {
                        _skipCR();
                    } else if (b10 != 9) {
                        _throwInvalidSpace(b10);
                    }
                }
            } else {
                throw _constructError("Unexpected end-of-input within/between " + this._parsingContext.typeDesc() + " entries");
            }
        }
        return b10;
    }

    private final int _skipWSOrEnd() {
        if (this._inputPtr >= this._inputEnd && !_loadMore()) {
            return _eofAsNextChar();
        }
        byte[] bArr = this._inputBuffer;
        int i10 = this._inputPtr;
        int i11 = i10 + 1;
        this._inputPtr = i11;
        byte b10 = bArr[i10] & 255;
        if (b10 <= 32) {
            if (b10 != 32) {
                if (b10 == 10) {
                    this._currInputRow++;
                    this._currInputRowStart = i11;
                } else if (b10 == 13) {
                    _skipCR();
                } else if (b10 != 9) {
                    _throwInvalidSpace(b10);
                }
            }
            while (true) {
                int i12 = this._inputPtr;
                if (i12 >= this._inputEnd) {
                    return _skipWSOrEnd2();
                }
                byte[] bArr2 = this._inputBuffer;
                int i13 = i12 + 1;
                this._inputPtr = i13;
                byte b11 = bArr2[i12] & 255;
                if (b11 > 32) {
                    if (b11 != 47 && b11 != 35) {
                        return b11;
                    }
                    this._inputPtr = i12;
                    return _skipWSOrEnd2();
                } else if (b11 != 32) {
                    if (b11 == 10) {
                        this._currInputRow++;
                        this._currInputRowStart = i13;
                    } else if (b11 == 13) {
                        _skipCR();
                    } else if (b11 != 9) {
                        _throwInvalidSpace(b11);
                    }
                }
            }
        } else if (b10 != 47 && b10 != 35) {
            return b10;
        } else {
            this._inputPtr = i10;
            return _skipWSOrEnd2();
        }
    }

    private final int _skipWSOrEnd2() {
        byte b10;
        while (true) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                return _eofAsNextChar();
            }
            byte[] bArr = this._inputBuffer;
            int i10 = this._inputPtr;
            int i11 = i10 + 1;
            this._inputPtr = i11;
            b10 = bArr[i10] & 255;
            if (b10 > 32) {
                if (b10 == 47) {
                    _skipComment();
                } else if (b10 != 35 || !_skipYAMLComment()) {
                    return b10;
                }
            } else if (b10 != 32) {
                if (b10 == 10) {
                    this._currInputRow++;
                    this._currInputRowStart = i11;
                } else if (b10 == 13) {
                    _skipCR();
                } else if (b10 != 9) {
                    _throwInvalidSpace(b10);
                }
            }
        }
        return b10;
    }

    private final boolean _skipYAMLComment() {
        if (!isEnabled(JsonParser.Feature.ALLOW_YAML_COMMENTS)) {
            return false;
        }
        _skipLine();
        return true;
    }

    private final void _updateLocation() {
        this._tokenInputRow = this._currInputRow;
        int i10 = this._inputPtr;
        this._tokenInputTotal = this._currInputProcessed + ((long) i10);
        this._tokenInputCol = i10 - this._currInputRowStart;
    }

    private final void _updateNameLocation() {
        this._nameStartRow = this._currInputRow;
        int i10 = this._inputPtr;
        this._nameStartOffset = i10;
        this._nameStartCol = i10 - this._currInputRowStart;
    }

    private final int _verifyNoLeadingZeroes() {
        byte b10;
        if ((this._inputPtr >= this._inputEnd && !_loadMore()) || (b10 = this._inputBuffer[this._inputPtr] & 255) < 48 || b10 > 57) {
            return 48;
        }
        if (!isEnabled(JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS)) {
            reportInvalidNumber("Leading zeroes not allowed");
        }
        this._inputPtr++;
        if (b10 == 48) {
            do {
                if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                    break;
                }
                byte[] bArr = this._inputBuffer;
                int i10 = this._inputPtr;
                b10 = bArr[i10] & 255;
                if (b10 < 48 || b10 > 57) {
                    return 48;
                }
                this._inputPtr = i10 + 1;
            } while (b10 == 48);
        }
        return b10;
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

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00c3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.String addName(int[] r18, int r19, int r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            int r4 = r2 << 2
            r5 = 4
            int r4 = r4 - r5
            int r4 = r4 + r3
            r7 = 3
            if (r3 >= r5) goto L_0x001c
            int r8 = r2 + -1
            r9 = r1[r8]
            int r10 = 4 - r3
            int r10 = r10 << r7
            int r10 = r9 << r10
            r1[r8] = r10
            goto L_0x001d
        L_0x001c:
            r9 = 0
        L_0x001d:
            com.fasterxml.jackson.core.util.TextBuffer r8 = r0._textBuffer
            char[] r8 = r8.emptyAndGetCurrentSegment()
            r10 = 0
            r11 = 0
        L_0x0025:
            if (r10 >= r4) goto L_0x00f6
            int r12 = r10 >> 2
            r12 = r1[r12]
            r13 = r10 & 3
            int r13 = 3 - r13
            int r13 = r13 << r7
            int r12 = r12 >> r13
            r13 = r12 & 255(0xff, float:3.57E-43)
            int r14 = r10 + 1
            r15 = 127(0x7f, float:1.78E-43)
            if (r13 <= r15) goto L_0x00e2
            r15 = r12 & 224(0xe0, float:3.14E-43)
            r5 = 192(0xc0, float:2.69E-43)
            if (r15 != r5) goto L_0x0043
            r5 = r12 & 31
        L_0x0041:
            r12 = 1
            goto L_0x005c
        L_0x0043:
            r5 = r12 & 240(0xf0, float:3.36E-43)
            r15 = 224(0xe0, float:3.14E-43)
            if (r5 != r15) goto L_0x004d
            r5 = r12 & 15
            r12 = 2
            goto L_0x005c
        L_0x004d:
            r5 = r12 & 248(0xf8, float:3.48E-43)
            r15 = 240(0xf0, float:3.36E-43)
            if (r5 != r15) goto L_0x0057
            r5 = r12 & 7
            r12 = r7
            goto L_0x005c
        L_0x0057:
            r0._reportInvalidInitial(r13)
            r5 = 1
            goto L_0x0041
        L_0x005c:
            int r13 = r14 + r12
            if (r13 <= r4) goto L_0x0067
            java.lang.String r13 = " in field name"
            com.fasterxml.jackson.core.JsonToken r15 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME
            r0._reportInvalidEOF(r13, r15)
        L_0x0067:
            int r13 = r14 >> 2
            r13 = r1[r13]
            r14 = r14 & 3
            int r14 = 3 - r14
            int r14 = r14 << r7
            int r13 = r13 >> r14
            int r14 = r10 + 2
            r15 = r13 & 192(0xc0, float:2.69E-43)
            r6 = 128(0x80, float:1.794E-43)
            if (r15 == r6) goto L_0x007c
            r0._reportInvalidOther(r13)
        L_0x007c:
            int r5 = r5 << 6
            r13 = r13 & 63
            r5 = r5 | r13
            r13 = 1
            if (r12 <= r13) goto L_0x00b9
            int r13 = r14 >> 2
            r13 = r1[r13]
            r14 = r14 & 3
            int r14 = 3 - r14
            int r14 = r14 << r7
            int r13 = r13 >> r14
            int r14 = r10 + 3
            r15 = r13 & 192(0xc0, float:2.69E-43)
            if (r15 == r6) goto L_0x0097
            r0._reportInvalidOther(r13)
        L_0x0097:
            int r5 = r5 << 6
            r13 = r13 & 63
            r5 = r5 | r13
            r13 = 2
            if (r12 <= r13) goto L_0x00bc
            int r13 = r14 >> 2
            r13 = r1[r13]
            r14 = r14 & 3
            int r14 = 3 - r14
            int r14 = r14 << r7
            int r13 = r13 >> r14
            int r14 = r10 + 4
            r10 = r13 & 192(0xc0, float:2.69E-43)
            if (r10 == r6) goto L_0x00b4
            r6 = r13 & 255(0xff, float:3.57E-43)
            r0._reportInvalidOther(r6)
        L_0x00b4:
            int r5 = r5 << 6
            r6 = r13 & 63
            r5 = r5 | r6
        L_0x00b9:
            r13 = r5
            r5 = 2
            goto L_0x00c1
        L_0x00bc:
            r16 = r13
            r13 = r5
            r5 = r16
        L_0x00c1:
            if (r12 <= r5) goto L_0x00e2
            r5 = 65536(0x10000, float:9.18355E-41)
            int r13 = r13 - r5
            int r5 = r8.length
            if (r11 < r5) goto L_0x00cf
            com.fasterxml.jackson.core.util.TextBuffer r5 = r0._textBuffer
            char[] r8 = r5.expandCurrentSegment()
        L_0x00cf:
            int r5 = r11 + 1
            int r6 = r13 >> 10
            r10 = 55296(0xd800, float:7.7486E-41)
            int r6 = r6 + r10
            char r6 = (char) r6
            r8[r11] = r6
            r6 = r13 & 1023(0x3ff, float:1.434E-42)
            r10 = 56320(0xdc00, float:7.8921E-41)
            r13 = r6 | r10
            r11 = r5
        L_0x00e2:
            r10 = r14
            int r5 = r8.length
            if (r11 < r5) goto L_0x00ed
            com.fasterxml.jackson.core.util.TextBuffer r5 = r0._textBuffer
            char[] r5 = r5.expandCurrentSegment()
            r8 = r5
        L_0x00ed:
            int r5 = r11 + 1
            char r6 = (char) r13
            r8[r11] = r6
            r11 = r5
            r5 = 4
            goto L_0x0025
        L_0x00f6:
            java.lang.String r4 = new java.lang.String
            r5 = 0
            r4.<init>(r8, r5, r11)
            r5 = 4
            if (r3 >= r5) goto L_0x0103
            int r3 = r2 + -1
            r1[r3] = r9
        L_0x0103:
            com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer r3 = r0._symbols
            java.lang.String r1 = r3.addName((java.lang.String) r4, (int[]) r1, (int) r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.UTF8StreamJsonParser.addName(int[], int, int):java.lang.String");
    }

    private final String findName(int i10, int i11) {
        int pad = pad(i10, i11);
        String findName = this._symbols.findName(pad);
        if (findName != null) {
            return findName;
        }
        int[] iArr = this._quadBuffer;
        iArr[0] = pad;
        return addName(iArr, 1, i11);
    }

    public static int[] growArrayBy(int[] iArr, int i10) {
        if (iArr == null) {
            return new int[i10];
        }
        return Arrays.copyOf(iArr, iArr.length + i10);
    }

    private int nextByte() {
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        byte[] bArr = this._inputBuffer;
        int i10 = this._inputPtr;
        this._inputPtr = i10 + 1;
        return bArr[i10] & 255;
    }

    private static final int pad(int i10, int i11) {
        return i11 == 4 ? i10 : i10 | (-1 << (i11 << 3));
    }

    private final String parseName(int i10, int i11, int i12) {
        return parseEscapedName(this._quadBuffer, 0, i10, i11, i12);
    }

    /* access modifiers changed from: protected */
    public void _closeInput() {
        if (this._inputStream != null) {
            if (this._ioContext.isResourceManaged() || isEnabled(JsonParser.Feature.AUTO_CLOSE_SOURCE)) {
                this._inputStream.close();
            }
            this._inputStream = null;
        }
    }

    /* access modifiers changed from: protected */
    public final byte[] _decodeBase64(Base64Variant base64Variant) {
        ByteArrayBuilder _getByteArrayBuilder = _getByteArrayBuilder();
        while (true) {
            if (this._inputPtr >= this._inputEnd) {
                _loadMoreGuaranteed();
            }
            byte[] bArr = this._inputBuffer;
            int i10 = this._inputPtr;
            this._inputPtr = i10 + 1;
            byte b10 = bArr[i10] & 255;
            if (b10 > 32) {
                int decodeBase64Char = base64Variant.decodeBase64Char((int) b10);
                if (decodeBase64Char < 0) {
                    if (b10 == 34) {
                        return _getByteArrayBuilder.toByteArray();
                    }
                    decodeBase64Char = _decodeBase64Escape(base64Variant, (int) b10, 0);
                    if (decodeBase64Char < 0) {
                        continue;
                    }
                }
                if (this._inputPtr >= this._inputEnd) {
                    _loadMoreGuaranteed();
                }
                byte[] bArr2 = this._inputBuffer;
                int i11 = this._inputPtr;
                this._inputPtr = i11 + 1;
                byte b11 = bArr2[i11] & 255;
                int decodeBase64Char2 = base64Variant.decodeBase64Char((int) b11);
                if (decodeBase64Char2 < 0) {
                    decodeBase64Char2 = _decodeBase64Escape(base64Variant, (int) b11, 1);
                }
                int i12 = (decodeBase64Char << 6) | decodeBase64Char2;
                if (this._inputPtr >= this._inputEnd) {
                    _loadMoreGuaranteed();
                }
                byte[] bArr3 = this._inputBuffer;
                int i13 = this._inputPtr;
                this._inputPtr = i13 + 1;
                byte b12 = bArr3[i13] & 255;
                int decodeBase64Char3 = base64Variant.decodeBase64Char((int) b12);
                if (decodeBase64Char3 < 0) {
                    if (decodeBase64Char3 != -2) {
                        if (b12 != 34 || base64Variant.usesPadding()) {
                            decodeBase64Char3 = _decodeBase64Escape(base64Variant, (int) b12, 2);
                        } else {
                            _getByteArrayBuilder.append(i12 >> 4);
                            return _getByteArrayBuilder.toByteArray();
                        }
                    }
                    if (decodeBase64Char3 == -2) {
                        if (this._inputPtr >= this._inputEnd) {
                            _loadMoreGuaranteed();
                        }
                        byte[] bArr4 = this._inputBuffer;
                        int i14 = this._inputPtr;
                        this._inputPtr = i14 + 1;
                        byte b13 = bArr4[i14] & 255;
                        if (base64Variant.usesPaddingChar((int) b13)) {
                            _getByteArrayBuilder.append(i12 >> 4);
                        } else {
                            throw reportInvalidBase64Char(base64Variant, b13, 3, "expected padding character '" + base64Variant.getPaddingChar() + "'");
                        }
                    }
                }
                int i15 = (i12 << 6) | decodeBase64Char3;
                if (this._inputPtr >= this._inputEnd) {
                    _loadMoreGuaranteed();
                }
                byte[] bArr5 = this._inputBuffer;
                int i16 = this._inputPtr;
                this._inputPtr = i16 + 1;
                byte b14 = bArr5[i16] & 255;
                int decodeBase64Char4 = base64Variant.decodeBase64Char((int) b14);
                if (decodeBase64Char4 < 0) {
                    if (decodeBase64Char4 != -2) {
                        if (b14 != 34 || base64Variant.usesPadding()) {
                            decodeBase64Char4 = _decodeBase64Escape(base64Variant, (int) b14, 3);
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
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int _decodeCharForError(int r7) {
        /*
            r6 = this;
            r0 = r7 & 255(0xff, float:3.57E-43)
            r1 = 127(0x7f, float:1.78E-43)
            if (r0 <= r1) goto L_0x0068
            r1 = r7 & 224(0xe0, float:3.14E-43)
            r2 = 2
            r3 = 1
            r4 = 192(0xc0, float:2.69E-43)
            if (r1 != r4) goto L_0x0012
            r0 = r7 & 31
        L_0x0010:
            r7 = r3
            goto L_0x002c
        L_0x0012:
            r1 = r7 & 240(0xf0, float:3.36E-43)
            r4 = 224(0xe0, float:3.14E-43)
            if (r1 != r4) goto L_0x001c
            r0 = r7 & 15
            r7 = r2
            goto L_0x002c
        L_0x001c:
            r1 = r7 & 248(0xf8, float:3.48E-43)
            r4 = 240(0xf0, float:3.36E-43)
            if (r1 != r4) goto L_0x0026
            r0 = r7 & 7
            r7 = 3
            goto L_0x002c
        L_0x0026:
            r7 = r7 & 255(0xff, float:3.57E-43)
            r6._reportInvalidInitial(r7)
            goto L_0x0010
        L_0x002c:
            int r1 = r6.nextByte()
            r4 = r1 & 192(0xc0, float:2.69E-43)
            r5 = 128(0x80, float:1.794E-43)
            if (r4 == r5) goto L_0x003b
            r4 = r1 & 255(0xff, float:3.57E-43)
            r6._reportInvalidOther(r4)
        L_0x003b:
            int r0 = r0 << 6
            r1 = r1 & 63
            r0 = r0 | r1
            if (r7 <= r3) goto L_0x0068
            int r1 = r6.nextByte()
            r3 = r1 & 192(0xc0, float:2.69E-43)
            if (r3 == r5) goto L_0x004f
            r3 = r1 & 255(0xff, float:3.57E-43)
            r6._reportInvalidOther(r3)
        L_0x004f:
            int r0 = r0 << 6
            r1 = r1 & 63
            r0 = r0 | r1
            if (r7 <= r2) goto L_0x0068
            int r7 = r6.nextByte()
            r1 = r7 & 192(0xc0, float:2.69E-43)
            if (r1 == r5) goto L_0x0063
            r1 = r7 & 255(0xff, float:3.57E-43)
            r6._reportInvalidOther(r1)
        L_0x0063:
            int r0 = r0 << 6
            r7 = r7 & 63
            r0 = r0 | r7
        L_0x0068:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.UTF8StreamJsonParser._decodeCharForError(int):int");
    }

    /* access modifiers changed from: protected */
    public char _decodeEscaped() {
        if (this._inputPtr >= this._inputEnd && !_loadMore()) {
            _reportInvalidEOF(" in character escape sequence", JsonToken.VALUE_STRING);
        }
        byte[] bArr = this._inputBuffer;
        int i10 = this._inputPtr;
        this._inputPtr = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 == 34 || b10 == 47 || b10 == 92) {
            return (char) b10;
        }
        if (b10 == 98) {
            return 8;
        }
        if (b10 == 102) {
            return 12;
        }
        if (b10 == 110) {
            return 10;
        }
        if (b10 == 114) {
            return 13;
        }
        if (b10 == 116) {
            return 9;
        }
        if (b10 != 117) {
            return _handleUnrecognizedCharacterEscape((char) _decodeCharForError(b10));
        }
        int i11 = 0;
        for (int i12 = 0; i12 < 4; i12++) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                _reportInvalidEOF(" in character escape sequence", JsonToken.VALUE_STRING);
            }
            byte[] bArr2 = this._inputBuffer;
            int i13 = this._inputPtr;
            this._inputPtr = i13 + 1;
            byte b11 = bArr2[i13];
            int charToHex = CharTypes.charToHex(b11);
            if (charToHex < 0) {
                _reportUnexpectedChar(b11, "expected a hex-digit for character escape sequence");
            }
            i11 = (i11 << 4) | charToHex;
        }
        return (char) i11;
    }

    /* access modifiers changed from: protected */
    public String _finishAndReturnString() {
        int i10 = this._inputPtr;
        if (i10 >= this._inputEnd) {
            _loadMoreGuaranteed();
            i10 = this._inputPtr;
        }
        char[] emptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        int[] iArr = _icUTF8;
        int min = Math.min(this._inputEnd, emptyAndGetCurrentSegment.length + i10);
        byte[] bArr = this._inputBuffer;
        int i11 = 0;
        while (true) {
            if (i10 >= min) {
                break;
            }
            byte b10 = bArr[i10] & 255;
            if (iArr[b10] == 0) {
                i10++;
                emptyAndGetCurrentSegment[i11] = (char) b10;
                i11++;
            } else if (b10 == 34) {
                this._inputPtr = i10 + 1;
                return this._textBuffer.setCurrentAndReturn(i11);
            }
        }
        this._inputPtr = i10;
        _finishString2(emptyAndGetCurrentSegment, i11);
        return this._textBuffer.contentsAsString();
    }

    /* access modifiers changed from: protected */
    public void _finishString() {
        int i10 = this._inputPtr;
        if (i10 >= this._inputEnd) {
            _loadMoreGuaranteed();
            i10 = this._inputPtr;
        }
        char[] emptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        int[] iArr = _icUTF8;
        int min = Math.min(this._inputEnd, emptyAndGetCurrentSegment.length + i10);
        byte[] bArr = this._inputBuffer;
        int i11 = 0;
        while (true) {
            if (i10 >= min) {
                break;
            }
            byte b10 = bArr[i10] & 255;
            if (iArr[b10] == 0) {
                i10++;
                emptyAndGetCurrentSegment[i11] = (char) b10;
                i11++;
            } else if (b10 == 34) {
                this._inputPtr = i10 + 1;
                this._textBuffer.setCurrentLength(i11);
                return;
            }
        }
        this._inputPtr = i10;
        _finishString2(emptyAndGetCurrentSegment, i11);
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
        int[] iArr = _icUTF8;
        byte[] bArr = this._inputBuffer;
        int i10 = 0;
        while (true) {
            if (this._inputPtr >= this._inputEnd) {
                _loadMoreGuaranteed();
            }
            if (i10 >= emptyAndGetCurrentSegment.length) {
                emptyAndGetCurrentSegment = this._textBuffer.finishCurrentSegment();
                i10 = 0;
            }
            int i11 = this._inputEnd;
            int length = this._inputPtr + (emptyAndGetCurrentSegment.length - i10);
            if (length < i11) {
                i11 = length;
            }
            while (true) {
                int i12 = this._inputPtr;
                if (i12 >= i11) {
                    break;
                }
                int i13 = i12 + 1;
                this._inputPtr = i13;
                int i14 = bArr[i12] & 255;
                if (i14 != 39 && iArr[i14] == 0) {
                    emptyAndGetCurrentSegment[i10] = (char) i14;
                    i10++;
                } else if (i14 == 39) {
                    this._textBuffer.setCurrentLength(i10);
                    return JsonToken.VALUE_STRING;
                } else {
                    int i15 = iArr[i14];
                    if (i15 == 1) {
                        i14 = _decodeEscaped();
                    } else if (i15 == 2) {
                        i14 = _decodeUtf8_2(i14);
                    } else if (i15 != 3) {
                        if (i15 != 4) {
                            if (i14 < 32) {
                                _throwUnquotedSpace(i14, "string value");
                            }
                            _reportInvalidChar(i14);
                        } else {
                            int _decodeUtf8_4 = _decodeUtf8_4(i14);
                            int i16 = i10 + 1;
                            emptyAndGetCurrentSegment[i10] = (char) ((_decodeUtf8_4 >> 10) | GeneratorBase.SURR1_FIRST);
                            if (i16 >= emptyAndGetCurrentSegment.length) {
                                emptyAndGetCurrentSegment = this._textBuffer.finishCurrentSegment();
                                i10 = 0;
                            } else {
                                i10 = i16;
                            }
                            i14 = 56320 | (_decodeUtf8_4 & 1023);
                        }
                    } else if (this._inputEnd - i13 >= 2) {
                        i14 = _decodeUtf8_3fast(i14);
                    } else {
                        i14 = _decodeUtf8_3(i14);
                    }
                    if (i10 >= emptyAndGetCurrentSegment.length) {
                        emptyAndGetCurrentSegment = this._textBuffer.finishCurrentSegment();
                        i10 = 0;
                    }
                    emptyAndGetCurrentSegment[i10] = (char) i14;
                    i10++;
                }
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, byte], vars: [r4v0 ?, r4v1 ?, r4v2 ?, r4v6 ?]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:102)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:78)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:69)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:32)
        */
    protected com.fasterxml.jackson.core.JsonToken _handleInvalidNumberStart(
/*
Method generation error in method: com.fasterxml.jackson.core.json.UTF8StreamJsonParser._handleInvalidNumberStart(int, boolean):com.fasterxml.jackson.core.JsonToken, dex: classes2.dex
    jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r4v0 ?
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
        if (i10 == 39 && isEnabled(JsonParser.Feature.ALLOW_SINGLE_QUOTES)) {
            return _parseAposName();
        }
        if (!isEnabled(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES)) {
            _reportUnexpectedChar((char) _decodeCharForError(i10), "was expecting double-quote to start field name");
        }
        int[] inputCodeUtf8JsNames = CharTypes.getInputCodeUtf8JsNames();
        if (inputCodeUtf8JsNames[i10] != 0) {
            _reportUnexpectedChar(i10, "was expecting either valid name character (for unquoted name) or double-quote (for quoted) to start field name");
        }
        int[] iArr = this._quadBuffer;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            if (i11 < 4) {
                i11++;
                i13 = i10 | (i13 << 8);
            } else {
                if (i12 >= iArr.length) {
                    iArr = growArrayBy(iArr, iArr.length);
                    this._quadBuffer = iArr;
                }
                iArr[i12] = i13;
                i13 = i10;
                i12++;
                i11 = 1;
            }
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                _reportInvalidEOF(" in field name", JsonToken.FIELD_NAME);
            }
            byte[] bArr = this._inputBuffer;
            int i14 = this._inputPtr;
            i10 = bArr[i14] & 255;
            if (inputCodeUtf8JsNames[i10] != 0) {
                break;
            }
            this._inputPtr = i14 + 1;
        }
        if (i11 > 0) {
            if (i12 >= iArr.length) {
                iArr = growArrayBy(iArr, iArr.length);
                this._quadBuffer = iArr;
            }
            iArr[i12] = i13;
            i12++;
        }
        String findName = this._symbols.findName(iArr, i12);
        if (findName == null) {
            return addName(iArr, i12, i11);
        }
        return findName;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001b, code lost:
        if (r4 != 44) goto L_0x00a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0048, code lost:
        if (r3._parsingContext.inArray() == false) goto L_0x00a2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00a8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.fasterxml.jackson.core.JsonToken _handleUnexpectedValue(int r4) {
        /*
            r3 = this;
            r0 = 39
            if (r4 == r0) goto L_0x0095
            r0 = 73
            r1 = 1
            if (r4 == r0) goto L_0x007b
            r0 = 78
            if (r4 == r0) goto L_0x0061
            r0 = 93
            if (r4 == r0) goto L_0x0042
            r0 = 125(0x7d, float:1.75E-43)
            if (r4 == r0) goto L_0x005b
            r0 = 43
            if (r4 == r0) goto L_0x001f
            r0 = 44
            if (r4 == r0) goto L_0x004b
            goto L_0x00a2
        L_0x001f:
            int r4 = r3._inputPtr
            int r0 = r3._inputEnd
            if (r4 < r0) goto L_0x0030
            boolean r4 = r3._loadMore()
            if (r4 != 0) goto L_0x0030
            com.fasterxml.jackson.core.JsonToken r4 = com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_INT
            r3._reportInvalidEOFInValue(r4)
        L_0x0030:
            byte[] r4 = r3._inputBuffer
            int r0 = r3._inputPtr
            int r1 = r0 + 1
            r3._inputPtr = r1
            byte r4 = r4[r0]
            r4 = r4 & 255(0xff, float:3.57E-43)
            r0 = 0
            com.fasterxml.jackson.core.JsonToken r4 = r3._handleInvalidNumberStart(r4, r0)
            return r4
        L_0x0042:
            com.fasterxml.jackson.core.json.JsonReadContext r0 = r3._parsingContext
            boolean r0 = r0.inArray()
            if (r0 != 0) goto L_0x004b
            goto L_0x00a2
        L_0x004b:
            com.fasterxml.jackson.core.JsonParser$Feature r0 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_MISSING_VALUES
            boolean r0 = r3.isEnabled(r0)
            if (r0 == 0) goto L_0x005b
            int r4 = r3._inputPtr
            int r4 = r4 - r1
            r3._inputPtr = r4
            com.fasterxml.jackson.core.JsonToken r4 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL
            return r4
        L_0x005b:
            java.lang.String r0 = "expected a value"
            r3._reportUnexpectedChar(r4, r0)
            goto L_0x0095
        L_0x0061:
            java.lang.String r0 = "NaN"
            r3._matchToken(r0, r1)
            com.fasterxml.jackson.core.JsonParser$Feature r1 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS
            boolean r1 = r3.isEnabled(r1)
            if (r1 == 0) goto L_0x0075
            r1 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            com.fasterxml.jackson.core.JsonToken r4 = r3.resetAsNaN(r0, r1)
            return r4
        L_0x0075:
            java.lang.String r0 = "Non-standard token 'NaN': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow"
            r3._reportError(r0)
            goto L_0x00a2
        L_0x007b:
            java.lang.String r0 = "Infinity"
            r3._matchToken(r0, r1)
            com.fasterxml.jackson.core.JsonParser$Feature r1 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS
            boolean r1 = r3.isEnabled(r1)
            if (r1 == 0) goto L_0x008f
            r1 = 9218868437227405312(0x7ff0000000000000, double:Infinity)
            com.fasterxml.jackson.core.JsonToken r4 = r3.resetAsNaN(r0, r1)
            return r4
        L_0x008f:
            java.lang.String r0 = "Non-standard token 'Infinity': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow"
            r3._reportError(r0)
            goto L_0x00a2
        L_0x0095:
            com.fasterxml.jackson.core.JsonParser$Feature r0 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_SINGLE_QUOTES
            boolean r0 = r3.isEnabled(r0)
            if (r0 == 0) goto L_0x00a2
            com.fasterxml.jackson.core.JsonToken r4 = r3._handleApos()
            return r4
        L_0x00a2:
            boolean r0 = java.lang.Character.isJavaIdentifierStart(r4)
            if (r0 == 0) goto L_0x00bf
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = ""
            r0.append(r1)
            char r1 = (char) r4
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "('true', 'false' or 'null')"
            r3._reportInvalidToken(r0, r1)
        L_0x00bf:
            java.lang.String r0 = "expected a valid value (number, String, array, object, 'true', 'false' or 'null')"
            r3._reportUnexpectedChar(r4, r0)
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.UTF8StreamJsonParser._handleUnexpectedValue(int):com.fasterxml.jackson.core.JsonToken");
    }

    /* access modifiers changed from: protected */
    public final boolean _loadMore() {
        byte[] bArr;
        int length;
        int i10 = this._inputEnd;
        this._currInputProcessed += (long) i10;
        this._currInputRowStart -= i10;
        this._nameStartOffset -= i10;
        InputStream inputStream = this._inputStream;
        if (inputStream == null || (length = bArr.length) == 0) {
            return false;
        }
        int read = inputStream.read((bArr = this._inputBuffer), 0, length);
        if (read > 0) {
            this._inputPtr = 0;
            this._inputEnd = read;
            return true;
        }
        _closeInput();
        if (read == 0) {
            throw new IOException("InputStream.read() returned 0 characters when trying to read " + this._inputBuffer.length + " bytes");
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
    public final boolean _loadToHaveAtLeast(int i10) {
        if (this._inputStream == null) {
            return false;
        }
        int i11 = this._inputEnd;
        int i12 = this._inputPtr;
        int i13 = i11 - i12;
        if (i13 <= 0 || i12 <= 0) {
            this._inputEnd = 0;
        } else {
            this._currInputProcessed += (long) i12;
            this._currInputRowStart -= i12;
            this._nameStartOffset -= i12;
            byte[] bArr = this._inputBuffer;
            System.arraycopy(bArr, i12, bArr, 0, i13);
            this._inputEnd = i13;
        }
        this._inputPtr = 0;
        while (true) {
            int i14 = this._inputEnd;
            if (i14 >= i10) {
                return true;
            }
            InputStream inputStream = this._inputStream;
            byte[] bArr2 = this._inputBuffer;
            int read = inputStream.read(bArr2, i14, bArr2.length - i14);
            if (read < 1) {
                _closeInput();
                if (read != 0) {
                    return false;
                }
                throw new IOException("InputStream.read() returned 0 characters when trying to read " + i13 + " bytes");
            }
            this._inputEnd += read;
        }
    }

    /* access modifiers changed from: protected */
    public final void _matchToken(String str, int i10) {
        int i11;
        int length = str.length();
        if (this._inputPtr + length >= this._inputEnd) {
            _matchToken2(str, i10);
            return;
        }
        do {
            if (this._inputBuffer[this._inputPtr] != str.charAt(i10)) {
                _reportInvalidToken(str.substring(0, i10));
            }
            i11 = this._inputPtr + 1;
            this._inputPtr = i11;
            i10++;
        } while (i10 < length);
        byte b10 = this._inputBuffer[i11] & 255;
        if (b10 >= 48 && b10 != 93 && b10 != 125) {
            _checkMatchEnd(str, i10, b10);
        }
    }

    /* access modifiers changed from: protected */
    public String _parseAposName() {
        int i10;
        int i11;
        if (this._inputPtr >= this._inputEnd && !_loadMore()) {
            _reportInvalidEOF(": was expecting closing ''' for field name", JsonToken.FIELD_NAME);
        }
        byte[] bArr = this._inputBuffer;
        int i12 = this._inputPtr;
        this._inputPtr = i12 + 1;
        char c10 = bArr[i12] & 255;
        if (c10 == '\'') {
            return "";
        }
        int[] iArr = this._quadBuffer;
        int[] iArr2 = _icLatin1;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (c10 != '\'') {
            if (!(c10 == '\"' || iArr2[c10] == 0)) {
                if (c10 != '\\') {
                    _throwUnquotedSpace(c10, "name");
                } else {
                    c10 = _decodeEscaped();
                }
                if (c10 > 127) {
                    if (i11 >= 4) {
                        if (i14 >= iArr.length) {
                            iArr = growArrayBy(iArr, iArr.length);
                            this._quadBuffer = iArr;
                        }
                        iArr[i14] = i10;
                        i10 = 0;
                        i14++;
                        i11 = 0;
                    }
                    if (c10 < 2048) {
                        i10 = (i10 << 8) | (c10 >> 6) | 192;
                        i11++;
                    } else {
                        int i16 = (i10 << 8) | (c10 >> 12) | 224;
                        int i17 = i11 + 1;
                        if (i17 >= 4) {
                            if (i14 >= iArr.length) {
                                iArr = growArrayBy(iArr, iArr.length);
                                this._quadBuffer = iArr;
                            }
                            iArr[i14] = i16;
                            i16 = 0;
                            i14++;
                            i17 = 0;
                        }
                        i10 = (i16 << 8) | ((c10 >> 6) & 63) | 128;
                        i11 = i17 + 1;
                    }
                    c10 = (c10 & '?') | 128;
                }
            }
            if (i11 < 4) {
                i13 = i11 + 1;
                i15 = c10 | (i10 << 8);
            } else {
                if (i14 >= iArr.length) {
                    iArr = growArrayBy(iArr, iArr.length);
                    this._quadBuffer = iArr;
                }
                iArr[i14] = i10;
                i15 = c10;
                i14++;
                i13 = 1;
            }
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                _reportInvalidEOF(" in field name", JsonToken.FIELD_NAME);
            }
            byte[] bArr2 = this._inputBuffer;
            int i18 = this._inputPtr;
            this._inputPtr = i18 + 1;
            c10 = bArr2[i18] & 255;
        }
        if (i11 > 0) {
            if (i14 >= iArr.length) {
                iArr = growArrayBy(iArr, iArr.length);
                this._quadBuffer = iArr;
            }
            iArr[i14] = pad(i10, i11);
            i14++;
        }
        String findName = this._symbols.findName(iArr, i14);
        if (findName == null) {
            return addName(iArr, i14, i11);
        }
        return findName;
    }

    /* access modifiers changed from: protected */
    public final String _parseName(int i10) {
        if (i10 != 34) {
            return _handleOddName(i10);
        }
        int i11 = this._inputPtr;
        if (i11 + 13 > this._inputEnd) {
            return slowParseName();
        }
        byte[] bArr = this._inputBuffer;
        int[] iArr = _icLatin1;
        int i12 = i11 + 1;
        this._inputPtr = i12;
        byte b10 = bArr[i11] & 255;
        if (iArr[b10] == 0) {
            int i13 = i11 + 2;
            this._inputPtr = i13;
            byte b11 = bArr[i12] & 255;
            if (iArr[b11] == 0) {
                byte b12 = b11 | (b10 << 8);
                int i14 = i11 + 3;
                this._inputPtr = i14;
                byte b13 = bArr[i13] & 255;
                if (iArr[b13] == 0) {
                    byte b14 = (b12 << 8) | b13;
                    int i15 = i11 + 4;
                    this._inputPtr = i15;
                    byte b15 = bArr[i14] & 255;
                    if (iArr[b15] == 0) {
                        byte b16 = (b14 << 8) | b15;
                        this._inputPtr = i11 + 5;
                        byte b17 = bArr[i15] & 255;
                        if (iArr[b17] == 0) {
                            this._quad1 = b16;
                            return parseMediumName(b17);
                        } else if (b17 == 34) {
                            return findName(b16, 4);
                        } else {
                            return parseName(b16, b17, 4);
                        }
                    } else if (b15 == 34) {
                        return findName(b14, 3);
                    } else {
                        return parseName(b14, b15, 3);
                    }
                } else if (b13 == 34) {
                    return findName(b12, 2);
                } else {
                    return parseName(b12, b13, 2);
                }
            } else if (b11 == 34) {
                return findName(b10, 1);
            } else {
                return parseName(b10, b11, 1);
            }
        } else if (b10 == 34) {
            return "";
        } else {
            return parseName(0, b10, 0);
        }
    }

    /* access modifiers changed from: protected */
    public JsonToken _parseNegNumber() {
        int i10;
        byte b10;
        char[] emptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        emptyAndGetCurrentSegment[0] = '-';
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        byte[] bArr = this._inputBuffer;
        int i11 = this._inputPtr;
        this._inputPtr = i11 + 1;
        int i12 = bArr[i11] & 255;
        if (i12 < 48 || i12 > 57) {
            return _handleInvalidNumberStart(i12, true);
        }
        if (i12 == 48) {
            i12 = _verifyNoLeadingZeroes();
        }
        emptyAndGetCurrentSegment[1] = (char) i12;
        int i13 = 2;
        int length = (this._inputPtr + emptyAndGetCurrentSegment.length) - 2;
        int i14 = this._inputEnd;
        if (length > i14) {
            length = i14;
        }
        int i15 = 1;
        while (true) {
            i10 = this._inputPtr;
            if (i10 >= length) {
                return _parseNumber2(emptyAndGetCurrentSegment, i13, true, i15);
            }
            byte[] bArr2 = this._inputBuffer;
            this._inputPtr = i10 + 1;
            b10 = bArr2[i10] & 255;
            if (b10 >= 48 && b10 <= 57) {
                i15++;
                emptyAndGetCurrentSegment[i13] = (char) b10;
                i13++;
            }
        }
        if (b10 == 46 || b10 == 101 || b10 == 69) {
            return _parseFloat(emptyAndGetCurrentSegment, i13, b10, true, i15);
        }
        this._inputPtr = i10;
        this._textBuffer.setCurrentLength(i13);
        if (this._parsingContext.inRoot()) {
            _verifyRootSpace(b10);
        }
        return resetInt(true, i15);
    }

    /* access modifiers changed from: protected */
    public JsonToken _parsePosNumber(int i10) {
        int i11;
        byte b10;
        char[] emptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        if (i10 == 48) {
            i10 = _verifyNoLeadingZeroes();
        }
        emptyAndGetCurrentSegment[0] = (char) i10;
        int i12 = 1;
        int length = (this._inputPtr + emptyAndGetCurrentSegment.length) - 1;
        int i13 = this._inputEnd;
        int i14 = 1;
        if (length > i13) {
            length = i13;
        }
        while (true) {
            i11 = this._inputPtr;
            if (i11 >= length) {
                return _parseNumber2(emptyAndGetCurrentSegment, i12, false, i14);
            }
            byte[] bArr = this._inputBuffer;
            this._inputPtr = i11 + 1;
            b10 = bArr[i11] & 255;
            if (b10 >= 48 && b10 <= 57) {
                i14++;
                emptyAndGetCurrentSegment[i12] = (char) b10;
                i12++;
            }
        }
        if (b10 == 46 || b10 == 101 || b10 == 69) {
            return _parseFloat(emptyAndGetCurrentSegment, i12, b10, false, i14);
        }
        this._inputPtr = i11;
        this._textBuffer.setCurrentLength(i12);
        if (this._parsingContext.inRoot()) {
            _verifyRootSpace(b10);
        }
        return resetInt(false, i14);
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
            byte[] bArr2 = this._inputBuffer;
            int i12 = this._inputPtr;
            this._inputPtr = i12 + 1;
            byte b10 = bArr2[i12] & 255;
            if (b10 > 32) {
                int decodeBase64Char = base64Variant.decodeBase64Char((int) b10);
                if (decodeBase64Char < 0) {
                    if (b10 == 34) {
                        break;
                    }
                    decodeBase64Char = _decodeBase64Escape(base64Variant, (int) b10, 0);
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
                byte[] bArr3 = this._inputBuffer;
                int i13 = this._inputPtr;
                this._inputPtr = i13 + 1;
                byte b11 = bArr3[i13] & 255;
                int decodeBase64Char2 = base64Variant.decodeBase64Char((int) b11);
                if (decodeBase64Char2 < 0) {
                    decodeBase64Char2 = _decodeBase64Escape(base64Variant, (int) b11, 1);
                }
                int i14 = (decodeBase64Char << 6) | decodeBase64Char2;
                if (this._inputPtr >= this._inputEnd) {
                    _loadMoreGuaranteed();
                }
                byte[] bArr4 = this._inputBuffer;
                int i15 = this._inputPtr;
                this._inputPtr = i15 + 1;
                byte b12 = bArr4[i15] & 255;
                int decodeBase64Char3 = base64Variant.decodeBase64Char((int) b12);
                if (decodeBase64Char3 < 0) {
                    if (decodeBase64Char3 != -2) {
                        if (b12 == 34 && !base64Variant.usesPadding()) {
                            bArr[i10] = (byte) (i14 >> 4);
                            i10++;
                            break;
                        }
                        decodeBase64Char3 = _decodeBase64Escape(base64Variant, (int) b12, 2);
                    }
                    if (decodeBase64Char3 == -2) {
                        if (this._inputPtr >= this._inputEnd) {
                            _loadMoreGuaranteed();
                        }
                        byte[] bArr5 = this._inputBuffer;
                        int i16 = this._inputPtr;
                        this._inputPtr = i16 + 1;
                        byte b13 = bArr5[i16] & 255;
                        if (base64Variant.usesPaddingChar((int) b13)) {
                            bArr[i10] = (byte) (i14 >> 4);
                            i10++;
                        } else {
                            throw reportInvalidBase64Char(base64Variant, b13, 3, "expected padding character '" + base64Variant.getPaddingChar() + "'");
                        }
                    }
                }
                int i17 = (i14 << 6) | decodeBase64Char3;
                if (this._inputPtr >= this._inputEnd) {
                    _loadMoreGuaranteed();
                }
                byte[] bArr6 = this._inputBuffer;
                int i18 = this._inputPtr;
                this._inputPtr = i18 + 1;
                byte b14 = bArr6[i18] & 255;
                int decodeBase64Char4 = base64Variant.decodeBase64Char((int) b14);
                if (decodeBase64Char4 < 0) {
                    if (decodeBase64Char4 != -2) {
                        if (b14 == 34 && !base64Variant.usesPadding()) {
                            int i19 = i10 + 1;
                            bArr[i10] = (byte) (i17 >> 10);
                            i10 += 2;
                            bArr[i19] = (byte) (i17 >> 2);
                            break;
                        }
                        decodeBase64Char4 = _decodeBase64Escape(base64Variant, (int) b14, 3);
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
        byte[] bArr;
        super._releaseBuffers();
        this._symbols.release();
        if (this._bufferRecyclable && (bArr = this._inputBuffer) != null) {
            this._inputBuffer = ByteArrayBuilder.NO_BYTES;
            this._ioContext.releaseReadIOBuffer(bArr);
        }
    }

    /* access modifiers changed from: protected */
    public void _reportInvalidChar(int i10) {
        if (i10 < 32) {
            _throwInvalidSpace(i10);
        }
        _reportInvalidInitial(i10);
    }

    /* access modifiers changed from: protected */
    public void _reportInvalidInitial(int i10) {
        _reportError("Invalid UTF-8 start byte 0x" + Integer.toHexString(i10));
    }

    /* access modifiers changed from: protected */
    public void _reportInvalidOther(int i10) {
        _reportError("Invalid UTF-8 middle byte 0x" + Integer.toHexString(i10));
    }

    /* access modifiers changed from: protected */
    public void _reportInvalidToken(String str) {
        _reportInvalidToken(str, "'null', 'true', 'false' or NaN");
    }

    /* access modifiers changed from: protected */
    public final void _skipCR() {
        if (this._inputPtr < this._inputEnd || _loadMore()) {
            byte[] bArr = this._inputBuffer;
            int i10 = this._inputPtr;
            if (bArr[i10] == 10) {
                this._inputPtr = i10 + 1;
            }
        }
        this._currInputRow++;
        this._currInputRowStart = this._inputPtr;
    }

    /* access modifiers changed from: protected */
    public void _skipString() {
        this._tokenIncomplete = false;
        int[] iArr = _icUTF8;
        byte[] bArr = this._inputBuffer;
        while (true) {
            int i10 = this._inputPtr;
            int i11 = this._inputEnd;
            if (i10 >= i11) {
                _loadMoreGuaranteed();
                i10 = this._inputPtr;
                i11 = this._inputEnd;
            }
            while (true) {
                if (i10 >= i11) {
                    this._inputPtr = i10;
                    break;
                }
                int i12 = i10 + 1;
                byte b10 = bArr[i10] & 255;
                int i13 = iArr[b10];
                if (i13 != 0) {
                    this._inputPtr = i12;
                    if (b10 != 34) {
                        if (i13 == 1) {
                            _decodeEscaped();
                        } else if (i13 == 2) {
                            _skipUtf8_2();
                        } else if (i13 == 3) {
                            _skipUtf8_3();
                        } else if (i13 == 4) {
                            _skipUtf8_4(b10);
                        } else if (b10 < 32) {
                            _throwUnquotedSpace(b10, "string value");
                        } else {
                            _reportInvalidChar(b10);
                        }
                    } else {
                        return;
                    }
                } else {
                    i10 = i12;
                }
            }
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
        return new JsonLocation(this._ioContext.getSourceReference(), this._currInputProcessed + ((long) this._inputPtr), -1, this._currInputRow, (this._inputPtr - this._currInputRowStart) + 1);
    }

    public Object getInputSource() {
        return this._inputStream;
    }

    public String getText() {
        JsonToken jsonToken = this._currToken;
        if (jsonToken != JsonToken.VALUE_STRING) {
            return _getText2(jsonToken);
        }
        if (!this._tokenIncomplete) {
            return this._textBuffer.contentsAsString();
        }
        this._tokenIncomplete = false;
        return _finishAndReturnString();
    }

    public char[] getTextCharacters() {
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

    public int getTextLength() {
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
    public int getTextOffset() {
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
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.UTF8StreamJsonParser.getTextOffset():int");
    }

    public JsonLocation getTokenLocation() {
        Object sourceReference = this._ioContext.getSourceReference();
        if (this._currToken != JsonToken.FIELD_NAME) {
            return new JsonLocation(sourceReference, this._tokenInputTotal - 1, -1, this._tokenInputRow, this._tokenInputCol);
        }
        return new JsonLocation(sourceReference, ((long) (this._nameStartOffset - 1)) + this._currInputProcessed, -1, this._nameStartRow, this._nameStartCol);
    }

    public int getValueAsInt() {
        JsonToken jsonToken = this._currToken;
        if (jsonToken != JsonToken.VALUE_NUMBER_INT && jsonToken != JsonToken.VALUE_NUMBER_FLOAT) {
            return super.getValueAsInt(0);
        }
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

    public String getValueAsString() {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == JsonToken.VALUE_STRING) {
            if (!this._tokenIncomplete) {
                return this._textBuffer.contentsAsString();
            }
            this._tokenIncomplete = false;
            return _finishAndReturnString();
        } else if (jsonToken == JsonToken.FIELD_NAME) {
            return getCurrentName();
        } else {
            return super.getValueAsString((String) null);
        }
    }

    public Boolean nextBooleanValue() {
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
        if (nextToken == JsonToken.VALUE_TRUE) {
            return Boolean.TRUE;
        }
        if (nextToken == JsonToken.VALUE_FALSE) {
            return Boolean.FALSE;
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
                if (_skipWSOrEnd != 44) {
                    _reportUnexpectedChar(_skipWSOrEnd, "was expecting comma to separate " + this._parsingContext.typeDesc() + " entries");
                }
                _skipWSOrEnd = _skipWS();
            }
            if (!this._parsingContext.inObject()) {
                _updateLocation();
                _nextTokenNotInObject(_skipWSOrEnd);
                return false;
            }
            _updateNameLocation();
            if (_skipWSOrEnd == 34) {
                byte[] asQuotedUTF8 = serializableString.asQuotedUTF8();
                int length = asQuotedUTF8.length;
                int i11 = this._inputPtr;
                if (i11 + length + 4 < this._inputEnd) {
                    int i12 = length + i11;
                    if (this._inputBuffer[i12] == 34) {
                        while (i11 != i12) {
                            if (asQuotedUTF8[i10] == this._inputBuffer[i11]) {
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
            return _isNextTokenNameMaybe(_skipWSOrEnd, serializableString);
        }
    }

    public int nextIntValue(int i10) {
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

    public long nextLongValue(long j10) {
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

    public String nextTextValue() {
        if (this._currToken == JsonToken.FIELD_NAME) {
            this._nameCopied = false;
            JsonToken jsonToken = this._nextToken;
            this._nextToken = null;
            this._currToken = jsonToken;
            if (jsonToken != JsonToken.VALUE_STRING) {
                if (jsonToken == JsonToken.START_ARRAY) {
                    this._parsingContext = this._parsingContext.createChildArrayContext(this._tokenInputRow, this._tokenInputCol);
                } else if (jsonToken == JsonToken.START_OBJECT) {
                    this._parsingContext = this._parsingContext.createChildObjectContext(this._tokenInputRow, this._tokenInputCol);
                }
                return null;
            } else if (!this._tokenIncomplete) {
                return this._textBuffer.contentsAsString();
            } else {
                this._tokenIncomplete = false;
                return _finishAndReturnString();
            }
        } else if (nextToken() == JsonToken.VALUE_STRING) {
            return getText();
        } else {
            return null;
        }
    }

    public JsonToken nextToken() {
        JsonToken jsonToken;
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
                if (_skipWSOrEnd != 44) {
                    _reportUnexpectedChar(_skipWSOrEnd, "was expecting comma to separate " + this._parsingContext.typeDesc() + " entries");
                }
                _skipWSOrEnd = _skipWS();
            }
            if (!this._parsingContext.inObject()) {
                _updateLocation();
                return _nextTokenNotInObject(_skipWSOrEnd);
            }
            _updateNameLocation();
            this._parsingContext.setCurrentName(_parseName(_skipWSOrEnd));
            this._currToken = jsonToken3;
            int _skipColon = _skipColon();
            _updateLocation();
            if (_skipColon == 34) {
                this._tokenIncomplete = true;
                this._nextToken = JsonToken.VALUE_STRING;
                return this._currToken;
            }
            if (_skipColon == 45) {
                jsonToken = _parseNegNumber();
            } else if (_skipColon == 91) {
                jsonToken = JsonToken.START_ARRAY;
            } else if (_skipColon == 102) {
                _matchToken(b.f37476ag, 1);
                jsonToken = JsonToken.VALUE_FALSE;
            } else if (_skipColon == 110) {
                _matchToken("null", 1);
                jsonToken = JsonToken.VALUE_NULL;
            } else if (_skipColon == 116) {
                _matchToken(b.f37475af, 1);
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
                        jsonToken = _handleUnexpectedValue(_skipColon);
                        break;
                }
            } else {
                jsonToken = JsonToken.START_OBJECT;
            }
            this._nextToken = jsonToken;
            return this._currToken;
        }
    }

    /* access modifiers changed from: protected */
    public final String parseEscapedName(int[] iArr, int i10, int i11, int i12, int i13) {
        int[] iArr2 = _icLatin1;
        while (true) {
            if (iArr2[i12] != 0) {
                if (i12 == 34) {
                    break;
                }
                if (i12 != 92) {
                    _throwUnquotedSpace(i12, "name");
                } else {
                    i12 = _decodeEscaped();
                }
                if (i12 > 127) {
                    int i14 = 0;
                    if (r10 >= 4) {
                        if (i10 >= iArr.length) {
                            iArr = growArrayBy(iArr, iArr.length);
                            this._quadBuffer = iArr;
                        }
                        iArr[i10] = r8;
                        i10++;
                        r8 = 0;
                        r10 = 0;
                    }
                    if (i12 < 2048) {
                        r8 = (r8 << 8) | (i12 >> 6) | 192;
                        r10++;
                    } else {
                        int i15 = (r8 << 8) | (i12 >> 12) | 224;
                        int i16 = r10 + 1;
                        if (i16 >= 4) {
                            if (i10 >= iArr.length) {
                                iArr = growArrayBy(iArr, iArr.length);
                                this._quadBuffer = iArr;
                            }
                            iArr[i10] = i15;
                            i10++;
                            i16 = 0;
                        } else {
                            i14 = i15;
                        }
                        r8 = (i14 << 8) | ((i12 >> 6) & 63) | 128;
                        r10 = i16 + 1;
                    }
                    i12 = (i12 & 63) | 128;
                }
            }
            if (r10 < 4) {
                i13 = r10 + 1;
                i11 = (r8 << 8) | i12;
            } else {
                if (i10 >= iArr.length) {
                    iArr = growArrayBy(iArr, iArr.length);
                    this._quadBuffer = iArr;
                }
                iArr[i10] = r8;
                i11 = i12;
                i10++;
                i13 = 1;
            }
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                _reportInvalidEOF(" in field name", JsonToken.FIELD_NAME);
            }
            byte[] bArr = this._inputBuffer;
            int i17 = this._inputPtr;
            this._inputPtr = i17 + 1;
            i12 = bArr[i17] & 255;
        }
        if (r10 > 0) {
            if (i10 >= iArr.length) {
                iArr = growArrayBy(iArr, iArr.length);
                this._quadBuffer = iArr;
            }
            iArr[i10] = pad(r8, r10);
            i10++;
        }
        String findName = this._symbols.findName(iArr, i10);
        if (findName == null) {
            return addName(iArr, i10, r10);
        }
        return findName;
    }

    /* access modifiers changed from: protected */
    public final String parseLongName(int i10, int i11, int i12) {
        int[] iArr = this._quadBuffer;
        iArr[0] = this._quad1;
        iArr[1] = i11;
        iArr[2] = i12;
        byte[] bArr = this._inputBuffer;
        int[] iArr2 = _icLatin1;
        byte b10 = i10;
        int i13 = 3;
        while (true) {
            int i14 = this._inputPtr;
            if (i14 + 4 <= this._inputEnd) {
                int i15 = i14 + 1;
                this._inputPtr = i15;
                byte b11 = bArr[i14] & 255;
                if (iArr2[b11] == 0) {
                    byte b12 = (b10 << 8) | b11;
                    int i16 = i14 + 2;
                    this._inputPtr = i16;
                    byte b13 = bArr[i15] & 255;
                    if (iArr2[b13] == 0) {
                        byte b14 = (b12 << 8) | b13;
                        int i17 = i14 + 3;
                        this._inputPtr = i17;
                        byte b15 = bArr[i16] & 255;
                        if (iArr2[b15] == 0) {
                            int i18 = (b14 << 8) | b15;
                            this._inputPtr = i14 + 4;
                            byte b16 = bArr[i17] & 255;
                            if (iArr2[b16] == 0) {
                                int[] iArr3 = this._quadBuffer;
                                if (i13 >= iArr3.length) {
                                    this._quadBuffer = growArrayBy(iArr3, i13);
                                }
                                this._quadBuffer[i13] = i18;
                                b10 = b16;
                                i13++;
                            } else if (b16 == 34) {
                                return findName(this._quadBuffer, i13, i18, 4);
                            } else {
                                return parseEscapedName(this._quadBuffer, i13, i18, b16, 4);
                            }
                        } else if (b15 == 34) {
                            return findName(this._quadBuffer, i13, (int) b14, 3);
                        } else {
                            return parseEscapedName(this._quadBuffer, i13, b14, b15, 3);
                        }
                    } else if (b13 == 34) {
                        return findName(this._quadBuffer, i13, (int) b12, 2);
                    } else {
                        return parseEscapedName(this._quadBuffer, i13, b12, b13, 2);
                    }
                } else if (b11 == 34) {
                    return findName(this._quadBuffer, i13, b10, 1);
                } else {
                    return parseEscapedName(this._quadBuffer, i13, b10, b11, 1);
                }
            } else {
                return parseEscapedName(this._quadBuffer, i13, 0, b10, 0);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final String parseMediumName(int i10) {
        byte[] bArr = this._inputBuffer;
        int[] iArr = _icLatin1;
        int i11 = this._inputPtr;
        int i12 = i11 + 1;
        this._inputPtr = i12;
        byte b10 = bArr[i11] & 255;
        if (iArr[b10] == 0) {
            byte b11 = (i10 << 8) | b10;
            int i13 = i11 + 2;
            this._inputPtr = i13;
            byte b12 = bArr[i12] & 255;
            if (iArr[b12] == 0) {
                byte b13 = (b11 << 8) | b12;
                int i14 = i11 + 3;
                this._inputPtr = i14;
                byte b14 = bArr[i13] & 255;
                if (iArr[b14] == 0) {
                    byte b15 = (b13 << 8) | b14;
                    this._inputPtr = i11 + 4;
                    byte b16 = bArr[i14] & 255;
                    if (iArr[b16] == 0) {
                        return parseMediumName2(b16, b15);
                    }
                    if (b16 == 34) {
                        return findName(this._quad1, b15, 4);
                    }
                    return parseName(this._quad1, b15, b16, 4);
                } else if (b14 == 34) {
                    return findName(this._quad1, b13, 3);
                } else {
                    return parseName(this._quad1, b13, b14, 3);
                }
            } else if (b12 == 34) {
                return findName(this._quad1, b11, 2);
            } else {
                return parseName(this._quad1, b11, b12, 2);
            }
        } else if (b10 == 34) {
            return findName(this._quad1, i10, 1);
        } else {
            return parseName(this._quad1, i10, b10, 1);
        }
    }

    /* access modifiers changed from: protected */
    public final String parseMediumName2(int i10, int i11) {
        byte[] bArr = this._inputBuffer;
        int[] iArr = _icLatin1;
        int i12 = this._inputPtr;
        int i13 = i12 + 1;
        this._inputPtr = i13;
        byte b10 = bArr[i12] & 255;
        if (iArr[b10] == 0) {
            byte b11 = (i10 << 8) | b10;
            int i14 = i12 + 2;
            this._inputPtr = i14;
            byte b12 = bArr[i13] & 255;
            if (iArr[b12] == 0) {
                byte b13 = (b11 << 8) | b12;
                int i15 = i12 + 3;
                this._inputPtr = i15;
                byte b14 = bArr[i14] & 255;
                if (iArr[b14] == 0) {
                    byte b15 = (b13 << 8) | b14;
                    this._inputPtr = i12 + 4;
                    byte b16 = bArr[i15] & 255;
                    if (iArr[b16] == 0) {
                        return parseLongName(b16, i11, b15);
                    }
                    if (b16 == 34) {
                        return findName(this._quad1, i11, (int) b15, 4);
                    }
                    return parseName(this._quad1, i11, b15, b16, 4);
                } else if (b14 == 34) {
                    return findName(this._quad1, i11, (int) b13, 3);
                } else {
                    return parseName(this._quad1, i11, b13, b14, 3);
                }
            } else if (b12 == 34) {
                return findName(this._quad1, i11, (int) b11, 2);
            } else {
                return parseName(this._quad1, i11, b11, b12, 2);
            }
        } else if (b10 == 34) {
            return findName(this._quad1, i11, i10, 1);
        } else {
            return parseName(this._quad1, i11, i10, b10, 1);
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

    public int releaseBuffered(OutputStream outputStream) {
        int i10 = this._inputEnd;
        int i11 = this._inputPtr;
        int i12 = i10 - i11;
        if (i12 < 1) {
            return 0;
        }
        outputStream.write(this._inputBuffer, i11, i12);
        return i12;
    }

    public void setCodec(ObjectCodec objectCodec) {
        this._objectCodec = objectCodec;
    }

    /* access modifiers changed from: protected */
    public String slowParseName() {
        if (this._inputPtr >= this._inputEnd && !_loadMore()) {
            _reportInvalidEOF(": was expecting closing '\"' for name", JsonToken.FIELD_NAME);
        }
        byte[] bArr = this._inputBuffer;
        int i10 = this._inputPtr;
        this._inputPtr = i10 + 1;
        byte b10 = bArr[i10] & 255;
        if (b10 == 34) {
            return "";
        }
        return parseEscapedName(this._quadBuffer, 0, 0, b10, 0);
    }

    private final String parseName(int i10, int i11, int i12, int i13) {
        int[] iArr = this._quadBuffer;
        iArr[0] = i10;
        return parseEscapedName(iArr, 1, i11, i12, i13);
    }

    /* access modifiers changed from: protected */
    public void _reportInvalidOther(int i10, int i11) {
        this._inputPtr = i11;
        _reportInvalidOther(i10);
    }

    /* access modifiers changed from: protected */
    public void _reportInvalidToken(String str, String str2) {
        StringBuilder sb2 = new StringBuilder(str);
        while (sb2.length() < 256 && (this._inputPtr < this._inputEnd || _loadMore())) {
            byte[] bArr = this._inputBuffer;
            int i10 = this._inputPtr;
            this._inputPtr = i10 + 1;
            char _decodeCharForError = (char) _decodeCharForError(bArr[i10]);
            if (!Character.isJavaIdentifierPart(_decodeCharForError)) {
                break;
            }
            sb2.append(_decodeCharForError);
        }
        if (sb2.length() == 256) {
            sb2.append("...");
        }
        _reportError("Unrecognized token '" + sb2.toString() + "': was expecting " + str2);
    }

    private final String parseName(int i10, int i11, int i12, int i13, int i14) {
        int[] iArr = this._quadBuffer;
        iArr[0] = i10;
        iArr[1] = i11;
        return parseEscapedName(iArr, 2, i12, i13, i14);
    }

    private final String findName(int i10, int i11, int i12) {
        int pad = pad(i11, i12);
        String findName = this._symbols.findName(i10, pad);
        if (findName != null) {
            return findName;
        }
        int[] iArr = this._quadBuffer;
        iArr[0] = i10;
        iArr[1] = pad;
        return addName(iArr, 2, i12);
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

    public int getValueAsInt(int i10) {
        JsonToken jsonToken = this._currToken;
        if (jsonToken != JsonToken.VALUE_NUMBER_INT && jsonToken != JsonToken.VALUE_NUMBER_FLOAT) {
            return super.getValueAsInt(i10);
        }
        int i11 = this._numTypesValid;
        if ((i11 & 1) == 0) {
            if (i11 == 0) {
                return _parseIntValue();
            }
            if ((i11 & 1) == 0) {
                convertNumberToInt();
            }
        }
        return this._numberInt;
    }

    public String getValueAsString(String str) {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == JsonToken.VALUE_STRING) {
            if (!this._tokenIncomplete) {
                return this._textBuffer.contentsAsString();
            }
            this._tokenIncomplete = false;
            return _finishAndReturnString();
        } else if (jsonToken == JsonToken.FIELD_NAME) {
            return getCurrentName();
        } else {
            return super.getValueAsString(str);
        }
    }

    private final String findName(int i10, int i11, int i12, int i13) {
        int pad = pad(i12, i13);
        String findName = this._symbols.findName(i10, i11, pad);
        if (findName != null) {
            return findName;
        }
        int[] iArr = this._quadBuffer;
        iArr[0] = i10;
        iArr[1] = i11;
        iArr[2] = pad(pad, i13);
        return addName(iArr, 3, i13);
    }

    private final String findName(int[] iArr, int i10, int i11, int i12) {
        if (i10 >= iArr.length) {
            iArr = growArrayBy(iArr, iArr.length);
            this._quadBuffer = iArr;
        }
        int i13 = i10 + 1;
        iArr[i10] = pad(i11, i12);
        String findName = this._symbols.findName(iArr, i13);
        return findName == null ? addName(iArr, i13, i12) : findName;
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
                if (_skipWSOrEnd != 44) {
                    _reportUnexpectedChar(_skipWSOrEnd, "was expecting comma to separate " + this._parsingContext.typeDesc() + " entries");
                }
                _skipWSOrEnd = _skipWS();
            }
            if (!this._parsingContext.inObject()) {
                _updateLocation();
                _nextTokenNotInObject(_skipWSOrEnd);
                return null;
            }
            _updateNameLocation();
            String _parseName = _parseName(_skipWSOrEnd);
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
                _matchToken(b.f37476ag, 1);
                jsonToken = JsonToken.VALUE_FALSE;
            } else if (_skipColon == 110) {
                _matchToken("null", 1);
                jsonToken = JsonToken.VALUE_NULL;
            } else if (_skipColon == 116) {
                _matchToken(b.f37475af, 1);
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
                        jsonToken = _handleUnexpectedValue(_skipColon);
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
