package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Log;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import java.util.ArrayDeque;
import java.util.Queue;

public class b0 {

    /* renamed from: e  reason: collision with root package name */
    private static b0 f57498e;

    /* renamed from: a  reason: collision with root package name */
    private String f57499a = null;

    /* renamed from: b  reason: collision with root package name */
    private Boolean f57500b = null;

    /* renamed from: c  reason: collision with root package name */
    private Boolean f57501c = null;

    /* renamed from: d  reason: collision with root package name */
    private final Queue f57502d = new ArrayDeque();

    private b0() {
    }

    private int a(Context context, Intent intent) {
        ComponentName componentName;
        String f10 = f(context, intent);
        if (f10 != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Restricting intent to a specific service: " + f10);
            }
            intent.setClassName(context.getPackageName(), f10);
        }
        try {
            if (e(context)) {
                componentName = m0.h(context, intent);
            } else {
                componentName = context.startService(intent);
                Log.d("FirebaseMessaging", "Missing wake lock permission, service start may be delayed");
            }
            if (componentName != null) {
                return -1;
            }
            Log.e("FirebaseMessaging", "Error while delivering the message: ServiceIntent not found.");
            return RCHTTPStatusCodes.NOT_FOUND;
        } catch (SecurityException e10) {
            Log.e("FirebaseMessaging", "Error while delivering the message to the serviceIntent", e10);
            return RCHTTPStatusCodes.UNAUTHORIZED;
        } catch (IllegalStateException e11) {
            Log.e("FirebaseMessaging", "Failed to start service while in background: " + e11);
            return 402;
        }
    }

    static synchronized b0 b() {
        b0 b0Var;
        synchronized (b0.class) {
            try {
                if (f57498e == null) {
                    f57498e = new b0();
                }
                b0Var = f57498e;
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        return b0Var;
    }

    private synchronized String f(Context context, Intent intent) {
        try {
            String str = this.f57499a;
            if (str != null) {
                return str;
            }
            ResolveInfo resolveService = context.getPackageManager().resolveService(intent, 0);
            if (resolveService != null) {
                ServiceInfo serviceInfo = resolveService.serviceInfo;
                if (serviceInfo != null) {
                    if (context.getPackageName().equals(serviceInfo.packageName)) {
                        String str2 = serviceInfo.name;
                        if (str2 != null) {
                            if (str2.startsWith(".")) {
                                this.f57499a = context.getPackageName() + serviceInfo.name;
                            } else {
                                this.f57499a = serviceInfo.name;
                            }
                            return this.f57499a;
                        }
                    }
                    Log.e("FirebaseMessaging", "Error resolving target intent service, skipping classname enforcement. Resolved service was: " + serviceInfo.packageName + "/" + serviceInfo.name);
                    return null;
                }
            }
            Log.e("FirebaseMessaging", "Failed to resolve target intent service, skipping classname enforcement");
            return null;
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public Intent c() {
        return (Intent) this.f57502d.poll();
    }

    /* access modifiers changed from: package-private */
    public boolean d(Context context) {
        boolean z10;
        if (this.f57501c == null) {
            if (context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f57501c = Boolean.valueOf(z10);
        }
        if (!this.f57500b.booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.f57501c.booleanValue();
    }

    /* access modifiers changed from: package-private */
    public boolean e(Context context) {
        boolean z10;
        if (this.f57500b == null) {
            if (context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f57500b = Boolean.valueOf(z10);
        }
        if (!this.f57500b.booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.f57500b.booleanValue();
    }

    public int g(Context context, Intent intent) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Starting service");
        }
        this.f57502d.offer(intent);
        Intent intent2 = new Intent("com.google.firebase.MESSAGING_EVENT");
        intent2.setPackage(context.getPackageName());
        return a(context, intent2);
    }
}
