package com.google.android.gms.internal.play_billing;

import java.util.Arrays;
import java.util.Objects;
import java.util.Set;

public abstract class zzcv extends zzcj implements Set {
    private transient zzco zza;

    zzcv() {
    }

    static int zzh(int i10) {
        int max = Math.max(i10, 2);
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1);
            do {
                highestOneBit += highestOneBit;
            } while (((double) highestOneBit) * 0.7d < ((double) max));
            return highestOneBit;
        } else if (max < 1073741824) {
            return 1073741824;
        } else {
            throw new IllegalArgumentException("collection too large");
        }
    }

    /* access modifiers changed from: private */
    public static zzcv zzl(int i10, Object... objArr) {
        if (i10 == 0) {
            return zzdq.zza;
        }
        if (i10 != 1) {
            int zzh = zzh(i10);
            Object[] objArr2 = new Object[zzh];
            int i11 = zzh - 1;
            int i12 = 0;
            int i13 = 0;
            for (int i14 = 0; i14 < i10; i14++) {
                Object obj = objArr[i14];
                zzdd.zza(obj, i14);
                int hashCode = obj.hashCode();
                int zza2 = zzcg.zza(hashCode);
                while (true) {
                    int i15 = zza2 & i11;
                    Object obj2 = objArr2[i15];
                    if (obj2 != null) {
                        if (obj2.equals(obj)) {
                            break;
                        }
                        zza2++;
                    } else {
                        objArr[i13] = obj;
                        objArr2[i15] = obj;
                        i12 += hashCode;
                        i13++;
                        break;
                    }
                }
            }
            Arrays.fill(objArr, i13, i10, (Object) null);
            if (i13 == 1) {
                Object obj3 = objArr[0];
                Objects.requireNonNull(obj3);
                return new zzdt(obj3);
            }
            if (zzh(i13) < zzh / 2) {
                return zzl(i13, objArr);
            }
            int length = objArr.length;
            if (i13 < (length >> 1) + (length >> 2)) {
                objArr = Arrays.copyOf(objArr, i13);
            }
            return new zzdq(objArr, i12, objArr2, i11, i13);
        }
        Object obj4 = objArr[0];
        Objects.requireNonNull(obj4);
        return new zzdt(obj4);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzcv) && zzk() && ((zzcv) obj).zzk() && hashCode() != obj.hashCode()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size() && containsAll(set)) {
                    return true;
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public int hashCode() {
        return zzds.zza(this);
    }

    public zzco zzd() {
        zzco zzco = this.zza;
        if (zzco != null) {
            return zzco;
        }
        zzco zzi = zzi();
        this.zza = zzi;
        return zzi;
    }

    /* renamed from: zze */
    public abstract zzdw iterator();

    /* access modifiers changed from: package-private */
    public zzco zzi() {
        Object[] array = toArray();
        int i10 = zzco.zzd;
        return zzco.zzj(array, array.length);
    }

    /* access modifiers changed from: package-private */
    public boolean zzk() {
        return false;
    }
}
