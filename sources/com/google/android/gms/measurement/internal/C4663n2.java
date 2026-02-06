package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.internal.measurement.zzby;
import com.google.android.gms.internal.measurement.zzbz;

/* renamed from: com.google.android.gms.measurement.internal.n2  reason: case insensitive filesystem */
public final class C4663n2 implements ServiceConnection {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final String f55244a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ C4669o2 f55245b;

    C4663n2(C4669o2 o2Var, String str) {
        this.f55245b = o2Var;
        this.f55244a = str;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder == null) {
            this.f55245b.f55248a.zzj().G().a("Install Referrer connection returned with null binder");
            return;
        }
        try {
            zzbz zza = zzby.zza(iBinder);
            if (zza == null) {
                this.f55245b.f55248a.zzj().G().a("Install Referrer Service implementation was not found");
                return;
            }
            this.f55245b.f55248a.zzj().F().a("Install Referrer Service connected");
            this.f55245b.f55248a.zzl().y(new C4675p2(this, zza, this));
        } catch (RuntimeException e10) {
            this.f55245b.f55248a.zzj().G().b("Exception occurred while calling Install Referrer API", e10);
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        this.f55245b.f55248a.zzj().F().a("Install Referrer Service disconnected");
    }
}
