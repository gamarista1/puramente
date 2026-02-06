package com.google.android.recaptcha.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mf.C6559l;
import mf.C6565s;

public final class zzct implements zzdd {
    public static final zzct zza = new zzct();

    private zzct() {
    }

    private static final boolean zzb(List list) {
        ArrayList arrayList = new ArrayList(C6565s.y(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Boolean.valueOf(((zzpq) it.next()).zzN()));
        }
        if (!arrayList.contains(Boolean.FALSE)) {
            return true;
        }
        return false;
    }

    public final void zza(int i10, zzcj zzcj, zzpq... zzpqArr) {
        if (zzb(C6559l.n1(zzpqArr))) {
            for (zzpq zzi : zzpqArr) {
                zzcj.zzc().zzb(zzi.zzi());
            }
            return;
        }
        throw new zzae(4, 5, (Throwable) null);
    }
}
