package com.google.android.gms.internal.play_billing;

import com.android.billingclient.api.C3197d;
import com.revenuecat.purchases.common.Constants;
import java.util.function.Function;

public final /* synthetic */ class zzc implements Function {
    public final /* synthetic */ String zza;

    public /* synthetic */ zzc(String str) {
        this.zza = str;
    }

    public final Object apply(Object obj) {
        int i10 = zze.zza;
        String d10 = ((C3197d.b) obj).b().d();
        zzfk zza2 = zzfl.zza();
        zzfp zza3 = zzfq.zza();
        zza3.zza("subs:" + this.zza + Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR + d10);
        zza2.zza(zza3);
        zzfq.zza();
        throw null;
    }
}
