package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import java.io.Serializable;
import java.util.Arrays;

public final class Base64Variant implements Serializable {
    public static final int BASE64_VALUE_INVALID = -1;
    public static final int BASE64_VALUE_PADDING = -2;
    private static final int INT_SPACE = 32;
    static final char PADDING_CHAR_NONE = '\u0000';
    private static final long serialVersionUID = 1;
    private final transient int[] _asciiToBase64;
    private final transient byte[] _base64ToAsciiB;
    private final transient char[] _base64ToAsciiC;
    private final transient int _maxLineLength;
    final String _name;
    private final transient char _paddingChar;
    private final transient boolean _usesPadding;

    public Base64Variant(String str, String str2, boolean z10, char c10, int i10) {
        int[] iArr = new int[128];
        this._asciiToBase64 = iArr;
        char[] cArr = new char[64];
        this._base64ToAsciiC = cArr;
        this._base64ToAsciiB = new byte[64];
        this._name = str;
        this._usesPadding = z10;
        this._paddingChar = c10;
        this._maxLineLength = i10;
        int length = str2.length();
        if (length == 64) {
            str2.getChars(0, length, cArr, 0);
            Arrays.fill(iArr, -1);
            for (int i11 = 0; i11 < length; i11++) {
                char c11 = this._base64ToAsciiC[i11];
                this._base64ToAsciiB[i11] = (byte) c11;
                this._asciiToBase64[c11] = i11;
            }
            if (z10) {
                this._asciiToBase64[c10] = -2;
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Base64Alphabet length must be exactly 64 (was " + length + ")");
    }

    /* access modifiers changed from: protected */
    public void _reportBase64EOF() {
        throw new IllegalArgumentException("Unexpected end-of-String in base64 content");
    }

    /* access modifiers changed from: protected */
    public void _reportInvalidBase64(char c10, int i10, String str) {
        String str2;
        if (c10 <= ' ') {
            str2 = "Illegal white space character (code 0x" + Integer.toHexString(c10) + ") as character #" + (i10 + 1) + " of 4-char base64 unit: can only used between units";
        } else if (usesPaddingChar(c10)) {
            str2 = "Unexpected padding character ('" + getPaddingChar() + "') as character #" + (i10 + 1) + " of 4-char base64 unit: padding only legal as 3rd or 4th character";
        } else if (!Character.isDefined(c10) || Character.isISOControl(c10)) {
            str2 = "Illegal character (code 0x" + Integer.toHexString(c10) + ") in base64 content";
        } else {
            str2 = "Illegal character '" + c10 + "' (code 0x" + Integer.toHexString(c10) + ") in base64 content";
        }
        if (str != null) {
            str2 = str2 + ": " + str;
        }
        throw new IllegalArgumentException(str2);
    }

    public byte[] decode(String str) {
        ByteArrayBuilder byteArrayBuilder = new ByteArrayBuilder();
        decode(str, byteArrayBuilder);
        return byteArrayBuilder.toByteArray();
    }

    public int decodeBase64Byte(byte b10) {
        if (b10 < 0) {
            return -1;
        }
        return this._asciiToBase64[b10];
    }

    public int decodeBase64Char(char c10) {
        if (c10 <= 127) {
            return this._asciiToBase64[c10];
        }
        return -1;
    }

    public String encode(byte[] bArr) {
        return encode(bArr, false);
    }

    public byte encodeBase64BitsAsByte(int i10) {
        return this._base64ToAsciiB[i10];
    }

    public char encodeBase64BitsAsChar(int i10) {
        return this._base64ToAsciiC[i10];
    }

    public int encodeBase64Chunk(int i10, char[] cArr, int i11) {
        char[] cArr2 = this._base64ToAsciiC;
        cArr[i11] = cArr2[(i10 >> 18) & 63];
        cArr[i11 + 1] = cArr2[(i10 >> 12) & 63];
        int i12 = i11 + 3;
        cArr[i11 + 2] = cArr2[(i10 >> 6) & 63];
        int i13 = i11 + 4;
        cArr[i12] = cArr2[i10 & 63];
        return i13;
    }

    public int encodeBase64Partial(int i10, int i11, char[] cArr, int i12) {
        char[] cArr2 = this._base64ToAsciiC;
        cArr[i12] = cArr2[(i10 >> 18) & 63];
        int i13 = i12 + 2;
        cArr[i12 + 1] = cArr2[(i10 >> 12) & 63];
        if (this._usesPadding) {
            int i14 = i12 + 3;
            cArr[i13] = i11 == 2 ? cArr2[(i10 >> 6) & 63] : this._paddingChar;
            int i15 = i12 + 4;
            cArr[i14] = this._paddingChar;
            return i15;
        } else if (i11 != 2) {
            return i13;
        } else {
            cArr[i13] = cArr2[(i10 >> 6) & 63];
            return i12 + 3;
        }
    }

    public boolean equals(Object obj) {
        return obj == this;
    }

    public int getMaxLineLength() {
        return this._maxLineLength;
    }

    public String getName() {
        return this._name;
    }

    public byte getPaddingByte() {
        return (byte) this._paddingChar;
    }

    public char getPaddingChar() {
        return this._paddingChar;
    }

    public int hashCode() {
        return this._name.hashCode();
    }

    /* access modifiers changed from: protected */
    public Object readResolve() {
        return Base64Variants.valueOf(this._name);
    }

    public String toString() {
        return this._name;
    }

    public boolean usesPadding() {
        return this._usesPadding;
    }

    public boolean usesPaddingChar(char c10) {
        return c10 == this._paddingChar;
    }

    public int decodeBase64Char(int i10) {
        if (i10 <= 127) {
            return this._asciiToBase64[i10];
        }
        return -1;
    }

    public String encode(byte[] bArr, boolean z10) {
        int length = bArr.length;
        StringBuilder sb2 = new StringBuilder((length >> 2) + length + (length >> 3));
        if (z10) {
            sb2.append('\"');
        }
        int maxLineLength = getMaxLineLength() >> 2;
        int i10 = length - 3;
        int i11 = 0;
        while (i11 <= i10) {
            int i12 = i11 + 2;
            byte b10 = bArr[i11 + 1] & 255;
            i11 += 3;
            encodeBase64Chunk(sb2, ((b10 | (bArr[i11] << 8)) << 8) | (bArr[i12] & 255));
            maxLineLength--;
            if (maxLineLength <= 0) {
                sb2.append('\\');
                sb2.append('n');
                maxLineLength = getMaxLineLength() >> 2;
            }
        }
        int i13 = length - i11;
        if (i13 > 0) {
            int i14 = i11 + 1;
            int i15 = bArr[i11] << 16;
            if (i13 == 2) {
                i15 |= (bArr[i14] & 255) << 8;
            }
            encodeBase64Partial(sb2, i15, i13);
        }
        if (z10) {
            sb2.append('\"');
        }
        return sb2.toString();
    }

    public boolean usesPaddingChar(int i10) {
        return i10 == this._paddingChar;
    }

    public void decode(String str, ByteArrayBuilder byteArrayBuilder) {
        int i10;
        char charAt;
        int length = str.length();
        int i11 = 0;
        while (i11 < length) {
            while (true) {
                i10 = i11 + 1;
                charAt = str.charAt(i11);
                if (i10 >= length || charAt > ' ') {
                    int decodeBase64Char = decodeBase64Char(charAt);
                } else {
                    i11 = i10;
                }
            }
            int decodeBase64Char2 = decodeBase64Char(charAt);
            if (decodeBase64Char2 < 0) {
                _reportInvalidBase64(charAt, 0, (String) null);
            }
            if (i10 >= length) {
                _reportBase64EOF();
            }
            int i12 = i11 + 2;
            char charAt2 = str.charAt(i10);
            int decodeBase64Char3 = decodeBase64Char(charAt2);
            if (decodeBase64Char3 < 0) {
                _reportInvalidBase64(charAt2, 1, (String) null);
            }
            int i13 = (decodeBase64Char2 << 6) | decodeBase64Char3;
            if (i12 >= length) {
                if (!usesPadding()) {
                    byteArrayBuilder.append(i13 >> 4);
                    return;
                }
                _reportBase64EOF();
            }
            int i14 = i11 + 3;
            char charAt3 = str.charAt(i12);
            int decodeBase64Char4 = decodeBase64Char(charAt3);
            if (decodeBase64Char4 < 0) {
                if (decodeBase64Char4 != -2) {
                    _reportInvalidBase64(charAt3, 2, (String) null);
                }
                if (i14 >= length) {
                    _reportBase64EOF();
                }
                i11 += 4;
                char charAt4 = str.charAt(i14);
                if (!usesPaddingChar(charAt4)) {
                    _reportInvalidBase64(charAt4, 3, "expected padding character '" + getPaddingChar() + "'");
                }
                byteArrayBuilder.append(i13 >> 4);
            } else {
                int i15 = (i13 << 6) | decodeBase64Char4;
                if (i14 >= length) {
                    if (!usesPadding()) {
                        byteArrayBuilder.appendTwoBytes(i15 >> 2);
                        return;
                    }
                    _reportBase64EOF();
                }
                i11 += 4;
                char charAt5 = str.charAt(i14);
                int decodeBase64Char5 = decodeBase64Char(charAt5);
                if (decodeBase64Char5 < 0) {
                    if (decodeBase64Char5 != -2) {
                        _reportInvalidBase64(charAt5, 3, (String) null);
                    }
                    byteArrayBuilder.appendTwoBytes(i15 >> 2);
                } else {
                    byteArrayBuilder.appendThreeBytes((i15 << 6) | decodeBase64Char5);
                }
            }
        }
    }

    public void encodeBase64Chunk(StringBuilder sb2, int i10) {
        sb2.append(this._base64ToAsciiC[(i10 >> 18) & 63]);
        sb2.append(this._base64ToAsciiC[(i10 >> 12) & 63]);
        sb2.append(this._base64ToAsciiC[(i10 >> 6) & 63]);
        sb2.append(this._base64ToAsciiC[i10 & 63]);
    }

    public void encodeBase64Partial(StringBuilder sb2, int i10, int i11) {
        sb2.append(this._base64ToAsciiC[(i10 >> 18) & 63]);
        sb2.append(this._base64ToAsciiC[(i10 >> 12) & 63]);
        if (this._usesPadding) {
            sb2.append(i11 == 2 ? this._base64ToAsciiC[(i10 >> 6) & 63] : this._paddingChar);
            sb2.append(this._paddingChar);
        } else if (i11 == 2) {
            sb2.append(this._base64ToAsciiC[(i10 >> 6) & 63]);
        }
    }

    public int encodeBase64Chunk(int i10, byte[] bArr, int i11) {
        byte[] bArr2 = this._base64ToAsciiB;
        bArr[i11] = bArr2[(i10 >> 18) & 63];
        bArr[i11 + 1] = bArr2[(i10 >> 12) & 63];
        int i12 = i11 + 3;
        bArr[i11 + 2] = bArr2[(i10 >> 6) & 63];
        int i13 = i11 + 4;
        bArr[i12] = bArr2[i10 & 63];
        return i13;
    }

    public int encodeBase64Partial(int i10, int i11, byte[] bArr, int i12) {
        byte[] bArr2 = this._base64ToAsciiB;
        bArr[i12] = bArr2[(i10 >> 18) & 63];
        int i13 = i12 + 2;
        bArr[i12 + 1] = bArr2[(i10 >> 12) & 63];
        if (this._usesPadding) {
            byte b10 = (byte) this._paddingChar;
            int i14 = i12 + 3;
            bArr[i13] = i11 == 2 ? bArr2[(i10 >> 6) & 63] : b10;
            int i15 = i12 + 4;
            bArr[i14] = b10;
            return i15;
        } else if (i11 != 2) {
            return i13;
        } else {
            bArr[i13] = bArr2[(i10 >> 6) & 63];
            return i12 + 3;
        }
    }

    public Base64Variant(Base64Variant base64Variant, String str, int i10) {
        this(base64Variant, str, base64Variant._usesPadding, base64Variant._paddingChar, i10);
    }

    public Base64Variant(Base64Variant base64Variant, String str, boolean z10, char c10, int i10) {
        int[] iArr = new int[128];
        this._asciiToBase64 = iArr;
        char[] cArr = new char[64];
        this._base64ToAsciiC = cArr;
        byte[] bArr = new byte[64];
        this._base64ToAsciiB = bArr;
        this._name = str;
        byte[] bArr2 = base64Variant._base64ToAsciiB;
        System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
        char[] cArr2 = base64Variant._base64ToAsciiC;
        System.arraycopy(cArr2, 0, cArr, 0, cArr2.length);
        int[] iArr2 = base64Variant._asciiToBase64;
        System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
        this._usesPadding = z10;
        this._paddingChar = c10;
        this._maxLineLength = i10;
    }
}
