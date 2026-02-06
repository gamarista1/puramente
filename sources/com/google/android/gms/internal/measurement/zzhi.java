package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import androidx.collection.C1587a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class zzhi implements zzgn {
    private static final Map<String, zzhi> zza = new C1587a();
    private final SharedPreferences zzb;
    private final Runnable zzc;
    private final SharedPreferences.OnSharedPreferenceChangeListener zzd;
    private final Object zze = new Object();
    private volatile Map<String, ?> zzf;
    private final List<zzgl> zzg = new ArrayList();

    private zzhi(SharedPreferences sharedPreferences, Runnable runnable) {
        zzhl zzhl = new zzhl(this);
        this.zzd = zzhl;
        this.zzb = sharedPreferences;
        this.zzc = runnable;
        sharedPreferences.registerOnSharedPreferenceChangeListener(zzhl);
    }

    private static SharedPreferences zza(Context context, String str) {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            if (str.startsWith("direct_boot:")) {
                if (zzgi.zza()) {
                    context = context.createDeviceProtectedStorageContext();
                }
                SharedPreferences sharedPreferences = context.getSharedPreferences(str.substring(12), 0);
                StrictMode.setThreadPolicy(allowThreadDiskReads);
                return sharedPreferences;
            }
            SharedPreferences sharedPreferences2 = context.getSharedPreferences(str, 0);
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return sharedPreferences2;
        } catch (Throwable th2) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th2;
        }
    }

    static zzhi zza(Context context, String str, Runnable runnable) {
        zzhi zzhi;
        if (!((!zzgi.zza() || str.startsWith("direct_boot:")) ? true : zzgi.zzb(context))) {
            return null;
        }
        synchronized (zzhi.class) {
            try {
                Map<String, zzhi> map = zza;
                zzhi = map.get(str);
                if (zzhi == null) {
                    zzhi = new zzhi(zza(context, str), runnable);
                    map.put(str, zzhi);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzhi;
    }

    public final Object zza(String str) {
        StrictMode.ThreadPolicy allowThreadDiskReads;
        Map<String, ?> map = this.zzf;
        if (map == null) {
            synchronized (this.zze) {
                try {
                    map = this.zzf;
                    if (map == null) {
                        allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        Map<String, ?> all = this.zzb.getAll();
                        this.zzf = all;
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                        map = all;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        if (map != null) {
            return map.get(str);
        }
        return null;
    }

    static synchronized void zza() {
        synchronized (zzhi.class) {
            try {
                for (zzhi next : zza.values()) {
                    next.zzb.unregisterOnSharedPreferenceChangeListener(next.zzd);
                }
                zza.clear();
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zza(SharedPreferences sharedPreferences, String str) {
        synchronized (this.zze) {
            this.zzf = null;
            this.zzc.run();
        }
        synchronized (this) {
            try {
                for (zzgl zza2 : this.zzg) {
                    zza2.zza();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
