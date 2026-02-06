package com.fasterxml.jackson.core.io;

import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;

public final class UTF8Writer extends Writer {
    static final int SURR1_FIRST = 55296;
    static final int SURR1_LAST = 56319;
    static final int SURR2_FIRST = 56320;
    static final int SURR2_LAST = 57343;
    private final IOContext _context;
    private OutputStream _out;
    private byte[] _outBuffer;
    private final int _outBufferEnd;
    private int _outPtr = 0;
    private int _surrogate;

    public UTF8Writer(IOContext iOContext, OutputStream outputStream) {
        this._context = iOContext;
        this._out = outputStream;
        byte[] allocWriteEncodingBuffer = iOContext.allocWriteEncodingBuffer();
        this._outBuffer = allocWriteEncodingBuffer;
        this._outBufferEnd = allocWriteEncodingBuffer.length - 4;
    }

    protected static void illegalSurrogate(int i10) {
        throw new IOException(illegalSurrogateDesc(i10));
    }

    protected static String illegalSurrogateDesc(int i10) {
        if (i10 > 1114111) {
            return "Illegal character point (0x" + Integer.toHexString(i10) + ") to output; max is 0x10FFFF as per RFC 4627";
        } else if (i10 < 55296) {
            return "Illegal character point (0x" + Integer.toHexString(i10) + ") to output";
        } else if (i10 <= 56319) {
            return "Unmatched first part of surrogate pair (0x" + Integer.toHexString(i10) + ")";
        } else {
            return "Unmatched second part of surrogate pair (0x" + Integer.toHexString(i10) + ")";
        }
    }

    public void close() {
        OutputStream outputStream = this._out;
        if (outputStream != null) {
            int i10 = this._outPtr;
            if (i10 > 0) {
                outputStream.write(this._outBuffer, 0, i10);
                this._outPtr = 0;
            }
            OutputStream outputStream2 = this._out;
            this._out = null;
            byte[] bArr = this._outBuffer;
            if (bArr != null) {
                this._outBuffer = null;
                this._context.releaseWriteEncodingBuffer(bArr);
            }
            outputStream2.close();
            int i11 = this._surrogate;
            this._surrogate = 0;
            if (i11 > 0) {
                illegalSurrogate(i11);
            }
        }
    }

    /* access modifiers changed from: protected */
    public int convertSurrogate(int i10) {
        int i11 = this._surrogate;
        this._surrogate = 0;
        if (i10 >= 56320 && i10 <= 57343) {
            return ((i11 - 55296) << 10) + 65536 + (i10 - 56320);
        }
        throw new IOException("Broken surrogate pair: first char 0x" + Integer.toHexString(i11) + ", second 0x" + Integer.toHexString(i10) + "; illegal combination");
    }

    public void flush() {
        OutputStream outputStream = this._out;
        if (outputStream != null) {
            int i10 = this._outPtr;
            if (i10 > 0) {
                outputStream.write(this._outBuffer, 0, i10);
                this._outPtr = 0;
            }
            this._out.flush();
        }
    }

    public void write(char[] cArr) {
        write(cArr, 0, cArr.length);
    }

    public Writer append(char c10) {
        write((int) c10);
        return this;
    }

    public void write(char[] cArr, int i10, int i11) {
        if (i11 >= 2) {
            if (this._surrogate > 0) {
                i11--;
                write(convertSurrogate(cArr[i10]));
                i10++;
            }
            int i12 = this._outPtr;
            byte[] bArr = this._outBuffer;
            int i13 = this._outBufferEnd;
            int i14 = i11 + r10;
            while (r10 < i14) {
                if (i12 >= i13) {
                    this._out.write(bArr, 0, i12);
                    i12 = 0;
                }
                int i15 = r10 + 1;
                char c10 = cArr[r10];
                if (c10 < 128) {
                    int i16 = i12 + 1;
                    bArr[i12] = (byte) c10;
                    int i17 = i14 - i15;
                    int i18 = i13 - i16;
                    if (i17 > i18) {
                        i17 = i18;
                    }
                    int i19 = i17 + i15;
                    while (true) {
                        r10 = i15;
                        i12 = i16;
                        if (r10 >= i19) {
                            continue;
                            break;
                        }
                        i15 = r10 + 1;
                        c10 = cArr[r10];
                        if (c10 >= 128) {
                            break;
                        }
                        i16 = i12 + 1;
                        bArr[i12] = (byte) c10;
                    }
                }
                if (c10 < 2048) {
                    int i20 = i12 + 1;
                    bArr[i12] = (byte) ((c10 >> 6) | 192);
                    i12 += 2;
                    bArr[i20] = (byte) ((c10 & '?') | 128);
                } else if (c10 < 55296 || c10 > 57343) {
                    bArr[i12] = (byte) ((c10 >> 12) | 224);
                    int i21 = i12 + 2;
                    bArr[i12 + 1] = (byte) (((c10 >> 6) & 63) | 128);
                    i12 += 3;
                    bArr[i21] = (byte) ((c10 & '?') | 128);
                } else {
                    if (c10 > 56319) {
                        this._outPtr = i12;
                        illegalSurrogate(c10);
                    }
                    this._surrogate = c10;
                    if (i15 >= i14) {
                        break;
                    }
                    r10 = i15 + 1;
                    int convertSurrogate = convertSurrogate(cArr[i15]);
                    if (convertSurrogate > 1114111) {
                        this._outPtr = i12;
                        illegalSurrogate(convertSurrogate);
                    }
                    bArr[i12] = (byte) ((convertSurrogate >> 18) | 240);
                    bArr[i12 + 1] = (byte) (((convertSurrogate >> 12) & 63) | 128);
                    int i22 = i12 + 3;
                    bArr[i12 + 2] = (byte) (((convertSurrogate >> 6) & 63) | 128);
                    i12 += 4;
                    bArr[i22] = (byte) ((convertSurrogate & 63) | 128);
                }
                r10 = i15;
            }
            this._outPtr = i12;
        } else if (i11 == 1) {
            write((int) cArr[i10]);
        }
    }

