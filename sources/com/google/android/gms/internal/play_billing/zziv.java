package com.google.android.gms.internal.play_billing;

import java.util.Arrays;
import java.util.RandomAccess;

final class zziv extends zzfx implements RandomAccess {
    private static final Object[] zza;
    private static final zziv zzb;
    private Object[] zzc;
    private int zzd;

    static {
        Object[] objArr = new Object[0];
        zza = objArr;
        zzb = new zziv(objArr, 0, false);
    }

    zziv() {
        this(zza, 0, true);
    }

    public static zziv zze() {
        return zzb;
    }

    private static int zzg(int i10) {
        return Math.max(((i10 * 3) / 2) + 1, 10);
    }

    private final String zzh(int i10) {
        int i11 = this.zzd;
        return "Index:" + i10 + ", Size:" + i11;
    }

    private final void zzi(int i10) {
        if (i10 < 0 || i10 >= this.zzd) {
            throw new IndexOutOfBoundsException(zzh(i10));
        }
    }

    public final void add(int i10, Object obj) {
        int i11;
        zza();
        if (i10 < 0 || i10 > (i11 = this.zzd)) {
            throw new IndexOutOfBoundsException(zzh(i10));
        }
        int i12 = i10 + 1;
        Object[] objArr = this.zzc;
        int length = objArr.length;
        if (i11 < length) {
            System.arraycopy(objArr, i10, objArr, i12, i11 - i10);
        } else {
            Object[] objArr2 = new Object[zzg(length)];
            System.arraycopy(this.zzc, 0, objArr2, 0, i10);
            System.arraycopy(this.zzc, i10, objArr2, i12, this.zzd - i10);
            this.zzc = objArr2;
        }
        this.zzc[i10] = obj;
        this.zzd++;
        this.modCount++;
    }

    public final Object get(int i10) {
        zzi(i10);
        return this.zzc[i10];
    }

    public final Object remove(int i10) {
        zza();
        zzi(i10);
        Object[] objArr = this.zzc;
        Object obj = objArr[i10];
        int i11 = this.zzd;
        if (i10 < i11 - 1) {
            System.arraycopy(objArr, i10 + 1, objArr, i10, (i11 - i10) - 1);
        }
        this.zzd--;
        this.modCount++;
        return obj;
    }

    public final Object set(int i10, Object obj) {
        zza();
        zzi(i10);
        Object[] objArr = this.zzc;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        this.modCount++;
        return obj2;
    }

    public final int size() {
        return this.zzd;
    }

    public final /* bridge */ /* synthetic */ zzho zzd(int i10) {
        Object[] objArr;
        if (i10 >= this.zzd) {
            if (i10 == 0) {
                objArr = zza;
            } else {
                objArr = Arrays.copyOf(this.zzc, i10);
            }
            return new zziv(objArr, this.zzd, true);
        }
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: package-private */
    public final void zzf(int i10) {
        int length = this.zzc.length;
        if (i10 > length) {
            if (length != 0) {
                while (length < i10) {
                    length = zzg(length);
                }
                this.zzc = Arrays.copyOf(this.zzc, length);
                return;
            }
            this.zzc = new Object[Math.max(i10, 10)];
        }
    }

    private zziv(Object[] objArr, int i10, boolean z10) {
        super(z10);
        this.zzc = objArr;
        this.zzd = i10;
    }

    public final boolean add(Object obj) {
        zza();
        int i10 = this.zzd;
        int length = this.zzc.length;
        if (i10 == length) {
            this.zzc = Arrays.copyOf(this.zzc, zzg(length));
        }
        Object[] objArr = this.zzc;
        int i11 = this.zzd;
        this.zzd = i11 + 1;
        objArr[i11] = obj;
        this.modCount++;
        return true;
    }
}
