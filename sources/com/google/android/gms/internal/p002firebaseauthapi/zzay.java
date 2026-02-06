package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Objects;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzay  reason: invalid package */
final class zzay<E> extends zzaq<E> {
    static final zzaq<Object> zza = new zzay(new Object[0], 0);
    private final transient Object[] zzb;
    private final transient int zzc;

    zzay(Object[] objArr, int i10) {
        this.zzb = objArr;
        this.zzc = i10;
    }

    public final E get(int i10) {
        zzz.zza(i10, this.zzc);
        E e10 = this.zzb[i10];
        Objects.requireNonNull(e10);
        return e10;
    }

    public final int size() {
        return this.zzc;
    }

    /* access modifiers changed from: package-private */
    public final int zza(Object[] objArr, int i10) {
        System.arraycopy(this.zzb, 0, objArr, i10, this.zzc);
        return i10 + this.zzc;
    }

    /* access modifiers changed from: package-private */
    public final int zzb() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    public final boolean zze() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public final Object[] zzf() {
        return this.zzb;
    }

    /* access modifiers changed from: package-private */
    public final int zza() {
        return this.zzc;
    }
}
