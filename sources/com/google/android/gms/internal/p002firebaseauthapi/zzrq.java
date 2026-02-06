package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzrq  reason: invalid package */
public final class zzrq {
    private ArrayList<zzrt> zza = new ArrayList<>();
    private zzrk zzb = zzrk.zza;
    private Integer zzc = null;

    public final zzrq zza(zzbw zzbw, int i10, String str, String str2) {
        ArrayList<zzrt> arrayList = this.zza;
        if (arrayList != null) {
            arrayList.add(new zzrt(zzbw, i10, str, str2));
            return this;
        }
        throw new IllegalStateException("addEntry cannot be called after build()");
    }

    public final zzrq zza(zzrk zzrk) {
        if (this.zza != null) {
            this.zzb = zzrk;
            return this;
        }
        throw new IllegalStateException("setAnnotations cannot be called after build()");
    }

    public final zzrq zza(int i10) {
        if (this.zza != null) {
            this.zzc = Integer.valueOf(i10);
            return this;
        }
        throw new IllegalStateException("setPrimaryKeyId cannot be called after build()");
    }

    public final zzrr zza() {
        if (this.zza != null) {
            Integer num = this.zzc;
            if (num != null) {
                int intValue = num.intValue();
                ArrayList<zzrt> arrayList = this.zza;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    zzrt zzrt = arrayList.get(i10);
                    i10++;
                    if (zzrt.zza() == intValue) {
                    }
                }
                throw new GeneralSecurityException("primary key ID is not present in entries");
            }
            zzrr zzrr = new zzrr(this.zzb, Collections.unmodifiableList(this.zza), this.zzc);
            this.zza = null;
            return zzrr;
        }
        throw new IllegalStateException("cannot call build() twice");
    }
}
