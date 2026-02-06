package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

@Deprecated
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzamh  reason: invalid package */
public final class zzamh extends AbstractList<String> implements zzajv, RandomAccess {
    /* access modifiers changed from: private */
    public final zzajv zza;

    public zzamh(zzajv zzajv) {
        this.zza = zzajv;
    }

    public final /* synthetic */ Object get(int i10) {
        return (String) this.zza.get(i10);
    }

    public final Iterator<String> iterator() {
        return new zzamj(this);
    }

    public final ListIterator<String> listIterator(int i10) {
        return new zzamk(this, i10);
    }

    public final int size() {
        return this.zza.size();
    }

    public final Object zzb(int i10) {
        return this.zza.zzb(i10);
    }

    public final zzajv zzd() {
        return this;
    }

    public final List<?> zze() {
        return this.zza.zze();
    }

    public final void zza(zzaho zzaho) {
        throw new UnsupportedOperationException();
    }
}
