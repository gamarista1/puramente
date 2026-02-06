package com.google.android.recaptcha.internal;

import java.util.Iterator;
import java.util.Map;

final class zzji implements Iterator {
    private final Iterator zza;

    public zzji(Iterator it) {
        this.zza = it;
    }

    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.zza.next();
        if (entry.getValue() instanceof zzjj) {
            return new zzjh(entry, (zzjg) null);
        }
        return entry;
    }

    public final void remove() {
        this.zza.remove();
    }
}
