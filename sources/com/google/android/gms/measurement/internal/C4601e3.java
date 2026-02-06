package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.e3  reason: case insensitive filesystem */
abstract class C4601e3 extends C4608f3 {

    /* renamed from: b  reason: collision with root package name */
    private boolean f55052b;

    C4601e3(E2 e22) {
        super(e22);
        this.f55074a.i();
    }

    /* access modifiers changed from: protected */
    public void j() {
    }

    /* access modifiers changed from: protected */
    public final void k() {
        if (!n()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void l() {
        if (this.f55052b) {
            throw new IllegalStateException("Can't initialize twice");
        } else if (!o()) {
            this.f55074a.M();
            this.f55052b = true;
        }
    }

    public final void m() {
        if (!this.f55052b) {
            j();
            this.f55074a.M();
            this.f55052b = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    /* access modifiers changed from: package-private */
    public final boolean n() {
        if (this.f55052b) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public abstract boolean o();
}
