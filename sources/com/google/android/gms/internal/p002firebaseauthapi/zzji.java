package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzji  reason: invalid package */
public final class zzji implements zzbq {
    private final zzbq zza;
    private final zzvs zzb;
    private final byte[] zzc;

    private zzji(zzbq zzbq, zzvs zzvs, byte[] bArr) {
        this.zza = zzbq;
        this.zzb = zzvs;
        this.zzc = bArr;
    }

    public static zzbq zza(zzna zzna) {
        byte[] bArr;
        zzou zza2 = zzna.zza(zzbr.zza());
        zzoy.zza();
        zzbq zzbq = (zzbq) zzoy.zza((zzuw) ((zzaje) zzuw.zza().zza(zza2.zzf()).zza(zza2.zzd()).zza(zza2.zza()).zzf()), zzbq.class);
        zzvs zzc2 = zza2.zzc();
        int i10 = zzjl.zza[zzc2.ordinal()];
        if (i10 == 1) {
            bArr = zznt.zza.zzb();
        } else if (i10 == 2 || i10 == 3) {
            bArr = zznt.zza(zzna.zza().intValue()).zzb();
        } else if (i10 == 4) {
            bArr = zznt.zzb(zzna.zza().intValue()).zzb();
        } else {
            int zza3 = zzc2.zza();
            throw new GeneralSecurityException("unknown output prefix type " + zza3);
        }
        return new zzji(zzbq, zzc2, bArr);
    }

    public final byte[] zza(byte[] bArr, byte[] bArr2) {
        if (this.zzb == zzvs.RAW) {
            return this.zza.zza(bArr, bArr2);
        }
        if (zzph.zza(this.zzc, bArr)) {
            return this.zza.zza(Arrays.copyOfRange(bArr, 5, bArr.length), bArr2);
        }
        throw new GeneralSecurityException("wrong prefix");
    }
}
