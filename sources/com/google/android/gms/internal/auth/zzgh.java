package com.google.android.gms.internal.auth;

final class zzgh implements zzfu {
    private final zzfx zza;
    private final String zzb = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a";
    private final Object[] zzc;
    private final int zzd;

    zzgh(zzfx zzfx, String str, Object[] objArr) {
        this.zza = zzfx;
        this.zzc = objArr;
        char charAt = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a".charAt(0);
        if (charAt < 55296) {
            this.zzd = charAt;
            return;
        }
        char c10 = charAt & 8191;
        int i10 = 1;
        int i11 = 13;
        while (true) {
            int i12 = i10 + 1;
            char charAt2 = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a".charAt(i10);
            if (charAt2 >= 55296) {
                c10 |= (charAt2 & 8191) << i11;
                i11 += 13;
                i10 = i12;
            } else {
                this.zzd = (charAt2 << i11) | c10;
                return;
            }
        }
    }

    public final zzfx zza() {
        return this.zza;
    }

    public final boolean zzb() {
        return (this.zzd & 2) == 2;
    }

    public final int zzc() {
        return (this.zzd & 1) != 0 ? 1 : 2;
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
