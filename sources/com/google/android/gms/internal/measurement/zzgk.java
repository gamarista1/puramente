package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Handler;
import android.os.StrictMode;
import android.util.Log;
import androidx.collection.C1587a;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import nb.o;

public final class zzgk implements zzgn {
    private static final Map<Uri, zzgk> zza = new C1587a();
    private static final String[] zzb = {SubscriberAttributeKt.JSON_NAME_KEY, "value"};
    private final ContentResolver zzc;
    private final Uri zzd;
    private final Runnable zze;
    private final ContentObserver zzf;
    private final Object zzg = new Object();
    private volatile Map<String, String> zzh;
    private final List<zzgl> zzi = new ArrayList();

    private zzgk(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        zzgm zzgm = new zzgm(this, (Handler) null);
        this.zzf = zzgm;
        o.j(contentResolver);
        o.j(uri);
        this.zzc = contentResolver;
        this.zzd = uri;
        this.zze = runnable;
        contentResolver.registerContentObserver(uri, false, zzgm);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:2|3|(5:5|6|7|8|9)|12|13) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0019 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.measurement.zzgk zza(android.content.ContentResolver r4, android.net.Uri r5, java.lang.Runnable r6) {
        /*
            java.lang.Class<com.google.android.gms.internal.measurement.zzgk> r0 = com.google.android.gms.internal.measurement.zzgk.class
            monitor-enter(r0)
            java.util.Map<android.net.Uri, com.google.android.gms.internal.measurement.zzgk> r1 = zza     // Catch:{ all -> 0x0017 }
            java.lang.Object r2 = r1.get(r5)     // Catch:{ all -> 0x0017 }
            com.google.android.gms.internal.measurement.zzgk r2 = (com.google.android.gms.internal.measurement.zzgk) r2     // Catch:{ all -> 0x0017 }
            if (r2 != 0) goto L_0x0019
            com.google.android.gms.internal.measurement.zzgk r3 = new com.google.android.gms.internal.measurement.zzgk     // Catch:{ SecurityException -> 0x0019 }
            r3.<init>(r4, r5, r6)     // Catch:{ SecurityException -> 0x0019 }
            r1.put(r5, r3)     // Catch:{ SecurityException -> 0x0015 }
        L_0x0015:
            r2 = r3
            goto L_0x0019
        L_0x0017:
            r4 = move-exception
            goto L_0x001b
        L_0x0019:
            monitor-exit(r0)     // Catch:{ all -> 0x0017 }
            return r2
        L_0x001b:
            monitor-exit(r0)     // Catch:{ all -> 0x0017 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzgk.zza(android.content.ContentResolver, android.net.Uri, java.lang.Runnable):com.google.android.gms.internal.measurement.zzgk");
    }

    static synchronized void zzc() {
        synchronized (zzgk.class) {
            try {
                for (zzgk next : zza.values()) {
                    next.zzc.unregisterContentObserver(next.zzf);
                }
                zza.clear();
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
    }

    /* JADX INFO: finally extract failed */
    private final Map<String, String> zze() {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            Map<String, String> map = (Map) zzgq.zza(new zzgj(this));
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return map;
        } catch (SQLiteException | IllegalStateException | SecurityException unused) {
            Log.e("ConfigurationContentLdr", "PhenotypeFlag unable to load ContentProvider, using default values");
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return null;
        } catch (Throwable th2) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th2;
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Map zzb() {
        Map map;
        Cursor query = this.zzc.query(this.zzd, zzb, (String) null, (String[]) null, (String) null);
        if (query == null) {
            return Collections.emptyMap();
        }
        try {
            int count = query.getCount();
            if (count == 0) {
                return Collections.emptyMap();
            }
            if (count <= 256) {
                map = new C1587a(count);
            } else {
                map = new HashMap(count, 1.0f);
            }
            while (query.moveToNext()) {
                map.put(query.getString(0), query.getString(1));
            }
            query.close();
            return map;
        } finally {
            query.close();
        }
    }

    public final void zzd() {
        synchronized (this.zzg) {
            this.zzh = null;
            this.zze.run();
        }
        synchronized (this) {
            try {
                for (zzgl zza2 : this.zzi) {
                    zza2.zza();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final /* synthetic */ Object zza(String str) {
        return zza().get(str);
    }

    public final Map<String, String> zza() {
        Map<String, String> map = this.zzh;
        if (map == null) {
            synchronized (this.zzg) {
                try {
                    map = this.zzh;
                    if (map == null) {
                        map = zze();
                        this.zzh = map;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        if (map != null) {
            return map;
        }
        return Collections.emptyMap();
    }
}
