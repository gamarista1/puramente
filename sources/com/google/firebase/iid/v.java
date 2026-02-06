package com.google.firebase.iid;

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

class v implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final long f57342a;

    /* renamed from: b  reason: collision with root package name */
    private final PowerManager.WakeLock f57343b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final FirebaseInstanceId f57344c;

    /* renamed from: d  reason: collision with root package name */
    ExecutorService f57345d = b.b();

    static class a extends BroadcastReceiver {

        /* renamed from: a  reason: collision with root package name */
        private v f57346a;

        public a(v vVar) {
            this.f57346a = vVar;
        }

        public void a() {
            if (FirebaseInstanceId.r()) {
                Log.d("FirebaseInstanceId", "Connectivity change received registered");
            }
            this.f57346a.b().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        public void onReceive(Context context, Intent intent) {
            v vVar = this.f57346a;
            if (vVar != null && vVar.c()) {
                if (FirebaseInstanceId.r()) {
                    Log.d("FirebaseInstanceId", "Connectivity changed. Starting background sync.");
                }
                this.f57346a.f57344c.g(this.f57346a, 0);
                this.f57346a.b().unregisterReceiver(this);
                this.f57346a = null;
            }
        }
    }

    v(FirebaseInstanceId firebaseInstanceId, long j10) {
        this.f57344c = firebaseInstanceId;
        this.f57342a = j10;
        PowerManager.WakeLock newWakeLock = ((PowerManager) b().getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f57343b = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    /* access modifiers changed from: package-private */
    public Context b() {
        return this.f57344c.h().m();
    }

    /* access modifiers changed from: package-private */
    public boolean c() {
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
    public boolean d() {
        if (!this.f57344c.F(this.f57344c.p())) {
            return true;
        }
        try {
            if (this.f57344c.d() == null) {
                Log.e("FirebaseInstanceId", "Token retrieval failed: null");
                return false;
            }
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                Log.d("FirebaseInstanceId", "Token successfully retrieved");
            }
            return true;
        } catch (IOException e10) {
            if (k.g(e10.getMessage())) {
                String message = e10.getMessage();
                StringBuilder sb2 = new StringBuilder(String.valueOf(message).length() + 52);
                sb2.append("Token retrieval failed: ");
                sb2.append(message);
                sb2.append(". Will retry token retrieval");
                Log.w("FirebaseInstanceId", sb2.toString());
                return false;
            } else if (e10.getMessage() == null) {
                Log.w("FirebaseInstanceId", "Token retrieval failed without exception message. Will retry token retrieval");
                return false;
            } else {
                throw e10;
            }
        } catch (SecurityException unused) {
            Log.w("FirebaseInstanceId", "Token retrieval failed with SecurityException. Will retry token retrieval");
            return false;
        }
    }

    public void run() {
        if (t.a().c(b())) {
            this.f57343b.acquire();
        }
        try {
            this.f57344c.C(true);
            if (!this.f57344c.s()) {
                this.f57344c.C(false);
                if (!t.a().c(b())) {
                    return;
                }
            } else if (!t.a().b(b()) || c()) {
                if (d()) {
                    this.f57344c.C(false);
                } else {
                    this.f57344c.E(this.f57342a);
                }
                if (!t.a().c(b())) {
                    return;
                }
            } else {
                new a(this).a();
                if (!t.a().c(b())) {
                    return;
                }
            }
        } catch (IOException e10) {
            String message = e10.getMessage();
            StringBuilder sb2 = new StringBuilder(String.valueOf(message).length() + 93);
            sb2.append("Topic sync or token retrieval failed on hard failure exceptions: ");
            sb2.append(message);
            sb2.append(". Won't retry the operation.");
            Log.e("FirebaseInstanceId", sb2.toString());
            this.f57344c.C(false);
            if (!t.a().c(b())) {
                return;
            }
        } catch (Throwable th2) {
            if (t.a().c(b())) {
                this.f57343b.release();
            }
            throw th2;
        }
        this.f57343b.release();
    }
}
