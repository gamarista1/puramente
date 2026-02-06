package com.google.android.gms.internal.location;

final class zzbq<E> extends zzbo<E> {
    private final zzbs<E> zza;

    zzbq(zzbs<E> zzbs, int i10) {
        super(zzbs.size(), i10);
        this.zza = zzbs;
    }

    /* access modifiers changed from: protected */
    public final E zza(int i10) {
        return this.zza.get(i10);
    }
}
