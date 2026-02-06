package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.api.a;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class zzjj extends zzhu<Float> implements zzjt<Float>, zzlf, RandomAccess {
    private float[] zza;
    private int zzb;

    static {
        new zzjj(new float[0], 0, false);
    }

    zzjj() {
        this(new float[10], 0, true);
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
        float floatValue = ((Float) obj).floatValue();
        zza();
        if (i10 < 0 || i10 > (i11 = this.zzb)) {
            throw new IndexOutOfBoundsException(zzc(i10));
        }
        float[] fArr = this.zza;
        if (i11 < fArr.length) {
            System.arraycopy(fArr, i10, fArr, i10 + 1, i11 - i10);
        } else {
            float[] fArr2 = new float[(((i11 * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            System.arraycopy(this.zza, i10, fArr2, i10 + 1, this.zzb - i10);
            this.zza = fArr2;
        }
        this.zza[i10] = floatValue;
        this.zzb++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Float> collection) {
        zza();
        zzjm.zza(collection);
        if (!(collection instanceof zzjj)) {
            return super.addAll(collection);
        }
        zzjj zzjj = (zzjj) collection;
        int i10 = zzjj.zzb;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.zzb;
        if (a.e.API_PRIORITY_OTHER - i11 >= i10) {
            int i12 = i11 + i10;
            float[] fArr = this.zza;
            if (i12 > fArr.length) {
                this.zza = Arrays.copyOf(fArr, i12);
            }
            System.arraycopy(zzjj.zza, 0, this.zza, this.zzb, zzjj.zzb);
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
        if (!(obj instanceof zzjj)) {
            return super.equals(obj);
        }
        zzjj zzjj = (zzjj) obj;
        if (this.zzb != zzjj.zzb) {
            return false;
        }
        float[] fArr = zzjj.zza;
        for (int i10 = 0; i10 < this.zzb; i10++) {
            if (Float.floatToIntBits(this.zza[i10]) != Float.floatToIntBits(fArr[i10])) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i10) {
        return Float.valueOf(zzb(i10));
    }

    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.zzb; i11++) {
            i10 = (i10 * 31) + Float.floatToIntBits(this.zza[i11]);
        }
        return i10;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.zza[i10] == floatValue) {
                return i10;
            }
        }
        return -1;
    }

    public final /* synthetic */ Object remove(int i10) {
        zza();
        zzd(i10);
        float[] fArr = this.zza;
        float f10 = fArr[i10];
        int i11 = this.zzb;
        if (i10 < i11 - 1) {
            System.arraycopy(fArr, i10 + 1, fArr, i10, (i11 - i10) - 1);
        }
        this.zzb--;
        this.modCount++;
        return Float.valueOf(f10);
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i10, int i11) {
        zza();
        if (i11 >= i10) {
            float[] fArr = this.zza;
            System.arraycopy(fArr, i11, fArr, i10, this.zzb - i11);
            this.zzb -= i11 - i10;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i10, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        zza();
        zzd(i10);
        float[] fArr = this.zza;
        float f10 = fArr[i10];
        fArr[i10] = floatValue;
        return Float.valueOf(f10);
    }

    public final int size() {
        return this.zzb;
    }

    public final /* synthetic */ zzjt zza(int i10) {
        if (i10 >= this.zzb) {
            return new zzjj(Arrays.copyOf(this.zza, i10), this.zzb, true);
        }
        throw new IllegalArgumentException();
    }

    public final float zzb(int i10) {
        zzd(i10);
        return this.zza[i10];
    }

    private zzjj(float[] fArr, int i10, boolean z10) {
        super(z10);
        this.zza = fArr;
        this.zzb = i10;
    }

    public final void zza(float f10) {
        zza();
        int i10 = this.zzb;
        float[] fArr = this.zza;
        if (i10 == fArr.length) {
            float[] fArr2 = new float[(((i10 * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            this.zza = fArr2;
        }
        float[] fArr3 = this.zza;
        int i11 = this.zzb;
        this.zzb = i11 + 1;
        fArr3[i11] = f10;
    }

    public final /* synthetic */ boolean add(Object obj) {
        zza(((Float) obj).floatValue());
        return true;
    }
}
