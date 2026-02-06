package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Looper;

/* renamed from: com.google.android.gms.measurement.internal.c  reason: case insensitive filesystem */
public final class C4583c {
    C4583c(Context context) {
    }

    public static boolean a() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return true;
        }
        return false;
    }
}
