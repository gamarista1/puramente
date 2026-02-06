package com.bugsnag.android;

import K4.r;
import com.bugsnag.android.v1;

public final class N1 extends C3261o {

    /* renamed from: a  reason: collision with root package name */
    private L1 f38556a;

    public N1(L1 l12) {
        this.f38556a = l12;
    }

    public final void b() {
        if (!getObservers$bugsnag_android_core_release().isEmpty()) {
            v1.s sVar = new v1.s(c());
            for (r onStateChange : getObservers$bugsnag_android_core_release()) {
                onStateChange.onStateChange(sVar);
            }
        }
    }

    public final L1 c() {
        return this.f38556a;
    }

    public final void d(L1 l12) {
        this.f38556a = l12;
        b();
    }
}
