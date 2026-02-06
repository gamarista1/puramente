package com.google.android.gms.internal.measurement;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Process;
import android.os.UserManager;
import android.util.Log;

public class zzgi {
    private static UserManager zza;
    private static volatile boolean zzb = (!zza());

    private zzgi() {
    }

    public static boolean zza() {
        return true;
    }

    public static boolean zzb(Context context) {
        if (!zza() || zzc(context)) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x001a, code lost:
        return r3;
     */
    @android.annotation.TargetApi(24)
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean zzc(android.content.Context r3) {
        /*
            boolean r0 = zzb
            r1 = 1
            if (r0 == 0) goto L_0x0006
            return r1
        L_0x0006:
            java.lang.Class<com.google.android.gms.internal.measurement.zzgi> r0 = com.google.android.gms.internal.measurement.zzgi.class
            monitor-enter(r0)
            boolean r2 = zzb     // Catch:{ all -> 0x000f }
            if (r2 == 0) goto L_0x0011
            monitor-exit(r0)     // Catch:{ all -> 0x000f }
            return r1
        L_0x000f:
            r3 = move-exception
            goto L_0x001b
        L_0x0011:
            boolean r3 = zzd(r3)     // Catch:{ all -> 0x000f }
            if (r3 == 0) goto L_0x0019
            zzb = r3     // Catch:{ all -> 0x000f }
        L_0x0019:
            monitor-exit(r0)     // Catch:{ all -> 0x000f }
            return r3
        L_0x001b:
            monitor-exit(r0)     // Catch:{ all -> 0x000f }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzgi.zzc(android.content.Context):boolean");
    }

    @TargetApi(24)
    private static boolean zzd(Context context) {
        boolean z10;
        boolean z11 = true;
        int i10 = 1;
        while (true) {
            z10 = false;
            if (i10 > 2) {
                break;
            }
            if (zza == null) {
                zza = (UserManager) context.getSystemService(UserManager.class);
            }
            UserManager userManager = zza;
            if (userManager == null) {
                return true;
            }
            try {
                if (!userManager.isUserUnlocked() && userManager.isUserRunning(Process.myUserHandle())) {
                    z11 = false;
                }
                z10 = z11;
            } catch (NullPointerException e10) {
                Log.w("DirectBootUtils", "Failed to check if user is unlocked.", e10);
                zza = null;
                i10++;
            }
        }
        if (z10) {
            zza = null;
        }
        return z10;
    }

    public static boolean zza(Context context) {
        return zza() && !zzc(context);
    }
}
