package com.google.android.gms.common.internal;

import android.util.Log;

public abstract class l0 {

    /* renamed from: a  reason: collision with root package name */
    private Object f54198a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f54199b = false;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ C4518c f54200c;

    public l0(C4518c cVar, Object obj) {
        this.f54200c = cVar;
        this.f54198a = obj;
    }

    /* access modifiers changed from: protected */
    public abstract void a(Object obj);

    /* access modifiers changed from: protected */
    public abstract void b();

    public final void c() {
        Object obj;
        synchronized (this) {
            try {
                obj = this.f54198a;
                if (this.f54199b) {
                    String obj2 = toString();
                    Log.w("GmsClient", "Callback proxy " + obj2 + " being reused. This is not safe.");
                }
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        if (obj != null) {
            a(obj);
        }
        synchronized (this) {
            this.f54199b = true;
        }
        e();
    }

    public final void d() {
        synchronized (this) {
            this.f54198a = null;
        }
    }

    public final void e() {
        d();
        synchronized (this.f54200c.zzt) {
            this.f54200c.zzt.remove(this);
        }
    }
}
