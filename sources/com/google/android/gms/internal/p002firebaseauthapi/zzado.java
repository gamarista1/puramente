package com.google.android.gms.internal.p002firebaseauthapi;

import Ea.C4278a;
import Ea.j;
import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.common.internal.C4536s;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzado  reason: invalid package */
public final class zzado {
    private final String zza;
    private final String zzb;

    public zzado(Context context) {
        this(context, context.getPackageName());
    }

    public final String zza() {
        return this.zzb;
    }

    public final String zzb() {
        return this.zza;
    }

    private zzado(Context context, String str) {
        C4536s.l(context);
        String f10 = C4536s.f(str);
        this.zza = f10;
        try {
            byte[] a10 = C4278a.a(context, f10);
            if (a10 == null) {
                Log.e("FBA-PackageInfo", "single cert required: " + str);
                this.zzb = null;
                return;
            }
            this.zzb = j.c(a10, false);
        } catch (PackageManager.NameNotFoundException unused) {
            Log.e("FBA-PackageInfo", "no pkg: " + str);
            this.zzb = null;
        }
    }
}
