package com.android.billingclient.api;

import com.google.android.gms.internal.play_billing.zzbf;
import com.google.android.gms.internal.play_billing.zze;
import com.google.android.gms.internal.play_billing.zzjx;
import com.google.android.gms.internal.play_billing.zzjz;
import com.google.android.gms.internal.play_billing.zzkb;
import com.google.android.gms.internal.play_billing.zzkd;
import com.google.android.gms.internal.play_billing.zzke;
import com.google.android.gms.internal.play_billing.zzki;
import com.revenuecat.purchases.common.Constants;

public abstract /* synthetic */ class M {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f38124a = 0;

    static {
        int i10 = N.f38125a;
    }

    public static String a(Exception exc) {
        if (exc == null) {
            return null;
        }
        try {
            String str = exc.getClass().getSimpleName() + Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR + zzbf.zzb(exc.getMessage());
            int i10 = zze.zza;
            if (str.length() > 40) {
                return str.substring(0, 40);
            }
            return str;
        } catch (Throwable th2) {
            zze.zzm("BillingLogger", "Unable to get truncated exception info", th2);
            return null;
        }
    }

    public static zzjz b(int i10, int i11, C3198e eVar) {
        try {
            zzjx zzc = zzjz.zzc();
            zzke zzc2 = zzki.zzc();
            zzc2.zzn(eVar.b());
            zzc2.zzm(eVar.a());
            zzc2.zzo(i10);
            zzc.zza(zzc2);
            zzc.zzn(i11);
            return (zzjz) zzc.zzf();
        } catch (Exception e10) {
            zze.zzm("BillingLogger", "Unable to create logging payload", e10);
            return null;
        }
    }

    public static zzjz c(int i10, int i11, C3198e eVar, String str) {
        try {
            zzke zzc = zzki.zzc();
            zzc.zzn(eVar.b());
            zzc.zzm(eVar.a());
            zzc.zzo(i10);
            if (str != null) {
                zzc.zza(str);
            }
            zzjx zzc2 = zzjz.zzc();
            zzc2.zza(zzc);
            zzc2.zzn(i11);
            return (zzjz) zzc2.zzf();
        } catch (Throwable th2) {
            zze.zzm("BillingLogger", "Unable to create logging payload", th2);
            return null;
        }
    }

    public static zzkd d(int i10) {
        try {
            zzkb zzc = zzkd.zzc();
            zzc.zzn(i10);
            return (zzkd) zzc.zzf();
        } catch (Exception e10) {
            zze.zzm("BillingLogger", "Unable to create logging payload", e10);
            return null;
        }
    }
}
