package com.google.android.gms.internal.play_billing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class zzcs {
    private final List zza = new ArrayList();

    public final zzcs zza(zzdh zzdh) {
        if (!zzdh.zzd()) {
            this.zza.add(zzdh);
            return this;
        }
        throw new IllegalArgumentException(zzbf.zza("range must not be empty, but was %s", zzdh));
    }

    /* access modifiers changed from: package-private */
    public final zzcs zzb(zzcs zzcs) {
        for (zzdh zza2 : zzcs.zza) {
            zza(zza2);
        }
        return this;
    }

    public final zzct zzc() {
        zzcy zzcy;
        zzck zzck = new zzck(this.zza.size());
        Collections.sort(this.zza, zzdg.zza);
        Iterator it = this.zza.iterator();
        if (it instanceof zzcy) {
            zzcy = (zzcy) it;
        } else {
            zzcy = new zzcy(it);
        }
        while (zzcy.hasNext()) {
            zzdh zzdh = (zzdh) zzcy.next();
            while (zzcy.hasNext()) {
                zzdh zzdh2 = (zzdh) zzcy.zza();
                if (zzdh.zza.compareTo(zzdh2.zzb) > 0 || zzdh2.zza.compareTo(zzdh.zzb) > 0) {
                    break;
                }
                zzbe.zzd(zzdh.zzb(zzdh2).zzd(), "Overlapping ranges not permitted but found %s overlapping %s", zzdh, zzdh2);
                zzdh = zzdh.zzc((zzdh) zzcy.next());
            }
            zzck.zzd(zzdh);
        }
        zzco zze = zzck.zze();
        if (zze.isEmpty()) {
            return zzct.zzb();
        }
        if (zze.size() == 1) {
            zzdx zzn = zze.listIterator(0);
            Object next = zzn.next();
            if (zzn.hasNext()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("expected one element but was: <");
                sb2.append(next);
                for (int i10 = 0; i10 < 4 && zzn.hasNext(); i10++) {
                    sb2.append(", ");
                    sb2.append(zzn.next());
                }
                if (zzn.hasNext()) {
                    sb2.append(", ...");
                }
                sb2.append('>');
                throw new IllegalArgumentException(sb2.toString());
            } else if (((zzdh) next).equals(zzdh.zza())) {
                return zzct.zza();
            }
        }
        return new zzct(zze);
    }
}
