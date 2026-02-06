package com.github.penfeizhou.animation.io;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public abstract class b implements e {

    /* renamed from: a  reason: collision with root package name */
    protected ByteBuffer f42754a;

    public b() {
        d(10240);
    }

    public int a() {
        return this.f42754a.position();
    }

    public void b(byte b10) {
        this.f42754a.put(b10);
    }

    public void c(byte[] bArr) {
        this.f42754a.put(bArr);
    }

    public void close() {
    }

    public void d(int i10) {
        ByteBuffer byteBuffer = this.f42754a;
        if (byteBuffer == null || i10 > byteBuffer.capacity()) {
            ByteBuffer allocate = ByteBuffer.allocate(i10);
            this.f42754a = allocate;
            allocate.order(ByteOrder.LITTLE_ENDIAN);
        }
        this.f42754a.clear();
    }

    public void e(int i10) {
        this.f42754a.position(i10 + a());
    }

    public byte[] f() {
        return this.f42754a.array();
    }
}
