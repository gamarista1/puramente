package com.google.android.gms.common.api.internal;

import android.os.Bundle;

final class w0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ LifecycleCallback f54082a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f54083b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ x0 f54084c;

    w0(x0 x0Var, LifecycleCallback lifecycleCallback, String str) {
        this.f54084c = x0Var;
        this.f54082a = lifecycleCallback;
        this.f54083b = str;
    }

    public final void run() {
        Bundle bundle;
        x0 x0Var = this.f54084c;
        if (x0Var.f54087b > 0) {
            LifecycleCallback lifecycleCallback = this.f54082a;
            if (x0Var.f54088c != null) {
                bundle = x0Var.f54088c.getBundle(this.f54083b);
            } else {
                bundle = null;
            }
            lifecycleCallback.onCreate(bundle);
        }
        if (this.f54084c.f54087b >= 2) {
            this.f54082a.onStart();
        }
        if (this.f54084c.f54087b >= 3) {
            this.f54082a.onResume();
        }
        if (this.f54084c.f54087b >= 4) {
            this.f54082a.onStop();
        }
        if (this.f54084c.f54087b >= 5) {
            this.f54082a.onDestroy();
        }
    }
}
