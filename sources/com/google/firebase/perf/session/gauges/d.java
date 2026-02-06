package com.google.firebase.perf.session.gauges;

public final /* synthetic */ class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ GaugeManager f57748a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f57749b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Bc.d f57750c;

    public /* synthetic */ d(GaugeManager gaugeManager, String str, Bc.d dVar) {
        this.f57748a = gaugeManager;
        this.f57749b = str;
        this.f57750c = dVar;
    }

    public final void run() {
        this.f57748a.lambda$stopCollectingGauges$3(this.f57749b, this.f57750c);
    }
}
