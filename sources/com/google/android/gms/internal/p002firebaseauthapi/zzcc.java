package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzvg;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzcc  reason: invalid package */
public final class zzcc {
    private final zzvg.zzb zza;

    private zzcc(zzvg.zzb zzb) {
        this.zza = zzb;
    }

    private final synchronized int zza(zzvc zzvc, boolean z10) {
        zzvg.zza zza2;
        zza2 = zza(zzvc);
        this.zza.zza(zza2);
        return zza2.zza();
    }

    public static zzcc zzb() {
        return new zzcc(zzvg.zzc());
    }

    private final synchronized int zzc() {
        int zza2;
        zza2 = zzph.zza();
        while (zzb(zza2)) {
            zza2 = zzph.zza();
        }
        return zza2;
    }

    private final synchronized boolean zzb(int i10) {
        for (zzvg.zza zza2 : this.zza.zzb()) {
            if (zza2.zza() == i10) {
                return true;
            }
        }
        return false;
    }

    public final synchronized zzby zza() {
        return zzby.zza((zzvg) ((zzaje) this.zza.zzf()));
    }

    public final synchronized zzcc zza(zzbv zzbv) {
        zza(zzbv.zza(), false);
        return this;
    }

    public final synchronized zzcc zza(int i10) {
        int i11 = 0;
        while (i11 < this.zza.zza()) {
            zzvg.zza zzb = this.zza.zzb(i11);
            if (zzb.zza() != i10) {
                i11++;
            } else if (zzb.zzc().equals(zzva.ENABLED)) {
                this.zza.zza(i10);
            } else {
                throw new GeneralSecurityException("cannot set key as primary because it's not enabled: " + i10);
            }
        }
        throw new GeneralSecurityException("key not found: " + i10);
        return this;
    }

    public static zzcc zza(zzby zzby) {
        return new zzcc((zzvg.zzb) zzby.zzb().zzn());
    }

    private final synchronized zzvg.zza zza(zzuw zzuw, zzvs zzvs) {
        int zzc;
        zzc = zzc();
        if (zzvs != zzvs.UNKNOWN_PREFIX) {
        } else {
            throw new GeneralSecurityException("unknown output prefix type");
        }
        return (zzvg.zza) ((zzaje) zzvg.zza.zzd().zza(zzuw).zza(zzc).zza(zzva.ENABLED).zza(zzvs).zzf());
    }

    private final synchronized zzvg.zza zza(zzvc zzvc) {
        return zza(zzco.zza(zzvc), zzvc.zzd());
    }
}
