package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzak  reason: invalid package */
abstract class zzak<E> extends zzbg<E> {
    private final int zza;
    private int zzb;

    protected zzak(int i10, int i11) {
        zzz.zzb(i11, i10);
        this.zza = i10;
        this.zzb = i11;
    }

    public final boolean hasNext() {
        if (this.zzb < this.zza) {
            return true;
        }
        return false;
    }

    public final boolean hasPrevious() {
        if (this.zzb > 0) {
            return true;
        }
        return false;
    }

    public final E next() {
        if (hasNext()) {
            int i10 = this.zzb;
            this.zzb = i10 + 1;
            return zza(i10);
        }
        throw new NoSuchElementException();
    }

    public final int nextIndex() {
        return this.zzb;
    }

    public final E previous() {
        if (hasPrevious()) {
            int i10 = this.zzb - 1;
            this.zzb = i10;
            return zza(i10);
        }
        throw new NoSuchElementException();
    }

    public final int previousIndex() {
        return this.zzb - 1;
    }

    /* access modifiers changed from: protected */
    public abstract E zza(int i10);
}
