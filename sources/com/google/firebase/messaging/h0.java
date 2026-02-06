package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import com.amazon.a.a.o.b.f;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

final class h0 {

    /* renamed from: d  reason: collision with root package name */
    private static WeakReference f57538d;

    /* renamed from: a  reason: collision with root package name */
    private final SharedPreferences f57539a;

    /* renamed from: b  reason: collision with root package name */
    private d0 f57540b;

    /* renamed from: c  reason: collision with root package name */
    private final Executor f57541c;

    private h0(SharedPreferences sharedPreferences, Executor executor) {
        this.f57541c = executor;
        this.f57539a = sharedPreferences;
    }

    public static synchronized h0 b(Context context, Executor executor) {
        h0 h0Var;
        synchronized (h0.class) {
            try {
                WeakReference weakReference = f57538d;
                if (weakReference != null) {
                    h0Var = (h0) weakReference.get();
                } else {
                    h0Var = null;
                }
                if (h0Var == null) {
                    h0Var = new h0(context.getSharedPreferences("com.google.android.gms.appid", 0), executor);
                    h0Var.d();
                    f57538d = new WeakReference(h0Var);
                }
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        return h0Var;
    }

    private synchronized void d() {
        this.f57540b = d0.d(this.f57539a, "topic_operation_queue", f.f37529a, this.f57541c);
    }

    /* access modifiers changed from: package-private */
    public synchronized boolean a(g0 g0Var) {
        return this.f57540b.b(g0Var.e());
    }

    /* access modifiers changed from: package-private */
    public synchronized g0 c() {
        return g0.a(this.f57540b.f());
    }

    /* access modifiers changed from: package-private */
    public synchronized boolean e(g0 g0Var) {
        return this.f57540b.g(g0Var.e());
    }
}
