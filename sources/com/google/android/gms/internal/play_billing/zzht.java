package com.google.android.gms.internal.play_billing;

import java.util.Map;

final class zzht implements Map.Entry {
    private final Map.Entry zza;

    /* synthetic */ zzht(Map.Entry entry, zzhv zzhv) {
        this.zza = entry;
    }

    public final Object getKey() {
        return this.zza.getKey();
    }

    public final Object getValue() {
        if (((zzhw) this.zza.getValue()) == null) {
            return null;
        }
        throw null;
    }

    public final Object setValue(Object obj) {
        if (obj instanceof zzim) {
            return ((zzhw) this.zza.getValue()).zzc((zzim) obj);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }

    public final zzhw zza() {
        return (zzhw) this.zza.getValue();
    }
}
