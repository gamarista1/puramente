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
import java.io.OutputStream;
import java.math.BigDecimal;
import java.math.BigInteger;

public class UTF8JsonGenerator extends JsonGeneratorImpl {
    private static final byte BYTE_0 = 48;
    private static final byte BYTE_BACKSLASH = 92;
    private static final byte BYTE_COLON = 58;
    private static final byte BYTE_COMMA = 44;
    private static final byte BYTE_LBRACKET = 91;
    private static final byte BYTE_LCURLY = 123;
    private static final byte BYTE_RBRACKET = 93;
    private static final byte BYTE_RCURLY = 125;
    private static final byte BYTE_u = 117;
    private static final byte[] FALSE_BYTES = {102, 97, 108, 115, 101};
    private static final byte[] HEX_CHARS = CharTypes.copyHexBytes();
    private static final int MAX_BYTES_TO_BUFFER = 512;
    private static final byte[] NULL_BYTES = {110, BYTE_u, 108, 108};
    private static final byte[] TRUE_BYTES = {116, 114, BYTE_u, 101};
    protected boolean _bufferRecyclable;
    protected char[] _charBuffer;
    protected final int _charBufferLength;
    protected byte[] _entityBuffer;
    protected byte[] _outputBuffer;
    protected final int _outputEnd;
    protected final int _outputMaxContiguous;
    protected final OutputStream _outputStream;
    protected int _outputTail;
    protected byte _quoteChar = 34;

    public UTF8JsonGenerator(IOContext iOContext, int i10, ObjectCodec objectCodec, OutputStream outputStream) {
        super(iOContext, i10, objectCodec);
        this._outputStream = outputStream;
        this._bufferRecyclable = true;
        byte[] allocWriteEncodingBuffer = iOContext.allocWriteEncodingBuffer();
        this._outputBuffer = allocWriteEncodingBuffer;
        int length = allocWriteEncodingBuffer.length;
        this._outputEnd = length;
        this._outputMaxContiguous = length >> 3;
        char[] allocConcatBuffer = iOContext.allocConcatBuffer();
        this._charBuffer = allocConcatBuffer;
        this._charBufferLength = allocConcatBuffer.length;
        if (isEnabled(JsonGenerator.Feature.ESCAPE_NON_ASCII)) {
            setHighestNonEscapedChar(127);
        }
    }

    private final int _handleLongCustomEscape(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) {
        int length = bArr2.length;
        if (i10 + length > i11) {
            this._outputTail = i10;
            _flushBuffer();
            int i13 = this._outputTail;
            if (length > bArr.length) {
                this._outputStream.write(bArr2, 0, length);
                return i13;
            }
            System.arraycopy(bArr2, 0, bArr, i13, length);
            i10 = i13 + length;
        }
        if ((i12 * 6) + i10 <= i11) {
            return i10;
        }
        _flushBuffer();
        return this._outputTail;
    }

    private final int _outputMultiByteChar(int i10, int i11) {
        byte[] bArr = this._outputBuffer;
        if (i10 < 55296 || i10 > 57343) {
            bArr[i11] = (byte) ((i10 >> 12) | 224);
            int i12 = i11 + 2;
            bArr[i11 + 1] = (byte) (((i10 >> 6) & 63) | 128);
            int i13 = i11 + 3;
            bArr[i12] = (byte) ((i10 & 63) | 128);
            return i13;
        }
        bArr[i11] = BYTE_BACKSLASH;
        bArr[i11 + 1] = BYTE_u;
        byte[] bArr2 = HEX_CHARS;
        bArr[i11 + 2] = bArr2[(i10 >> 12) & 15];
        bArr[i11 + 3] = bArr2[(i10 >> 8) & 15];
        int i14 = i11 + 5;
        bArr[i11 + 4] = bArr2[(i10 >> 4) & 15];
        int i15 = i11 + 6;
        bArr[i14] = bArr2[i10 & 15];
        return i15;
    }

    private final int _outputRawMultiByteChar(int i10, char[] cArr, int i11, int i12) {
        if (i10 < 55296 || i10 > 57343) {
            byte[] bArr = this._outputBuffer;
            int i13 = this._outputTail;
            int i14 = i13 + 1;
            this._outputTail = i14;
            bArr[i13] = (byte) ((i10 >> 12) | 224);
            int i15 = i13 + 2;
            this._outputTail = i15;
            bArr[i14] = (byte) (((i10 >> 6) & 63) | 128);
            this._outputTail = i13 + 3;
            bArr[i15] = (byte) ((i10 & 63) | 128);
            return i11;
        }
        if (i11 >= i12 || cArr == null) {
            _reportError(String.format("Split surrogate on writeRaw() input (last character): first character 0x%4x", new Object[]{Integer.valueOf(i10)}));
        }
        _outputSurrogates(i10, cArr[i11]);
        return i11 + 1;
    }

