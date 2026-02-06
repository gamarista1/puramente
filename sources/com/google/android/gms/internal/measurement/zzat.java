package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class zzat implements zzaq {
    private final String zza;
    private final ArrayList<zzaq> zzb;

    public zzat(String str, List<zzaq> list) {
        this.zza = str;
        ArrayList<zzaq> arrayList = new ArrayList<>();
        this.zzb = arrayList;
        arrayList.addAll(list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzat)) {
            return false;
        }
        zzat zzat = (zzat) obj;
        String str = this.zza;
        if (str == null ? zzat.zza != null : !str.equals(zzat.zza)) {
            return false;
        }
        ArrayList<zzaq> arrayList = this.zzb;
        ArrayList<zzaq> arrayList2 = zzat.zzb;
        if (arrayList != null) {
            return arrayList.equals(arrayList2);
        }
        if (arrayList2 == null) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        String str = this.zza;
        int i11 = 0;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = i10 * 31;
        ArrayList<zzaq> arrayList = this.zzb;
        if (arrayList != null) {
            i11 = arrayList.hashCode();
        }
        return i12 + i11;
    }

    public final zzaq zza(String str, zzh zzh, List<zzaq> list) {
        throw new IllegalStateException("Statement is not an evaluated entity");
    }

    public final ArrayList<zzaq> zzb() {
        return this.zzb;
    }

    public final zzaq zzc() {
        return this;
    }

    public final Boolean zzd() {
        throw new IllegalStateException("Statement cannot be cast as Boolean");
    }

    public final Double zze() {
        throw new IllegalStateException("Statement cannot be cast as Double");
    }

    public final String zzf() {
        throw new IllegalStateException("Statement cannot be cast as String");
    }

    public final Iterator<zzaq> zzh() {
        return null;
    }

    public final String zza() {
        return this.zza;
    }
}
