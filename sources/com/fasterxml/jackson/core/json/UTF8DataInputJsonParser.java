package com.fasterxml.jackson.core.json;

import com.amazon.a.a.o.b;
import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.base.GeneratorBase;
import com.fasterxml.jackson.core.base.ParserBase;
import com.fasterxml.jackson.core.io.CharTypes;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import java.io.DataInput;
import java.io.OutputStream;
import java.io.Writer;
import java.util.Arrays;

public class UTF8DataInputJsonParser extends ParserBase {
    static final byte BYTE_LF = 10;
    protected static final int[] _icLatin1 = CharTypes.getInputCodeLatin1();
    private static final int[] _icUTF8 = CharTypes.getInputCodeUtf8();
    protected DataInput _inputData;
    protected int _nextByte;
    protected ObjectCodec _objectCodec;
    private int _quad1;
    protected int[] _quadBuffer = new int[16];
    protected final ByteQuadsCanonicalizer _symbols;
    protected boolean _tokenIncomplete;

    public UTF8DataInputJsonParser(IOContext iOContext, int i10, DataInput dataInput, ObjectCodec objectCodec, ByteQuadsCanonicalizer byteQuadsCanonicalizer, int i11) {
        super(iOContext, i10);
        this._objectCodec = objectCodec;
        this._symbols = byteQuadsCanonicalizer;
        this._inputData = dataInput;
        this._nextByte = i11;
    }

    private final void _checkMatchEnd(String str, int i10, int i11) {
        char _decodeCharForError = (char) _decodeCharForError(i11);
        if (Character.isJavaIdentifierPart(_decodeCharForError)) {
            _reportInvalidToken(_decodeCharForError, str.substring(0, i10));
        }
    }

    private final int _decodeUtf8_2(int i10) {
        int readUnsignedByte = this._inputData.readUnsignedByte();
        if ((readUnsignedByte & 192) != 128) {
            _reportInvalidOther(readUnsignedByte & 255);
        }
        return ((i10 & 31) << 6) | (readUnsignedByte & 63);
    }

    private final int _decodeUtf8_3(int i10) {
        int i11 = i10 & 15;
        int readUnsignedByte = this._inputData.readUnsignedByte();
        if ((readUnsignedByte & 192) != 128) {
            _reportInvalidOther(readUnsignedByte & 255);
        }
        int i12 = (i11 << 6) | (readUnsignedByte & 63);
        int readUnsignedByte2 = this._inputData.readUnsignedByte();
        if ((readUnsignedByte2 & 192) != 128) {
            _reportInvalidOther(readUnsignedByte2 & 255);
        }
        return (i12 << 6) | (readUnsignedByte2 & 63);
    }

    private final int _decodeUtf8_4(int i10) {
        int readUnsignedByte = this._inputData.readUnsignedByte();
        if ((readUnsignedByte & 192) != 128) {
            _reportInvalidOther(readUnsignedByte & 255);
        }
        int i11 = ((i10 & 7) << 6) | (readUnsignedByte & 63);
        int readUnsignedByte2 = this._inputData.readUnsignedByte();
        if ((readUnsignedByte2 & 192) != 128) {
            _reportInvalidOther(readUnsignedByte2 & 255);
        }
        int i12 = (i11 << 6) | (readUnsignedByte2 & 63);
        int readUnsignedByte3 = this._inputData.readUnsignedByte();
        if ((readUnsignedByte3 & 192) != 128) {
            _reportInvalidOther(readUnsignedByte3 & 255);
        }
        return ((i12 << 6) | (readUnsignedByte3 & 63)) - 65536;
    }

    private String _finishAndReturnString() {
        char[] emptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        int[] iArr = _icUTF8;
        int length = emptyAndGetCurrentSegment.length;
        int i10 = 0;
        while (true) {
            int readUnsignedByte = this._inputData.readUnsignedByte();
            if (iArr[readUnsignedByte] == 0) {
                int i11 = i10 + 1;
                emptyAndGetCurrentSegment[i10] = (char) readUnsignedByte;
                if (i11 >= length) {
                    _finishString2(emptyAndGetCurrentSegment, i11, this._inputData.readUnsignedByte());
                    return this._textBuffer.contentsAsString();
                }
                i10 = i11;
            } else if (readUnsignedByte == 34) {
                return this._textBuffer.setCurrentAndReturn(i10);
            } else {
                _finishString2(emptyAndGetCurrentSegment, i10, readUnsignedByte);
                return this._textBuffer.contentsAsString();
            }
        }
    }

    private final void _finishString2(char[] cArr, int i10, int i11) {
        int[] iArr = _icUTF8;
        int length = cArr.length;
        while (true) {
            int i12 = iArr[i11];
            int i13 = 0;
            if (i12 == 0) {
                if (r8 >= length) {
                    cArr = this._textBuffer.finishCurrentSegment();
                    length = cArr.length;
                    r8 = 0;
                }
                cArr[r8] = (char) i11;
                i11 = this._inputData.readUnsignedByte();
                i10 = r8 + 1;
            } else if (i11 == 34) {
                this._textBuffer.setCurrentLength(r8);
                return;
            } else {
                if (i12 == 1) {
                    i11 = _decodeEscaped();
                } else if (i12 == 2) {
                    i11 = _decodeUtf8_2(i11);
                } else if (i12 == 3) {
                    i11 = _decodeUtf8_3(i11);
                } else if (i12 == 4) {
                    int _decodeUtf8_4 = _decodeUtf8_4(i11);
                    int i14 = r8 + 1;
                    cArr[r8] = (char) ((_decodeUtf8_4 >> 10) | GeneratorBase.SURR1_FIRST);
                    if (i14 >= cArr.length) {
                        cArr = this._textBuffer.finishCurrentSegment();
                        length = cArr.length;
                        r8 = 0;
                    } else {
                        r8 = i14;
                    }
                    i11 = (_decodeUtf8_4 & 1023) | GeneratorBase.SURR2_FIRST;
                } else if (i11 < 32) {
                    _throwUnquotedSpace(i11, "string value");
                } else {
                    _reportInvalidChar(i11);
                }
                if (r8 >= cArr.length) {
                    cArr = this._textBuffer.finishCurrentSegment();
                    length = cArr.length;
                } else {
                    i13 = r8;
                }
                i10 = i13 + 1;
                cArr[i13] = (char) i11;
                i11 = this._inputData.readUnsignedByte();
            }
        }
    }

    private static int[] _growArrayBy(int[] iArr, int i10) {
        if (iArr == null) {
            return new int[i10];
        }
        return Arrays.copyOf(iArr, iArr.length + i10);
    }

