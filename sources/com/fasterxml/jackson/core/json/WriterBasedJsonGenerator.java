package com.fasterxml.jackson.core.json;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonStreamContext;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.PrettyPrinter;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.core.io.CharTypes;
import com.fasterxml.jackson.core.io.CharacterEscapes;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.io.NumberOutput;
import java.io.InputStream;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;

public final class WriterBasedJsonGenerator extends JsonGeneratorImpl {
    protected static final char[] HEX_CHARS = CharTypes.copyHexChars();
    protected static final int SHORT_WRITE = 32;
    protected SerializableString _currentEscape;
    protected char[] _entityBuffer;
    protected char[] _outputBuffer;
    protected int _outputEnd;
    protected int _outputHead;
    protected int _outputTail;
    protected char _quoteChar = '\"';
    protected final Writer _writer;

    public WriterBasedJsonGenerator(IOContext iOContext, int i10, ObjectCodec objectCodec, Writer writer) {
        super(iOContext, i10, objectCodec);
        this._writer = writer;
        char[] allocConcatBuffer = iOContext.allocConcatBuffer();
        this._outputBuffer = allocConcatBuffer;
        this._outputEnd = allocConcatBuffer.length;
    }

    private char[] _allocateEntityBuffer() {
        char[] cArr = new char[14];
        cArr[0] = '\\';
        cArr[2] = '\\';
        cArr[3] = 'u';
        cArr[4] = '0';
        cArr[5] = '0';
        cArr[8] = '\\';
        cArr[9] = 'u';
        this._entityBuffer = cArr;
        return cArr;
    }

    private void _appendCharacterEscape(char c10, int i10) {
        String str;
        int i11;
        if (i10 >= 0) {
            if (this._outputTail + 2 > this._outputEnd) {
                _flushBuffer();
            }
            char[] cArr = this._outputBuffer;
            int i12 = this._outputTail;
            int i13 = i12 + 1;
            this._outputTail = i13;
            cArr[i12] = '\\';
            this._outputTail = i12 + 2;
            cArr[i13] = (char) i10;
        } else if (i10 != -2) {
            if (this._outputTail + 5 >= this._outputEnd) {
                _flushBuffer();
            }
            int i14 = this._outputTail;
            char[] cArr2 = this._outputBuffer;
            cArr2[i14] = '\\';
            int i15 = i14 + 2;
            cArr2[i14 + 1] = 'u';
            if (c10 > 255) {
                int i16 = c10 >> 8;
                int i17 = i14 + 3;
                char[] cArr3 = HEX_CHARS;
                cArr2[i15] = cArr3[(i16 & 255) >> 4];
                i11 = i14 + 4;
                cArr2[i17] = cArr3[i16 & 15];
                c10 = (char) (c10 & 255);
            } else {
                int i18 = i14 + 3;
                cArr2[i15] = '0';
                i11 = i14 + 4;
                cArr2[i18] = '0';
            }
            char[] cArr4 = HEX_CHARS;
            cArr2[i11] = cArr4[c10 >> 4];
            cArr2[i11 + 1] = cArr4[c10 & 15];
            this._outputTail = i11 + 2;
        } else {
            SerializableString serializableString = this._currentEscape;
            if (serializableString == null) {
                str = this._characterEscapes.getEscapeSequence(c10).getValue();
            } else {
                str = serializableString.getValue();
                this._currentEscape = null;
            }
            int length = str.length();
            if (this._outputTail + length > this._outputEnd) {
                _flushBuffer();
                if (length > this._outputEnd) {
                    this._writer.write(str);
                    return;
                }
            }
            str.getChars(0, length, this._outputBuffer, this._outputTail);
            this._outputTail += length;
        }
    }

    private void _prependOrWriteCharacterEscape(char c10, int i10) {
        String str;
        int i11;
        if (i10 >= 0) {
            int i12 = this._outputTail;
            if (i12 >= 2) {
                int i13 = i12 - 2;
                this._outputHead = i13;
                char[] cArr = this._outputBuffer;
                cArr[i13] = '\\';
                cArr[i12 - 1] = (char) i10;
                return;
            }
            char[] cArr2 = this._entityBuffer;
            if (cArr2 == null) {
                cArr2 = _allocateEntityBuffer();
            }
            this._outputHead = this._outputTail;
            cArr2[1] = (char) i10;
            this._writer.write(cArr2, 0, 2);
        } else if (i10 != -2) {
            int i14 = this._outputTail;
            if (i14 >= 6) {
                char[] cArr3 = this._outputBuffer;
                int i15 = i14 - 6;
                this._outputHead = i15;
                cArr3[i15] = '\\';
                cArr3[i14 - 5] = 'u';
                if (c10 > 255) {
                    int i16 = c10 >> 8;
                    char[] cArr4 = HEX_CHARS;
                    cArr3[i14 - 4] = cArr4[(i16 & 255) >> 4];
                    i11 = i14 - 3;
                    cArr3[i11] = cArr4[i16 & 15];
                    c10 = (char) (c10 & 255);
                } else {
                    cArr3[i14 - 4] = '0';
                    i11 = i14 - 3;
                    cArr3[i11] = '0';
                }
                char[] cArr5 = HEX_CHARS;
                cArr3[i11 + 1] = cArr5[c10 >> 4];
                cArr3[i11 + 2] = cArr5[c10 & 15];
                return;
            }
            char[] cArr6 = this._entityBuffer;
            if (cArr6 == null) {
                cArr6 = _allocateEntityBuffer();
            }
            this._outputHead = this._outputTail;
            if (c10 > 255) {
                int i17 = c10 >> 8;
                char[] cArr7 = HEX_CHARS;
                cArr6[10] = cArr7[(i17 & 255) >> 4];
                cArr6[11] = cArr7[i17 & 15];
                cArr6[12] = cArr7[(c10 & 255) >> 4];
                cArr6[13] = cArr7[c10 & 15];
                this._writer.write(cArr6, 8, 6);
                return;
            }
            char[] cArr8 = HEX_CHARS;
            cArr6[6] = cArr8[c10 >> 4];
            cArr6[7] = cArr8[c10 & 15];
            this._writer.write(cArr6, 2, 6);
        } else {
            SerializableString serializableString = this._currentEscape;
            if (serializableString == null) {
                str = this._characterEscapes.getEscapeSequence(c10).getValue();
            } else {
                str = serializableString.getValue();
                this._currentEscape = null;
            }
            int length = str.length();
            int i18 = this._outputTail;
            if (i18 >= length) {
                int i19 = i18 - length;
                this._outputHead = i19;
                str.getChars(0, length, this._outputBuffer, i19);
                return;
            }
            this._outputHead = i18;
            this._writer.write(str);
        }
    }

