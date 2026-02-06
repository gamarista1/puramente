package com.android.billingclient.api;

import J4.C3038d;
import J4.t;
import android.os.Bundle;
import com.android.billingclient.api.C3198e;
import com.google.android.gms.internal.play_billing.zzad;
import com.google.android.gms.internal.play_billing.zze;
import org.json.JSONException;

/* renamed from: com.android.billingclient.api.y  reason: case insensitive filesystem */
final class C3217y extends zzad {

    /* renamed from: a  reason: collision with root package name */
    final C3038d f38353a;

    /* renamed from: b  reason: collision with root package name */
    final N f38354b;

    /* renamed from: c  reason: collision with root package name */
    final int f38355c;

    /* synthetic */ C3217y(C3038d dVar, N n10, int i10, t tVar) {
        this.f38353a = dVar;
        this.f38354b = n10;
        this.f38355c = i10;
    }

    public final void zza(Bundle bundle) {
        if (bundle == null) {
            N n10 = this.f38354b;
            C3198e eVar = O.f38143k;
            n10.c(M.b(63, 13, eVar), this.f38355c);
            this.f38353a.a(eVar, (C3196c) null);
            return;
        }
        int zzb = zze.zzb(bundle, "BillingClient");
        String zzh = zze.zzh(bundle, "BillingClient");
        C3198e.a c10 = C3198e.c();
        c10.c(zzb);
        c10.b(zzh);
        if (zzb != 0) {
            zze.zzl("BillingClient", "getBillingConfig() failed. Response code: " + zzb);
            C3198e a10 = c10.a();
            this.f38354b.c(M.b(23, 13, a10), this.f38355c);
            this.f38353a.a(a10, (C3196c) null);
        } else if (!bundle.containsKey("BILLING_CONFIG")) {
            zze.zzl("BillingClient", "getBillingConfig() returned a bundle with neither an error nor a billing config response");
            c10.c(6);
            C3198e a11 = c10.a();
            this.f38354b.c(M.b(64, 13, a11), this.f38355c);
            this.f38353a.a(a11, (C3196c) null);
        } else {
            try {
                this.f38353a.a(c10.a(), new C3196c(bundle.getString("BILLING_CONFIG")));
            } catch (JSONException e10) {
                zze.zzm("BillingClient", "Got a JSON exception trying to decode BillingConfig. \n Exception: ", e10);
                N n11 = this.f38354b;
                C3198e eVar2 = O.f38143k;
                n11.c(M.b(65, 13, eVar2), this.f38355c);
                this.f38353a.a(eVar2, (C3196c) null);
            }
        }
    }
}
