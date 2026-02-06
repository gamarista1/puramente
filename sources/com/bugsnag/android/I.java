package com.bugsnag.android;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import java.util.concurrent.atomic.AtomicBoolean;
import yf.p;

public final class I implements H {

    /* renamed from: a  reason: collision with root package name */
    private final ConnectivityManager f38485a;

    /* renamed from: b  reason: collision with root package name */
    private final a f38486b;

    public static final class a extends ConnectivityManager.NetworkCallback {

        /* renamed from: a  reason: collision with root package name */
        private final p f38487a;

        /* renamed from: b  reason: collision with root package name */
        private final AtomicBoolean f38488b = new AtomicBoolean(false);

        public a(p pVar) {
            this.f38487a = pVar;
        }

        private final void a(boolean z10) {
            p pVar;
            if (this.f38488b.getAndSet(true) && (pVar = this.f38487a) != null) {
                pVar.invoke(Boolean.valueOf(z10), K1.f38514a.c());
            }
        }

        public void onAvailable(Network network) {
            super.onAvailable(network);
            a(true);
        }

        public void onUnavailable() {
            super.onUnavailable();
            a(false);
        }
    }

    public I(ConnectivityManager connectivityManager, p pVar) {
        this.f38485a = connectivityManager;
        this.f38486b = new a(pVar);
    }

    public void a() {
        this.f38485a.registerDefaultNetworkCallback(this.f38486b);
    }

    public boolean b() {
        if (this.f38485a.getActiveNetwork() != null) {
            return true;
        }
        return false;
    }

    public String c() {
        NetworkCapabilities networkCapabilities;
        Network activeNetwork = this.f38485a.getActiveNetwork();
        if (activeNetwork != null) {
            networkCapabilities = this.f38485a.getNetworkCapabilities(activeNetwork);
        } else {
            networkCapabilities = null;
        }
        if (networkCapabilities == null) {
            return "none";
        }
        if (networkCapabilities.hasTransport(1)) {
            return "wifi";
        }
        if (networkCapabilities.hasTransport(3)) {
            return "ethernet";
        }
        if (networkCapabilities.hasTransport(0)) {
            return "cellular";
        }
        return "unknown";
    }
}