    private int _readMore(InputStream inputStream, byte[] bArr, int i10, int i11, int i12) {
        int i13 = 0;
        while (i10 < i11) {
            bArr[i13] = bArr[i10];
            i13++;
            i10++;
        }
        int min = Math.min(i12, bArr.length);
        do {
            int i14 = min - i13;
            if (i14 == 0) {
                break;
            }
            int read = inputStream.read(bArr, i13, i14);
            if (read < 0) {
                return i13;
            }
            i13 += read;
        } while (i13 < 3);
        return i13;
    }

    private void _writeLongString(String str) {
        _flushBuffer();
        int length = str.length();
        int i10 = 0;
        while (true) {
            int i11 = this._outputEnd;
            if (i10 + i11 > length) {
                i11 = length - i10;
            }
            int i12 = i10 + i11;
            str.getChars(i10, i12, this._outputBuffer, 0);
            if (this._characterEscapes != null) {
                _writeSegmentCustom(i11);
            } else {
                int i13 = this._maximumNonEscapedChar;
                if (i13 != 0) {
                    _writeSegmentASCII(i11, i13);
                } else {
                    _writeSegment(i11);
                }
            }
            if (i12 < length) {
                i10 = i12;
            } else {
                return;
            }
        }
    }

    private final void _writeNull() {
        if (this._outputTail + 4 >= this._outputEnd) {
            _flushBuffer();
        }
        int i10 = this._outputTail;
        char[] cArr = this._outputBuffer;
        cArr[i10] = 'n';
        cArr[i10 + 1] = 'u';
        cArr[i10 + 2] = 'l';
        cArr[i10 + 3] = 'l';
        this._outputTail = i10 + 4;
    }

