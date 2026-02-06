package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import android.util.Log;
import androidx.core.content.h;

final class zzgs implements zzgn {
    private static zzgs zza;
    private final Context zzb;
    private final ContentObserver zzc;

    private zzgs() {
        this.zzb = null;
        this.zzc = null;
    }

    static zzgs zza(Context context) {
        zzgs zzgs;
        synchronized (zzgs.class) {
            try {
                if (zza == null) {
                    zza = h.b(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new zzgs(context) : new zzgs();
                }
                zzgs = zza;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzgs;
    }

    /* access modifiers changed from: private */
    /* renamed from: zzc */
    public final String zza(String str) {
        Context context = this.zzb;
        if (context != null && !zzgi.zza(context)) {
            try {
                return (String) zzgq.zza(new zzgr(this, str));
            } catch (IllegalStateException | NullPointerException | SecurityException e10) {
                Log.e("GservicesLoader", "Unable to read GServices for: " + str, e10);
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ String zzb(String str) {
        return zzfv.zza(this.zzb.getContentResolver(), str, (String) null);
    }

    private zzgs(Context context) {
        this.zzb = context;
        zzgu zzgu = new zzgu(this, (Handler) null);
        this.zzc = zzgu;
        context.getContentResolver().registerContentObserver(zzfy.zza, true, zzgu);
    }

    static synchronized void zza() {
        Context context;
        synchronized (zzgs.class) {
            try {
                zzgs zzgs = zza;
                if (!(zzgs == null || (context = zzgs.zzb) == null || zzgs.zzc == null)) {
                    context.getContentResolver().unregisterContentObserver(zza.zzc);
                }
                zza = null;
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
    }
}
