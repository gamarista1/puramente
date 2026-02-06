package com.google.android.gms.measurement.internal;

import android.app.job.JobParameters;

public final /* synthetic */ class R4 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private /* synthetic */ S4 f54854a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ V1 f54855b;

    /* renamed from: c  reason: collision with root package name */
    private /* synthetic */ JobParameters f54856c;

    public /* synthetic */ R4(S4 s42, V1 v12, JobParameters jobParameters) {
        this.f54854a = s42;
        this.f54855b = v12;
        this.f54856c = jobParameters;
    }

    public final void run() {
        this.f54854a.e(this.f54855b, this.f54856c);
    }
}
