package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.common.internal.i  reason: case insensitive filesystem */
public abstract class C4527i {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f54190a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private static z0 f54191b = null;

    /* renamed from: c  reason: collision with root package name */
    static HandlerThread f54192c = null;

    /* renamed from: d  reason: collision with root package name */
    private static Executor f54193d = null;

    /* renamed from: e  reason: collision with root package name */
    private static boolean f54194e = false;

    public static C4527i b(Context context) {
        Looper looper;
        synchronized (f54190a) {
            try {
                if (f54191b == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (f54194e) {
                        looper = c().getLooper();
                    } else {
                        looper = context.getMainLooper();
                    }
                    f54191b = new z0(applicationContext, looper, f54193d);
                }
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        return f54191b;
    }

    public static HandlerThread c() {
        synchronized (f54190a) {
            try {
                HandlerThread handlerThread = f54192c;
                if (handlerThread != null) {
                    return handlerThread;
                }
                HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                f54192c = handlerThread2;
                handlerThread2.start();
                HandlerThread handlerThread3 = f54192c;
                return handlerThread3;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean a(ComponentName componentName, ServiceConnection serviceConnection, String str, Executor executor) {
        return g(new u0(componentName, 4225), serviceConnection, str, executor);
    }

    public void d(ComponentName componentName, ServiceConnection serviceConnection, String str) {
        e(new u0(componentName, 4225), serviceConnection, str);
    }

    /* access modifiers changed from: protected */
    public abstract void e(u0 u0Var, ServiceConnection serviceConnection, String str);

    public final void f(String str, String str2, int i10, ServiceConnection serviceConnection, String str3, boolean z10) {
        e(new u0(str, str2, 4225, z10), serviceConnection, str3);
    }

    /* access modifiers changed from: protected */
    public abstract boolean g(u0 u0Var, ServiceConnection serviceConnection, String str, Executor executor);
}
