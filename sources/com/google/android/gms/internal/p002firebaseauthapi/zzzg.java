package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.C0;
import com.google.firebase.auth.O;
import io.intercom.android.sdk.models.AttributeType;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzzg  reason: invalid package */
final class zzzg implements zzadm<zzaha> {
    private final /* synthetic */ zzadm zza;
    private final /* synthetic */ zzzd zzb;

    zzzg(zzzd zzzd, zzadm zzadm) {
        this.zza = zzadm;
        this.zzb = zzzd;
    }

    public final void zza(String str) {
        this.zza.zza(str);
    }

    public final /* synthetic */ void zza(Object obj) {
        zzaha zzaha = (zzaha) obj;
        if (!TextUtils.isEmpty(zzaha.zze())) {
            this.zzb.zza.zza(new Status(17025), O.u0(zzaha.zzc(), zzaha.zze()));
            return;
        }
        this.zzb.zzb.zza(new zzafm(zzaha.zzd(), zzaha.zzb(), Long.valueOf(zzaha.zza()), "Bearer"), (String) null, AttributeType.PHONE, Boolean.valueOf(zzaha.zzf()), (C0) null, this.zzb.zza, this.zza);
    }
}
