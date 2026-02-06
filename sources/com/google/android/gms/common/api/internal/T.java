package com.google.android.gms.common.api.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

public final class T extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    Context f53984a;

    /* renamed from: b  reason: collision with root package name */
    private final S f53985b;

    public T(S s10) {
        this.f53985b = s10;
    }

    public final void a(Context context) {
        this.f53984a = context;
    }

    public final synchronized void b() {
        try {
            Context context = this.f53984a;
            if (context != null) {
                context.unregisterReceiver(this);
            }
            this.f53984a = null;
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
    }

    public final void onReceive(Context context, Intent intent) {
        String str;
        Uri data = intent.getData();
        if (data != null) {
            str = data.getSchemeSpecificPart();
        } else {
            str = null;
        }
        if ("com.google.android.gms".equals(str)) {
            this.f53985b.a();
            b();
        }
    }
}
