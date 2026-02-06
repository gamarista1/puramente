package com.google.android.gms.internal.play_billing;

import java.util.Objects;

final class zzdk extends zzco {
    static final zzco zza = new zzdk(new Object[0], 0);
    final transient Object[] zzb;
    private final transient int zzc;

    zzdk(Object[] objArr, int i10) {
        this.zzb = objArr;
        this.zzc = i10;
    }

    public final Object get(int i10) {
        zzbe.zza(i10, this.zzc, "index");
        Object obj = this.zzb[i10];
        Objects.requireNonNull(obj);
        return obj;
    }

    public final int size() {
        return this.zzc;
    }

    /* access modifiers changed from: package-private */
    public final int zza(Object[] objArr, int i10) {
        System.arraycopy(this.zzb, 0, objArr, 0, this.zzc);
        return this.zzc;
    }

    /* access modifiers changed from: package-private */
    public final int zzb() {
        return this.zzc;
    }

    /* access modifiers changed from: package-private */
    public final int zzc() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    public final boolean zzf() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public final Object[] zzg() {
        return this.zzb;
    }
}
