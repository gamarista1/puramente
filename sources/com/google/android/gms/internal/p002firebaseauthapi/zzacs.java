package com.google.android.gms.internal.p002firebaseauthapi;

import java.lang.reflect.Type;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzacs  reason: invalid package */
public class zzacs {
    private static final String zza = "com.google.android.gms.internal.firebase-auth-api.zzacs";

    private zzacs() {
    }

    public static Object zza(String str, Type type) {
        if (type == String.class) {
            try {
                zzaek zzaek = (zzaek) new zzaek().zza(str);
                if (zzaek.zzb()) {
                    return zzaek.zza();
                }
                throw new zzaah("No error message: " + str);
            } catch (Exception e10) {
                String message = e10.getMessage();
                throw new zzaah("Json conversion failed! " + message, e10);
            }
        } else if (type == Void.class) {
            return null;
        } else {
            try {
                try {
                    return ((zzacu) ((Class) type).getConstructor((Class[]) null).newInstance((Object[]) null)).zza(str);
                } catch (Exception e11) {
                    String message2 = e11.getMessage();
                    throw new zzaah("Json conversion failed! " + message2, e11);
                }
            } catch (Exception e12) {
                String valueOf = String.valueOf(type);
                throw new zzaah("Instantiation of JsonResponse failed! " + valueOf, e12);
            }
        }
    }
}
