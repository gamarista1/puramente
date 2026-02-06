package com.android.billingclient.api;

import J4.x;
import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.internal.play_billing.zzau;
import com.google.android.gms.internal.play_billing.zze;

final class K implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ L f38118a;

    /* synthetic */ K(L l10, x xVar) {
        this.f38118a = l10;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        zze.zzk("BillingClientTesting", "Billing Override Service connected.");
        this.f38118a.f38121I = zzau.zzc(iBinder);
        this.f38118a.f38120H = 2;
        this.f38118a.p1(26);
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        zze.zzl("BillingClientTesting", "Billing Override Service disconnected.");
        this.f38118a.f38121I = null;
        this.f38118a.f38120H = 0;
    }
}
