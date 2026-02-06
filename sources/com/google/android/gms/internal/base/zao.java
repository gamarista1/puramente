package com.google.android.gms.internal.base;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.core.content.c;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

public final class zao extends c {
    @ResultIgnorabilityUnspecified
    @Deprecated
    public static Intent zaa(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        int i10;
        if (!zan.zaa()) {
            return context.registerReceiver(broadcastReceiver, intentFilter);
        }
        if (true != zan.zaa()) {
            i10 = 0;
        } else {
            i10 = 2;
        }
        return context.registerReceiver(broadcastReceiver, intentFilter, i10);
    }
}
