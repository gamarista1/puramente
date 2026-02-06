package com.github.penfeizhou.animation.io;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class d extends FilterInputStream implements Reader {

    /* renamed from: a  reason: collision with root package name */
    private int f42755a;

    public d(InputStream inputStream) {
        super(inputStream);
        try {
            inputStream.reset();
        } catch (IOException unused) {
        }
    }

    public byte peek() {
        byte read = (byte) read();
        this.f42755a++;
        return read;
    }

    public int position() {
        return this.f42755a;
    }

    public int read(byte[] bArr, int i10, int i11) {
        int read = super.read(bArr, i10, i11);
        this.f42755a += Math.max(0, read);
        return read;
    }

    public synchronized void reset() {
        super.reset();
        this.f42755a = 0;
    }

    public long skip(long j10) {
        long j11 = j10;
        while (j11 > 0) {
            long skip = super.skip(j11);
            if (skip > 0) {
                j11 -= skip;
            } else if (super.read() == -1) {
                break;
            } else {
                j11--;
            }
        }
        long j12 = j10 - j11;
        this.f42755a = (int) (((long) this.f42755a) + j12);
        return j12;
    }

    public InputStream toInputStream() {
        return this;
    }
}
