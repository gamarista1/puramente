package com.github.penfeizhou.animation.io;

import java.io.InputStream;

public abstract class c implements Reader {
    protected Reader reader;

    public c(Reader reader2) {
        this.reader = reader2;
    }

    public int available() {
        return this.reader.available();
    }

    public void close() {
        this.reader.close();
    }

    public byte peek() {
        return this.reader.peek();
    }

    public int position() {
        return this.reader.position();
    }

    public int read(byte[] bArr, int i10, int i11) {
        return this.reader.read(bArr, i10, i11);
    }

    public void reset() {
        this.reader.reset();
    }

    public long skip(long j10) {
        return this.reader.skip(j10);
    }

    public InputStream toInputStream() {
        reset();
        return this.reader.toInputStream();
    }
}
