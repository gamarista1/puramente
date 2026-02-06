package com.google.android.gms.internal.p002firebaseauthapi;

import Ba.C4246a;
import com.google.android.gms.tasks.OnFailureListener;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzadz  reason: invalid package */
final class zzadz implements OnFailureListener {
    zzadz(zzadx zzadx) {
    }

    public final void onFailure(Exception exc) {
        C4246a zza = zzadx.zza;
        String message = exc.getMessage();
        zza.c("SmsRetrieverClient failed to start: " + message, new Object[0]);
    }
}
