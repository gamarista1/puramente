package com.reactnativecommunity.netinfo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
import nd.f;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private final c f59268a = new c();
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Context f59269b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final C0874a f59270c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final Runnable f59271d = new b();
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public Handler f59272e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public boolean f59273f = false;

    /* renamed from: com.reactnativecommunity.netinfo.a$a  reason: collision with other inner class name */
    public interface C0874a {
        void onAmazonFireDeviceConnectivityChanged(boolean z10);
    }

    private class b implements Runnable {
        public void run() {
            if (a.this.f59273f) {
                a.this.f59269b.sendBroadcast(new Intent("com.amazon.tv.networkmonitor.CONNECTIVITY_CHECK"));
                a.this.f59272e.postDelayed(a.this.f59271d, 10000);
            }
        }

        private b() {
        }
    }

    private class c extends BroadcastReceiver {

        /* renamed from: a  reason: collision with root package name */
        boolean f59275a;

        /* renamed from: b  reason: collision with root package name */
        private Boolean f59276b;

        public void onReceive(Context context, Intent intent) {
            String str;
            boolean z10;
            if (intent == null) {
                str = null;
            } else {
                str = intent.getAction();
            }
            if ("com.amazon.tv.networkmonitor.INTERNET_DOWN".equals(str)) {
                z10 = false;
            } else if ("com.amazon.tv.networkmonitor.INTERNET_UP".equals(str)) {
                z10 = true;
            } else {
                return;
            }
            Boolean bool = this.f59276b;
            if (bool == null || bool.booleanValue() != z10) {
                this.f59276b = Boolean.valueOf(z10);
                a.this.f59270c.onAmazonFireDeviceConnectivityChanged(z10);
            }
        }

        private c() {
            this.f59275a = false;
        }
    }

    a(Context context, C0874a aVar) {
        this.f59269b = context;
        this.f59270c = aVar;
    }

    private boolean f() {
        if (Build.MANUFACTURER.equals("Amazon")) {
            String str = Build.MODEL;
            if (str.startsWith("AF") || str.startsWith("KF")) {
                return true;
            }
        }
        return false;
    }

    private void h() {
        if (!this.f59268a.f59275a) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.amazon.tv.networkmonitor.INTERNET_DOWN");
            intentFilter.addAction("com.amazon.tv.networkmonitor.INTERNET_UP");
            f.a(this.f59269b, this.f59268a, intentFilter, false);
            this.f59268a.f59275a = true;
        }
    }

    private void i() {
        if (!this.f59273f) {
            Handler handler = new Handler();
            this.f59272e = handler;
            this.f59273f = true;
            handler.post(this.f59271d);
        }
    }

    private void j() {
        if (this.f59273f) {
            this.f59273f = false;
            this.f59272e.removeCallbacksAndMessages((Object) null);
            this.f59272e = null;
        }
    }

    private void l() {
        c cVar = this.f59268a;
        if (cVar.f59275a) {
            this.f59269b.unregisterReceiver(cVar);
            this.f59268a.f59275a = false;
        }
    }

    public void g() {
        if (f()) {
            h();
            i();
        }
    }

    public void k() {
        if (f()) {
            j();
            l();
        }
    }
}
