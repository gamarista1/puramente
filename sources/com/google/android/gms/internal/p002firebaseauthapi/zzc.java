package com.google.android.gms.internal.p002firebaseauthapi;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.core.content.c;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzc  reason: invalid package */
public final class zzc extends c {
    @Deprecated
    public static Intent zza(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        int i10;
        if (!zza.zza()) {
            return context.registerReceiver(broadcastReceiver, intentFilter);
        }
        if (zza.zza()) {
            i10 = 2;
        } else {
            i10 = 0;
        }
        return context.registerReceiver(broadcastReceiver, intentFilter, i10);
    }
}
