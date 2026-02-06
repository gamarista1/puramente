package com.google.android.gms.measurement.internal;

import Pa.y;
import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.internal.measurement.zzdo;

public final class S4 {

    /* renamed from: a  reason: collision with root package name */
    private final Context f54864a;

    public S4(Context context) {
        C4536s.l(context);
        this.f54864a = context;
    }

    private final void f(Runnable runnable) {
        q5 h10 = q5.h(this.f54864a);
        h10.zzl().y(new T4(this, h10, runnable));
    }

    private final V1 j() {
        return E2.a(this.f54864a, (zzdo) null, (Long) null).zzj();
    }

    public final int a(Intent intent, int i10, int i11) {
        V1 zzj = E2.a(this.f54864a, (zzdo) null, (Long) null).zzj();
        if (intent == null) {
            zzj.G().a("AppMeasurementService started with null intent");
            return 2;
        }
        String action = intent.getAction();
        zzj.F().c("Local AppMeasurementService called. startId, action", Integer.valueOf(i11), action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            f(new U4(this, i11, zzj, intent));
        }
        return 2;
    }

    public final IBinder b(Intent intent) {
        if (intent == null) {
            j().B().a("onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new I2(q5.h(this.f54864a));
        }
        j().G().b("onBind received unknown action", action);
        return null;
    }

    public final void c() {
        E2.a(this.f54864a, (zzdo) null, (Long) null).zzj().F().a("Local AppMeasurementService is starting up");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void d(int i10, V1 v12, Intent intent) {
        if (((y) this.f54864a).zza(i10)) {
            v12.F().b("Local AppMeasurementService processed last upload request. StartId", Integer.valueOf(i10));
            j().F().a("Completed wakeful intent.");
            ((y) this.f54864a).a(intent);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void e(V1 v12, JobParameters jobParameters) {
        v12.F().a("AppMeasurementJobService processed last upload request.");
        ((y) this.f54864a).b(jobParameters, false);
    }

    public final boolean g(JobParameters jobParameters) {
        V1 zzj = E2.a(this.f54864a, (zzdo) null, (Long) null).zzj();
        String string = jobParameters.getExtras().getString("action");
        zzj.F().b("Local AppMeasurementJobService called. action", string);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(string)) {
            return true;
        }
        f(new R4(this, zzj, jobParameters));
        return true;
    }

    public final void h() {
        E2.a(this.f54864a, (zzdo) null, (Long) null).zzj().F().a("Local AppMeasurementService is shutting down");
    }

    public final void i(Intent intent) {
        if (intent == null) {
            j().B().a("onRebind called with null intent");
            return;
        }
        j().F().b("onRebind called. action", intent.getAction());
    }

    public final boolean k(Intent intent) {
        if (intent == null) {
            j().B().a("onUnbind called with null intent");
            return true;
        }
        j().F().b("onUnbind called for intent. action", intent.getAction());
        return true;
    }
}
