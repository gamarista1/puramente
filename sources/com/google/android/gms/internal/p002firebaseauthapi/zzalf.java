package com.google.android.gms.internal.p002firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzalf  reason: invalid package */
final class zzalf implements zzakn {
    private final zzakp zza;
    private final String zzb;
    private final Object[] zzc;
    private final int zzd;

    zzalf(zzakp zzakp, String str, Object[] objArr) {
        this.zza = zzakp;
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

    public final zzakp zza() {
        return this.zza;
    }

    public final zzala zzb() {
        int i10 = this.zzd;
        if ((i10 & 1) != 0) {
            return zzala.PROTO2;
        }
        if ((i10 & 4) == 4) {
            return zzala.EDITIONS;
        }
        return zzala.PROTO3;
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
