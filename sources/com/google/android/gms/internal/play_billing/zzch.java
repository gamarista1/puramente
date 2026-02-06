package com.google.android.gms.internal.play_billing;

import java.util.Arrays;

class zzch extends zzci {
    Object[] zza;
    int zzb = 0;
    boolean zzc;

    zzch(int i10) {
        zzbw.zza(i10, "initialCapacity");
        this.zza = new Object[i10];
    }

    private final void zzd(int i10) {
        int length = this.zza.length;
        int zzc2 = zzci.zzc(length, this.zzb + i10);
        if (zzc2 > length || this.zzc) {
            this.zza = Arrays.copyOf(this.zza, zzc2);
            this.zzc = false;
        }
    }

    public final zzch zza(Object obj) {
        obj.getClass();
        zzd(1);
        Object[] objArr = this.zza;
        int i10 = this.zzb;
        this.zzb = i10 + 1;
        objArr[i10] = obj;
        return this;
    }

    /* access modifiers changed from: package-private */
    public final void zzb(Object[] objArr, int i10) {
        zzdd.zzb(objArr, i10);
        zzd(i10);
        System.arraycopy(objArr, 0, this.zza, this.zzb, i10);
        this.zzb += i10;
    }
}
