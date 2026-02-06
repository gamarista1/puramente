package f7;

import T5.k;
import W5.h;
import X5.a;
import java.nio.ByteBuffer;

public class x implements h {

    /* renamed from: a  reason: collision with root package name */
    private final int f43469a;

    /* renamed from: b  reason: collision with root package name */
    a f43470b;

    public x(a aVar, int i10) {
        boolean z10;
        k.g(aVar);
        if (i10 < 0 || i10 > ((v) aVar.I()).getSize()) {
            z10 = false;
        } else {
            z10 = true;
        }
        k.b(Boolean.valueOf(z10));
        this.f43470b = aVar.o();
        this.f43469a = i10;
    }

    /* access modifiers changed from: package-private */
    public synchronized void a() {
        if (isClosed()) {
            throw new h.a();
        }
    }

    public synchronized int c(int i10, byte[] bArr, int i11, int i12) {
        boolean z10;
        a();
        if (i10 + i12 <= this.f43469a) {
            z10 = true;
        } else {
            z10 = false;
        }
        k.b(Boolean.valueOf(z10));
        k.g(this.f43470b);
        return ((v) this.f43470b.I()).c(i10, bArr, i11, i12);
    }

    public synchronized void close() {
        a.E(this.f43470b);
        this.f43470b = null;
    }

    public synchronized boolean isClosed() {
        return !a.T(this.f43470b);
    }

    public synchronized ByteBuffer l() {
        k.g(this.f43470b);
        return ((v) this.f43470b.I()).l();
    }

    public synchronized byte r(int i10) {
        boolean z10;
        a();
        boolean z11 = false;
        if (i10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        k.b(Boolean.valueOf(z10));
        if (i10 < this.f43469a) {
            z11 = true;
        }
        k.b(Boolean.valueOf(z11));
        k.g(this.f43470b);
        return ((v) this.f43470b.I()).r(i10);
    }

    public synchronized long s() {
        a();
        k.g(this.f43470b);
        return ((v) this.f43470b.I()).s();
    }

    public synchronized int size() {
        a();
        return this.f43469a;
    }
}
