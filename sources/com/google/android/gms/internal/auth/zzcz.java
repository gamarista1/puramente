package com.google.android.gms.internal.auth;

import android.net.Uri;

public final class zzcz {
    final Uri zza;
    final String zzb;
    final String zzc;
    final boolean zzd;
    final boolean zze;

    private zzcz(String str, Uri uri, String str2, String str3, boolean z10, boolean z11, boolean z12, boolean z13, zzdg zzdg) {
        this.zza = uri;
        this.zzb = "";
        this.zzc = "";
        this.zzd = z10;
        this.zze = z12;
    }

    public final zzcz zza() {
        return new zzcz((String) null, this.zza, this.zzb, this.zzc, this.zzd, false, true, false, (zzdg) null);
    }

    public final zzcz zzb() {
        if (this.zzb.isEmpty()) {
            return new zzcz((String) null, this.zza, this.zzb, this.zzc, true, false, this.zze, false, (zzdg) null);
        }
        throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
    }

    public final zzdc zzc(String str, double d10) {
        return new zzcx(this, str, Double.valueOf(0.0d), true);
    }

    public final zzdc zzd(String str, long j10) {
        return new zzcv(this, str, Long.valueOf(j10), true);
    }

    public final zzdc zze(String str, boolean z10) {
        return new zzcw(this, str, Boolean.valueOf(z10), true);
    }

    public final zzdc zzf(String str, Object obj, zzhy zzhy) {
        return new zzcy(this, "getTokenRefactor__blocked_packages", obj, true, zzhy);
    }

    public zzcz(Uri uri) {
        this((String) null, uri, "", "", false, false, false, false, (zzdg) null);
    }
}
