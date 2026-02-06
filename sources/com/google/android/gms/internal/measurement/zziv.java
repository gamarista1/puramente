package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.api.a;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class zziv extends zzhu<Double> implements zzjt<Double>, zzlf, RandomAccess {
    private double[] zza;
    private int zzb;

    static {
        new zziv(new double[0], 0, false);
    }

    zziv() {
        this(new double[10], 0, true);
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
        double doubleValue = ((Double) obj).doubleValue();
        zza();
        if (i10 < 0 || i10 > (i11 = this.zzb)) {
            throw new IndexOutOfBoundsException(zzc(i10));
        }
        double[] dArr = this.zza;
        if (i11 < dArr.length) {
            System.arraycopy(dArr, i10, dArr, i10 + 1, i11 - i10);
        } else {
            double[] dArr2 = new double[(((i11 * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            System.arraycopy(this.zza, i10, dArr2, i10 + 1, this.zzb - i10);
            this.zza = dArr2;
        }
        this.zza[i10] = doubleValue;
        this.zzb++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Double> collection) {
        zza();
        zzjm.zza(collection);
        if (!(collection instanceof zziv)) {
            return super.addAll(collection);
        }
        zziv zziv = (zziv) collection;
        int i10 = zziv.zzb;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.zzb;
        if (a.e.API_PRIORITY_OTHER - i11 >= i10) {
            int i12 = i11 + i10;
            double[] dArr = this.zza;
            if (i12 > dArr.length) {
                this.zza = Arrays.copyOf(dArr, i12);
            }
            System.arraycopy(zziv.zza, 0, this.zza, this.zzb, zziv.zzb);
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
        if (!(obj instanceof zziv)) {
            return super.equals(obj);
        }
        zziv zziv = (zziv) obj;
        if (this.zzb != zziv.zzb) {
            return false;
        }
        double[] dArr = zziv.zza;
        for (int i10 = 0; i10 < this.zzb; i10++) {
            if (Double.doubleToLongBits(this.zza[i10]) != Double.doubleToLongBits(dArr[i10])) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i10) {
        return Double.valueOf(zzb(i10));
    }

    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.zzb; i11++) {
            i10 = (i10 * 31) + zzjm.zza(Double.doubleToLongBits(this.zza[i11]));
        }
        return i10;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double doubleValue = ((Double) obj).doubleValue();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.zza[i10] == doubleValue) {
                return i10;
            }
        }
        return -1;
    }

    public final /* synthetic */ Object remove(int i10) {
        zza();
        zzd(i10);
        double[] dArr = this.zza;
        double d10 = dArr[i10];
        int i11 = this.zzb;
        if (i10 < i11 - 1) {
            System.arraycopy(dArr, i10 + 1, dArr, i10, (i11 - i10) - 1);
        }
        this.zzb--;
        this.modCount++;
        return Double.valueOf(d10);
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i10, int i11) {
        zza();
        if (i11 >= i10) {
            double[] dArr = this.zza;
            System.arraycopy(dArr, i11, dArr, i10, this.zzb - i11);
            this.zzb -= i11 - i10;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i10, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        zza();
        zzd(i10);
        double[] dArr = this.zza;
        double d10 = dArr[i10];
        dArr[i10] = doubleValue;
        return Double.valueOf(d10);
    }

    public final int size() {
        return this.zzb;
    }

    public final /* synthetic */ zzjt zza(int i10) {
        if (i10 >= this.zzb) {
            return new zziv(Arrays.copyOf(this.zza, i10), this.zzb, true);
        }
        throw new IllegalArgumentException();
    }

    public final double zzb(int i10) {
        zzd(i10);
        return this.zza[i10];
    }

    private zziv(double[] dArr, int i10, boolean z10) {
        super(z10);
        this.zza = dArr;
        this.zzb = i10;
    }

    public final void zza(double d10) {
        zza();
        int i10 = this.zzb;
        double[] dArr = this.zza;
        if (i10 == dArr.length) {
            double[] dArr2 = new double[(((i10 * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            this.zza = dArr2;
        }
        double[] dArr3 = this.zza;
        int i11 = this.zzb;
        this.zzb = i11 + 1;
        dArr3[i11] = d10;
    }

    public final /* synthetic */ boolean add(Object obj) {
        zza(((Double) obj).doubleValue());
        return true;
    }
}
