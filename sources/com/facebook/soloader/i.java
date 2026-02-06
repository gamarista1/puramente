package com.facebook.soloader;

import java.io.File;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class i implements h {

    /* renamed from: a  reason: collision with root package name */
    private File f42522a;

    /* renamed from: b  reason: collision with root package name */
    private FileInputStream f42523b;

    /* renamed from: c  reason: collision with root package name */
    private FileChannel f42524c;

    public i(File file) {
        this.f42522a = file;
        a();
    }

    public int O(ByteBuffer byteBuffer, long j10) {
        return this.f42524c.read(byteBuffer, j10);
    }

    public void a() {
        FileInputStream fileInputStream = new FileInputStream(this.f42522a);
        this.f42523b = fileInputStream;
        this.f42524c = fileInputStream.getChannel();
    }

    public void close() {
        this.f42523b.close();
    }

    public boolean isOpen() {
        return this.f42524c.isOpen();
    }

    public int read(ByteBuffer byteBuffer) {
        return this.f42524c.read(byteBuffer);
    }

    public int write(ByteBuffer byteBuffer) {
        return this.f42524c.write(byteBuffer);
    }
}
