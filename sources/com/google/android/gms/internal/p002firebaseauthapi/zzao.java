package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzao  reason: invalid package */
class zzao<E> extends zzan<E> {
    Object[] zza = new Object[4];
    int zzb = 0;
    boolean zzc;

    zzao(int i10) {
        zzaj.zza(4, "initialCapacity");
    }

    public zzao<E> zza(E e10) {
        zzz.zza(e10);
        int i10 = this.zzb + 1;
        Object[] objArr = this.zza;
        if (objArr.length < i10) {
            this.zza = Arrays.copyOf(objArr, zzan.zza(objArr.length, i10));
            this.zzc = false;
        } else if (this.zzc) {
            this.zza = (Object[]) objArr.clone();
            this.zzc = false;
        }
        Object[] objArr2 = this.zza;
        int i11 = this.zzb;
        this.zzb = i11 + 1;
        objArr2[i11] = e10;
        return this;
    }
}
