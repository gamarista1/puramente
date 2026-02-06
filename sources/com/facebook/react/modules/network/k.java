package com.facebook.react.modules.network;

import Gh.C5405f;
import Gh.H;
import Gh.U;
import java.io.OutputStream;
import rh.D;
import rh.y;

class k extends D {

    /* renamed from: a  reason: collision with root package name */
    private final D f41093a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final j f41094b;

    /* renamed from: c  reason: collision with root package name */
    private long f41095c = 0;

    public k(D d10, j jVar) {
        this.f41093a = d10;
        this.f41094b = jVar;
    }

    private U b(C5405f fVar) {
        return H.h(new a(fVar.t1()));
    }

    public long contentLength() {
        if (this.f41095c == 0) {
            this.f41095c = this.f41093a.contentLength();
        }
        return this.f41095c;
    }

    public y contentType() {
        return this.f41093a.contentType();
    }

    public void writeTo(C5405f fVar) {
        C5405f c10 = H.c(b(fVar));
        contentLength();
        this.f41093a.writeTo(c10);
        c10.flush();
    }

    class a extends b {
        a(OutputStream outputStream) {
            super(outputStream);
        }

        private void b() {
            boolean z10;
            long a10 = a();
            long contentLength = k.this.contentLength();
            j a11 = k.this.f41094b;
            if (a10 == contentLength) {
                z10 = true;
            } else {
                z10 = false;
            }
            a11.a(a10, contentLength, z10);
        }

        public void write(byte[] bArr, int i10, int i11) {
            super.write(bArr, i10, i11);
            b();
        }

        public void write(int i10) {
            super.write(i10);
            b();
        }
    }
}
