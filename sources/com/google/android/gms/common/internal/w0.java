package com.google.android.gms.common.internal;

import Ea.n;
import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.StrictMode;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

final class w0 implements ServiceConnection, A0 {

    /* renamed from: a  reason: collision with root package name */
    private final Map f54245a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private int f54246b = 2;

    /* renamed from: c  reason: collision with root package name */
    private boolean f54247c;

    /* renamed from: d  reason: collision with root package name */
    private IBinder f54248d;

    /* renamed from: e  reason: collision with root package name */
    private final u0 f54249e;

    /* renamed from: f  reason: collision with root package name */
    private ComponentName f54250f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ z0 f54251g;

    public w0(z0 z0Var, u0 u0Var) {
        this.f54251g = z0Var;
        this.f54249e = u0Var;
    }

    public final int a() {
        return this.f54246b;
    }

    public final ComponentName b() {
        return this.f54250f;
    }

    public final IBinder c() {
        return this.f54248d;
    }

    public final void d(ServiceConnection serviceConnection, ServiceConnection serviceConnection2, String str) {
        this.f54245a.put(serviceConnection, serviceConnection2);
    }

    public final void e(String str, Executor executor) {
        this.f54246b = 3;
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        if (n.l()) {
            StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder(vmPolicy).permitUnsafeIntentLaunch().build());
        }
        try {
            z0 z0Var = this.f54251g;
            boolean d10 = z0Var.f54260j.d(z0Var.f54257g, str, this.f54249e.b(z0Var.f54257g), this, 4225, executor);
            this.f54247c = d10;
            if (d10) {
                this.f54251g.f54258h.sendMessageDelayed(this.f54251g.f54258h.obtainMessage(1, this.f54249e), this.f54251g.f54262l);
            } else {
                this.f54246b = 2;
                try {
                    z0 z0Var2 = this.f54251g;
                    z0Var2.f54260j.c(z0Var2.f54257g, this);
                } catch (IllegalArgumentException unused) {
                }
            }
        } finally {
            StrictMode.setVmPolicy(vmPolicy);
        }
    }

    public final void f(ServiceConnection serviceConnection, String str) {
        this.f54245a.remove(serviceConnection);
    }

    public final void g(String str) {
        this.f54251g.f54258h.removeMessages(1, this.f54249e);
        z0 z0Var = this.f54251g;
        z0Var.f54260j.c(z0Var.f54257g, this);
        this.f54247c = false;
        this.f54246b = 2;
    }

    public final boolean h(ServiceConnection serviceConnection) {
        return this.f54245a.containsKey(serviceConnection);
    }

    public final boolean i() {
        return this.f54245a.isEmpty();
    }

    public final boolean j() {
        return this.f54247c;
    }

    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f54251g.f54256f) {
            try {
                this.f54251g.f54258h.removeMessages(1, this.f54249e);
                this.f54248d = iBinder;
                this.f54250f = componentName;
                for (ServiceConnection onServiceConnected : this.f54245a.values()) {
                    onServiceConnected.onServiceConnected(componentName, iBinder);
                }
                this.f54246b = 1;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f54251g.f54256f) {
            try {
                this.f54251g.f54258h.removeMessages(1, this.f54249e);
                this.f54248d = null;
                this.f54250f = componentName;
                for (ServiceConnection onServiceDisconnected : this.f54245a.values()) {
                    onServiceDisconnected.onServiceDisconnected(componentName);
                }
                this.f54246b = 2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
