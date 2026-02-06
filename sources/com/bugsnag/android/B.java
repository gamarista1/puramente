package com.bugsnag.android;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import yf.p;

public final class B implements ComponentCallbacks2 {

    /* renamed from: a  reason: collision with root package name */
    private final C3223b0 f38405a;

    /* renamed from: b  reason: collision with root package name */
    private final p f38406b;

    /* renamed from: c  reason: collision with root package name */
    private final p f38407c;

    public B(C3223b0 b0Var, p pVar, p pVar2) {
        this.f38405a = b0Var;
        this.f38406b = pVar;
        this.f38407c = pVar2;
    }

    public void onConfigurationChanged(Configuration configuration) {
        String o10 = this.f38405a.o();
        if (this.f38405a.x(configuration.orientation)) {
            this.f38406b.invoke(o10, this.f38405a.o());
        }
    }

    public void onLowMemory() {
        this.f38407c.invoke(Boolean.TRUE, (Object) null);
    }

    public void onTrimMemory(int i10) {
        boolean z10;
        p pVar = this.f38407c;
        if (i10 >= 80) {
            z10 = true;
        } else {
            z10 = false;
        }
        pVar.invoke(Boolean.valueOf(z10), Integer.valueOf(i10));
    }
}
