package com.github.penfeizhou.animation.io;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;

public class a implements Reader {

    /* renamed from: a  reason: collision with root package name */
    protected final ByteBuffer f42753a;

    public a(ByteBuffer byteBuffer) {
        this.f42753a = byteBuffer;
        byteBuffer.position(0);
    }

    public int available() {
        return this.f42753a.limit() - this.f42753a.position();
    }

    public void close() {
    }

    public byte peek() {
        return this.f42753a.get();
    }

    public int position() {
        return this.f42753a.position();
    }

    public int read(byte[] bArr, int i10, int i11) {
        this.f42753a.get(bArr, i10, i11);
        return i11;
    }

    public void reset() {
        this.f42753a.position(0);
    }

    public long skip(long j10) {
        ByteBuffer byteBuffer = this.f42753a;
        byteBuffer.position((int) (((long) byteBuffer.position()) + j10));
        return j10;
    }

    public InputStream toInputStream() {
        return new ByteArrayInputStream(this.f42753a.array());
    }
}
