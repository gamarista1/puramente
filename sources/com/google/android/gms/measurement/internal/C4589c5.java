package com.google.android.gms.measurement.internal;

import android.app.ActivityManager;
import android.os.Bundle;
import android.text.TextUtils;

/* renamed from: com.google.android.gms.measurement.internal.c5  reason: case insensitive filesystem */
final class C4589c5 {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ V4 f55031a;

    C4589c5(V4 v42) {
        this.f55031a = v42;
    }

    private final void c(long j10, boolean z10) {
        this.f55031a.i();
        if (this.f55031a.f55074a.k()) {
            this.f55031a.e().f55104r.b(j10);
            this.f55031a.zzj().F().b("Session started, time", Long.valueOf(this.f55031a.zzb().a()));
            long j11 = j10 / 1000;
            long j12 = j10;
            this.f55031a.m().e0("auto", "_sid", Long.valueOf(j11), j12);
            this.f55031a.e().f55105s.b(j11);
            this.f55031a.e().f55100n.a(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", j11);
            this.f55031a.m().Y("auto", "_s", j12, bundle);
            String a10 = this.f55031a.e().f55110x.a();
            if (!TextUtils.isEmpty(a10)) {
                Bundle bundle2 = new Bundle();
                bundle2.putString("_ffr", a10);
                this.f55031a.m().Y("auto", "_ssr", j10, bundle2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        this.f55031a.i();
        if (this.f55031a.e().u(this.f55031a.zzb().currentTimeMillis())) {
            this.f55031a.e().f55100n.a(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                this.f55031a.zzj().F().a("Detected application was in foreground");
                c(this.f55031a.zzb().currentTimeMillis(), false);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void b(long j10, boolean z10) {
        this.f55031a.i();
        this.f55031a.B();
        if (this.f55031a.e().u(j10)) {
            this.f55031a.e().f55100n.a(true);
            this.f55031a.k().D();
        }
        this.f55031a.e().f55104r.b(j10);
        if (this.f55031a.e().f55100n.b()) {
            c(j10, z10);
        }
    }
}