    private void _writeQuotedInt(int i10) {
        if (this._outputTail + 13 >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr = this._outputBuffer;
        int i11 = this._outputTail;
        int i12 = i11 + 1;
        this._outputTail = i12;
        cArr[i11] = this._quoteChar;
        int outputInt = NumberOutput.outputInt(i10, cArr, i12);
        char[] cArr2 = this._outputBuffer;
        this._outputTail = outputInt + 1;
        cArr2[outputInt] = this._quoteChar;
    }

    private void _writeQuotedLong(long j10) {
        if (this._outputTail + 23 >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr = this._outputBuffer;
        int i10 = this._outputTail;
        int i11 = i10 + 1;
        this._outputTail = i11;
        cArr[i10] = this._quoteChar;
        int outputLong = NumberOutput.outputLong(j10, cArr, i11);
        char[] cArr2 = this._outputBuffer;
        this._outputTail = outputLong + 1;
        cArr2[outputLong] = this._quoteChar;
    }

    private void _writeQuotedRaw(String str) {
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr = this._outputBuffer;
        int i10 = this._outputTail;
        this._outputTail = i10 + 1;
        cArr[i10] = this._quoteChar;
        writeRaw(str);
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr2 = this._outputBuffer;
        int i11 = this._outputTail;
        this._outputTail = i11 + 1;
        cArr2[i11] = this._quoteChar;
    }

    private void _writeQuotedShort(short s10) {
        if (this._outputTail + 8 >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr = this._outputBuffer;
        int i10 = this._outputTail;
        int i11 = i10 + 1;
        this._outputTail = i11;
        cArr[i10] = this._quoteChar;
        int outputInt = NumberOutput.outputInt((int) s10, cArr, i11);
        char[] cArr2 = this._outputBuffer;
        this._outputTail = outputInt + 1;
        cArr2[outputInt] = this._quoteChar;
    }

    private void _writeSegment(int i10) {
        char[] cArr;
        char c10;
        int[] iArr = this._outputEscapes;
        int length = iArr.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < i10) {
            do {
                cArr = this._outputBuffer;
                c10 = cArr[i11];
                if ((c10 < length && iArr[c10] != 0) || (i11 = i11 + 1) >= i10) {
                    int i13 = i11 - i12;
                }
                cArr = this._outputBuffer;
                c10 = cArr[i11];
                break;
            } while ((i11 = i11 + 1) >= i10);
            int i132 = i11 - i12;
            if (i132 > 0) {
                this._writer.write(cArr, i12, i132);
                if (i11 >= i10) {
                    return;
                }
            }
            i11++;
            i12 = _prependOrWriteCharacterEscape(this._outputBuffer, i11, i10, c10, iArr[c10]);
        }
    }

    private void _writeSegmentASCII(int i10, int i11) {
        char[] cArr;
        char c10;
        int[] iArr = this._outputEscapes;
        int min = Math.min(iArr.length, i11 + 1);
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (i12 < i10) {
            while (true) {
                cArr = this._outputBuffer;
                c10 = cArr[i12];
                if (c10 >= min) {
                    if (c10 > i11) {
                        i14 = -1;
                        break;
                    }
                } else {
                    i14 = iArr[c10];
                    if (i14 != 0) {
                        break;
                    }
                }
                i12++;
                if (i12 >= i10) {
                    break;
                }
            }
            int i15 = i12 - i13;
            if (i15 > 0) {
                this._writer.write(cArr, i13, i15);
                if (i12 >= i10) {
                    return;
                }
            }
            i12++;
            i13 = _prependOrWriteCharacterEscape(this._outputBuffer, i12, i10, c10, i14);
        }
    }

    private void _writeSegmentCustom(int i10) {
        char c10;
        int[] iArr = this._outputEscapes;
        int i11 = this._maximumNonEscapedChar;
        if (i11 < 1) {
            i11 = 65535;
        }
        int min = Math.min(iArr.length, i11 + 1);
        CharacterEscapes characterEscapes = this._characterEscapes;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (i12 < i10) {
            while (true) {
                c10 = this._outputBuffer[i12];
                if (c10 >= min) {
                    if (c10 <= i11) {
                        SerializableString escapeSequence = characterEscapes.getEscapeSequence(c10);
                        this._currentEscape = escapeSequence;
                        if (escapeSequence != null) {
                            i14 = -2;
                            break;
                        }
                    } else {
                        i14 = -1;
                        break;
                    }
                } else {
                    i14 = iArr[c10];
                    if (i14 != 0) {
                        break;
                    }
                }
                i12++;
                if (i12 >= i10) {
                    break;
                }
            }
            int i15 = i12 - i13;
            if (i15 > 0) {
                this._writer.write(this._outputBuffer, i13, i15);
                if (i12 >= i10) {
                    return;
                }
            }
            i12++;
            i13 = _prependOrWriteCharacterEscape(this._outputBuffer, i12, i10, c10, i14);
        }
    }

    private void _writeString(String str) {
        int length = str.length();
        int i10 = this._outputEnd;
        if (length > i10) {
            _writeLongString(str);
            return;
        }
        if (this._outputTail + length > i10) {
            _flushBuffer();
        }
        str.getChars(0, length, this._outputBuffer, this._outputTail);
        if (this._characterEscapes != null) {
            _writeStringCustom(length);
            return;
        }
        int i11 = this._maximumNonEscapedChar;
        if (i11 != 0) {
            _writeStringASCII(length, i11);
        } else {
            _writeString2(length);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0020, code lost:
        r2 = r6._outputBuffer;
        r3 = r6._outputTail;
        r6._outputTail = r3 + 1;
        r2 = r2[r3];
        _prependOrWriteCharacterEscape(r2, r7[r2]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0016, code lost:
        r4 = r6._outputHead;
        r3 = r3 - r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0019, code lost:
        if (r3 <= 0) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001b, code lost:
        r6._writer.write(r2, r4, r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void _writeString2(int r7) {
        /*
            r6 = this;
            int r0 = r6._outputTail
            int r0 = r0 + r7
            int[] r7 = r6._outputEscapes
            int r1 = r7.length
        L_0x0006:
            int r2 = r6._outputTail
            if (r2 >= r0) goto L_0x0036
        L_0x000a:
            char[] r2 = r6._outputBuffer
            int r3 = r6._outputTail
            char r4 = r2[r3]
            if (r4 >= r1) goto L_0x0030
            r4 = r7[r4]
            if (r4 == 0) goto L_0x0030
            int r4 = r6._outputHead
            int r3 = r3 - r4
            if (r3 <= 0) goto L_0x0020
            java.io.Writer r5 = r6._writer
            r5.write(r2, r4, r3)
        L_0x0020:
            char[] r2 = r6._outputBuffer
            int r3 = r6._outputTail
            int r4 = r3 + 1
            r6._outputTail = r4
            char r2 = r2[r3]
            r3 = r7[r2]
            r6._prependOrWriteCharacterEscape(r2, r3)
            goto L_0x0006
        L_0x0030:
            int r3 = r3 + 1
            r6._outputTail = r3
            if (r3 < r0) goto L_0x000a
        L_0x0036:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeString2(int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x003a A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void _writeStringASCII(int r9, int r10) {
        /*
            r8 = this;
            int r0 = r8._outputTail
            int r0 = r0 + r9
            int[] r9 = r8._outputEscapes
            int r1 = r9.length
            int r2 = r10 + 1
            int r1 = java.lang.Math.min(r1, r2)
        L_0x000c:
            int r2 = r8._outputTail
            if (r2 >= r0) goto L_0x003a
        L_0x0010:
            char[] r2 = r8._outputBuffer
            int r3 = r8._outputTail
            char r4 = r2[r3]
            if (r4 >= r1) goto L_0x001d
            r5 = r9[r4]
            if (r5 == 0) goto L_0x0034
            goto L_0x0020
        L_0x001d:
            if (r4 <= r10) goto L_0x0034
            r5 = -1
        L_0x0020:
            int r6 = r8._outputHead
            int r3 = r3 - r6
            if (r3 <= 0) goto L_0x002a
            java.io.Writer r7 = r8._writer
            r7.write(r2, r6, r3)
        L_0x002a:
            int r2 = r8._outputTail
            int r2 = r2 + 1
            r8._outputTail = r2
            r8._prependOrWriteCharacterEscape(r4, r5)
            goto L_0x000c
        L_0x0034:
            int r3 = r3 + 1
            r8._outputTail = r3
            if (r3 < r0) goto L_0x0010
        L_0x003a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeStringASCII(int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0052 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void _writeStringCustom(int r12) {
        /*
            r11 = this;
            int r0 = r11._outputTail
            int r0 = r0 + r12
            int[] r12 = r11._outputEscapes
            int r1 = r11._maximumNonEscapedChar
            r2 = 1
            if (r1 >= r2) goto L_0x000d
            r1 = 65535(0xffff, float:9.1834E-41)
        L_0x000d:
            int r3 = r12.length
            int r4 = r1 + 1
            int r3 = java.lang.Math.min(r3, r4)
            com.fasterxml.jackson.core.io.CharacterEscapes r4 = r11._characterEscapes
        L_0x0016:
            int r5 = r11._outputTail
            if (r5 >= r0) goto L_0x0052
        L_0x001a:
            char[] r5 = r11._outputBuffer
            int r6 = r11._outputTail
            char r5 = r5[r6]
            if (r5 >= r3) goto L_0x0027
            r6 = r12[r5]
            if (r6 == 0) goto L_0x004b
            goto L_0x0034
        L_0x0027:
            if (r5 <= r1) goto L_0x002b
            r6 = -1
            goto L_0x0034
        L_0x002b:
            com.fasterxml.jackson.core.SerializableString r6 = r4.getEscapeSequence(r5)
            r11._currentEscape = r6
            if (r6 == 0) goto L_0x004b
            r6 = -2
        L_0x0034:
            int r7 = r11._outputTail
            int r8 = r11._outputHead
            int r7 = r7 - r8
            if (r7 <= 0) goto L_0x0042
            java.io.Writer r9 = r11._writer
            char[] r10 = r11._outputBuffer
            r9.write(r10, r8, r7)
        L_0x0042:
            int r7 = r11._outputTail
            int r7 = r7 + r2
            r11._outputTail = r7
            r11._prependOrWriteCharacterEscape(r5, r6)
            goto L_0x0016
        L_0x004b:
            int r5 = r11._outputTail
            int r5 = r5 + r2
            r11._outputTail = r5
            if (r5 < r0) goto L_0x001a
        L_0x0052:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeStringCustom(int):void");
    }

    private void writeRawLong(String str) {
        int i10 = this._outputEnd;
        int i11 = this._outputTail;
        int i12 = i10 - i11;
        str.getChars(0, i12, this._outputBuffer, i11);
        this._outputTail += i12;
        _flushBuffer();
        int length = str.length() - i12;
        while (true) {
            int i13 = this._outputEnd;
            if (length > i13) {
                int i14 = i12 + i13;
                str.getChars(i12, i14, this._outputBuffer, 0);
                this._outputHead = 0;
                this._outputTail = i13;
                _flushBuffer();
                length -= i13;
                i12 = i14;
            } else {
                str.getChars(i12, i12 + length, this._outputBuffer, 0);
                this._outputHead = 0;
                this._outputTail = length;
                return;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void _flushBuffer() {
        int i10 = this._outputTail;
        int i11 = this._outputHead;
        int i12 = i10 - i11;
        if (i12 > 0) {
            this._outputHead = 0;
            this._outputTail = 0;
            this._writer.write(this._outputBuffer, i11, i12);
        }
    }

    /* access modifiers changed from: protected */
    public void _releaseBuffers() {
        char[] cArr = this._outputBuffer;
        if (cArr != null) {
            this._outputBuffer = null;
            this._ioContext.releaseConcatBuffer(cArr);
        }
    }

    /* access modifiers changed from: protected */
    public void _verifyValueWrite(String str) {
        char c10;
        int writeValue = this._writeContext.writeValue();
        if (this._cfgPrettyPrinter != null) {
            _verifyPrettyValueWrite(str, writeValue);
            return;
        }
        if (writeValue == 1) {
            c10 = ',';
        } else if (writeValue == 2) {
            c10 = ':';
        } else if (writeValue == 3) {
            SerializableString serializableString = this._rootValueSeparator;
            if (serializableString != null) {
                writeRaw(serializableString.getValue());
                return;
            }
            return;
        } else if (writeValue == 5) {
            _reportCantWriteValueExpectName(str);
            return;
        } else {
            return;
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr = this._outputBuffer;
        int i10 = this._outputTail;
        this._outputTail = i10 + 1;
        cArr[i10] = c10;
    }

    /* access modifiers changed from: protected */
    public void _writeBinary(Base64Variant base64Variant, byte[] bArr, int i10, int i11) {
        int i12 = i11 - 3;
        int i13 = this._outputEnd - 6;
        int maxLineLength = base64Variant.getMaxLineLength();
        loop0:
        while (true) {
            int i14 = maxLineLength >> 2;
            while (i10 <= i12) {
                if (this._outputTail > i13) {
                    _flushBuffer();
                }
                int i15 = i10 + 2;
                byte b10 = bArr[i10 + 1] & 255;
                i10 += 3;
                int encodeBase64Chunk = base64Variant.encodeBase64Chunk((int) ((b10 | (bArr[i10] << 8)) << 8) | (bArr[i15] & 255), this._outputBuffer, this._outputTail);
                this._outputTail = encodeBase64Chunk;
                i14--;
                if (i14 <= 0) {
                    char[] cArr = this._outputBuffer;
                    int i16 = encodeBase64Chunk + 1;
                    this._outputTail = i16;
                    cArr[encodeBase64Chunk] = '\\';
                    this._outputTail = encodeBase64Chunk + 2;
                    cArr[i16] = 'n';
                    maxLineLength = base64Variant.getMaxLineLength();
                }
            }
            break loop0;
        }
        int i17 = i11 - i10;
        if (i17 > 0) {
            if (this._outputTail > i13) {
                _flushBuffer();
            }
            int i18 = i10 + 1;
            int i19 = bArr[i10] << 16;
            if (i17 == 2) {
                i19 |= (bArr[i18] & 255) << 8;
            }
            this._outputTail = base64Variant.encodeBase64Partial(i19, i17, this._outputBuffer, this._outputTail);
        }
    }

    /* access modifiers changed from: protected */
    public void _writeFieldName(String str, boolean z10) {
        if (this._cfgPrettyPrinter != null) {
            _writePPFieldName(str, z10);
            return;
        }
        if (this._outputTail + 1 >= this._outputEnd) {
            _flushBuffer();
        }
        if (z10) {
            char[] cArr = this._outputBuffer;
            int i10 = this._outputTail;
            this._outputTail = i10 + 1;
            cArr[i10] = ',';
        }
        if (this._cfgUnqNames) {
            _writeString(str);
            return;
        }
        char[] cArr2 = this._outputBuffer;
        int i11 = this._outputTail;
        this._outputTail = i11 + 1;
        cArr2[i11] = this._quoteChar;
        _writeString(str);
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr3 = this._outputBuffer;
        int i12 = this._outputTail;
        this._outputTail = i12 + 1;
        cArr3[i12] = this._quoteChar;
    }

    /* access modifiers changed from: protected */
    public void _writePPFieldName(String str, boolean z10) {
        if (z10) {
            this._cfgPrettyPrinter.writeObjectEntrySeparator(this);
        } else {
            this._cfgPrettyPrinter.beforeObjectEntries(this);
        }
        if (this._cfgUnqNames) {
            _writeString(str);
            return;
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr = this._outputBuffer;
        int i10 = this._outputTail;
        this._outputTail = i10 + 1;
        cArr[i10] = this._quoteChar;
        _writeString(str);
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr2 = this._outputBuffer;
        int i11 = this._outputTail;
        this._outputTail = i11 + 1;
        cArr2[i11] = this._quoteChar;
    }

    public boolean canWriteFormattedNumbers() {
        return true;
    }

    public void close() {
        super.close();
        if (this._outputBuffer != null && isEnabled(JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT)) {
            while (true) {
                JsonStreamContext outputContext = getOutputContext();
                if (!outputContext.inArray()) {
                    if (!outputContext.inObject()) {
                        break;
                    }
                    writeEndObject();
                } else {
                    writeEndArray();
                }
            }
        }
        _flushBuffer();
        this._outputHead = 0;
        this._outputTail = 0;
        if (this._writer != null) {
            if (this._ioContext.isResourceManaged() || isEnabled(JsonGenerator.Feature.AUTO_CLOSE_TARGET)) {
                this._writer.close();
            } else if (isEnabled(JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM)) {
                this._writer.flush();
            }
        }
        _releaseBuffers();
    }

    public void flush() {
        _flushBuffer();
        if (this._writer != null && isEnabled(JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM)) {
            this._writer.flush();
        }
    }

    public int getOutputBuffered() {
        return Math.max(0, this._outputTail - this._outputHead);
    }

    public Object getOutputTarget() {
        return this._writer;
    }

    public void writeBinary(Base64Variant base64Variant, byte[] bArr, int i10, int i11) {
        _verifyValueWrite("write a binary value");
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr = this._outputBuffer;
        int i12 = this._outputTail;
        this._outputTail = i12 + 1;
        cArr[i12] = this._quoteChar;
        _writeBinary(base64Variant, bArr, i10, i11 + i10);
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr2 = this._outputBuffer;
        int i13 = this._outputTail;
        this._outputTail = i13 + 1;
        cArr2[i13] = this._quoteChar;
    }

    public void writeBoolean(boolean z10) {
        int i10;
        _verifyValueWrite("write a boolean value");
        if (this._outputTail + 5 >= this._outputEnd) {
            _flushBuffer();
        }
        int i11 = this._outputTail;
        char[] cArr = this._outputBuffer;
        if (z10) {
            cArr[i11] = 't';
            cArr[i11 + 1] = 'r';
            cArr[i11 + 2] = 'u';
            i10 = i11 + 3;
            cArr[i10] = 'e';
        } else {
            cArr[i11] = 'f';
            cArr[i11 + 1] = 'a';
            cArr[i11 + 2] = 'l';
            cArr[i11 + 3] = 's';
            i10 = i11 + 4;
            cArr[i10] = 'e';
        }
        this._outputTail = i10 + 1;
    }

    public void writeEndArray() {
        if (!this._writeContext.inArray()) {
            _reportError("Current context not Array but " + this._writeContext.typeDesc());
        }
        PrettyPrinter prettyPrinter = this._cfgPrettyPrinter;
        if (prettyPrinter != null) {
            prettyPrinter.writeEndArray(this, this._writeContext.getEntryCount());
        } else {
            if (this._outputTail >= this._outputEnd) {
                _flushBuffer();
            }
            char[] cArr = this._outputBuffer;
            int i10 = this._outputTail;
            this._outputTail = i10 + 1;
            cArr[i10] = ']';
        }
        this._writeContext = this._writeContext.clearAndGetParent();
    }

    public void writeEndObject() {
        if (!this._writeContext.inObject()) {
            _reportError("Current context not Object but " + this._writeContext.typeDesc());
        }
        PrettyPrinter prettyPrinter = this._cfgPrettyPrinter;
        if (prettyPrinter != null) {
            prettyPrinter.writeEndObject(this, this._writeContext.getEntryCount());
        } else {
            if (this._outputTail >= this._outputEnd) {
                _flushBuffer();
            }
            char[] cArr = this._outputBuffer;
            int i10 = this._outputTail;
            this._outputTail = i10 + 1;
            cArr[i10] = '}';
        }
        this._writeContext = this._writeContext.clearAndGetParent();
    }

    public void writeFieldName(String str) {
        int writeFieldName = this._writeContext.writeFieldName(str);
        if (writeFieldName == 4) {
            _reportError("Can not write a field name, expecting a value");
        }
        boolean z10 = true;
        if (writeFieldName != 1) {
            z10 = false;
        }
        _writeFieldName(str, z10);
    }

    public void writeNull() {
        _verifyValueWrite("write a null");
        _writeNull();
    }

    public void writeNumber(short s10) {
        _verifyValueWrite("write a number");
        if (this._cfgNumbersAsStrings) {
            _writeQuotedShort(s10);
            return;
        }
        if (this._outputTail + 6 >= this._outputEnd) {
            _flushBuffer();
        }
        this._outputTail = NumberOutput.outputInt((int) s10, this._outputBuffer, this._outputTail);
    }

    public void writeRaw(String str) {
        int length = str.length();
        int i10 = this._outputEnd - this._outputTail;
        if (i10 == 0) {
            _flushBuffer();
            i10 = this._outputEnd - this._outputTail;
        }
        if (i10 >= length) {
            str.getChars(0, length, this._outputBuffer, this._outputTail);
            this._outputTail += length;
            return;
        }
        writeRawLong(str);
    }

    public void writeRawUTF8String(byte[] bArr, int i10, int i11) {
        _reportUnsupportedOperation();
    }

    public void writeStartArray() {
        _verifyValueWrite("start an array");
        this._writeContext = this._writeContext.createChildArrayContext();
        PrettyPrinter prettyPrinter = this._cfgPrettyPrinter;
        if (prettyPrinter != null) {
            prettyPrinter.writeStartArray(this);
            return;
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr = this._outputBuffer;
        int i10 = this._outputTail;
        this._outputTail = i10 + 1;
        cArr[i10] = '[';
    }

    public void writeStartObject(Object obj) {
        _verifyValueWrite("start an object");
        JsonWriteContext createChildObjectContext = this._writeContext.createChildObjectContext();
        this._writeContext = createChildObjectContext;
        if (obj != null) {
            createChildObjectContext.setCurrentValue(obj);
        }
        PrettyPrinter prettyPrinter = this._cfgPrettyPrinter;
        if (prettyPrinter != null) {
            prettyPrinter.writeStartObject(this);
            return;
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr = this._outputBuffer;
        int i10 = this._outputTail;
        this._outputTail = i10 + 1;
        cArr[i10] = '{';
    }

    public void writeString(String str) {
        _verifyValueWrite("write a string");
        if (str == null) {
            _writeNull();
            return;
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr = this._outputBuffer;
        int i10 = this._outputTail;
        this._outputTail = i10 + 1;
        cArr[i10] = this._quoteChar;
        _writeString(str);
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr2 = this._outputBuffer;
        int i11 = this._outputTail;
        this._outputTail = i11 + 1;
        cArr2[i11] = this._quoteChar;
    }

    public void writeUTF8String(byte[] bArr, int i10, int i11) {
        _reportUnsupportedOperation();
    }

    public void writeFieldName(SerializableString serializableString) {
        int writeFieldName = this._writeContext.writeFieldName(serializableString.getValue());
        if (writeFieldName == 4) {
            _reportError("Can not write a field name, expecting a value");
        }
        boolean z10 = true;
        if (writeFieldName != 1) {
            z10 = false;
        }
        _writeFieldName(serializableString, z10);
    }

    public void writeNumber(int i10) {
        _verifyValueWrite("write a number");
        if (this._cfgNumbersAsStrings) {
            _writeQuotedInt(i10);
            return;
        }
        if (this._outputTail + 11 >= this._outputEnd) {
            _flushBuffer();
        }
        this._outputTail = NumberOutput.outputInt(i10, this._outputBuffer, this._outputTail);
    }

    public void writeRaw(String str, int i10, int i11) {
        int i12 = this._outputEnd - this._outputTail;
        if (i12 < i11) {
            _flushBuffer();
            i12 = this._outputEnd - this._outputTail;
        }
        if (i12 >= i11) {
            str.getChars(i10, i10 + i11, this._outputBuffer, this._outputTail);
            this._outputTail += i11;
            return;
        }
        writeRawLong(str.substring(i10, i11 + i10));
    }

    /* JADX INFO: finally extract failed */
    public int writeBinary(Base64Variant base64Variant, InputStream inputStream, int i10) {
        _verifyValueWrite("write a binary value");
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr = this._outputBuffer;
        int i11 = this._outputTail;
        this._outputTail = i11 + 1;
        cArr[i11] = this._quoteChar;
        byte[] allocBase64Buffer = this._ioContext.allocBase64Buffer();
        if (i10 < 0) {
            try {
                i10 = _writeBinary(base64Variant, inputStream, allocBase64Buffer);
            } catch (Throwable th2) {
                this._ioContext.releaseBase64Buffer(allocBase64Buffer);
                throw th2;
            }
        } else {
            int _writeBinary = _writeBinary(base64Variant, inputStream, allocBase64Buffer, i10);
            if (_writeBinary > 0) {
                _reportError("Too few bytes available: missing " + _writeBinary + " bytes (out of " + i10 + ")");
            }
        }
        this._ioContext.releaseBase64Buffer(allocBase64Buffer);
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr2 = this._outputBuffer;
        int i12 = this._outputTail;
        this._outputTail = i12 + 1;
        cArr2[i12] = this._quoteChar;
        return i10;
    }

    public void writeStartObject() {
        _verifyValueWrite("start an object");
        this._writeContext = this._writeContext.createChildObjectContext();
        PrettyPrinter prettyPrinter = this._cfgPrettyPrinter;
        if (prettyPrinter != null) {
            prettyPrinter.writeStartObject(this);
            return;
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr = this._outputBuffer;
        int i10 = this._outputTail;
        this._outputTail = i10 + 1;
        cArr[i10] = '{';
    }

    public void writeString(char[] cArr, int i10, int i11) {
        _verifyValueWrite("write a string");
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr2 = this._outputBuffer;
        int i12 = this._outputTail;
        this._outputTail = i12 + 1;
        cArr2[i12] = this._quoteChar;
        _writeString(cArr, i10, i11);
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr3 = this._outputBuffer;
        int i13 = this._outputTail;
        this._outputTail = i13 + 1;
        cArr3[i13] = this._quoteChar;
    }

    private void _writeString(char[] cArr, int i10, int i11) {
        if (this._characterEscapes != null) {
            _writeStringCustom(cArr, i10, i11);
            return;
        }
        int i12 = this._maximumNonEscapedChar;
        if (i12 != 0) {
            _writeStringASCII(cArr, i10, i11, i12);
            return;
        }
        int i13 = i11 + i10;
        int[] iArr = this._outputEscapes;
        int length = iArr.length;
        while (i10 < i13) {
            int i14 = i10;
            do {
                char c10 = cArr[i14];
                if ((c10 < length && iArr[c10] != 0) || (i14 = i14 + 1) >= i13) {
                    int i15 = i14 - i10;
                }
                char c102 = cArr[i14];
                break;
            } while ((i14 = i14 + 1) >= i13);
            int i152 = i14 - i10;
            if (i152 < 32) {
                if (this._outputTail + i152 > this._outputEnd) {
                    _flushBuffer();
                }
                if (i152 > 0) {
                    System.arraycopy(cArr, i10, this._outputBuffer, this._outputTail, i152);
                    this._outputTail += i152;
                }
            } else {
                _flushBuffer();
                this._writer.write(cArr, i10, i152);
            }
            if (i14 < i13) {
                i10 = i14 + 1;
                char c11 = cArr[i14];
                _appendCharacterEscape(c11, iArr[c11]);
            } else {
                return;
            }
        }
    }

    private void _writeStringASCII(char[] cArr, int i10, int i11, int i12) {
        char c10;
        int i13 = i11 + i10;
        int[] iArr = this._outputEscapes;
        int min = Math.min(iArr.length, i12 + 1);
        int i14 = 0;
        while (i10 < i13) {
            int i15 = i10;
            while (true) {
                c10 = cArr[i15];
                if (c10 >= min) {
                    if (c10 > i12) {
                        i14 = -1;
                        break;
                    }
                } else {
                    i14 = iArr[c10];
                    if (i14 != 0) {
                        break;
                    }
                }
                i15++;
                if (i15 >= i13) {
                    break;
                }
            }
            int i16 = i15 - i10;
            if (i16 < 32) {
                if (this._outputTail + i16 > this._outputEnd) {
                    _flushBuffer();
                }
                if (i16 > 0) {
                    System.arraycopy(cArr, i10, this._outputBuffer, this._outputTail, i16);
                    this._outputTail += i16;
                }
            } else {
                _flushBuffer();
                this._writer.write(cArr, i10, i16);
            }
            if (i15 < i13) {
                i10 = i15 + 1;
                _appendCharacterEscape(c10, i14);
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void _writePPFieldName(SerializableString serializableString, boolean z10) {
        if (z10) {
            this._cfgPrettyPrinter.writeObjectEntrySeparator(this);
        } else {
            this._cfgPrettyPrinter.beforeObjectEntries(this);
        }
        char[] asQuotedChars = serializableString.asQuotedChars();
        if (this._cfgUnqNames) {
            writeRaw(asQuotedChars, 0, asQuotedChars.length);
            return;
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr = this._outputBuffer;
        int i10 = this._outputTail;
        this._outputTail = i10 + 1;
        cArr[i10] = this._quoteChar;
        writeRaw(asQuotedChars, 0, asQuotedChars.length);
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr2 = this._outputBuffer;
        int i11 = this._outputTail;
        this._outputTail = i11 + 1;
        cArr2[i11] = this._quoteChar;
    }

    /* access modifiers changed from: protected */
    public void _writeFieldName(SerializableString serializableString, boolean z10) {
        if (this._cfgPrettyPrinter != null) {
            _writePPFieldName(serializableString, z10);
            return;
        }
        if (this._outputTail + 1 >= this._outputEnd) {
            _flushBuffer();
        }
        if (z10) {
            char[] cArr = this._outputBuffer;
            int i10 = this._outputTail;
            this._outputTail = i10 + 1;
            cArr[i10] = ',';
        }
        char[] asQuotedChars = serializableString.asQuotedChars();
        if (this._cfgUnqNames) {
            writeRaw(asQuotedChars, 0, asQuotedChars.length);
            return;
        }
        char[] cArr2 = this._outputBuffer;
        int i11 = this._outputTail;
        int i12 = i11 + 1;
        this._outputTail = i12;
        cArr2[i11] = this._quoteChar;
        int length = asQuotedChars.length;
        if (i12 + length + 1 >= this._outputEnd) {
            writeRaw(asQuotedChars, 0, length);
            if (this._outputTail >= this._outputEnd) {
                _flushBuffer();
            }
            char[] cArr3 = this._outputBuffer;
            int i13 = this._outputTail;
            this._outputTail = i13 + 1;
            cArr3[i13] = this._quoteChar;
            return;
        }
        System.arraycopy(asQuotedChars, 0, cArr2, i12, length);
        int i14 = this._outputTail + length;
        char[] cArr4 = this._outputBuffer;
        this._outputTail = i14 + 1;
        cArr4[i14] = this._quoteChar;
    }

    public void writeNumber(long j10) {
        _verifyValueWrite("write a number");
        if (this._cfgNumbersAsStrings) {
            _writeQuotedLong(j10);
            return;
        }
        if (this._outputTail + 21 >= this._outputEnd) {
            _flushBuffer();
        }
        this._outputTail = NumberOutput.outputLong(j10, this._outputBuffer, this._outputTail);
    }

    public void writeRaw(SerializableString serializableString) {
        writeRaw(serializableString.getValue());
    }

    private void _writeStringCustom(char[] cArr, int i10, int i11) {
        char c10;
        int i12 = i11 + i10;
        int[] iArr = this._outputEscapes;
        int i13 = this._maximumNonEscapedChar;
        if (i13 < 1) {
            i13 = 65535;
        }
        int min = Math.min(iArr.length, i13 + 1);
        CharacterEscapes characterEscapes = this._characterEscapes;
        int i14 = 0;
        while (i10 < i12) {
            int i15 = i10;
            while (true) {
                c10 = cArr[i15];
                if (c10 >= min) {
                    if (c10 <= i13) {
                        SerializableString escapeSequence = characterEscapes.getEscapeSequence(c10);
                        this._currentEscape = escapeSequence;
                        if (escapeSequence != null) {
                            i14 = -2;
                            break;
                        }
                    } else {
                        i14 = -1;
                        break;
                    }
                } else {
                    i14 = iArr[c10];
                    if (i14 != 0) {
                        break;
                    }
                }
                i15++;
                if (i15 >= i12) {
                    break;
                }
            }
            int i16 = i15 - i10;
            if (i16 < 32) {
                if (this._outputTail + i16 > this._outputEnd) {
                    _flushBuffer();
                }
                if (i16 > 0) {
                    System.arraycopy(cArr, i10, this._outputBuffer, this._outputTail, i16);
                    this._outputTail += i16;
                }
            } else {
                _flushBuffer();
                this._writer.write(cArr, i10, i16);
            }
            if (i15 < i12) {
                i10 = i15 + 1;
                _appendCharacterEscape(c10, i14);
            } else {
                return;
            }
        }
    }

    public void writeRaw(char[] cArr, int i10, int i11) {
        if (i11 < 32) {
            if (i11 > this._outputEnd - this._outputTail) {
                _flushBuffer();
            }
            System.arraycopy(cArr, i10, this._outputBuffer, this._outputTail, i11);
            this._outputTail += i11;
            return;
        }
        _flushBuffer();
        this._writer.write(cArr, i10, i11);
    }

    /* access modifiers changed from: protected */
    public int _writeBinary(Base64Variant base64Variant, InputStream inputStream, byte[] bArr, int i10) {
        int _readMore;
        Base64Variant base64Variant2 = base64Variant;
        int i11 = this._outputEnd - 6;
        int i12 = 2;
        int i13 = -3;
        int i14 = i10;
        int maxLineLength = base64Variant.getMaxLineLength() >> 2;
        int i15 = 0;
        int i16 = 0;
        while (true) {
            if (i14 <= 2) {
                break;
            }
            if (i15 > i13) {
                i16 = _readMore(inputStream, bArr, i15, i16, i14);
                if (i16 < 3) {
                    i15 = 0;
                    break;
                }
                i13 = i16 - 3;
                i15 = 0;
            }
            if (this._outputTail > i11) {
                _flushBuffer();
            }
            int i17 = i15 + 2;
            byte b10 = bArr[i15 + 1] & 255;
            i15 += 3;
            i14 -= 3;
            int encodeBase64Chunk = base64Variant.encodeBase64Chunk((int) ((b10 | (bArr[i15] << 8)) << 8) | (bArr[i17] & 255), this._outputBuffer, this._outputTail);
            this._outputTail = encodeBase64Chunk;
            maxLineLength--;
            if (maxLineLength <= 0) {
                char[] cArr = this._outputBuffer;
                int i18 = encodeBase64Chunk + 1;
                this._outputTail = i18;
                cArr[encodeBase64Chunk] = '\\';
                this._outputTail = encodeBase64Chunk + 2;
                cArr[i18] = 'n';
                maxLineLength = base64Variant.getMaxLineLength() >> 2;
            }
        }
        if (i14 <= 0 || (_readMore = _readMore(inputStream, bArr, i15, i16, i14)) <= 0) {
            return i14;
        }
        if (this._outputTail > i11) {
            _flushBuffer();
        }
        int i19 = bArr[0] << 16;
        if (1 < _readMore) {
            i19 |= (bArr[1] & 255) << 8;
        } else {
            i12 = 1;
        }
        this._outputTail = base64Variant.encodeBase64Partial(i19, i12, this._outputBuffer, this._outputTail);
        return i14 - i12;
    }

    public void writeString(SerializableString serializableString) {
        _verifyValueWrite("write a string");
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr = this._outputBuffer;
        int i10 = this._outputTail;
        this._outputTail = i10 + 1;
        cArr[i10] = this._quoteChar;
        char[] asQuotedChars = serializableString.asQuotedChars();
        int length = asQuotedChars.length;
        if (length < 32) {
            if (length > this._outputEnd - this._outputTail) {
                _flushBuffer();
            }
            System.arraycopy(asQuotedChars, 0, this._outputBuffer, this._outputTail, length);
            this._outputTail += length;
        } else {
            _flushBuffer();
            this._writer.write(asQuotedChars, 0, length);
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr2 = this._outputBuffer;
        int i11 = this._outputTail;
        this._outputTail = i11 + 1;
        cArr2[i11] = this._quoteChar;
    }

    public void writeNumber(BigInteger bigInteger) {
        _verifyValueWrite("write a number");
        if (bigInteger == null) {
            _writeNull();
        } else if (this._cfgNumbersAsStrings) {
            _writeQuotedRaw(bigInteger.toString());
        } else {
            writeRaw(bigInteger.toString());
        }
    }

    public void writeRaw(char c10) {
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr = this._outputBuffer;
        int i10 = this._outputTail;
        this._outputTail = i10 + 1;
        cArr[i10] = c10;
    }

    public void writeNumber(double d10) {
        if (this._cfgNumbersAsStrings || (isEnabled(JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS) && (Double.isNaN(d10) || Double.isInfinite(d10)))) {
            writeString(String.valueOf(d10));
            return;
        }
        _verifyValueWrite("write a number");
        writeRaw(String.valueOf(d10));
    }

    public void writeNumber(float f10) {
        if (this._cfgNumbersAsStrings || (isEnabled(JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS) && (Float.isNaN(f10) || Float.isInfinite(f10)))) {
            writeString(String.valueOf(f10));
            return;
        }
        _verifyValueWrite("write a number");
        writeRaw(String.valueOf(f10));
    }

    public void writeNumber(BigDecimal bigDecimal) {
        _verifyValueWrite("write a number");
        if (bigDecimal == null) {
            _writeNull();
        } else if (this._cfgNumbersAsStrings) {
            _writeQuotedRaw(_asString(bigDecimal));
        } else {
            writeRaw(_asString(bigDecimal));
        }
    }

    /* access modifiers changed from: protected */
    public int _writeBinary(Base64Variant base64Variant, InputStream inputStream, byte[] bArr) {
        Base64Variant base64Variant2 = base64Variant;
        byte[] bArr2 = bArr;
        int i10 = this._outputEnd - 6;
        int i11 = 2;
        int i12 = -3;
        int maxLineLength = base64Variant.getMaxLineLength() >> 2;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            if (i13 > i12) {
                i14 = _readMore(inputStream, bArr, i13, i14, bArr2.length);
                if (i14 < 3) {
                    break;
                }
                i12 = i14 - 3;
                i13 = 0;
            }
            if (this._outputTail > i10) {
                _flushBuffer();
            }
            int i16 = i13 + 2;
            byte b10 = bArr2[i13 + 1] & 255;
            i13 += 3;
            i15 += 3;
            int encodeBase64Chunk = base64Variant2.encodeBase64Chunk((int) ((b10 | (bArr2[i13] << 8)) << 8) | (bArr2[i16] & 255), this._outputBuffer, this._outputTail);
            this._outputTail = encodeBase64Chunk;
            maxLineLength--;
            if (maxLineLength <= 0) {
                char[] cArr = this._outputBuffer;
                int i17 = encodeBase64Chunk + 1;
                this._outputTail = i17;
                cArr[encodeBase64Chunk] = '\\';
                this._outputTail = encodeBase64Chunk + 2;
                cArr[i17] = 'n';
                maxLineLength = base64Variant.getMaxLineLength() >> 2;
            }
        }
        if (i14 <= 0) {
            return i15;
        }
        if (this._outputTail > i10) {
            _flushBuffer();
        }
        int i18 = bArr2[0] << 16;
        if (1 < i14) {
            i18 |= (bArr2[1] & 255) << 8;
        } else {
            i11 = 1;
        }
        int i19 = i15 + i11;
        this._outputTail = base64Variant2.encodeBase64Partial(i18, i11, this._outputBuffer, this._outputTail);
        return i19;
    }

    public void writeNumber(String str) {
        _verifyValueWrite("write a number");
        if (this._cfgNumbersAsStrings) {
            _writeQuotedRaw(str);
        } else {
            writeRaw(str);
        }
    }

    private int _prependOrWriteCharacterEscape(char[] cArr, int i10, int i11, char c10, int i12) {
        String str;
        int i13;
        if (i12 >= 0) {
            if (i10 <= 1 || i10 >= i11) {
                char[] cArr2 = this._entityBuffer;
                if (cArr2 == null) {
                    cArr2 = _allocateEntityBuffer();
                }
                cArr2[1] = (char) i12;
                this._writer.write(cArr2, 0, 2);
                return i10;
            }
            int i14 = i10 - 2;
            cArr[i14] = '\\';
            cArr[i10 - 1] = (char) i12;
            return i14;
        } else if (i12 == -2) {
            SerializableString serializableString = this._currentEscape;
            if (serializableString == null) {
                str = this._characterEscapes.getEscapeSequence(c10).getValue();
            } else {
                str = serializableString.getValue();
                this._currentEscape = null;
            }
            int length = str.length();
            if (i10 < length || i10 >= i11) {
                this._writer.write(str);
                return i10;
            }
            int i15 = i10 - length;
            str.getChars(0, length, cArr, i15);
            return i15;
        } else if (i10 <= 5 || i10 >= i11) {
            char[] cArr3 = this._entityBuffer;
            if (cArr3 == null) {
                cArr3 = _allocateEntityBuffer();
            }
            this._outputHead = this._outputTail;
            if (c10 > 255) {
                int i16 = c10 >> 8;
                char[] cArr4 = HEX_CHARS;
                cArr3[10] = cArr4[(i16 & 255) >> 4];
                cArr3[11] = cArr4[i16 & 15];
                cArr3[12] = cArr4[(c10 & 255) >> 4];
                cArr3[13] = cArr4[c10 & 15];
                this._writer.write(cArr3, 8, 6);
                return i10;
            }
            char[] cArr5 = HEX_CHARS;
            cArr3[6] = cArr5[c10 >> 4];
            cArr3[7] = cArr5[c10 & 15];
            this._writer.write(cArr3, 2, 6);
            return i10;
        } else {
            cArr[i10 - 6] = '\\';
            int i17 = i10 - 4;
            cArr[i10 - 5] = 'u';
            if (c10 > 255) {
                int i18 = c10 >> 8;
                int i19 = i10 - 3;
                char[] cArr6 = HEX_CHARS;
                cArr[i17] = cArr6[(i18 & 255) >> 4];
                i13 = i10 - 2;
                cArr[i19] = cArr6[i18 & 15];
                c10 = (char) (c10 & 255);
            } else {
                int i20 = i10 - 3;
                cArr[i17] = '0';
                i13 = i10 - 2;
                cArr[i20] = '0';
            }
            char[] cArr7 = HEX_CHARS;
            cArr[i13] = cArr7[c10 >> 4];
            cArr[i13 + 1] = cArr7[c10 & 15];
            return i13 - 4;
        }
    }
}
