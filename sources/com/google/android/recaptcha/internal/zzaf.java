package com.google.android.recaptcha.internal;

import android.content.Context;
import android.os.Build;
import com.google.android.gms.common.b;

public final class zzaf {
    public static final zzaf zza = new zzaf();
    private static final String zzb = String.valueOf(Build.VERSION.SDK_INT);
    private static final b zzc = b.f();

    private zzaf() {
    }

    public static final String zza(Context context) {
        int g10 = zzc.g(context);
        if (g10 == 1 || g10 == 3 || g10 == 9) {
            return "ANDROID_OFFPLAY";
        }
        return "ANDROID_ONPLAY";
    }
}
