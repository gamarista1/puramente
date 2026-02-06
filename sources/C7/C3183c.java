package c7;

import P6.c;
import P6.e;

/* renamed from: c7.c  reason: case insensitive filesystem */
public class C3183c extends C3187g {

    /* renamed from: d  reason: collision with root package name */
    private e f36537d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f36538e;

    public C3183c(e eVar, boolean z10) {
        this.f36537d = eVar;
        this.f36538e = z10;
    }

    public synchronized c U() {
        c cVar;
        e eVar = this.f36537d;
        if (eVar == null) {
            cVar = null;
        } else {
            cVar = eVar.d();
        }
        return cVar;
    }

    public synchronized e V() {
        return this.f36537d;
    }

    public void close() {
        synchronized (this) {
            try {
                e eVar = this.f36537d;
                if (eVar != null) {
                    this.f36537d = null;
                    eVar.a();
                }
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
    }

    public synchronized int d() {
        int i10;
        e eVar = this.f36537d;
        if (eVar == null) {
            i10 = 0;
        } else {
            i10 = eVar.d().d();
        }
        return i10;
    }

    public synchronized int e() {
        int i10;
        e eVar = this.f36537d;
        if (eVar == null) {
            i10 = 0;
        } else {
            i10 = eVar.d().e();
        }
        return i10;
    }

    public synchronized boolean isClosed() {
        boolean z10;
        if (this.f36537d == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        return z10;
    }

    public synchronized int p() {
        int i10;
        e eVar = this.f36537d;
        if (eVar == null) {
            i10 = 0;
        } else {
            i10 = eVar.d().p();
        }
        return i10;
    }

    public boolean u1() {
        return this.f36538e;
    }
}
