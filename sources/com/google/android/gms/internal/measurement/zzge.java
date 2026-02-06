package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.database.Cursor;
import java.util.Map;

public final class zzge implements zzgg {
    public final String zza(ContentResolver contentResolver, String str) {
        Cursor query = contentResolver.query(zzfy.zza, (String[]) null, (String) null, new String[]{str}, (String) null);
        if (query != null) {
            try {
                if (query.moveToFirst()) {
                    String string = query.getString(1);
                    query.close();
                    return string;
                }
                query.close();
                return null;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
        } else {
            throw new zzgf("Failed to connect to GservicesProvider");
        }
        throw th;
    }

    public final <T extends Map<String, String>> T zza(ContentResolver contentResolver, String[] strArr, zzgd<T> zzgd) {
        Cursor query = contentResolver.query(zzfy.zzb, (String[]) null, (String) null, strArr, (String) null);
        if (query != null) {
            try {
                T zza = zzgd.zza(query.getCount());
                while (query.moveToNext()) {
                    zza.put(query.getString(0), query.getString(1));
                }
                query.close();
                return zza;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
        } else {
            throw new zzgf("Failed to connect to GservicesProvider");
        }
        throw th;
    }
}
