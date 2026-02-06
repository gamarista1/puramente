package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzahr  reason: invalid package */
final class zzahr extends zzaht {
    private int zza = 0;
    private final int zzb;
    private final /* synthetic */ zzaho zzc;

    zzahr(zzaho zzaho) {
        this.zzc = zzaho;
        this.zzb = zzaho.zzb();
    }

    public final boolean hasNext() {
        if (this.zza < this.zzb) {
            return true;
        }
        return false;
    }

    public final byte zza() {
        int i10 = this.zza;
        if (i10 < this.zzb) {
            this.zza = i10 + 1;
            return this.zzc.zzb(i10);
        }
        throw new NoSuchElementException();
    }
}
