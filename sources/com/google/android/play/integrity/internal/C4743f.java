package com.google.android.play.integrity.internal;

import android.content.Context;

/* renamed from: com.google.android.play.integrity.internal.f  reason: case insensitive filesystem */
public abstract class C4743f {
    public static Context a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            return applicationContext;
        }
        return context;
    }
}
