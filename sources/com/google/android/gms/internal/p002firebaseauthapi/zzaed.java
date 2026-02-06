package com.google.android.gms.internal.p002firebaseauthapi;

import com.amazon.a.a.o.b;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaed  reason: invalid package */
public final class zzaed {
    public static String zza(String str) {
        Class<String> cls = String.class;
        try {
            Object invoke = Class.forName(b.at).getDeclaredMethod(b.au, new Class[]{cls}).invoke((Object) null, new Object[]{str});
            if (invoke != null && cls.isAssignableFrom(invoke.getClass())) {
                return (String) invoke;
            }
        } catch (Exception unused) {
        }
        return null;
    }
}
