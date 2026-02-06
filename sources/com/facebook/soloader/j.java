package com.facebook.soloader;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class j implements h {

    /* renamed from: a  reason: collision with root package name */
    private InputStream f42525a;

    /* renamed from: b  reason: collision with root package name */
    private final ZipEntry f42526b;

    /* renamed from: c  reason: collision with root package name */
    private final ZipFile f42527c;

    /* renamed from: d  reason: collision with root package name */
    private final long f42528d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f42529e = true;

    /* renamed from: f  reason: collision with root package name */
    private long f42530f = 0;

    public j(ZipFile zipFile, ZipEntry zipEntry) {
        this.f42527c = zipFile;
        this.f42526b = zipEntry;
        this.f42528d = zipEntry.getSize();
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        this.f42525a = inputStream;
        if (inputStream == null) {
            throw new IOException(zipEntry.getName() + "'s InputStream is null");
        }
    }

    public int O(ByteBuffer byteBuffer, long j10) {
        if (this.f42525a != null) {
            int remaining = byteBuffer.remaining();
            long j11 = this.f42528d - j10;
            if (j11 <= 0) {
                return -1;
            }
            int i10 = (int) j11;
            if (remaining > i10) {
                remaining = i10;
            }
            a(j10);
            if (byteBuffer.hasArray()) {
                this.f42525a.read(byteBuffer.array(), 0, remaining);
                byteBuffer.position(byteBuffer.position() + remaining);
            } else {
                byte[] bArr = new byte[remaining];
                this.f42525a.read(bArr, 0, remaining);
                byteBuffer.put(bArr, 0, remaining);
            }
            this.f42530f += (long) remaining;
            return remaining;
        }
        throw new IOException("InputStream is null");
    }

    public h a(long j10) {
        InputStream inputStream = this.f42525a;
        if (inputStream != null) {
            long j11 = this.f42530f;
            if (j10 == j11) {
                return this;
            }
            long j12 = this.f42528d;
            if (j10 > j12) {
                j10 = j12;
            }
            if (j10 >= j11) {
                inputStream.skip(j10 - j11);
            } else {
                inputStream.close();
                InputStream inputStream2 = this.f42527c.getInputStream(this.f42526b);
                this.f42525a = inputStream2;
                if (inputStream2 != null) {
                    inputStream2.skip(j10);
                } else {
                    throw new IOException(this.f42526b.getName() + "'s InputStream is null");
                }
            }
            this.f42530f = j10;
            return this;
        }
        throw new IOException(this.f42526b.getName() + "'s InputStream is null");
    }

    public void close() {
        InputStream inputStream = this.f42525a;
        if (inputStream != null) {
            inputStream.close();
            this.f42529e = false;
        }
    }

    public boolean isOpen() {
        return this.f42529e;
    }

    public int read(ByteBuffer byteBuffer) {
        return O(byteBuffer, this.f42530f);
    }

    public int write(ByteBuffer byteBuffer) {
        throw new UnsupportedOperationException("ElfZipFileChannel doesn't support write");
    }
}