    private final int _handleLeadingZeroes() {
        int readUnsignedByte = this._inputData.readUnsignedByte();
        if (readUnsignedByte >= 48 && readUnsignedByte <= 57) {
            if (!isEnabled(JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS)) {
                reportInvalidNumber("Leading zeroes not allowed");
            }
            while (readUnsignedByte == 48) {
                readUnsignedByte = this._inputData.readUnsignedByte();
            }
        }
        return readUnsignedByte;
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

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0030  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.fasterxml.jackson.core.JsonToken _parseFloat(char[] r8, int r9, int r10, boolean r11, int r12) {
        /*
            r7 = this;
            r0 = 46
            r1 = 57
            r2 = 48
            r3 = 0
            if (r10 != r0) goto L_0x0039
            int r0 = r9 + 1
            char r10 = (char) r10
            r8[r9] = r10
            r9 = r0
            r10 = r3
        L_0x0010:
            java.io.DataInput r0 = r7._inputData
            int r0 = r0.readUnsignedByte()
            if (r0 < r2) goto L_0x002e
            if (r0 <= r1) goto L_0x001b
            goto L_0x002e
        L_0x001b:
            int r10 = r10 + 1
            int r4 = r8.length
            if (r9 < r4) goto L_0x0027
            com.fasterxml.jackson.core.util.TextBuffer r8 = r7._textBuffer
            char[] r8 = r8.finishCurrentSegment()
            r9 = r3
        L_0x0027:
            int r4 = r9 + 1
            char r0 = (char) r0
            r8[r9] = r0
            r9 = r4
            goto L_0x0010
        L_0x002e:
            if (r10 != 0) goto L_0x0035
            java.lang.String r4 = "Decimal point not followed by a digit"
            r7.reportUnexpectedNumberChar(r0, r4)
        L_0x0035:
            r6 = r0
            r0 = r10
            r10 = r6
            goto L_0x003a
        L_0x0039:
            r0 = r3
        L_0x003a:
            r4 = 101(0x65, float:1.42E-43)
            if (r10 == r4) goto L_0x0042
            r4 = 69
            if (r10 != r4) goto L_0x00a2
        L_0x0042:
            int r4 = r8.length
            if (r9 < r4) goto L_0x004c
            com.fasterxml.jackson.core.util.TextBuffer r8 = r7._textBuffer
            char[] r8 = r8.finishCurrentSegment()
            r9 = r3
        L_0x004c:
            int r4 = r9 + 1
            char r10 = (char) r10
            r8[r9] = r10
            java.io.DataInput r9 = r7._inputData
            int r9 = r9.readUnsignedByte()
            r10 = 45
            if (r9 == r10) goto L_0x0064
            r10 = 43
            if (r9 != r10) goto L_0x0060
            goto L_0x0064
        L_0x0060:
            r10 = r9
            r9 = r4
            r4 = r3
            goto L_0x007d
        L_0x0064:
            int r10 = r8.length
            if (r4 < r10) goto L_0x006e
            com.fasterxml.jackson.core.util.TextBuffer r8 = r7._textBuffer
            char[] r8 = r8.finishCurrentSegment()
            r4 = r3
        L_0x006e:
            int r10 = r4 + 1
            char r9 = (char) r9
            r8[r4] = r9
            java.io.DataInput r9 = r7._inputData
            int r9 = r9.readUnsignedByte()
            r4 = r3
            r6 = r10
            r10 = r9
            r9 = r6
        L_0x007d:
            if (r10 > r1) goto L_0x009a
            if (r10 < r2) goto L_0x009a
            int r4 = r4 + 1
            int r5 = r8.length
            if (r9 < r5) goto L_0x008d
            com.fasterxml.jackson.core.util.TextBuffer r8 = r7._textBuffer
            char[] r8 = r8.finishCurrentSegment()
            r9 = r3
        L_0x008d:
            int r5 = r9 + 1
            char r10 = (char) r10
            r8[r9] = r10
            java.io.DataInput r9 = r7._inputData
            int r10 = r9.readUnsignedByte()
            r9 = r5
            goto L_0x007d
        L_0x009a:
            if (r4 != 0) goto L_0x00a1
            java.lang.String r8 = "Exponent indicator not followed by a digit"
            r7.reportUnexpectedNumberChar(r10, r8)
        L_0x00a1:
            r3 = r4
        L_0x00a2:
            r7._nextByte = r10
            com.fasterxml.jackson.core.json.JsonReadContext r8 = r7._parsingContext
            boolean r8 = r8.inRoot()
            if (r8 == 0) goto L_0x00af
            r7._verifyRootSpace()
        L_0x00af:
            com.fasterxml.jackson.core.util.TextBuffer r8 = r7._textBuffer
            r8.setCurrentLength(r9)
            com.fasterxml.jackson.core.JsonToken r8 = r7.resetFloat(r11, r12, r0, r3)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._parseFloat(char[], int, int, boolean, int):com.fasterxml.jackson.core.JsonToken");
    }

    private final String _parseLongName(int i10, int i11, int i12) {
        int[] iArr = this._quadBuffer;
        iArr[0] = this._quad1;
        iArr[1] = i11;
        iArr[2] = i12;
        int[] iArr2 = _icLatin1;
        int i13 = i10;
        int i14 = 3;
        while (true) {
            int readUnsignedByte = this._inputData.readUnsignedByte();
            if (iArr2[readUnsignedByte] == 0) {
                int i15 = (i13 << 8) | readUnsignedByte;
                int readUnsignedByte2 = this._inputData.readUnsignedByte();
                if (iArr2[readUnsignedByte2] == 0) {
                    int i16 = (i15 << 8) | readUnsignedByte2;
                    int readUnsignedByte3 = this._inputData.readUnsignedByte();
                    if (iArr2[readUnsignedByte3] == 0) {
                        int i17 = (i16 << 8) | readUnsignedByte3;
                        int readUnsignedByte4 = this._inputData.readUnsignedByte();
                        if (iArr2[readUnsignedByte4] == 0) {
                            int[] iArr3 = this._quadBuffer;
                            if (i14 >= iArr3.length) {
                                this._quadBuffer = _growArrayBy(iArr3, i14);
                            }
                            this._quadBuffer[i14] = i17;
                            i14++;
                            i13 = readUnsignedByte4;
                        } else if (readUnsignedByte4 == 34) {
                            return findName(this._quadBuffer, i14, i17, 4);
                        } else {
                            return parseEscapedName(this._quadBuffer, i14, i17, readUnsignedByte4, 4);
                        }
                    } else if (readUnsignedByte3 == 34) {
                        return findName(this._quadBuffer, i14, i16, 3);
                    } else {
                        return parseEscapedName(this._quadBuffer, i14, i16, readUnsignedByte3, 3);
                    }
                } else if (readUnsignedByte2 == 34) {
                    return findName(this._quadBuffer, i14, i15, 2);
                } else {
                    return parseEscapedName(this._quadBuffer, i14, i15, readUnsignedByte2, 2);
                }
            } else if (readUnsignedByte == 34) {
                return findName(this._quadBuffer, i14, i13, 1);
            } else {
                return parseEscapedName(this._quadBuffer, i14, i13, readUnsignedByte, 1);
            }
        }
    }

    private final String _parseMediumName(int i10) {
        int[] iArr = _icLatin1;
        int readUnsignedByte = this._inputData.readUnsignedByte();
        if (iArr[readUnsignedByte] == 0) {
            int i11 = (i10 << 8) | readUnsignedByte;
            int readUnsignedByte2 = this._inputData.readUnsignedByte();
            if (iArr[readUnsignedByte2] == 0) {
                int i12 = (i11 << 8) | readUnsignedByte2;
                int readUnsignedByte3 = this._inputData.readUnsignedByte();
                if (iArr[readUnsignedByte3] == 0) {
                    int i13 = (i12 << 8) | readUnsignedByte3;
                    int readUnsignedByte4 = this._inputData.readUnsignedByte();
                    if (iArr[readUnsignedByte4] == 0) {
                        return _parseMediumName2(readUnsignedByte4, i13);
                    }
                    if (readUnsignedByte4 == 34) {
                        return findName(this._quad1, i13, 4);
                    }
                    return parseName(this._quad1, i13, readUnsignedByte4, 4);
                } else if (readUnsignedByte3 == 34) {
                    return findName(this._quad1, i12, 3);
                } else {
                    return parseName(this._quad1, i12, readUnsignedByte3, 3);
                }
            } else if (readUnsignedByte2 == 34) {
                return findName(this._quad1, i11, 2);
            } else {
                return parseName(this._quad1, i11, readUnsignedByte2, 2);
            }
        } else if (readUnsignedByte == 34) {
            return findName(this._quad1, i10, 1);
        } else {
            return parseName(this._quad1, i10, readUnsignedByte, 1);
        }
    }

    private final String _parseMediumName2(int i10, int i11) {
        int[] iArr = _icLatin1;
        int readUnsignedByte = this._inputData.readUnsignedByte();
        if (iArr[readUnsignedByte] == 0) {
            int i12 = (i10 << 8) | readUnsignedByte;
            int readUnsignedByte2 = this._inputData.readUnsignedByte();
            if (iArr[readUnsignedByte2] == 0) {
                int i13 = (i12 << 8) | readUnsignedByte2;
                int readUnsignedByte3 = this._inputData.readUnsignedByte();
                if (iArr[readUnsignedByte3] == 0) {
                    int i14 = (i13 << 8) | readUnsignedByte3;
                    int readUnsignedByte4 = this._inputData.readUnsignedByte();
                    if (iArr[readUnsignedByte4] == 0) {
                        return _parseLongName(readUnsignedByte4, i11, i14);
                    }
                    if (readUnsignedByte4 == 34) {
                        return findName(this._quad1, i11, i14, 4);
                    }
                    return parseName(this._quad1, i11, i14, readUnsignedByte4, 4);
                } else if (readUnsignedByte3 == 34) {
                    return findName(this._quad1, i11, i13, 3);
                } else {
                    return parseName(this._quad1, i11, i13, readUnsignedByte3, 3);
                }
            } else if (readUnsignedByte2 == 34) {
                return findName(this._quad1, i11, i12, 2);
            } else {
                return parseName(this._quad1, i11, i12, readUnsignedByte2, 2);
            }
        } else if (readUnsignedByte == 34) {
            return findName(this._quad1, i11, i10, 1);
        } else {
            return parseName(this._quad1, i11, i10, readUnsignedByte, 1);
        }
    }

    private void _reportInvalidOther(int i10) {
        _reportError("Invalid UTF-8 middle byte 0x" + Integer.toHexString(i10));
    }

    private final void _skipCComment() {
        int[] inputCodeComment = CharTypes.getInputCodeComment();
        int readUnsignedByte = this._inputData.readUnsignedByte();
        while (true) {
            int i10 = inputCodeComment[readUnsignedByte];
            if (i10 != 0) {
                if (i10 == 2) {
                    _skipUtf8_2();
                } else if (i10 == 3) {
                    _skipUtf8_3();
                } else if (i10 == 4) {
                    _skipUtf8_4();
                } else if (i10 == 10 || i10 == 13) {
                    this._currInputRow++;
                } else if (i10 != 42) {
                    _reportInvalidChar(readUnsignedByte);
                } else {
                    readUnsignedByte = this._inputData.readUnsignedByte();
                    if (readUnsignedByte == 47) {
                        return;
                    }
                }
            }
            readUnsignedByte = this._inputData.readUnsignedByte();
        }
    }

    private final int _skipColon() {
        int i10 = this._nextByte;
        if (i10 < 0) {
            i10 = this._inputData.readUnsignedByte();
        } else {
            this._nextByte = -1;
        }
        if (i10 == 58) {
            int readUnsignedByte = this._inputData.readUnsignedByte();
            if (readUnsignedByte > 32) {
                if (readUnsignedByte == 47 || readUnsignedByte == 35) {
                    return _skipColon2(readUnsignedByte, true);
                }
                return readUnsignedByte;
            } else if ((readUnsignedByte != 32 && readUnsignedByte != 9) || (readUnsignedByte = this._inputData.readUnsignedByte()) <= 32) {
                return _skipColon2(readUnsignedByte, true);
            } else {
                if (readUnsignedByte == 47 || readUnsignedByte == 35) {
                    return _skipColon2(readUnsignedByte, true);
                }
                return readUnsignedByte;
            }
        } else {
            if (i10 == 32 || i10 == 9) {
                i10 = this._inputData.readUnsignedByte();
            }
            if (i10 != 58) {
                return _skipColon2(i10, false);
            }
            int readUnsignedByte2 = this._inputData.readUnsignedByte();
            if (readUnsignedByte2 > 32) {
                if (readUnsignedByte2 == 47 || readUnsignedByte2 == 35) {
                    return _skipColon2(readUnsignedByte2, true);
                }
                return readUnsignedByte2;
            } else if ((readUnsignedByte2 != 32 && readUnsignedByte2 != 9) || (readUnsignedByte2 = this._inputData.readUnsignedByte()) <= 32) {
                return _skipColon2(readUnsignedByte2, true);
            } else {
                if (readUnsignedByte2 == 47 || readUnsignedByte2 == 35) {
                    return _skipColon2(readUnsignedByte2, true);
                }
                return readUnsignedByte2;
            }
        }
    }

    private final int _skipColon2(int i10, boolean z10) {
        while (true) {
            if (i10 > 32) {
                if (i10 == 47) {
                    _skipComment();
                } else if (i10 != 35 || !_skipYAMLComment()) {
                    if (z10) {
                        return i10;
                    }
                    if (i10 != 58) {
                        _reportUnexpectedChar(i10, "was expecting a colon to separate field name and value");
                    }
                    z10 = true;
                }
            } else if (i10 == 13 || i10 == 10) {
                this._currInputRow++;
            }
            i10 = this._inputData.readUnsignedByte();
        }
    }

    private final void _skipComment() {
        if (!isEnabled(JsonParser.Feature.ALLOW_COMMENTS)) {
            _reportUnexpectedChar(47, "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_COMMENTS' not enabled for parser)");
        }
        int readUnsignedByte = this._inputData.readUnsignedByte();
        if (readUnsignedByte == 47) {
            _skipLine();
        } else if (readUnsignedByte == 42) {
            _skipCComment();
        } else {
            _reportUnexpectedChar(readUnsignedByte, "was expecting either '*' or '/' for a comment");
        }
    }

    private final void _skipLine() {
        int[] inputCodeComment = CharTypes.getInputCodeComment();
        while (true) {
            int readUnsignedByte = this._inputData.readUnsignedByte();
            int i10 = inputCodeComment[readUnsignedByte];
            if (i10 != 0) {
                if (i10 == 2) {
                    _skipUtf8_2();
                } else if (i10 == 3) {
                    _skipUtf8_3();
                } else if (i10 == 4) {
                    _skipUtf8_4();
                } else if (i10 == 10 || i10 == 13) {
                    this._currInputRow++;
                } else if (i10 != 42 && i10 < 0) {
                    _reportInvalidChar(readUnsignedByte);
                }
            }
        }
        this._currInputRow++;
    }

    private final void _skipUtf8_2() {
        int readUnsignedByte = this._inputData.readUnsignedByte();
        if ((readUnsignedByte & 192) != 128) {
            _reportInvalidOther(readUnsignedByte & 255);
        }
    }

    private final void _skipUtf8_3() {
        int readUnsignedByte = this._inputData.readUnsignedByte();
        if ((readUnsignedByte & 192) != 128) {
            _reportInvalidOther(readUnsignedByte & 255);
        }
        int readUnsignedByte2 = this._inputData.readUnsignedByte();
        if ((readUnsignedByte2 & 192) != 128) {
            _reportInvalidOther(readUnsignedByte2 & 255);
        }
    }

    private final void _skipUtf8_4() {
        int readUnsignedByte = this._inputData.readUnsignedByte();
        if ((readUnsignedByte & 192) != 128) {
            _reportInvalidOther(readUnsignedByte & 255);
        }
        int readUnsignedByte2 = this._inputData.readUnsignedByte();
        if ((readUnsignedByte2 & 192) != 128) {
            _reportInvalidOther(readUnsignedByte2 & 255);
        }
        int readUnsignedByte3 = this._inputData.readUnsignedByte();
        if ((readUnsignedByte3 & 192) != 128) {
            _reportInvalidOther(readUnsignedByte3 & 255);
        }
    }

    private final int _skipWS() {
        int i10 = this._nextByte;
        if (i10 < 0) {
            i10 = this._inputData.readUnsignedByte();
        } else {
            this._nextByte = -1;
        }
        while (i10 <= 32) {
            if (i10 == 13 || i10 == 10) {
                this._currInputRow++;
            }
            i10 = this._inputData.readUnsignedByte();
        }
        if (i10 == 47 || i10 == 35) {
            return _skipWSComment(i10);
        }
        return i10;
    }

    private final int _skipWSComment(int i10) {
        while (true) {
            if (i10 > 32) {
                if (i10 == 47) {
                    _skipComment();
                } else if (i10 != 35 || !_skipYAMLComment()) {
                    return i10;
                }
            } else if (i10 == 13 || i10 == 10) {
                this._currInputRow++;
            }
            i10 = this._inputData.readUnsignedByte();
        }
        return i10;
    }

    private final boolean _skipYAMLComment() {
        if (!isEnabled(JsonParser.Feature.ALLOW_YAML_COMMENTS)) {
            return false;
        }
        _skipLine();
        return true;
    }

    private final void _verifyRootSpace() {
        int i10 = this._nextByte;
        if (i10 <= 32) {
            this._nextByte = -1;
            if (i10 == 13 || i10 == 10) {
                this._currInputRow++;
                return;
            }
            return;
        }
        _reportMissingRootWS(i10);
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
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.addName(int[], int, int):java.lang.String");
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

    private static final int pad(int i10, int i11) {
        return i11 == 4 ? i10 : i10 | (-1 << (i11 << 3));
    }

    private final String parseName(int i10, int i11, int i12) {
        return parseEscapedName(this._quadBuffer, 0, i10, i11, i12);
    }

    /* access modifiers changed from: protected */
    public void _closeInput() {
    }

    /* access modifiers changed from: protected */
    public final byte[] _decodeBase64(Base64Variant base64Variant) {
        ByteArrayBuilder _getByteArrayBuilder = _getByteArrayBuilder();
        while (true) {
            int readUnsignedByte = this._inputData.readUnsignedByte();
            if (readUnsignedByte > 32) {
                int decodeBase64Char = base64Variant.decodeBase64Char(readUnsignedByte);
                if (decodeBase64Char < 0) {
                    if (readUnsignedByte == 34) {
                        return _getByteArrayBuilder.toByteArray();
                    }
                    decodeBase64Char = _decodeBase64Escape(base64Variant, readUnsignedByte, 0);
                    if (decodeBase64Char < 0) {
                        continue;
                    }
                }
                int readUnsignedByte2 = this._inputData.readUnsignedByte();
                int decodeBase64Char2 = base64Variant.decodeBase64Char(readUnsignedByte2);
                if (decodeBase64Char2 < 0) {
                    decodeBase64Char2 = _decodeBase64Escape(base64Variant, readUnsignedByte2, 1);
                }
                int i10 = (decodeBase64Char << 6) | decodeBase64Char2;
                int readUnsignedByte3 = this._inputData.readUnsignedByte();
                int decodeBase64Char3 = base64Variant.decodeBase64Char(readUnsignedByte3);
                if (decodeBase64Char3 < 0) {
                    if (decodeBase64Char3 != -2) {
                        if (readUnsignedByte3 != 34 || base64Variant.usesPadding()) {
                            decodeBase64Char3 = _decodeBase64Escape(base64Variant, readUnsignedByte3, 2);
                        } else {
                            _getByteArrayBuilder.append(i10 >> 4);
                            return _getByteArrayBuilder.toByteArray();
                        }
                    }
                    if (decodeBase64Char3 == -2) {
                        int readUnsignedByte4 = this._inputData.readUnsignedByte();
                        if (base64Variant.usesPaddingChar(readUnsignedByte4)) {
                            _getByteArrayBuilder.append(i10 >> 4);
                        } else {
                            throw reportInvalidBase64Char(base64Variant, readUnsignedByte4, 3, "expected padding character '" + base64Variant.getPaddingChar() + "'");
                        }
                    }
                }
                int i11 = (i10 << 6) | decodeBase64Char3;
                int readUnsignedByte5 = this._inputData.readUnsignedByte();
                int decodeBase64Char4 = base64Variant.decodeBase64Char(readUnsignedByte5);
                if (decodeBase64Char4 < 0) {
                    if (decodeBase64Char4 != -2) {
                        if (readUnsignedByte5 != 34 || base64Variant.usesPadding()) {
                            decodeBase64Char4 = _decodeBase64Escape(base64Variant, readUnsignedByte5, 3);
                        } else {
                            _getByteArrayBuilder.appendTwoBytes(i11 >> 2);
                            return _getByteArrayBuilder.toByteArray();
                        }
                    }
                    if (decodeBase64Char4 == -2) {
                        _getByteArrayBuilder.appendTwoBytes(i11 >> 2);
                    }
                }
                _getByteArrayBuilder.appendThreeBytes((i11 << 6) | decodeBase64Char4);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int _decodeCharForError(int r7) {
        /*
            r6 = this;
            r0 = r7 & 255(0xff, float:3.57E-43)
            r1 = 127(0x7f, float:1.78E-43)
            if (r0 <= r1) goto L_0x006e
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
            java.io.DataInput r1 = r6._inputData
            int r1 = r1.readUnsignedByte()
            r4 = r1 & 192(0xc0, float:2.69E-43)
            r5 = 128(0x80, float:1.794E-43)
            if (r4 == r5) goto L_0x003d
            r4 = r1 & 255(0xff, float:3.57E-43)
            r6._reportInvalidOther(r4)
        L_0x003d:
            int r0 = r0 << 6
            r1 = r1 & 63
            r0 = r0 | r1
            if (r7 <= r3) goto L_0x006e
            java.io.DataInput r1 = r6._inputData
            int r1 = r1.readUnsignedByte()
            r3 = r1 & 192(0xc0, float:2.69E-43)
            if (r3 == r5) goto L_0x0053
            r3 = r1 & 255(0xff, float:3.57E-43)
            r6._reportInvalidOther(r3)
        L_0x0053:
            int r0 = r0 << 6
            r1 = r1 & 63
            r0 = r0 | r1
            if (r7 <= r2) goto L_0x006e
            java.io.DataInput r7 = r6._inputData
            int r7 = r7.readUnsignedByte()
            r1 = r7 & 192(0xc0, float:2.69E-43)
            if (r1 == r5) goto L_0x0069
            r1 = r7 & 255(0xff, float:3.57E-43)
            r6._reportInvalidOther(r1)
        L_0x0069:
            int r0 = r0 << 6
            r7 = r7 & 63
            r0 = r0 | r7
        L_0x006e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._decodeCharForError(int):int");
    }

    /* access modifiers changed from: protected */
    public char _decodeEscaped() {
        int readUnsignedByte = this._inputData.readUnsignedByte();
        if (readUnsignedByte == 34 || readUnsignedByte == 47 || readUnsignedByte == 92) {
            return (char) readUnsignedByte;
        }
        if (readUnsignedByte == 98) {
            return 8;
        }
        if (readUnsignedByte == 102) {
            return 12;
        }
        if (readUnsignedByte == 110) {
            return 10;
        }
        if (readUnsignedByte == 114) {
            return 13;
        }
        if (readUnsignedByte == 116) {
            return 9;
        }
        if (readUnsignedByte != 117) {
            return _handleUnrecognizedCharacterEscape((char) _decodeCharForError(readUnsignedByte));
        }
        int i10 = 0;
        for (int i11 = 0; i11 < 4; i11++) {
            int readUnsignedByte2 = this._inputData.readUnsignedByte();
            int charToHex = CharTypes.charToHex(readUnsignedByte2);
            if (charToHex < 0) {
                _reportUnexpectedChar(readUnsignedByte2, "expected a hex-digit for character escape sequence");
            }
            i10 = (i10 << 4) | charToHex;
        }
        return (char) i10;
    }

    /* access modifiers changed from: protected */
    public void _finishString() {
        char[] emptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        int[] iArr = _icUTF8;
        int length = emptyAndGetCurrentSegment.length;
        int i10 = 0;
        while (true) {
            int readUnsignedByte = this._inputData.readUnsignedByte();
            if (iArr[readUnsignedByte] == 0) {
                int i11 = i10 + 1;
                emptyAndGetCurrentSegment[i10] = (char) readUnsignedByte;
                if (i11 >= length) {
                    _finishString2(emptyAndGetCurrentSegment, i11, this._inputData.readUnsignedByte());
                    return;
                }
                i10 = i11;
            } else if (readUnsignedByte == 34) {
                this._textBuffer.setCurrentLength(i10);
                return;
            } else {
                _finishString2(emptyAndGetCurrentSegment, i10, readUnsignedByte);
                return;
            }
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
        int i10;
        char[] emptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        int[] iArr = _icUTF8;
        int i11 = 0;
        while (true) {
            int length = emptyAndGetCurrentSegment.length;
            if (i11 >= emptyAndGetCurrentSegment.length) {
                emptyAndGetCurrentSegment = this._textBuffer.finishCurrentSegment();
                length = emptyAndGetCurrentSegment.length;
                i11 = 0;
            }
            while (true) {
                int readUnsignedByte = this._inputData.readUnsignedByte();
                if (readUnsignedByte != 39) {
                    int i12 = iArr[readUnsignedByte];
                    if (i12 == 0) {
                        int i13 = i10 + 1;
                        emptyAndGetCurrentSegment[i10] = (char) readUnsignedByte;
                        i11 = i13;
                        if (i13 >= length) {
                            break;
                        }
                    } else {
                        if (i12 == 1) {
                            readUnsignedByte = _decodeEscaped();
                        } else if (i12 == 2) {
                            readUnsignedByte = _decodeUtf8_2(readUnsignedByte);
                        } else if (i12 == 3) {
                            readUnsignedByte = _decodeUtf8_3(readUnsignedByte);
                        } else if (i12 != 4) {
                            if (readUnsignedByte < 32) {
                                _throwUnquotedSpace(readUnsignedByte, "string value");
                            }
                            _reportInvalidChar(readUnsignedByte);
                        } else {
                            int _decodeUtf8_4 = _decodeUtf8_4(readUnsignedByte);
                            int i14 = i10 + 1;
                            emptyAndGetCurrentSegment[i10] = (char) ((_decodeUtf8_4 >> 10) | GeneratorBase.SURR1_FIRST);
                            if (i14 >= emptyAndGetCurrentSegment.length) {
                                emptyAndGetCurrentSegment = this._textBuffer.finishCurrentSegment();
                                i10 = 0;
                            } else {
                                i10 = i14;
                            }
                            readUnsignedByte = 56320 | (_decodeUtf8_4 & 1023);
                        }
                        if (i10 >= emptyAndGetCurrentSegment.length) {
                            emptyAndGetCurrentSegment = this._textBuffer.finishCurrentSegment();
                            i10 = 0;
                        }
                        emptyAndGetCurrentSegment[i10] = (char) readUnsignedByte;
                        i11 = i10 + 1;
                    }
                } else {
                    this._textBuffer.setCurrentLength(i10);
                    return JsonToken.VALUE_STRING;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public JsonToken _handleInvalidNumberStart(int i10, boolean z10) {
        String str;
        double d10;
        while (i10 == 73) {
            i10 = this._inputData.readUnsignedByte();
            if (i10 != 78) {
                if (i10 != 110) {
                    break;
                } else if (z10) {
                    str = "-Infinity";
                } else {
                    str = "+Infinity";
                }
            } else if (z10) {
                str = "-INF";
            } else {
                str = "+INF";
            }
            _matchToken(str, 3);
            if (isEnabled(JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS)) {
                if (z10) {
                    d10 = Double.NEGATIVE_INFINITY;
                } else {
                    d10 = Double.POSITIVE_INFINITY;
                }
                return resetAsNaN(str, d10);
            }
            _reportError("Non-standard token '" + str + "': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow");
        }
        reportUnexpectedNumberChar(i10, "expected digit (0-9) to follow minus sign, for valid numeric value");
        return null;
    }

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
        do {
            if (i11 < 4) {
                i11++;
                i13 = i10 | (i13 << 8);
            } else {
                if (i12 >= iArr.length) {
                    iArr = _growArrayBy(iArr, iArr.length);
                    this._quadBuffer = iArr;
                }
                iArr[i12] = i13;
                i13 = i10;
                i12++;
                i11 = 1;
            }
            i10 = this._inputData.readUnsignedByte();
        } while (inputCodeUtf8JsNames[i10] == 0);
        this._nextByte = i10;
        if (i11 > 0) {
            if (i12 >= iArr.length) {
                iArr = _growArrayBy(iArr, iArr.length);
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
        if (r4 != 44) goto L_0x0087;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0030, code lost:
        if (r3._parsingContext.inArray() == false) goto L_0x0087;
     */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x008d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.fasterxml.jackson.core.JsonToken _handleUnexpectedValue(int r4) {
        /*
            r3 = this;
            r0 = 39
            if (r4 == r0) goto L_0x007a
            r0 = 73
            r1 = 1
            if (r4 == r0) goto L_0x0060
            r0 = 78
            if (r4 == r0) goto L_0x0046
            r0 = 93
            if (r4 == r0) goto L_0x002a
            r0 = 125(0x7d, float:1.75E-43)
            if (r4 == r0) goto L_0x0040
            r0 = 43
            if (r4 == r0) goto L_0x001e
            r0 = 44
            if (r4 == r0) goto L_0x0033
            goto L_0x0087
        L_0x001e:
            java.io.DataInput r4 = r3._inputData
            int r4 = r4.readUnsignedByte()
            r0 = 0
            com.fasterxml.jackson.core.JsonToken r4 = r3._handleInvalidNumberStart(r4, r0)
            return r4
        L_0x002a:
            com.fasterxml.jackson.core.json.JsonReadContext r0 = r3._parsingContext
            boolean r0 = r0.inArray()
            if (r0 != 0) goto L_0x0033
            goto L_0x0087
        L_0x0033:
            com.fasterxml.jackson.core.JsonParser$Feature r0 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_MISSING_VALUES
            boolean r0 = r3.isEnabled(r0)
            if (r0 == 0) goto L_0x0040
            r3._nextByte = r4
            com.fasterxml.jackson.core.JsonToken r4 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL
            return r4
        L_0x0040:
            java.lang.String r0 = "expected a value"
            r3._reportUnexpectedChar(r4, r0)
            goto L_0x007a
        L_0x0046:
            java.lang.String r0 = "NaN"
            r3._matchToken(r0, r1)
            com.fasterxml.jackson.core.JsonParser$Feature r1 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS
            boolean r1 = r3.isEnabled(r1)
            if (r1 == 0) goto L_0x005a
            r1 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            com.fasterxml.jackson.core.JsonToken r4 = r3.resetAsNaN(r0, r1)
            return r4
        L_0x005a:
            java.lang.String r0 = "Non-standard token 'NaN': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow"
            r3._reportError(r0)
            goto L_0x0087
        L_0x0060:
            java.lang.String r0 = "Infinity"
            r3._matchToken(r0, r1)
            com.fasterxml.jackson.core.JsonParser$Feature r1 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS
            boolean r1 = r3.isEnabled(r1)
            if (r1 == 0) goto L_0x0074
            r1 = 9218868437227405312(0x7ff0000000000000, double:Infinity)
            com.fasterxml.jackson.core.JsonToken r4 = r3.resetAsNaN(r0, r1)
            return r4
        L_0x0074:
            java.lang.String r0 = "Non-standard token 'Infinity': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow"
            r3._reportError(r0)
            goto L_0x0087
        L_0x007a:
            com.fasterxml.jackson.core.JsonParser$Feature r0 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_SINGLE_QUOTES
            boolean r0 = r3.isEnabled(r0)
            if (r0 == 0) goto L_0x0087
            com.fasterxml.jackson.core.JsonToken r4 = r3._handleApos()
            return r4
        L_0x0087:
            boolean r0 = java.lang.Character.isJavaIdentifierStart(r4)
            if (r0 == 0) goto L_0x00a4
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = ""
            r0.append(r1)
            char r1 = (char) r4
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "('true', 'false' or 'null')"
            r3._reportInvalidToken(r4, r0, r1)
        L_0x00a4:
            java.lang.String r0 = "expected a valid value (number, String, array, object, 'true', 'false' or 'null')"
            r3._reportUnexpectedChar(r4, r0)
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._handleUnexpectedValue(int):com.fasterxml.jackson.core.JsonToken");
    }

    /* access modifiers changed from: protected */
    public final void _matchToken(String str, int i10) {
        int length = str.length();
        do {
            int readUnsignedByte = this._inputData.readUnsignedByte();
            if (readUnsignedByte != str.charAt(i10)) {
                _reportInvalidToken(readUnsignedByte, str.substring(0, i10));
            }
            i10++;
        } while (i10 < length);
        int readUnsignedByte2 = this._inputData.readUnsignedByte();
        if (!(readUnsignedByte2 < 48 || readUnsignedByte2 == 93 || readUnsignedByte2 == 125)) {
            _checkMatchEnd(str, i10, readUnsignedByte2);
        }
        this._nextByte = readUnsignedByte2;
    }

    /* access modifiers changed from: protected */
    public String _parseAposName() {
        int i10;
        int i11;
        int readUnsignedByte = this._inputData.readUnsignedByte();
        if (readUnsignedByte == 39) {
            return "";
        }
        int[] iArr = this._quadBuffer;
        int[] iArr2 = _icLatin1;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (readUnsignedByte != 39) {
            if (!(readUnsignedByte == 34 || iArr2[readUnsignedByte] == 0)) {
                if (readUnsignedByte != 92) {
                    _throwUnquotedSpace(readUnsignedByte, "name");
                } else {
                    readUnsignedByte = _decodeEscaped();
                }
                if (readUnsignedByte > 127) {
                    if (i11 >= 4) {
                        if (i13 >= iArr.length) {
                            iArr = _growArrayBy(iArr, iArr.length);
                            this._quadBuffer = iArr;
                        }
                        iArr[i13] = i10;
                        i10 = 0;
                        i13++;
                        i11 = 0;
                    }
                    if (readUnsignedByte < 2048) {
                        i10 = (i10 << 8) | (readUnsignedByte >> 6) | 192;
                        i11++;
                    } else {
                        int i15 = (i10 << 8) | (readUnsignedByte >> 12) | 224;
                        int i16 = i11 + 1;
                        if (i16 >= 4) {
                            if (i13 >= iArr.length) {
                                iArr = _growArrayBy(iArr, iArr.length);
                                this._quadBuffer = iArr;
                            }
                            iArr[i13] = i15;
                            i15 = 0;
                            i13++;
                            i16 = 0;
                        }
                        i10 = (i15 << 8) | ((readUnsignedByte >> 6) & 63) | 128;
                        i11 = i16 + 1;
                    }
                    readUnsignedByte = (readUnsignedByte & 63) | 128;
                }
            }
            if (i11 < 4) {
                i12 = i11 + 1;
                i14 = readUnsignedByte | (i10 << 8);
            } else {
                if (i13 >= iArr.length) {
                    iArr = _growArrayBy(iArr, iArr.length);
                    this._quadBuffer = iArr;
                }
                iArr[i13] = i10;
                i14 = readUnsignedByte;
                i13++;
                i12 = 1;
            }
            readUnsignedByte = this._inputData.readUnsignedByte();
        }
        if (i11 > 0) {
            if (i13 >= iArr.length) {
                iArr = _growArrayBy(iArr, iArr.length);
                this._quadBuffer = iArr;
            }
            iArr[i13] = pad(i10, i11);
            i13++;
        }
        String findName = this._symbols.findName(iArr, i13);
        if (findName == null) {
            return addName(iArr, i13, i11);
        }
        return findName;
    }

    /* access modifiers changed from: protected */
    public final String _parseName(int i10) {
        if (i10 != 34) {
            return _handleOddName(i10);
        }
        int[] iArr = _icLatin1;
        int readUnsignedByte = this._inputData.readUnsignedByte();
        if (iArr[readUnsignedByte] == 0) {
            int readUnsignedByte2 = this._inputData.readUnsignedByte();
            if (iArr[readUnsignedByte2] == 0) {
                int i11 = (readUnsignedByte << 8) | readUnsignedByte2;
                int readUnsignedByte3 = this._inputData.readUnsignedByte();
                if (iArr[readUnsignedByte3] == 0) {
                    int i12 = (i11 << 8) | readUnsignedByte3;
                    int readUnsignedByte4 = this._inputData.readUnsignedByte();
                    if (iArr[readUnsignedByte4] == 0) {
                        int i13 = (i12 << 8) | readUnsignedByte4;
                        int readUnsignedByte5 = this._inputData.readUnsignedByte();
                        if (iArr[readUnsignedByte5] == 0) {
                            this._quad1 = i13;
                            return _parseMediumName(readUnsignedByte5);
                        } else if (readUnsignedByte5 == 34) {
                            return findName(i13, 4);
                        } else {
                            return parseName(i13, readUnsignedByte5, 4);
                        }
                    } else if (readUnsignedByte4 == 34) {
                        return findName(i12, 3);
                    } else {
                        return parseName(i12, readUnsignedByte4, 3);
                    }
                } else if (readUnsignedByte3 == 34) {
                    return findName(i11, 2);
                } else {
                    return parseName(i11, readUnsignedByte3, 2);
                }
            } else if (readUnsignedByte2 == 34) {
                return findName(readUnsignedByte, 1);
            } else {
                return parseName(readUnsignedByte, readUnsignedByte2, 1);
            }
        } else if (readUnsignedByte == 34) {
            return "";
        } else {
            return parseName(0, readUnsignedByte, 0);
        }
    }

    /* access modifiers changed from: protected */
    public JsonToken _parseNegNumber() {
        int i10;
        char[] emptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        emptyAndGetCurrentSegment[0] = '-';
        int readUnsignedByte = this._inputData.readUnsignedByte();
        emptyAndGetCurrentSegment[1] = (char) readUnsignedByte;
        if (readUnsignedByte <= 48) {
            if (readUnsignedByte != 48) {
                return _handleInvalidNumberStart(readUnsignedByte, true);
            }
            i10 = _handleLeadingZeroes();
        } else if (readUnsignedByte > 57) {
            return _handleInvalidNumberStart(readUnsignedByte, true);
        } else {
            i10 = this._inputData.readUnsignedByte();
        }
        int i11 = 2;
        int i12 = 1;
        while (i10 <= 57 && i10 >= 48) {
            i12++;
            emptyAndGetCurrentSegment[i11] = (char) i10;
            i10 = this._inputData.readUnsignedByte();
            i11++;
        }
        if (i10 == 46 || i10 == 101 || i10 == 69) {
            return _parseFloat(emptyAndGetCurrentSegment, i11, i10, true, i12);
        }
        this._textBuffer.setCurrentLength(i11);
        this._nextByte = i10;
        if (this._parsingContext.inRoot()) {
            _verifyRootSpace();
        }
        return resetInt(true, i12);
    }

    /* access modifiers changed from: protected */
    public JsonToken _parsePosNumber(int i10) {
        int i11;
        char[] emptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        int i12 = 1;
        if (i10 == 48) {
            i11 = _handleLeadingZeroes();
            if (i11 > 57 || i11 < 48) {
                emptyAndGetCurrentSegment[0] = '0';
            } else {
                i12 = 0;
            }
        } else {
            emptyAndGetCurrentSegment[0] = (char) i10;
            i11 = this._inputData.readUnsignedByte();
        }
        int i13 = i11;
        int i14 = i12;
        int i15 = i14;
        while (i13 <= 57 && i13 >= 48) {
            i15++;
            emptyAndGetCurrentSegment[i14] = (char) i13;
            i13 = this._inputData.readUnsignedByte();
            i14++;
        }
        if (i13 == 46 || i13 == 101 || i13 == 69) {
            return _parseFloat(emptyAndGetCurrentSegment, i14, i13, false, i15);
        }
        this._textBuffer.setCurrentLength(i14);
        if (this._parsingContext.inRoot()) {
            _verifyRootSpace();
        } else {
            this._nextByte = i13;
        }
        return resetInt(false, i15);
    }

    /* access modifiers changed from: protected */
    public int _readBinary(Base64Variant base64Variant, OutputStream outputStream, byte[] bArr) {
        int length = bArr.length - 3;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int readUnsignedByte = this._inputData.readUnsignedByte();
            if (readUnsignedByte > 32) {
                int decodeBase64Char = base64Variant.decodeBase64Char(readUnsignedByte);
                if (decodeBase64Char < 0) {
                    if (readUnsignedByte == 34) {
                        break;
                    }
                    decodeBase64Char = _decodeBase64Escape(base64Variant, readUnsignedByte, 0);
                    if (decodeBase64Char < 0) {
                        continue;
                    }
                }
                if (i10 > length) {
                    i11 += i10;
                    outputStream.write(bArr, 0, i10);
                    i10 = 0;
                }
                int readUnsignedByte2 = this._inputData.readUnsignedByte();
                int decodeBase64Char2 = base64Variant.decodeBase64Char(readUnsignedByte2);
                if (decodeBase64Char2 < 0) {
                    decodeBase64Char2 = _decodeBase64Escape(base64Variant, readUnsignedByte2, 1);
                }
                int i12 = (decodeBase64Char << 6) | decodeBase64Char2;
                int readUnsignedByte3 = this._inputData.readUnsignedByte();
                int decodeBase64Char3 = base64Variant.decodeBase64Char(readUnsignedByte3);
                if (decodeBase64Char3 < 0) {
                    if (decodeBase64Char3 != -2) {
                        if (readUnsignedByte3 == 34 && !base64Variant.usesPadding()) {
                            bArr[i10] = (byte) (i12 >> 4);
                            i10++;
                            break;
                        }
                        decodeBase64Char3 = _decodeBase64Escape(base64Variant, readUnsignedByte3, 2);
                    }
                    if (decodeBase64Char3 == -2) {
                        int readUnsignedByte4 = this._inputData.readUnsignedByte();
                        if (base64Variant.usesPaddingChar(readUnsignedByte4)) {
                            bArr[i10] = (byte) (i12 >> 4);
                            i10++;
                        } else {
                            throw reportInvalidBase64Char(base64Variant, readUnsignedByte4, 3, "expected padding character '" + base64Variant.getPaddingChar() + "'");
                        }
                    }
                }
                int i13 = (i12 << 6) | decodeBase64Char3;
                int readUnsignedByte5 = this._inputData.readUnsignedByte();
                int decodeBase64Char4 = base64Variant.decodeBase64Char(readUnsignedByte5);
                if (decodeBase64Char4 < 0) {
                    if (decodeBase64Char4 != -2) {
                        if (readUnsignedByte5 == 34 && !base64Variant.usesPadding()) {
                            int i14 = i10 + 1;
                            bArr[i10] = (byte) (i13 >> 10);
                            i10 += 2;
                            bArr[i14] = (byte) (i13 >> 2);
                            break;
                        }
                        decodeBase64Char4 = _decodeBase64Escape(base64Variant, readUnsignedByte5, 3);
                    }
                    if (decodeBase64Char4 == -2) {
                        int i15 = i10 + 1;
                        bArr[i10] = (byte) (i13 >> 10);
                        i10 += 2;
                        bArr[i15] = (byte) (i13 >> 2);
                    }
                }
                int i16 = (i13 << 6) | decodeBase64Char4;
                bArr[i10] = (byte) (i16 >> 16);
                int i17 = i10 + 2;
                bArr[i10 + 1] = (byte) (i16 >> 8);
                i10 += 3;
                bArr[i17] = (byte) i16;
            }
        }
        this._tokenIncomplete = false;
        if (i10 <= 0) {
            return i11;
        }
        int i18 = i11 + i10;
        outputStream.write(bArr, 0, i10);
        return i18;
    }

    /* access modifiers changed from: protected */
    public void _releaseBuffers() {
        super._releaseBuffers();
        this._symbols.release();
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
    public void _reportInvalidToken(int i10, String str) {
        _reportInvalidToken(i10, str, "'null', 'true', 'false' or NaN");
    }

    /* access modifiers changed from: protected */
    public void _skipString() {
        this._tokenIncomplete = false;
        int[] iArr = _icUTF8;
        while (true) {
            int readUnsignedByte = this._inputData.readUnsignedByte();
            int i10 = iArr[readUnsignedByte];
            if (i10 != 0) {
                if (readUnsignedByte != 34) {
                    if (i10 == 1) {
                        _decodeEscaped();
                    } else if (i10 == 2) {
                        _skipUtf8_2();
                    } else if (i10 == 3) {
                        _skipUtf8_3();
                    } else if (i10 == 4) {
                        _skipUtf8_4();
                    } else if (readUnsignedByte < 32) {
                        _throwUnquotedSpace(readUnsignedByte, "string value");
                    } else {
                        _reportInvalidChar(readUnsignedByte);
                    }
                } else {
                    return;
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
        return new JsonLocation(this._ioContext.getSourceReference(), -1, -1, this._currInputRow, -1);
    }

    public Object getInputSource() {
        return this._inputData;
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
        if (jsonToken == JsonToken.VALUE_STRING) {
            if (this._tokenIncomplete) {
                this._tokenIncomplete = false;
                _finishString();
            }
            return this._textBuffer.size();
        } else if (jsonToken == JsonToken.FIELD_NAME) {
            return this._parsingContext.getCurrentName().length();
        } else {
            if (jsonToken == null) {
                return 0;
            }
            if (jsonToken.isNumeric()) {
                return this._textBuffer.size();
            }
            return this._currToken.asCharArray().length;
        }
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
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getTextOffset():int");
    }

    public JsonLocation getTokenLocation() {
        return new JsonLocation(this._ioContext.getSourceReference(), -1, -1, this._tokenInputRow, -1);
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
        int _skipWS = _skipWS();
        this._binaryValue = null;
        this._tokenInputRow = this._currInputRow;
        if (_skipWS == 93) {
            if (!this._parsingContext.inArray()) {
                _reportMismatchedEndMarker(_skipWS, '}');
            }
            this._parsingContext = this._parsingContext.clearAndGetParent();
            this._currToken = JsonToken.END_ARRAY;
            return null;
        } else if (_skipWS == 125) {
            if (!this._parsingContext.inObject()) {
                _reportMismatchedEndMarker(_skipWS, ']');
            }
            this._parsingContext = this._parsingContext.clearAndGetParent();
            this._currToken = JsonToken.END_OBJECT;
            return null;
        } else {
            if (this._parsingContext.expectComma()) {
                if (_skipWS != 44) {
                    _reportUnexpectedChar(_skipWS, "was expecting comma to separate " + this._parsingContext.typeDesc() + " entries");
                }
                _skipWS = _skipWS();
            }
            if (!this._parsingContext.inObject()) {
                _nextTokenNotInObject(_skipWS);
                return null;
            }
            String _parseName = _parseName(_skipWS);
            this._parsingContext.setCurrentName(_parseName);
            this._currToken = jsonToken3;
            int _skipColon = _skipColon();
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
        int _skipWS = _skipWS();
        this._binaryValue = null;
        this._tokenInputRow = this._currInputRow;
        if (_skipWS == 93) {
            if (!this._parsingContext.inArray()) {
                _reportMismatchedEndMarker(_skipWS, '}');
            }
            this._parsingContext = this._parsingContext.clearAndGetParent();
            JsonToken jsonToken4 = JsonToken.END_ARRAY;
            this._currToken = jsonToken4;
            return jsonToken4;
        } else if (_skipWS == 125) {
            if (!this._parsingContext.inObject()) {
                _reportMismatchedEndMarker(_skipWS, ']');
            }
            this._parsingContext = this._parsingContext.clearAndGetParent();
            JsonToken jsonToken5 = JsonToken.END_OBJECT;
            this._currToken = jsonToken5;
            return jsonToken5;
        } else {
            if (this._parsingContext.expectComma()) {
                if (_skipWS != 44) {
                    _reportUnexpectedChar(_skipWS, "was expecting comma to separate " + this._parsingContext.typeDesc() + " entries");
                }
                _skipWS = _skipWS();
            }
            if (!this._parsingContext.inObject()) {
                return _nextTokenNotInObject(_skipWS);
            }
            this._parsingContext.setCurrentName(_parseName(_skipWS));
            this._currToken = jsonToken3;
            int _skipColon = _skipColon();
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
                            iArr = _growArrayBy(iArr, iArr.length);
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
                                iArr = _growArrayBy(iArr, iArr.length);
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
                    iArr = _growArrayBy(iArr, iArr.length);
                    this._quadBuffer = iArr;
                }
                iArr[i10] = r8;
                i11 = i12;
                i10++;
                i13 = 1;
            }
            i12 = this._inputData.readUnsignedByte();
        }
        if (r10 > 0) {
            if (i10 >= iArr.length) {
                iArr = _growArrayBy(iArr, iArr.length);
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
        return 0;
    }

    public void setCodec(ObjectCodec objectCodec) {
        this._objectCodec = objectCodec;
    }

    private final String parseName(int i10, int i11, int i12, int i13) {
        int[] iArr = this._quadBuffer;
        iArr[0] = i10;
        return parseEscapedName(iArr, 1, i11, i12, i13);
    }

    /* access modifiers changed from: protected */
    public void _reportInvalidToken(int i10, String str, String str2) {
        StringBuilder sb2 = new StringBuilder(str);
        while (true) {
            char _decodeCharForError = (char) _decodeCharForError(i10);
            if (!Character.isJavaIdentifierPart(_decodeCharForError)) {
                _reportError("Unrecognized token '" + sb2.toString() + "': was expecting " + str2);
                return;
            }
            sb2.append(_decodeCharForError);
            i10 = this._inputData.readUnsignedByte();
        }
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
            iArr = _growArrayBy(iArr, iArr.length);
            this._quadBuffer = iArr;
        }
        int i13 = i10 + 1;
        iArr[i10] = pad(i11, i12);
        String findName = this._symbols.findName(iArr, i13);
        return findName == null ? addName(iArr, i13, i12) : findName;
    }
}
