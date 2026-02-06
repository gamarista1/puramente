package com.google.android.gms.internal.p002firebaseauthapi;

import Ea.c;
import com.adjust.sdk.Constants;
import com.google.android.gms.common.internal.C4536s;
import java.io.UnsupportedEncodingException;
import java.util.List;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzafo  reason: invalid package */
public final class zzafo {
    public static long zza(String str) {
        zzafr zzb = zzb(str);
        return zzb.zza().longValue() - zzb.zzb().longValue();
    }

    private static zzafr zzb(String str) {
        C4536s.f(str);
        List<String> zza = zzac.zza('.').zza((CharSequence) str);
        if (zza.size() >= 2) {
            try {
                return zzafr.zza(new String(c.b(zza.get(1)), Constants.ENCODING));
            } catch (UnsupportedEncodingException e10) {
                throw new RuntimeException("Unable to decode token", e10);
            }
        } else {
            throw new RuntimeException("Invalid idToken " + str);
        }
    }
}
