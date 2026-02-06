package com.google.android.recaptcha.internal;

import java.util.Iterator;
import java.util.List;
import mf.C6559l;
import mf.C6565s;

public final class zzef {
    private List zza = C6565s.n();

    public final long zza(long[] jArr) {
        Iterator it = C6565s.K0(this.zza, C6559l.m1(jArr)).iterator();
        if (it.hasNext()) {
            Object next = it.next();
            while (it.hasNext()) {
                next = Long.valueOf(((Number) next).longValue() ^ ((Number) it.next()).longValue());
            }
            return ((Number) next).longValue();
        }
        throw new UnsupportedOperationException("Empty collection can't be reduced.");
    }

    public final void zzb(long[] jArr) {
        this.zza = C6559l.m1(jArr);
    }
}
