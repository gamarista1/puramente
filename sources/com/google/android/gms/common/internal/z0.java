package com.google.android.gms.common.internal;

import Da.C4250b;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.common.zzi;
import java.util.HashMap;
import java.util.concurrent.Executor;

final class z0 extends C4527i {
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final HashMap f54256f = new HashMap();
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final Context f54257g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public volatile Handler f54258h;

    /* renamed from: i  reason: collision with root package name */
    private final y0 f54259i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public final C4250b f54260j;

    /* renamed from: k  reason: collision with root package name */
    private final long f54261k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public final long f54262l;

    /* renamed from: m  reason: collision with root package name */
    private volatile Executor f54263m;

    z0(Context context, Looper looper, Executor executor) {
        y0 y0Var = new y0(this, (x0) null);
        this.f54259i = y0Var;
        this.f54257g = context.getApplicationContext();
        this.f54258h = new zzi(looper, y0Var);
        this.f54260j = C4250b.b();
        this.f54261k = 5000;
        this.f54262l = 300000;
        this.f54263m = executor;
    }

    /* access modifiers changed from: protected */
    public final void e(u0 u0Var, ServiceConnection serviceConnection, String str) {
        C4536s.m(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f54256f) {
            try {
                w0 w0Var = (w0) this.f54256f.get(u0Var);
                if (w0Var == null) {
                    String obj = u0Var.toString();
                    throw new IllegalStateException("Nonexistent connection status for service config: " + obj);
                } else if (w0Var.h(serviceConnection)) {
                    w0Var.f(serviceConnection, str);
                    if (w0Var.i()) {
                        this.f54258h.sendMessageDelayed(this.f54258h.obtainMessage(0, u0Var), this.f54261k);
                    }
                } else {
                    String obj2 = u0Var.toString();
                    throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=" + obj2);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* access modifiers changed from: protected */
    public final boolean g(u0 u0Var, ServiceConnection serviceConnection, String str, Executor executor) {
        boolean j10;
        C4536s.m(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f54256f) {
            try {
                w0 w0Var = (w0) this.f54256f.get(u0Var);
                if (executor == null) {
                    executor = this.f54263m;
                }
                if (w0Var == null) {
                    w0Var = new w0(this, u0Var);
                    w0Var.d(serviceConnection, serviceConnection, str);
                    w0Var.e(str, executor);
                    this.f54256f.put(u0Var, w0Var);
                } else {
                    this.f54258h.removeMessages(0, u0Var);
                    if (!w0Var.h(serviceConnection)) {
                        w0Var.d(serviceConnection, serviceConnection, str);
                        int a10 = w0Var.a();
                        if (a10 == 1) {
                            serviceConnection.onServiceConnected(w0Var.b(), w0Var.c());
                        } else if (a10 == 2) {
                            w0Var.e(str, executor);
                        }
                    } else {
                        String obj = u0Var.toString();
                        throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=" + obj);
                    }
                }
                j10 = w0Var.j();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return j10;
    }
}
