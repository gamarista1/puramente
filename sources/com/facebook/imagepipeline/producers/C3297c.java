package com.facebook.imagepipeline.producers;

import U5.a;

/* renamed from: com.facebook.imagepipeline.producers.c  reason: case insensitive filesystem */
public abstract class C3297c implements C3308n {

    /* renamed from: a  reason: collision with root package name */
    private boolean f39942a = false;

    public static boolean e(int i10) {
        return (i10 & 1) == 1;
    }

    public static boolean f(int i10) {
        return !e(i10);
    }

    public static int l(boolean z10) {
        return z10 ? 1 : 0;
    }

    public static boolean m(int i10, int i11) {
        return (i10 & i11) != 0;
    }

    public static boolean n(int i10, int i11) {
        return (i10 & i11) == i11;
    }

    public static int o(int i10, int i11) {
        return i10 & (~i11);
    }

    public synchronized void a(Throwable th2) {
        if (!this.f39942a) {
            this.f39942a = true;
            try {
                h(th2);
            } catch (Exception e10) {
                k(e10);
            }
        }
    }

    public synchronized void b() {
        if (!this.f39942a) {
            this.f39942a = true;
            try {
                g();
            } catch (Exception e10) {
                k(e10);
            }
        }
    }

    public synchronized void c(Object obj, int i10) {
        if (!this.f39942a) {
            this.f39942a = e(i10);
            try {
                i(obj, i10);
            } catch (Exception e10) {
                k(e10);
            }
        }
    }

    public synchronized void d(float f10) {
        if (!this.f39942a) {
            try {
                j(f10);
            } catch (Exception e10) {
                k(e10);
            }
        }
    }

    /* access modifiers changed from: protected */
    public abstract void g();

    /* access modifiers changed from: protected */
    public abstract void h(Throwable th2);

    /* access modifiers changed from: protected */
    public abstract void i(Object obj, int i10);

    /* access modifiers changed from: protected */
    public abstract void j(float f10);

    /* access modifiers changed from: protected */
    public void k(Exception exc) {
        a.M(getClass(), "unhandled exception", exc);
    }
}
