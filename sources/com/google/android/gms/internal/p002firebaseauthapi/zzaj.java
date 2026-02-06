package com.google.android.gms.internal.p002firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaj  reason: invalid package */
final class zzaj {
    static int zza(int i10, String str) {
        if (i10 >= 0) {
            return i10;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i10);
    }

    static void zza(Object obj, Object obj2) {
        if (obj == null) {
            String valueOf = String.valueOf(obj2);
            throw new NullPointerException("null key in entry: null=" + valueOf);
        } else if (obj2 == null) {
            String valueOf2 = String.valueOf(obj);
            throw new NullPointerException("null value in entry: " + valueOf2 + "=null");
        }
    }
}