    public void write(int i10) {
        int i11;
        if (this._surrogate > 0) {
            i10 = convertSurrogate(i10);
        } else if (i10 >= 55296 && i10 <= 57343) {
            if (i10 > 56319) {
                illegalSurrogate(i10);
            }
            this._surrogate = i10;
            return;
        }
        int i12 = this._outPtr;
        if (i12 >= this._outBufferEnd) {
            this._out.write(this._outBuffer, 0, i12);
            this._outPtr = 0;
        }
        if (i10 < 128) {
            byte[] bArr = this._outBuffer;
            int i13 = this._outPtr;
            this._outPtr = i13 + 1;
            bArr[i13] = (byte) i10;
            return;
        }
        int i14 = this._outPtr;
        if (i10 < 2048) {
            byte[] bArr2 = this._outBuffer;
            int i15 = i14 + 1;
            bArr2[i14] = (byte) ((i10 >> 6) | 192);
            i11 = i14 + 2;
            bArr2[i15] = (byte) ((i10 & 63) | 128);
        } else if (i10 <= 65535) {
            byte[] bArr3 = this._outBuffer;
            bArr3[i14] = (byte) ((i10 >> 12) | 224);
            int i16 = i14 + 2;
            bArr3[i14 + 1] = (byte) (((i10 >> 6) & 63) | 128);
            i11 = i14 + 3;
            bArr3[i16] = (byte) ((i10 & 63) | 128);
        } else {
            if (i10 > 1114111) {
                illegalSurrogate(i10);
            }
            byte[] bArr4 = this._outBuffer;
            bArr4[i14] = (byte) ((i10 >> 18) | 240);
            bArr4[i14 + 1] = (byte) (((i10 >> 12) & 63) | 128);
            int i17 = i14 + 3;
            bArr4[i14 + 2] = (byte) (((i10 >> 6) & 63) | 128);
            i11 = i14 + 4;
            bArr4[i17] = (byte) ((i10 & 63) | 128);
        }
        this._outPtr = i11;
    }

    public void write(String str) {
        write(str, 0, str.length());
    }

    public void write(String str, int i10, int i11) {
        if (i11 >= 2) {
            if (this._surrogate > 0) {
                i11--;
                write(convertSurrogate(str.charAt(i10)));
                i10++;
            }
            int i12 = this._outPtr;
            byte[] bArr = this._outBuffer;
            int i13 = this._outBufferEnd;
            int i14 = i11 + r10;
            while (r10 < i14) {
                if (i12 >= i13) {
                    this._out.write(bArr, 0, i12);
                    i12 = 0;
                }
                int i15 = r10 + 1;
                char charAt = str.charAt(r10);
                if (charAt < 128) {
                    int i16 = i12 + 1;
                    bArr[i12] = (byte) charAt;
                    int i17 = i14 - i15;
                    int i18 = i13 - i16;
                    if (i17 > i18) {
                        i17 = i18;
                    }
                    int i19 = i17 + i15;
                    while (true) {
                        r10 = i15;
                        i12 = i16;
                        if (r10 >= i19) {
                            continue;
                            break;
                        }
                        i15 = r10 + 1;
                        charAt = str.charAt(r10);
                        if (charAt >= 128) {
                            break;
                        }
                        i16 = i12 + 1;
                        bArr[i12] = (byte) charAt;
                    }
                }
                if (charAt < 2048) {
                    int i20 = i12 + 1;
                    bArr[i12] = (byte) ((charAt >> 6) | 192);
                    i12 += 2;
                    bArr[i20] = (byte) ((charAt & '?') | 128);
                } else if (charAt < 55296 || charAt > 57343) {
                    bArr[i12] = (byte) ((charAt >> 12) | 224);
                    int i21 = i12 + 2;
                    bArr[i12 + 1] = (byte) (((charAt >> 6) & 63) | 128);
                    i12 += 3;
                    bArr[i21] = (byte) ((charAt & '?') | 128);
                } else {
                    if (charAt > 56319) {
                        this._outPtr = i12;
                        illegalSurrogate(charAt);
                    }
                    this._surrogate = charAt;
                    if (i15 >= i14) {
                        break;
                    }
                    r10 = i15 + 1;
                    int convertSurrogate = convertSurrogate(str.charAt(i15));
                    if (convertSurrogate > 1114111) {
                        this._outPtr = i12;
                        illegalSurrogate(convertSurrogate);
                    }
                    bArr[i12] = (byte) ((convertSurrogate >> 18) | 240);
                    bArr[i12 + 1] = (byte) (((convertSurrogate >> 12) & 63) | 128);
                    int i22 = i12 + 3;
                    bArr[i12 + 2] = (byte) (((convertSurrogate >> 6) & 63) | 128);
                    i12 += 4;
                    bArr[i22] = (byte) ((convertSurrogate & 63) | 128);
                }
                r10 = i15;
            }
            this._outPtr = i12;
        } else if (i11 == 1) {
            write((int) str.charAt(i10));
        }
    }
}
