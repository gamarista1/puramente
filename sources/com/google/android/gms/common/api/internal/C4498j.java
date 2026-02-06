package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;

/* renamed from: com.google.android.gms.common.api.internal.j  reason: case insensitive filesystem */
public interface C4498j {
    void a(String str, LifecycleCallback lifecycleCallback);

    LifecycleCallback d(String str, Class cls);

    Activity p();

    void startActivityForResult(Intent intent, int i10);
}
