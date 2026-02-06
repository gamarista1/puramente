package com.google.android.gms.common.api.internal;

import android.os.Bundle;

final class y0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ LifecycleCallback f54089a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f54090b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ z0 f54091c;

    y0(z0 z0Var, LifecycleCallback lifecycleCallback, String str) {
        this.f54091c = z0Var;
        this.f54089a = lifecycleCallback;
        this.f54090b = str;
    }

    public final void run() {
        Bundle bundle;
        z0 z0Var = this.f54091c;
        if (z0Var.f54096b > 0) {
            LifecycleCallback lifecycleCallback = this.f54089a;
            if (z0Var.f54097c != null) {
                bundle = z0Var.f54097c.getBundle(this.f54090b);
            } else {
                bundle = null;
            }
            lifecycleCallback.onCreate(bundle);
        }
        if (this.f54091c.f54096b >= 2) {
            this.f54089a.onStart();
        }
        if (this.f54091c.f54096b >= 3) {
            this.f54089a.onResume();
        }
        if (this.f54091c.f54096b >= 4) {
            this.f54089a.onStop();
        }
        if (this.f54091c.f54096b >= 5) {
            this.f54089a.onDestroy();
        }
    }
}
