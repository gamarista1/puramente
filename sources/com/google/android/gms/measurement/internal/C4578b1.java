package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.b1  reason: case insensitive filesystem */
abstract class C4578b1 extends C1 {

    /* renamed from: b  reason: collision with root package name */
    private boolean f55013b;

    C4578b1(E2 e22) {
        super(e22);
        this.f55074a.i();
    }

    /* access modifiers changed from: protected */
    public final void q() {
        if (!u()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void r() {
        if (this.f55013b) {
            throw new IllegalStateException("Can't initialize twice");
        } else if (!v()) {
            this.f55074a.M();
            this.f55013b = true;
        }
    }

    public final void s() {
        if (!this.f55013b) {
            t();
            this.f55074a.M();
            this.f55013b = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    /* access modifiers changed from: protected */
    public void t() {
    }

    /* access modifiers changed from: package-private */
    public final boolean u() {
        if (this.f55013b) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public abstract boolean v();
}
