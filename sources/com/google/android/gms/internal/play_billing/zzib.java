package com.google.android.gms.internal.play_billing;

import com.google.android.gms.common.api.a;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class zzib extends zzfx implements RandomAccess, zzho, zzit {
    private static final long[] zza;
    private long[] zzb;
    private int zzc;

    static {
        long[] jArr = new long[0];
        zza = jArr;
        new zzib(jArr, 0, false);
    }

    zzib() {
        this(zza, 0, true);
    }

    private static int zzh(int i10) {
        return Math.max(((i10 * 3) / 2) + 1, 10);
    }

    private final String zzi(int i10) {
        int i11 = this.zzc;
        return "Index:" + i10 + ", Size:" + i11;
    }

    private final void zzj(int i10) {
        if (i10 < 0 || i10 >= this.zzc) {
            throw new IndexOutOfBoundsException(zzi(i10));
        }
    }

    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        long longValue = ((Long) obj).longValue();
        zza();
        if (i10 < 0 || i10 > (i11 = this.zzc)) {
            throw new IndexOutOfBoundsException(zzi(i10));
        }
        int i12 = i10 + 1;
        long[] jArr = this.zzb;
        int length = jArr.length;
        if (i11 < length) {
            System.arraycopy(jArr, i10, jArr, i12, i11 - i10);
        } else {
            long[] jArr2 = new long[zzh(length)];
            System.arraycopy(this.zzb, 0, jArr2, 0, i10);
            System.arraycopy(this.zzb, i10, jArr2, i12, this.zzc - i10);
            this.zzb = jArr2;
        }
        this.zzb[i10] = longValue;
        this.zzc++;
        this.modCount++;
    }

    public final boolean addAll(Collection collection) {
        zza();
        byte[] bArr = zzhp.zzb;
        collection.getClass();
        if (!(collection instanceof zzib)) {
            return super.addAll(collection);
        }
        zzib zzib = (zzib) collection;
        int i10 = zzib.zzc;
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
            System.arraycopy(zzib.zzb, 0, this.zzb, this.zzc, zzib.zzc);
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
        if (!(obj instanceof zzib)) {
            return super.equals(obj);
        }
        zzib zzib = (zzib) obj;
        if (this.zzc != zzib.zzc) {
            return false;
        }
        long[] jArr = zzib.zzb;
        for (int i10 = 0; i10 < this.zzc; i10++) {
            if (this.zzb[i10] != jArr[i10]) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i10) {
        zzj(i10);
        return Long.valueOf(this.zzb[i10]);
    }

    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.zzc; i11++) {
            long j10 = this.zzb[i11];
            byte[] bArr = zzhp.zzb;
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
        zzj(i10);
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
        zzj(i10);
        long[] jArr = this.zzb;
        long j10 = jArr[i10];
        jArr[i10] = longValue;
        return Long.valueOf(j10);
    }

    public final int size() {
        return this.zzc;
    }

    public final /* bridge */ /* synthetic */ zzho zzd(int i10) {
        long[] jArr;
        if (i10 >= this.zzc) {
            if (i10 == 0) {
                jArr = zza;
            } else {
                jArr = Arrays.copyOf(this.zzb, i10);
            }
            return new zzib(jArr, this.zzc, true);
        }
        throw new IllegalArgumentException();
    }

    public final long zze(int i10) {
        zzj(i10);
        return this.zzb[i10];
    }

    public final void zzf(long j10) {
        zza();
        int i10 = this.zzc;
        int length = this.zzb.length;
        if (i10 == length) {
            long[] jArr = new long[zzh(length)];
            System.arraycopy(this.zzb, 0, jArr, 0, this.zzc);
            this.zzb = jArr;
        }
        long[] jArr2 = this.zzb;
        int i11 = this.zzc;
        this.zzc = i11 + 1;
        jArr2[i11] = j10;
    }

    /* access modifiers changed from: package-private */
    public final void zzg(int i10) {
        int length = this.zzb.length;
        if (i10 > length) {
            if (length != 0) {
                while (length < i10) {
                    length = zzh(length);
                }
                this.zzb = Arrays.copyOf(this.zzb, length);
                return;
            }
            this.zzb = new long[Math.max(i10, 10)];
        }
    }

    private zzib(long[] jArr, int i10, boolean z10) {
        super(z10);
        this.zzb = jArr;
        this.zzc = i10;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzf(((Long) obj).longValue());
        return true;
    }
}
