package com.google.android.recaptcha.internal;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import mf.C6559l;
import mf.C6565s;

public final class zzde implements zzdd {
    public static final zzde zza = new zzde();

    private zzde() {
    }

    private static final List zzc(Object obj) {
        if (obj instanceof byte[]) {
            return C6559l.h1((byte[]) obj);
        }
        if (obj instanceof short[]) {
            return C6559l.o1((short[]) obj);
        }
        if (obj instanceof int[]) {
            return C6559l.l1((int[]) obj);
        }
        if (obj instanceof long[]) {
            return C6559l.m1((long[]) obj);
        }
        if (obj instanceof float[]) {
            return C6559l.k1((float[]) obj);
        }
        if (!(obj instanceof double[])) {
            return null;
        }
        return C6559l.j1((double[]) obj);
    }

    public final void zza(int i10, zzcj zzcj, zzpq... zzpqArr) {
        if (zzpqArr.length == 2) {
            Object zza2 = zzcj.zzc().zza(zzpqArr[0]);
            if (true != Objects.nonNull(zza2)) {
                zza2 = null;
            }
            if (zza2 != null) {
                Object zza3 = zzcj.zzc().zza(zzpqArr[1]);
                if (true != Objects.nonNull(zza3)) {
                    zza3 = null;
                }
                if (zza3 != null) {
                    zzcj.zzc().zzf(i10, zzb(zza2, zza3));
                    return;
                }
                throw new zzae(4, 5, (Throwable) null);
            }
            throw new zzae(4, 5, (Throwable) null);
        }
        throw new zzae(4, 3, (Throwable) null);
    }

    public final Object zzb(Object obj, Object obj2) {
        List<Number> zzc = zzc(obj);
        List<Number> zzc2 = zzc(obj2);
        if (obj instanceof Number) {
            if (obj2 instanceof Number) {
                return Double.valueOf(Math.pow(((Number) obj).doubleValue(), ((Number) obj2).doubleValue()));
            }
            if (zzc2 != null) {
                ArrayList arrayList = new ArrayList(C6565s.y(zzc2, 10));
                for (Number doubleValue : zzc2) {
                    arrayList.add(Double.valueOf(Math.pow(doubleValue.doubleValue(), ((Number) obj).doubleValue())));
                }
                return arrayList.toArray(new Double[0]);
            }
        }
        if (zzc != null && (obj2 instanceof Number)) {
            ArrayList arrayList2 = new ArrayList(C6565s.y(zzc, 10));
            for (Number doubleValue2 : zzc) {
                arrayList2.add(Double.valueOf(Math.pow(doubleValue2.doubleValue(), ((Number) obj2).doubleValue())));
            }
            return arrayList2.toArray(new Double[0]);
        } else if (zzc == null || zzc2 == null) {
            throw new zzae(4, 5, (Throwable) null);
        } else {
            zzdc.zza(this, zzc.size(), zzc2.size());
            int size = zzc.size();
            Double[] dArr = new Double[size];
            for (int i10 = 0; i10 < size; i10++) {
                dArr[i10] = Double.valueOf(Math.pow(((Number) zzc.get(i10)).doubleValue(), ((Number) zzc2.get(i10)).doubleValue()));
            }
            return dArr;
        }
    }
}
