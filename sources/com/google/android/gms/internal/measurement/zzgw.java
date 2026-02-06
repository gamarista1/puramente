package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import androidx.collection.C1587a;

public final class zzgw {
    private static final C1587a zza = new C1587a();

    public static synchronized Uri zza(String str) {
        Uri uri;
        synchronized (zzgw.class) {
            C1587a aVar = zza;
            uri = (Uri) aVar.get(str);
            if (uri == null) {
                String encode = Uri.encode(str);
                uri = Uri.parse("content://com.google.android.gms.phenotype/" + encode);
                aVar.put(str, uri);
            }
        }
        return uri;
    }

    public static String zza(Context context, String str) {
        if (!str.contains("#")) {
            String packageName = context.getPackageName();
            return str + "#" + "" + packageName;
        }
        throw new IllegalArgumentException("The passed in package cannot already have a subpackage: " + str);
    }

    public static boolean zza(String str, String str2) {
        if (str.equals("eng") || str.equals("userdebug")) {
            return str2.contains("dev-keys") || str2.contains("test-keys");
        }
        return false;
    }
}
