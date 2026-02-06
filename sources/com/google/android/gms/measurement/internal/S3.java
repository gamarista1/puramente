package com.google.android.gms.measurement.internal;

final class S3 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C4701u f54862a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C4643k3 f54863b;

    S3(C4643k3 k3Var, C4701u uVar) {
        this.f54862a = uVar;
        this.f54863b = k3Var;
    }

    public final void run() {
        if (this.f54863b.e().v(this.f54862a)) {
            this.f54863b.zzj().F().b("Setting DMA consent(FE)", this.f54862a);
            if (this.f54863b.o().d0()) {
                this.f54863b.o().Y();
            } else {
                this.f54863b.o().P(false);
            }
        } else {
            this.f54863b.zzj().E().b("Lower precedence consent source ignored, proposed source", Integer.valueOf(this.f54862a.a()));
        }
    }
}
