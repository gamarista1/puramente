package com.android.billingclient.api;

import J4.C3042h;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import com.google.android.gms.internal.play_billing.zze;

/* renamed from: com.android.billingclient.api.u  reason: case insensitive filesystem */
final class C3213u extends ResultReceiver {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ C3042h f38348a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C3213u(C3195b bVar, Handler handler, C3042h hVar) {
        super(handler);
        this.f38348a = hVar;
    }

    public final void onReceiveResult(int i10, Bundle bundle) {
        this.f38348a.a(zze.zzg(bundle, "BillingClient"));
    }
}
