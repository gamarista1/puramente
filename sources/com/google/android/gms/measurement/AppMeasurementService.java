package com.google.android.gms.measurement;

import Pa.y;
import W1.a;
import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.measurement.internal.S4;

public final class AppMeasurementService extends Service implements y {

    /* renamed from: a  reason: collision with root package name */
    private S4 f54421a;

    private final S4 c() {
        if (this.f54421a == null) {
            this.f54421a = new S4(this);
        }
        return this.f54421a;
    }

    public final void a(Intent intent) {
        a.b(intent);
    }

    public final void b(JobParameters jobParameters, boolean z10) {
        throw new UnsupportedOperationException();
    }

    public final IBinder onBind(Intent intent) {
        return c().b(intent);
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

    public final int onStartCommand(Intent intent, int i10, int i11) {
        return c().a(intent, i10, i11);
    }

    public final boolean onUnbind(Intent intent) {
        return c().k(intent);
    }

    public final boolean zza(int i10) {
        return stopSelfResult(i10);
    }
}
