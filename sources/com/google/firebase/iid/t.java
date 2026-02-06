package com.google.firebase.iid;

import android.content.Context;
import android.util.Log;

public class t {

    /* renamed from: c  reason: collision with root package name */
    private static t f57332c;

    /* renamed from: a  reason: collision with root package name */
    private Boolean f57333a = null;

    /* renamed from: b  reason: collision with root package name */
    private Boolean f57334b = null;

    private t() {
    }

    public static synchronized t a() {
        t tVar;
        synchronized (t.class) {
            try {
                if (f57332c == null) {
                    f57332c = new t();
                }
                tVar = f57332c;
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        return tVar;
    }

    /* access modifiers changed from: package-private */
    public boolean b(Context context) {
        boolean z10;
        if (this.f57334b == null) {
            if (context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f57334b = Boolean.valueOf(z10);
        }
        if (!this.f57333a.booleanValue() && Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.f57334b.booleanValue();
    }

    /* access modifiers changed from: package-private */
    public boolean c(Context context) {
        boolean z10;
        if (this.f57333a == null) {
            if (context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f57333a = Boolean.valueOf(z10);
        }
        if (!this.f57333a.booleanValue() && Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.f57333a.booleanValue();
    }
}
