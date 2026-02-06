package com.bugsnag.android;

import K4.t;
import java.util.concurrent.atomic.AtomicBoolean;

class R0 {

    /* renamed from: a  reason: collision with root package name */
    private final AtomicBoolean f38577a = new AtomicBoolean();

    /* renamed from: b  reason: collision with root package name */
    private boolean f38578b = false;

    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f38579a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ A f38580b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C3242h1 f38581c;

        a(String str, A a10, C3242h1 h1Var) {
            this.f38579a = str;
            this.f38580b = a10;
            this.f38581c = h1Var;
        }

        public void run() {
            R0.this.b(this.f38579a, this.f38580b, this.f38581c);
        }
    }

    R0() {
    }

    /* access modifiers changed from: package-private */
    public boolean a() {
        return this.f38578b;
    }

    /* access modifiers changed from: package-private */
    public void b(String str, A a10, C3242h1 h1Var) {
        if (!this.f38577a.getAndSet(true)) {
            try {
                System.loadLibrary(str);
                this.f38578b = true;
            } catch (UnsatisfiedLinkError e10) {
                a10.F(e10, h1Var);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean c(String str, A a10, C3242h1 h1Var) {
        try {
            a10.f38390z.d(t.IO, new a(str, a10, h1Var)).get();
            return this.f38578b;
        } catch (Throwable unused) {
            return false;
        }
    }
}
