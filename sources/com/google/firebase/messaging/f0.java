package com.google.firebase.messaging;

import Fa.C4287b;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

class f0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final long f57523a;

    /* renamed from: b  reason: collision with root package name */
    private final PowerManager.WakeLock f57524b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final FirebaseMessaging f57525c;

    /* renamed from: d  reason: collision with root package name */
    ExecutorService f57526d = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new C4287b("firebase-iid-executor"));

    static class a extends BroadcastReceiver {

        /* renamed from: a  reason: collision with root package name */
        private f0 f57527a;

        /* renamed from: b  reason: collision with root package name */
        private Context f57528b;

        public a(f0 f0Var) {
            this.f57527a = f0Var;
        }

        public void a() {
            if (f0.c()) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            IntentFilter intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
            f0 f0Var = this.f57527a;
            if (f0Var != null) {
                Context b10 = f0Var.b();
                this.f57528b = b10;
                b10.registerReceiver(this, intentFilter);
            }
        }

        public void onReceive(Context context, Intent intent) {
            f0 f0Var = this.f57527a;
            if (f0Var != null && f0Var.d()) {
                if (f0.c()) {
                    Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                }
                this.f57527a.f57525c.s(this.f57527a, 0);
                Context context2 = this.f57528b;
                if (context2 != null) {
                    context2.unregisterReceiver(this);
                }
                this.f57527a = null;
            }
        }
    }

    public f0(FirebaseMessaging firebaseMessaging, long j10) {
        this.f57525c = firebaseMessaging;
        this.f57523a = j10;
        PowerManager.WakeLock newWakeLock = ((PowerManager) b().getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f57524b = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    static boolean c() {
        return Log.isLoggable("FirebaseMessaging", 3);
    }

    /* access modifiers changed from: package-private */
    public Context b() {
        return this.f57525c.t();
    }

    /* access modifiers changed from: package-private */
    public boolean d() {
        NetworkInfo networkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) b().getSystemService("connectivity");
        if (connectivityManager != null) {
            networkInfo = connectivityManager.getActiveNetworkInfo();
        } else {
            networkInfo = null;
        }
        if (networkInfo == null || !networkInfo.isConnected()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean e() {
        try {
            if (this.f57525c.p() == null) {
                Log.e("FirebaseMessaging", "Token retrieval failed: null");
                return false;
            } else if (!Log.isLoggable("FirebaseMessaging", 3)) {
                return true;
            } else {
                Log.d("FirebaseMessaging", "Token successfully retrieved");
                return true;
            }
        } catch (IOException e10) {
            if (H.i(e10.getMessage())) {
                Log.w("FirebaseMessaging", "Token retrieval failed: " + e10.getMessage() + ". Will retry token retrieval");
                return false;
            } else if (e10.getMessage() == null) {
                Log.w("FirebaseMessaging", "Token retrieval failed without exception message. Will retry token retrieval");
                return false;
            } else {
                throw e10;
            }
        } catch (SecurityException unused) {
            Log.w("FirebaseMessaging", "Token retrieval failed with SecurityException. Will retry token retrieval");
            return false;
        }
    }

    public void run() {
        if (b0.b().e(b())) {
            this.f57524b.acquire();
        }
        try {
            this.f57525c.V(true);
            if (!this.f57525c.E()) {
                this.f57525c.V(false);
                if (b0.b().e(b())) {
                    this.f57524b.release();
                }
            } else if (!b0.b().d(b()) || d()) {
                if (e()) {
                    this.f57525c.V(false);
                } else {
                    this.f57525c.a0(this.f57523a);
                }
                if (!b0.b().e(b())) {
                    return;
                }
                this.f57524b.release();
            } else {
                new a(this).a();
                if (b0.b().e(b())) {
                    this.f57524b.release();
                }
            }
        } catch (IOException e10) {
            Log.e("FirebaseMessaging", "Topic sync or token retrieval failed on hard failure exceptions: " + e10.getMessage() + ". Won't retry the operation.");
            this.f57525c.V(false);
            if (!b0.b().e(b())) {
            }
        } catch (Throwable th2) {
            if (b0.b().e(b())) {
                this.f57524b.release();
            }
            throw th2;
        }
    }
}
