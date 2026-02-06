package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzwn  reason: invalid package */
final class zzwn implements zzwj {
    private final /* synthetic */ zzdg zza;

    zzwn(zzdg zzdg) {
        this.zza = zzdg;
    }

    public final int zza() {
        return this.zza.zzb() + this.zza.zzc();
    }

    public final zzlx zza(byte[] bArr) {
        return new zzlx(zzws.zza(zzcz.zzb().zza(this.zza).zza(zzxw.zza(Arrays.copyOfRange(bArr, 0, this.zza.zzb()), zzbr.zza())).zzb(zzxw.zza(Arrays.copyOfRange(bArr, this.zza.zzb(), this.zza.zzb() + this.zza.zzc()), zzbr.zza())).zza()));
    }
}
