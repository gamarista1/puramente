package com.google.android.gms.internal.play_billing;

import java.util.Iterator;
import java.util.Map;

final class zzhu implements Iterator {
    private final Iterator zza;

    public zzhu(Iterator it) {
        this.zza = it;
    }

    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.zza.next();
        if (entry.getValue() instanceof zzhw) {
            return new zzht(entry, (zzhv) null);
        }
        return entry;
    }

    public final void remove() {
        this.zza.remove();
    }
}
