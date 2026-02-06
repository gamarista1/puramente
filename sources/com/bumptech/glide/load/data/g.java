package com.bumptech.glide.load.data;

import java.io.FilterInputStream;
import java.io.InputStream;

public final class g extends FilterInputStream {

    /* renamed from: c  reason: collision with root package name */
    private static final byte[] f39132c;

    /* renamed from: d  reason: collision with root package name */
    private static final int f39133d;

    /* renamed from: e  reason: collision with root package name */
    private static final int f39134e;

    /* renamed from: a  reason: collision with root package name */
    private final byte f39135a;

    /* renamed from: b  reason: collision with root package name */
    private int f39136b;

    static {
        byte[] bArr = {-1, -31, 0, 28, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0};
        f39132c = bArr;
        int length = bArr.length;
        f39133d = length;
        f39134e = length + 2;
    }

    public g(InputStream inputStream, int i10) {
        super(inputStream);
        if (i10 < -1 || i10 > 8) {
            throw new IllegalArgumentException("Cannot add invalid orientation: " + i10);
        }
        this.f39135a = (byte) i10;
    }

    public void mark(int i10) {
        throw new UnsupportedOperationException();
    }

    public boolean markSupported() {
        return false;
    }

    public int read() {
        int i10;
        int i11;
        int i12 = this.f39136b;
        if (i12 < 2 || i12 > (i11 = f39134e)) {
            i10 = super.read();
        } else if (i12 == i11) {
            i10 = this.f39135a;
        } else {
            i10 = f39132c[i12 - 2] & 255;
        }
        if (i10 != -1) {
            this.f39136b++;
        }
        return i10;
    }

    public void reset() {
        throw new UnsupportedOperationException();
    }

    public long skip(long j10) {
        long skip = super.skip(j10);
        if (skip > 0) {
            this.f39136b = (int) (((long) this.f39136b) + skip);
        }
        return skip;
    }

    public int read(byte[] bArr, int i10, int i11) {
        int i12;
        int i13 = this.f39136b;
        int i14 = f39134e;
        if (i13 > i14) {
            i12 = super.read(bArr, i10, i11);
        } else if (i13 == i14) {
            bArr[i10] = this.f39135a;
            i12 = 1;
        } else if (i13 < 2) {
            i12 = super.read(bArr, i10, 2 - i13);
        } else {
            int min = Math.min(i14 - i13, i11);
            System.arraycopy(f39132c, this.f39136b - 2, bArr, i10, min);
            i12 = min;
        }
        if (i12 > 0) {
            this.f39136b += i12;
        }
        return i12;
    }
}
