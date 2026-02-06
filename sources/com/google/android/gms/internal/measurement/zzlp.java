package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;
import java.util.Map;

final class zzlp extends zzlm {
    zzlp() {
        super();
    }

    public final void zzd() {
        if (!zze()) {
            for (int i10 = 0; i10 < zza(); i10++) {
                Map.Entry zza = zza(i10);
                if (((zzjf) zza.getKey()).zze()) {
                    zza.setValue(Collections.unmodifiableList((List) zza.getValue()));
                }
            }
            for (Map.Entry entry : zzb()) {
                if (((zzjf) entry.getKey()).zze()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.zzd();
    }
}
