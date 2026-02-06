package com.google.android.gms.internal.p002firebaseauthapi;

import android.content.Context;
import com.google.android.gms.common.b;
import com.google.android.gms.common.d;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaco  reason: invalid package */
public final class zzaco {
    private static Boolean zza;

    public static boolean zza(Context context) {
        boolean z10;
        if (zza == null) {
            int h10 = b.f().h(context, d.f54103a);
            if (h10 == 0 || h10 == 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            zza = Boolean.valueOf(z10);
        }
        return zza.booleanValue();
    }
}