    private final int _readMore(InputStream inputStream, byte[] bArr, int i10, int i11, int i12) {
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

    private final void _writeBytes(byte[] bArr) {
        int length = bArr.length;
        if (this._outputTail + length > this._outputEnd) {
            _flushBuffer();
            if (length > MAX_BYTES_TO_BUFFER) {
                this._outputStream.write(bArr, 0, length);
                return;
            }
        }
        System.arraycopy(bArr, 0, this._outputBuffer, this._outputTail, length);
        this._outputTail += length;
    }

    private final int _writeCustomEscape(byte[] bArr, int i10, SerializableString serializableString, int i11) {
        byte[] asUnquotedUTF8 = serializableString.asUnquotedUTF8();
        int length = asUnquotedUTF8.length;
        if (length > 6) {
            return _handleLongCustomEscape(bArr, i10, this._outputEnd, asUnquotedUTF8, i11);
        }
        System.arraycopy(asUnquotedUTF8, 0, bArr, i10, length);
        return i10 + length;
    }

    private final void _writeCustomStringSegment2(char[] cArr, int i10, int i11) {
        if (this._outputTail + ((i11 - i10) * 6) > this._outputEnd) {
            _flushBuffer();
        }
        int i12 = this._outputTail;
        byte[] bArr = this._outputBuffer;
        int[] iArr = this._outputEscapes;
        int i13 = this._maximumNonEscapedChar;
        if (i13 <= 0) {
            i13 = 65535;
        }
        CharacterEscapes characterEscapes = this._characterEscapes;
        while (i10 < i11) {
            int i14 = i10 + 1;
            char c10 = cArr[i10];
            if (c10 <= 127) {
                int i15 = iArr[c10];
                if (i15 == 0) {
                    bArr[i12] = (byte) c10;
                    i10 = i14;
                    i12++;
                } else if (i15 > 0) {
                    int i16 = i12 + 1;
                    bArr[i12] = BYTE_BACKSLASH;
                    i12 += 2;
                    bArr[i16] = (byte) i15;
                } else if (i15 == -2) {
                    SerializableString escapeSequence = characterEscapes.getEscapeSequence(c10);
                    if (escapeSequence == null) {
                        _reportError("Invalid custom escape definitions; custom escape not found for character code 0x" + Integer.toHexString(c10) + ", although was supposed to have one");
                    }
                    i12 = _writeCustomEscape(bArr, i12, escapeSequence, i11 - i14);
                } else {
                    i12 = _writeGenericEscape(c10, i12);
                }
            } else if (c10 > i13) {
                i12 = _writeGenericEscape(c10, i12);
            } else {
                SerializableString escapeSequence2 = characterEscapes.getEscapeSequence(c10);
                if (escapeSequence2 != null) {
                    i12 = _writeCustomEscape(bArr, i12, escapeSequence2, i11 - i14);
                } else if (c10 <= 2047) {
                    int i17 = i12 + 1;
                    bArr[i12] = (byte) ((c10 >> 6) | 192);
                    i12 += 2;
                    bArr[i17] = (byte) ((c10 & '?') | 128);
                } else {
                    i12 = _outputMultiByteChar(c10, i12);
                }
            }
            i10 = i14;
        }
        this._outputTail = i12;
    }

    private int _writeGenericEscape(int i10, int i11) {
        int i12;
        byte[] bArr = this._outputBuffer;
        bArr[i11] = BYTE_BACKSLASH;
        int i13 = i11 + 2;
        bArr[i11 + 1] = BYTE_u;
        if (i10 > 255) {
            int i14 = i10 >> 8;
            int i15 = i11 + 3;
            byte[] bArr2 = HEX_CHARS;
            bArr[i13] = bArr2[(i14 & 255) >> 4];
            i12 = i11 + 4;
            bArr[i15] = bArr2[i14 & 15];
            i10 &= 255;
        } else {
            int i16 = i11 + 3;
            bArr[i13] = BYTE_0;
            i12 = i11 + 4;
            bArr[i16] = BYTE_0;
        }
        int i17 = i12 + 1;
        byte[] bArr3 = HEX_CHARS;
        bArr[i12] = bArr3[i10 >> 4];
        int i18 = i12 + 2;
        bArr[i17] = bArr3[i10 & 15];
        return i18;
    }

    private final void _writeNull() {
        if (this._outputTail + 4 >= this._outputEnd) {
            _flushBuffer();
        }
        System.arraycopy(NULL_BYTES, 0, this._outputBuffer, this._outputTail, 4);
        this._outputTail += 4;
    }

    private final void _writeQuotedInt(int i10) {
        if (this._outputTail + 13 >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        int i11 = this._outputTail;
        int i12 = i11 + 1;
        this._outputTail = i12;
        bArr[i11] = this._quoteChar;
        int outputInt = NumberOutput.outputInt(i10, bArr, i12);
        byte[] bArr2 = this._outputBuffer;
        this._outputTail = outputInt + 1;
        bArr2[outputInt] = this._quoteChar;
    }

    private final void _writeQuotedLong(long j10) {
        if (this._outputTail + 23 >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        int i10 = this._outputTail;
        int i11 = i10 + 1;
        this._outputTail = i11;
        bArr[i10] = this._quoteChar;
        int outputLong = NumberOutput.outputLong(j10, bArr, i11);
        byte[] bArr2 = this._outputBuffer;
        this._outputTail = outputLong + 1;
        bArr2[outputLong] = this._quoteChar;
    }

    private final void _writeQuotedRaw(String str) {
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        int i10 = this._outputTail;
        this._outputTail = i10 + 1;
        bArr[i10] = this._quoteChar;
        writeRaw(str);
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr2 = this._outputBuffer;
        int i11 = this._outputTail;
        this._outputTail = i11 + 1;
        bArr2[i11] = this._quoteChar;
    }

    private final void _writeQuotedShort(short s10) {
        if (this._outputTail + 8 >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        int i10 = this._outputTail;
        int i11 = i10 + 1;
        this._outputTail = i11;
        bArr[i10] = this._quoteChar;
        int outputInt = NumberOutput.outputInt((int) s10, bArr, i11);
        byte[] bArr2 = this._outputBuffer;
        this._outputTail = outputInt + 1;
        bArr2[outputInt] = this._quoteChar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        r7 = r7 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
        if (r0 >= 2048) goto L_0x0029;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000e, code lost:
        r1 = r5._outputBuffer;
        r2 = r5._outputTail;
        r3 = r2 + 1;
        r5._outputTail = r3;
        r1[r2] = (byte) ((r0 >> 6) | 192);
        r5._outputTail = r2 + 2;
        r1[r3] = (byte) ((r0 & '?') | 128);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0029, code lost:
        r7 = _outputRawMultiByteChar(r0, r6, r7, r8);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void _writeRawSegment(char[] r6, int r7, int r8) {
        /*
            r5 = this;
        L_0x0000:
            if (r7 >= r8) goto L_0x003d
        L_0x0002:
            char r0 = r6[r7]
            r1 = 127(0x7f, float:1.78E-43)
            if (r0 <= r1) goto L_0x002e
            int r7 = r7 + 1
            r1 = 2048(0x800, float:2.87E-42)
            if (r0 >= r1) goto L_0x0029
            byte[] r1 = r5._outputBuffer
            int r2 = r5._outputTail
            int r3 = r2 + 1
            r5._outputTail = r3
            int r4 = r0 >> 6
            r4 = r4 | 192(0xc0, float:2.69E-43)
            byte r4 = (byte) r4
            r1[r2] = r4
            int r2 = r2 + 2
            r5._outputTail = r2
            r0 = r0 & 63
            r0 = r0 | 128(0x80, float:1.794E-43)
            byte r0 = (byte) r0
            r1[r3] = r0
            goto L_0x0000
        L_0x0029:
            int r7 = r5._outputRawMultiByteChar(r0, r6, r7, r8)
            goto L_0x0000
        L_0x002e:
            byte[] r1 = r5._outputBuffer
            int r2 = r5._outputTail
            int r3 = r2 + 1
            r5._outputTail = r3
            byte r0 = (byte) r0
            r1[r2] = r0
            int r7 = r7 + 1
            if (r7 < r8) goto L_0x0002
        L_0x003d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.UTF8JsonGenerator._writeRawSegment(char[], int, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0039, code lost:
        r9 = _outputRawMultiByteChar(r9, r8, r2, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0013, code lost:
        if ((r7._outputTail + 3) < r7._outputEnd) goto L_0x0018;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0015, code lost:
        _flushBuffer();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0018, code lost:
        r2 = r9 + 1;
        r9 = r8[r9];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001e, code lost:
        if (r9 >= 2048) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0020, code lost:
        r4 = r7._outputTail;
        r5 = r4 + 1;
        r7._outputTail = r5;
        r1[r4] = (byte) ((r9 >> 6) | 192);
        r7._outputTail = r4 + 2;
        r1[r5] = (byte) ((r9 & '?') | 128);
        r9 = r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void _writeSegmentedRaw(char[] r8, int r9, int r10) {
        /*
            r7 = this;
            int r0 = r7._outputEnd
            byte[] r1 = r7._outputBuffer
            int r10 = r10 + r9
        L_0x0005:
            if (r9 >= r10) goto L_0x0052
        L_0x0007:
            char r2 = r8[r9]
            r3 = 128(0x80, float:1.794E-43)
            if (r2 < r3) goto L_0x003e
            int r2 = r7._outputTail
            int r2 = r2 + 3
            int r4 = r7._outputEnd
            if (r2 < r4) goto L_0x0018
            r7._flushBuffer()
        L_0x0018:
            int r2 = r9 + 1
            char r9 = r8[r9]
            r4 = 2048(0x800, float:2.87E-42)
            if (r9 >= r4) goto L_0x0039
            int r4 = r7._outputTail
            int r5 = r4 + 1
            r7._outputTail = r5
            int r6 = r9 >> 6
            r6 = r6 | 192(0xc0, float:2.69E-43)
            byte r6 = (byte) r6
            r1[r4] = r6
            int r4 = r4 + 2
            r7._outputTail = r4
            r9 = r9 & 63
            r9 = r9 | r3
            byte r9 = (byte) r9
            r1[r5] = r9
            r9 = r2
            goto L_0x0005
        L_0x0039:
            int r9 = r7._outputRawMultiByteChar(r9, r8, r2, r10)
            goto L_0x0005
        L_0x003e:
            int r3 = r7._outputTail
            if (r3 < r0) goto L_0x0045
            r7._flushBuffer()
        L_0x0045:
            int r3 = r7._outputTail
            int r4 = r3 + 1
            r7._outputTail = r4
            byte r2 = (byte) r2
            r1[r3] = r2
            int r9 = r9 + 1
            if (r9 < r10) goto L_0x0007
        L_0x0052:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.UTF8JsonGenerator._writeSegmentedRaw(char[], int, int):void");
    }

    private final void _writeStringSegment(char[] cArr, int i10, int i11) {
        int i12 = i11 + i10;
        int i13 = this._outputTail;
        byte[] bArr = this._outputBuffer;
        int[] iArr = this._outputEscapes;
        while (i10 < i12) {
            char c10 = cArr[i10];
            if (c10 > 127 || iArr[c10] != 0) {
                break;
            }
            bArr[i13] = (byte) c10;
            i10++;
            i13++;
        }
        this._outputTail = i13;
        if (i10 >= i12) {
            return;
        }
        if (this._characterEscapes != null) {
            _writeCustomStringSegment2(cArr, i10, i12);
        } else if (this._maximumNonEscapedChar == 0) {
            _writeStringSegment2(cArr, i10, i12);
        } else {
            _writeStringSegmentASCII2(cArr, i10, i12);
        }
    }

    private final void _writeStringSegment2(char[] cArr, int i10, int i11) {
        if (this._outputTail + ((i11 - i10) * 6) > this._outputEnd) {
            _flushBuffer();
        }
        int i12 = this._outputTail;
        byte[] bArr = this._outputBuffer;
        int[] iArr = this._outputEscapes;
        while (i10 < i11) {
            int i13 = i10 + 1;
            char c10 = cArr[i10];
            if (c10 <= 127) {
                int i14 = iArr[c10];
                if (i14 == 0) {
                    bArr[i12] = (byte) c10;
                    i10 = i13;
                    i12++;
                } else if (i14 > 0) {
                    int i15 = i12 + 1;
                    bArr[i12] = BYTE_BACKSLASH;
                    i12 += 2;
                    bArr[i15] = (byte) i14;
                } else {
                    i12 = _writeGenericEscape(c10, i12);
                }
            } else if (c10 <= 2047) {
                int i16 = i12 + 1;
                bArr[i12] = (byte) ((c10 >> 6) | 192);
                i12 += 2;
                bArr[i16] = (byte) ((c10 & '?') | 128);
            } else {
                i12 = _outputMultiByteChar(c10, i12);
            }
            i10 = i13;
        }
        this._outputTail = i12;
    }

    private final void _writeStringSegmentASCII2(char[] cArr, int i10, int i11) {
        if (this._outputTail + ((i11 - i10) * 6) > this._outputEnd) {
            _flushBuffer();
        }
        int i12 = this._outputTail;
        byte[] bArr = this._outputBuffer;
        int[] iArr = this._outputEscapes;
        int i13 = this._maximumNonEscapedChar;
        while (i10 < i11) {
            int i14 = i10 + 1;
            char c10 = cArr[i10];
            if (c10 <= 127) {
                int i15 = iArr[c10];
                if (i15 == 0) {
                    bArr[i12] = (byte) c10;
                    i10 = i14;
                    i12++;
                } else if (i15 > 0) {
                    int i16 = i12 + 1;
                    bArr[i12] = BYTE_BACKSLASH;
                    i12 += 2;
                    bArr[i16] = (byte) i15;
                } else {
                    i12 = _writeGenericEscape(c10, i12);
                }
            } else if (c10 > i13) {
                i12 = _writeGenericEscape(c10, i12);
            } else if (c10 <= 2047) {
                int i17 = i12 + 1;
                bArr[i12] = (byte) ((c10 >> 6) | 192);
                i12 += 2;
                bArr[i17] = (byte) ((c10 & '?') | 128);
            } else {
                i12 = _outputMultiByteChar(c10, i12);
            }
            i10 = i14;
        }
        this._outputTail = i12;
    }

    private final void _writeStringSegments(String str, boolean z10) {
        if (z10) {
            if (this._outputTail >= this._outputEnd) {
                _flushBuffer();
            }
            byte[] bArr = this._outputBuffer;
            int i10 = this._outputTail;
            this._outputTail = i10 + 1;
            bArr[i10] = this._quoteChar;
        }
        int length = str.length();
        int i11 = 0;
        while (length > 0) {
            int min = Math.min(this._outputMaxContiguous, length);
            if (this._outputTail + min > this._outputEnd) {
                _flushBuffer();
            }
            _writeStringSegment(str, i11, min);
            i11 += min;
            length -= min;
        }
        if (z10) {
            if (this._outputTail >= this._outputEnd) {
                _flushBuffer();
            }
            byte[] bArr2 = this._outputBuffer;
            int i12 = this._outputTail;
            this._outputTail = i12 + 1;
            bArr2[i12] = this._quoteChar;
        }
    }

    private final void _writeUTF8Segment(byte[] bArr, int i10, int i11) {
        int[] iArr = this._outputEscapes;
        int i12 = i10 + i11;
        int i13 = i10;
        while (i13 < i12) {
            int i14 = i13 + 1;
            byte b10 = bArr[i13];
            if (b10 < 0 || iArr[b10] == 0) {
                i13 = i14;
            } else {
                _writeUTF8Segment2(bArr, i10, i11);
                return;
            }
        }
        if (this._outputTail + i11 > this._outputEnd) {
            _flushBuffer();
        }
        System.arraycopy(bArr, i10, this._outputBuffer, this._outputTail, i11);
        this._outputTail += i11;
    }

    private final void _writeUTF8Segment2(byte[] bArr, int i10, int i11) {
        int i12;
        int i13;
        int i14 = this._outputTail;
        if ((i11 * 6) + i14 > this._outputEnd) {
            _flushBuffer();
            i14 = this._outputTail;
        }
        byte[] bArr2 = this._outputBuffer;
        int[] iArr = this._outputEscapes;
        int i15 = i11 + i10;
        while (i10 < i15) {
            int i16 = i10 + 1;
            byte b10 = bArr[i10];
            if (b10 < 0 || (i13 = iArr[b10]) == 0) {
                bArr2[i12] = b10;
                i10 = i16;
                i12++;
            } else {
                if (i13 > 0) {
                    int i17 = i12 + 1;
                    bArr2[i12] = BYTE_BACKSLASH;
                    i12 += 2;
                    bArr2[i17] = (byte) i13;
                } else {
                    i12 = _writeGenericEscape(b10, i12);
                }
                i10 = i16;
            }
        }
        this._outputTail = i12;
    }

    private final void _writeUTF8Segments(byte[] bArr, int i10, int i11) {
        do {
            int min = Math.min(this._outputMaxContiguous, i11);
            _writeUTF8Segment(bArr, i10, min);
            i10 += min;
            i11 -= min;
        } while (i11 > 0);
    }

    private final void _writeUnq(SerializableString serializableString) {
        int appendQuotedUTF8 = serializableString.appendQuotedUTF8(this._outputBuffer, this._outputTail);
        if (appendQuotedUTF8 < 0) {
            _writeBytes(serializableString.asQuotedUTF8());
        } else {
            this._outputTail += appendQuotedUTF8;
        }
    }

    /* access modifiers changed from: protected */
    public final void _flushBuffer() {
        int i10 = this._outputTail;
        if (i10 > 0) {
            this._outputTail = 0;
            this._outputStream.write(this._outputBuffer, 0, i10);
        }
    }

    /* access modifiers changed from: protected */
    public final void _outputSurrogates(int i10, int i11) {
        int _decodeSurrogate = _decodeSurrogate(i10, i11);
        if (this._outputTail + 4 > this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        int i12 = this._outputTail;
        int i13 = i12 + 1;
        this._outputTail = i13;
        bArr[i12] = (byte) ((_decodeSurrogate >> 18) | 240);
        int i14 = i12 + 2;
        this._outputTail = i14;
        bArr[i13] = (byte) (((_decodeSurrogate >> 12) & 63) | 128);
        int i15 = i12 + 3;
        this._outputTail = i15;
        bArr[i14] = (byte) (((_decodeSurrogate >> 6) & 63) | 128);
        this._outputTail = i12 + 4;
        bArr[i15] = (byte) ((_decodeSurrogate & 63) | 128);
    }

    /* access modifiers changed from: protected */
    public void _releaseBuffers() {
        byte[] bArr = this._outputBuffer;
        if (bArr != null && this._bufferRecyclable) {
            this._outputBuffer = null;
            this._ioContext.releaseWriteEncodingBuffer(bArr);
        }
        char[] cArr = this._charBuffer;
        if (cArr != null) {
            this._charBuffer = null;
            this._ioContext.releaseConcatBuffer(cArr);
        }
    }

    /* access modifiers changed from: protected */
    public final void _verifyValueWrite(String str) {
        byte b10;
        int writeValue = this._writeContext.writeValue();
        if (this._cfgPrettyPrinter != null) {
            _verifyPrettyValueWrite(str, writeValue);
            return;
        }
        if (writeValue == 1) {
            b10 = BYTE_COMMA;
        } else if (writeValue == 2) {
            b10 = BYTE_COLON;
        } else if (writeValue == 3) {
            SerializableString serializableString = this._rootValueSeparator;
            if (serializableString != null) {
                byte[] asUnquotedUTF8 = serializableString.asUnquotedUTF8();
                if (asUnquotedUTF8.length > 0) {
                    _writeBytes(asUnquotedUTF8);
                    return;
                }
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
        byte[] bArr = this._outputBuffer;
        int i10 = this._outputTail;
        this._outputTail = i10 + 1;
        bArr[i10] = b10;
    }

    /* access modifiers changed from: protected */
    public final void _writeBinary(Base64Variant base64Variant, byte[] bArr, int i10, int i11) {
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
                    byte[] bArr2 = this._outputBuffer;
                    int i16 = encodeBase64Chunk + 1;
                    this._outputTail = i16;
                    bArr2[encodeBase64Chunk] = BYTE_BACKSLASH;
                    this._outputTail = encodeBase64Chunk + 2;
                    bArr2[i16] = 110;
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
    public final void _writePPFieldName(String str) {
        int writeFieldName = this._writeContext.writeFieldName(str);
        if (writeFieldName == 4) {
            _reportError("Can not write a field name, expecting a value");
        }
        if (writeFieldName == 1) {
            this._cfgPrettyPrinter.writeObjectEntrySeparator(this);
        } else {
            this._cfgPrettyPrinter.beforeObjectEntries(this);
        }
        if (this._cfgUnqNames) {
            _writeStringSegments(str, false);
            return;
        }
        int length = str.length();
        if (length > this._charBufferLength) {
            _writeStringSegments(str, true);
            return;
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        int i10 = this._outputTail;
        this._outputTail = i10 + 1;
        bArr[i10] = this._quoteChar;
        str.getChars(0, length, this._charBuffer, 0);
        if (length <= this._outputMaxContiguous) {
            if (this._outputTail + length > this._outputEnd) {
                _flushBuffer();
            }
            _writeStringSegment(this._charBuffer, 0, length);
        } else {
            _writeStringSegments(this._charBuffer, 0, length);
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr2 = this._outputBuffer;
        int i11 = this._outputTail;
        this._outputTail = i11 + 1;
        bArr2[i11] = this._quoteChar;
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
        this._outputTail = 0;
        if (this._outputStream != null) {
            if (this._ioContext.isResourceManaged() || isEnabled(JsonGenerator.Feature.AUTO_CLOSE_TARGET)) {
                this._outputStream.close();
            } else if (isEnabled(JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM)) {
                this._outputStream.flush();
            }
        }
        _releaseBuffers();
    }

    public void flush() {
        _flushBuffer();
        if (this._outputStream != null && isEnabled(JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM)) {
            this._outputStream.flush();
        }
    }

    public int getOutputBuffered() {
        return this._outputTail;
    }

    public Object getOutputTarget() {
        return this._outputStream;
    }

    public void writeBinary(Base64Variant base64Variant, byte[] bArr, int i10, int i11) {
        _verifyValueWrite("write a binary value");
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr2 = this._outputBuffer;
        int i12 = this._outputTail;
        this._outputTail = i12 + 1;
        bArr2[i12] = this._quoteChar;
        _writeBinary(base64Variant, bArr, i10, i11 + i10);
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr3 = this._outputBuffer;
        int i13 = this._outputTail;
        this._outputTail = i13 + 1;
        bArr3[i13] = this._quoteChar;
    }

    public void writeBoolean(boolean z10) {
        byte[] bArr;
        _verifyValueWrite("write a boolean value");
        if (this._outputTail + 5 >= this._outputEnd) {
            _flushBuffer();
        }
        if (z10) {
            bArr = TRUE_BYTES;
        } else {
            bArr = FALSE_BYTES;
        }
        int length = bArr.length;
        System.arraycopy(bArr, 0, this._outputBuffer, this._outputTail, length);
        this._outputTail += length;
    }

    public final void writeEndArray() {
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
            byte[] bArr = this._outputBuffer;
            int i10 = this._outputTail;
            this._outputTail = i10 + 1;
            bArr[i10] = BYTE_RBRACKET;
        }
        this._writeContext = this._writeContext.clearAndGetParent();
    }

    public final void writeEndObject() {
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
            byte[] bArr = this._outputBuffer;
            int i10 = this._outputTail;
            this._outputTail = i10 + 1;
            bArr[i10] = BYTE_RCURLY;
        }
        this._writeContext = this._writeContext.clearAndGetParent();
    }

    public void writeFieldName(String str) {
        if (this._cfgPrettyPrinter != null) {
            _writePPFieldName(str);
            return;
        }
        int writeFieldName = this._writeContext.writeFieldName(str);
        if (writeFieldName == 4) {
            _reportError("Can not write a field name, expecting a value");
        }
        if (writeFieldName == 1) {
            if (this._outputTail >= this._outputEnd) {
                _flushBuffer();
            }
            byte[] bArr = this._outputBuffer;
            int i10 = this._outputTail;
            this._outputTail = i10 + 1;
            bArr[i10] = BYTE_COMMA;
        }
        if (this._cfgUnqNames) {
            _writeStringSegments(str, false);
            return;
        }
        int length = str.length();
        if (length > this._charBufferLength) {
            _writeStringSegments(str, true);
            return;
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr2 = this._outputBuffer;
        int i11 = this._outputTail;
        int i12 = i11 + 1;
        this._outputTail = i12;
        bArr2[i11] = this._quoteChar;
        if (length <= this._outputMaxContiguous) {
            if (i12 + length > this._outputEnd) {
                _flushBuffer();
            }
            _writeStringSegment(str, 0, length);
        } else {
            _writeStringSegments(str, 0, length);
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr3 = this._outputBuffer;
        int i13 = this._outputTail;
        this._outputTail = i13 + 1;
        bArr3[i13] = this._quoteChar;
    }

    public void writeNull() {
        _verifyValueWrite("write a null");
        _writeNull();
    }

    public void writeNumber(short s10) {
        _verifyValueWrite("write a number");
        if (this._outputTail + 6 >= this._outputEnd) {
            _flushBuffer();
        }
        if (this._cfgNumbersAsStrings) {
            _writeQuotedShort(s10);
        } else {
            this._outputTail = NumberOutput.outputInt((int) s10, this._outputBuffer, this._outputTail);
        }
    }

    public void writeRaw(String str) {
        int length = str.length();
        char[] cArr = this._charBuffer;
        if (length <= cArr.length) {
            str.getChars(0, length, cArr, 0);
            writeRaw(cArr, 0, length);
            return;
        }
        writeRaw(str, 0, length);
    }

    public void writeRawUTF8String(byte[] bArr, int i10, int i11) {
        _verifyValueWrite("write a string");
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr2 = this._outputBuffer;
        int i12 = this._outputTail;
        this._outputTail = i12 + 1;
        bArr2[i12] = this._quoteChar;
        _writeBytes(bArr, i10, i11);
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr3 = this._outputBuffer;
        int i13 = this._outputTail;
        this._outputTail = i13 + 1;
        bArr3[i13] = this._quoteChar;
    }

    public void writeRawValue(SerializableString serializableString) {
        _verifyValueWrite("write a raw (unencoded) value");
        byte[] asUnquotedUTF8 = serializableString.asUnquotedUTF8();
        if (asUnquotedUTF8.length > 0) {
            _writeBytes(asUnquotedUTF8);
        }
    }

    public final void writeStartArray() {
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
        byte[] bArr = this._outputBuffer;
        int i10 = this._outputTail;
        this._outputTail = i10 + 1;
        bArr[i10] = BYTE_LBRACKET;
    }

    public final void writeStartObject() {
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
        byte[] bArr = this._outputBuffer;
        int i10 = this._outputTail;
        this._outputTail = i10 + 1;
        bArr[i10] = BYTE_LCURLY;
    }

    public void writeString(String str) {
        _verifyValueWrite("write a string");
        if (str == null) {
            _writeNull();
            return;
        }
        int length = str.length();
        if (length > this._outputMaxContiguous) {
            _writeStringSegments(str, true);
            return;
        }
        if (this._outputTail + length >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        int i10 = this._outputTail;
        this._outputTail = i10 + 1;
        bArr[i10] = this._quoteChar;
        _writeStringSegment(str, 0, length);
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr2 = this._outputBuffer;
        int i11 = this._outputTail;
        this._outputTail = i11 + 1;
        bArr2[i11] = this._quoteChar;
    }

    public void writeUTF8String(byte[] bArr, int i10, int i11) {
        _verifyValueWrite("write a string");
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr2 = this._outputBuffer;
        int i12 = this._outputTail;
        this._outputTail = i12 + 1;
        bArr2[i12] = this._quoteChar;
        if (i11 <= this._outputMaxContiguous) {
            _writeUTF8Segment(bArr, i10, i11);
        } else {
            _writeUTF8Segments(bArr, i10, i11);
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr3 = this._outputBuffer;
        int i13 = this._outputTail;
        this._outputTail = i13 + 1;
        bArr3[i13] = this._quoteChar;
    }

    private final void _writeBytes(byte[] bArr, int i10, int i11) {
        if (this._outputTail + i11 > this._outputEnd) {
            _flushBuffer();
            if (i11 > MAX_BYTES_TO_BUFFER) {
                this._outputStream.write(bArr, i10, i11);
                return;
            }
        }
        System.arraycopy(bArr, i10, this._outputBuffer, this._outputTail, i11);
        this._outputTail += i11;
    }

    public void writeNumber(int i10) {
        _verifyValueWrite("write a number");
        if (this._outputTail + 11 >= this._outputEnd) {
            _flushBuffer();
        }
        if (this._cfgNumbersAsStrings) {
            _writeQuotedInt(i10);
        } else {
            this._outputTail = NumberOutput.outputInt(i10, this._outputBuffer, this._outputTail);
        }
    }

    public void writeRaw(String str, int i10, int i11) {
        char c10;
        char[] cArr = this._charBuffer;
        int length = cArr.length;
        if (i11 <= length) {
            str.getChars(i10, i10 + i11, cArr, 0);
            writeRaw(cArr, 0, i11);
            return;
        }
        int i12 = this._outputEnd;
        int min = Math.min(length, (i12 >> 2) + (i12 >> 4));
        int i13 = min * 3;
        while (i11 > 0) {
            int min2 = Math.min(min, i11);
            str.getChars(i10, i10 + min2, cArr, 0);
            if (this._outputTail + i13 > this._outputEnd) {
                _flushBuffer();
            }
            if (min2 > 1 && (c10 = cArr[min2 - 1]) >= 55296 && c10 <= 56319) {
                min2--;
            }
            _writeRawSegment(cArr, 0, min2);
            i10 += min2;
            i11 -= min2;
        }
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
        byte[] bArr = this._outputBuffer;
        int i10 = this._outputTail;
        this._outputTail = i10 + 1;
        bArr[i10] = BYTE_LCURLY;
    }

    /* JADX INFO: finally extract failed */
    public int writeBinary(Base64Variant base64Variant, InputStream inputStream, int i10) {
        _verifyValueWrite("write a binary value");
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        int i11 = this._outputTail;
        this._outputTail = i11 + 1;
        bArr[i11] = this._quoteChar;
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
        byte[] bArr2 = this._outputBuffer;
        int i12 = this._outputTail;
        this._outputTail = i12 + 1;
        bArr2[i12] = this._quoteChar;
        return i10;
    }

    public UTF8JsonGenerator(IOContext iOContext, int i10, ObjectCodec objectCodec, OutputStream outputStream, byte[] bArr, int i11, boolean z10) {
        super(iOContext, i10, objectCodec);
        this._outputStream = outputStream;
        this._bufferRecyclable = z10;
        this._outputTail = i11;
        this._outputBuffer = bArr;
        int length = bArr.length;
        this._outputEnd = length;
        this._outputMaxContiguous = length >> 3;
        char[] allocConcatBuffer = iOContext.allocConcatBuffer();
        this._charBuffer = allocConcatBuffer;
        this._charBufferLength = allocConcatBuffer.length;
    }

    private final void _writeStringSegments(char[] cArr, int i10, int i11) {
        do {
            int min = Math.min(this._outputMaxContiguous, i11);
            if (this._outputTail + min > this._outputEnd) {
                _flushBuffer();
            }
            _writeStringSegment(cArr, i10, min);
            i10 += min;
            i11 -= min;
        } while (i11 > 0);
    }

    private final void _writeStringSegment(String str, int i10, int i11) {
        int i12 = i11 + i10;
        int i13 = this._outputTail;
        byte[] bArr = this._outputBuffer;
        int[] iArr = this._outputEscapes;
        while (i10 < i12) {
            char charAt = str.charAt(i10);
            if (charAt > 127 || iArr[charAt] != 0) {
                break;
            }
            bArr[i13] = (byte) charAt;
            i10++;
            i13++;
        }
        this._outputTail = i13;
        if (i10 >= i12) {
            return;
        }
        if (this._characterEscapes != null) {
            _writeCustomStringSegment2(str, i10, i12);
        } else if (this._maximumNonEscapedChar == 0) {
            _writeStringSegment2(str, i10, i12);
        } else {
            _writeStringSegmentASCII2(str, i10, i12);
        }
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

    public void writeString(char[] cArr, int i10, int i11) {
        _verifyValueWrite("write a string");
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        int i12 = this._outputTail;
        int i13 = i12 + 1;
        this._outputTail = i13;
        bArr[i12] = this._quoteChar;
        if (i11 <= this._outputMaxContiguous) {
            if (i13 + i11 > this._outputEnd) {
                _flushBuffer();
            }
            _writeStringSegment(cArr, i10, i11);
        } else {
            _writeStringSegments(cArr, i10, i11);
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr2 = this._outputBuffer;
        int i14 = this._outputTail;
        this._outputTail = i14 + 1;
        bArr2[i14] = this._quoteChar;
    }

    private final void _writeStringSegment2(String str, int i10, int i11) {
        if (this._outputTail + ((i11 - i10) * 6) > this._outputEnd) {
            _flushBuffer();
        }
        int i12 = this._outputTail;
        byte[] bArr = this._outputBuffer;
        int[] iArr = this._outputEscapes;
        while (i10 < i11) {
            int i13 = i10 + 1;
            char charAt = str.charAt(i10);
            if (charAt <= 127) {
                int i14 = iArr[charAt];
                if (i14 == 0) {
                    bArr[i12] = (byte) charAt;
                    i10 = i13;
                    i12++;
                } else if (i14 > 0) {
                    int i15 = i12 + 1;
                    bArr[i12] = BYTE_BACKSLASH;
                    i12 += 2;
                    bArr[i15] = (byte) i14;
                } else {
                    i12 = _writeGenericEscape(charAt, i12);
                }
            } else if (charAt <= 2047) {
                int i16 = i12 + 1;
                bArr[i12] = (byte) ((charAt >> 6) | 192);
                i12 += 2;
                bArr[i16] = (byte) ((charAt & '?') | 128);
            } else {
                i12 = _outputMultiByteChar(charAt, i12);
            }
            i10 = i13;
        }
        this._outputTail = i12;
    }

    private final void _writeStringSegments(String str, int i10, int i11) {
        do {
            int min = Math.min(this._outputMaxContiguous, i11);
            if (this._outputTail + min > this._outputEnd) {
                _flushBuffer();
            }
            _writeStringSegment(str, i10, min);
            i10 += min;
            i11 -= min;
        } while (i11 > 0);
    }

    /* access modifiers changed from: protected */
    public final int _writeBinary(Base64Variant base64Variant, InputStream inputStream, byte[] bArr, int i10) {
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
                byte[] bArr2 = this._outputBuffer;
                int i18 = encodeBase64Chunk + 1;
                this._outputTail = i18;
                bArr2[encodeBase64Chunk] = BYTE_BACKSLASH;
                this._outputTail = encodeBase64Chunk + 2;
                bArr2[i18] = 110;
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

    private final void _writeStringSegmentASCII2(String str, int i10, int i11) {
        if (this._outputTail + ((i11 - i10) * 6) > this._outputEnd) {
            _flushBuffer();
        }
        int i12 = this._outputTail;
        byte[] bArr = this._outputBuffer;
        int[] iArr = this._outputEscapes;
        int i13 = this._maximumNonEscapedChar;
        while (i10 < i11) {
            int i14 = i10 + 1;
            char charAt = str.charAt(i10);
            if (charAt <= 127) {
                int i15 = iArr[charAt];
                if (i15 == 0) {
                    bArr[i12] = (byte) charAt;
                    i10 = i14;
                    i12++;
                } else if (i15 > 0) {
                    int i16 = i12 + 1;
                    bArr[i12] = BYTE_BACKSLASH;
                    i12 += 2;
                    bArr[i16] = (byte) i15;
                } else {
                    i12 = _writeGenericEscape(charAt, i12);
                }
            } else if (charAt > i13) {
                i12 = _writeGenericEscape(charAt, i12);
            } else if (charAt <= 2047) {
                int i17 = i12 + 1;
                bArr[i12] = (byte) ((charAt >> 6) | 192);
                i12 += 2;
                bArr[i17] = (byte) ((charAt & '?') | 128);
            } else {
                i12 = _outputMultiByteChar(charAt, i12);
            }
            i10 = i14;
        }
        this._outputTail = i12;
    }

    public void writeRaw(SerializableString serializableString) {
        byte[] asUnquotedUTF8 = serializableString.asUnquotedUTF8();
        if (asUnquotedUTF8.length > 0) {
            _writeBytes(asUnquotedUTF8);
        }
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

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001c, code lost:
        r7 = r7 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0020, code lost:
        if (r0 >= 2048) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0022, code lost:
        r1 = r5._outputBuffer;
        r2 = r5._outputTail;
        r3 = r2 + 1;
        r5._outputTail = r3;
        r1[r2] = (byte) ((r0 >> 6) | 192);
        r5._outputTail = r2 + 2;
        r1[r3] = (byte) ((r0 & '?') | 128);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003d, code lost:
        r7 = _outputRawMultiByteChar(r0, r6, r7, r8);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void writeRaw(char[] r6, int r7, int r8) {
        /*
            r5 = this;
            int r0 = r8 + r8
            int r0 = r0 + r8
            int r1 = r5._outputTail
            int r1 = r1 + r0
            int r2 = r5._outputEnd
            if (r1 <= r2) goto L_0x0013
            if (r2 >= r0) goto L_0x0010
            r5._writeSegmentedRaw(r6, r7, r8)
            return
        L_0x0010:
            r5._flushBuffer()
        L_0x0013:
            int r8 = r8 + r7
        L_0x0014:
            if (r7 >= r8) goto L_0x0051
        L_0x0016:
            char r0 = r6[r7]
            r1 = 127(0x7f, float:1.78E-43)
            if (r0 <= r1) goto L_0x0042
            int r7 = r7 + 1
            r1 = 2048(0x800, float:2.87E-42)
            if (r0 >= r1) goto L_0x003d
            byte[] r1 = r5._outputBuffer
            int r2 = r5._outputTail
            int r3 = r2 + 1
            r5._outputTail = r3
            int r4 = r0 >> 6
            r4 = r4 | 192(0xc0, float:2.69E-43)
            byte r4 = (byte) r4
            r1[r2] = r4
            int r2 = r2 + 2
            r5._outputTail = r2
            r0 = r0 & 63
            r0 = r0 | 128(0x80, float:1.794E-43)
            byte r0 = (byte) r0
            r1[r3] = r0
            goto L_0x0014
        L_0x003d:
            int r7 = r5._outputRawMultiByteChar(r0, r6, r7, r8)
            goto L_0x0014
        L_0x0042:
            byte[] r1 = r5._outputBuffer
            int r2 = r5._outputTail
            int r3 = r2 + 1
            r5._outputTail = r3
            byte r0 = (byte) r0
            r1[r2] = r0
            int r7 = r7 + 1
            if (r7 < r8) goto L_0x0016
        L_0x0051:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.UTF8JsonGenerator.writeRaw(char[], int, int):void");
    }

    /* access modifiers changed from: protected */
    public final void _writePPFieldName(SerializableString serializableString) {
        int writeFieldName = this._writeContext.writeFieldName(serializableString.getValue());
        if (writeFieldName == 4) {
            _reportError("Can not write a field name, expecting a value");
        }
        if (writeFieldName == 1) {
            this._cfgPrettyPrinter.writeObjectEntrySeparator(this);
        } else {
            this._cfgPrettyPrinter.beforeObjectEntries(this);
        }
        boolean z10 = this._cfgUnqNames;
        if (!z10) {
            if (this._outputTail >= this._outputEnd) {
                _flushBuffer();
            }
            byte[] bArr = this._outputBuffer;
            int i10 = this._outputTail;
            this._outputTail = i10 + 1;
            bArr[i10] = this._quoteChar;
        }
        _writeBytes(serializableString.asQuotedUTF8());
        if (!z10) {
            if (this._outputTail >= this._outputEnd) {
                _flushBuffer();
            }
            byte[] bArr2 = this._outputBuffer;
            int i11 = this._outputTail;
            this._outputTail = i11 + 1;
            bArr2[i11] = this._quoteChar;
        }
    }

    private final void _writeCustomStringSegment2(String str, int i10, int i11) {
        if (this._outputTail + ((i11 - i10) * 6) > this._outputEnd) {
            _flushBuffer();
        }
        int i12 = this._outputTail;
        byte[] bArr = this._outputBuffer;
        int[] iArr = this._outputEscapes;
        int i13 = this._maximumNonEscapedChar;
        if (i13 <= 0) {
            i13 = 65535;
        }
        CharacterEscapes characterEscapes = this._characterEscapes;
        while (i10 < i11) {
            int i14 = i10 + 1;
            char charAt = str.charAt(i10);
            if (charAt <= 127) {
                int i15 = iArr[charAt];
                if (i15 == 0) {
                    bArr[i12] = (byte) charAt;
                    i10 = i14;
                    i12++;
                } else if (i15 > 0) {
                    int i16 = i12 + 1;
                    bArr[i12] = BYTE_BACKSLASH;
                    i12 += 2;
                    bArr[i16] = (byte) i15;
                } else if (i15 == -2) {
                    SerializableString escapeSequence = characterEscapes.getEscapeSequence(charAt);
                    if (escapeSequence == null) {
                        _reportError("Invalid custom escape definitions; custom escape not found for character code 0x" + Integer.toHexString(charAt) + ", although was supposed to have one");
                    }
                    i12 = _writeCustomEscape(bArr, i12, escapeSequence, i11 - i14);
                } else {
                    i12 = _writeGenericEscape(charAt, i12);
                }
            } else if (charAt > i13) {
                i12 = _writeGenericEscape(charAt, i12);
            } else {
                SerializableString escapeSequence2 = characterEscapes.getEscapeSequence(charAt);
                if (escapeSequence2 != null) {
                    i12 = _writeCustomEscape(bArr, i12, escapeSequence2, i11 - i14);
                } else if (charAt <= 2047) {
                    int i17 = i12 + 1;
                    bArr[i12] = (byte) ((charAt >> 6) | 192);
                    i12 += 2;
                    bArr[i17] = (byte) ((charAt & '?') | 128);
                } else {
                    i12 = _outputMultiByteChar(charAt, i12);
                }
            }
            i10 = i14;
        }
        this._outputTail = i12;
    }

    public void writeFieldName(SerializableString serializableString) {
        if (this._cfgPrettyPrinter != null) {
            _writePPFieldName(serializableString);
            return;
        }
        int writeFieldName = this._writeContext.writeFieldName(serializableString.getValue());
        if (writeFieldName == 4) {
            _reportError("Can not write a field name, expecting a value");
        }
        if (writeFieldName == 1) {
            if (this._outputTail >= this._outputEnd) {
                _flushBuffer();
            }
            byte[] bArr = this._outputBuffer;
            int i10 = this._outputTail;
            this._outputTail = i10 + 1;
            bArr[i10] = BYTE_COMMA;
        }
        if (this._cfgUnqNames) {
            _writeUnq(serializableString);
            return;
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr2 = this._outputBuffer;
        int i11 = this._outputTail;
        int i12 = i11 + 1;
        this._outputTail = i12;
        bArr2[i11] = this._quoteChar;
        int appendQuotedUTF8 = serializableString.appendQuotedUTF8(bArr2, i12);
        if (appendQuotedUTF8 < 0) {
            _writeBytes(serializableString.asQuotedUTF8());
        } else {
            this._outputTail += appendQuotedUTF8;
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr3 = this._outputBuffer;
        int i13 = this._outputTail;
        this._outputTail = i13 + 1;
        bArr3[i13] = this._quoteChar;
    }

    public void writeNumber(double d10) {
        if (this._cfgNumbersAsStrings || ((Double.isNaN(d10) || Double.isInfinite(d10)) && JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS.enabledIn(this._features))) {
            writeString(String.valueOf(d10));
            return;
        }
        _verifyValueWrite("write a number");
        writeRaw(String.valueOf(d10));
    }

    public final void writeString(SerializableString serializableString) {
        _verifyValueWrite("write a string");
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        int i10 = this._outputTail;
        int i11 = i10 + 1;
        this._outputTail = i11;
        bArr[i10] = this._quoteChar;
        int appendQuotedUTF8 = serializableString.appendQuotedUTF8(bArr, i11);
        if (appendQuotedUTF8 < 0) {
            _writeBytes(serializableString.asQuotedUTF8());
        } else {
            this._outputTail += appendQuotedUTF8;
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr2 = this._outputBuffer;
        int i12 = this._outputTail;
        this._outputTail = i12 + 1;
        bArr2[i12] = this._quoteChar;
    }

    public void writeNumber(float f10) {
        if (this._cfgNumbersAsStrings || ((Float.isNaN(f10) || Float.isInfinite(f10)) && JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS.enabledIn(this._features))) {
            writeString(String.valueOf(f10));
            return;
        }
        _verifyValueWrite("write a number");
        writeRaw(String.valueOf(f10));
    }

    public void writeRaw(char c10) {
        if (this._outputTail + 3 >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        if (c10 <= 127) {
            int i10 = this._outputTail;
            this._outputTail = i10 + 1;
            bArr[i10] = (byte) c10;
        } else if (c10 < 2048) {
            int i11 = this._outputTail;
            int i12 = i11 + 1;
            this._outputTail = i12;
            bArr[i11] = (byte) ((c10 >> 6) | 192);
            this._outputTail = i11 + 2;
            bArr[i12] = (byte) ((c10 & '?') | 128);
        } else {
            _outputRawMultiByteChar(c10, (char[]) null, 0, 0);
        }
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
    public final int _writeBinary(Base64Variant base64Variant, InputStream inputStream, byte[] bArr) {
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
                byte[] bArr3 = this._outputBuffer;
                int i17 = encodeBase64Chunk + 1;
                this._outputTail = i17;
                bArr3[encodeBase64Chunk] = BYTE_BACKSLASH;
                this._outputTail = encodeBase64Chunk + 2;
                bArr3[i17] = 110;
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
}
