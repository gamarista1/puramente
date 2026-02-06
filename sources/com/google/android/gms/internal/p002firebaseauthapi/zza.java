package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Build;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zza  reason: invalid package */
public final class zza {
    public static boolean zza() {
        if (Build.VERSION.SDK_INT >= 33) {
            return true;
        }
        return false;
    }
}
