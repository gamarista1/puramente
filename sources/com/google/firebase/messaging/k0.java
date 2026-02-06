package com.google.firebase.messaging;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import java.io.IOException;

class k0 implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    private static final Object f57562f = new Object();

    /* renamed from: g  reason: collision with root package name */
    private static Boolean f57563g;

    /* renamed from: h  reason: collision with root package name */
    private static Boolean f57564h;
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final Context f57565a;

    /* renamed from: b  reason: collision with root package name */
    private final M f57566b;

    /* renamed from: c  reason: collision with root package name */
    private final PowerManager.WakeLock f57567c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final j0 f57568d;

    /* renamed from: e  reason: collision with root package name */
    private final long f57569e;

    class a extends BroadcastReceiver {

        /* renamed from: a  reason: collision with root package name */
        private k0 f57570a;

        public a(k0 k0Var) {
            this.f57570a = k0Var;
        }

        public void a() {
            if (k0.j()) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            k0.this.f57565a.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        public synchronized void onReceive(Context context, Intent intent) {
            try {
                k0 k0Var = this.f57570a;
                if (k0Var != null) {
                    if (k0Var.i()) {
                        if (k0.j()) {
                            Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                        }
                        this.f57570a.f57568d.m(this.f57570a, 0);
                        context.unregisterReceiver(this);
                        this.f57570a = null;
                    }
                }
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
    }

    k0(j0 j0Var, Context context, M m10, long j10) {
        this.f57568d = j0Var;
        this.f57565a = context;
        this.f57569e = j10;
        this.f57566b = m10;
        this.f57567c = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    private static String e(String str) {
        return "Missing Permission: " + str + ". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest";
    }

    private static boolean f(Context context) {
        boolean z10;
        boolean booleanValue;
        synchronized (f57562f) {
            try {
                Boolean bool = f57564h;
                if (bool == null) {
                    z10 = g(context, "android.permission.ACCESS_NETWORK_STATE", bool);
                } else {
                    z10 = bool.booleanValue();
                }
                Boolean valueOf = Boolean.valueOf(z10);
                f57564h = valueOf;
                booleanValue = valueOf.booleanValue();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return booleanValue;
    }

    private static boolean g(Context context, String str, Boolean bool) {
        boolean z10;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (context.checkCallingOrSelfPermission(str) == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", e(str));
        }
        return z10;
    }

    private static boolean h(Context context) {
        boolean z10;
        boolean booleanValue;
        synchronized (f57562f) {
            try {
                Boolean bool = f57563g;
                if (bool == null) {
                    z10 = g(context, "android.permission.WAKE_LOCK", bool);
                } else {
                    z10 = bool.booleanValue();
                }
                Boolean valueOf = Boolean.valueOf(z10);
                f57563g = valueOf;
                booleanValue = valueOf.booleanValue();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return booleanValue;
    }

    /* access modifiers changed from: private */
    public synchronized boolean i() {
        NetworkInfo networkInfo;
        boolean z10;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.f57565a.getSystemService("connectivity");
            if (connectivityManager != null) {
                networkInfo = connectivityManager.getActiveNetworkInfo();
            } else {
                networkInfo = null;
            }
            if (networkInfo == null || !networkInfo.isConnected()) {
                z10 = false;
            } else {
                z10 = true;
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
        return z10;
    }

    /* access modifiers changed from: private */
    public static boolean j() {
        return Log.isLoggable("FirebaseMessaging", 3);
    }

    public void run() {
        PowerManager.WakeLock wakeLock;
        if (h(this.f57565a)) {
            this.f57567c.acquire(C4824e.f57514a);
        }
        try {
            this.f57568d.o(true);
            if (!this.f57566b.g()) {
                this.f57568d.o(false);
                if (h(this.f57565a)) {
                    try {
                        this.f57567c.release();
                    } catch (RuntimeException unused) {
                        Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                    }
                }
            } else if (!f(this.f57565a) || i()) {
                if (this.f57568d.s()) {
                    this.f57568d.o(false);
                } else {
                    this.f57568d.t(this.f57569e);
                }
                if (h(this.f57565a)) {
                    try {
                        wakeLock = this.f57567c;
                        wakeLock.release();
                    } catch (RuntimeException unused2) {
                        Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                    }
                }
            } else {
                new a(this).a();
                if (h(this.f57565a)) {
                    try {
                        this.f57567c.release();
                    } catch (RuntimeException unused3) {
                        Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                    }
                }
            }
        } catch (IOException e10) {
            Log.e("FirebaseMessaging", "Failed to sync topics. Won't retry sync. " + e10.getMessage());
            this.f57568d.o(false);
            if (h(this.f57565a)) {
                wakeLock = this.f57567c;
            }
        } catch (Throwable th2) {
            if (h(this.f57565a)) {
                try {
                    this.f57567c.release();
                } catch (RuntimeException unused4) {
                    Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                }
            }
            throw th2;
        }
    }
}
