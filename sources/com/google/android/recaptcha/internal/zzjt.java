package com.google.android.recaptcha.internal;

import com.google.android.gms.common.api.a;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class zzjt extends zzgh implements RandomAccess, zzja, zzkm {
    private static final zzjt zza = new zzjt(new long[0], 0, false);
    private long[] zzb;
    private int zzc;

    zzjt() {
        this(new long[10], 0, true);
    }

    public static zzjt zzf() {
        return zza;
    }

    private final String zzh(int i10) {
        int i11 = this.zzc;
        return "Index:" + i10 + ", Size:" + i11;
    }

    private final void zzi(int i10) {
        if (i10 < 0 || i10 >= this.zzc) {
            throw new IndexOutOfBoundsException(zzh(i10));
        }
    }

    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        long longValue = ((Long) obj).longValue();
        zza();
        if (i10 < 0 || i10 > (i11 = this.zzc)) {
            throw new IndexOutOfBoundsException(zzh(i10));
        }
        int i12 = i10 + 1;
        long[] jArr = this.zzb;
        if (i11 < jArr.length) {
            System.arraycopy(jArr, i10, jArr, i12, i11 - i10);
        } else {
            long[] jArr2 = new long[(((i11 * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            System.arraycopy(this.zzb, i10, jArr2, i12, this.zzc - i10);
            this.zzb = jArr2;
        }
        this.zzb[i10] = longValue;
        this.zzc++;
        this.modCount++;
    }

    public final boolean addAll(Collection collection) {
        zza();
        byte[] bArr = zzjc.zzd;
        collection.getClass();
        if (!(collection instanceof zzjt)) {
            return super.addAll(collection);
        }
        zzjt zzjt = (zzjt) collection;
        int i10 = zzjt.zzc;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.zzc;
        if (a.e.API_PRIORITY_OTHER - i11 >= i10) {
            int i12 = i11 + i10;
            long[] jArr = this.zzb;
            if (i12 > jArr.length) {
                this.zzb = Arrays.copyOf(jArr, i12);
            }
            System.arraycopy(zzjt.zzb, 0, this.zzb, this.zzc, zzjt.zzc);
            this.zzc = i12;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzjt)) {
            return super.equals(obj);
        }
        zzjt zzjt = (zzjt) obj;
        if (this.zzc != zzjt.zzc) {
            return false;
        }
        long[] jArr = zzjt.zzb;
        for (int i10 = 0; i10 < this.zzc; i10++) {
            if (this.zzb[i10] != jArr[i10]) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i10) {
        zzi(i10);
        return Long.valueOf(this.zzb[i10]);
    }

    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.zzc; i11++) {
            long j10 = this.zzb[i11];
            byte[] bArr = zzjc.zzd;
            i10 = (i10 * 31) + ((int) (j10 ^ (j10 >>> 32)));
        }
        return i10;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int i10 = this.zzc;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.zzb[i11] == longValue) {
                return i11;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        zza();
        zzi(i10);
        long[] jArr = this.zzb;
        long j10 = jArr[i10];
        int i11 = this.zzc;
        if (i10 < i11 - 1) {
            System.arraycopy(jArr, i10 + 1, jArr, i10, (i11 - i10) - 1);
        }
        this.zzc--;
        this.modCount++;
        return Long.valueOf(j10);
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i10, int i11) {
        zza();
        if (i11 >= i10) {
            long[] jArr = this.zzb;
            System.arraycopy(jArr, i11, jArr, i10, this.zzc - i11);
            this.zzc -= i11 - i10;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        long longValue = ((Long) obj).longValue();
        zza();
        zzi(i10);
        long[] jArr = this.zzb;
        long j10 = jArr[i10];
        jArr[i10] = longValue;
        return Long.valueOf(j10);
    }

    public final int size() {
        return this.zzc;
    }

    public final /* bridge */ /* synthetic */ zzjb zzd(int i10) {
        if (i10 >= this.zzc) {
            return new zzjt(Arrays.copyOf(this.zzb, i10), this.zzc, true);
        }
        throw new IllegalArgumentException();
    }

    public final long zze(int i10) {
        zzi(i10);
        return this.zzb[i10];
    }

    public final void zzg(long j10) {
        zza();
        int i10 = this.zzc;
        long[] jArr = this.zzb;
        if (i10 == jArr.length) {
            long[] jArr2 = new long[(((i10 * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            this.zzb = jArr2;
        }
        long[] jArr3 = this.zzb;
        int i11 = this.zzc;
        this.zzc = i11 + 1;
        jArr3[i11] = j10;
    }

    private zzjt(long[] jArr, int i10, boolean z10) {
        super(z10);
        this.zzb = jArr;
        this.zzc = i10;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzg(((Long) obj).longValue());
        return true;
    }
}
