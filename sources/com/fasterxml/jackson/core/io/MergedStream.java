package com.fasterxml.jackson.core.io;

import java.io.InputStream;

public final class MergedStream extends InputStream {
    private byte[] _b;
    private final IOContext _ctxt;
    private final int _end;
    private final InputStream _in;
    private int _ptr;

    public MergedStream(IOContext iOContext, InputStream inputStream, byte[] bArr, int i10, int i11) {
        this._ctxt = iOContext;
        this._in = inputStream;
        this._b = bArr;
        this._ptr = i10;
        this._end = i11;
    }

    private void _free() {
        byte[] bArr = this._b;
        if (bArr != null) {
            this._b = null;
            IOContext iOContext = this._ctxt;
            if (iOContext != null) {
                iOContext.releaseReadIOBuffer(bArr);
            }
        }
    }

    public int available() {
        if (this._b != null) {
            return this._end - this._ptr;
        }
        return this._in.available();
    }

    public void close() {
        _free();
        this._in.close();
    }

    public void mark(int i10) {
        if (this._b == null) {
            this._in.mark(i10);
        }
    }

    public boolean markSupported() {
        if (this._b != null || !this._in.markSupported()) {
            return false;
        }
        return true;
    }

    public int read() {
        byte[] bArr = this._b;
        if (bArr == null) {
            return this._in.read();
        }
        int i10 = this._ptr;
        int i11 = i10 + 1;
        this._ptr = i11;
        byte b10 = bArr[i10] & 255;
        if (i11 >= this._end) {
            _free();
        }
        return b10;
    }

    public void reset() {
        if (this._b == null) {
            this._in.reset();
        }
    }

    public long skip(long j10) {
        long j11;
        if (this._b != null) {
            int i10 = this._end;
            int i11 = this._ptr;
            j11 = (long) (i10 - i11);
            if (j11 > j10) {
                this._ptr = i11 + ((int) j10);
                return j10;
            }
            _free();
            j10 -= j11;
        } else {
            j11 = 0;
        }
        if (j10 > 0) {
            return j11 + this._in.skip(j10);
        }
        return j11;
    }

    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public int read(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = this._b;
        if (bArr2 == null) {
            return this._in.read(bArr, i10, i11);
        }
        int i12 = this._end;
        int i13 = this._ptr;
        int i14 = i12 - i13;
        if (i11 > i14) {
            i11 = i14;
        }
        System.arraycopy(bArr2, i13, bArr, i10, i11);
        int i15 = this._ptr + i11;
        this._ptr = i15;
        if (i15 >= this._end) {
            _free();
        }
        return i11;
    }
}
