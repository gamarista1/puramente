package com.bumptech.glide.load.data;

import W4.b;
import java.io.OutputStream;

public final class c extends OutputStream {

    /* renamed from: a  reason: collision with root package name */
    private final OutputStream f39125a;

    /* renamed from: b  reason: collision with root package name */
    private byte[] f39126b;

    /* renamed from: c  reason: collision with root package name */
    private b f39127c;

    /* renamed from: d  reason: collision with root package name */
    private int f39128d;

    public c(OutputStream outputStream, b bVar) {
        this(outputStream, bVar, 65536);
    }

    private void a() {
        int i10 = this.f39128d;
        if (i10 > 0) {
            this.f39125a.write(this.f39126b, 0, i10);
            this.f39128d = 0;
        }
    }

    private void b() {
        if (this.f39128d == this.f39126b.length) {
            a();
        }
    }

    private void f() {
        byte[] bArr = this.f39126b;
        if (bArr != null) {
            this.f39127c.c(bArr);
            this.f39126b = null;
        }
    }

    /* JADX INFO: finally extract failed */
    public void close() {
        try {
            flush();
            this.f39125a.close();
            f();
        } catch (Throwable th2) {
            this.f39125a.close();
            throw th2;
        }
    }

    public void flush() {
        a();
        this.f39125a.flush();
    }

    public void write(int i10) {
        byte[] bArr = this.f39126b;
        int i11 = this.f39128d;
        this.f39128d = i11 + 1;
        bArr[i11] = (byte) i10;
        b();
    }

    c(OutputStream outputStream, b bVar, int i10) {
        this.f39125a = outputStream;
        this.f39127c = bVar;
        this.f39126b = (byte[]) bVar.d(i10, byte[].class);
    }

    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    public void write(byte[] bArr, int i10, int i11) {
        int i12 = 0;
        do {
            int i13 = i11 - i12;
            int i14 = i10 + i12;
            int i15 = this.f39128d;
            if (i15 != 0 || i13 < this.f39126b.length) {
                int min = Math.min(i13, this.f39126b.length - i15);
                System.arraycopy(bArr, i14, this.f39126b, this.f39128d, min);
                this.f39128d += min;
                i12 += min;
                b();
            } else {
                this.f39125a.write(bArr, i14, i13);
                return;
            }
        } while (i12 < i11);
    }
}
