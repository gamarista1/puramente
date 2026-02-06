package com.google.android.gms.measurement.internal;

final class U3 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C4622h3 f54881a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ long f54882b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ boolean f54883c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ C4622h3 f54884d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ C4643k3 f54885e;

    U3(C4643k3 k3Var, C4622h3 h3Var, long j10, boolean z10, C4622h3 h3Var2) {
        this.f54881a = h3Var;
        this.f54882b = j10;
        this.f54883c = z10;
        this.f54884d = h3Var2;
        this.f54885e = k3Var;
    }

    public final void run() {
        this.f54885e.N(this.f54881a);
        C4643k3.R(this.f54885e, this.f54881a, this.f54882b, false, this.f54883c);
        C4643k3.S(this.f54885e, this.f54881a, this.f54884d);
    }
}
