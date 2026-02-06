package com.google.android.gms.measurement;

import Pa.y;
import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import com.google.android.gms.measurement.internal.S4;

@TargetApi(24)
public final class AppMeasurementJobService extends JobService implements y {

    /* renamed from: a  reason: collision with root package name */
    private S4 f54419a;

    private final S4 c() {
        if (this.f54419a == null) {
            this.f54419a = new S4(this);
        }
        return this.f54419a;
    }

    public final void a(Intent intent) {
    }

    public final void b(JobParameters jobParameters, boolean z10) {
        jobFinished(jobParameters, false);
    }

    public final void onCreate() {
        super.onCreate();
        c().c();
    }

    public final void onDestroy() {
        c().h();
        super.onDestroy();
    }

    public final void onRebind(Intent intent) {
        c().i(intent);
    }

    public final boolean onStartJob(JobParameters jobParameters) {
        return c().g(jobParameters);
    }

    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    public final boolean onUnbind(Intent intent) {
        return c().k(intent);
    }

    public final boolean zza(int i10) {
        throw new UnsupportedOperationException();
    }
}
