package com.google.firebase.perf.session.gauges;

import Bc.d;

public final /* synthetic */ class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ GaugeManager f57751a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f57752b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ d f57753c;

    public /* synthetic */ e(GaugeManager gaugeManager, String str, d dVar) {
        this.f57751a = gaugeManager;
        this.f57752b = str;
        this.f57753c = dVar;
    }

    public final void run() {
        this.f57751a.lambda$startCollectingGauges$2(this.f57752b, this.f57753c);
    }
}
