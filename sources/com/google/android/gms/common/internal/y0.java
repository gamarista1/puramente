package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

final class y0 implements Handler.Callback {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ z0 f54252a;

    /* synthetic */ y0(z0 z0Var, x0 x0Var) {
        this.f54252a = z0Var;
    }

    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        if (i10 == 0) {
            synchronized (this.f54252a.f54256f) {
                try {
                    u0 u0Var = (u0) message.obj;
                    w0 w0Var = (w0) this.f54252a.f54256f.get(u0Var);
                    if (w0Var != null && w0Var.i()) {
                        if (w0Var.j()) {
                            w0Var.g("GmsClientSupervisor");
                        }
                        this.f54252a.f54256f.remove(u0Var);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return true;
        } else if (i10 != 1) {
            return false;
        } else {
            synchronized (this.f54252a.f54256f) {
                try {
                    u0 u0Var2 = (u0) message.obj;
                    w0 w0Var2 = (w0) this.f54252a.f54256f.get(u0Var2);
                    if (w0Var2 != null && w0Var2.a() == 3) {
                        String valueOf = String.valueOf(u0Var2);
                        Log.e("GmsClientSupervisor", "Timeout waiting for ServiceConnection callback " + valueOf, new Exception());
                        ComponentName b10 = w0Var2.b();
                        if (b10 == null) {
                            b10 = u0Var2.a();
                        }
                        if (b10 == null) {
                            String c10 = u0Var2.c();
                            C4536s.l(c10);
                            b10 = new ComponentName(c10, "unknown");
                        }
                        w0Var2.onServiceDisconnected(b10);
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            return true;
        }
    }
}
