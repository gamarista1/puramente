package com.google.android.gms.internal.location;

final class zzbt<E> extends zzbs<E> {
    static final zzbs<Object> zza = new zzbt(new Object[0], 0);
    final transient Object[] zzb;
    private final transient int zzc;

    zzbt(Object[] objArr, int i10) {
        this.zzb = objArr;
        this.zzc = i10;
    }

    public final E get(int i10) {
        zzbm.zza(i10, this.zzc, "index");
        return this.zzb[i10];
    }

    public final int size() {
        return this.zzc;
    }

    /* access modifiers changed from: package-private */
    public final Object[] zzb() {
        return this.zzb;
    }

    /* access modifiers changed from: package-private */
    public final int zzc() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    public final int zzd() {
        return this.zzc;
    }

    /* access modifiers changed from: package-private */
    public final boolean zzf() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public final int zzg(Object[] objArr, int i10) {
        System.arraycopy(this.zzb, 0, objArr, 0, this.zzc);
        return this.zzc;
    }
}
