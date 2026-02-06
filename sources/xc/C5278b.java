package xc;

import Ac.l;
import java.io.IOException;
import java.io.OutputStream;
import vc.h;

/* renamed from: xc.b  reason: case insensitive filesystem */
public final class C5278b extends OutputStream {

    /* renamed from: a  reason: collision with root package name */
    private final OutputStream f62225a;

    /* renamed from: b  reason: collision with root package name */
    private final l f62226b;

    /* renamed from: c  reason: collision with root package name */
    h f62227c;

    /* renamed from: d  reason: collision with root package name */
    long f62228d = -1;

    public C5278b(OutputStream outputStream, h hVar, l lVar) {
        this.f62225a = outputStream;
        this.f62227c = hVar;
        this.f62226b = lVar;
    }

    public void close() {
        long j10 = this.f62228d;
        if (j10 != -1) {
            this.f62227c.q(j10);
        }
        this.f62227c.w(this.f62226b.c());
        try {
            this.f62225a.close();
        } catch (IOException e10) {
            this.f62227c.y(this.f62226b.c());
            d.d(this.f62227c);
            throw e10;
        }
    }

    public void flush() {
        try {
            this.f62225a.flush();
        } catch (IOException e10) {
            this.f62227c.y(this.f62226b.c());
            d.d(this.f62227c);
            throw e10;
        }
    }

    public void write(int i10) {
        try {
            this.f62225a.write(i10);
            long j10 = this.f62228d + 1;
            this.f62228d = j10;
            this.f62227c.q(j10);
        } catch (IOException e10) {
            this.f62227c.y(this.f62226b.c());
            d.d(this.f62227c);
            throw e10;
        }
    }

    public void write(byte[] bArr) {
        try {
            this.f62225a.write(bArr);
            long length = this.f62228d + ((long) bArr.length);
            this.f62228d = length;
            this.f62227c.q(length);
        } catch (IOException e10) {
            this.f62227c.y(this.f62226b.c());
            d.d(this.f62227c);
            throw e10;
        }
    }

    public void write(byte[] bArr, int i10, int i11) {
        try {
            this.f62225a.write(bArr, i10, i11);
            long j10 = this.f62228d + ((long) i11);
            this.f62228d = j10;
            this.f62227c.q(j10);
        } catch (IOException e10) {
            this.f62227c.y(this.f62226b.c());
            d.d(this.f62227c);
            throw e10;
        }
    }
}
