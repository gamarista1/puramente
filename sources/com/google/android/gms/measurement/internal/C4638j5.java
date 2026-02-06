package com.google.android.gms.measurement.internal;

import Ea.e;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PersistableBundle;
import com.google.android.gms.internal.measurement.zzcn;
import com.google.android.gms.internal.measurement.zzco;

/* renamed from: com.google.android.gms.measurement.internal.j5  reason: case insensitive filesystem */
public final class C4638j5 extends C4645k5 {

    /* renamed from: d  reason: collision with root package name */
    private final AlarmManager f55166d = ((AlarmManager) zza().getSystemService("alarm"));

    /* renamed from: e  reason: collision with root package name */
    private C4689s f55167e;

    /* renamed from: f  reason: collision with root package name */
    private Integer f55168f;

    protected C4638j5(q5 q5Var) {
        super(q5Var);
    }

    private final int v() {
        if (this.f55168f == null) {
            String packageName = zza().getPackageName();
            this.f55168f = Integer.valueOf(("measurement" + packageName).hashCode());
        }
        return this.f55168f.intValue();
    }

    private final PendingIntent w() {
        Context zza = zza();
        return zzco.zza(zza, 0, new Intent().setClassName(zza, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), zzco.zza);
    }

    private final C4689s x() {
        if (this.f55167e == null) {
            this.f55167e = new C4631i5(this, this.f55232b.j0());
        }
        return this.f55167e;
    }

    private final void y() {
        JobScheduler jobScheduler = (JobScheduler) zza().getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(v());
        }
    }

    public final /* bridge */ /* synthetic */ C4618h a() {
        return super.a();
    }

    public final /* bridge */ /* synthetic */ C4713w c() {
        return super.c();
    }

    public final /* bridge */ /* synthetic */ R1 d() {
        return super.d();
    }

    public final /* bridge */ /* synthetic */ C4614g2 e() {
        return super.e();
    }

    public final /* bridge */ /* synthetic */ B5 f() {
        return super.f();
    }

    public final /* bridge */ /* synthetic */ void g() {
        super.g();
    }

    public final /* bridge */ /* synthetic */ void h() {
        super.h();
    }

    public final /* bridge */ /* synthetic */ void i() {
        super.i();
    }

    public final /* bridge */ /* synthetic */ x5 j() {
        return super.j();
    }

    public final /* bridge */ /* synthetic */ J5 k() {
        return super.k();
    }

    public final /* bridge */ /* synthetic */ C4646l l() {
        return super.l();
    }

    public final /* bridge */ /* synthetic */ C4681q2 m() {
        return super.m();
    }

    public final /* bridge */ /* synthetic */ Q4 n() {
        return super.n();
    }

    public final /* bridge */ /* synthetic */ o5 o() {
        return super.o();
    }

    /* access modifiers changed from: protected */
    public final boolean s() {
        AlarmManager alarmManager = this.f55166d;
        if (alarmManager != null) {
            alarmManager.cancel(w());
        }
        y();
        return false;
    }

    public final void t(long j10) {
        p();
        Context zza = zza();
        if (!B5.Y(zza)) {
            zzj().A().a("Receiver not registered/enabled");
        }
        if (!B5.Z(zza, false)) {
            zzj().A().a("Service not registered/enabled");
        }
        u();
        zzj().F().b("Scheduling upload, millis", Long.valueOf(j10));
        zzb().a();
        if (j10 < Math.max(0, ((Long) F.f54683y.a((Object) null)).longValue()) && !x().e()) {
            x().b(j10);
        }
        Context zza2 = zza();
        ComponentName componentName = new ComponentName(zza2, "com.google.android.gms.measurement.AppMeasurementJobService");
        int v10 = v();
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("action", "com.google.android.gms.measurement.UPLOAD");
        zzcn.zza(zza2, new JobInfo.Builder(v10, componentName).setMinimumLatency(j10).setOverrideDeadline(j10 << 1).setExtras(persistableBundle).build(), "com.google.android.gms", "UploadAlarm");
    }

    public final void u() {
        p();
        zzj().F().a("Unscheduling upload");
        AlarmManager alarmManager = this.f55166d;
        if (alarmManager != null) {
            alarmManager.cancel(w());
        }
        x().a();
        y();
    }

    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    public final /* bridge */ /* synthetic */ e zzb() {
        return super.zzb();
    }

    public final /* bridge */ /* synthetic */ C4583c zzd() {
        return super.zzd();
    }

    public final /* bridge */ /* synthetic */ V1 zzj() {
        return super.zzj();
    }

    public final /* bridge */ /* synthetic */ C4734z2 zzl() {
        return super.zzl();
    }
}
