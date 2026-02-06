package com.android.billingclient.api;

import J4.p;
import J4.s;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import com.google.android.gms.internal.play_billing.zzco;
import com.google.android.gms.internal.play_billing.zze;
import com.google.android.gms.internal.play_billing.zzgw;
import com.google.android.gms.internal.play_billing.zzjz;
import java.util.List;
import java.util.Objects;

final class X extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    private boolean f38182a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f38183b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Y f38184c;

    X(Y y10, boolean z10) {
        this.f38184c = y10;
        this.f38183b = z10;
    }

    private final void d(Bundle bundle, C3198e eVar, int i10) {
        try {
            if (bundle.getByteArray("FAILURE_LOGGING_PAYLOAD") != null) {
                this.f38184c.f38187c.f(zzjz.zzC(bundle.getByteArray("FAILURE_LOGGING_PAYLOAD"), zzgw.zza()));
            } else {
                this.f38184c.f38187c.f(M.b(23, i10, eVar));
            }
        } catch (Throwable unused) {
            zze.zzl("BillingBroadcastManager", "Failed parsing Api failure.");
        }
    }

    public final synchronized void a(Context context, IntentFilter intentFilter) {
        int i10;
        try {
            if (!this.f38182a) {
                if (Build.VERSION.SDK_INT >= 33) {
                    if (true != this.f38183b) {
                        i10 = 4;
                    } else {
                        i10 = 2;
                    }
                    Intent unused = context.registerReceiver(this, intentFilter, i10);
                } else {
                    context.registerReceiver(this, intentFilter);
                }
                this.f38182a = true;
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
    }

    public final synchronized void b(Context context, IntentFilter intentFilter, String str) {
        int i10;
        try {
            if (!this.f38182a) {
                if (Build.VERSION.SDK_INT >= 33) {
                    if (true != this.f38183b) {
                        i10 = 4;
                    } else {
                        i10 = 2;
                    }
                    Intent unused = context.registerReceiver(this, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", (Handler) null, i10);
                } else {
                    context.registerReceiver(this, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", (Handler) null);
                }
                this.f38182a = true;
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
    }

    public final synchronized void c(Context context) {
        if (this.f38182a) {
            context.unregisterReceiver(this);
            this.f38182a = false;
            return;
        }
        zze.zzl("BillingBroadcastManager", "Receiver is not registered.");
    }

    public final void onReceive(Context context, Intent intent) {
        Bundle extras = intent.getExtras();
        int i10 = 1;
        if (extras == null) {
            zze.zzl("BillingBroadcastManager", "Bundle is null.");
            N b10 = this.f38184c.f38187c;
            C3198e eVar = O.f38143k;
            b10.f(M.b(11, 1, eVar));
            Y y10 = this.f38184c;
            if (y10.f38186b != null) {
                y10.f38186b.onPurchasesUpdated(eVar, (List) null);
                return;
            }
            return;
        }
        C3198e zzf = zze.zzf(intent, "BillingBroadcastManager");
        String action = intent.getAction();
        if (true == Objects.equals(extras.getString("INTENT_SOURCE"), "LAUNCH_BILLING_FLOW")) {
            i10 = 2;
        }
        if (action.equals("com.android.vending.billing.PURCHASES_UPDATED") || action.equals("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED")) {
            List zzj = zze.zzj(extras);
            if (zzf.b() == 0) {
                this.f38184c.f38187c.d(M.d(i10));
            } else {
                d(extras, zzf, i10);
            }
            this.f38184c.f38186b.onPurchasesUpdated(zzf, zzj);
        } else if (!action.equals("com.android.vending.billing.ALTERNATIVE_BILLING")) {
        } else {
            if (zzf.b() != 0) {
                d(extras, zzf, i10);
                this.f38184c.f38186b.onPurchasesUpdated(zzf, zzco.zzl());
                return;
            }
            Y y11 = this.f38184c;
            s unused = y11.getClass();
            p unused2 = y11.getClass();
            zze.zzl("BillingBroadcastManager", "AlternativeBillingListener and UserChoiceBillingListener is null.");
            N b11 = this.f38184c.f38187c;
            C3198e eVar2 = O.f38143k;
            b11.f(M.b(77, i10, eVar2));
            this.f38184c.f38186b.onPurchasesUpdated(eVar2, zzco.zzl());
        }
    }
}
