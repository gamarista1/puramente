package com.fasterxml.jackson.core.util;

public class BufferRecycler {
    public static final int BYTE_BASE64_CODEC_BUFFER = 3;
    private static final int[] BYTE_BUFFER_LENGTHS = {8000, 8000, 2000, 2000};
    public static final int BYTE_READ_IO_BUFFER = 0;
    public static final int BYTE_WRITE_CONCAT_BUFFER = 2;
    public static final int BYTE_WRITE_ENCODING_BUFFER = 1;
    private static final int[] CHAR_BUFFER_LENGTHS = {4000, 4000, 200, 200};
    public static final int CHAR_CONCAT_BUFFER = 1;
    public static final int CHAR_NAME_COPY_BUFFER = 3;
    public static final int CHAR_TEXT_BUFFER = 2;
    public static final int CHAR_TOKEN_BUFFER = 0;
    protected final byte[][] _byteBuffers;
    protected final char[][] _charBuffers;

    public BufferRecycler() {
        this(4, 4);
    }

    public final byte[] allocByteBuffer(int i10) {
        return allocByteBuffer(i10, 0);
    }

    public final char[] allocCharBuffer(int i10) {
        return allocCharBuffer(i10, 0);
    }

    /* access modifiers changed from: protected */
    public byte[] balloc(int i10) {
        return new byte[i10];
    }

    /* access modifiers changed from: protected */
    public int byteBufferLength(int i10) {
        return BYTE_BUFFER_LENGTHS[i10];
    }

    /* access modifiers changed from: protected */
    public char[] calloc(int i10) {
        return new char[i10];
    }

    /* access modifiers changed from: protected */
    public int charBufferLength(int i10) {
        return CHAR_BUFFER_LENGTHS[i10];
    }

    public final void releaseByteBuffer(int i10, byte[] bArr) {
        this._byteBuffers[i10] = bArr;
    }

    public void releaseCharBuffer(int i10, char[] cArr) {
        this._charBuffers[i10] = cArr;
    }

    protected BufferRecycler(int i10, int i11) {
        this._byteBuffers = new byte[i10][];
        this._charBuffers = new char[i11][];
    }

    public byte[] allocByteBuffer(int i10, int i11) {
        int byteBufferLength = byteBufferLength(i10);
        if (i11 < byteBufferLength) {
            i11 = byteBufferLength;
        }
        byte[][] bArr = this._byteBuffers;
        byte[] bArr2 = bArr[i10];
        if (bArr2 == null || bArr2.length < i11) {
            return balloc(i11);
        }
        bArr[i10] = null;
        return bArr2;
    }

    public char[] allocCharBuffer(int i10, int i11) {
        int charBufferLength = charBufferLength(i10);
        if (i11 < charBufferLength) {
            i11 = charBufferLength;
        }
        char[][] cArr = this._charBuffers;
        char[] cArr2 = cArr[i10];
        if (cArr2 == null || cArr2.length < i11) {
            return calloc(i11);
        }
        cArr[i10] = null;
        return cArr2;
    }
}
