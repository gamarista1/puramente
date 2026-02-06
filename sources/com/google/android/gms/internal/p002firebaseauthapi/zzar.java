package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.List;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzar  reason: invalid package */
final class zzar extends zzaq {
    private final transient int zza;
    private final transient int zzb;
    private final /* synthetic */ zzaq zzc;

    zzar(zzaq zzaq, int i10, int i11) {
        this.zzc = zzaq;
        this.zza = i10;
        this.zzb = i11;
    }

    public final Object get(int i10) {
        zzz.zza(i10, this.zzb);
        return this.zzc.get(i10 + this.zza);
    }

    public final int size() {
        return this.zzb;
    }

    public final /* synthetic */ List subList(int i10, int i11) {
        return subList(i10, i11);
    }

    /* access modifiers changed from: package-private */
    public final int zza() {
        return this.zzc.zzb() + this.zza + this.zzb;
    }

    /* access modifiers changed from: package-private */
    public final int zzb() {
        return this.zzc.zzb() + this.zza;
    }

    /* access modifiers changed from: package-private */
    public final boolean zze() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public final Object[] zzf() {
        return this.zzc.zzf();
    }

    public final zzaq zza(int i10, int i11) {
        zzz.zza(i10, i11, this.zzb);
        zzaq zzaq = this.zzc;
        int i12 = this.zza;
        return (zzaq) zzaq.subList(i10 + i12, i11 + i12);
    }
}
