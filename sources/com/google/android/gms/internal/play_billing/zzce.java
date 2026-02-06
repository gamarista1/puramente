package com.google.android.gms.internal.play_billing;

import java.io.Serializable;

abstract class zzce implements Comparable, Serializable {
    final Comparable zza = "";

    zzce(Comparable comparable) {
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzce) {
            try {
                if (compareTo((zzce) obj) == 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    public abstract int hashCode();

    /* renamed from: zza */
    public int compareTo(zzce zzce) {
        if (zzce == zzcd.zzb) {
            return 1;
        }
        if (zzce == zzcb.zzb) {
            return -1;
        }
        Comparable comparable = zzce.zza;
        int i10 = zzdh.zzc;
        int compareTo = "".compareTo("");
        if (compareTo != 0) {
            return compareTo;
        }
        return Boolean.compare(this instanceof zzcc, zzce instanceof zzcc);
    }

    /* access modifiers changed from: package-private */
    public abstract void zzc(StringBuilder sb2);

    /* access modifiers changed from: package-private */
    public abstract void zzd(StringBuilder sb2);
}
