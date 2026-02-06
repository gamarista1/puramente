package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.api.a;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class zzhy extends zzhu<Boolean> implements zzjt<Boolean>, zzlf, RandomAccess {
    private boolean[] zza;
    private int zzb;

    static {
        new zzhy(new boolean[0], 0, false);
    }

    zzhy() {
        this(new boolean[10], 0, true);
    }

    private final String zzc(int i10) {
        int i11 = this.zzb;
        return "Index:" + i10 + ", Size:" + i11;
    }

    private final void zzd(int i10) {
        if (i10 < 0 || i10 >= this.zzb) {
            throw new IndexOutOfBoundsException(zzc(i10));
        }
    }

    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        zza();
        if (i10 < 0 || i10 > (i11 = this.zzb)) {
            throw new IndexOutOfBoundsException(zzc(i10));
        }
        boolean[] zArr = this.zza;
        if (i11 < zArr.length) {
            System.arraycopy(zArr, i10, zArr, i10 + 1, i11 - i10);
        } else {
            boolean[] zArr2 = new boolean[(((i11 * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            System.arraycopy(this.zza, i10, zArr2, i10 + 1, this.zzb - i10);
            this.zza = zArr2;
        }
        this.zza[i10] = booleanValue;
        this.zzb++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Boolean> collection) {
        zza();
        zzjm.zza(collection);
        if (!(collection instanceof zzhy)) {
            return super.addAll(collection);
        }
        zzhy zzhy = (zzhy) collection;
        int i10 = zzhy.zzb;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.zzb;
        if (a.e.API_PRIORITY_OTHER - i11 >= i10) {
            int i12 = i11 + i10;
            boolean[] zArr = this.zza;
            if (i12 > zArr.length) {
                this.zza = Arrays.copyOf(zArr, i12);
            }
            System.arraycopy(zzhy.zza, 0, this.zza, this.zzb, zzhy.zzb);
            this.zzb = i12;
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
        if (!(obj instanceof zzhy)) {
            return super.equals(obj);
        }
        zzhy zzhy = (zzhy) obj;
        if (this.zzb != zzhy.zzb) {
            return false;
        }
        boolean[] zArr = zzhy.zza;
        for (int i10 = 0; i10 < this.zzb; i10++) {
            if (this.zza[i10] != zArr[i10]) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i10) {
        return Boolean.valueOf(zzb(i10));
    }

    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.zzb; i11++) {
            i10 = (i10 * 31) + zzjm.zza(this.zza[i11]);
        }
        return i10;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.zza[i10] == booleanValue) {
                return i10;
            }
        }
        return -1;
    }

    public final /* synthetic */ Object remove(int i10) {
        zza();
        zzd(i10);
        boolean[] zArr = this.zza;
        boolean z10 = zArr[i10];
        int i11 = this.zzb;
        if (i10 < i11 - 1) {
            System.arraycopy(zArr, i10 + 1, zArr, i10, (i11 - i10) - 1);
        }
        this.zzb--;
        this.modCount++;
        return Boolean.valueOf(z10);
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i10, int i11) {
        zza();
        if (i11 >= i10) {
            boolean[] zArr = this.zza;
            System.arraycopy(zArr, i11, zArr, i10, this.zzb - i11);
            this.zzb -= i11 - i10;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i10, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        zza();
        zzd(i10);
        boolean[] zArr = this.zza;
        boolean z10 = zArr[i10];
        zArr[i10] = booleanValue;
        return Boolean.valueOf(z10);
    }

    public final int size() {
        return this.zzb;
    }

    public final /* synthetic */ zzjt zza(int i10) {
        if (i10 >= this.zzb) {
            return new zzhy(Arrays.copyOf(this.zza, i10), this.zzb, true);
        }
        throw new IllegalArgumentException();
    }

    public final boolean zzb(int i10) {
        zzd(i10);
        return this.zza[i10];
    }

    private zzhy(boolean[] zArr, int i10, boolean z10) {
        super(z10);
        this.zza = zArr;
        this.zzb = i10;
    }

    public final void zza(boolean z10) {
        zza();
        int i10 = this.zzb;
        boolean[] zArr = this.zza;
        if (i10 == zArr.length) {
            boolean[] zArr2 = new boolean[(((i10 * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            this.zza = zArr2;
        }
        boolean[] zArr3 = this.zza;
        int i11 = this.zzb;
        this.zzb = i11 + 1;
        zArr3[i11] = z10;
    }

    public final /* synthetic */ boolean add(Object obj) {
        zza(((Boolean) obj).booleanValue());
        return true;
    }
}
