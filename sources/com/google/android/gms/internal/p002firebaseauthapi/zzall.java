package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzall  reason: invalid package */
final class zzall extends zzali {
    zzall(int i10) {
        super(i10);
    }

    public final void zzd() {
        if (!zze()) {
            for (int i10 = 0; i10 < zza(); i10++) {
                Map.Entry zzb = zzb(i10);
                if (((zzaiz) zzb.getKey()).zze()) {
                    zzb.setValue(Collections.unmodifiableList((List) zzb.getValue()));
                }
            }
            for (Map.Entry entry : zzb()) {
                if (((zzaiz) entry.getKey()).zze()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.zzd();
    }
}
