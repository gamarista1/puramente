package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzah  reason: invalid package */
public final class zzah {
    public static String zza(String str) {
        return zzy.zzb(str);
    }

    public static String zzb(String str) {
        return zzy.zzc(str);
    }

    public static boolean zzc(String str) {
        return zzy.zzd(str);
    }

    public static String zza(String str, Object... objArr) {
        int indexOf;
        String valueOf = String.valueOf(str);
        int i10 = 0;
        for (int i11 = 0; i11 < objArr.length; i11++) {
            objArr[i11] = zza(objArr[i11]);
        }
        StringBuilder sb2 = new StringBuilder(valueOf.length() + (objArr.length * 16));
        int i12 = 0;
        while (i10 < objArr.length && (indexOf = valueOf.indexOf("%s", i12)) != -1) {
            sb2.append(valueOf, i12, indexOf);
            sb2.append(objArr[i10]);
            i12 = indexOf + 2;
            i10++;
        }
        sb2.append(valueOf, i12, valueOf.length());
        if (i10 < objArr.length) {
            sb2.append(" [");
            sb2.append(objArr[i10]);
            for (int i13 = i10 + 1; i13 < objArr.length; i13++) {
                sb2.append(", ");
                sb2.append(objArr[i13]);
            }
            sb2.append(']');
        }
        return sb2.toString();
    }

    private static String zza(Object obj) {
        if (obj == null) {
            return "null";
        }
        try {
            return obj.toString();
        } catch (Exception e10) {
            String str = obj.getClass().getName() + "@" + Integer.toHexString(System.identityHashCode(obj));
            Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for " + str, e10);
            return "<" + str + " threw " + e10.getClass().getName() + ">";
        }
    }
}
