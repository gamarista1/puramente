package com.google.android.gms.internal.play_billing;

import com.google.android.gms.common.api.a;

final class zzgl extends zzgn {
    private int zzb = 0;
    private int zzc;
    private int zzd = a.e.API_PRIORITY_OTHER;

    /* synthetic */ zzgl(byte[] bArr, int i10, int i11, boolean z10, zzgm zzgm) {
        super((zzgm) null);
    }

    public final int zza(int i10) {
        int i11 = this.zzd;
        this.zzd = 0;
        int i12 = this.zzb + this.zzc;
        this.zzb = i12;
        if (i12 > 0) {
            this.zzc = i12;
            this.zzb = 0;
        } else {
            this.zzc = 0;
        }
        return i11;
    }
}
