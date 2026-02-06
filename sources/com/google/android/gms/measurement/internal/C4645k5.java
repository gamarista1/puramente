package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.k5  reason: case insensitive filesystem */
abstract class C4645k5 extends C4652l5 {

    /* renamed from: c  reason: collision with root package name */
    private boolean f55212c;

    C4645k5(q5 q5Var) {
        super(q5Var);
        this.f55232b.s0();
    }

    /* access modifiers changed from: protected */
    public final void p() {
        if (!r()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void q() {
        if (!this.f55212c) {
            s();
            this.f55232b.r0();
            this.f55212c = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    /* access modifiers changed from: package-private */
    public final boolean r() {
        if (this.f55212c) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public abstract boolean s();
}
