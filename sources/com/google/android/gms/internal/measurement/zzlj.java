package com.google.android.gms.internal.measurement;

final class zzlj implements zzkr {
    private final zzkt zza;
    private final String zzb;
    private final Object[] zzc;
    private final int zzd;

    zzlj(zzkt zzkt, String str, Object[] objArr) {
        this.zza = zzkt;
        this.zzb = str;
        this.zzc = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.zzd = charAt;
            return;
        }
        char c10 = charAt & 8191;
        int i10 = 13;
        int i11 = 1;
        while (true) {
            int i12 = i11 + 1;
            char charAt2 = str.charAt(i11);
            if (charAt2 >= 55296) {
                c10 |= (charAt2 & 8191) << i10;
                i10 += 13;
                i11 = i12;
            } else {
                this.zzd = c10 | (charAt2 << i10);
                return;
            }
        }
    }

    public final zzkt zza() {
        return this.zza;
    }

    public final zzle zzb() {
        int i10 = this.zzd;
        if ((i10 & 1) != 0) {
            return zzle.PROTO2;
        }
        if ((i10 & 4) == 4) {
            return zzle.EDITIONS;
        }
        return zzle.PROTO3;
    }

    public final boolean zzc() {
        if ((this.zzd & 2) == 2) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final String zzd() {
        return this.zzb;
    }

    /* access modifiers changed from: package-private */
    public final Object[] zze() {
        return this.zzc;
    }
}
