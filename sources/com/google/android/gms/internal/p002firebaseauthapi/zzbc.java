package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzbc  reason: invalid package */
final class zzbc<K> extends zzav<K> {
    private final transient zzau<K, ?> zza;
    private final transient zzaq<K> zzb;

    zzbc(zzau<K, ?> zzau, zzaq<K> zzaq) {
        this.zza = zzau;
        this.zzb = zzaq;
    }

    public final boolean contains(Object obj) {
        if (this.zza.get(obj) != null) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ Iterator iterator() {
        return iterator();
    }

    public final int size() {
        return this.zza.size();
    }

    /* access modifiers changed from: package-private */
    public final int zza(Object[] objArr, int i10) {
        return zzc().zza(objArr, i10);
    }

    public final zzaq<K> zzc() {
        return this.zzb;
    }

    public final zzbd<K> zzd() {
        return (zzbd) zzc().iterator();
    }

    /* access modifiers changed from: package-private */
    public final boolean zze() {
        return true;
    }
}
